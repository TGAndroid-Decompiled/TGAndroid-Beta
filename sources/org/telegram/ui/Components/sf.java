package org.telegram.ui.Components;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.LaunchActivity;
public final class sf implements Runnable {
    public final MessageObject f31048a;
    public final long f31049b;
    public final TL_keyboard.KeyboardButtonProto f31050c;
    public final MessageObject d;
    public final TLRPC.User f31051e;
    public final ChatActivityEnterView f31052f;

    public sf(ChatActivityEnterView chatActivityEnterView, MessageObject messageObject, long j10, TL_keyboard.KeyboardButtonProto keyboardButtonProto, MessageObject messageObject2, TLRPC.User user) {
        this.f31052f = chatActivityEnterView;
        this.f31048a = messageObject;
        this.f31049b = j10;
        this.f31050c = keyboardButtonProto;
        this.d = messageObject2;
        this.f31051e = user;
    }

    @Override
    public final void run() {
        int i10;
        long N8;
        String restrictionReason;
        ChatActivityEnterView chatActivityEnterView = this.f31052f;
        org.telegram.ui.xn xnVar = chatActivityEnterView.L2;
        if (chatActivityEnterView.f24623i1.R() <= AndroidUtilities.dp(20.0f) && !chatActivityEnterView.t0()) {
            if (xnVar != null) {
                int i11 = chatActivityEnterView.N;
                long j10 = this.f31048a.messageOwner.dialog_id;
                TL_keyboard.KeyboardButtonProto keyboardButtonProto = this.f31050c;
                String text = keyboardButtonProto.getText();
                String url = keyboardButtonProto.getUrl();
                boolean c3 = mf.c.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeSimpleWebView.class);
                MessageObject messageObject = this.d;
                if (messageObject != null) {
                    i10 = messageObject.messageOwner.f20866id;
                } else {
                    i10 = 0;
                }
                if (xnVar == null) {
                    N8 = 0;
                } else {
                    N8 = xnVar.N8();
                }
                sh.y3 b10 = sh.y3.b(i11, j10, this.f31049b, text, url, c3 ? 1 : 0, i10, N8, null, false, null, null, 0, false, false);
                LaunchActivity launchActivity = LaunchActivity.D1;
                if (launchActivity != null && launchActivity.P() != null && LaunchActivity.D1.P().m(b10) != null) {
                    sh.z zVar = chatActivityEnterView.f24622i0;
                    if (zVar != null) {
                        zVar.setOpened(false);
                        return;
                    }
                    return;
                }
                TLRPC.User user = this.f31051e;
                if (user == null) {
                    restrictionReason = null;
                } else {
                    restrictionReason = MessagesController.getInstance(chatActivityEnterView.N).getRestrictionReason(user.restriction_reason);
                }
                if (!TextUtils.isEmpty(restrictionReason)) {
                    MessagesController.getInstance(chatActivityEnterView.N);
                    MessagesController.showCantOpenAlert(xnVar, restrictionReason);
                    return;
                }
                sh.p2 p2Var = new sh.p2(chatActivityEnterView.getContext(), chatActivityEnterView.S3);
                p2Var.f47629h0 = chatActivityEnterView.K2;
                p2Var.s(xnVar, b10);
                p2Var.show();
                return;
            }
            return;
        }
        chatActivityEnterView.m0(false);
        AndroidUtilities.hideKeyboard(chatActivityEnterView);
        AndroidUtilities.runOnUIThread(this, 150L);
    }
}
