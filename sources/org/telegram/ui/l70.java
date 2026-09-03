package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class l70 extends LinearLayout {
    public final org.telegram.ui.Components.ut f35667a;
    public boolean f35668b;
    public int f35669c;
    public w10 d;
    public String e;
    public final k70 f35670f;
    public final o70 h;

    public l70(o70 o70Var, Context context) {
        super(context);
        this.h = o70Var;
        this.f35670f = new k70(this);
        TextView g10 = org.telegram.messenger.y3.g(context, 1, 16.0f);
        g10.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19987j5, false));
        g10.setText("t.me/addemoji/");
        org.telegram.ui.Components.ut utVar = new org.telegram.ui.Components.ut(context, null);
        this.f35667a = utVar;
        utVar.setLines(1);
        utVar.setSingleLine(true);
        utVar.setInputType(16384);
        utVar.setTextSize(1, 16.0f);
        utVar.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Ud, false));
        utVar.setLinkTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19958hc, false));
        utVar.setHighlightColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20191uf, false));
        int i10 = org.telegram.ui.ActionBar.j6.Vd;
        utVar.setHintColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        utVar.setHintTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        utVar.setCursorColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Wd, false));
        utVar.setHandlesColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20209vf, false));
        utVar.setBackground(null);
        utVar.setHint(LocaleController.getString(R.string.AddEmojiPackLinkHint));
        addView(g10, k7.b6.t(-2, -2, 16, 20, 0, 0, 0));
        addView(utVar, k7.b6.t(-1, -2, 16, -4, 0, 0, 0));
        setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19881d6, false));
        setPadding(0, AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f));
        setWillNotDraw(false);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f35668b) {
            canvas.drawLine(AndroidUtilities.dp(20.0f), getHeight() - 1, getWidth() - getPaddingRight(), getHeight() - 1, org.telegram.ui.ActionBar.j6.f20000k0);
        }
    }
}
