package org.telegram.ui.Components;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class ie implements Utilities.Callback {
    public final int f27361a = 0;
    public final Object f27362b;
    public final boolean f27363c;
    public final int d;
    public final int f27364e;
    public final boolean f27365f;
    public final String f27366g;
    public final Object h;
    public final Object f27367i;
    public final Object f27368j;

    public ie(jg jgVar, Object obj, MediaController.PhotoEntry photoEntry, boolean z10, int i10, int i11, boolean z11, String str, Object obj2) {
        this.h = jgVar;
        this.f27362b = obj;
        this.f27367i = photoEntry;
        this.f27363c = z10;
        this.d = i10;
        this.f27364e = i11;
        this.f27365f = z11;
        this.f27366g = str;
        this.f27368j = obj2;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f27361a;
        Object obj2 = this.f27367i;
        Object obj3 = this.h;
        switch (i10) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj3;
                int i11 = ChatActivityEnterView.f23850n5;
                ud udVar = new ud(chatActivityEnterView, (TLRPC.Document) obj2, this.f27366g, (MessageObject.SendAnimationData) this.f27368j, this.f27363c, this.d, this.f27364e, this.f27362b, (Long) obj, this.f27365f);
                if (!chatActivityEnterView.p1(udVar)) {
                    udVar.run();
                    return;
                }
                return;
            default:
                jg jgVar = (jg) obj3;
                ud udVar2 = new ud(jgVar, this.f27362b, (MediaController.PhotoEntry) obj2, this.f27363c, this.d, this.f27364e, this.f27365f, (Long) obj, this.f27366g, this.f27368j);
                if (!jgVar.f27710a.p1(udVar2)) {
                    udVar2.run();
                    return;
                }
                return;
        }
    }

    public ie(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, MessageObject.SendAnimationData sendAnimationData, boolean z10, int i10, int i11, Object obj, boolean z11) {
        this.h = chatActivityEnterView;
        this.f27367i = document;
        this.f27366g = str;
        this.f27368j = sendAnimationData;
        this.f27363c = z10;
        this.d = i10;
        this.f27364e = i11;
        this.f27362b = obj;
        this.f27365f = z11;
    }
}
