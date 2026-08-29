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
public final class dy extends f2.b0 {
    public f2.n1 d;
    public boolean f37649e;
    public boolean f37650f;
    public final ey f37651g;
    public final fy h;

    public dy(fy fyVar, ey eyVar) {
        this.h = fyVar;
        this.f37651g = eyVar;
    }

    @Override
    public final int b(int i10, int i11) {
        if (this.f37650f) {
            return 0;
        }
        return super.b(i10, i11);
    }

    @Override
    public final long d(RecyclerView recyclerView, int i10, float f9, float f10) {
        fy fyVar;
        org.telegram.ui.Cells.p2 p2Var;
        if (i10 == 4) {
            return 200L;
        }
        if (i10 == 8 && (p2Var = (fyVar = this.h).T0) != null) {
            AndroidUtilities.runOnUIThread(new wg(1, p2Var), this.f37651g.f37930x.f6487e);
            fyVar.T0 = null;
        }
        return super.d(recyclerView, i10, f9, f10);
    }

    @Override
    public final int e(androidx.recyclerview.widget.RecyclerView r13, f2.n1 r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.dy.e(androidx.recyclerview.widget.RecyclerView, f2.n1):int");
    }

    @Override
    public final float f(float f9) {
        return 3500.0f;
    }

    @Override
    public final float g() {
        return 0.45f;
    }

    @Override
    public final float h(float f9) {
        return Float.MAX_VALUE;
    }

    @Override
    public final boolean n(RecyclerView recyclerView, f2.n1 n1Var, f2.n1 n1Var2) {
        char c3;
        int i10;
        fy fyVar = this.h;
        ArrayList arrayList = fyVar.W0;
        View view = n1Var2.f6432a;
        char c6 = 0;
        if (view instanceof org.telegram.ui.Cells.p2) {
            long dialogId = ((org.telegram.ui.Cells.p2) view).getDialogId();
            TLRPC.Dialog dialog = (TLRPC.Dialog) fyVar.getMessagesController().dialogs_dict.f(dialogId);
            if (dialog != null && fyVar.g4(dialog) && !DialogObject.isFolderDialogId(dialogId)) {
                int b10 = n1Var.b();
                int b11 = n1Var2.b();
                ey eyVar = this.f37651g;
                if (eyVar.f37921a.getItemAnimator() == null) {
                    eyVar.f37921a.setItemAnimator(eyVar.f37930x);
                }
                nw nwVar = eyVar.d;
                fy fyVar2 = nwVar.N;
                int i11 = nwVar.B;
                ArrayList R3 = fyVar2.R3(i11, nwVar.h, nwVar.f47298r, false);
                int G = nwVar.G(b10);
                int G2 = nwVar.G(b11);
                TLRPC.Dialog dialog2 = (TLRPC.Dialog) R3.get(G);
                TLRPC.Dialog dialog3 = (TLRPC.Dialog) R3.get(G2);
                int i12 = nwVar.h;
                if (i12 != 7 && i12 != 8) {
                    int i13 = dialog2.pinnedNum;
                    dialog2.pinnedNum = dialog3.pinnedNum;
                    dialog3.pinnedNum = i13;
                } else {
                    MessagesController.DialogFilter[] dialogFilterArr = MessagesController.getInstance(i11).selectedDialogFilter;
                    if (nwVar.h == 8) {
                        c3 = 1;
                    } else {
                        c3 = 0;
                    }
                    MessagesController.DialogFilter dialogFilter = dialogFilterArr[c3];
                    int i14 = dialogFilter.pinnedDialogs.get(dialog2.f22396id);
                    dialogFilter.pinnedDialogs.put(dialog2.f22396id, dialogFilter.pinnedDialogs.get(dialog3.f22396id));
                    dialogFilter.pinnedDialogs.put(dialog3.f22396id, i14);
                }
                Collections.swap(R3, G, G2);
                nwVar.W(null);
                int i15 = fyVar.f38256a0[0].f37928s;
                if (i15 != 7) {
                    i10 = 8;
                    if (i15 != 8) {
                        fyVar.V0 = true;
                        return true;
                    }
                } else {
                    i10 = 8;
                }
                MessagesController.DialogFilter[] dialogFilterArr2 = fyVar.getMessagesController().selectedDialogFilter;
                if (fyVar.f38256a0[0].f37928s == i10) {
                    c6 = 1;
                }
                MessagesController.DialogFilter dialogFilter2 = dialogFilterArr2[c6];
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
    public final void p(f2.n1 n1Var, int i10) {
        if (n1Var != null) {
            this.f37651g.f37921a.d1(false);
        }
        this.d = n1Var;
        if (n1Var != null) {
            View view = n1Var.f6432a;
            if (view instanceof org.telegram.ui.Cells.p2) {
                ((org.telegram.ui.Cells.p2) view).f24938w = false;
            }
        }
    }

    @Override
    public final void q(f2.n1 n1Var) {
        int i10;
        fy fyVar = this.h;
        if (n1Var != null) {
            org.telegram.ui.Cells.p2 p2Var = (org.telegram.ui.Cells.p2) n1Var.f6432a;
            long dialogId = p2Var.getDialogId();
            boolean isFolderDialogId = DialogObject.isFolderDialogId(dialogId);
            int i11 = 0;
            ey eyVar = this.f37651g;
            if (isFolderDialogId) {
                ay ayVar = eyVar.f37921a;
                int i12 = ay.f36618r3;
                ayVar.z1(false, p2Var);
                return;
            }
            TLRPC.Dialog dialog = (TLRPC.Dialog) fyVar.getMessagesController().dialogs_dict.f(dialogId);
            if (dialog == null) {
                return;
            }
            if (!fyVar.getMessagesController().isPromoDialog(dialogId, false) && fyVar.R2 == 0) {
                i10 = ((org.telegram.ui.ActionBar.o2) fyVar).currentAccount;
                if (SharedConfig.getChatSwipeAction(i10) == 1) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Long.valueOf(dialogId));
                    fyVar.I2 = (dialog.unread_count > 0 || dialog.unread_mark) ? 1 : 1;
                    fyVar.r4(arrayList, 101, true, false, null);
                    return;
                }
            }
            if (ChatObject.isCommunity(fyVar.getMessagesController().getChat(Long.valueOf(-dialogId)))) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(Long.valueOf(dialogId));
                fyVar.r4(arrayList2, 111, true, false, null);
                return;
            }
            fyVar.S0 = p2Var;
            j3.f0 f0Var = new j3.f0(this, dialog, eyVar.d.h(), n1Var.b(), 5);
            fyVar.A4(true, true);
            if (Utilities.random.nextInt(1000) == 1) {
                if (fyVar.R0 == null) {
                    ay ayVar2 = eyVar.f37921a;
                    ?? obj = new Object();
                    obj.f34375a = new Paint(1);
                    Paint paint = new Paint(1);
                    obj.f34376b = paint;
                    obj.f34378e = 0L;
                    obj.f34379f = new RectF();
                    paint.setStyle(Paint.Style.STROKE);
                    paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
                    obj.f34377c = ayVar2;
                    fyVar.R0 = obj;
                }
                org.telegram.ui.Components.wc0 wc0Var = fyVar.R0;
                wc0Var.d = f0Var;
                wc0Var.h = 0.0f;
                wc0Var.f34380g = 0.0f;
                wc0Var.f34378e = System.currentTimeMillis();
                wc0Var.f34377c.invalidate();
                return;
            }
            f0Var.run();
            return;
        }
        fyVar.S0 = null;
    }
}
