package org.telegram.ui;

import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class c60 extends LinearLayout {
    public final org.telegram.ui.Components.k6 f33026a;
    public float f33027b;
    public final e60 f33028c;

    public c60(e60 e60Var, Context context) {
        super(context);
        this.f33028c = e60Var;
        this.f33027b = 0.0f;
        setOrientation(1);
        setGravity(17);
        org.telegram.ui.Components.k6 k6Var = new org.telegram.ui.Components.k6(context, true, false, false);
        this.f33026a = k6Var;
        k6Var.setTextColor(-1);
        k6Var.setTextSize(AndroidUtilities.dp(46.0f));
        k6Var.setTypeface(AndroidUtilities.bold());
        k6Var.setGravity(1);
        TextView textView = new TextView(context);
        textView.setTextColor(-1);
        ai.o(14.0f, 1, textView);
        textView.setText(LocaleController.getString(R.string.VoipChannelWatching));
        addView(k6Var, k7.b6.n(-1, 46));
        addView(textView, k7.b6.n(-2, -2));
    }

    public void setWatchersCount(int i10) {
        String formatNumber = LocaleController.formatNumber(i10, ',');
        org.telegram.ui.Components.k6 k6Var = this.f33026a;
        float measureText = k6Var.getPaint().measureText((CharSequence) formatNumber, 0, formatNumber.length());
        if (this.f33027b != measureText) {
            int i11 = org.telegram.ui.ActionBar.j6.Lj;
            e60 e60Var = this.f33028c;
            k6Var.getPaint().setShader(new LinearGradient(0.0f, 0.0f, measureText, 0.0f, new int[]{e60Var.getThemedColor(i11), e60Var.getThemedColor(org.telegram.ui.ActionBar.j6.Nj)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
            this.f33027b = measureText;
        }
        k6Var.setText(formatNumber);
    }
}
