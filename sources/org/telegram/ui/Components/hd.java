package org.telegram.ui.Components;
public final class hd implements org.telegram.messenger.t10 {
    public final ChatActivityEnterView f35820a;
    public final boolean[] f35821b;
    public final ji.h f35822c;
    public final String d;

    public hd(ChatActivityEnterView chatActivityEnterView, boolean[] zArr, ji.h hVar, String str) {
        this.f35820a = chatActivityEnterView;
        this.f35821b = zArr;
        this.f35822c = hVar;
        this.d = str;
    }

    @Override
    public final void a(Object obj, Object obj2, Object obj3) {
        Boolean bool = (Boolean) obj;
        Integer num = (Integer) obj2;
        Integer num2 = (Integer) obj3;
        ChatActivityEnterView chatActivityEnterView = this.f35820a;
        td tdVar = chatActivityEnterView.f32586f6;
        boolean[] zArr = this.f35821b;
        boolean z10 = false;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        chatActivityEnterView.N0 = System.currentTimeMillis();
        this.f35822c.run();
        long A2 = chatActivityEnterView.A2(this.d, new org.telegram.messenger.camera.i(chatActivityEnterView, bool, num, num2, 22));
        if (num.intValue() == 0) {
            z10 = true;
        }
        chatActivityEnterView.f32577e6 = z10;
        org.telegram.messenger.g0.r(tdVar);
        org.telegram.messenger.g0.h3(tdVar, A2 + 500);
    }
}
