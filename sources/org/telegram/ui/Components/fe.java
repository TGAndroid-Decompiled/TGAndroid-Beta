package org.telegram.ui.Components;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class fe implements Utilities.Callback {
    public final int f26230a = 0;
    public final Object f26231b;
    public final boolean f26232c;
    public final int d;
    public final int e;
    public final boolean f26233f;
    public final String f26234g;
    public final Object h;
    public final Object f26235i;
    public final Object f26236j;

    public fe(gg ggVar, Object obj, MediaController.PhotoEntry photoEntry, boolean z10, int i10, int i11, boolean z11, String str, Object obj2) {
        this.h = ggVar;
        this.f26231b = obj;
        this.f26235i = photoEntry;
        this.f26232c = z10;
        this.d = i10;
        this.e = i11;
        this.f26233f = z11;
        this.f26234g = str;
        this.f26236j = obj2;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f26230a;
        Object obj2 = this.f26235i;
        Object obj3 = this.h;
        switch (i10) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj3;
                int i11 = ChatActivityEnterView.f23911n5;
                qd qdVar = new qd(chatActivityEnterView, (TLRPC.Document) obj2, this.f26234g, (MessageObject.SendAnimationData) this.f26236j, this.f26232c, this.d, this.e, this.f26231b, (Long) obj, this.f26233f);
                if (!chatActivityEnterView.p1(qdVar)) {
                    qdVar.run();
                    return;
                }
                return;
            default:
                gg ggVar = (gg) obj3;
                qd qdVar2 = new qd(ggVar, this.f26231b, (MediaController.PhotoEntry) obj2, this.f26232c, this.d, this.e, this.f26233f, (Long) obj, this.f26234g, this.f26236j);
                if (!ggVar.f26568a.p1(qdVar2)) {
                    qdVar2.run();
                    return;
                }
                return;
        }
    }

    public fe(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, MessageObject.SendAnimationData sendAnimationData, boolean z10, int i10, int i11, Object obj, boolean z11) {
        this.h = chatActivityEnterView;
        this.f26235i = document;
        this.f26234g = str;
        this.f26236j = sendAnimationData;
        this.f26232c = z10;
        this.d = i10;
        this.e = i11;
        this.f26231b = obj;
        this.f26233f = z11;
    }
}
