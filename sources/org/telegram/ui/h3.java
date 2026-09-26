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
    public final int f34111a;
    public final Object f34112b;

    public h3(Object obj, int i10) {
        this.f34111a = i10;
        this.f34112b = obj;
    }

    @Override
    public final void accept(Object obj) {
        ArrayList arrayList;
        String responseCodeString;
        boolean z10;
        switch (this.f34111a) {
            case 0:
                m3 m3Var = (m3) this.f34112b;
                Float f7 = (Float) obj;
                i4 i4Var = m3Var.K;
                if (m3Var == i4Var.f34406u0[0]) {
                    if (i4Var.f34394h0.f39231d0.getCurrentProgress() > f7.floatValue()) {
                        i4Var.f34394h0.f39231d0.a(0.0f, false);
                    }
                    i4Var.f34394h0.f39231d0.a(f7.floatValue(), true);
                    return;
                }
                return;
            case 1:
                ((org.telegram.ui.Components.bk0) this.f34112b).h((List) obj);
                return;
            case 2:
                TLRPC.User user = (TLRPC.User) obj;
                pr prVar = ((gr) this.f34112b).f34039b;
                jr w02 = prVar.w0();
                ArrayList arrayList2 = prVar.F;
                a0.i iVar = prVar.M;
                if (iVar != null && iVar.m() != 0) {
                    arrayList = prVar.H;
                } else {
                    arrayList = arrayList2;
                }
                if (iVar == null || iVar.m() == 0) {
                    iVar = prVar.K;
                }
                if (iVar.f(user.f18482id) == null) {
                    if (ChatObject.isChannel(prVar.f36645r)) {
                        TLRPC.TL_channelParticipant tL_channelParticipant = new TLRPC.TL_channelParticipant();
                        tL_channelParticipant.inviter_id = prVar.getUserConfig().getClientUserId();
                        TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                        tL_channelParticipant.peer = tL_peerUser;
                        tL_peerUser.user_id = user.f18482id;
                        tL_channelParticipant.date = prVar.getConnectionsManager().getCurrentTime();
                        arrayList.add(0, tL_channelParticipant);
                        iVar.k(tL_channelParticipant, user.f18482id);
                    } else {
                        TLRPC.TL_chatParticipant tL_chatParticipant = new TLRPC.TL_chatParticipant();
                        tL_chatParticipant.user_id = user.f18482id;
                        tL_chatParticipant.inviter_id = prVar.getUserConfig().getClientUserId();
                        arrayList.add(0, tL_chatParticipant);
                        iVar.k(tL_chatParticipant, user.f18482id);
                    }
                }
                if (arrayList == arrayList2) {
                    Collections.sort(arrayList2, new cf(4));
                }
                prVar.A0(w02);
                return;
            case 3:
                t3 t3Var = (t3) this.f34112b;
                int i10 = ((c5.h) obj).f3886a;
                if (i10 == 0) {
                    responseCodeString = null;
                } else {
                    responseCodeString = BillingController.getResponseCodeString(i10);
                }
                AndroidUtilities.runOnUIThread(new n80(26, t3Var, responseCodeString));
                return;
            case 4:
                ki0 ki0Var = (ki0) this.f34112b;
                if (((c5.h) obj).f3886a == 0) {
                    AndroidUtilities.runOnUIThread(ki0Var);
                    return;
                }
                return;
            case 5:
                ((ArrayList) this.f34112b).add((TLRPC.User) obj);
                return;
            case 6:
                ProfileActivity profileActivity = (ProfileActivity) this.f34112b;
                TLRPC.User user2 = (TLRPC.User) obj;
                for (int i11 = 0; i11 < profileActivity.f31665u2.participants.participants.size(); i11++) {
                    if (profileActivity.f31665u2.participants.participants.get(i11).user_id == user2.f18482id) {
                        profileActivity.f31665u2.participants.participants.remove(i11);
                        profileActivity.e5(true, false);
                        return;
                    }
                }
                return;
            default:
                View view = ((ProxyListActivity) this.f34112b).f31704b.T((View) obj).f42959a;
                if (view instanceof x11) {
                    x11 x11Var = (x11) view;
                    if (x11Var.d == SharedConfig.currentProxy) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    x11Var.setChecked(z10);
                    x11Var.b();
                    return;
                }
                return;
        }
    }
}
