package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
public final class j31 extends LinearLayout implements org.telegram.ui.ActionBar.c6 {
    public final org.telegram.ui.ActionBar.h6 f46802a;
    public final org.telegram.ui.Components.v8 f46803b;
    public final org.telegram.ui.Components.k9 f46804c;
    public final org.telegram.ui.ActionBar.m5 d;
    public final TextView f46805e;
    public final ImageView f46806f;
    public final org.telegram.ui.Components.f5 h;
    public final org.telegram.ui.Components.f5 f46807n;
    public int f46808r;

    public j31(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.f46802a = h6Var;
        setOrientation(0);
        this.f46803b = new org.telegram.ui.Components.v8((org.telegram.ui.ActionBar.h6) null);
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context);
        this.f46804c = k9Var;
        k9Var.setRoundRadius(org.telegram.messenger.g0.L(14.0f));
        org.telegram.ui.ActionBar.m5 m5Var = new org.telegram.ui.ActionBar.m5(context);
        this.d = m5Var;
        m5Var.setTextSize(15);
        m5Var.setTypeface(org.telegram.messenger.g0.o());
        org.telegram.ui.ActionBar.t6.X(m5Var, org.telegram.ui.ActionBar.m6.G6, h6Var);
        this.h = new org.telegram.ui.Components.f5(org.telegram.messenger.g0.L(24.0f), 7, m5Var, false);
        this.f46807n = new org.telegram.ui.Components.f5(org.telegram.messenger.g0.L(24.0f), 7, m5Var, false);
        m5Var.addOnAttachStateChangeListener(new e5(this, 5));
        TextView textView = new TextView(context);
        this.f46805e = textView;
        textView.setPadding(org.telegram.messenger.g0.L(6.66f), 0, org.telegram.messenger.g0.L(6.66f), 0);
        textView.setTextSize(1, 11.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(17);
        org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.Gi, h6Var);
        int L = org.telegram.messenger.g0.L(10.0f);
        int i7 = org.telegram.ui.ActionBar.m6.Ci;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.m6.d0(L, org.telegram.ui.ActionBar.m6.w0(i7, h6Var));
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i7);
        textView.setBackground(d02);
        org.telegram.ui.ActionBar.t6.j(textView, d02, M, null, h6Var);
        ImageView imageView = new ImageView(context);
        this.f46806f = imageView;
        imageView.setImageResource(2131232059);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.t6.s(imageView, org.telegram.ui.ActionBar.m6.f28055m6, h6Var, PorterDuff.Mode.SRC_IN);
        if (org.telegram.messenger.id.f23161a0) {
            m5Var.setGravity(21);
            imageView.setScaleX(-1.0f);
            addView(imageView, c8.ha.q(24, 24, 0.0f, 19, 12, 0, 0, 0));
            addView(textView, c8.ha.q(-2, 20, 0.0f, 16, 0, 0, 0, 0));
            addView(m5Var, c8.ha.q(0, -1, 1.0f, 119, 18, 0, 0, 0));
            addView(k9Var, c8.ha.t(28, 28, 21, 18, 0, 18, 0));
            return;
        }
        m5Var.setGravity(19);
        addView(k9Var, c8.ha.t(28, 28, 19, 18, 0, 18, 0));
        addView(m5Var, c8.ha.q(0, -1, 1.0f, 119, 0, 0, 18, 0));
        addView(textView, c8.ha.q(-2, 20, 0.0f, 16, 0, 0, 0, 0));
        addView(imageView, c8.ha.q(24, 24, 0.0f, 21, 0, 0, 12, 0));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28083ni));
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), 1073741824));
    }

    public void set(int r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.j31.set(int):void");
    }

    @Override
    public final void updateColors() {
        int i7 = org.telegram.ui.ActionBar.m6.G6;
        org.telegram.ui.ActionBar.h6 h6Var = this.f46802a;
        int w02 = org.telegram.ui.ActionBar.m6.w0(i7, h6Var);
        org.telegram.ui.ActionBar.m5 m5Var = this.d;
        m5Var.setTextColor(w02);
        TextView textView = this.f46805e;
        org.telegram.ui.ActionBar.m6.C1(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Ci, h6Var), textView.getBackground());
        textView.invalidate();
        int w03 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f28055m6, h6Var);
        int i10 = this.f46808r;
        ImageView imageView = this.f46806f;
        if (w03 != i10 || imageView.getColorFilter() == null) {
            this.f46808r = w03;
            imageView.setColorFilter(new PorterDuffColorFilter(w03, PorterDuff.Mode.SRC_IN));
        }
        int i11 = org.telegram.ui.ActionBar.m6.f28083ni;
        this.f46807n.k(Integer.valueOf(org.telegram.ui.ActionBar.m6.w0(i11, h6Var)));
        try {
            org.telegram.ui.Components.f5 f5Var = this.h;
            if (f5Var != null) {
                f5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.m6.w0(i11, h6Var)));
                m5Var.invalidate();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
