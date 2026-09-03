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
public final class ml0 extends org.telegram.ui.Components.h51 {
    public static final int f36131a = 0;

    static {
        org.telegram.ui.Components.h51.setup(new org.telegram.ui.Components.h51());
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.i51 i51Var, boolean z4, org.telegram.ui.Components.w51 w51Var, org.telegram.ui.Components.g61 g61Var) {
        nl0 nl0Var = (nl0) view;
        TL_account.Passkey passkey = (TL_account.Passkey) i51Var.G;
        View.OnClickListener onClickListener = i51Var.D;
        TextView textView = nl0Var.f36534f;
        TextView textView2 = nl0Var.e;
        org.telegram.ui.ActionBar.f6 f6Var = nl0Var.f36532b;
        FrameLayout frameLayout = nl0Var.f36533c;
        org.telegram.ui.Components.p9 p9Var = nl0Var.d;
        nl0Var.f36536r = passkey.f19362id;
        long j10 = passkey.software_emoji_id;
        if (j10 != 0) {
            p9Var.setAnimatedEmojiDrawable(org.telegram.ui.Components.l5.n(nl0Var.f36531a, j10, null, 3));
            frameLayout.setBackground(null);
            p9Var.setColorFilter(null);
            p9Var.setScaleX(1.0f);
            p9Var.setScaleY(1.0f);
        } else {
            int dp = AndroidUtilities.dp(4.0f);
            int i10 = org.telegram.ui.ActionBar.j6.G6;
            frameLayout.setBackground(org.telegram.ui.ActionBar.j6.b0(dp, org.telegram.ui.ActionBar.j6.l1(0.04f, org.telegram.ui.ActionBar.j6.v0(i10, f6Var))));
            p9Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.l1(0.3f, org.telegram.ui.ActionBar.j6.v0(i10, f6Var)), PorterDuff.Mode.SRC_IN));
            p9Var.setImageResource(R.drawable.msg2_permissions);
            p9Var.setScaleX(0.666f);
            p9Var.setScaleY(0.666f);
            p9Var.setAnimatedEmojiDrawable(null);
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
        nl0Var.h.setOnClickListener(onClickListener);
        nl0Var.f36535n = z4;
        nl0Var.setWillNotDraw(!z4);
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.rl0 rl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new nl0(context, i10, f6Var);
    }
}
