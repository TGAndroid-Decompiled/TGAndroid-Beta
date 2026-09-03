package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class ii extends sh0 {
    public final xn f37666e;

    public ii(xn xnVar, Context context, int i10, MessageObject messageObject) {
        super(context);
        this.f37666e = xnVar;
        this.f41241a = null;
        if (!messageObject.isRoundVideo()) {
            messageObject.isVoice();
        }
        org.telegram.ui.Components.u00 u00Var = new org.telegram.ui.Components.u00(context, null);
        this.f41243c = u00Var;
        u00Var.f(org.telegram.ui.ActionBar.k6.G8, org.telegram.ui.ActionBar.k6.f21752i6, -1);
        u00Var.setViewType(13);
        u00Var.setIsSingleCell(false);
        addView(u00Var, k7.c6.c(-1.0f, -2));
        org.telegram.ui.Components.g90 g90Var = new org.telegram.ui.Components.g90(context, null);
        this.f41242b = g90Var;
        g90Var.setTextSize(1, 14.0f);
        g90Var.setGravity(19);
        g90Var.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.E8, false));
        g90Var.setLinkTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21722gc, false));
        g90Var.setEllipsize(TextUtils.TruncateAt.END);
        g90Var.setSingleLine();
        g90Var.setLines(1);
        g90Var.setMaxLines(1);
        addView(g90Var, k7.c6.d(-1, -2.0f, 19, 12.0f, 0.0f, 12.0f, 0.0f));
        TLRPC.TL_channels_getMessageAuthor tL_channels_getMessageAuthor = new TLRPC.TL_channels_getMessageAuthor();
        tL_channels_getMessageAuthor.channel = MessagesController.getInstance(i10).getInputChannel(-messageObject.getDialogId());
        tL_channels_getMessageAuthor.f20882id = messageObject.getId();
        g90Var.setAlpha(0.0f);
        ConnectionsManager.getInstance(i10).sendRequest(tL_channels_getMessageAuthor, new mh.r1(this, i10, 7));
        setBackground(org.telegram.ui.ActionBar.k6.Y(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.I5, false), 6, 0));
        setEnabled(false);
    }
}
