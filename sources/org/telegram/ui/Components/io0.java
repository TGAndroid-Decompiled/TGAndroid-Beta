package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ProfileActivity;
public final class io0 extends w7 {
    public final Context B;
    public final Object C;
    public final int f25764y;

    public io0(Object obj, Context context, Context context2, int i10) {
        super(context);
        this.f25764y = i10;
        this.C = obj;
        this.B = context2;
    }

    @Override
    public final TextView a() {
        switch (this.f25764y) {
            case 0:
                t90 t90Var = new t90(this.B);
                t90Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Si, ((ko0) this.C).J));
                t90Var.setTextSize(1, 12.0f);
                t90Var.setEllipsize(TextUtils.TruncateAt.END);
                t90Var.setSingleLine(true);
                t90Var.setPadding(AndroidUtilities.dp(0.0f), 0, AndroidUtilities.dp(0.0f), AndroidUtilities.dp(0.0f));
                return t90Var;
            default:
                TextView textView = new TextView(this.B);
                textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Pi, ((ProfileActivity) this.C).f32181w0));
                textView.setTextSize(0, AndroidUtilities.dp(13.5f));
                textView.setSingleLine(true);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                textView.setGravity(3);
                return textView;
        }
    }
}
