package org.telegram.ui.Components;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class je implements Utilities.Callback {
    public final int f27474a = 0;
    public final Object f27475b;
    public final boolean f27476c;
    public final int d;
    public final int f27477e;
    public final boolean f27478f;
    public final String f27479g;
    public final Object h;
    public final Object f27480i;
    public final Object f27481j;

    public je(lg lgVar, Object obj, MediaController.PhotoEntry photoEntry, boolean z10, int i10, int i11, boolean z11, String str, Object obj2) {
        this.h = lgVar;
        this.f27475b = obj;
        this.f27480i = photoEntry;
        this.f27476c = z10;
        this.d = i10;
        this.f27477e = i11;
        this.f27478f = z11;
        this.f27479g = str;
        this.f27481j = obj2;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f27474a;
        Object obj2 = this.f27480i;
        Object obj3 = this.h;
        switch (i10) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj3;
                int i11 = ChatActivityEnterView.S5;
                yd ydVar = new yd(chatActivityEnterView, (TLRPC.Document) obj2, this.f27479g, (MessageObject.SendAnimationData) this.f27481j, this.f27476c, this.d, this.f27477e, this.f27475b, (Long) obj, this.f27478f);
                if (!chatActivityEnterView.t1(ydVar)) {
                    ydVar.run();
                    return;
                }
                return;
            default:
                lg lgVar = (lg) obj3;
                yd ydVar2 = new yd(lgVar, this.f27475b, (MediaController.PhotoEntry) obj2, this.f27476c, this.d, this.f27477e, this.f27478f, (Long) obj, this.f27479g, this.f27481j);
                if (!lgVar.f28173a.t1(ydVar2)) {
                    ydVar2.run();
                    return;
                }
                return;
        }
    }

    public je(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, MessageObject.SendAnimationData sendAnimationData, boolean z10, int i10, int i11, Object obj, boolean z11) {
        this.h = chatActivityEnterView;
        this.f27480i = document;
        this.f27479g = str;
        this.f27481j = sendAnimationData;
        this.f27476c = z10;
        this.d = i10;
        this.f27477e = i11;
        this.f27475b = obj;
        this.f27478f = z11;
    }
}
