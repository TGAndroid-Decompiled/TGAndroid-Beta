package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_iv;
public final class ge implements Utilities.Callback4 {
    public final int f26710a;
    public final ChatActivityEnterView f26711b;
    public final long f26712c;
    public final org.telegram.ui.ActionBar.e6 d;

    public ge(ChatActivityEnterView chatActivityEnterView, long j3, org.telegram.ui.ActionBar.e6 e6Var, int i10) {
        this.f26710a = i10;
        this.f26711b = chatActivityEnterView;
        this.f26712c = j3;
        this.d = e6Var;
    }

    @Override
    public final void run(Object obj, Object obj2, Object obj3, Object obj4) {
        int i10 = this.f26710a;
        org.telegram.ui.ActionBar.e6 e6Var = this.d;
        long j3 = this.f26712c;
        switch (i10) {
            case 0:
                Integer num = (Integer) obj2;
                Integer num2 = (Integer) obj3;
                Boolean bool = (Boolean) obj4;
                int i11 = ChatActivityEnterView.f23854n5;
                ChatActivityEnterView chatActivityEnterView = this.f26711b;
                chatActivityEnterView.O0((TL_iv.RichMessage) obj);
                if (chatActivityEnterView.c() && num.intValue() == 0) {
                    g5.L(chatActivityEnterView.O2, j3, new te(chatActivityEnterView, 0), e6Var);
                    return;
                }
                chatActivityEnterView.R0(num.intValue(), bool.booleanValue(), num2.intValue(), true, 0L);
                return;
            default:
                Integer num3 = (Integer) obj2;
                Integer num4 = (Integer) obj3;
                Boolean bool2 = (Boolean) obj4;
                ChatActivityEnterView chatActivityEnterView2 = this.f26711b;
                chatActivityEnterView2.E0.setText((CharSequence) obj);
                if (chatActivityEnterView2.Z1 != null) {
                    chatActivityEnterView2.b0();
                    return;
                } else if (chatActivityEnterView2.c() && num3.intValue() == 0) {
                    g5.L(chatActivityEnterView2.O2, j3, new ue(chatActivityEnterView2), e6Var);
                    return;
                } else {
                    chatActivityEnterView2.R0(num3.intValue(), bool2.booleanValue(), num4.intValue(), true, 0L);
                    return;
                }
        }
    }
}
