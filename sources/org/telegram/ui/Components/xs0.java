package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
public final class xs0 extends org.telegram.ui.Cells.j7 {
    public final mv0 f30499l0;

    public xs0(mv0 mv0Var, Context context) {
        super(context);
        this.f30499l0 = mv0Var;
    }

    @Override
    public final boolean d(MessageObject messageObject) {
        ArrayList<MessageObject> arrayList;
        boolean isVoice = messageObject.isVoice();
        mv0 mv0Var = this.f30499l0;
        if (!isVoice && !messageObject.isRoundVideo()) {
            if (!messageObject.isMusic()) {
                return false;
            }
            return MediaController.getInstance().setPlaylist(mv0Var.f26445t1[4].f23015a, messageObject, mv0Var.f26408c1);
        }
        boolean playMessage = MediaController.getInstance().playMessage(messageObject);
        MediaController mediaController = MediaController.getInstance();
        if (playMessage) {
            arrayList = mv0Var.f26445t1[4].f23015a;
        } else {
            arrayList = null;
        }
        mediaController.setVoiceMessagesPlaylist(arrayList, false);
        return playMessage;
    }
}
