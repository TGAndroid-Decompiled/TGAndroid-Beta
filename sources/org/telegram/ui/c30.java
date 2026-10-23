package org.telegram.ui;

import android.app.Activity;
import android.text.TextUtils;
import android.widget.TextView;
public final class c30 extends org.telegram.ui.Components.e8 {
    public final u50 E;
    public final Activity f36237y;

    public c30(u50 u50Var, LaunchActivity launchActivity, Activity activity) {
        super(launchActivity);
        this.E = u50Var;
        this.f36237y = activity;
    }

    @Override
    public final TextView a() {
        TextView textView = new TextView(this.f36237y);
        org.telegram.messenger.v0.q(textView, org.telegram.ui.ActionBar.k6.f21262hg, null, 1, 20.0f);
        textView.setGravity(51);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setOnClickListener(new org.telegram.ui.Components.d51(20, this, textView));
        return textView;
    }
}
