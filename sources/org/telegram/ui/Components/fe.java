package org.telegram.ui.Components;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class fe implements Utilities.Callback {
    public final int f28168a = 0;
    public final Object f28169b;
    public final boolean f28170c;
    public final int d;
    public final int e;
    public final boolean f28171f;
    public final String f28172g;
    public final Object h;
    public final Object f28173i;
    public final Object f28174j;

    public fe(gg ggVar, Object obj, MediaController.PhotoEntry photoEntry, boolean z10, int i10, int i11, boolean z11, String str, Object obj2) {
        this.h = ggVar;
        this.f28169b = obj;
        this.f28173i = photoEntry;
        this.f28170c = z10;
        this.d = i10;
        this.e = i11;
        this.f28171f = z11;
        this.f28172g = str;
        this.f28174j = obj2;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f28168a;
        Object obj2 = this.f28173i;
        Object obj3 = this.h;
        switch (i10) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj3;
                int i11 = ChatActivityEnterView.f25843r5;
                rd rdVar = new rd(chatActivityEnterView, (TLRPC.Document) obj2, this.f28172g, (MessageObject.SendAnimationData) this.f28174j, this.f28170c, this.d, this.e, this.f28169b, (Long) obj, this.f28171f);
                if (!chatActivityEnterView.o1(rdVar)) {
                    rdVar.run();
                    return;
                }
                return;
            default:
                gg ggVar = (gg) obj3;
                rd rdVar2 = new rd(ggVar, this.f28169b, (MediaController.PhotoEntry) obj2, this.f28170c, this.d, this.e, this.f28171f, (Long) obj, this.f28172g, this.f28174j);
                if (!ggVar.f28566a.o1(rdVar2)) {
                    rdVar2.run();
                    return;
                }
                return;
        }
    }

    public fe(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, MessageObject.SendAnimationData sendAnimationData, boolean z10, int i10, int i11, Object obj, boolean z11) {
        this.h = chatActivityEnterView;
        this.f28173i = document;
        this.f28172g = str;
        this.f28174j = sendAnimationData;
        this.f28170c = z10;
        this.d = i10;
        this.e = i11;
        this.f28169b = obj;
        this.f28171f = z11;
    }
}
