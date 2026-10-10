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
public final class r70 extends FrameLayout {
    public final TextView f30408a;
    public final TextView f30409b;
    public final u70 f30410c;

    public r70(u70 u70Var, Context context) {
        super(context);
        this.f30410c = u70Var;
        ImageView imageView = new ImageView(context);
        imageView.setBackground(org.telegram.ui.ActionBar.i6.L(46, org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.R7, false), org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Y7, false)));
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(R.drawable.large_income);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        addView(imageView, w7.x5.a(46.0f, 13.0f, 0.0f, 0.0f, 0.0f, 46, 19));
        TextView textView = new TextView(context);
        this.f30408a = textView;
        com.google.android.gms.internal.vision.e2.l(16.0f, 1, textView);
        textView.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.G6, false));
        addView(textView, w7.x5.a(-2.0f, 72.0f, 9.0f, 0.0f, 0.0f, -1, 51));
        TextView textView2 = new TextView(context);
        this.f30409b = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f21185y6, false));
        addView(textView2, w7.x5.a(-2.0f, 72.0f, 32.0f, 0.0f, 0.0f, -1, 51));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(58.0f), 1073741824));
    }
}
