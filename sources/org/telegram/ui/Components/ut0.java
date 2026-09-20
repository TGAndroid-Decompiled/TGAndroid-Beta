package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.tgnet.TLRPC;
public final class ut0 extends ul0 {
    public final Context f28853c;
    public final ArrayList d = new ArrayList();
    public boolean e;
    public boolean f28854f;
    public boolean h;
    public final jv0 f28855n;

    public ut0(jv0 jv0Var, Context context) {
        this.f28855n = jv0Var;
        this.f28853c = context;
    }

    public static void E(ut0 ut0Var, long j3) {
        jv0 jv0Var = ut0Var.f28855n;
        if (!ut0Var.e) {
            TLRPC.TL_messages_getCommonChats tL_messages_getCommonChats = new TLRPC.TL_messages_getCommonChats();
            long j10 = jv0Var.f25503j1;
            org.telegram.ui.ActionBar.n2 n2Var = jv0Var.f25528v1;
            if (DialogObject.isEncryptedDialog(j10)) {
                j10 = org.telegram.messenger.l0.k(n2Var.getMessagesController(), j10).user_id;
            }
            TLRPC.InputUser inputUser = n2Var.getMessagesController().getInputUser(j10);
            tL_messages_getCommonChats.user_id = inputUser;
            if (inputUser instanceof TLRPC.TL_inputUserEmpty) {
                return;
            }
            tL_messages_getCommonChats.limit = 100;
            tL_messages_getCommonChats.max_id = j3;
            ut0Var.e = true;
            ut0Var.l();
            n2Var.getConnectionsManager().bindRequestToGuid(n2Var.getConnectionsManager().sendRequest(tL_messages_getCommonChats, new x1(ut0Var, 12)), n2Var.getClassGuid());
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
        if (c1Var.f42977f == 14) {
            View view = c1Var.f42974a;
            if (view instanceof org.telegram.ui.Cells.j6) {
                org.telegram.ui.Cells.j6 j6Var = (org.telegram.ui.Cells.j6) view;
                ArrayList arrayList = this.d;
                j6Var.t((TLRPC.Chat) arrayList.get(i10), null, null, null, false, false);
                boolean z10 = true;
                if (i10 == arrayList.size() - 1 && this.h) {
                    z10 = false;
                }
                j6Var.M = z10;
            }
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.j6 j6Var;
        jv0 jv0Var = this.f28855n;
        org.telegram.ui.ActionBar.f6 f6Var = jv0Var.F1;
        Context context = this.f28853c;
        if (i10 != 14) {
            if (i10 != 15) {
                t00 t00Var = new t00(context, f6Var);
                t00Var.setIsSingleCell(true);
                t00Var.f28252w = false;
                t00Var.setViewType(1);
                j6Var = t00Var;
            } else {
                wt0 M = jv0.M(6, jv0Var.f25503j1, context, f6Var);
                M.setLayoutParams(new s4.p0(-1, -1));
                return new s4.c1(M);
            }
        } else {
            j6Var = new org.telegram.ui.Cells.j6(context, f6Var);
        }
        return com.google.android.gms.internal.vision.e2.k(j6Var, j6Var, -1, -2);
    }
}
