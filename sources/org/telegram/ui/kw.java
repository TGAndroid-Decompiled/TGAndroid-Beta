package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class kw extends zf.m {
    public final yx f39010b0;
    public final zx f39011c0;

    public kw(zx zxVar, zx zxVar2, Context context, int i10, int i11, boolean z10, ArrayList arrayList, int i12, TLRPC.RequestPeerType requestPeerType, yx yxVar) {
        super(zxVar2, context, i10, i11, z10, arrayList, i12, requestPeerType);
        this.f39011c0 = zxVar;
        this.f39010b0 = yxVar;
    }

    @Override
    public final void K() {
        this.f39011c0.presentFragment(new j());
    }

    @Override
    public final void L() {
        int i10;
        zx zxVar = this.f39011c0;
        org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(3, zxVar.getParentActivity(), null);
        TLRPC.RequestPeerType requestPeerType = zxVar.G;
        if (requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast) {
            Bundle i11 = org.telegram.ui.Cells.f1.i(0, "step");
            Boolean bool = zxVar.G.has_username;
            if (bool != null) {
                i11.putBoolean("forcePublic", bool.booleanValue());
            }
            kd kdVar = new kd(i11);
            kdVar.f38832u0 = new n6(zxVar, kdVar, x1Var, 2);
            zxVar.presentFragment(kdVar);
        } else if (requestPeerType instanceof TLRPC.TL_requestPeerTypeChat) {
            Bundle bundle = new Bundle();
            Boolean bool2 = zxVar.G.bot_participant;
            bundle.putLongArray("result", (bool2 == null || !bool2.booleanValue()) ? new long[]{zxVar.getUserConfig().e()} : new long[]{zxVar.getUserConfig().e(), zxVar.H});
            Boolean bool3 = zxVar.G.forum;
            if (bool3 != null && bool3.booleanValue()) {
                i10 = 5;
            } else {
                i10 = 4;
            }
            bundle.putInt("chatType", i10);
            bundle.putBoolean("canToggleTopics", false);
            b60 b60Var = new b60(bundle);
            b60Var.Y = new bx(zxVar, x1Var);
            zxVar.presentFragment(b60Var);
        }
    }

    @Override
    public final void M(TLRPC.User user) {
        int i10;
        i10 = ((org.telegram.ui.ActionBar.k2) this.f39011c0).currentAccount;
        org.telegram.messenger.wp.r1(i10).u3(null, user, null, 0, null, false, false);
    }

    @Override
    public final boolean T() {
        if (this.f39011c0.R0 == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void f() {
        int i10;
        b();
        int i11 = yx.L;
        try {
            super.f();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
        zx zxVar = this.f39011c0;
        if (zxVar.R0 == 15) {
            org.telegram.ui.ActionBar.t0 t0Var = zxVar.f44163j0;
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
        yx yxVar = this.f39010b0;
        yxVar.f43733a.getClass();
        this.f39011c0.A4(v2Var, RecyclerView.R(v2Var), 0.0f, yxVar.d);
    }

    @Override
    public final void r(org.telegram.ui.Cells.v2 v2Var) {
        int i10;
        if (v2Var.getMessage() != null) {
            zx zxVar = this.f39011c0;
            i10 = ((org.telegram.ui.ActionBar.k2) zxVar).currentAccount;
            TLRPC.TL_forumTopic f7 = zxVar.getMessagesController().f19234r7.f(-v2Var.getDialogId(), org.telegram.messenger.kj.c2(i10, v2Var.getMessage().f16690k, true, false));
            if (f7 != null) {
                if (zxVar.f44174l2) {
                    zxVar.a4(v2Var.getDialogId(), f7.f19846id, false, null);
                } else {
                    gg.e.m(zxVar, -v2Var.getDialogId(), f7, 0);
                }
            }
        }
    }
}
