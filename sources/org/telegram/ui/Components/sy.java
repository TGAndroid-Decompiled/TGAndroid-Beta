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
public final class sy extends FrameLayout {
    public final ImageView f31199a;
    public final TextView f31200b;
    public final RadialProgressView f31201c;
    public boolean d;
    public final mz f31202e;

    public sy(mz mzVar, Context context) {
        super(context);
        this.f31202e = mzVar;
        ImageView imageView = new ImageView(getContext());
        this.f31199a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.gif_empty);
        int i10 = org.telegram.ui.ActionBar.k6.Le;
        imageView.setColorFilter(new PorterDuffColorFilter(mzVar.A(i10), PorterDuff.Mode.MULTIPLY));
        addView(imageView, k7.c6.d(-2, -2.0f, 17, 0.0f, 8.0f, 0.0f, 0.0f));
        TextView textView = new TextView(getContext());
        this.f31200b = textView;
        textView.setText(LocaleController.getString(R.string.NoGIFsFound));
        textView.setTextSize(1, 16.0f);
        textView.setTextColor(mzVar.A(i10));
        addView(textView, k7.c6.d(-2, -2.0f, 17, 0.0f, 42.0f, 0.0f, 0.0f));
        RadialProgressView radialProgressView = new RadialProgressView(context, mzVar.W1);
        this.f31201c = radialProgressView;
        radialProgressView.setVisibility(8);
        radialProgressView.setProgressColor(mzVar.A(org.telegram.ui.ActionBar.k6.f21734h6));
        addView(radialProgressView, k7.c6.e(-2, -2, 17));
    }

    public final void a(boolean z4) {
        int i10;
        int i11;
        if (this.d != z4) {
            this.d = z4;
            int i12 = 0;
            if (z4) {
                i10 = 8;
            } else {
                i10 = 0;
            }
            this.f31199a.setVisibility(i10);
            if (z4) {
                i11 = 8;
            } else {
                i11 = 0;
            }
            this.f31200b.setVisibility(i11);
            if (!z4) {
                i12 = 8;
            }
            this.f31201c.setVisibility(i12);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int dp;
        mz mzVar = this.f31202e;
        int measuredHeight = mzVar.f29280e0.getMeasuredHeight();
        if (!this.d) {
            dp = (int) (org.telegram.ui.b.x(8.0f, measuredHeight - mzVar.Y0, 3) * 1.7f);
        } else {
            dp = measuredHeight - AndroidUtilities.dp(80.0f);
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(dp, 1073741824));
    }
}
