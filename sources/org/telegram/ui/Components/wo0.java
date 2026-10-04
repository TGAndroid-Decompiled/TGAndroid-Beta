package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ProfileActivity;
public final class wo0 extends d8 {
    public final Context E;
    public final Object F;
    public final int f32595y;

    public wo0(Object obj, Context context, Context context2, int i10) {
        super(context);
        this.f32595y = i10;
        this.F = obj;
        this.E = context2;
    }

    @Override
    public final TextView a() {
        switch (this.f32595y) {
            case 0:
                fa0 fa0Var = new fa0(this.E);
                fa0Var.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Si, ((yo0) this.F).M));
                fa0Var.setTextSize(1, 12.0f);
                fa0Var.setEllipsize(TextUtils.TruncateAt.END);
                fa0Var.setSingleLine(true);
                fa0Var.setPadding(AndroidUtilities.dp(0.0f), 0, AndroidUtilities.dp(0.0f), AndroidUtilities.dp(0.0f));
                return fa0Var;
            default:
                TextView textView = new TextView(this.E);
                textView.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Pi, ((ProfileActivity) this.F).f34383z0));
                textView.setTextSize(0, AndroidUtilities.dp(13.5f));
                textView.setSingleLine(true);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                textView.setGravity(3);
                return textView;
        }
    }
}
