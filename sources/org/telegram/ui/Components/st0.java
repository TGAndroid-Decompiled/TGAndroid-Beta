package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
public final class st0 extends org.telegram.ui.Cells.h7 {
    public final int f31175i0;
    public final rl0 f31176j0;

    public st0(rl0 rl0Var, Context context, org.telegram.ui.ActionBar.g6 g6Var, int i10) {
        super(context, 0, g6Var);
        this.f31175i0 = i10;
        this.f31176j0 = rl0Var;
    }

    @Override
    public final boolean d(MessageObject messageObject) {
        ArrayList<MessageObject> arrayList;
        ArrayList<MessageObject> arrayList2;
        switch (this.f31175i0) {
            case 0:
                tt0 tt0Var = (tt0) this.f31176j0;
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
                lu0 lu0Var = (lu0) this.f31176j0;
                int i10 = lu0Var.d;
                yu0 yu0Var = lu0Var.f28881f;
                if (!messageObject.isVoice() && !messageObject.isRoundVideo()) {
                    if (!messageObject.isMusic()) {
                        return false;
                    }
                    return MediaController.getInstance().setPlaylist(yu0Var.f33643q1[i10].f29580a, messageObject, yu0Var.Z0);
                }
                boolean playMessage2 = MediaController.getInstance().playMessage(messageObject);
                MediaController mediaController2 = MediaController.getInstance();
                if (playMessage2) {
                    arrayList2 = yu0Var.f33643q1[i10].f29580a;
                } else {
                    arrayList2 = null;
                }
                mediaController2.setVoiceMessagesPlaylist(arrayList2, false);
                return playMessage2;
        }
    }
}
