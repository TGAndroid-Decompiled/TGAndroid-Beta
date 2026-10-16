package org.telegram.ui.Components;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class ge implements Utilities.Callback {
    public final int f24945a = 0;
    public final Object f24946b;
    public final boolean f24947c;
    public final int d;
    public final int e;
    public final boolean f24948f;
    public final String f24949g;
    public final Object h;
    public final Object f24950i;
    public final Object f24951j;

    public ge(ig igVar, Object obj, MediaController.PhotoEntry photoEntry, boolean z10, int i10, int i11, boolean z11, String str, Object obj2) {
        this.h = igVar;
        this.f24946b = obj;
        this.f24950i = photoEntry;
        this.f24947c = z10;
        this.d = i10;
        this.e = i11;
        this.f24948f = z11;
        this.f24949g = str;
        this.f24951j = obj2;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f24945a;
        Object obj2 = this.f24950i;
        Object obj3 = this.h;
        switch (i10) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj3;
                int i11 = ChatActivityEnterView.f22549n5;
                sd sdVar = new sd(chatActivityEnterView, (TLRPC.Document) obj2, this.f24949g, (MessageObject.SendAnimationData) this.f24951j, this.f24947c, this.d, this.e, this.f24946b, (Long) obj, this.f24948f);
                if (!chatActivityEnterView.o1(sdVar)) {
                    sdVar.run();
                    return;
                }
                return;
            default:
                ig igVar = (ig) obj3;
                sd sdVar2 = new sd(igVar, this.f24946b, (MediaController.PhotoEntry) obj2, this.f24947c, this.d, this.e, this.f24948f, (Long) obj, this.f24949g, this.f24951j);
                if (!igVar.f25637a.o1(sdVar2)) {
                    sdVar2.run();
                    return;
                }
                return;
        }
    }

    public ge(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, MessageObject.SendAnimationData sendAnimationData, boolean z10, int i10, int i11, Object obj, boolean z11) {
        this.h = chatActivityEnterView;
        this.f24950i = document;
        this.f24949g = str;
        this.f24951j = sendAnimationData;
        this.f24947c = z10;
        this.d = i10;
        this.e = i11;
        this.f24946b = obj;
        this.f24948f = z11;
    }
}
