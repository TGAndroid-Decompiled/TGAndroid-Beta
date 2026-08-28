package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class kg1 extends LinearLayout {
    public final org.telegram.ui.ActionBar.b6 f39831a;
    public final ImageView f39832b;
    public final LinearLayout f39833c;
    public final TextView d;
    public final TextView f39834e;
    public final ImageView f39835f;
    public boolean h;
    public boolean f39836n;

    public kg1(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        setOrientation(0);
        this.f39831a = b6Var;
        ImageView imageView = new ImageView(context);
        this.f39832b = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        addView(imageView, g7.e6.t(40, 40, 19, 12, 0, 12, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f39833c = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setPadding(0, AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f));
        addView(linearLayout, g7.e6.p(0, -2, 1.0f, 23, 0, 0, 32, 0));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 16.0f);
        TextView h = j3.r0.h(linearLayout, textView, g7.e6.t(-1, -2, 7, 0, 0, 0, 0), context);
        this.f39834e = h;
        h.setTextSize(1, 13.0f);
        linearLayout.addView(h, g7.e6.r(-1, -2, 7, 0.0f, 4.33f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f39835f = imageView2;
        imageView2.setScaleType(scaleType);
        addView(imageView2, g7.e6.t(40, 40, 21, 12, 0, 12, 0));
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), 1073741824), i10);
    }
}
