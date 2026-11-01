package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class ms0 extends tk0 {
    public final Context f28553c;
    public final ArrayList d = new ArrayList();
    public boolean e;
    public boolean f28554f;
    public boolean h;
    public final au0 f28555n;

    public ms0(au0 au0Var, Context context) {
        this.f28555n = au0Var;
        this.f28553c = context;
    }

    public static void E(ms0 ms0Var, long j10) {
        au0 au0Var = ms0Var.f28555n;
        if (!ms0Var.e) {
            TLRPC.TL_messages_getCommonChats tL_messages_getCommonChats = new TLRPC.TL_messages_getCommonChats();
            long j11 = au0Var.l1;
            org.telegram.ui.ActionBar.k2 k2Var = au0Var.f24568x1;
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
            ms0Var.e = true;
            ms0Var.f();
            k2Var.getConnectionsManager().bindRequestToGuid(k2Var.getConnectionsManager().sendRequest(tL_messages_getCommonChats, new x1(ms0Var, 11)), k2Var.getClassGuid());
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
        if (c1Var.f47912f == 14) {
            View view = c1Var.f47909a;
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
        au0 au0Var = this.f28555n;
        org.telegram.ui.ActionBar.p6 p6Var = au0Var.H1;
        Context context = this.f28553c;
        if (i10 != 14) {
            if (i10 != 15) {
                zz zzVar = new zz(context, p6Var);
                zzVar.setIsSingleCell(true);
                zzVar.f33280x = false;
                zzVar.setViewType(1);
                k6Var = zzVar;
            } else {
                p3 W = au0.W(6, au0Var.l1, context, p6Var);
                W.setLayoutParams(new s4.o0(-1, -1));
                return new s4.c1(W);
            }
        } else {
            k6Var = new org.telegram.ui.Cells.k6(context, p6Var);
        }
        return sc.e.o(k6Var, k6Var, -1, -2);
    }
}
