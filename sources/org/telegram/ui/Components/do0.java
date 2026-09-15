package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ProfileActivity;
public final class do0 extends b8 {
    public final Context E;
    public final Object F;
    public final int f23370y;

    public do0(Object obj, Context context, Context context2, int i10) {
        super(context);
        this.f23370y = i10;
        this.F = obj;
        this.E = context2;
    }

    @Override
    public final TextView a() {
        switch (this.f23370y) {
            case 0:
                r90 r90Var = new r90(this.E);
                r90Var.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Si, ((fo0) this.F).M));
                r90Var.setTextSize(1, 12.0f);
                r90Var.setEllipsize(TextUtils.TruncateAt.END);
                r90Var.setSingleLine(true);
                r90Var.setPadding(AndroidUtilities.dp(0.0f), 0, AndroidUtilities.dp(0.0f), AndroidUtilities.dp(0.0f));
                return r90Var;
            default:
                TextView textView = new TextView(this.E);
                textView.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Pi, ((ProfileActivity) this.F).f31412z0));
                textView.setTextSize(0, AndroidUtilities.dp(13.5f));
                textView.setSingleLine(true);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                textView.setGravity(3);
                return textView;
        }
    }
}
