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
public final class gl0 extends org.telegram.ui.Components.k61 {
    public static final int f37606a = 0;

    static {
        org.telegram.ui.Components.k61.setup(new org.telegram.ui.Components.k61());
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.l61 l61Var, boolean z10, org.telegram.ui.Components.a71 a71Var, org.telegram.ui.Components.i71 i71Var) {
        hl0 hl0Var = (hl0) view;
        TL_account.Passkey passkey = (TL_account.Passkey) l61Var.G;
        View.OnClickListener onClickListener = l61Var.D;
        TextView textView = hl0Var.f37897n;
        TextView textView2 = hl0Var.h;
        org.telegram.ui.ActionBar.g6 g6Var = hl0Var.d;
        FrameLayout frameLayout = hl0Var.e;
        org.telegram.ui.Components.u9 u9Var = hl0Var.f37896f;
        hl0Var.v = passkey.f20546id;
        long j10 = passkey.software_emoji_id;
        if (j10 != 0) {
            u9Var.setAnimatedEmojiDrawable(org.telegram.ui.Components.p5.n(hl0Var.f37895c, j10, null, 3));
            frameLayout.setBackground(null);
            u9Var.setColorFilter(null);
            hl0Var.f37893a = false;
            u9Var.setScaleX(1.0f);
            u9Var.setScaleY(1.0f);
        } else {
            int dp = AndroidUtilities.dp(4.0f);
            int i10 = org.telegram.ui.ActionBar.k6.G6;
            org.telegram.ui.ActionBar.r6.D(frameLayout, org.telegram.ui.ActionBar.k6.c0(dp, org.telegram.ui.ActionBar.k6.o1(0.04f, org.telegram.ui.ActionBar.k6.w0(i10, g6Var))), org.telegram.ui.ActionBar.r6.M(0.04f, i10), g6Var);
            hl0Var.a();
            u9Var.setImageResource(R.drawable.msg2_permissions);
            u9Var.setScaleX(0.666f);
            u9Var.setScaleY(0.666f);
            u9Var.setAnimatedEmojiDrawable(null);
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
        hl0Var.f37898r.setOnClickListener(onClickListener);
        hl0Var.f37899s = z10;
        hl0Var.setWillNotDraw(!z10);
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.lm0 lm0Var, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        return new hl0(context, i10, g6Var);
    }
}
