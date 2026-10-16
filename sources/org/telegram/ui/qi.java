package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class qi extends fi0 {
    public final fo e;

    public qi(fo foVar, Context context, int i10, MessageObject messageObject) {
        super(context);
        this.e = foVar;
        this.f35541a = null;
        if (!messageObject.isRoundVideo()) {
            messageObject.isVoice();
        }
        org.telegram.ui.Components.f10 f10Var = new org.telegram.ui.Components.f10(context, null);
        this.f35543c = f10Var;
        f10Var.f(org.telegram.ui.ActionBar.g6.G8, org.telegram.ui.ActionBar.g6.f19690i6, -1);
        f10Var.setViewType(13);
        f10Var.setIsSingleCell(false);
        addView(f10Var, w7.z5.d(-1.0f, -2));
        org.telegram.ui.Components.da0 da0Var = new org.telegram.ui.Components.da0(context, null);
        this.f35542b = da0Var;
        da0Var.setTextSize(1, 14.0f);
        da0Var.setGravity(19);
        da0Var.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.E8, false));
        da0Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19660gc, false));
        da0Var.setEllipsize(TextUtils.TruncateAt.END);
        da0Var.setSingleLine();
        da0Var.setLines(1);
        da0Var.setMaxLines(1);
        addView(da0Var, w7.z5.a(-2.0f, 12.0f, 0.0f, 12.0f, 0.0f, -1, 19));
        TLRPC.TL_channels_getMessageAuthor tL_channels_getMessageAuthor = new TLRPC.TL_channels_getMessageAuthor();
        tL_channels_getMessageAuthor.channel = MessagesController.getInstance(i10).getInputChannel(-messageObject.getDialogId());
        tL_channels_getMessageAuthor.f18953id = messageObject.getId();
        da0Var.setAlpha(0.0f);
        ConnectionsManager.getInstance(i10).sendRequest(tL_channels_getMessageAuthor, new bi.u7(this, i10, 6));
        setBackground(org.telegram.ui.ActionBar.g6.Z(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.I5, false), 6, 0));
        setEnabled(false);
    }
}
