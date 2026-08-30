package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
public final class n10 extends org.telegram.ui.Cells.h7 {
    public final o10 f36430i0;

    public n10(o10 o10Var, Context context) {
        super(context, 1, null);
        this.f36430i0 = o10Var;
    }

    @Override
    public final boolean d(MessageObject messageObject) {
        ArrayList<MessageObject> arrayList;
        boolean isVoice = messageObject.isVoice();
        o10 o10Var = this.f36430i0;
        if (!isVoice && !messageObject.isRoundVideo()) {
            if (!messageObject.isMusic()) {
                return false;
            }
            t10 t10Var = o10Var.v;
            String str = t10Var.N;
            long j10 = t10Var.B;
            long j11 = t10Var.E;
            MediaController.PlaylistGlobalSearchParams playlistGlobalSearchParams = new MediaController.PlaylistGlobalSearchParams(str, j10, j11, j11, t10Var.f38495y);
            t10 t10Var2 = o10Var.v;
            playlistGlobalSearchParams.endReached = t10Var2.K;
            playlistGlobalSearchParams.nextSearchRate = t10Var2.v;
            playlistGlobalSearchParams.totalCount = t10Var2.L;
            playlistGlobalSearchParams.folderId = t10Var2.G ? 1 : 0;
            return MediaController.getInstance().setPlaylist(o10Var.v.f38480f, messageObject, 0L, playlistGlobalSearchParams);
        }
        boolean playMessage = MediaController.getInstance().playMessage(messageObject);
        MediaController mediaController = MediaController.getInstance();
        if (playMessage) {
            arrayList = o10Var.v.f38480f;
        } else {
            arrayList = null;
        }
        mediaController.setVoiceMessagesPlaylist(arrayList, false);
        return playMessage;
    }
}
