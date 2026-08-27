package org.telegram.ui.Components;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.LaunchActivity;

public final class of implements Runnable {

    public final MessageObject f31270a;

    public final long f31271b;

    public final TL_keyboard.KeyboardButtonProto f31272c;
    public final MessageObject d;

    public final TLRPC.User f31273e;

    public final ChatActivityEnterView f31274f;

    public of(ChatActivityEnterView chatActivityEnterView, MessageObject messageObject, long j10, TL_keyboard.KeyboardButtonProto keyboardButtonProto, MessageObject messageObject2, TLRPC.User user) {
        this.f31274f = chatActivityEnterView;
        this.f31270a = messageObject;
        this.f31271b = j10;
        this.f31272c = keyboardButtonProto;
        this.d = messageObject2;
        this.f31273e = user;
    }

    @Override
    public final void run() {
        ChatActivityEnterView chatActivityEnterView = this.f31274f;
        org.telegram.ui.rn rnVar = chatActivityEnterView.K2;
        if (chatActivityEnterView.f26117h1.R() > AndroidUtilities.dp(20.0f) || chatActivityEnterView.t0()) {
            chatActivityEnterView.m0(false);
            AndroidUtilities.hideKeyboard(chatActivityEnterView);
            AndroidUtilities.runOnUIThread(this, 150L);
            return;
        }
        if (rnVar == null) {
            return;
        }
        int i10 = chatActivityEnterView.M;
        long j10 = this.f31270a.messageOwner.dialog_id;
        TL_keyboard.KeyboardButtonProto keyboardButtonProto = this.f31272c;
        String text = keyboardButtonProto.getText();
        String url = keyboardButtonProto.getUrl();
        boolean zC = hf.c.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeSimpleWebView.class);
        MessageObject messageObject = this.d;
        nh.q4 q4VarB = nh.q4.b(i10, j10, this.f31271b, text, url, zC ? 1 : 0, messageObject != null ? messageObject.messageOwner.f22401id : 0, rnVar == null ? 0L : rnVar.N8(), null, false, null, null, 0, false, false);
        LaunchActivity launchActivity = LaunchActivity.C1;
        if (launchActivity != null && launchActivity.P() != null && LaunchActivity.C1.P().k(q4VarB) != null) {
            nh.a0 a0Var = chatActivityEnterView.f26116h0;
            if (a0Var != null) {
                a0Var.setOpened(false);
                return;
            }
            return;
        }
        TLRPC.User user = this.f31273e;
        String restrictionReason = user == null ? null : MessagesController.getInstance(chatActivityEnterView.M).getRestrictionReason(user.restriction_reason);
        if (!TextUtils.isEmpty(restrictionReason)) {
            MessagesController.getInstance(chatActivityEnterView.M);
            MessagesController.showCantOpenAlert(rnVar, restrictionReason);
        } else {
            nh.b3 b3Var = new nh.b3(chatActivityEnterView.getContext(), chatActivityEnterView.R3);
            b3Var.f18579g0 = chatActivityEnterView.J2;
            b3Var.s(rnVar, q4VarB);
            b3Var.show();
        }
    }
}
