package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
public final class lu0 extends org.telegram.ui.Cells.j7 {
    public final int f28540l0;
    public final yl0 m0;

    public lu0(yl0 yl0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var, int i10) {
        super(context, 0, d6Var);
        this.f28540l0 = i10;
        this.m0 = yl0Var;
    }

    @Override
    public final boolean d(MessageObject messageObject) {
        ArrayList<MessageObject> arrayList;
        ArrayList<MessageObject> arrayList2;
        switch (this.f28540l0) {
            case 0:
                mu0 mu0Var = (mu0) this.m0;
                if (!messageObject.isVoice() && !messageObject.isRoundVideo()) {
                    if (!messageObject.isMusic()) {
                        return false;
                    }
                    return MediaController.getInstance().setPlaylist(mu0Var.d, messageObject, mu0Var.v.f30221c1);
                }
                boolean playMessage = MediaController.getInstance().playMessage(messageObject);
                MediaController mediaController = MediaController.getInstance();
                if (playMessage) {
                    arrayList = mu0Var.d;
                } else {
                    arrayList = null;
                }
                mediaController.setVoiceMessagesPlaylist(arrayList, false);
                if (messageObject.isRoundVideo()) {
                    MediaController.getInstance().setCurrentVideoVisible(false);
                }
                return playMessage;
            default:
                dv0 dv0Var = (dv0) this.m0;
                int i10 = dv0Var.d;
                qv0 qv0Var = dv0Var.f25883f;
                if (!messageObject.isVoice() && !messageObject.isRoundVideo()) {
                    if (!messageObject.isMusic()) {
                        return false;
                    }
                    return MediaController.getInstance().setPlaylist(qv0Var.f30259t1[i10].f26591a, messageObject, qv0Var.f30221c1);
                }
                boolean playMessage2 = MediaController.getInstance().playMessage(messageObject);
                MediaController mediaController2 = MediaController.getInstance();
                if (playMessage2) {
                    arrayList2 = qv0Var.f30259t1[i10].f26591a;
                } else {
                    arrayList2 = null;
                }
                mediaController2.setVoiceMessagesPlaylist(arrayList2, false);
                return playMessage2;
        }
    }
}
