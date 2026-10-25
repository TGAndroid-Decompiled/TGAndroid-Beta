package org.telegram.ui.Components;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class fe implements Utilities.Callback {
    public final int f28166a = 0;
    public final Object f28167b;
    public final boolean f28168c;
    public final int d;
    public final int e;
    public final boolean f28169f;
    public final String f28170g;
    public final Object h;
    public final Object f28171i;
    public final Object f28172j;

    public fe(gg ggVar, Object obj, MediaController.PhotoEntry photoEntry, boolean z10, int i10, int i11, boolean z11, String str, Object obj2) {
        this.h = ggVar;
        this.f28167b = obj;
        this.f28171i = photoEntry;
        this.f28168c = z10;
        this.d = i10;
        this.e = i11;
        this.f28169f = z11;
        this.f28170g = str;
        this.f28172j = obj2;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f28166a;
        Object obj2 = this.f28171i;
        Object obj3 = this.h;
        switch (i10) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj3;
                int i11 = ChatActivityEnterView.f25841r5;
                rd rdVar = new rd(chatActivityEnterView, (TLRPC.Document) obj2, this.f28170g, (MessageObject.SendAnimationData) this.f28172j, this.f28168c, this.d, this.e, this.f28167b, (Long) obj, this.f28169f);
                if (!chatActivityEnterView.o1(rdVar)) {
                    rdVar.run();
                    return;
                }
                return;
            default:
                gg ggVar = (gg) obj3;
                rd rdVar2 = new rd(ggVar, this.f28167b, (MediaController.PhotoEntry) obj2, this.f28168c, this.d, this.e, this.f28169f, (Long) obj, this.f28170g, this.f28172j);
                if (!ggVar.f28564a.o1(rdVar2)) {
                    rdVar2.run();
                    return;
                }
                return;
        }
    }

    public fe(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, MessageObject.SendAnimationData sendAnimationData, boolean z10, int i10, int i11, Object obj, boolean z11) {
        this.h = chatActivityEnterView;
        this.f28171i = document;
        this.f28170g = str;
        this.f28172j = sendAnimationData;
        this.f28168c = z10;
        this.d = i10;
        this.e = i11;
        this.f28167b = obj;
        this.f28169f = z11;
    }
}
