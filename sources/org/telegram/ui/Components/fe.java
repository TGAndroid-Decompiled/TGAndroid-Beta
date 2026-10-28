package org.telegram.ui.Components;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class fe implements Utilities.Callback {
    public final int f28108a = 0;
    public final Object f28109b;
    public final boolean f28110c;
    public final int d;
    public final int e;
    public final boolean f28111f;
    public final String f28112g;
    public final Object h;
    public final Object f28113i;
    public final Object f28114j;

    public fe(gg ggVar, Object obj, MediaController.PhotoEntry photoEntry, boolean z10, int i10, int i11, boolean z11, String str, Object obj2) {
        this.h = ggVar;
        this.f28109b = obj;
        this.f28113i = photoEntry;
        this.f28110c = z10;
        this.d = i10;
        this.e = i11;
        this.f28111f = z11;
        this.f28112g = str;
        this.f28114j = obj2;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f28108a;
        Object obj2 = this.f28113i;
        Object obj3 = this.h;
        switch (i10) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj3;
                int i11 = ChatActivityEnterView.f25845r5;
                rd rdVar = new rd(chatActivityEnterView, (TLRPC.Document) obj2, this.f28112g, (MessageObject.SendAnimationData) this.f28114j, this.f28110c, this.d, this.e, this.f28109b, (Long) obj, this.f28111f);
                if (!chatActivityEnterView.n1(rdVar)) {
                    rdVar.run();
                    return;
                }
                return;
            default:
                gg ggVar = (gg) obj3;
                rd rdVar2 = new rd(ggVar, this.f28109b, (MediaController.PhotoEntry) obj2, this.f28110c, this.d, this.e, this.f28111f, (Long) obj, this.f28112g, this.f28114j);
                if (!ggVar.f28576a.n1(rdVar2)) {
                    rdVar2.run();
                    return;
                }
                return;
        }
    }

    public fe(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, MessageObject.SendAnimationData sendAnimationData, boolean z10, int i10, int i11, Object obj, boolean z11) {
        this.h = chatActivityEnterView;
        this.f28113i = document;
        this.f28112g = str;
        this.f28114j = sendAnimationData;
        this.f28110c = z10;
        this.d = i10;
        this.e = i11;
        this.f28109b = obj;
        this.f28111f = z11;
    }
}
