package org.telegram.ui;

import android.app.Activity;
import android.text.TextUtils;
import android.widget.TextView;
public final class q10 extends org.telegram.ui.Components.t7 {
    public final Activity E;
    public final c40 F;

    public q10(c40 c40Var, LaunchActivity launchActivity, Activity activity) {
        super(launchActivity);
        this.F = c40Var;
        this.E = activity;
    }

    @Override
    public final TextView a() {
        TextView textView = new TextView(this.E);
        org.telegram.messenger.k5.m(textView, org.telegram.ui.ActionBar.j6.Yg, null, 1, 20.0f);
        textView.setGravity(51);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setOnClickListener(new org.telegram.ui.Components.vv0(24, this, textView));
        return textView;
    }
}
