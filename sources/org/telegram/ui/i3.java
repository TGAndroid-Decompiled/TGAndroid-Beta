package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLRPC;
public final class i3 implements q0.a {
    public final int f38057a;
    public final Object f38058b;

    public i3(Object obj, int i10) {
        this.f38057a = i10;
        this.f38058b = obj;
    }

    @Override
    public final void accept(Object obj) {
        ArrayList arrayList;
        String responseCodeString;
        boolean z10;
        switch (this.f38057a) {
            case 0:
                n3 n3Var = (n3) this.f38058b;
                Float f7 = (Float) obj;
                k4 k4Var = n3Var.L;
                if (n3Var == k4Var.f38805u0[0]) {
                    if (k4Var.f38793h0.f43274d0.getCurrentProgress() > f7.floatValue()) {
                        k4Var.f38793h0.f43274d0.a(0.0f, false);
                    }
                    k4Var.f38793h0.f43274d0.a(f7.floatValue(), true);
                    return;
                }
                return;
            case 1:
                ((org.telegram.ui.Components.qk0) this.f38058b).h((List) obj);
                return;
            case 2:
                TLRPC.User user = (TLRPC.User) obj;
                jr jrVar = ((ar) this.f38058b).f35769b;
                dr w02 = jrVar.w0();
                ArrayList arrayList2 = jrVar.F;
                a0.h hVar = jrVar.M;
                if (hVar != null && hVar.m() != 0) {
                    arrayList = jrVar.H;
                } else {
                    arrayList = arrayList2;
                }
                if (hVar == null || hVar.m() == 0) {
                    hVar = jrVar.K;
                }
                if (hVar.f(user.f20490id) == null) {
                    if (ChatObject.isChannel(jrVar.f38665r)) {
                        TLRPC.TL_channelParticipant tL_channelParticipant = new TLRPC.TL_channelParticipant();
                        tL_channelParticipant.inviter_id = jrVar.getUserConfig().getClientUserId();
                        TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                        tL_channelParticipant.peer = tL_peerUser;
                        tL_peerUser.user_id = user.f20490id;
                        tL_channelParticipant.date = jrVar.getConnectionsManager().getCurrentTime();
                        arrayList.add(0, tL_channelParticipant);
                        hVar.k(tL_channelParticipant, user.f20490id);
                    } else {
                        TLRPC.TL_chatParticipant tL_chatParticipant = new TLRPC.TL_chatParticipant();
                        tL_chatParticipant.user_id = user.f20490id;
                        tL_chatParticipant.inviter_id = jrVar.getUserConfig().getClientUserId();
                        arrayList.add(0, tL_chatParticipant);
                        hVar.k(tL_chatParticipant, user.f20490id);
                    }
                }
                if (arrayList == arrayList2) {
                    Collections.sort(arrayList2, new org.telegram.ui.ActionBar.l4(11));
                }
                jrVar.A0(w02);
                return;
            case 3:
                u3 u3Var = (u3) this.f38058b;
                int i10 = ((c5.i) obj).f4757a;
                if (i10 == 0) {
                    responseCodeString = null;
                } else {
                    responseCodeString = BillingController.getResponseCodeString(i10);
                }
                AndroidUtilities.runOnUIThread(new f80(26, u3Var, responseCodeString));
                return;
            case 4:
                fi0 fi0Var = (fi0) this.f38058b;
                if (((c5.i) obj).f4757a == 0) {
                    AndroidUtilities.runOnUIThread(fi0Var);
                    return;
                }
                return;
            case 5:
                ((ArrayList) this.f38058b).add((TLRPC.User) obj);
                return;
            case 6:
                ProfileActivity profileActivity = (ProfileActivity) this.f38058b;
                TLRPC.User user2 = (TLRPC.User) obj;
                for (int i11 = 0; i11 < profileActivity.f34032v2.participants.participants.size(); i11++) {
                    if (profileActivity.f34032v2.participants.participants.get(i11).user_id == user2.f20490id) {
                        profileActivity.f34032v2.participants.participants.remove(i11);
                        profileActivity.i5(true, false);
                        return;
                    }
                }
                return;
            default:
                View view = ((ProxyListActivity) this.f38058b).f34068b.T((View) obj).f46343a;
                if (view instanceof o11) {
                    o11 o11Var = (o11) view;
                    if (o11Var.d == SharedConfig.currentProxy) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    o11Var.setChecked(z10);
                    o11Var.b();
                    return;
                }
                return;
        }
    }
}
