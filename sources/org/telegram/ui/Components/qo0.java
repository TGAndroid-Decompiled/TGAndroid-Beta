package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ProfileActivity;
public final class qo0 extends c8 {
    public final Context E;
    public final Object F;
    public final int f27624y;

    public qo0(Object obj, Context context, Context context2, int i10) {
        super(context);
        this.f27624y = i10;
        this.F = obj;
        this.E = context2;
    }

    @Override
    public final TextView a() {
        switch (this.f27624y) {
            case 0:
                z90 z90Var = new z90(this.E);
                z90Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Si, ((so0) this.F).M));
                z90Var.setTextSize(1, 12.0f);
                z90Var.setEllipsize(TextUtils.TruncateAt.END);
                z90Var.setSingleLine(true);
                z90Var.setPadding(AndroidUtilities.dp(0.0f), 0, AndroidUtilities.dp(0.0f), AndroidUtilities.dp(0.0f));
                return z90Var;
            default:
                TextView textView = new TextView(this.E);
                textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Pi, ((ProfileActivity) this.F).f31696z0));
                textView.setTextSize(0, AndroidUtilities.dp(13.5f));
                textView.setSingleLine(true);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                textView.setGravity(3);
                return textView;
        }
    }
}
