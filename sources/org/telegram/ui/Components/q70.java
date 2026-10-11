package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class q70 extends FrameLayout {
    public final TextView f30182a;
    public final TextView f30183b;
    public final t70 f30184c;

    public q70(t70 t70Var, Context context) {
        super(context);
        this.f30184c = t70Var;
        ImageView imageView = new ImageView(context);
        imageView.setBackground(org.telegram.ui.ActionBar.h6.L(46, org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.R7, false), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Y7, false)));
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(R.drawable.large_income);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        addView(imageView, w7.x5.a(46.0f, 13.0f, 0.0f, 0.0f, 0.0f, 46, 19));
        TextView textView = new TextView(context);
        this.f30182a = textView;
        com.google.android.gms.internal.vision.e2.l(16.0f, 1, textView);
        textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.G6, false));
        addView(textView, w7.x5.a(-2.0f, 72.0f, 9.0f, 0.0f, 0.0f, -1, 51));
        TextView textView2 = new TextView(context);
        this.f30183b = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21207y6, false));
        addView(textView2, w7.x5.a(-2.0f, 72.0f, 32.0f, 0.0f, 0.0f, -1, 51));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(58.0f), 1073741824));
    }
}
