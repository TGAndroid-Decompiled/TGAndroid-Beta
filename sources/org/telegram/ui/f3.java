package org.telegram.ui;

import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.telegram.tgnet.TLRPC;
public final class f3 implements q0.a {
    public final int f37163a;
    public final Object f37164b;

    public f3(Object obj, int i10) {
        this.f37163a = i10;
        this.f37164b = obj;
    }

    @Override
    public final void accept(Object obj) {
        ArrayList arrayList;
        String j10;
        int i10 = this.f37163a;
        boolean z10 = true;
        Object obj2 = this.f37164b;
        switch (i10) {
            case 0:
                l3 l3Var = (l3) obj2;
                Float f7 = (Float) obj;
                h4 h4Var = l3Var.L;
                if (l3Var == h4Var.f37746u0[0]) {
                    if (h4Var.f37734h0.f43098d0.getCurrentProgress() > f7.floatValue()) {
                        h4Var.f37734h0.f43098d0.a(false, 0.0f);
                    }
                    h4Var.f37734h0.f43098d0.a(true, f7.floatValue());
                    return;
                }
                return;
            case 1:
                ((org.telegram.ui.Components.vi0) obj2).h((List) obj);
                return;
            case 2:
                TLRPC.User user = (TLRPC.User) obj;
                pr prVar = ((gr) obj2).f37620b;
                jr A0 = prVar.A0();
                ArrayList arrayList2 = prVar.E;
                a0.h hVar = prVar.L;
                if (hVar != null && hVar.m() != 0) {
                    arrayList = prVar.G;
                } else {
                    arrayList = arrayList2;
                }
                if (hVar == null || hVar.m() == 0) {
                    hVar = prVar.J;
                }
                if (hVar.f(user.f19942id) == null) {
                    if (org.telegram.messenger.w3.T(prVar.f40746n)) {
                        TLRPC.TL_channelParticipant tL_channelParticipant = new TLRPC.TL_channelParticipant();
                        tL_channelParticipant.inviter_id = prVar.getUserConfig().e();
                        TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                        tL_channelParticipant.peer = tL_peerUser;
                        tL_peerUser.user_id = user.f19942id;
                        tL_channelParticipant.date = prVar.getConnectionsManager().getCurrentTime();
                        arrayList.add(0, tL_channelParticipant);
                        hVar.k(tL_channelParticipant, user.f19942id);
                    } else {
                        TLRPC.TL_chatParticipant tL_chatParticipant = new TLRPC.TL_chatParticipant();
                        tL_chatParticipant.user_id = user.f19942id;
                        tL_chatParticipant.inviter_id = prVar.getUserConfig().e();
                        arrayList.add(0, tL_chatParticipant);
                        hVar.k(tL_chatParticipant, user.f19942id);
                    }
                }
                if (arrayList == arrayList2) {
                    Collections.sort(arrayList2, new f6(6));
                }
                prVar.E0(A0);
                return;
            case 3:
                s3 s3Var = (s3) obj2;
                int i11 = ((c5.g) obj).f3785a;
                if (i11 == 0) {
                    j10 = null;
                } else {
                    j10 = org.telegram.messenger.u1.j(i11);
                }
                org.telegram.messenger.i0.g3(new f70(27, s3Var, j10));
                return;
            case 4:
                ch0 ch0Var = (ch0) obj2;
                if (((c5.g) obj).f3785a == 0) {
                    org.telegram.messenger.i0.g3(ch0Var);
                    return;
                }
                return;
            case 5:
                RectF rectF = ProfileActivity.R6;
                ((ArrayList) obj2).add((TLRPC.User) obj);
                return;
            case 6:
                ProfileActivity profileActivity = (ProfileActivity) obj2;
                TLRPC.User user2 = (TLRPC.User) obj;
                for (int i12 = 0; i12 < profileActivity.f33908t2.participants.participants.size(); i12++) {
                    if (profileActivity.f33908t2.participants.participants.get(i12).user_id == user2.f19942id) {
                        profileActivity.f33908t2.participants.participants.remove(i12);
                        profileActivity.C5(true, false);
                        return;
                    }
                }
                return;
            default:
                View view = ((ProxyListActivity) obj2).f33958b.T((View) obj).f47898a;
                if (view instanceof cz0) {
                    cz0 cz0Var = (cz0) view;
                    if (cz0Var.d != org.telegram.messenger.tz.B1) {
                        z10 = false;
                    }
                    cz0Var.setChecked(z10);
                    cz0Var.b();
                    return;
                }
                return;
        }
    }
}
