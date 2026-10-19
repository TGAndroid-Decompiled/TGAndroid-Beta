package org.telegram.ui.Components;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class fe implements Utilities.Callback {
    public final int f26208a = 0;
    public final Object f26209b;
    public final boolean f26210c;
    public final int d;
    public final int e;
    public final boolean f26211f;
    public final String f26212g;
    public final Object h;
    public final Object f26213i;
    public final Object f26214j;

    public fe(gg ggVar, Object obj, MediaController.PhotoEntry photoEntry, boolean z10, int i10, int i11, boolean z11, String str, Object obj2) {
        this.h = ggVar;
        this.f26209b = obj;
        this.f26213i = photoEntry;
        this.f26210c = z10;
        this.d = i10;
        this.e = i11;
        this.f26211f = z11;
        this.f26212g = str;
        this.f26214j = obj2;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f26208a;
        Object obj2 = this.f26213i;
        Object obj3 = this.h;
        switch (i10) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj3;
                int i11 = ChatActivityEnterView.f23905n5;
                qd qdVar = new qd(chatActivityEnterView, (TLRPC.Document) obj2, this.f26212g, (MessageObject.SendAnimationData) this.f26214j, this.f26210c, this.d, this.e, this.f26209b, (Long) obj, this.f26211f);
                if (!chatActivityEnterView.o1(qdVar)) {
                    qdVar.run();
                    return;
                }
                return;
            default:
                gg ggVar = (gg) obj3;
                qd qdVar2 = new qd(ggVar, this.f26209b, (MediaController.PhotoEntry) obj2, this.f26210c, this.d, this.e, this.f26211f, (Long) obj, this.f26212g, this.f26214j);
                if (!ggVar.f26588a.o1(qdVar2)) {
                    qdVar2.run();
                    return;
                }
                return;
        }
    }

    public fe(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, MessageObject.SendAnimationData sendAnimationData, boolean z10, int i10, int i11, Object obj, boolean z11) {
        this.h = chatActivityEnterView;
        this.f26213i = document;
        this.f26212g = str;
        this.f26214j = sendAnimationData;
        this.f26210c = z10;
        this.d = i10;
        this.e = i11;
        this.f26209b = obj;
        this.f26211f = z11;
    }
}
