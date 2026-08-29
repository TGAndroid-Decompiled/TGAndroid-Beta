package org.telegram.ui.Components;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class yd implements Utilities.Callback {
    public final int f35045a = 0;
    public final Object f35046b;
    public final boolean f35047c;
    public final int d;
    public final int f35048e;
    public final boolean f35049f;
    public final String f35050g;
    public final Object h;
    public final Object f35051i;
    public final Object f35052j;

    public yd(ag agVar, Object obj, MediaController.PhotoEntry photoEntry, boolean z10, int i10, int i11, boolean z11, String str, Object obj2) {
        this.h = agVar;
        this.f35046b = obj;
        this.f35051i = photoEntry;
        this.f35047c = z10;
        this.d = i10;
        this.f35048e = i11;
        this.f35049f = z11;
        this.f35050g = str;
        this.f35052j = obj2;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f35045a;
        Object obj2 = this.f35051i;
        Object obj3 = this.h;
        switch (i10) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj3;
                int i11 = ChatActivityEnterView.f26085i5;
                kd kdVar = new kd(chatActivityEnterView, (TLRPC.Document) obj2, this.f35050g, (MessageObject.SendAnimationData) this.f35052j, this.f35047c, this.d, this.f35048e, this.f35046b, (Long) obj, this.f35049f);
                if (!chatActivityEnterView.r1(kdVar)) {
                    kdVar.run();
                    return;
                }
                return;
            default:
                ag agVar = (ag) obj3;
                kd kdVar2 = new kd(agVar, this.f35046b, (MediaController.PhotoEntry) obj2, this.f35047c, this.d, this.f35048e, this.f35049f, (Long) obj, this.f35050g, this.f35052j);
                if (!agVar.f26766a.r1(kdVar2)) {
                    kdVar2.run();
                    return;
                }
                return;
        }
    }

    public yd(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, MessageObject.SendAnimationData sendAnimationData, boolean z10, int i10, int i11, Object obj, boolean z11) {
        this.h = chatActivityEnterView;
        this.f35051i = document;
        this.f35050g = str;
        this.f35052j = sendAnimationData;
        this.f35047c = z10;
        this.d = i10;
        this.f35048e = i11;
        this.f35046b = obj;
        this.f35049f = z11;
    }
}
