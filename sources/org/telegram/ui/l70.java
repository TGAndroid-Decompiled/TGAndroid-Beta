package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class l70 extends LinearLayout {
    public final org.telegram.ui.Components.eu f35324a;
    public boolean f35325b;
    public int f35326c;
    public tt d;
    public String e;
    public final k70 f35327f;
    public final o70 h;

    public l70(o70 o70Var, Context context) {
        super(context);
        this.h = o70Var;
        this.f35327f = new k70(this);
        TextView f7 = org.telegram.messenger.f0.f(context, 1, 16.0f);
        f7.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19182j5, false));
        f7.setText("t.me/addemoji/");
        org.telegram.ui.Components.eu euVar = new org.telegram.ui.Components.eu(context, null);
        this.f35324a = euVar;
        euVar.setLines(1);
        euVar.setSingleLine(true);
        euVar.setInputType(16384);
        euVar.setTextSize(1, 16.0f);
        euVar.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Ud, false));
        euVar.setLinkTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19152hc, false));
        euVar.setHighlightColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19398uf, false));
        int i10 = org.telegram.ui.ActionBar.h6.Vd;
        euVar.setHintColor(org.telegram.ui.ActionBar.h6.w0(null, i10, false));
        euVar.setHintTextColor(org.telegram.ui.ActionBar.h6.w0(null, i10, false));
        euVar.setCursorColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Wd, false));
        euVar.setHandlesColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19415vf, false));
        euVar.setBackground(null);
        euVar.setHint(LocaleController.getString(R.string.AddEmojiPackLinkHint));
        addView(f7, w7.y5.t(-2, -2, 16, 20, 0, 0, 0));
        addView(euVar, w7.y5.t(-1, -2, 16, -4, 0, 0, 0));
        setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19076d6, false));
        setPadding(0, AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f));
        setWillNotDraw(false);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f35325b) {
            canvas.drawLine(AndroidUtilities.dp(20.0f), getHeight() - 1, getWidth() - getPaddingRight(), getHeight() - 1, org.telegram.ui.ActionBar.h6.f19197k0);
        }
    }
}
