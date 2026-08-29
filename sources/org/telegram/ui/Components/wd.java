package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_iv;
public final class wd implements Utilities.Callback4 {
    public final int f34385a;
    public final ChatActivityEnterView f34386b;
    public final long f34387c;
    public final org.telegram.ui.ActionBar.c6 d;

    public wd(ChatActivityEnterView chatActivityEnterView, long j10, org.telegram.ui.ActionBar.c6 c6Var, int i10) {
        this.f34385a = i10;
        this.f34386b = chatActivityEnterView;
        this.f34387c = j10;
        this.d = c6Var;
    }

    @Override
    public final void run(Object obj, Object obj2, Object obj3, Object obj4) {
        int i10 = this.f34385a;
        org.telegram.ui.ActionBar.c6 c6Var = this.d;
        long j10 = this.f34387c;
        switch (i10) {
            case 0:
                Integer num = (Integer) obj2;
                Integer num2 = (Integer) obj3;
                Boolean bool = (Boolean) obj4;
                int i11 = ChatActivityEnterView.f26085i5;
                ChatActivityEnterView chatActivityEnterView = this.f34386b;
                chatActivityEnterView.Q0((TL_iv.RichMessage) obj);
                if (chatActivityEnterView.c() && num.intValue() == 0) {
                    c5.M(chatActivityEnterView.J2, j10, new ke(chatActivityEnterView, 0), c6Var);
                    return;
                }
                chatActivityEnterView.T0(num.intValue(), bool.booleanValue(), num2.intValue(), true, 0L);
                return;
            default:
                Integer num3 = (Integer) obj2;
                Integer num4 = (Integer) obj3;
                Boolean bool2 = (Boolean) obj4;
                ChatActivityEnterView chatActivityEnterView2 = this.f34386b;
                chatActivityEnterView2.A0.setText((CharSequence) obj);
                if (chatActivityEnterView2.U1 != null) {
                    chatActivityEnterView2.d0();
                    return;
                } else if (chatActivityEnterView2.c() && num3.intValue() == 0) {
                    c5.M(chatActivityEnterView2.J2, j10, new le(chatActivityEnterView2), c6Var);
                    return;
                } else {
                    chatActivityEnterView2.T0(num3.intValue(), bool2.booleanValue(), num4.intValue(), true, 0L);
                    return;
                }
        }
    }
}
