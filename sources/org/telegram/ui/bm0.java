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
public final class bm0 extends org.telegram.ui.Components.k61 {
    public static final int f34597a = 0;

    static {
        org.telegram.ui.Components.k61.setup(new org.telegram.ui.Components.k61());
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.l61 l61Var, boolean z10, org.telegram.ui.Components.z61 z61Var, org.telegram.ui.Components.h71 h71Var) {
        cm0 cm0Var = (cm0) view;
        TL_account.Passkey passkey = (TL_account.Passkey) l61Var.G;
        View.OnClickListener onClickListener = l61Var.D;
        TextView textView = cm0Var.f34970f;
        TextView textView2 = cm0Var.e;
        org.telegram.ui.ActionBar.c6 c6Var = cm0Var.f34968b;
        FrameLayout frameLayout = cm0Var.f34969c;
        org.telegram.ui.Components.z9 z9Var = cm0Var.d;
        cm0Var.f34972r = passkey.f19419id;
        long j10 = passkey.software_emoji_id;
        if (j10 != 0) {
            z9Var.setAnimatedEmojiDrawable(org.telegram.ui.Components.s5.n(cm0Var.f34967a, j10, null, 3));
            frameLayout.setBackground(null);
            z9Var.setColorFilter(null);
            z9Var.setScaleX(1.0f);
            z9Var.setScaleY(1.0f);
        } else {
            int dp = AndroidUtilities.dp(4.0f);
            int i10 = org.telegram.ui.ActionBar.g6.G6;
            frameLayout.setBackground(org.telegram.ui.ActionBar.g6.c0(dp, org.telegram.ui.ActionBar.g6.m1(0.04f, org.telegram.ui.ActionBar.g6.w0(i10, c6Var))));
            z9Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.m1(0.3f, org.telegram.ui.ActionBar.g6.w0(i10, c6Var)), PorterDuff.Mode.SRC_IN));
            z9Var.setImageResource(R.drawable.msg2_permissions);
            z9Var.setScaleX(0.666f);
            z9Var.setScaleY(0.666f);
            z9Var.setAnimatedEmojiDrawable(null);
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
        cm0Var.h.setOnClickListener(onClickListener);
        cm0Var.f34971n = z10;
        cm0Var.setWillNotDraw(!z10);
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        return new cm0(context, i10, c6Var);
    }
}
