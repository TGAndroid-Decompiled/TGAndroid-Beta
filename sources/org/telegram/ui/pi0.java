package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.tgnet.tl.TL_account;
public final class pi0 extends org.telegram.ui.Components.m41 {
    public static final int f51030b = 0;

    static {
        org.telegram.ui.Components.m41.h(new org.telegram.ui.Components.m41());
    }

    @Override
    public final void b(View view, org.telegram.ui.Components.n41 n41Var, boolean z10, org.telegram.ui.Components.b51 b51Var, org.telegram.ui.Components.g51 g51Var) {
        qi0 qi0Var = (qi0) view;
        TL_account.Passkey passkey = (TL_account.Passkey) n41Var.H;
        View.OnClickListener onClickListener = n41Var.E;
        TextView textView = qi0Var.f51469n;
        TextView textView2 = qi0Var.h;
        org.telegram.ui.ActionBar.i6 i6Var = qi0Var.d;
        FrameLayout frameLayout = qi0Var.f51467e;
        org.telegram.ui.Components.p9 p9Var = qi0Var.f51468f;
        qi0Var.f51472w = passkey.f28699id;
        long j3 = passkey.software_emoji_id;
        if (j3 != 0) {
            p9Var.setAnimatedEmojiDrawable(org.telegram.ui.Components.o5.m(qi0Var.f51466c, j3, null, 3));
            frameLayout.setBackground(null);
            p9Var.setColorFilter(null);
            qi0Var.f51464a = false;
            p9Var.setScaleX(1.0f);
            p9Var.setScaleY(1.0f);
        } else {
            int L = org.telegram.messenger.g0.L(4.0f);
            int i7 = org.telegram.ui.ActionBar.n6.G6;
            org.telegram.ui.ActionBar.u6.B(frameLayout, org.telegram.ui.ActionBar.n6.d0(L, org.telegram.ui.ActionBar.n6.r1(0.04f, org.telegram.ui.ActionBar.n6.w0(i7, i6Var))), org.telegram.ui.ActionBar.u6.K(0.04f, i7), i6Var);
            qi0Var.a();
            p9Var.setImageResource(2131232037);
            p9Var.setScaleX(0.666f);
            p9Var.setScaleY(0.666f);
            p9Var.setAnimatedEmojiDrawable(null);
        }
        if (TextUtils.isEmpty(passkey.name)) {
            textView2.setText(org.telegram.messenger.gd.N0(2131747434, null));
        } else {
            textView2.setText(passkey.name);
        }
        int i10 = passkey.last_usage_date;
        if (i10 != 0) {
            textView.setText(org.telegram.messenger.gd.a0(null, null, 2131747440, org.telegram.messenger.gd.x(i10, false)));
        } else {
            textView.setText(org.telegram.messenger.gd.a0(null, null, 2131747453, org.telegram.messenger.gd.x(passkey.date, false)));
        }
        qi0Var.f51470r.setOnClickListener(onClickListener);
        qi0Var.f51471s = z10;
        qi0Var.setWillNotDraw(!z10);
    }

    @Override
    public final View d(Context context, org.telegram.ui.Components.ek0 ek0Var, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        return new qi0(i7, context, i6Var);
    }
}
