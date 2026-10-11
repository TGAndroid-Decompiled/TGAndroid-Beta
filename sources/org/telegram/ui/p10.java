package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
public final class p10 extends org.telegram.ui.Cells.j7 {
    public final q10 f40717l0;

    public p10(q10 q10Var, Context context) {
        super(context, 1, null);
        this.f40717l0 = q10Var;
    }

    @Override
    public final boolean d(MessageObject messageObject) {
        ArrayList<MessageObject> arrayList;
        boolean isVoice = messageObject.isVoice();
        q10 q10Var = this.f40717l0;
        if (!isVoice && !messageObject.isRoundVideo()) {
            if (!messageObject.isMusic()) {
                return false;
            }
            v10 v10Var = q10Var.v;
            String str = v10Var.Q;
            long j3 = v10Var.E;
            long j10 = v10Var.H;
            MediaController.PlaylistGlobalSearchParams playlistGlobalSearchParams = new MediaController.PlaylistGlobalSearchParams(str, j3, j10, j10, v10Var.f42889y);
            v10 v10Var2 = q10Var.v;
            playlistGlobalSearchParams.endReached = v10Var2.N;
            playlistGlobalSearchParams.nextSearchRate = v10Var2.v;
            playlistGlobalSearchParams.totalCount = v10Var2.O;
            playlistGlobalSearchParams.folderId = v10Var2.J ? 1 : 0;
            return MediaController.getInstance().setPlaylist(q10Var.v.f42871f, messageObject, 0L, playlistGlobalSearchParams);
        }
        boolean playMessage = MediaController.getInstance().playMessage(messageObject);
        MediaController mediaController = MediaController.getInstance();
        if (playMessage) {
            arrayList = q10Var.v.f42871f;
        } else {
            arrayList = null;
        }
        mediaController.setVoiceMessagesPlaylist(arrayList, false);
        return playMessage;
    }
}
