package org.telegram.ui;

import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.telegram.tgnet.TLRPC;
public final class f3 implements q0.a {
    public final int f46980a;
    public final Object f46981b;

    public f3(Object obj, int i7) {
        this.f46980a = i7;
        this.f46981b = obj;
    }

    @Override
    public final void accept(Object obj) {
        ArrayList arrayList;
        String j3;
        int i7 = this.f46980a;
        boolean z10 = true;
        Object obj2 = this.f46981b;
        switch (i7) {
            case 0:
                k3 k3Var = (k3) obj2;
                Float f10 = (Float) obj;
                g4 g4Var = k3Var.M;
                if (k3Var == g4Var.f47336v0[0]) {
                    if (g4Var.f47324i0.f52652e0.getCurrentProgress() > f10.floatValue()) {
                        g4Var.f47324i0.f52652e0.a(false, 0.0f);
                    }
                    g4Var.f47324i0.f52652e0.a(true, f10.floatValue());
                    return;
                }
                return;
            case 1:
                ((org.telegram.ui.Components.vh0) obj2).h((List) obj);
                return;
            case 2:
                TLRPC.User user = (TLRPC.User) obj;
                qq qqVar = ((hq) obj2).f47797b;
                kq B0 = qqVar.B0();
                ArrayList arrayList2 = qqVar.F;
                a0.h hVar = qqVar.M;
                if (hVar != null && hVar.m() != 0) {
                    arrayList = qqVar.H;
                } else {
                    arrayList = arrayList2;
                }
                if (hVar == null || hVar.m() == 0) {
                    hVar = qqVar.K;
                }
                if (hVar.f(user.f28200id) == null) {
                    if (org.telegram.messenger.t3.T(qqVar.f50738n)) {
                        TLRPC.TL_channelParticipant tL_channelParticipant = new TLRPC.TL_channelParticipant();
                        tL_channelParticipant.inviter_id = qqVar.getUserConfig().e();
                        TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                        tL_channelParticipant.peer = tL_peerUser;
                        tL_peerUser.user_id = user.f28200id;
                        tL_channelParticipant.date = qqVar.getConnectionsManager().getCurrentTime();
                        arrayList.add(0, tL_channelParticipant);
                        hVar.k(tL_channelParticipant, user.f28200id);
                    } else {
                        TLRPC.TL_chatParticipant tL_chatParticipant = new TLRPC.TL_chatParticipant();
                        tL_chatParticipant.user_id = user.f28200id;
                        tL_chatParticipant.inviter_id = qqVar.getUserConfig().e();
                        arrayList.add(0, tL_chatParticipant);
                        hVar.k(tL_chatParticipant, user.f28200id);
                    }
                }
                if (arrayList == arrayList2) {
                    Collections.sort(arrayList2, new me(3));
                }
                qqVar.F0(B0);
                return;
            case 3:
                r3 r3Var = (r3) obj2;
                int i10 = ((f5.f) obj).f10978a;
                if (i10 == 0) {
                    j3 = null;
                } else {
                    j3 = org.telegram.messenger.r1.j(i10);
                }
                org.telegram.messenger.g0.h3(new jd0(0, r3Var, j3));
                return;
            case 4:
                tf0 tf0Var = (tf0) obj2;
                if (((f5.f) obj).f10978a == 0) {
                    org.telegram.messenger.g0.h3(tf0Var);
                    return;
                }
                return;
            case 5:
                RectF rectF = ProfileActivity.X6;
                ((ArrayList) obj2).add((TLRPC.User) obj);
                return;
            case 6:
                ProfileActivity profileActivity = (ProfileActivity) obj2;
                TLRPC.User user2 = (TLRPC.User) obj;
                for (int i11 = 0; i11 < profileActivity.f43211v2.participants.participants.size(); i11++) {
                    if (profileActivity.f43211v2.participants.participants.get(i11).user_id == user2.f28200id) {
                        profileActivity.f43211v2.participants.participants.remove(i11);
                        profileActivity.G5(true, false);
                        return;
                    }
                }
                return;
            default:
                View view = ((ProxyListActivity) obj2).f43248b.T((View) obj).f58535a;
                if (view instanceof mx0) {
                    mx0 mx0Var = (mx0) view;
                    if (mx0Var.d != org.telegram.messenger.gz.B1) {
                        z10 = false;
                    }
                    mx0Var.setChecked(z10);
                    mx0Var.b();
                    return;
                }
                return;
        }
    }
}
