package org.telegram.ui.Components;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class vd implements Utilities.Callback {
    public final int f31861a = 0;
    public final Object f31862b;
    public final boolean f31863c;
    public final int d;
    public final int f31864e;
    public final boolean f31865f;
    public final String f31866g;
    public final Object h;
    public final Object f31867i;
    public final Object f31868j;

    public vd(xf xfVar, Object obj, MediaController.PhotoEntry photoEntry, boolean z4, int i10, int i11, boolean z10, String str, Object obj2) {
        this.h = xfVar;
        this.f31862b = obj;
        this.f31867i = photoEntry;
        this.f31863c = z4;
        this.d = i10;
        this.f31864e = i11;
        this.f31865f = z10;
        this.f31866g = str;
        this.f31868j = obj2;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f31861a;
        Object obj2 = this.f31867i;
        Object obj3 = this.h;
        switch (i10) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj3;
                int i11 = ChatActivityEnterView.f24570j5;
                hd hdVar = new hd(chatActivityEnterView, (TLRPC.Document) obj2, this.f31866g, (MessageObject.SendAnimationData) this.f31868j, this.f31863c, this.d, this.f31864e, this.f31862b, (Long) obj, this.f31865f);
                if (!chatActivityEnterView.r1(hdVar)) {
                    hdVar.run();
                    return;
                }
                return;
            default:
                xf xfVar = (xf) obj3;
                hd hdVar2 = new hd(xfVar, this.f31862b, (MediaController.PhotoEntry) obj2, this.f31863c, this.d, this.f31864e, this.f31865f, (Long) obj, this.f31866g, this.f31868j);
                if (!xfVar.f33052a.r1(hdVar2)) {
                    hdVar2.run();
                    return;
                }
                return;
        }
    }

    public vd(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, MessageObject.SendAnimationData sendAnimationData, boolean z4, int i10, int i11, Object obj, boolean z10) {
        this.h = chatActivityEnterView;
        this.f31867i = document;
        this.f31866g = str;
        this.f31868j = sendAnimationData;
        this.f31863c = z4;
        this.d = i10;
        this.f31864e = i11;
        this.f31862b = obj;
        this.f31865f = z10;
    }
}
