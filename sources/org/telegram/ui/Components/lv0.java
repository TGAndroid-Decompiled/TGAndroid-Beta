package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.SavedMessagesController;
public final class lv0 extends lm0 {
    public final Context f30291c;
    public final SavedMessagesController d;
    public boolean h;
    public su0 f30295s;
    public final aw0 f30297x;
    public final ArrayList e = new ArrayList();
    public final ArrayList f30292f = new ArrayList();
    public final mp0 f30293n = new mp0(this, 9);
    public final s4.w0 f30294r = new s4.w0();
    public final s4.z v = new s4.z(new jv0(this));
    public final HashSet f30296w = new HashSet();

    public lv0(aw0 aw0Var, Context context) {
        this.f30297x = aw0Var;
        this.f30291c = context;
        SavedMessagesController savedMessagesController = aw0Var.f26702x1.getMessagesController().getSavedMessagesController();
        this.d = savedMessagesController;
        if (aw0Var.u0()) {
            savedMessagesController.loadDialogs(false);
        }
        C(true);
        F(false);
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        return true;
    }

    public final void E(View view) {
        ArrayList arrayList;
        SavedMessagesController.SavedDialog savedDialog;
        boolean z10;
        int i10;
        if (view instanceof org.telegram.ui.Cells.p2) {
            org.telegram.ui.Cells.p2 p2Var = (org.telegram.ui.Cells.p2) view;
            long dialogId = p2Var.getDialogId();
            int i11 = 0;
            int i12 = 0;
            while (true) {
                arrayList = this.f30292f;
                if (i12 < arrayList.size()) {
                    if (((SavedMessagesController.SavedDialog) arrayList.get(i12)).dialogId == dialogId) {
                        savedDialog = (SavedMessagesController.SavedDialog) arrayList.get(i12);
                        break;
                    }
                    i12++;
                } else {
                    savedDialog = null;
                    break;
                }
            }
            if (savedDialog == null) {
                return;
            }
            Long valueOf = Long.valueOf(savedDialog.dialogId);
            HashSet hashSet = this.f30296w;
            boolean contains = hashSet.contains(valueOf);
            aw0 aw0Var = this.f30297x;
            if (contains) {
                hashSet.remove(Long.valueOf(savedDialog.dialogId));
                if (hashSet.size() <= 0 && aw0Var.E1) {
                    aw0Var.k1(false);
                }
            } else {
                hashSet.add(Long.valueOf(savedDialog.dialogId));
                if (hashSet.size() > 0 && !aw0Var.E1) {
                    aw0Var.k1(true);
                    org.telegram.ui.ActionBar.w0 w0Var = aw0Var.f26698w0;
                    if (w0Var != null) {
                        w0Var.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.w0 w0Var2 = aw0Var.f26695v0;
                    if (w0Var2 != null) {
                        w0Var2.setVisibility(8);
                    }
                }
            }
            aw0Var.i1(hashSet.size(), true);
            if (hashSet.size() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                long longValue = ((Long) it.next()).longValue();
                int i13 = 0;
                while (true) {
                    if (i13 >= arrayList.size()) {
                        break;
                    }
                    SavedMessagesController.SavedDialog savedDialog2 = (SavedMessagesController.SavedDialog) arrayList.get(i13);
                    if (savedDialog2.dialogId == longValue) {
                        if (!savedDialog2.pinned) {
                            z10 = false;
                        }
                    } else {
                        i13++;
                    }
                }
                if (!z10) {
                    break;
                }
            }
            org.telegram.ui.ActionBar.w0 w0Var3 = aw0Var.f26701x0;
            if (w0Var3 != null) {
                if (z10) {
                    i10 = 8;
                } else {
                    i10 = 0;
                }
                w0Var3.setVisibility(i10);
            }
            org.telegram.ui.ActionBar.w0 w0Var4 = aw0Var.f26704y0;
            if (w0Var4 != null) {
                if (!z10) {
                    i11 = 8;
                }
                w0Var4.setVisibility(i11);
            }
            p2Var.U(hashSet.contains(Long.valueOf(savedDialog.dialogId)), true);
        }
    }

    public final void F(boolean z10) {
        ArrayList arrayList = this.e;
        arrayList.clear();
        ArrayList arrayList2 = this.f30292f;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        arrayList2.addAll(this.d.allDialogs);
        if (z10) {
            l();
        }
    }

    @Override
    public final int h() {
        return this.f30292f.size();
    }

    @Override
    public final long i(int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.f30292f;
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
    public final void v(s4.e1 e1Var, int i10) {
        View view = e1Var.f47735a;
        if (!(view instanceof org.telegram.ui.Cells.p2)) {
            return;
        }
        org.telegram.ui.Cells.p2 p2Var = (org.telegram.ui.Cells.p2) view;
        ArrayList arrayList = this.f30292f;
        SavedMessagesController.SavedDialog savedDialog = (SavedMessagesController.SavedDialog) arrayList.get(i10);
        p2Var.V(savedDialog.dialogId, savedDialog.message, savedDialog.getDate(), false, false);
        boolean z10 = true;
        p2Var.f24717s0 = true;
        p2Var.U(this.f30296w.contains(Long.valueOf(savedDialog.dialogId)), false);
        if (i10 + 1 >= arrayList.size()) {
            z10 = false;
        }
        p2Var.f24719s2 = z10;
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        kv0 kv0Var = new kv0(this, this.f30291c);
        aw0 aw0Var = this.f30297x;
        kv0Var.setDialogCellDelegate(aw0Var);
        kv0Var.f24711r0 = true;
        org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23354d6, kv0Var, aw0Var.H1);
        return new s4.e1(kv0Var);
    }
}
