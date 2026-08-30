package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_iv;
public final class td implements Utilities.Callback4 {
    public final int f28960a;
    public final ChatActivityEnterView f28961b;
    public final long f28962c;
    public final org.telegram.ui.ActionBar.f6 d;

    public td(ChatActivityEnterView chatActivityEnterView, long j10, org.telegram.ui.ActionBar.f6 f6Var, int i10) {
        this.f28960a = i10;
        this.f28961b = chatActivityEnterView;
        this.f28962c = j10;
        this.d = f6Var;
    }

    @Override
    public final void run(Object obj, Object obj2, Object obj3, Object obj4) {
        int i10 = this.f28960a;
        org.telegram.ui.ActionBar.f6 f6Var = this.d;
        long j10 = this.f28962c;
        switch (i10) {
            case 0:
                Integer num = (Integer) obj2;
                Integer num2 = (Integer) obj3;
                Boolean bool = (Boolean) obj4;
                int i11 = ChatActivityEnterView.f22729j5;
                ChatActivityEnterView chatActivityEnterView = this.f28961b;
                chatActivityEnterView.Q0((TL_iv.RichMessage) obj);
                if (chatActivityEnterView.c() && num.intValue() == 0) {
                    z4.M(chatActivityEnterView.K2, j10, new he(chatActivityEnterView, 0), f6Var);
                    return;
                }
                chatActivityEnterView.T0(num.intValue(), bool.booleanValue(), num2.intValue(), true, 0L);
                return;
            default:
                Integer num3 = (Integer) obj2;
                Integer num4 = (Integer) obj3;
                Boolean bool2 = (Boolean) obj4;
                ChatActivityEnterView chatActivityEnterView2 = this.f28961b;
                chatActivityEnterView2.B0.setText((CharSequence) obj);
                if (chatActivityEnterView2.V1 != null) {
                    chatActivityEnterView2.d0();
                    return;
                } else if (chatActivityEnterView2.c() && num3.intValue() == 0) {
                    z4.M(chatActivityEnterView2.K2, j10, new ie(chatActivityEnterView2), f6Var);
                    return;
                } else {
                    chatActivityEnterView2.T0(num3.intValue(), bool2.booleanValue(), num4.intValue(), true, 0L);
                    return;
                }
        }
    }
}
