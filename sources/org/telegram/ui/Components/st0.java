package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.tgnet.TLRPC;
public final class st0 extends ul0 {
    public final Context f27213c;
    public final ArrayList d = new ArrayList();
    public boolean e;
    public boolean f27214f;
    public boolean h;
    public final iv0 f27215n;

    public st0(iv0 iv0Var, Context context) {
        this.f27215n = iv0Var;
        this.f27213c = context;
    }

    public static void E(st0 st0Var, long j3) {
        iv0 iv0Var = st0Var.f27215n;
        if (!st0Var.e) {
            TLRPC.TL_messages_getCommonChats tL_messages_getCommonChats = new TLRPC.TL_messages_getCommonChats();
            long j10 = iv0Var.f24106j1;
            org.telegram.ui.ActionBar.p2 p2Var = iv0Var.f24131v1;
            if (DialogObject.isEncryptedDialog(j10)) {
                j10 = org.telegram.messenger.a2.m(p2Var.getMessagesController(), j10).user_id;
            }
            TLRPC.InputUser inputUser = p2Var.getMessagesController().getInputUser(j10);
            tL_messages_getCommonChats.user_id = inputUser;
            if (inputUser instanceof TLRPC.TL_inputUserEmpty) {
                return;
            }
            tL_messages_getCommonChats.limit = 100;
            tL_messages_getCommonChats.max_id = j3;
            st0Var.e = true;
            st0Var.l();
            p2Var.getConnectionsManager().bindRequestToGuid(p2Var.getConnectionsManager().sendRequest(tL_messages_getCommonChats, new z1(st0Var, 12)), p2Var.getClassGuid());
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
        if (c1Var.f41613f == 14) {
            View view = c1Var.f41610a;
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
        iv0 iv0Var = this.f27215n;
        org.telegram.ui.ActionBar.f6 f6Var = iv0Var.F1;
        Context context = this.f27213c;
        if (i10 != 14) {
            if (i10 != 15) {
                a10 a10Var = new a10(context, f6Var);
                a10Var.setIsSingleCell(true);
                a10Var.f21345w = false;
                a10Var.setViewType(1);
                j6Var = a10Var;
            } else {
                ut0 M = iv0.M(6, iv0Var.f24106j1, context, f6Var);
                M.setLayoutParams(new s4.p0(-1, -1));
                return new s4.c1(M);
            }
        } else {
            j6Var = new org.telegram.ui.Cells.j6(context, f6Var);
        }
        return com.google.android.gms.internal.vision.e2.j(j6Var, j6Var, -1, -2);
    }
}
