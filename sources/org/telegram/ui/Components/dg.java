package org.telegram.ui.Components;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.LaunchActivity;
public final class dg implements Runnable {
    public final MessageObject f22414a;
    public final long f22415b;
    public final TL_keyboard.KeyboardButtonProto f22416c;
    public final MessageObject d;
    public final TLRPC.User e;
    public final ChatActivityEnterView f22417f;

    public dg(ChatActivityEnterView chatActivityEnterView, MessageObject messageObject, long j3, TL_keyboard.KeyboardButtonProto keyboardButtonProto, MessageObject messageObject2, TLRPC.User user) {
        this.f22417f = chatActivityEnterView;
        this.f22414a = messageObject;
        this.f22415b = j3;
        this.f22416c = keyboardButtonProto;
        this.d = messageObject2;
        this.e = user;
    }

    @Override
    public final void run() {
        int i10;
        long N8;
        String restrictionReason;
        ChatActivityEnterView chatActivityEnterView = this.f22417f;
        org.telegram.ui.eo eoVar = chatActivityEnterView.O2;
        if (chatActivityEnterView.l1.R() <= AndroidUtilities.dp(20.0f) && !chatActivityEnterView.t0()) {
            if (eoVar != null) {
                int i11 = chatActivityEnterView.Q;
                long j3 = this.f22414a.messageOwner.dialog_id;
                TL_keyboard.KeyboardButtonProto keyboardButtonProto = this.f22416c;
                String text = keyboardButtonProto.getText();
                String url = keyboardButtonProto.getUrl();
                boolean c10 = yf.c.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeSimpleWebView.class);
                MessageObject messageObject = this.d;
                if (messageObject != null) {
                    i10 = messageObject.messageOwner.f17216id;
                } else {
                    i10 = 0;
                }
                if (eoVar == null) {
                    N8 = 0;
                } else {
                    N8 = eoVar.N8();
                }
                di.j5 b10 = di.j5.b(i11, j3, this.f22415b, text, url, c10 ? 1 : 0, i10, N8, null, false, null, null, 0, false, false);
                LaunchActivity launchActivity = LaunchActivity.G1;
                if (launchActivity != null && launchActivity.P() != null && LaunchActivity.G1.P().k(b10) != null) {
                    di.f0 f0Var = chatActivityEnterView.f20885l0;
                    if (f0Var != null) {
                        f0Var.setOpened(false);
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
                    MessagesController.showCantOpenAlert(eoVar, restrictionReason);
                    return;
                }
                di.n3 n3Var = new di.n3(chatActivityEnterView.getContext(), chatActivityEnterView.V3);
                n3Var.f6796k0 = chatActivityEnterView.N2;
                n3Var.s(eoVar, b10);
                n3Var.show();
                return;
            }
            return;
        }
        chatActivityEnterView.m0(false);
        AndroidUtilities.hideKeyboard(chatActivityEnterView);
        AndroidUtilities.runOnUIThread(this, 150L);
    }
}
