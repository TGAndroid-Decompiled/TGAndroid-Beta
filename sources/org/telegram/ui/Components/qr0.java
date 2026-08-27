package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;

public final class qr0 extends org.telegram.ui.Cells.e7 {

    public final hu0 f31966h0;

    public qr0(hu0 hu0Var, Context context) {
        super(context);
        this.f31966h0 = hu0Var;
    }

    @Override
    public final boolean d(MessageObject messageObject) {
        boolean zIsVoice = messageObject.isVoice();
        hu0 hu0Var = this.f31966h0;
        if (zIsVoice || messageObject.isRoundVideo()) {
            boolean zPlayMessage = MediaController.getInstance().playMessage(messageObject);
            MediaController.getInstance().setVoiceMessagesPlaylist(zPlayMessage ? hu0Var.f29140p1[4].f34325a : null, false);
            return zPlayMessage;
        }
        if (messageObject.isMusic()) {
            return MediaController.getInstance().setPlaylist(hu0Var.f29140p1[4].f34325a, messageObject, hu0Var.Y0);
        }
        return false;
    }
}
