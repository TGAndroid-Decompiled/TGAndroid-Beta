package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
public final class ib1 extends LinearLayout implements org.telegram.ui.ActionBar.b6 {
    public final org.telegram.ui.ActionBar.h6 f48721a;
    public final ImageView f48722b;
    public final LinearLayout f48723c;
    public final TextView d;
    public final TextView f48724e;
    public final ImageView f48725f;
    public boolean h;
    public boolean f48726n;
    public int f48727r;

    public ib1(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        setOrientation(0);
        this.f48721a = h6Var;
        ImageView imageView = new ImageView(context);
        this.f48722b = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        addView(imageView, c8.ma.t(40, 40, 19, 12, 0, 12, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f48723c = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setPadding(0, org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f));
        addView(linearLayout, c8.ma.q(0, -2, 1.0f, 23, 0, 0, 32, 0));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 16.0f);
        TextView f10 = org.telegram.messenger.o10.f(linearLayout, textView, c8.ma.t(-1, -2, 7, 0, 0, 0, 0), context);
        this.f48724e = f10;
        f10.setTextSize(1, 13.0f);
        linearLayout.addView(f10, c8.ma.s(-1, -2, 7, 0.0f, 4.33f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f48725f = imageView2;
        imageView2.setScaleType(scaleType);
        addView(imageView2, c8.ma.t(40, 40, 21, 12, 0, 12, 0));
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
        if (this.f48726n) {
            i7 = org.telegram.ui.ActionBar.m6.f29622q7;
        } else if (this.h) {
            i7 = org.telegram.ui.ActionBar.m6.f29563n6;
        } else {
            i7 = org.telegram.ui.ActionBar.m6.G6;
        }
        org.telegram.ui.ActionBar.h6 h6Var = this.f48721a;
        int w02 = org.telegram.ui.ActionBar.m6.w0(i7, h6Var);
        int i12 = this.f48727r;
        ImageView imageView = this.f48725f;
        ImageView imageView2 = this.f48722b;
        if (w02 != i12 || imageView2.getColorFilter() == null || imageView.getColorFilter() == null) {
            this.f48727r = w02;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            imageView2.setColorFilter(new PorterDuffColorFilter(w02, mode));
            imageView.setColorFilter(new PorterDuffColorFilter(w02, mode));
        }
        if (this.f48726n) {
            i10 = org.telegram.ui.ActionBar.m6.f29602p7;
        } else if (this.h) {
            i10 = org.telegram.ui.ActionBar.m6.f29563n6;
        } else {
            i10 = org.telegram.ui.ActionBar.m6.G6;
        }
        this.d.setTextColor(org.telegram.ui.ActionBar.m6.w0(i10, h6Var));
        if (this.f48726n) {
            i11 = org.telegram.ui.ActionBar.m6.f29602p7;
        } else if (this.h) {
            i11 = org.telegram.ui.ActionBar.m6.f29563n6;
        } else {
            i11 = org.telegram.ui.ActionBar.m6.f29773y6;
        }
        this.f48724e.setTextColor(org.telegram.ui.ActionBar.m6.w0(i11, h6Var));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
