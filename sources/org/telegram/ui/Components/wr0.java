package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class wr0 extends dk0 {
    public final Context f41882c;
    public final ArrayList d = new ArrayList();
    public boolean f41883e;
    public boolean f41884f;
    public boolean h;
    public int f41885n;
    public final jt0 f41886r;

    public wr0(jt0 jt0Var, Context context) {
        this.f41886r = jt0Var;
        this.f41882c = context;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        int i7 = f1Var.f59169f;
        if (i7 != 14 && i7 != 25) {
            return false;
        }
        return true;
    }

    public final void E(long j3) {
        org.telegram.ui.ActionBar.g2 g2Var = this.f41886r.f36684y1;
        if (!this.f41883e) {
            TLRPC.TL_messages_getCommonChats tL_messages_getCommonChats = new TLRPC.TL_messages_getCommonChats();
            TLRPC.InputUser q12 = g2Var.getMessagesController().q1(F());
            tL_messages_getCommonChats.user_id = q12;
            if (q12 instanceof TLRPC.TL_inputUserEmpty) {
                return;
            }
            tL_messages_getCommonChats.limit = 100;
            tL_messages_getCommonChats.max_id = j3;
            this.f41883e = true;
            f();
            this.f41885n = g2Var.getConnectionsManager().sendRequest(tL_messages_getCommonChats, new f2(this, 11));
            g2Var.getConnectionsManager().bindRequestToGuid(this.f41885n, g2Var.getClassGuid());
        }
    }

    public final long F() {
        jt0 jt0Var = this.f41886r;
        if (org.telegram.messenger.n5.C(jt0Var.f36648m1)) {
            return jt0Var.f36684y1.getMessagesController().c1(Integer.valueOf((int) (jt0Var.f36648m1 & 4294967295L))).user_id;
        }
        return jt0Var.f36648m1;
    }

    public final boolean G() {
        TLRPC.User c22;
        if (this.d.isEmpty() || (c22 = this.f41886r.f36684y1.getMessagesController().c2(Long.valueOf(F()))) == null || c22.bot || c22.self || org.telegram.messenger.p10.y(c22)) {
            return false;
        }
        return true;
    }

    @Override
    public final int b() {
        ArrayList arrayList = this.d;
        if (arrayList.isEmpty() && !this.f41883e) {
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
        if (arrayList.isEmpty() && !this.f41883e) {
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
        int i10 = f1Var.f59169f;
        View view = f1Var.f59165a;
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
            ((org.telegram.ui.Cells.y4) view).b(2131232178, 5, org.telegram.messenger.hd.a0(null, null, 2131751733, org.telegram.messenger.p10.k(this.f41886r.f36684y1.getMessagesController().c2(Long.valueOf(F())), true)), true);
        }
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Cells.h6 h6Var;
        jt0 jt0Var = this.f41886r;
        org.telegram.ui.ActionBar.h6 h6Var2 = jt0Var.I1;
        Context context = this.f41882c;
        if (i7 != 14) {
            if (i7 != 15) {
                if (i7 != 25) {
                    yz yzVar = new yz(context, h6Var2);
                    yzVar.setIsSingleCell(true);
                    yzVar.f42606x = false;
                    yzVar.setViewType(1);
                    h6Var = yzVar;
                } else {
                    org.telegram.ui.Cells.y4 y4Var = new org.telegram.ui.Cells.y4(context);
                    y4Var.a(org.telegram.ui.ActionBar.m6.f29716v6, org.telegram.ui.ActionBar.m6.f29697u6);
                    y4Var.setTextLeft(org.telegram.messenger.g0.C);
                    h6Var = y4Var;
                }
            } else {
                y3 X = jt0.X(6, jt0Var.f36648m1, context, h6Var2);
                X.setLayoutParams(new v4.q0(-1, -1));
                return new v4.f1(X);
            }
        } else {
            h6Var = new org.telegram.ui.Cells.h6(context, h6Var2);
        }
        return i5.c.q(h6Var, h6Var, -1, -2);
    }
}
