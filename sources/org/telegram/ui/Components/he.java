package org.telegram.ui.Components;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class he implements Utilities.Callback {
    public final int f27111a = 0;
    public final Object f27112b;
    public final boolean f27113c;
    public final int d;
    public final int f27114e;
    public final boolean f27115f;
    public final String f27116g;
    public final Object h;
    public final Object f27117i;
    public final Object f27118j;

    public he(ig igVar, Object obj, MediaController.PhotoEntry photoEntry, boolean z10, int i10, int i11, boolean z11, String str, Object obj2) {
        this.h = igVar;
        this.f27112b = obj;
        this.f27117i = photoEntry;
        this.f27113c = z10;
        this.d = i10;
        this.f27114e = i11;
        this.f27115f = z11;
        this.f27116g = str;
        this.f27118j = obj2;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f27111a;
        Object obj2 = this.f27117i;
        Object obj3 = this.h;
        switch (i10) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj3;
                int i11 = ChatActivityEnterView.f23846n5;
                sd sdVar = new sd(chatActivityEnterView, (TLRPC.Document) obj2, this.f27116g, (MessageObject.SendAnimationData) this.f27118j, this.f27113c, this.d, this.f27114e, this.f27112b, (Long) obj, this.f27115f);
                if (!chatActivityEnterView.q1(sdVar)) {
                    sdVar.run();
                    return;
                }
                return;
            default:
                ig igVar = (ig) obj3;
                sd sdVar2 = new sd(igVar, this.f27112b, (MediaController.PhotoEntry) obj2, this.f27113c, this.d, this.f27114e, this.f27115f, (Long) obj, this.f27116g, this.f27118j);
                if (!igVar.f27400a.q1(sdVar2)) {
                    sdVar2.run();
                    return;
                }
                return;
        }
    }

    public he(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, MessageObject.SendAnimationData sendAnimationData, boolean z10, int i10, int i11, Object obj, boolean z11) {
        this.h = chatActivityEnterView;
        this.f27117i = document;
        this.f27116g = str;
        this.f27118j = sendAnimationData;
        this.f27113c = z10;
        this.d = i10;
        this.f27114e = i11;
        this.f27112b = obj;
        this.f27115f = z11;
    }
}
