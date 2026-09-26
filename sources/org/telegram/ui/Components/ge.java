package org.telegram.ui.Components;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class ge implements Utilities.Callback {
    public final int f24475a = 0;
    public final Object f24476b;
    public final boolean f24477c;
    public final int d;
    public final int e;
    public final boolean f24478f;
    public final String f24479g;
    public final Object h;
    public final Object f24480i;
    public final Object f24481j;

    public ge(hg hgVar, Object obj, MediaController.PhotoEntry photoEntry, boolean z10, int i10, int i11, boolean z11, String str, Object obj2) {
        this.h = hgVar;
        this.f24476b = obj;
        this.f24480i = photoEntry;
        this.f24477c = z10;
        this.d = i10;
        this.e = i11;
        this.f24478f = z11;
        this.f24479g = str;
        this.f24481j = obj2;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f24475a;
        Object obj2 = this.f24480i;
        Object obj3 = this.h;
        switch (i10) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj3;
                int i11 = ChatActivityEnterView.f21952n5;
                sd sdVar = new sd(chatActivityEnterView, (TLRPC.Document) obj2, this.f24479g, (MessageObject.SendAnimationData) this.f24481j, this.f24477c, this.d, this.e, this.f24476b, (Long) obj, this.f24478f);
                if (!chatActivityEnterView.r1(sdVar)) {
                    sdVar.run();
                    return;
                }
                return;
            default:
                hg hgVar = (hg) obj3;
                sd sdVar2 = new sd(hgVar, this.f24476b, (MediaController.PhotoEntry) obj2, this.f24477c, this.d, this.e, this.f24478f, (Long) obj, this.f24479g, this.f24481j);
                if (!hgVar.f24789a.r1(sdVar2)) {
                    sdVar2.run();
                    return;
                }
                return;
        }
    }

    public ge(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, MessageObject.SendAnimationData sendAnimationData, boolean z10, int i10, int i11, Object obj, boolean z11) {
        this.h = chatActivityEnterView;
        this.f24480i = document;
        this.f24479g = str;
        this.f24481j = sendAnimationData;
        this.f24477c = z10;
        this.d = i10;
        this.e = i11;
        this.f24476b = obj;
        this.f24478f = z11;
    }
}
