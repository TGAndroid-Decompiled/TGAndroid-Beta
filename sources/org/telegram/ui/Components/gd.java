package org.telegram.ui.Components;

import org.telegram.tgnet.tl.TL_iv;
public final class gd implements org.telegram.messenger.o20 {
    public final int f26419a;
    public final ChatActivityEnterView f26420b;
    public final long f26421c;
    public final org.telegram.ui.ActionBar.p6 d;

    public gd(ChatActivityEnterView chatActivityEnterView, long j10, org.telegram.ui.ActionBar.p6 p6Var, int i10) {
        this.f26419a = i10;
        this.f26420b = chatActivityEnterView;
        this.f26421c = j10;
        this.d = p6Var;
    }

    @Override
    public final void a(Object obj, Object obj2, Object obj3, Object obj4) {
        int i10 = this.f26419a;
        org.telegram.ui.ActionBar.p6 p6Var = this.d;
        long j10 = this.f26421c;
        switch (i10) {
            case 0:
                Integer num = (Integer) obj2;
                Integer num2 = (Integer) obj3;
                Boolean bool = (Boolean) obj4;
                int i11 = ChatActivityEnterView.f23673s5;
                ChatActivityEnterView chatActivityEnterView = this.f26420b;
                chatActivityEnterView.O0((TL_iv.RichMessage) obj);
                if (chatActivityEnterView.c() && num.intValue() == 0) {
                    s4.L(chatActivityEnterView.O2, j10, new ud(chatActivityEnterView, 0), p6Var);
                    return;
                } else {
                    chatActivityEnterView.R0(bool.booleanValue(), num.intValue(), num2.intValue(), 0L, true);
                    return;
                }
            default:
                Integer num3 = (Integer) obj2;
                Integer num4 = (Integer) obj3;
                Boolean bool2 = (Boolean) obj4;
                ChatActivityEnterView chatActivityEnterView2 = this.f26420b;
                chatActivityEnterView2.E0.setText((CharSequence) obj);
                if (chatActivityEnterView2.Z1 != null) {
                    chatActivityEnterView2.Z();
                    return;
                } else if (chatActivityEnterView2.c() && num3.intValue() == 0) {
                    s4.L(chatActivityEnterView2.O2, j10, new vd(chatActivityEnterView2), p6Var);
                    return;
                } else {
                    chatActivityEnterView2.R0(bool2.booleanValue(), num3.intValue(), num4.intValue(), 0L, true);
                    return;
                }
        }
    }
}
