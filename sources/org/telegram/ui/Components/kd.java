package org.telegram.ui.Components;

import org.telegram.tgnet.tl.TL_iv;
public final class kd implements org.telegram.messenger.r10 {
    public final int f35368a;
    public final ChatActivityEnterView f35369b;
    public final long f35370c;
    public final org.telegram.ui.ActionBar.e6 d;

    public kd(ChatActivityEnterView chatActivityEnterView, long j10, org.telegram.ui.ActionBar.e6 e6Var, int i3) {
        this.f35368a = i3;
        this.f35369b = chatActivityEnterView;
        this.f35370c = j10;
        this.d = e6Var;
    }

    @Override
    public final void a(Object obj, Object obj2, Object obj3, Object obj4) {
        int i3 = this.f35368a;
        org.telegram.ui.ActionBar.e6 e6Var = this.d;
        long j10 = this.f35370c;
        switch (i3) {
            case 0:
                Integer num = (Integer) obj2;
                Integer num2 = (Integer) obj3;
                Boolean bool = (Boolean) obj4;
                int i10 = ChatActivityEnterView.f31082t5;
                ChatActivityEnterView chatActivityEnterView = this.f35369b;
                chatActivityEnterView.P0((TL_iv.RichMessage) obj);
                if (chatActivityEnterView.c() && num.intValue() == 0) {
                    t4.L(chatActivityEnterView.P2, j10, new xd(chatActivityEnterView, 0), e6Var);
                    return;
                } else {
                    chatActivityEnterView.S0(bool.booleanValue(), num.intValue(), num2.intValue(), 0L, true);
                    return;
                }
            default:
                Integer num3 = (Integer) obj2;
                Integer num4 = (Integer) obj3;
                Boolean bool2 = (Boolean) obj4;
                ChatActivityEnterView chatActivityEnterView2 = this.f35369b;
                chatActivityEnterView2.F0.setText((CharSequence) obj);
                if (chatActivityEnterView2.f31086a2 != null) {
                    chatActivityEnterView2.a0();
                    return;
                } else if (chatActivityEnterView2.c() && num3.intValue() == 0) {
                    t4.L(chatActivityEnterView2.P2, j10, new yd(chatActivityEnterView2, 0), e6Var);
                    return;
                } else {
                    chatActivityEnterView2.S0(bool2.booleanValue(), num3.intValue(), num4.intValue(), 0L, true);
                    return;
                }
        }
    }
}
