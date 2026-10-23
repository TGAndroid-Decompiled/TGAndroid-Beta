package org.telegram.ui.Components;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class fe implements Utilities.Callback {
    public final int f26300a = 0;
    public final Object f26301b;
    public final boolean f26302c;
    public final int d;
    public final int e;
    public final boolean f26303f;
    public final String f26304g;
    public final Object h;
    public final Object f26305i;
    public final Object f26306j;

    public fe(gg ggVar, Object obj, MediaController.PhotoEntry photoEntry, boolean z10, int i10, int i11, boolean z11, String str, Object obj2) {
        this.h = ggVar;
        this.f26301b = obj;
        this.f26305i = photoEntry;
        this.f26302c = z10;
        this.d = i10;
        this.e = i11;
        this.f26303f = z11;
        this.f26304g = str;
        this.f26306j = obj2;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f26300a;
        Object obj2 = this.f26305i;
        Object obj3 = this.h;
        switch (i10) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj3;
                int i11 = ChatActivityEnterView.f24050r5;
                qd qdVar = new qd(chatActivityEnterView, (TLRPC.Document) obj2, this.f26304g, (MessageObject.SendAnimationData) this.f26306j, this.f26302c, this.d, this.e, this.f26301b, (Long) obj, this.f26303f);
                if (!chatActivityEnterView.o1(qdVar)) {
                    qdVar.run();
                    return;
                }
                return;
            default:
                gg ggVar = (gg) obj3;
                qd qdVar2 = new qd(ggVar, this.f26301b, (MediaController.PhotoEntry) obj2, this.f26302c, this.d, this.e, this.f26303f, (Long) obj, this.f26304g, this.f26306j);
                if (!ggVar.f26605a.o1(qdVar2)) {
                    qdVar2.run();
                    return;
                }
                return;
        }
    }

    public fe(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, MessageObject.SendAnimationData sendAnimationData, boolean z10, int i10, int i11, Object obj, boolean z11) {
        this.h = chatActivityEnterView;
        this.f26305i = document;
        this.f26304g = str;
        this.f26306j = sendAnimationData;
        this.f26302c = z10;
        this.d = i10;
        this.e = i11;
        this.f26301b = obj;
        this.f26303f = z11;
    }
}
