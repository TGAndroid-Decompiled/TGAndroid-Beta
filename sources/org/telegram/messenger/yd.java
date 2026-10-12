package org.telegram.messenger;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class yd implements Runnable {
    public final int f19092a = 2;
    public final long f19093b;
    public final boolean f19094c;
    public final BaseController d;
    public final Object e;
    public final Object f19095f;
    public final Object h;

    public yd(ChatThemeController chatThemeController, TLObject tLObject, long j10, boolean z10, String str, Runnable runnable) {
        this.d = chatThemeController;
        this.e = tLObject;
        this.f19093b = j10;
        this.f19094c = z10;
        this.f19095f = str;
        this.h = runnable;
    }

    @Override
    public final void run() {
        switch (this.f19092a) {
            case 0:
                boolean z10 = this.f19094c;
                ((MessagesController) this.d).lambda$getSendAsPeers$445((TLRPC.TL_channels_sendAsPeers) this.e, (a0.h) this.f19095f, this.f19093b, (MessagesController.SendAsPeersInfo) this.h, z10);
                return;
            case 1:
                ((TranslateController) this.d).lambda$pushToTranslate$24((HashMap) this.e, this.f19093b, (TranslateController.PendingTranslation) this.f19095f, this.f19094c, (Set) this.h);
                return;
            case 2:
                ((ChatThemeController) this.d).lambda$setWallpaperToPeer$16((TLObject) this.e, this.f19093b, this.f19094c, (String) this.f19095f, (Runnable) this.h);
                return;
            default:
                ((TopicsController) this.d).lambda$reloadTopics$15((TLObject) this.e, this.f19094c, this.f19093b, (HashSet) this.f19095f, (Runnable) this.h);
                return;
        }
    }

    public yd(MessagesController messagesController, TLRPC.TL_channels_sendAsPeers tL_channels_sendAsPeers, a0.h hVar, long j10, MessagesController.SendAsPeersInfo sendAsPeersInfo, boolean z10) {
        this.d = messagesController;
        this.e = tL_channels_sendAsPeers;
        this.f19095f = hVar;
        this.f19093b = j10;
        this.h = sendAsPeersInfo;
        this.f19094c = z10;
    }

    public yd(TopicsController topicsController, TLObject tLObject, boolean z10, long j10, HashSet hashSet, Runnable runnable) {
        this.d = topicsController;
        this.e = tLObject;
        this.f19094c = z10;
        this.f19093b = j10;
        this.f19095f = hashSet;
        this.h = runnable;
    }

    public yd(TranslateController translateController, HashMap hashMap, long j10, TranslateController.PendingTranslation pendingTranslation, boolean z10, Set set) {
        this.d = translateController;
        this.e = hashMap;
        this.f19093b = j10;
        this.f19095f = pendingTranslation;
        this.f19094c = z10;
        this.h = set;
    }
}
