package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_iv;
public final class td implements Utilities.Callback4 {
    public final int f32683a;
    public final ChatActivityEnterView f32684b;
    public final long f32685c;
    public final org.telegram.ui.ActionBar.b6 d;

    public td(ChatActivityEnterView chatActivityEnterView, long j10, org.telegram.ui.ActionBar.b6 b6Var, int i9) {
        this.f32683a = i9;
        this.f32684b = chatActivityEnterView;
        this.f32685c = j10;
        this.d = b6Var;
    }

    @Override
    public final void run(Object obj, Object obj2, Object obj3, Object obj4) {
        int i9 = this.f32683a;
        org.telegram.ui.ActionBar.b6 b6Var = this.d;
        long j10 = this.f32685c;
        switch (i9) {
            case 0:
                Integer num = (Integer) obj2;
                Integer num2 = (Integer) obj3;
                Boolean bool = (Boolean) obj4;
                int i10 = ChatActivityEnterView.f26074i5;
                ChatActivityEnterView chatActivityEnterView = this.f32684b;
                chatActivityEnterView.Q0((TL_iv.RichMessage) obj);
                if (chatActivityEnterView.c() && num.intValue() == 0) {
                    y4.M(chatActivityEnterView.J2, j10, new he(chatActivityEnterView, 0), b6Var);
                    return;
                }
                chatActivityEnterView.T0(num.intValue(), bool.booleanValue(), num2.intValue(), true, 0L);
                return;
            default:
                Integer num3 = (Integer) obj2;
                Integer num4 = (Integer) obj3;
                Boolean bool2 = (Boolean) obj4;
                ChatActivityEnterView chatActivityEnterView2 = this.f32684b;
                chatActivityEnterView2.A0.setText((CharSequence) obj);
                if (chatActivityEnterView2.U1 != null) {
                    chatActivityEnterView2.c0();
                    return;
                } else if (chatActivityEnterView2.c() && num3.intValue() == 0) {
                    y4.M(chatActivityEnterView2.J2, j10, new ie(chatActivityEnterView2), b6Var);
                    return;
                } else {
                    chatActivityEnterView2.T0(num3.intValue(), bool2.booleanValue(), num4.intValue(), true, 0L);
                    return;
                }
        }
    }
}
