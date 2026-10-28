package org.telegram.ui.Components;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.LaunchActivity;
public final class bg implements Runnable {
    public final MessageObject f26823a;
    public final long f26824b;
    public final TL_keyboard.KeyboardButtonProto f26825c;
    public final MessageObject d;
    public final TLRPC.User e;
    public final ChatActivityEnterView f26826f;

    public bg(ChatActivityEnterView chatActivityEnterView, MessageObject messageObject, long j10, TL_keyboard.KeyboardButtonProto keyboardButtonProto, MessageObject messageObject2, TLRPC.User user) {
        this.f26826f = chatActivityEnterView;
        this.f26823a = messageObject;
        this.f26824b = j10;
        this.f26825c = keyboardButtonProto;
        this.d = messageObject2;
        this.e = user;
    }

    @Override
    public final void run() {
        int i10;
        long a92;
        String restrictionReason;
        ChatActivityEnterView chatActivityEnterView = this.f26826f;
        org.telegram.ui.wn wnVar = chatActivityEnterView.P2;
        if (chatActivityEnterView.f25919m1.Q() <= AndroidUtilities.dp(20.0f) && !chatActivityEnterView.p0()) {
            if (wnVar != null) {
                int i11 = chatActivityEnterView.Q;
                long j10 = this.f26823a.messageOwner.dialog_id;
                TL_keyboard.KeyboardButtonProto keyboardButtonProto = this.f26825c;
                String text = keyboardButtonProto.getText();
                String url = keyboardButtonProto.getUrl();
                boolean c10 = bg.c.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeSimpleWebView.class);
                MessageObject messageObject = this.d;
                if (messageObject != null) {
                    i10 = messageObject.messageOwner.f22049id;
                } else {
                    i10 = 0;
                }
                if (wnVar == null) {
                    a92 = 0;
                } else {
                    a92 = wnVar.a9();
                }
                hi.c5 b10 = hi.c5.b(i11, j10, this.f26824b, text, url, c10 ? 1 : 0, i10, a92, null, false, null, null, 0, false, false);
                LaunchActivity launchActivity = LaunchActivity.I1;
                if (launchActivity != null && launchActivity.P() != null && LaunchActivity.I1.P().k(b10) != null) {
                    hi.i0 i0Var = chatActivityEnterView.f25915l0;
                    if (i0Var != null) {
                        i0Var.setOpened(false);
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
                    MessagesController.showCantOpenAlert(wnVar, restrictionReason);
                    return;
                }
                hi.m3 m3Var = new hi.m3(chatActivityEnterView.getContext(), chatActivityEnterView.W3);
                m3Var.f13115l0 = chatActivityEnterView.O2;
                m3Var.t(wnVar, b10);
                m3Var.show();
                return;
            }
            return;
        }
        chatActivityEnterView.i0(false);
        AndroidUtilities.hideKeyboard(chatActivityEnterView);
        AndroidUtilities.runOnUIThread(this, 150L);
    }
}
