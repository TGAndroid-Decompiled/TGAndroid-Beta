package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class k70 extends FrameLayout implements org.telegram.ui.ActionBar.p6 {
    public final ImageView f29827a;
    public final TextView f29828b;
    public final TextView f29829c;
    public int d;
    public int e;
    public final n70 f29830f;

    public k70(n70 n70Var, Context context) {
        super(context);
        this.f29830f = n70Var;
        ImageView imageView = new ImageView(context);
        this.f29827a = imageView;
        imageView.setBackground(org.telegram.ui.ActionBar.y6.L(46, org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.R7, false), org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Y7, false)));
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(R.drawable.large_income);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        addView(imageView, gb1.h(46, 46.0f, 19, 13.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f29828b = textView;
        ic.a.o(16.0f, 1, textView);
        org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.G6, null);
        addView(textView, gb1.h(-1, -2.0f, 51, 72.0f, 9.0f, 0.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.f29829c = textView2;
        textView2.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.f7.V(textView2, org.telegram.ui.ActionBar.y6.f23746y6, null);
        addView(textView2, gb1.h(-1, -2.0f, 51, 72.0f, 32.0f, 0.0f, 0.0f));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(58.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        int x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.R7, false);
        int x03 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Y7, false);
        ImageView imageView = this.f29827a;
        if (imageView != null) {
            if (x02 != this.d || x03 != this.e) {
                this.d = x02;
                this.e = x03;
                imageView.setBackground(org.telegram.ui.ActionBar.y6.L(46, x02, x03));
                invalidate();
            }
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
