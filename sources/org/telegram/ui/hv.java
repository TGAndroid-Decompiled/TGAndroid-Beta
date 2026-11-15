package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class hv extends jg.m {
    public final xw f47827c0;
    public final yw f47828d0;

    public hv(yw ywVar, yw ywVar2, Context context, int i7, int i10, boolean z10, ArrayList arrayList, int i11, TLRPC.RequestPeerType requestPeerType, xw xwVar) {
        super(ywVar2, context, i7, i10, z10, arrayList, i11, requestPeerType);
        this.f47828d0 = ywVar;
        this.f47827c0 = xwVar;
    }

    @Override
    public final void K() {
        this.f47828d0.presentFragment(new k());
    }

    @Override
    public final void L() {
        int i7;
        yw ywVar = this.f47828d0;
        org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, ywVar.getParentActivity(), null);
        TLRPC.RequestPeerType requestPeerType = ywVar.H;
        if (requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast) {
            Bundle f10 = r.b.f(0, "step");
            Boolean bool = ywVar.H.has_username;
            if (bool != null) {
                f10.putBoolean("forcePublic", bool.booleanValue());
            }
            ad adVar = new ad(f10);
            adVar.f45023v0 = new n6(ywVar, adVar, t1Var, 2);
            ywVar.presentFragment(adVar);
        } else if (requestPeerType instanceof TLRPC.TL_requestPeerTypeChat) {
            Bundle bundle = new Bundle();
            Boolean bool2 = ywVar.H.bot_participant;
            bundle.putLongArray("result", (bool2 == null || !bool2.booleanValue()) ? new long[]{ywVar.getUserConfig().e()} : new long[]{ywVar.getUserConfig().e(), ywVar.I});
            Boolean bool3 = ywVar.H.forum;
            if (bool3 != null && bool3.booleanValue()) {
                i7 = 5;
            } else {
                i7 = 4;
            }
            bundle.putInt("chatType", i7);
            bundle.putBoolean("canToggleTopics", false);
            c50 c50Var = new c50(bundle);
            c50Var.Z = new zv(ywVar, t1Var);
            ywVar.presentFragment(c50Var);
        }
    }

    @Override
    public final void M(TLRPC.User user) {
        int i7;
        i7 = ((org.telegram.ui.ActionBar.e2) this.f47828d0).currentAccount;
        org.telegram.messenger.np.s1(i7).x3(null, user, null, 0, null, false, false);
    }

    @Override
    public final boolean T() {
        if (this.f47828d0.T0 == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void f() {
        int i7;
        b();
        int i10 = xw.M;
        try {
            super.f();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        yw ywVar = this.f47828d0;
        if (ywVar.T0 == 15) {
            org.telegram.ui.ActionBar.q0 q0Var = ywVar.f53697k0;
            if (this.V) {
                i7 = 8;
            } else {
                i7 = 0;
            }
            q0Var.setVisibility(i7);
        }
    }

    @Override
    public final void l(org.telegram.ui.Cells.t2 t2Var) {
        xw xwVar = this.f47827c0;
        xwVar.f53331a.getClass();
        this.f47828d0.A4(t2Var, RecyclerView.R(t2Var), 0.0f, xwVar.d);
    }

    @Override
    public final void r(org.telegram.ui.Cells.t2 t2Var) {
        int i7;
        if (t2Var.getMessage() != null) {
            yw ywVar = this.f47828d0;
            i7 = ((org.telegram.ui.ActionBar.e2) ywVar).currentAccount;
            TLRPC.TL_forumTopic f10 = ywVar.getMessagesController().f25383r7.f(-t2Var.getDialogId(), org.telegram.messenger.gj.b2(i7, t2Var.getMessage().f23817k, true, false));
            if (f10 != null) {
                if (ywVar.f53712n2) {
                    ywVar.a4(t2Var.getDialogId(), f10.f28103id, false, null);
                } else {
                    qg.c.m(ywVar, -t2Var.getDialogId(), f10, 0);
                }
            }
        }
    }
}
