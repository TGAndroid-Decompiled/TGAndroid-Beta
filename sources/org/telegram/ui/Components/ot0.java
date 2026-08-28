package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.SavedMessagesController;
public final class ot0 extends vk0 {
    public final Context f31439c;
    public final SavedMessagesController d;
    public boolean h;
    public ws0 f31444s;
    public final eu0 f31446x;
    public final ArrayList f31440e = new ArrayList();
    public final ArrayList f31441f = new ArrayList();
    public final tp0 f31442n = new tp0(this, 5);
    public final f2.f1 f31443r = new f2.f1();
    public final f2.h0 v = new f2.h0(new mt0(this));
    public final HashSet f31445w = new HashSet();

    public ot0(eu0 eu0Var, Context context) {
        this.f31446x = eu0Var;
        this.f31439c = context;
        SavedMessagesController savedMessagesController = eu0Var.f28160r1.getMessagesController().getSavedMessagesController();
        this.d = savedMessagesController;
        if (eu0Var.l0()) {
            savedMessagesController.loadDialogs(false);
        }
        C(true);
        F(false);
    }

    @Override
    public final boolean D(f2.q1 q1Var) {
        return true;
    }

    public final void E(View view) {
        ArrayList arrayList;
        SavedMessagesController.SavedDialog savedDialog;
        boolean z10;
        int i9;
        if (view instanceof org.telegram.ui.Cells.r2) {
            org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) view;
            long dialogId = r2Var.getDialogId();
            int i10 = 0;
            int i11 = 0;
            while (true) {
                arrayList = this.f31441f;
                if (i11 < arrayList.size()) {
                    if (((SavedMessagesController.SavedDialog) arrayList.get(i11)).dialogId == dialogId) {
                        savedDialog = (SavedMessagesController.SavedDialog) arrayList.get(i11);
                        break;
                    }
                    i11++;
                } else {
                    savedDialog = null;
                    break;
                }
            }
            if (savedDialog == null) {
                return;
            }
            Long valueOf = Long.valueOf(savedDialog.dialogId);
            HashSet hashSet = this.f31445w;
            boolean contains = hashSet.contains(valueOf);
            eu0 eu0Var = this.f31446x;
            if (contains) {
                hashSet.remove(Long.valueOf(savedDialog.dialogId));
                if (hashSet.size() <= 0 && eu0Var.f28178y1) {
                    eu0Var.b1(false);
                }
            } else {
                hashSet.add(Long.valueOf(savedDialog.dialogId));
                if (hashSet.size() > 0 && !eu0Var.f28178y1) {
                    eu0Var.b1(true);
                    org.telegram.ui.ActionBar.w0 w0Var = eu0Var.f28156q0;
                    if (w0Var != null) {
                        w0Var.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.w0 w0Var2 = eu0Var.f28154p0;
                    if (w0Var2 != null) {
                        w0Var2.setVisibility(8);
                    }
                }
            }
            eu0Var.f28171w0.a(hashSet.size(), true);
            if (hashSet.size() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                long longValue = ((Long) it.next()).longValue();
                int i12 = 0;
                while (true) {
                    if (i12 >= arrayList.size()) {
                        break;
                    }
                    SavedMessagesController.SavedDialog savedDialog2 = (SavedMessagesController.SavedDialog) arrayList.get(i12);
                    if (savedDialog2.dialogId == longValue) {
                        if (!savedDialog2.pinned) {
                            z10 = false;
                        }
                    } else {
                        i12++;
                    }
                }
                if (!z10) {
                    break;
                }
            }
            org.telegram.ui.ActionBar.w0 w0Var3 = eu0Var.f28159r0;
            if (w0Var3 != null) {
                if (z10) {
                    i9 = 8;
                } else {
                    i9 = 0;
                }
                w0Var3.setVisibility(i9);
            }
            org.telegram.ui.ActionBar.w0 w0Var4 = eu0Var.f28162s0;
            if (w0Var4 != null) {
                if (!z10) {
                    i10 = 8;
                }
                w0Var4.setVisibility(i10);
            }
            r2Var.U(hashSet.contains(Long.valueOf(savedDialog.dialogId)), true);
        }
    }

    public final void F(boolean z10) {
        ArrayList arrayList = this.f31440e;
        arrayList.clear();
        ArrayList arrayList2 = this.f31441f;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        arrayList2.addAll(this.d.allDialogs);
        if (z10) {
            l();
        }
    }

    @Override
    public final int h() {
        return this.f31441f.size();
    }

    @Override
    public final long i(int i9) {
        if (i9 >= 0) {
            ArrayList arrayList = this.f31441f;
            if (i9 < arrayList.size()) {
                return ((SavedMessagesController.SavedDialog) arrayList.get(i9)).dialogId;
            }
        }
        return i9;
    }

    @Override
    public final int j(int i9) {
        return 13;
    }

    @Override
    public final void v(f2.q1 q1Var, int i9) {
        View view = q1Var.f5501a;
        if (!(view instanceof org.telegram.ui.Cells.r2)) {
            return;
        }
        org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) view;
        ArrayList arrayList = this.f31441f;
        SavedMessagesController.SavedDialog savedDialog = (SavedMessagesController.SavedDialog) arrayList.get(i9);
        r2Var.V(savedDialog.dialogId, savedDialog.message, savedDialog.getDate(), false, false);
        boolean z10 = true;
        r2Var.f25022o0 = true;
        r2Var.U(this.f31445w.contains(Long.valueOf(savedDialog.dialogId)), false);
        if (i9 + 1 >= arrayList.size()) {
            z10 = false;
        }
        r2Var.f25024o2 = z10;
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        nt0 nt0Var = new nt0(this, this.f31439c);
        eu0 eu0Var = this.f31446x;
        nt0Var.setDialogCellDelegate(eu0Var);
        nt0Var.f25017n0 = true;
        nt0Var.setBackgroundColor(eu0Var.h0(org.telegram.ui.ActionBar.f6.f23001d6));
        return new f2.q1(nt0Var);
    }
}
