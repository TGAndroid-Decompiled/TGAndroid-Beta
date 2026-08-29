package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.SavedMessagesController;
public final class zt0 extends il0 {
    public final Context f35414c;
    public final SavedMessagesController d;
    public boolean h;
    public ht0 f35419s;
    public final qu0 f35421x;
    public final ArrayList f35415e = new ArrayList();
    public final ArrayList f35416f = new ArrayList();
    public final fq0 f35417n = new fq0(this, 5);
    public final f2.c1 f35418r = new f2.c1();
    public final f2.e0 v = new f2.e0(new xt0(this));
    public final HashSet f35420w = new HashSet();

    public zt0(qu0 qu0Var, Context context) {
        this.f35421x = qu0Var;
        this.f35414c = context;
        SavedMessagesController savedMessagesController = qu0Var.f32093r1.getMessagesController().getSavedMessagesController();
        this.d = savedMessagesController;
        if (qu0Var.l0()) {
            savedMessagesController.loadDialogs(false);
        }
        C(true);
        F(false);
    }

    @Override
    public final boolean D(f2.n1 n1Var) {
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
                arrayList = this.f35416f;
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
            HashSet hashSet = this.f35420w;
            boolean contains = hashSet.contains(valueOf);
            qu0 qu0Var = this.f35421x;
            if (contains) {
                hashSet.remove(Long.valueOf(savedDialog.dialogId));
                if (hashSet.size() <= 0 && qu0Var.f32111y1) {
                    qu0Var.b1(false);
                }
            } else {
                hashSet.add(Long.valueOf(savedDialog.dialogId));
                if (hashSet.size() > 0 && !qu0Var.f32111y1) {
                    qu0Var.b1(true);
                    org.telegram.ui.ActionBar.w0 w0Var = qu0Var.f32089q0;
                    if (w0Var != null) {
                        w0Var.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.w0 w0Var2 = qu0Var.f32087p0;
                    if (w0Var2 != null) {
                        w0Var2.setVisibility(8);
                    }
                }
            }
            qu0Var.f32104w0.a(hashSet.size(), true);
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
            org.telegram.ui.ActionBar.w0 w0Var3 = qu0Var.f32092r0;
            if (w0Var3 != null) {
                if (z10) {
                    i10 = 8;
                } else {
                    i10 = 0;
                }
                w0Var3.setVisibility(i10);
            }
            org.telegram.ui.ActionBar.w0 w0Var4 = qu0Var.f32095s0;
            if (w0Var4 != null) {
                if (!z10) {
                    i11 = 8;
                }
                w0Var4.setVisibility(i11);
            }
            p2Var.V(hashSet.contains(Long.valueOf(savedDialog.dialogId)), true);
        }
    }

    public final void F(boolean z10) {
        ArrayList arrayList = this.f35415e;
        arrayList.clear();
        ArrayList arrayList2 = this.f35416f;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        arrayList2.addAll(this.d.allDialogs);
        if (z10) {
            l();
        }
    }

    @Override
    public final int h() {
        return this.f35416f.size();
    }

    @Override
    public final long i(int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.f35416f;
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
    public final void v(f2.n1 n1Var, int i10) {
        View view = n1Var.f6432a;
        if (!(view instanceof org.telegram.ui.Cells.p2)) {
            return;
        }
        org.telegram.ui.Cells.p2 p2Var = (org.telegram.ui.Cells.p2) view;
        ArrayList arrayList = this.f35416f;
        SavedMessagesController.SavedDialog savedDialog = (SavedMessagesController.SavedDialog) arrayList.get(i10);
        p2Var.W(savedDialog.dialogId, savedDialog.message, savedDialog.getDate(), false, false);
        boolean z10 = true;
        p2Var.f24896o0 = true;
        p2Var.V(this.f35420w.contains(Long.valueOf(savedDialog.dialogId)), false);
        if (i10 + 1 >= arrayList.size()) {
            z10 = false;
        }
        p2Var.f24898o2 = z10;
    }

    @Override
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        yt0 yt0Var = new yt0(this, this.f35414c);
        qu0 qu0Var = this.f35421x;
        yt0Var.setDialogCellDelegate(qu0Var);
        yt0Var.f24891n0 = true;
        yt0Var.setBackgroundColor(qu0Var.h0(org.telegram.ui.ActionBar.g6.f23062d6));
        return new f2.n1(yt0Var);
    }
}
