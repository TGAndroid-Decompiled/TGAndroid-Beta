package org.telegram.ui;

import android.app.Activity;
import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class q30 extends org.telegram.ui.Components.f8 {
    public final g60 E;
    public final Activity f41034y;

    public q30(g60 g60Var, LaunchActivity launchActivity, Activity activity) {
        super(launchActivity);
        this.E = g60Var;
        this.f41034y = activity;
    }

    @Override
    public final TextView a() {
        TextView textView = new TextView(this.f41034y);
        textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20867hg, false));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(51);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setOnClickListener(new qv(9, this, textView));
        return textView;
    }
}
