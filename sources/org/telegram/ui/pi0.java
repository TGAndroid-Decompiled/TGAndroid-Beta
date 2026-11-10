package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.tgnet.tl.TL_account;
public final class pi0 extends org.telegram.ui.Components.w31 {
    public static final int f48775b = 0;

    static {
        org.telegram.ui.Components.w31.h(new org.telegram.ui.Components.w31());
    }

    @Override
    public final void b(View view, org.telegram.ui.Components.x31 x31Var, boolean z9, org.telegram.ui.Components.m41 m41Var, org.telegram.ui.Components.r41 r41Var) {
        qi0 qi0Var = (qi0) view;
        TL_account.Passkey passkey = (TL_account.Passkey) x31Var.G;
        View.OnClickListener onClickListener = x31Var.D;
        TextView textView = qi0Var.f49055n;
        TextView textView2 = qi0Var.h;
        org.telegram.ui.ActionBar.h6 h6Var = qi0Var.d;
        FrameLayout frameLayout = qi0Var.f49053e;
        org.telegram.ui.Components.k9 k9Var = qi0Var.f49054f;
        qi0Var.f49058w = passkey.f27167id;
        long j3 = passkey.software_emoji_id;
        if (j3 != 0) {
            k9Var.setAnimatedEmojiDrawable(org.telegram.ui.Components.h5.m(qi0Var.f49052c, j3, null, 3));
            frameLayout.setBackground(null);
            k9Var.setColorFilter(null);
            qi0Var.f49050a = false;
            k9Var.setScaleX(1.0f);
            k9Var.setScaleY(1.0f);
        } else {
            int L = org.telegram.messenger.g0.L(4.0f);
            int i7 = org.telegram.ui.ActionBar.m6.G6;
            org.telegram.ui.ActionBar.t6.B(frameLayout, org.telegram.ui.ActionBar.m6.d0(L, org.telegram.ui.ActionBar.m6.r1(0.04f, org.telegram.ui.ActionBar.m6.w0(i7, h6Var))), org.telegram.ui.ActionBar.t6.K(0.04f, i7), h6Var);
            qi0Var.a();
            k9Var.setImageResource(2131232033);
            k9Var.setScaleX(0.666f);
            k9Var.setScaleY(0.666f);
            k9Var.setAnimatedEmojiDrawable(null);
        }
        if (TextUtils.isEmpty(passkey.name)) {
            textView2.setText(org.telegram.messenger.id.M0(2131747628, null));
        } else {
            textView2.setText(passkey.name);
        }
        int i10 = passkey.last_usage_date;
        if (i10 != 0) {
            textView.setText(org.telegram.messenger.id.a0(null, null, 2131747634, org.telegram.messenger.id.x(i10, false)));
        } else {
            textView.setText(org.telegram.messenger.id.a0(null, null, 2131747647, org.telegram.messenger.id.x(passkey.date, false)));
        }
        qi0Var.f49056r.setOnClickListener(onClickListener);
        qi0Var.f49057s = z9;
        qi0Var.setWillNotDraw(!z9);
    }

    @Override
    public final View d(Context context, org.telegram.ui.Components.pj0 pj0Var, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        return new qi0(i7, context, h6Var);
    }
}
