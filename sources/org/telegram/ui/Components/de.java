package org.telegram.ui.Components;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class de implements Utilities.Callback {
    public final int f23337a = 0;
    public final Object f23338b;
    public final boolean f23339c;
    public final int d;
    public final int e;
    public final boolean f23340f;
    public final String f23341g;
    public final Object h;
    public final Object f23342i;
    public final Object f23343j;

    public de(fg fgVar, Object obj, MediaController.PhotoEntry photoEntry, boolean z10, int i10, int i11, boolean z11, String str, Object obj2) {
        this.h = fgVar;
        this.f23338b = obj;
        this.f23342i = photoEntry;
        this.f23339c = z10;
        this.d = i10;
        this.e = i11;
        this.f23340f = z11;
        this.f23341g = str;
        this.f23343j = obj2;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f23337a;
        Object obj2 = this.f23342i;
        Object obj3 = this.h;
        switch (i10) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj3;
                int i11 = ChatActivityEnterView.f21743n5;
                pd pdVar = new pd(chatActivityEnterView, (TLRPC.Document) obj2, this.f23341g, (MessageObject.SendAnimationData) this.f23343j, this.f23339c, this.d, this.e, this.f23338b, (Long) obj, this.f23340f);
                if (!chatActivityEnterView.r1(pdVar)) {
                    pdVar.run();
                    return;
                }
                return;
            default:
                fg fgVar = (fg) obj3;
                pd pdVar2 = new pd(fgVar, this.f23338b, (MediaController.PhotoEntry) obj2, this.f23339c, this.d, this.e, this.f23340f, (Long) obj, this.f23341g, this.f23343j);
                if (!fgVar.f23911a.r1(pdVar2)) {
                    pdVar2.run();
                    return;
                }
                return;
        }
    }

    public de(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, MessageObject.SendAnimationData sendAnimationData, boolean z10, int i10, int i11, Object obj, boolean z11) {
        this.h = chatActivityEnterView;
        this.f23342i = document;
        this.f23341g = str;
        this.f23343j = sendAnimationData;
        this.f23339c = z10;
        this.d = i10;
        this.e = i11;
        this.f23338b = obj;
        this.f23340f = z11;
    }
}
