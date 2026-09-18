package org.telegram.ui;

import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class i60 extends LinearLayout {
    public final org.telegram.ui.Components.n6 f34441a;
    public float f34442b;
    public final k60 f34443c;

    public i60(k60 k60Var, Context context) {
        super(context);
        this.f34443c = k60Var;
        this.f34442b = 0.0f;
        setOrientation(1);
        setGravity(17);
        org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(context, true, false, false);
        this.f34441a = n6Var;
        n6Var.setTextColor(-1);
        n6Var.setTextSize(AndroidUtilities.dp(46.0f));
        n6Var.setTypeface(AndroidUtilities.bold());
        n6Var.setGravity(1);
        TextView textView = new TextView(context);
        textView.setTextColor(-1);
        com.google.android.gms.internal.vision.e2.l(14.0f, 1, textView);
        textView.setText(LocaleController.getString(R.string.VoipChannelWatching));
        addView(n6Var, w7.x5.n(-1, 46));
        addView(textView, w7.x5.n(-2, -2));
    }

    public void setWatchersCount(int i10) {
        String formatNumber = LocaleController.formatNumber(i10, ',');
        org.telegram.ui.Components.n6 n6Var = this.f34441a;
        float measureText = n6Var.getPaint().measureText((CharSequence) formatNumber, 0, formatNumber.length());
        if (this.f34442b != measureText) {
            int i11 = org.telegram.ui.ActionBar.j6.Lj;
            k60 k60Var = this.f34443c;
            n6Var.getPaint().setShader(new LinearGradient(0.0f, 0.0f, measureText, 0.0f, new int[]{k60Var.getThemedColor(i11), k60Var.getThemedColor(org.telegram.ui.ActionBar.j6.Nj)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
            this.f34442b = measureText;
        }
        n6Var.setText(formatNumber);
    }
}
