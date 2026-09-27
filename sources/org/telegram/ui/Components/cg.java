package org.telegram.ui.Components;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.LaunchActivity;
public final class cg implements Runnable {
    public final MessageObject f23317a;
    public final long f23318b;
    public final TL_keyboard.KeyboardButtonProto f23319c;
    public final MessageObject d;
    public final TLRPC.User e;
    public final ChatActivityEnterView f23320f;

    public cg(ChatActivityEnterView chatActivityEnterView, MessageObject messageObject, long j3, TL_keyboard.KeyboardButtonProto keyboardButtonProto, MessageObject messageObject2, TLRPC.User user) {
        this.f23320f = chatActivityEnterView;
        this.f23317a = messageObject;
        this.f23318b = j3;
        this.f23319c = keyboardButtonProto;
        this.d = messageObject2;
        this.e = user;
    }

    @Override
    public final void run() {
        int i10;
        long N8;
        String restrictionReason;
        ChatActivityEnterView chatActivityEnterView = this.f23320f;
        org.telegram.ui.xn xnVar = chatActivityEnterView.P2;
        if (chatActivityEnterView.f22028m1.R() <= AndroidUtilities.dp(20.0f) && !chatActivityEnterView.t0()) {
            if (xnVar != null) {
                int i11 = chatActivityEnterView.Q;
                long j3 = this.f23317a.messageOwner.dialog_id;
                TL_keyboard.KeyboardButtonProto keyboardButtonProto = this.f23319c;
                String text = keyboardButtonProto.getText();
                String url = keyboardButtonProto.getUrl();
                boolean c10 = zf.c.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeSimpleWebView.class);
                MessageObject messageObject = this.d;
                if (messageObject != null) {
                    i10 = messageObject.messageOwner.f18350id;
                } else {
                    i10 = 0;
                }
                if (xnVar == null) {
                    N8 = 0;
                } else {
                    N8 = xnVar.N8();
                }
                ei.f5 b10 = ei.f5.b(i11, j3, this.f23318b, text, url, c10 ? 1 : 0, i10, N8, null, false, null, null, 0, false, false);
                LaunchActivity launchActivity = LaunchActivity.G1;
                if (launchActivity != null && launchActivity.P() != null && LaunchActivity.G1.P().k(b10) != null) {
                    ei.c0 c0Var = chatActivityEnterView.f22024l0;
                    if (c0Var != null) {
                        c0Var.setOpened(false);
                        return;
                    }
                    return;
                }
                TLRPC.User user = this.e;
                if (user == null) {
                    restrictionReason = null;
                } else {
                    restrictionReason = MessagesController.getInstance(chatActivityEnterView.Q).getRestrictionReason(user.restriction_reason);
                }
                if (!TextUtils.isEmpty(restrictionReason)) {
                    MessagesController.getInstance(chatActivityEnterView.Q);
                    MessagesController.showCantOpenAlert(xnVar, restrictionReason);
                    return;
                }
                ei.k3 k3Var = new ei.k3(chatActivityEnterView.getContext(), chatActivityEnterView.W3);
                k3Var.f8424k0 = chatActivityEnterView.O2;
                k3Var.s(xnVar, b10);
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
