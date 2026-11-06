package org.telegram.ui;

import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.widget.LinearLayout;
import android.widget.TextView;
public final class a40 extends LinearLayout {
    public final org.telegram.ui.Components.j6 f43560a;
    public float f43561b;
    public final c40 f43562c;

    public a40(c40 c40Var, Context context) {
        super(context);
        this.f43562c = c40Var;
        this.f43561b = 0.0f;
        setOrientation(1);
        setGravity(17);
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(context, true, false, false);
        this.f43560a = j6Var;
        j6Var.setTextColor(-1);
        j6Var.setTextSize(org.telegram.messenger.g0.L(46.0f));
        j6Var.setTypeface(org.telegram.messenger.g0.o());
        j6Var.setGravity(1);
        TextView textView = new TextView(context);
        textView.setTextColor(-1);
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setText(org.telegram.messenger.hd.M0(2131743447, null));
        addView(j6Var, c8.ha.o(-1, 46));
        addView(textView, c8.ha.o(-2, -2));
    }

    public void setWatchersCount(int i7) {
        String E = org.telegram.messenger.hd.E(i7, ',');
        org.telegram.ui.Components.j6 j6Var = this.f43560a;
        float measureText = j6Var.getPaint().measureText((CharSequence) E, 0, E.length());
        if (this.f43561b != measureText) {
            int i10 = org.telegram.ui.ActionBar.k6.zk;
            c40 c40Var = this.f43562c;
            j6Var.getPaint().setShader(new LinearGradient(0.0f, 0.0f, measureText, 0.0f, new int[]{org.telegram.ui.ActionBar.k6.w0(i10, c40Var.I0), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Bk, c40Var.I0)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
            this.f43561b = measureText;
        }
        j6Var.setText(E);
    }
}
