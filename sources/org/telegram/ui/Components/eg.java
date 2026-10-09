package org.telegram.ui.Components;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.LaunchActivity;
public final class eg implements Runnable {
    public final MessageObject f26081a;
    public final long f26082b;
    public final TL_keyboard.KeyboardButtonProto f26083c;
    public final MessageObject d;
    public final TLRPC.User f26084e;
    public final ChatActivityEnterView f26085f;

    public eg(ChatActivityEnterView chatActivityEnterView, MessageObject messageObject, long j3, TL_keyboard.KeyboardButtonProto keyboardButtonProto, MessageObject messageObject2, TLRPC.User user) {
        this.f26085f = chatActivityEnterView;
        this.f26081a = messageObject;
        this.f26082b = j3;
        this.f26083c = keyboardButtonProto;
        this.d = messageObject2;
        this.f26084e = user;
    }

    @Override
    public final void run() {
        int i10;
        long S8;
        String restrictionReason;
        ChatActivityEnterView chatActivityEnterView = this.f26085f;
        org.telegram.ui.zn znVar = chatActivityEnterView.P2;
        if (chatActivityEnterView.f23924m1.R() <= AndroidUtilities.dp(20.0f) && !chatActivityEnterView.r0()) {
            if (znVar != null) {
                int i11 = chatActivityEnterView.Q;
                long j3 = this.f26081a.messageOwner.dialog_id;
                TL_keyboard.KeyboardButtonProto keyboardButtonProto = this.f26083c;
                String text = keyboardButtonProto.getText();
                String url = keyboardButtonProto.getUrl();
                boolean c10 = zf.c.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeSimpleWebView.class);
                MessageObject messageObject = this.d;
                if (messageObject != null) {
                    i10 = messageObject.messageOwner.f20059id;
                } else {
                    i10 = 0;
                }
                if (znVar == null) {
                    S8 = 0;
                } else {
                    S8 = znVar.S8();
                }
                ei.e5 b10 = ei.e5.b(i11, j3, this.f26082b, text, url, c10 ? 1 : 0, i10, S8, null, false, null, null, 0, false, false);
                LaunchActivity launchActivity = LaunchActivity.G1;
                if (launchActivity != null && launchActivity.P() != null && LaunchActivity.G1.P().k(b10) != null) {
                    ei.c0 c0Var = chatActivityEnterView.f23920l0;
                    if (c0Var != null) {
                        c0Var.setOpened(false);
                        return;
                    }
                    return;
                }
                TLRPC.User user = this.f26084e;
                if (user == null) {
                    restrictionReason = null;
                } else {
                    restrictionReason = MessagesController.getInstance(chatActivityEnterView.Q).getRestrictionReason(user.restriction_reason);
                }
                if (!TextUtils.isEmpty(restrictionReason)) {
                    MessagesController.getInstance(chatActivityEnterView.Q);
                    MessagesController.showCantOpenAlert(znVar, restrictionReason);
                    return;
                }
                ei.k3 k3Var = new ei.k3(chatActivityEnterView.getContext(), chatActivityEnterView.W3);
                k3Var.f9167k0 = chatActivityEnterView.O2;
                k3Var.t(znVar, b10);
                k3Var.show();
                return;
            }
            return;
        }
        chatActivityEnterView.k0(false);
        AndroidUtilities.hideKeyboard(chatActivityEnterView);
        AndroidUtilities.runOnUIThread(this, 150L);
    }
}
