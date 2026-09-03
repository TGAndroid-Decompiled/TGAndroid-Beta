package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_fragment;
public final class g01 extends ClickableSpan {
    public final TLRPC.TL_username f36959a;
    public final String f36960b;
    public final n01 f36961c;

    public g01(n01 n01Var, TLRPC.TL_username tL_username, String str) {
        this.f36961c = n01Var;
        this.f36959a = tL_username;
        this.f36960b = str;
    }

    @Override
    public final void onClick(View view) {
        ProfileActivity profileActivity = this.f36961c.f39152e;
        TLRPC.TL_username tL_username = this.f36959a;
        if (!tL_username.editable) {
            if (profileActivity.f34602f5 != this) {
                profileActivity.M4(this);
                TL_fragment.TL_getCollectibleInfo tL_getCollectibleInfo = new TL_fragment.TL_getCollectibleInfo();
                TL_fragment.TL_inputCollectibleUsername tL_inputCollectibleUsername = new TL_fragment.TL_inputCollectibleUsername();
                tL_inputCollectibleUsername.username = tL_username.username;
                tL_getCollectibleInfo.collectible = tL_inputCollectibleUsername;
                profileActivity.getConnectionsManager().bindRequestToGuid(profileActivity.getConnectionsManager().sendRequest(tL_getCollectibleInfo, new tb0(18, this, tL_username)), profileActivity.getClassGuid());
                return;
            }
            return;
        }
        profileActivity.M4(null);
        String str = profileActivity.getMessagesController().linkPrefix + "/" + this.f36960b;
        TLRPC.Chat chat = profileActivity.B2;
        if (chat != null && chat.noforwards) {
            return;
        }
        AndroidUtilities.addToClipboard(str);
        profileActivity.J.j(56, 0L, null);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
        textPaint.setColor(textPaint.linkColor);
    }
}
