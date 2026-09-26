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
        this.f38479a = null;
        if (!messageObject.isRoundVideo()) {
            messageObject.isVoice();
        }
        org.telegram.ui.Components.v00 v00Var = new org.telegram.ui.Components.v00(context, null);
        this.f38481c = v00Var;
        v00Var.f(org.telegram.ui.ActionBar.h6.G8, org.telegram.ui.ActionBar.h6.f19148i6, -1);
        v00Var.setViewType(13);
        v00Var.setIsSingleCell(false);
        addView(v00Var, w7.y5.c(-1.0f, -2));
        org.telegram.ui.Components.o90 o90Var = new org.telegram.ui.Components.o90(context, null);
        this.f38480b = o90Var;
        o90Var.setTextSize(1, 14.0f);
        o90Var.setGravity(19);
        o90Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.E8, false));
        o90Var.setLinkTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.gc, false));
        o90Var.setEllipsize(TextUtils.TruncateAt.END);
        o90Var.setSingleLine();
        o90Var.setLines(1);
        o90Var.setMaxLines(1);
        addView(o90Var, w7.y5.d(-1, -2.0f, 19, 12.0f, 0.0f, 12.0f, 0.0f));
        TLRPC.TL_channels_getMessageAuthor tL_channels_getMessageAuthor = new TLRPC.TL_channels_getMessageAuthor();
        tL_channels_getMessageAuthor.channel = MessagesController.getInstance(i10).getInputChannel(-messageObject.getDialogId());
        tL_channels_getMessageAuthor.f18372id = messageObject.getId();
        o90Var.setAlpha(0.0f);
        ConnectionsManager.getInstance(i10).sendRequest(tL_channels_getMessageAuthor, new ai.i8(this, i10, 6));
        setBackground(org.telegram.ui.ActionBar.h6.Y(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.I5, false), 6, 0));
        setEnabled(false);
    }
}
