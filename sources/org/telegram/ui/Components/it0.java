package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.tgnet.TLRPC;
public final class it0 extends rl0 {
    public final Context f27897c;
    public final ArrayList d = new ArrayList();
    public boolean f27898e;
    public boolean f27899f;
    public boolean h;
    public final yu0 f27900n;

    public it0(yu0 yu0Var, Context context) {
        this.f27900n = yu0Var;
        this.f27897c = context;
    }

    public static void E(it0 it0Var, long j10) {
        yu0 yu0Var = it0Var.f27900n;
        if (!it0Var.f27898e) {
            TLRPC.TL_messages_getCommonChats tL_messages_getCommonChats = new TLRPC.TL_messages_getCommonChats();
            long j11 = yu0Var.f33624g1;
            org.telegram.ui.ActionBar.p2 p2Var = yu0Var.f33649s1;
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
            it0Var.f27898e = true;
            it0Var.l();
            p2Var.getConnectionsManager().bindRequestToGuid(p2Var.getConnectionsManager().sendRequest(tL_messages_getCommonChats, new y1(it0Var, 12)), p2Var.getClassGuid());
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
        if (arrayList.isEmpty() && !this.f27898e) {
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
        if (arrayList.isEmpty() && !this.f27898e) {
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
        yu0 yu0Var = this.f27900n;
        org.telegram.ui.ActionBar.g6 g6Var = yu0Var.C1;
        Context context = this.f27897c;
        if (i10 != 14) {
            if (i10 != 15) {
                u00 u00Var = new u00(context, g6Var);
                u00Var.setIsSingleCell(true);
                u00Var.f31465w = false;
                u00Var.setViewType(1);
                h6Var = u00Var;
            } else {
                kt0 M = yu0.M(6, yu0Var.f33624g1, context, g6Var);
                M.setLayoutParams(new f2.x0(-1, -1));
                return new f2.m1(M);
            }
        } else {
            h6Var = new org.telegram.ui.Cells.h6(context, g6Var);
        }
        return org.telegram.ui.yh.o(h6Var, h6Var, -1, -2);
    }
}
