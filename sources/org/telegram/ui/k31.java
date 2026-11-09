package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
public final class k31 extends LinearLayout implements org.telegram.ui.ActionBar.b6 {
    public final org.telegram.ui.ActionBar.g6 f47184a;
    public final org.telegram.ui.Components.ea0 f47185b;
    public final FrameLayout f47186c;
    public final ImageView d;
    public final TextView f47187e;
    public final TextView f47188f;
    public final TextView h;
    public boolean f47189n;
    public boolean f47190r;

    public k31(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f47189n = true;
        this.f47184a = g6Var;
        setOrientation(0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f47186c = frameLayout;
        org.telegram.ui.Components.ea0 ea0Var = new org.telegram.ui.Components.ea0(1);
        this.f47185b = ea0Var;
        frameLayout.setBackground(ea0Var);
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        frameLayout.addView(imageView, c8.ha.e(24, 24, 17));
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        TextView textView = new TextView(context);
        this.f47187e = textView;
        textView.setTextSize(1, 16.0f);
        TextView f11 = org.telegram.messenger.camera.q.f(f10, textView, c8.ha.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2), context);
        this.f47188f = f11;
        f11.setTextSize(1, 13.0f);
        TextView f12 = org.telegram.messenger.camera.q.f(f10, f11, c8.ha.k(0.0f, 4.0f, 0.0f, 0.0f, -1, -2), context);
        this.h = f12;
        f12.setTextSize(1, 16.0f);
        if (org.telegram.messenger.id.f23157a0) {
            addView(f12, c8.ha.t(-2, -2, 16, 20, 0, 0, 0));
            addView(f10, c8.ha.q(0, -2, 1.0f, 23, 20, 0, 18, 0));
            addView(frameLayout, c8.ha.t(28, 28, 21, 0, 0, 18, 0));
        } else {
            addView(frameLayout, c8.ha.t(28, 28, 19, 18, 0, 0, 0));
            addView(f10, c8.ha.q(0, -2, 1.0f, 23, 18, 0, 20, 0));
            addView(f12, c8.ha.t(-2, -2, 16, 0, 0, 20, 0));
        }
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28257y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28047n6));
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        float f10;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824);
        if (this.f47190r) {
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
        boolean z9;
        int i7 = org.telegram.ui.ActionBar.l6.G6;
        org.telegram.ui.ActionBar.g6 g6Var = this.f47184a;
        this.f47187e.setTextColor(org.telegram.ui.ActionBar.l6.w0(i7, g6Var));
        this.f47188f.setTextColor(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f28257y6, g6Var));
        this.h.setTextColor(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f28047n6, g6Var));
        if (this.f47189n && (g6Var == null ? org.telegram.ui.ActionBar.l6.I.q() : g6Var.a())) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f47185b.f33353b = z9;
    }
}
