package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class ls0 extends sk0 {
    public final Context f28179c;
    public final ArrayList d = new ArrayList();
    public boolean e;
    public boolean f28180f;
    public boolean h;
    public final zt0 f28181n;

    public ls0(zt0 zt0Var, Context context) {
        this.f28181n = zt0Var;
        this.f28179c = context;
    }

    public static void E(ls0 ls0Var, long j10) {
        zt0 zt0Var = ls0Var.f28181n;
        if (!ls0Var.e) {
            TLRPC.TL_messages_getCommonChats tL_messages_getCommonChats = new TLRPC.TL_messages_getCommonChats();
            long j11 = zt0Var.l1;
            org.telegram.ui.ActionBar.k2 k2Var = zt0Var.f33240x1;
            if (org.telegram.messenger.o5.C(j11)) {
                j11 = k2Var.getMessagesController().Z0(Integer.valueOf((int) (j11 & 4294967295L))).user_id;
            }
            TLRPC.InputUser n12 = k2Var.getMessagesController().n1(j11);
            tL_messages_getCommonChats.user_id = n12;
            if (n12 instanceof TLRPC.TL_inputUserEmpty) {
                return;
            }
            tL_messages_getCommonChats.limit = 100;
            tL_messages_getCommonChats.max_id = j10;
            ls0Var.e = true;
            ls0Var.f();
            k2Var.getConnectionsManager().bindRequestToGuid(k2Var.getConnectionsManager().sendRequest(tL_messages_getCommonChats, new x1(ls0Var, 11)), k2Var.getClassGuid());
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
    public final int b() {
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
    public final int d(int i10) {
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
    public final void t(s4.c1 c1Var, int i10) {
        if (c1Var.f47901f == 14) {
            View view = c1Var.f47898a;
            if (view instanceof org.telegram.ui.Cells.k6) {
                org.telegram.ui.Cells.k6 k6Var = (org.telegram.ui.Cells.k6) view;
                ArrayList arrayList = this.d;
                k6Var.z((TLRPC.Chat) arrayList.get(i10), null, null, null, false, false);
                boolean z10 = true;
                if (i10 == arrayList.size() - 1 && this.h) {
                    z10 = false;
                }
                k6Var.M = z10;
            }
        }
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.k6 k6Var;
        zt0 zt0Var = this.f28181n;
        org.telegram.ui.ActionBar.p6 p6Var = zt0Var.H1;
        Context context = this.f28179c;
        if (i10 != 14) {
            if (i10 != 15) {
                zz zzVar = new zz(context, p6Var);
                zzVar.setIsSingleCell(true);
                zzVar.f33274x = false;
                zzVar.setViewType(1);
                k6Var = zzVar;
            } else {
                p3 V = zt0.V(6, zt0Var.l1, context, p6Var);
                V.setLayoutParams(new s4.o0(-1, -1));
                return new s4.c1(V);
            }
        } else {
            k6Var = new org.telegram.ui.Cells.k6(context, p6Var);
        }
        return sc.e.o(k6Var, k6Var, -1, -2);
    }
}
