package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ProfileActivity;
public final class nn0 extends w7 {
    public final Context A;
    public final Object B;
    public final int f31136y;

    public nn0(Object obj, Context context, Context context2, int i9) {
        super(context);
        this.f31136y = i9;
        this.B = obj;
        this.A = context2;
    }

    @Override
    public final TextView a() {
        switch (this.f31136y) {
            case 0:
                a90 a90Var = new a90(this.A);
                a90Var.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Si, ((pn0) this.B).I));
                a90Var.setTextSize(1, 12.0f);
                a90Var.setEllipsize(TextUtils.TruncateAt.END);
                a90Var.setSingleLine(true);
                a90Var.setPadding(AndroidUtilities.dp(0.0f), 0, AndroidUtilities.dp(0.0f), AndroidUtilities.dp(0.0f));
                return a90Var;
            default:
                TextView textView = new TextView(this.A);
                textView.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Pi, ((ProfileActivity) this.B).f36064v0));
                textView.setTextSize(0, AndroidUtilities.dp(13.5f));
                textView.setSingleLine(true);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                textView.setGravity(3);
                return textView;
        }
    }
}
