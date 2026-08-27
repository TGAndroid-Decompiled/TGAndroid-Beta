package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class zk implements Runnable {

    public final int f22371a;

    public final BaseController f22372b;

    public final Object f22373c;
    public final Object d;

    public final Object f22374e;

    public final Runnable f22375f;
    public final long h;

    public zk(TopicsController topicsController, TLObject tLObject, long j10, TLRPC.TL_messages_forumTopics tL_messages_forumTopics, a0.h hVar, Runnable runnable) {
        this.f22371a = 2;
        this.f22372b = topicsController;
        this.f22373c = tLObject;
        this.h = j10;
        this.d = tL_messages_forumTopics;
        this.f22374e = hVar;
        this.f22375f = runnable;
    }

    @Override
    public final void run() throws Throwable {
        switch (this.f22371a) {
            case 0:
                ((TranslateController) this.f22372b).lambda$translatePhoto$43((MessageObject) this.f22373c, (String) this.d, (TranslateController.MessageKey) this.f22374e, this.f22375f, this.h);
                break;
            case 1:
                ((TranslateController) this.f22372b).lambda$translatePhoto$45((MessageObject) this.f22373c, (String) this.d, (TranslateController.MessageKey) this.f22374e, this.f22375f, this.h);
                break;
            default:
                ((TopicsController) this.f22372b).lambda$reloadTopics$14((TLObject) this.f22373c, this.h, (TLRPC.TL_messages_forumTopics) this.d, (a0.h) this.f22374e, this.f22375f);
                break;
        }
    }

    public zk(TranslateController translateController, MessageObject messageObject, String str, TranslateController.MessageKey messageKey, Runnable runnable, long j10, int i10) {
        this.f22371a = i10;
        this.f22372b = translateController;
        this.f22373c = messageObject;
        this.d = str;
        this.f22374e = messageKey;
        this.f22375f = runnable;
        this.h = j10;
    }
}
