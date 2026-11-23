package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
public final class gb1 extends LinearLayout implements org.telegram.ui.ActionBar.c6 {
    public final org.telegram.ui.ActionBar.i6 f48206a;
    public final ImageView f48207b;
    public final LinearLayout f48208c;
    public final TextView d;
    public final TextView f48209e;
    public final ImageView f48210f;
    public boolean h;
    public boolean f48211n;
    public int f48212r;

    public gb1(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        setOrientation(0);
        this.f48206a = i6Var;
        ImageView imageView = new ImageView(context);
        this.f48207b = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        addView(imageView, c8.na.t(40, 40, 19, 12, 0, 12, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f48208c = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setPadding(0, org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f));
        addView(linearLayout, c8.na.q(0, -2, 1.0f, 23, 0, 0, 32, 0));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 16.0f);
        TextView f10 = org.telegram.messenger.m10.f(linearLayout, textView, c8.na.t(-1, -2, 7, 0, 0, 0, 0), context);
        this.f48209e = f10;
        f10.setTextSize(1, 13.0f);
        linearLayout.addView(f10, c8.na.s(-1, -2, 7, 0.0f, 4.33f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f48210f = imageView2;
        imageView2.setScaleType(scaleType);
        addView(imageView2, c8.na.t(40, 40, 21, 12, 0, 12, 0));
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
        if (this.f48211n) {
            i7 = org.telegram.ui.ActionBar.n6.f29692q7;
        } else if (this.h) {
            i7 = org.telegram.ui.ActionBar.n6.f29633n6;
        } else {
            i7 = org.telegram.ui.ActionBar.n6.G6;
        }
        org.telegram.ui.ActionBar.i6 i6Var = this.f48206a;
        int w02 = org.telegram.ui.ActionBar.n6.w0(i7, i6Var);
        int i12 = this.f48212r;
        ImageView imageView = this.f48210f;
        ImageView imageView2 = this.f48207b;
        if (w02 != i12 || imageView2.getColorFilter() == null || imageView.getColorFilter() == null) {
            this.f48212r = w02;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            imageView2.setColorFilter(new PorterDuffColorFilter(w02, mode));
            imageView.setColorFilter(new PorterDuffColorFilter(w02, mode));
        }
        if (this.f48211n) {
            i10 = org.telegram.ui.ActionBar.n6.f29672p7;
        } else if (this.h) {
            i10 = org.telegram.ui.ActionBar.n6.f29633n6;
        } else {
            i10 = org.telegram.ui.ActionBar.n6.G6;
        }
        this.d.setTextColor(org.telegram.ui.ActionBar.n6.w0(i10, i6Var));
        if (this.f48211n) {
            i11 = org.telegram.ui.ActionBar.n6.f29672p7;
        } else if (this.h) {
            i11 = org.telegram.ui.ActionBar.n6.f29633n6;
        } else {
            i11 = org.telegram.ui.ActionBar.n6.f29843y6;
        }
        this.f48209e.setTextColor(org.telegram.ui.ActionBar.n6.w0(i11, i6Var));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
