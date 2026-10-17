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
public final class cy extends s4.v {
    public s4.b1 d;
    public boolean e;
    public boolean f36004f;
    public final dy f36005g;
    public final ey h;

    public cy(ey eyVar, dy dyVar) {
        this.h = eyVar;
        this.f36005g = dyVar;
    }

    @Override
    public final int b(int i10, int i11) {
        if (this.f36004f) {
            return 0;
        }
        return super.b(i10, i11);
    }

    @Override
    public final long d(RecyclerView recyclerView, int i10, float f7, float f10) {
        ey eyVar;
        org.telegram.ui.Cells.r2 r2Var;
        if (i10 == 4) {
            return 200L;
        }
        if (i10 == 8 && (r2Var = (eyVar = this.h).X0) != null) {
            AndroidUtilities.runOnUIThread(new fh(1, r2Var), this.f36005g.f36341x.e);
            eyVar.X0 = null;
        }
        return super.d(recyclerView, i10, f7, f10);
    }

    @Override
    public final int e(androidx.recyclerview.widget.RecyclerView r13, s4.b1 r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cy.e(androidx.recyclerview.widget.RecyclerView, s4.b1):int");
    }

    @Override
    public final float f(float f7) {
        return 3500.0f;
    }

    @Override
    public final float g() {
        return 0.45f;
    }

    @Override
    public final float h(float f7) {
        return Float.MAX_VALUE;
    }

    @Override
    public final boolean n(RecyclerView recyclerView, s4.b1 b1Var, s4.b1 b1Var2) {
        char c10;
        int i10;
        ey eyVar = this.h;
        ArrayList arrayList = eyVar.f36610a1;
        View view = b1Var2.f45938a;
        char c11 = 0;
        if (view instanceof org.telegram.ui.Cells.r2) {
            long dialogId = ((org.telegram.ui.Cells.r2) view).getDialogId();
            TLRPC.Dialog dialog = (TLRPC.Dialog) eyVar.getMessagesController().dialogs_dict.f(dialogId);
            if (dialog != null && eyVar.e4(dialog) && !DialogObject.isFolderDialogId(dialogId)) {
                int b10 = b1Var.b();
                int b11 = b1Var2.b();
                dy dyVar = this.f36005g;
                if (dyVar.f36333a.getItemAnimator() == null) {
                    dyVar.f36333a.setItemAnimator(dyVar.f36341x);
                }
                lw lwVar = dyVar.d;
                ey eyVar2 = lwVar.R;
                int i11 = lwVar.F;
                ArrayList P3 = eyVar2.P3(i11, lwVar.h, lwVar.f11973r, false);
                int G = lwVar.G(b10);
                int G2 = lwVar.G(b11);
                TLRPC.Dialog dialog2 = (TLRPC.Dialog) P3.get(G);
                TLRPC.Dialog dialog3 = (TLRPC.Dialog) P3.get(G2);
                int i12 = lwVar.h;
                if (i12 != 7 && i12 != 8) {
                    int i13 = dialog2.pinnedNum;
                    dialog2.pinnedNum = dialog3.pinnedNum;
                    dialog3.pinnedNum = i13;
                } else {
                    MessagesController.DialogFilter[] dialogFilterArr = MessagesController.getInstance(i11).selectedDialogFilter;
                    if (lwVar.h == 8) {
                        c10 = 1;
                    } else {
                        c10 = 0;
                    }
                    MessagesController.DialogFilter dialogFilter = dialogFilterArr[c10];
                    int i14 = dialogFilter.pinnedDialogs.get(dialog2.f20276id);
                    dialogFilter.pinnedDialogs.put(dialog2.f20276id, dialogFilter.pinnedDialogs.get(dialog3.f20276id));
                    dialogFilter.pinnedDialogs.put(dialog3.f20276id, i14);
                }
                Collections.swap(P3, G, G2);
                lwVar.W(null);
                int i15 = eyVar.f36630e0[0].f36339s;
                if (i15 != 7) {
                    i10 = 8;
                    if (i15 != 8) {
                        eyVar.Z0 = true;
                        return true;
                    }
                } else {
                    i10 = 8;
                }
                MessagesController.DialogFilter[] dialogFilterArr2 = eyVar.getMessagesController().selectedDialogFilter;
                if (eyVar.f36630e0[0].f36339s == i10) {
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
    public final void p(s4.b1 b1Var, int i10) {
        if (b1Var != null) {
            this.f36005g.f36333a.d1(false);
        }
        this.d = b1Var;
        if (b1Var != null) {
            View view = b1Var.f45938a;
            if (view instanceof org.telegram.ui.Cells.r2) {
                ((org.telegram.ui.Cells.r2) view).f22914w = false;
            }
        }
    }

    @Override
    public final void q(s4.b1 b1Var) {
        int i10;
        ey eyVar = this.h;
        if (b1Var != null) {
            org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) b1Var.f45938a;
            long dialogId = r2Var.getDialogId();
            boolean isFolderDialogId = DialogObject.isFolderDialogId(dialogId);
            int i11 = 0;
            dy dyVar = this.f36005g;
            if (isFolderDialogId) {
                zx zxVar = dyVar.f36333a;
                int i12 = zx.f43824t3;
                zxVar.A1(false, r2Var);
                return;
            }
            TLRPC.Dialog dialog = (TLRPC.Dialog) eyVar.getMessagesController().dialogs_dict.f(dialogId);
            if (dialog == null) {
                return;
            }
            if (!eyVar.getMessagesController().isPromoDialog(dialogId, false) && eyVar.W2 == 0) {
                i10 = ((org.telegram.ui.ActionBar.n2) eyVar).currentAccount;
                if (SharedConfig.getChatSwipeAction(i10) == 1) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Long.valueOf(dialogId));
                    if (dialog.unread_count > 0 || dialog.unread_mark) {
                        i11 = 1;
                    }
                    eyVar.N2 = i11;
                    eyVar.p4(arrayList, 101, true, false, null);
                    return;
                }
            }
            if (ChatObject.isCommunity(eyVar.getMessagesController().getChat(Long.valueOf(-dialogId)))) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(Long.valueOf(dialogId));
                eyVar.p4(arrayList2, 111, true, false, null);
                return;
            }
            eyVar.W0 = r2Var;
            i2.y yVar = new i2.y(this, dialog, dyVar.d.h(), b1Var.b(), 5);
            eyVar.y4(true, true);
            if (Utilities.random.nextInt(1000) == 1) {
                if (eyVar.V0 == null) {
                    zx zxVar2 = dyVar.f36333a;
                    ?? obj = new Object();
                    obj.f30960a = new Paint(1);
                    Paint paint = new Paint(1);
                    obj.f30961b = paint;
                    obj.e = 0L;
                    obj.f30963f = new RectF();
                    paint.setStyle(Paint.Style.STROKE);
                    paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
                    obj.f30962c = zxVar2;
                    eyVar.V0 = obj;
                }
                org.telegram.ui.Components.ud0 ud0Var = eyVar.V0;
                ud0Var.d = yVar;
                ud0Var.h = 0.0f;
                ud0Var.f30964g = 0.0f;
                ud0Var.e = System.currentTimeMillis();
                ud0Var.f30962c.invalidate();
                return;
            }
            yVar.run();
            return;
        }
        eyVar.W0 = null;
    }
}
