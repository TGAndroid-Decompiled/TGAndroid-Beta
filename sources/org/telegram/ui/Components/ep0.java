package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ProfileActivity;
public final class ep0 extends c8 {
    public final Context E;
    public final Object F;
    public final int f26091y;

    public ep0(Object obj, Context context, Context context2, int i10) {
        super(context);
        this.f26091y = i10;
        this.F = obj;
        this.E = context2;
    }

    @Override
    public final TextView a() {
        switch (this.f26091y) {
            case 0:
                la0 la0Var = new la0(this.E);
                org.telegram.ui.ActionBar.r6.W(la0Var, org.telegram.ui.ActionBar.k6.Si, ((gp0) this.F).N);
                la0Var.setTextSize(1, 12.0f);
                la0Var.setEllipsize(TextUtils.TruncateAt.END);
                la0Var.setSingleLine(true);
                la0Var.setPadding(AndroidUtilities.dp(0.0f), 0, AndroidUtilities.dp(0.0f), AndroidUtilities.dp(0.0f));
                return la0Var;
            default:
                TextView textView = new TextView(this.E);
                org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.Pi, ((ProfileActivity) this.F).A0);
                textView.setTextSize(0, AndroidUtilities.dp(13.5f));
                textView.setSingleLine(true);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                textView.setGravity(3);
                return textView;
        }
    }
}
