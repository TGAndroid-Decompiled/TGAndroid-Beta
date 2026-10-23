package org.telegram.ui.Components;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.LaunchActivity;
public final class bg implements Runnable {
    public final MessageObject f24932a;
    public final long f24933b;
    public final TL_keyboard.KeyboardButtonProto f24934c;
    public final MessageObject d;
    public final TLRPC.User e;
    public final ChatActivityEnterView f24935f;

    public bg(ChatActivityEnterView chatActivityEnterView, MessageObject messageObject, long j10, TL_keyboard.KeyboardButtonProto keyboardButtonProto, MessageObject messageObject2, TLRPC.User user) {
        this.f24935f = chatActivityEnterView;
        this.f24932a = messageObject;
        this.f24933b = j10;
        this.f24934c = keyboardButtonProto;
        this.d = messageObject2;
        this.e = user;
    }

    @Override
    public final void run() {
        int i10;
        long S8;
        String restrictionReason;
        ChatActivityEnterView chatActivityEnterView = this.f24935f;
        org.telegram.ui.qn qnVar = chatActivityEnterView.P2;
        if (chatActivityEnterView.f23986m1.R() <= AndroidUtilities.dp(20.0f) && !chatActivityEnterView.r0()) {
            if (qnVar != null) {
                int i11 = chatActivityEnterView.Q;
                long j10 = this.f24932a.messageOwner.dialog_id;
                TL_keyboard.KeyboardButtonProto keyboardButtonProto = this.f24934c;
                String text = keyboardButtonProto.getText();
                String url = keyboardButtonProto.getUrl();
                boolean c10 = ag.c.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeSimpleWebView.class);
                MessageObject messageObject = this.d;
                if (messageObject != null) {
                    i10 = messageObject.messageOwner.f20301id;
                } else {
                    i10 = 0;
                }
                if (qnVar == null) {
                    S8 = 0;
                } else {
                    S8 = qnVar.S8();
                }
                gi.t4 b10 = gi.t4.b(i11, j10, this.f24933b, text, url, c10 ? 1 : 0, i10, S8, null, false, null, null, 0, false, false);
                LaunchActivity launchActivity = LaunchActivity.H1;
                if (launchActivity != null && launchActivity.P() != null && LaunchActivity.H1.P().k(b10) != null) {
                    gi.b0 b0Var = chatActivityEnterView.f23982l0;
                    if (b0Var != null) {
                        b0Var.setOpened(false);
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
                    MessagesController.showCantOpenAlert(qnVar, restrictionReason);
                    return;
                }
                gi.d3 d3Var = new gi.d3(chatActivityEnterView.getContext(), chatActivityEnterView.W3);
                d3Var.f11148k0 = chatActivityEnterView.O2;
                d3Var.t(qnVar, b10);
                d3Var.show();
                return;
            }
            return;
        }
        chatActivityEnterView.k0(false);
        AndroidUtilities.hideKeyboard(chatActivityEnterView);
        AndroidUtilities.runOnUIThread(this, 150L);
    }
}
