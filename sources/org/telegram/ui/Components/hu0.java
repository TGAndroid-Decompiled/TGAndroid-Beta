package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.SavedMessagesController;
public final class hu0 extends ql0 {
    public final Context f25497c;
    public final SavedMessagesController d;
    public boolean h;
    public pt0 f25501s;
    public final yu0 f25503x;
    public final ArrayList e = new ArrayList();
    public final ArrayList f25498f = new ArrayList();
    public final nq0 f25499n = new nq0(this, 5);
    public final f2.b1 f25500r = new f2.b1();
    public final f2.e0 v = new f2.e0(new fu0(this));
    public final HashSet f25502w = new HashSet();

    public hu0(yu0 yu0Var, Context context) {
        this.f25503x = yu0Var;
        this.f25497c = context;
        SavedMessagesController savedMessagesController = yu0Var.f31155s1.getMessagesController().getSavedMessagesController();
        this.d = savedMessagesController;
        if (yu0Var.l0()) {
            savedMessagesController.loadDialogs(false);
        }
        C(true);
        F(false);
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        return true;
    }

    public final void E(View view) {
        ArrayList arrayList;
        SavedMessagesController.SavedDialog savedDialog;
        boolean z4;
        int i10;
        if (view instanceof org.telegram.ui.Cells.q2) {
            org.telegram.ui.Cells.q2 q2Var = (org.telegram.ui.Cells.q2) view;
            long dialogId = q2Var.getDialogId();
            int i11 = 0;
            int i12 = 0;
            while (true) {
                arrayList = this.f25498f;
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
            HashSet hashSet = this.f25502w;
            boolean contains = hashSet.contains(valueOf);
            yu0 yu0Var = this.f25503x;
            if (contains) {
                hashSet.remove(Long.valueOf(savedDialog.dialogId));
                if (hashSet.size() <= 0 && yu0Var.f31172z1) {
                    yu0Var.b1(false);
                }
            } else {
                hashSet.add(Long.valueOf(savedDialog.dialogId));
                if (hashSet.size() > 0 && !yu0Var.f31172z1) {
                    yu0Var.b1(true);
                    org.telegram.ui.ActionBar.w0 w0Var = yu0Var.f31151r0;
                    if (w0Var != null) {
                        w0Var.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.w0 w0Var2 = yu0Var.f31148q0;
                    if (w0Var2 != null) {
                        w0Var2.setVisibility(8);
                    }
                }
            }
            yu0Var.f31166x0.a(hashSet.size(), true);
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
            org.telegram.ui.ActionBar.w0 w0Var3 = yu0Var.f31154s0;
            if (w0Var3 != null) {
                if (z4) {
                    i10 = 8;
                } else {
                    i10 = 0;
                }
                w0Var3.setVisibility(i10);
            }
            org.telegram.ui.ActionBar.w0 w0Var4 = yu0Var.f31156t0;
            if (w0Var4 != null) {
                if (!z4) {
                    i11 = 8;
                }
                w0Var4.setVisibility(i11);
            }
            q2Var.V(hashSet.contains(Long.valueOf(savedDialog.dialogId)), true);
        }
    }

    public final void F(boolean z4) {
        ArrayList arrayList = this.e;
        arrayList.clear();
        ArrayList arrayList2 = this.f25498f;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        arrayList2.addAll(this.d.allDialogs);
        if (z4) {
            l();
        }
    }

    @Override
    public final int h() {
        return this.f25498f.size();
    }

    @Override
    public final long i(int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.f25498f;
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
    public final void v(f2.l1 l1Var, int i10) {
        View view = l1Var.f5774a;
        if (!(view instanceof org.telegram.ui.Cells.q2)) {
            return;
        }
        org.telegram.ui.Cells.q2 q2Var = (org.telegram.ui.Cells.q2) view;
        ArrayList arrayList = this.f25498f;
        SavedMessagesController.SavedDialog savedDialog = (SavedMessagesController.SavedDialog) arrayList.get(i10);
        q2Var.W(savedDialog.dialogId, savedDialog.message, savedDialog.getDate(), false, false);
        boolean z4 = true;
        q2Var.f21626p0 = true;
        q2Var.V(this.f25502w.contains(Long.valueOf(savedDialog.dialogId)), false);
        if (i10 + 1 >= arrayList.size()) {
            z4 = false;
        }
        q2Var.f21628p2 = z4;
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        gu0 gu0Var = new gu0(this, this.f25497c);
        yu0 yu0Var = this.f25503x;
        gu0Var.setDialogCellDelegate(yu0Var);
        gu0Var.f21621o0 = true;
        gu0Var.setBackgroundColor(yu0Var.h0(org.telegram.ui.ActionBar.j6.f19881d6));
        return new f2.l1(gu0Var);
    }
}
