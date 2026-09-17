package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ry extends FrameLayout {
    public final ImageView f27713a;
    public final TextView f27714b;
    public final RadialProgressView f27715c;
    public boolean d;
    public final kz e;

    public ry(kz kzVar, Context context) {
        super(context);
        this.e = kzVar;
        ImageView imageView = new ImageView(getContext());
        this.f27713a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.gif_empty);
        int i10 = org.telegram.ui.ActionBar.j6.Le;
        imageView.setColorFilter(new PorterDuffColorFilter(kzVar.z(i10), PorterDuff.Mode.MULTIPLY));
        addView(imageView, w7.x5.d(-2, -2.0f, 17, 0.0f, 8.0f, 0.0f, 0.0f));
        TextView textView = new TextView(getContext());
        this.f27714b = textView;
        textView.setText(LocaleController.getString(R.string.NoGIFsFound));
        textView.setTextSize(1, 16.0f);
        textView.setTextColor(kzVar.z(i10));
        addView(textView, w7.x5.d(-2, -2.0f, 17, 0.0f, 42.0f, 0.0f, 0.0f));
        RadialProgressView radialProgressView = new RadialProgressView(context, kzVar.Z1);
        this.f27715c = radialProgressView;
        radialProgressView.setVisibility(8);
        radialProgressView.setProgressColor(kzVar.z(org.telegram.ui.ActionBar.j6.f18934h6));
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
            this.f27713a.setVisibility(i10);
            if (z10) {
                i11 = 8;
            } else {
                i11 = 0;
            }
            this.f27714b.setVisibility(i11);
            if (!z10) {
                i12 = 8;
            }
            this.f27715c.setVisibility(i12);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int dp;
        kz kzVar = this.e;
        int measuredHeight = kzVar.f25728h0.getMeasuredHeight();
        if (!this.d) {
            dp = (int) (org.telegram.messenger.wl.y(8.0f, measuredHeight - kzVar.f25709b1, 3) * 1.7f);
        } else {
            dp = measuredHeight - AndroidUtilities.dp(80.0f);
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(dp, 1073741824));
    }
}
