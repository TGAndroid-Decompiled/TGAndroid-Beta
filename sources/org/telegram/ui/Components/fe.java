package org.telegram.ui.Components;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class fe implements Utilities.Callback {
    public final int f26044a = 0;
    public final Object f26045b;
    public final boolean f26046c;
    public final int d;
    public final int f26047e;
    public final boolean f26048f;
    public final String f26049g;
    public final Object h;
    public final Object f26050i;
    public final Object f26051j;

    public fe(hg hgVar, Object obj, MediaController.PhotoEntry photoEntry, boolean z10, int i10, int i11, boolean z11, String str, Object obj2) {
        this.h = hgVar;
        this.f26045b = obj;
        this.f26050i = photoEntry;
        this.f26046c = z10;
        this.d = i10;
        this.f26047e = i11;
        this.f26048f = z11;
        this.f26049g = str;
        this.f26051j = obj2;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f26044a;
        Object obj2 = this.f26050i;
        Object obj3 = this.h;
        switch (i10) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj3;
                int i11 = ChatActivityEnterView.f23688m5;
                rd rdVar = new rd(chatActivityEnterView, (TLRPC.Document) obj2, this.f26049g, (MessageObject.SendAnimationData) this.f26051j, this.f26046c, this.d, this.f26047e, this.f26045b, (Long) obj, this.f26048f);
                if (!chatActivityEnterView.r1(rdVar)) {
                    rdVar.run();
                    return;
                }
                return;
            default:
                hg hgVar = (hg) obj3;
                rd rdVar2 = new rd(hgVar, this.f26045b, (MediaController.PhotoEntry) obj2, this.f26046c, this.d, this.f26047e, this.f26048f, (Long) obj, this.f26049g, this.f26051j);
                if (!hgVar.f26757a.r1(rdVar2)) {
                    rdVar2.run();
                    return;
                }
                return;
        }
    }

    public fe(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, MessageObject.SendAnimationData sendAnimationData, boolean z10, int i10, int i11, Object obj, boolean z11) {
        this.h = chatActivityEnterView;
        this.f26050i = document;
        this.f26049g = str;
        this.f26051j = sendAnimationData;
        this.f26046c = z10;
        this.d = i10;
        this.f26047e = i11;
        this.f26045b = obj;
        this.f26048f = z11;
    }
}
