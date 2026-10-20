package org.telegram.ui.Components;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class fe implements Utilities.Callback {
    public final int f26205a = 0;
    public final Object f26206b;
    public final boolean f26207c;
    public final int d;
    public final int e;
    public final boolean f26208f;
    public final String f26209g;
    public final Object h;
    public final Object f26210i;
    public final Object f26211j;

    public fe(gg ggVar, Object obj, MediaController.PhotoEntry photoEntry, boolean z10, int i10, int i11, boolean z11, String str, Object obj2) {
        this.h = ggVar;
        this.f26206b = obj;
        this.f26210i = photoEntry;
        this.f26207c = z10;
        this.d = i10;
        this.e = i11;
        this.f26208f = z11;
        this.f26209g = str;
        this.f26211j = obj2;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f26205a;
        Object obj2 = this.f26210i;
        Object obj3 = this.h;
        switch (i10) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj3;
                int i11 = ChatActivityEnterView.f23908n5;
                qd qdVar = new qd(chatActivityEnterView, (TLRPC.Document) obj2, this.f26209g, (MessageObject.SendAnimationData) this.f26211j, this.f26207c, this.d, this.e, this.f26206b, (Long) obj, this.f26208f);
                if (!chatActivityEnterView.o1(qdVar)) {
                    qdVar.run();
                    return;
                }
                return;
            default:
                gg ggVar = (gg) obj3;
                qd qdVar2 = new qd(ggVar, this.f26206b, (MediaController.PhotoEntry) obj2, this.f26207c, this.d, this.e, this.f26208f, (Long) obj, this.f26209g, this.f26211j);
                if (!ggVar.f26582a.o1(qdVar2)) {
                    qdVar2.run();
                    return;
                }
                return;
        }
    }

    public fe(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, MessageObject.SendAnimationData sendAnimationData, boolean z10, int i10, int i11, Object obj, boolean z11) {
        this.h = chatActivityEnterView;
        this.f26210i = document;
        this.f26209g = str;
        this.f26211j = sendAnimationData;
        this.f26207c = z10;
        this.d = i10;
        this.e = i11;
        this.f26206b = obj;
        this.f26208f = z11;
    }
}
