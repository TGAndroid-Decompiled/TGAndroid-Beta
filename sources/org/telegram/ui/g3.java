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
    public final int f33744a;
    public final Object f33745b;

    public g3(Object obj, int i10) {
        this.f33744a = i10;
        this.f33745b = obj;
    }

    @Override
    public final void accept(Object obj) {
        ArrayList arrayList;
        String responseCodeString;
        boolean z10;
        switch (this.f33744a) {
            case 0:
                l3 l3Var = (l3) this.f33745b;
                Float f7 = (Float) obj;
                h4 h4Var = l3Var.K;
                if (l3Var == h4Var.f34151u0[0]) {
                    if (h4Var.f34139h0.f39112d0.getCurrentProgress() > f7.floatValue()) {
                        h4Var.f34139h0.f39112d0.a(0.0f, false);
                    }
                    h4Var.f34139h0.f39112d0.a(f7.floatValue(), true);
                    return;
                }
                return;
            case 1:
                ((org.telegram.ui.Components.pj0) this.f33745b).h((List) obj);
                return;
            case 2:
                TLRPC.User user = (TLRPC.User) obj;
                ur urVar = ((lr) this.f33745b).f35547b;
                or w02 = urVar.w0();
                ArrayList arrayList2 = urVar.F;
                a0.i iVar = urVar.M;
                if (iVar != null && iVar.m() != 0) {
                    arrayList = urVar.H;
                } else {
                    arrayList = arrayList2;
                }
                if (iVar == null || iVar.m() == 0) {
                    iVar = urVar.K;
                }
                if (iVar.f(user.f18259id) == null) {
                    if (ChatObject.isChannel(urVar.f38130r)) {
                        TLRPC.TL_channelParticipant tL_channelParticipant = new TLRPC.TL_channelParticipant();
                        tL_channelParticipant.inviter_id = urVar.getUserConfig().getClientUserId();
                        TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                        tL_channelParticipant.peer = tL_peerUser;
                        tL_peerUser.user_id = user.f18259id;
                        tL_channelParticipant.date = urVar.getConnectionsManager().getCurrentTime();
                        arrayList.add(0, tL_channelParticipant);
                        iVar.k(tL_channelParticipant, user.f18259id);
                    } else {
                        TLRPC.TL_chatParticipant tL_chatParticipant = new TLRPC.TL_chatParticipant();
                        tL_chatParticipant.user_id = user.f18259id;
                        tL_chatParticipant.inviter_id = urVar.getUserConfig().getClientUserId();
                        arrayList.add(0, tL_chatParticipant);
                        iVar.k(tL_chatParticipant, user.f18259id);
                    }
                }
                if (arrayList == arrayList2) {
                    Collections.sort(arrayList2, new df(4));
                }
                urVar.A0(w02);
                return;
            case 3:
                s3 s3Var = (s3) this.f33745b;
                int i10 = ((c5.h) obj).f3889a;
                if (i10 == 0) {
                    responseCodeString = null;
                } else {
                    responseCodeString = BillingController.getResponseCodeString(i10);
                }
                AndroidUtilities.runOnUIThread(new ma0(21, s3Var, responseCodeString));
                return;
            case 4:
                qi0 qi0Var = (qi0) this.f33745b;
                if (((c5.h) obj).f3889a == 0) {
                    AndroidUtilities.runOnUIThread(qi0Var);
                    return;
                }
                return;
            case 5:
                ((ArrayList) this.f33745b).add((TLRPC.User) obj);
                return;
            case 6:
                ProfileActivity profileActivity = (ProfileActivity) this.f33745b;
                TLRPC.User user2 = (TLRPC.User) obj;
                for (int i11 = 0; i11 < profileActivity.f31380u2.participants.participants.size(); i11++) {
                    if (profileActivity.f31380u2.participants.participants.get(i11).user_id == user2.f18259id) {
                        profileActivity.f31380u2.participants.participants.remove(i11);
                        profileActivity.e5(true, false);
                        return;
                    }
                }
                return;
            default:
                View view = ((ProxyListActivity) this.f33745b).f31419b.T((View) obj).f42675a;
                if (view instanceof g21) {
                    g21 g21Var = (g21) view;
                    if (g21Var.d == SharedConfig.currentProxy) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    g21Var.setChecked(z10);
                    g21Var.b();
                    return;
                }
                return;
        }
    }
}
