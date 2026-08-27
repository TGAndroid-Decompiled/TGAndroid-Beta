package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.SavedMessagesController;

public final class qt0 extends yk0 {

    public final Context f31973c;
    public final SavedMessagesController d;
    public boolean h;

    public ys0 f31978s;

    public final hu0 f31980x;

    public final ArrayList f31974e = new ArrayList();

    public final ArrayList f31975f = new ArrayList();

    public final up0 f31976n = new up0(this, 5);

    public final f2.d1 f31977r = new f2.d1();
    public final f2.f0 v = new f2.f0(new ot0(this));

    public final HashSet f31979w = new HashSet();

    public qt0(hu0 hu0Var, Context context) {
        this.f31980x = hu0Var;
        this.f31973c = context;
        SavedMessagesController savedMessagesController = hu0Var.f29145r1.getMessagesController().getSavedMessagesController();
        this.d = savedMessagesController;
        if (hu0Var.l0()) {
            savedMessagesController.loadDialogs(false);
        }
        C(true);
        F(false);
    }

    @Override
    public final boolean D(f2.o1 o1Var) {
        return true;
    }

    public final void E(View view) {
        ArrayList arrayList;
        SavedMessagesController.SavedDialog savedDialog;
        if (view instanceof org.telegram.ui.Cells.p2) {
            org.telegram.ui.Cells.p2 p2Var = (org.telegram.ui.Cells.p2) view;
            long dialogId = p2Var.getDialogId();
            int i10 = 0;
            while (true) {
                arrayList = this.f31975f;
                if (i10 >= arrayList.size()) {
                    savedDialog = null;
                    break;
                } else {
                    if (((SavedMessagesController.SavedDialog) arrayList.get(i10)).dialogId == dialogId) {
                        savedDialog = (SavedMessagesController.SavedDialog) arrayList.get(i10);
                        break;
                    }
                    i10++;
                }
            }
            if (savedDialog == null) {
                return;
            }
            Long lValueOf = Long.valueOf(savedDialog.dialogId);
            HashSet hashSet = this.f31979w;
            boolean zContains = hashSet.contains(lValueOf);
            hu0 hu0Var = this.f31980x;
            if (zContains) {
                hashSet.remove(Long.valueOf(savedDialog.dialogId));
                if (hashSet.size() <= 0 && hu0Var.f29163y1) {
                    hu0Var.b1(false);
                }
            } else {
                hashSet.add(Long.valueOf(savedDialog.dialogId));
                if (hashSet.size() > 0 && !hu0Var.f29163y1) {
                    hu0Var.b1(true);
                    org.telegram.ui.ActionBar.v0 v0Var = hu0Var.f29141q0;
                    if (v0Var != null) {
                        v0Var.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.v0 v0Var2 = hu0Var.f29139p0;
                    if (v0Var2 != null) {
                        v0Var2.setVisibility(8);
                    }
                }
            }
            hu0Var.f29156w0.a(hashSet.size(), true);
            boolean z10 = hashSet.size() > 0;
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                long jLongValue = ((Long) it.next()).longValue();
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    SavedMessagesController.SavedDialog savedDialog2 = (SavedMessagesController.SavedDialog) arrayList.get(i11);
                    if (savedDialog2.dialogId == jLongValue) {
                        if (!savedDialog2.pinned) {
                            z10 = false;
                            break;
                        }
                        break;
                    }
                }
                if (!z10) {
                    break;
                }
            }
            org.telegram.ui.ActionBar.v0 v0Var3 = hu0Var.f29144r0;
            if (v0Var3 != null) {
                v0Var3.setVisibility(z10 ? 8 : 0);
            }
            org.telegram.ui.ActionBar.v0 v0Var4 = hu0Var.f29147s0;
            if (v0Var4 != null) {
                v0Var4.setVisibility(z10 ? 0 : 8);
            }
            p2Var.V(hashSet.contains(Long.valueOf(savedDialog.dialogId)), true);
        }
    }

    public final void F(boolean z10) {
        ArrayList arrayList = this.f31974e;
        arrayList.clear();
        ArrayList arrayList2 = this.f31975f;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        arrayList2.addAll(this.d.allDialogs);
        if (z10) {
            l();
        }
    }

    @Override
    public final int h() {
        return this.f31975f.size();
    }

    @Override
    public final long i(int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.f31975f;
            if (i10 < arrayList.size()) {
                return ((SavedMessagesController.SavedDialog) arrayList.get(i10)).dialogId;
            }
        }
        return i10;
    }

    @Override
    public final int j(int i10) {
        return 13;
    }

    @Override
    public final void v(f2.o1 o1Var, int i10) {
        View view = o1Var.f5789a;
        if (view instanceof org.telegram.ui.Cells.p2) {
            org.telegram.ui.Cells.p2 p2Var = (org.telegram.ui.Cells.p2) view;
            ArrayList arrayList = this.f31975f;
            SavedMessagesController.SavedDialog savedDialog = (SavedMessagesController.SavedDialog) arrayList.get(i10);
            p2Var.W(savedDialog.dialogId, savedDialog.message, savedDialog.getDate(), false, false);
            p2Var.f24905o0 = true;
            p2Var.V(this.f31979w.contains(Long.valueOf(savedDialog.dialogId)), false);
            p2Var.f24907o2 = i10 + 1 < arrayList.size();
        }
    }

    @Override
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        pt0 pt0Var = new pt0(this, this.f31973c);
        hu0 hu0Var = this.f31980x;
        pt0Var.setDialogCellDelegate(hu0Var);
        pt0Var.f24900n0 = true;
        pt0Var.setBackgroundColor(hu0Var.h0(org.telegram.ui.ActionBar.g6.f23053d6));
        return new lk0(pt0Var);
    }
}
