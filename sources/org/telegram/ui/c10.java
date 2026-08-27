package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;

public final class c10 extends org.telegram.ui.Cells.e7 {

    public final d10 f36911h0;

    public c10(d10 d10Var, Context context) {
        super(context, 1, null);
        this.f36911h0 = d10Var;
    }

    @Override
    public final boolean d(MessageObject messageObject) {
        boolean zIsVoice = messageObject.isVoice();
        d10 d10Var = this.f36911h0;
        if (zIsVoice || messageObject.isRoundVideo()) {
            boolean zPlayMessage = MediaController.getInstance().playMessage(messageObject);
            MediaController.getInstance().setVoiceMessagesPlaylist(zPlayMessage ? d10Var.v.f38943f : null, false);
            return zPlayMessage;
        }
        if (!messageObject.isMusic()) {
            return false;
        }
        i10 i10Var = d10Var.v;
        String str = i10Var.M;
        long j10 = i10Var.A;
        long j11 = i10Var.D;
        MediaController.PlaylistGlobalSearchParams playlistGlobalSearchParams = new MediaController.PlaylistGlobalSearchParams(str, j10, j11, j11, i10Var.f38957y);
        i10 i10Var2 = d10Var.v;
        playlistGlobalSearchParams.endReached = i10Var2.J;
        playlistGlobalSearchParams.nextSearchRate = i10Var2.v;
        playlistGlobalSearchParams.totalCount = i10Var2.K;
        playlistGlobalSearchParams.folderId = i10Var2.F ? 1 : 0;
        return MediaController.getInstance().setPlaylist(d10Var.v.f38943f, messageObject, 0L, playlistGlobalSearchParams);
    }
}
