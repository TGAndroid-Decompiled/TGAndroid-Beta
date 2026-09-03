package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_iv;
public final class td implements Utilities.Callback4 {
    public final int f31338a;
    public final ChatActivityEnterView f31339b;
    public final long f31340c;
    public final org.telegram.ui.ActionBar.g6 d;

    public td(ChatActivityEnterView chatActivityEnterView, long j10, org.telegram.ui.ActionBar.g6 g6Var, int i10) {
        this.f31338a = i10;
        this.f31339b = chatActivityEnterView;
        this.f31340c = j10;
        this.d = g6Var;
    }

    @Override
    public final void run(Object obj, Object obj2, Object obj3, Object obj4) {
        int i10 = this.f31338a;
        org.telegram.ui.ActionBar.g6 g6Var = this.d;
        long j10 = this.f31340c;
        switch (i10) {
            case 0:
                Integer num = (Integer) obj2;
                Integer num2 = (Integer) obj3;
                Boolean bool = (Boolean) obj4;
                int i11 = ChatActivityEnterView.f24570j5;
                ChatActivityEnterView chatActivityEnterView = this.f31339b;
                chatActivityEnterView.Q0((TL_iv.RichMessage) obj);
                if (chatActivityEnterView.c() && num.intValue() == 0) {
                    z4.M(chatActivityEnterView.K2, j10, new he(chatActivityEnterView, 0), g6Var);
                    return;
                }
                chatActivityEnterView.T0(num.intValue(), bool.booleanValue(), num2.intValue(), true, 0L);
                return;
            default:
                Integer num3 = (Integer) obj2;
                Integer num4 = (Integer) obj3;
                Boolean bool2 = (Boolean) obj4;
                ChatActivityEnterView chatActivityEnterView2 = this.f31339b;
                chatActivityEnterView2.B0.setText((CharSequence) obj);
                if (chatActivityEnterView2.V1 != null) {
                    chatActivityEnterView2.d0();
                    return;
                } else if (chatActivityEnterView2.c() && num3.intValue() == 0) {
                    z4.M(chatActivityEnterView2.K2, j10, new ie(chatActivityEnterView2), g6Var);
                    return;
                } else {
                    chatActivityEnterView2.T0(num3.intValue(), bool2.booleanValue(), num4.intValue(), true, 0L);
                    return;
                }
        }
    }
}
