package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
public final class k50 extends LinearLayout implements org.telegram.ui.ActionBar.c6 {
    public final org.telegram.ui.Components.mt f49319a;
    public boolean f49320b;
    public int f49321c;
    public i50 d;
    public String f49322e;
    public final j50 f49323f;
    public final n50 h;

    public k50(n50 n50Var, Context context) {
        super(context);
        this.h = n50Var;
        this.f49323f = new j50(this);
        TextView textView = new TextView(context);
        textView.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29559j5, null);
        textView.setText("t.me/addemoji/");
        org.telegram.ui.Components.mt mtVar = new org.telegram.ui.Components.mt(context, null);
        this.f49319a = mtVar;
        mtVar.setLines(1);
        mtVar.setSingleLine(true);
        mtVar.setInputType(16384);
        mtVar.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.u6.U(mtVar, org.telegram.ui.ActionBar.n6.Le, null);
        org.telegram.ui.ActionBar.u6.G(mtVar, org.telegram.ui.ActionBar.n6.Yc, null);
        org.telegram.ui.ActionBar.u6.C(mtVar, org.telegram.ui.ActionBar.n6.f29607lg, null);
        int i7 = org.telegram.ui.ActionBar.n6.Me;
        org.telegram.ui.ActionBar.u6.l(mtVar, 34, i7, null);
        org.telegram.ui.ActionBar.u6.D(mtVar, i7, null);
        org.telegram.ui.ActionBar.u6.l(mtVar, 30, org.telegram.ui.ActionBar.n6.Ne, null);
        org.telegram.ui.ActionBar.u6.l(mtVar, 36, org.telegram.ui.ActionBar.n6.f29624mg, null);
        mtVar.setBackground(null);
        mtVar.setHint(org.telegram.messenger.gd.N0(2131754430, null));
        addView(textView, c8.na.t(-2, -2, 16, 20, 0, 0, 0));
        addView(mtVar, c8.na.t(-1, -2, 16, -4, 0, 0, 0));
        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29451d6, this, null);
        setPadding(0, org.telegram.messenger.g0.L(5.0f), 0, org.telegram.messenger.g0.L(5.0f));
        setWillNotDraw(false);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f49320b) {
            canvas.drawLine(org.telegram.messenger.g0.L(20.0f), getHeight() - 1, getWidth() - getPaddingRight(), getHeight() - 1, org.telegram.ui.ActionBar.n6.f29574k0);
        }
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.Components.mt mtVar = this.f49319a;
        try {
            mtVar.setHintColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Me, false));
            mtVar.setCursorColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Ne, false));
            mtVar.setHandlesColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29624mg, false));
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
