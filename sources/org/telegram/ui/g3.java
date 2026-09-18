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
    public final int f33828a;
    public final Object f33829b;

    public g3(Object obj, int i10) {
        this.f33828a = i10;
        this.f33829b = obj;
    }

    @Override
    public final void accept(Object obj) {
        ArrayList arrayList;
        String responseCodeString;
        boolean z10;
        switch (this.f33828a) {
            case 0:
                l3 l3Var = (l3) this.f33829b;
                Float f7 = (Float) obj;
                h4 h4Var = l3Var.K;
                if (l3Var == h4Var.f34173u0[0]) {
                    if (h4Var.f34161h0.f38960d0.getCurrentProgress() > f7.floatValue()) {
                        h4Var.f34161h0.f38960d0.a(0.0f, false);
                    }
                    h4Var.f34161h0.f38960d0.a(f7.floatValue(), true);
                    return;
                }
                return;
            case 1:
                ((org.telegram.ui.Components.qj0) this.f33829b).h((List) obj);
                return;
            case 2:
                TLRPC.User user = (TLRPC.User) obj;
                ur urVar = ((lr) this.f33829b).f35616b;
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
                if (iVar.f(user.f18268id) == null) {
                    if (ChatObject.isChannel(urVar.f38159r)) {
                        TLRPC.TL_channelParticipant tL_channelParticipant = new TLRPC.TL_channelParticipant();
                        tL_channelParticipant.inviter_id = urVar.getUserConfig().getClientUserId();
                        TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                        tL_channelParticipant.peer = tL_peerUser;
                        tL_peerUser.user_id = user.f18268id;
                        tL_channelParticipant.date = urVar.getConnectionsManager().getCurrentTime();
                        arrayList.add(0, tL_channelParticipant);
                        iVar.k(tL_channelParticipant, user.f18268id);
                    } else {
                        TLRPC.TL_chatParticipant tL_chatParticipant = new TLRPC.TL_chatParticipant();
                        tL_chatParticipant.user_id = user.f18268id;
                        tL_chatParticipant.inviter_id = urVar.getUserConfig().getClientUserId();
                        arrayList.add(0, tL_chatParticipant);
                        iVar.k(tL_chatParticipant, user.f18268id);
                    }
                }
                if (arrayList == arrayList2) {
                    Collections.sort(arrayList2, new ff(4));
                }
                urVar.A0(w02);
                return;
            case 3:
                s3 s3Var = (s3) this.f33829b;
                int i10 = ((c5.h) obj).f3894a;
                if (i10 == 0) {
                    responseCodeString = null;
                } else {
                    responseCodeString = BillingController.getResponseCodeString(i10);
                }
                AndroidUtilities.runOnUIThread(new oa0(21, s3Var, responseCodeString));
                return;
            case 4:
                si0 si0Var = (si0) this.f33829b;
                if (((c5.h) obj).f3894a == 0) {
                    AndroidUtilities.runOnUIThread(si0Var);
                    return;
                }
                return;
            case 5:
                ((ArrayList) this.f33829b).add((TLRPC.User) obj);
                return;
            case 6:
                ProfileActivity profileActivity = (ProfileActivity) this.f33829b;
                TLRPC.User user2 = (TLRPC.User) obj;
                for (int i11 = 0; i11 < profileActivity.f31397u2.participants.participants.size(); i11++) {
                    if (profileActivity.f31397u2.participants.participants.get(i11).user_id == user2.f18268id) {
                        profileActivity.f31397u2.participants.participants.remove(i11);
                        profileActivity.e5(true, false);
                        return;
                    }
                }
                return;
            default:
                View view = ((ProxyListActivity) this.f33829b).f31436b.U((View) obj).f42702a;
                if (view instanceof h21) {
                    h21 h21Var = (h21) view;
                    if (h21Var.d == SharedConfig.currentProxy) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    h21Var.setChecked(z10);
                    h21Var.b();
                    return;
                }
                return;
        }
    }
}
