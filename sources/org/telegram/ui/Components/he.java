package org.telegram.ui.Components;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class he implements Utilities.Callback {
    public final int f24844a = 0;
    public final Object f24845b;
    public final boolean f24846c;
    public final int d;
    public final int e;
    public final boolean f24847f;
    public final String f24848g;
    public final Object h;
    public final Object f24849i;
    public final Object f24850j;

    public he(ig igVar, Object obj, MediaController.PhotoEntry photoEntry, boolean z10, int i10, int i11, boolean z11, String str, Object obj2) {
        this.h = igVar;
        this.f24845b = obj;
        this.f24849i = photoEntry;
        this.f24846c = z10;
        this.d = i10;
        this.e = i11;
        this.f24847f = z11;
        this.f24848g = str;
        this.f24850j = obj2;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f24844a;
        Object obj2 = this.f24849i;
        Object obj3 = this.h;
        switch (i10) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj3;
                int i11 = ChatActivityEnterView.f21974n5;
                td tdVar = new td(chatActivityEnterView, (TLRPC.Document) obj2, this.f24848g, (MessageObject.SendAnimationData) this.f24850j, this.f24846c, this.d, this.e, this.f24845b, (Long) obj, this.f24847f);
                if (!chatActivityEnterView.r1(tdVar)) {
                    tdVar.run();
                    return;
                }
                return;
            default:
                ig igVar = (ig) obj3;
                td tdVar2 = new td(igVar, this.f24845b, (MediaController.PhotoEntry) obj2, this.f24846c, this.d, this.e, this.f24847f, (Long) obj, this.f24848g, this.f24850j);
                if (!igVar.f25111a.r1(tdVar2)) {
                    tdVar2.run();
                    return;
                }
                return;
        }
    }

    public he(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, MessageObject.SendAnimationData sendAnimationData, boolean z10, int i10, int i11, Object obj, boolean z11) {
        this.h = chatActivityEnterView;
        this.f24849i = document;
        this.f24848g = str;
        this.f24850j = sendAnimationData;
        this.f24846c = z10;
        this.d = i10;
        this.e = i11;
        this.f24845b = obj;
        this.f24847f = z11;
    }
}
