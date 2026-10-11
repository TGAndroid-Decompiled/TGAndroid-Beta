package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.tgnet.TLRPC;
public final class ou0 extends rm0 {
    public final Context f29522c;
    public final ArrayList d = new ArrayList();
    public boolean f29523e;
    public boolean f29524f;
    public boolean h;
    public final dw0 f29525n;

    public ou0(dw0 dw0Var, Context context) {
        this.f29525n = dw0Var;
        this.f29522c = context;
    }

    public static void E(ou0 ou0Var, long j3) {
        dw0 dw0Var = ou0Var.f29525n;
        if (!ou0Var.f29523e) {
            TLRPC.TL_messages_getCommonChats tL_messages_getCommonChats = new TLRPC.TL_messages_getCommonChats();
            long j10 = dw0Var.f25710j1;
            org.telegram.ui.ActionBar.m2 m2Var = dw0Var.f25735v1;
            if (DialogObject.isEncryptedDialog(j10)) {
                j10 = org.telegram.messenger.q.l(m2Var.getMessagesController(), j10).user_id;
            }
            TLRPC.InputUser inputUser = m2Var.getMessagesController().getInputUser(j10);
            tL_messages_getCommonChats.user_id = inputUser;
            if (inputUser instanceof TLRPC.TL_inputUserEmpty) {
                return;
            }
            tL_messages_getCommonChats.limit = 100;
            tL_messages_getCommonChats.max_id = j3;
            ou0Var.f29523e = true;
            ou0Var.l();
            m2Var.getConnectionsManager().bindRequestToGuid(m2Var.getConnectionsManager().sendRequest(tL_messages_getCommonChats, new y1(ou0Var, 12)), m2Var.getClassGuid());
        }
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        if (d1Var.b() != this.d.size()) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        ArrayList arrayList = this.d;
        if (arrayList.isEmpty() && !this.f29523e) {
            return 1;
        }
        int size = arrayList.size();
        if (!arrayList.isEmpty() && !this.h) {
            return size + 1;
        }
        return size;
    }

    @Override
    public final int j(int i10) {
        ArrayList arrayList = this.d;
        if (arrayList.isEmpty() && !this.f29523e) {
            return 15;
        }
        if (i10 < arrayList.size()) {
            return 14;
        }
        return 16;
    }

    @Override
    public final void v(s4.d1 d1Var, int i10) {
        if (d1Var.f47752f == 14) {
            View view = d1Var.f47748a;
            if (view instanceof org.telegram.ui.Cells.i6) {
                org.telegram.ui.Cells.i6 i6Var = (org.telegram.ui.Cells.i6) view;
                ArrayList arrayList = this.d;
                i6Var.u((TLRPC.Chat) arrayList.get(i10), null, null, null, false, false);
                boolean z10 = true;
                if (i10 == arrayList.size() - 1 && this.h) {
                    z10 = false;
                }
                i6Var.M = z10;
            }
        }
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.i6 i6Var;
        dw0 dw0Var = this.f29525n;
        org.telegram.ui.ActionBar.d6 d6Var = dw0Var.F1;
        Context context = this.f29522c;
        if (i10 != 14) {
            if (i10 != 15) {
                k10 k10Var = new k10(context, d6Var);
                k10Var.setIsSingleCell(true);
                k10Var.f27811w = false;
                k10Var.setViewType(1);
                i6Var = k10Var;
            } else {
                qu0 M = dw0.M(6, dw0Var.f25710j1, context, d6Var);
                M.setLayoutParams(new s4.q0(-1, -1));
                return new s4.d1(M);
            }
        } else {
            i6Var = new org.telegram.ui.Cells.i6(context, d6Var);
        }
        return com.google.android.gms.internal.vision.e2.k(i6Var, i6Var, -1, -2);
    }
}
