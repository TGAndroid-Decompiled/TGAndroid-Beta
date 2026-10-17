package org.telegram.ui;

import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class q50 extends LinearLayout {
    public final org.telegram.ui.Components.q6 f40314a;
    public float f40315b;
    public final s50 f40316c;

    public q50(s50 s50Var, Context context) {
        super(context);
        this.f40316c = s50Var;
        this.f40315b = 0.0f;
        setOrientation(1);
        setGravity(17);
        org.telegram.ui.Components.q6 q6Var = new org.telegram.ui.Components.q6(context, true, false, false);
        this.f40314a = q6Var;
        q6Var.setTextColor(-1);
        q6Var.setTextSize(AndroidUtilities.dp(46.0f));
        q6Var.setTypeface(AndroidUtilities.bold());
        q6Var.setGravity(1);
        TextView textView = new TextView(context);
        textView.setTextColor(-1);
        com.google.android.gms.internal.cast.a6.m(14.0f, 1, textView);
        textView.setText(LocaleController.getString(R.string.VoipChannelWatching));
        addView(q6Var, w7.z5.n(-1, 46));
        addView(textView, w7.z5.n(-2, -2));
    }

    public void setWatchersCount(int i10) {
        String formatNumber = LocaleController.formatNumber(i10, ',');
        org.telegram.ui.Components.q6 q6Var = this.f40314a;
        float measureText = q6Var.getPaint().measureText((CharSequence) formatNumber, 0, formatNumber.length());
        if (this.f40315b != measureText) {
            int i11 = org.telegram.ui.ActionBar.h6.Lj;
            s50 s50Var = this.f40316c;
            q6Var.getPaint().setShader(new LinearGradient(0.0f, 0.0f, measureText, 0.0f, new int[]{s50Var.getThemedColor(i11), s50Var.getThemedColor(org.telegram.ui.ActionBar.h6.Nj)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
            this.f40315b = measureText;
        }
        q6Var.setText(formatNumber);
    }
}
