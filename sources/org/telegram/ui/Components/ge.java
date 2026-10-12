package org.telegram.ui.Components;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class ge implements Utilities.Callback {
    public final int f25253a = 0;
    public final Object f25254b;
    public final boolean f25255c;
    public final int d;
    public final int e;
    public final boolean f25256f;
    public final String f25257g;
    public final Object h;
    public final Object f25258i;
    public final Object f25259j;

    public ge(ig igVar, Object obj, MediaController.PhotoEntry photoEntry, boolean z10, int i10, int i11, boolean z11, String str, Object obj2) {
        this.h = igVar;
        this.f25254b = obj;
        this.f25258i = photoEntry;
        this.f25255c = z10;
        this.d = i10;
        this.e = i11;
        this.f25256f = z11;
        this.f25257g = str;
        this.f25259j = obj2;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f25253a;
        Object obj2 = this.f25258i;
        Object obj3 = this.h;
        switch (i10) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj3;
                int i11 = ChatActivityEnterView.f22849n5;
                sd sdVar = new sd(chatActivityEnterView, (TLRPC.Document) obj2, this.f25257g, (MessageObject.SendAnimationData) this.f25259j, this.f25255c, this.d, this.e, this.f25254b, (Long) obj, this.f25256f);
                if (!chatActivityEnterView.p1(sdVar)) {
                    sdVar.run();
                    return;
                }
                return;
            default:
                ig igVar = (ig) obj3;
                sd sdVar2 = new sd(igVar, this.f25254b, (MediaController.PhotoEntry) obj2, this.f25255c, this.d, this.e, this.f25256f, (Long) obj, this.f25257g, this.f25259j);
                if (!igVar.f25942a.p1(sdVar2)) {
                    sdVar2.run();
                    return;
                }
                return;
        }
    }

    public ge(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, MessageObject.SendAnimationData sendAnimationData, boolean z10, int i10, int i11, Object obj, boolean z11) {
        this.h = chatActivityEnterView;
        this.f25258i = document;
        this.f25257g = str;
        this.f25259j = sendAnimationData;
        this.f25255c = z10;
        this.d = i10;
        this.e = i11;
        this.f25254b = obj;
        this.f25256f = z11;
    }
}
