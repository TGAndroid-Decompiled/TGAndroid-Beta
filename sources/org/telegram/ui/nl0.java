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
public final class nl0 extends org.telegram.ui.Components.u51 {
    public static final int f35922a = 0;

    static {
        org.telegram.ui.Components.u51.setup(new org.telegram.ui.Components.u51());
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.v51 v51Var, boolean z10, org.telegram.ui.Components.j61 j61Var, org.telegram.ui.Components.r61 r61Var) {
        ol0 ol0Var = (ol0) view;
        TL_account.Passkey passkey = (TL_account.Passkey) v51Var.G;
        View.OnClickListener onClickListener = v51Var.D;
        TextView textView = ol0Var.f36266f;
        TextView textView2 = ol0Var.e;
        org.telegram.ui.ActionBar.d6 d6Var = ol0Var.f36264b;
        FrameLayout frameLayout = ol0Var.f36265c;
        org.telegram.ui.Components.w9 w9Var = ol0Var.d;
        ol0Var.f36268r = passkey.f18539id;
        long j3 = passkey.software_emoji_id;
        if (j3 != 0) {
            w9Var.setAnimatedEmojiDrawable(org.telegram.ui.Components.q5.n(ol0Var.f36263a, j3, null, 3));
            frameLayout.setBackground(null);
            w9Var.setColorFilter(null);
            w9Var.setScaleX(1.0f);
            w9Var.setScaleY(1.0f);
        } else {
            int dp = AndroidUtilities.dp(4.0f);
            int i10 = org.telegram.ui.ActionBar.h6.G6;
            frameLayout.setBackground(org.telegram.ui.ActionBar.h6.b0(dp, org.telegram.ui.ActionBar.h6.l1(0.04f, org.telegram.ui.ActionBar.h6.v0(i10, d6Var))));
            w9Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.l1(0.3f, org.telegram.ui.ActionBar.h6.v0(i10, d6Var)), PorterDuff.Mode.SRC_IN));
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
        ol0Var.h.setOnClickListener(onClickListener);
        ol0Var.f36267n = z10;
        ol0Var.setWillNotDraw(!z10);
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.wl0 wl0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new ol0(context, i10, d6Var);
    }
}
