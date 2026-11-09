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
public final class i31 extends LinearLayout implements org.telegram.ui.ActionBar.b6 {
    public final org.telegram.ui.ActionBar.g6 f46452a;
    public final org.telegram.ui.Components.w8 f46453b;
    public final org.telegram.ui.Components.l9 f46454c;
    public final org.telegram.ui.ActionBar.l5 d;
    public final TextView f46455e;
    public final ImageView f46456f;
    public final org.telegram.ui.Components.g5 h;
    public final org.telegram.ui.Components.g5 f46457n;
    public int f46458r;

    public i31(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f46452a = g6Var;
        setOrientation(0);
        this.f46453b = new org.telegram.ui.Components.w8((org.telegram.ui.ActionBar.g6) null);
        org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(context);
        this.f46454c = l9Var;
        l9Var.setRoundRadius(org.telegram.messenger.g0.L(14.0f));
        org.telegram.ui.ActionBar.l5 l5Var = new org.telegram.ui.ActionBar.l5(context);
        this.d = l5Var;
        l5Var.setTextSize(15);
        l5Var.setTypeface(org.telegram.messenger.g0.o());
        org.telegram.ui.ActionBar.s6.X(l5Var, org.telegram.ui.ActionBar.l6.G6, g6Var);
        this.h = new org.telegram.ui.Components.g5(org.telegram.messenger.g0.L(24.0f), 7, l5Var, false);
        this.f46457n = new org.telegram.ui.Components.g5(org.telegram.messenger.g0.L(24.0f), 7, l5Var, false);
        l5Var.addOnAttachStateChangeListener(new e5(this, 5));
        TextView textView = new TextView(context);
        this.f46455e = textView;
        textView.setPadding(org.telegram.messenger.g0.L(6.66f), 0, org.telegram.messenger.g0.L(6.66f), 0);
        textView.setTextSize(1, 11.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(17);
        org.telegram.ui.ActionBar.s6.U(textView, org.telegram.ui.ActionBar.l6.Gi, g6Var);
        int L = org.telegram.messenger.g0.L(10.0f);
        int i7 = org.telegram.ui.ActionBar.l6.Ci;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.l6.d0(L, org.telegram.ui.ActionBar.l6.w0(i7, g6Var));
        org.telegram.ui.ActionBar.o6 M = org.telegram.ui.ActionBar.s6.M(i7);
        textView.setBackground(d02);
        org.telegram.ui.ActionBar.s6.j(textView, d02, M, null, g6Var);
        ImageView imageView = new ImageView(context);
        this.f46456f = imageView;
        imageView.setImageResource(2131232059);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.s6.s(imageView, org.telegram.ui.ActionBar.l6.f28030m6, g6Var, PorterDuff.Mode.SRC_IN);
        if (org.telegram.messenger.id.f23157a0) {
            l5Var.setGravity(21);
            imageView.setScaleX(-1.0f);
            addView(imageView, c8.ha.q(24, 24, 0.0f, 19, 12, 0, 0, 0));
            addView(textView, c8.ha.q(-2, 20, 0.0f, 16, 0, 0, 0, 0));
            addView(l5Var, c8.ha.q(0, -1, 1.0f, 119, 18, 0, 0, 0));
            addView(l9Var, c8.ha.t(28, 28, 21, 18, 0, 18, 0));
            return;
        }
        l5Var.setGravity(19);
        addView(l9Var, c8.ha.t(28, 28, 19, 18, 0, 18, 0));
        addView(l5Var, c8.ha.q(0, -1, 1.0f, 119, 0, 0, 18, 0));
        addView(textView, c8.ha.q(-2, 20, 0.0f, 16, 0, 0, 0, 0));
        addView(imageView, c8.ha.q(24, 24, 0.0f, 21, 0, 0, 12, 0));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28058ni));
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), 1073741824));
    }

    public void set(int r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.i31.set(int):void");
    }

    @Override
    public final void updateColors() {
        int i7 = org.telegram.ui.ActionBar.l6.G6;
        org.telegram.ui.ActionBar.g6 g6Var = this.f46452a;
        int w02 = org.telegram.ui.ActionBar.l6.w0(i7, g6Var);
        org.telegram.ui.ActionBar.l5 l5Var = this.d;
        l5Var.setTextColor(w02);
        TextView textView = this.f46455e;
        org.telegram.ui.ActionBar.l6.C1(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.Ci, g6Var), textView.getBackground());
        textView.invalidate();
        int w03 = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f28030m6, g6Var);
        int i10 = this.f46458r;
        ImageView imageView = this.f46456f;
        if (w03 != i10 || imageView.getColorFilter() == null) {
            this.f46458r = w03;
            imageView.setColorFilter(new PorterDuffColorFilter(w03, PorterDuff.Mode.SRC_IN));
        }
        int i11 = org.telegram.ui.ActionBar.l6.f28058ni;
        this.f46457n.k(Integer.valueOf(org.telegram.ui.ActionBar.l6.w0(i11, g6Var)));
        try {
            org.telegram.ui.Components.g5 g5Var = this.h;
            if (g5Var != null) {
                g5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.l6.w0(i11, g6Var)));
                l5Var.invalidate();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
