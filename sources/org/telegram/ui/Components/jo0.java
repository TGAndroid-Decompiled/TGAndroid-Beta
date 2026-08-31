package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ProfileActivity;
public final class jo0 extends w7 {
    public final Context B;
    public final Object C;
    public final int f28174y;

    public jo0(Object obj, Context context, Context context2, int i10) {
        super(context);
        this.f28174y = i10;
        this.C = obj;
        this.B = context2;
    }

    @Override
    public final TextView a() {
        switch (this.f28174y) {
            case 0:
                v90 v90Var = new v90(this.B);
                v90Var.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Si, ((lo0) this.C).J));
                v90Var.setTextSize(1, 12.0f);
                v90Var.setEllipsize(TextUtils.TruncateAt.END);
                v90Var.setSingleLine(true);
                v90Var.setPadding(AndroidUtilities.dp(0.0f), 0, AndroidUtilities.dp(0.0f), AndroidUtilities.dp(0.0f));
                return v90Var;
            default:
                TextView textView = new TextView(this.B);
                textView.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Pi, ((ProfileActivity) this.C).f34714w0));
                textView.setTextSize(0, AndroidUtilities.dp(13.5f));
                textView.setSingleLine(true);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                textView.setGravity(3);
                return textView;
        }
    }
}
