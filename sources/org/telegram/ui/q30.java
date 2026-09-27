package org.telegram.ui;

import android.app.Activity;
import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class q30 extends org.telegram.ui.Components.d8 {
    public final g60 E;
    public final Activity f36611y;

    public q30(g60 g60Var, LaunchActivity launchActivity, Activity activity) {
        super(launchActivity);
        this.E = g60Var;
        this.f36611y = activity;
    }

    @Override
    public final TextView a() {
        TextView textView = new TextView(this.f36611y);
        textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19137hg, false));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(51);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setOnClickListener(new rv(9, this, textView));
        return textView;
    }
}
