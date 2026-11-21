package org.telegram.ui.Components;
public final class hd implements org.telegram.messenger.s10 {
    public final ChatActivityEnterView f35874a;
    public final boolean[] f35875b;
    public final ji.h f35876c;
    public final String d;

    public hd(ChatActivityEnterView chatActivityEnterView, boolean[] zArr, ji.h hVar, String str) {
        this.f35874a = chatActivityEnterView;
        this.f35875b = zArr;
        this.f35876c = hVar;
        this.d = str;
    }

    @Override
    public final void a(Object obj, Object obj2, Object obj3) {
        Boolean bool = (Boolean) obj;
        Integer num = (Integer) obj2;
        Integer num2 = (Integer) obj3;
        ChatActivityEnterView chatActivityEnterView = this.f35874a;
        td tdVar = chatActivityEnterView.f32617f6;
        boolean[] zArr = this.f35875b;
        boolean z10 = false;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        chatActivityEnterView.N0 = System.currentTimeMillis();
        this.f35876c.run();
        long A2 = chatActivityEnterView.A2(this.d, new org.telegram.messenger.camera.i(chatActivityEnterView, bool, num, num2, 22));
        if (num.intValue() == 0) {
            z10 = true;
        }
        chatActivityEnterView.f32608e6 = z10;
        org.telegram.messenger.g0.r(tdVar);
        org.telegram.messenger.g0.h3(tdVar, A2 + 500);
    }
}
