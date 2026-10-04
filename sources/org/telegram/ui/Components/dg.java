package org.telegram.ui.Components;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.LaunchActivity;
public final class dg implements Runnable {
    public final MessageObject f25710a;
    public final long f25711b;
    public final TL_keyboard.KeyboardButtonProto f25712c;
    public final MessageObject d;
    public final TLRPC.User f25713e;
    public final ChatActivityEnterView f25714f;

    public dg(ChatActivityEnterView chatActivityEnterView, MessageObject messageObject, long j3, TL_keyboard.KeyboardButtonProto keyboardButtonProto, MessageObject messageObject2, TLRPC.User user) {
        this.f25714f = chatActivityEnterView;
        this.f25710a = messageObject;
        this.f25711b = j3;
        this.f25712c = keyboardButtonProto;
        this.d = messageObject2;
        this.f25713e = user;
    }

    @Override
    public final void run() {
        int i10;
        long O8;
        String restrictionReason;
        ChatActivityEnterView chatActivityEnterView = this.f25714f;
        org.telegram.ui.yn ynVar = chatActivityEnterView.P2;
        if (chatActivityEnterView.f23921m1.R() <= AndroidUtilities.dp(20.0f) && !chatActivityEnterView.t0()) {
            if (ynVar != null) {
                int i11 = chatActivityEnterView.Q;
                long j3 = this.f25710a.messageOwner.dialog_id;
                TL_keyboard.KeyboardButtonProto keyboardButtonProto = this.f25712c;
                String text = keyboardButtonProto.getText();
                String url = keyboardButtonProto.getUrl();
                boolean c10 = zf.c.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeSimpleWebView.class);
                MessageObject messageObject = this.d;
                if (messageObject != null) {
                    i10 = messageObject.messageOwner.f20059id;
                } else {
                    i10 = 0;
                }
                if (ynVar == null) {
                    O8 = 0;
                } else {
                    O8 = ynVar.O8();
                }
                ei.f5 b10 = ei.f5.b(i11, j3, this.f25711b, text, url, c10 ? 1 : 0, i10, O8, null, false, null, null, 0, false, false);
                LaunchActivity launchActivity = LaunchActivity.G1;
                if (launchActivity != null && launchActivity.P() != null && LaunchActivity.G1.P().k(b10) != null) {
                    ei.d0 d0Var = chatActivityEnterView.f23917l0;
                    if (d0Var != null) {
                        d0Var.setOpened(false);
                        return;
                    }
                    return;
                }
                TLRPC.User user = this.f25713e;
                if (user == null) {
                    restrictionReason = null;
                } else {
                    restrictionReason = MessagesController.getInstance(chatActivityEnterView.Q).getRestrictionReason(user.restriction_reason);
                }
                if (!TextUtils.isEmpty(restrictionReason)) {
                    MessagesController.getInstance(chatActivityEnterView.Q);
                    MessagesController.showCantOpenAlert(ynVar, restrictionReason);
                    return;
                }
                ei.l3 l3Var = new ei.l3(chatActivityEnterView.getContext(), chatActivityEnterView.W3);
                l3Var.f9164k0 = chatActivityEnterView.O2;
                l3Var.s(ynVar, b10);
                l3Var.show();
                return;
            }
            return;
        }
        chatActivityEnterView.m0(false);
        AndroidUtilities.hideKeyboard(chatActivityEnterView);
        AndroidUtilities.runOnUIThread(this, 150L);
    }
}
