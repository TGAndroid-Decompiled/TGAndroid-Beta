package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ProfileActivity;
public final class mo0 extends d8 {
    public final Context E;
    public final Object F;
    public final int f25264y;

    public mo0(Object obj, Context context, Context context2, int i10) {
        super(context);
        this.f25264y = i10;
        this.F = obj;
        this.E = context2;
    }

    @Override
    public final TextView a() {
        switch (this.f25264y) {
            case 0:
                ba0 ba0Var = new ba0(this.E);
                ba0Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Si, ((oo0) this.F).M));
                ba0Var.setTextSize(1, 12.0f);
                ba0Var.setEllipsize(TextUtils.TruncateAt.END);
                ba0Var.setSingleLine(true);
                ba0Var.setPadding(AndroidUtilities.dp(0.0f), 0, AndroidUtilities.dp(0.0f), AndroidUtilities.dp(0.0f));
                return ba0Var;
            default:
                TextView textView = new TextView(this.E);
                textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Pi, ((ProfileActivity) this.F).f30524z0));
                textView.setTextSize(0, AndroidUtilities.dp(13.5f));
                textView.setSingleLine(true);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                textView.setGravity(3);
                return textView;
        }
    }
}
