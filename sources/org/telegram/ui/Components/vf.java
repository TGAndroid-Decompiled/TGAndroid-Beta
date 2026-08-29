package org.telegram.ui.Components;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.LaunchActivity;
public final class vf implements Runnable {
    public final MessageObject f33547a;
    public final long f33548b;
    public final TL_keyboard.KeyboardButtonProto f33549c;
    public final MessageObject d;
    public final TLRPC.User f33550e;
    public final ChatActivityEnterView f33551f;

    public vf(ChatActivityEnterView chatActivityEnterView, MessageObject messageObject, long j10, TL_keyboard.KeyboardButtonProto keyboardButtonProto, MessageObject messageObject2, TLRPC.User user) {
        this.f33551f = chatActivityEnterView;
        this.f33547a = messageObject;
        this.f33548b = j10;
        this.f33549c = keyboardButtonProto;
        this.d = messageObject2;
        this.f33550e = user;
    }

    @Override
    public final void run() {
        int i10;
        long N8;
        String restrictionReason;
        ChatActivityEnterView chatActivityEnterView = this.f33551f;
        org.telegram.ui.tn tnVar = chatActivityEnterView.K2;
        if (chatActivityEnterView.f26132h1.R() <= AndroidUtilities.dp(20.0f) && !chatActivityEnterView.t0()) {
            if (tnVar != null) {
                int i11 = chatActivityEnterView.M;
                long j10 = this.f33547a.messageOwner.dialog_id;
                TL_keyboard.KeyboardButtonProto keyboardButtonProto = this.f33549c;
                String text = keyboardButtonProto.getText();
                String url = keyboardButtonProto.getUrl();
                boolean c3 = kf.c.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeSimpleWebView.class);
                MessageObject messageObject = this.d;
                if (messageObject != null) {
                    i10 = messageObject.messageOwner.f22413id;
                } else {
                    i10 = 0;
                }
                if (tnVar == null) {
                    N8 = 0;
                } else {
                    N8 = tnVar.N8();
                }
                ph.y3 b10 = ph.y3.b(i11, j10, this.f33548b, text, url, c3 ? 1 : 0, i10, N8, null, false, null, null, 0, false, false);
                LaunchActivity launchActivity = LaunchActivity.C1;
                if (launchActivity != null && launchActivity.P() != null && LaunchActivity.C1.P().m(b10) != null) {
                    ph.z zVar = chatActivityEnterView.f26131h0;
                    if (zVar != null) {
                        zVar.setOpened(false);
                        return;
                    }
                    return;
                }
                TLRPC.User user = this.f33550e;
                if (user == null) {
                    restrictionReason = null;
                } else {
                    restrictionReason = MessagesController.getInstance(chatActivityEnterView.M).getRestrictionReason(user.restriction_reason);
                }
                if (!TextUtils.isEmpty(restrictionReason)) {
                    MessagesController.getInstance(chatActivityEnterView.M);
                    MessagesController.showCantOpenAlert(tnVar, restrictionReason);
                    return;
                }
                ph.p2 p2Var = new ph.p2(chatActivityEnterView.getContext(), chatActivityEnterView.R3);
                p2Var.f45967g0 = chatActivityEnterView.J2;
                p2Var.s(tnVar, b10);
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
