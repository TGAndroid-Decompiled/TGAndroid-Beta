package org.telegram.ui.Components;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class de implements Utilities.Callback {
    public final int f23307a = 0;
    public final Object f23308b;
    public final boolean f23309c;
    public final int d;
    public final int e;
    public final boolean f23310f;
    public final String f23311g;
    public final Object h;
    public final Object f23312i;
    public final Object f23313j;

    public de(fg fgVar, Object obj, MediaController.PhotoEntry photoEntry, boolean z10, int i10, int i11, boolean z11, String str, Object obj2) {
        this.h = fgVar;
        this.f23308b = obj;
        this.f23312i = photoEntry;
        this.f23309c = z10;
        this.d = i10;
        this.e = i11;
        this.f23310f = z11;
        this.f23311g = str;
        this.f23313j = obj2;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f23307a;
        Object obj2 = this.f23312i;
        Object obj3 = this.h;
        switch (i10) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj3;
                int i11 = ChatActivityEnterView.f21731m5;
                pd pdVar = new pd(chatActivityEnterView, (TLRPC.Document) obj2, this.f23311g, (MessageObject.SendAnimationData) this.f23313j, this.f23309c, this.d, this.e, this.f23308b, (Long) obj, this.f23310f);
                if (!chatActivityEnterView.q1(pdVar)) {
                    pdVar.run();
                    return;
                }
                return;
            default:
                fg fgVar = (fg) obj3;
                pd pdVar2 = new pd(fgVar, this.f23308b, (MediaController.PhotoEntry) obj2, this.f23309c, this.d, this.e, this.f23310f, (Long) obj, this.f23311g, this.f23313j);
                if (!fgVar.f23929a.q1(pdVar2)) {
                    pdVar2.run();
                    return;
                }
                return;
        }
    }

    public de(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, MessageObject.SendAnimationData sendAnimationData, boolean z10, int i10, int i11, Object obj, boolean z11) {
        this.h = chatActivityEnterView;
        this.f23312i = document;
        this.f23311g = str;
        this.f23313j = sendAnimationData;
        this.f23309c = z10;
        this.d = i10;
        this.e = i11;
        this.f23308b = obj;
        this.f23310f = z11;
    }
}
