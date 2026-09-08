package org.telegram.ui.Components;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.LaunchActivity;
public final class cg implements Runnable {
    public final MessageObject f25028a;
    public final long f25029b;
    public final TL_keyboard.KeyboardButtonProto f25030c;
    public final MessageObject d;
    public final TLRPC.User f25031e;
    public final ChatActivityEnterView f25032f;

    public cg(ChatActivityEnterView chatActivityEnterView, MessageObject messageObject, long j3, TL_keyboard.KeyboardButtonProto keyboardButtonProto, MessageObject messageObject2, TLRPC.User user) {
        this.f25032f = chatActivityEnterView;
        this.f25028a = messageObject;
        this.f25029b = j3;
        this.f25030c = keyboardButtonProto;
        this.d = messageObject2;
        this.f25031e = user;
    }

    @Override
    public final void run() {
        int i10;
        long N8;
        String restrictionReason;
        ChatActivityEnterView chatActivityEnterView = this.f25032f;
        org.telegram.ui.co coVar = chatActivityEnterView.O2;
        if (chatActivityEnterView.l1.R() <= AndroidUtilities.dp(20.0f) && !chatActivityEnterView.t0()) {
            if (coVar != null) {
                int i11 = chatActivityEnterView.Q;
                long j3 = this.f25028a.messageOwner.dialog_id;
                TL_keyboard.KeyboardButtonProto keyboardButtonProto = this.f25030c;
                String text = keyboardButtonProto.getText();
                String url = keyboardButtonProto.getUrl();
                boolean c10 = zf.c.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeSimpleWebView.class);
                MessageObject messageObject = this.d;
                if (messageObject != null) {
                    i10 = messageObject.messageOwner.f19917id;
                } else {
                    i10 = 0;
                }
                if (coVar == null) {
                    N8 = 0;
                } else {
                    N8 = coVar.N8();
                }
                fi.f5 b10 = fi.f5.b(i11, j3, this.f25029b, text, url, c10 ? 1 : 0, i10, N8, null, false, null, null, 0, false, false);
                LaunchActivity launchActivity = LaunchActivity.G1;
                if (launchActivity != null && launchActivity.P() != null && LaunchActivity.G1.P().k(b10) != null) {
                    fi.c0 c0Var = chatActivityEnterView.f23758l0;
                    if (c0Var != null) {
                        c0Var.setOpened(false);
                        return;
                    }
                    return;
                }
                TLRPC.User user = this.f25031e;
                if (user == null) {
                    restrictionReason = null;
                } else {
                    restrictionReason = MessagesController.getInstance(chatActivityEnterView.Q).getRestrictionReason(user.restriction_reason);
                }
                if (!TextUtils.isEmpty(restrictionReason)) {
                    MessagesController.getInstance(chatActivityEnterView.Q);
                    MessagesController.showCantOpenAlert(coVar, restrictionReason);
                    return;
                }
                fi.k3 k3Var = new fi.k3(chatActivityEnterView.getContext(), chatActivityEnterView.V3);
                k3Var.f9801k0 = chatActivityEnterView.N2;
                k3Var.s(coVar, b10);
                k3Var.show();
                return;
            }
            return;
        }
        chatActivityEnterView.m0(false);
        AndroidUtilities.hideKeyboard(chatActivityEnterView);
        AndroidUtilities.runOnUIThread(this, 150L);
    }
}
