package org.telegram.ui.Components;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class fe implements Utilities.Callback {
    public final int f26209a = 0;
    public final Object f26210b;
    public final boolean f26211c;
    public final int d;
    public final int e;
    public final boolean f26212f;
    public final String f26213g;
    public final Object h;
    public final Object f26214i;
    public final Object f26215j;

    public fe(gg ggVar, Object obj, MediaController.PhotoEntry photoEntry, boolean z10, int i10, int i11, boolean z11, String str, Object obj2) {
        this.h = ggVar;
        this.f26210b = obj;
        this.f26214i = photoEntry;
        this.f26211c = z10;
        this.d = i10;
        this.e = i11;
        this.f26212f = z11;
        this.f26213g = str;
        this.f26215j = obj2;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f26209a;
        Object obj2 = this.f26214i;
        Object obj3 = this.h;
        switch (i10) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj3;
                int i11 = ChatActivityEnterView.f23912n5;
                qd qdVar = new qd(chatActivityEnterView, (TLRPC.Document) obj2, this.f26213g, (MessageObject.SendAnimationData) this.f26215j, this.f26211c, this.d, this.e, this.f26210b, (Long) obj, this.f26212f);
                if (!chatActivityEnterView.o1(qdVar)) {
                    qdVar.run();
                    return;
                }
                return;
            default:
                gg ggVar = (gg) obj3;
                qd qdVar2 = new qd(ggVar, this.f26210b, (MediaController.PhotoEntry) obj2, this.f26211c, this.d, this.e, this.f26212f, (Long) obj, this.f26213g, this.f26215j);
                if (!ggVar.f26586a.o1(qdVar2)) {
                    qdVar2.run();
                    return;
                }
                return;
        }
    }

    public fe(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, MessageObject.SendAnimationData sendAnimationData, boolean z10, int i10, int i11, Object obj, boolean z11) {
        this.h = chatActivityEnterView;
        this.f26214i = document;
        this.f26213g = str;
        this.f26215j = sendAnimationData;
        this.f26211c = z10;
        this.d = i10;
        this.e = i11;
        this.f26210b = obj;
        this.f26212f = z11;
    }
}
