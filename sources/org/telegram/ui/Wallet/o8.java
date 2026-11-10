package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
public final class o8 extends LinearLayout implements org.telegram.ui.ActionBar.c6 {
    public final org.telegram.ui.ActionBar.h6 f42913a;
    public final TextView f42914b;
    public final TextView f42915c;
    public final ImageView d;

    public o8(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        setOrientation(0);
        this.f42913a = h6Var;
        setPadding(org.telegram.messenger.g0.L(20.0f), 0, org.telegram.messenger.g0.L(13.0f), 0);
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        f10.setPadding(0, org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f));
        addView(f10, c8.ha.q(0, -2, 1.0f, 19, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        this.f42914b = textView;
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(org.telegram.messenger.g0.o1("fonts/rmono.ttf"));
        TextView f11 = org.telegram.messenger.camera.q.f(f10, textView, c8.ha.t(-1, -2, 55, 0, 0, 0, 2), context);
        this.f42915c = f11;
        f11.setTextSize(1, 14.0f);
        f10.addView(f11, c8.ha.t(-1, -2, 55, 0, 0, 0, 0));
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131230875);
        addView(imageView, c8.ha.t(21, 21, 21, 9, 0, 0, 0));
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28300z6));
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), i10);
    }

    @Override
    public final void updateColors() {
        int i7 = org.telegram.ui.ActionBar.m6.G6;
        org.telegram.ui.ActionBar.h6 h6Var = this.f42913a;
        this.f42914b.setTextColor(org.telegram.ui.ActionBar.m6.w0(i7, h6Var));
        int i10 = org.telegram.ui.ActionBar.m6.f28300z6;
        this.f42915c.setTextColor(org.telegram.ui.ActionBar.m6.w0(i10, h6Var));
        this.d.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.m6.w0(i10, h6Var), PorterDuff.Mode.SRC_IN));
    }
}
