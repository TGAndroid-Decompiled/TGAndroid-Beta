package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.SavedMessagesController;
public final class gv0 extends km0 {
    public final Context f26794c;
    public final SavedMessagesController d;
    public boolean h;
    public ou0 f26798s;
    public final wv0 f26800x;
    public final ArrayList e = new ArrayList();
    public final ArrayList f26795f = new ArrayList();
    public final jr0 f26796n = new jr0(this, 6);
    public final s4.t0 f26797r = new s4.t0();
    public final s4.y v = new s4.y(new ev0(this));
    public final HashSet f26799w = new HashSet();

    public gv0(wv0 wv0Var, Context context) {
        this.f26800x = wv0Var;
        this.f26794c = context;
        SavedMessagesController savedMessagesController = wv0Var.f32410v1.getMessagesController().getSavedMessagesController();
        this.d = savedMessagesController;
        if (wv0Var.n0()) {
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
                arrayList = this.f26795f;
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
            HashSet hashSet = this.f26799w;
            boolean contains = hashSet.contains(valueOf);
            wv0 wv0Var = this.f26800x;
            if (contains) {
                hashSet.remove(Long.valueOf(savedDialog.dialogId));
                if (hashSet.size() <= 0 && wv0Var.C1) {
                    wv0Var.e1(false);
                }
            } else {
                hashSet.add(Long.valueOf(savedDialog.dialogId));
                if (hashSet.size() > 0 && !wv0Var.C1) {
                    wv0Var.e1(true);
                    org.telegram.ui.ActionBar.u0 u0Var = wv0Var.f32407u0;
                    if (u0Var != null) {
                        u0Var.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.u0 u0Var2 = wv0Var.f32405t0;
                    if (u0Var2 != null) {
                        u0Var2.setVisibility(8);
                    }
                }
            }
            wv0Var.A0.a(hashSet.size(), true);
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
            org.telegram.ui.ActionBar.u0 u0Var3 = wv0Var.f32409v0;
            if (u0Var3 != null) {
                if (z10) {
                    i10 = 8;
                } else {
                    i10 = 0;
                }
                u0Var3.setVisibility(i10);
            }
            org.telegram.ui.ActionBar.u0 u0Var4 = wv0Var.f32412w0;
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
        ArrayList arrayList2 = this.f26795f;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        arrayList2.addAll(this.d.allDialogs);
        if (z10) {
            l();
        }
    }

    @Override
    public final int h() {
        return this.f26795f.size();
    }

    @Override
    public final long i(int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.f26795f;
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
        View view = b1Var.f46342a;
        if (!(view instanceof org.telegram.ui.Cells.q2)) {
            return;
        }
        org.telegram.ui.Cells.q2 q2Var = (org.telegram.ui.Cells.q2) view;
        ArrayList arrayList = this.f26795f;
        SavedMessagesController.SavedDialog savedDialog = (SavedMessagesController.SavedDialog) arrayList.get(i10);
        q2Var.V(savedDialog.dialogId, savedDialog.message, savedDialog.getDate(), false, false);
        boolean z10 = true;
        q2Var.f23009s0 = true;
        q2Var.U(this.f26799w.contains(Long.valueOf(savedDialog.dialogId)), false);
        if (i10 + 1 >= arrayList.size()) {
            z10 = false;
        }
        q2Var.f23011s2 = z10;
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        fv0 fv0Var = new fv0(this, this.f26794c);
        wv0 wv0Var = this.f26800x;
        fv0Var.setDialogCellDelegate(wv0Var);
        fv0Var.f23003r0 = true;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21184d6, fv0Var, wv0Var.F1);
        return new s4.b1(fv0Var);
    }
}
