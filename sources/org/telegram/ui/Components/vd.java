package org.telegram.ui.Components;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class vd implements Utilities.Callback {
    public final int f33347a = 0;
    public final Object f33348b;
    public final boolean f33349c;
    public final int d;
    public final int f33350e;
    public final boolean f33351f;
    public final String f33352g;
    public final Object h;
    public final Object f33353i;
    public final Object f33354j;

    public vd(xf xfVar, Object obj, MediaController.PhotoEntry photoEntry, boolean z10, int i9, int i10, boolean z11, String str, Object obj2) {
        this.h = xfVar;
        this.f33348b = obj;
        this.f33353i = photoEntry;
        this.f33349c = z10;
        this.d = i9;
        this.f33350e = i10;
        this.f33351f = z11;
        this.f33352g = str;
        this.f33354j = obj2;
    }

    @Override
    public final void run(Object obj) {
        int i9 = this.f33347a;
        Object obj2 = this.f33353i;
        Object obj3 = this.h;
        switch (i9) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj3;
                int i10 = ChatActivityEnterView.f26074i5;
                gd gdVar = new gd(chatActivityEnterView, (TLRPC.Document) obj2, this.f33352g, (MessageObject.SendAnimationData) this.f33354j, this.f33349c, this.d, this.f33350e, this.f33348b, (Long) obj, this.f33351f);
                if (!chatActivityEnterView.r1(gdVar)) {
                    gdVar.run();
                    return;
                }
                return;
            default:
                xf xfVar = (xf) obj3;
                gd gdVar2 = new gd(xfVar, this.f33348b, (MediaController.PhotoEntry) obj2, this.f33349c, this.d, this.f33350e, this.f33351f, (Long) obj, this.f33352g, this.f33354j);
                if (!xfVar.f34670a.r1(gdVar2)) {
                    gdVar2.run();
                    return;
                }
                return;
        }
    }

    public vd(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, MessageObject.SendAnimationData sendAnimationData, boolean z10, int i9, int i10, Object obj, boolean z11) {
        this.h = chatActivityEnterView;
        this.f33353i = document;
        this.f33352g = str;
        this.f33354j = sendAnimationData;
        this.f33349c = z10;
        this.d = i9;
        this.f33350e = i10;
        this.f33348b = obj;
        this.f33351f = z11;
    }
}
