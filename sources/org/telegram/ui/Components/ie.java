package org.telegram.ui.Components;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class ie implements Utilities.Callback {
    public final int f27428a = 0;
    public final Object f27429b;
    public final boolean f27430c;
    public final int d;
    public final int f27431e;
    public final boolean f27432f;
    public final String f27433g;
    public final Object h;
    public final Object f27434i;
    public final Object f27435j;

    public ie(jg jgVar, Object obj, MediaController.PhotoEntry photoEntry, boolean z10, int i10, int i11, boolean z11, String str, Object obj2) {
        this.h = jgVar;
        this.f27429b = obj;
        this.f27434i = photoEntry;
        this.f27430c = z10;
        this.d = i10;
        this.f27431e = i11;
        this.f27432f = z11;
        this.f27433g = str;
        this.f27435j = obj2;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f27428a;
        Object obj2 = this.f27434i;
        Object obj3 = this.h;
        switch (i10) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj3;
                int i11 = ChatActivityEnterView.f23878n5;
                ud udVar = new ud(chatActivityEnterView, (TLRPC.Document) obj2, this.f27433g, (MessageObject.SendAnimationData) this.f27435j, this.f27430c, this.d, this.f27431e, this.f27429b, (Long) obj, this.f27432f);
                if (!chatActivityEnterView.p1(udVar)) {
                    udVar.run();
                    return;
                }
                return;
            default:
                jg jgVar = (jg) obj3;
                ud udVar2 = new ud(jgVar, this.f27429b, (MediaController.PhotoEntry) obj2, this.f27430c, this.d, this.f27431e, this.f27432f, (Long) obj, this.f27433g, this.f27435j);
                if (!jgVar.f27725a.p1(udVar2)) {
                    udVar2.run();
                    return;
                }
                return;
        }
    }

    public ie(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, MessageObject.SendAnimationData sendAnimationData, boolean z10, int i10, int i11, Object obj, boolean z11) {
        this.h = chatActivityEnterView;
        this.f27434i = document;
        this.f27433g = str;
        this.f27435j = sendAnimationData;
        this.f27430c = z10;
        this.d = i10;
        this.f27431e = i11;
        this.f27429b = obj;
        this.f27432f = z11;
    }
}
