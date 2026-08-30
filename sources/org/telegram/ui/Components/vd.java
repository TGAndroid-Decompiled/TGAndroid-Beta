package org.telegram.ui.Components;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class vd implements Utilities.Callback {
    public final int f29426a = 0;
    public final Object f29427b;
    public final boolean f29428c;
    public final int d;
    public final int e;
    public final boolean f29429f;
    public final String f29430g;
    public final Object h;
    public final Object f29431i;
    public final Object f29432j;

    public vd(xf xfVar, Object obj, MediaController.PhotoEntry photoEntry, boolean z4, int i10, int i11, boolean z10, String str, Object obj2) {
        this.h = xfVar;
        this.f29427b = obj;
        this.f29431i = photoEntry;
        this.f29428c = z4;
        this.d = i10;
        this.e = i11;
        this.f29429f = z10;
        this.f29430g = str;
        this.f29432j = obj2;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f29426a;
        Object obj2 = this.f29431i;
        Object obj3 = this.h;
        switch (i10) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj3;
                int i11 = ChatActivityEnterView.f22729j5;
                hd hdVar = new hd(chatActivityEnterView, (TLRPC.Document) obj2, this.f29430g, (MessageObject.SendAnimationData) this.f29432j, this.f29428c, this.d, this.e, this.f29427b, (Long) obj, this.f29429f);
                if (!chatActivityEnterView.r1(hdVar)) {
                    hdVar.run();
                    return;
                }
                return;
            default:
                xf xfVar = (xf) obj3;
                hd hdVar2 = new hd(xfVar, this.f29427b, (MediaController.PhotoEntry) obj2, this.f29428c, this.d, this.e, this.f29429f, (Long) obj, this.f29430g, this.f29432j);
                if (!xfVar.f30668a.r1(hdVar2)) {
                    hdVar2.run();
                    return;
                }
                return;
        }
    }

    public vd(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, MessageObject.SendAnimationData sendAnimationData, boolean z4, int i10, int i11, Object obj, boolean z10) {
        this.h = chatActivityEnterView;
        this.f29431i = document;
        this.f29430g = str;
        this.f29432j = sendAnimationData;
        this.f29428c = z4;
        this.d = i10;
        this.e = i11;
        this.f29427b = obj;
        this.f29429f = z10;
    }
}
