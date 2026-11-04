package org.telegram.ui;

import android.app.Activity;
import android.text.TextUtils;
import android.widget.TextView;
public final class m10 extends org.telegram.ui.Components.u7 {
    public final Activity E;
    public final x30 F;

    public m10(x30 x30Var, LaunchActivity launchActivity, Activity activity) {
        super(launchActivity);
        this.F = x30Var;
        this.E = activity;
    }

    @Override
    public final TextView a() {
        TextView textView = new TextView(this.E);
        org.telegram.messenger.k5.n(textView, org.telegram.ui.ActionBar.k6.Vg, null, 1, 20.0f);
        textView.setGravity(51);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setOnClickListener(new org.telegram.ui.Components.ux0(22, (Object) this, (Object) textView));
        return textView;
    }
}
