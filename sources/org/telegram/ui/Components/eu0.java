package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.tgnet.TLRPC;
public final class eu0 extends hm0 {
    public final Context f26022c;
    public final ArrayList d = new ArrayList();
    public boolean e;
    public boolean f26023f;
    public boolean h;
    public final tv0 f26024n;

    public eu0(tv0 tv0Var, Context context) {
        this.f26024n = tv0Var;
        this.f26022c = context;
    }

    public static void E(eu0 eu0Var, long j10) {
        tv0 tv0Var = eu0Var.f26024n;
        if (!eu0Var.e) {
            TLRPC.TL_messages_getCommonChats tL_messages_getCommonChats = new TLRPC.TL_messages_getCommonChats();
            long j11 = tv0Var.f30707j1;
            org.telegram.ui.ActionBar.n2 n2Var = tv0Var.f30732v1;
            if (DialogObject.isEncryptedDialog(j11)) {
                j11 = org.telegram.messenger.g0.l(n2Var.getMessagesController(), j11).user_id;
            }
            TLRPC.InputUser inputUser = n2Var.getMessagesController().getInputUser(j11);
            tL_messages_getCommonChats.user_id = inputUser;
            if (inputUser instanceof TLRPC.TL_inputUserEmpty) {
                return;
            }
            tL_messages_getCommonChats.limit = 100;
            tL_messages_getCommonChats.max_id = j10;
            eu0Var.e = true;
            eu0Var.l();
            n2Var.getConnectionsManager().bindRequestToGuid(n2Var.getConnectionsManager().sendRequest(tL_messages_getCommonChats, new y1(eu0Var, 12)), n2Var.getClassGuid());
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
        if (b1Var.f45915f == 14) {
            View view = b1Var.f45912a;
            if (view instanceof org.telegram.ui.Cells.h6) {
                org.telegram.ui.Cells.h6 h6Var = (org.telegram.ui.Cells.h6) view;
                ArrayList arrayList = this.d;
                h6Var.u((TLRPC.Chat) arrayList.get(i10), null, null, null, false, false);
                boolean z10 = true;
                if (i10 == arrayList.size() - 1 && this.h) {
                    z10 = false;
                }
                h6Var.M = z10;
            }
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.h6 h6Var;
        tv0 tv0Var = this.f26024n;
        org.telegram.ui.ActionBar.d6 d6Var = tv0Var.F1;
        Context context = this.f26022c;
        if (i10 != 14) {
            if (i10 != 15) {
                b10 b10Var = new b10(context, d6Var);
                b10Var.setIsSingleCell(true);
                b10Var.f24770w = false;
                b10Var.setViewType(1);
                h6Var = b10Var;
            } else {
                gu0 M = tv0.M(6, tv0Var.f30707j1, context, d6Var);
                M.setLayoutParams(new s4.o0(-1, -1));
                return new s4.b1(M);
            }
        } else {
            h6Var = new org.telegram.ui.Cells.h6(context, d6Var);
        }
        return com.google.android.gms.internal.play_billing.k3.l(h6Var, h6Var, -1, -2);
    }
}
