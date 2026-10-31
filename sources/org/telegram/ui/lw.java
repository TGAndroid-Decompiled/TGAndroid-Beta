package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class lw extends zf.m {
    public final zx f39420b0;
    public final ay f39421c0;

    public lw(ay ayVar, ay ayVar2, Context context, int i10, int i11, boolean z10, ArrayList arrayList, int i12, TLRPC.RequestPeerType requestPeerType, zx zxVar) {
        super(ayVar2, context, i10, i11, z10, arrayList, i12, requestPeerType);
        this.f39421c0 = ayVar;
        this.f39420b0 = zxVar;
    }

    @Override
    public final void K() {
        this.f39421c0.presentFragment(new j());
    }

    @Override
    public final void L() {
        int i10;
        ay ayVar = this.f39421c0;
        org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(3, ayVar.getParentActivity(), null);
        TLRPC.RequestPeerType requestPeerType = ayVar.G;
        if (requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast) {
            Bundle i11 = org.telegram.ui.Cells.f1.i(0, "step");
            Boolean bool = ayVar.G.has_username;
            if (bool != null) {
                i11.putBoolean("forcePublic", bool.booleanValue());
            }
            kd kdVar = new kd(i11);
            kdVar.f38769u0 = new n6(ayVar, kdVar, x1Var, 2);
            ayVar.presentFragment(kdVar);
        } else if (requestPeerType instanceof TLRPC.TL_requestPeerTypeChat) {
            Bundle bundle = new Bundle();
            Boolean bool2 = ayVar.G.bot_participant;
            bundle.putLongArray("result", (bool2 == null || !bool2.booleanValue()) ? new long[]{ayVar.getUserConfig().e()} : new long[]{ayVar.getUserConfig().e(), ayVar.H});
            Boolean bool3 = ayVar.G.forum;
            if (bool3 != null && bool3.booleanValue()) {
                i10 = 5;
            } else {
                i10 = 4;
            }
            bundle.putInt("chatType", i10);
            bundle.putBoolean("canToggleTopics", false);
            c60 c60Var = new c60(bundle);
            c60Var.Y = new cx(ayVar, x1Var);
            ayVar.presentFragment(c60Var);
        }
    }

    @Override
    public final void M(TLRPC.User user) {
        int i10;
        i10 = ((org.telegram.ui.ActionBar.k2) this.f39421c0).currentAccount;
        org.telegram.messenger.vp.r1(i10).u3(null, user, null, 0, null, false, false);
    }

    @Override
    public final boolean T() {
        if (this.f39421c0.R0 == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void f() {
        int i10;
        b();
        int i11 = zx.L;
        try {
            super.f();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
        ay ayVar = this.f39421c0;
        if (ayVar.R0 == 15) {
            org.telegram.ui.ActionBar.t0 t0Var = ayVar.f35820j0;
            if (this.U) {
                i10 = 8;
            } else {
                i10 = 0;
            }
            t0Var.setVisibility(i10);
        }
    }

    @Override
    public final void l(org.telegram.ui.Cells.v2 v2Var) {
        zx zxVar = this.f39420b0;
        zxVar.f44239a.getClass();
        this.f39421c0.z4(v2Var, RecyclerView.R(v2Var), 0.0f, zxVar.d);
    }

    @Override
    public final void r(org.telegram.ui.Cells.v2 v2Var) {
        int i10;
        if (v2Var.getMessage() != null) {
            ay ayVar = this.f39421c0;
            i10 = ((org.telegram.ui.ActionBar.k2) ayVar).currentAccount;
            TLRPC.TL_forumTopic f7 = ayVar.getMessagesController().f18891r7.f(-v2Var.getDialogId(), org.telegram.messenger.jj.c2(i10, v2Var.getMessage().f16337k, true, false));
            if (f7 != null) {
                if (ayVar.f35831l2) {
                    ayVar.Z3(v2Var.getDialogId(), f7.f19845id, false, null);
                } else {
                    gg.e.m(ayVar, -v2Var.getDialogId(), f7, 0);
                }
            }
        }
    }
}
