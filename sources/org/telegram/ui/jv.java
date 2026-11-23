package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class jv extends jg.m {
    public final ax f49212c0;
    public final bx f49213d0;

    public jv(bx bxVar, bx bxVar2, Context context, int i7, int i10, boolean z10, ArrayList arrayList, int i11, TLRPC.RequestPeerType requestPeerType, ax axVar) {
        super(bxVar2, context, i7, i10, z10, arrayList, i11, requestPeerType);
        this.f49213d0 = bxVar;
        this.f49212c0 = axVar;
    }

    @Override
    public final void K() {
        this.f49213d0.presentFragment(new k());
    }

    @Override
    public final void L() {
        int i7;
        bx bxVar = this.f49213d0;
        org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, bxVar.getParentActivity(), null);
        TLRPC.RequestPeerType requestPeerType = bxVar.H;
        if (requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast) {
            Bundle f10 = p5.c.f(0, "step");
            Boolean bool = bxVar.H.has_username;
            if (bool != null) {
                f10.putBoolean("forcePublic", bool.booleanValue());
            }
            ad adVar = new ad(f10);
            adVar.f45686v0 = new n6(bxVar, adVar, t1Var, 2);
            bxVar.presentFragment(adVar);
        } else if (requestPeerType instanceof TLRPC.TL_requestPeerTypeChat) {
            Bundle bundle = new Bundle();
            Boolean bool2 = bxVar.H.bot_participant;
            bundle.putLongArray("result", (bool2 == null || !bool2.booleanValue()) ? new long[]{bxVar.getUserConfig().e()} : new long[]{bxVar.getUserConfig().e(), bxVar.I});
            Boolean bool3 = bxVar.H.forum;
            if (bool3 != null && bool3.booleanValue()) {
                i7 = 5;
            } else {
                i7 = 4;
            }
            bundle.putInt("chatType", i7);
            bundle.putBoolean("canToggleTopics", false);
            e50 e50Var = new e50(bundle);
            e50Var.Z = new bw(bxVar, t1Var);
            bxVar.presentFragment(e50Var);
        }
    }

    @Override
    public final void M(TLRPC.User user) {
        int i7;
        i7 = ((org.telegram.ui.ActionBar.g2) this.f49213d0).currentAccount;
        org.telegram.messenger.mp.u1(i7).E3(null, user, null, 0, null, false, false);
    }

    @Override
    public final boolean T() {
        if (this.f49213d0.T0 == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void f() {
        int i7;
        b();
        int i10 = ax.M;
        try {
            super.f();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        bx bxVar = this.f49213d0;
        if (bxVar.T0 == 15) {
            org.telegram.ui.ActionBar.q0 q0Var = bxVar.f46573k0;
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
        ax axVar = this.f49212c0;
        axVar.f45822a.getClass();
        this.f49213d0.F4(u2Var, RecyclerView.R(u2Var), 0.0f, axVar.d);
    }

    @Override
    public final void r(org.telegram.ui.Cells.u2 u2Var) {
        int i7;
        if (u2Var.getMessage() != null) {
            bx bxVar = this.f49213d0;
            i7 = ((org.telegram.ui.ActionBar.g2) bxVar).currentAccount;
            TLRPC.TL_forumTopic f10 = bxVar.getMessagesController().f25864t7.f(-u2Var.getDialogId(), org.telegram.messenger.fj.b2(i7, u2Var.getMessage().f24073k, true, false));
            if (f10 != null) {
                if (bxVar.f46588n2) {
                    bxVar.a4(u2Var.getDialogId(), f10.f28544id, false, null);
                } else {
                    qg.c.n(bxVar, -u2Var.getDialogId(), f10, 0);
                }
            }
        }
    }
}
