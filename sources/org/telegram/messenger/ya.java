package org.telegram.messenger;

import java.util.HashSet;
import java.util.Set;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ya implements RequestDelegate {
    public final int f21900a;
    public final boolean f21901b;
    public final long f21902c;
    public final BaseController d;
    public final Object e;
    public final Object f21903f;

    public ya(BaseController baseController, Object obj, boolean z10, long j10, Object obj2, int i10) {
        this.f21900a = i10;
        this.d = baseController;
        this.e = obj;
        this.f21901b = z10;
        this.f21902c = j10;
        this.f21903f = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f21900a) {
            case 0:
                boolean z10 = this.f21901b;
                ((MessagesController) this.d).lambda$getSendAsPeers$449((a0.h) this.e, this.f21902c, (MessagesController.SendAsPeersInfo) this.f21903f, z10, tLObject, tL_error);
                return;
            case 1:
                long j10 = this.f21902c;
                ((TranslateController) this.d).lambda$pushToTranslate$23((TranslateController.PendingTranslation) this.e, this.f21901b, j10, (Set) this.f21903f, tLObject, tL_error);
                return;
            case 2:
                ((ChatThemeController) this.d).lambda$setWallpaperToPeer$17(this.f21902c, this.f21901b, (String) this.e, (Runnable) this.f21903f, tLObject, tL_error);
                return;
            case 3:
                long j11 = this.f21902c;
                ((MemberRequestsController) this.d).lambda$getImporters$1((TLRPC.TL_chatInviteImporter) this.e, this.f21901b, j11, (RequestDelegate) this.f21903f, tLObject, tL_error);
                return;
            default:
                ((TopicsController) this.d).lambda$reloadTopics$16(this.f21901b, this.f21902c, (HashSet) this.e, (Runnable) this.f21903f, tLObject, tL_error);
                return;
        }
    }

    public ya(ChatThemeController chatThemeController, long j10, boolean z10, String str, Runnable runnable) {
        this.f21900a = 2;
        this.d = chatThemeController;
        this.f21902c = j10;
        this.f21901b = z10;
        this.e = str;
        this.f21903f = runnable;
    }

    public ya(MessagesController messagesController, a0.h hVar, long j10, MessagesController.SendAsPeersInfo sendAsPeersInfo, boolean z10) {
        this.f21900a = 0;
        this.d = messagesController;
        this.e = hVar;
        this.f21902c = j10;
        this.f21903f = sendAsPeersInfo;
        this.f21901b = z10;
    }

    public ya(TopicsController topicsController, boolean z10, long j10, HashSet hashSet, Runnable runnable) {
        this.f21900a = 4;
        this.d = topicsController;
        this.f21901b = z10;
        this.f21902c = j10;
        this.e = hashSet;
        this.f21903f = runnable;
    }
}
