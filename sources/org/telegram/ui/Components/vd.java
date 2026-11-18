package org.telegram.ui.Components;

import org.telegram.tgnet.tl.TL_iv;
public final class vd implements org.telegram.messenger.u10 {
    public final int f40592a;
    public final ChatActivityEnterView f40593b;
    public final long f40594c;
    public final org.telegram.ui.ActionBar.i6 d;

    public vd(ChatActivityEnterView chatActivityEnterView, long j3, org.telegram.ui.ActionBar.i6 i6Var, int i7) {
        this.f40592a = i7;
        this.f40593b = chatActivityEnterView;
        this.f40594c = j3;
        this.d = i6Var;
    }

    @Override
    public final void a(Object obj, Object obj2, Object obj3, Object obj4) {
        int i7 = this.f40592a;
        org.telegram.ui.ActionBar.i6 i6Var = this.d;
        long j3 = this.f40594c;
        switch (i7) {
            case 0:
                Integer num = (Integer) obj2;
                Integer num2 = (Integer) obj3;
                Boolean bool = (Boolean) obj4;
                int i10 = ChatActivityEnterView.f32538n7;
                ChatActivityEnterView chatActivityEnterView = this.f40593b;
                chatActivityEnterView.p1((TL_iv.RichMessage) obj);
                if (chatActivityEnterView.c() && num.intValue() == 0) {
                    b5.J(chatActivityEnterView.C3, j3, new je(chatActivityEnterView, 0), i6Var);
                    return;
                } else {
                    chatActivityEnterView.s1(bool.booleanValue(), num.intValue(), num2.intValue(), 0L, true);
                    return;
                }
            default:
                Integer num3 = (Integer) obj2;
                Integer num4 = (Integer) obj3;
                Boolean bool2 = (Boolean) obj4;
                ChatActivityEnterView chatActivityEnterView2 = this.f40593b;
                chatActivityEnterView2.F0.setText((CharSequence) obj);
                if (chatActivityEnterView2.N2 != null) {
                    chatActivityEnterView2.q0();
                    return;
                } else if (chatActivityEnterView2.c() && num3.intValue() == 0) {
                    b5.J(chatActivityEnterView2.C3, j3, new ke(chatActivityEnterView2, 0), i6Var);
                    return;
                } else {
                    chatActivityEnterView2.s1(bool2.booleanValue(), num3.intValue(), num4.intValue(), 0L, true);
                    return;
                }
        }
    }
}
