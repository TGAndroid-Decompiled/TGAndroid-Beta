package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.tgnet.TLRPC;
public final class it0 extends kl0 {
    public final Context f27254c;
    public final ArrayList d = new ArrayList();
    public boolean f27255e;
    public boolean f27256f;
    public boolean h;
    public final xu0 f27257n;

    public it0(xu0 xu0Var, Context context) {
        this.f27257n = xu0Var;
        this.f27254c = context;
    }

    public static void E(it0 it0Var, long j3) {
        xu0 xu0Var = it0Var.f27257n;
        if (!it0Var.f27255e) {
            TLRPC.TL_messages_getCommonChats tL_messages_getCommonChats = new TLRPC.TL_messages_getCommonChats();
            long j10 = xu0Var.f32701j1;
            org.telegram.ui.ActionBar.n2 n2Var = xu0Var.f32726v1;
            if (DialogObject.isEncryptedDialog(j10)) {
                j10 = org.telegram.messenger.w1.m(n2Var.getMessagesController(), j10).user_id;
            }
            TLRPC.InputUser inputUser = n2Var.getMessagesController().getInputUser(j10);
            tL_messages_getCommonChats.user_id = inputUser;
            if (inputUser instanceof TLRPC.TL_inputUserEmpty) {
                return;
            }
            tL_messages_getCommonChats.limit = 100;
            tL_messages_getCommonChats.max_id = j3;
            it0Var.f27255e = true;
            it0Var.l();
            n2Var.getConnectionsManager().bindRequestToGuid(n2Var.getConnectionsManager().sendRequest(tL_messages_getCommonChats, new y1(it0Var, 12)), n2Var.getClassGuid());
        }
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.b() != this.d.size()) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        ArrayList arrayList = this.d;
        if (arrayList.isEmpty() && !this.f27255e) {
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
        if (arrayList.isEmpty() && !this.f27255e) {
            return 15;
        }
        if (i10 < arrayList.size()) {
            return 14;
        }
        return 16;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        if (c1Var.f45742f == 14) {
            View view = c1Var.f45738a;
            if (view instanceof org.telegram.ui.Cells.h6) {
                org.telegram.ui.Cells.h6 h6Var = (org.telegram.ui.Cells.h6) view;
                ArrayList arrayList = this.d;
                h6Var.t((TLRPC.Chat) arrayList.get(i10), null, null, null, false, false);
                boolean z10 = true;
                if (i10 == arrayList.size() - 1 && this.h) {
                    z10 = false;
                }
                h6Var.M = z10;
            }
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.h6 h6Var;
        xu0 xu0Var = this.f27257n;
        org.telegram.ui.ActionBar.f6 f6Var = xu0Var.F1;
        Context context = this.f27254c;
        if (i10 != 14) {
            if (i10 != 15) {
                t00 t00Var = new t00(context, f6Var);
                t00Var.setIsSingleCell(true);
                t00Var.f30465w = false;
                t00Var.setViewType(1);
                h6Var = t00Var;
            } else {
                kt0 M = xu0.M(6, xu0Var.f32701j1, context, f6Var);
                M.setLayoutParams(new s4.p0(-1, -1));
                return new s4.c1(M);
            }
        } else {
            h6Var = new org.telegram.ui.Cells.h6(context, f6Var);
        }
        return com.google.android.gms.internal.vision.e2.l(h6Var, h6Var, -1, -2);
    }
}
