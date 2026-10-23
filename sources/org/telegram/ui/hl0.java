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
public final class hl0 extends org.telegram.ui.Components.l61 {
    public static final int f37875a = 0;

    static {
        org.telegram.ui.Components.l61.setup(new org.telegram.ui.Components.l61());
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.m61 m61Var, boolean z10, org.telegram.ui.Components.b71 b71Var, org.telegram.ui.Components.j71 j71Var) {
        il0 il0Var = (il0) view;
        TL_account.Passkey passkey = (TL_account.Passkey) m61Var.G;
        View.OnClickListener onClickListener = m61Var.D;
        TextView textView = il0Var.f38263n;
        TextView textView2 = il0Var.h;
        org.telegram.ui.ActionBar.g6 g6Var = il0Var.d;
        FrameLayout frameLayout = il0Var.e;
        org.telegram.ui.Components.w9 w9Var = il0Var.f38262f;
        il0Var.v = passkey.f20545id;
        long j10 = passkey.software_emoji_id;
        if (j10 != 0) {
            w9Var.setAnimatedEmojiDrawable(org.telegram.ui.Components.r5.n(il0Var.f38261c, j10, null, 3));
            frameLayout.setBackground(null);
            w9Var.setColorFilter(null);
            il0Var.f38259a = false;
            w9Var.setScaleX(1.0f);
            w9Var.setScaleY(1.0f);
        } else {
            int dp = AndroidUtilities.dp(4.0f);
            int i10 = org.telegram.ui.ActionBar.k6.G6;
            org.telegram.ui.ActionBar.r6.D(frameLayout, org.telegram.ui.ActionBar.k6.c0(dp, org.telegram.ui.ActionBar.k6.o1(0.04f, org.telegram.ui.ActionBar.k6.w0(i10, g6Var))), org.telegram.ui.ActionBar.r6.M(0.04f, i10), g6Var);
            il0Var.a();
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
        il0Var.f38264r.setOnClickListener(onClickListener);
        il0Var.f38265s = z10;
        il0Var.setWillNotDraw(!z10);
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        return new il0(context, i10, g6Var);
    }
}
