package org.telegram.ui;

import android.app.Activity;
import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class b30 extends org.telegram.ui.Components.e8 {
    public final s50 E;
    public final Activity f35541y;

    public b30(s50 s50Var, LaunchActivity launchActivity, Activity activity) {
        super(launchActivity);
        this.E = s50Var;
        this.f35541y = activity;
    }

    @Override
    public final TextView a() {
        TextView textView = new TextView(this.f35541y);
        textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21065hg, false));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(51);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setOnClickListener(new org.telegram.ui.Components.g51(19, this, textView));
        return textView;
    }
}
