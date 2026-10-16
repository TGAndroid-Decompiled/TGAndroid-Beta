package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ProfileActivity;
public final class ep0 extends g8 {
    public final Context E;
    public final Object F;
    public final int f24447y;

    public ep0(Object obj, Context context, Context context2, int i10) {
        super(context);
        this.f24447y = i10;
        this.F = obj;
        this.E = context2;
    }

    @Override
    public final TextView a() {
        switch (this.f24447y) {
            case 0:
                sa0 sa0Var = new sa0(this.E);
                sa0Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Si, ((gp0) this.F).M));
                sa0Var.setTextSize(1, 12.0f);
                sa0Var.setEllipsize(TextUtils.TruncateAt.END);
                sa0Var.setSingleLine(true);
                sa0Var.setPadding(AndroidUtilities.dp(0.0f), 0, AndroidUtilities.dp(0.0f), AndroidUtilities.dp(0.0f));
                return sa0Var;
            default:
                TextView textView = new TextView(this.E);
                textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Pi, ((ProfileActivity) this.F).f32405z0));
                textView.setTextSize(0, AndroidUtilities.dp(13.5f));
                textView.setSingleLine(true);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                textView.setGravity(3);
                return textView;
        }
    }
}
