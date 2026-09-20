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
    public final int f33790a;
    public final Object f33791b;

    public g3(Object obj, int i10) {
        this.f33790a = i10;
        this.f33791b = obj;
    }

    @Override
    public final void accept(Object obj) {
        ArrayList arrayList;
        String responseCodeString;
        boolean z10;
        switch (this.f33790a) {
            case 0:
                l3 l3Var = (l3) this.f33791b;
                Float f7 = (Float) obj;
                h4 h4Var = l3Var.K;
                if (l3Var == h4Var.f34114u0[0]) {
                    if (h4Var.f34102h0.f39080d0.getCurrentProgress() > f7.floatValue()) {
                        h4Var.f34102h0.f39080d0.a(0.0f, false);
                    }
                    h4Var.f34102h0.f39080d0.a(f7.floatValue(), true);
                    return;
                }
                return;
            case 1:
                ((org.telegram.ui.Components.zj0) this.f33791b).h((List) obj);
                return;
            case 2:
                TLRPC.User user = (TLRPC.User) obj;
                sr srVar = ((jr) this.f33791b).f34977b;
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
                if (iVar.f(user.f18475id) == null) {
                    if (ChatObject.isChannel(srVar.f37484r)) {
                        TLRPC.TL_channelParticipant tL_channelParticipant = new TLRPC.TL_channelParticipant();
                        tL_channelParticipant.inviter_id = srVar.getUserConfig().getClientUserId();
                        TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                        tL_channelParticipant.peer = tL_peerUser;
                        tL_peerUser.user_id = user.f18475id;
                        tL_channelParticipant.date = srVar.getConnectionsManager().getCurrentTime();
                        arrayList.add(0, tL_channelParticipant);
                        iVar.k(tL_channelParticipant, user.f18475id);
                    } else {
                        TLRPC.TL_chatParticipant tL_chatParticipant = new TLRPC.TL_chatParticipant();
                        tL_chatParticipant.user_id = user.f18475id;
                        tL_chatParticipant.inviter_id = srVar.getUserConfig().getClientUserId();
                        arrayList.add(0, tL_chatParticipant);
                        iVar.k(tL_chatParticipant, user.f18475id);
                    }
                }
                if (arrayList == arrayList2) {
                    Collections.sort(arrayList2, new df(4));
                }
                srVar.A0(w02);
                return;
            case 3:
                s3 s3Var = (s3) this.f33791b;
                int i10 = ((c5.h) obj).f3895a;
                if (i10 == 0) {
                    responseCodeString = null;
                } else {
                    responseCodeString = BillingController.getResponseCodeString(i10);
                }
                AndroidUtilities.runOnUIThread(new r80(27, s3Var, responseCodeString));
                return;
            case 4:
                si0 si0Var = (si0) this.f33791b;
                if (((c5.h) obj).f3895a == 0) {
                    AndroidUtilities.runOnUIThread(si0Var);
                    return;
                }
                return;
            case 5:
                ((ArrayList) this.f33791b).add((TLRPC.User) obj);
                return;
            case 6:
                ProfileActivity profileActivity = (ProfileActivity) this.f33791b;
                TLRPC.User user2 = (TLRPC.User) obj;
                for (int i11 = 0; i11 < profileActivity.f31664u2.participants.participants.size(); i11++) {
                    if (profileActivity.f31664u2.participants.participants.get(i11).user_id == user2.f18475id) {
                        profileActivity.f31664u2.participants.participants.remove(i11);
                        profileActivity.e5(true, false);
                        return;
                    }
                }
                return;
            default:
                View view = ((ProxyListActivity) this.f33791b).f31703b.U((View) obj).f42974a;
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
