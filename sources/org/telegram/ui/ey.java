package org.telegram.ui;

import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;

public final class ey extends f2.c0 {
    public f2.o1 d;

    public boolean f37876e;

    public boolean f37877f;

    public final fy f37878g;
    public final gy h;

    public ey(gy gyVar, fy fyVar) {
        this.h = gyVar;
        this.f37878g = fyVar;
    }

    @Override
    public final int b(int i10, int i11) {
        if (this.f37877f) {
            return 0;
        }
        return super.b(i10, i11);
    }

    @Override
    public final long d(RecyclerView recyclerView, int i10, float f10, float f11) {
        gy gyVar;
        org.telegram.ui.Cells.p2 p2Var;
        if (i10 == 4) {
            return 200L;
        }
        if (i10 == 8 && (p2Var = (gyVar = this.h).T0) != null) {
            AndroidUtilities.runOnUIThread(new zg(1, p2Var), this.f37878g.f38234x.f5843e);
            gyVar.T0 = null;
        }
        return super.d(recyclerView, i10, f10, f11);
    }

    @Override
    public final int e(RecyclerView recyclerView, f2.o1 o1Var) {
        TLRPC.Dialog dialog;
        fy fyVar = this.f37878g;
        if (!fyVar.f38234x.k()) {
            gy gyVar = this.h;
            if ((((org.telegram.ui.ActionBar.n2) gyVar).parentLayout == null || !((ActionBarLayout) ((org.telegram.ui.ActionBar.n2) gyVar).parentLayout).y()) && !gyVar.B3.c() && gyVar.T2 == 0) {
                if (this.f37876e && this.f37877f) {
                    View view = o1Var.f5789a;
                    if (view instanceof org.telegram.ui.Cells.p2) {
                        ((org.telegram.ui.Cells.p2) view).f24946w = true;
                    }
                    this.f37876e = false;
                    return 0;
                }
                if (!gyVar.f38537h2 && fyVar.p() && gyVar.S0 == null) {
                    View view2 = o1Var.f5789a;
                    if (view2 instanceof org.telegram.ui.Cells.p2) {
                        org.telegram.ui.Cells.p2 p2Var = (org.telegram.ui.Cells.p2) view2;
                        long dialogId = p2Var.getDialogId();
                        MessagesController.DialogFilter dialogFilter = null;
                        if (((org.telegram.ui.ActionBar.n2) gyVar).actionBar.u(null)) {
                            TLRPC.Dialog dialog2 = (TLRPC.Dialog) gyVar.getMessagesController().dialogs_dict.f(dialogId);
                            if (gyVar.U0 && dialog2 != null && gyVar.g4(dialog2) && !DialogObject.isFolderDialogId(dialogId)) {
                                org.telegram.ui.Cells.p2 p2Var2 = (org.telegram.ui.Cells.p2) o1Var.f5789a;
                                gyVar.T0 = p2Var2;
                                p2Var2.setBackgroundColor(gyVar.getThemedColor(org.telegram.ui.ActionBar.g6.f23053d6));
                                this.f37877f = false;
                                return f2.c0.l(3, 0);
                            }
                        } else {
                            int i10 = gyVar.N0;
                            try {
                                i10 = fyVar.d.h;
                            } catch (Exception unused) {
                            }
                            fw fwVar = gyVar.f38604v0;
                            if ((fwVar == null || fwVar.getVisibility() != 0 || SharedConfig.getChatSwipeAction(((org.telegram.ui.ActionBar.n2) gyVar).currentAccount) != 5) && gyVar.Y0 && (((dialogId != gyVar.getUserConfig().clientUserId && dialogId != 777000 && i10 != 7 && i10 != 8) || SharedConfig.getChatSwipeAction(((org.telegram.ui.ActionBar.n2) gyVar).currentAccount) != 2) && (!gyVar.getMessagesController().isPromoDialog(dialogId, false) || gyVar.getMessagesController().promoDialogType == MessagesController.PROMO_TYPE_PSA))) {
                                boolean z10 = gyVar.R2 == 0 && (ChatObject.isCommunity(((org.telegram.ui.ActionBar.n2) gyVar).currentAccount, dialogId) || SharedConfig.getChatSwipeAction(((org.telegram.ui.ActionBar.n2) gyVar).currentAccount) == 3 || SharedConfig.getChatSwipeAction(((org.telegram.ui.ActionBar.n2) gyVar).currentAccount) == 1 || SharedConfig.getChatSwipeAction(((org.telegram.ui.ActionBar.n2) gyVar).currentAccount) == 0 || SharedConfig.getChatSwipeAction(((org.telegram.ui.ActionBar.n2) gyVar).currentAccount) == 4) && !gyVar.B3.c();
                                if (SharedConfig.getChatSwipeAction(((org.telegram.ui.ActionBar.n2) gyVar).currentAccount) == 1) {
                                    int i11 = gyVar.f38498a0[0].f38232s;
                                    if (i11 == 7 || i11 == 8) {
                                        dialogFilter = gyVar.getMessagesController().selectedDialogFilter[gyVar.f38498a0[0].f38232s == 8 ? (char) 1 : (char) 0];
                                    }
                                    if (dialogFilter != null && (dialogFilter.flags & MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ) != 0 && (dialog = (TLRPC.Dialog) gyVar.getMessagesController().dialogs_dict.f(dialogId)) != null && !dialogFilter.alwaysShow(((org.telegram.ui.ActionBar.n2) gyVar).currentAccount, dialog) && (dialog.unread_count > 0 || dialog.unread_mark)) {
                                        z10 = false;
                                    }
                                }
                                this.f37877f = false;
                                this.f37876e = (z10 && !DialogObject.isFolderDialogId(p2Var.getDialogId())) || (SharedConfig.archiveHidden && DialogObject.isFolderDialogId(p2Var.getDialogId()));
                                p2Var.setSliding(true);
                                return f2.c0.l(0, 4);
                            }
                        }
                    }
                }
            }
        }
        return 0;
    }

