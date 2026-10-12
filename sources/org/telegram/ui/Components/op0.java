package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ProfileActivity;
public final class op0 extends f8 {
    public final Context E;
    public final Object F;
    public final int f29271y;

    public op0(Object obj, Context context, Context context2, int i10) {
        super(context);
        this.f29271y = i10;
        this.F = obj;
        this.E = context2;
    }

    @Override
    public final TextView a() {
        switch (this.f29271y) {
            case 0:
                xa0 xa0Var = new xa0(this.E);
                xa0Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Si, ((qp0) this.F).M));
                xa0Var.setTextSize(1, 12.0f);
                xa0Var.setEllipsize(TextUtils.TruncateAt.END);
                xa0Var.setSingleLine(true);
                xa0Var.setPadding(AndroidUtilities.dp(0.0f), 0, AndroidUtilities.dp(0.0f), AndroidUtilities.dp(0.0f));
                return xa0Var;
            default:
                TextView textView = new TextView(this.E);
                textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Pi, ((ProfileActivity) this.F).f34225z0));
                textView.setTextSize(0, AndroidUtilities.dp(13.5f));
                textView.setSingleLine(true);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                textView.setGravity(3);
                return textView;
        }
    }
}
