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
    public final int f38232a;
    public final Object f38233b;

    public h3(Object obj, int i10) {
        this.f38232a = i10;
        this.f38233b = obj;
    }

    @Override
    public final void accept(Object obj) {
        ArrayList arrayList;
        String responseCodeString;
        boolean z10;
        switch (this.f38232a) {
            case 0:
                m3 m3Var = (m3) this.f38233b;
                Float f7 = (Float) obj;
                i4 i4Var = m3Var.K;
                if (m3Var == i4Var.f38661u0[0]) {
                    if (i4Var.f38649h0.f43420d0.getCurrentProgress() > f7.floatValue()) {
                        i4Var.f38649h0.f43420d0.a(0.0f, false);
                    }
                    i4Var.f38649h0.f43420d0.a(f7.floatValue(), true);
                    return;
                }
                return;
            case 1:
                ((org.telegram.ui.Components.xk0) this.f38233b).h((List) obj);
                return;
            case 2:
                TLRPC.User user = (TLRPC.User) obj;
                wr wrVar = ((mr) this.f38233b).f40119b;
                pr w02 = wrVar.w0();
                ArrayList arrayList2 = wrVar.F;
                a0.i iVar = wrVar.M;
                if (iVar != null && iVar.m() != 0) {
                    arrayList = wrVar.H;
                } else {
                    arrayList = arrayList2;
                }
                if (iVar == null || iVar.m() == 0) {
                    iVar = wrVar.K;
                }
                if (iVar.f(user.f19949id) == null) {
                    if (ChatObject.isChannel(wrVar.f43646r)) {
                        TLRPC.TL_channelParticipant tL_channelParticipant = new TLRPC.TL_channelParticipant();
                        tL_channelParticipant.inviter_id = wrVar.getUserConfig().getClientUserId();
                        TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                        tL_channelParticipant.peer = tL_peerUser;
                        tL_peerUser.user_id = user.f19949id;
                        tL_channelParticipant.date = wrVar.getConnectionsManager().getCurrentTime();
                        arrayList.add(0, tL_channelParticipant);
                        iVar.k(tL_channelParticipant, user.f19949id);
                    } else {
                        TLRPC.TL_chatParticipant tL_chatParticipant = new TLRPC.TL_chatParticipant();
                        tL_chatParticipant.user_id = user.f19949id;
                        tL_chatParticipant.inviter_id = wrVar.getUserConfig().getClientUserId();
                        arrayList.add(0, tL_chatParticipant);
                        iVar.k(tL_chatParticipant, user.f19949id);
                    }
                }
                if (arrayList == arrayList2) {
                    Collections.sort(arrayList2, new lf(4));
                }
                wrVar.A0(w02);
                return;
            case 3:
                t3 t3Var = (t3) this.f38233b;
                int i10 = ((c5.h) obj).f4252a;
                if (i10 == 0) {
                    responseCodeString = null;
                } else {
                    responseCodeString = BillingController.getResponseCodeString(i10);
                }
                AndroidUtilities.runOnUIThread(new t70(29, t3Var, responseCodeString));
                return;
            case 4:
                ti0 ti0Var = (ti0) this.f38233b;
                if (((c5.h) obj).f4252a == 0) {
                    AndroidUtilities.runOnUIThread(ti0Var);
                    return;
                }
                return;
            case 5:
                ((ArrayList) this.f38233b).add((TLRPC.User) obj);
                return;
            case 6:
                ProfileActivity profileActivity = (ProfileActivity) this.f38233b;
                TLRPC.User user2 = (TLRPC.User) obj;
                for (int i11 = 0; i11 < profileActivity.f34191u2.participants.participants.size(); i11++) {
                    if (profileActivity.f34191u2.participants.participants.get(i11).user_id == user2.f19949id) {
                        profileActivity.f34191u2.participants.participants.remove(i11);
                        profileActivity.e5(true, false);
                        return;
                    }
                }
                return;
            default:
                View view = ((ProxyListActivity) this.f38233b).f34230b.T((View) obj).f47889a;
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
