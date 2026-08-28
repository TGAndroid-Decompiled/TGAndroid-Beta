package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
public final class zs0 extends org.telegram.ui.Cells.h7 {
    public final int f35373h0;
    public final vk0 f35374i0;

    public zs0(vk0 vk0Var, Context context, org.telegram.ui.ActionBar.b6 b6Var, int i9) {
        super(context, 0, b6Var);
        this.f35373h0 = i9;
        this.f35374i0 = vk0Var;
    }

    @Override
    public final boolean d(MessageObject messageObject) {
        ArrayList<MessageObject> arrayList;
        ArrayList<MessageObject> arrayList2;
        switch (this.f35373h0) {
            case 0:
                at0 at0Var = (at0) this.f35374i0;
                if (!messageObject.isVoice() && !messageObject.isRoundVideo()) {
                    if (!messageObject.isMusic()) {
                        return false;
                    }
                    return MediaController.getInstance().setPlaylist(at0Var.d, messageObject, at0Var.v.Y0);
                }
                boolean playMessage = MediaController.getInstance().playMessage(messageObject);
                MediaController mediaController = MediaController.getInstance();
                if (playMessage) {
                    arrayList = at0Var.d;
                } else {
                    arrayList = null;
                }
                mediaController.setVoiceMessagesPlaylist(arrayList, false);
                if (messageObject.isRoundVideo()) {
                    MediaController.getInstance().setCurrentVideoVisible(false);
                }
                return playMessage;
            default:
                rt0 rt0Var = (rt0) this.f35374i0;
                int i9 = rt0Var.d;
                eu0 eu0Var = rt0Var.f32288f;
                if (!messageObject.isVoice() && !messageObject.isRoundVideo()) {
                    if (!messageObject.isMusic()) {
                        return false;
                    }
                    return MediaController.getInstance().setPlaylist(eu0Var.f28155p1[i9].f32788a, messageObject, eu0Var.Y0);
                }
                boolean playMessage2 = MediaController.getInstance().playMessage(messageObject);
                MediaController mediaController2 = MediaController.getInstance();
                if (playMessage2) {
                    arrayList2 = eu0Var.f28155p1[i9].f32788a;
                } else {
                    arrayList2 = null;
                }
                mediaController2.setVoiceMessagesPlaylist(arrayList2, false);
                return playMessage2;
        }
    }
}
