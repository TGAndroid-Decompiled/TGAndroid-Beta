package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_iv;
public final class de implements Utilities.Callback4 {
    public final int f27424a;
    public final ChatActivityEnterView f27425b;
    public final long f27426c;
    public final org.telegram.ui.ActionBar.u6 d;

    public de(ChatActivityEnterView chatActivityEnterView, long j10, org.telegram.ui.ActionBar.u6 u6Var, int i10) {
        this.f27424a = i10;
        this.f27425b = chatActivityEnterView;
        this.f27426c = j10;
        this.d = u6Var;
    }

    @Override
    public final void run(Object obj, Object obj2, Object obj3, Object obj4) {
        int i10 = this.f27424a;
        org.telegram.ui.ActionBar.u6 u6Var = this.d;
        long j10 = this.f27426c;
        switch (i10) {
            case 0:
                Integer num = (Integer) obj2;
                Integer num2 = (Integer) obj3;
                Boolean bool = (Boolean) obj4;
                int i11 = ChatActivityEnterView.f25845r5;
                ChatActivityEnterView chatActivityEnterView = this.f27425b;
                chatActivityEnterView.N0((TL_iv.RichMessage) obj);
                if (chatActivityEnterView.c() && num.intValue() == 0) {
                    g5.L(chatActivityEnterView.O2, j10, new qe(chatActivityEnterView, 0), u6Var);
                    return;
                }
                chatActivityEnterView.Q0(num.intValue(), bool.booleanValue(), num2.intValue(), true, 0L);
                return;
            default:
                Integer num3 = (Integer) obj2;
                Integer num4 = (Integer) obj3;
                Boolean bool2 = (Boolean) obj4;
                ChatActivityEnterView chatActivityEnterView2 = this.f27425b;
                chatActivityEnterView2.E0.setText((CharSequence) obj);
                if (chatActivityEnterView2.Z1 != null) {
                    chatActivityEnterView2.Z();
                    return;
                } else if (chatActivityEnterView2.c() && num3.intValue() == 0) {
                    g5.L(chatActivityEnterView2.O2, j10, new re(chatActivityEnterView2), u6Var);
                    return;
                } else {
                    chatActivityEnterView2.Q0(num3.intValue(), bool2.booleanValue(), num4.intValue(), true, 0L);
                    return;
                }
        }
    }
}
