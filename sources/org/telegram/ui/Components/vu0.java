package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
public final class vu0 extends org.telegram.ui.Cells.n7 {
    public final int f34263l0;
    public final lm0 m0;

    public vu0(lm0 lm0Var, Context context, org.telegram.ui.ActionBar.u6 u6Var, int i10) {
        super(context, 0, u6Var);
        this.f34263l0 = i10;
        this.m0 = lm0Var;
    }

    @Override
    public final boolean d(MessageObject messageObject) {
        ArrayList<MessageObject> arrayList;
        ArrayList<MessageObject> arrayList2;
        switch (this.f34263l0) {
            case 0:
                wu0 wu0Var = (wu0) this.m0;
                if (!messageObject.isVoice() && !messageObject.isRoundVideo()) {
                    if (!messageObject.isMusic()) {
                        return false;
                    }
                    return MediaController.getInstance().setPlaylist(wu0Var.d, messageObject, wu0Var.v.f26651e1);
                }
                boolean playMessage = MediaController.getInstance().playMessage(messageObject);
                MediaController mediaController = MediaController.getInstance();
                if (playMessage) {
                    arrayList = wu0Var.d;
                } else {
                    arrayList = null;
                }
                mediaController.setVoiceMessagesPlaylist(arrayList, false);
                if (messageObject.isRoundVideo()) {
                    MediaController.getInstance().setCurrentVideoVisible(false);
                }
                return playMessage;
            default:
                nv0 nv0Var = (nv0) this.m0;
                int i10 = nv0Var.d;
                aw0 aw0Var = nv0Var.f31085f;
                if (!messageObject.isVoice() && !messageObject.isRoundVideo()) {
                    if (!messageObject.isMusic()) {
                        return false;
                    }
                    return MediaController.getInstance().setPlaylist(aw0Var.f26698v1[i10].f31706a, messageObject, aw0Var.f26651e1);
                }
                boolean playMessage2 = MediaController.getInstance().playMessage(messageObject);
                MediaController mediaController2 = MediaController.getInstance();
                if (playMessage2) {
                    arrayList2 = aw0Var.f26698v1[i10].f31706a;
                } else {
                    arrayList2 = null;
                }
                mediaController2.setVoiceMessagesPlaylist(arrayList2, false);
                return playMessage2;
        }
    }
}
