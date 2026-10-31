package org.telegram.ui;

import android.app.Activity;
import android.text.TextUtils;
import android.widget.TextView;
public final class q20 extends org.telegram.ui.Components.r7 {
    public final Activity D;
    public final b50 E;

    public q20(b50 b50Var, LaunchActivity launchActivity, Activity activity) {
        super(launchActivity);
        this.E = b50Var;
        this.D = activity;
    }

    @Override
    public final TextView a() {
        TextView textView = new TextView(this.D);
        org.telegram.messenger.m5.m(textView, org.telegram.ui.ActionBar.t6.Vg, null, 1, 20.0f);
        textView.setGravity(51);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setOnClickListener(new wu(9, this, textView));
        return textView;
    }
}
