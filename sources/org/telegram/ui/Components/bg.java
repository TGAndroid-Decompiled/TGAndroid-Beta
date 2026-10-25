package org.telegram.ui.Components;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.LaunchActivity;
public final class bg implements Runnable {
    public final MessageObject f26844a;
    public final long f26845b;
    public final TL_keyboard.KeyboardButtonProto f26846c;
    public final MessageObject d;
    public final TLRPC.User e;
    public final ChatActivityEnterView f26847f;

    public bg(ChatActivityEnterView chatActivityEnterView, MessageObject messageObject, long j10, TL_keyboard.KeyboardButtonProto keyboardButtonProto, MessageObject messageObject2, TLRPC.User user) {
        this.f26847f = chatActivityEnterView;
        this.f26844a = messageObject;
        this.f26845b = j10;
        this.f26846c = keyboardButtonProto;
        this.d = messageObject2;
        this.e = user;
    }

    @Override
    public final void run() {
        int i10;
        long X8;
        String restrictionReason;
        ChatActivityEnterView chatActivityEnterView = this.f26847f;
        org.telegram.ui.un unVar = chatActivityEnterView.P2;
        if (chatActivityEnterView.f25915m1.Q() <= AndroidUtilities.dp(20.0f) && !chatActivityEnterView.q0()) {
            if (unVar != null) {
                int i11 = chatActivityEnterView.Q;
                long j10 = this.f26844a.messageOwner.dialog_id;
                TL_keyboard.KeyboardButtonProto keyboardButtonProto = this.f26846c;
                String text = keyboardButtonProto.getText();
                String url = keyboardButtonProto.getUrl();
                boolean c10 = bg.c.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeSimpleWebView.class);
                MessageObject messageObject = this.d;
                if (messageObject != null) {
                    i10 = messageObject.messageOwner.f22048id;
                } else {
                    i10 = 0;
                }
                if (unVar == null) {
                    X8 = 0;
                } else {
                    X8 = unVar.X8();
                }
                hi.c5 b10 = hi.c5.b(i11, j10, this.f26845b, text, url, c10 ? 1 : 0, i10, X8, null, false, null, null, 0, false, false);
                LaunchActivity launchActivity = LaunchActivity.I1;
                if (launchActivity != null && launchActivity.P() != null && LaunchActivity.I1.P().k(b10) != null) {
                    hi.i0 i0Var = chatActivityEnterView.f25911l0;
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
                    MessagesController.showCantOpenAlert(unVar, restrictionReason);
                    return;
                }
                hi.m3 m3Var = new hi.m3(chatActivityEnterView.getContext(), chatActivityEnterView.W3);
                m3Var.f13116l0 = chatActivityEnterView.O2;
                m3Var.t(unVar, b10);
                m3Var.show();
                return;
            }
            return;
        }
        chatActivityEnterView.j0(false);
        AndroidUtilities.hideKeyboard(chatActivityEnterView);
        AndroidUtilities.runOnUIThread(this, 150L);
    }
}
