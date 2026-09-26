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
    public final ImageView f28337a;
    public final TextView f28338b;
    public final RadialProgressView f28339c;
    public boolean d;
    public final lz e;

    public sy(lz lzVar, Context context) {
        super(context);
        this.e = lzVar;
        ImageView imageView = new ImageView(getContext());
        this.f28337a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.gif_empty);
        int i10 = org.telegram.ui.ActionBar.h6.Le;
        imageView.setColorFilter(new PorterDuffColorFilter(lzVar.z(i10), PorterDuff.Mode.MULTIPLY));
        addView(imageView, w7.y5.d(-2, -2.0f, 17, 0.0f, 8.0f, 0.0f, 0.0f));
        TextView textView = new TextView(getContext());
        this.f28338b = textView;
        textView.setText(LocaleController.getString(R.string.NoGIFsFound));
        textView.setTextSize(1, 16.0f);
        textView.setTextColor(lzVar.z(i10));
        addView(textView, w7.y5.d(-2, -2.0f, 17, 0.0f, 42.0f, 0.0f, 0.0f));
        RadialProgressView radialProgressView = new RadialProgressView(context, lzVar.Z1);
        this.f28339c = radialProgressView;
        radialProgressView.setVisibility(8);
        radialProgressView.setProgressColor(lzVar.z(org.telegram.ui.ActionBar.h6.f19130h6));
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
            this.f28337a.setVisibility(i10);
            if (z10) {
                i11 = 8;
            } else {
                i11 = 0;
            }
            this.f28338b.setVisibility(i11);
            if (!z10) {
                i12 = 8;
            }
            this.f28339c.setVisibility(i12);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int dp;
        lz lzVar = this.e;
        int measuredHeight = lzVar.f26251h0.getMeasuredHeight();
        if (!this.d) {
            dp = (int) (org.telegram.messenger.ok.A(8.0f, measuredHeight - lzVar.f26232b1, 3) * 1.7f);
        } else {
            dp = measuredHeight - AndroidUtilities.dp(80.0f);
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(dp, 1073741824));
    }
}
