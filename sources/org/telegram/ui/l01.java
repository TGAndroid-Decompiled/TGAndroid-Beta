package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_fragment;
public final class l01 extends ClickableSpan {
    public final TLRPC.TL_username f35214a;
    public final String f35215b;
    public final s01 f35216c;

    public l01(s01 s01Var, TLRPC.TL_username tL_username, String str) {
        this.f35216c = s01Var;
        this.f35214a = tL_username;
        this.f35215b = str;
    }

    @Override
    public final void onClick(View view) {
        ProfileActivity profileActivity = this.f35216c.e;
        TLRPC.TL_username tL_username = this.f35214a;
        if (!tL_username.editable) {
            if (profileActivity.f31590i5 != this) {
                profileActivity.M4(this);
                TL_fragment.TL_getCollectibleInfo tL_getCollectibleInfo = new TL_fragment.TL_getCollectibleInfo();
                TL_fragment.TL_inputCollectibleUsername tL_inputCollectibleUsername = new TL_fragment.TL_inputCollectibleUsername();
                tL_inputCollectibleUsername.username = tL_username.username;
                tL_getCollectibleInfo.collectible = tL_inputCollectibleUsername;
                profileActivity.getConnectionsManager().bindRequestToGuid(profileActivity.getConnectionsManager().sendRequest(tL_getCollectibleInfo, new yb0(18, this, tL_username)), profileActivity.getClassGuid());
                return;
            }
            return;
        }
        profileActivity.M4(null);
        String str = profileActivity.getMessagesController().linkPrefix + "/" + this.f35215b;
        TLRPC.Chat chat = profileActivity.E2;
        if (chat != null && chat.noforwards) {
            return;
        }
        AndroidUtilities.addToClipboard(str);
        profileActivity.M.j(56, 0L, null);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
        textPaint.setColor(textPaint.linkColor);
    }
}
