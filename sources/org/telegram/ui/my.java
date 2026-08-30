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
public final class my extends f2.b0 {
    public f2.l1 d;
    public boolean e;
    public boolean f36410f;
    public final ny f36411g;
    public final oy h;

    public my(oy oyVar, ny nyVar) {
        this.h = oyVar;
        this.f36411g = nyVar;
    }

    @Override
    public final int b(int i10, int i11) {
        if (this.f36410f) {
            return 0;
        }
        return super.b(i10, i11);
    }

    @Override
    public final long d(RecyclerView recyclerView, int i10, float f10, float f11) {
        oy oyVar;
        org.telegram.ui.Cells.r2 r2Var;
        if (i10 == 4) {
            return 200L;
        }
        if (i10 == 8 && (r2Var = (oyVar = this.h).U0) != null) {
            AndroidUtilities.runOnUIThread(new bh(1, r2Var), this.f36411g.f36749x.e);
            oyVar.U0 = null;
        }
        return super.d(recyclerView, i10, f10, f11);
    }

    @Override
    public final int e(androidx.recyclerview.widget.RecyclerView r13, f2.l1 r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.my.e(androidx.recyclerview.widget.RecyclerView, f2.l1):int");
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
        oy oyVar = this.h;
        ArrayList arrayList = oyVar.X0;
        View view = l1Var2.f5785a;
        char c10 = 0;
        if (view instanceof org.telegram.ui.Cells.r2) {
            long dialogId = ((org.telegram.ui.Cells.r2) view).getDialogId();
            TLRPC.Dialog dialog = (TLRPC.Dialog) oyVar.getMessagesController().dialogs_dict.f(dialogId);
            if (dialog != null && oyVar.g4(dialog) && !DialogObject.isFolderDialogId(dialogId)) {
                int b10 = l1Var.b();
                int b11 = l1Var2.b();
                ny nyVar = this.f36411g;
                if (nyVar.f36741a.getItemAnimator() == null) {
                    nyVar.f36741a.setItemAnimator(nyVar.f36749x);
                }
                ww wwVar = nyVar.d;
                oy oyVar2 = wwVar.O;
                int i11 = wwVar.C;
                ArrayList R3 = oyVar2.R3(i11, wwVar.h, wwVar.f44763r, false);
                int G = wwVar.G(b10);
                int G2 = wwVar.G(b11);
                TLRPC.Dialog dialog2 = (TLRPC.Dialog) R3.get(G);
                TLRPC.Dialog dialog3 = (TLRPC.Dialog) R3.get(G2);
                int i12 = wwVar.h;
                if (i12 != 7 && i12 != 8) {
                    int i13 = dialog2.pinnedNum;
                    dialog2.pinnedNum = dialog3.pinnedNum;
                    dialog3.pinnedNum = i13;
                } else {
                    MessagesController.DialogFilter[] dialogFilterArr = MessagesController.getInstance(i11).selectedDialogFilter;
                    if (wwVar.h == 8) {
                        c3 = 1;
                    } else {
                        c3 = 0;
                    }
                    MessagesController.DialogFilter dialogFilter = dialogFilterArr[c3];
                    int i14 = dialogFilter.pinnedDialogs.get(dialog2.f19188id);
                    dialogFilter.pinnedDialogs.put(dialog2.f19188id, dialogFilter.pinnedDialogs.get(dialog3.f19188id));
                    dialogFilter.pinnedDialogs.put(dialog3.f19188id, i14);
                }
                Collections.swap(R3, G, G2);
                wwVar.W(null);
                int i15 = oyVar.f37009b0[0].f36747s;
                if (i15 != 7) {
                    i10 = 8;
                    if (i15 != 8) {
                        oyVar.W0 = true;
                        return true;
                    }
                } else {
                    i10 = 8;
                }
                MessagesController.DialogFilter[] dialogFilterArr2 = oyVar.getMessagesController().selectedDialogFilter;
                if (oyVar.f37009b0[0].f36747s == i10) {
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
            this.f36411g.f36741a.d1(false);
        }
        this.d = l1Var;
        if (l1Var != null) {
            View view = l1Var.f5785a;
            if (view instanceof org.telegram.ui.Cells.r2) {
                ((org.telegram.ui.Cells.r2) view).f21730w = false;
            }
        }
    }

    @Override
    public final void q(f2.l1 l1Var) {
        int i10;
        oy oyVar = this.h;
        if (l1Var != null) {
            org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) l1Var.f5785a;
            long dialogId = r2Var.getDialogId();
            boolean isFolderDialogId = DialogObject.isFolderDialogId(dialogId);
            int i11 = 0;
            ny nyVar = this.f36411g;
            if (isFolderDialogId) {
                ky kyVar = nyVar.f36741a;
                int i12 = ky.f35832s3;
                kyVar.z1(false, r2Var);
                return;
            }
            TLRPC.Dialog dialog = (TLRPC.Dialog) oyVar.getMessagesController().dialogs_dict.f(dialogId);
            if (dialog == null) {
                return;
            }
            if (!oyVar.getMessagesController().isPromoDialog(dialogId, false) && oyVar.S2 == 0) {
                i10 = ((org.telegram.ui.ActionBar.p2) oyVar).currentAccount;
                if (SharedConfig.getChatSwipeAction(i10) == 1) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Long.valueOf(dialogId));
                    oyVar.J2 = (dialog.unread_count > 0 || dialog.unread_mark) ? 1 : 1;
                    oyVar.r4(arrayList, 101, true, false, null);
                    return;
                }
            }
            if (ChatObject.isCommunity(oyVar.getMessagesController().getChat(Long.valueOf(-dialogId)))) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(Long.valueOf(dialogId));
                oyVar.r4(arrayList2, 111, true, false, null);
                return;
            }
            oyVar.T0 = r2Var;
            j3.b0 b0Var = new j3.b0(this, dialog, nyVar.d.h(), l1Var.b(), 5);
            oyVar.A4(true, true);
            if (Utilities.random.nextInt(1000) == 1) {
                if (oyVar.S0 == null) {
                    ky kyVar2 = nyVar.f36741a;
                    ?? obj = new Object();
                    obj.f23965a = new Paint(1);
                    Paint paint = new Paint(1);
                    obj.f23966b = paint;
                    obj.e = 0L;
                    obj.f23968f = new RectF();
                    paint.setStyle(Paint.Style.STROKE);
                    paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
                    obj.f23967c = kyVar2;
                    oyVar.S0 = obj;
                }
                org.telegram.ui.Components.cd0 cd0Var = oyVar.S0;
                cd0Var.d = b0Var;
                cd0Var.h = 0.0f;
                cd0Var.f23969g = 0.0f;
                cd0Var.e = System.currentTimeMillis();
                cd0Var.f23967c.invalidate();
                return;
            }
            b0Var.run();
            return;
        }
        oyVar.T0 = null;
    }
}
