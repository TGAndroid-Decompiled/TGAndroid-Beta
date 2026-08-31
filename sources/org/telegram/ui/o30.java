package org.telegram.ui;

import android.app.Activity;
import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class o30 extends org.telegram.ui.Components.w7 {
    public final d60 B;
    public final Activity f39577y;

    public o30(d60 d60Var, LaunchActivity launchActivity, Activity activity) {
        super(launchActivity);
        this.B = d60Var;
        this.f39577y = activity;
    }

    @Override
    public final TextView a() {
        TextView textView = new TextView(this.f39577y);
        textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21741hg, false));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(51);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setOnClickListener(new org.telegram.ui.Components.sx0(24, this, textView));
        return textView;
    }
}
