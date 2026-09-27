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
public final class ql0 extends org.telegram.ui.Components.w51 {
    public static final int f36772a = 0;

    static {
        org.telegram.ui.Components.w51.setup(new org.telegram.ui.Components.w51());
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.x51 x51Var, boolean z10, org.telegram.ui.Components.l61 l61Var, org.telegram.ui.Components.t61 t61Var) {
        rl0 rl0Var = (rl0) view;
        TL_account.Passkey passkey = (TL_account.Passkey) x51Var.G;
        View.OnClickListener onClickListener = x51Var.D;
        TextView textView = rl0Var.f37156f;
        TextView textView2 = rl0Var.e;
        org.telegram.ui.ActionBar.e6 e6Var = rl0Var.f37154b;
        FrameLayout frameLayout = rl0Var.f37155c;
        org.telegram.ui.Components.w9 w9Var = rl0Var.d;
        rl0Var.f37158r = passkey.f18532id;
        long j3 = passkey.software_emoji_id;
        if (j3 != 0) {
            w9Var.setAnimatedEmojiDrawable(org.telegram.ui.Components.q5.n(rl0Var.f37153a, j3, null, 3));
            frameLayout.setBackground(null);
            w9Var.setColorFilter(null);
            w9Var.setScaleX(1.0f);
            w9Var.setScaleY(1.0f);
        } else {
            int dp = AndroidUtilities.dp(4.0f);
            int i10 = org.telegram.ui.ActionBar.i6.G6;
            frameLayout.setBackground(org.telegram.ui.ActionBar.i6.b0(dp, org.telegram.ui.ActionBar.i6.l1(0.04f, org.telegram.ui.ActionBar.i6.v0(i10, e6Var))));
            w9Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.l1(0.3f, org.telegram.ui.ActionBar.i6.v0(i10, e6Var)), PorterDuff.Mode.SRC_IN));
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
        rl0Var.h.setOnClickListener(onClickListener);
        rl0Var.f37157n = z10;
        rl0Var.setWillNotDraw(!z10);
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.yl0 yl0Var, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        return new rl0(context, i10, e6Var);
    }
}
