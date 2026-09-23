package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
public final class o10 extends org.telegram.ui.Cells.i7 {
    public final p10 f35656l0;

    public o10(p10 p10Var, Context context) {
        super(context, 1, null);
        this.f35656l0 = p10Var;
    }

    @Override
    public final boolean d(MessageObject messageObject) {
        ArrayList<MessageObject> arrayList;
        boolean isVoice = messageObject.isVoice();
        p10 p10Var = this.f35656l0;
        if (!isVoice && !messageObject.isRoundVideo()) {
            if (!messageObject.isMusic()) {
                return false;
            }
            u10 u10Var = p10Var.v;
            String str = u10Var.Q;
            long j3 = u10Var.E;
            long j10 = u10Var.H;
            MediaController.PlaylistGlobalSearchParams playlistGlobalSearchParams = new MediaController.PlaylistGlobalSearchParams(str, j3, j10, j10, u10Var.f37870y);
            u10 u10Var2 = p10Var.v;
            playlistGlobalSearchParams.endReached = u10Var2.N;
            playlistGlobalSearchParams.nextSearchRate = u10Var2.v;
            playlistGlobalSearchParams.totalCount = u10Var2.O;
            playlistGlobalSearchParams.folderId = u10Var2.J ? 1 : 0;
            return MediaController.getInstance().setPlaylist(p10Var.v.f37852f, messageObject, 0L, playlistGlobalSearchParams);
        }
        boolean playMessage = MediaController.getInstance().playMessage(messageObject);
        MediaController mediaController = MediaController.getInstance();
        if (playMessage) {
            arrayList = p10Var.v.f37852f;
        } else {
            arrayList = null;
        }
        mediaController.setVoiceMessagesPlaylist(arrayList, false);
        return playMessage;
    }
}
