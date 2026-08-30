package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
public final class st0 extends org.telegram.ui.Cells.h7 {
    public final int f28816i0;
    public final rl0 f28817j0;

    public st0(rl0 rl0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var, int i10) {
        super(context, 0, f6Var);
        this.f28816i0 = i10;
        this.f28817j0 = rl0Var;
    }

    @Override
    public final boolean d(MessageObject messageObject) {
        ArrayList<MessageObject> arrayList;
        ArrayList<MessageObject> arrayList2;
        switch (this.f28816i0) {
            case 0:
                tt0 tt0Var = (tt0) this.f28817j0;
                if (!messageObject.isVoice() && !messageObject.isRoundVideo()) {
                    if (!messageObject.isMusic()) {
                        return false;
                    }
                    return MediaController.getInstance().setPlaylist(tt0Var.d, messageObject, tt0Var.v.Z0);
                }
                boolean playMessage = MediaController.getInstance().playMessage(messageObject);
                MediaController mediaController = MediaController.getInstance();
                if (playMessage) {
                    arrayList = tt0Var.d;
                } else {
                    arrayList = null;
                }
                mediaController.setVoiceMessagesPlaylist(arrayList, false);
                if (messageObject.isRoundVideo()) {
                    MediaController.getInstance().setCurrentVideoVisible(false);
                }
                return playMessage;
            default:
                lu0 lu0Var = (lu0) this.f28817j0;
                int i10 = lu0Var.d;
                yu0 yu0Var = lu0Var.f26888f;
                if (!messageObject.isVoice() && !messageObject.isRoundVideo()) {
                    if (!messageObject.isMusic()) {
                        return false;
                    }
                    return MediaController.getInstance().setPlaylist(yu0Var.f31138q1[i10].f27364a, messageObject, yu0Var.Z0);
                }
                boolean playMessage2 = MediaController.getInstance().playMessage(messageObject);
                MediaController mediaController2 = MediaController.getInstance();
                if (playMessage2) {
                    arrayList2 = yu0Var.f31138q1[i10].f27364a;
                } else {
                    arrayList2 = null;
                }
                mediaController2.setVoiceMessagesPlaylist(arrayList2, false);
                return playMessage2;
        }
    }
}
