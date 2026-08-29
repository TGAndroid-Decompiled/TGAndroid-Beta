package org.telegram.ui;

import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class p50 extends LinearLayout {
    public final org.telegram.ui.Components.o6 f41296a;
    public float f41297b;
    public final r50 f41298c;

    public p50(r50 r50Var, Context context) {
        super(context);
        this.f41298c = r50Var;
        this.f41297b = 0.0f;
        setOrientation(1);
        setGravity(17);
        org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(context, true, false, false);
        this.f41296a = o6Var;
        o6Var.setTextColor(-1);
        o6Var.setTextSize(AndroidUtilities.dp(46.0f));
        o6Var.setTypeface(AndroidUtilities.bold());
        o6Var.setGravity(1);
        TextView textView = new TextView(context);
        textView.setTextColor(-1);
        th.n(14.0f, 1, textView);
        textView.setText(LocaleController.getString(R.string.VoipChannelWatching));
        addView(o6Var, i7.f6.n(-1, 46));
        addView(textView, i7.f6.n(-2, -2));
    }

    public void setWatchersCount(int i10) {
        String formatNumber = LocaleController.formatNumber(i10, ',');
        org.telegram.ui.Components.o6 o6Var = this.f41296a;
        float measureText = o6Var.getPaint().measureText((CharSequence) formatNumber, 0, formatNumber.length());
        if (this.f41297b != measureText) {
            int i11 = org.telegram.ui.ActionBar.g6.Lj;
            r50 r50Var = this.f41298c;
            o6Var.getPaint().setShader(new LinearGradient(0.0f, 0.0f, measureText, 0.0f, new int[]{r50Var.getThemedColor(i11), r50Var.getThemedColor(org.telegram.ui.ActionBar.g6.Nj)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
            this.f41297b = measureText;
        }
        o6Var.setText(formatNumber);
    }
}
