package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
public final class gb1 extends LinearLayout implements org.telegram.ui.ActionBar.a6 {
    public final org.telegram.ui.ActionBar.f6 f45932a;
    public final ImageView f45933b;
    public final LinearLayout f45934c;
    public final TextView d;
    public final TextView f45935e;
    public final ImageView f45936f;
    public boolean h;
    public boolean f45937n;
    public int f45938r;

    public gb1(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        setOrientation(0);
        this.f45932a = f6Var;
        ImageView imageView = new ImageView(context);
        this.f45933b = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        addView(imageView, c8.ha.t(40, 40, 19, 12, 0, 12, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f45934c = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setPadding(0, org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f));
        addView(linearLayout, c8.ha.q(0, -2, 1.0f, 23, 0, 0, 32, 0));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 16.0f);
        TextView f10 = org.telegram.messenger.camera.q.f(linearLayout, textView, c8.ha.t(-1, -2, 7, 0, 0, 0, 0), context);
        this.f45935e = f10;
        f10.setTextSize(1, 13.0f);
        linearLayout.addView(f10, c8.ha.s(-1, -2, 7, 0.0f, 4.33f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f45936f = imageView2;
        imageView2.setScaleType(scaleType);
        addView(imageView2, c8.ha.t(40, 40, 21, 12, 0, 12, 0));
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
        if (this.f45937n) {
            i7 = org.telegram.ui.ActionBar.k6.f28093q7;
        } else if (this.h) {
            i7 = org.telegram.ui.ActionBar.k6.f28034n6;
        } else {
            i7 = org.telegram.ui.ActionBar.k6.G6;
        }
        org.telegram.ui.ActionBar.f6 f6Var = this.f45932a;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i7, f6Var);
        int i12 = this.f45938r;
        ImageView imageView = this.f45936f;
        ImageView imageView2 = this.f45933b;
        if (w02 != i12 || imageView2.getColorFilter() == null || imageView.getColorFilter() == null) {
            this.f45938r = w02;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            imageView2.setColorFilter(new PorterDuffColorFilter(w02, mode));
            imageView.setColorFilter(new PorterDuffColorFilter(w02, mode));
        }
        if (this.f45937n) {
            i10 = org.telegram.ui.ActionBar.k6.f28073p7;
        } else if (this.h) {
            i10 = org.telegram.ui.ActionBar.k6.f28034n6;
        } else {
            i10 = org.telegram.ui.ActionBar.k6.G6;
        }
        this.d.setTextColor(org.telegram.ui.ActionBar.k6.w0(i10, f6Var));
        if (this.f45937n) {
            i11 = org.telegram.ui.ActionBar.k6.f28073p7;
        } else if (this.h) {
            i11 = org.telegram.ui.ActionBar.k6.f28034n6;
        } else {
            i11 = org.telegram.ui.ActionBar.k6.f28244y6;
        }
        this.f45935e.setTextColor(org.telegram.ui.ActionBar.k6.w0(i11, f6Var));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
