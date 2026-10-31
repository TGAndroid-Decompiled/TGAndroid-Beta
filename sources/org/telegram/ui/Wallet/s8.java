package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.z20;
public final class s8 extends LinearLayout implements org.telegram.ui.ActionBar.k6 {
    public final org.telegram.ui.ActionBar.p6 f35202a;
    public final TextView f35203b;
    public final TextView f35204c;
    public final ImageView d;

    public s8(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        setOrientation(0);
        this.f35202a = p6Var;
        setPadding(org.telegram.messenger.i0.L(20.0f), 0, org.telegram.messenger.i0.L(13.0f), 0);
        LinearLayout f7 = org.telegram.messenger.m5.f(context, 1);
        f7.setPadding(0, org.telegram.messenger.i0.L(10.0f), 0, org.telegram.messenger.i0.L(10.0f));
        addView(f7, w7.b6.q(0, -2, 1.0f, 19, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        this.f35203b = textView;
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(org.telegram.messenger.i0.o1("fonts/rmono.ttf"));
        TextView f10 = z20.f(f7, textView, w7.b6.t(-1, -2, 55, 0, 0, 0, 2), context);
        this.f35204c = f10;
        f10.setTextSize(1, 14.0f);
        f7.addView(f10, w7.b6.t(-1, -2, 55, 0, 0, 0, 0));
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131230875);
        addView(imageView, w7.b6.t(21, 21, 21, 9, 0, 0, 0));
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21330z6));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }

    @Override
    public final void updateColors() {
        int i10 = org.telegram.ui.ActionBar.t6.G6;
        org.telegram.ui.ActionBar.p6 p6Var = this.f35202a;
        this.f35203b.setTextColor(org.telegram.ui.ActionBar.t6.w0(i10, p6Var));
        int i11 = org.telegram.ui.ActionBar.t6.f21330z6;
        this.f35204c.setTextColor(org.telegram.ui.ActionBar.t6.w0(i11, p6Var));
        this.d.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.t6.w0(i11, p6Var), PorterDuff.Mode.SRC_IN));
    }
}
