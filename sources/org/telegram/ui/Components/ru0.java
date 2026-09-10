package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.SavedMessagesController;
public final class ru0 extends ul0 {
    public final Context f26755c;
    public final SavedMessagesController d;
    public boolean h;
    public zt0 f26759s;
    public final iv0 f26761x;
    public final ArrayList e = new ArrayList();
    public final ArrayList f26756f = new ArrayList();
    public final uq0 f26757n = new uq0(this, 5);
    public final s4.u0 f26758r = new s4.u0();
    public final s4.y v = new s4.y(new pu0(this));
    public final HashSet f26760w = new HashSet();

    public ru0(iv0 iv0Var, Context context) {
        this.f26761x = iv0Var;
        this.f26755c = context;
        SavedMessagesController savedMessagesController = iv0Var.f24131v1.getMessagesController().getSavedMessagesController();
        this.d = savedMessagesController;
        if (iv0Var.l0()) {
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
        if (view instanceof org.telegram.ui.Cells.r2) {
            org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) view;
            long dialogId = r2Var.getDialogId();
            int i11 = 0;
            int i12 = 0;
            while (true) {
                arrayList = this.f26756f;
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
            HashSet hashSet = this.f26760w;
            boolean contains = hashSet.contains(valueOf);
            iv0 iv0Var = this.f26761x;
            if (contains) {
                hashSet.remove(Long.valueOf(savedDialog.dialogId));
                if (hashSet.size() <= 0 && iv0Var.C1) {
                    iv0Var.b1(false);
                }
            } else {
                hashSet.add(Long.valueOf(savedDialog.dialogId));
                if (hashSet.size() > 0 && !iv0Var.C1) {
                    iv0Var.b1(true);
                    org.telegram.ui.ActionBar.w0 w0Var = iv0Var.f24128u0;
                    if (w0Var != null) {
                        w0Var.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.w0 w0Var2 = iv0Var.f24126t0;
                    if (w0Var2 != null) {
                        w0Var2.setVisibility(8);
                    }
                }
            }
            iv0Var.A0.a(hashSet.size(), true);
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
            org.telegram.ui.ActionBar.w0 w0Var3 = iv0Var.f24130v0;
            if (w0Var3 != null) {
                if (z10) {
                    i10 = 8;
                } else {
                    i10 = 0;
                }
                w0Var3.setVisibility(i10);
            }
            org.telegram.ui.ActionBar.w0 w0Var4 = iv0Var.f24133w0;
            if (w0Var4 != null) {
                if (!z10) {
                    i11 = 8;
                }
                w0Var4.setVisibility(i11);
            }
            r2Var.V(hashSet.contains(Long.valueOf(savedDialog.dialogId)), true);
        }
    }

    public final void F(boolean z10) {
        ArrayList arrayList = this.e;
        arrayList.clear();
        ArrayList arrayList2 = this.f26756f;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        arrayList2.addAll(this.d.allDialogs);
        if (z10) {
            l();
        }
    }

    @Override
    public final int h() {
        return this.f26756f.size();
    }

    @Override
    public final long i(int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.f26756f;
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
        View view = c1Var.f41610a;
        if (!(view instanceof org.telegram.ui.Cells.r2)) {
            return;
        }
        org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) view;
        ArrayList arrayList = this.f26756f;
        SavedMessagesController.SavedDialog savedDialog = (SavedMessagesController.SavedDialog) arrayList.get(i10);
        r2Var.W(savedDialog.dialogId, savedDialog.message, savedDialog.getDate(), false, false);
        boolean z10 = true;
        r2Var.f19842s0 = true;
        r2Var.V(this.f26760w.contains(Long.valueOf(savedDialog.dialogId)), false);
        if (i10 + 1 >= arrayList.size()) {
            z10 = false;
        }
        r2Var.f19844s2 = z10;
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        qu0 qu0Var = new qu0(this, this.f26755c);
        iv0 iv0Var = this.f26761x;
        qu0Var.setDialogCellDelegate(iv0Var);
        qu0Var.f19836r0 = true;
        qu0Var.setBackgroundColor(iv0Var.h0(org.telegram.ui.ActionBar.j6.f17928d6));
        return new s4.c1(qu0Var);
    }
}
