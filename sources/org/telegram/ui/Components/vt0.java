package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.tgnet.TLRPC;
public final class vt0 extends wl0 {
    public final Context f29759c;
    public final ArrayList d = new ArrayList();
    public boolean e;
    public boolean f29760f;
    public boolean h;
    public final kv0 f29761n;

    public vt0(kv0 kv0Var, Context context) {
        this.f29761n = kv0Var;
        this.f29759c = context;
    }

    public static void E(vt0 vt0Var, long j3) {
        kv0 kv0Var = vt0Var.f29761n;
        if (!vt0Var.e) {
            TLRPC.TL_messages_getCommonChats tL_messages_getCommonChats = new TLRPC.TL_messages_getCommonChats();
            long j10 = kv0Var.f25841j1;
            org.telegram.ui.ActionBar.m2 m2Var = kv0Var.f25866v1;
            if (DialogObject.isEncryptedDialog(j10)) {
                j10 = org.telegram.messenger.f0.l(m2Var.getMessagesController(), j10).user_id;
            }
            TLRPC.InputUser inputUser = m2Var.getMessagesController().getInputUser(j10);
            tL_messages_getCommonChats.user_id = inputUser;
            if (inputUser instanceof TLRPC.TL_inputUserEmpty) {
                return;
            }
            tL_messages_getCommonChats.limit = 100;
            tL_messages_getCommonChats.max_id = j3;
            vt0Var.e = true;
            vt0Var.l();
            m2Var.getConnectionsManager().bindRequestToGuid(m2Var.getConnectionsManager().sendRequest(tL_messages_getCommonChats, new y1(vt0Var, 12)), m2Var.getClassGuid());
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
        if (c1Var.f42962f == 14) {
            View view = c1Var.f42959a;
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
        kv0 kv0Var = this.f29761n;
        org.telegram.ui.ActionBar.d6 d6Var = kv0Var.F1;
        Context context = this.f29759c;
        if (i10 != 14) {
            if (i10 != 15) {
                v00 v00Var = new v00(context, d6Var);
                v00Var.setIsSingleCell(true);
                v00Var.f28952w = false;
                v00Var.setViewType(1);
                i6Var = v00Var;
            } else {
                xt0 M = kv0.M(6, kv0Var.f25841j1, context, d6Var);
                M.setLayoutParams(new s4.p0(-1, -1));
                return new s4.c1(M);
            }
        } else {
            i6Var = new org.telegram.ui.Cells.i6(context, d6Var);
        }
        return com.google.android.gms.internal.vision.e2.k(i6Var, i6Var, -1, -2);
    }
}
