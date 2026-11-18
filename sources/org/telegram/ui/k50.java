package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
public final class k50 extends LinearLayout implements org.telegram.ui.ActionBar.c6 {
    public final org.telegram.ui.Components.mt f49178a;
    public boolean f49179b;
    public int f49180c;
    public vs d;
    public String f49181e;
    public final j50 f49182f;
    public final n50 h;

    public k50(n50 n50Var, Context context) {
        super(context);
        this.h = n50Var;
        this.f49182f = new j50(this);
        TextView textView = new TextView(context);
        textView.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29504j5, null);
        textView.setText("t.me/addemoji/");
        org.telegram.ui.Components.mt mtVar = new org.telegram.ui.Components.mt(context, null);
        this.f49178a = mtVar;
        mtVar.setLines(1);
        mtVar.setSingleLine(true);
        mtVar.setInputType(16384);
        mtVar.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.u6.U(mtVar, org.telegram.ui.ActionBar.n6.Le, null);
        org.telegram.ui.ActionBar.u6.G(mtVar, org.telegram.ui.ActionBar.n6.Yc, null);
        org.telegram.ui.ActionBar.u6.C(mtVar, org.telegram.ui.ActionBar.n6.f29552lg, null);
        int i7 = org.telegram.ui.ActionBar.n6.Me;
        org.telegram.ui.ActionBar.u6.l(mtVar, 34, i7, null);
        org.telegram.ui.ActionBar.u6.D(mtVar, i7, null);
        org.telegram.ui.ActionBar.u6.l(mtVar, 30, org.telegram.ui.ActionBar.n6.Ne, null);
        org.telegram.ui.ActionBar.u6.l(mtVar, 36, org.telegram.ui.ActionBar.n6.f29569mg, null);
        mtVar.setBackground(null);
        mtVar.setHint(org.telegram.messenger.gd.M0(2131754431, null));
        addView(textView, c8.ma.t(-2, -2, 16, 20, 0, 0, 0));
        addView(mtVar, c8.ma.t(-1, -2, 16, -4, 0, 0, 0));
        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29396d6, this, null);
        setPadding(0, org.telegram.messenger.g0.L(5.0f), 0, org.telegram.messenger.g0.L(5.0f));
        setWillNotDraw(false);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f49179b) {
            canvas.drawLine(org.telegram.messenger.g0.L(20.0f), getHeight() - 1, getWidth() - getPaddingRight(), getHeight() - 1, org.telegram.ui.ActionBar.n6.f29519k0);
        }
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.Components.mt mtVar = this.f49178a;
        try {
            mtVar.setHintColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Me, false));
            mtVar.setCursorColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Ne, false));
            mtVar.setHandlesColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29569mg, false));
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
