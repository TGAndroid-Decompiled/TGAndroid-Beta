package org.telegram.ui;

import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class o50 extends LinearLayout {
    public final org.telegram.ui.Components.q6 f39769a;
    public float f39770b;
    public final q50 f39771c;

    public o50(q50 q50Var, Context context) {
        super(context);
        this.f39771c = q50Var;
        this.f39770b = 0.0f;
        setOrientation(1);
        setGravity(17);
        org.telegram.ui.Components.q6 q6Var = new org.telegram.ui.Components.q6(context, true, false, false);
        this.f39769a = q6Var;
        q6Var.setTextColor(-1);
        q6Var.setTextSize(AndroidUtilities.dp(46.0f));
        q6Var.setTypeface(AndroidUtilities.bold());
        q6Var.setGravity(1);
        TextView textView = new TextView(context);
        textView.setTextColor(-1);
        com.google.android.gms.internal.play_billing.k3.m(14.0f, 1, textView);
        textView.setText(LocaleController.getString(R.string.VoipChannelWatching));
        addView(q6Var, w7.z5.n(-1, 46));
        addView(textView, w7.z5.n(-2, -2));
    }

    public void setWatchersCount(int i10) {
        String formatNumber = LocaleController.formatNumber(i10, ',');
        org.telegram.ui.Components.q6 q6Var = this.f39769a;
        float measureText = q6Var.getPaint().measureText((CharSequence) formatNumber, 0, formatNumber.length());
        if (this.f39770b != measureText) {
            int i11 = org.telegram.ui.ActionBar.h6.Lj;
            q50 q50Var = this.f39771c;
            q6Var.getPaint().setShader(new LinearGradient(0.0f, 0.0f, measureText, 0.0f, new int[]{q50Var.getThemedColor(i11), q50Var.getThemedColor(org.telegram.ui.ActionBar.h6.Nj)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
            this.f39770b = measureText;
        }
        q6Var.setText(formatNumber);
    }
}
