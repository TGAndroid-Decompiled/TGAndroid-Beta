package org.telegram.ui.Components;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class ge implements Utilities.Callback {
    public final int f24551a = 0;
    public final Object f24552b;
    public final boolean f24553c;
    public final int d;
    public final int e;
    public final boolean f24554f;
    public final String f24555g;
    public final Object h;
    public final Object f24556i;
    public final Object f24557j;

    public ge(hg hgVar, Object obj, MediaController.PhotoEntry photoEntry, boolean z10, int i10, int i11, boolean z11, String str, Object obj2) {
        this.h = hgVar;
        this.f24552b = obj;
        this.f24556i = photoEntry;
        this.f24553c = z10;
        this.d = i10;
        this.e = i11;
        this.f24554f = z11;
        this.f24555g = str;
        this.f24557j = obj2;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f24551a;
        Object obj2 = this.f24556i;
        Object obj3 = this.h;
        switch (i10) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj3;
                int i11 = ChatActivityEnterView.f21955n5;
                rd rdVar = new rd(chatActivityEnterView, (TLRPC.Document) obj2, this.f24555g, (MessageObject.SendAnimationData) this.f24557j, this.f24553c, this.d, this.e, this.f24552b, (Long) obj, this.f24554f);
                if (!chatActivityEnterView.q1(rdVar)) {
                    rdVar.run();
                    return;
                }
                return;
            default:
                hg hgVar = (hg) obj3;
                rd rdVar2 = new rd(hgVar, this.f24552b, (MediaController.PhotoEntry) obj2, this.f24553c, this.d, this.e, this.f24554f, (Long) obj, this.f24555g, this.f24557j);
                if (!hgVar.f24834a.q1(rdVar2)) {
                    rdVar2.run();
                    return;
                }
                return;
        }
    }

    public ge(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, MessageObject.SendAnimationData sendAnimationData, boolean z10, int i10, int i11, Object obj, boolean z11) {
        this.h = chatActivityEnterView;
        this.f24556i = document;
        this.f24555g = str;
        this.f24557j = sendAnimationData;
        this.f24553c = z10;
        this.d = i10;
        this.e = i11;
        this.f24552b = obj;
        this.f24554f = z11;
    }
}
