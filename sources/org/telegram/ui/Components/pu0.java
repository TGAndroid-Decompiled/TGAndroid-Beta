package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
public final class pu0 extends org.telegram.ui.Cells.h7 {
    public final int f29395l0;
    public final im0 m0;

    public pu0(im0 im0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var, int i10) {
        super(context, 0, d6Var);
        this.f29395l0 = i10;
        this.m0 = im0Var;
    }

    @Override
    public final boolean d(MessageObject messageObject) {
        ArrayList<MessageObject> arrayList;
        ArrayList<MessageObject> arrayList2;
        switch (this.f29395l0) {
            case 0:
                qu0 qu0Var = (qu0) this.m0;
                if (!messageObject.isVoice() && !messageObject.isRoundVideo()) {
                    if (!messageObject.isMusic()) {
                        return false;
                    }
                    return MediaController.getInstance().setPlaylist(qu0Var.d, messageObject, qu0Var.v.f31030c1);
                }
                boolean playMessage = MediaController.getInstance().playMessage(messageObject);
                MediaController mediaController = MediaController.getInstance();
                if (playMessage) {
                    arrayList = qu0Var.d;
                } else {
                    arrayList = null;
                }
                mediaController.setVoiceMessagesPlaylist(arrayList, false);
                if (messageObject.isRoundVideo()) {
                    MediaController.getInstance().setCurrentVideoVisible(false);
                }
                return playMessage;
            default:
                hv0 hv0Var = (hv0) this.m0;
                int i10 = hv0Var.d;
                uv0 uv0Var = hv0Var.f27007f;
                if (!messageObject.isVoice() && !messageObject.isRoundVideo()) {
                    if (!messageObject.isMusic()) {
                        return false;
                    }
                    return MediaController.getInstance().setPlaylist(uv0Var.f31067t1[i10].f27641a, messageObject, uv0Var.f31030c1);
                }
                boolean playMessage2 = MediaController.getInstance().playMessage(messageObject);
                MediaController mediaController2 = MediaController.getInstance();
                if (playMessage2) {
                    arrayList2 = uv0Var.f31067t1[i10].f27641a;
                } else {
                    arrayList2 = null;
                }
                mediaController2.setVoiceMessagesPlaylist(arrayList2, false);
                return playMessage2;
        }
    }
}
