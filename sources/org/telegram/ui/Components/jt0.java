package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.tgnet.TLRPC;
public final class jt0 extends kl0 {
    public final Context f25419c;
    public final ArrayList d = new ArrayList();
    public boolean e;
    public boolean f25420f;
    public boolean h;
    public final yu0 f25421n;

    public jt0(yu0 yu0Var, Context context) {
        this.f25421n = yu0Var;
        this.f25419c = context;
    }

    public static void E(jt0 jt0Var, long j3) {
        yu0 yu0Var = jt0Var.f25421n;
        if (!jt0Var.e) {
            TLRPC.TL_messages_getCommonChats tL_messages_getCommonChats = new TLRPC.TL_messages_getCommonChats();
            long j10 = yu0Var.f30367j1;
            org.telegram.ui.ActionBar.n2 n2Var = yu0Var.f30392v1;
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
            jt0Var.e = true;
            jt0Var.l();
            n2Var.getConnectionsManager().bindRequestToGuid(n2Var.getConnectionsManager().sendRequest(tL_messages_getCommonChats, new x1(jt0Var, 12)), n2Var.getClassGuid());
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
    public final void v(s4.c1 c1Var, int i10) {
        if (c1Var.f42678f == 14) {
            View view = c1Var.f42675a;
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
        yu0 yu0Var = this.f25421n;
        org.telegram.ui.ActionBar.e6 e6Var = yu0Var.F1;
        Context context = this.f25419c;
        if (i10 != 14) {
            if (i10 != 15) {
                t00 t00Var = new t00(context, e6Var);
                t00Var.setIsSingleCell(true);
                t00Var.f28018w = false;
                t00Var.setViewType(1);
                h6Var = t00Var;
            } else {
                lt0 M = yu0.M(6, yu0Var.f30367j1, context, e6Var);
                M.setLayoutParams(new s4.p0(-1, -1));
                return new s4.c1(M);
            }
        } else {
            h6Var = new org.telegram.ui.Cells.h6(context, e6Var);
        }
        return com.google.android.gms.internal.vision.e2.k(h6Var, h6Var, -1, -2);
    }
}
