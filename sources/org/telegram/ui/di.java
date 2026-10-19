package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class di extends lh0 {
    public final qn e;

    public di(qn qnVar, Context context, int i10, MessageObject messageObject) {
        super(context);
        this.e = qnVar;
        this.f38923a = null;
        if (!messageObject.isRoundVideo()) {
            messageObject.isVoice();
        }
        org.telegram.ui.Components.b10 b10Var = new org.telegram.ui.Components.b10(context, null);
        this.f38925c = b10Var;
        b10Var.f(org.telegram.ui.ActionBar.h6.G8, org.telegram.ui.ActionBar.h6.f21076i6, -1);
        b10Var.setViewType(13);
        b10Var.setIsSingleCell(false);
        addView(b10Var, w7.z5.c(-1.0f, -2));
        org.telegram.ui.Components.x90 x90Var = new org.telegram.ui.Components.x90(context, null);
        this.f38924b = x90Var;
        x90Var.setTextSize(1, 14.0f);
        x90Var.setGravity(19);
        x90Var.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.E8, false));
        x90Var.setLinkTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21046gc, false));
        x90Var.setEllipsize(TextUtils.TruncateAt.END);
        x90Var.setSingleLine();
        x90Var.setLines(1);
        x90Var.setMaxLines(1);
        addView(x90Var, w7.z5.d(-1, -2.0f, 19, 12.0f, 0.0f, 12.0f, 0.0f));
        TLRPC.TL_channels_getMessageAuthor tL_channels_getMessageAuthor = new TLRPC.TL_channels_getMessageAuthor();
        tL_channels_getMessageAuthor.channel = MessagesController.getInstance(i10).getInputChannel(-messageObject.getDialogId());
        tL_channels_getMessageAuthor.f20310id = messageObject.getId();
        x90Var.setAlpha(0.0f);
        ConnectionsManager.getInstance(i10).sendRequest(tL_channels_getMessageAuthor, new ai.n2(this, i10, 8));
        setBackground(org.telegram.ui.ActionBar.h6.Z(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.I5, false), 6, 0));
        setEnabled(false);
    }
}
