package org.telegram.ui;

import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class l60 extends LinearLayout {
    public final org.telegram.ui.Components.s6 f37619a;
    public float f37620b;
    public final n60 f37621c;

    public l60(n60 n60Var, Context context) {
        super(context);
        this.f37621c = n60Var;
        this.f37620b = 0.0f;
        setOrientation(1);
        setGravity(17);
        org.telegram.ui.Components.s6 s6Var = new org.telegram.ui.Components.s6(context, true, false, false);
        this.f37619a = s6Var;
        s6Var.setTextColor(-1);
        s6Var.setTextSize(AndroidUtilities.dp(46.0f));
        s6Var.setTypeface(AndroidUtilities.bold());
        s6Var.setGravity(1);
        TextView textView = new TextView(context);
        textView.setTextColor(-1);
        com.google.android.gms.internal.play_billing.k3.m(14.0f, 1, textView);
        textView.setText(LocaleController.getString(R.string.VoipChannelWatching));
        addView(s6Var, w7.z5.n(-1, 46));
        addView(textView, w7.z5.n(-2, -2));
    }

    public void setWatchersCount(int i10) {
        String formatNumber = LocaleController.formatNumber(i10, ',');
        org.telegram.ui.Components.s6 s6Var = this.f37619a;
        float measureText = s6Var.getPaint().measureText((CharSequence) formatNumber, 0, formatNumber.length());
        if (this.f37620b != measureText) {
            int i11 = org.telegram.ui.ActionBar.g6.Lj;
            n60 n60Var = this.f37621c;
            s6Var.getPaint().setShader(new LinearGradient(0.0f, 0.0f, measureText, 0.0f, new int[]{n60Var.getThemedColor(i11), n60Var.getThemedColor(org.telegram.ui.ActionBar.g6.Nj)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
            this.f37620b = measureText;
        }
        s6Var.setText(formatNumber);
    }
}
