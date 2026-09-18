package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
public final class fu0 extends org.telegram.ui.Cells.j7 {
    public final int f24234l0;
    public final vl0 m0;

    public fu0(vl0 vl0Var, Context context, org.telegram.ui.ActionBar.e6 e6Var, int i10) {
        super(context, 0, e6Var);
        this.f24234l0 = i10;
        this.m0 = vl0Var;
    }

    @Override
    public final boolean d(MessageObject messageObject) {
        ArrayList<MessageObject> arrayList;
        ArrayList<MessageObject> arrayList2;
        switch (this.f24234l0) {
            case 0:
                gu0 gu0Var = (gu0) this.m0;
                if (!messageObject.isVoice() && !messageObject.isRoundVideo()) {
                    if (!messageObject.isMusic()) {
                        return false;
                    }
                    return MediaController.getInstance().setPlaylist(gu0Var.d, messageObject, gu0Var.v.f25807c1);
                }
                boolean playMessage = MediaController.getInstance().playMessage(messageObject);
                MediaController mediaController = MediaController.getInstance();
                if (playMessage) {
                    arrayList = gu0Var.d;
                } else {
                    arrayList = null;
                }
                mediaController.setVoiceMessagesPlaylist(arrayList, false);
                if (messageObject.isRoundVideo()) {
                    MediaController.getInstance().setCurrentVideoVisible(false);
                }
                return playMessage;
            default:
                xu0 xu0Var = (xu0) this.m0;
                int i10 = xu0Var.d;
                kv0 kv0Var = xu0Var.f30382f;
                if (!messageObject.isVoice() && !messageObject.isRoundVideo()) {
                    if (!messageObject.isMusic()) {
                        return false;
                    }
                    return MediaController.getInstance().setPlaylist(kv0Var.f25844t1[i10].f30877a, messageObject, kv0Var.f25807c1);
                }
                boolean playMessage2 = MediaController.getInstance().playMessage(messageObject);
                MediaController mediaController2 = MediaController.getInstance();
                if (playMessage2) {
                    arrayList2 = kv0Var.f25844t1[i10].f30877a;
                } else {
                    arrayList2 = null;
                }
                mediaController2.setVoiceMessagesPlaylist(arrayList2, false);
                return playMessage2;
        }
    }
}
