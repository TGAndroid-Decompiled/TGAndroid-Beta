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
public final class uy extends FrameLayout {
    public final ImageView f28942a;
    public final TextView f28943b;
    public final RadialProgressView f28944c;
    public boolean d;
    public final nz e;

    public uy(nz nzVar, Context context) {
        super(context);
        this.e = nzVar;
        ImageView imageView = new ImageView(getContext());
        this.f28942a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.gif_empty);
        int i10 = org.telegram.ui.ActionBar.h6.Le;
        imageView.setColorFilter(new PorterDuffColorFilter(nzVar.z(i10), PorterDuff.Mode.MULTIPLY));
        addView(imageView, w7.y5.d(-2, -2.0f, 17, 0.0f, 8.0f, 0.0f, 0.0f));
        TextView textView = new TextView(getContext());
        this.f28943b = textView;
        textView.setText(LocaleController.getString(R.string.NoGIFsFound));
        textView.setTextSize(1, 16.0f);
        textView.setTextColor(nzVar.z(i10));
        addView(textView, w7.y5.d(-2, -2.0f, 17, 0.0f, 42.0f, 0.0f, 0.0f));
        RadialProgressView radialProgressView = new RadialProgressView(context, nzVar.Z1);
        this.f28944c = radialProgressView;
        radialProgressView.setVisibility(8);
        radialProgressView.setProgressColor(nzVar.z(org.telegram.ui.ActionBar.h6.f19147h6));
        addView(radialProgressView, w7.y5.e(-2, -2, 17));
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
            this.f28942a.setVisibility(i10);
            if (z10) {
                i11 = 8;
            } else {
                i11 = 0;
            }
            this.f28943b.setVisibility(i11);
            if (!z10) {
                i12 = 8;
            }
            this.f28944c.setVisibility(i12);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int dp;
        nz nzVar = this.e;
        int measuredHeight = nzVar.f26833h0.getMeasuredHeight();
        if (!this.d) {
            dp = (int) (org.telegram.messenger.ok.A(8.0f, measuredHeight - nzVar.f26814b1, 3) * 1.7f);
        } else {
            dp = measuredHeight - AndroidUtilities.dp(80.0f);
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(dp, 1073741824));
    }
}
