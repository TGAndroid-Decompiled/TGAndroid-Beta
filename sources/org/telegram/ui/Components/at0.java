package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
public final class at0 extends org.telegram.ui.Cells.j7 {
    public final pv0 f24662l0;

    public at0(pv0 pv0Var, Context context) {
        super(context);
        this.f24662l0 = pv0Var;
    }

    @Override
    public final boolean d(MessageObject messageObject) {
        ArrayList<MessageObject> arrayList;
        boolean isVoice = messageObject.isVoice();
        pv0 pv0Var = this.f24662l0;
        if (!isVoice && !messageObject.isRoundVideo()) {
            if (!messageObject.isMusic()) {
                return false;
            }
            return MediaController.getInstance().setPlaylist(pv0Var.f29802t1[4].f26144a, messageObject, pv0Var.f29764c1);
        }
        boolean playMessage = MediaController.getInstance().playMessage(messageObject);
        MediaController mediaController = MediaController.getInstance();
        if (playMessage) {
            arrayList = pv0Var.f29802t1[4].f26144a;
        } else {
            arrayList = null;
        }
        mediaController.setVoiceMessagesPlaylist(arrayList, false);
        return playMessage;
    }
}
