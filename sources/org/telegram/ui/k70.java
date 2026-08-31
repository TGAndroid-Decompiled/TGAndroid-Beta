package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class k70 extends LinearLayout {
    public final org.telegram.ui.Components.xt f38290a;
    public boolean f38291b;
    public int f38292c;
    public v10 d;
    public String f38293e;
    public final j70 f38294f;
    public final n70 h;

    public k70(n70 n70Var, Context context) {
        super(context);
        this.h = n70Var;
        this.f38294f = new j70(this);
        TextView g10 = org.telegram.messenger.y3.g(context, 1, 16.0f);
        g10.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21766j5, false));
        g10.setText("t.me/addemoji/");
        org.telegram.ui.Components.xt xtVar = new org.telegram.ui.Components.xt(context, null);
        this.f38290a = xtVar;
        xtVar.setLines(1);
        xtVar.setSingleLine(true);
        xtVar.setInputType(16384);
        xtVar.setTextSize(1, 16.0f);
        xtVar.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Ud, false));
        xtVar.setLinkTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21737hc, false));
        xtVar.setHighlightColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21970uf, false));
        int i10 = org.telegram.ui.ActionBar.k6.Vd;
        xtVar.setHintColor(org.telegram.ui.ActionBar.k6.w0(null, i10, false));
        xtVar.setHintTextColor(org.telegram.ui.ActionBar.k6.w0(null, i10, false));
        xtVar.setCursorColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Wd, false));
        xtVar.setHandlesColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21988vf, false));
        xtVar.setBackground(null);
        xtVar.setHint(LocaleController.getString(R.string.AddEmojiPackLinkHint));
        addView(g10, k7.c6.t(-2, -2, 16, 20, 0, 0, 0));
        addView(xtVar, k7.c6.t(-1, -2, 16, -4, 0, 0, 0));
        setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21659d6, false));
        setPadding(0, AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f));
        setWillNotDraw(false);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f38291b) {
            canvas.drawLine(AndroidUtilities.dp(20.0f), getHeight() - 1, getWidth() - getPaddingRight(), getHeight() - 1, org.telegram.ui.ActionBar.k6.f21779k0);
        }
    }
}
