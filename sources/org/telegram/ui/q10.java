package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
public final class q10 extends org.telegram.ui.Cells.j7 {
    public final r10 f40997l0;

    public q10(r10 r10Var, Context context) {
        super(context, 1, null);
        this.f40997l0 = r10Var;
    }

    @Override
    public final boolean d(MessageObject messageObject) {
        ArrayList<MessageObject> arrayList;
        boolean isVoice = messageObject.isVoice();
        r10 r10Var = this.f40997l0;
        if (!isVoice && !messageObject.isRoundVideo()) {
            if (!messageObject.isMusic()) {
                return false;
            }
            w10 w10Var = r10Var.v;
            String str = w10Var.Q;
            long j3 = w10Var.E;
            long j10 = w10Var.H;
            MediaController.PlaylistGlobalSearchParams playlistGlobalSearchParams = new MediaController.PlaylistGlobalSearchParams(str, j3, j10, j10, w10Var.f43113y);
            w10 w10Var2 = r10Var.v;
            playlistGlobalSearchParams.endReached = w10Var2.N;
            playlistGlobalSearchParams.nextSearchRate = w10Var2.v;
            playlistGlobalSearchParams.totalCount = w10Var2.O;
            playlistGlobalSearchParams.folderId = w10Var2.J ? 1 : 0;
            return MediaController.getInstance().setPlaylist(r10Var.v.f43095f, messageObject, 0L, playlistGlobalSearchParams);
        }
        boolean playMessage = MediaController.getInstance().playMessage(messageObject);
        MediaController mediaController = MediaController.getInstance();
        if (playMessage) {
            arrayList = r10Var.v.f43095f;
        } else {
            arrayList = null;
        }
        mediaController.setVoiceMessagesPlaylist(arrayList, false);
        return playMessage;
    }
}
