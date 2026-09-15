package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_iv;
public final class be implements Utilities.Callback4 {
    public final int f22769a;
    public final ChatActivityEnterView f22770b;
    public final long f22771c;
    public final org.telegram.ui.ActionBar.e6 d;

    public be(ChatActivityEnterView chatActivityEnterView, long j3, org.telegram.ui.ActionBar.e6 e6Var, int i10) {
        this.f22769a = i10;
        this.f22770b = chatActivityEnterView;
        this.f22771c = j3;
        this.d = e6Var;
    }

    @Override
    public final void run(Object obj, Object obj2, Object obj3, Object obj4) {
        int i10 = this.f22769a;
        org.telegram.ui.ActionBar.e6 e6Var = this.d;
        long j3 = this.f22771c;
        switch (i10) {
            case 0:
                Integer num = (Integer) obj2;
                Integer num2 = (Integer) obj3;
                Boolean bool = (Boolean) obj4;
                int i11 = ChatActivityEnterView.f21731m5;
                ChatActivityEnterView chatActivityEnterView = this.f22770b;
                chatActivityEnterView.Q0((TL_iv.RichMessage) obj);
                if (chatActivityEnterView.c() && num.intValue() == 0) {
                    c5.M(chatActivityEnterView.N2, j3, new oe(chatActivityEnterView, 0), e6Var);
                    return;
                }
                chatActivityEnterView.T0(num.intValue(), bool.booleanValue(), num2.intValue(), true, 0L);
                return;
            default:
                Integer num3 = (Integer) obj2;
                Integer num4 = (Integer) obj3;
                Boolean bool2 = (Boolean) obj4;
                ChatActivityEnterView chatActivityEnterView2 = this.f22770b;
                chatActivityEnterView2.E0.setText((CharSequence) obj);
                if (chatActivityEnterView2.Y1 != null) {
                    chatActivityEnterView2.d0();
                    return;
                } else if (chatActivityEnterView2.c() && num3.intValue() == 0) {
                    c5.M(chatActivityEnterView2.N2, j3, new pe(chatActivityEnterView2), e6Var);
                    return;
                } else {
                    chatActivityEnterView2.T0(num3.intValue(), bool2.booleanValue(), num4.intValue(), true, 0L);
                    return;
                }
        }
    }
}
