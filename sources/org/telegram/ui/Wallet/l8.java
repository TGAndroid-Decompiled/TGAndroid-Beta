package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
public final class l8 extends LinearLayout implements org.telegram.ui.ActionBar.b6 {
    public final org.telegram.ui.ActionBar.g6 f42729a;
    public final TextView f42730b;
    public final TextView f42731c;
    public final ImageView d;

    public l8(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        setOrientation(0);
        this.f42729a = g6Var;
        setPadding(org.telegram.messenger.g0.L(20.0f), 0, org.telegram.messenger.g0.L(13.0f), 0);
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        f10.setPadding(0, org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f));
        addView(f10, c8.ha.q(0, -2, 1.0f, 19, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        this.f42730b = textView;
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(org.telegram.messenger.g0.o1("fonts/rmono.ttf"));
        TextView f11 = org.telegram.messenger.camera.q.f(f10, textView, c8.ha.t(-1, -2, 55, 0, 0, 0, 2), context);
        this.f42731c = f11;
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
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28275z6));
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), i10);
    }

    @Override
    public final void updateColors() {
        int i7 = org.telegram.ui.ActionBar.l6.G6;
        org.telegram.ui.ActionBar.g6 g6Var = this.f42729a;
        this.f42730b.setTextColor(org.telegram.ui.ActionBar.l6.w0(i7, g6Var));
        int i10 = org.telegram.ui.ActionBar.l6.f28275z6;
        this.f42731c.setTextColor(org.telegram.ui.ActionBar.l6.w0(i10, g6Var));
        this.d.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.l6.w0(i10, g6Var), PorterDuff.Mode.SRC_IN));
    }
}
