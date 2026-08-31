package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
public final class tt0 extends org.telegram.ui.Cells.h7 {
    public final int f31453i0;
    public final sl0 f31454j0;

    public tt0(sl0 sl0Var, Context context, org.telegram.ui.ActionBar.g6 g6Var, int i10) {
        super(context, 0, g6Var);
        this.f31453i0 = i10;
        this.f31454j0 = sl0Var;
    }

    @Override
    public final boolean d(MessageObject messageObject) {
        ArrayList<MessageObject> arrayList;
        ArrayList<MessageObject> arrayList2;
        switch (this.f31453i0) {
            case 0:
                ut0 ut0Var = (ut0) this.f31454j0;
                if (!messageObject.isVoice() && !messageObject.isRoundVideo()) {
                    if (!messageObject.isMusic()) {
                        return false;
                    }
                    return MediaController.getInstance().setPlaylist(ut0Var.d, messageObject, ut0Var.v.Z0);
                }
                boolean playMessage = MediaController.getInstance().playMessage(messageObject);
                MediaController mediaController = MediaController.getInstance();
                if (playMessage) {
                    arrayList = ut0Var.d;
                } else {
                    arrayList = null;
                }
                mediaController.setVoiceMessagesPlaylist(arrayList, false);
                if (messageObject.isRoundVideo()) {
                    MediaController.getInstance().setCurrentVideoVisible(false);
                }
                return playMessage;
            default:
                mu0 mu0Var = (mu0) this.f31454j0;
                int i10 = mu0Var.d;
                zu0 zu0Var = mu0Var.f29251f;
                if (!messageObject.isVoice() && !messageObject.isRoundVideo()) {
                    if (!messageObject.isMusic()) {
                        return false;
                    }
                    return MediaController.getInstance().setPlaylist(zu0Var.f33998q1[i10].f29851a, messageObject, zu0Var.Z0);
                }
                boolean playMessage2 = MediaController.getInstance().playMessage(messageObject);
                MediaController mediaController2 = MediaController.getInstance();
                if (playMessage2) {
                    arrayList2 = zu0Var.f33998q1[i10].f29851a;
                } else {
                    arrayList2 = null;
                }
                mediaController2.setVoiceMessagesPlaylist(arrayList2, false);
                return playMessage2;
        }
    }
}
