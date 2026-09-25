package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_iv;
public final class ee implements Utilities.Callback4 {
    public final int f23941a;
    public final ChatActivityEnterView f23942b;
    public final long f23943c;
    public final org.telegram.ui.ActionBar.d6 d;

    public ee(ChatActivityEnterView chatActivityEnterView, long j3, org.telegram.ui.ActionBar.d6 d6Var, int i10) {
        this.f23941a = i10;
        this.f23942b = chatActivityEnterView;
        this.f23943c = j3;
        this.d = d6Var;
    }

    @Override
    public final void run(Object obj, Object obj2, Object obj3, Object obj4) {
        int i10 = this.f23941a;
        org.telegram.ui.ActionBar.d6 d6Var = this.d;
        long j3 = this.f23943c;
        switch (i10) {
            case 0:
                Integer num = (Integer) obj2;
                Integer num2 = (Integer) obj3;
                Boolean bool = (Boolean) obj4;
                int i11 = ChatActivityEnterView.f21953n5;
                ChatActivityEnterView chatActivityEnterView = this.f23942b;
                chatActivityEnterView.Q0((TL_iv.RichMessage) obj);
                if (chatActivityEnterView.c() && num.intValue() == 0) {
                    e5.M(chatActivityEnterView.O2, j3, new re(chatActivityEnterView, 0), d6Var);
                    return;
                }
                chatActivityEnterView.T0(num.intValue(), bool.booleanValue(), num2.intValue(), true, 0L);
                return;
            default:
                Integer num3 = (Integer) obj2;
                Integer num4 = (Integer) obj3;
                Boolean bool2 = (Boolean) obj4;
                ChatActivityEnterView chatActivityEnterView2 = this.f23942b;
                chatActivityEnterView2.E0.setText((CharSequence) obj);
                if (chatActivityEnterView2.Z1 != null) {
                    chatActivityEnterView2.d0();
                    return;
                } else if (chatActivityEnterView2.c() && num3.intValue() == 0) {
                    e5.M(chatActivityEnterView2.O2, j3, new se(chatActivityEnterView2), d6Var);
                    return;
                } else {
                    chatActivityEnterView2.T0(num3.intValue(), bool2.booleanValue(), num4.intValue(), true, 0L);
                    return;
                }
        }
    }
}
