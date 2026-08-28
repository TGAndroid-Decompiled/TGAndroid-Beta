package org.telegram.ui;

import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class m50 extends LinearLayout {
    public final org.telegram.ui.Components.j6 f40330a;
    public float f40331b;
    public final o50 f40332c;

    public m50(o50 o50Var, Context context) {
        super(context);
        this.f40332c = o50Var;
        this.f40331b = 0.0f;
        setOrientation(1);
        setGravity(17);
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(context, true, false, false);
        this.f40330a = j6Var;
        j6Var.setTextColor(-1);
        j6Var.setTextSize(AndroidUtilities.dp(46.0f));
        j6Var.setTypeface(AndroidUtilities.bold());
        j6Var.setGravity(1);
        TextView textView = new TextView(context);
        textView.setTextColor(-1);
        j3.r0.u(14.0f, 1, textView);
        textView.setText(LocaleController.getString(R.string.VoipChannelWatching));
        addView(j6Var, g7.e6.n(-1, 46));
        addView(textView, g7.e6.n(-2, -2));
    }

    public void setWatchersCount(int i9) {
        String formatNumber = LocaleController.formatNumber(i9, ',');
        org.telegram.ui.Components.j6 j6Var = this.f40330a;
        float measureText = j6Var.getPaint().measureText((CharSequence) formatNumber, 0, formatNumber.length());
        if (this.f40331b != measureText) {
            int i10 = org.telegram.ui.ActionBar.f6.Lj;
            o50 o50Var = this.f40332c;
            j6Var.getPaint().setShader(new LinearGradient(0.0f, 0.0f, measureText, 0.0f, new int[]{o50Var.getThemedColor(i10), o50Var.getThemedColor(org.telegram.ui.ActionBar.f6.Nj)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
            this.f40331b = measureText;
        }
        j6Var.setText(formatNumber);
    }
}
