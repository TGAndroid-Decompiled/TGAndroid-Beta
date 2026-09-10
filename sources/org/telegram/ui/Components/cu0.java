package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
public final class cu0 extends org.telegram.ui.Cells.k7 {
    public final int f22226l0;
    public final ul0 m0;

    public cu0(ul0 ul0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var, int i10) {
        super(context, 0, f6Var);
        this.f22226l0 = i10;
        this.m0 = ul0Var;
    }

    @Override
    public final boolean d(MessageObject messageObject) {
        ArrayList<MessageObject> arrayList;
        ArrayList<MessageObject> arrayList2;
        switch (this.f22226l0) {
            case 0:
                du0 du0Var = (du0) this.m0;
                if (!messageObject.isVoice() && !messageObject.isRoundVideo()) {
                    if (!messageObject.isMusic()) {
                        return false;
                    }
                    return MediaController.getInstance().setPlaylist(du0Var.d, messageObject, du0Var.v.f24090c1);
                }
                boolean playMessage = MediaController.getInstance().playMessage(messageObject);
                MediaController mediaController = MediaController.getInstance();
                if (playMessage) {
                    arrayList = du0Var.d;
                } else {
                    arrayList = null;
                }
                mediaController.setVoiceMessagesPlaylist(arrayList, false);
                if (messageObject.isRoundVideo()) {
                    MediaController.getInstance().setCurrentVideoVisible(false);
                }
                return playMessage;
            default:
                vu0 vu0Var = (vu0) this.m0;
                int i10 = vu0Var.d;
                iv0 iv0Var = vu0Var.f28600f;
                if (!messageObject.isVoice() && !messageObject.isRoundVideo()) {
                    if (!messageObject.isMusic()) {
                        return false;
                    }
                    return MediaController.getInstance().setPlaylist(iv0Var.f24127t1[i10].f29156a, messageObject, iv0Var.f24090c1);
                }
                boolean playMessage2 = MediaController.getInstance().playMessage(messageObject);
                MediaController mediaController2 = MediaController.getInstance();
                if (playMessage2) {
                    arrayList2 = iv0Var.f24127t1[i10].f29156a;
                } else {
                    arrayList2 = null;
                }
                mediaController2.setVoiceMessagesPlaylist(arrayList2, false);
                return playMessage2;
        }
    }
}