    @Override
    public final float f(float f10) {
        return 3500.0f;
    }

    @Override
    public final float g() {
        return 0.45f;
    }

    @Override
    public final float h(float f10) {
        return Float.MAX_VALUE;
    }

    @Override
    public final boolean n(RecyclerView recyclerView, f2.o1 o1Var, f2.o1 o1Var2) {
        int i10;
        gy gyVar = this.h;
        ArrayList arrayList = gyVar.W0;
        View view = o1Var2.f5789a;
        if (view instanceof org.telegram.ui.Cells.p2) {
            long dialogId = ((org.telegram.ui.Cells.p2) view).getDialogId();
            TLRPC.Dialog dialog = (TLRPC.Dialog) gyVar.getMessagesController().dialogs_dict.f(dialogId);
            if (dialog != null && gyVar.g4(dialog) && !DialogObject.isFolderDialogId(dialogId)) {
                int iB = o1Var.b();
                int iB2 = o1Var2.b();
                fy fyVar = this.f37878g;
                if (fyVar.f38225a.getItemAnimator() == null) {
                    fyVar.f38225a.setItemAnimator(fyVar.f38234x);
                }
                ow owVar = fyVar.d;
                gy gyVar2 = owVar.N;
                int i11 = owVar.B;
                ArrayList arrayListR3 = gyVar2.R3(i11, owVar.h, owVar.f45857r, false);
                int iG = owVar.G(iB);
                int iG2 = owVar.G(iB2);
                TLRPC.Dialog dialog2 = (TLRPC.Dialog) arrayListR3.get(iG);
                TLRPC.Dialog dialog3 = (TLRPC.Dialog) arrayListR3.get(iG2);
                int i12 = owVar.h;
                if (i12 == 7 || i12 == 8) {
                    MessagesController.DialogFilter dialogFilter = MessagesController.getInstance(i11).selectedDialogFilter[owVar.h == 8 ? (char) 1 : (char) 0];
                    int i13 = dialogFilter.pinnedDialogs.get(dialog2.f22384id);
                    dialogFilter.pinnedDialogs.put(dialog2.f22384id, dialogFilter.pinnedDialogs.get(dialog3.f22384id));
                    dialogFilter.pinnedDialogs.put(dialog3.f22384id, i13);
                } else {
                    int i14 = dialog2.pinnedNum;
                    dialog2.pinnedNum = dialog3.pinnedNum;
                    dialog3.pinnedNum = i14;
                }
                Collections.swap(arrayListR3, iG, iG2);
                owVar.W(null);
                int i15 = gyVar.f38498a0[0].f38232s;
                if (i15 != 7) {
                    i10 = 8;
                    if (i15 != 8) {
                        gyVar.V0 = true;
                        return true;
                    }
                } else {
                    i10 = 8;
                }
                MessagesController.DialogFilter dialogFilter2 = gyVar.getMessagesController().selectedDialogFilter[gyVar.f38498a0[0].f38232s == i10 ? (char) 1 : (char) 0];
                if (arrayList.contains(dialogFilter2)) {
                    return true;
                }
                arrayList.add(dialogFilter2);
                return true;
            }
        }
        return false;
    }

