package org.telegram.ui.Components;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class vd implements Utilities.Callback {
    public final int f29457a = 0;
    public final Object f29458b;
    public final boolean f29459c;
    public final int d;
    public final int e;
    public final boolean f29460f;
    public final String f29461g;
    public final Object h;
    public final Object f29462i;
    public final Object f29463j;

    public vd(xf xfVar, Object obj, MediaController.PhotoEntry photoEntry, boolean z4, int i10, int i11, boolean z10, String str, Object obj2) {
        this.h = xfVar;
        this.f29458b = obj;
        this.f29462i = photoEntry;
        this.f29459c = z4;
        this.d = i10;
        this.e = i11;
        this.f29460f = z10;
        this.f29461g = str;
        this.f29463j = obj2;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f29457a;
        Object obj2 = this.f29462i;
        Object obj3 = this.h;
        switch (i10) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj3;
                int i11 = ChatActivityEnterView.f22702j5;
                hd hdVar = new hd(chatActivityEnterView, (TLRPC.Document) obj2, this.f29461g, (MessageObject.SendAnimationData) this.f29463j, this.f29459c, this.d, this.e, this.f29458b, (Long) obj, this.f29460f);
                if (!chatActivityEnterView.r1(hdVar)) {
                    hdVar.run();
                    return;
                }
                return;
            default:
                xf xfVar = (xf) obj3;
                hd hdVar2 = new hd(xfVar, this.f29458b, (MediaController.PhotoEntry) obj2, this.f29459c, this.d, this.e, this.f29460f, (Long) obj, this.f29461g, this.f29463j);
                if (!xfVar.f30632a.r1(hdVar2)) {
                    hdVar2.run();
                    return;
                }
                return;
        }
    }

    public vd(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, MessageObject.SendAnimationData sendAnimationData, boolean z4, int i10, int i11, Object obj, boolean z10) {
        this.h = chatActivityEnterView;
        this.f29462i = document;
        this.f29461g = str;
        this.f29463j = sendAnimationData;
        this.f29459c = z4;
        this.d = i10;
        this.e = i11;
        this.f29458b = obj;
        this.f29460f = z10;
    }
}
