package org.telegram.ui;

import android.app.Activity;
import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class n30 extends org.telegram.ui.Components.w7 {
    public final c60 B;
    public final Activity f36436y;

    public n30(c60 c60Var, LaunchActivity launchActivity, Activity activity) {
        super(launchActivity);
        this.B = c60Var;
        this.f36436y = activity;
    }

    @Override
    public final TextView a() {
        TextView textView = new TextView(this.f36436y);
        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19987hg, false));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(51);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setOnClickListener(new org.telegram.ui.Components.rx0(24, this, textView));
        return textView;
    }
}
