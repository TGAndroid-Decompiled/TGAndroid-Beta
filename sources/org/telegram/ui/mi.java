package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class mi extends bi0 {
    public final zn f39985e;

    public mi(zn znVar, Context context, int i10, MessageObject messageObject) {
        super(context);
        this.f39985e = znVar;
        this.f36430a = null;
        if (!messageObject.isRoundVideo()) {
            messageObject.isVoice();
        }
        org.telegram.ui.Components.k10 k10Var = new org.telegram.ui.Components.k10(context, null);
        this.f36432c = k10Var;
        k10Var.f(org.telegram.ui.ActionBar.h6.G8, org.telegram.ui.ActionBar.h6.f20913i6, -1);
        k10Var.setViewType(13);
        k10Var.setIsSingleCell(false);
        addView(k10Var, w7.x5.d(-1.0f, -2));
        org.telegram.ui.Components.ea0 ea0Var = new org.telegram.ui.Components.ea0(context, null);
        this.f36431b = ea0Var;
        ea0Var.setTextSize(1, 14.0f);
        ea0Var.setGravity(19);
        ea0Var.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.E8, false));
        ea0Var.setLinkTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.gc, false));
        ea0Var.setEllipsize(TextUtils.TruncateAt.END);
        ea0Var.setSingleLine();
        ea0Var.setLines(1);
        ea0Var.setMaxLines(1);
        addView(ea0Var, w7.x5.a(-2.0f, 12.0f, 0.0f, 12.0f, 0.0f, -1, 19));
        TLRPC.TL_channels_getMessageAuthor tL_channels_getMessageAuthor = new TLRPC.TL_channels_getMessageAuthor();
        tL_channels_getMessageAuthor.channel = MessagesController.getInstance(i10).getInputChannel(-messageObject.getDialogId());
        tL_channels_getMessageAuthor.f20105id = messageObject.getId();
        ea0Var.setAlpha(0.0f);
        ConnectionsManager.getInstance(i10).sendRequest(tL_channels_getMessageAuthor, new ai.j8(this, i10, 6));
        setBackground(org.telegram.ui.ActionBar.h6.Z(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.I5, false), 6, 0));
        setEnabled(false);
    }
}
