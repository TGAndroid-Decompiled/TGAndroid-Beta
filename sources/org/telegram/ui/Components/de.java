package org.telegram.ui.Components;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class de implements Utilities.Callback {
    public final int f23334a = 0;
    public final Object f23335b;
    public final boolean f23336c;
    public final int d;
    public final int e;
    public final boolean f23337f;
    public final String f23338g;
    public final Object h;
    public final Object f23339i;
    public final Object f23340j;

    public de(fg fgVar, Object obj, MediaController.PhotoEntry photoEntry, boolean z10, int i10, int i11, boolean z11, String str, Object obj2) {
        this.h = fgVar;
        this.f23335b = obj;
        this.f23339i = photoEntry;
        this.f23336c = z10;
        this.d = i10;
        this.e = i11;
        this.f23337f = z11;
        this.f23338g = str;
        this.f23340j = obj2;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f23334a;
        Object obj2 = this.f23339i;
        Object obj3 = this.h;
        switch (i10) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj3;
                int i11 = ChatActivityEnterView.f21741m5;
                pd pdVar = new pd(chatActivityEnterView, (TLRPC.Document) obj2, this.f23338g, (MessageObject.SendAnimationData) this.f23340j, this.f23336c, this.d, this.e, this.f23335b, (Long) obj, this.f23337f);
                if (!chatActivityEnterView.q1(pdVar)) {
                    pdVar.run();
                    return;
                }
                return;
            default:
                fg fgVar = (fg) obj3;
                pd pdVar2 = new pd(fgVar, this.f23335b, (MediaController.PhotoEntry) obj2, this.f23336c, this.d, this.e, this.f23337f, (Long) obj, this.f23338g, this.f23340j);
                if (!fgVar.f23908a.q1(pdVar2)) {
                    pdVar2.run();
                    return;
                }
                return;
        }
    }

    public de(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, MessageObject.SendAnimationData sendAnimationData, boolean z10, int i10, int i11, Object obj, boolean z11) {
        this.h = chatActivityEnterView;
        this.f23339i = document;
        this.f23338g = str;
        this.f23340j = sendAnimationData;
        this.f23336c = z10;
        this.d = i10;
        this.e = i11;
        this.f23335b = obj;
        this.f23337f = z11;
    }
}
