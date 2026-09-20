package org.telegram.ui.Components;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class fe implements Utilities.Callback {
    public final int f24098a = 0;
    public final Object f24099b;
    public final boolean f24100c;
    public final int d;
    public final int e;
    public final boolean f24101f;
    public final String f24102g;
    public final Object h;
    public final Object f24103i;
    public final Object f24104j;

    public fe(gg ggVar, Object obj, MediaController.PhotoEntry photoEntry, boolean z10, int i10, int i11, boolean z11, String str, Object obj2) {
        this.h = ggVar;
        this.f24099b = obj;
        this.f24103i = photoEntry;
        this.f24100c = z10;
        this.d = i10;
        this.e = i11;
        this.f24101f = z11;
        this.f24102g = str;
        this.f24104j = obj2;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f24098a;
        Object obj2 = this.f24103i;
        Object obj3 = this.h;
        switch (i10) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj3;
                int i11 = ChatActivityEnterView.f21952m5;
                rd rdVar = new rd(chatActivityEnterView, (TLRPC.Document) obj2, this.f24102g, (MessageObject.SendAnimationData) this.f24104j, this.f24100c, this.d, this.e, this.f24099b, (Long) obj, this.f24101f);
                if (!chatActivityEnterView.q1(rdVar)) {
                    rdVar.run();
                    return;
                }
                return;
            default:
                gg ggVar = (gg) obj3;
                rd rdVar2 = new rd(ggVar, this.f24099b, (MediaController.PhotoEntry) obj2, this.f24100c, this.d, this.e, this.f24101f, (Long) obj, this.f24102g, this.f24104j);
                if (!ggVar.f24351a.q1(rdVar2)) {
                    rdVar2.run();
                    return;
                }
                return;
        }
    }

    public fe(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, MessageObject.SendAnimationData sendAnimationData, boolean z10, int i10, int i11, Object obj, boolean z11) {
        this.h = chatActivityEnterView;
        this.f24103i = document;
        this.f24102g = str;
        this.f24104j = sendAnimationData;
        this.f24100c = z10;
        this.d = i10;
        this.e = i11;
        this.f24099b = obj;
        this.f24101f = z11;
    }
}
