package org.telegram.ui;

import android.app.Activity;
import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

public final class b30 extends org.telegram.ui.Components.v7 {
    public final s50 A;

    public final Activity f36693y;

    public b30(s50 s50Var, LaunchActivity launchActivity, Activity activity) {
        super(launchActivity);
        this.A = s50Var;
        this.f36693y = activity;
    }

    @Override
    public final TextView a() {
        TextView textView = new TextView(this.f36693y);
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23135hg, false));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(51);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setOnClickListener(new org.telegram.ui.Components.xh0(27, this, textView));
        return textView;
    }
}
