package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.tgnet.TLRPC;
public final class vt0 extends vl0 {
    public final Context f29756c;
    public final ArrayList d = new ArrayList();
    public boolean e;
    public boolean f29757f;
    public boolean h;
    public final kv0 f29758n;

    public vt0(kv0 kv0Var, Context context) {
        this.f29758n = kv0Var;
        this.f29756c = context;
    }

    public static void E(vt0 vt0Var, long j3) {
        kv0 kv0Var = vt0Var.f29758n;
        if (!vt0Var.e) {
            TLRPC.TL_messages_getCommonChats tL_messages_getCommonChats = new TLRPC.TL_messages_getCommonChats();
            long j10 = kv0Var.f25823j1;
            org.telegram.ui.ActionBar.n2 n2Var = kv0Var.f25848v1;
            if (DialogObject.isEncryptedDialog(j10)) {
                j10 = org.telegram.messenger.q.m(n2Var.getMessagesController(), j10).user_id;
            }
            TLRPC.InputUser inputUser = n2Var.getMessagesController().getInputUser(j10);
            tL_messages_getCommonChats.user_id = inputUser;
            if (inputUser instanceof TLRPC.TL_inputUserEmpty) {
                return;
            }
            tL_messages_getCommonChats.limit = 100;
            tL_messages_getCommonChats.max_id = j3;
            vt0Var.e = true;
            vt0Var.l();
            n2Var.getConnectionsManager().bindRequestToGuid(n2Var.getConnectionsManager().sendRequest(tL_messages_getCommonChats, new x1(vt0Var, 12)), n2Var.getClassGuid());
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
        if (c1Var.f42932f == 14) {
            View view = c1Var.f42929a;
            if (view instanceof org.telegram.ui.Cells.i6) {
                org.telegram.ui.Cells.i6 i6Var = (org.telegram.ui.Cells.i6) view;
                ArrayList arrayList = this.d;
                i6Var.t((TLRPC.Chat) arrayList.get(i10), null, null, null, false, false);
                boolean z10 = true;
                if (i10 == arrayList.size() - 1 && this.h) {
                    z10 = false;
                }
                i6Var.M = z10;
            }
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.i6 i6Var;
        kv0 kv0Var = this.f29758n;
        org.telegram.ui.ActionBar.e6 e6Var = kv0Var.F1;
        Context context = this.f29756c;
        if (i10 != 14) {
            if (i10 != 15) {
                t00 t00Var = new t00(context, e6Var);
                t00Var.setIsSingleCell(true);
                t00Var.f28272w = false;
                t00Var.setViewType(1);
                i6Var = t00Var;
            } else {
                xt0 M = kv0.M(6, kv0Var.f25823j1, context, e6Var);
                M.setLayoutParams(new s4.p0(-1, -1));
                return new s4.c1(M);
            }
        } else {
            i6Var = new org.telegram.ui.Cells.i6(context, e6Var);
        }
        return com.google.android.gms.internal.vision.e2.k(i6Var, i6Var, -1, -2);
    }
}
