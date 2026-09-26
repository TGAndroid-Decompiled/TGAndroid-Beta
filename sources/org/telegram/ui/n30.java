package org.telegram.ui;

import android.app.Activity;
import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class n30 extends org.telegram.ui.Components.d8 {
    public final d60 E;
    public final Activity f35743y;

    public n30(d60 d60Var, LaunchActivity launchActivity, Activity activity) {
        super(launchActivity);
        this.E = d60Var;
        this.f35743y = activity;
    }

    @Override
    public final TextView a() {
        TextView textView = new TextView(this.f35743y);
        textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19138hg, false));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(51);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setOnClickListener(new ov(9, this, textView));
        return textView;
    }
}
