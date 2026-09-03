package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ProfileActivity;
public final class ho0 extends w7 {
    public final Context B;
    public final Object C;
    public final int f25466y;

    public ho0(Object obj, Context context, Context context2, int i10) {
        super(context);
        this.f25466y = i10;
        this.C = obj;
        this.B = context2;
    }

    @Override
    public final TextView a() {
        switch (this.f25466y) {
            case 0:
                u90 u90Var = new u90(this.B);
                u90Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Si, ((jo0) this.C).J));
                u90Var.setTextSize(1, 12.0f);
                u90Var.setEllipsize(TextUtils.TruncateAt.END);
                u90Var.setSingleLine(true);
                u90Var.setPadding(AndroidUtilities.dp(0.0f), 0, AndroidUtilities.dp(0.0f), AndroidUtilities.dp(0.0f));
                return u90Var;
            default:
                TextView textView = new TextView(this.B);
                textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Pi, ((ProfileActivity) this.C).f32155w0));
                textView.setTextSize(0, AndroidUtilities.dp(13.5f));
                textView.setSingleLine(true);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                textView.setGravity(3);
                return textView;
        }
    }
}
