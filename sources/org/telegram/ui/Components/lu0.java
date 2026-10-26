package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.tgnet.TLRPC;
public final class lu0 extends lm0 {
    public final Context f30290c;
    public final ArrayList d = new ArrayList();
    public boolean e;
    public boolean f30291f;
    public boolean h;
    public final aw0 f30292n;

    public lu0(aw0 aw0Var, Context context) {
        this.f30292n = aw0Var;
        this.f30290c = context;
    }

    public static void E(lu0 lu0Var, long j10) {
        aw0 aw0Var = lu0Var.f30292n;
        if (!lu0Var.e) {
            TLRPC.TL_messages_getCommonChats tL_messages_getCommonChats = new TLRPC.TL_messages_getCommonChats();
            long j11 = aw0Var.l1;
            org.telegram.ui.ActionBar.r2 r2Var = aw0Var.f26704x1;
            if (DialogObject.isEncryptedDialog(j11)) {
                j11 = org.telegram.messenger.t.m(r2Var.getMessagesController(), j11).user_id;
            }
            TLRPC.InputUser inputUser = r2Var.getMessagesController().getInputUser(j11);
            tL_messages_getCommonChats.user_id = inputUser;
            if (inputUser instanceof TLRPC.TL_inputUserEmpty) {
                return;
            }
            tL_messages_getCommonChats.limit = 100;
            tL_messages_getCommonChats.max_id = j10;
            lu0Var.e = true;
            lu0Var.l();
            r2Var.getConnectionsManager().bindRequestToGuid(r2Var.getConnectionsManager().sendRequest(tL_messages_getCommonChats, new b2(lu0Var, 12)), r2Var.getClassGuid());
        }
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        if (e1Var.b() != this.d.size()) {
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
    public final void v(s4.e1 e1Var, int i10) {
        if (e1Var.f47741f == 14) {
            View view = e1Var.f47738a;
            if (view instanceof org.telegram.ui.Cells.m6) {
                org.telegram.ui.Cells.m6 m6Var = (org.telegram.ui.Cells.m6) view;
                ArrayList arrayList = this.d;
                m6Var.s((TLRPC.Chat) arrayList.get(i10), null, null, null, false, false);
                boolean z10 = true;
                if (i10 == arrayList.size() - 1 && this.h) {
                    z10 = false;
                }
                m6Var.M = z10;
            }
        }
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.m6 m6Var;
        aw0 aw0Var = this.f30292n;
        org.telegram.ui.ActionBar.u6 u6Var = aw0Var.H1;
        Context context = this.f30290c;
        if (i10 != 14) {
            if (i10 != 15) {
                c10 c10Var = new c10(context, u6Var);
                c10Var.setIsSingleCell(true);
                c10Var.f27031w = false;
                c10Var.setViewType(1);
                m6Var = c10Var;
            } else {
                nu0 U = aw0.U(6, aw0Var.l1, context, u6Var);
                U.setLayoutParams(new s4.q0(-1, -1));
                return new s4.e1(U);
            }
        } else {
            m6Var = new org.telegram.ui.Cells.m6(context, u6Var);
        }
        return ic.a.n(m6Var, m6Var, -1, -2);
    }
}
