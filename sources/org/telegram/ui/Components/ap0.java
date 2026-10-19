package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ProfileActivity;
public final class ap0 extends e8 {
    public final Context E;
    public final Object F;
    public final int f24671y;

    public ap0(Object obj, Context context, Context context2, int i10) {
        super(context);
        this.f24671y = i10;
        this.F = obj;
        this.E = context2;
    }

    @Override
    public final TextView a() {
        switch (this.f24671y) {
            case 0:
                ma0 ma0Var = new ma0(this.E);
                ma0Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Si, ((cp0) this.F).M));
                ma0Var.setTextSize(1, 12.0f);
                ma0Var.setEllipsize(TextUtils.TruncateAt.END);
                ma0Var.setSingleLine(true);
                ma0Var.setPadding(AndroidUtilities.dp(0.0f), 0, AndroidUtilities.dp(0.0f), AndroidUtilities.dp(0.0f));
                return ma0Var;
            default:
                TextView textView = new TextView(this.E);
                textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Pi, ((ProfileActivity) this.F).A0));
                textView.setTextSize(0, AndroidUtilities.dp(13.5f));
                textView.setSingleLine(true);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                textView.setGravity(3);
                return textView;
        }
    }
}
