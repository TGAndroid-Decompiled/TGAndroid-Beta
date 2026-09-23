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
public final class ol0 extends org.telegram.ui.Components.g51 {
    public static final int f35906a = 0;

    static {
        org.telegram.ui.Components.g51.setup(new org.telegram.ui.Components.g51());
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.h51 h51Var, boolean z10, org.telegram.ui.Components.v51 v51Var, org.telegram.ui.Components.d61 d61Var) {
        pl0 pl0Var = (pl0) view;
        TL_account.Passkey passkey = (TL_account.Passkey) h51Var.G;
        View.OnClickListener onClickListener = h51Var.D;
        TextView textView = pl0Var.f36142f;
        TextView textView2 = pl0Var.e;
        org.telegram.ui.ActionBar.d6 d6Var = pl0Var.f36140b;
        FrameLayout frameLayout = pl0Var.f36141c;
        org.telegram.ui.Components.w9 w9Var = pl0Var.d;
        pl0Var.f36144r = passkey.f18286id;
        long j3 = passkey.software_emoji_id;
        if (j3 != 0) {
            w9Var.setAnimatedEmojiDrawable(org.telegram.ui.Components.q5.n(pl0Var.f36139a, j3, null, 3));
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
        pl0Var.h.setOnClickListener(onClickListener);
        pl0Var.f36143n = z10;
        pl0Var.setWillNotDraw(!z10);
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.ml0 ml0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new pl0(context, i10, d6Var);
    }
}
