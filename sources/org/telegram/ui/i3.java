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
    public final int f33525a;
    public final Object f33526b;

    public i3(Object obj, int i10) {
        this.f33525a = i10;
        this.f33526b = obj;
    }

    @Override
    public final void accept(Object obj) {
        ArrayList arrayList;
        String responseCodeString;
        boolean z10;
        switch (this.f33525a) {
            case 0:
                n3 n3Var = (n3) this.f33526b;
                Float f7 = (Float) obj;
                j4 j4Var = n3Var.K;
                if (n3Var == j4Var.f33920u0[0]) {
                    if (j4Var.f33908h0.f38106d0.getCurrentProgress() > f7.floatValue()) {
                        j4Var.f33908h0.f38106d0.a(0.0f, false);
                    }
                    j4Var.f33908h0.f38106d0.a(f7.floatValue(), true);
                    return;
                }
                return;
            case 1:
                ((org.telegram.ui.Components.zj0) this.f33526b).h((List) obj);
                return;
            case 2:
                TLRPC.User user = (TLRPC.User) obj;
                wr wrVar = ((nr) this.f33526b).f35328b;
                qr w02 = wrVar.w0();
                ArrayList arrayList2 = wrVar.F;
                a0.i iVar = wrVar.M;
                if (iVar != null && iVar.m() != 0) {
                    arrayList = wrVar.H;
                } else {
                    arrayList = arrayList2;
                }
                if (iVar == null || iVar.m() == 0) {
                    iVar = wrVar.K;
                }
                if (iVar.f(user.f17342id) == null) {
                    if (ChatObject.isChannel(wrVar.f38354r)) {
                        TLRPC.TL_channelParticipant tL_channelParticipant = new TLRPC.TL_channelParticipant();
                        tL_channelParticipant.inviter_id = wrVar.getUserConfig().getClientUserId();
                        TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                        tL_channelParticipant.peer = tL_peerUser;
                        tL_peerUser.user_id = user.f17342id;
                        tL_channelParticipant.date = wrVar.getConnectionsManager().getCurrentTime();
                        arrayList.add(0, tL_channelParticipant);
                        iVar.k(tL_channelParticipant, user.f17342id);
                    } else {
                        TLRPC.TL_chatParticipant tL_chatParticipant = new TLRPC.TL_chatParticipant();
                        tL_chatParticipant.user_id = user.f17342id;
                        tL_chatParticipant.inviter_id = wrVar.getUserConfig().getClientUserId();
                        arrayList.add(0, tL_chatParticipant);
                        iVar.k(tL_chatParticipant, user.f17342id);
                    }
                }
                if (arrayList == arrayList2) {
                    Collections.sort(arrayList2, new a4.e(27));
                }
                wrVar.A0(w02);
                return;
            case 3:
                u3 u3Var = (u3) this.f33526b;
                int i10 = ((c5.h) obj).f4308a;
                if (i10 == 0) {
                    responseCodeString = null;
                } else {
                    responseCodeString = BillingController.getResponseCodeString(i10);
                }
                AndroidUtilities.runOnUIThread(new h90(24, u3Var, responseCodeString));
                return;
            case 4:
                ri0 ri0Var = (ri0) this.f33526b;
                if (((c5.h) obj).f4308a == 0) {
                    AndroidUtilities.runOnUIThread(ri0Var);
                    return;
                }
                return;
            case 5:
                ((ArrayList) this.f33526b).add((TLRPC.User) obj);
                return;
            case 6:
                ProfileActivity profileActivity = (ProfileActivity) this.f33526b;
                TLRPC.User user2 = (TLRPC.User) obj;
                for (int i11 = 0; i11 < profileActivity.f30492u2.participants.participants.size(); i11++) {
                    if (profileActivity.f30492u2.participants.participants.get(i11).user_id == user2.f17342id) {
                        profileActivity.f30492u2.participants.participants.remove(i11);
                        profileActivity.e5(true, false);
                        return;
                    }
                }
                return;
            default:
                View view = ((ProxyListActivity) this.f33526b).f30531b.T((View) obj).f41610a;
                if (view instanceof m21) {
                    m21 m21Var = (m21) view;
                    if (m21Var.d == SharedConfig.currentProxy) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    m21Var.setChecked(z10);
                    m21Var.b();
                    return;
                }
                return;
        }
    }
}
