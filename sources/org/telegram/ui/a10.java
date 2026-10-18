package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
public final class a10 extends org.telegram.ui.Cells.h7 {
    public final b10 f35229l0;

    public a10(b10 b10Var, Context context) {
        super(context, 1, null);
        this.f35229l0 = b10Var;
    }

    @Override
    public final boolean d(MessageObject messageObject) {
        ArrayList<MessageObject> arrayList;
        boolean isVoice = messageObject.isVoice();
        b10 b10Var = this.f35229l0;
        if (!isVoice && !messageObject.isRoundVideo()) {
            if (!messageObject.isMusic()) {
                return false;
            }
            g10 g10Var = b10Var.v;
            String str = g10Var.Q;
            long j10 = g10Var.E;
            long j11 = g10Var.H;
            MediaController.PlaylistGlobalSearchParams playlistGlobalSearchParams = new MediaController.PlaylistGlobalSearchParams(str, j10, j11, j11, g10Var.f37042y);
            g10 g10Var2 = b10Var.v;
            playlistGlobalSearchParams.endReached = g10Var2.N;
            playlistGlobalSearchParams.nextSearchRate = g10Var2.v;
            playlistGlobalSearchParams.totalCount = g10Var2.O;
            playlistGlobalSearchParams.folderId = g10Var2.J ? 1 : 0;
            return MediaController.getInstance().setPlaylist(b10Var.v.f37024f, messageObject, 0L, playlistGlobalSearchParams);
        }
        boolean playMessage = MediaController.getInstance().playMessage(messageObject);
        MediaController mediaController = MediaController.getInstance();
        if (playMessage) {
            arrayList = b10Var.v.f37024f;
        } else {
            arrayList = null;
        }
        mediaController.setVoiceMessagesPlaylist(arrayList, false);
        return playMessage;
    }
}
