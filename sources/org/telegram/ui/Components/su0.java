package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.tgnet.TLRPC;
public final class su0 extends vm0 {
    public final Context f30678c;
    public final ArrayList d = new ArrayList();
    public boolean f30679e;
    public boolean f30680f;
    public boolean h;
    public final hw0 f30681n;

    public su0(hw0 hw0Var, Context context) {
        this.f30681n = hw0Var;
        this.f30678c = context;
    }

    public static void E(su0 su0Var, long j3) {
        hw0 hw0Var = su0Var.f30681n;
        if (!su0Var.f30679e) {
            TLRPC.TL_messages_getCommonChats tL_messages_getCommonChats = new TLRPC.TL_messages_getCommonChats();
            long j10 = hw0Var.f26932j1;
            org.telegram.ui.ActionBar.m2 m2Var = hw0Var.f26957v1;
            if (DialogObject.isEncryptedDialog(j10)) {
                j10 = org.telegram.messenger.v0.l(m2Var.getMessagesController(), j10).user_id;
            }
            TLRPC.InputUser inputUser = m2Var.getMessagesController().getInputUser(j10);
            tL_messages_getCommonChats.user_id = inputUser;
            if (inputUser instanceof TLRPC.TL_inputUserEmpty) {
                return;
            }
            tL_messages_getCommonChats.limit = 100;
            tL_messages_getCommonChats.max_id = j3;
            su0Var.f30679e = true;
            su0Var.l();
            m2Var.getConnectionsManager().bindRequestToGuid(m2Var.getConnectionsManager().sendRequest(tL_messages_getCommonChats, new y1(su0Var, 12)), m2Var.getClassGuid());
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
        if (arrayList.isEmpty() && !this.f30679e) {
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
        if (arrayList.isEmpty() && !this.f30679e) {
            return 15;
        }
        if (i10 < arrayList.size()) {
            return 14;
        }
        return 16;
    }

    @Override
    public final void v(s4.d1 d1Var, int i10) {
        if (d1Var.f47901f == 14) {
            View view = d1Var.f47897a;
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
        hw0 hw0Var = this.f30681n;
        org.telegram.ui.ActionBar.c6 c6Var = hw0Var.F1;
        Context context = this.f30678c;
        if (i10 != 14) {
            if (i10 != 15) {
                m10 m10Var = new m10(context, c6Var);
                m10Var.setIsSingleCell(true);
                m10Var.f28350w = false;
                m10Var.setViewType(1);
                i6Var = m10Var;
            } else {
                uu0 M = hw0.M(6, hw0Var.f26932j1, context, c6Var);
                M.setLayoutParams(new s4.q0(-1, -1));
                return new s4.d1(M);
            }
        } else {
            i6Var = new org.telegram.ui.Cells.i6(context, c6Var);
        }
        return com.google.android.gms.internal.vision.e2.k(i6Var, i6Var, -1, -2);
    }
}
