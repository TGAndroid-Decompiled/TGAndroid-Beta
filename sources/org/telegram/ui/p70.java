package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class p70 extends LinearLayout {
    public final org.telegram.ui.Components.eu f39356a;
    public boolean f39357b;
    public int f39358c;
    public cu d;
    public String f39359e;
    public final o70 f39360f;
    public final s70 h;

    public p70(s70 s70Var, Context context) {
        super(context);
        this.h = s70Var;
        this.f39360f = new o70(this);
        TextView f7 = org.telegram.messenger.f0.f(context, 1, 16.0f);
        f7.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20926j5, false));
        f7.setText("t.me/addemoji/");
        org.telegram.ui.Components.eu euVar = new org.telegram.ui.Components.eu(context, null);
        this.f39356a = euVar;
        euVar.setLines(1);
        euVar.setSingleLine(true);
        euVar.setInputType(16384);
        euVar.setTextSize(1, 16.0f);
        euVar.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.Ud, false));
        euVar.setLinkTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20896hc, false));
        euVar.setHighlightColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f21144uf, false));
        int i10 = org.telegram.ui.ActionBar.i6.Vd;
        euVar.setHintColor(org.telegram.ui.ActionBar.i6.w0(null, i10, false));
        euVar.setHintTextColor(org.telegram.ui.ActionBar.i6.w0(null, i10, false));
        euVar.setCursorColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.Wd, false));
        euVar.setHandlesColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f21161vf, false));
        euVar.setBackground(null);
        euVar.setHint(LocaleController.getString(R.string.AddEmojiPackLinkHint));
        addView(f7, w7.z5.t(-2, -2, 16, 20, 0, 0, 0));
        addView(euVar, w7.z5.t(-1, -2, 16, -4, 0, 0, 0));
        setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20818d6, false));
        setPadding(0, AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f));
        setWillNotDraw(false);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f39357b) {
            canvas.drawLine(AndroidUtilities.dp(20.0f), getHeight() - 1, getWidth() - getPaddingRight(), getHeight() - 1, org.telegram.ui.ActionBar.i6.f20941k0);
        }
    }
}
