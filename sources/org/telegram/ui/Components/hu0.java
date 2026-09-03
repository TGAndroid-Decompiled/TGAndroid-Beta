package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.SavedMessagesController;
public final class hu0 extends rl0 {
    public final Context f27629c;
    public final SavedMessagesController d;
    public boolean h;
    public pt0 f27634s;
    public final yu0 f27636x;
    public final ArrayList f27630e = new ArrayList();
    public final ArrayList f27631f = new ArrayList();
    public final nq0 f27632n = new nq0(this, 5);
    public final f2.c1 f27633r = new f2.c1();
    public final f2.f0 v = new f2.f0(new fu0(this));
    public final HashSet f27635w = new HashSet();

    public hu0(yu0 yu0Var, Context context) {
        this.f27636x = yu0Var;
        this.f27629c = context;
        SavedMessagesController savedMessagesController = yu0Var.f33649s1.getMessagesController().getSavedMessagesController();
        this.d = savedMessagesController;
        if (yu0Var.l0()) {
            savedMessagesController.loadDialogs(false);
        }
        C(true);
        F(false);
    }

    @Override
    public final boolean D(f2.m1 m1Var) {
        return true;
    }

    public final void E(View view) {
        ArrayList arrayList;
        SavedMessagesController.SavedDialog savedDialog;
        boolean z4;
        int i10;
        if (view instanceof org.telegram.ui.Cells.r2) {
            org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) view;
            long dialogId = r2Var.getDialogId();
            int i11 = 0;
            int i12 = 0;
            while (true) {
                arrayList = this.f27631f;
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
            HashSet hashSet = this.f27635w;
            boolean contains = hashSet.contains(valueOf);
            yu0 yu0Var = this.f27636x;
            if (contains) {
                hashSet.remove(Long.valueOf(savedDialog.dialogId));
                if (hashSet.size() <= 0 && yu0Var.f33666z1) {
                    yu0Var.b1(false);
                }
            } else {
                hashSet.add(Long.valueOf(savedDialog.dialogId));
                if (hashSet.size() > 0 && !yu0Var.f33666z1) {
                    yu0Var.b1(true);
                    org.telegram.ui.ActionBar.w0 w0Var = yu0Var.f33645r0;
                    if (w0Var != null) {
                        w0Var.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.w0 w0Var2 = yu0Var.f33642q0;
                    if (w0Var2 != null) {
                        w0Var2.setVisibility(8);
                    }
                }
            }
            yu0Var.f33660x0.a(hashSet.size(), true);
            if (hashSet.size() > 0) {
                z4 = true;
            } else {
                z4 = false;
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
                            z4 = false;
                        }
                    } else {
                        i13++;
                    }
                }
                if (!z4) {
                    break;
                }
            }
            org.telegram.ui.ActionBar.w0 w0Var3 = yu0Var.f33648s0;
            if (w0Var3 != null) {
                if (z4) {
                    i10 = 8;
                } else {
                    i10 = 0;
                }
                w0Var3.setVisibility(i10);
            }
            org.telegram.ui.ActionBar.w0 w0Var4 = yu0Var.f33650t0;
            if (w0Var4 != null) {
                if (!z4) {
                    i11 = 8;
                }
                w0Var4.setVisibility(i11);
            }
            r2Var.V(hashSet.contains(Long.valueOf(savedDialog.dialogId)), true);
        }
    }

    public final void F(boolean z4) {
        ArrayList arrayList = this.f27630e;
        arrayList.clear();
        ArrayList arrayList2 = this.f27631f;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        arrayList2.addAll(this.d.allDialogs);
        if (z4) {
            l();
        }
    }

    @Override
    public final int h() {
        return this.f27631f.size();
    }

    @Override
    public final long i(int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.f27631f;
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
    public final void v(f2.m1 m1Var, int i10) {
        View view = m1Var.f5875a;
        if (!(view instanceof org.telegram.ui.Cells.r2)) {
            return;
        }
        org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) view;
        ArrayList arrayList = this.f27631f;
        SavedMessagesController.SavedDialog savedDialog = (SavedMessagesController.SavedDialog) arrayList.get(i10);
        r2Var.W(savedDialog.dialogId, savedDialog.message, savedDialog.getDate(), false, false);
        boolean z4 = true;
        r2Var.f23486p0 = true;
        r2Var.V(this.f27635w.contains(Long.valueOf(savedDialog.dialogId)), false);
        if (i10 + 1 >= arrayList.size()) {
            z4 = false;
        }
        r2Var.f23488p2 = z4;
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        gu0 gu0Var = new gu0(this, this.f27629c);
        yu0 yu0Var = this.f27636x;
        gu0Var.setDialogCellDelegate(yu0Var);
        gu0Var.f23481o0 = true;
        gu0Var.setBackgroundColor(yu0Var.h0(org.telegram.ui.ActionBar.k6.f21661d6));
        return new f2.m1(gu0Var);
    }
}
