package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.tgnet.TLRPC;
public final class mu0 extends pm0 {
    public final Context f28939c;
    public final ArrayList d = new ArrayList();
    public boolean f28940e;
    public boolean f28941f;
    public boolean h;
    public final bw0 f28942n;

    public mu0(bw0 bw0Var, Context context) {
        this.f28942n = bw0Var;
        this.f28939c = context;
    }

    public static void E(mu0 mu0Var, long j3) {
        bw0 bw0Var = mu0Var.f28942n;
        if (!mu0Var.f28940e) {
            TLRPC.TL_messages_getCommonChats tL_messages_getCommonChats = new TLRPC.TL_messages_getCommonChats();
            long j10 = bw0Var.f25141j1;
            org.telegram.ui.ActionBar.n2 n2Var = bw0Var.f25166v1;
            if (DialogObject.isEncryptedDialog(j10)) {
                j10 = org.telegram.messenger.q.l(n2Var.getMessagesController(), j10).user_id;
            }
            TLRPC.InputUser inputUser = n2Var.getMessagesController().getInputUser(j10);
            tL_messages_getCommonChats.user_id = inputUser;
            if (inputUser instanceof TLRPC.TL_inputUserEmpty) {
                return;
            }
            tL_messages_getCommonChats.limit = 100;
            tL_messages_getCommonChats.max_id = j3;
            mu0Var.f28940e = true;
            mu0Var.l();
            n2Var.getConnectionsManager().bindRequestToGuid(n2Var.getConnectionsManager().sendRequest(tL_messages_getCommonChats, new y1(mu0Var, 12)), n2Var.getClassGuid());
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
        if (arrayList.isEmpty() && !this.f28940e) {
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
        if (arrayList.isEmpty() && !this.f28940e) {
            return 15;
        }
        if (i10 < arrayList.size()) {
            return 14;
        }
        return 16;
    }

    @Override
    public final void v(s4.d1 d1Var, int i10) {
        if (d1Var.f47662f == 14) {
            View view = d1Var.f47658a;
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
        bw0 bw0Var = this.f28942n;
        org.telegram.ui.ActionBar.e6 e6Var = bw0Var.F1;
        Context context = this.f28939c;
        if (i10 != 14) {
            if (i10 != 15) {
                j10 j10Var = new j10(context, e6Var);
                j10Var.setIsSingleCell(true);
                j10Var.f27555w = false;
                j10Var.setViewType(1);
                i6Var = j10Var;
            } else {
                ou0 M = bw0.M(6, bw0Var.f25141j1, context, e6Var);
                M.setLayoutParams(new s4.q0(-1, -1));
                return new s4.d1(M);
            }
        } else {
            i6Var = new org.telegram.ui.Cells.i6(context, e6Var);
        }
        return com.google.android.gms.internal.vision.e2.k(i6Var, i6Var, -1, -2);
    }
}
