package org.telegram.ui.Components;
public final class hd implements org.telegram.messenger.r10 {
    public final ChatActivityEnterView f35712a;
    public final boolean[] f35713b;
    public final ji.i f35714c;
    public final String d;

    public hd(ChatActivityEnterView chatActivityEnterView, boolean[] zArr, ji.i iVar, String str) {
        this.f35712a = chatActivityEnterView;
        this.f35713b = zArr;
        this.f35714c = iVar;
        this.d = str;
    }

    @Override
    public final void a(Object obj, Object obj2, Object obj3) {
        Boolean bool = (Boolean) obj;
        Integer num = (Integer) obj2;
        Integer num2 = (Integer) obj3;
        ChatActivityEnterView chatActivityEnterView = this.f35712a;
        td tdVar = chatActivityEnterView.f32684f6;
        boolean[] zArr = this.f35713b;
        boolean z10 = false;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        chatActivityEnterView.N0 = System.currentTimeMillis();
        this.f35714c.run();
        long D2 = chatActivityEnterView.D2(this.d, new oi.h(chatActivityEnterView, bool, num, num2, 23));
        if (num.intValue() == 0) {
            z10 = true;
        }
        chatActivityEnterView.f32675e6 = z10;
        org.telegram.messenger.g0.r(tdVar);
        org.telegram.messenger.g0.h3(tdVar, D2 + 500);
    }
}
