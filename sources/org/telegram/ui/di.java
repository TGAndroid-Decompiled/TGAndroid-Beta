package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class di extends ph0 {
    public final sn f36637f;

    public di(sn snVar, Context context, int i10, MessageObject messageObject) {
        super(context);
        this.f36637f = snVar;
        this.f40486a = null;
        if (!messageObject.isRoundVideo()) {
            messageObject.isVoice();
        }
        org.telegram.ui.Components.b10 b10Var = new org.telegram.ui.Components.b10(context, null);
        this.f40488c = b10Var;
        b10Var.e(org.telegram.ui.ActionBar.k6.G8, org.telegram.ui.ActionBar.k6.f21272i6, -1);
        b10Var.setViewType(13);
        b10Var.setIsSingleCell(false);
        addView(b10Var, w7.z5.c(-1.0f, -2));
        org.telegram.ui.Components.y90 y90Var = new org.telegram.ui.Components.y90(context, null);
        this.f40487b = y90Var;
        y90Var.setTextSize(1, 14.0f);
        y90Var.setGravity(19);
        org.telegram.ui.ActionBar.r6.W(y90Var, org.telegram.ui.ActionBar.k6.E8, null);
        org.telegram.ui.ActionBar.r6.I(y90Var, org.telegram.ui.ActionBar.k6.f21242gc, null);
        y90Var.setEllipsize(TextUtils.TruncateAt.END);
        y90Var.setSingleLine();
        y90Var.setLines(1);
        y90Var.setMaxLines(1);
        addView(y90Var, w7.z5.d(-1, -2.0f, 19, 12.0f, 0.0f, 12.0f, 0.0f));
        TLRPC.TL_channels_getMessageAuthor tL_channels_getMessageAuthor = new TLRPC.TL_channels_getMessageAuthor();
        tL_channels_getMessageAuthor.channel = MessagesController.getInstance(i10).getInputChannel(-messageObject.getDialogId());
        tL_channels_getMessageAuthor.f20380id = messageObject.getId();
        y90Var.setAlpha(0.0f);
        ConnectionsManager.getInstance(i10).sendRequest(tL_channels_getMessageAuthor, new ai.n2(this, i10, 8));
        setBackground(org.telegram.ui.ActionBar.k6.Z(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.I5, false), 6, 0));
        setEnabled(false);
    }
}
