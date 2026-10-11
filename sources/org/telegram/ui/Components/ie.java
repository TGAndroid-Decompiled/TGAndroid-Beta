package org.telegram.ui.Components;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class ie implements Utilities.Callback {
    public final int f27300a = 0;
    public final Object f27301b;
    public final boolean f27302c;
    public final int d;
    public final int f27303e;
    public final boolean f27304f;
    public final String f27305g;
    public final Object h;
    public final Object f27306i;
    public final Object f27307j;

    public ie(jg jgVar, Object obj, MediaController.PhotoEntry photoEntry, boolean z10, int i10, int i11, boolean z11, String str, Object obj2) {
        this.h = jgVar;
        this.f27301b = obj;
        this.f27306i = photoEntry;
        this.f27302c = z10;
        this.d = i10;
        this.f27303e = i11;
        this.f27304f = z11;
        this.f27305g = str;
        this.f27307j = obj2;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f27300a;
        Object obj2 = this.f27306i;
        Object obj3 = this.h;
        switch (i10) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj3;
                int i11 = ChatActivityEnterView.f23842n5;
                ud udVar = new ud(chatActivityEnterView, (TLRPC.Document) obj2, this.f27305g, (MessageObject.SendAnimationData) this.f27307j, this.f27302c, this.d, this.f27303e, this.f27301b, (Long) obj, this.f27304f);
                if (!chatActivityEnterView.p1(udVar)) {
                    udVar.run();
                    return;
                }
                return;
            default:
                jg jgVar = (jg) obj3;
                ud udVar2 = new ud(jgVar, this.f27301b, (MediaController.PhotoEntry) obj2, this.f27302c, this.d, this.f27303e, this.f27304f, (Long) obj, this.f27305g, this.f27307j);
                if (!jgVar.f27679a.p1(udVar2)) {
                    udVar2.run();
                    return;
                }
                return;
        }
    }

    public ie(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, MessageObject.SendAnimationData sendAnimationData, boolean z10, int i10, int i11, Object obj, boolean z11) {
        this.h = chatActivityEnterView;
        this.f27306i = document;
        this.f27305g = str;
        this.f27307j = sendAnimationData;
        this.f27302c = z10;
        this.d = i10;
        this.f27303e = i11;
        this.f27301b = obj;
        this.f27304f = z11;
    }
}
