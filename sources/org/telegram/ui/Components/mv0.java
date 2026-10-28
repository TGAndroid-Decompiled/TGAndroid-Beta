package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.SavedMessagesController;
public final class mv0 extends mm0 {
    public final Context f30636c;
    public final SavedMessagesController d;
    public boolean h;
    public tu0 f30640s;
    public final bw0 f30642x;
    public final ArrayList e = new ArrayList();
    public final ArrayList f30637f = new ArrayList();
    public final np0 f30638n = new np0(this, 9);
    public final s4.w0 f30639r = new s4.w0();
    public final s4.z v = new s4.z(new kv0(this));
    public final HashSet f30641w = new HashSet();

    public mv0(bw0 bw0Var, Context context) {
        this.f30642x = bw0Var;
        this.f30636c = context;
        SavedMessagesController savedMessagesController = bw0Var.f26992x1.getMessagesController().getSavedMessagesController();
        this.d = savedMessagesController;
        if (bw0Var.u0()) {
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
                arrayList = this.f30637f;
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
            HashSet hashSet = this.f30641w;
            boolean contains = hashSet.contains(valueOf);
            bw0 bw0Var = this.f30642x;
            if (contains) {
                hashSet.remove(Long.valueOf(savedDialog.dialogId));
                if (hashSet.size() <= 0 && bw0Var.E1) {
                    bw0Var.k1(false);
                }
            } else {
                hashSet.add(Long.valueOf(savedDialog.dialogId));
                if (hashSet.size() > 0 && !bw0Var.E1) {
                    bw0Var.k1(true);
                    org.telegram.ui.ActionBar.w0 w0Var = bw0Var.f26988w0;
                    if (w0Var != null) {
                        w0Var.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.w0 w0Var2 = bw0Var.f26985v0;
                    if (w0Var2 != null) {
                        w0Var2.setVisibility(8);
                    }
                }
            }
            bw0Var.i1(hashSet.size(), true);
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
            org.telegram.ui.ActionBar.w0 w0Var3 = bw0Var.f26991x0;
            if (w0Var3 != null) {
                if (z10) {
                    i10 = 8;
                } else {
                    i10 = 0;
                }
                w0Var3.setVisibility(i10);
            }
            org.telegram.ui.ActionBar.w0 w0Var4 = bw0Var.f26994y0;
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
        ArrayList arrayList2 = this.f30637f;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        arrayList2.addAll(this.d.allDialogs);
        if (z10) {
            l();
        }
    }

    @Override
    public final int h() {
        return this.f30637f.size();
    }

    @Override
    public final long i(int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.f30637f;
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
        View view = e1Var.f47773a;
        if (!(view instanceof org.telegram.ui.Cells.p2)) {
            return;
        }
        org.telegram.ui.Cells.p2 p2Var = (org.telegram.ui.Cells.p2) view;
        ArrayList arrayList = this.f30637f;
        SavedMessagesController.SavedDialog savedDialog = (SavedMessagesController.SavedDialog) arrayList.get(i10);
        p2Var.V(savedDialog.dialogId, savedDialog.message, savedDialog.getDate(), false, false);
        boolean z10 = true;
        p2Var.f24721s0 = true;
        p2Var.U(this.f30641w.contains(Long.valueOf(savedDialog.dialogId)), false);
        if (i10 + 1 >= arrayList.size()) {
            z10 = false;
        }
        p2Var.f24723s2 = z10;
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        lv0 lv0Var = new lv0(this, this.f30636c);
        bw0 bw0Var = this.f30642x;
        lv0Var.setDialogCellDelegate(bw0Var);
        lv0Var.f24715r0 = true;
        org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23357d6, lv0Var, bw0Var.H1);
        return new s4.e1(lv0Var);
    }
}
