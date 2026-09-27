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
    public final int f34345a;
    public final Object f34346b;

    public i3(Object obj, int i10) {
        this.f34345a = i10;
        this.f34346b = obj;
    }

    @Override
    public final void accept(Object obj) {
        ArrayList arrayList;
        String responseCodeString;
        boolean z10;
        switch (this.f34345a) {
            case 0:
                n3 n3Var = (n3) this.f34346b;
                Float f7 = (Float) obj;
                j4 j4Var = n3Var.K;
                if (n3Var == j4Var.f34627u0[0]) {
                    if (j4Var.f34615h0.f39187d0.getCurrentProgress() > f7.floatValue()) {
                        j4Var.f34615h0.f39187d0.a(0.0f, false);
                    }
                    j4Var.f34615h0.f39187d0.a(f7.floatValue(), true);
                    return;
                }
                return;
            case 1:
                ((org.telegram.ui.Components.ck0) this.f34346b).h((List) obj);
                return;
            case 2:
                TLRPC.User user = (TLRPC.User) obj;
                qr qrVar = ((hr) this.f34346b).f34271b;
                kr w02 = qrVar.w0();
                ArrayList arrayList2 = qrVar.F;
                a0.i iVar = qrVar.M;
                if (iVar != null && iVar.m() != 0) {
                    arrayList = qrVar.H;
                } else {
                    arrayList = arrayList2;
                }
                if (iVar == null || iVar.m() == 0) {
                    iVar = qrVar.K;
                }
                if (iVar.f(user.f18476id) == null) {
                    if (ChatObject.isChannel(qrVar.f36854r)) {
                        TLRPC.TL_channelParticipant tL_channelParticipant = new TLRPC.TL_channelParticipant();
                        tL_channelParticipant.inviter_id = qrVar.getUserConfig().getClientUserId();
                        TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                        tL_channelParticipant.peer = tL_peerUser;
                        tL_peerUser.user_id = user.f18476id;
                        tL_channelParticipant.date = qrVar.getConnectionsManager().getCurrentTime();
                        arrayList.add(0, tL_channelParticipant);
                        iVar.k(tL_channelParticipant, user.f18476id);
                    } else {
                        TLRPC.TL_chatParticipant tL_chatParticipant = new TLRPC.TL_chatParticipant();
                        tL_chatParticipant.user_id = user.f18476id;
                        tL_chatParticipant.inviter_id = qrVar.getUserConfig().getClientUserId();
                        arrayList.add(0, tL_chatParticipant);
                        iVar.k(tL_chatParticipant, user.f18476id);
                    }
                }
                if (arrayList == arrayList2) {
                    Collections.sort(arrayList2, new ff(4));
                }
                qrVar.A0(w02);
                return;
            case 3:
                u3 u3Var = (u3) this.f34346b;
                int i10 = ((c5.h) obj).f3888a;
                if (i10 == 0) {
                    responseCodeString = null;
                } else {
                    responseCodeString = BillingController.getResponseCodeString(i10);
                }
                AndroidUtilities.runOnUIThread(new ea0(22, u3Var, responseCodeString));
                return;
            case 4:
                ni0 ni0Var = (ni0) this.f34346b;
                if (((c5.h) obj).f3888a == 0) {
                    AndroidUtilities.runOnUIThread(ni0Var);
                    return;
                }
                return;
            case 5:
                ((ArrayList) this.f34346b).add((TLRPC.User) obj);
                return;
            case 6:
                ProfileActivity profileActivity = (ProfileActivity) this.f34346b;
                TLRPC.User user2 = (TLRPC.User) obj;
                for (int i11 = 0; i11 < profileActivity.f31668u2.participants.participants.size(); i11++) {
                    if (profileActivity.f31668u2.participants.participants.get(i11).user_id == user2.f18476id) {
                        profileActivity.f31668u2.participants.participants.remove(i11);
                        profileActivity.e5(true, false);
                        return;
                    }
                }
                return;
            default:
                View view = ((ProxyListActivity) this.f34346b).f31707b.U((View) obj).f43005a;
                if (view instanceof y11) {
                    y11 y11Var = (y11) view;
                    if (y11Var.d == SharedConfig.currentProxy) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    y11Var.setChecked(z10);
                    y11Var.b();
                    return;
                }
                return;
        }
    }
}
