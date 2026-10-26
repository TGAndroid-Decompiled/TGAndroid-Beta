package org.telegram.ui;

import android.app.Activity;
import android.text.TextUtils;
import android.widget.TextView;
public final class e30 extends org.telegram.ui.Components.g8 {
    public final v50 E;
    public final Activity f38973y;

    public e30(v50 v50Var, LaunchActivity launchActivity, Activity activity) {
        super(launchActivity);
        this.E = v50Var;
        this.f38973y = activity;
    }

    @Override
    public final TextView a() {
        TextView textView = new TextView(this.f38973y);
        org.telegram.messenger.t.r(textView, org.telegram.ui.ActionBar.y6.f23438hg, null, 1, 20.0f);
        textView.setGravity(51);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setOnClickListener(new org.telegram.ui.Components.k51(20, this, textView));
        return textView;
    }
}
