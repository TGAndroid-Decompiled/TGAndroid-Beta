package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_fragment;
public final class px0 extends ClickableSpan {
    public final TLRPC.TL_username f40630a;
    public final String f40631b;
    public final wx0 f40632c;

    public px0(wx0 wx0Var, TLRPC.TL_username tL_username, String str) {
        this.f40632c = wx0Var;
        this.f40630a = tL_username;
        this.f40631b = str;
    }

    @Override
    public final void onClick(View view) {
        ProfileActivity profileActivity = this.f40632c.e;
        TLRPC.TL_username tL_username = this.f40630a;
        if (!tL_username.editable) {
            if (profileActivity.f33843i5 != this) {
                profileActivity.e5(this);
                TL_fragment.TL_getCollectibleInfo tL_getCollectibleInfo = new TL_fragment.TL_getCollectibleInfo();
                TL_fragment.TL_inputCollectibleUsername tL_inputCollectibleUsername = new TL_fragment.TL_inputCollectibleUsername();
                tL_inputCollectibleUsername.username = tL_username.username;
                tL_getCollectibleInfo.collectible = tL_inputCollectibleUsername;
                profileActivity.getConnectionsManager().bindRequestToGuid(profileActivity.getConnectionsManager().sendRequest(tL_getCollectibleInfo, new sl0(8, this, tL_username)), profileActivity.getClassGuid());
                return;
            }
            return;
        }
        profileActivity.e5(null);
        String str = profileActivity.getMessagesController().U2 + "/" + this.f40631b;
        TLRPC.Chat chat = profileActivity.D2;
        if (chat != null && chat.noforwards) {
            return;
        }
        org.telegram.messenger.i0.g(str);
        profileActivity.L.j(56, 0L, null);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
        textPaint.setColor(textPaint.linkColor);
    }
}
