package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
public final class b10 extends org.telegram.ui.Cells.n7 {
    public final c10 f37940l0;

    public b10(c10 c10Var, Context context) {
        super(context, 1, null);
        this.f37940l0 = c10Var;
    }

    @Override
    public final boolean d(MessageObject messageObject) {
        ArrayList<MessageObject> arrayList;
        boolean isVoice = messageObject.isVoice();
        c10 c10Var = this.f37940l0;
        if (!isVoice && !messageObject.isRoundVideo()) {
            if (!messageObject.isMusic()) {
                return false;
            }
            h10 h10Var = c10Var.v;
            String str = h10Var.Q;
            long j10 = h10Var.E;
            long j11 = h10Var.H;
            MediaController.PlaylistGlobalSearchParams playlistGlobalSearchParams = new MediaController.PlaylistGlobalSearchParams(str, j10, j11, j11, h10Var.f39849y);
            h10 h10Var2 = c10Var.v;
            playlistGlobalSearchParams.endReached = h10Var2.N;
            playlistGlobalSearchParams.nextSearchRate = h10Var2.v;
            playlistGlobalSearchParams.totalCount = h10Var2.O;
            playlistGlobalSearchParams.folderId = h10Var2.J ? 1 : 0;
            return MediaController.getInstance().setPlaylist(c10Var.v.f39831f, messageObject, 0L, playlistGlobalSearchParams);
        }
        boolean playMessage = MediaController.getInstance().playMessage(messageObject);
        MediaController mediaController = MediaController.getInstance();
        if (playMessage) {
            arrayList = c10Var.v.f39831f;
        } else {
            arrayList = null;
        }
        mediaController.setVoiceMessagesPlaylist(arrayList, false);
        return playMessage;
    }
}
