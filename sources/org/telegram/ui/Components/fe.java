package org.telegram.ui.Components;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class fe implements Utilities.Callback {
    public final int f24137a = 0;
    public final Object f24138b;
    public final boolean f24139c;
    public final int d;
    public final int e;
    public final boolean f24140f;
    public final String f24141g;
    public final Object h;
    public final Object f24142i;
    public final Object f24143j;

    public fe(gg ggVar, Object obj, MediaController.PhotoEntry photoEntry, boolean z10, int i10, int i11, boolean z11, String str, Object obj2) {
        this.h = ggVar;
        this.f24138b = obj;
        this.f24142i = photoEntry;
        this.f24139c = z10;
        this.d = i10;
        this.e = i11;
        this.f24140f = z11;
        this.f24141g = str;
        this.f24143j = obj2;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f24137a;
        Object obj2 = this.f24142i;
        Object obj3 = this.h;
        switch (i10) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj3;
                int i11 = ChatActivityEnterView.f21917m5;
                qd qdVar = new qd(chatActivityEnterView, (TLRPC.Document) obj2, this.f24141g, (MessageObject.SendAnimationData) this.f24143j, this.f24139c, this.d, this.e, this.f24138b, (Long) obj, this.f24140f);
                if (!chatActivityEnterView.q1(qdVar)) {
                    qdVar.run();
                    return;
                }
                return;
            default:
                gg ggVar = (gg) obj3;
                qd qdVar2 = new qd(ggVar, this.f24138b, (MediaController.PhotoEntry) obj2, this.f24139c, this.d, this.e, this.f24140f, (Long) obj, this.f24141g, this.f24143j);
                if (!ggVar.f24382a.q1(qdVar2)) {
                    qdVar2.run();
                    return;
                }
                return;
        }
    }

    public fe(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, MessageObject.SendAnimationData sendAnimationData, boolean z10, int i10, int i11, Object obj, boolean z11) {
        this.h = chatActivityEnterView;
        this.f24142i = document;
        this.f24141g = str;
        this.f24143j = sendAnimationData;
        this.f24139c = z10;
        this.d = i10;
        this.e = i11;
        this.f24138b = obj;
        this.f24140f = z11;
    }
}
