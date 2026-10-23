package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.tgnet.TLRPC;
public final class fu0 extends im0 {
    public final Context f26418c;
    public final ArrayList d = new ArrayList();
    public boolean e;
    public boolean f26419f;
    public boolean h;
    public final uv0 f26420n;

    public fu0(uv0 uv0Var, Context context) {
        this.f26420n = uv0Var;
        this.f26418c = context;
    }

    public static void E(fu0 fu0Var, long j10) {
        uv0 uv0Var = fu0Var.f26420n;
        if (!fu0Var.e) {
            TLRPC.TL_messages_getCommonChats tL_messages_getCommonChats = new TLRPC.TL_messages_getCommonChats();
            long j11 = uv0Var.f31050j1;
            org.telegram.ui.ActionBar.n2 n2Var = uv0Var.f31075v1;
            if (DialogObject.isEncryptedDialog(j11)) {
                j11 = org.telegram.messenger.g0.l(n2Var.getMessagesController(), j11).user_id;
            }
            TLRPC.InputUser inputUser = n2Var.getMessagesController().getInputUser(j11);
            tL_messages_getCommonChats.user_id = inputUser;
            if (inputUser instanceof TLRPC.TL_inputUserEmpty) {
                return;
            }
            tL_messages_getCommonChats.limit = 100;
            tL_messages_getCommonChats.max_id = j10;
            fu0Var.e = true;
            fu0Var.l();
            n2Var.getConnectionsManager().bindRequestToGuid(n2Var.getConnectionsManager().sendRequest(tL_messages_getCommonChats, new y1(fu0Var, 12)), n2Var.getClassGuid());
        }
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        if (b1Var.b() != this.d.size()) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        ArrayList arrayList = this.d;
        if (arrayList.isEmpty() && !this.e) {
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
        if (arrayList.isEmpty() && !this.e) {
            return 15;
        }
        if (i10 < arrayList.size()) {
            return 14;
        }
        return 16;
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        if (b1Var.f45924f == 14) {
            View view = b1Var.f45921a;
            if (view instanceof org.telegram.ui.Cells.h6) {
                org.telegram.ui.Cells.h6 h6Var = (org.telegram.ui.Cells.h6) view;
                ArrayList arrayList = this.d;
                h6Var.u((TLRPC.Chat) arrayList.get(i10), null, null, null, false, false);
                boolean z10 = true;
                if (i10 == arrayList.size() - 1 && this.h) {
                    z10 = false;
                }
                h6Var.M = z10;
            }
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.h6 h6Var;
        uv0 uv0Var = this.f26420n;
        org.telegram.ui.ActionBar.d6 d6Var = uv0Var.F1;
        Context context = this.f26418c;
        if (i10 != 14) {
            if (i10 != 15) {
                b10 b10Var = new b10(context, d6Var);
                b10Var.setIsSingleCell(true);
                b10Var.f24778w = false;
                b10Var.setViewType(1);
                h6Var = b10Var;
            } else {
                hu0 M = uv0.M(6, uv0Var.f31050j1, context, d6Var);
                M.setLayoutParams(new s4.o0(-1, -1));
                return new s4.b1(M);
            }
        } else {
            h6Var = new org.telegram.ui.Cells.h6(context, d6Var);
        }
        return com.google.android.gms.internal.play_billing.k3.l(h6Var, h6Var, -1, -2);
    }
}
