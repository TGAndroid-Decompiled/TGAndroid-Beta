package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class l70 extends LinearLayout {
    public final org.telegram.ui.Components.du f35234a;
    public boolean f35235b;
    public int f35236c;
    public tt d;
    public String e;
    public final k70 f35237f;
    public final o70 h;

    public l70(o70 o70Var, Context context) {
        super(context);
        this.h = o70Var;
        this.f35237f = new k70(this);
        TextView f7 = org.telegram.messenger.f0.f(context, 1, 16.0f);
        f7.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19166j5, false));
        f7.setText("t.me/addemoji/");
        org.telegram.ui.Components.du duVar = new org.telegram.ui.Components.du(context, null);
        this.f35234a = duVar;
        duVar.setLines(1);
        duVar.setSingleLine(true);
        duVar.setInputType(16384);
        duVar.setTextSize(1, 16.0f);
        duVar.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Ud, false));
        duVar.setLinkTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19136hc, false));
        duVar.setHighlightColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19382uf, false));
        int i10 = org.telegram.ui.ActionBar.h6.Vd;
        duVar.setHintColor(org.telegram.ui.ActionBar.h6.w0(null, i10, false));
        duVar.setHintTextColor(org.telegram.ui.ActionBar.h6.w0(null, i10, false));
        duVar.setCursorColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Wd, false));
        duVar.setHandlesColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19399vf, false));
        duVar.setBackground(null);
        duVar.setHint(LocaleController.getString(R.string.AddEmojiPackLinkHint));
        addView(f7, w7.y5.t(-2, -2, 16, 20, 0, 0, 0));
        addView(duVar, w7.y5.t(-1, -2, 16, -4, 0, 0, 0));
        setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19060d6, false));
        setPadding(0, AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f));
        setWillNotDraw(false);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f35235b) {
            canvas.drawLine(AndroidUtilities.dp(20.0f), getHeight() - 1, getWidth() - getPaddingRight(), getHeight() - 1, org.telegram.ui.ActionBar.h6.f19181k0);
        }
    }
}
