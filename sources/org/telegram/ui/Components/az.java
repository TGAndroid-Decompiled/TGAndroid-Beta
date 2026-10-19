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
public final class az extends FrameLayout {
    public final ImageView f24737a;
    public final TextView f24738b;
    public final RadialProgressView f24739c;
    public boolean d;
    public final tz e;

    public az(tz tzVar, Context context) {
        super(context);
        this.e = tzVar;
        ImageView imageView = new ImageView(getContext());
        this.f24737a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.gif_empty);
        int i10 = org.telegram.ui.ActionBar.h6.Le;
        imageView.setColorFilter(new PorterDuffColorFilter(tzVar.A(i10), PorterDuff.Mode.MULTIPLY));
        addView(imageView, w7.z5.d(-2, -2.0f, 17, 0.0f, 8.0f, 0.0f, 0.0f));
        TextView textView = new TextView(getContext());
        this.f24738b = textView;
        org.telegram.messenger.kk.j(16.0f, R.string.NoGIFsFound, 1, textView);
        textView.setTextColor(tzVar.A(i10));
        addView(textView, w7.z5.d(-2, -2.0f, 17, 0.0f, 42.0f, 0.0f, 0.0f));
        RadialProgressView radialProgressView = new RadialProgressView(context, tzVar.Z1);
        this.f24739c = radialProgressView;
        radialProgressView.setVisibility(8);
        radialProgressView.setProgressColor(tzVar.A(org.telegram.ui.ActionBar.h6.f21059h6));
        addView(radialProgressView, w7.z5.e(-2, -2, 17));
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
            this.f24737a.setVisibility(i10);
            if (z10) {
                i11 = 8;
            } else {
                i11 = 0;
            }
            this.f24738b.setVisibility(i11);
            if (!z10) {
                i12 = 8;
            }
            this.f24739c.setVisibility(i12);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int dp;
        tz tzVar = this.e;
        int measuredHeight = tzVar.f30783h0.getMeasuredHeight();
        if (!this.d) {
            dp = (int) (org.telegram.messenger.kk.A(8.0f, measuredHeight - tzVar.f30764b1, 3) * 1.7f);
        } else {
            dp = measuredHeight - AndroidUtilities.dp(80.0f);
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(dp, 1073741824));
    }
}
