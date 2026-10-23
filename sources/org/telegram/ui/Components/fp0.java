package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ProfileActivity;
public final class fp0 extends e8 {
    public final Context E;
    public final Object F;
    public final int f26435y;

    public fp0(Object obj, Context context, Context context2, int i10) {
        super(context);
        this.f26435y = i10;
        this.F = obj;
        this.E = context2;
    }

    @Override
    public final TextView a() {
        switch (this.f26435y) {
            case 0:
                na0 na0Var = new na0(this.E);
                org.telegram.ui.ActionBar.r6.W(na0Var, org.telegram.ui.ActionBar.k6.Si, ((hp0) this.F).N);
                na0Var.setTextSize(1, 12.0f);
                na0Var.setEllipsize(TextUtils.TruncateAt.END);
                na0Var.setSingleLine(true);
                na0Var.setPadding(AndroidUtilities.dp(0.0f), 0, AndroidUtilities.dp(0.0f), AndroidUtilities.dp(0.0f));
                return na0Var;
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
