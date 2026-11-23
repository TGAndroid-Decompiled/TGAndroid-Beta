package org.telegram.ui;

import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.widget.LinearLayout;
import android.widget.TextView;
public final class d40 extends LinearLayout {
    public final org.telegram.ui.Components.o6 f46833a;
    public float f46834b;
    public final f40 f46835c;

    public d40(f40 f40Var, Context context) {
        super(context);
        this.f46835c = f40Var;
        this.f46834b = 0.0f;
        setOrientation(1);
        setGravity(17);
        org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(context, true, false, false);
        this.f46833a = o6Var;
        o6Var.setTextColor(-1);
        o6Var.setTextSize(org.telegram.messenger.g0.L(46.0f));
        o6Var.setTypeface(org.telegram.messenger.g0.o());
        o6Var.setGravity(1);
        TextView textView = new TextView(context);
        textView.setTextColor(-1);
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setText(org.telegram.messenger.hd.N0(2131743203, null));
        addView(o6Var, c8.na.o(-1, 46));
        addView(textView, c8.na.o(-2, -2));
    }

    public void setWatchersCount(int i7) {
        String E = org.telegram.messenger.hd.E(i7, ',');
        org.telegram.ui.Components.o6 o6Var = this.f46833a;
        float measureText = o6Var.getPaint().measureText((CharSequence) E, 0, E.length());
        if (this.f46834b != measureText) {
            int i10 = org.telegram.ui.ActionBar.m6.Ck;
            f40 f40Var = this.f46835c;
            o6Var.getPaint().setShader(new LinearGradient(0.0f, 0.0f, measureText, 0.0f, new int[]{org.telegram.ui.ActionBar.m6.w0(i10, f40Var.J0), org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Ek, f40Var.J0)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
            this.f46834b = measureText;
        }
        o6Var.setText(E);
    }
}
