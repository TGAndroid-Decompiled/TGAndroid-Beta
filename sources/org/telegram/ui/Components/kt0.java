package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
public final class kt0 extends org.telegram.ui.Cells.f7 {
    public final int f30147h0;
    public final il0 f30148i0;

    public kt0(il0 il0Var, Context context, org.telegram.ui.ActionBar.c6 c6Var, int i10) {
        super(context, 0, c6Var);
        this.f30147h0 = i10;
        this.f30148i0 = il0Var;
    }

    @Override
    public final boolean d(MessageObject messageObject) {
        ArrayList<MessageObject> arrayList;
        ArrayList<MessageObject> arrayList2;
        switch (this.f30147h0) {
            case 0:
                lt0 lt0Var = (lt0) this.f30148i0;
                if (!messageObject.isVoice() && !messageObject.isRoundVideo()) {
                    if (!messageObject.isMusic()) {
                        return false;
                    }
                    return MediaController.getInstance().setPlaylist(lt0Var.d, messageObject, lt0Var.v.Y0);
                }
                boolean playMessage = MediaController.getInstance().playMessage(messageObject);
                MediaController mediaController = MediaController.getInstance();
                if (playMessage) {
                    arrayList = lt0Var.d;
                } else {
                    arrayList = null;
                }
                mediaController.setVoiceMessagesPlaylist(arrayList, false);
                if (messageObject.isRoundVideo()) {
                    MediaController.getInstance().setCurrentVideoVisible(false);
                }
                return playMessage;
            default:
                du0 du0Var = (du0) this.f30148i0;
                int i10 = du0Var.d;
                qu0 qu0Var = du0Var.f27878f;
                if (!messageObject.isVoice() && !messageObject.isRoundVideo()) {
                    if (!messageObject.isMusic()) {
                        return false;
                    }
                    return MediaController.getInstance().setPlaylist(qu0Var.f32088p1[i10].f28534a, messageObject, qu0Var.Y0);
                }
                boolean playMessage2 = MediaController.getInstance().playMessage(messageObject);
                MediaController mediaController2 = MediaController.getInstance();
                if (playMessage2) {
                    arrayList2 = qu0Var.f32088p1[i10].f28534a;
                } else {
                    arrayList2 = null;
                }
                mediaController2.setVoiceMessagesPlaylist(arrayList2, false);
                return playMessage2;
        }
    }
}
