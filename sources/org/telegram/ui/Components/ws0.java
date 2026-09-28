package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
public final class ws0 extends org.telegram.ui.Cells.j7 {
    public final lv0 f30171l0;

    public ws0(lv0 lv0Var, Context context) {
        super(context);
        this.f30171l0 = lv0Var;
    }

    @Override
    public final boolean d(MessageObject messageObject) {
        ArrayList<MessageObject> arrayList;
        boolean isVoice = messageObject.isVoice();
        lv0 lv0Var = this.f30171l0;
        if (!isVoice && !messageObject.isRoundVideo()) {
            if (!messageObject.isMusic()) {
                return false;
            }
            return MediaController.getInstance().setPlaylist(lv0Var.f26155t1[4].f22730a, messageObject, lv0Var.f26118c1);
        }
        boolean playMessage = MediaController.getInstance().playMessage(messageObject);
        MediaController mediaController = MediaController.getInstance();
        if (playMessage) {
            arrayList = lv0Var.f26155t1[4].f22730a;
        } else {
            arrayList = null;
        }
        mediaController.setVoiceMessagesPlaylist(arrayList, false);
        return playMessage;
    }
}
