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
    public final int f33721a;
    public final Object f33722b;

    public h3(Object obj, int i10) {
        this.f33721a = i10;
        this.f33722b = obj;
    }

    @Override
    public final void accept(Object obj) {
        ArrayList arrayList;
        String responseCodeString;
        boolean z10;
        switch (this.f33721a) {
            case 0:
                m3 m3Var = (m3) this.f33722b;
                Float f7 = (Float) obj;
                i4 i4Var = m3Var.K;
                if (m3Var == i4Var.f34021u0[0]) {
                    if (i4Var.f34009h0.f38851d0.getCurrentProgress() > f7.floatValue()) {
                        i4Var.f34009h0.f38851d0.a(0.0f, false);
                    }
                    i4Var.f34009h0.f38851d0.a(f7.floatValue(), true);
                    return;
                }
                return;
            case 1:
                ((org.telegram.ui.Components.qj0) this.f33722b).h((List) obj);
                return;
            case 2:
                TLRPC.User user = (TLRPC.User) obj;
                qr qrVar = ((hr) this.f33722b).f33906b;
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
                if (iVar.f(user.f18230id) == null) {
                    if (ChatObject.isChannel(qrVar.f36582r)) {
                        TLRPC.TL_channelParticipant tL_channelParticipant = new TLRPC.TL_channelParticipant();
                        tL_channelParticipant.inviter_id = qrVar.getUserConfig().getClientUserId();
                        TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                        tL_channelParticipant.peer = tL_peerUser;
                        tL_peerUser.user_id = user.f18230id;
                        tL_channelParticipant.date = qrVar.getConnectionsManager().getCurrentTime();
                        arrayList.add(0, tL_channelParticipant);
                        iVar.k(tL_channelParticipant, user.f18230id);
                    } else {
                        TLRPC.TL_chatParticipant tL_chatParticipant = new TLRPC.TL_chatParticipant();
                        tL_chatParticipant.user_id = user.f18230id;
                        tL_chatParticipant.inviter_id = qrVar.getUserConfig().getClientUserId();
                        arrayList.add(0, tL_chatParticipant);
                        iVar.k(tL_chatParticipant, user.f18230id);
                    }
                }
                if (arrayList == arrayList2) {
                    Collections.sort(arrayList2, new df(4));
                }
                qrVar.A0(w02);
                return;
            case 3:
                t3 t3Var = (t3) this.f33722b;
                int i10 = ((c5.h) obj).f3886a;
                if (i10 == 0) {
                    responseCodeString = null;
                } else {
                    responseCodeString = BillingController.getResponseCodeString(i10);
                }
                AndroidUtilities.runOnUIThread(new ia0(21, t3Var, responseCodeString));
                return;
            case 4:
                li0 li0Var = (li0) this.f33722b;
                if (((c5.h) obj).f3886a == 0) {
                    AndroidUtilities.runOnUIThread(li0Var);
                    return;
                }
                return;
            case 5:
                ((ArrayList) this.f33722b).add((TLRPC.User) obj);
                return;
            case 6:
                ProfileActivity profileActivity = (ProfileActivity) this.f33722b;
                TLRPC.User user2 = (TLRPC.User) obj;
                for (int i11 = 0; i11 < profileActivity.f31351u2.participants.participants.size(); i11++) {
                    if (profileActivity.f31351u2.participants.participants.get(i11).user_id == user2.f18230id) {
                        profileActivity.f31351u2.participants.participants.remove(i11);
                        profileActivity.e5(true, false);
                        return;
                    }
                }
                return;
            default:
                View view = ((ProxyListActivity) this.f33722b).f31390b.T((View) obj).f42627a;
                if (view instanceof z11) {
                    z11 z11Var = (z11) view;
                    if (z11Var.d == SharedConfig.currentProxy) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    z11Var.setChecked(z10);
                    z11Var.b();
                    return;
                }
                return;
        }
    }
}
