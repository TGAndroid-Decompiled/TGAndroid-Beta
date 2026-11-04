package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class dv extends kg.m {
    public final tw f44815c0;
    public final uw f44816d0;

    public dv(uw uwVar, uw uwVar2, Context context, int i3, int i10, boolean z10, ArrayList arrayList, int i11, TLRPC.RequestPeerType requestPeerType, tw twVar) {
        super(uwVar2, context, i3, i10, z10, arrayList, i11, requestPeerType);
        this.f44816d0 = uwVar;
        this.f44815c0 = twVar;
    }

    @Override
    public final void K() {
        this.f44816d0.presentFragment(new k());
    }

    @Override
    public final void L() {
        int i3;
        uw uwVar = this.f44816d0;
        org.telegram.ui.ActionBar.s1 s1Var = new org.telegram.ui.ActionBar.s1(3, uwVar.getParentActivity(), null);
        TLRPC.RequestPeerType requestPeerType = uwVar.H;
        if (requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast) {
            Bundle k10 = org.telegram.ui.Cells.f1.k(0, "step");
            Boolean bool = uwVar.H.has_username;
            if (bool != null) {
                k10.putBoolean("forcePublic", bool.booleanValue());
            }
            ad adVar = new ad(k10);
            adVar.f43753v0 = new o6(uwVar, adVar, s1Var, 2);
            uwVar.presentFragment(adVar);
        } else if (requestPeerType instanceof TLRPC.TL_requestPeerTypeChat) {
            Bundle bundle = new Bundle();
            Boolean bool2 = uwVar.H.bot_participant;
            bundle.putLongArray("result", (bool2 == null || !bool2.booleanValue()) ? new long[]{uwVar.getUserConfig().e()} : new long[]{uwVar.getUserConfig().e(), uwVar.I});
            Boolean bool3 = uwVar.H.forum;
            if (bool3 != null && bool3.booleanValue()) {
                i3 = 5;
            } else {
                i3 = 4;
            }
            bundle.putInt("chatType", i3);
            bundle.putBoolean("canToggleTopics", false);
            y40 y40Var = new y40(bundle);
            y40Var.Z = new uv(uwVar, s1Var);
            uwVar.presentFragment(y40Var);
        }
    }

    @Override
    public final void M(TLRPC.User user) {
        int i3;
        i3 = ((org.telegram.ui.ActionBar.d2) this.f44816d0).currentAccount;
        org.telegram.messenger.hp.s1(i3).x3(null, user, null, 0, null, false, false);
    }

    @Override
    public final boolean T() {
        if (this.f44816d0.S0 == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void f() {
        int i3;
        b();
        int i10 = tw.M;
        try {
            super.f();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        uw uwVar = this.f44816d0;
        if (uwVar.S0 == 15) {
            org.telegram.ui.ActionBar.q0 q0Var = uwVar.f50254k0;
            if (this.V) {
                i3 = 8;
            } else {
                i3 = 0;
            }
            q0Var.setVisibility(i3);
        }
    }

    @Override
    public final void l(org.telegram.ui.Cells.t2 t2Var) {
        tw twVar = this.f44815c0;
        twVar.f49897a.getClass();
        this.f44816d0.A4(t2Var, RecyclerView.R(t2Var), 0.0f, twVar.d);
    }

    @Override
    public final void r(org.telegram.ui.Cells.t2 t2Var) {
        int i3;
        if (t2Var.getMessage() != null) {
            uw uwVar = this.f44816d0;
            i3 = ((org.telegram.ui.ActionBar.d2) uwVar).currentAccount;
            TLRPC.TL_forumTopic f10 = uwVar.getMessagesController().f23102q7.f(-t2Var.getDialogId(), org.telegram.messenger.zi.c2(i3, t2Var.getMessage().f26868k, true, false));
            if (f10 != null) {
                if (uwVar.f50263m2) {
                    uwVar.a4(t2Var.getDialogId(), f10.f27053id, false, null);
                } else {
                    rg.c.m(uwVar, -t2Var.getDialogId(), f10, 0);
                }
            }
        }
    }
}
