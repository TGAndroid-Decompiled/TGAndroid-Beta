package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ProfileActivity;
public final class jp0 extends f8 {
    public final Context E;
    public final Object F;
    public final int f27747y;

    public jp0(Object obj, Context context, Context context2, int i10) {
        super(context);
        this.f27747y = i10;
        this.F = obj;
        this.E = context2;
    }

    @Override
    public final TextView a() {
        switch (this.f27747y) {
            case 0:
                ua0 ua0Var = new ua0(this.E);
                ua0Var.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Si, ((lp0) this.F).M));
                ua0Var.setTextSize(1, 12.0f);
                ua0Var.setEllipsize(TextUtils.TruncateAt.END);
                ua0Var.setSingleLine(true);
                ua0Var.setPadding(AndroidUtilities.dp(0.0f), 0, AndroidUtilities.dp(0.0f), AndroidUtilities.dp(0.0f));
                return ua0Var;
            default:
                TextView textView = new TextView(this.E);
                textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Pi, ((ProfileActivity) this.F).f34424z0));
                textView.setTextSize(0, AndroidUtilities.dp(13.5f));
                textView.setSingleLine(true);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                textView.setGravity(3);
                return textView;
        }
    }
}
