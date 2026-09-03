package org.telegram.ui;

import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class b60 extends LinearLayout {
    public final org.telegram.ui.Components.k6 f35361a;
    public float f35362b;
    public final d60 f35363c;

    public b60(d60 d60Var, Context context) {
        super(context);
        this.f35363c = d60Var;
        this.f35362b = 0.0f;
        setOrientation(1);
        setGravity(17);
        org.telegram.ui.Components.k6 k6Var = new org.telegram.ui.Components.k6(context, true, false, false);
        this.f35361a = k6Var;
        k6Var.setTextColor(-1);
        k6Var.setTextSize(AndroidUtilities.dp(46.0f));
        k6Var.setTypeface(AndroidUtilities.bold());
        k6Var.setGravity(1);
        TextView textView = new TextView(context);
        textView.setTextColor(-1);
        yh.p(14.0f, 1, textView);
        textView.setText(LocaleController.getString(R.string.VoipChannelWatching));
        addView(k6Var, k7.c6.n(-1, 46));
        addView(textView, k7.c6.n(-2, -2));
    }

    public void setWatchersCount(int i10) {
        String formatNumber = LocaleController.formatNumber(i10, ',');
        org.telegram.ui.Components.k6 k6Var = this.f35361a;
        float measureText = k6Var.getPaint().measureText((CharSequence) formatNumber, 0, formatNumber.length());
        if (this.f35362b != measureText) {
            int i11 = org.telegram.ui.ActionBar.k6.Lj;
            d60 d60Var = this.f35363c;
            k6Var.getPaint().setShader(new LinearGradient(0.0f, 0.0f, measureText, 0.0f, new int[]{d60Var.getThemedColor(i11), d60Var.getThemedColor(org.telegram.ui.ActionBar.k6.Nj)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
            this.f35362b = measureText;
        }
        k6Var.setText(formatNumber);
    }
}
