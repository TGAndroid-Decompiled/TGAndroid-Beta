package org.telegram.ui.Components;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class ge implements Utilities.Callback {
    public final int f24528a = 0;
    public final Object f24529b;
    public final boolean f24530c;
    public final int d;
    public final int e;
    public final boolean f24531f;
    public final String f24532g;
    public final Object h;
    public final Object f24533i;
    public final Object f24534j;

    public ge(hg hgVar, Object obj, MediaController.PhotoEntry photoEntry, boolean z10, int i10, int i11, boolean z11, String str, Object obj2) {
        this.h = hgVar;
        this.f24529b = obj;
        this.f24533i = photoEntry;
        this.f24530c = z10;
        this.d = i10;
        this.e = i11;
        this.f24531f = z11;
        this.f24532g = str;
        this.f24534j = obj2;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f24528a;
        Object obj2 = this.f24533i;
        Object obj3 = this.h;
        switch (i10) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj3;
                int i11 = ChatActivityEnterView.f21952n5;
                sd sdVar = new sd(chatActivityEnterView, (TLRPC.Document) obj2, this.f24532g, (MessageObject.SendAnimationData) this.f24534j, this.f24530c, this.d, this.e, this.f24529b, (Long) obj, this.f24531f);
                if (!chatActivityEnterView.r1(sdVar)) {
                    sdVar.run();
                    return;
                }
                return;
            default:
                hg hgVar = (hg) obj3;
                sd sdVar2 = new sd(hgVar, this.f24529b, (MediaController.PhotoEntry) obj2, this.f24530c, this.d, this.e, this.f24531f, (Long) obj, this.f24532g, this.f24534j);
                if (!hgVar.f24814a.r1(sdVar2)) {
                    sdVar2.run();
                    return;
                }
                return;
        }
    }

    public ge(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, MessageObject.SendAnimationData sendAnimationData, boolean z10, int i10, int i11, Object obj, boolean z11) {
        this.h = chatActivityEnterView;
        this.f24533i = document;
        this.f24532g = str;
        this.f24534j = sendAnimationData;
        this.f24530c = z10;
        this.d = i10;
        this.e = i11;
        this.f24529b = obj;
        this.f24531f = z11;
    }
}
