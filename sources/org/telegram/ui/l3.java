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
public final class l3 implements q0.a {
    public final int f35635a;
    public final Object f35636b;

    public l3(Object obj, int i10) {
        this.f35635a = i10;
        this.f35636b = obj;
    }

    @Override
    public final void accept(Object obj) {
        ArrayList arrayList;
        String responseCodeString;
        boolean z4;
        switch (this.f35635a) {
            case 0:
                r3 r3Var = (r3) this.f35636b;
                Float f10 = (Float) obj;
                n4 n4Var = r3Var.H;
                if (r3Var == n4Var.f36375r0[0]) {
                    if (n4Var.f36363e0.f39594a0.getCurrentProgress() > f10.floatValue()) {
                        n4Var.f36363e0.f39594a0.a(0.0f, false);
                    }
                    n4Var.f36363e0.f39594a0.a(f10.floatValue(), true);
                    return;
                }
                return;
            case 1:
                ((org.telegram.ui.Components.yj0) this.f35636b).h((List) obj);
                return;
            case 2:
                TLRPC.User user = (TLRPC.User) obj;
                rr rrVar = ((ir) this.f35636b).f35019b;
                lr w02 = rrVar.w0();
                ArrayList arrayList2 = rrVar.C;
                a0.h hVar = rrVar.J;
                if (hVar != null && hVar.m() != 0) {
                    arrayList = rrVar.E;
                } else {
                    arrayList = arrayList2;
                }
                if (hVar == null || hVar.m() == 0) {
                    hVar = rrVar.H;
                }
                if (hVar.f(user.f19306id) == null) {
                    if (ChatObject.isChannel(rrVar.f37992r)) {
                        TLRPC.TL_channelParticipant tL_channelParticipant = new TLRPC.TL_channelParticipant();
                        tL_channelParticipant.inviter_id = rrVar.getUserConfig().getClientUserId();
                        TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                        tL_channelParticipant.peer = tL_peerUser;
                        tL_peerUser.user_id = user.f19306id;
                        tL_channelParticipant.date = rrVar.getConnectionsManager().getCurrentTime();
                        arrayList.add(0, tL_channelParticipant);
                        hVar.k(tL_channelParticipant, user.f19306id);
                    } else {
                        TLRPC.TL_chatParticipant tL_chatParticipant = new TLRPC.TL_chatParticipant();
                        tL_chatParticipant.user_id = user.f19306id;
                        tL_chatParticipant.inviter_id = rrVar.getUserConfig().getClientUserId();
                        arrayList.add(0, tL_chatParticipant);
                        hVar.k(tL_chatParticipant, user.f19306id);
                    }
                }
                if (arrayList == arrayList2) {
                    Collections.sort(arrayList2, new nh.e4(15));
                }
                rrVar.A0(w02);
                return;
            case 3:
                y3 y3Var = (y3) this.f35636b;
                int i10 = ((p2.h) obj).f41015a;
                if (i10 == 0) {
                    responseCodeString = null;
                } else {
                    responseCodeString = BillingController.getResponseCodeString(i10);
                }
                AndroidUtilities.runOnUIThread(new ie0(8, y3Var, responseCodeString));
                return;
            case 4:
                ji0 ji0Var = (ji0) this.f35636b;
                if (((p2.h) obj).f41015a == 0) {
                    AndroidUtilities.runOnUIThread(ji0Var);
                    return;
                }
                return;
            case 5:
                ((ArrayList) this.f35636b).add((TLRPC.User) obj);
                return;
            case 6:
                ProfileActivity profileActivity = (ProfileActivity) this.f35636b;
                TLRPC.User user2 = (TLRPC.User) obj;
                for (int i11 = 0; i11 < profileActivity.f32124r2.participants.participants.size(); i11++) {
                    if (profileActivity.f32124r2.participants.participants.get(i11).user_id == user2.f19306id) {
                        profileActivity.f32124r2.participants.participants.remove(i11);
                        profileActivity.e5(true, false);
                        return;
                    }
                }
                return;
            default:
                View view = ((ProxyListActivity) this.f35636b).f32181b.T((View) obj).f5774a;
                if (view instanceof v11) {
                    v11 v11Var = (v11) view;
                    if (v11Var.d == SharedConfig.currentProxy) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    v11Var.setChecked(z4);
                    v11Var.b();
                    return;
                }
                return;
        }
    }
}
