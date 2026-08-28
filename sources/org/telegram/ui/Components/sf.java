package org.telegram.ui.Components;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.LaunchActivity;
public final class sf implements Runnable {
    public final MessageObject f32452a;
    public final long f32453b;
    public final TL_keyboard.KeyboardButtonProto f32454c;
    public final MessageObject d;
    public final TLRPC.User f32455e;
    public final ChatActivityEnterView f32456f;

    public sf(ChatActivityEnterView chatActivityEnterView, MessageObject messageObject, long j10, TL_keyboard.KeyboardButtonProto keyboardButtonProto, MessageObject messageObject2, TLRPC.User user) {
        this.f32456f = chatActivityEnterView;
        this.f32452a = messageObject;
        this.f32453b = j10;
        this.f32454c = keyboardButtonProto;
        this.d = messageObject2;
        this.f32455e = user;
    }

    @Override
    public final void run() {
        int i9;
        long N8;
        String restrictionReason;
        ChatActivityEnterView chatActivityEnterView = this.f32456f;
        org.telegram.ui.qn qnVar = chatActivityEnterView.K2;
        if (chatActivityEnterView.f26121h1.R() <= AndroidUtilities.dp(20.0f) && !chatActivityEnterView.s0()) {
            if (qnVar != null) {
                int i10 = chatActivityEnterView.M;
                long j10 = this.f32452a.messageOwner.dialog_id;
                TL_keyboard.KeyboardButtonProto keyboardButtonProto = this.f32454c;
                String text = keyboardButtonProto.getText();
                String url = keyboardButtonProto.getUrl();
                boolean c10 = gf.c.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeSimpleWebView.class);
                MessageObject messageObject = this.d;
                if (messageObject != null) {
                    i9 = messageObject.messageOwner.f22401id;
                } else {
                    i9 = 0;
                }
                if (qnVar == null) {
                    N8 = 0;
                } else {
                    N8 = qnVar.N8();
                }
                mh.s4 b10 = mh.s4.b(i10, j10, this.f32453b, text, url, c10 ? 1 : 0, i9, N8, null, false, null, null, 0, false, false);
                LaunchActivity launchActivity = LaunchActivity.C1;
                if (launchActivity != null && launchActivity.P() != null && LaunchActivity.C1.P().k(b10) != null) {
                    mh.c0 c0Var = chatActivityEnterView.f26120h0;
                    if (c0Var != null) {
                        c0Var.setOpened(false);
                        return;
                    }
                    return;
                }
                TLRPC.User user = this.f32455e;
                if (user == null) {
                    restrictionReason = null;
                } else {
                    restrictionReason = MessagesController.getInstance(chatActivityEnterView.M).getRestrictionReason(user.restriction_reason);
                }
                if (!TextUtils.isEmpty(restrictionReason)) {
                    MessagesController.getInstance(chatActivityEnterView.M);
                    MessagesController.showCantOpenAlert(qnVar, restrictionReason);
                    return;
                }
                mh.c3 c3Var = new mh.c3(chatActivityEnterView.getContext(), chatActivityEnterView.R3);
                c3Var.f17758g0 = chatActivityEnterView.J2;
                c3Var.s(qnVar, b10);
                c3Var.show();
                return;
            }
            return;
        }
        chatActivityEnterView.l0(false);
        AndroidUtilities.hideKeyboard(chatActivityEnterView);
        AndroidUtilities.runOnUIThread(this, 150L);
    }
}
