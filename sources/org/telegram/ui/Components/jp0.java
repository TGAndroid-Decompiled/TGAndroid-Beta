package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ProfileActivity;
public final class jp0 extends f8 {
    public final Context E;
    public final Object F;
    public final int f27806y;

    public jp0(Object obj, Context context, Context context2, int i10) {
        super(context);
        this.f27806y = i10;
        this.F = obj;
        this.E = context2;
    }

    @Override
    public final TextView a() {
        switch (this.f27806y) {
            case 0:
                ta0 ta0Var = new ta0(this.E);
                ta0Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Si, ((lp0) this.F).M));
                ta0Var.setTextSize(1, 12.0f);
                ta0Var.setEllipsize(TextUtils.TruncateAt.END);
                ta0Var.setSingleLine(true);
                ta0Var.setPadding(AndroidUtilities.dp(0.0f), 0, AndroidUtilities.dp(0.0f), AndroidUtilities.dp(0.0f));
                return ta0Var;
            default:
                TextView textView = new TextView(this.E);
                textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Pi, ((ProfileActivity) this.F).f34448z0));
                textView.setTextSize(0, AndroidUtilities.dp(13.5f));
                textView.setSingleLine(true);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                textView.setGravity(3);
                return textView;
        }
    }
}
