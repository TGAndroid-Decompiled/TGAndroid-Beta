package org.telegram.ui.Components;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class he implements Utilities.Callback {
    public final int f27117a = 0;
    public final Object f27118b;
    public final boolean f27119c;
    public final int d;
    public final int f27120e;
    public final boolean f27121f;
    public final String f27122g;
    public final Object h;
    public final Object f27123i;
    public final Object f27124j;

    public he(ig igVar, Object obj, MediaController.PhotoEntry photoEntry, boolean z10, int i10, int i11, boolean z11, String str, Object obj2) {
        this.h = igVar;
        this.f27118b = obj;
        this.f27123i = photoEntry;
        this.f27119c = z10;
        this.d = i10;
        this.f27120e = i11;
        this.f27121f = z11;
        this.f27122g = str;
        this.f27124j = obj2;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f27117a;
        Object obj2 = this.f27123i;
        Object obj3 = this.h;
        switch (i10) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj3;
                int i11 = ChatActivityEnterView.f23851n5;
                sd sdVar = new sd(chatActivityEnterView, (TLRPC.Document) obj2, this.f27122g, (MessageObject.SendAnimationData) this.f27124j, this.f27119c, this.d, this.f27120e, this.f27118b, (Long) obj, this.f27121f);
                if (!chatActivityEnterView.q1(sdVar)) {
                    sdVar.run();
                    return;
                }
                return;
            default:
                ig igVar = (ig) obj3;
                sd sdVar2 = new sd(igVar, this.f27118b, (MediaController.PhotoEntry) obj2, this.f27119c, this.d, this.f27120e, this.f27121f, (Long) obj, this.f27122g, this.f27124j);
                if (!igVar.f27406a.q1(sdVar2)) {
                    sdVar2.run();
                    return;
                }
                return;
        }
    }

    public he(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, MessageObject.SendAnimationData sendAnimationData, boolean z10, int i10, int i11, Object obj, boolean z11) {
        this.h = chatActivityEnterView;
        this.f27123i = document;
        this.f27122g = str;
        this.f27124j = sendAnimationData;
        this.f27119c = z10;
        this.d = i10;
        this.f27120e = i11;
        this.f27118b = obj;
        this.f27121f = z11;
    }
}
