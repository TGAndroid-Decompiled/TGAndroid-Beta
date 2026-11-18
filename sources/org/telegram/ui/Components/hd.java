package org.telegram.ui.Components;
public final class hd implements org.telegram.messenger.s10 {
    public final ChatActivityEnterView f35850a;
    public final boolean[] f35851b;
    public final ji.f f35852c;
    public final String d;

    public hd(ChatActivityEnterView chatActivityEnterView, boolean[] zArr, ji.f fVar, String str) {
        this.f35850a = chatActivityEnterView;
        this.f35851b = zArr;
        this.f35852c = fVar;
        this.d = str;
    }

    @Override
    public final void a(Object obj, Object obj2, Object obj3) {
        Boolean bool = (Boolean) obj;
        Integer num = (Integer) obj2;
        Integer num2 = (Integer) obj3;
        ChatActivityEnterView chatActivityEnterView = this.f35850a;
        td tdVar = chatActivityEnterView.f32571d6;
        boolean[] zArr = this.f35851b;
        boolean z10 = false;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        chatActivityEnterView.N0 = System.currentTimeMillis();
        this.f35852c.run();
        long x22 = chatActivityEnterView.x2(this.d, new org.telegram.messenger.camera.i(chatActivityEnterView, bool, num, num2, 22));
        if (num.intValue() == 0) {
            z10 = true;
        }
        chatActivityEnterView.f32564c6 = z10;
        org.telegram.messenger.g0.r(tdVar);
        org.telegram.messenger.g0.h3(tdVar, x22 + 500);
    }
}
