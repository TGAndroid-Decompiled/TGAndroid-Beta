package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.tgnet.TLRPC;
public final class jt0 extends sl0 {
    public final Context f28200c;
    public final ArrayList d = new ArrayList();
    public boolean f28201e;
    public boolean f28202f;
    public boolean h;
    public final zu0 f28203n;

    public jt0(zu0 zu0Var, Context context) {
        this.f28203n = zu0Var;
        this.f28200c = context;
    }

    public static void E(jt0 jt0Var, long j10) {
        zu0 zu0Var = jt0Var.f28203n;
        if (!jt0Var.f28201e) {
            TLRPC.TL_messages_getCommonChats tL_messages_getCommonChats = new TLRPC.TL_messages_getCommonChats();
            long j11 = zu0Var.f33979g1;
            org.telegram.ui.ActionBar.p2 p2Var = zu0Var.f34004s1;
            if (DialogObject.isEncryptedDialog(j11)) {
                j11 = org.telegram.messenger.y3.n(p2Var.getMessagesController(), j11).user_id;
            }
            TLRPC.InputUser inputUser = p2Var.getMessagesController().getInputUser(j11);
            tL_messages_getCommonChats.user_id = inputUser;
            if (inputUser instanceof TLRPC.TL_inputUserEmpty) {
                return;
            }
            tL_messages_getCommonChats.limit = 100;
            tL_messages_getCommonChats.max_id = j10;
            jt0Var.f28201e = true;
            jt0Var.l();
            p2Var.getConnectionsManager().bindRequestToGuid(p2Var.getConnectionsManager().sendRequest(tL_messages_getCommonChats, new y1(jt0Var, 12)), p2Var.getClassGuid());
        }
    }

    @Override
    public final boolean D(f2.m1 m1Var) {
        if (m1Var.b() != this.d.size()) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        ArrayList arrayList = this.d;
        if (arrayList.isEmpty() && !this.f28201e) {
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
        if (arrayList.isEmpty() && !this.f28201e) {
            return 15;
        }
        if (i10 < arrayList.size()) {
            return 14;
        }
        return 16;
    }

    @Override
    public final void v(f2.m1 m1Var, int i10) {
        if (m1Var.f5879f == 14) {
            View view = m1Var.f5875a;
            if (view instanceof org.telegram.ui.Cells.h6) {
                org.telegram.ui.Cells.h6 h6Var = (org.telegram.ui.Cells.h6) view;
                ArrayList arrayList = this.d;
                h6Var.t((TLRPC.Chat) arrayList.get(i10), null, null, null, false, false);
                boolean z4 = true;
                if (i10 == arrayList.size() - 1 && this.h) {
                    z4 = false;
                }
                h6Var.J = z4;
            }
        }
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.h6 h6Var;
        zu0 zu0Var = this.f28203n;
        org.telegram.ui.ActionBar.g6 g6Var = zu0Var.C1;
        Context context = this.f28200c;
        if (i10 != 14) {
            if (i10 != 15) {
                u00 u00Var = new u00(context, g6Var);
                u00Var.setIsSingleCell(true);
                u00Var.f31509w = false;
                u00Var.setViewType(1);
                h6Var = u00Var;
            } else {
                lt0 M = zu0.M(6, zu0Var.f33979g1, context, g6Var);
                M.setLayoutParams(new f2.x0(-1, -1));
                return new f2.m1(M);
            }
        } else {
            h6Var = new org.telegram.ui.Cells.h6(context, g6Var);
        }
        return org.telegram.ui.yh.o(h6Var, h6Var, -1, -2);
    }
}
