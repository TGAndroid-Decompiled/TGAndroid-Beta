package org.telegram.ui;

import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class g60 extends LinearLayout {
    public final org.telegram.ui.Components.o6 f33841a;
    public float f33842b;
    public final i60 f33843c;

    public g60(i60 i60Var, Context context) {
        super(context);
        this.f33843c = i60Var;
        this.f33842b = 0.0f;
        setOrientation(1);
        setGravity(17);
        org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(context, true, false, false);
        this.f33841a = o6Var;
        o6Var.setTextColor(-1);
        o6Var.setTextSize(AndroidUtilities.dp(46.0f));
        o6Var.setTypeface(AndroidUtilities.bold());
        o6Var.setGravity(1);
        TextView textView = new TextView(context);
        textView.setTextColor(-1);
        com.google.android.gms.internal.vision.e2.l(14.0f, 1, textView);
        textView.setText(LocaleController.getString(R.string.VoipChannelWatching));
        addView(o6Var, w7.y5.n(-1, 46));
        addView(textView, w7.y5.n(-2, -2));
    }

    public void setWatchersCount(int i10) {
        String formatNumber = LocaleController.formatNumber(i10, ',');
        org.telegram.ui.Components.o6 o6Var = this.f33841a;
        float measureText = o6Var.getPaint().measureText((CharSequence) formatNumber, 0, formatNumber.length());
        if (this.f33842b != measureText) {
            int i11 = org.telegram.ui.ActionBar.j6.Lj;
            i60 i60Var = this.f33843c;
            o6Var.getPaint().setShader(new LinearGradient(0.0f, 0.0f, measureText, 0.0f, new int[]{i60Var.getThemedColor(i11), i60Var.getThemedColor(org.telegram.ui.ActionBar.j6.Nj)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
            this.f33842b = measureText;
        }
        o6Var.setText(formatNumber);
    }
}
