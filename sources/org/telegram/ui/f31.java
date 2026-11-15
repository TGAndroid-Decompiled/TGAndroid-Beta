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
public final class f31 extends LinearLayout implements org.telegram.ui.ActionBar.z5 {
    public final org.telegram.ui.ActionBar.e6 f46983a;
    public final org.telegram.ui.Components.t8 f46984b;
    public final org.telegram.ui.Components.i9 f46985c;
    public final org.telegram.ui.ActionBar.j5 d;
    public final TextView f46986e;
    public final ImageView f46987f;
    public final org.telegram.ui.Components.e5 h;
    public final org.telegram.ui.Components.e5 f46988n;
    public int f46989r;

    public f31(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f46983a = e6Var;
        setOrientation(0);
        this.f46984b = new org.telegram.ui.Components.t8((org.telegram.ui.ActionBar.e6) null);
        org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9(context);
        this.f46985c = i9Var;
        i9Var.setRoundRadius(org.telegram.messenger.g0.L(14.0f));
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
        this.d = j5Var;
        j5Var.setTextSize(15);
        j5Var.setTypeface(org.telegram.messenger.g0.o());
        org.telegram.ui.ActionBar.q6.X(j5Var, org.telegram.ui.ActionBar.j6.G6, e6Var);
        this.h = new org.telegram.ui.Components.e5(org.telegram.messenger.g0.L(24.0f), 7, j5Var, false);
        this.f46988n = new org.telegram.ui.Components.e5(org.telegram.messenger.g0.L(24.0f), 7, j5Var, false);
        j5Var.addOnAttachStateChangeListener(new e5(this, 5));
        TextView textView = new TextView(context);
        this.f46986e = textView;
        textView.setPadding(org.telegram.messenger.g0.L(6.66f), 0, org.telegram.messenger.g0.L(6.66f), 0);
        textView.setTextSize(1, 11.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(17);
        org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.Ji, e6Var);
        int L = org.telegram.messenger.g0.L(10.0f);
        int i7 = org.telegram.ui.ActionBar.j6.Fi;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.j6.d0(L, org.telegram.ui.ActionBar.j6.w0(i7, e6Var));
        org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i7);
        textView.setBackground(d02);
        org.telegram.ui.ActionBar.q6.j(textView, d02, M, null, e6Var);
        ImageView imageView = new ImageView(context);
        this.f46987f = imageView;
        imageView.setImageResource(2131232060);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.q6.s(imageView, org.telegram.ui.ActionBar.j6.f29014m6, e6Var, PorterDuff.Mode.SRC_IN);
        if (org.telegram.messenger.hd.f24101a0) {
            j5Var.setGravity(21);
            imageView.setScaleX(-1.0f);
            addView(imageView, c8.ja.q(24, 24, 0.0f, 19, 12, 0, 0, 0));
            addView(textView, c8.ja.q(-2, 20, 0.0f, 16, 0, 0, 0, 0));
            addView(j5Var, c8.ja.q(0, -1, 1.0f, 119, 18, 0, 0, 0));
            addView(i9Var, c8.ja.t(28, 28, 21, 18, 0, 18, 0));
            return;
        }
        j5Var.setGravity(19);
        addView(i9Var, c8.ja.t(28, 28, 19, 18, 0, 18, 0));
        addView(j5Var, c8.ja.q(0, -1, 1.0f, 119, 0, 0, 18, 0));
        addView(textView, c8.ja.q(-2, 20, 0.0f, 16, 0, 0, 0, 0));
        addView(imageView, c8.ja.q(24, 24, 0.0f, 21, 0, 0, 12, 0));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29100qi));
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), 1073741824));
    }

    public void set(int r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.f31.set(int):void");
    }

    @Override
    public final void updateColors() {
        int i7 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.ui.ActionBar.e6 e6Var = this.f46983a;
        int w02 = org.telegram.ui.ActionBar.j6.w0(i7, e6Var);
        org.telegram.ui.ActionBar.j5 j5Var = this.d;
        j5Var.setTextColor(w02);
        TextView textView = this.f46986e;
        org.telegram.ui.ActionBar.j6.C1(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Fi, e6Var), textView.getBackground());
        textView.invalidate();
        int w03 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29014m6, e6Var);
        int i10 = this.f46989r;
        ImageView imageView = this.f46987f;
        if (w03 != i10 || imageView.getColorFilter() == null) {
            this.f46989r = w03;
            imageView.setColorFilter(new PorterDuffColorFilter(w03, PorterDuff.Mode.SRC_IN));
        }
        int i11 = org.telegram.ui.ActionBar.j6.f29100qi;
        this.f46988n.k(Integer.valueOf(org.telegram.ui.ActionBar.j6.w0(i11, e6Var)));
        try {
            org.telegram.ui.Components.e5 e5Var = this.h;
            if (e5Var != null) {
                e5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.j6.w0(i11, e6Var)));
                j5Var.invalidate();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
