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
public final class oy extends f2.b0 {
    public f2.l1 d;
    public boolean e;
    public boolean f36900f;
    public final py f36901g;
    public final qy h;

    public oy(qy qyVar, py pyVar) {
        this.h = qyVar;
        this.f36901g = pyVar;
    }

    @Override
    public final int b(int i10, int i11) {
        if (this.f36900f) {
            return 0;
        }
        return super.b(i10, i11);
    }

    @Override
    public final long d(RecyclerView recyclerView, int i10, float f10, float f11) {
        qy qyVar;
        org.telegram.ui.Cells.q2 q2Var;
        if (i10 == 4) {
            return 200L;
        }
        if (i10 == 8 && (q2Var = (qyVar = this.h).U0) != null) {
            AndroidUtilities.runOnUIThread(new dh(1, q2Var), this.f36901g.f37254x.e);
            qyVar.U0 = null;
        }
        return super.d(recyclerView, i10, f10, f11);
    }

    @Override
    public final int e(androidx.recyclerview.widget.RecyclerView r13, f2.l1 r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.oy.e(androidx.recyclerview.widget.RecyclerView, f2.l1):int");
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
    public final boolean n(RecyclerView recyclerView, f2.l1 l1Var, f2.l1 l1Var2) {
        char c3;
        int i10;
        qy qyVar = this.h;
        ArrayList arrayList = qyVar.X0;
        View view = l1Var2.f5774a;
        char c10 = 0;
        if (view instanceof org.telegram.ui.Cells.q2) {
            long dialogId = ((org.telegram.ui.Cells.q2) view).getDialogId();
            TLRPC.Dialog dialog = (TLRPC.Dialog) qyVar.getMessagesController().dialogs_dict.f(dialogId);
            if (dialog != null && qyVar.g4(dialog) && !DialogObject.isFolderDialogId(dialogId)) {
                int b10 = l1Var.b();
                int b11 = l1Var2.b();
                py pyVar = this.f36901g;
                if (pyVar.f37246a.getItemAnimator() == null) {
                    pyVar.f37246a.setItemAnimator(pyVar.f37254x);
                }
                yw ywVar = pyVar.d;
                qy qyVar2 = ywVar.O;
                int i11 = ywVar.C;
                ArrayList R3 = qyVar2.R3(i11, ywVar.h, ywVar.f44838r, false);
                int G = ywVar.G(b10);
                int G2 = ywVar.G(b11);
                TLRPC.Dialog dialog2 = (TLRPC.Dialog) R3.get(G);
                TLRPC.Dialog dialog3 = (TLRPC.Dialog) R3.get(G2);
                int i12 = ywVar.h;
                if (i12 != 7 && i12 != 8) {
                    int i13 = dialog2.pinnedNum;
                    dialog2.pinnedNum = dialog3.pinnedNum;
                    dialog3.pinnedNum = i13;
                } else {
                    MessagesController.DialogFilter[] dialogFilterArr = MessagesController.getInstance(i11).selectedDialogFilter;
                    if (ywVar.h == 8) {
                        c3 = 1;
                    } else {
                        c3 = 0;
                    }
                    MessagesController.DialogFilter dialogFilter = dialogFilterArr[c3];
                    int i14 = dialogFilter.pinnedDialogs.get(dialog2.f19163id);
                    dialogFilter.pinnedDialogs.put(dialog2.f19163id, dialogFilter.pinnedDialogs.get(dialog3.f19163id));
                    dialogFilter.pinnedDialogs.put(dialog3.f19163id, i14);
                }
                Collections.swap(R3, G, G2);
                ywVar.W(null);
                int i15 = qyVar.f37527b0[0].f37252s;
                if (i15 != 7) {
                    i10 = 8;
                    if (i15 != 8) {
                        qyVar.W0 = true;
                        return true;
                    }
                } else {
                    i10 = 8;
                }
                MessagesController.DialogFilter[] dialogFilterArr2 = qyVar.getMessagesController().selectedDialogFilter;
                if (qyVar.f37527b0[0].f37252s == i10) {
                    c10 = 1;
                }
                MessagesController.DialogFilter dialogFilter2 = dialogFilterArr2[c10];
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
    public final void p(f2.l1 l1Var, int i10) {
        if (l1Var != null) {
            this.f36901g.f37246a.c1(false);
        }
        this.d = l1Var;
        if (l1Var != null) {
            View view = l1Var.f5774a;
            if (view instanceof org.telegram.ui.Cells.q2) {
                ((org.telegram.ui.Cells.q2) view).f21663w = false;
            }
        }
    }

    @Override
    public final void q(f2.l1 l1Var) {
        int i10;
        qy qyVar = this.h;
        if (l1Var != null) {
            org.telegram.ui.Cells.q2 q2Var = (org.telegram.ui.Cells.q2) l1Var.f5774a;
            long dialogId = q2Var.getDialogId();
            boolean isFolderDialogId = DialogObject.isFolderDialogId(dialogId);
            int i11 = 0;
            py pyVar = this.f36901g;
            if (isFolderDialogId) {
                my myVar = pyVar.f37246a;
                int i12 = my.f36270s3;
                myVar.y1(false, q2Var);
                return;
            }
            TLRPC.Dialog dialog = (TLRPC.Dialog) qyVar.getMessagesController().dialogs_dict.f(dialogId);
            if (dialog == null) {
                return;
            }
            if (!qyVar.getMessagesController().isPromoDialog(dialogId, false) && qyVar.S2 == 0) {
                i10 = ((org.telegram.ui.ActionBar.p2) qyVar).currentAccount;
                if (SharedConfig.getChatSwipeAction(i10) == 1) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Long.valueOf(dialogId));
                    qyVar.J2 = (dialog.unread_count > 0 || dialog.unread_mark) ? 1 : 1;
                    qyVar.r4(arrayList, 101, true, false, null);
                    return;
                }
            }
            if (ChatObject.isCommunity(qyVar.getMessagesController().getChat(Long.valueOf(-dialogId)))) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(Long.valueOf(dialogId));
                qyVar.r4(arrayList2, 111, true, false, null);
                return;
            }
            qyVar.T0 = q2Var;
            j3.b0 b0Var = new j3.b0(this, dialog, pyVar.d.h(), l1Var.b(), 5);
            qyVar.A4(true, true);
            if (Utilities.random.nextInt(1000) == 1) {
                if (qyVar.S0 == null) {
                    my myVar2 = pyVar.f37246a;
                    ?? obj = new Object();
                    obj.f24248a = new Paint(1);
                    Paint paint = new Paint(1);
                    obj.f24249b = paint;
                    obj.e = 0L;
                    obj.f24251f = new RectF();
                    paint.setStyle(Paint.Style.STROKE);
                    paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
                    obj.f24250c = myVar2;
                    qyVar.S0 = obj;
                }
                org.telegram.ui.Components.dd0 dd0Var = qyVar.S0;
                dd0Var.d = b0Var;
                dd0Var.h = 0.0f;
                dd0Var.f24252g = 0.0f;
                dd0Var.e = System.currentTimeMillis();
                dd0Var.f24250c.invalidate();
                return;
            }
            b0Var.run();
            return;
        }
        qyVar.T0 = null;
    }
}
