package org.telegram.ui;

import android.app.Activity;
import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class p30 extends org.telegram.ui.Components.d8 {
    public final f60 E;
    public final Activity f36018y;

    public p30(f60 f60Var, LaunchActivity launchActivity, Activity activity) {
        super(launchActivity);
        this.E = f60Var;
        this.f36018y = activity;
    }

    @Override
    public final TextView a() {
        TextView textView = new TextView(this.f36018y);
        textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f18868hg, false));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(51);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setOnClickListener(new pv(9, this, textView));
        return textView;
    }
}
