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
public final class i31 extends LinearLayout implements org.telegram.ui.ActionBar.c6 {
    public final org.telegram.ui.ActionBar.i6 f48702a;
    public final org.telegram.ui.Components.a9 f48703b;
    public final org.telegram.ui.Components.p9 f48704c;
    public final org.telegram.ui.ActionBar.n5 d;
    public final TextView f48705e;
    public final ImageView f48706f;
    public final org.telegram.ui.Components.m5 h;
    public final org.telegram.ui.Components.m5 f48707n;
    public int f48708r;

    public i31(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.f48702a = i6Var;
        setOrientation(0);
        this.f48703b = new org.telegram.ui.Components.a9((org.telegram.ui.ActionBar.i6) null);
        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
        this.f48704c = p9Var;
        p9Var.setRoundRadius(org.telegram.messenger.g0.L(14.0f));
        org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(context);
        this.d = n5Var;
        n5Var.setTextSize(15);
        n5Var.setTypeface(org.telegram.messenger.g0.o());
        org.telegram.ui.ActionBar.u6.X(n5Var, org.telegram.ui.ActionBar.n6.G6, i6Var);
        this.h = new org.telegram.ui.Components.m5(org.telegram.messenger.g0.L(24.0f), 7, n5Var, false);
        this.f48707n = new org.telegram.ui.Components.m5(org.telegram.messenger.g0.L(24.0f), 7, n5Var, false);
        n5Var.addOnAttachStateChangeListener(new e5(this, 5));
        TextView textView = new TextView(context);
        this.f48705e = textView;
        textView.setPadding(org.telegram.messenger.g0.L(6.66f), 0, org.telegram.messenger.g0.L(6.66f), 0);
        textView.setTextSize(1, 11.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(17);
        org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.Ji, i6Var);
        int L = org.telegram.messenger.g0.L(10.0f);
        int i7 = org.telegram.ui.ActionBar.n6.Fi;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.n6.d0(L, org.telegram.ui.ActionBar.n6.w0(i7, i6Var));
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i7);
        textView.setBackground(d02);
        org.telegram.ui.ActionBar.u6.j(textView, d02, M, null, i6Var);
        ImageView imageView = new ImageView(context);
        this.f48706f = imageView;
        imageView.setImageResource(2131232064);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.u6.s(imageView, org.telegram.ui.ActionBar.n6.f29616m6, i6Var, PorterDuff.Mode.SRC_IN);
        if (org.telegram.messenger.gd.f24314a0) {
            n5Var.setGravity(21);
            imageView.setScaleX(-1.0f);
            addView(imageView, c8.na.q(24, 24, 0.0f, 19, 12, 0, 0, 0));
            addView(textView, c8.na.q(-2, 20, 0.0f, 16, 0, 0, 0, 0));
            addView(n5Var, c8.na.q(0, -1, 1.0f, 119, 18, 0, 0, 0));
            addView(p9Var, c8.na.t(28, 28, 21, 18, 0, 18, 0));
            return;
        }
        n5Var.setGravity(19);
        addView(p9Var, c8.na.t(28, 28, 19, 18, 0, 18, 0));
        addView(n5Var, c8.na.q(0, -1, 1.0f, 119, 0, 0, 18, 0));
        addView(textView, c8.na.q(-2, 20, 0.0f, 16, 0, 0, 0, 0));
        addView(imageView, c8.na.q(24, 24, 0.0f, 21, 0, 0, 12, 0));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29702qi));
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
        int i7 = org.telegram.ui.ActionBar.n6.G6;
        org.telegram.ui.ActionBar.i6 i6Var = this.f48702a;
        int w02 = org.telegram.ui.ActionBar.n6.w0(i7, i6Var);
        org.telegram.ui.ActionBar.n5 n5Var = this.d;
        n5Var.setTextColor(w02);
        TextView textView = this.f48705e;
        org.telegram.ui.ActionBar.n6.C1(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Fi, i6Var), textView.getBackground());
        textView.invalidate();
        int w03 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29616m6, i6Var);
        int i10 = this.f48708r;
        ImageView imageView = this.f48706f;
        if (w03 != i10 || imageView.getColorFilter() == null) {
            this.f48708r = w03;
            imageView.setColorFilter(new PorterDuffColorFilter(w03, PorterDuff.Mode.SRC_IN));
        }
        int i11 = org.telegram.ui.ActionBar.n6.f29702qi;
        this.f48707n.k(Integer.valueOf(org.telegram.ui.ActionBar.n6.w0(i11, i6Var)));
        try {
            org.telegram.ui.Components.m5 m5Var = this.h;
            if (m5Var != null) {
                m5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.n6.w0(i11, i6Var)));
                n5Var.invalidate();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
