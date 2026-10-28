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
public final class cy extends s4.w {
    public s4.e1 d;
    public boolean e;
    public boolean f38470f;
    public final dy f38471g;
    public final ey h;

    public cy(ey eyVar, dy dyVar) {
        this.h = eyVar;
        this.f38471g = dyVar;
    }

    @Override
    public final int b(int i10, int i11) {
        if (this.f38470f) {
            return 0;
        }
        return super.b(i10, i11);
    }

    @Override
    public final long d(RecyclerView recyclerView, int i10, float f7, float f10) {
        ey eyVar;
        org.telegram.ui.Cells.p2 p2Var;
        if (i10 == 4) {
            return 200L;
        }
        if (i10 == 8 && (p2Var = (eyVar = this.h).X0) != null) {
            AndroidUtilities.runOnUIThread(new hh(1, p2Var), this.f38471g.f38710x.e);
            eyVar.X0 = null;
        }
        return super.d(recyclerView, i10, f7, f10);
    }

    @Override
    public final int e(androidx.recyclerview.widget.RecyclerView r13, s4.e1 r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cy.e(androidx.recyclerview.widget.RecyclerView, s4.e1):int");
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
    public final boolean n(RecyclerView recyclerView, s4.e1 e1Var, s4.e1 e1Var2) {
        char c10;
        int i10;
        ey eyVar = this.h;
        ArrayList arrayList = eyVar.f38978a1;
        View view = e1Var2.f47773a;
        char c11 = 0;
        if (view instanceof org.telegram.ui.Cells.p2) {
            long dialogId = ((org.telegram.ui.Cells.p2) view).getDialogId();
            TLRPC.Dialog dialog = (TLRPC.Dialog) eyVar.getMessagesController().dialogs_dict.f(dialogId);
            if (dialog != null && eyVar.o4(dialog) && !DialogObject.isFolderDialogId(dialogId)) {
                int b10 = e1Var.b();
                int b11 = e1Var2.b();
                dy dyVar = this.f38471g;
                if (dyVar.f38702a.getItemAnimator() == null) {
                    dyVar.f38702a.setItemAnimator(dyVar.f38710x);
                }
                iw iwVar = dyVar.d;
                ey eyVar2 = iwVar.R;
                int i11 = iwVar.F;
                ArrayList Z3 = eyVar2.Z3(i11, iwVar.h, iwVar.f14172r, false);
                int H = iwVar.H(b10);
                int H2 = iwVar.H(b11);
                TLRPC.Dialog dialog2 = (TLRPC.Dialog) Z3.get(H);
                TLRPC.Dialog dialog3 = (TLRPC.Dialog) Z3.get(H2);
                int i12 = iwVar.h;
                if (i12 != 7 && i12 != 8) {
                    int i13 = dialog2.pinnedNum;
                    dialog2.pinnedNum = dialog3.pinnedNum;
                    dialog3.pinnedNum = i13;
                } else {
                    MessagesController.DialogFilter[] dialogFilterArr = MessagesController.getInstance(i11).selectedDialogFilter;
                    if (iwVar.h == 8) {
                        c10 = 1;
                    } else {
                        c10 = 0;
                    }
                    MessagesController.DialogFilter dialogFilter = dialogFilterArr[c10];
                    int i14 = dialogFilter.pinnedDialogs.get(dialog2.f22032id);
                    dialogFilter.pinnedDialogs.put(dialog2.f22032id, dialogFilter.pinnedDialogs.get(dialog3.f22032id));
                    dialogFilter.pinnedDialogs.put(dialog3.f22032id, i14);
                }
                Collections.swap(Z3, H, H2);
                iwVar.X(null);
                int i15 = eyVar.f38998e0[0].f38708s;
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
                if (eyVar.f38998e0[0].f38708s == i10) {
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
    public final void p(s4.e1 e1Var, int i10) {
        if (e1Var != null) {
            this.f38471g.f38702a.d1(false);
        }
        this.d = e1Var;
        if (e1Var != null) {
            View view = e1Var.f47773a;
            if (view instanceof org.telegram.ui.Cells.p2) {
                ((org.telegram.ui.Cells.p2) view).f24741w = false;
            }
        }
    }

    @Override
    public final void q(s4.e1 e1Var) {
        int i10;
        ey eyVar = this.h;
        if (e1Var != null) {
            org.telegram.ui.Cells.p2 p2Var = (org.telegram.ui.Cells.p2) e1Var.f47773a;
            long dialogId = p2Var.getDialogId();
            boolean isFolderDialogId = DialogObject.isFolderDialogId(dialogId);
            int i11 = 0;
            dy dyVar = this.f38471g;
            if (isFolderDialogId) {
                zx zxVar = dyVar.f38702a;
                int i12 = zx.C3;
                zxVar.F1(false, p2Var);
                return;
            }
            TLRPC.Dialog dialog = (TLRPC.Dialog) eyVar.getMessagesController().dialogs_dict.f(dialogId);
            if (dialog == null) {
                return;
            }
            if (!eyVar.getMessagesController().isPromoDialog(dialogId, false) && eyVar.W2 == 0) {
                i10 = ((org.telegram.ui.ActionBar.r2) eyVar).currentAccount;
                if (SharedConfig.getChatSwipeAction(i10) == 1) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Long.valueOf(dialogId));
                    if (dialog.unread_count > 0 || dialog.unread_mark) {
                        i11 = 1;
                    }
                    eyVar.N2 = i11;
                    eyVar.z4(arrayList, 101, true, false, null);
                    return;
                }
            }
            if (ChatObject.isCommunity(eyVar.getMessagesController().getChat(Long.valueOf(-dialogId)))) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(Long.valueOf(dialogId));
                eyVar.z4(arrayList2, 111, true, false, null);
                return;
            }
            eyVar.W0 = p2Var;
            i2.b0 b0Var = new i2.b0(this, dialog, dyVar.d.h(), e1Var.b(), 5);
            eyVar.I4(true, true);
            if (Utilities.random.nextInt(1000) == 1) {
                if (eyVar.V0 == null) {
                    zx zxVar2 = dyVar.f38702a;
                    ?? obj = new Object();
                    obj.f33366a = new Paint(1);
                    Paint paint = new Paint(1);
                    obj.f33367b = paint;
                    obj.e = 0L;
                    obj.f33369f = new RectF();
                    paint.setStyle(Paint.Style.STROKE);
                    paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
                    obj.f33368c = zxVar2;
                    eyVar.V0 = obj;
                }
                org.telegram.ui.Components.ud0 ud0Var = eyVar.V0;
                ud0Var.d = b0Var;
                ud0Var.h = 0.0f;
                ud0Var.f33370g = 0.0f;
                ud0Var.e = System.currentTimeMillis();
                ud0Var.f33368c.invalidate();
                return;
            }
            b0Var.run();
            return;
        }
        eyVar.W0 = null;
    }
}
