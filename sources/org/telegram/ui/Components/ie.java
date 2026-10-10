package org.telegram.ui.Components;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class ie implements Utilities.Callback {
    public final int f27369a = 0;
    public final Object f27370b;
    public final boolean f27371c;
    public final int d;
    public final int f27372e;
    public final boolean f27373f;
    public final String f27374g;
    public final Object h;
    public final Object f27375i;
    public final Object f27376j;

    public ie(jg jgVar, Object obj, MediaController.PhotoEntry photoEntry, boolean z10, int i10, int i11, boolean z11, String str, Object obj2) {
        this.h = jgVar;
        this.f27370b = obj;
        this.f27375i = photoEntry;
        this.f27371c = z10;
        this.d = i10;
        this.f27372e = i11;
        this.f27373f = z11;
        this.f27374g = str;
        this.f27376j = obj2;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f27369a;
        Object obj2 = this.f27375i;
        Object obj3 = this.h;
        switch (i10) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj3;
                int i11 = ChatActivityEnterView.f23854n5;
                ud udVar = new ud(chatActivityEnterView, (TLRPC.Document) obj2, this.f27374g, (MessageObject.SendAnimationData) this.f27376j, this.f27371c, this.d, this.f27372e, this.f27370b, (Long) obj, this.f27373f);
                if (!chatActivityEnterView.p1(udVar)) {
                    udVar.run();
                    return;
                }
                return;
            default:
                jg jgVar = (jg) obj3;
                ud udVar2 = new ud(jgVar, this.f27370b, (MediaController.PhotoEntry) obj2, this.f27371c, this.d, this.f27372e, this.f27373f, (Long) obj, this.f27374g, this.f27376j);
                if (!jgVar.f27672a.p1(udVar2)) {
                    udVar2.run();
                    return;
                }
                return;
        }
    }

    public ie(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, MessageObject.SendAnimationData sendAnimationData, boolean z10, int i10, int i11, Object obj, boolean z11) {
        this.h = chatActivityEnterView;
        this.f27375i = document;
        this.f27374g = str;
        this.f27376j = sendAnimationData;
        this.f27371c = z10;
        this.d = i10;
        this.f27372e = i11;
        this.f27370b = obj;
        this.f27373f = z11;
    }
}
