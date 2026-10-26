package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class ei extends mh0 {
    public final un f39113f;

    public ei(un unVar, Context context, int i10, MessageObject messageObject) {
        super(context);
        this.f39113f = unVar;
        this.f41564a = null;
        if (!messageObject.isRoundVideo()) {
            messageObject.isVoice();
        }
        org.telegram.ui.Components.c10 c10Var = new org.telegram.ui.Components.c10(context, null);
        this.f41566c = c10Var;
        c10Var.e(org.telegram.ui.ActionBar.y6.G8, org.telegram.ui.ActionBar.y6.f23448i6, -1);
        c10Var.setViewType(13);
        c10Var.setIsSingleCell(false);
        addView(c10Var, org.telegram.ui.Components.gb1.g(-1.0f, -2));
        org.telegram.ui.Components.z90 z90Var = new org.telegram.ui.Components.z90(context, null);
        this.f41565b = z90Var;
        z90Var.setTextSize(1, 14.0f);
        z90Var.setGravity(19);
        org.telegram.ui.ActionBar.f7.V(z90Var, org.telegram.ui.ActionBar.y6.E8, null);
        org.telegram.ui.ActionBar.f7.H(z90Var, org.telegram.ui.ActionBar.y6.gc, null);
        z90Var.setEllipsize(TextUtils.TruncateAt.END);
        z90Var.setSingleLine();
        z90Var.setLines(1);
        z90Var.setMaxLines(1);
        addView(z90Var, org.telegram.ui.Components.gb1.h(-1, -2.0f, 19, 12.0f, 0.0f, 12.0f, 0.0f));
        TLRPC.TL_channels_getMessageAuthor tL_channels_getMessageAuthor = new TLRPC.TL_channels_getMessageAuthor();
        tL_channels_getMessageAuthor.channel = MessagesController.getInstance(i10).getInputChannel(-messageObject.getDialogId());
        tL_channels_getMessageAuthor.f22064id = messageObject.getId();
        z90Var.setAlpha(0.0f);
        ConnectionsManager.getInstance(i10).sendRequest(tL_channels_getMessageAuthor, new bi.l2(this, i10, 8));
        setBackground(org.telegram.ui.ActionBar.y6.Z(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.I5, false), 6, 0));
        setEnabled(false);
    }
}
