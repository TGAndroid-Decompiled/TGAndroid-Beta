package org.telegram.ui.Components;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SharedPrefsHelper;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class ie implements Runnable {
    public final int f27146a;
    public final ChatActivityEnterView f27147b;

    public ie(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f27146a = i10;
        this.f27147b = chatActivityEnterView;
    }

    @Override
    public final void run() {
        long S8;
        ArrayList<TLRPC.RestrictionReason> arrayList;
        int i10 = this.f27146a;
        ChatActivityEnterView chatActivityEnterView = this.f27147b;
        switch (i10) {
            case 0:
                uf ufVar = chatActivityEnterView.E0;
                if (ufVar != null) {
                    ufVar.setText("");
                    return;
                }
                return;
            case 1:
                uf ufVar2 = chatActivityEnterView.E0;
                if (ufVar2 != null) {
                    ufVar2.setText("");
                }
                chatActivityEnterView.L(true);
                return;
            case 2:
                int i11 = ChatActivityEnterView.Q5;
                chatActivityEnterView.Y0();
                return;
            case 3:
                chatActivityEnterView.N3 = false;
                chatActivityEnterView.K0();
                return;
            case 4:
                sg sgVar = chatActivityEnterView.Z2;
                if (sgVar != null) {
                    sgVar.w1();
                    return;
                }
                return;
            case 5:
                g5.L(chatActivityEnterView.O2, chatActivityEnterView.P2.a(), new vd(chatActivityEnterView), chatActivityEnterView.f23774z4);
                return;
            case 6:
                int i12 = ChatActivityEnterView.Q5;
                this.f27147b.W0(0, false, 0, true, 0L);
                return;
            case 7:
                int i13 = ChatActivityEnterView.Q5;
                AndroidUtilities.hideKeyboard(chatActivityEnterView);
                int i14 = chatActivityEnterView.Q;
                long j3 = chatActivityEnterView.Q2;
                String str = chatActivityEnterView.f23668i0;
                String str2 = chatActivityEnterView.f23674j0;
                org.telegram.ui.eo eoVar = chatActivityEnterView.P2;
                if (eoVar == null) {
                    S8 = 0;
                } else {
                    S8 = eoVar.S8();
                }
                ei.e5 b10 = ei.e5.b(i14, j3, j3, str, str2, 2, 0, S8, null, false, null, null, 0, false, false);
                LaunchActivity launchActivity = LaunchActivity.G1;
                if (launchActivity != null && launchActivity.P() != null && LaunchActivity.G1.P().k(b10) != null) {
                    ei.c0 c0Var = chatActivityEnterView.f23685l0;
                    if (c0Var != null) {
                        c0Var.setOpened(false);
                        return;
                    }
                    return;
                } else if (org.telegram.ui.fc0.q(chatActivityEnterView.f23674j0)) {
                    ?? obj = new Object();
                    obj.f16870c = new ud(chatActivityEnterView, 5);
                    of.f.k(chatActivityEnterView.getContext(), chatActivityEnterView.f23674j0, false, false, obj);
                    return;
                } else {
                    TLRPC.User user = MessagesController.getInstance(chatActivityEnterView.Q).getUser(Long.valueOf(chatActivityEnterView.Q2));
                    MessagesController messagesController = MessagesController.getInstance(chatActivityEnterView.Q);
                    if (user == null) {
                        arrayList = null;
                    } else {
                        arrayList = user.restriction_reason;
                    }
                    String restrictionReason = messagesController.getRestrictionReason(arrayList);
                    if (!TextUtils.isEmpty(restrictionReason)) {
                        MessagesController.getInstance(chatActivityEnterView.Q);
                        MessagesController.showCantOpenAlert(eoVar, restrictionReason);
                        return;
                    }
                    ei.k3 k3Var = new ei.k3(chatActivityEnterView.getContext(), chatActivityEnterView.f23774z4);
                    k3Var.x(false);
                    k3Var.A0 = true;
                    k3Var.f9164k0 = chatActivityEnterView.O2;
                    k3Var.t(eoVar, b10);
                    k3Var.show();
                    ei.c0 c0Var2 = chatActivityEnterView.f23685l0;
                    if (c0Var2 != null) {
                        c0Var2.setOpened(false);
                        return;
                    }
                    return;
                }
            case 8:
                if (chatActivityEnterView.f23685l0 != null && !SharedPrefsHelper.isWebViewConfirmShown(chatActivityEnterView.Q, chatActivityEnterView.Q2)) {
                    chatActivityEnterView.f23685l0.setOpened(false);
                    return;
                }
                return;
            default:
                int i15 = ChatActivityEnterView.Q5;
                chatActivityEnterView.E();
                return;
        }
    }
}
