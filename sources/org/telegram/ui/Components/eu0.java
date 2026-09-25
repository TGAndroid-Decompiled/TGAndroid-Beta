package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
public final class eu0 extends org.telegram.ui.Cells.j7 {
    public final int f23996l0;
    public final vl0 m0;

    public eu0(vl0 vl0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var, int i10) {
        super(context, 0, d6Var);
        this.f23996l0 = i10;
        this.m0 = vl0Var;
    }

    @Override
    public final boolean d(MessageObject messageObject) {
        ArrayList<MessageObject> arrayList;
        ArrayList<MessageObject> arrayList2;
        switch (this.f23996l0) {
            case 0:
                fu0 fu0Var = (fu0) this.m0;
                if (!messageObject.isVoice() && !messageObject.isRoundVideo()) {
                    if (!messageObject.isMusic()) {
                        return false;
                    }
                    return MediaController.getInstance().setPlaylist(fu0Var.d, messageObject, fu0Var.v.f25519c1);
                }
                boolean playMessage = MediaController.getInstance().playMessage(messageObject);
                MediaController mediaController = MediaController.getInstance();
                if (playMessage) {
                    arrayList = fu0Var.d;
                } else {
                    arrayList = null;
                }
                mediaController.setVoiceMessagesPlaylist(arrayList, false);
                if (messageObject.isRoundVideo()) {
                    MediaController.getInstance().setCurrentVideoVisible(false);
                }
                return playMessage;
            default:
                wu0 wu0Var = (wu0) this.m0;
                int i10 = wu0Var.d;
                jv0 jv0Var = wu0Var.f30194f;
                if (!messageObject.isVoice() && !messageObject.isRoundVideo()) {
                    if (!messageObject.isMusic()) {
                        return false;
                    }
                    return MediaController.getInstance().setPlaylist(jv0Var.f25556t1[i10].f30693a, messageObject, jv0Var.f25519c1);
                }
                boolean playMessage2 = MediaController.getInstance().playMessage(messageObject);
                MediaController mediaController2 = MediaController.getInstance();
                if (playMessage2) {
                    arrayList2 = jv0Var.f25556t1[i10].f30693a;
                } else {
                    arrayList2 = null;
                }
                mediaController2.setVoiceMessagesPlaylist(arrayList2, false);
                return playMessage2;
        }
    }
}
