package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.SavedMessagesController;
public final class lv0 extends pm0 {
    public final Context f28608c;
    public final SavedMessagesController d;
    public boolean h;
    public tu0 f28613s;
    public final bw0 f28615x;
    public final ArrayList f28609e = new ArrayList();
    public final ArrayList f28610f = new ArrayList();
    public final or0 f28611n = new or0(this, 5);
    public final s4.v0 f28612r = new s4.v0();
    public final s4.z v = new s4.z(new jv0(this));
    public final HashSet f28614w = new HashSet();

    public lv0(bw0 bw0Var, Context context) {
        this.f28615x = bw0Var;
        this.f28608c = context;
        SavedMessagesController savedMessagesController = bw0Var.f25166v1.getMessagesController().getSavedMessagesController();
        this.d = savedMessagesController;
        if (bw0Var.l0()) {
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
                arrayList = this.f28610f;
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
            HashSet hashSet = this.f28614w;
            boolean contains = hashSet.contains(valueOf);
            bw0 bw0Var = this.f28615x;
            if (contains) {
                hashSet.remove(Long.valueOf(savedDialog.dialogId));
                if (hashSet.size() <= 0 && bw0Var.C1) {
                    bw0Var.b1(false);
                }
            } else {
                hashSet.add(Long.valueOf(savedDialog.dialogId));
                if (hashSet.size() > 0 && !bw0Var.C1) {
                    bw0Var.b1(true);
                    org.telegram.ui.ActionBar.v0 v0Var = bw0Var.f25163u0;
                    if (v0Var != null) {
                        v0Var.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.v0 v0Var2 = bw0Var.f25161t0;
                    if (v0Var2 != null) {
                        v0Var2.setVisibility(8);
                    }
                }
            }
            bw0Var.A0.a(hashSet.size(), true);
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
            org.telegram.ui.ActionBar.v0 v0Var3 = bw0Var.f25165v0;
            if (v0Var3 != null) {
                if (z10) {
                    i10 = 8;
                } else {
                    i10 = 0;
                }
                v0Var3.setVisibility(i10);
            }
            org.telegram.ui.ActionBar.v0 v0Var4 = bw0Var.f25168w0;
            if (v0Var4 != null) {
                if (!z10) {
                    i11 = 8;
                }
                v0Var4.setVisibility(i11);
            }
            s2Var.V(hashSet.contains(Long.valueOf(savedDialog.dialogId)), true);
        }
    }

    public final void F(boolean z10) {
        ArrayList arrayList = this.f28609e;
        arrayList.clear();
        ArrayList arrayList2 = this.f28610f;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        arrayList2.addAll(this.d.allDialogs);
        if (z10) {
            l();
        }
    }

    @Override
    public final int h() {
        return this.f28610f.size();
    }

    @Override
    public final long i(int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.f28610f;
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
        View view = d1Var.f47656a;
        if (!(view instanceof org.telegram.ui.Cells.s2)) {
            return;
        }
        org.telegram.ui.Cells.s2 s2Var = (org.telegram.ui.Cells.s2) view;
        ArrayList arrayList = this.f28610f;
        SavedMessagesController.SavedDialog savedDialog = (SavedMessagesController.SavedDialog) arrayList.get(i10);
        s2Var.W(savedDialog.dialogId, savedDialog.message, savedDialog.getDate(), false, false);
        boolean z10 = true;
        s2Var.f22855s0 = true;
        s2Var.V(this.f28614w.contains(Long.valueOf(savedDialog.dialogId)), false);
        if (i10 + 1 >= arrayList.size()) {
            z10 = false;
        }
        s2Var.f22857s2 = z10;
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        kv0 kv0Var = new kv0(this, this.f28608c);
        bw0 bw0Var = this.f28615x;
        kv0Var.setDialogCellDelegate(bw0Var);
        kv0Var.f22849r0 = true;
        kv0Var.setBackgroundColor(bw0Var.h0(org.telegram.ui.ActionBar.i6.f20797d6));
        return new s4.d1(kv0Var);
    }
}
