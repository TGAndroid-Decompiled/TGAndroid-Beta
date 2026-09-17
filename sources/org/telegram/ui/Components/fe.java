package org.telegram.ui.Components;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class fe implements Utilities.Callback {
    public final int f26018a = 0;
    public final Object f26019b;
    public final boolean f26020c;
    public final int d;
    public final int f26021e;
    public final boolean f26022f;
    public final String f26023g;
    public final Object h;
    public final Object f26024i;
    public final Object f26025j;

    public fe(hg hgVar, Object obj, MediaController.PhotoEntry photoEntry, boolean z10, int i10, int i11, boolean z11, String str, Object obj2) {
        this.h = hgVar;
        this.f26019b = obj;
        this.f26024i = photoEntry;
        this.f26020c = z10;
        this.d = i10;
        this.f26021e = i11;
        this.f26022f = z11;
        this.f26023g = str;
        this.f26025j = obj2;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f26018a;
        Object obj2 = this.f26024i;
        Object obj3 = this.h;
        switch (i10) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj3;
                int i11 = ChatActivityEnterView.f23662m5;
                rd rdVar = new rd(chatActivityEnterView, (TLRPC.Document) obj2, this.f26023g, (MessageObject.SendAnimationData) this.f26025j, this.f26020c, this.d, this.f26021e, this.f26019b, (Long) obj, this.f26022f);
                if (!chatActivityEnterView.r1(rdVar)) {
                    rdVar.run();
                    return;
                }
                return;
            default:
                hg hgVar = (hg) obj3;
                rd rdVar2 = new rd(hgVar, this.f26019b, (MediaController.PhotoEntry) obj2, this.f26020c, this.d, this.f26021e, this.f26022f, (Long) obj, this.f26023g, this.f26025j);
                if (!hgVar.f26731a.r1(rdVar2)) {
                    rdVar2.run();
                    return;
                }
                return;
        }
    }

    public fe(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, MessageObject.SendAnimationData sendAnimationData, boolean z10, int i10, int i11, Object obj, boolean z11) {
        this.h = chatActivityEnterView;
        this.f26024i = document;
        this.f26023g = str;
        this.f26025j = sendAnimationData;
        this.f26020c = z10;
        this.d = i10;
        this.f26021e = i11;
        this.f26019b = obj;
        this.f26022f = z11;
    }
}
