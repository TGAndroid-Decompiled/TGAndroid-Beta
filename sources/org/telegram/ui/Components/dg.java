package org.telegram.ui.Components;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.LaunchActivity;
public final class dg implements Runnable {
    public final MessageObject f24116a;
    public final long f24117b;
    public final TL_keyboard.KeyboardButtonProto f24118c;
    public final MessageObject d;
    public final TLRPC.User e;
    public final ChatActivityEnterView f24119f;

    public dg(ChatActivityEnterView chatActivityEnterView, MessageObject messageObject, long j10, TL_keyboard.KeyboardButtonProto keyboardButtonProto, MessageObject messageObject2, TLRPC.User user) {
        this.f24119f = chatActivityEnterView;
        this.f24116a = messageObject;
        this.f24117b = j10;
        this.f24118c = keyboardButtonProto;
        this.d = messageObject2;
        this.e = user;
    }

    @Override
    public final void run() {
        int i10;
        long S8;
        String restrictionReason;
        ChatActivityEnterView chatActivityEnterView = this.f24119f;
        org.telegram.ui.fo foVar = chatActivityEnterView.P2;
        if (chatActivityEnterView.f22623m1.R() <= AndroidUtilities.dp(20.0f) && !chatActivityEnterView.r0()) {
            if (foVar != null) {
                int i11 = chatActivityEnterView.Q;
                long j10 = this.f24116a.messageOwner.dialog_id;
                TL_keyboard.KeyboardButtonProto keyboardButtonProto = this.f24118c;
                String text = keyboardButtonProto.getText();
                String url = keyboardButtonProto.getUrl();
                boolean c10 = ag.c.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeSimpleWebView.class);
                MessageObject messageObject = this.d;
                if (messageObject != null) {
                    i10 = messageObject.messageOwner.f18937id;
                } else {
                    i10 = 0;
                }
                if (foVar == null) {
                    S8 = 0;
                } else {
                    S8 = foVar.S8();
                }
                fi.e5 b10 = fi.e5.b(i11, j10, this.f24117b, text, url, c10 ? 1 : 0, i10, S8, null, false, null, null, 0, false, false);
                LaunchActivity launchActivity = LaunchActivity.G1;
                if (launchActivity != null && launchActivity.P() != null && LaunchActivity.G1.P().k(b10) != null) {
                    fi.b0 b0Var = chatActivityEnterView.f22619l0;
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
                    MessagesController.showCantOpenAlert(foVar, restrictionReason);
                    return;
                }
                fi.k3 k3Var = new fi.k3(chatActivityEnterView.getContext(), chatActivityEnterView.W3);
                k3Var.f9368k0 = chatActivityEnterView.O2;
                k3Var.t(foVar, b10);
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
