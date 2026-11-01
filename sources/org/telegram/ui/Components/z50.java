package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.HashSet;
public final class z50 extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public final ImageView f33004a;
    public final TextView f33005b;
    public final TextView f33006c;
    public int d;
    public int e;
    public final c60 f33007f;

    public z50(c60 c60Var, Context context) {
        super(context);
        this.f33007f = c60Var;
        ImageView imageView = new ImageView(context);
        this.f33004a = imageView;
        imageView.setBackground(org.telegram.ui.ActionBar.t6.M(46, org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.R7, false), org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Y7, false)));
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(2131231610);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        addView(imageView, w7.b6.d(46, 46.0f, 19, 13.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f33005b = textView;
        sc.e.t(textView, 1, 16.0f);
        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.G6, null);
        addView(textView, w7.b6.d(-1, -2.0f, 51, 72.0f, 9.0f, 0.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.f33006c = textView2;
        textView2.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.a7.V(textView2, org.telegram.ui.ActionBar.t6.f21312y6, null);
        addView(textView2, w7.b6.d(-1, -2.0f, 51, 72.0f, 32.0f, 0.0f, 0.0f));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(58.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.R7, false);
        int x03 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Y7, false);
        ImageView imageView = this.f33004a;
        if (imageView != null) {
            if (x02 != this.d || x03 != this.e) {
                this.d = x02;
                this.e = x03;
                imageView.setBackground(org.telegram.ui.ActionBar.t6.M(46, x02, x03));
                invalidate();
            }
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
