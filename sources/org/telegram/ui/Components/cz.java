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
public final class cz extends FrameLayout {
    public final ImageView f24229a;
    public final TextView f24230b;
    public final RadialProgressView f24231c;
    public boolean d;
    public final wz e;

    public cz(wz wzVar, Context context) {
        super(context);
        this.e = wzVar;
        ImageView imageView = new ImageView(getContext());
        this.f24229a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.gif_empty);
        int i10 = org.telegram.ui.ActionBar.g6.Le;
        imageView.setColorFilter(new PorterDuffColorFilter(wzVar.A(i10), PorterDuff.Mode.MULTIPLY));
        addView(imageView, w7.a6.a(-2.0f, 0.0f, 8.0f, 0.0f, 0.0f, -2, 17));
        TextView textView = new TextView(getContext());
        this.f24230b = textView;
        org.telegram.messenger.yh.j(16.0f, R.string.NoGIFsFound, 1, textView);
        textView.setTextColor(wzVar.A(i10));
        addView(textView, w7.a6.a(-2.0f, 0.0f, 42.0f, 0.0f, 0.0f, -2, 17));
        RadialProgressView radialProgressView = new RadialProgressView(context, wzVar.Z1);
        this.f24231c = radialProgressView;
        radialProgressView.setVisibility(8);
        radialProgressView.setProgressColor(wzVar.A(org.telegram.ui.ActionBar.g6.f19973h6));
        addView(radialProgressView, w7.a6.e(-2, -2, 17));
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
            this.f24229a.setVisibility(i10);
            if (z10) {
                i11 = 8;
            } else {
                i11 = 0;
            }
            this.f24230b.setVisibility(i11);
            if (!z10) {
                i12 = 8;
            }
            this.f24231c.setVisibility(i12);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int dp;
        wz wzVar = this.e;
        int measuredHeight = wzVar.f31029h0.getMeasuredHeight();
        if (!this.d) {
            dp = (int) (org.telegram.messenger.yh.B(8.0f, measuredHeight - wzVar.f31010b1, 3) * 1.7f);
        } else {
            dp = measuredHeight - AndroidUtilities.dp(80.0f);
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(dp, 1073741824));
    }
}
