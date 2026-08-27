package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.tgnet.TLRPC;

public final class rs0 extends yk0 {

    public final Context f32260c;
    public final ArrayList d = new ArrayList();

    public boolean f32261e;

    public boolean f32262f;
    public boolean h;

    public final hu0 f32263n;

    public rs0(hu0 hu0Var, Context context) {
        this.f32263n = hu0Var;
        this.f32260c = context;
    }

    public static void E(rs0 rs0Var, long j10) {
        hu0 hu0Var = rs0Var.f32263n;
        if (rs0Var.f32261e) {
            return;
        }
        TLRPC.TL_messages_getCommonChats tL_messages_getCommonChats = new TLRPC.TL_messages_getCommonChats();
        long j11 = hu0Var.f29121f1;
        org.telegram.ui.ActionBar.n2 n2Var = hu0Var.f29145r1;
        if (DialogObject.isEncryptedDialog(j11)) {
            j11 = org.telegram.messenger.y1.n(n2Var.getMessagesController(), j11).user_id;
        }
        TLRPC.InputUser inputUser = n2Var.getMessagesController().getInputUser(j11);
        tL_messages_getCommonChats.user_id = inputUser;
        if (inputUser instanceof TLRPC.TL_inputUserEmpty) {
            return;
        }
        tL_messages_getCommonChats.limit = 100;
        tL_messages_getCommonChats.max_id = j10;
        rs0Var.f32261e = true;
        rs0Var.l();
        n2Var.getConnectionsManager().bindRequestToGuid(n2Var.getConnectionsManager().sendRequest(tL_messages_getCommonChats, new w1(rs0Var, 12)), n2Var.getClassGuid());
    }

    @Override
    public final boolean D(f2.o1 o1Var) {
        return o1Var.b() != this.d.size();
    }

    @Override
    public final int h() {
        ArrayList arrayList = this.d;
        if (arrayList.isEmpty() && !this.f32261e) {
            return 1;
        }
        int size = arrayList.size();
        return (arrayList.isEmpty() || this.h) ? size : size + 1;
    }

    @Override
    public final int j(int i10) {
        ArrayList arrayList = this.d;
        if (!arrayList.isEmpty() || this.f32261e) {
            return i10 < arrayList.size() ? 14 : 16;
        }
        return 15;
    }

    @Override
    public final void v(f2.o1 o1Var, int i10) {
        if (o1Var.f5793f == 14) {
            View view = o1Var.f5789a;
            if (view instanceof org.telegram.ui.Cells.e6) {
                org.telegram.ui.Cells.e6 e6Var = (org.telegram.ui.Cells.e6) view;
                ArrayList arrayList = this.d;
                e6Var.u((TLRPC.Chat) arrayList.get(i10), null, null, null, false, false);
                boolean z10 = true;
                if (i10 == arrayList.size() - 1 && this.h) {
                    z10 = false;
                }
                e6Var.I = z10;
            }
        }
    }

    @Override
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        View e6Var;
        hu0 hu0Var = this.f32263n;
        org.telegram.ui.ActionBar.c6 c6Var = hu0Var.B1;
        Context context = this.f32260c;
        if (i10 == 14) {
            e6Var = new org.telegram.ui.Cells.e6(context, c6Var);
        } else {
            if (i10 == 15) {
                ts0 ts0VarM = hu0.M(6, hu0Var.f29121f1, context, c6Var);
                ts0VarM.setLayoutParams(new f2.y0(-1, -1));
                return new lk0(ts0VarM);
            }
            h00 h00Var = new h00(context, c6Var);
            h00Var.setIsSingleCell(true);
            h00Var.f28887w = false;
            h00Var.setViewType(1);
            e6Var = h00Var;
        }
        return org.telegram.ui.Cells.pa.l(e6Var, e6Var, -1, -2);
    }
}
