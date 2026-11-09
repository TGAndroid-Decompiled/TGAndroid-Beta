package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.tgnet.tl.TL_account;
public final class oi0 extends org.telegram.ui.Components.x31 {
    public static final int f48454b = 0;

    static {
        org.telegram.ui.Components.x31.h(new org.telegram.ui.Components.x31());
    }

    @Override
    public final void b(View view, org.telegram.ui.Components.y31 y31Var, boolean z9, org.telegram.ui.Components.m41 m41Var, org.telegram.ui.Components.r41 r41Var) {
        pi0 pi0Var = (pi0) view;
        TL_account.Passkey passkey = (TL_account.Passkey) y31Var.G;
        View.OnClickListener onClickListener = y31Var.D;
        TextView textView = pi0Var.f48723n;
        TextView textView2 = pi0Var.h;
        org.telegram.ui.ActionBar.g6 g6Var = pi0Var.d;
        FrameLayout frameLayout = pi0Var.f48721e;
        org.telegram.ui.Components.l9 l9Var = pi0Var.f48722f;
        pi0Var.f48726w = passkey.f27163id;
        long j3 = passkey.software_emoji_id;
        if (j3 != 0) {
            l9Var.setAnimatedEmojiDrawable(org.telegram.ui.Components.i5.m(pi0Var.f48720c, j3, null, 3));
            frameLayout.setBackground(null);
            l9Var.setColorFilter(null);
            pi0Var.f48718a = false;
            l9Var.setScaleX(1.0f);
            l9Var.setScaleY(1.0f);
        } else {
            int L = org.telegram.messenger.g0.L(4.0f);
            int i7 = org.telegram.ui.ActionBar.l6.G6;
            org.telegram.ui.ActionBar.s6.B(frameLayout, org.telegram.ui.ActionBar.l6.d0(L, org.telegram.ui.ActionBar.l6.r1(0.04f, org.telegram.ui.ActionBar.l6.w0(i7, g6Var))), org.telegram.ui.ActionBar.s6.K(0.04f, i7), g6Var);
            pi0Var.a();
            l9Var.setImageResource(2131232033);
            l9Var.setScaleX(0.666f);
            l9Var.setScaleY(0.666f);
            l9Var.setAnimatedEmojiDrawable(null);
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
        pi0Var.f48724r.setOnClickListener(onClickListener);
        pi0Var.f48725s = z9;
        pi0Var.setWillNotDraw(!z9);
    }

    @Override
    public final View d(Context context, org.telegram.ui.Components.qj0 qj0Var, int i7, org.telegram.ui.ActionBar.g6 g6Var) {
        return new pi0(i7, context, g6Var);
    }
}
