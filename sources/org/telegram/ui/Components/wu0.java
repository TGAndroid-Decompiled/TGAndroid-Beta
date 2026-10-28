package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
public final class wu0 extends org.telegram.ui.Cells.n7 {
    public final int f34576l0;
    public final mm0 m0;

    public wu0(mm0 mm0Var, Context context, org.telegram.ui.ActionBar.u6 u6Var, int i10) {
        super(context, 0, u6Var);
        this.f34576l0 = i10;
        this.m0 = mm0Var;
    }

    @Override
    public final boolean d(MessageObject messageObject) {
        ArrayList<MessageObject> arrayList;
        ArrayList<MessageObject> arrayList2;
        switch (this.f34576l0) {
            case 0:
                xu0 xu0Var = (xu0) this.m0;
                if (!messageObject.isVoice() && !messageObject.isRoundVideo()) {
                    if (!messageObject.isMusic()) {
                        return false;
                    }
                    return MediaController.getInstance().setPlaylist(xu0Var.d, messageObject, xu0Var.v.f26939e1);
                }
                boolean playMessage = MediaController.getInstance().playMessage(messageObject);
                MediaController mediaController = MediaController.getInstance();
                if (playMessage) {
                    arrayList = xu0Var.d;
                } else {
                    arrayList = null;
                }
                mediaController.setVoiceMessagesPlaylist(arrayList, false);
                if (messageObject.isRoundVideo()) {
                    MediaController.getInstance().setCurrentVideoVisible(false);
                }
                return playMessage;
            default:
                ov0 ov0Var = (ov0) this.m0;
                int i10 = ov0Var.d;
                bw0 bw0Var = ov0Var.f31392f;
                if (!messageObject.isVoice() && !messageObject.isRoundVideo()) {
                    if (!messageObject.isMusic()) {
                        return false;
                    }
                    return MediaController.getInstance().setPlaylist(bw0Var.f26986v1[i10].f32033a, messageObject, bw0Var.f26939e1);
                }
                boolean playMessage2 = MediaController.getInstance().playMessage(messageObject);
                MediaController mediaController2 = MediaController.getInstance();
                if (playMessage2) {
                    arrayList2 = bw0Var.f26986v1[i10].f32033a;
                } else {
                    arrayList2 = null;
                }
                mediaController2.setVoiceMessagesPlaylist(arrayList2, false);
                return playMessage2;
        }
    }
}
