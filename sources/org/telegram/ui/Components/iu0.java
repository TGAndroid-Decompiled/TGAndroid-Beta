package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.tgnet.TLRPC;
public final class iu0 extends lm0 {
    public final Context f27450c;
    public final ArrayList d = new ArrayList();
    public boolean e;
    public boolean f27451f;
    public boolean h;
    public final xv0 f27452n;

    public iu0(xv0 xv0Var, Context context) {
        this.f27452n = xv0Var;
        this.f27450c = context;
    }

    public static void E(iu0 iu0Var, long j10) {
        xv0 xv0Var = iu0Var.f27452n;
        if (!iu0Var.e) {
            TLRPC.TL_messages_getCommonChats tL_messages_getCommonChats = new TLRPC.TL_messages_getCommonChats();
            long j11 = xv0Var.f32686j1;
            org.telegram.ui.ActionBar.o2 o2Var = xv0Var.f32711v1;
            if (DialogObject.isEncryptedDialog(j11)) {
                j11 = org.telegram.messenger.v0.l(o2Var.getMessagesController(), j11).user_id;
            }
            TLRPC.InputUser inputUser = o2Var.getMessagesController().getInputUser(j11);
            tL_messages_getCommonChats.user_id = inputUser;
            if (inputUser instanceof TLRPC.TL_inputUserEmpty) {
                return;
            }
            tL_messages_getCommonChats.limit = 100;
            tL_messages_getCommonChats.max_id = j10;
            iu0Var.e = true;
            iu0Var.l();
            o2Var.getConnectionsManager().bindRequestToGuid(o2Var.getConnectionsManager().sendRequest(tL_messages_getCommonChats, new x1(iu0Var, 12)), o2Var.getClassGuid());
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
        if (b1Var.f46346f == 14) {
            View view = b1Var.f46343a;
            if (view instanceof org.telegram.ui.Cells.i6) {
                org.telegram.ui.Cells.i6 i6Var = (org.telegram.ui.Cells.i6) view;
                ArrayList arrayList = this.d;
                i6Var.t((TLRPC.Chat) arrayList.get(i10), null, null, null, false, false);
                boolean z10 = true;
                if (i10 == arrayList.size() - 1 && this.h) {
                    z10 = false;
                }
                i6Var.M = z10;
            }
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.i6 i6Var;
        xv0 xv0Var = this.f27452n;
        org.telegram.ui.ActionBar.g6 g6Var = xv0Var.F1;
        Context context = this.f27450c;
        if (i10 != 14) {
            if (i10 != 15) {
                b10 b10Var = new b10(context, g6Var);
                b10Var.setIsSingleCell(true);
                b10Var.f24923w = false;
                b10Var.setViewType(1);
                i6Var = b10Var;
            } else {
                ku0 N = xv0.N(6, xv0Var.f32686j1, context, g6Var);
                N.setLayoutParams(new s4.o0(-1, -1));
                return new s4.b1(N);
            }
        } else {
            i6Var = new org.telegram.ui.Cells.i6(context, g6Var);
        }
        return com.google.android.gms.internal.play_billing.k3.l(i6Var, i6Var, -1, -2);
    }
}
