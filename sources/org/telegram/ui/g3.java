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
public final class g3 implements q0.a {
    public final int f33679a;
    public final Object f33680b;

    public g3(Object obj, int i10) {
        this.f33679a = i10;
        this.f33680b = obj;
    }

    @Override
    public final void accept(Object obj) {
        ArrayList arrayList;
        String responseCodeString;
        boolean z10;
        switch (this.f33679a) {
            case 0:
                l3 l3Var = (l3) this.f33680b;
                Float f7 = (Float) obj;
                h4 h4Var = l3Var.K;
                if (l3Var == h4Var.f34074u0[0]) {
                    if (h4Var.f34062h0.f39080d0.getCurrentProgress() > f7.floatValue()) {
                        h4Var.f34062h0.f39080d0.a(0.0f, false);
                    }
                    h4Var.f34062h0.f39080d0.a(f7.floatValue(), true);
                    return;
                }
                return;
            case 1:
                ((org.telegram.ui.Components.ak0) this.f33680b).h((List) obj);
                return;
            case 2:
                TLRPC.User user = (TLRPC.User) obj;
                sr srVar = ((jr) this.f33680b).f34932b;
                mr w02 = srVar.w0();
                ArrayList arrayList2 = srVar.F;
                a0.i iVar = srVar.M;
                if (iVar != null && iVar.m() != 0) {
                    arrayList = srVar.H;
                } else {
                    arrayList = arrayList2;
                }
                if (iVar == null || iVar.m() == 0) {
                    iVar = srVar.K;
                }
                if (iVar.f(user.f18443id) == null) {
                    if (ChatObject.isChannel(srVar.f37429r)) {
                        TLRPC.TL_channelParticipant tL_channelParticipant = new TLRPC.TL_channelParticipant();
                        tL_channelParticipant.inviter_id = srVar.getUserConfig().getClientUserId();
                        TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                        tL_channelParticipant.peer = tL_peerUser;
                        tL_peerUser.user_id = user.f18443id;
                        tL_channelParticipant.date = srVar.getConnectionsManager().getCurrentTime();
                        arrayList.add(0, tL_channelParticipant);
                        iVar.k(tL_channelParticipant, user.f18443id);
                    } else {
                        TLRPC.TL_chatParticipant tL_chatParticipant = new TLRPC.TL_chatParticipant();
                        tL_chatParticipant.user_id = user.f18443id;
                        tL_chatParticipant.inviter_id = srVar.getUserConfig().getClientUserId();
                        arrayList.add(0, tL_chatParticipant);
                        iVar.k(tL_chatParticipant, user.f18443id);
                    }
                }
                if (arrayList == arrayList2) {
                    Collections.sort(arrayList2, new df(4));
                }
                srVar.A0(w02);
                return;
            case 3:
                s3 s3Var = (s3) this.f33680b;
                int i10 = ((c5.h) obj).f3894a;
                if (i10 == 0) {
                    responseCodeString = null;
                } else {
                    responseCodeString = BillingController.getResponseCodeString(i10);
                }
                AndroidUtilities.runOnUIThread(new y80(25, s3Var, responseCodeString));
                return;
            case 4:
                ri0 ri0Var = (ri0) this.f33680b;
                if (((c5.h) obj).f3894a == 0) {
                    AndroidUtilities.runOnUIThread(ri0Var);
                    return;
                }
                return;
            case 5:
                ((ArrayList) this.f33680b).add((TLRPC.User) obj);
                return;
            case 6:
                ProfileActivity profileActivity = (ProfileActivity) this.f33680b;
                TLRPC.User user2 = (TLRPC.User) obj;
                for (int i11 = 0; i11 < profileActivity.f31624u2.participants.participants.size(); i11++) {
                    if (profileActivity.f31624u2.participants.participants.get(i11).user_id == user2.f18443id) {
                        profileActivity.f31624u2.participants.participants.remove(i11);
                        profileActivity.e5(true, false);
                        return;
                    }
                }
                return;
            default:
                View view = ((ProxyListActivity) this.f33680b).f31663b.U((View) obj).f42929a;
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
