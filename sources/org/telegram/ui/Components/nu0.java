package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.tgnet.TLRPC;
public final class nu0 extends qm0 {
    public final Context f29278c;
    public final ArrayList d = new ArrayList();
    public boolean f29279e;
    public boolean f29280f;
    public boolean h;
    public final cw0 f29281n;

    public nu0(cw0 cw0Var, Context context) {
        this.f29281n = cw0Var;
        this.f29278c = context;
    }

    public static void E(nu0 nu0Var, long j3) {
        cw0 cw0Var = nu0Var.f29281n;
        if (!nu0Var.f29279e) {
            TLRPC.TL_messages_getCommonChats tL_messages_getCommonChats = new TLRPC.TL_messages_getCommonChats();
            long j10 = cw0Var.f25511j1;
            org.telegram.ui.ActionBar.m2 m2Var = cw0Var.f25536v1;
            if (DialogObject.isEncryptedDialog(j10)) {
                j10 = org.telegram.messenger.q.l(m2Var.getMessagesController(), j10).user_id;
            }
            TLRPC.InputUser inputUser = m2Var.getMessagesController().getInputUser(j10);
            tL_messages_getCommonChats.user_id = inputUser;
            if (inputUser instanceof TLRPC.TL_inputUserEmpty) {
                return;
            }
            tL_messages_getCommonChats.limit = 100;
            tL_messages_getCommonChats.max_id = j3;
            nu0Var.f29279e = true;
            nu0Var.l();
            m2Var.getConnectionsManager().bindRequestToGuid(m2Var.getConnectionsManager().sendRequest(tL_messages_getCommonChats, new y1(nu0Var, 12)), m2Var.getClassGuid());
        }
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        if (d1Var.b() != this.d.size()) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        ArrayList arrayList = this.d;
        if (arrayList.isEmpty() && !this.f29279e) {
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
        if (arrayList.isEmpty() && !this.f29279e) {
            return 15;
        }
        if (i10 < arrayList.size()) {
            return 14;
        }
        return 16;
    }

    @Override
    public final void v(s4.d1 d1Var, int i10) {
        if (d1Var.f47786f == 14) {
            View view = d1Var.f47782a;
            if (view instanceof org.telegram.ui.Cells.i6) {
                org.telegram.ui.Cells.i6 i6Var = (org.telegram.ui.Cells.i6) view;
                ArrayList arrayList = this.d;
                i6Var.u((TLRPC.Chat) arrayList.get(i10), null, null, null, false, false);
                boolean z10 = true;
                if (i10 == arrayList.size() - 1 && this.h) {
                    z10 = false;
                }
                i6Var.M = z10;
            }
        }
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.i6 i6Var;
        cw0 cw0Var = this.f29281n;
        org.telegram.ui.ActionBar.d6 d6Var = cw0Var.F1;
        Context context = this.f29278c;
        if (i10 != 14) {
            if (i10 != 15) {
                k10 k10Var = new k10(context, d6Var);
                k10Var.setIsSingleCell(true);
                k10Var.f27916w = false;
                k10Var.setViewType(1);
                i6Var = k10Var;
            } else {
                pu0 M = cw0.M(6, cw0Var.f25511j1, context, d6Var);
                M.setLayoutParams(new s4.q0(-1, -1));
                return new s4.d1(M);
            }
        } else {
            i6Var = new org.telegram.ui.Cells.i6(context, d6Var);
        }
        return com.google.android.gms.internal.vision.e2.k(i6Var, i6Var, -1, -2);
    }
}
