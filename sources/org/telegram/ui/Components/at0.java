package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.tgnet.TLRPC;
public final class at0 extends il0 {
    public final Context f26878c;
    public final ArrayList d = new ArrayList();
    public boolean f26879e;
    public boolean f26880f;
    public boolean h;
    public final qu0 f26881n;

    public at0(qu0 qu0Var, Context context) {
        this.f26881n = qu0Var;
        this.f26878c = context;
    }

    public static void E(at0 at0Var, long j10) {
        qu0 qu0Var = at0Var.f26881n;
        if (!at0Var.f26879e) {
            TLRPC.TL_messages_getCommonChats tL_messages_getCommonChats = new TLRPC.TL_messages_getCommonChats();
            long j11 = qu0Var.f32069f1;
            org.telegram.ui.ActionBar.o2 o2Var = qu0Var.f32093r1;
            if (DialogObject.isEncryptedDialog(j11)) {
                j11 = org.telegram.messenger.x3.p(o2Var.getMessagesController(), j11).user_id;
            }
            TLRPC.InputUser inputUser = o2Var.getMessagesController().getInputUser(j11);
            tL_messages_getCommonChats.user_id = inputUser;
            if (inputUser instanceof TLRPC.TL_inputUserEmpty) {
                return;
            }
            tL_messages_getCommonChats.limit = 100;
            tL_messages_getCommonChats.max_id = j10;
            at0Var.f26879e = true;
            at0Var.l();
            o2Var.getConnectionsManager().bindRequestToGuid(o2Var.getConnectionsManager().sendRequest(tL_messages_getCommonChats, new a2(at0Var, 12)), o2Var.getClassGuid());
        }
    }

    @Override
    public final boolean D(f2.n1 n1Var) {
        if (n1Var.b() != this.d.size()) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        ArrayList arrayList = this.d;
        if (arrayList.isEmpty() && !this.f26879e) {
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
        if (arrayList.isEmpty() && !this.f26879e) {
            return 15;
        }
        if (i10 < arrayList.size()) {
            return 14;
        }
        return 16;
    }

    @Override
    public final void v(f2.n1 n1Var, int i10) {
        if (n1Var.f6436f == 14) {
            View view = n1Var.f6432a;
            if (view instanceof org.telegram.ui.Cells.f6) {
                org.telegram.ui.Cells.f6 f6Var = (org.telegram.ui.Cells.f6) view;
                ArrayList arrayList = this.d;
                f6Var.t((TLRPC.Chat) arrayList.get(i10), null, null, null, false, false);
                boolean z10 = true;
                if (i10 == arrayList.size() - 1 && this.h) {
                    z10 = false;
                }
                f6Var.I = z10;
            }
        }
    }

    @Override
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.f6 f6Var;
        qu0 qu0Var = this.f26881n;
        org.telegram.ui.ActionBar.c6 c6Var = qu0Var.B1;
        Context context = this.f26878c;
        if (i10 != 14) {
            if (i10 != 15) {
                p00 p00Var = new p00(context, c6Var);
                p00Var.setIsSingleCell(true);
                p00Var.f31529w = false;
                p00Var.setViewType(1);
                f6Var = p00Var;
            } else {
                ct0 M = qu0.M(6, qu0Var.f32069f1, context, c6Var);
                M.setLayoutParams(new f2.x0(-1, -1));
                return new f2.n1(M);
            }
        } else {
            f6Var = new org.telegram.ui.Cells.f6(context, c6Var);
        }
        return org.telegram.ui.th.m(f6Var, f6Var, -1, -2);
    }
}
