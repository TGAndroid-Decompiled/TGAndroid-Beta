package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ProfileActivity;
public final class ro0 extends d8 {
    public final Context E;
    public final Object F;
    public final int f28023y;

    public ro0(Object obj, Context context, Context context2, int i10) {
        super(context);
        this.f28023y = i10;
        this.F = obj;
        this.E = context2;
    }

    @Override
    public final TextView a() {
        switch (this.f28023y) {
            case 0:
                da0 da0Var = new da0(this.E);
                da0Var.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Si, ((to0) this.F).M));
                da0Var.setTextSize(1, 12.0f);
                da0Var.setEllipsize(TextUtils.TruncateAt.END);
                da0Var.setSingleLine(true);
                da0Var.setPadding(AndroidUtilities.dp(0.0f), 0, AndroidUtilities.dp(0.0f), AndroidUtilities.dp(0.0f));
                return da0Var;
            default:
                TextView textView = new TextView(this.E);
                textView.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Pi, ((ProfileActivity) this.F).f31697z0));
                textView.setTextSize(0, AndroidUtilities.dp(13.5f));
                textView.setSingleLine(true);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                textView.setGravity(3);
                return textView;
        }
    }
}
