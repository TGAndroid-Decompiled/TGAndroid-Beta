package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.HashSet;
public final class f50 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final ImageView f33706a;
    public final TextView f33707b;
    public final TextView f33708c;
    public int d;
    public int f33709e;
    public final i50 f33710f;

    public f50(i50 i50Var, Context context) {
        super(context);
        this.f33710f = i50Var;
        ImageView imageView = new ImageView(context);
        this.f33706a = imageView;
        imageView.setBackground(org.telegram.ui.ActionBar.k6.M(46, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.R7, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Y7, false)));
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(2131231609);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        addView(imageView, b8.mf.d(46, 46.0f, 19, 13.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f33707b = textView;
        k2.p1.t(textView, 1, 16.0f);
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.G6, null);
        addView(textView, b8.mf.d(-1, -2.0f, 51, 72.0f, 9.0f, 0.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.f33708c = textView2;
        textView2.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.f28273y6, null);
        addView(textView2, b8.mf.d(-1, -2.0f, 51, 72.0f, 32.0f, 0.0f, 0.0f));
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(58.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.R7, false);
        int x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Y7, false);
        ImageView imageView = this.f33706a;
        if (imageView != null) {
            if (x02 != this.d || x03 != this.f33709e) {
                this.d = x02;
                this.f33709e = x03;
                imageView.setBackground(org.telegram.ui.ActionBar.k6.M(46, x02, x03));
                invalidate();
            }
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
