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
    public boolean f36448f;
    public final dy f36449g;
    public final ey h;

    public cy(ey eyVar, dy dyVar) {
        this.h = eyVar;
        this.f36449g = dyVar;
    }

    @Override
    public final int b(int i10, int i11) {
        if (this.f36448f) {
            return 0;
        }
        return super.b(i10, i11);
    }

    @Override
    public final long d(RecyclerView recyclerView, int i10, float f7, float f10) {
        ey eyVar;
        org.telegram.ui.Cells.q2 q2Var;
        if (i10 == 4) {
            return 200L;
        }
        if (i10 == 8 && (q2Var = (eyVar = this.h).X0) != null) {
            AndroidUtilities.runOnUIThread(new dh(1, q2Var), this.f36449g.f36758x.e);
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
        ArrayList arrayList = eyVar.f37039a1;
        View view = b1Var2.f46343a;
        char c11 = 0;
        if (view instanceof org.telegram.ui.Cells.q2) {
            long dialogId = ((org.telegram.ui.Cells.q2) view).getDialogId();
            TLRPC.Dialog dialog = (TLRPC.Dialog) eyVar.getMessagesController().dialogs_dict.f(dialogId);
            if (dialog != null && eyVar.e4(dialog) && !DialogObject.isFolderDialogId(dialogId)) {
                int b10 = b1Var.b();
                int b11 = b1Var2.b();
                dy dyVar = this.f36449g;
                if (dyVar.f36750a.getItemAnimator() == null) {
                    dyVar.f36750a.setItemAnimator(dyVar.f36758x);
                }
                lw lwVar = dyVar.d;
                ey eyVar2 = lwVar.R;
                int i11 = lwVar.F;
                ArrayList P3 = eyVar2.P3(i11, lwVar.h, lwVar.f12000r, false);
                int H = lwVar.H(b10);
                int H2 = lwVar.H(b11);
                TLRPC.Dialog dialog2 = (TLRPC.Dialog) P3.get(H);
                TLRPC.Dialog dialog3 = (TLRPC.Dialog) P3.get(H2);
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
                    int i14 = dialogFilter.pinnedDialogs.get(dialog2.f20347id);
                    dialogFilter.pinnedDialogs.put(dialog2.f20347id, dialogFilter.pinnedDialogs.get(dialog3.f20347id));
                    dialogFilter.pinnedDialogs.put(dialog3.f20347id, i14);
                }
                Collections.swap(P3, H, H2);
                lwVar.X(null);
                int i15 = eyVar.f37059e0[0].f36756s;
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
                if (eyVar.f37059e0[0].f36756s == i10) {
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
            this.f36449g.f36750a.e1(false);
        }
        this.d = b1Var;
        if (b1Var != null) {
            View view = b1Var.f46343a;
            if (view instanceof org.telegram.ui.Cells.q2) {
                ((org.telegram.ui.Cells.q2) view).f23028w = false;
            }
        }
    }

    @Override
    public final void q(s4.b1 b1Var) {
        int i10;
        ey eyVar = this.h;
        if (b1Var != null) {
            org.telegram.ui.Cells.q2 q2Var = (org.telegram.ui.Cells.q2) b1Var.f46343a;
            long dialogId = q2Var.getDialogId();
            boolean isFolderDialogId = DialogObject.isFolderDialogId(dialogId);
            int i11 = 0;
            dy dyVar = this.f36449g;
            if (isFolderDialogId) {
                zx zxVar = dyVar.f36750a;
                int i12 = zx.f44222w3;
                zxVar.F1(false, q2Var);
                return;
            }
            TLRPC.Dialog dialog = (TLRPC.Dialog) eyVar.getMessagesController().dialogs_dict.f(dialogId);
            if (dialog == null) {
                return;
            }
            if (!eyVar.getMessagesController().isPromoDialog(dialogId, false) && eyVar.W2 == 0) {
                i10 = ((org.telegram.ui.ActionBar.o2) eyVar).currentAccount;
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
            eyVar.W0 = q2Var;
            i2.z zVar = new i2.z(this, dialog, dyVar.d.h(), b1Var.b(), 5);
            eyVar.y4(true, true);
            if (Utilities.random.nextInt(1000) == 1) {
                if (eyVar.V0 == null) {
                    zx zxVar2 = dyVar.f36750a;
                    ?? obj = new Object();
                    obj.f32523a = new Paint(1);
                    Paint paint = new Paint(1);
                    obj.f32524b = paint;
                    obj.e = 0L;
                    obj.f32526f = new RectF();
                    paint.setStyle(Paint.Style.STROKE);
                    paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
                    obj.f32525c = zxVar2;
                    eyVar.V0 = obj;
                }
                org.telegram.ui.Components.xd0 xd0Var = eyVar.V0;
                xd0Var.d = zVar;
                xd0Var.h = 0.0f;
                xd0Var.f32527g = 0.0f;
                xd0Var.e = System.currentTimeMillis();
                xd0Var.f32525c.invalidate();
                return;
            }
            zVar.run();
            return;
        }
        eyVar.W0 = null;
    }
}
