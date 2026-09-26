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
public final class oy extends s4.v {
    public s4.c1 d;
    public boolean e;
    public boolean f36360f;
    public final py f36361g;
    public final qy h;

    public oy(qy qyVar, py pyVar) {
        this.h = qyVar;
        this.f36361g = pyVar;
    }

    @Override
    public final int b(int i10, int i11) {
        if (this.f36360f) {
            return 0;
        }
        return super.b(i10, i11);
    }

    @Override
    public final long d(RecyclerView recyclerView, int i10, float f7, float f10) {
        qy qyVar;
        org.telegram.ui.Cells.s2 s2Var;
        if (i10 == 4) {
            return 200L;
        }
        if (i10 == 8 && (s2Var = (qyVar = this.h).X0) != null) {
            AndroidUtilities.runOnUIThread(new kh(1, s2Var), this.f36361g.f36701x.e);
            qyVar.X0 = null;
        }
        return super.d(recyclerView, i10, f7, f10);
    }

    @Override
    public final int e(androidx.recyclerview.widget.RecyclerView r13, s4.c1 r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.oy.e(androidx.recyclerview.widget.RecyclerView, s4.c1):int");
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
    public final boolean n(RecyclerView recyclerView, s4.c1 c1Var, s4.c1 c1Var2) {
        char c10;
        int i10;
        qy qyVar = this.h;
        ArrayList arrayList = qyVar.f37012a1;
        View view = c1Var2.f42959a;
        char c11 = 0;
        if (view instanceof org.telegram.ui.Cells.s2) {
            long dialogId = ((org.telegram.ui.Cells.s2) view).getDialogId();
            TLRPC.Dialog dialog = (TLRPC.Dialog) qyVar.getMessagesController().dialogs_dict.f(dialogId);
            if (dialog != null && qyVar.g4(dialog) && !DialogObject.isFolderDialogId(dialogId)) {
                int b10 = c1Var.b();
                int b11 = c1Var2.b();
                py pyVar = this.f36361g;
                if (pyVar.f36693a.getItemAnimator() == null) {
                    pyVar.f36693a.setItemAnimator(pyVar.f36701x);
                }
                xw xwVar = pyVar.d;
                qy qyVar2 = xwVar.R;
                int i11 = xwVar.F;
                ArrayList R3 = qyVar2.R3(i11, xwVar.h, xwVar.f9838r, false);
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
                        c10 = 1;
                    } else {
                        c10 = 0;
                    }
                    MessagesController.DialogFilter dialogFilter = dialogFilterArr[c10];
                    int i14 = dialogFilter.pinnedDialogs.get(dialog2.f18339id);
                    dialogFilter.pinnedDialogs.put(dialog2.f18339id, dialogFilter.pinnedDialogs.get(dialog3.f18339id));
                    dialogFilter.pinnedDialogs.put(dialog3.f18339id, i14);
                }
                Collections.swap(R3, G, G2);
                xwVar.W(null);
                int i15 = qyVar.f37032e0[0].f36699s;
                if (i15 != 7) {
                    i10 = 8;
                    if (i15 != 8) {
                        qyVar.Z0 = true;
                        return true;
                    }
                } else {
                    i10 = 8;
                }
                MessagesController.DialogFilter[] dialogFilterArr2 = qyVar.getMessagesController().selectedDialogFilter;
                if (qyVar.f37032e0[0].f36699s == i10) {
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
    public final void p(s4.c1 c1Var, int i10) {
        if (c1Var != null) {
            this.f36361g.f36693a.d1(false);
        }
        this.d = c1Var;
        if (c1Var != null) {
            View view = c1Var.f42959a;
            if (view instanceof org.telegram.ui.Cells.s2) {
                ((org.telegram.ui.Cells.s2) view).f21030w = false;
            }
        }
    }

    @Override
    public final void q(s4.c1 c1Var) {
        int i10;
        qy qyVar = this.h;
        if (c1Var != null) {
            org.telegram.ui.Cells.s2 s2Var = (org.telegram.ui.Cells.s2) c1Var.f42959a;
            long dialogId = s2Var.getDialogId();
            boolean isFolderDialogId = DialogObject.isFolderDialogId(dialogId);
            int i11 = 0;
            py pyVar = this.f36361g;
            if (isFolderDialogId) {
                my myVar = pyVar.f36693a;
                int i12 = my.f35684v3;
                myVar.z1(false, s2Var);
                return;
            }
            TLRPC.Dialog dialog = (TLRPC.Dialog) qyVar.getMessagesController().dialogs_dict.f(dialogId);
            if (dialog == null) {
                return;
            }
            if (!qyVar.getMessagesController().isPromoDialog(dialogId, false) && qyVar.V2 == 0) {
                i10 = ((org.telegram.ui.ActionBar.m2) qyVar).currentAccount;
                if (SharedConfig.getChatSwipeAction(i10) == 1) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Long.valueOf(dialogId));
                    qyVar.M2 = (dialog.unread_count > 0 || dialog.unread_mark) ? 1 : 1;
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
            qyVar.W0 = s2Var;
            i2.a0 a0Var = new i2.a0(this, dialog, pyVar.d.h(), c1Var.b(), 5);
            qyVar.A4(true, true);
            if (Utilities.random.nextInt(1000) == 1) {
                if (qyVar.V0 == null) {
                    my myVar2 = pyVar.f36693a;
                    ?? obj = new Object();
                    obj.f26380a = new Paint(1);
                    Paint paint = new Paint(1);
                    obj.f26381b = paint;
                    obj.e = 0L;
                    obj.f26383f = new RectF();
                    paint.setStyle(Paint.Style.STROKE);
                    paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
                    obj.f26382c = myVar2;
                    qyVar.V0 = obj;
                }
                org.telegram.ui.Components.md0 md0Var = qyVar.V0;
                md0Var.d = a0Var;
                md0Var.h = 0.0f;
                md0Var.f26384g = 0.0f;
                md0Var.e = System.currentTimeMillis();
                md0Var.f26382c.invalidate();
                return;
            }
            a0Var.run();
            return;
        }
        qyVar.W0 = null;
    }
}
