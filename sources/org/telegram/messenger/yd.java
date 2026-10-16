package org.telegram.messenger;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class yd implements Runnable {
    public final int f18793a = 2;
    public final long f18794b;
    public final boolean f18795c;
    public final BaseController d;
    public final Object e;
    public final Object f18796f;
    public final Object h;

    public yd(ChatThemeController chatThemeController, TLObject tLObject, long j10, boolean z10, String str, Runnable runnable) {
        this.d = chatThemeController;
        this.e = tLObject;
        this.f18794b = j10;
        this.f18795c = z10;
        this.f18796f = str;
        this.h = runnable;
    }

    @Override
    public final void run() {
        switch (this.f18793a) {
            case 0:
                boolean z10 = this.f18795c;
                ((MessagesController) this.d).lambda$getSendAsPeers$445((TLRPC.TL_channels_sendAsPeers) this.e, (a0.h) this.f18796f, this.f18794b, (MessagesController.SendAsPeersInfo) this.h, z10);
                return;
            case 1:
                ((TranslateController) this.d).lambda$pushToTranslate$24((HashMap) this.e, this.f18794b, (TranslateController.PendingTranslation) this.f18796f, this.f18795c, (Set) this.h);
                return;
            case 2:
                ((ChatThemeController) this.d).lambda$setWallpaperToPeer$16((TLObject) this.e, this.f18794b, this.f18795c, (String) this.f18796f, (Runnable) this.h);
                return;
            default:
                ((TopicsController) this.d).lambda$reloadTopics$15((TLObject) this.e, this.f18795c, this.f18794b, (HashSet) this.f18796f, (Runnable) this.h);
                return;
        }
    }

    public yd(MessagesController messagesController, TLRPC.TL_channels_sendAsPeers tL_channels_sendAsPeers, a0.h hVar, long j10, MessagesController.SendAsPeersInfo sendAsPeersInfo, boolean z10) {
        this.d = messagesController;
        this.e = tL_channels_sendAsPeers;
        this.f18796f = hVar;
        this.f18794b = j10;
        this.h = sendAsPeersInfo;
        this.f18795c = z10;
    }

    public yd(TopicsController topicsController, TLObject tLObject, boolean z10, long j10, HashSet hashSet, Runnable runnable) {
        this.d = topicsController;
        this.e = tLObject;
        this.f18795c = z10;
        this.f18794b = j10;
        this.f18796f = hashSet;
        this.h = runnable;
    }

    public yd(TranslateController translateController, HashMap hashMap, long j10, TranslateController.PendingTranslation pendingTranslation, boolean z10, Set set) {
        this.d = translateController;
        this.e = hashMap;
        this.f18794b = j10;
        this.f18796f = pendingTranslation;
        this.f18795c = z10;
        this.h = set;
    }
}
