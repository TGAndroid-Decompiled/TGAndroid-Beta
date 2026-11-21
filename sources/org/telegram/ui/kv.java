package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class kv extends jg.m {
    public final bx f49388c0;
    public final cx f49389d0;

    public kv(cx cxVar, cx cxVar2, Context context, int i7, int i10, boolean z10, ArrayList arrayList, int i11, TLRPC.RequestPeerType requestPeerType, bx bxVar) {
        super(cxVar2, context, i7, i10, z10, arrayList, i11, requestPeerType);
        this.f49389d0 = cxVar;
        this.f49388c0 = bxVar;
    }

    @Override
    public final void K() {
        this.f49389d0.presentFragment(new k());
    }

    @Override
    public final void L() {
        int i7;
        cx cxVar = this.f49389d0;
        org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, cxVar.getParentActivity(), null);
        TLRPC.RequestPeerType requestPeerType = cxVar.H;
        if (requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast) {
            Bundle f10 = p5.c.f(0, "step");
            Boolean bool = cxVar.H.has_username;
            if (bool != null) {
                f10.putBoolean("forcePublic", bool.booleanValue());
            }
            ad adVar = new ad(f10);
            adVar.f45599v0 = new m6(cxVar, adVar, t1Var, 2);
            cxVar.presentFragment(adVar);
        } else if (requestPeerType instanceof TLRPC.TL_requestPeerTypeChat) {
            Bundle bundle = new Bundle();
            Boolean bool2 = cxVar.H.bot_participant;
            bundle.putLongArray("result", (bool2 == null || !bool2.booleanValue()) ? new long[]{cxVar.getUserConfig().e()} : new long[]{cxVar.getUserConfig().e(), cxVar.I});
            Boolean bool3 = cxVar.H.forum;
            if (bool3 != null && bool3.booleanValue()) {
                i7 = 5;
            } else {
                i7 = 4;
            }
            bundle.putInt("chatType", i7);
            bundle.putBoolean("canToggleTopics", false);
            f50 f50Var = new f50(bundle);
            f50Var.Z = new cw(cxVar, t1Var);
            cxVar.presentFragment(f50Var);
        }
    }

    @Override
    public final void M(TLRPC.User user) {
        int i7;
        i7 = ((org.telegram.ui.ActionBar.g2) this.f49389d0).currentAccount;
        org.telegram.messenger.mp.u1(i7).E3(null, user, null, 0, null, false, false);
    }

    @Override
    public final boolean T() {
        if (this.f49389d0.T0 == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void f() {
        int i7;
        b();
        int i10 = bx.M;
        try {
            super.f();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        cx cxVar = this.f49389d0;
        if (cxVar.T0 == 15) {
            org.telegram.ui.ActionBar.q0 q0Var = cxVar.f46743k0;
            if (this.V) {
                i7 = 8;
            } else {
                i7 = 0;
            }
            q0Var.setVisibility(i7);
        }
    }

    @Override
    public final void l(org.telegram.ui.Cells.u2 u2Var) {
        bx bxVar = this.f49388c0;
        bxVar.f46321a.getClass();
        this.f49389d0.F4(u2Var, RecyclerView.R(u2Var), 0.0f, bxVar.d);
    }

    @Override
    public final void r(org.telegram.ui.Cells.u2 u2Var) {
        int i7;
        if (u2Var.getMessage() != null) {
            cx cxVar = this.f49389d0;
            i7 = ((org.telegram.ui.ActionBar.g2) cxVar).currentAccount;
            TLRPC.TL_forumTopic f10 = cxVar.getMessagesController().f25797t7.f(-u2Var.getDialogId(), org.telegram.messenger.fj.b2(i7, u2Var.getMessage().f23993k, true, false));
            if (f10 != null) {
                if (cxVar.f46758n2) {
                    cxVar.a4(u2Var.getDialogId(), f10.f28483id, false, null);
                } else {
                    qg.c.n(cxVar, -u2Var.getDialogId(), f10, 0);
                }
            }
        }
    }
}
