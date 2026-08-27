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

    public final org.telegram.ui.Components.j6 f41522a;

    public float f41523b;

    public final s50 f41524c;

    public q50(s50 s50Var, Context context) {
        super(context);
        this.f41524c = s50Var;
        this.f41523b = 0.0f;
        setOrientation(1);
        setGravity(17);
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(context, true, false, false);
        this.f41522a = j6Var;
        j6Var.setTextColor(-1);
        j6Var.setTextSize(AndroidUtilities.dp(46.0f));
        j6Var.setTypeface(AndroidUtilities.bold());
        j6Var.setGravity(1);
        TextView textView = new TextView(context);
        textView.setTextColor(-1);
        org.telegram.ui.Cells.pa.m(14.0f, 1, textView);
        textView.setText(LocaleController.getString(R.string.VoipChannelWatching));
        addView(j6Var, h7.z5.n(-1, 46));
        addView(textView, h7.z5.n(-2, -2));
    }

    public void setWatchersCount(int i10) {
        String number = LocaleController.formatNumber(i10, ',');
        org.telegram.ui.Components.j6 j6Var = this.f41522a;
        float fMeasureText = j6Var.getPaint().measureText((CharSequence) number, 0, number.length());
        if (this.f41523b != fMeasureText) {
            int i11 = org.telegram.ui.ActionBar.g6.Lj;
            s50 s50Var = this.f41524c;
            j6Var.getPaint().setShader(new LinearGradient(0.0f, 0.0f, fMeasureText, 0.0f, new int[]{s50Var.getThemedColor(i11), s50Var.getThemedColor(org.telegram.ui.ActionBar.g6.Nj)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
            this.f41523b = fMeasureText;
        }
        j6Var.setText(number);
    }
}
