package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
public final class k50 extends LinearLayout implements org.telegram.ui.ActionBar.b6 {
    public final org.telegram.ui.Components.ot f49202a;
    public boolean f49203b;
    public int f49204c;
    public ss d;
    public String f49205e;
    public final j50 f49206f;
    public final n50 h;

    public k50(n50 n50Var, Context context) {
        super(context);
        this.h = n50Var;
        this.f49206f = new j50(this);
        TextView textView = new TextView(context);
        textView.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f29489j5, null);
        textView.setText("t.me/addemoji/");
        org.telegram.ui.Components.ot otVar = new org.telegram.ui.Components.ot(context, null);
        this.f49202a = otVar;
        otVar.setLines(1);
        otVar.setSingleLine(true);
        otVar.setInputType(16384);
        otVar.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.t6.U(otVar, org.telegram.ui.ActionBar.m6.Le, null);
        org.telegram.ui.ActionBar.t6.G(otVar, org.telegram.ui.ActionBar.m6.Yc, null);
        org.telegram.ui.ActionBar.t6.C(otVar, org.telegram.ui.ActionBar.m6.f29537lg, null);
        int i7 = org.telegram.ui.ActionBar.m6.Me;
        org.telegram.ui.ActionBar.t6.l(otVar, 34, i7, null);
        org.telegram.ui.ActionBar.t6.D(otVar, i7, null);
        org.telegram.ui.ActionBar.t6.l(otVar, 30, org.telegram.ui.ActionBar.m6.Ne, null);
        org.telegram.ui.ActionBar.t6.l(otVar, 36, org.telegram.ui.ActionBar.m6.f29554mg, null);
        otVar.setBackground(null);
        otVar.setHint(org.telegram.messenger.hd.N0(2131754430, null));
        addView(textView, c8.ma.t(-2, -2, 16, 20, 0, 0, 0));
        addView(otVar, c8.ma.t(-1, -2, 16, -4, 0, 0, 0));
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f29381d6, this, null);
        setPadding(0, org.telegram.messenger.g0.L(5.0f), 0, org.telegram.messenger.g0.L(5.0f));
        setWillNotDraw(false);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f49203b) {
            canvas.drawLine(org.telegram.messenger.g0.L(20.0f), getHeight() - 1, getWidth() - getPaddingRight(), getHeight() - 1, org.telegram.ui.ActionBar.m6.f29504k0);
        }
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.Components.ot otVar = this.f49202a;
        try {
            otVar.setHintColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Me, false));
            otVar.setCursorColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Ne, false));
            otVar.setHandlesColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29554mg, false));
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
