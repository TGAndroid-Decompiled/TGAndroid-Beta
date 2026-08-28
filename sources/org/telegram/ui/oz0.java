package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_fragment;
public final class oz0 extends ClickableSpan {
    public final TLRPC.TL_username f41283a;
    public final String f41284b;
    public final vz0 f41285c;

    public oz0(vz0 vz0Var, TLRPC.TL_username tL_username, String str) {
        this.f41285c = vz0Var;
        this.f41283a = tL_username;
        this.f41284b = str;
    }

    @Override
    public final void onClick(View view) {
        ProfileActivity profileActivity = this.f41285c.f43616e;
        TLRPC.TL_username tL_username = this.f41283a;
        if (!tL_username.editable) {
            if (profileActivity.f35953e5 != this) {
                profileActivity.M4(this);
                TL_fragment.TL_getCollectibleInfo tL_getCollectibleInfo = new TL_fragment.TL_getCollectibleInfo();
                TL_fragment.TL_inputCollectibleUsername tL_inputCollectibleUsername = new TL_fragment.TL_inputCollectibleUsername();
                tL_inputCollectibleUsername.username = tL_username.username;
                tL_getCollectibleInfo.collectible = tL_inputCollectibleUsername;
                profileActivity.getConnectionsManager().bindRequestToGuid(profileActivity.getConnectionsManager().sendRequest(tL_getCollectibleInfo, new v40(25, this, tL_username)), profileActivity.getClassGuid());
                return;
            }
            return;
        }
        profileActivity.M4(null);
        String str = profileActivity.getMessagesController().linkPrefix + "/" + this.f41284b;
        TLRPC.Chat chat = profileActivity.A2;
        if (chat != null && chat.noforwards) {
            return;
        }
        AndroidUtilities.addToClipboard(str);
        profileActivity.I.j(56, 0L, null);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
        textPaint.setColor(textPaint.linkColor);
    }
}
