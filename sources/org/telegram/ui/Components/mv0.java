package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.SavedMessagesController;
public final class mv0 extends qm0 {
    public final Context f28912c;
    public final SavedMessagesController d;
    public boolean h;
    public uu0 f28917s;
    public final cw0 f28919x;
    public final ArrayList f28913e = new ArrayList();
    public final ArrayList f28914f = new ArrayList();
    public final pr0 f28915n = new pr0(this, 5);
    public final s4.v0 f28916r = new s4.v0();
    public final s4.z v = new s4.z(new kv0(this));
    public final HashSet f28918w = new HashSet();

    public mv0(cw0 cw0Var, Context context) {
        this.f28919x = cw0Var;
        this.f28912c = context;
        SavedMessagesController savedMessagesController = cw0Var.f25474v1.getMessagesController().getSavedMessagesController();
        this.d = savedMessagesController;
        if (cw0Var.l0()) {
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
                arrayList = this.f28914f;
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
            HashSet hashSet = this.f28918w;
            boolean contains = hashSet.contains(valueOf);
            cw0 cw0Var = this.f28919x;
            if (contains) {
                hashSet.remove(Long.valueOf(savedDialog.dialogId));
                if (hashSet.size() <= 0 && cw0Var.C1) {
                    cw0Var.b1(false);
                }
            } else {
                hashSet.add(Long.valueOf(savedDialog.dialogId));
                if (hashSet.size() > 0 && !cw0Var.C1) {
                    cw0Var.b1(true);
                    org.telegram.ui.ActionBar.v0 v0Var = cw0Var.f25471u0;
                    if (v0Var != null) {
                        v0Var.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.v0 v0Var2 = cw0Var.f25469t0;
                    if (v0Var2 != null) {
                        v0Var2.setVisibility(8);
                    }
                }
            }
            cw0Var.A0.a(hashSet.size(), true);
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
            org.telegram.ui.ActionBar.v0 v0Var3 = cw0Var.f25473v0;
            if (v0Var3 != null) {
                if (z10) {
                    i10 = 8;
                } else {
                    i10 = 0;
                }
                v0Var3.setVisibility(i10);
            }
            org.telegram.ui.ActionBar.v0 v0Var4 = cw0Var.f25476w0;
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
        ArrayList arrayList = this.f28913e;
        arrayList.clear();
        ArrayList arrayList2 = this.f28914f;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        arrayList2.addAll(this.d.allDialogs);
        if (z10) {
            l();
        }
    }

    @Override
    public final int h() {
        return this.f28914f.size();
    }

    @Override
    public final long i(int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.f28914f;
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
        View view = d1Var.f47702a;
        if (!(view instanceof org.telegram.ui.Cells.s2)) {
            return;
        }
        org.telegram.ui.Cells.s2 s2Var = (org.telegram.ui.Cells.s2) view;
        ArrayList arrayList = this.f28914f;
        SavedMessagesController.SavedDialog savedDialog = (SavedMessagesController.SavedDialog) arrayList.get(i10);
        s2Var.W(savedDialog.dialogId, savedDialog.message, savedDialog.getDate(), false, false);
        boolean z10 = true;
        s2Var.f22859s0 = true;
        s2Var.V(this.f28918w.contains(Long.valueOf(savedDialog.dialogId)), false);
        if (i10 + 1 >= arrayList.size()) {
            z10 = false;
        }
        s2Var.f22861s2 = z10;
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        lv0 lv0Var = new lv0(this, this.f28912c);
        cw0 cw0Var = this.f28919x;
        lv0Var.setDialogCellDelegate(cw0Var);
        lv0Var.f22853r0 = true;
        lv0Var.setBackgroundColor(cw0Var.h0(org.telegram.ui.ActionBar.i6.f20801d6));
        return new s4.d1(lv0Var);
    }
}
