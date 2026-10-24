package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.tgnet.TLRPC;
public final class hu0 extends km0 {
    public final Context f27174c;
    public final ArrayList d = new ArrayList();
    public boolean e;
    public boolean f27175f;
    public boolean h;
    public final wv0 f27176n;

    public hu0(wv0 wv0Var, Context context) {
        this.f27176n = wv0Var;
        this.f27174c = context;
    }

    public static void E(hu0 hu0Var, long j10) {
        wv0 wv0Var = hu0Var.f27176n;
        if (!hu0Var.e) {
            TLRPC.TL_messages_getCommonChats tL_messages_getCommonChats = new TLRPC.TL_messages_getCommonChats();
            long j11 = wv0Var.f32385j1;
            org.telegram.ui.ActionBar.o2 o2Var = wv0Var.f32410v1;
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
            hu0Var.e = true;
            hu0Var.l();
            o2Var.getConnectionsManager().bindRequestToGuid(o2Var.getConnectionsManager().sendRequest(tL_messages_getCommonChats, new x1(hu0Var, 12)), o2Var.getClassGuid());
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
        if (b1Var.f46345f == 14) {
            View view = b1Var.f46342a;
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
        wv0 wv0Var = this.f27176n;
        org.telegram.ui.ActionBar.g6 g6Var = wv0Var.F1;
        Context context = this.f27174c;
        if (i10 != 14) {
            if (i10 != 15) {
                z00 z00Var = new z00(context, g6Var);
                z00Var.setIsSingleCell(true);
                z00Var.f33104w = false;
                z00Var.setViewType(1);
                i6Var = z00Var;
            } else {
                ju0 N = wv0.N(6, wv0Var.f32385j1, context, g6Var);
                N.setLayoutParams(new s4.o0(-1, -1));
                return new s4.b1(N);
            }
        } else {
            i6Var = new org.telegram.ui.Cells.i6(context, g6Var);
        }
        return com.google.android.gms.internal.play_billing.k3.l(i6Var, i6Var, -1, -2);
    }
}
