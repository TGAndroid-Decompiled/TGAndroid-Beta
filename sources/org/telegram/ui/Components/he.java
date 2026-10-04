package org.telegram.ui.Components;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class he implements Utilities.Callback {
    public final int f27112a = 0;
    public final Object f27113b;
    public final boolean f27114c;
    public final int d;
    public final int f27115e;
    public final boolean f27116f;
    public final String f27117g;
    public final Object h;
    public final Object f27118i;
    public final Object f27119j;

    public he(ig igVar, Object obj, MediaController.PhotoEntry photoEntry, boolean z10, int i10, int i11, boolean z11, String str, Object obj2) {
        this.h = igVar;
        this.f27113b = obj;
        this.f27118i = photoEntry;
        this.f27114c = z10;
        this.d = i10;
        this.f27115e = i11;
        this.f27116f = z11;
        this.f27117g = str;
        this.f27119j = obj2;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f27112a;
        Object obj2 = this.f27118i;
        Object obj3 = this.h;
        switch (i10) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj3;
                int i11 = ChatActivityEnterView.f23847n5;
                sd sdVar = new sd(chatActivityEnterView, (TLRPC.Document) obj2, this.f27117g, (MessageObject.SendAnimationData) this.f27119j, this.f27114c, this.d, this.f27115e, this.f27113b, (Long) obj, this.f27116f);
                if (!chatActivityEnterView.q1(sdVar)) {
                    sdVar.run();
                    return;
                }
                return;
            default:
                ig igVar = (ig) obj3;
                sd sdVar2 = new sd(igVar, this.f27113b, (MediaController.PhotoEntry) obj2, this.f27114c, this.d, this.f27115e, this.f27116f, (Long) obj, this.f27117g, this.f27119j);
                if (!igVar.f27401a.q1(sdVar2)) {
                    sdVar2.run();
                    return;
                }
                return;
        }
    }

    public he(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, MessageObject.SendAnimationData sendAnimationData, boolean z10, int i10, int i11, Object obj, boolean z11) {
        this.h = chatActivityEnterView;
        this.f27118i = document;
        this.f27117g = str;
        this.f27119j = sendAnimationData;
        this.f27114c = z10;
        this.d = i10;
        this.f27115e = i11;
        this.f27113b = obj;
        this.f27116f = z11;
    }
}
