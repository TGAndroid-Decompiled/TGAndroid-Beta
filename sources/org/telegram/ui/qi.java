package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class qi extends di0 {
    public final eo f41339e;

    public qi(eo eoVar, Context context, int i10, MessageObject messageObject) {
        super(context);
        this.f41339e = eoVar;
        this.f36832a = null;
        if (!messageObject.isRoundVideo()) {
            messageObject.isVoice();
        }
        org.telegram.ui.Components.m10 m10Var = new org.telegram.ui.Components.m10(context, null);
        this.f36834c = m10Var;
        m10Var.f(org.telegram.ui.ActionBar.h6.G8, org.telegram.ui.ActionBar.h6.f20650i6, -1);
        m10Var.setViewType(13);
        m10Var.setIsSingleCell(false);
        addView(m10Var, w7.w5.d(-1.0f, -2));
        org.telegram.ui.Components.ia0 ia0Var = new org.telegram.ui.Components.ia0(context, null);
        this.f36833b = ia0Var;
        ia0Var.setTextSize(1, 14.0f);
        ia0Var.setGravity(19);
        ia0Var.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.E8, false));
        ia0Var.setLinkTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.gc, false));
        ia0Var.setEllipsize(TextUtils.TruncateAt.END);
        ia0Var.setSingleLine();
        ia0Var.setLines(1);
        ia0Var.setMaxLines(1);
        addView(ia0Var, w7.w5.a(-2.0f, 12.0f, 0.0f, 12.0f, 0.0f, -1, 19));
        TLRPC.TL_channels_getMessageAuthor tL_channels_getMessageAuthor = new TLRPC.TL_channels_getMessageAuthor();
        tL_channels_getMessageAuthor.channel = MessagesController.getInstance(i10).getInputChannel(-messageObject.getDialogId());
        tL_channels_getMessageAuthor.f19839id = messageObject.getId();
        ia0Var.setAlpha(0.0f);
        ConnectionsManager.getInstance(i10).sendRequest(tL_channels_getMessageAuthor, new ai.j8(this, i10, 6));
        setBackground(org.telegram.ui.ActionBar.h6.Z(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.I5, false), 6, 0));
        setEnabled(false);
    }
}
