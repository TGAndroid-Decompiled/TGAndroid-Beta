package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_fragment;
public final class c01 extends ClickableSpan {
    public final TLRPC.TL_username f38197a;
    public final String f38198b;
    public final j01 f38199c;

    public c01(j01 j01Var, TLRPC.TL_username tL_username, String str) {
        this.f38199c = j01Var;
        this.f38197a = tL_username;
        this.f38198b = str;
    }

    @Override
    public final void onClick(View view) {
        ProfileActivity profileActivity = this.f38199c.e;
        TLRPC.TL_username tL_username = this.f38197a;
        if (!tL_username.editable) {
            if (profileActivity.f36049o5 != this) {
                profileActivity.V4(this);
                TL_fragment.TL_getCollectibleInfo tL_getCollectibleInfo = new TL_fragment.TL_getCollectibleInfo();
                TL_fragment.TL_inputCollectibleUsername tL_inputCollectibleUsername = new TL_fragment.TL_inputCollectibleUsername();
                tL_inputCollectibleUsername.username = tL_username.username;
                tL_getCollectibleInfo.collectible = tL_inputCollectibleUsername;
                profileActivity.getConnectionsManager().bindRequestToGuid(profileActivity.getConnectionsManager().sendRequest(tL_getCollectibleInfo, new j10(27, this, tL_username)), profileActivity.getClassGuid());
                return;
            }
            return;
        }
        profileActivity.V4(null);
        String str = profileActivity.getMessagesController().linkPrefix + "/" + this.f38198b;
        TLRPC.Chat chat = profileActivity.E2;
        if (chat != null && chat.noforwards) {
            return;
        }
        AndroidUtilities.addToClipboard(str);
        profileActivity.L.j(56, 0L, null);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
        textPaint.setColor(textPaint.linkColor);
    }
}
