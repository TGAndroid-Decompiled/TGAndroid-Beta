package org.telegram.ui.Components;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class vd implements Utilities.Callback {
    public final int f31883a = 0;
    public final Object f31884b;
    public final boolean f31885c;
    public final int d;
    public final int f31886e;
    public final boolean f31887f;
    public final String f31888g;
    public final Object h;
    public final Object f31889i;
    public final Object f31890j;

    public vd(xf xfVar, Object obj, MediaController.PhotoEntry photoEntry, boolean z4, int i10, int i11, boolean z10, String str, Object obj2) {
        this.h = xfVar;
        this.f31884b = obj;
        this.f31889i = photoEntry;
        this.f31885c = z4;
        this.d = i10;
        this.f31886e = i11;
        this.f31887f = z10;
        this.f31888g = str;
        this.f31890j = obj2;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f31883a;
        Object obj2 = this.f31889i;
        Object obj3 = this.h;
        switch (i10) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj3;
                int i11 = ChatActivityEnterView.f24568j5;
                hd hdVar = new hd(chatActivityEnterView, (TLRPC.Document) obj2, this.f31888g, (MessageObject.SendAnimationData) this.f31890j, this.f31885c, this.d, this.f31886e, this.f31884b, (Long) obj, this.f31887f);
                if (!chatActivityEnterView.r1(hdVar)) {
                    hdVar.run();
                    return;
                }
                return;
            default:
                xf xfVar = (xf) obj3;
                hd hdVar2 = new hd(xfVar, this.f31884b, (MediaController.PhotoEntry) obj2, this.f31885c, this.d, this.f31886e, this.f31887f, (Long) obj, this.f31888g, this.f31890j);
                if (!xfVar.f33058a.r1(hdVar2)) {
                    hdVar2.run();
                    return;
                }
                return;
        }
    }

    public vd(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, MessageObject.SendAnimationData sendAnimationData, boolean z4, int i10, int i11, Object obj, boolean z10) {
        this.h = chatActivityEnterView;
        this.f31889i = document;
        this.f31888g = str;
        this.f31890j = sendAnimationData;
        this.f31885c = z4;
        this.d = i10;
        this.f31886e = i11;
        this.f31884b = obj;
        this.f31887f = z10;
    }
}
