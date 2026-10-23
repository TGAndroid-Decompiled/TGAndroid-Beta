package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.SavedMessagesController;
public final class hv0 extends lm0 {
    public final Context f27057c;
    public final SavedMessagesController d;
    public boolean h;
    public pu0 f27061s;
    public final xv0 f27063x;
    public final ArrayList e = new ArrayList();
    public final ArrayList f27058f = new ArrayList();
    public final kr0 f27059n = new kr0(this, 6);
    public final s4.t0 f27060r = new s4.t0();
    public final s4.y v = new s4.y(new fv0(this));
    public final HashSet f27062w = new HashSet();

    public hv0(xv0 xv0Var, Context context) {
        this.f27063x = xv0Var;
        this.f27057c = context;
        SavedMessagesController savedMessagesController = xv0Var.f32711v1.getMessagesController().getSavedMessagesController();
        this.d = savedMessagesController;
        if (xv0Var.n0()) {
            savedMessagesController.loadDialogs(false);
        }
        C(true);
        F(false);
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        return true;
    }

    public final void E(View view) {
        ArrayList arrayList;
        SavedMessagesController.SavedDialog savedDialog;
        boolean z10;
        int i10;
        if (view instanceof org.telegram.ui.Cells.q2) {
            org.telegram.ui.Cells.q2 q2Var = (org.telegram.ui.Cells.q2) view;
            long dialogId = q2Var.getDialogId();
            int i11 = 0;
            int i12 = 0;
            while (true) {
                arrayList = this.f27058f;
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
            HashSet hashSet = this.f27062w;
            boolean contains = hashSet.contains(valueOf);
            xv0 xv0Var = this.f27063x;
            if (contains) {
                hashSet.remove(Long.valueOf(savedDialog.dialogId));
                if (hashSet.size() <= 0 && xv0Var.C1) {
                    xv0Var.e1(false);
                }
            } else {
                hashSet.add(Long.valueOf(savedDialog.dialogId));
                if (hashSet.size() > 0 && !xv0Var.C1) {
                    xv0Var.e1(true);
                    org.telegram.ui.ActionBar.u0 u0Var = xv0Var.f32708u0;
                    if (u0Var != null) {
                        u0Var.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.u0 u0Var2 = xv0Var.f32706t0;
                    if (u0Var2 != null) {
                        u0Var2.setVisibility(8);
                    }
                }
            }
            xv0Var.A0.a(hashSet.size(), true);
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
            org.telegram.ui.ActionBar.u0 u0Var3 = xv0Var.f32710v0;
            if (u0Var3 != null) {
                if (z10) {
                    i10 = 8;
                } else {
                    i10 = 0;
                }
                u0Var3.setVisibility(i10);
            }
            org.telegram.ui.ActionBar.u0 u0Var4 = xv0Var.f32713w0;
            if (u0Var4 != null) {
                if (!z10) {
                    i11 = 8;
                }
                u0Var4.setVisibility(i11);
            }
            q2Var.U(hashSet.contains(Long.valueOf(savedDialog.dialogId)), true);
        }
    }

    public final void F(boolean z10) {
        ArrayList arrayList = this.e;
        arrayList.clear();
        ArrayList arrayList2 = this.f27058f;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        arrayList2.addAll(this.d.allDialogs);
        if (z10) {
            l();
        }
    }

    @Override
    public final int h() {
        return this.f27058f.size();
    }

    @Override
    public final long i(int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.f27058f;
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
    public final void v(s4.b1 b1Var, int i10) {
        View view = b1Var.f46343a;
        if (!(view instanceof org.telegram.ui.Cells.q2)) {
            return;
        }
        org.telegram.ui.Cells.q2 q2Var = (org.telegram.ui.Cells.q2) view;
        ArrayList arrayList = this.f27058f;
        SavedMessagesController.SavedDialog savedDialog = (SavedMessagesController.SavedDialog) arrayList.get(i10);
        q2Var.V(savedDialog.dialogId, savedDialog.message, savedDialog.getDate(), false, false);
        boolean z10 = true;
        q2Var.f23008s0 = true;
        q2Var.U(this.f27062w.contains(Long.valueOf(savedDialog.dialogId)), false);
        if (i10 + 1 >= arrayList.size()) {
            z10 = false;
        }
        q2Var.f23010s2 = z10;
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        gv0 gv0Var = new gv0(this, this.f27057c);
        xv0 xv0Var = this.f27063x;
        gv0Var.setDialogCellDelegate(xv0Var);
        gv0Var.f23002r0 = true;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21183d6, gv0Var, xv0Var.F1);
        return new s4.b1(gv0Var);
    }
}
