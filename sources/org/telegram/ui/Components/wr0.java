package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class wr0 extends dk0 {
    public final Context f41845c;
    public final ArrayList d = new ArrayList();
    public boolean f41846e;
    public boolean f41847f;
    public boolean h;
    public int f41848n;
    public final jt0 f41849r;

    public wr0(jt0 jt0Var, Context context) {
        this.f41849r = jt0Var;
        this.f41845c = context;
    }

    @Override
    public final boolean D(v4.e1 e1Var) {
        int i7 = e1Var.f59115f;
        if (i7 != 14 && i7 != 25) {
            return false;
        }
        return true;
    }

    public final void E(long j3) {
        org.telegram.ui.ActionBar.g2 g2Var = this.f41849r.f36638y1;
        if (!this.f41846e) {
            TLRPC.TL_messages_getCommonChats tL_messages_getCommonChats = new TLRPC.TL_messages_getCommonChats();
            TLRPC.InputUser q12 = g2Var.getMessagesController().q1(F());
            tL_messages_getCommonChats.user_id = q12;
            if (q12 instanceof TLRPC.TL_inputUserEmpty) {
                return;
            }
            tL_messages_getCommonChats.limit = 100;
            tL_messages_getCommonChats.max_id = j3;
            this.f41846e = true;
            f();
            this.f41848n = g2Var.getConnectionsManager().sendRequest(tL_messages_getCommonChats, new f2(this, 11));
            g2Var.getConnectionsManager().bindRequestToGuid(this.f41848n, g2Var.getClassGuid());
        }
    }

    public final long F() {
        jt0 jt0Var = this.f41849r;
        if (org.telegram.messenger.n5.C(jt0Var.f36602m1)) {
            return jt0Var.f36638y1.getMessagesController().c1(Integer.valueOf((int) (jt0Var.f36602m1 & 4294967295L))).user_id;
        }
        return jt0Var.f36602m1;
    }

    public final boolean G() {
        TLRPC.User c22;
        if (this.d.isEmpty() || (c22 = this.f41849r.f36638y1.getMessagesController().c2(Long.valueOf(F()))) == null || c22.bot || c22.self || org.telegram.messenger.p10.y(c22)) {
            return false;
        }
        return true;
    }

    @Override
    public final int b() {
        ArrayList arrayList = this.d;
        if (arrayList.isEmpty() && !this.f41846e) {
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
        if (arrayList.isEmpty() && !this.f41846e) {
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
    public final void t(v4.e1 e1Var, int i7) {
        int i10 = e1Var.f59115f;
        View view = e1Var.f59111a;
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
            ((org.telegram.ui.Cells.y4) view).b(2131232178, 5, org.telegram.messenger.hd.a0(null, null, 2131751733, org.telegram.messenger.p10.k(this.f41849r.f36638y1.getMessagesController().c2(Long.valueOf(F())), true)), true);
        }
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Cells.h6 h6Var;
        jt0 jt0Var = this.f41849r;
        org.telegram.ui.ActionBar.h6 h6Var2 = jt0Var.I1;
        Context context = this.f41845c;
        if (i7 != 14) {
            if (i7 != 15) {
                if (i7 != 25) {
                    yz yzVar = new yz(context, h6Var2);
                    yzVar.setIsSingleCell(true);
                    yzVar.f42563x = false;
                    yzVar.setViewType(1);
                    h6Var = yzVar;
                } else {
                    org.telegram.ui.Cells.y4 y4Var = new org.telegram.ui.Cells.y4(context);
                    y4Var.a(org.telegram.ui.ActionBar.m6.f29682v6, org.telegram.ui.ActionBar.m6.f29663u6);
                    y4Var.setTextLeft(org.telegram.messenger.g0.C);
                    h6Var = y4Var;
                }
            } else {
                y3 X = jt0.X(6, jt0Var.f36602m1, context, h6Var2);
                X.setLayoutParams(new v4.p0(-1, -1));
                return new v4.e1(X);
            }
        } else {
            h6Var = new org.telegram.ui.Cells.h6(context, h6Var2);
        }
        return i5.c.q(h6Var, h6Var, -1, -2);
    }
}
