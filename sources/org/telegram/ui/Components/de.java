package org.telegram.ui.Components;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class de implements Utilities.Callback {
    public final int f23306a = 0;
    public final Object f23307b;
    public final boolean f23308c;
    public final int d;
    public final int e;
    public final boolean f23309f;
    public final String f23310g;
    public final Object h;
    public final Object f23311i;
    public final Object f23312j;

    public de(fg fgVar, Object obj, MediaController.PhotoEntry photoEntry, boolean z10, int i10, int i11, boolean z11, String str, Object obj2) {
        this.h = fgVar;
        this.f23307b = obj;
        this.f23311i = photoEntry;
        this.f23308c = z10;
        this.d = i10;
        this.e = i11;
        this.f23309f = z11;
        this.f23310g = str;
        this.f23312j = obj2;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f23306a;
        Object obj2 = this.f23311i;
        Object obj3 = this.h;
        switch (i10) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj3;
                int i11 = ChatActivityEnterView.f21727n5;
                pd pdVar = new pd(chatActivityEnterView, (TLRPC.Document) obj2, this.f23310g, (MessageObject.SendAnimationData) this.f23312j, this.f23308c, this.d, this.e, this.f23307b, (Long) obj, this.f23309f);
                if (!chatActivityEnterView.s1(pdVar)) {
                    pdVar.run();
                    return;
                }
                return;
            default:
                fg fgVar = (fg) obj3;
                pd pdVar2 = new pd(fgVar, this.f23307b, (MediaController.PhotoEntry) obj2, this.f23308c, this.d, this.e, this.f23309f, (Long) obj, this.f23310g, this.f23312j);
                if (!fgVar.f23928a.s1(pdVar2)) {
                    pdVar2.run();
                    return;
                }
                return;
        }
    }

    public de(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, MessageObject.SendAnimationData sendAnimationData, boolean z10, int i10, int i11, Object obj, boolean z11) {
        this.h = chatActivityEnterView;
        this.f23311i = document;
        this.f23310g = str;
        this.f23312j = sendAnimationData;
        this.f23308c = z10;
        this.d = i10;
        this.e = i11;
        this.f23307b = obj;
        this.f23309f = z11;
    }
}
