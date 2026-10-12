package org.telegram.ui.Components;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.LaunchActivity;
public final class gg implements Runnable {
    public final MessageObject f26428a;
    public final long f26429b;
    public final TL_keyboard.KeyboardButtonProto f26430c;
    public final MessageObject d;
    public final TLRPC.User f26431e;
    public final ChatActivityEnterView f26432f;

    public gg(ChatActivityEnterView chatActivityEnterView, MessageObject messageObject, long j3, TL_keyboard.KeyboardButtonProto keyboardButtonProto, MessageObject messageObject2, TLRPC.User user) {
        this.f26432f = chatActivityEnterView;
        this.f26428a = messageObject;
        this.f26429b = j3;
        this.f26430c = keyboardButtonProto;
        this.d = messageObject2;
        this.f26431e = user;
    }

    @Override
    public final void run() {
        int i10;
        long S8;
        String restrictionReason;
        ChatActivityEnterView chatActivityEnterView = this.f26432f;
        org.telegram.ui.eo eoVar = chatActivityEnterView.P2;
        if (chatActivityEnterView.f23689m1.R() <= AndroidUtilities.dp(20.0f) && !chatActivityEnterView.u0()) {
            if (eoVar != null) {
                int i11 = chatActivityEnterView.Q;
                long j3 = this.f26428a.messageOwner.dialog_id;
                TL_keyboard.KeyboardButtonProto keyboardButtonProto = this.f26430c;
                String text = keyboardButtonProto.getText();
                String url = keyboardButtonProto.getUrl();
                boolean c10 = zf.c.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeSimpleWebView.class);
                MessageObject messageObject = this.d;
                if (messageObject != null) {
                    i10 = messageObject.messageOwner.f19823id;
                } else {
                    i10 = 0;
                }
                if (eoVar == null) {
                    S8 = 0;
                } else {
                    S8 = eoVar.S8();
                }
                ei.e5 b10 = ei.e5.b(i11, j3, this.f26429b, text, url, c10 ? 1 : 0, i10, S8, null, false, null, null, 0, false, false);
                LaunchActivity launchActivity = LaunchActivity.G1;
                if (launchActivity != null && launchActivity.P() != null && LaunchActivity.G1.P().k(b10) != null) {
                    ei.c0 c0Var = chatActivityEnterView.f23685l0;
                    if (c0Var != null) {
                        c0Var.setOpened(false);
                        return;
                    }
                    return;
                }
                TLRPC.User user = this.f26431e;
                if (user == null) {
                    restrictionReason = null;
                } else {
                    restrictionReason = MessagesController.getInstance(chatActivityEnterView.Q).getRestrictionReason(user.restriction_reason);
                }
                if (!TextUtils.isEmpty(restrictionReason)) {
                    MessagesController.getInstance(chatActivityEnterView.Q);
                    MessagesController.showCantOpenAlert(eoVar, restrictionReason);
                    return;
                }
                ei.k3 k3Var = new ei.k3(chatActivityEnterView.getContext(), chatActivityEnterView.f23774z4);
                k3Var.f9164k0 = chatActivityEnterView.O2;
                k3Var.t(eoVar, b10);
                k3Var.show();
                return;
            }
            return;
        }
        chatActivityEnterView.n0(false);
        AndroidUtilities.hideKeyboard(chatActivityEnterView);
        AndroidUtilities.runOnUIThread(this, 150L);
    }
}
