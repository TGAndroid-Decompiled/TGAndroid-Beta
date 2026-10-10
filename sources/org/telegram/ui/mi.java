package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class mi extends ci0 {
    public final zn f39971e;

    public mi(zn znVar, Context context, int i10, MessageObject messageObject) {
        super(context);
        this.f39971e = znVar;
        this.f36726a = null;
        if (!messageObject.isRoundVideo()) {
            messageObject.isVoice();
        }
        org.telegram.ui.Components.k10 k10Var = new org.telegram.ui.Components.k10(context, null);
        this.f36728c = k10Var;
        k10Var.f(org.telegram.ui.ActionBar.i6.G8, org.telegram.ui.ActionBar.i6.f20892i6, -1);
        k10Var.setViewType(13);
        k10Var.setIsSingleCell(false);
        addView(k10Var, w7.x5.d(-1.0f, -2));
        org.telegram.ui.Components.fa0 fa0Var = new org.telegram.ui.Components.fa0(context, null);
        this.f36727b = fa0Var;
        fa0Var.setTextSize(1, 14.0f);
        fa0Var.setGravity(19);
        fa0Var.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.E8, false));
        fa0Var.setLinkTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.gc, false));
        fa0Var.setEllipsize(TextUtils.TruncateAt.END);
        fa0Var.setSingleLine();
        fa0Var.setLines(1);
        fa0Var.setMaxLines(1);
        addView(fa0Var, w7.x5.a(-2.0f, 12.0f, 0.0f, 12.0f, 0.0f, -1, 19));
        TLRPC.TL_channels_getMessageAuthor tL_channels_getMessageAuthor = new TLRPC.TL_channels_getMessageAuthor();
        tL_channels_getMessageAuthor.channel = MessagesController.getInstance(i10).getInputChannel(-messageObject.getDialogId());
        tL_channels_getMessageAuthor.f20079id = messageObject.getId();
        fa0Var.setAlpha(0.0f);
        ConnectionsManager.getInstance(i10).sendRequest(tL_channels_getMessageAuthor, new ai.j8(this, i10, 6));
        setBackground(org.telegram.ui.ActionBar.i6.Z(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.I5, false), 6, 0));
        setEnabled(false);
    }
}
