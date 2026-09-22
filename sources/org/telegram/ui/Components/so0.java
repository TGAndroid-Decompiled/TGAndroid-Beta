package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ProfileActivity;
public final class so0 extends c8 {
    public final Context E;
    public final Object F;
    public final int f28287y;

    public so0(Object obj, Context context, Context context2, int i10) {
        super(context);
        this.f28287y = i10;
        this.F = obj;
        this.E = context2;
    }

    @Override
    public final TextView a() {
        switch (this.f28287y) {
            case 0:
                ca0 ca0Var = new ca0(this.E);
                ca0Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Si, ((uo0) this.F).M));
                ca0Var.setTextSize(1, 12.0f);
                ca0Var.setEllipsize(TextUtils.TruncateAt.END);
                ca0Var.setSingleLine(true);
                ca0Var.setPadding(AndroidUtilities.dp(0.0f), 0, AndroidUtilities.dp(0.0f), AndroidUtilities.dp(0.0f));
                return ca0Var;
            default:
                TextView textView = new TextView(this.E);
                textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Pi, ((ProfileActivity) this.F).f31717z0));
                textView.setTextSize(0, AndroidUtilities.dp(13.5f));
                textView.setSingleLine(true);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                textView.setGravity(3);
                return textView;
        }
    }
}
