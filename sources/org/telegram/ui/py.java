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
public final class py extends s4.v {
    public s4.c1 d;
    public boolean e;
    public boolean f36221f;
    public final qy f36222g;
    public final ry h;

    public py(ry ryVar, qy qyVar) {
        this.h = ryVar;
        this.f36222g = qyVar;
    }

    @Override
    public final int b(int i10, int i11) {
        if (this.f36221f) {
            return 0;
        }
        return super.b(i10, i11);
    }

    @Override
    public final long d(RecyclerView recyclerView, int i10, float f7, float f10) {
        ry ryVar;
        org.telegram.ui.Cells.r2 r2Var;
        if (i10 == 4) {
            return 200L;
        }
        if (i10 == 8 && (r2Var = (ryVar = this.h).X0) != null) {
            AndroidUtilities.runOnUIThread(new gh(1, r2Var), this.f36222g.f36637x.e);
            ryVar.X0 = null;
        }
        return super.d(recyclerView, i10, f7, f10);
    }

    @Override
    public final int e(androidx.recyclerview.widget.RecyclerView r13, s4.c1 r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.py.e(androidx.recyclerview.widget.RecyclerView, s4.c1):int");
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
        ry ryVar = this.h;
        ArrayList arrayList = ryVar.f36958a1;
        View view = c1Var2.f42627a;
        char c11 = 0;
        if (view instanceof org.telegram.ui.Cells.r2) {
            long dialogId = ((org.telegram.ui.Cells.r2) view).getDialogId();
            TLRPC.Dialog dialog = (TLRPC.Dialog) ryVar.getMessagesController().dialogs_dict.f(dialogId);
            if (dialog != null && ryVar.g4(dialog) && !DialogObject.isFolderDialogId(dialogId)) {
                int b10 = c1Var.b();
                int b11 = c1Var2.b();
                qy qyVar = this.f36222g;
                if (qyVar.f36629a.getItemAnimator() == null) {
                    qyVar.f36629a.setItemAnimator(qyVar.f36637x);
                }
                yw ywVar = qyVar.d;
                ry ryVar2 = ywVar.R;
                int i11 = ywVar.F;
                ArrayList R3 = ryVar2.R3(i11, ywVar.h, ywVar.f9839r, false);
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
                        c10 = 1;
                    } else {
                        c10 = 0;
                    }
                    MessagesController.DialogFilter dialogFilter = dialogFilterArr[c10];
                    int i14 = dialogFilter.pinnedDialogs.get(dialog2.f18087id);
                    dialogFilter.pinnedDialogs.put(dialog2.f18087id, dialogFilter.pinnedDialogs.get(dialog3.f18087id));
                    dialogFilter.pinnedDialogs.put(dialog3.f18087id, i14);
                }
                Collections.swap(R3, G, G2);
                ywVar.W(null);
                int i15 = ryVar.f36978e0[0].f36635s;
                if (i15 != 7) {
                    i10 = 8;
                    if (i15 != 8) {
                        ryVar.Z0 = true;
                        return true;
                    }
                } else {
                    i10 = 8;
                }
                MessagesController.DialogFilter[] dialogFilterArr2 = ryVar.getMessagesController().selectedDialogFilter;
                if (ryVar.f36978e0[0].f36635s == i10) {
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
            this.f36222g.f36629a.d1(false);
        }
        this.d = c1Var;
        if (c1Var != null) {
            View view = c1Var.f42627a;
            if (view instanceof org.telegram.ui.Cells.r2) {
                ((org.telegram.ui.Cells.r2) view).f20742w = false;
            }
        }
    }

    @Override
    public final void q(s4.c1 c1Var) {
        int i10;
        ry ryVar = this.h;
        if (c1Var != null) {
            org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) c1Var.f42627a;
            long dialogId = r2Var.getDialogId();
            boolean isFolderDialogId = DialogObject.isFolderDialogId(dialogId);
            int i11 = 0;
            qy qyVar = this.f36222g;
            if (isFolderDialogId) {
                ny nyVar = qyVar.f36629a;
                int i12 = ny.f35622v3;
                nyVar.z1(false, r2Var);
                return;
            }
            TLRPC.Dialog dialog = (TLRPC.Dialog) ryVar.getMessagesController().dialogs_dict.f(dialogId);
            if (dialog == null) {
                return;
            }
            if (!ryVar.getMessagesController().isPromoDialog(dialogId, false) && ryVar.V2 == 0) {
                i10 = ((org.telegram.ui.ActionBar.n2) ryVar).currentAccount;
                if (SharedConfig.getChatSwipeAction(i10) == 1) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Long.valueOf(dialogId));
                    ryVar.M2 = (dialog.unread_count > 0 || dialog.unread_mark) ? 1 : 1;
                    ryVar.r4(arrayList, 101, true, false, null);
                    return;
                }
            }
            if (ChatObject.isCommunity(ryVar.getMessagesController().getChat(Long.valueOf(-dialogId)))) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(Long.valueOf(dialogId));
                ryVar.r4(arrayList2, 111, true, false, null);
                return;
            }
            ryVar.W0 = r2Var;
            i2.a0 a0Var = new i2.a0(this, dialog, qyVar.d.h(), c1Var.b(), 5);
            ryVar.A4(true, true);
            if (Utilities.random.nextInt(1000) == 1) {
                if (ryVar.V0 == null) {
                    ny nyVar2 = qyVar.f36629a;
                    ?? obj = new Object();
                    obj.f22417a = new Paint(1);
                    Paint paint = new Paint(1);
                    obj.f22418b = paint;
                    obj.e = 0L;
                    obj.f22420f = new RectF();
                    paint.setStyle(Paint.Style.STROKE);
                    paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
                    obj.f22419c = nyVar2;
                    ryVar.V0 = obj;
                }
                org.telegram.ui.Components.ad0 ad0Var = ryVar.V0;
                ad0Var.d = a0Var;
                ad0Var.h = 0.0f;
                ad0Var.f22421g = 0.0f;
                ad0Var.e = System.currentTimeMillis();
                ad0Var.f22419c.invalidate();
                return;
            }
            a0Var.run();
            return;
        }
        ryVar.W0 = null;
    }
}
