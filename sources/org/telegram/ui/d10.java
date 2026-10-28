package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
public final class d10 extends org.telegram.ui.Cells.n7 {
    public final e10 f38489l0;

    public d10(e10 e10Var, Context context) {
        super(context, 1, null);
        this.f38489l0 = e10Var;
    }

    @Override
    public final boolean d(MessageObject messageObject) {
        ArrayList<MessageObject> arrayList;
        boolean isVoice = messageObject.isVoice();
        e10 e10Var = this.f38489l0;
        if (!isVoice && !messageObject.isRoundVideo()) {
            if (!messageObject.isMusic()) {
                return false;
            }
            j10 j10Var = e10Var.v;
            String str = j10Var.Q;
            long j10 = j10Var.E;
            long j11 = j10Var.H;
            MediaController.PlaylistGlobalSearchParams playlistGlobalSearchParams = new MediaController.PlaylistGlobalSearchParams(str, j10, j11, j11, j10Var.f40346y);
            j10 j10Var2 = e10Var.v;
            playlistGlobalSearchParams.endReached = j10Var2.N;
            playlistGlobalSearchParams.nextSearchRate = j10Var2.v;
            playlistGlobalSearchParams.totalCount = j10Var2.O;
            playlistGlobalSearchParams.folderId = j10Var2.J ? 1 : 0;
            return MediaController.getInstance().setPlaylist(e10Var.v.f40328f, messageObject, 0L, playlistGlobalSearchParams);
        }
        boolean playMessage = MediaController.getInstance().playMessage(messageObject);
        MediaController mediaController = MediaController.getInstance();
        if (playMessage) {
            arrayList = e10Var.v.f40328f;
        } else {
            arrayList = null;
        }
        mediaController.setVoiceMessagesPlaylist(arrayList, false);
        return playMessage;
    }
}
