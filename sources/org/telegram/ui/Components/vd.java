package org.telegram.ui.Components;

import org.telegram.tgnet.tl.TL_iv;
public final class vd implements org.telegram.messenger.t10 {
    public final int f40661a;
    public final ChatActivityEnterView f40662b;
    public final long f40663c;
    public final org.telegram.ui.ActionBar.i6 d;

    public vd(ChatActivityEnterView chatActivityEnterView, long j3, org.telegram.ui.ActionBar.i6 i6Var, int i7) {
        this.f40661a = i7;
        this.f40662b = chatActivityEnterView;
        this.f40663c = j3;
        this.d = i6Var;
    }

    @Override
    public final void a(Object obj, Object obj2, Object obj3, Object obj4) {
        int i7 = this.f40661a;
        org.telegram.ui.ActionBar.i6 i6Var = this.d;
        long j3 = this.f40663c;
        switch (i7) {
            case 0:
                Integer num = (Integer) obj2;
                Integer num2 = (Integer) obj3;
                Boolean bool = (Boolean) obj4;
                int i10 = ChatActivityEnterView.f32633s7;
                ChatActivityEnterView chatActivityEnterView = this.f40662b;
                chatActivityEnterView.u1((TL_iv.RichMessage) obj);
                if (chatActivityEnterView.c() && num.intValue() == 0) {
                    b5.J(chatActivityEnterView.E3, j3, new ke(chatActivityEnterView, 0), i6Var);
                    return;
                } else {
                    chatActivityEnterView.x1(bool.booleanValue(), num.intValue(), num2.intValue(), 0L, true);
                    return;
                }
            default:
                Integer num3 = (Integer) obj2;
                Integer num4 = (Integer) obj3;
                Boolean bool2 = (Boolean) obj4;
                ChatActivityEnterView chatActivityEnterView2 = this.f40662b;
                chatActivityEnterView2.F0.setText((CharSequence) obj);
                if (chatActivityEnterView2.P2 != null) {
                    chatActivityEnterView2.u0();
                    return;
                } else if (chatActivityEnterView2.c() && num3.intValue() == 0) {
                    b5.J(chatActivityEnterView2.E3, j3, new le(chatActivityEnterView2, 0), i6Var);
                    return;
                } else {
                    chatActivityEnterView2.x1(bool2.booleanValue(), num3.intValue(), num4.intValue(), 0L, true);
                    return;
                }
        }
    }
}
