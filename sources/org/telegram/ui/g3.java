package org.telegram.ui;

import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.telegram.tgnet.TLRPC;
public final class g3 implements q0.a {
    public final int f45505a;
    public final Object f45506b;

    public g3(Object obj, int i3) {
        this.f45505a = i3;
        this.f45506b = obj;
    }

    @Override
    public final void accept(Object obj) {
        ArrayList arrayList;
        String j10;
        int i3 = this.f45505a;
        boolean z10 = true;
        Object obj2 = this.f45506b;
        switch (i3) {
            case 0:
                l3 l3Var = (l3) obj2;
                Float f10 = (Float) obj;
                i4 i4Var = l3Var.M;
                if (l3Var == i4Var.f46100v0[0]) {
                    if (i4Var.f46088i0.f50878e0.getCurrentProgress() > f10.floatValue()) {
                        i4Var.f46088i0.f50878e0.a(false, 0.0f);
                    }
                    i4Var.f46088i0.f50878e0.a(true, f10.floatValue());
                    return;
                }
                return;
            case 1:
                ((org.telegram.ui.Components.uh0) obj2).h((List) obj);
                return;
            case 2:
                TLRPC.User user = (TLRPC.User) obj;
                nq nqVar = ((dq) obj2).f44794b;
                gq B0 = nqVar.B0();
                ArrayList arrayList2 = nqVar.F;
                a0.h hVar = nqVar.M;
                if (hVar != null && hVar.m() != 0) {
                    arrayList = nqVar.H;
                } else {
                    arrayList = arrayList2;
                }
                if (hVar == null || hVar.m() == 0) {
                    hVar = nqVar.K;
                }
                if (hVar.f(user.f27150id) == null) {
                    if (org.telegram.messenger.t3.T(nqVar.f48074n)) {
                        TLRPC.TL_channelParticipant tL_channelParticipant = new TLRPC.TL_channelParticipant();
                        tL_channelParticipant.inviter_id = nqVar.getUserConfig().e();
                        TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                        tL_channelParticipant.peer = tL_peerUser;
                        tL_peerUser.user_id = user.f27150id;
                        tL_channelParticipant.date = nqVar.getConnectionsManager().getCurrentTime();
                        arrayList.add(0, tL_channelParticipant);
                        hVar.k(tL_channelParticipant, user.f27150id);
                    } else {
                        TLRPC.TL_chatParticipant tL_chatParticipant = new TLRPC.TL_chatParticipant();
                        tL_chatParticipant.user_id = user.f27150id;
                        tL_chatParticipant.inviter_id = nqVar.getUserConfig().e();
                        arrayList.add(0, tL_chatParticipant);
                        hVar.k(tL_chatParticipant, user.f27150id);
                    }
                }
                if (arrayList == arrayList2) {
                    Collections.sort(arrayList2, new org.telegram.messenger.tq(24));
                }
                nqVar.F0(B0);
                return;
            case 3:
                s3 s3Var = (s3) obj2;
                int i10 = ((e5.f) obj).f9593a;
                if (i10 == 0) {
                    j10 = null;
                } else {
                    j10 = org.telegram.messenger.r1.j(i10);
                }
                org.telegram.messenger.g0.h3(new tb0(9, s3Var, j10));
                return;
            case 4:
                nf0 nf0Var = (nf0) obj2;
                if (((e5.f) obj).f9593a == 0) {
                    org.telegram.messenger.g0.h3(nf0Var);
                    return;
                }
                return;
            case 5:
                RectF rectF = ProfileActivity.T6;
                ((ArrayList) obj2).add((TLRPC.User) obj);
                return;
            case 6:
                ProfileActivity profileActivity = (ProfileActivity) obj2;
                TLRPC.User user2 = (TLRPC.User) obj;
                for (int i11 = 0; i11 < profileActivity.f41861u2.participants.participants.size(); i11++) {
                    if (profileActivity.f41861u2.participants.participants.get(i11).user_id == user2.f27150id) {
                        profileActivity.f41861u2.participants.participants.remove(i11);
                        profileActivity.D5(true, false);
                        return;
                    }
                }
                return;
            default:
                View view = ((ProxyListActivity) obj2).f41905b.T((View) obj).f55540a;
                if (view instanceof fx0) {
                    fx0 fx0Var = (fx0) view;
                    if (fx0Var.d != org.telegram.messenger.az.B1) {
                        z10 = false;
                    }
                    fx0Var.setChecked(z10);
                    fx0Var.b();
                    return;
                }
                return;
        }
    }
}
