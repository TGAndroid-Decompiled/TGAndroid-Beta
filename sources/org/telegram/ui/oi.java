package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class oi extends bi0 {
    public final eo e;

    public oi(eo eoVar, Context context, int i10, MessageObject messageObject) {
        super(context);
        this.e = eoVar;
        this.f31270a = null;
        if (!messageObject.isRoundVideo()) {
            messageObject.isVoice();
        }
        org.telegram.ui.Components.a10 a10Var = new org.telegram.ui.Components.a10(context, null);
        this.f31272c = a10Var;
        a10Var.f(org.telegram.ui.ActionBar.j6.G8, org.telegram.ui.ActionBar.j6.f18017i6, -1);
        a10Var.setViewType(13);
        a10Var.setIsSingleCell(false);
        addView(a10Var, w7.a6.c(-1.0f, -2));
        org.telegram.ui.Components.m90 m90Var = new org.telegram.ui.Components.m90(context, null);
        this.f31271b = m90Var;
        m90Var.setTextSize(1, 14.0f);
        m90Var.setGravity(19);
        m90Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.E8, false));
        m90Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.gc, false));
        m90Var.setEllipsize(TextUtils.TruncateAt.END);
        m90Var.setSingleLine();
        m90Var.setLines(1);
        m90Var.setMaxLines(1);
        addView(m90Var, w7.a6.d(-1, -2.0f, 19, 12.0f, 0.0f, 12.0f, 0.0f));
        TLRPC.TL_channels_getMessageAuthor tL_channels_getMessageAuthor = new TLRPC.TL_channels_getMessageAuthor();
        tL_channels_getMessageAuthor.channel = MessagesController.getInstance(i10).getInputChannel(-messageObject.getDialogId());
        tL_channels_getMessageAuthor.f17232id = messageObject.getId();
        m90Var.setAlpha(0.0f);
        ConnectionsManager.getInstance(i10).sendRequest(tL_channels_getMessageAuthor, new di.k4(this, i10, 4));
        setBackground(org.telegram.ui.ActionBar.j6.Y(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.I5, false), 6, 0));
        setEnabled(false);
    }
}
