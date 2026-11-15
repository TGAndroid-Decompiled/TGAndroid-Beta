package org.telegram.ui.Components;
public final class yc implements org.telegram.messenger.u10 {
    public final ChatActivityEnterView f41970a;
    public final boolean[] f41971b;
    public final ji.f f41972c;
    public final String d;

    public yc(ChatActivityEnterView chatActivityEnterView, boolean[] zArr, ji.f fVar, String str) {
        this.f41970a = chatActivityEnterView;
        this.f41971b = zArr;
        this.f41972c = fVar;
        this.d = str;
    }

    @Override
    public final void a(Object obj, Object obj2, Object obj3) {
        Boolean bool = (Boolean) obj;
        Integer num = (Integer) obj2;
        Integer num2 = (Integer) obj3;
        ChatActivityEnterView chatActivityEnterView = this.f41970a;
        uc ucVar = chatActivityEnterView.X5;
        boolean[] zArr = this.f41971b;
        boolean z10 = false;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        chatActivityEnterView.N0 = System.currentTimeMillis();
        this.f41972c.run();
        long n22 = chatActivityEnterView.n2(this.d, new org.telegram.ui.ActionBar.m5(chatActivityEnterView, bool, num, num2, 18));
        if (num.intValue() == 0) {
            z10 = true;
        }
        chatActivityEnterView.W5 = z10;
        org.telegram.messenger.g0.r(ucVar);
        org.telegram.messenger.g0.i3(ucVar, n22 + 500);
    }
}
