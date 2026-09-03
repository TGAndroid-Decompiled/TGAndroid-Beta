package org.telegram.ui.Components;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.LaunchActivity;
public final class sf implements Runnable {
    public final MessageObject f28731a;
    public final long f28732b;
    public final TL_keyboard.KeyboardButtonProto f28733c;
    public final MessageObject d;
    public final TLRPC.User e;
    public final ChatActivityEnterView f28734f;

    public sf(ChatActivityEnterView chatActivityEnterView, MessageObject messageObject, long j10, TL_keyboard.KeyboardButtonProto keyboardButtonProto, MessageObject messageObject2, TLRPC.User user) {
        this.f28734f = chatActivityEnterView;
        this.f28731a = messageObject;
        this.f28732b = j10;
        this.f28733c = keyboardButtonProto;
        this.d = messageObject2;
        this.e = user;
    }

    @Override
    public final void run() {
        int i10;
        long N8;
        String restrictionReason;
        ChatActivityEnterView chatActivityEnterView = this.f28734f;
        org.telegram.ui.zn znVar = chatActivityEnterView.L2;
        if (chatActivityEnterView.f22754i1.R() <= AndroidUtilities.dp(20.0f) && !chatActivityEnterView.t0()) {
            if (znVar != null) {
                int i11 = chatActivityEnterView.N;
                long j10 = this.f28731a.messageOwner.dialog_id;
                TL_keyboard.KeyboardButtonProto keyboardButtonProto = this.f28733c;
                String text = keyboardButtonProto.getText();
                String url = keyboardButtonProto.getUrl();
                boolean c3 = lf.c.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeSimpleWebView.class);
                MessageObject messageObject = this.d;
                if (messageObject != null) {
                    i10 = messageObject.messageOwner.f19180id;
                } else {
                    i10 = 0;
                }
                if (znVar == null) {
                    N8 = 0;
                } else {
                    N8 = znVar.N8();
                }
                rh.y3 b10 = rh.y3.b(i11, j10, this.f28732b, text, url, c3 ? 1 : 0, i10, N8, null, false, null, null, 0, false, false);
                LaunchActivity launchActivity = LaunchActivity.D1;
                if (launchActivity != null && launchActivity.P() != null && LaunchActivity.D1.P().m(b10) != null) {
                    rh.z zVar = chatActivityEnterView.f22753i0;
                    if (zVar != null) {
                        zVar.setOpened(false);
                        return;
                    }
                    return;
                }
                TLRPC.User user = this.e;
                if (user == null) {
                    restrictionReason = null;
                } else {
                    restrictionReason = MessagesController.getInstance(chatActivityEnterView.N).getRestrictionReason(user.restriction_reason);
                }
                if (!TextUtils.isEmpty(restrictionReason)) {
                    MessagesController.getInstance(chatActivityEnterView.N);
                    MessagesController.showCantOpenAlert(znVar, restrictionReason);
                    return;
                }
                rh.p2 p2Var = new rh.p2(chatActivityEnterView.getContext(), chatActivityEnterView.S3);
                p2Var.f43741h0 = chatActivityEnterView.K2;
                p2Var.s(znVar, b10);
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
