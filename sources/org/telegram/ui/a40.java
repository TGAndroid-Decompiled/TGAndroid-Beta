package org.telegram.ui;

import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.widget.LinearLayout;
import android.widget.TextView;
public final class a40 extends LinearLayout {
    public final org.telegram.ui.Components.h6 f44933a;
    public float f44934b;
    public final c40 f44935c;

    public a40(c40 c40Var, Context context) {
        super(context);
        this.f44935c = c40Var;
        this.f44934b = 0.0f;
        setOrientation(1);
        setGravity(17);
        org.telegram.ui.Components.h6 h6Var = new org.telegram.ui.Components.h6(context, true, false, false);
        this.f44933a = h6Var;
        h6Var.setTextColor(-1);
        h6Var.setTextSize(org.telegram.messenger.g0.L(46.0f));
        h6Var.setTypeface(org.telegram.messenger.g0.o());
        h6Var.setGravity(1);
        TextView textView = new TextView(context);
        textView.setTextColor(-1);
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setText(org.telegram.messenger.hd.M0(2131743446, null));
        addView(h6Var, c8.ja.o(-1, 46));
        addView(textView, c8.ja.o(-2, -2));
    }

    public void setWatchersCount(int i7) {
        String E = org.telegram.messenger.hd.E(i7, ',');
        org.telegram.ui.Components.h6 h6Var = this.f44933a;
        float measureText = h6Var.getPaint().measureText((CharSequence) E, 0, E.length());
        if (this.f44934b != measureText) {
            int i10 = org.telegram.ui.ActionBar.j6.Ck;
            c40 c40Var = this.f44935c;
            h6Var.getPaint().setShader(new LinearGradient(0.0f, 0.0f, measureText, 0.0f, new int[]{org.telegram.ui.ActionBar.j6.w0(i10, c40Var.J0), org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Ek, c40Var.J0)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
            this.f44934b = measureText;
        }
        h6Var.setText(E);
    }
}
