package org.telegram.messenger;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class yd implements Runnable {
    public final int f20220a = 2;
    public final long f20221b;
    public final boolean f20222c;
    public final BaseController d;
    public final Object e;
    public final Object f20223f;
    public final Object h;

    public yd(ChatThemeController chatThemeController, TLObject tLObject, long j10, boolean z10, String str, Runnable runnable) {
        this.d = chatThemeController;
        this.e = tLObject;
        this.f20221b = j10;
        this.f20222c = z10;
        this.f20223f = str;
        this.h = runnable;
    }

    @Override
    public final void run() {
        switch (this.f20220a) {
            case 0:
                boolean z10 = this.f20222c;
                ((MessagesController) this.d).lambda$getSendAsPeers$445((TLRPC.TL_channels_sendAsPeers) this.e, (a0.h) this.f20223f, this.f20221b, (MessagesController.SendAsPeersInfo) this.h, z10);
                return;
            case 1:
                ((TranslateController) this.d).lambda$pushToTranslate$24((HashMap) this.e, this.f20221b, (TranslateController.PendingTranslation) this.f20223f, this.f20222c, (Set) this.h);
                return;
            case 2:
                ((ChatThemeController) this.d).lambda$setWallpaperToPeer$16((TLObject) this.e, this.f20221b, this.f20222c, (String) this.f20223f, (Runnable) this.h);
                return;
            default:
                ((TopicsController) this.d).lambda$reloadTopics$15((TLObject) this.e, this.f20222c, this.f20221b, (HashSet) this.f20223f, (Runnable) this.h);
                return;
        }
    }

    public yd(MessagesController messagesController, TLRPC.TL_channels_sendAsPeers tL_channels_sendAsPeers, a0.h hVar, long j10, MessagesController.SendAsPeersInfo sendAsPeersInfo, boolean z10) {
        this.d = messagesController;
        this.e = tL_channels_sendAsPeers;
        this.f20223f = hVar;
        this.f20221b = j10;
        this.h = sendAsPeersInfo;
        this.f20222c = z10;
    }

    public yd(TopicsController topicsController, TLObject tLObject, boolean z10, long j10, HashSet hashSet, Runnable runnable) {
        this.d = topicsController;
        this.e = tLObject;
        this.f20222c = z10;
        this.f20221b = j10;
        this.f20223f = hashSet;
        this.h = runnable;
    }

    public yd(TranslateController translateController, HashMap hashMap, long j10, TranslateController.PendingTranslation pendingTranslation, boolean z10, Set set) {
        this.d = translateController;
        this.e = hashMap;
        this.f20221b = j10;
        this.f20223f = pendingTranslation;
        this.f20222c = z10;
        this.h = set;
    }
}
