package org.telegram.ui;

import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class f60 extends LinearLayout {
    public final org.telegram.ui.Components.p6 f36209a;
    public float f36210b;
    public final h60 f36211c;

    public f60(h60 h60Var, Context context) {
        super(context);
        this.f36211c = h60Var;
        this.f36210b = 0.0f;
        setOrientation(1);
        setGravity(17);
        org.telegram.ui.Components.p6 p6Var = new org.telegram.ui.Components.p6(context, true, false, false);
        this.f36209a = p6Var;
        p6Var.setTextColor(-1);
        p6Var.setTextSize(AndroidUtilities.dp(46.0f));
        p6Var.setTypeface(AndroidUtilities.bold());
        p6Var.setGravity(1);
        TextView textView = new TextView(context);
        textView.setTextColor(-1);
        com.google.android.gms.internal.vision.e2.l(14.0f, 1, textView);
        textView.setText(LocaleController.getString(R.string.VoipChannelWatching));
        addView(p6Var, w7.z5.n(-1, 46));
        addView(textView, w7.z5.n(-2, -2));
    }

    public void setWatchersCount(int i10) {
        String formatNumber = LocaleController.formatNumber(i10, ',');
        org.telegram.ui.Components.p6 p6Var = this.f36209a;
        float measureText = p6Var.getPaint().measureText((CharSequence) formatNumber, 0, formatNumber.length());
        if (this.f36210b != measureText) {
            int i11 = org.telegram.ui.ActionBar.i6.Lj;
            h60 h60Var = this.f36211c;
            p6Var.getPaint().setShader(new LinearGradient(0.0f, 0.0f, measureText, 0.0f, new int[]{h60Var.getThemedColor(i11), h60Var.getThemedColor(org.telegram.ui.ActionBar.i6.Nj)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
            this.f36210b = measureText;
        }
        p6Var.setText(formatNumber);
    }
}
