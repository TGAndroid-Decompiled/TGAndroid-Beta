package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
public final class l50 extends LinearLayout implements org.telegram.ui.ActionBar.b6 {
    public final org.telegram.ui.Components.zs f47465a;
    public boolean f47466b;
    public int f47467c;
    public s10 d;
    public String f47468e;
    public final k50 f47469f;
    public final o50 h;

    public l50(o50 o50Var, Context context) {
        super(context);
        this.h = o50Var;
        this.f47469f = new k50(this);
        TextView g10 = org.telegram.messenger.k5.g(context, 1, 16.0f);
        org.telegram.ui.ActionBar.s6.U(g10, org.telegram.ui.ActionBar.l6.f27973j5, null);
        g10.setText("t.me/addemoji/");
        org.telegram.ui.Components.zs zsVar = new org.telegram.ui.Components.zs(context, null);
        this.f47465a = zsVar;
        zsVar.setLines(1);
        zsVar.setSingleLine(true);
        zsVar.setInputType(16384);
        zsVar.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.s6.U(zsVar, org.telegram.ui.ActionBar.l6.Ie, null);
        org.telegram.ui.ActionBar.s6.G(zsVar, org.telegram.ui.ActionBar.l6.Vc, null);
        org.telegram.ui.ActionBar.s6.C(zsVar, org.telegram.ui.ActionBar.l6.f27965ig, null);
        int i7 = org.telegram.ui.ActionBar.l6.Je;
        org.telegram.ui.ActionBar.s6.l(zsVar, 34, i7, null);
        org.telegram.ui.ActionBar.s6.D(zsVar, i7, null);
        org.telegram.ui.ActionBar.s6.l(zsVar, 30, org.telegram.ui.ActionBar.l6.Ke, null);
        org.telegram.ui.ActionBar.s6.l(zsVar, 36, org.telegram.ui.ActionBar.l6.f27984jg, null);
        zsVar.setBackground(null);
        zsVar.setHint(org.telegram.messenger.id.M0(2131754433, null));
        addView(g10, c8.ha.t(-2, -2, 16, 20, 0, 0, 0));
        addView(zsVar, c8.ha.t(-1, -2, 16, -4, 0, 0, 0));
        org.telegram.ui.ActionBar.s6.h(org.telegram.ui.ActionBar.l6.f27865d6, this, null);
        setPadding(0, org.telegram.messenger.g0.L(5.0f), 0, org.telegram.messenger.g0.L(5.0f));
        setWillNotDraw(false);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f47466b) {
            canvas.drawLine(org.telegram.messenger.g0.L(20.0f), getHeight() - 1, getWidth() - getPaddingRight(), getHeight() - 1, org.telegram.ui.ActionBar.l6.f27988k0);
        }
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.Components.zs zsVar = this.f47465a;
        try {
            zsVar.setHintColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.Je, false));
            zsVar.setCursorColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.Ke, false));
            zsVar.setHandlesColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f27984jg, false));
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
