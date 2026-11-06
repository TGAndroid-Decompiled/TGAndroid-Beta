package org.telegram.ui.Components;

import org.telegram.tgnet.tl.TL_iv;
public final class md implements org.telegram.messenger.z10 {
    public final int f35943a;
    public final ChatActivityEnterView f35944b;
    public final long f35945c;
    public final org.telegram.ui.ActionBar.f6 d;

    public md(ChatActivityEnterView chatActivityEnterView, long j3, org.telegram.ui.ActionBar.f6 f6Var, int i7) {
        this.f35943a = i7;
        this.f35944b = chatActivityEnterView;
        this.f35945c = j3;
        this.d = f6Var;
    }

    @Override
    public final void a(Object obj, Object obj2, Object obj3, Object obj4) {
        int i7 = this.f35943a;
        org.telegram.ui.ActionBar.f6 f6Var = this.d;
        long j3 = this.f35945c;
        switch (i7) {
            case 0:
                Integer num = (Integer) obj2;
                Integer num2 = (Integer) obj3;
                Boolean bool = (Boolean) obj4;
                int i10 = ChatActivityEnterView.s5;
                ChatActivityEnterView chatActivityEnterView = this.f35944b;
                chatActivityEnterView.Q0((TL_iv.RichMessage) obj);
                if (chatActivityEnterView.c() && num.intValue() == 0) {
                    v4.J(chatActivityEnterView.O2, j3, new zd(chatActivityEnterView, 0), f6Var);
                    return;
                } else {
                    chatActivityEnterView.T0(bool.booleanValue(), num.intValue(), num2.intValue(), 0L, true);
                    return;
                }
            default:
                Integer num3 = (Integer) obj2;
                Integer num4 = (Integer) obj3;
                Boolean bool2 = (Boolean) obj4;
                ChatActivityEnterView chatActivityEnterView2 = this.f35944b;
                chatActivityEnterView2.E0.setText((CharSequence) obj);
                if (chatActivityEnterView2.Z1 != null) {
                    chatActivityEnterView2.a0();
                    return;
                } else if (chatActivityEnterView2.c() && num3.intValue() == 0) {
                    v4.J(chatActivityEnterView2.O2, j3, new ae(chatActivityEnterView2, 0), f6Var);
                    return;
                } else {
                    chatActivityEnterView2.T0(bool2.booleanValue(), num3.intValue(), num4.intValue(), 0L, true);
                    return;
                }
        }
    }
}
