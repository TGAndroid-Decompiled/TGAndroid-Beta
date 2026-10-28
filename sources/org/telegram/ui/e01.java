package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_fragment;
public final class e01 extends ClickableSpan {
    public final TLRPC.TL_username f38726a;
    public final String f38727b;
    public final l01 f38728c;

    public e01(l01 l01Var, TLRPC.TL_username tL_username, String str) {
        this.f38728c = l01Var;
        this.f38726a = tL_username;
        this.f38727b = str;
    }

    @Override
    public final void onClick(View view) {
        ProfileActivity profileActivity = this.f38728c.e;
        TLRPC.TL_username tL_username = this.f38726a;
        if (!tL_username.editable) {
            if (profileActivity.f36076o5 != this) {
                profileActivity.V4(this);
                TL_fragment.TL_getCollectibleInfo tL_getCollectibleInfo = new TL_fragment.TL_getCollectibleInfo();
                TL_fragment.TL_inputCollectibleUsername tL_inputCollectibleUsername = new TL_fragment.TL_inputCollectibleUsername();
                tL_inputCollectibleUsername.username = tL_username.username;
                tL_getCollectibleInfo.collectible = tL_inputCollectibleUsername;
                profileActivity.getConnectionsManager().bindRequestToGuid(profileActivity.getConnectionsManager().sendRequest(tL_getCollectibleInfo, new l10(27, this, tL_username)), profileActivity.getClassGuid());
                return;
            }
            return;
        }
        profileActivity.V4(null);
        String str = profileActivity.getMessagesController().linkPrefix + "/" + this.f38727b;
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
