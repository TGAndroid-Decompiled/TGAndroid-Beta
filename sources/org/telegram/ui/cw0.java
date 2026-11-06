package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_fragment;
public final class cw0 extends ClickableSpan {
    public final TLRPC.TL_username f44882a;
    public final String f44883b;
    public final jw0 f44884c;

    public cw0(jw0 jw0Var, TLRPC.TL_username tL_username, String str) {
        this.f44884c = jw0Var;
        this.f44882a = tL_username;
        this.f44883b = str;
    }

    @Override
    public final void onClick(View view) {
        ProfileActivity profileActivity = this.f44884c.f47027e;
        TLRPC.TL_username tL_username = this.f44882a;
        if (!tL_username.editable) {
            if (profileActivity.f41728i5 != this) {
                profileActivity.e5(this);
                TL_fragment.TL_getCollectibleInfo tL_getCollectibleInfo = new TL_fragment.TL_getCollectibleInfo();
                TL_fragment.TL_inputCollectibleUsername tL_inputCollectibleUsername = new TL_fragment.TL_inputCollectibleUsername();
                tL_inputCollectibleUsername.username = tL_username.username;
                tL_getCollectibleInfo.collectible = tL_inputCollectibleUsername;
                profileActivity.getConnectionsManager().bindRequestToGuid(profileActivity.getConnectionsManager().sendRequest(tL_getCollectibleInfo, new h50(24, this, tL_username)), profileActivity.getClassGuid());
                return;
            }
            return;
        }
        profileActivity.e5(null);
        String str = profileActivity.getMessagesController().U2 + "/" + this.f44883b;
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
