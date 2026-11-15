package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.tgnet.tl.TL_account;
public final class oi0 extends org.telegram.ui.Components.a41 {
    public static final int f49966b = 0;

    static {
        org.telegram.ui.Components.a41.h(new org.telegram.ui.Components.a41());
    }

    @Override
    public final void b(View view, org.telegram.ui.Components.b41 b41Var, boolean z10, org.telegram.ui.Components.p41 p41Var, org.telegram.ui.Components.u41 u41Var) {
        pi0 pi0Var = (pi0) view;
        TL_account.Passkey passkey = (TL_account.Passkey) b41Var.G;
        View.OnClickListener onClickListener = b41Var.D;
        TextView textView = pi0Var.f50274n;
        TextView textView2 = pi0Var.h;
        org.telegram.ui.ActionBar.e6 e6Var = pi0Var.d;
        FrameLayout frameLayout = pi0Var.f50272e;
        org.telegram.ui.Components.i9 i9Var = pi0Var.f50273f;
        pi0Var.f50277w = passkey.f28258id;
        long j3 = passkey.software_emoji_id;
        if (j3 != 0) {
            i9Var.setAnimatedEmojiDrawable(org.telegram.ui.Components.g5.m(pi0Var.f50271c, j3, null, 3));
            frameLayout.setBackground(null);
            i9Var.setColorFilter(null);
            pi0Var.f50269a = false;
            i9Var.setScaleX(1.0f);
            i9Var.setScaleY(1.0f);
        } else {
            int L = org.telegram.messenger.g0.L(4.0f);
            int i7 = org.telegram.ui.ActionBar.j6.G6;
            org.telegram.ui.ActionBar.q6.B(frameLayout, org.telegram.ui.ActionBar.j6.d0(L, org.telegram.ui.ActionBar.j6.r1(0.04f, org.telegram.ui.ActionBar.j6.w0(i7, e6Var))), org.telegram.ui.ActionBar.q6.K(0.04f, i7), e6Var);
            pi0Var.a();
            i9Var.setImageResource(2131232033);
            i9Var.setScaleX(0.666f);
            i9Var.setScaleY(0.666f);
            i9Var.setAnimatedEmojiDrawable(null);
        }
        if (TextUtils.isEmpty(passkey.name)) {
            textView2.setText(org.telegram.messenger.hd.M0(2131747628, null));
        } else {
            textView2.setText(passkey.name);
        }
        int i10 = passkey.last_usage_date;
        if (i10 != 0) {
            textView.setText(org.telegram.messenger.hd.a0(null, null, 2131747634, org.telegram.messenger.hd.x(i10, false)));
        } else {
            textView.setText(org.telegram.messenger.hd.a0(null, null, 2131747647, org.telegram.messenger.hd.x(passkey.date, false)));
        }
        pi0Var.f50275r.setOnClickListener(onClickListener);
        pi0Var.f50276s = z10;
        pi0Var.setWillNotDraw(!z10);
    }

    @Override
    public final View d(Context context, org.telegram.ui.Components.uj0 uj0Var, int i7, org.telegram.ui.ActionBar.e6 e6Var) {
        return new pi0(i7, context, e6Var);
    }
}
