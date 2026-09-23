package org.telegram.ui;

import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class d60 extends LinearLayout {
    public final org.telegram.ui.Components.p6 f32522a;
    public float f32523b;
    public final f60 f32524c;

    public d60(f60 f60Var, Context context) {
        super(context);
        this.f32524c = f60Var;
        this.f32523b = 0.0f;
        setOrientation(1);
        setGravity(17);
        org.telegram.ui.Components.p6 p6Var = new org.telegram.ui.Components.p6(context, true, false, false);
        this.f32522a = p6Var;
        p6Var.setTextColor(-1);
        p6Var.setTextSize(AndroidUtilities.dp(46.0f));
        p6Var.setTypeface(AndroidUtilities.bold());
        p6Var.setGravity(1);
        TextView textView = new TextView(context);
        textView.setTextColor(-1);
        com.google.android.gms.internal.vision.e2.l(14.0f, 1, textView);
        textView.setText(LocaleController.getString(R.string.VoipChannelWatching));
        addView(p6Var, w7.x5.n(-1, 46));
        addView(textView, w7.x5.n(-2, -2));
    }

    public void setWatchersCount(int i10) {
        String formatNumber = LocaleController.formatNumber(i10, ',');
        org.telegram.ui.Components.p6 p6Var = this.f32522a;
        float measureText = p6Var.getPaint().measureText((CharSequence) formatNumber, 0, formatNumber.length());
        if (this.f32523b != measureText) {
            int i11 = org.telegram.ui.ActionBar.h6.Lj;
            f60 f60Var = this.f32524c;
            p6Var.getPaint().setShader(new LinearGradient(0.0f, 0.0f, measureText, 0.0f, new int[]{f60Var.getThemedColor(i11), f60Var.getThemedColor(org.telegram.ui.ActionBar.h6.Nj)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
            this.f32523b = measureText;
        }
        p6Var.setText(formatNumber);
    }
}
