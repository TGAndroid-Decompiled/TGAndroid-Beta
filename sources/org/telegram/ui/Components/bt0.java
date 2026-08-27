package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;

public final class bt0 extends org.telegram.ui.Cells.e7 {

    public final int f27210h0;

    public final yk0 f27211i0;

    public bt0(yk0 yk0Var, Context context, org.telegram.ui.ActionBar.c6 c6Var, int i10) {
        super(context, 0, c6Var);
        this.f27210h0 = i10;
        this.f27211i0 = yk0Var;
    }

    @Override
    public final boolean d(MessageObject messageObject) {
        switch (this.f27210h0) {
            case 0:
                ct0 ct0Var = (ct0) this.f27211i0;
                if (!messageObject.isVoice() && !messageObject.isRoundVideo()) {
                    if (messageObject.isMusic()) {
                        return MediaController.getInstance().setPlaylist(ct0Var.d, messageObject, ct0Var.v.Y0);
                    }
                    return false;
                }
                boolean zPlayMessage = MediaController.getInstance().playMessage(messageObject);
                MediaController.getInstance().setVoiceMessagesPlaylist(zPlayMessage ? ct0Var.d : null, false);
                if (messageObject.isRoundVideo()) {
                    MediaController.getInstance().setCurrentVideoVisible(false);
                }
                return zPlayMessage;
            default:
                ut0 ut0Var = (ut0) this.f27211i0;
                int i10 = ut0Var.d;
                hu0 hu0Var = ut0Var.f33211f;
                if (messageObject.isVoice() || messageObject.isRoundVideo()) {
                    boolean zPlayMessage2 = MediaController.getInstance().playMessage(messageObject);
                    MediaController.getInstance().setVoiceMessagesPlaylist(zPlayMessage2 ? hu0Var.f29140p1[i10].f34325a : null, false);
                    return zPlayMessage2;
                }
                if (messageObject.isMusic()) {
                    return MediaController.getInstance().setPlaylist(hu0Var.f29140p1[i10].f34325a, messageObject, hu0Var.Y0);
                }
                return false;
        }
    }
}
