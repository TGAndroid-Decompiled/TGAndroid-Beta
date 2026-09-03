package org.telegram.ui;

import android.app.Activity;
import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class p30 extends org.telegram.ui.Components.w7 {
    public final e60 B;
    public final Activity f36928y;

    public p30(e60 e60Var, LaunchActivity launchActivity, Activity activity) {
        super(launchActivity);
        this.B = e60Var;
        this.f36928y = activity;
    }

    @Override
    public final TextView a() {
        TextView textView = new TextView(this.f36928y);
        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19962hg, false));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(51);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setOnClickListener(new org.telegram.ui.Components.rx0(24, this, textView));
        return textView;
    }
}
