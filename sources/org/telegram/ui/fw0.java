package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_fragment;
public final class fw0 extends ClickableSpan {
    public final TLRPC.TL_username f45858a;
    public final String f45859b;
    public final mw0 f45860c;

    public fw0(mw0 mw0Var, TLRPC.TL_username tL_username, String str) {
        this.f45860c = mw0Var;
        this.f45858a = tL_username;
        this.f45859b = str;
    }

    @Override
    public final void onClick(View view) {
        ProfileActivity profileActivity = this.f45860c.f48065e;
        TLRPC.TL_username tL_username = this.f45858a;
        if (!tL_username.editable) {
            if (profileActivity.f41767k5 != this) {
                profileActivity.h5(this);
                TL_fragment.TL_getCollectibleInfo tL_getCollectibleInfo = new TL_fragment.TL_getCollectibleInfo();
                TL_fragment.TL_inputCollectibleUsername tL_inputCollectibleUsername = new TL_fragment.TL_inputCollectibleUsername();
                tL_inputCollectibleUsername.username = tL_username.username;
                tL_getCollectibleInfo.collectible = tL_inputCollectibleUsername;
                profileActivity.getConnectionsManager().bindRequestToGuid(profileActivity.getConnectionsManager().sendRequest(tL_getCollectibleInfo, new k50(24, this, tL_username)), profileActivity.getClassGuid());
                return;
            }
            return;
        }
        profileActivity.h5(null);
        String str = profileActivity.getMessagesController().U2 + "/" + this.f45859b;
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
