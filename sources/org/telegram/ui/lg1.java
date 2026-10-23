package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
public final class lg1 extends LinearLayout implements org.telegram.ui.ActionBar.b6 {
    public final org.telegram.ui.ActionBar.g6 f39247a;
    public final ImageView f39248b;
    public final LinearLayout f39249c;
    public final TextView d;
    public final TextView e;
    public final ImageView f39250f;
    public boolean h;
    public boolean f39251n;
    public int f39252r;

    public lg1(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        setOrientation(0);
        this.f39247a = g6Var;
        ImageView imageView = new ImageView(context);
        this.f39248b = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        addView(imageView, w7.z5.t(40, 40, 19, 12, 0, 12, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f39249c = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setPadding(0, AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f));
        addView(linearLayout, w7.z5.p(0, -2, 1.0f, 23, 0, 0, 32, 0));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 16.0f);
        TextView f7 = org.telegram.messenger.sl.f(linearLayout, textView, w7.z5.t(-1, -2, 7, 0, 0, 0, 0), context);
        this.e = f7;
        f7.setTextSize(1, 13.0f);
        linearLayout.addView(f7, w7.z5.r(-1, -2, 7, 0.0f, 4.33f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f39250f = imageView2;
        imageView2.setScaleType(scaleType);
        addView(imageView2, w7.z5.t(40, 40, 21, 12, 0, 12, 0));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }

    @Override
    public final void updateColors() {
        int i10;
        int i11;
        int i12;
        if (this.f39251n) {
            i10 = org.telegram.ui.ActionBar.k6.f21421q7;
        } else if (this.h) {
            i10 = org.telegram.ui.ActionBar.k6.f21366n6;
        } else {
            i10 = org.telegram.ui.ActionBar.k6.G6;
        }
        org.telegram.ui.ActionBar.g6 g6Var = this.f39247a;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i10, g6Var);
        int i13 = this.f39252r;
        ImageView imageView = this.f39250f;
        ImageView imageView2 = this.f39248b;
        if (w02 != i13 || imageView2.getColorFilter() == null || imageView.getColorFilter() == null) {
            this.f39252r = w02;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            imageView2.setColorFilter(new PorterDuffColorFilter(w02, mode));
            imageView.setColorFilter(new PorterDuffColorFilter(w02, mode));
        }
        if (this.f39251n) {
            i11 = org.telegram.ui.ActionBar.k6.f21404p7;
        } else if (this.h) {
            i11 = org.telegram.ui.ActionBar.k6.f21366n6;
        } else {
            i11 = org.telegram.ui.ActionBar.k6.G6;
        }
        this.d.setTextColor(org.telegram.ui.ActionBar.k6.w0(i11, g6Var));
        if (this.f39251n) {
            i12 = org.telegram.ui.ActionBar.k6.f21404p7;
        } else if (this.h) {
            i12 = org.telegram.ui.ActionBar.k6.f21366n6;
        } else {
            i12 = org.telegram.ui.ActionBar.k6.f21571y6;
        }
        this.e.setTextColor(org.telegram.ui.ActionBar.k6.w0(i12, g6Var));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
