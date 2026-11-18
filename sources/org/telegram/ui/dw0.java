package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_fragment;
public final class dw0 extends ClickableSpan {
    public final TLRPC.TL_username f47062a;
    public final String f47063b;
    public final lw0 f47064c;

    public dw0(lw0 lw0Var, TLRPC.TL_username tL_username, String str) {
        this.f47064c = lw0Var;
        this.f47062a = tL_username;
        this.f47063b = str;
    }

    @Override
    public final void onClick(View view) {
        ProfileActivity profileActivity = this.f47064c.f49704e;
        TLRPC.TL_username tL_username = this.f47062a;
        if (!tL_username.editable) {
            if (profileActivity.f43611o5 != this) {
                profileActivity.h5(this);
                TL_fragment.TL_getCollectibleInfo tL_getCollectibleInfo = new TL_fragment.TL_getCollectibleInfo();
                TL_fragment.TL_inputCollectibleUsername tL_inputCollectibleUsername = new TL_fragment.TL_inputCollectibleUsername();
                tL_inputCollectibleUsername.username = tL_username.username;
                tL_getCollectibleInfo.collectible = tL_inputCollectibleUsername;
                profileActivity.getConnectionsManager().bindRequestToGuid(profileActivity.getConnectionsManager().sendRequest(tL_getCollectibleInfo, new e00(26, this, tL_username)), profileActivity.getClassGuid());
                return;
            }
            return;
        }
        profileActivity.h5(null);
        String str = profileActivity.getMessagesController().X2 + "/" + this.f47063b;
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
