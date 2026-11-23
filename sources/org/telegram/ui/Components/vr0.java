package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class vr0 extends dk0 {
    public final Context f41416c;
    public final ArrayList d = new ArrayList();
    public boolean f41417e;
    public boolean f41418f;
    public boolean h;
    public int f41419n;
    public final it0 f41420r;

    public vr0(it0 it0Var, Context context) {
        this.f41420r = it0Var;
        this.f41416c = context;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        int i7 = f1Var.f59249f;
        if (i7 != 14 && i7 != 25) {
            return false;
        }
        return true;
    }

    public final void E(long j3) {
        org.telegram.ui.ActionBar.g2 g2Var = this.f41420r.f36166y1;
        if (!this.f41417e) {
            TLRPC.TL_messages_getCommonChats tL_messages_getCommonChats = new TLRPC.TL_messages_getCommonChats();
            TLRPC.InputUser q12 = g2Var.getMessagesController().q1(F());
            tL_messages_getCommonChats.user_id = q12;
            if (q12 instanceof TLRPC.TL_inputUserEmpty) {
                return;
            }
            tL_messages_getCommonChats.limit = 100;
            tL_messages_getCommonChats.max_id = j3;
            this.f41417e = true;
            f();
            this.f41419n = g2Var.getConnectionsManager().sendRequest(tL_messages_getCommonChats, new e2(this, 11));
            g2Var.getConnectionsManager().bindRequestToGuid(this.f41419n, g2Var.getClassGuid());
        }
    }

    public final long F() {
        it0 it0Var = this.f41420r;
        if (org.telegram.messenger.n5.C(it0Var.f36130m1)) {
            return it0Var.f36166y1.getMessagesController().c1(Integer.valueOf((int) (it0Var.f36130m1 & 4294967295L))).user_id;
        }
        return it0Var.f36130m1;
    }

    public final boolean G() {
        TLRPC.User c22;
        if (this.d.isEmpty() || (c22 = this.f41420r.f36166y1.getMessagesController().c2(Long.valueOf(F()))) == null || c22.bot || c22.self || org.telegram.messenger.n10.y(c22)) {
            return false;
        }
        return true;
    }

    @Override
    public final int b() {
        ArrayList arrayList = this.d;
        if (arrayList.isEmpty() && !this.f41417e) {
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
        if (arrayList.isEmpty() && !this.f41417e) {
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
        int i10 = f1Var.f59249f;
        View view = f1Var.f59245a;
        boolean z10 = false;
        if (i10 == 14) {
            if (view instanceof org.telegram.ui.Cells.g6) {
                org.telegram.ui.Cells.g6 g6Var = (org.telegram.ui.Cells.g6) view;
                if (G()) {
                    i7--;
                }
                ArrayList arrayList = this.d;
                g6Var.z((TLRPC.Chat) arrayList.get(i7), null, null, null, false, false);
                if (i7 != arrayList.size() - 1 || !this.h) {
                    z10 = true;
                }
                g6Var.N = z10;
            }
        } else if (i10 == 25 && (view instanceof org.telegram.ui.Cells.y4)) {
            ((org.telegram.ui.Cells.y4) view).b(2131232181, 5, org.telegram.messenger.gd.a0(null, null, 2131751733, org.telegram.messenger.n10.k(this.f41420r.f36166y1.getMessagesController().c2(Long.valueOf(F())), true)), true);
        }
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Cells.g6 g6Var;
        it0 it0Var = this.f41420r;
        org.telegram.ui.ActionBar.i6 i6Var = it0Var.I1;
        Context context = this.f41416c;
        if (i7 != 14) {
            if (i7 != 15) {
                if (i7 != 25) {
                    vz vzVar = new vz(context, i6Var);
                    vzVar.setIsSingleCell(true);
                    vzVar.f41457x = false;
                    vzVar.setViewType(1);
                    g6Var = vzVar;
                } else {
                    org.telegram.ui.Cells.y4 y4Var = new org.telegram.ui.Cells.y4(context);
                    y4Var.a(org.telegram.ui.ActionBar.n6.f29786v6, org.telegram.ui.ActionBar.n6.f29767u6);
                    y4Var.setTextLeft(org.telegram.messenger.g0.C);
                    g6Var = y4Var;
                }
            } else {
                x3 X = it0.X(6, it0Var.f36130m1, context, i6Var);
                X.setLayoutParams(new v4.q0(-1, -1));
                return new v4.f1(X);
            }
        } else {
            g6Var = new org.telegram.ui.Cells.g6(context, i6Var);
        }
        return i5.c.q(g6Var, g6Var, -1, -2);
    }
}
