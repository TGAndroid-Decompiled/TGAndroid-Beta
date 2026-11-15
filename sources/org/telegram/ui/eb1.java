package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
public final class eb1 extends LinearLayout implements org.telegram.ui.ActionBar.z5 {
    public final org.telegram.ui.ActionBar.e6 f46656a;
    public final ImageView f46657b;
    public final LinearLayout f46658c;
    public final TextView d;
    public final TextView f46659e;
    public final ImageView f46660f;
    public boolean h;
    public boolean f46661n;
    public int f46662r;

    public eb1(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        setOrientation(0);
        this.f46656a = e6Var;
        ImageView imageView = new ImageView(context);
        this.f46657b = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        addView(imageView, c8.ja.t(40, 40, 19, 12, 0, 12, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f46658c = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setPadding(0, org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f));
        addView(linearLayout, c8.ja.q(0, -2, 1.0f, 23, 0, 0, 32, 0));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 16.0f);
        TextView f10 = org.telegram.messenger.i20.f(linearLayout, textView, c8.ja.t(-1, -2, 7, 0, 0, 0, 0), context);
        this.f46659e = f10;
        f10.setTextSize(1, 13.0f);
        linearLayout.addView(f10, c8.ja.s(-1, -2, 7, 0.0f, 4.33f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f46660f = imageView2;
        imageView2.setScaleType(scaleType);
        addView(imageView2, c8.ja.t(40, 40, 21, 12, 0, 12, 0));
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), i10);
    }

    @Override
    public final void updateColors() {
        int i7;
        int i10;
        int i11;
        if (this.f46661n) {
            i7 = org.telegram.ui.ActionBar.j6.f29090q7;
        } else if (this.h) {
            i7 = org.telegram.ui.ActionBar.j6.f29031n6;
        } else {
            i7 = org.telegram.ui.ActionBar.j6.G6;
        }
        org.telegram.ui.ActionBar.e6 e6Var = this.f46656a;
        int w02 = org.telegram.ui.ActionBar.j6.w0(i7, e6Var);
        int i12 = this.f46662r;
        ImageView imageView = this.f46660f;
        ImageView imageView2 = this.f46657b;
        if (w02 != i12 || imageView2.getColorFilter() == null || imageView.getColorFilter() == null) {
            this.f46662r = w02;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            imageView2.setColorFilter(new PorterDuffColorFilter(w02, mode));
            imageView.setColorFilter(new PorterDuffColorFilter(w02, mode));
        }
        if (this.f46661n) {
            i10 = org.telegram.ui.ActionBar.j6.f29070p7;
        } else if (this.h) {
            i10 = org.telegram.ui.ActionBar.j6.f29031n6;
        } else {
            i10 = org.telegram.ui.ActionBar.j6.G6;
        }
        this.d.setTextColor(org.telegram.ui.ActionBar.j6.w0(i10, e6Var));
        if (this.f46661n) {
            i11 = org.telegram.ui.ActionBar.j6.f29070p7;
        } else if (this.h) {
            i11 = org.telegram.ui.ActionBar.j6.f29031n6;
        } else {
            i11 = org.telegram.ui.ActionBar.j6.f29241y6;
        }
        this.f46659e.setTextColor(org.telegram.ui.ActionBar.j6.w0(i11, e6Var));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
