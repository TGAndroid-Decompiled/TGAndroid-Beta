package org.telegram.ui.Components;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class fe implements Utilities.Callback {
    public final int f26045a = 0;
    public final Object f26046b;
    public final boolean f26047c;
    public final int d;
    public final int f26048e;
    public final boolean f26049f;
    public final String f26050g;
    public final Object h;
    public final Object f26051i;
    public final Object f26052j;

    public fe(hg hgVar, Object obj, MediaController.PhotoEntry photoEntry, boolean z10, int i10, int i11, boolean z11, String str, Object obj2) {
        this.h = hgVar;
        this.f26046b = obj;
        this.f26051i = photoEntry;
        this.f26047c = z10;
        this.d = i10;
        this.f26048e = i11;
        this.f26049f = z11;
        this.f26050g = str;
        this.f26052j = obj2;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f26045a;
        Object obj2 = this.f26051i;
        Object obj3 = this.h;
        switch (i10) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj3;
                int i11 = ChatActivityEnterView.f23689m5;
                rd rdVar = new rd(chatActivityEnterView, (TLRPC.Document) obj2, this.f26050g, (MessageObject.SendAnimationData) this.f26052j, this.f26047c, this.d, this.f26048e, this.f26046b, (Long) obj, this.f26049f);
                if (!chatActivityEnterView.r1(rdVar)) {
                    rdVar.run();
                    return;
                }
                return;
            default:
                hg hgVar = (hg) obj3;
                rd rdVar2 = new rd(hgVar, this.f26046b, (MediaController.PhotoEntry) obj2, this.f26047c, this.d, this.f26048e, this.f26049f, (Long) obj, this.f26050g, this.f26052j);
                if (!hgVar.f26758a.r1(rdVar2)) {
                    rdVar2.run();
                    return;
                }
                return;
        }
    }

    public fe(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, MessageObject.SendAnimationData sendAnimationData, boolean z10, int i10, int i11, Object obj, boolean z11) {
        this.h = chatActivityEnterView;
        this.f26051i = document;
        this.f26050g = str;
        this.f26052j = sendAnimationData;
        this.f26047c = z10;
        this.d = i10;
        this.f26048e = i11;
        this.f26046b = obj;
        this.f26049f = z11;
    }
}
