package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.SavedMessagesController;
public final class av0 extends yl0 {
    public final Context f24747c;
    public final SavedMessagesController d;
    public boolean h;
    public iu0 f24752s;
    public final qv0 f24754x;
    public final ArrayList f24748e = new ArrayList();
    public final ArrayList f24749f = new ArrayList();
    public final gq0 f24750n = new gq0(this, 7);
    public final s4.u0 f24751r = new s4.u0();
    public final s4.y v = new s4.y(new yu0(this));
    public final HashSet f24753w = new HashSet();

    public av0(qv0 qv0Var, Context context) {
        this.f24754x = qv0Var;
        this.f24747c = context;
        SavedMessagesController savedMessagesController = qv0Var.f30263v1.getMessagesController().getSavedMessagesController();
        this.d = savedMessagesController;
        if (qv0Var.l0()) {
            savedMessagesController.loadDialogs(false);
        }
        C(true);
        F(false);
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
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
                arrayList = this.f24749f;
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
            HashSet hashSet = this.f24753w;
            boolean contains = hashSet.contains(valueOf);
            qv0 qv0Var = this.f24754x;
            if (contains) {
                hashSet.remove(Long.valueOf(savedDialog.dialogId));
                if (hashSet.size() <= 0 && qv0Var.C1) {
                    qv0Var.b1(false);
                }
            } else {
                hashSet.add(Long.valueOf(savedDialog.dialogId));
                if (hashSet.size() > 0 && !qv0Var.C1) {
                    qv0Var.b1(true);
                    org.telegram.ui.ActionBar.v0 v0Var = qv0Var.f30260u0;
                    if (v0Var != null) {
                        v0Var.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.v0 v0Var2 = qv0Var.f30258t0;
                    if (v0Var2 != null) {
                        v0Var2.setVisibility(8);
                    }
                }
            }
            qv0Var.A0.a(hashSet.size(), true);
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
            org.telegram.ui.ActionBar.v0 v0Var3 = qv0Var.f30262v0;
            if (v0Var3 != null) {
                if (z10) {
                    i10 = 8;
                } else {
                    i10 = 0;
                }
                v0Var3.setVisibility(i10);
            }
            org.telegram.ui.ActionBar.v0 v0Var4 = qv0Var.f30265w0;
            if (v0Var4 != null) {
                if (!z10) {
                    i11 = 8;
                }
                v0Var4.setVisibility(i11);
            }
            s2Var.T(hashSet.contains(Long.valueOf(savedDialog.dialogId)), true);
        }
    }

    public final void F(boolean z10) {
        ArrayList arrayList = this.f24748e;
        arrayList.clear();
        ArrayList arrayList2 = this.f24749f;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        arrayList2.addAll(this.d.allDialogs);
        if (z10) {
            l();
        }
    }

    @Override
    public final int h() {
        return this.f24749f.size();
    }

    @Override
    public final long i(int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.f24749f;
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
    public final void v(s4.c1 c1Var, int i10) {
        View view = c1Var.f46538a;
        if (!(view instanceof org.telegram.ui.Cells.s2)) {
            return;
        }
        org.telegram.ui.Cells.s2 s2Var = (org.telegram.ui.Cells.s2) view;
        ArrayList arrayList = this.f24749f;
        SavedMessagesController.SavedDialog savedDialog = (SavedMessagesController.SavedDialog) arrayList.get(i10);
        s2Var.U(savedDialog.dialogId, savedDialog.message, savedDialog.getDate(), false, false);
        boolean z10 = true;
        s2Var.f22866s0 = true;
        s2Var.T(this.f24753w.contains(Long.valueOf(savedDialog.dialogId)), false);
        if (i10 + 1 >= arrayList.size()) {
            z10 = false;
        }
        s2Var.f22868s2 = z10;
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        zu0 zu0Var = new zu0(this, this.f24747c);
        qv0 qv0Var = this.f24754x;
        zu0Var.setDialogCellDelegate(qv0Var);
        zu0Var.f22860r0 = true;
        zu0Var.setBackgroundColor(qv0Var.h0(org.telegram.ui.ActionBar.i6.f20827d6));
        return new s4.c1(zu0Var);
    }
}
