package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
public final class l31 extends LinearLayout implements org.telegram.ui.ActionBar.c6 {
    public final org.telegram.ui.ActionBar.i6 f49418a;
    public final org.telegram.ui.Components.pa0 f49419b;
    public final FrameLayout f49420c;
    public final ImageView d;
    public final TextView f49421e;
    public final TextView f49422f;
    public final TextView h;
    public boolean f49423n;
    public boolean f49424r;

    public l31(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.f49423n = true;
        this.f49418a = i6Var;
        setOrientation(0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f49420c = frameLayout;
        org.telegram.ui.Components.pa0 pa0Var = new org.telegram.ui.Components.pa0(1);
        this.f49419b = pa0Var;
        frameLayout.setBackground(pa0Var);
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        frameLayout.addView(imageView, c8.ma.e(24, 24, 17));
        LinearLayout g10 = org.telegram.messenger.f3.g(context, 1);
        TextView textView = new TextView(context);
        this.f49421e = textView;
        textView.setTextSize(1, 16.0f);
        TextView f10 = org.telegram.messenger.n10.f(g10, textView, c8.ma.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2), context);
        this.f49422f = f10;
        f10.setTextSize(1, 13.0f);
        TextView f11 = org.telegram.messenger.n10.f(g10, f10, c8.ma.k(0.0f, 4.0f, 0.0f, 0.0f, -1, -2), context);
        this.h = f11;
        f11.setTextSize(1, 16.0f);
        if (org.telegram.messenger.gd.f24216a0) {
            addView(f11, c8.ma.t(-2, -2, 16, 20, 0, 0, 0));
            addView(g10, c8.ma.q(0, -2, 1.0f, 23, 20, 0, 18, 0));
            addView(frameLayout, c8.ma.t(28, 28, 21, 0, 0, 18, 0));
        } else {
            addView(frameLayout, c8.ma.t(28, 28, 19, 18, 0, 0, 0));
            addView(g10, c8.ma.q(0, -2, 1.0f, 23, 18, 0, 20, 0));
            addView(f11, c8.ma.t(-2, -2, 16, 0, 0, 20, 0));
        }
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29788y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29578n6));
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        float f10;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824);
        if (this.f49424r) {
            f10 = 60.0f;
        } else {
            f10 = 50.0f;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(f10), 1073741824));
    }

    public void setValue(CharSequence charSequence) {
        int i7;
        if (!TextUtils.isEmpty(charSequence)) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        TextView textView = this.h;
        textView.setVisibility(i7);
        textView.setText(charSequence);
    }

    @Override
    public final void updateColors() {
        boolean z10;
        int i7 = org.telegram.ui.ActionBar.n6.G6;
        org.telegram.ui.ActionBar.i6 i6Var = this.f49418a;
        this.f49421e.setTextColor(org.telegram.ui.ActionBar.n6.w0(i7, i6Var));
        this.f49422f.setTextColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29788y6, i6Var));
        this.h.setTextColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29578n6, i6Var));
        if (this.f49423n && (i6Var == null ? org.telegram.ui.ActionBar.n6.I.q() : i6Var.d())) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f49419b.f38332b = z10;
    }
}
