package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class ji extends uh0 {
    public final wn e;

    public ji(wn wnVar, Context context, int i10, MessageObject messageObject) {
        super(context);
        this.e = wnVar;
        this.f38480a = null;
        if (!messageObject.isRoundVideo()) {
            messageObject.isVoice();
        }
        org.telegram.ui.Components.v00 v00Var = new org.telegram.ui.Components.v00(context, null);
        this.f38482c = v00Var;
        v00Var.f(org.telegram.ui.ActionBar.h6.G8, org.telegram.ui.ActionBar.h6.f19148i6, -1);
        v00Var.setViewType(13);
        v00Var.setIsSingleCell(false);
        addView(v00Var, w7.y5.c(-1.0f, -2));
        org.telegram.ui.Components.p90 p90Var = new org.telegram.ui.Components.p90(context, null);
        this.f38481b = p90Var;
        p90Var.setTextSize(1, 14.0f);
        p90Var.setGravity(19);
        p90Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.E8, false));
        p90Var.setLinkTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.gc, false));
        p90Var.setEllipsize(TextUtils.TruncateAt.END);
        p90Var.setSingleLine();
        p90Var.setLines(1);
        p90Var.setMaxLines(1);
        addView(p90Var, w7.y5.d(-1, -2.0f, 19, 12.0f, 0.0f, 12.0f, 0.0f));
        TLRPC.TL_channels_getMessageAuthor tL_channels_getMessageAuthor = new TLRPC.TL_channels_getMessageAuthor();
        tL_channels_getMessageAuthor.channel = MessagesController.getInstance(i10).getInputChannel(-messageObject.getDialogId());
        tL_channels_getMessageAuthor.f18372id = messageObject.getId();
        p90Var.setAlpha(0.0f);
        ConnectionsManager.getInstance(i10).sendRequest(tL_channels_getMessageAuthor, new ai.i8(this, i10, 6));
        setBackground(org.telegram.ui.ActionBar.h6.Y(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.I5, false), 6, 0));
        setEnabled(false);
    }
}
