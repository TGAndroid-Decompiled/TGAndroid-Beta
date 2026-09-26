package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
public final class n10 extends org.telegram.ui.Cells.j7 {
    public final o10 f35722l0;

    public n10(o10 o10Var, Context context) {
        super(context, 1, null);
        this.f35722l0 = o10Var;
    }

    @Override
    public final boolean d(MessageObject messageObject) {
        ArrayList<MessageObject> arrayList;
        boolean isVoice = messageObject.isVoice();
        o10 o10Var = this.f35722l0;
        if (!isVoice && !messageObject.isRoundVideo()) {
            if (!messageObject.isMusic()) {
                return false;
            }
            t10 t10Var = o10Var.v;
            String str = t10Var.Q;
            long j3 = t10Var.E;
            long j10 = t10Var.H;
            MediaController.PlaylistGlobalSearchParams playlistGlobalSearchParams = new MediaController.PlaylistGlobalSearchParams(str, j3, j10, j10, t10Var.f37944y);
            t10 t10Var2 = o10Var.v;
            playlistGlobalSearchParams.endReached = t10Var2.N;
            playlistGlobalSearchParams.nextSearchRate = t10Var2.v;
            playlistGlobalSearchParams.totalCount = t10Var2.O;
            playlistGlobalSearchParams.folderId = t10Var2.J ? 1 : 0;
            return MediaController.getInstance().setPlaylist(o10Var.v.f37926f, messageObject, 0L, playlistGlobalSearchParams);
        }
        boolean playMessage = MediaController.getInstance().playMessage(messageObject);
        MediaController mediaController = MediaController.getInstance();
        if (playMessage) {
            arrayList = o10Var.v.f37926f;
        } else {
            arrayList = null;
        }
        mediaController.setVoiceMessagesPlaylist(arrayList, false);
        return playMessage;
    }
}
