package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.SavedMessagesController;
public final class rv0 extends vm0 {
    public final Context f30247c;
    public final SavedMessagesController d;
    public boolean h;
    public zu0 f30252s;
    public final hw0 f30254x;
    public final ArrayList f30248e = new ArrayList();
    public final ArrayList f30249f = new ArrayList();
    public final ur0 f30250n = new ur0(this, 6);
    public final s4.v0 f30251r = new s4.v0();
    public final s4.z v = new s4.z(new pv0(this));
    public final HashSet f30253w = new HashSet();

    public rv0(hw0 hw0Var, Context context) {
        this.f30254x = hw0Var;
        this.f30247c = context;
        SavedMessagesController savedMessagesController = hw0Var.f26957v1.getMessagesController().getSavedMessagesController();
        this.d = savedMessagesController;
        if (hw0Var.l0()) {
            savedMessagesController.loadDialogs(false);
        }
        C(true);
        F(false);
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        return true;
    }

    public final void E(View view) {
        ArrayList arrayList;
        SavedMessagesController.SavedDialog savedDialog;
        boolean z10;
        int i10;
        if (view instanceof org.telegram.ui.Cells.s2) {
            org.telegram.ui.Cells.s2 s2Var = (org.telegram.ui.Cells.s2) view;
            long dialogId = s2Var.getDialogId();
            int i11 = 0;
            int i12 = 0;
            while (true) {
                arrayList = this.f30249f;
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
            HashSet hashSet = this.f30253w;
            boolean contains = hashSet.contains(valueOf);
            hw0 hw0Var = this.f30254x;
            if (contains) {
                hashSet.remove(Long.valueOf(savedDialog.dialogId));
                if (hashSet.size() <= 0 && hw0Var.C1) {
                    hw0Var.b1(false);
                }
            } else {
                hashSet.add(Long.valueOf(savedDialog.dialogId));
                if (hashSet.size() > 0 && !hw0Var.C1) {
                    hw0Var.b1(true);
                    org.telegram.ui.ActionBar.u0 u0Var = hw0Var.f26954u0;
                    if (u0Var != null) {
                        u0Var.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.u0 u0Var2 = hw0Var.f26952t0;
                    if (u0Var2 != null) {
                        u0Var2.setVisibility(8);
                    }
                }
            }
            hw0Var.A0.a(hashSet.size(), true);
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
            org.telegram.ui.ActionBar.u0 u0Var3 = hw0Var.f26956v0;
            if (u0Var3 != null) {
                if (z10) {
                    i10 = 8;
                } else {
                    i10 = 0;
                }
                u0Var3.setVisibility(i10);
            }
            org.telegram.ui.ActionBar.u0 u0Var4 = hw0Var.f26959w0;
            if (u0Var4 != null) {
                if (!z10) {
                    i11 = 8;
                }
                u0Var4.setVisibility(i11);
            }
            s2Var.V(hashSet.contains(Long.valueOf(savedDialog.dialogId)), true);
        }
    }

    public final void F(boolean z10) {
        ArrayList arrayList = this.f30248e;
        arrayList.clear();
        ArrayList arrayList2 = this.f30249f;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        arrayList2.addAll(this.d.allDialogs);
        if (z10) {
            l();
        }
    }

    @Override
    public final int h() {
        return this.f30249f.size();
    }

    @Override
    public final long i(int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.f30249f;
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
    public final void v(s4.d1 d1Var, int i10) {
        View view = d1Var.f47897a;
        if (!(view instanceof org.telegram.ui.Cells.s2)) {
            return;
        }
        org.telegram.ui.Cells.s2 s2Var = (org.telegram.ui.Cells.s2) view;
        ArrayList arrayList = this.f30249f;
        SavedMessagesController.SavedDialog savedDialog = (SavedMessagesController.SavedDialog) arrayList.get(i10);
        s2Var.W(savedDialog.dialogId, savedDialog.message, savedDialog.getDate(), false, false);
        boolean z10 = true;
        s2Var.f22619s0 = true;
        s2Var.V(this.f30253w.contains(Long.valueOf(savedDialog.dialogId)), false);
        if (i10 + 1 >= arrayList.size()) {
            z10 = false;
        }
        s2Var.f22621s2 = z10;
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        qv0 qv0Var = new qv0(this, this.f30247c);
        hw0 hw0Var = this.f30254x;
        qv0Var.setDialogCellDelegate(hw0Var);
        qv0Var.f22613r0 = true;
        qv0Var.setBackgroundColor(hw0Var.h0(org.telegram.ui.ActionBar.h6.f20560d6));
        return new s4.d1(qv0Var);
    }
}
