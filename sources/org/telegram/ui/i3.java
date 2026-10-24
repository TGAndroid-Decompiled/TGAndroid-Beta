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
    public final int f38133a;
    public final Object f38134b;

    public i3(Object obj, int i10) {
        this.f38133a = i10;
        this.f38134b = obj;
    }

    @Override
    public final void accept(Object obj) {
        ArrayList arrayList;
        String responseCodeString;
        boolean z10;
        switch (this.f38133a) {
            case 0:
                n3 n3Var = (n3) this.f38134b;
                Float f7 = (Float) obj;
                k4 k4Var = n3Var.L;
                if (n3Var == k4Var.f38774u0[0]) {
                    if (k4Var.f38762h0.f43263d0.getCurrentProgress() > f7.floatValue()) {
                        k4Var.f38762h0.f43263d0.a(0.0f, false);
                    }
                    k4Var.f38762h0.f43263d0.a(f7.floatValue(), true);
                    return;
                }
                return;
            case 1:
                ((org.telegram.ui.Components.pk0) this.f38134b).h((List) obj);
                return;
            case 2:
                TLRPC.User user = (TLRPC.User) obj;
                jr jrVar = ((ar) this.f38134b).f35827b;
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
                if (hVar.f(user.f20491id) == null) {
                    if (ChatObject.isChannel(jrVar.f38653r)) {
                        TLRPC.TL_channelParticipant tL_channelParticipant = new TLRPC.TL_channelParticipant();
                        tL_channelParticipant.inviter_id = jrVar.getUserConfig().getClientUserId();
                        TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                        tL_channelParticipant.peer = tL_peerUser;
                        tL_peerUser.user_id = user.f20491id;
                        tL_channelParticipant.date = jrVar.getConnectionsManager().getCurrentTime();
                        arrayList.add(0, tL_channelParticipant);
                        hVar.k(tL_channelParticipant, user.f20491id);
                    } else {
                        TLRPC.TL_chatParticipant tL_chatParticipant = new TLRPC.TL_chatParticipant();
                        tL_chatParticipant.user_id = user.f20491id;
                        tL_chatParticipant.inviter_id = jrVar.getUserConfig().getClientUserId();
                        arrayList.add(0, tL_chatParticipant);
                        hVar.k(tL_chatParticipant, user.f20491id);
                    }
                }
                if (arrayList == arrayList2) {
                    Collections.sort(arrayList2, new org.telegram.ui.ActionBar.l4(11));
                }
                jrVar.A0(w02);
                return;
            case 3:
                u3 u3Var = (u3) this.f38134b;
                int i10 = ((c5.i) obj).f4757a;
                if (i10 == 0) {
                    responseCodeString = null;
                } else {
                    responseCodeString = BillingController.getResponseCodeString(i10);
                }
                AndroidUtilities.runOnUIThread(new f80(26, u3Var, responseCodeString));
                return;
            case 4:
                ei0 ei0Var = (ei0) this.f38134b;
                if (((c5.i) obj).f4757a == 0) {
                    AndroidUtilities.runOnUIThread(ei0Var);
                    return;
                }
                return;
            case 5:
                ((ArrayList) this.f38134b).add((TLRPC.User) obj);
                return;
            case 6:
                ProfileActivity profileActivity = (ProfileActivity) this.f38134b;
                TLRPC.User user2 = (TLRPC.User) obj;
                for (int i11 = 0; i11 < profileActivity.f34034v2.participants.participants.size(); i11++) {
                    if (profileActivity.f34034v2.participants.participants.get(i11).user_id == user2.f20491id) {
                        profileActivity.f34034v2.participants.participants.remove(i11);
                        profileActivity.i5(true, false);
                        return;
                    }
                }
                return;
            default:
                View view = ((ProxyListActivity) this.f38134b).f34070b.T((View) obj).f46342a;
                if (view instanceof n11) {
                    n11 n11Var = (n11) view;
                    if (n11Var.d == SharedConfig.currentProxy) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    n11Var.setChecked(z10);
                    n11Var.b();
                    return;
                }
                return;
        }
    }
}
