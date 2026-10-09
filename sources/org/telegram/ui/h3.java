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
public final class h3 implements q0.a {
    public final int f38204a;
    public final Object f38205b;

    public h3(Object obj, int i10) {
        this.f38204a = i10;
        this.f38205b = obj;
    }

    @Override
    public final void accept(Object obj) {
        ArrayList arrayList;
        String responseCodeString;
        boolean z10;
        switch (this.f38204a) {
            case 0:
                m3 m3Var = (m3) this.f38205b;
                Float f7 = (Float) obj;
                i4 i4Var = m3Var.K;
                if (m3Var == i4Var.f38513u0[0]) {
                    if (i4Var.f38501h0.f43480d0.getCurrentProgress() > f7.floatValue()) {
                        i4Var.f38501h0.f43480d0.a(0.0f, false);
                    }
                    i4Var.f38501h0.f43480d0.a(f7.floatValue(), true);
                    return;
                }
                return;
            case 1:
                ((org.telegram.ui.Components.uk0) this.f38205b).h((List) obj);
                return;
            case 2:
                TLRPC.User user = (TLRPC.User) obj;
                tr trVar = ((jr) this.f38205b).f39008b;
                mr w02 = trVar.w0();
                ArrayList arrayList2 = trVar.F;
                a0.i iVar = trVar.M;
                if (iVar != null && iVar.m() != 0) {
                    arrayList = trVar.H;
                } else {
                    arrayList = arrayList2;
                }
                if (iVar == null || iVar.m() == 0) {
                    iVar = trVar.K;
                }
                if (iVar.f(user.f20185id) == null) {
                    if (ChatObject.isChannel(trVar.f42088r)) {
                        TLRPC.TL_channelParticipant tL_channelParticipant = new TLRPC.TL_channelParticipant();
                        tL_channelParticipant.inviter_id = trVar.getUserConfig().getClientUserId();
                        TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                        tL_channelParticipant.peer = tL_peerUser;
                        tL_peerUser.user_id = user.f20185id;
                        tL_channelParticipant.date = trVar.getConnectionsManager().getCurrentTime();
                        arrayList.add(0, tL_channelParticipant);
                        iVar.k(tL_channelParticipant, user.f20185id);
                    } else {
                        TLRPC.TL_chatParticipant tL_chatParticipant = new TLRPC.TL_chatParticipant();
                        tL_chatParticipant.user_id = user.f20185id;
                        tL_chatParticipant.inviter_id = trVar.getUserConfig().getClientUserId();
                        arrayList.add(0, tL_chatParticipant);
                        iVar.k(tL_chatParticipant, user.f20185id);
                    }
                }
                if (arrayList == arrayList2) {
                    Collections.sort(arrayList2, new gf(4));
                }
                trVar.A0(w02);
                return;
            case 3:
                t3 t3Var = (t3) this.f38205b;
                int i10 = ((c5.h) obj).f4254a;
                if (i10 == 0) {
                    responseCodeString = null;
                } else {
                    responseCodeString = BillingController.getResponseCodeString(i10);
                }
                AndroidUtilities.runOnUIThread(new tf0(2, t3Var, responseCodeString));
                return;
            case 4:
                si0 si0Var = (si0) this.f38205b;
                if (((c5.h) obj).f4254a == 0) {
                    AndroidUtilities.runOnUIThread(si0Var);
                    return;
                }
                return;
            case 5:
                ((ArrayList) this.f38205b).add((TLRPC.User) obj);
                return;
            case 6:
                ProfileActivity profileActivity = (ProfileActivity) this.f38205b;
                TLRPC.User user2 = (TLRPC.User) obj;
                for (int i11 = 0; i11 < profileActivity.f34354u2.participants.participants.size(); i11++) {
                    if (profileActivity.f34354u2.participants.participants.get(i11).user_id == user2.f20185id) {
                        profileActivity.f34354u2.participants.participants.remove(i11);
                        profileActivity.e5(true, false);
                        return;
                    }
                }
                return;
            default:
                View view = ((ProxyListActivity) this.f38205b).f34393b.T((View) obj).f47656a;
                if (view instanceof f21) {
                    f21 f21Var = (f21) view;
                    if (f21Var.d == SharedConfig.currentProxy) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    f21Var.setChecked(z10);
                    f21Var.b();
                    return;
                }
                return;
        }
    }
}
