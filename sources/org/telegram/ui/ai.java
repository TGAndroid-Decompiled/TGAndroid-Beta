package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class ai extends kh0 {
    public final qn f36502e;

    public ai(qn qnVar, Context context, int i9, MessageObject messageObject) {
        super(context);
        this.f36502e = qnVar;
        this.f39841a = null;
        if (!messageObject.isRoundVideo()) {
            messageObject.isVoice();
        }
        org.telegram.ui.Components.e00 e00Var = new org.telegram.ui.Components.e00(context, null);
        this.f39843c = e00Var;
        e00Var.f(org.telegram.ui.ActionBar.f6.G8, org.telegram.ui.ActionBar.f6.f23092i6, -1);
        e00Var.setViewType(13);
        e00Var.setIsSingleCell(false);
        addView(e00Var, g7.e6.c(-1.0f, -2));
        org.telegram.ui.Components.l80 l80Var = new org.telegram.ui.Components.l80(context, null);
        this.f39842b = l80Var;
        l80Var.setTextSize(1, 14.0f);
        l80Var.setGravity(19);
        l80Var.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.E8, false));
        l80Var.setLinkTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23061gc, false));
        l80Var.setEllipsize(TextUtils.TruncateAt.END);
        l80Var.setSingleLine();
        l80Var.setLines(1);
        l80Var.setMaxLines(1);
        addView(l80Var, g7.e6.d(-1, -2.0f, 19, 12.0f, 0.0f, 12.0f, 0.0f));
        TLRPC.TL_channels_getMessageAuthor tL_channels_getMessageAuthor = new TLRPC.TL_channels_getMessageAuthor();
        tL_channels_getMessageAuthor.channel = MessagesController.getInstance(i9).getInputChannel(-messageObject.getDialogId());
        tL_channels_getMessageAuthor.f22417id = messageObject.getId();
        l80Var.setAlpha(0.0f);
        ConnectionsManager.getInstance(i9).sendRequest(tL_channels_getMessageAuthor, new gh.u1(this, i9, 8));
        setBackground(org.telegram.ui.ActionBar.f6.Y(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.I5, false), 6, 0));
        setEnabled(false);
    }
}
