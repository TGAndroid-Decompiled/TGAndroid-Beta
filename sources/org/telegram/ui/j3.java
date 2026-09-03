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
public final class j3 implements q0.a {
    public final int f37827a;
    public final Object f37828b;

    public j3(Object obj, int i10) {
        this.f37827a = i10;
        this.f37828b = obj;
    }

    @Override
    public final void accept(Object obj) {
        ArrayList arrayList;
        String responseCodeString;
        boolean z4;
        switch (this.f37827a) {
            case 0:
                p3 p3Var = (p3) this.f37828b;
                Float f10 = (Float) obj;
                l4 l4Var = p3Var.H;
                if (p3Var == l4Var.f38524r0[0]) {
                    if (l4Var.f38512e0.f42663a0.getCurrentProgress() > f10.floatValue()) {
                        l4Var.f38512e0.f42663a0.a(0.0f, false);
                    }
                    l4Var.f38512e0.f42663a0.a(f10.floatValue(), true);
                    return;
                }
                return;
            case 1:
                ((org.telegram.ui.Components.zj0) this.f37828b).h((List) obj);
                return;
            case 2:
                TLRPC.User user = (TLRPC.User) obj;
                qr qrVar = ((hr) this.f37828b).f37466b;
                kr w02 = qrVar.w0();
                ArrayList arrayList2 = qrVar.C;
                a0.h hVar = qrVar.J;
                if (hVar != null && hVar.m() != 0) {
                    arrayList = qrVar.E;
                } else {
                    arrayList = arrayList2;
                }
                if (hVar == null || hVar.m() == 0) {
                    hVar = qrVar.H;
                }
                if (hVar.f(user.f20992id) == null) {
                    if (ChatObject.isChannel(qrVar.f40605r)) {
                        TLRPC.TL_channelParticipant tL_channelParticipant = new TLRPC.TL_channelParticipant();
                        tL_channelParticipant.inviter_id = qrVar.getUserConfig().getClientUserId();
                        TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                        tL_channelParticipant.peer = tL_peerUser;
                        tL_peerUser.user_id = user.f20992id;
                        tL_channelParticipant.date = qrVar.getConnectionsManager().getCurrentTime();
                        arrayList.add(0, tL_channelParticipant);
                        hVar.k(tL_channelParticipant, user.f20992id);
                    } else {
                        TLRPC.TL_chatParticipant tL_chatParticipant = new TLRPC.TL_chatParticipant();
                        tL_chatParticipant.user_id = user.f20992id;
                        tL_chatParticipant.inviter_id = qrVar.getUserConfig().getClientUserId();
                        arrayList.add(0, tL_chatParticipant);
                        hVar.k(tL_chatParticipant, user.f20992id);
                    }
                }
                if (arrayList == arrayList2) {
                    Collections.sort(arrayList2, new oh.k0(15));
                }
                qrVar.A0(w02);
                return;
            case 3:
                w3 w3Var = (w3) this.f37828b;
                int i10 = ((p2.h) obj).f44176a;
                if (i10 == 0) {
                    responseCodeString = null;
                } else {
                    responseCodeString = BillingController.getResponseCodeString(i10);
                }
                AndroidUtilities.runOnUIThread(new ue0(7, w3Var, responseCodeString));
                return;
            case 4:
                ii0 ii0Var = (ii0) this.f37828b;
                if (((p2.h) obj).f44176a == 0) {
                    AndroidUtilities.runOnUIThread(ii0Var);
                    return;
                }
                return;
            case 5:
                ((ArrayList) this.f37828b).add((TLRPC.User) obj);
                return;
            case 6:
                ProfileActivity profileActivity = (ProfileActivity) this.f37828b;
                TLRPC.User user2 = (TLRPC.User) obj;
                for (int i11 = 0; i11 < profileActivity.f34683r2.participants.participants.size(); i11++) {
                    if (profileActivity.f34683r2.participants.participants.get(i11).user_id == user2.f20992id) {
                        profileActivity.f34683r2.participants.participants.remove(i11);
                        profileActivity.e5(true, false);
                        return;
                    }
                }
                return;
            default:
                View view = ((ProxyListActivity) this.f37828b).f34740b.T((View) obj).f5875a;
                if (view instanceof v11) {
                    v11 v11Var = (v11) view;
                    if (v11Var.d == SharedConfig.currentProxy) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    v11Var.setChecked(z4);
                    v11Var.b();
                    return;
                }
                return;
        }
    }
}
