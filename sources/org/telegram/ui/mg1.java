package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class mg1 extends LinearLayout {
    public final org.telegram.ui.ActionBar.c6 f40555a;
    public final ImageView f40556b;
    public final LinearLayout f40557c;
    public final TextView d;
    public final TextView f40558e;
    public final ImageView f40559f;
    public boolean h;
    public boolean f40560n;

    public mg1(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        setOrientation(0);
        this.f40555a = c6Var;
        ImageView imageView = new ImageView(context);
        this.f40556b = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        addView(imageView, i7.f6.t(40, 40, 19, 12, 0, 12, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f40557c = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setPadding(0, AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f));
        addView(linearLayout, i7.f6.p(0, -2, 1.0f, 23, 0, 0, 32, 0));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 16.0f);
        TextView i10 = th.i(linearLayout, textView, i7.f6.t(-1, -2, 7, 0, 0, 0, 0), context);
        this.f40558e = i10;
        i10.setTextSize(1, 13.0f);
        linearLayout.addView(i10, i7.f6.r(-1, -2, 7, 0.0f, 4.33f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f40559f = imageView2;
        imageView2.setScaleType(scaleType);
        addView(imageView2, i7.f6.t(40, 40, 21, 12, 0, 12, 0));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }
}
