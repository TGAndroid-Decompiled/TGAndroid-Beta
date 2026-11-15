package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_fragment;
public final class bw0 extends ClickableSpan {
    public final TLRPC.TL_username f45832a;
    public final String f45833b;
    public final iw0 f45834c;

    public bw0(iw0 iw0Var, TLRPC.TL_username tL_username, String str) {
        this.f45834c = iw0Var;
        this.f45832a = tL_username;
        this.f45833b = str;
    }

    @Override
    public final void onClick(View view) {
        ProfileActivity profileActivity = this.f45834c.f48123e;
        TLRPC.TL_username tL_username = this.f45832a;
        if (!tL_username.editable) {
            if (profileActivity.f43152m5 != this) {
                profileActivity.g5(this);
                TL_fragment.TL_getCollectibleInfo tL_getCollectibleInfo = new TL_fragment.TL_getCollectibleInfo();
                TL_fragment.TL_inputCollectibleUsername tL_inputCollectibleUsername = new TL_fragment.TL_inputCollectibleUsername();
                tL_inputCollectibleUsername.username = tL_username.username;
                tL_getCollectibleInfo.collectible = tL_inputCollectibleUsername;
                profileActivity.getConnectionsManager().bindRequestToGuid(profileActivity.getConnectionsManager().sendRequest(tL_getCollectibleInfo, new b00(26, this, tL_username)), profileActivity.getClassGuid());
                return;
            }
            return;
        }
        profileActivity.g5(null);
        String str = profileActivity.getMessagesController().V2 + "/" + this.f45833b;
        TLRPC.Chat chat = profileActivity.F2;
        if (chat != null && chat.noforwards) {
            return;
        }
        org.telegram.messenger.g0.g(str);
        profileActivity.M.j(56, 0L, null);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
        textPaint.setColor(textPaint.linkColor);
    }
}
