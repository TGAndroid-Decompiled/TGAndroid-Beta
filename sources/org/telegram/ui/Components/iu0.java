package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.SavedMessagesController;
public final class iu0 extends sl0 {
    public final Context f27906c;
    public final SavedMessagesController d;
    public boolean h;
    public qt0 f27911s;
    public final zu0 f27913x;
    public final ArrayList f27907e = new ArrayList();
    public final ArrayList f27908f = new ArrayList();
    public final oq0 f27909n = new oq0(this, 5);
    public final f2.c1 f27910r = new f2.c1();
    public final f2.f0 v = new f2.f0(new gu0(this));
    public final HashSet f27912w = new HashSet();

    public iu0(zu0 zu0Var, Context context) {
        this.f27913x = zu0Var;
        this.f27906c = context;
        SavedMessagesController savedMessagesController = zu0Var.f34004s1.getMessagesController().getSavedMessagesController();
        this.d = savedMessagesController;
        if (zu0Var.l0()) {
            savedMessagesController.loadDialogs(false);
        }
        C(true);
        F(false);
    }

    @Override
    public final boolean D(f2.m1 m1Var) {
        return true;
    }

    public final void E(View view) {
        ArrayList arrayList;
        SavedMessagesController.SavedDialog savedDialog;
        boolean z4;
        int i10;
        if (view instanceof org.telegram.ui.Cells.r2) {
            org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) view;
            long dialogId = r2Var.getDialogId();
            int i11 = 0;
            int i12 = 0;
            while (true) {
                arrayList = this.f27908f;
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
            HashSet hashSet = this.f27912w;
            boolean contains = hashSet.contains(valueOf);
            zu0 zu0Var = this.f27913x;
            if (contains) {
                hashSet.remove(Long.valueOf(savedDialog.dialogId));
                if (hashSet.size() <= 0 && zu0Var.f34021z1) {
                    zu0Var.b1(false);
                }
            } else {
                hashSet.add(Long.valueOf(savedDialog.dialogId));
                if (hashSet.size() > 0 && !zu0Var.f34021z1) {
                    zu0Var.b1(true);
                    org.telegram.ui.ActionBar.w0 w0Var = zu0Var.f34000r0;
                    if (w0Var != null) {
                        w0Var.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.w0 w0Var2 = zu0Var.f33997q0;
                    if (w0Var2 != null) {
                        w0Var2.setVisibility(8);
                    }
                }
            }
            zu0Var.f34015x0.a(hashSet.size(), true);
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
            org.telegram.ui.ActionBar.w0 w0Var3 = zu0Var.f34003s0;
            if (w0Var3 != null) {
                if (z4) {
                    i10 = 8;
                } else {
                    i10 = 0;
                }
                w0Var3.setVisibility(i10);
            }
            org.telegram.ui.ActionBar.w0 w0Var4 = zu0Var.f34005t0;
            if (w0Var4 != null) {
                if (!z4) {
                    i11 = 8;
                }
                w0Var4.setVisibility(i11);
            }
            r2Var.V(hashSet.contains(Long.valueOf(savedDialog.dialogId)), true);
        }
    }

    public final void F(boolean z4) {
        ArrayList arrayList = this.f27907e;
        arrayList.clear();
        ArrayList arrayList2 = this.f27908f;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        arrayList2.addAll(this.d.allDialogs);
        if (z4) {
            l();
        }
    }

    @Override
    public final int h() {
        return this.f27908f.size();
    }

    @Override
    public final long i(int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.f27908f;
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
    public final void v(f2.m1 m1Var, int i10) {
        View view = m1Var.f5875a;
        if (!(view instanceof org.telegram.ui.Cells.r2)) {
            return;
        }
        org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) view;
        ArrayList arrayList = this.f27908f;
        SavedMessagesController.SavedDialog savedDialog = (SavedMessagesController.SavedDialog) arrayList.get(i10);
        r2Var.W(savedDialog.dialogId, savedDialog.message, savedDialog.getDate(), false, false);
        boolean z4 = true;
        r2Var.f23484p0 = true;
        r2Var.V(this.f27912w.contains(Long.valueOf(savedDialog.dialogId)), false);
        if (i10 + 1 >= arrayList.size()) {
            z4 = false;
        }
        r2Var.f23486p2 = z4;
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        hu0 hu0Var = new hu0(this, this.f27906c);
        zu0 zu0Var = this.f27913x;
        hu0Var.setDialogCellDelegate(zu0Var);
        hu0Var.f23479o0 = true;
        hu0Var.setBackgroundColor(zu0Var.h0(org.telegram.ui.ActionBar.k6.f21659d6));
        return new f2.m1(hu0Var);
    }
}
