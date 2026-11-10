package org.telegram.ui;

import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.widget.LinearLayout;
import android.widget.TextView;
public final class d40 extends LinearLayout {
    public final org.telegram.ui.Components.i6 f44895a;
    public float f44896b;
    public final f40 f44897c;

    public d40(f40 f40Var, Context context) {
        super(context);
        this.f44897c = f40Var;
        this.f44896b = 0.0f;
        setOrientation(1);
        setGravity(17);
        org.telegram.ui.Components.i6 i6Var = new org.telegram.ui.Components.i6(context, true, false, false);
        this.f44895a = i6Var;
        i6Var.setTextColor(-1);
        i6Var.setTextSize(org.telegram.messenger.g0.L(46.0f));
        i6Var.setTypeface(org.telegram.messenger.g0.o());
        i6Var.setGravity(1);
        TextView textView = new TextView(context);
        textView.setTextColor(-1);
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setText(org.telegram.messenger.id.M0(2131743446, null));
        addView(i6Var, c8.ha.o(-1, 46));
        addView(textView, c8.ha.o(-2, -2));
    }

    public void setWatchersCount(int i7) {
        String E = org.telegram.messenger.id.E(i7, ',');
        org.telegram.ui.Components.i6 i6Var = this.f44895a;
        float measureText = i6Var.getPaint().measureText((CharSequence) E, 0, E.length());
        if (this.f44896b != measureText) {
            int i10 = org.telegram.ui.ActionBar.m6.zk;
            f40 f40Var = this.f44897c;
            i6Var.getPaint().setShader(new LinearGradient(0.0f, 0.0f, measureText, 0.0f, new int[]{org.telegram.ui.ActionBar.m6.w0(i10, f40Var.I0), org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Bk, f40Var.I0)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
            this.f44896b = measureText;
        }
        i6Var.setText(E);
    }
}
