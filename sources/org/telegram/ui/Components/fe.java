package org.telegram.ui.Components;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class fe implements Utilities.Callback {
    public final int f24205a = 0;
    public final Object f24206b;
    public final boolean f24207c;
    public final int d;
    public final int e;
    public final boolean f24208f;
    public final String f24209g;
    public final Object h;
    public final Object f24210i;
    public final Object f24211j;

    public fe(gg ggVar, Object obj, MediaController.PhotoEntry photoEntry, boolean z10, int i10, int i11, boolean z11, String str, Object obj2) {
        this.h = ggVar;
        this.f24206b = obj;
        this.f24210i = photoEntry;
        this.f24207c = z10;
        this.d = i10;
        this.e = i11;
        this.f24208f = z11;
        this.f24209g = str;
        this.f24211j = obj2;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f24205a;
        Object obj2 = this.f24210i;
        Object obj3 = this.h;
        switch (i10) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj3;
                int i11 = ChatActivityEnterView.f21967n5;
                rd rdVar = new rd(chatActivityEnterView, (TLRPC.Document) obj2, this.f24209g, (MessageObject.SendAnimationData) this.f24211j, this.f24207c, this.d, this.e, this.f24206b, (Long) obj, this.f24208f);
                if (!chatActivityEnterView.q1(rdVar)) {
                    rdVar.run();
                    return;
                }
                return;
            default:
                gg ggVar = (gg) obj3;
                rd rdVar2 = new rd(ggVar, this.f24206b, (MediaController.PhotoEntry) obj2, this.f24207c, this.d, this.e, this.f24208f, (Long) obj, this.f24209g, this.f24211j);
                if (!ggVar.f24517a.q1(rdVar2)) {
                    rdVar2.run();
                    return;
                }
                return;
        }
    }

    public fe(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, MessageObject.SendAnimationData sendAnimationData, boolean z10, int i10, int i11, Object obj, boolean z11) {
        this.h = chatActivityEnterView;
        this.f24210i = document;
        this.f24209g = str;
        this.f24211j = sendAnimationData;
        this.f24207c = z10;
        this.d = i10;
        this.e = i11;
        this.f24206b = obj;
        this.f24208f = z11;
    }
}
