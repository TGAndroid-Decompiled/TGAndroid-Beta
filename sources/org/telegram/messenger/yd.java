package org.telegram.messenger;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class yd implements Runnable {
    public final int f20151a = 2;
    public final long f20152b;
    public final boolean f20153c;
    public final BaseController d;
    public final Object e;
    public final Object f20154f;
    public final Object h;

    public yd(ChatThemeController chatThemeController, TLObject tLObject, long j10, boolean z10, String str, Runnable runnable) {
        this.d = chatThemeController;
        this.e = tLObject;
        this.f20152b = j10;
        this.f20153c = z10;
        this.f20154f = str;
        this.h = runnable;
    }

    @Override
    public final void run() {
        switch (this.f20151a) {
            case 0:
                boolean z10 = this.f20153c;
                ((MessagesController) this.d).lambda$getSendAsPeers$445((TLRPC.TL_channels_sendAsPeers) this.e, (a0.h) this.f20154f, this.f20152b, (MessagesController.SendAsPeersInfo) this.h, z10);
                return;
            case 1:
                ((TranslateController) this.d).lambda$pushToTranslate$24((HashMap) this.e, this.f20152b, (TranslateController.PendingTranslation) this.f20154f, this.f20153c, (Set) this.h);
                return;
            case 2:
                ((ChatThemeController) this.d).lambda$setWallpaperToPeer$16((TLObject) this.e, this.f20152b, this.f20153c, (String) this.f20154f, (Runnable) this.h);
                return;
            default:
                ((TopicsController) this.d).lambda$reloadTopics$15((TLObject) this.e, this.f20153c, this.f20152b, (HashSet) this.f20154f, (Runnable) this.h);
                return;
        }
    }

    public yd(MessagesController messagesController, TLRPC.TL_channels_sendAsPeers tL_channels_sendAsPeers, a0.h hVar, long j10, MessagesController.SendAsPeersInfo sendAsPeersInfo, boolean z10) {
        this.d = messagesController;
        this.e = tL_channels_sendAsPeers;
        this.f20154f = hVar;
        this.f20152b = j10;
        this.h = sendAsPeersInfo;
        this.f20153c = z10;
    }

    public yd(TopicsController topicsController, TLObject tLObject, boolean z10, long j10, HashSet hashSet, Runnable runnable) {
        this.d = topicsController;
        this.e = tLObject;
        this.f20153c = z10;
        this.f20152b = j10;
        this.f20154f = hashSet;
        this.h = runnable;
    }

    public yd(TranslateController translateController, HashMap hashMap, long j10, TranslateController.PendingTranslation pendingTranslation, boolean z10, Set set) {
        this.d = translateController;
        this.e = hashMap;
        this.f20152b = j10;
        this.f20154f = pendingTranslation;
        this.f20153c = z10;
        this.h = set;
    }
}