    @Override
    public final void p(f2.o1 o1Var, int i10) {
        if (o1Var != null) {
            this.f37878g.f38225a.d1(false);
        }
        this.d = o1Var;
        if (o1Var != null) {
            View view = o1Var.f5789a;
            if (view instanceof org.telegram.ui.Cells.p2) {
                ((org.telegram.ui.Cells.p2) view).f24946w = false;
            }
        }
    }

    @Override
    public final void q(f2.o1 o1Var) {
        gy gyVar = this.h;
        if (o1Var == null) {
            gyVar.S0 = null;
            return;
        }
        org.telegram.ui.Cells.p2 p2Var = (org.telegram.ui.Cells.p2) o1Var.f5789a;
        long dialogId = p2Var.getDialogId();
        boolean zIsFolderDialogId = DialogObject.isFolderDialogId(dialogId);
        fy fyVar = this.f37878g;
        if (zIsFolderDialogId) {
            cy cyVar = fyVar.f38225a;
            int i10 = cy.f37191r3;
            cyVar.z1(false, p2Var);
            return;
        }
        TLRPC.Dialog dialog = (TLRPC.Dialog) gyVar.getMessagesController().dialogs_dict.f(dialogId);
        if (dialog == null) {
            return;
        }
        if (!gyVar.getMessagesController().isPromoDialog(dialogId, false) && gyVar.R2 == 0 && SharedConfig.getChatSwipeAction(((org.telegram.ui.ActionBar.n2) gyVar).currentAccount) == 1) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(Long.valueOf(dialogId));
            gyVar.I2 = (dialog.unread_count > 0 || dialog.unread_mark) ? 1 : 0;
            gyVar.r4(arrayList, 101, true, false, null);
            return;
        }
        if (ChatObject.isCommunity(gyVar.getMessagesController().getChat(Long.valueOf(-dialogId)))) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Long.valueOf(dialogId));
            gyVar.r4(arrayList2, 111, true, false, null);
            return;
        }
        gyVar.S0 = p2Var;
        h3.f0 f0Var = new h3.f0(this, dialog, fyVar.d.h(), o1Var.b(), 5);
        gyVar.A4(true, true);
        if (Utilities.random.nextInt(1000) != 1) {
            f0Var.run();
            return;
        }
        if (gyVar.R0 == null) {
            cy cyVar2 = fyVar.f38225a;
            org.telegram.ui.Components.lc0 lc0Var = new org.telegram.ui.Components.lc0();
            lc0Var.f30350a = new Paint(1);
            Paint paint = new Paint(1);
            lc0Var.f30351b = paint;
            lc0Var.f30353e = 0L;
            lc0Var.f30354f = new RectF();
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
            lc0Var.f30352c = cyVar2;
            gyVar.R0 = lc0Var;
        }
        org.telegram.ui.Components.lc0 lc0Var2 = gyVar.R0;
        lc0Var2.d = f0Var;
        lc0Var2.h = 0.0f;
        lc0Var2.f30355g = 0.0f;
        lc0Var2.f30353e = System.currentTimeMillis();
        lc0Var2.f30352c.invalidate();
    }
}
