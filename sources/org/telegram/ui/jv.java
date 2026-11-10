package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class jv extends jg.n {
    public final yw f47080b0;
    public final zw f47081c0;

    public jv(zw zwVar, zw zwVar2, Context context, int i7, int i10, boolean z9, ArrayList arrayList, int i11, TLRPC.RequestPeerType requestPeerType, yw ywVar) {
        super(zwVar2, context, i7, i10, z9, arrayList, i11, requestPeerType);
        this.f47081c0 = zwVar;
        this.f47080b0 = ywVar;
    }

    @Override
    public final void K() {
        this.f47081c0.presentFragment(new k());
    }

    @Override
    public final void L() {
        int i7;
        zw zwVar = this.f47081c0;
        org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, zwVar.getParentActivity(), null);
        TLRPC.RequestPeerType requestPeerType = zwVar.G;
        if (requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast) {
            Bundle f10 = rf.b.f(0, "step");
            Boolean bool = zwVar.G.has_username;
            if (bool != null) {
                f10.putBoolean("forcePublic", bool.booleanValue());
            }
            bd bdVar = new bd(f10);
            bdVar.f44035u0 = new n6(zwVar, bdVar, u1Var, 2);
            zwVar.presentFragment(bdVar);
        } else if (requestPeerType instanceof TLRPC.TL_requestPeerTypeChat) {
            Bundle bundle = new Bundle();
            Boolean bool2 = zwVar.G.bot_participant;
            bundle.putLongArray("result", (bool2 == null || !bool2.booleanValue()) ? new long[]{zwVar.getUserConfig().e()} : new long[]{zwVar.getUserConfig().e(), zwVar.H});
            Boolean bool3 = zwVar.G.forum;
            if (bool3 != null && bool3.booleanValue()) {
                i7 = 5;
            } else {
                i7 = 4;
            }
            bundle.putInt("chatType", i7);
            bundle.putBoolean("canToggleTopics", false);
            g50 g50Var = new g50(bundle);
            g50Var.Y = new aw(zwVar, u1Var);
            zwVar.presentFragment(g50Var);
        }
    }

    @Override
    public final void M(TLRPC.User user) {
        int i7;
        i7 = ((org.telegram.ui.ActionBar.f2) this.f47081c0).currentAccount;
        org.telegram.messenger.qp.s1(i7).x3(null, user, null, 0, null, false, false);
    }

    @Override
    public final boolean T() {
        if (this.f47081c0.S0 == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void f() {
        int i7;
        b();
        int i10 = yw.L;
        try {
            super.f();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        zw zwVar = this.f47081c0;
        if (zwVar.S0 == 15) {
            org.telegram.ui.ActionBar.r0 r0Var = zwVar.f52603j0;
            if (this.U) {
                i7 = 8;
            } else {
                i7 = 0;
            }
            r0Var.setVisibility(i7);
        }
    }

    @Override
    public final void l(org.telegram.ui.Cells.t2 t2Var) {
        yw ywVar = this.f47080b0;
        ywVar.f52125a.getClass();
        this.f47081c0.A4(t2Var, RecyclerView.R(t2Var), 0.0f, ywVar.d);
    }

    @Override
    public final void r(org.telegram.ui.Cells.t2 t2Var) {
        int i7;
        if (t2Var.getMessage() != null) {
            zw zwVar = this.f47081c0;
            i7 = ((org.telegram.ui.ActionBar.f2) zwVar).currentAccount;
            TLRPC.TL_forumTopic f10 = zwVar.getMessagesController().f24881q7.f(-t2Var.getDialogId(), org.telegram.messenger.ij.b2(i7, t2Var.getMessage().f23266k, true, false));
            if (f10 != null) {
                if (zwVar.f52617m2) {
                    zwVar.a4(t2Var.getDialogId(), f10.f27012id, false, null);
                } else {
                    qg.d.m(zwVar, -t2Var.getDialogId(), f10, 0);
                }
            }
        }
    }
}
