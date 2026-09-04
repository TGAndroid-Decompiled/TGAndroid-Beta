package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_iv;
public final class de implements Utilities.Callback4 {
    public final int f25372a;
    public final ChatActivityEnterView f25373b;
    public final long f25374c;
    public final org.telegram.ui.ActionBar.f6 d;

    public de(ChatActivityEnterView chatActivityEnterView, long j3, org.telegram.ui.ActionBar.f6 f6Var, int i10) {
        this.f25372a = i10;
        this.f25373b = chatActivityEnterView;
        this.f25374c = j3;
        this.d = f6Var;
    }

    @Override
    public final void run(Object obj, Object obj2, Object obj3, Object obj4) {
        int i10 = this.f25372a;
        org.telegram.ui.ActionBar.f6 f6Var = this.d;
        long j3 = this.f25374c;
        switch (i10) {
            case 0:
                Integer num = (Integer) obj2;
                Integer num2 = (Integer) obj3;
                Boolean bool = (Boolean) obj4;
                int i11 = ChatActivityEnterView.f23661m5;
                ChatActivityEnterView chatActivityEnterView = this.f25373b;
                chatActivityEnterView.Q0((TL_iv.RichMessage) obj);
                if (chatActivityEnterView.c() && num.intValue() == 0) {
                    e5.M(chatActivityEnterView.N2, j3, new qe(chatActivityEnterView, 0), f6Var);
                    return;
                }
                chatActivityEnterView.T0(num.intValue(), bool.booleanValue(), num2.intValue(), true, 0L);
                return;
            default:
                Integer num3 = (Integer) obj2;
                Integer num4 = (Integer) obj3;
                Boolean bool2 = (Boolean) obj4;
                ChatActivityEnterView chatActivityEnterView2 = this.f25373b;
                chatActivityEnterView2.E0.setText((CharSequence) obj);
                if (chatActivityEnterView2.Y1 != null) {
                    chatActivityEnterView2.d0();
                    return;
                } else if (chatActivityEnterView2.c() && num3.intValue() == 0) {
                    e5.M(chatActivityEnterView2.N2, j3, new re(chatActivityEnterView2), f6Var);
                    return;
                } else {
                    chatActivityEnterView2.T0(num3.intValue(), bool2.booleanValue(), num4.intValue(), true, 0L);
                    return;
                }
        }
    }
}
