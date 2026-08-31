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
public final class ny extends f2.b0 {
    public f2.m1 d;
    public boolean f39542e;
    public boolean f39543f;
    public final oy f39544g;
    public final py h;

    public ny(py pyVar, oy oyVar) {
        this.h = pyVar;
        this.f39544g = oyVar;
    }

    @Override
    public final int b(int i10, int i11) {
        if (this.f39543f) {
            return 0;
        }
        return super.b(i10, i11);
    }

    @Override
    public final long d(RecyclerView recyclerView, int i10, float f10, float f11) {
        py pyVar;
        org.telegram.ui.Cells.r2 r2Var;
        if (i10 == 4) {
            return 200L;
        }
        if (i10 == 8 && (r2Var = (pyVar = this.h).U0) != null) {
            AndroidUtilities.runOnUIThread(new bh(1, r2Var), this.f39544g.f39875x.f5931e);
            pyVar.U0 = null;
        }
        return super.d(recyclerView, i10, f10, f11);
    }

    @Override
    public final int e(androidx.recyclerview.widget.RecyclerView r13, f2.m1 r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ny.e(androidx.recyclerview.widget.RecyclerView, f2.m1):int");
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
    public final boolean n(RecyclerView recyclerView, f2.m1 m1Var, f2.m1 m1Var2) {
        char c3;
        int i10;
        py pyVar = this.h;
        ArrayList arrayList = pyVar.X0;
        View view = m1Var2.f5875a;
        char c10 = 0;
        if (view instanceof org.telegram.ui.Cells.r2) {
            long dialogId = ((org.telegram.ui.Cells.r2) view).getDialogId();
            TLRPC.Dialog dialog = (TLRPC.Dialog) pyVar.getMessagesController().dialogs_dict.f(dialogId);
            if (dialog != null && pyVar.g4(dialog) && !DialogObject.isFolderDialogId(dialogId)) {
                int b10 = m1Var.b();
                int b11 = m1Var2.b();
                oy oyVar = this.f39544g;
                if (oyVar.f39866a.getItemAnimator() == null) {
                    oyVar.f39866a.setItemAnimator(oyVar.f39875x);
                }
                xw xwVar = oyVar.d;
                py pyVar2 = xwVar.O;
                int i11 = xwVar.C;
                ArrayList R3 = pyVar2.R3(i11, xwVar.h, xwVar.f48612r, false);
                int G = xwVar.G(b10);
                int G2 = xwVar.G(b11);
                TLRPC.Dialog dialog2 = (TLRPC.Dialog) R3.get(G);
                TLRPC.Dialog dialog3 = (TLRPC.Dialog) R3.get(G2);
                int i12 = xwVar.h;
                if (i12 != 7 && i12 != 8) {
                    int i13 = dialog2.pinnedNum;
                    dialog2.pinnedNum = dialog3.pinnedNum;
                    dialog3.pinnedNum = i13;
                } else {
                    MessagesController.DialogFilter[] dialogFilterArr = MessagesController.getInstance(i11).selectedDialogFilter;
                    if (xwVar.h == 8) {
                        c3 = 1;
                    } else {
                        c3 = 0;
                    }
                    MessagesController.DialogFilter dialogFilter = dialogFilterArr[c3];
                    int i14 = dialogFilter.pinnedDialogs.get(dialog2.f20847id);
                    dialogFilter.pinnedDialogs.put(dialog2.f20847id, dialogFilter.pinnedDialogs.get(dialog3.f20847id));
                    dialogFilter.pinnedDialogs.put(dialog3.f20847id, i14);
                }
                Collections.swap(R3, G, G2);
                xwVar.W(null);
                int i15 = pyVar.f40185b0[0].f39873s;
                if (i15 != 7) {
                    i10 = 8;
                    if (i15 != 8) {
                        pyVar.W0 = true;
                        return true;
                    }
                } else {
                    i10 = 8;
                }
                MessagesController.DialogFilter[] dialogFilterArr2 = pyVar.getMessagesController().selectedDialogFilter;
                if (pyVar.f40185b0[0].f39873s == i10) {
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
    public final void p(f2.m1 m1Var, int i10) {
        if (m1Var != null) {
            this.f39544g.f39866a.d1(false);
        }
        this.d = m1Var;
        if (m1Var != null) {
            View view = m1Var.f5875a;
            if (view instanceof org.telegram.ui.Cells.r2) {
                ((org.telegram.ui.Cells.r2) view).f23521w = false;
            }
        }
    }

    @Override
    public final void q(f2.m1 m1Var) {
        int i10;
        py pyVar = this.h;
        if (m1Var != null) {
            org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) m1Var.f5875a;
            long dialogId = r2Var.getDialogId();
            boolean isFolderDialogId = DialogObject.isFolderDialogId(dialogId);
            int i11 = 0;
            oy oyVar = this.f39544g;
            if (isFolderDialogId) {
                ly lyVar = oyVar.f39866a;
                int i12 = ly.f38903s3;
                lyVar.z1(false, r2Var);
                return;
            }
            TLRPC.Dialog dialog = (TLRPC.Dialog) pyVar.getMessagesController().dialogs_dict.f(dialogId);
            if (dialog == null) {
                return;
            }
            if (!pyVar.getMessagesController().isPromoDialog(dialogId, false) && pyVar.S2 == 0) {
                i10 = ((org.telegram.ui.ActionBar.p2) pyVar).currentAccount;
                if (SharedConfig.getChatSwipeAction(i10) == 1) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Long.valueOf(dialogId));
                    pyVar.J2 = (dialog.unread_count > 0 || dialog.unread_mark) ? 1 : 1;
                    pyVar.r4(arrayList, 101, true, false, null);
                    return;
                }
            }
            if (ChatObject.isCommunity(pyVar.getMessagesController().getChat(Long.valueOf(-dialogId)))) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(Long.valueOf(dialogId));
                pyVar.r4(arrayList2, 111, true, false, null);
                return;
            }
            pyVar.T0 = r2Var;
            j3.b0 b0Var = new j3.b0(this, dialog, oyVar.d.h(), m1Var.b(), 5);
            pyVar.A4(true, true);
            if (Utilities.random.nextInt(1000) == 1) {
                if (pyVar.S0 == null) {
                    ly lyVar2 = oyVar.f39866a;
                    ?? obj = new Object();
                    obj.f26508a = new Paint(1);
                    Paint paint = new Paint(1);
                    obj.f26509b = paint;
                    obj.f26511e = 0L;
                    obj.f26512f = new RectF();
                    paint.setStyle(Paint.Style.STROKE);
                    paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
                    obj.f26510c = lyVar2;
                    pyVar.S0 = obj;
                }
                org.telegram.ui.Components.ed0 ed0Var = pyVar.S0;
                ed0Var.d = b0Var;
                ed0Var.h = 0.0f;
                ed0Var.f26513g = 0.0f;
                ed0Var.f26511e = System.currentTimeMillis();
                ed0Var.f26510c.invalidate();
                return;
            }
            b0Var.run();
            return;
        }
        pyVar.T0 = null;
    }
}
