package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.tgnet.tl.TL_account;
public final class mi0 extends org.telegram.ui.Components.w31 {
    public static final int f47813b = 0;

    static {
        org.telegram.ui.Components.w31.h(new org.telegram.ui.Components.w31());
    }

    @Override
    public final void b(View view, org.telegram.ui.Components.x31 x31Var, boolean z9, org.telegram.ui.Components.l41 l41Var, org.telegram.ui.Components.q41 q41Var) {
        ni0 ni0Var = (ni0) view;
        TL_account.Passkey passkey = (TL_account.Passkey) x31Var.G;
        View.OnClickListener onClickListener = x31Var.D;
        TextView textView = ni0Var.f48052n;
        TextView textView2 = ni0Var.h;
        org.telegram.ui.ActionBar.f6 f6Var = ni0Var.d;
        FrameLayout frameLayout = ni0Var.f48050e;
        org.telegram.ui.Components.l9 l9Var = ni0Var.f48051f;
        ni0Var.f48055w = passkey.f27160id;
        long j3 = passkey.software_emoji_id;
        if (j3 != 0) {
            l9Var.setAnimatedEmojiDrawable(org.telegram.ui.Components.i5.m(ni0Var.f48049c, j3, null, 3));
            frameLayout.setBackground(null);
            l9Var.setColorFilter(null);
            ni0Var.f48047a = false;
            l9Var.setScaleX(1.0f);
            l9Var.setScaleY(1.0f);
        } else {
            int L = org.telegram.messenger.g0.L(4.0f);
            int i7 = org.telegram.ui.ActionBar.k6.G6;
            org.telegram.ui.ActionBar.r6.C(frameLayout, org.telegram.ui.ActionBar.k6.d0(L, org.telegram.ui.ActionBar.k6.r1(0.04f, org.telegram.ui.ActionBar.k6.w0(i7, f6Var))), org.telegram.ui.ActionBar.r6.L(0.04f, i7), f6Var);
            ni0Var.a();
            l9Var.setImageResource(2131232033);
            l9Var.setScaleX(0.666f);
            l9Var.setScaleY(0.666f);
            l9Var.setAnimatedEmojiDrawable(null);
        }
        if (TextUtils.isEmpty(passkey.name)) {
            textView2.setText(org.telegram.messenger.hd.M0(2131747627, null));
        } else {
            textView2.setText(passkey.name);
        }
        int i10 = passkey.last_usage_date;
        if (i10 != 0) {
            textView.setText(org.telegram.messenger.hd.a0(null, null, 2131747633, org.telegram.messenger.hd.x(i10, false)));
        } else {
            textView.setText(org.telegram.messenger.hd.a0(null, null, 2131747646, org.telegram.messenger.hd.x(passkey.date, false)));
        }
        ni0Var.f48053r.setOnClickListener(onClickListener);
        ni0Var.f48054s = z9;
        ni0Var.setWillNotDraw(!z9);
    }

    @Override
    public final View d(Context context, org.telegram.ui.Components.pj0 pj0Var, int i7, org.telegram.ui.ActionBar.f6 f6Var) {
        return new ni0(i7, context, f6Var);
    }
}
