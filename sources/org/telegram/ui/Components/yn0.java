package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ProfileActivity;
public final class yn0 extends a8 {
    public final Context A;
    public final Object B;
    public final int f35109y;

    public yn0(Object obj, Context context, Context context2, int i10) {
        super(context);
        this.f35109y = i10;
        this.B = obj;
        this.A = context2;
    }

    @Override
    public final TextView a() {
        switch (this.f35109y) {
            case 0:
                n90 n90Var = new n90(this.A);
                n90Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Si, ((ao0) this.B).I));
                n90Var.setTextSize(1, 12.0f);
                n90Var.setEllipsize(TextUtils.TruncateAt.END);
                n90Var.setSingleLine(true);
                n90Var.setPadding(AndroidUtilities.dp(0.0f), 0, AndroidUtilities.dp(0.0f), AndroidUtilities.dp(0.0f));
                return n90Var;
            default:
                TextView textView = new TextView(this.A);
                textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Pi, ((ProfileActivity) this.B).f36129v0));
                textView.setTextSize(0, AndroidUtilities.dp(13.5f));
                textView.setSingleLine(true);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                textView.setGravity(3);
                return textView;
        }
    }
}
