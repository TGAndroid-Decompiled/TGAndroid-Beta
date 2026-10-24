package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class b70 extends LinearLayout implements org.telegram.ui.ActionBar.b6 {
    public final org.telegram.ui.Components.gu f35940a;
    public boolean f35941b;
    public int f35942c;
    public ot d;
    public String e;
    public final a70 f35943f;
    public final e70 h;

    public b70(e70 e70Var, Context context) {
        super(context);
        this.h = e70Var;
        this.f35943f = new a70(this);
        TextView g10 = org.telegram.messenger.v0.g(context, 1, 16.0f);
        org.telegram.ui.ActionBar.r6.W(g10, org.telegram.ui.ActionBar.k6.f21290j5, null);
        g10.setText("t.me/addemoji/");
        org.telegram.ui.Components.gu guVar = new org.telegram.ui.Components.gu(context, null);
        this.f35940a = guVar;
        guVar.setLines(1);
        guVar.setSingleLine(true);
        guVar.setInputType(16384);
        guVar.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.r6.W(guVar, org.telegram.ui.ActionBar.k6.Ud, null);
        org.telegram.ui.ActionBar.r6.I(guVar, org.telegram.ui.ActionBar.k6.hc, null);
        org.telegram.ui.ActionBar.r6.E(guVar, org.telegram.ui.ActionBar.k6.f21508uf, null);
        int i10 = org.telegram.ui.ActionBar.k6.Vd;
        org.telegram.ui.ActionBar.r6.m(guVar, 34, i10, null);
        org.telegram.ui.ActionBar.r6.F(guVar, i10, null);
        org.telegram.ui.ActionBar.r6.m(guVar, 30, org.telegram.ui.ActionBar.k6.Wd, null);
        org.telegram.ui.ActionBar.r6.m(guVar, 36, org.telegram.ui.ActionBar.k6.f21526vf, null);
        guVar.setBackground(null);
        guVar.setHint(LocaleController.getString(R.string.AddEmojiPackLinkHint));
        addView(g10, w7.z5.t(-2, -2, 16, 20, 0, 0, 0));
        addView(guVar, w7.z5.t(-1, -2, 16, -4, 0, 0, 0));
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21184d6, this, null);
        setPadding(0, AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f));
        setWillNotDraw(false);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f35941b) {
            canvas.drawLine(AndroidUtilities.dp(20.0f), getHeight() - 1, getWidth() - getPaddingRight(), getHeight() - 1, org.telegram.ui.ActionBar.k6.f21305k0);
        }
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.Components.gu guVar = this.f35940a;
        try {
            guVar.setHintColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Vd, false));
            guVar.setCursorColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Wd, false));
            guVar.setHandlesColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21526vf, false));
            invalidate();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
