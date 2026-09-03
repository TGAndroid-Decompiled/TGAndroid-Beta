package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class gh1 extends LinearLayout {
    public final org.telegram.ui.ActionBar.g6 f37106a;
    public final ImageView f37107b;
    public final LinearLayout f37108c;
    public final TextView d;
    public final TextView f37109e;
    public final ImageView f37110f;
    public boolean h;
    public boolean f37111n;

    public gh1(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        setOrientation(0);
        this.f37106a = g6Var;
        ImageView imageView = new ImageView(context);
        this.f37107b = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        addView(imageView, k7.c6.t(40, 40, 19, 12, 0, 12, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f37108c = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setPadding(0, AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f));
        addView(linearLayout, k7.c6.p(0, -2, 1.0f, 23, 0, 0, 32, 0));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 16.0f);
        TextView i10 = yh.i(linearLayout, textView, k7.c6.t(-1, -2, 7, 0, 0, 0, 0), context);
        this.f37109e = i10;
        i10.setTextSize(1, 13.0f);
        linearLayout.addView(i10, k7.c6.r(-1, -2, 7, 0.0f, 4.33f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f37110f = imageView2;
        imageView2.setScaleType(scaleType);
        addView(imageView2, k7.c6.t(40, 40, 21, 12, 0, 12, 0));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }
}
