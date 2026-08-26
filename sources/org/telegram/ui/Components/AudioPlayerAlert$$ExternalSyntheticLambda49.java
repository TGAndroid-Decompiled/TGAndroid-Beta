package org.telegram.ui.Components;

import android.view.KeyEvent;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class AudioPlayerAlert$$ExternalSyntheticLambda49 implements RequestDelegate {
    public final int $r8$classId = 0;
    public final KeyEvent.Callback f$0;
    public final boolean f$1;
    public final Object f$2;
    public final boolean f$3;
    public final Object f$4;
    public final long f$5;
    public final Object f$6;

    public AudioPlayerAlert$$ExternalSyntheticLambda49(AudioPlayerAlert audioPlayerAlert, boolean z, MessageObject messageObject, boolean z2, Runnable runnable, long j, TLRPC.Document document) {
        this.f$0 = audioPlayerAlert;
        this.f$1 = z;
        this.f$2 = messageObject;
        this.f$3 = z2;
        this.f$4 = runnable;
        this.f$5 = j;
        this.f$6 = document;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                TLRPC.Document document = (TLRPC.Document) this.f$6;
                ((AudioPlayerAlert) this.f$0).lambda$saveToProfile$31(this.f$1, (MessageObject) this.f$2, this.f$3, (Runnable) this.f$4, this.f$5, document, tLObject, tL_error);
                break;
            default:
                ((PostsSearchContainer) this.f$0).lambda$load$4((MessagesController) this.f$2, this.f$1, (TLRPC.TL_channels_searchPosts) this.f$4, this.f$3, this.f$5, (ConnectionsManager) this.f$6, tLObject, tL_error);
                break;
        }
    }

    public AudioPlayerAlert$$ExternalSyntheticLambda49(PostsSearchContainer postsSearchContainer, MessagesController messagesController, boolean z, TLRPC.TL_channels_searchPosts tL_channels_searchPosts, boolean z2, long j, ConnectionsManager connectionsManager) {
        this.f$0 = postsSearchContainer;
        this.f$2 = messagesController;
        this.f$1 = z;
        this.f$4 = tL_channels_searchPosts;
        this.f$3 = z2;
        this.f$5 = j;
        this.f$6 = connectionsManager;
    }
}
