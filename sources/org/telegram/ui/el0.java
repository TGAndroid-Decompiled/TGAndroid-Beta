package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_account;
public final class el0 extends org.telegram.ui.Components.k41 {
    public static final int f37987a = 0;

    static {
        org.telegram.ui.Components.k41.setup(new org.telegram.ui.Components.k41());
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.l41 l41Var, boolean z10, org.telegram.ui.Components.z41 z41Var, org.telegram.ui.Components.i51 i51Var) {
        fl0 fl0Var = (fl0) view;
        TL_account.Passkey passkey = (TL_account.Passkey) l41Var.G;
        View.OnClickListener onClickListener = l41Var.D;
        TextView textView = fl0Var.f38309f;
        TextView textView2 = fl0Var.f38308e;
        org.telegram.ui.ActionBar.b6 b6Var = fl0Var.f38306b;
        FrameLayout frameLayout = fl0Var.f38307c;
        org.telegram.ui.Components.o9 o9Var = fl0Var.d;
        fl0Var.f38311r = passkey.f22585id;
        long j10 = passkey.software_emoji_id;
        if (j10 != 0) {
            o9Var.setAnimatedEmojiDrawable(org.telegram.ui.Components.k5.n(fl0Var.f38305a, j10, null, 3));
            frameLayout.setBackground(null);
            o9Var.setColorFilter(null);
            o9Var.setScaleX(1.0f);
            o9Var.setScaleY(1.0f);
        } else {
            int dp = AndroidUtilities.dp(4.0f);
            int i9 = org.telegram.ui.ActionBar.f6.G6;
            frameLayout.setBackground(org.telegram.ui.ActionBar.f6.b0(dp, org.telegram.ui.ActionBar.f6.l1(0.04f, org.telegram.ui.ActionBar.f6.v0(i9, b6Var))));
            o9Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.l1(0.3f, org.telegram.ui.ActionBar.f6.v0(i9, b6Var)), PorterDuff.Mode.SRC_IN));
            o9Var.setImageResource(R.drawable.msg2_permissions);
            o9Var.setScaleX(0.666f);
            o9Var.setScaleY(0.666f);
            o9Var.setAnimatedEmojiDrawable(null);
        }
        if (TextUtils.isEmpty(passkey.name)) {
            textView2.setText(LocaleController.getString(R.string.PasskeyUnknown));
        } else {
            textView2.setText(passkey.name);
        }
        int i10 = passkey.last_usage_date;
        if (i10 != 0) {
            textView.setText(LocaleController.formatString(R.string.PasskeyLastUsedOn, LocaleController.formatDateTime(i10, false)));
        } else {
            textView.setText(LocaleController.formatString(R.string.PasskeyCreatedOn, LocaleController.formatDateTime(passkey.date, false)));
        }
        fl0Var.h.setOnClickListener(onClickListener);
        fl0Var.f38310n = z10;
        fl0Var.setWillNotDraw(!z10);
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.wk0 wk0Var, int i9, int i10, org.telegram.ui.ActionBar.b6 b6Var) {
        return new fl0(context, i9, b6Var);
    }
}
