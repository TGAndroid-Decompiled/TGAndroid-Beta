package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_fragment;
public final class ew0 extends ClickableSpan {
    public final TLRPC.TL_username f45521a;
    public final String f45522b;
    public final lw0 f45523c;

    public ew0(lw0 lw0Var, TLRPC.TL_username tL_username, String str) {
        this.f45523c = lw0Var;
        this.f45521a = tL_username;
        this.f45522b = str;
    }

    @Override
    public final void onClick(View view) {
        ProfileActivity profileActivity = this.f45523c.f47690e;
        TLRPC.TL_username tL_username = this.f45521a;
        if (!tL_username.editable) {
            if (profileActivity.f41776k5 != this) {
                profileActivity.h5(this);
                TL_fragment.TL_getCollectibleInfo tL_getCollectibleInfo = new TL_fragment.TL_getCollectibleInfo();
                TL_fragment.TL_inputCollectibleUsername tL_inputCollectibleUsername = new TL_fragment.TL_inputCollectibleUsername();
                tL_inputCollectibleUsername.username = tL_username.username;
                tL_getCollectibleInfo.collectible = tL_inputCollectibleUsername;
                profileActivity.getConnectionsManager().bindRequestToGuid(profileActivity.getConnectionsManager().sendRequest(tL_getCollectibleInfo, new j50(24, this, tL_username)), profileActivity.getClassGuid());
                return;
            }
            return;
        }
        profileActivity.h5(null);
        String str = profileActivity.getMessagesController().U2 + "/" + this.f45522b;
        TLRPC.Chat chat = profileActivity.D2;
        if (chat != null && chat.noforwards) {
            return;
        }
        org.telegram.messenger.g0.g(str);
        profileActivity.L.j(56, 0L, null);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
        textPaint.setColor(textPaint.linkColor);
    }
}
