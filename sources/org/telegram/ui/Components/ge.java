package org.telegram.ui.Components;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class ge implements Utilities.Callback {
    public final int f24430a = 0;
    public final Object f24431b;
    public final boolean f24432c;
    public final int d;
    public final int e;
    public final boolean f24433f;
    public final String f24434g;
    public final Object h;
    public final Object f24435i;
    public final Object f24436j;

    public ge(hg hgVar, Object obj, MediaController.PhotoEntry photoEntry, boolean z10, int i10, int i11, boolean z11, String str, Object obj2) {
        this.h = hgVar;
        this.f24431b = obj;
        this.f24435i = photoEntry;
        this.f24432c = z10;
        this.d = i10;
        this.e = i11;
        this.f24433f = z11;
        this.f24434g = str;
        this.f24436j = obj2;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f24430a;
        Object obj2 = this.f24435i;
        Object obj3 = this.h;
        switch (i10) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj3;
                int i11 = ChatActivityEnterView.f21938n5;
                sd sdVar = new sd(chatActivityEnterView, (TLRPC.Document) obj2, this.f24434g, (MessageObject.SendAnimationData) this.f24436j, this.f24432c, this.d, this.e, this.f24431b, (Long) obj, this.f24433f);
                if (!chatActivityEnterView.r1(sdVar)) {
                    sdVar.run();
                    return;
                }
                return;
            default:
                hg hgVar = (hg) obj3;
                sd sdVar2 = new sd(hgVar, this.f24431b, (MediaController.PhotoEntry) obj2, this.f24432c, this.d, this.e, this.f24433f, (Long) obj, this.f24434g, this.f24436j);
                if (!hgVar.f24738a.r1(sdVar2)) {
                    sdVar2.run();
                    return;
                }
                return;
        }
    }

    public ge(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, MessageObject.SendAnimationData sendAnimationData, boolean z10, int i10, int i11, Object obj, boolean z11) {
        this.h = chatActivityEnterView;
        this.f24435i = document;
        this.f24434g = str;
        this.f24436j = sendAnimationData;
        this.f24432c = z10;
        this.d = i10;
        this.e = i11;
        this.f24431b = obj;
        this.f24433f = z11;
    }
}
