package org.telegram.ui.Components;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class fe implements Utilities.Callback {
    public final int f22987a = 0;
    public final Object f22988b;
    public final boolean f22989c;
    public final int d;
    public final int e;
    public final boolean f22990f;
    public final String f22991g;
    public final Object h;
    public final Object f22992i;
    public final Object f22993j;

    public fe(jg jgVar, Object obj, MediaController.PhotoEntry photoEntry, boolean z10, int i10, int i11, boolean z11, String str, Object obj2) {
        this.h = jgVar;
        this.f22988b = obj;
        this.f22992i = photoEntry;
        this.f22989c = z10;
        this.d = i10;
        this.e = i11;
        this.f22990f = z11;
        this.f22991g = str;
        this.f22993j = obj2;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f22987a;
        Object obj2 = this.f22992i;
        Object obj3 = this.h;
        switch (i10) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj3;
                int i11 = ChatActivityEnterView.f20816m5;
                pd pdVar = new pd(chatActivityEnterView, (TLRPC.Document) obj2, this.f22991g, (MessageObject.SendAnimationData) this.f22993j, this.f22989c, this.d, this.e, this.f22988b, (Long) obj, this.f22990f);
                if (!chatActivityEnterView.r1(pdVar)) {
                    pdVar.run();
                    return;
                }
                return;
            default:
                jg jgVar = (jg) obj3;
                pd pdVar2 = new pd(jgVar, this.f22988b, (MediaController.PhotoEntry) obj2, this.f22989c, this.d, this.e, this.f22990f, (Long) obj, this.f22991g, this.f22993j);
                if (!jgVar.f24397a.r1(pdVar2)) {
                    pdVar2.run();
                    return;
                }
                return;
        }
    }

    public fe(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, MessageObject.SendAnimationData sendAnimationData, boolean z10, int i10, int i11, Object obj, boolean z11) {
        this.h = chatActivityEnterView;
        this.f22992i = document;
        this.f22991g = str;
        this.f22993j = sendAnimationData;
        this.f22989c = z10;
        this.d = i10;
        this.e = i11;
        this.f22988b = obj;
        this.f22990f = z11;
    }
}
