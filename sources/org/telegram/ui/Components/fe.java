package org.telegram.ui.Components;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class fe implements Utilities.Callback {
    public final int f23955a = 0;
    public final Object f23956b;
    public final boolean f23957c;
    public final int d;
    public final int e;
    public final boolean f23958f;
    public final String f23959g;
    public final Object h;
    public final Object f23960i;
    public final Object f23961j;

    public fe(gg ggVar, Object obj, MediaController.PhotoEntry photoEntry, boolean z10, int i10, int i11, boolean z11, String str, Object obj2) {
        this.h = ggVar;
        this.f23956b = obj;
        this.f23960i = photoEntry;
        this.f23957c = z10;
        this.d = i10;
        this.e = i11;
        this.f23958f = z11;
        this.f23959g = str;
        this.f23961j = obj2;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f23955a;
        Object obj2 = this.f23960i;
        Object obj3 = this.h;
        switch (i10) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj3;
                int i11 = ChatActivityEnterView.f21701n5;
                rd rdVar = new rd(chatActivityEnterView, (TLRPC.Document) obj2, this.f23959g, (MessageObject.SendAnimationData) this.f23961j, this.f23957c, this.d, this.e, this.f23956b, (Long) obj, this.f23958f);
                if (!chatActivityEnterView.s1(rdVar)) {
                    rdVar.run();
                    return;
                }
                return;
            default:
                gg ggVar = (gg) obj3;
                rd rdVar2 = new rd(ggVar, this.f23956b, (MediaController.PhotoEntry) obj2, this.f23957c, this.d, this.e, this.f23958f, (Long) obj, this.f23959g, this.f23961j);
                if (!ggVar.f24280a.s1(rdVar2)) {
                    rdVar2.run();
                    return;
                }
                return;
        }
    }

    public fe(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, MessageObject.SendAnimationData sendAnimationData, boolean z10, int i10, int i11, Object obj, boolean z11) {
        this.h = chatActivityEnterView;
        this.f23960i = document;
        this.f23959g = str;
        this.f23961j = sendAnimationData;
        this.f23957c = z10;
        this.d = i10;
        this.e = i11;
        this.f23956b = obj;
        this.f23958f = z11;
    }
}
