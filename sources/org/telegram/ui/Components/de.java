package org.telegram.ui.Components;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class de implements Utilities.Callback {
    public final int f25714a = 0;
    public final Object f25715b;
    public final boolean f25716c;
    public final int d;
    public final int e;
    public final boolean f25717f;
    public final String f25718g;
    public final Object h;
    public final Object f25719i;
    public final Object f25720j;

    public de(eg egVar, Object obj, MediaController.PhotoEntry photoEntry, boolean z10, int i10, int i11, boolean z11, String str, Object obj2) {
        this.h = egVar;
        this.f25715b = obj;
        this.f25719i = photoEntry;
        this.f25716c = z10;
        this.d = i10;
        this.e = i11;
        this.f25717f = z11;
        this.f25718g = str;
        this.f25720j = obj2;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f25714a;
        Object obj2 = this.f25719i;
        Object obj3 = this.h;
        switch (i10) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj3;
                int i11 = ChatActivityEnterView.f24051r5;
                od odVar = new od(chatActivityEnterView, (TLRPC.Document) obj2, this.f25718g, (MessageObject.SendAnimationData) this.f25720j, this.f25716c, this.d, this.e, this.f25715b, (Long) obj, this.f25717f);
                if (!chatActivityEnterView.o1(odVar)) {
                    odVar.run();
                    return;
                }
                return;
            default:
                eg egVar = (eg) obj3;
                od odVar2 = new od(egVar, this.f25715b, (MediaController.PhotoEntry) obj2, this.f25716c, this.d, this.e, this.f25717f, (Long) obj, this.f25718g, this.f25720j);
                if (!egVar.f26031a.o1(odVar2)) {
                    odVar2.run();
                    return;
                }
                return;
        }
    }

    public de(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, MessageObject.SendAnimationData sendAnimationData, boolean z10, int i10, int i11, Object obj, boolean z11) {
        this.h = chatActivityEnterView;
        this.f25719i = document;
        this.f25718g = str;
        this.f25720j = sendAnimationData;
        this.f25716c = z10;
        this.d = i10;
        this.e = i11;
        this.f25715b = obj;
        this.f25717f = z11;
    }
}
