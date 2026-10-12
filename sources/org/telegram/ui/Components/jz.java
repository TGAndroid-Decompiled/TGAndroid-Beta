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
public final class jz extends FrameLayout {
    public final ImageView f27679a;
    public final TextView f27680b;
    public final RadialProgressView f27681c;
    public boolean d;
    public final d00 f27682e;

    public jz(d00 d00Var, Context context) {
        super(context);
        this.f27682e = d00Var;
        ImageView imageView = new ImageView(getContext());
        this.f27679a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.gif_empty);
        int i10 = org.telegram.ui.ActionBar.h6.Le;
        imageView.setColorFilter(new PorterDuffColorFilter(d00Var.A(i10), PorterDuff.Mode.MULTIPLY));
        addView(imageView, w7.w5.a(-2.0f, 0.0f, 8.0f, 0.0f, 0.0f, -2, 17));
        TextView textView = new TextView(getContext());
        this.f27680b = textView;
        org.telegram.messenger.am.j(16.0f, R.string.NoGIFsFound, 1, textView);
        textView.setTextColor(d00Var.A(i10));
        addView(textView, w7.w5.a(-2.0f, 0.0f, 42.0f, 0.0f, 0.0f, -2, 17));
        RadialProgressView radialProgressView = new RadialProgressView(context, d00Var.Z1);
        this.f27681c = radialProgressView;
        radialProgressView.setVisibility(8);
        radialProgressView.setProgressColor(d00Var.A(org.telegram.ui.ActionBar.h6.f20632h6));
        addView(radialProgressView, w7.w5.e(-2, -2, 17));
    }

    public final void a(boolean z10) {
        int i10;
        int i11;
        if (this.d != z10) {
            this.d = z10;
            int i12 = 0;
            if (z10) {
                i10 = 8;
            } else {
                i10 = 0;
            }
            this.f27679a.setVisibility(i10);
            if (z10) {
                i11 = 8;
            } else {
                i11 = 0;
            }
            this.f27680b.setVisibility(i11);
            if (!z10) {
                i12 = 8;
            }
            this.f27681c.setVisibility(i12);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int dp;
        d00 d00Var = this.f27682e;
        int measuredHeight = d00Var.f25088h0.getMeasuredHeight();
        if (!this.d) {
            dp = (int) (org.telegram.messenger.am.A(8.0f, measuredHeight - d00Var.f25068b1, 3) * 1.7f);
        } else {
            dp = measuredHeight - AndroidUtilities.dp(80.0f);
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(dp, 1073741824));
    }
}
