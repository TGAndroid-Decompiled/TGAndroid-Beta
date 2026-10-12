package org.telegram.messenger;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class yd implements Runnable {
    public final int f19669a = 2;
    public final long f19670b;
    public final boolean f19671c;
    public final BaseController d;
    public final Object f19672e;
    public final Object f19673f;
    public final Object h;

    public yd(ChatThemeController chatThemeController, TLObject tLObject, long j3, boolean z10, String str, Runnable runnable) {
        this.d = chatThemeController;
        this.f19672e = tLObject;
        this.f19670b = j3;
        this.f19671c = z10;
        this.f19673f = str;
        this.h = runnable;
    }

    @Override
    public final void run() {
        switch (this.f19669a) {
            case 0:
                boolean z10 = this.f19671c;
                ((MessagesController) this.d).lambda$getSendAsPeers$445((TLRPC.TL_channels_sendAsPeers) this.f19672e, (a0.i) this.f19673f, this.f19670b, (MessagesController.SendAsPeersInfo) this.h, z10);
                return;
            case 1:
                ((TranslateController) this.d).lambda$pushToTranslate$24((HashMap) this.f19672e, this.f19670b, (TranslateController.PendingTranslation) this.f19673f, this.f19671c, (Set) this.h);
                return;
            case 2:
                ((ChatThemeController) this.d).lambda$setWallpaperToPeer$16((TLObject) this.f19672e, this.f19670b, this.f19671c, (String) this.f19673f, (Runnable) this.h);
                return;
            default:
                ((TopicsController) this.d).lambda$reloadTopics$15((TLObject) this.f19672e, this.f19671c, this.f19670b, (HashSet) this.f19673f, (Runnable) this.h);
                return;
        }
    }

    public yd(MessagesController messagesController, TLRPC.TL_channels_sendAsPeers tL_channels_sendAsPeers, a0.i iVar, long j3, MessagesController.SendAsPeersInfo sendAsPeersInfo, boolean z10) {
        this.d = messagesController;
        this.f19672e = tL_channels_sendAsPeers;
        this.f19673f = iVar;
        this.f19670b = j3;
        this.h = sendAsPeersInfo;
        this.f19671c = z10;
    }

    public yd(TopicsController topicsController, TLObject tLObject, boolean z10, long j3, HashSet hashSet, Runnable runnable) {
        this.d = topicsController;
        this.f19672e = tLObject;
        this.f19671c = z10;
        this.f19670b = j3;
        this.f19673f = hashSet;
        this.h = runnable;
    }

    public yd(TranslateController translateController, HashMap hashMap, long j3, TranslateController.PendingTranslation pendingTranslation, boolean z10, Set set) {
        this.d = translateController;
        this.f19672e = hashMap;
        this.f19670b = j3;
        this.f19673f = pendingTranslation;
        this.f19671c = z10;
        this.h = set;
    }
}
