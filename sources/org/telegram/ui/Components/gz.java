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
public final class gz extends FrameLayout {
    public final ImageView f26897a;
    public final TextView f26898b;
    public final RadialProgressView f26899c;
    public boolean d;
    public final a00 f26900e;

    public gz(a00 a00Var, Context context) {
        super(context);
        this.f26900e = a00Var;
        ImageView imageView = new ImageView(getContext());
        this.f26897a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.gif_empty);
        int i10 = org.telegram.ui.ActionBar.i6.Le;
        imageView.setColorFilter(new PorterDuffColorFilter(a00Var.B(i10), PorterDuff.Mode.MULTIPLY));
        addView(imageView, w7.x5.a(-2.0f, 0.0f, 8.0f, 0.0f, 0.0f, -2, 17));
        TextView textView = new TextView(getContext());
        this.f26898b = textView;
        org.telegram.messenger.bi.j(16.0f, R.string.NoGIFsFound, 1, textView);
        textView.setTextColor(a00Var.B(i10));
        addView(textView, w7.x5.a(-2.0f, 0.0f, 42.0f, 0.0f, 0.0f, -2, 17));
        RadialProgressView radialProgressView = new RadialProgressView(context, a00Var.Z1);
        this.f26899c = radialProgressView;
        radialProgressView.setVisibility(8);
        radialProgressView.setProgressColor(a00Var.B(org.telegram.ui.ActionBar.i6.f20869h6));
        addView(radialProgressView, w7.x5.e(-2, -2, 17));
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
            this.f26897a.setVisibility(i10);
            if (z10) {
                i11 = 8;
            } else {
                i11 = 0;
            }
            this.f26898b.setVisibility(i11);
            if (!z10) {
                i12 = 8;
            }
            this.f26899c.setVisibility(i12);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int dp;
        a00 a00Var = this.f26900e;
        int measuredHeight = a00Var.f24417h0.getMeasuredHeight();
        if (!this.d) {
            dp = (int) (org.telegram.messenger.bi.A(8.0f, measuredHeight - a00Var.f24397b1, 3) * 1.7f);
        } else {
            dp = measuredHeight - AndroidUtilities.dp(80.0f);
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(dp, 1073741824));
    }
}
