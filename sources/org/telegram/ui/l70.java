package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class l70 extends LinearLayout {
    public final org.telegram.ui.Components.cu f35233a;
    public boolean f35234b;
    public int f35235c;
    public tt d;
    public String e;
    public final k70 f35236f;
    public final o70 h;

    public l70(o70 o70Var, Context context) {
        super(context);
        this.h = o70Var;
        this.f35236f = new k70(this);
        TextView f7 = org.telegram.messenger.f0.f(context, 1, 16.0f);
        f7.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19165j5, false));
        f7.setText("t.me/addemoji/");
        org.telegram.ui.Components.cu cuVar = new org.telegram.ui.Components.cu(context, null);
        this.f35233a = cuVar;
        cuVar.setLines(1);
        cuVar.setSingleLine(true);
        cuVar.setInputType(16384);
        cuVar.setTextSize(1, 16.0f);
        cuVar.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Ud, false));
        cuVar.setLinkTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19135hc, false));
        cuVar.setHighlightColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19381uf, false));
        int i10 = org.telegram.ui.ActionBar.h6.Vd;
        cuVar.setHintColor(org.telegram.ui.ActionBar.h6.w0(null, i10, false));
        cuVar.setHintTextColor(org.telegram.ui.ActionBar.h6.w0(null, i10, false));
        cuVar.setCursorColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Wd, false));
        cuVar.setHandlesColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19398vf, false));
        cuVar.setBackground(null);
        cuVar.setHint(LocaleController.getString(R.string.AddEmojiPackLinkHint));
        addView(f7, w7.y5.t(-2, -2, 16, 20, 0, 0, 0));
        addView(cuVar, w7.y5.t(-1, -2, 16, -4, 0, 0, 0));
        setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19059d6, false));
        setPadding(0, AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f));
        setWillNotDraw(false);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f35234b) {
            canvas.drawLine(AndroidUtilities.dp(20.0f), getHeight() - 1, getWidth() - getPaddingRight(), getHeight() - 1, org.telegram.ui.ActionBar.h6.f19180k0);
        }
    }
}
