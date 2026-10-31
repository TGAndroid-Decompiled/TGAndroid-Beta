package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class jj implements org.telegram.messenger.q20 {
    public final int f27391a;
    public final boolean f27392b;
    public final int f27393c;
    public final Object d;
    public final Object e;

    public jj(int i10, int i11, Object obj, Object obj2, boolean z10) {
        this.f27391a = i11;
        this.d = obj;
        this.e = obj2;
        this.f27392b = z10;
        this.f27393c = i10;
    }

    @Override
    public final void a(Object obj) {
        long j10;
        String str;
        org.telegram.messenger.c accountInstance;
        boolean z10;
        switch (this.f27391a) {
            case 0:
                ((xj) this.d).Q.o((ArrayList) this.e, this.f27392b, this.f27393c, ((Long) obj).longValue());
                return;
            case 1:
                TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) this.e;
                Long l4 = (Long) obj;
                th.z2 z2Var = ((th.w1) this.d).f49559a;
                TLRPC.User user = z2Var.M2.getAdapter().f55672w0;
                if (user != null) {
                    j10 = user.f19942id;
                } else {
                    j10 = 0;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("id", botInlineResult.f19791id);
                hashMap.put("query_id", "" + botInlineResult.query_id);
                hashMap.put("bot", "" + j10);
                TLRPC.User user2 = z2Var.M2.getAdapter().f55672w0;
                if (user2 == null) {
                    str = "";
                } else {
                    str = user2.username;
                }
                hashMap.put("bot_name", str);
                org.telegram.ui.ActionBar.k2 k2Var = z2Var.f49755s0.f49303f;
                accountInstance = z2Var.getAccountInstance();
                long j11 = j10;
                org.telegram.messenger.qz.S(this.f27393c, z2Var.f49726k1, 0L, l4.longValue(), hashMap, accountInstance, null, null, null, botInlineResult, z2Var.f49776x1.f49661a, k2Var, null, this.f27392b);
                z2Var.K1.setFieldText("");
                if (l4.longValue() <= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                z2Var.i0(z10);
                org.telegram.messenger.ui.b0(z2Var.f49730l2).v0(j11, false);
                return;
            default:
                th.r4 r4Var = (th.r4) this.d;
                List list = (List) this.e;
                Long l10 = (Long) obj;
                th.u4 u4Var = r4Var.f49644q;
                TLObject e22 = org.telegram.messenger.vp.r1(r4Var.f49633c).e2(r4Var.D);
                r4Var.G = false;
                if (e22 != null) {
                    r4Var.q(this.f27393c, list, this.f27392b);
                    return;
                }
                r4Var.J = 0;
                r4Var.H = "";
                org.telegram.messenger.i0.r(u4Var);
                org.telegram.messenger.i0.g3(u4Var);
                return;
        }
    }

    public jj(th.r4 r4Var, boolean z10, int i10, List list) {
        this.f27391a = 2;
        this.d = r4Var;
        this.f27392b = z10;
        this.f27393c = i10;
        this.e = list;
    }
}
