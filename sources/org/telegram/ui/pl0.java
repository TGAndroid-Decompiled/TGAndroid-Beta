package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_account;
public final class pl0 extends org.telegram.ui.Components.s61 {
    public static final int f42572a = 0;

    static {
        org.telegram.ui.Components.s61.setup(new org.telegram.ui.Components.s61());
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.t61 t61Var, boolean z10, org.telegram.ui.Components.j71 j71Var, org.telegram.ui.Components.r71 r71Var) {
        ql0 ql0Var = (ql0) view;
        TL_account.Passkey passkey = (TL_account.Passkey) t61Var.G;
        View.OnClickListener onClickListener = t61Var.D;
        TextView textView = ql0Var.f42870n;
        TextView textView2 = ql0Var.h;
        org.telegram.ui.ActionBar.u6 u6Var = ql0Var.d;
        FrameLayout frameLayout = ql0Var.e;
        org.telegram.ui.Components.y9 y9Var = ql0Var.f42869f;
        ql0Var.v = passkey.f22231id;
        long j10 = passkey.software_emoji_id;
        if (j10 != 0) {
            y9Var.setAnimatedEmojiDrawable(org.telegram.ui.Components.t5.n(ql0Var.f42868c, j10, null, 3));
            frameLayout.setBackground(null);
            y9Var.setColorFilter(null);
            ql0Var.f42866a = false;
            y9Var.setScaleX(1.0f);
            y9Var.setScaleY(1.0f);
        } else {
            int dp = AndroidUtilities.dp(4.0f);
            int i10 = org.telegram.ui.ActionBar.y6.G6;
            org.telegram.ui.ActionBar.f7.C(frameLayout, org.telegram.ui.ActionBar.y6.c0(dp, org.telegram.ui.ActionBar.y6.o1(0.04f, org.telegram.ui.ActionBar.y6.w0(i10, u6Var))), org.telegram.ui.ActionBar.f7.L(0.04f, i10), u6Var);
            ql0Var.a();
            y9Var.setImageResource(R.drawable.msg2_permissions);
            y9Var.setScaleX(0.666f);
            y9Var.setScaleY(0.666f);
            y9Var.setAnimatedEmojiDrawable(null);
        }
        if (TextUtils.isEmpty(passkey.name)) {
            textView2.setText(LocaleController.getString(R.string.PasskeyUnknown));
        } else {
            textView2.setText(passkey.name);
        }
        int i11 = passkey.last_usage_date;
        if (i11 != 0) {
            textView.setText(LocaleController.formatString(R.string.PasskeyLastUsedOn, LocaleController.formatDateTime(i11, false)));
        } else {
            textView.setText(LocaleController.formatString(R.string.PasskeyCreatedOn, LocaleController.formatDateTime(passkey.date, false)));
        }
        ql0Var.f42871r.setOnClickListener(onClickListener);
        ql0Var.f42872s = z10;
        ql0Var.setWillNotDraw(!z10);
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.u6 u6Var) {
        return new ql0(context, i10, u6Var);
    }
}
