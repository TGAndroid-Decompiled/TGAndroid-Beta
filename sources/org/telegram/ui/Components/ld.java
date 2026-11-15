package org.telegram.ui.Components;

import org.telegram.tgnet.tl.TL_iv;
public final class ld implements org.telegram.messenger.w10 {
    public final int f36752a;
    public final ChatActivityEnterView f36753b;
    public final long f36754c;
    public final org.telegram.ui.ActionBar.e6 d;

    public ld(ChatActivityEnterView chatActivityEnterView, long j3, org.telegram.ui.ActionBar.e6 e6Var, int i7) {
        this.f36752a = i7;
        this.f36753b = chatActivityEnterView;
        this.f36754c = j3;
        this.d = e6Var;
    }

    @Override
    public final void a(Object obj, Object obj2, Object obj3, Object obj4) {
        int i7 = this.f36752a;
        org.telegram.ui.ActionBar.e6 e6Var = this.d;
        long j3 = this.f36754c;
        switch (i7) {
            case 0:
                Integer num = (Integer) obj2;
                Integer num2 = (Integer) obj3;
                Boolean bool = (Boolean) obj4;
                int i10 = ChatActivityEnterView.N6;
                ChatActivityEnterView chatActivityEnterView = this.f36753b;
                chatActivityEnterView.h1((TL_iv.RichMessage) obj);
                if (chatActivityEnterView.c() && num.intValue() == 0) {
                    t4.J(chatActivityEnterView.f32311w3, j3, new ae(chatActivityEnterView, 0), e6Var);
                    return;
                } else {
                    chatActivityEnterView.k1(bool.booleanValue(), num.intValue(), num2.intValue(), 0L, true);
                    return;
                }
            default:
                Integer num3 = (Integer) obj2;
                Integer num4 = (Integer) obj3;
                Boolean bool2 = (Boolean) obj4;
                ChatActivityEnterView chatActivityEnterView2 = this.f36753b;
                chatActivityEnterView2.F0.setText((CharSequence) obj);
                if (chatActivityEnterView2.H2 != null) {
                    chatActivityEnterView2.j0();
                    return;
                } else if (chatActivityEnterView2.c() && num3.intValue() == 0) {
                    t4.J(chatActivityEnterView2.f32311w3, j3, new be(chatActivityEnterView2, 0), e6Var);
                    return;
                } else {
                    chatActivityEnterView2.k1(bool2.booleanValue(), num3.intValue(), num4.intValue(), 0L, true);
                    return;
                }
        }
    }
}
