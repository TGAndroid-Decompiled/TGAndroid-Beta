package org.telegram.ui.Components;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class ge implements Utilities.Callback {
    public final int f24436a = 0;
    public final Object f24437b;
    public final boolean f24438c;
    public final int d;
    public final int e;
    public final boolean f24439f;
    public final String f24440g;
    public final Object h;
    public final Object f24441i;
    public final Object f24442j;

    public ge(hg hgVar, Object obj, MediaController.PhotoEntry photoEntry, boolean z10, int i10, int i11, boolean z11, String str, Object obj2) {
        this.h = hgVar;
        this.f24437b = obj;
        this.f24441i = photoEntry;
        this.f24438c = z10;
        this.d = i10;
        this.e = i11;
        this.f24439f = z11;
        this.f24440g = str;
        this.f24442j = obj2;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f24436a;
        Object obj2 = this.f24441i;
        Object obj3 = this.h;
        switch (i10) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj3;
                int i11 = ChatActivityEnterView.f21953n5;
                sd sdVar = new sd(chatActivityEnterView, (TLRPC.Document) obj2, this.f24440g, (MessageObject.SendAnimationData) this.f24442j, this.f24438c, this.d, this.e, this.f24437b, (Long) obj, this.f24439f);
                if (!chatActivityEnterView.r1(sdVar)) {
                    sdVar.run();
                    return;
                }
                return;
            default:
                hg hgVar = (hg) obj3;
                sd sdVar2 = new sd(hgVar, this.f24437b, (MediaController.PhotoEntry) obj2, this.f24438c, this.d, this.e, this.f24439f, (Long) obj, this.f24440g, this.f24442j);
                if (!hgVar.f24765a.r1(sdVar2)) {
                    sdVar2.run();
                    return;
                }
                return;
        }
    }

    public ge(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, MessageObject.SendAnimationData sendAnimationData, boolean z10, int i10, int i11, Object obj, boolean z11) {
        this.h = chatActivityEnterView;
        this.f24441i = document;
        this.f24440g = str;
        this.f24442j = sendAnimationData;
        this.f24438c = z10;
        this.d = i10;
        this.e = i11;
        this.f24437b = obj;
        this.f24439f = z11;
    }
}
