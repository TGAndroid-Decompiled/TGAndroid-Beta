package org.telegram.ui.Components;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.LaunchActivity;
public final class bg implements Runnable {
    public final MessageObject f22996a;
    public final long f22997b;
    public final TL_keyboard.KeyboardButtonProto f22998c;
    public final MessageObject d;
    public final TLRPC.User e;
    public final ChatActivityEnterView f22999f;

    public bg(ChatActivityEnterView chatActivityEnterView, MessageObject messageObject, long j3, TL_keyboard.KeyboardButtonProto keyboardButtonProto, MessageObject messageObject2, TLRPC.User user) {
        this.f22999f = chatActivityEnterView;
        this.f22996a = messageObject;
        this.f22997b = j3;
        this.f22998c = keyboardButtonProto;
        this.d = messageObject2;
        this.e = user;
    }

    @Override
    public final void run() {
        int i10;
        long N8;
        String restrictionReason;
        ChatActivityEnterView chatActivityEnterView = this.f22999f;
        org.telegram.ui.zn znVar = chatActivityEnterView.O2;
        if (chatActivityEnterView.l1.R() <= AndroidUtilities.dp(20.0f) && !chatActivityEnterView.t0()) {
            if (znVar != null) {
                int i11 = chatActivityEnterView.Q;
                long j3 = this.f22996a.messageOwner.dialog_id;
                TL_keyboard.KeyboardButtonProto keyboardButtonProto = this.f22998c;
                String text = keyboardButtonProto.getText();
                String url = keyboardButtonProto.getUrl();
                boolean c10 = zf.c.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeSimpleWebView.class);
                MessageObject messageObject = this.d;
                if (messageObject != null) {
                    i10 = messageObject.messageOwner.f18349id;
                } else {
                    i10 = 0;
                }
                if (znVar == null) {
                    N8 = 0;
                } else {
                    N8 = znVar.N8();
                }
                ei.f5 b10 = ei.f5.b(i11, j3, this.f22997b, text, url, c10 ? 1 : 0, i10, N8, null, false, null, null, 0, false, false);
                LaunchActivity launchActivity = LaunchActivity.G1;
                if (launchActivity != null && launchActivity.P() != null && LaunchActivity.G1.P().k(b10) != null) {
                    ei.c0 c0Var = chatActivityEnterView.f22021l0;
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
                    MessagesController.showCantOpenAlert(znVar, restrictionReason);
                    return;
                }
                ei.k3 k3Var = new ei.k3(chatActivityEnterView.getContext(), chatActivityEnterView.V3);
                k3Var.f8440k0 = chatActivityEnterView.N2;
                k3Var.s(znVar, b10);
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
