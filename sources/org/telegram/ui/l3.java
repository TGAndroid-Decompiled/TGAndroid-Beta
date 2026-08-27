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

    public final int f39930a;

    public final Object f39931b;

    public l3(Object obj, int i10) {
        this.f39930a = i10;
        this.f39931b = obj;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f39930a) {
            case 0:
                q3 q3Var = (q3) this.f39931b;
                Float f10 = (Float) obj;
                m4 m4Var = q3Var.G;
                if (q3Var == m4Var.f40347q0[0]) {
                    if (m4Var.f40335d0.W.getCurrentProgress() > f10.floatValue()) {
                        m4Var.f40335d0.W.a(0.0f, false);
                    }
                    m4Var.f40335d0.W.a(f10.floatValue(), true);
                }
                break;
            case 1:
                ((org.telegram.ui.Components.gj0) this.f39931b).h((List) obj);
                break;
            case 2:
                TLRPC.User user = (TLRPC.User) obj;
                lr lrVar = ((br) this.f39931b).f36870b;
                er erVarW0 = lrVar.w0();
                ArrayList arrayList = lrVar.B;
                a0.h hVar = lrVar.I;
                ArrayList arrayList2 = (hVar == null || hVar.m() == 0) ? arrayList : lrVar.D;
                if (hVar == null || hVar.m() == 0) {
                    hVar = lrVar.G;
                }
                if (hVar.f(user.f22527id) == null) {
                    if (ChatObject.isChannel(lrVar.f40217r)) {
                        TLRPC.TL_channelParticipant tL_channelParticipant = new TLRPC.TL_channelParticipant();
                        tL_channelParticipant.inviter_id = lrVar.getUserConfig().getClientUserId();
                        TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                        tL_channelParticipant.peer = tL_peerUser;
                        tL_peerUser.user_id = user.f22527id;
                        tL_channelParticipant.date = lrVar.getConnectionsManager().getCurrentTime();
                        arrayList2.add(0, tL_channelParticipant);
                        hVar.k(tL_channelParticipant, user.f22527id);
                    } else {
                        TLRPC.TL_chatParticipant tL_chatParticipant = new TLRPC.TL_chatParticipant();
                        tL_chatParticipant.user_id = user.f22527id;
                        tL_chatParticipant.inviter_id = lrVar.getUserConfig().getClientUserId();
                        arrayList2.add(0, tL_chatParticipant);
                        hVar.k(tL_chatParticipant, user.f22527id);
                    }
                }
                if (arrayList2 == arrayList) {
                    Collections.sort(arrayList, new k9.a(18));
                }
                lrVar.A0(erVarW0);
                break;
            case 3:
                x3 x3Var = (x3) this.f39931b;
                int i10 = ((n2.g) obj).f18147a;
                AndroidUtilities.runOnUIThread(new ff0(3, x3Var, i10 == 0 ? null : BillingController.getResponseCodeString(i10)));
                break;
            case 4:
                ci0 ci0Var = (ci0) this.f39931b;
                if (((n2.g) obj).f18147a == 0) {
                    AndroidUtilities.runOnUIThread(ci0Var);
                }
                break;
            case 5:
                ((ArrayList) this.f39931b).add((TLRPC.User) obj);
                break;
            case 6:
                ProfileActivity profileActivity = (ProfileActivity) this.f39931b;
                TLRPC.User user2 = (TLRPC.User) obj;
                for (int i11 = 0; i11 < profileActivity.f36036q2.participants.participants.size(); i11++) {
                    if (profileActivity.f36036q2.participants.participants.get(i11).user_id == user2.f22527id) {
                        profileActivity.f36036q2.participants.participants.remove(i11);
                        profileActivity.e5(true, false);
                    }
                    break;
                }
                break;
            default:
                View view = ((ProxyListActivity) this.f39931b).f36100b.T((View) obj).f5789a;
                if (view instanceof d11) {
                    d11 d11Var = (d11) view;
                    d11Var.setChecked(d11Var.d == SharedConfig.currentProxy);
                    d11Var.b();
                }
                break;
        }
    }
}
