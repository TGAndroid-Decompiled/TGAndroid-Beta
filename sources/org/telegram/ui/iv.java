package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class iv extends jg.n {
    public final xw f46761b0;
    public final yw f46762c0;

    public iv(yw ywVar, yw ywVar2, Context context, int i7, int i10, boolean z9, ArrayList arrayList, int i11, TLRPC.RequestPeerType requestPeerType, xw xwVar) {
        super(ywVar2, context, i7, i10, z9, arrayList, i11, requestPeerType);
        this.f46762c0 = ywVar;
        this.f46761b0 = xwVar;
    }

    @Override
    public final void K() {
        this.f46762c0.presentFragment(new k());
    }

    @Override
    public final void L() {
        int i7;
        yw ywVar = this.f46762c0;
        org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, ywVar.getParentActivity(), null);
        TLRPC.RequestPeerType requestPeerType = ywVar.G;
        if (requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast) {
            Bundle f10 = rf.b.f(0, "step");
            Boolean bool = ywVar.G.has_username;
            if (bool != null) {
                f10.putBoolean("forcePublic", bool.booleanValue());
            }
            bd bdVar = new bd(f10);
            bdVar.f44006u0 = new n6(ywVar, bdVar, u1Var, 2);
            ywVar.presentFragment(bdVar);
        } else if (requestPeerType instanceof TLRPC.TL_requestPeerTypeChat) {
            Bundle bundle = new Bundle();
            Boolean bool2 = ywVar.G.bot_participant;
            bundle.putLongArray("result", (bool2 == null || !bool2.booleanValue()) ? new long[]{ywVar.getUserConfig().e()} : new long[]{ywVar.getUserConfig().e(), ywVar.H});
            Boolean bool3 = ywVar.G.forum;
            if (bool3 != null && bool3.booleanValue()) {
                i7 = 5;
            } else {
                i7 = 4;
            }
            bundle.putInt("chatType", i7);
            bundle.putBoolean("canToggleTopics", false);
            f50 f50Var = new f50(bundle);
            f50Var.Y = new zv(ywVar, u1Var);
            ywVar.presentFragment(f50Var);
        }
    }

    @Override
    public final void M(TLRPC.User user) {
        int i7;
        i7 = ((org.telegram.ui.ActionBar.f2) this.f46762c0).currentAccount;
        org.telegram.messenger.qp.s1(i7).x3(null, user, null, 0, null, false, false);
    }

    @Override
    public final boolean T() {
        if (this.f46762c0.S0 == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void f() {
        int i7;
        b();
        int i10 = xw.L;
        try {
            super.f();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        yw ywVar = this.f46762c0;
        if (ywVar.S0 == 15) {
            org.telegram.ui.ActionBar.r0 r0Var = ywVar.f52257j0;
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
        xw xwVar = this.f46761b0;
        xwVar.f51772a.getClass();
        this.f46762c0.A4(t2Var, RecyclerView.R(t2Var), 0.0f, xwVar.d);
    }

    @Override
    public final void r(org.telegram.ui.Cells.t2 t2Var) {
        int i7;
        if (t2Var.getMessage() != null) {
            yw ywVar = this.f46762c0;
            i7 = ((org.telegram.ui.ActionBar.f2) ywVar).currentAccount;
            TLRPC.TL_forumTopic f10 = ywVar.getMessagesController().f24877q7.f(-t2Var.getDialogId(), org.telegram.messenger.ij.b2(i7, t2Var.getMessage().f23262k, true, false));
            if (f10 != null) {
                if (ywVar.f52271m2) {
                    ywVar.a4(t2Var.getDialogId(), f10.f27008id, false, null);
                } else {
                    qg.d.m(ywVar, -t2Var.getDialogId(), f10, 0);
                }
            }
        }
    }
}
