package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.tgnet.TLRPC;
public final class au0 extends yl0 {
    public final Context f24661c;
    public final ArrayList d = new ArrayList();
    public boolean f24662e;
    public boolean f24663f;
    public boolean h;
    public final pv0 f24664n;

    public au0(pv0 pv0Var, Context context) {
        this.f24664n = pv0Var;
        this.f24661c = context;
    }

    public static void E(au0 au0Var, long j3) {
        pv0 pv0Var = au0Var.f24664n;
        if (!au0Var.f24662e) {
            TLRPC.TL_messages_getCommonChats tL_messages_getCommonChats = new TLRPC.TL_messages_getCommonChats();
            long j10 = pv0Var.f29776j1;
            org.telegram.ui.ActionBar.n2 n2Var = pv0Var.f29801v1;
            if (DialogObject.isEncryptedDialog(j10)) {
                j10 = org.telegram.messenger.f0.l(n2Var.getMessagesController(), j10).user_id;
            }
            TLRPC.InputUser inputUser = n2Var.getMessagesController().getInputUser(j10);
            tL_messages_getCommonChats.user_id = inputUser;
            if (inputUser instanceof TLRPC.TL_inputUserEmpty) {
                return;
            }
            tL_messages_getCommonChats.limit = 100;
            tL_messages_getCommonChats.max_id = j3;
            au0Var.f24662e = true;
            au0Var.l();
            n2Var.getConnectionsManager().bindRequestToGuid(n2Var.getConnectionsManager().sendRequest(tL_messages_getCommonChats, new y1(au0Var, 12)), n2Var.getClassGuid());
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
        if (arrayList.isEmpty() && !this.f24662e) {
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
        if (arrayList.isEmpty() && !this.f24662e) {
            return 15;
        }
        if (i10 < arrayList.size()) {
            return 14;
        }
        return 16;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        if (c1Var.f46528f == 14) {
            View view = c1Var.f46524a;
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
        pv0 pv0Var = this.f24664n;
        org.telegram.ui.ActionBar.d6 d6Var = pv0Var.F1;
        Context context = this.f24661c;
        if (i10 != 14) {
            if (i10 != 15) {
                w00 w00Var = new w00(context, d6Var);
                w00Var.setIsSingleCell(true);
                w00Var.f32417w = false;
                w00Var.setViewType(1);
                i6Var = w00Var;
            } else {
                cu0 M = pv0.M(6, pv0Var.f29776j1, context, d6Var);
                M.setLayoutParams(new s4.p0(-1, -1));
                return new s4.c1(M);
            }
        } else {
            i6Var = new org.telegram.ui.Cells.i6(context, d6Var);
        }
        return com.google.android.gms.internal.vision.e2.k(i6Var, i6Var, -1, -2);
    }
}
