package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
public final class hu0 extends org.telegram.ui.Cells.j7 {
    public final int f24944l0;
    public final yl0 m0;

    public hu0(yl0 yl0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var, int i10) {
        super(context, 0, d6Var);
        this.f24944l0 = i10;
        this.m0 = yl0Var;
    }

    @Override
    public final boolean d(MessageObject messageObject) {
        ArrayList<MessageObject> arrayList;
        ArrayList<MessageObject> arrayList2;
        switch (this.f24944l0) {
            case 0:
                iu0 iu0Var = (iu0) this.m0;
                if (!messageObject.isVoice() && !messageObject.isRoundVideo()) {
                    if (!messageObject.isMusic()) {
                        return false;
                    }
                    return MediaController.getInstance().setPlaylist(iu0Var.d, messageObject, iu0Var.v.f26408c1);
                }
                boolean playMessage = MediaController.getInstance().playMessage(messageObject);
                MediaController mediaController = MediaController.getInstance();
                if (playMessage) {
                    arrayList = iu0Var.d;
                } else {
                    arrayList = null;
                }
                mediaController.setVoiceMessagesPlaylist(arrayList, false);
                if (messageObject.isRoundVideo()) {
                    MediaController.getInstance().setCurrentVideoVisible(false);
                }
                return playMessage;
            default:
                zu0 zu0Var = (zu0) this.m0;
                int i10 = zu0Var.d;
                mv0 mv0Var = zu0Var.f31074f;
                if (!messageObject.isVoice() && !messageObject.isRoundVideo()) {
                    if (!messageObject.isMusic()) {
                        return false;
                    }
                    return MediaController.getInstance().setPlaylist(mv0Var.f26445t1[i10].f23015a, messageObject, mv0Var.f26408c1);
                }
                boolean playMessage2 = MediaController.getInstance().playMessage(messageObject);
                MediaController mediaController2 = MediaController.getInstance();
                if (playMessage2) {
                    arrayList2 = mv0Var.f26445t1[i10].f23015a;
                } else {
                    arrayList2 = null;
                }
                mediaController2.setVoiceMessagesPlaylist(arrayList2, false);
                return playMessage2;
        }
    }
}
