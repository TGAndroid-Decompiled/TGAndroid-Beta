package org.telegram.ui;

import android.app.Activity;
import android.text.TextUtils;
import android.widget.TextView;
public final class g30 extends org.telegram.ui.Components.g8 {
    public final x50 E;
    public final Activity f39484y;

    public g30(x50 x50Var, LaunchActivity launchActivity, Activity activity) {
        super(launchActivity);
        this.E = x50Var;
        this.f39484y = activity;
    }

    @Override
    public final TextView a() {
        TextView textView = new TextView(this.f39484y);
        org.telegram.messenger.t.r(textView, org.telegram.ui.ActionBar.y6.f23439hg, null, 1, 20.0f);
        textView.setGravity(51);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setOnClickListener(new org.telegram.ui.Components.l51(20, this, textView));
        return textView;
    }
}
