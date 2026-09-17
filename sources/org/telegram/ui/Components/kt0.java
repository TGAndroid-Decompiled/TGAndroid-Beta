package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.tgnet.TLRPC;
public final class kt0 extends ll0 {
    public final Context f25682c;
    public final ArrayList d = new ArrayList();
    public boolean e;
    public boolean f25683f;
    public boolean h;
    public final zu0 f25684n;

    public kt0(zu0 zu0Var, Context context) {
        this.f25684n = zu0Var;
        this.f25682c = context;
    }

    public static void E(kt0 kt0Var, long j3) {
        zu0 zu0Var = kt0Var.f25684n;
        if (!kt0Var.e) {
            TLRPC.TL_messages_getCommonChats tL_messages_getCommonChats = new TLRPC.TL_messages_getCommonChats();
            long j10 = zu0Var.f30631j1;
            org.telegram.ui.ActionBar.o2 o2Var = zu0Var.f30656v1;
            if (DialogObject.isEncryptedDialog(j10)) {
                j10 = org.telegram.messenger.w1.m(o2Var.getMessagesController(), j10).user_id;
            }
            TLRPC.InputUser inputUser = o2Var.getMessagesController().getInputUser(j10);
            tL_messages_getCommonChats.user_id = inputUser;
            if (inputUser instanceof TLRPC.TL_inputUserEmpty) {
                return;
            }
            tL_messages_getCommonChats.limit = 100;
            tL_messages_getCommonChats.max_id = j3;
            kt0Var.e = true;
            kt0Var.l();
            o2Var.getConnectionsManager().bindRequestToGuid(o2Var.getConnectionsManager().sendRequest(tL_messages_getCommonChats, new x1(kt0Var, 12)), o2Var.getClassGuid());
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
        if (c1Var.f42700f == 14) {
            View view = c1Var.f42697a;
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
        zu0 zu0Var = this.f25684n;
        org.telegram.ui.ActionBar.f6 f6Var = zu0Var.F1;
        Context context = this.f25682c;
        if (i10 != 14) {
            if (i10 != 15) {
                t00 t00Var = new t00(context, f6Var);
                t00Var.setIsSingleCell(true);
                t00Var.f27976w = false;
                t00Var.setViewType(1);
                h6Var = t00Var;
            } else {
                mt0 M = zu0.M(6, zu0Var.f30631j1, context, f6Var);
                M.setLayoutParams(new s4.p0(-1, -1));
                return new s4.c1(M);
            }
        } else {
            h6Var = new org.telegram.ui.Cells.h6(context, f6Var);
        }
        return com.google.android.gms.internal.vision.e2.k(h6Var, h6Var, -1, -2);
    }
}
