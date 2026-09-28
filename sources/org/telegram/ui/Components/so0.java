package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ProfileActivity;
public final class so0 extends d8 {
    public final Context E;
    public final Object F;
    public final int f28330y;

    public so0(Object obj, Context context, Context context2, int i10) {
        super(context);
        this.f28330y = i10;
        this.F = obj;
        this.E = context2;
    }

    @Override
    public final TextView a() {
        switch (this.f28330y) {
            case 0:
                ea0 ea0Var = new ea0(this.E);
                ea0Var.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Si, ((uo0) this.F).M));
                ea0Var.setTextSize(1, 12.0f);
                ea0Var.setEllipsize(TextUtils.TruncateAt.END);
                ea0Var.setSingleLine(true);
                ea0Var.setPadding(AndroidUtilities.dp(0.0f), 0, AndroidUtilities.dp(0.0f), AndroidUtilities.dp(0.0f));
                return ea0Var;
            default:
                TextView textView = new TextView(this.E);
                textView.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Pi, ((ProfileActivity) this.F).f31698z0));
                textView.setTextSize(0, AndroidUtilities.dp(13.5f));
                textView.setSingleLine(true);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                textView.setGravity(3);
                return textView;
        }
    }
}
