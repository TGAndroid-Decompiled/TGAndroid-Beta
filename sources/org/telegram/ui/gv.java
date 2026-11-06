package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class gv extends jg.n {
    public final vw f46117b0;
    public final ww f46118c0;

    public gv(ww wwVar, ww wwVar2, Context context, int i7, int i10, boolean z9, ArrayList arrayList, int i11, TLRPC.RequestPeerType requestPeerType, vw vwVar) {
        super(wwVar2, context, i7, i10, z9, arrayList, i11, requestPeerType);
        this.f46118c0 = wwVar;
        this.f46117b0 = vwVar;
    }

    @Override
    public final void K() {
        this.f46118c0.presentFragment(new k());
    }

    @Override
    public final void L() {
        int i7;
        ww wwVar = this.f46118c0;
        org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, wwVar.getParentActivity(), null);
        TLRPC.RequestPeerType requestPeerType = wwVar.G;
        if (requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast) {
            Bundle f10 = rf.b.f(0, "step");
            Boolean bool = wwVar.G.has_username;
            if (bool != null) {
                f10.putBoolean("forcePublic", bool.booleanValue());
            }
            bd bdVar = new bd(f10);
            bdVar.f44278u0 = new n6(wwVar, bdVar, u1Var, 2);
            wwVar.presentFragment(bdVar);
        } else if (requestPeerType instanceof TLRPC.TL_requestPeerTypeChat) {
            Bundle bundle = new Bundle();
            Boolean bool2 = wwVar.G.bot_participant;
            bundle.putLongArray("result", (bool2 == null || !bool2.booleanValue()) ? new long[]{wwVar.getUserConfig().e()} : new long[]{wwVar.getUserConfig().e(), wwVar.H});
            Boolean bool3 = wwVar.G.forum;
            if (bool3 != null && bool3.booleanValue()) {
                i7 = 5;
            } else {
                i7 = 4;
            }
            bundle.putInt("chatType", i7);
            bundle.putBoolean("canToggleTopics", false);
            d50 d50Var = new d50(bundle);
            d50Var.Y = new xv(wwVar, u1Var);
            wwVar.presentFragment(d50Var);
        }
    }

    @Override
    public final void M(TLRPC.User user) {
        int i7;
        i7 = ((org.telegram.ui.ActionBar.f2) this.f46118c0).currentAccount;
        org.telegram.messenger.qp.s1(i7).x3(null, user, null, 0, null, false, false);
    }

    @Override
    public final boolean T() {
        if (this.f46118c0.R0 == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void f() {
        int i7;
        b();
        int i10 = vw.L;
        try {
            super.f();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        ww wwVar = this.f46118c0;
        if (wwVar.R0 == 15) {
            org.telegram.ui.ActionBar.r0 r0Var = wwVar.f51577j0;
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
        vw vwVar = this.f46117b0;
        vwVar.f50839a.getClass();
        this.f46118c0.A4(t2Var, RecyclerView.R(t2Var), 0.0f, vwVar.d);
    }

    @Override
    public final void r(org.telegram.ui.Cells.t2 t2Var) {
        int i7;
        if (t2Var.getMessage() != null) {
            ww wwVar = this.f46118c0;
            i7 = ((org.telegram.ui.ActionBar.f2) wwVar).currentAccount;
            TLRPC.TL_forumTopic f10 = wwVar.getMessagesController().f24862q7.f(-t2Var.getDialogId(), org.telegram.messenger.ij.c2(i7, t2Var.getMessage().f23237k, true, false));
            if (f10 != null) {
                if (wwVar.f51587l2) {
                    wwVar.a4(t2Var.getDialogId(), f10.f27004id, false, null);
                } else {
                    qg.d.m(wwVar, -t2Var.getDialogId(), f10, 0);
                }
            }
        }
    }
}
