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
    public final int f36898a;
    public final Object f36899b;

    public h3(Object obj, int i10) {
        this.f36898a = i10;
        this.f36899b = obj;
    }

    @Override
    public final void accept(Object obj) {
        ArrayList arrayList;
        String responseCodeString;
        boolean z10;
        switch (this.f36898a) {
            case 0:
                m3 m3Var = (m3) this.f36899b;
                Float f7 = (Float) obj;
                i4 i4Var = m3Var.K;
                if (m3Var == i4Var.f37260u0[0]) {
                    if (i4Var.f37248h0.f42308d0.getCurrentProgress() > f7.floatValue()) {
                        i4Var.f37248h0.f42308d0.a(0.0f, false);
                    }
                    i4Var.f37248h0.f42308d0.a(f7.floatValue(), true);
                    return;
                }
                return;
            case 1:
                ((org.telegram.ui.Components.pj0) this.f36899b).h((List) obj);
                return;
            case 2:
                TLRPC.User user = (TLRPC.User) obj;
                vr vrVar = ((mr) this.f36899b).f38777b;
                pr w02 = vrVar.w0();
                ArrayList arrayList2 = vrVar.F;
                a0.i iVar = vrVar.M;
                if (iVar != null && iVar.m() != 0) {
                    arrayList = vrVar.H;
                } else {
                    arrayList = arrayList2;
                }
                if (iVar == null || iVar.m() == 0) {
                    iVar = vrVar.K;
                }
                if (iVar.f(user.f20043id) == null) {
                    if (ChatObject.isChannel(vrVar.f41695r)) {
                        TLRPC.TL_channelParticipant tL_channelParticipant = new TLRPC.TL_channelParticipant();
                        tL_channelParticipant.inviter_id = vrVar.getUserConfig().getClientUserId();
                        TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                        tL_channelParticipant.peer = tL_peerUser;
                        tL_peerUser.user_id = user.f20043id;
                        tL_channelParticipant.date = vrVar.getConnectionsManager().getCurrentTime();
                        arrayList.add(0, tL_channelParticipant);
                        iVar.k(tL_channelParticipant, user.f20043id);
                    } else {
                        TLRPC.TL_chatParticipant tL_chatParticipant = new TLRPC.TL_chatParticipant();
                        tL_chatParticipant.user_id = user.f20043id;
                        tL_chatParticipant.inviter_id = vrVar.getUserConfig().getClientUserId();
                        arrayList.add(0, tL_chatParticipant);
                        iVar.k(tL_chatParticipant, user.f20043id);
                    }
                }
                if (arrayList == arrayList2) {
                    Collections.sort(arrayList2, new f6(6));
                }
                vrVar.A0(w02);
                return;
            case 3:
                t3 t3Var = (t3) this.f36899b;
                int i10 = ((c5.h) obj).f4424a;
                if (i10 == 0) {
                    responseCodeString = null;
                } else {
                    responseCodeString = BillingController.getResponseCodeString(i10);
                }
                AndroidUtilities.runOnUIThread(new r80(27, t3Var, responseCodeString));
                return;
            case 4:
                ri0 ri0Var = (ri0) this.f36899b;
                if (((c5.h) obj).f4424a == 0) {
                    AndroidUtilities.runOnUIThread(ri0Var);
                    return;
                }
                return;
            case 5:
                ((ArrayList) this.f36899b).add((TLRPC.User) obj);
                return;
            case 6:
                ProfileActivity profileActivity = (ProfileActivity) this.f36899b;
                TLRPC.User user2 = (TLRPC.User) obj;
                for (int i11 = 0; i11 < profileActivity.f34027u2.participants.participants.size(); i11++) {
                    if (profileActivity.f34027u2.participants.participants.get(i11).user_id == user2.f20043id) {
                        profileActivity.f34027u2.participants.participants.remove(i11);
                        profileActivity.e5(true, false);
                        return;
                    }
                }
                return;
            default:
                View view = ((ProxyListActivity) this.f36899b).f34066b.T((View) obj).f45767a;
                if (view instanceof i21) {
                    i21 i21Var = (i21) view;
                    if (i21Var.d == SharedConfig.currentProxy) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    i21Var.setChecked(z10);
                    i21Var.b();
                    return;
                }
                return;
        }
    }
}
