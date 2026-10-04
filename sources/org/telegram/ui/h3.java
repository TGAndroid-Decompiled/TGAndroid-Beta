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
    public final int f36847a;
    public final Object f36848b;

    public h3(Object obj, int i10) {
        this.f36847a = i10;
        this.f36848b = obj;
    }

    @Override
    public final void accept(Object obj) {
        ArrayList arrayList;
        String responseCodeString;
        boolean z10;
        switch (this.f36847a) {
            case 0:
                m3 m3Var = (m3) this.f36848b;
                Float f7 = (Float) obj;
                i4 i4Var = m3Var.K;
                if (m3Var == i4Var.f37275u0[0]) {
                    if (i4Var.f37263h0.f42371d0.getCurrentProgress() > f7.floatValue()) {
                        i4Var.f37263h0.f42371d0.a(0.0f, false);
                    }
                    i4Var.f37263h0.f42371d0.a(f7.floatValue(), true);
                    return;
                }
                return;
            case 1:
                ((org.telegram.ui.Components.ck0) this.f36848b).h((List) obj);
                return;
            case 2:
                TLRPC.User user = (TLRPC.User) obj;
                rr rrVar = ((ir) this.f36848b).f37489b;
                lr w02 = rrVar.w0();
                ArrayList arrayList2 = rrVar.F;
                a0.i iVar = rrVar.M;
                if (iVar != null && iVar.m() != 0) {
                    arrayList = rrVar.H;
                } else {
                    arrayList = arrayList2;
                }
                if (iVar == null || iVar.m() == 0) {
                    iVar = rrVar.K;
                }
                if (iVar.f(user.f20185id) == null) {
                    if (ChatObject.isChannel(rrVar.f40222r)) {
                        TLRPC.TL_channelParticipant tL_channelParticipant = new TLRPC.TL_channelParticipant();
                        tL_channelParticipant.inviter_id = rrVar.getUserConfig().getClientUserId();
                        TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                        tL_channelParticipant.peer = tL_peerUser;
                        tL_peerUser.user_id = user.f20185id;
                        tL_channelParticipant.date = rrVar.getConnectionsManager().getCurrentTime();
                        arrayList.add(0, tL_channelParticipant);
                        iVar.k(tL_channelParticipant, user.f20185id);
                    } else {
                        TLRPC.TL_chatParticipant tL_chatParticipant = new TLRPC.TL_chatParticipant();
                        tL_chatParticipant.user_id = user.f20185id;
                        tL_chatParticipant.inviter_id = rrVar.getUserConfig().getClientUserId();
                        arrayList.add(0, tL_chatParticipant);
                        iVar.k(tL_chatParticipant, user.f20185id);
                    }
                }
                if (arrayList == arrayList2) {
                    Collections.sort(arrayList2, new ff(4));
                }
                rrVar.A0(w02);
                return;
            case 3:
                t3 t3Var = (t3) this.f36848b;
                int i10 = ((c5.h) obj).f4203a;
                if (i10 == 0) {
                    responseCodeString = null;
                } else {
                    responseCodeString = BillingController.getResponseCodeString(i10);
                }
                AndroidUtilities.runOnUIThread(new h90(24, t3Var, responseCodeString));
                return;
            case 4:
                oi0 oi0Var = (oi0) this.f36848b;
                if (((c5.h) obj).f4203a == 0) {
                    AndroidUtilities.runOnUIThread(oi0Var);
                    return;
                }
                return;
            case 5:
                ((ArrayList) this.f36848b).add((TLRPC.User) obj);
                return;
            case 6:
                ProfileActivity profileActivity = (ProfileActivity) this.f36848b;
                TLRPC.User user2 = (TLRPC.User) obj;
                for (int i11 = 0; i11 < profileActivity.f34345u2.participants.participants.size(); i11++) {
                    if (profileActivity.f34345u2.participants.participants.get(i11).user_id == user2.f20185id) {
                        profileActivity.f34345u2.participants.participants.remove(i11);
                        profileActivity.e5(true, false);
                        return;
                    }
                }
                return;
            default:
                View view = ((ProxyListActivity) this.f36848b).f34384b.T((View) obj).f46524a;
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
