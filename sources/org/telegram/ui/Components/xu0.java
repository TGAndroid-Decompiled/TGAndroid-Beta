package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
public final class xu0 extends org.telegram.ui.Cells.j7 {
    public final int f33033l0;
    public final qm0 m0;

    public xu0(qm0 qm0Var, Context context, org.telegram.ui.ActionBar.e6 e6Var, int i10) {
        super(context, 0, e6Var);
        this.f33033l0 = i10;
        this.m0 = qm0Var;
    }

    @Override
    public final boolean d(MessageObject messageObject) {
        ArrayList<MessageObject> arrayList;
        ArrayList<MessageObject> arrayList2;
        switch (this.f33033l0) {
            case 0:
                yu0 yu0Var = (yu0) this.m0;
                if (!messageObject.isVoice() && !messageObject.isRoundVideo()) {
                    if (!messageObject.isMusic()) {
                        return false;
                    }
                    return MediaController.getInstance().setPlaylist(yu0Var.d, messageObject, yu0Var.v.f25432c1);
                }
                boolean playMessage = MediaController.getInstance().playMessage(messageObject);
                MediaController mediaController = MediaController.getInstance();
                if (playMessage) {
                    arrayList = yu0Var.d;
                } else {
                    arrayList = null;
                }
                mediaController.setVoiceMessagesPlaylist(arrayList, false);
                if (messageObject.isRoundVideo()) {
                    MediaController.getInstance().setCurrentVideoVisible(false);
                }
                return playMessage;
            default:
                pv0 pv0Var = (pv0) this.m0;
                int i10 = pv0Var.d;
                cw0 cw0Var = pv0Var.f29869f;
                if (!messageObject.isVoice() && !messageObject.isRoundVideo()) {
                    if (!messageObject.isMusic()) {
                        return false;
                    }
                    return MediaController.getInstance().setPlaylist(cw0Var.f25470t1[i10].f30578a, messageObject, cw0Var.f25432c1);
                }
                boolean playMessage2 = MediaController.getInstance().playMessage(messageObject);
                MediaController mediaController2 = MediaController.getInstance();
                if (playMessage2) {
                    arrayList2 = cw0Var.f25470t1[i10].f30578a;
                } else {
                    arrayList2 = null;
                }
                mediaController2.setVoiceMessagesPlaylist(arrayList2, false);
                return playMessage2;
        }
    }
}
