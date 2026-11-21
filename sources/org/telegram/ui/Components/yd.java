package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class yd implements org.telegram.messenger.x10 {
    public final int f42420a = 0;
    public final Object f42421b;
    public final boolean f42422c;
    public final int d;
    public final int f42423e;
    public final boolean f42424f;
    public final String f42425g;
    public final Object h;
    public final Object f42426i;
    public final Object f42427j;

    public yd(ig igVar, Object obj, org.telegram.messenger.ef efVar, boolean z10, int i7, int i10, boolean z11, String str, Object obj2) {
        this.h = igVar;
        this.f42421b = obj;
        this.f42426i = efVar;
        this.f42422c = z10;
        this.d = i7;
        this.f42423e = i10;
        this.f42424f = z11;
        this.f42425g = str;
        this.f42427j = obj2;
    }

    @Override
    public final void a(Object obj) {
        int i7 = this.f42420a;
        Object obj2 = this.f42426i;
        Object obj3 = this.h;
        switch (i7) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj3;
                int i10 = ChatActivityEnterView.f32566s7;
                jd jdVar = new jd(chatActivityEnterView, (TLRPC.Document) obj2, this.f42425g, (org.telegram.messenger.bj) this.f42427j, this.f42422c, this.d, this.f42423e, this.f42421b, (Long) obj, this.f42424f);
                if (!chatActivityEnterView.V1(jdVar)) {
                    jdVar.run();
                    return;
                }
                return;
            default:
                ig igVar = (ig) obj3;
                jd jdVar2 = new jd(igVar, this.f42421b, (org.telegram.messenger.ef) obj2, this.f42422c, this.d, this.f42423e, this.f42424f, (Long) obj, this.f42425g, this.f42427j);
                if (!igVar.f36252a.V1(jdVar2)) {
                    jdVar2.run();
                    return;
                }
                return;
        }
    }

    public yd(ChatActivityEnterView chatActivityEnterView, TLRPC.Document document, String str, org.telegram.messenger.bj bjVar, boolean z10, int i7, int i10, Object obj, boolean z11) {
        this.h = chatActivityEnterView;
        this.f42426i = document;
        this.f42425g = str;
        this.f42427j = bjVar;
        this.f42422c = z10;
        this.d = i7;
        this.f42423e = i10;
        this.f42421b = obj;
        this.f42424f = z11;
    }
}
