package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
public final class o10 extends org.telegram.ui.Cells.g7 {
    public final p10 f36623i0;

    public o10(p10 p10Var, Context context) {
        super(context, 1, null);
        this.f36623i0 = p10Var;
    }

    @Override
    public final boolean d(MessageObject messageObject) {
        ArrayList<MessageObject> arrayList;
        boolean isVoice = messageObject.isVoice();
        p10 p10Var = this.f36623i0;
        if (!isVoice && !messageObject.isRoundVideo()) {
            if (!messageObject.isMusic()) {
                return false;
            }
            u10 u10Var = p10Var.v;
            String str = u10Var.N;
            long j10 = u10Var.B;
            long j11 = u10Var.E;
            MediaController.PlaylistGlobalSearchParams playlistGlobalSearchParams = new MediaController.PlaylistGlobalSearchParams(str, j10, j11, j11, u10Var.f38661y);
            u10 u10Var2 = p10Var.v;
            playlistGlobalSearchParams.endReached = u10Var2.K;
            playlistGlobalSearchParams.nextSearchRate = u10Var2.v;
            playlistGlobalSearchParams.totalCount = u10Var2.L;
            playlistGlobalSearchParams.folderId = u10Var2.G ? 1 : 0;
            return MediaController.getInstance().setPlaylist(p10Var.v.f38646f, messageObject, 0L, playlistGlobalSearchParams);
        }
        boolean playMessage = MediaController.getInstance().playMessage(messageObject);
        MediaController mediaController = MediaController.getInstance();
        if (playMessage) {
            arrayList = p10Var.v.f38646f;
        } else {
            arrayList = null;
        }
        mediaController.setVoiceMessagesPlaylist(arrayList, false);
        return playMessage;
    }
}
