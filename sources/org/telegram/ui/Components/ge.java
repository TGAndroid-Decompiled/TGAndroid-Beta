package org.telegram.ui.Components;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class ge implements Utilities.Callback {
    public final int f24530a = 0;
    public final Object f24531b;
    public final boolean f24532c;
    public final int d;
    public final int e;
    public final boolean f24533f;
    public final String f24534g;
    public final Object h;
    public final Object f24535i;
    public final Object f24536j;

    public ge(hg hgVar, Object obj, MediaController.PhotoEntry photoEntry, boolean z10, int i10, int i11, boolean z11, String str, Object obj2) {
        this.h = hgVar;
        this.f24531b = obj;
        this.f24535i = photoEntry;
        this.f24532c = z10;
        this.d = i10;
        this.e = i11;
        this.f24533f = z11;
        this.f24534g = str;
        this.f24536j = obj2;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f24530a;
        Object obj2 = this.f24535i;
        Object obj3 = this.h;
        switch (i10) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj3;
                int i11 = ChatActivityEnterView.f21954n5;
                sd sdVar = new sd(chatActivityEnterView, (TLRPC.Document) obj2, this.f24534g, (MessageObject.SendAnimationData) this.f24536j, this.f24532c, this.d, this.e, this.f24531b, (Long) obj, this.f24533f);
                if (!chatActivityEnterView.r1(sdVar)) {
                    sdVar.run();
                    return;
                }
                return;
            default:
                hg hgVar = (hg) obj3;
                sd sdVar2 = new sd(hgVar, this.f24531b, (MediaController.PhotoEntry) obj2, this.f24532c, this.d, this.e, this.f24533f, (Long) obj, this.f24534g, this.f24536j);
                if (!hgVar.f24795a.r1(sdVar2)) {
                    sdVar2.run();
                    return;
                }
                return;
        }
    }

    public ge(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, MessageObject.SendAnimationData sendAnimationData, boolean z10, int i10, int i11, Object obj, boolean z11) {
        this.h = chatActivityEnterView;
        this.f24535i = document;
        this.f24534g = str;
        this.f24536j = sendAnimationData;
        this.f24532c = z10;
        this.d = i10;
        this.e = i11;
        this.f24531b = obj;
        this.f24533f = z11;
    }
}
