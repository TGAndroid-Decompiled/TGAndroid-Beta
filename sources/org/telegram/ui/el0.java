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

public final class el0 extends org.telegram.ui.Components.m41 {

    public static final int f37785a = 0;

    static {
        org.telegram.ui.Components.m41.setup(new el0());
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.n41 n41Var, boolean z10, org.telegram.ui.Components.b51 b51Var, org.telegram.ui.Components.k51 k51Var) {
        fl0 fl0Var = (fl0) view;
        TL_account.Passkey passkey = (TL_account.Passkey) n41Var.G;
        View.OnClickListener onClickListener = n41Var.D;
        TextView textView = fl0Var.f38161f;
        TextView textView2 = fl0Var.f38160e;
        org.telegram.ui.ActionBar.c6 c6Var = fl0Var.f38158b;
        FrameLayout frameLayout = fl0Var.f38159c;
        org.telegram.ui.Components.n9 n9Var = fl0Var.d;
        fl0Var.f38163r = passkey.f22585id;
        long j10 = passkey.software_emoji_id;
        if (j10 != 0) {
            n9Var.setAnimatedEmojiDrawable(org.telegram.ui.Components.k5.n(fl0Var.f38157a, j10, null, 3));
            frameLayout.setBackground(null);
            n9Var.setColorFilter(null);
            n9Var.setScaleX(1.0f);
            n9Var.setScaleY(1.0f);
        } else {
            int iDp = AndroidUtilities.dp(4.0f);
            int i10 = org.telegram.ui.ActionBar.g6.G6;
            frameLayout.setBackground(org.telegram.ui.ActionBar.g6.b0(iDp, org.telegram.ui.ActionBar.g6.l1(0.04f, org.telegram.ui.ActionBar.g6.v0(i10, c6Var))));
            n9Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.l1(0.3f, org.telegram.ui.ActionBar.g6.v0(i10, c6Var)), PorterDuff.Mode.SRC_IN));
            n9Var.setImageResource(R.drawable.msg2_permissions);
            n9Var.setScaleX(0.666f);
            n9Var.setScaleY(0.666f);
            n9Var.setAnimatedEmojiDrawable(null);
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
        fl0Var.h.setOnClickListener(onClickListener);
        fl0Var.f38162n = z10;
        fl0Var.setWillNotDraw(!z10);
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.zk0 zk0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        return new fl0(context, i10, c6Var);
    }
}
