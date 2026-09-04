package org.telegram.ui.Components;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class fe implements Utilities.Callback {
    public final int f26017a = 0;
    public final Object f26018b;
    public final boolean f26019c;
    public final int d;
    public final int f26020e;
    public final boolean f26021f;
    public final String f26022g;
    public final Object h;
    public final Object f26023i;
    public final Object f26024j;

    public fe(hg hgVar, Object obj, MediaController.PhotoEntry photoEntry, boolean z10, int i10, int i11, boolean z11, String str, Object obj2) {
        this.h = hgVar;
        this.f26018b = obj;
        this.f26023i = photoEntry;
        this.f26019c = z10;
        this.d = i10;
        this.f26020e = i11;
        this.f26021f = z11;
        this.f26022g = str;
        this.f26024j = obj2;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f26017a;
        Object obj2 = this.f26023i;
        Object obj3 = this.h;
        switch (i10) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj3;
                int i11 = ChatActivityEnterView.f23661m5;
                rd rdVar = new rd(chatActivityEnterView, (TLRPC.Document) obj2, this.f26022g, (MessageObject.SendAnimationData) this.f26024j, this.f26019c, this.d, this.f26020e, this.f26018b, (Long) obj, this.f26021f);
                if (!chatActivityEnterView.r1(rdVar)) {
                    rdVar.run();
                    return;
                }
                return;
            default:
                hg hgVar = (hg) obj3;
                rd rdVar2 = new rd(hgVar, this.f26018b, (MediaController.PhotoEntry) obj2, this.f26019c, this.d, this.f26020e, this.f26021f, (Long) obj, this.f26022g, this.f26024j);
                if (!hgVar.f26730a.r1(rdVar2)) {
                    rdVar2.run();
                    return;
                }
                return;
        }
    }

    public fe(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, MessageObject.SendAnimationData sendAnimationData, boolean z10, int i10, int i11, Object obj, boolean z11) {
        this.h = chatActivityEnterView;
        this.f26023i = document;
        this.f26022g = str;
        this.f26024j = sendAnimationData;
        this.f26019c = z10;
        this.d = i10;
        this.f26020e = i11;
        this.f26018b = obj;
        this.f26021f = z11;
    }
}
