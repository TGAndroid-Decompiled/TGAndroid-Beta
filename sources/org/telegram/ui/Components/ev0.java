package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.SavedMessagesController;
public final class ev0 extends im0 {
    public final Context f25980c;
    public final SavedMessagesController d;
    public boolean h;
    public mu0 f25984s;
    public final uv0 f25986x;
    public final ArrayList e = new ArrayList();
    public final ArrayList f25981f = new ArrayList();
    public final hr0 f25982n = new hr0(this, 5);
    public final s4.t0 f25983r = new s4.t0();
    public final s4.y v = new s4.y(new cv0(this));
    public final HashSet f25985w = new HashSet();

    public ev0(uv0 uv0Var, Context context) {
        this.f25986x = uv0Var;
        this.f25980c = context;
        SavedMessagesController savedMessagesController = uv0Var.f31075v1.getMessagesController().getSavedMessagesController();
        this.d = savedMessagesController;
        if (uv0Var.m0()) {
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
        if (view instanceof org.telegram.ui.Cells.r2) {
            org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) view;
            long dialogId = r2Var.getDialogId();
            int i11 = 0;
            int i12 = 0;
            while (true) {
                arrayList = this.f25981f;
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
            HashSet hashSet = this.f25985w;
            boolean contains = hashSet.contains(valueOf);
            uv0 uv0Var = this.f25986x;
            if (contains) {
                hashSet.remove(Long.valueOf(savedDialog.dialogId));
                if (hashSet.size() <= 0 && uv0Var.C1) {
                    uv0Var.d1(false);
                }
            } else {
                hashSet.add(Long.valueOf(savedDialog.dialogId));
                if (hashSet.size() > 0 && !uv0Var.C1) {
                    uv0Var.d1(true);
                    org.telegram.ui.ActionBar.u0 u0Var = uv0Var.f31072u0;
                    if (u0Var != null) {
                        u0Var.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.u0 u0Var2 = uv0Var.f31070t0;
                    if (u0Var2 != null) {
                        u0Var2.setVisibility(8);
                    }
                }
            }
            uv0Var.A0.a(hashSet.size(), true);
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
            org.telegram.ui.ActionBar.u0 u0Var3 = uv0Var.f31074v0;
            if (u0Var3 != null) {
                if (z10) {
                    i10 = 8;
                } else {
                    i10 = 0;
                }
                u0Var3.setVisibility(i10);
            }
            org.telegram.ui.ActionBar.u0 u0Var4 = uv0Var.f31077w0;
            if (u0Var4 != null) {
                if (!z10) {
                    i11 = 8;
                }
                u0Var4.setVisibility(i11);
            }
            r2Var.V(hashSet.contains(Long.valueOf(savedDialog.dialogId)), true);
        }
    }

    public final void F(boolean z10) {
        ArrayList arrayList = this.e;
        arrayList.clear();
        ArrayList arrayList2 = this.f25981f;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        arrayList2.addAll(this.d.allDialogs);
        if (z10) {
            l();
        }
    }

    @Override
    public final int h() {
        return this.f25981f.size();
    }

    @Override
    public final long i(int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.f25981f;
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
        View view = b1Var.f45921a;
        if (!(view instanceof org.telegram.ui.Cells.r2)) {
            return;
        }
        org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) view;
        ArrayList arrayList = this.f25981f;
        SavedMessagesController.SavedDialog savedDialog = (SavedMessagesController.SavedDialog) arrayList.get(i10);
        r2Var.W(savedDialog.dialogId, savedDialog.message, savedDialog.getDate(), false, false);
        boolean z10 = true;
        r2Var.f22899s0 = true;
        r2Var.V(this.f25985w.contains(Long.valueOf(savedDialog.dialogId)), false);
        if (i10 + 1 >= arrayList.size()) {
            z10 = false;
        }
        r2Var.f22901s2 = z10;
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        dv0 dv0Var = new dv0(this, this.f25980c);
        uv0 uv0Var = this.f25986x;
        dv0Var.setDialogCellDelegate(uv0Var);
        dv0Var.f22893r0 = true;
        dv0Var.setBackgroundColor(uv0Var.i0(org.telegram.ui.ActionBar.h6.f20994d6));
        return new s4.b1(dv0Var);
    }
}
