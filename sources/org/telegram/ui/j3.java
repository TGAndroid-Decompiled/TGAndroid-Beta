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
public final class j3 implements q0.a {
    public final int f38149a;
    public final Object f38150b;

    public j3(Object obj, int i10) {
        this.f38149a = i10;
        this.f38150b = obj;
    }

    @Override
    public final void accept(Object obj) {
        ArrayList arrayList;
        String responseCodeString;
        boolean z10;
        switch (this.f38149a) {
            case 0:
                o3 o3Var = (o3) this.f38150b;
                Float f7 = (Float) obj;
                l4 l4Var = o3Var.K;
                if (o3Var == l4Var.f38772u0[0]) {
                    if (l4Var.f38760h0.f42785d0.getCurrentProgress() > f7.floatValue()) {
                        l4Var.f38760h0.f42785d0.a(0.0f, false);
                    }
                    l4Var.f38760h0.f42785d0.a(f7.floatValue(), true);
                    return;
                }
                return;
            case 1:
                ((org.telegram.ui.Components.mk0) this.f38150b).h((List) obj);
                return;
            case 2:
                TLRPC.User user = (TLRPC.User) obj;
                hr hrVar = ((yq) this.f38150b).f43532b;
                br w02 = hrVar.w0();
                ArrayList arrayList2 = hrVar.F;
                a0.h hVar = hrVar.M;
                if (hVar != null && hVar.m() != 0) {
                    arrayList = hrVar.H;
                } else {
                    arrayList = arrayList2;
                }
                if (hVar == null || hVar.m() == 0) {
                    hVar = hrVar.K;
                }
                if (hVar.f(user.f20420id) == null) {
                    if (ChatObject.isChannel(hrVar.f37746r)) {
                        TLRPC.TL_channelParticipant tL_channelParticipant = new TLRPC.TL_channelParticipant();
                        tL_channelParticipant.inviter_id = hrVar.getUserConfig().getClientUserId();
                        TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                        tL_channelParticipant.peer = tL_peerUser;
                        tL_peerUser.user_id = user.f20420id;
                        tL_channelParticipant.date = hrVar.getConnectionsManager().getCurrentTime();
                        arrayList.add(0, tL_channelParticipant);
                        hVar.k(tL_channelParticipant, user.f20420id);
                    } else {
                        TLRPC.TL_chatParticipant tL_chatParticipant = new TLRPC.TL_chatParticipant();
                        tL_chatParticipant.user_id = user.f20420id;
                        tL_chatParticipant.inviter_id = hrVar.getUserConfig().getClientUserId();
                        arrayList.add(0, tL_chatParticipant);
                        hVar.k(tL_chatParticipant, user.f20420id);
                    }
                }
                if (arrayList == arrayList2) {
                    Collections.sort(arrayList2, new org.telegram.ui.ActionBar.i4(11));
                }
                hrVar.A0(w02);
                return;
            case 3:
                v3 v3Var = (v3) this.f38150b;
                int i10 = ((c5.i) obj).f4752a;
                if (i10 == 0) {
                    responseCodeString = null;
                } else {
                    responseCodeString = BillingController.getResponseCodeString(i10);
                }
                AndroidUtilities.runOnUIThread(new z70(26, v3Var, responseCodeString));
                return;
            case 4:
                bi0 bi0Var = (bi0) this.f38150b;
                if (((c5.i) obj).f4752a == 0) {
                    AndroidUtilities.runOnUIThread(bi0Var);
                    return;
                }
                return;
            case 5:
                ((ArrayList) this.f38150b).add((TLRPC.User) obj);
                return;
            case 6:
                ProfileActivity profileActivity = (ProfileActivity) this.f38150b;
                TLRPC.User user2 = (TLRPC.User) obj;
                for (int i11 = 0; i11 < profileActivity.f33724v2.participants.participants.size(); i11++) {
                    if (profileActivity.f33724v2.participants.participants.get(i11).user_id == user2.f20420id) {
                        profileActivity.f33724v2.participants.participants.remove(i11);
                        profileActivity.e5(true, false);
                        return;
                    }
                }
                return;
            default:
                View view = ((ProxyListActivity) this.f38150b).f33760b.T((View) obj).f45912a;
                if (view instanceof k11) {
                    k11 k11Var = (k11) view;
                    if (k11Var.d == SharedConfig.currentProxy) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    k11Var.setChecked(z10);
                    k11Var.b();
                    return;
                }
                return;
        }
    }
}
