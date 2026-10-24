package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
public final class c10 extends org.telegram.ui.Cells.j7 {
    public final d10 f36174l0;

    public c10(d10 d10Var, Context context) {
        super(context, 1, null);
        this.f36174l0 = d10Var;
    }

    @Override
    public final boolean d(MessageObject messageObject) {
        ArrayList<MessageObject> arrayList;
        boolean isVoice = messageObject.isVoice();
        d10 d10Var = this.f36174l0;
        if (!isVoice && !messageObject.isRoundVideo()) {
            if (!messageObject.isMusic()) {
                return false;
            }
            i10 i10Var = d10Var.v;
            String str = i10Var.Q;
            long j10 = i10Var.E;
            long j11 = i10Var.H;
            MediaController.PlaylistGlobalSearchParams playlistGlobalSearchParams = new MediaController.PlaylistGlobalSearchParams(str, j10, j11, j11, i10Var.f38119y);
            i10 i10Var2 = d10Var.v;
            playlistGlobalSearchParams.endReached = i10Var2.N;
            playlistGlobalSearchParams.nextSearchRate = i10Var2.v;
            playlistGlobalSearchParams.totalCount = i10Var2.O;
            playlistGlobalSearchParams.folderId = i10Var2.J ? 1 : 0;
            return MediaController.getInstance().setPlaylist(d10Var.v.f38101f, messageObject, 0L, playlistGlobalSearchParams);
        }
        boolean playMessage = MediaController.getInstance().playMessage(messageObject);
        MediaController mediaController = MediaController.getInstance();
        if (playMessage) {
            arrayList = d10Var.v.f38101f;
        } else {
            arrayList = null;
        }
        mediaController.setVoiceMessagesPlaylist(arrayList, false);
        return playMessage;
    }
}
