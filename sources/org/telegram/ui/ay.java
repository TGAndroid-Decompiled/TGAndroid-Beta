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
public final class ay extends f2.d0 {
    public f2.q1 d;
    public boolean f36574e;
    public boolean f36575f;
    public final cy f36576g;
    public final dy h;

    public ay(dy dyVar, cy cyVar) {
        this.h = dyVar;
        this.f36576g = cyVar;
    }

    @Override
    public final int b(int i9, int i10) {
        if (this.f36575f) {
            return 0;
        }
        return super.b(i9, i10);
    }

    @Override
    public final long d(RecyclerView recyclerView, int i9, float f10, float f11) {
        dy dyVar;
        org.telegram.ui.Cells.r2 r2Var;
        if (i9 == 4) {
            return 200L;
        }
        if (i9 == 8 && (r2Var = (dyVar = this.h).T0) != null) {
            AndroidUtilities.runOnUIThread(new xg(1, r2Var), this.f36576g.f37359x.f5549e);
            dyVar.T0 = null;
        }
        return super.d(recyclerView, i9, f10, f11);
    }

    @Override
    public final int e(androidx.recyclerview.widget.RecyclerView r13, f2.q1 r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ay.e(androidx.recyclerview.widget.RecyclerView, f2.q1):int");
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
    public final boolean n(RecyclerView recyclerView, f2.q1 q1Var, f2.q1 q1Var2) {
        char c10;
        int i9;
        dy dyVar = this.h;
        ArrayList arrayList = dyVar.W0;
        View view = q1Var2.f5501a;
        char c11 = 0;
        if (view instanceof org.telegram.ui.Cells.r2) {
            long dialogId = ((org.telegram.ui.Cells.r2) view).getDialogId();
            TLRPC.Dialog dialog = (TLRPC.Dialog) dyVar.getMessagesController().dialogs_dict.f(dialogId);
            if (dialog != null && dyVar.g4(dialog) && !DialogObject.isFolderDialogId(dialogId)) {
                int b10 = q1Var.b();
                int b11 = q1Var2.b();
                cy cyVar = this.f36576g;
                if (cyVar.f37350a.getItemAnimator() == null) {
                    cyVar.f37350a.setItemAnimator(cyVar.f37359x);
                }
                lw lwVar = cyVar.d;
                dy dyVar2 = lwVar.N;
                int i10 = lwVar.B;
                ArrayList R3 = dyVar2.R3(i10, lwVar.h, lwVar.f19413r, false);
                int G = lwVar.G(b10);
                int G2 = lwVar.G(b11);
                TLRPC.Dialog dialog2 = (TLRPC.Dialog) R3.get(G);
                TLRPC.Dialog dialog3 = (TLRPC.Dialog) R3.get(G2);
                int i11 = lwVar.h;
                if (i11 != 7 && i11 != 8) {
                    int i12 = dialog2.pinnedNum;
                    dialog2.pinnedNum = dialog3.pinnedNum;
                    dialog3.pinnedNum = i12;
                } else {
                    MessagesController.DialogFilter[] dialogFilterArr = MessagesController.getInstance(i10).selectedDialogFilter;
                    if (lwVar.h == 8) {
                        c10 = 1;
                    } else {
                        c10 = 0;
                    }
                    MessagesController.DialogFilter dialogFilter = dialogFilterArr[c10];
                    int i13 = dialogFilter.pinnedDialogs.get(dialog2.f22384id);
                    dialogFilter.pinnedDialogs.put(dialog2.f22384id, dialogFilter.pinnedDialogs.get(dialog3.f22384id));
                    dialogFilter.pinnedDialogs.put(dialog3.f22384id, i13);
                }
                Collections.swap(R3, G, G2);
                lwVar.W(null);
                int i14 = dyVar.f37629a0[0].f37357s;
                if (i14 != 7) {
                    i9 = 8;
                    if (i14 != 8) {
                        dyVar.V0 = true;
                        return true;
                    }
                } else {
                    i9 = 8;
                }
                MessagesController.DialogFilter[] dialogFilterArr2 = dyVar.getMessagesController().selectedDialogFilter;
                if (dyVar.f37629a0[0].f37357s == i9) {
                    c11 = 1;
                }
                MessagesController.DialogFilter dialogFilter2 = dialogFilterArr2[c11];
                if (!arrayList.contains(dialogFilter2)) {
                    arrayList.add(dialogFilter2);
                    return true;
                }
                return true;
            }
        }
        return false;
    }

    @Override
    public final void p(f2.q1 q1Var, int i9) {
        if (q1Var != null) {
            this.f36576g.f37350a.d1(false);
        }
        this.d = q1Var;
        if (q1Var != null) {
            View view = q1Var.f5501a;
            if (view instanceof org.telegram.ui.Cells.r2) {
                ((org.telegram.ui.Cells.r2) view).f25063w = false;
            }
        }
    }

    @Override
    public final void q(f2.q1 q1Var) {
        int i9;
        dy dyVar = this.h;
        if (q1Var != null) {
            org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) q1Var.f5501a;
            long dialogId = r2Var.getDialogId();
            boolean isFolderDialogId = DialogObject.isFolderDialogId(dialogId);
            int i10 = 0;
            cy cyVar = this.f36576g;
            if (isFolderDialogId) {
                yx yxVar = cyVar.f37350a;
                int i11 = yx.f44960r3;
                yxVar.z1(false, r2Var);
                return;
            }
            TLRPC.Dialog dialog = (TLRPC.Dialog) dyVar.getMessagesController().dialogs_dict.f(dialogId);
            if (dialog == null) {
                return;
            }
            if (!dyVar.getMessagesController().isPromoDialog(dialogId, false) && dyVar.R2 == 0) {
                i9 = ((org.telegram.ui.ActionBar.o2) dyVar).currentAccount;
                if (SharedConfig.getChatSwipeAction(i9) == 1) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Long.valueOf(dialogId));
                    dyVar.I2 = (dialog.unread_count > 0 || dialog.unread_mark) ? 1 : 1;
                    dyVar.r4(arrayList, 101, true, false, null);
                    return;
                }
            }
            if (ChatObject.isCommunity(dyVar.getMessagesController().getChat(Long.valueOf(-dialogId)))) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(Long.valueOf(dialogId));
                dyVar.r4(arrayList2, 111, true, false, null);
                return;
            }
            dyVar.S0 = r2Var;
            h3.e0 e0Var = new h3.e0(this, dialog, cyVar.d.h(), q1Var.b(), 5);
            dyVar.A4(true, true);
            if (Utilities.random.nextInt(1000) == 1) {
                if (dyVar.R0 == null) {
                    yx yxVar2 = cyVar.f37350a;
                    ?? obj = new Object();
                    obj.f29034a = new Paint(1);
                    Paint paint = new Paint(1);
                    obj.f29035b = paint;
                    obj.f29037e = 0L;
                    obj.f29038f = new RectF();
                    paint.setStyle(Paint.Style.STROKE);
                    paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
                    obj.f29036c = yxVar2;
                    dyVar.R0 = obj;
                }
                org.telegram.ui.Components.hc0 hc0Var = dyVar.R0;
                hc0Var.d = e0Var;
                hc0Var.h = 0.0f;
                hc0Var.f29039g = 0.0f;
                hc0Var.f29037e = System.currentTimeMillis();
                hc0Var.f29036c.invalidate();
                return;
            }
            e0Var.run();
            return;
        }
        dyVar.S0 = null;
    }
}
