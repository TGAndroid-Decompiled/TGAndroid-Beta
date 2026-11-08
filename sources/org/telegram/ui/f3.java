package org.telegram.ui;

import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.telegram.tgnet.TLRPC;
public final class f3 implements q0.a {
    public final int f45429a;
    public final Object f45430b;

    public f3(Object obj, int i7) {
        this.f45429a = i7;
        this.f45430b = obj;
    }

    @Override
    public final void accept(Object obj) {
        ArrayList arrayList;
        String j3;
        int i7 = this.f45429a;
        boolean z9 = true;
        Object obj2 = this.f45430b;
        switch (i7) {
            case 0:
                k3 k3Var = (k3) obj2;
                Float f10 = (Float) obj;
                g4 g4Var = k3Var.L;
                if (k3Var == g4Var.f45819u0[0]) {
                    if (g4Var.f45807h0.f51192d0.getCurrentProgress() > f10.floatValue()) {
                        g4Var.f45807h0.f51192d0.a(false, 0.0f);
                    }
                    g4Var.f45807h0.f51192d0.a(true, f10.floatValue());
                    return;
                }
                return;
            case 1:
                ((org.telegram.ui.Components.rh0) obj2).h((List) obj);
                return;
            case 2:
                TLRPC.User user = (TLRPC.User) obj;
                oq oqVar = ((fq) obj2).f45668b;
                iq B0 = oqVar.B0();
                ArrayList arrayList2 = oqVar.E;
                a0.h hVar = oqVar.L;
                if (hVar != null && hVar.m() != 0) {
                    arrayList = oqVar.G;
                } else {
                    arrayList = arrayList2;
                }
                if (hVar == null || hVar.m() == 0) {
                    hVar = oqVar.J;
                }
                if (hVar.f(user.f27105id) == null) {
                    if (org.telegram.messenger.t3.T(oqVar.f48491n)) {
                        TLRPC.TL_channelParticipant tL_channelParticipant = new TLRPC.TL_channelParticipant();
                        tL_channelParticipant.inviter_id = oqVar.getUserConfig().e();
                        TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                        tL_channelParticipant.peer = tL_peerUser;
                        tL_peerUser.user_id = user.f27105id;
                        tL_channelParticipant.date = oqVar.getConnectionsManager().getCurrentTime();
                        arrayList.add(0, tL_channelParticipant);
                        hVar.k(tL_channelParticipant, user.f27105id);
                    } else {
                        TLRPC.TL_chatParticipant tL_chatParticipant = new TLRPC.TL_chatParticipant();
                        tL_chatParticipant.user_id = user.f27105id;
                        tL_chatParticipant.inviter_id = oqVar.getUserConfig().e();
                        arrayList.add(0, tL_chatParticipant);
                        hVar.k(tL_chatParticipant, user.f27105id);
                    }
                }
                if (arrayList == arrayList2) {
                    Collections.sort(arrayList2, new oe(4));
                }
                oqVar.F0(B0);
                return;
            case 3:
                r3 r3Var = (r3) obj2;
                int i10 = ((f5.f) obj).f11151a;
                if (i10 == 0) {
                    j3 = null;
                } else {
                    j3 = org.telegram.messenger.r1.j(i10);
                }
                org.telegram.messenger.g0.h3(new zc0(4, r3Var, j3));
                return;
            case 4:
                tf0 tf0Var = (tf0) obj2;
                if (((f5.f) obj).f11151a == 0) {
                    org.telegram.messenger.g0.h3(tf0Var);
                    return;
                }
                return;
            case 5:
                RectF rectF = ProfileActivity.S6;
                ((ArrayList) obj2).add((TLRPC.User) obj);
                return;
            case 6:
                ProfileActivity profileActivity = (ProfileActivity) obj2;
                TLRPC.User user2 = (TLRPC.User) obj;
                for (int i11 = 0; i11 < profileActivity.f41827t2.participants.participants.size(); i11++) {
                    if (profileActivity.f41827t2.participants.participants.get(i11).user_id == user2.f27105id) {
                        profileActivity.f41827t2.participants.participants.remove(i11);
                        profileActivity.D5(true, false);
                        return;
                    }
                }
                return;
            default:
                View view = ((ProxyListActivity) obj2).f41877b.T((View) obj).f57044a;
                if (view instanceof nx0) {
                    nx0 nx0Var = (nx0) view;
                    if (nx0Var.d != org.telegram.messenger.iz.B1) {
                        z9 = false;
                    }
                    nx0Var.setChecked(z9);
                    nx0Var.b();
                    return;
                }
                return;
        }
    }
}
