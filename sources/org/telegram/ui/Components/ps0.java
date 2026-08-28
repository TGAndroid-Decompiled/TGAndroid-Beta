package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.tgnet.TLRPC;
public final class ps0 extends vk0 {
    public final Context f31746c;
    public final ArrayList d = new ArrayList();
    public boolean f31747e;
    public boolean f31748f;
    public boolean h;
    public final eu0 f31749n;

    public ps0(eu0 eu0Var, Context context) {
        this.f31749n = eu0Var;
        this.f31746c = context;
    }

    public static void E(ps0 ps0Var, long j10) {
        eu0 eu0Var = ps0Var.f31749n;
        if (!ps0Var.f31747e) {
            TLRPC.TL_messages_getCommonChats tL_messages_getCommonChats = new TLRPC.TL_messages_getCommonChats();
            long j11 = eu0Var.f28136f1;
            org.telegram.ui.ActionBar.o2 o2Var = eu0Var.f28160r1;
            if (DialogObject.isEncryptedDialog(j11)) {
                j11 = org.telegram.messenger.l0.l(o2Var.getMessagesController(), j11).user_id;
            }
            TLRPC.InputUser inputUser = o2Var.getMessagesController().getInputUser(j11);
            tL_messages_getCommonChats.user_id = inputUser;
            if (inputUser instanceof TLRPC.TL_inputUserEmpty) {
                return;
            }
            tL_messages_getCommonChats.limit = 100;
            tL_messages_getCommonChats.max_id = j10;
            ps0Var.f31747e = true;
            ps0Var.l();
            o2Var.getConnectionsManager().bindRequestToGuid(o2Var.getConnectionsManager().sendRequest(tL_messages_getCommonChats, new w1(ps0Var, 12)), o2Var.getClassGuid());
        }
    }

    @Override
    public final boolean D(f2.q1 q1Var) {
        if (q1Var.b() != this.d.size()) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        ArrayList arrayList = this.d;
        if (arrayList.isEmpty() && !this.f31747e) {
            return 1;
        }
        int size = arrayList.size();
        if (!arrayList.isEmpty() && !this.h) {
            return size + 1;
        }
        return size;
    }

    @Override
    public final int j(int i9) {
        ArrayList arrayList = this.d;
        if (arrayList.isEmpty() && !this.f31747e) {
            return 15;
        }
        if (i9 < arrayList.size()) {
            return 14;
        }
        return 16;
    }

    @Override
    public final void v(f2.q1 q1Var, int i9) {
        if (q1Var.f5505f == 14) {
            View view = q1Var.f5501a;
            if (view instanceof org.telegram.ui.Cells.h6) {
                org.telegram.ui.Cells.h6 h6Var = (org.telegram.ui.Cells.h6) view;
                ArrayList arrayList = this.d;
                h6Var.t((TLRPC.Chat) arrayList.get(i9), null, null, null, false, false);
                boolean z10 = true;
                if (i9 == arrayList.size() - 1 && this.h) {
                    z10 = false;
                }
                h6Var.I = z10;
            }
        }
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        org.telegram.ui.Cells.h6 h6Var;
        eu0 eu0Var = this.f31749n;
        org.telegram.ui.ActionBar.b6 b6Var = eu0Var.B1;
        Context context = this.f31746c;
        if (i9 != 14) {
            if (i9 != 15) {
                e00 e00Var = new e00(context, b6Var);
                e00Var.setIsSingleCell(true);
                e00Var.f27885w = false;
                e00Var.setViewType(1);
                h6Var = e00Var;
            } else {
                rs0 M = eu0.M(6, eu0Var.f28136f1, context, b6Var);
                M.setLayoutParams(new f2.a1(-1, -1));
                return new f2.q1(M);
            }
        } else {
            h6Var = new org.telegram.ui.Cells.h6(context, b6Var);
        }
        return j3.r0.s(h6Var, h6Var, -1, -2);
    }
}
