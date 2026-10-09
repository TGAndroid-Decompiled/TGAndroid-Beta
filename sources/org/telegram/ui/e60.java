package org.telegram.ui;

import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class e60 extends LinearLayout {
    public final org.telegram.ui.Components.r6 f37165a;
    public float f37166b;
    public final g60 f37167c;

    public e60(g60 g60Var, Context context) {
        super(context);
        this.f37167c = g60Var;
        this.f37166b = 0.0f;
        setOrientation(1);
        setGravity(17);
        org.telegram.ui.Components.r6 r6Var = new org.telegram.ui.Components.r6(context, true, false, false);
        this.f37165a = r6Var;
        r6Var.setTextColor(-1);
        r6Var.setTextSize(AndroidUtilities.dp(46.0f));
        r6Var.setTypeface(AndroidUtilities.bold());
        r6Var.setGravity(1);
        TextView textView = new TextView(context);
        textView.setTextColor(-1);
        com.google.android.gms.internal.vision.e2.l(14.0f, 1, textView);
        textView.setText(LocaleController.getString(R.string.VoipChannelWatching));
        addView(r6Var, w7.x5.n(-1, 46));
        addView(textView, w7.x5.n(-2, -2));
    }

    public void setWatchersCount(int i10) {
        String formatNumber = LocaleController.formatNumber(i10, ',');
        org.telegram.ui.Components.r6 r6Var = this.f37165a;
        float measureText = r6Var.getPaint().measureText((CharSequence) formatNumber, 0, formatNumber.length());
        if (this.f37166b != measureText) {
            int i11 = org.telegram.ui.ActionBar.i6.Lj;
            g60 g60Var = this.f37167c;
            r6Var.getPaint().setShader(new LinearGradient(0.0f, 0.0f, measureText, 0.0f, new int[]{g60Var.getThemedColor(i11), g60Var.getThemedColor(org.telegram.ui.ActionBar.i6.Nj)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
            this.f37166b = measureText;
        }
        r6Var.setText(formatNumber);
    }
}
