package org.telegram.ui.Components;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class fe implements Utilities.Callback {
    public final int f26223a = 0;
    public final Object f26224b;
    public final boolean f26225c;
    public final int d;
    public final int e;
    public final boolean f26226f;
    public final String f26227g;
    public final Object h;
    public final Object f26228i;
    public final Object f26229j;

    public fe(gg ggVar, Object obj, MediaController.PhotoEntry photoEntry, boolean z10, int i10, int i11, boolean z11, String str, Object obj2) {
        this.h = ggVar;
        this.f26224b = obj;
        this.f26228i = photoEntry;
        this.f26225c = z10;
        this.d = i10;
        this.e = i11;
        this.f26226f = z11;
        this.f26227g = str;
        this.f26229j = obj2;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f26223a;
        Object obj2 = this.f26228i;
        Object obj3 = this.h;
        switch (i10) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj3;
                int i11 = ChatActivityEnterView.f23904n5;
                qd qdVar = new qd(chatActivityEnterView, (TLRPC.Document) obj2, this.f26227g, (MessageObject.SendAnimationData) this.f26229j, this.f26225c, this.d, this.e, this.f26224b, (Long) obj, this.f26226f);
                if (!chatActivityEnterView.p1(qdVar)) {
                    qdVar.run();
                    return;
                }
                return;
            default:
                gg ggVar = (gg) obj3;
                qd qdVar2 = new qd(ggVar, this.f26224b, (MediaController.PhotoEntry) obj2, this.f26225c, this.d, this.e, this.f26226f, (Long) obj, this.f26227g, this.f26229j);
                if (!ggVar.f26561a.p1(qdVar2)) {
                    qdVar2.run();
                    return;
                }
                return;
        }
    }

    public fe(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, MessageObject.SendAnimationData sendAnimationData, boolean z10, int i10, int i11, Object obj, boolean z11) {
        this.h = chatActivityEnterView;
        this.f26228i = document;
        this.f26227g = str;
        this.f26229j = sendAnimationData;
        this.f26225c = z10;
        this.d = i10;
        this.e = i11;
        this.f26224b = obj;
        this.f26226f = z11;
    }
}
