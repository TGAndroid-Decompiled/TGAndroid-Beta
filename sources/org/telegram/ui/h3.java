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
    public final int f39761a;
    public final Object f39762b;

    public h3(Object obj, int i10) {
        this.f39761a = i10;
        this.f39762b = obj;
    }

    @Override
    public final void accept(Object obj) {
        ArrayList arrayList;
        String responseCodeString;
        int i10 = this.f39761a;
        boolean z10 = true;
        Object obj2 = this.f39762b;
        switch (i10) {
            case 0:
                m3 m3Var = (m3) obj2;
                Float f7 = (Float) obj;
                j4 j4Var = m3Var.L;
                if (m3Var == j4Var.f40414u0[0]) {
                    if (j4Var.f40402h0.f44909d0.getCurrentProgress() > f7.floatValue()) {
                        j4Var.f40402h0.f44909d0.a(0.0f, false);
                    }
                    j4Var.f40402h0.f44909d0.a(f7.floatValue(), true);
                    return;
                }
                return;
            case 1:
                ((org.telegram.ui.Components.qk0) obj2).h((List) obj);
                return;
            case 2:
                TLRPC.User user = (TLRPC.User) obj;
                mr mrVar = ((dr) obj2).f38666b;
                gr x02 = mrVar.x0();
                ArrayList arrayList2 = mrVar.E;
                a0.h hVar = mrVar.L;
                if (hVar != null && hVar.m() != 0) {
                    arrayList = mrVar.G;
                } else {
                    arrayList = arrayList2;
                }
                if (hVar == null || hVar.m() == 0) {
                    hVar = mrVar.J;
                }
                if (hVar.f(user.f22177id) == null) {
                    if (ChatObject.isChannel(mrVar.f41530n)) {
                        TLRPC.TL_channelParticipant tL_channelParticipant = new TLRPC.TL_channelParticipant();
                        tL_channelParticipant.inviter_id = mrVar.getUserConfig().getClientUserId();
                        TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                        tL_channelParticipant.peer = tL_peerUser;
                        tL_peerUser.user_id = user.f22177id;
                        tL_channelParticipant.date = mrVar.getConnectionsManager().getCurrentTime();
                        arrayList.add(0, tL_channelParticipant);
                        hVar.k(tL_channelParticipant, user.f22177id);
                    } else {
                        TLRPC.TL_chatParticipant tL_chatParticipant = new TLRPC.TL_chatParticipant();
                        tL_chatParticipant.user_id = user.f22177id;
                        tL_chatParticipant.inviter_id = mrVar.getUserConfig().getClientUserId();
                        arrayList.add(0, tL_chatParticipant);
                        hVar.k(tL_chatParticipant, user.f22177id);
                    }
                }
                if (arrayList == arrayList2) {
                    Collections.sort(arrayList2, new org.telegram.ui.ActionBar.n4(11));
                }
                mrVar.B0(x02);
                return;
            case 3:
                t3 t3Var = (t3) obj2;
                int i11 = ((d5.i) obj).f7985a;
                if (i11 == 0) {
                    responseCodeString = null;
                } else {
                    responseCodeString = BillingController.getResponseCodeString(i11);
                }
                AndroidUtilities.runOnUIThread(new kb0(14, t3Var, responseCodeString));
                return;
            case 4:
                ei0 ei0Var = (ei0) obj2;
                if (((d5.i) obj).f7985a == 0) {
                    AndroidUtilities.runOnUIThread(ei0Var);
                    return;
                }
                return;
            case 5:
                int i12 = ProfileActivity.R6;
                ((ArrayList) obj2).add((TLRPC.User) obj);
                return;
            case 6:
                ProfileActivity profileActivity = (ProfileActivity) obj2;
                TLRPC.User user2 = (TLRPC.User) obj;
                for (int i13 = 0; i13 < profileActivity.f36115u2.participants.participants.size(); i13++) {
                    if (profileActivity.f36115u2.participants.participants.get(i13).user_id == user2.f22177id) {
                        profileActivity.f36115u2.participants.participants.remove(i13);
                        profileActivity.p5(true, false);
                        return;
                    }
                }
                return;
            default:
                View view = ((ProxyListActivity) obj2).f36158b.T((View) obj).f47773a;
                if (view instanceof u11) {
                    u11 u11Var = (u11) view;
                    if (u11Var.d != SharedConfig.currentProxy) {
                        z10 = false;
                    }
                    u11Var.setChecked(z10);
                    u11Var.b();
                    return;
                }
                return;
        }
    }
}
