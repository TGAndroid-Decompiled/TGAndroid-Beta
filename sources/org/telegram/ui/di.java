package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class di extends oh0 {
    public final sn f36632f;

    public di(sn snVar, Context context, int i10, MessageObject messageObject) {
        super(context);
        this.f36632f = snVar;
        this.f40192a = null;
        if (!messageObject.isRoundVideo()) {
            messageObject.isVoice();
        }
        org.telegram.ui.Components.z00 z00Var = new org.telegram.ui.Components.z00(context, null);
        this.f40194c = z00Var;
        z00Var.e(org.telegram.ui.ActionBar.k6.G8, org.telegram.ui.ActionBar.k6.f21273i6, -1);
        z00Var.setViewType(13);
        z00Var.setIsSingleCell(false);
        addView(z00Var, w7.z5.c(-1.0f, -2));
        org.telegram.ui.Components.w90 w90Var = new org.telegram.ui.Components.w90(context, null);
        this.f40193b = w90Var;
        w90Var.setTextSize(1, 14.0f);
        w90Var.setGravity(19);
        org.telegram.ui.ActionBar.r6.W(w90Var, org.telegram.ui.ActionBar.k6.E8, null);
        org.telegram.ui.ActionBar.r6.I(w90Var, org.telegram.ui.ActionBar.k6.f21243gc, null);
        w90Var.setEllipsize(TextUtils.TruncateAt.END);
        w90Var.setSingleLine();
        w90Var.setLines(1);
        w90Var.setMaxLines(1);
        addView(w90Var, w7.z5.d(-1, -2.0f, 19, 12.0f, 0.0f, 12.0f, 0.0f));
        TLRPC.TL_channels_getMessageAuthor tL_channels_getMessageAuthor = new TLRPC.TL_channels_getMessageAuthor();
        tL_channels_getMessageAuthor.channel = MessagesController.getInstance(i10).getInputChannel(-messageObject.getDialogId());
        tL_channels_getMessageAuthor.f20381id = messageObject.getId();
        w90Var.setAlpha(0.0f);
        ConnectionsManager.getInstance(i10).sendRequest(tL_channels_getMessageAuthor, new ai.n2(this, i10, 8));
        setBackground(org.telegram.ui.ActionBar.k6.Z(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.I5, false), 6, 0));
        setEnabled(false);
    }
}
