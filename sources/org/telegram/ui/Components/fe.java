package org.telegram.ui.Components;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class fe implements Utilities.Callback {
    public final int f26210a = 0;
    public final Object f26211b;
    public final boolean f26212c;
    public final int d;
    public final int e;
    public final boolean f26213f;
    public final String f26214g;
    public final Object h;
    public final Object f26215i;
    public final Object f26216j;

    public fe(gg ggVar, Object obj, MediaController.PhotoEntry photoEntry, boolean z10, int i10, int i11, boolean z11, String str, Object obj2) {
        this.h = ggVar;
        this.f26211b = obj;
        this.f26215i = photoEntry;
        this.f26212c = z10;
        this.d = i10;
        this.e = i11;
        this.f26213f = z11;
        this.f26214g = str;
        this.f26216j = obj2;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f26210a;
        Object obj2 = this.f26215i;
        Object obj3 = this.h;
        switch (i10) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj3;
                int i11 = ChatActivityEnterView.f23907n5;
                qd qdVar = new qd(chatActivityEnterView, (TLRPC.Document) obj2, this.f26214g, (MessageObject.SendAnimationData) this.f26216j, this.f26212c, this.d, this.e, this.f26211b, (Long) obj, this.f26213f);
                if (!chatActivityEnterView.o1(qdVar)) {
                    qdVar.run();
                    return;
                }
                return;
            default:
                gg ggVar = (gg) obj3;
                qd qdVar2 = new qd(ggVar, this.f26211b, (MediaController.PhotoEntry) obj2, this.f26212c, this.d, this.e, this.f26213f, (Long) obj, this.f26214g, this.f26216j);
                if (!ggVar.f26590a.o1(qdVar2)) {
                    qdVar2.run();
                    return;
                }
                return;
        }
    }

    public fe(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, MessageObject.SendAnimationData sendAnimationData, boolean z10, int i10, int i11, Object obj, boolean z11) {
        this.h = chatActivityEnterView;
        this.f26215i = document;
        this.f26214g = str;
        this.f26216j = sendAnimationData;
        this.f26212c = z10;
        this.d = i10;
        this.e = i11;
        this.f26211b = obj;
        this.f26213f = z11;
    }
}
