package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
public final class qt0 extends org.telegram.ui.Cells.n7 {
    public final aw0 f32023l0;

    public qt0(aw0 aw0Var, Context context) {
        super(context);
        this.f32023l0 = aw0Var;
    }

    @Override
    public final boolean d(MessageObject messageObject) {
        ArrayList<MessageObject> arrayList;
        boolean isVoice = messageObject.isVoice();
        aw0 aw0Var = this.f32023l0;
        if (!isVoice && !messageObject.isRoundVideo()) {
            if (!messageObject.isMusic()) {
                return false;
            }
            return MediaController.getInstance().setPlaylist(aw0Var.f26696v1[4].f31704a, messageObject, aw0Var.f26649e1);
        }
        boolean playMessage = MediaController.getInstance().playMessage(messageObject);
        MediaController mediaController = MediaController.getInstance();
        if (playMessage) {
            arrayList = aw0Var.f26696v1[4].f31704a;
        } else {
            arrayList = null;
        }
        mediaController.setVoiceMessagesPlaylist(arrayList, false);
        return playMessage;
    }
}
