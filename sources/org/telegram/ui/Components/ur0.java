package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class ur0 extends bk0 {
    public final Context f40404c;
    public final ArrayList d = new ArrayList();
    public boolean f40405e;
    public boolean f40406f;
    public boolean h;
    public int f40407n;
    public final gt0 f40408r;

    public ur0(gt0 gt0Var, Context context) {
        this.f40408r = gt0Var;
        this.f40404c = context;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        int i7 = f1Var.f59127f;
        if (i7 != 14 && i7 != 25) {
            return false;
        }
        return true;
    }

    public final void E(long j3) {
        org.telegram.ui.ActionBar.h2 h2Var = this.f40408r.f35642y1;
        if (!this.f40405e) {
            TLRPC.TL_messages_getCommonChats tL_messages_getCommonChats = new TLRPC.TL_messages_getCommonChats();
            TLRPC.InputUser q12 = h2Var.getMessagesController().q1(F());
            tL_messages_getCommonChats.user_id = q12;
            if (q12 instanceof TLRPC.TL_inputUserEmpty) {
                return;
            }
            tL_messages_getCommonChats.limit = 100;
            tL_messages_getCommonChats.max_id = j3;
            this.f40405e = true;
            f();
            this.f40407n = h2Var.getConnectionsManager().sendRequest(tL_messages_getCommonChats, new e2(this, 11));
            h2Var.getConnectionsManager().bindRequestToGuid(this.f40407n, h2Var.getClassGuid());
        }
    }

    public final long F() {
        gt0 gt0Var = this.f40408r;
        if (org.telegram.messenger.n5.C(gt0Var.f35606m1)) {
            return gt0Var.f35642y1.getMessagesController().c1(Integer.valueOf((int) (gt0Var.f35606m1 & 4294967295L))).user_id;
        }
        return gt0Var.f35606m1;
    }

    public final boolean G() {
        TLRPC.User c22;
        if (this.d.isEmpty() || (c22 = this.f40408r.f35642y1.getMessagesController().c2(Long.valueOf(F()))) == null || c22.bot || c22.self || org.telegram.messenger.o10.y(c22)) {
            return false;
        }
        return true;
    }

    @Override
    public final int b() {
        ArrayList arrayList = this.d;
        if (arrayList.isEmpty() && !this.f40405e) {
            return 1;
        }
        int size = arrayList.size();
        if (!arrayList.isEmpty()) {
            if (G()) {
                size++;
            }
            if (!this.h) {
                return size + 1;
            }
            return size;
        }
        return size;
    }

    @Override
    public final int d(int i7) {
        ArrayList arrayList = this.d;
        if (arrayList.isEmpty() && !this.f40405e) {
            return 15;
        }
        if (G()) {
            if (i7 == 0) {
                return 25;
            }
            i7--;
        }
        if (i7 < arrayList.size()) {
            return 14;
        }
        return 16;
    }

    @Override
    public final void t(v4.f1 f1Var, int i7) {
        int i10 = f1Var.f59127f;
        View view = f1Var.f59123a;
        boolean z10 = false;
        if (i10 == 14) {
            if (view instanceof org.telegram.ui.Cells.h6) {
                org.telegram.ui.Cells.h6 h6Var = (org.telegram.ui.Cells.h6) view;
                if (G()) {
                    i7--;
                }
                ArrayList arrayList = this.d;
                h6Var.x((TLRPC.Chat) arrayList.get(i7), null, null, null, false, false);
                if (i7 != arrayList.size() - 1 || !this.h) {
                    z10 = true;
                }
                h6Var.N = z10;
            }
        } else if (i10 == 25 && (view instanceof org.telegram.ui.Cells.y4)) {
            ((org.telegram.ui.Cells.y4) view).b(2131232178, 5, org.telegram.messenger.gd.a0(null, null, 2131751734, org.telegram.messenger.o10.k(this.f40408r.f35642y1.getMessagesController().c2(Long.valueOf(F())), true)), true);
        }
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Cells.h6 h6Var;
        gt0 gt0Var = this.f40408r;
        org.telegram.ui.ActionBar.i6 i6Var = gt0Var.I1;
        Context context = this.f40404c;
        if (i7 != 14) {
            if (i7 != 15) {
                if (i7 != 25) {
                    wz wzVar = new wz(context, i6Var);
                    wzVar.setIsSingleCell(true);
                    wzVar.f41829x = false;
                    wzVar.setViewType(1);
                    h6Var = wzVar;
                } else {
                    org.telegram.ui.Cells.y4 y4Var = new org.telegram.ui.Cells.y4(context);
                    y4Var.a(org.telegram.ui.ActionBar.n6.f29729v6, org.telegram.ui.ActionBar.n6.f29710u6);
                    y4Var.setTextLeft(org.telegram.messenger.g0.C);
                    h6Var = y4Var;
                }
            } else {
                x3 X = gt0.X(6, gt0Var.f35606m1, context, i6Var);
                X.setLayoutParams(new v4.q0(-1, -1));
                return new v4.f1(X);
            }
        } else {
            h6Var = new org.telegram.ui.Cells.h6(context, i6Var);
        }
        return i5.c.q(h6Var, h6Var, -1, -2);
    }
}
