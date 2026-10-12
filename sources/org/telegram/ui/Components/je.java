package org.telegram.ui.Components;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class je implements Utilities.Callback {
    public final int f27480a = 0;
    public final Object f27481b;
    public final boolean f27482c;
    public final int d;
    public final int f27483e;
    public final boolean f27484f;
    public final String f27485g;
    public final Object h;
    public final Object f27486i;
    public final Object f27487j;

    public je(lg lgVar, Object obj, MediaController.PhotoEntry photoEntry, boolean z10, int i10, int i11, boolean z11, String str, Object obj2) {
        this.h = lgVar;
        this.f27481b = obj;
        this.f27486i = photoEntry;
        this.f27482c = z10;
        this.d = i10;
        this.f27483e = i11;
        this.f27484f = z11;
        this.f27485g = str;
        this.f27487j = obj2;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f27480a;
        Object obj2 = this.f27486i;
        Object obj3 = this.h;
        switch (i10) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj3;
                int i11 = ChatActivityEnterView.Q5;
                xd xdVar = new xd(chatActivityEnterView, (TLRPC.Document) obj2, this.f27485g, (MessageObject.SendAnimationData) this.f27487j, this.f27482c, this.d, this.f27483e, this.f27481b, (Long) obj, this.f27484f);
                if (!chatActivityEnterView.t1(xdVar)) {
                    xdVar.run();
                    return;
                }
                return;
            default:
                lg lgVar = (lg) obj3;
                xd xdVar2 = new xd(lgVar, this.f27481b, (MediaController.PhotoEntry) obj2, this.f27482c, this.d, this.f27483e, this.f27484f, (Long) obj, this.f27485g, this.f27487j);
                if (!lgVar.f28188a.t1(xdVar2)) {
                    xdVar2.run();
                    return;
                }
                return;
        }
    }

    public je(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, MessageObject.SendAnimationData sendAnimationData, boolean z10, int i10, int i11, Object obj, boolean z11) {
        this.h = chatActivityEnterView;
        this.f27486i = document;
        this.f27485g = str;
        this.f27487j = sendAnimationData;
        this.f27482c = z10;
        this.d = i10;
        this.f27483e = i11;
        this.f27481b = obj;
        this.f27484f = z11;
    }
}
