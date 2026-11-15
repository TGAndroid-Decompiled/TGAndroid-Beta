package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
public final class h31 extends LinearLayout implements org.telegram.ui.ActionBar.z5 {
    public final org.telegram.ui.ActionBar.e6 f47599a;
    public final org.telegram.ui.Components.ea0 f47600b;
    public final FrameLayout f47601c;
    public final ImageView d;
    public final TextView f47602e;
    public final TextView f47603f;
    public final TextView h;
    public boolean f47604n;
    public boolean f47605r;

    public h31(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f47604n = true;
        this.f47599a = e6Var;
        setOrientation(0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f47601c = frameLayout;
        org.telegram.ui.Components.ea0 ea0Var = new org.telegram.ui.Components.ea0(1);
        this.f47600b = ea0Var;
        frameLayout.setBackground(ea0Var);
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        frameLayout.addView(imageView, c8.ja.e(24, 24, 17));
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        TextView textView = new TextView(context);
        this.f47602e = textView;
        textView.setTextSize(1, 16.0f);
        TextView f11 = org.telegram.messenger.i20.f(f10, textView, c8.ja.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2), context);
        this.f47603f = f11;
        f11.setTextSize(1, 13.0f);
        TextView f12 = org.telegram.messenger.i20.f(f10, f11, c8.ja.k(0.0f, 4.0f, 0.0f, 0.0f, -1, -2), context);
        this.h = f12;
        f12.setTextSize(1, 16.0f);
        if (org.telegram.messenger.hd.f24101a0) {
            addView(f12, c8.ja.t(-2, -2, 16, 20, 0, 0, 0));
            addView(f10, c8.ja.q(0, -2, 1.0f, 23, 20, 0, 18, 0));
            addView(frameLayout, c8.ja.t(28, 28, 21, 0, 0, 18, 0));
        } else {
            addView(frameLayout, c8.ja.t(28, 28, 19, 18, 0, 0, 0));
            addView(f10, c8.ja.q(0, -2, 1.0f, 23, 18, 0, 20, 0));
            addView(f12, c8.ja.t(-2, -2, 16, 0, 0, 20, 0));
        }
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29241y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29031n6));
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        float f10;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824);
        if (this.f47605r) {
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
        int i7 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.ui.ActionBar.e6 e6Var = this.f47599a;
        this.f47602e.setTextColor(org.telegram.ui.ActionBar.j6.w0(i7, e6Var));
        this.f47603f.setTextColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29241y6, e6Var));
        this.h.setTextColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29031n6, e6Var));
        if (this.f47604n && (e6Var == null ? org.telegram.ui.ActionBar.j6.I.q() : e6Var.a())) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f47600b.f34267b = z10;
    }
}
