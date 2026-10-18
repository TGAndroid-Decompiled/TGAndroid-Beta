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
public final class gl0 extends org.telegram.ui.Components.e61 {
    public static final int f37202a = 0;

    static {
        org.telegram.ui.Components.e61.setup(new org.telegram.ui.Components.e61());
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.f61 f61Var, boolean z10, org.telegram.ui.Components.s61 s61Var, org.telegram.ui.Components.a71 a71Var) {
        hl0 hl0Var = (hl0) view;
        TL_account.Passkey passkey = (TL_account.Passkey) f61Var.G;
        View.OnClickListener onClickListener = f61Var.D;
        TextView textView = hl0Var.f37558f;
        TextView textView2 = hl0Var.e;
        org.telegram.ui.ActionBar.d6 d6Var = hl0Var.f37556b;
        FrameLayout frameLayout = hl0Var.f37557c;
        org.telegram.ui.Components.w9 w9Var = hl0Var.d;
        hl0Var.f37560r = passkey.f20474id;
        long j10 = passkey.software_emoji_id;
        if (j10 != 0) {
            w9Var.setAnimatedEmojiDrawable(org.telegram.ui.Components.r5.n(hl0Var.f37555a, j10, null, 3));
            frameLayout.setBackground(null);
            w9Var.setColorFilter(null);
            w9Var.setScaleX(1.0f);
            w9Var.setScaleY(1.0f);
        } else {
            int dp = AndroidUtilities.dp(4.0f);
            int i10 = org.telegram.ui.ActionBar.h6.G6;
            frameLayout.setBackground(org.telegram.ui.ActionBar.h6.c0(dp, org.telegram.ui.ActionBar.h6.m1(0.04f, org.telegram.ui.ActionBar.h6.w0(i10, d6Var))));
            w9Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.m1(0.3f, org.telegram.ui.ActionBar.h6.w0(i10, d6Var)), PorterDuff.Mode.SRC_IN));
            w9Var.setImageResource(R.drawable.msg2_permissions);
            w9Var.setScaleX(0.666f);
            w9Var.setScaleY(0.666f);
            w9Var.setAnimatedEmojiDrawable(null);
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
        hl0Var.h.setOnClickListener(onClickListener);
        hl0Var.f37559n = z10;
        hl0Var.setWillNotDraw(!z10);
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.im0 im0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new hl0(context, i10, d6Var);
    }
}
