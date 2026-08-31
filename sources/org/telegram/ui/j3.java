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
    public final int f38003a;
    public final Object f38004b;

    public j3(Object obj, int i10) {
        this.f38003a = i10;
        this.f38004b = obj;
    }

    @Override
    public final void accept(Object obj) {
        ArrayList arrayList;
        String responseCodeString;
        boolean z4;
        switch (this.f38003a) {
            case 0:
                p3 p3Var = (p3) this.f38004b;
                Float f10 = (Float) obj;
                l4 l4Var = p3Var.H;
                if (p3Var == l4Var.f38619r0[0]) {
                    if (l4Var.f38607e0.f42700a0.getCurrentProgress() > f10.floatValue()) {
                        l4Var.f38607e0.f42700a0.a(0.0f, false);
                    }
                    l4Var.f38607e0.f42700a0.a(f10.floatValue(), true);
                    return;
                }
                return;
            case 1:
                ((org.telegram.ui.Components.ak0) this.f38004b).h((List) obj);
                return;
            case 2:
                TLRPC.User user = (TLRPC.User) obj;
                qr qrVar = ((hr) this.f38004b).f37603b;
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
                if (hVar.f(user.f20990id) == null) {
                    if (ChatObject.isChannel(qrVar.f40637r)) {
                        TLRPC.TL_channelParticipant tL_channelParticipant = new TLRPC.TL_channelParticipant();
                        tL_channelParticipant.inviter_id = qrVar.getUserConfig().getClientUserId();
                        TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                        tL_channelParticipant.peer = tL_peerUser;
                        tL_peerUser.user_id = user.f20990id;
                        tL_channelParticipant.date = qrVar.getConnectionsManager().getCurrentTime();
                        arrayList.add(0, tL_channelParticipant);
                        hVar.k(tL_channelParticipant, user.f20990id);
                    } else {
                        TLRPC.TL_chatParticipant tL_chatParticipant = new TLRPC.TL_chatParticipant();
                        tL_chatParticipant.user_id = user.f20990id;
                        tL_chatParticipant.inviter_id = qrVar.getUserConfig().getClientUserId();
                        arrayList.add(0, tL_chatParticipant);
                        hVar.k(tL_chatParticipant, user.f20990id);
                    }
                }
                if (arrayList == arrayList2) {
                    Collections.sort(arrayList2, new oh.k0(15));
                }
                qrVar.A0(w02);
                return;
            case 3:
                w3 w3Var = (w3) this.f38004b;
                int i10 = ((p2.h) obj).f44145a;
                if (i10 == 0) {
                    responseCodeString = null;
                } else {
                    responseCodeString = BillingController.getResponseCodeString(i10);
                }
                AndroidUtilities.runOnUIThread(new he0(8, w3Var, responseCodeString));
                return;
            case 4:
                ii0 ii0Var = (ii0) this.f38004b;
                if (((p2.h) obj).f44145a == 0) {
                    AndroidUtilities.runOnUIThread(ii0Var);
                    return;
                }
                return;
            case 5:
                ((ArrayList) this.f38004b).add((TLRPC.User) obj);
                return;
            case 6:
                ProfileActivity profileActivity = (ProfileActivity) this.f38004b;
                TLRPC.User user2 = (TLRPC.User) obj;
                for (int i11 = 0; i11 < profileActivity.f34683r2.participants.participants.size(); i11++) {
                    if (profileActivity.f34683r2.participants.participants.get(i11).user_id == user2.f20990id) {
                        profileActivity.f34683r2.participants.participants.remove(i11);
                        profileActivity.e5(true, false);
                        return;
                    }
                }
                return;
            default:
                View view = ((ProxyListActivity) this.f38004b).f34740b.T((View) obj).f5875a;
                if (view instanceof r11) {
                    r11 r11Var = (r11) view;
                    if (r11Var.d == SharedConfig.currentProxy) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    r11Var.setChecked(z4);
                    r11Var.b();
                    return;
                }
                return;
        }
    }
}
