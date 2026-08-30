package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class ii extends rh0 {
    public final xn e;

    public ii(xn xnVar, Context context, int i10, MessageObject messageObject) {
        super(context);
        this.e = xnVar;
        this.f38052a = null;
        if (!messageObject.isRoundVideo()) {
            messageObject.isVoice();
        }
        org.telegram.ui.Components.t00 t00Var = new org.telegram.ui.Components.t00(context, null);
        this.f38054c = t00Var;
        t00Var.f(org.telegram.ui.ActionBar.j6.G8, org.telegram.ui.ActionBar.j6.f19996i6, -1);
        t00Var.setViewType(13);
        t00Var.setIsSingleCell(false);
        addView(t00Var, k7.b6.c(-1.0f, -2));
        org.telegram.ui.Components.e90 e90Var = new org.telegram.ui.Components.e90(context, null);
        this.f38053b = e90Var;
        e90Var.setTextSize(1, 14.0f);
        e90Var.setGravity(19);
        e90Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.E8, false));
        e90Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19966gc, false));
        e90Var.setEllipsize(TextUtils.TruncateAt.END);
        e90Var.setSingleLine();
        e90Var.setLines(1);
        e90Var.setMaxLines(1);
        addView(e90Var, k7.b6.d(-1, -2.0f, 19, 12.0f, 0.0f, 12.0f, 0.0f));
        TLRPC.TL_channels_getMessageAuthor tL_channels_getMessageAuthor = new TLRPC.TL_channels_getMessageAuthor();
        tL_channels_getMessageAuthor.channel = MessagesController.getInstance(i10).getInputChannel(-messageObject.getDialogId());
        tL_channels_getMessageAuthor.f19221id = messageObject.getId();
        e90Var.setAlpha(0.0f);
        ConnectionsManager.getInstance(i10).sendRequest(tL_channels_getMessageAuthor, new lh.s1(this, i10, 7));
        setBackground(org.telegram.ui.ActionBar.j6.Y(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.I5, false), 6, 0));
        setEnabled(false);
    }
}
