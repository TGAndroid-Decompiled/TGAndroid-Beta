package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ProfileActivity;

public final class on0 extends v7 {
    public final Context A;
    public final Object B;

    public final int f31367y;

    public on0(Object obj, Context context, Context context2, int i10) {
        super(context);
        this.f31367y = i10;
        this.B = obj;
        this.A = context2;
    }

    @Override
    public final TextView a() {
        switch (this.f31367y) {
            case 0:
                e90 e90Var = new e90(this.A);
                e90Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Si, ((qn0) this.B).I));
                e90Var.setTextSize(1, 12.0f);
                e90Var.setEllipsize(TextUtils.TruncateAt.END);
                e90Var.setSingleLine(true);
                e90Var.setPadding(AndroidUtilities.dp(0.0f), 0, AndroidUtilities.dp(0.0f), AndroidUtilities.dp(0.0f));
                return e90Var;
            default:
                TextView textView = new TextView(this.A);
                textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Pi, ((ProfileActivity) this.B).f36067v0));
                textView.setTextSize(0, AndroidUtilities.dp(13.5f));
                textView.setSingleLine(true);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                textView.setGravity(3);
                return textView;
        }
    }
}
