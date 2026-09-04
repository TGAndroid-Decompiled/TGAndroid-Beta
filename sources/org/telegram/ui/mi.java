package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class mi extends bi0 {
    public final co f38715e;

    public mi(co coVar, Context context, int i10, MessageObject messageObject) {
        super(context);
        this.f38715e = coVar;
        this.f34811a = null;
        if (!messageObject.isRoundVideo()) {
            messageObject.isVoice();
        }
        org.telegram.ui.Components.t00 t00Var = new org.telegram.ui.Components.t00(context, null);
        this.f34813c = t00Var;
        t00Var.f(org.telegram.ui.ActionBar.j6.G8, org.telegram.ui.ActionBar.j6.f20753i6, -1);
        t00Var.setViewType(13);
        t00Var.setIsSingleCell(false);
        addView(t00Var, w7.x5.c(-1.0f, -2));
        org.telegram.ui.Components.d90 d90Var = new org.telegram.ui.Components.d90(context, null);
        this.f34812b = d90Var;
        d90Var.setTextSize(1, 14.0f);
        d90Var.setGravity(19);
        d90Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.E8, false));
        d90Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.gc, false));
        d90Var.setEllipsize(TextUtils.TruncateAt.END);
        d90Var.setSingleLine();
        d90Var.setLines(1);
        d90Var.setMaxLines(1);
        addView(d90Var, w7.x5.d(-1, -2.0f, 19, 12.0f, 0.0f, 12.0f, 0.0f));
        TLRPC.TL_channels_getMessageAuthor tL_channels_getMessageAuthor = new TLRPC.TL_channels_getMessageAuthor();
        tL_channels_getMessageAuthor.channel = MessagesController.getInstance(i10).getInputChannel(-messageObject.getDialogId());
        tL_channels_getMessageAuthor.f19906id = messageObject.getId();
        d90Var.setAlpha(0.0f);
        ConnectionsManager.getInstance(i10).sendRequest(tL_channels_getMessageAuthor, new bi.p7(this, i10, 6));
        setBackground(org.telegram.ui.ActionBar.j6.Y(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.I5, false), 6, 0));
        setEnabled(false);
    }
}
