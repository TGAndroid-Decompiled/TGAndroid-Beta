package org.telegram.ui;

import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.telegram.tgnet.TLRPC;
public final class f3 implements q0.a {
    public final int f45568a;
    public final Object f45569b;

    public f3(Object obj, int i7) {
        this.f45568a = i7;
        this.f45569b = obj;
    }

    @Override
    public final void accept(Object obj) {
        ArrayList arrayList;
        String j3;
        int i7 = this.f45568a;
        boolean z9 = true;
        Object obj2 = this.f45569b;
        switch (i7) {
            case 0:
                k3 k3Var = (k3) obj2;
                Float f10 = (Float) obj;
                g4 g4Var = k3Var.L;
                if (k3Var == g4Var.f45902u0[0]) {
                    if (g4Var.f45890h0.f51173d0.getCurrentProgress() > f10.floatValue()) {
                        g4Var.f45890h0.f51173d0.a(false, 0.0f);
                    }
                    g4Var.f45890h0.f51173d0.a(true, f10.floatValue());
                    return;
                }
                return;
            case 1:
                ((org.telegram.ui.Components.sh0) obj2).h((List) obj);
                return;
            case 2:
                TLRPC.User user = (TLRPC.User) obj;
                qq qqVar = ((hq) obj2).f46371b;
                kq B0 = qqVar.B0();
                ArrayList arrayList2 = qqVar.E;
                a0.h hVar = qqVar.L;
                if (hVar != null && hVar.m() != 0) {
                    arrayList = qqVar.G;
                } else {
                    arrayList = arrayList2;
                }
                if (hVar == null || hVar.m() == 0) {
                    hVar = qqVar.J;
                }
                if (hVar.f(user.f27105id) == null) {
                    if (org.telegram.messenger.t3.T(qqVar.f49144n)) {
                        TLRPC.TL_channelParticipant tL_channelParticipant = new TLRPC.TL_channelParticipant();
                        tL_channelParticipant.inviter_id = qqVar.getUserConfig().e();
                        TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                        tL_channelParticipant.peer = tL_peerUser;
                        tL_peerUser.user_id = user.f27105id;
                        tL_channelParticipant.date = qqVar.getConnectionsManager().getCurrentTime();
                        arrayList.add(0, tL_channelParticipant);
                        hVar.k(tL_channelParticipant, user.f27105id);
                    } else {
                        TLRPC.TL_chatParticipant tL_chatParticipant = new TLRPC.TL_chatParticipant();
                        tL_chatParticipant.user_id = user.f27105id;
                        tL_chatParticipant.inviter_id = qqVar.getUserConfig().e();
                        arrayList.add(0, tL_chatParticipant);
                        hVar.k(tL_chatParticipant, user.f27105id);
                    }
                }
                if (arrayList == arrayList2) {
                    Collections.sort(arrayList2, new oe(4));
                }
                qqVar.F0(B0);
                return;
            case 3:
                r3 r3Var = (r3) obj2;
                int i10 = ((f5.f) obj).f11151a;
                if (i10 == 0) {
                    j3 = null;
                } else {
                    j3 = org.telegram.messenger.r1.j(i10);
                }
                org.telegram.messenger.g0.h3(new bd0(4, r3Var, j3));
                return;
            case 4:
                vf0 vf0Var = (vf0) obj2;
                if (((f5.f) obj).f11151a == 0) {
                    org.telegram.messenger.g0.h3(vf0Var);
                    return;
                }
                return;
            case 5:
                RectF rectF = ProfileActivity.V6;
                ((ArrayList) obj2).add((TLRPC.User) obj);
                return;
            case 6:
                ProfileActivity profileActivity = (ProfileActivity) obj2;
                TLRPC.User user2 = (TLRPC.User) obj;
                for (int i11 = 0; i11 < profileActivity.f41834t2.participants.participants.size(); i11++) {
                    if (profileActivity.f41834t2.participants.participants.get(i11).user_id == user2.f27105id) {
                        profileActivity.f41834t2.participants.participants.remove(i11);
                        profileActivity.G5(true, false);
                        return;
                    }
                }
                return;
            default:
                View view = ((ProxyListActivity) obj2).f41884b.T((View) obj).f57056a;
                if (view instanceof rx0) {
                    rx0 rx0Var = (rx0) view;
                    if (rx0Var.d != org.telegram.messenger.iz.B1) {
                        z9 = false;
                    }
                    rx0Var.setChecked(z9);
                    rx0Var.b();
                    return;
                }
                return;
        }
    }
}
