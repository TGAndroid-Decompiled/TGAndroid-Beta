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
public final class ly extends FrameLayout {
    public final ImageView f30457a;
    public final TextView f30458b;
    public final RadialProgressView f30459c;
    public boolean d;
    public final fz f30460e;

    public ly(fz fzVar, Context context) {
        super(context);
        this.f30460e = fzVar;
        ImageView imageView = new ImageView(getContext());
        this.f30457a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.gif_empty);
        int i10 = org.telegram.ui.ActionBar.g6.Le;
        imageView.setColorFilter(new PorterDuffColorFilter(fzVar.A(i10), PorterDuff.Mode.MULTIPLY));
        addView(imageView, i7.f6.d(-2, -2.0f, 17, 0.0f, 8.0f, 0.0f, 0.0f));
        TextView textView = new TextView(getContext());
        this.f30458b = textView;
        textView.setText(LocaleController.getString(R.string.NoGIFsFound));
        textView.setTextSize(1, 16.0f);
        textView.setTextColor(fzVar.A(i10));
        addView(textView, i7.f6.d(-2, -2.0f, 17, 0.0f, 42.0f, 0.0f, 0.0f));
        RadialProgressView radialProgressView = new RadialProgressView(context, fzVar.V1);
        this.f30459c = radialProgressView;
        radialProgressView.setVisibility(8);
        radialProgressView.setProgressColor(fzVar.A(org.telegram.ui.ActionBar.g6.f23134h6));
        addView(radialProgressView, i7.f6.e(-2, -2, 17));
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
            this.f30457a.setVisibility(i10);
            if (z10) {
                i11 = 8;
            } else {
                i11 = 0;
            }
            this.f30458b.setVisibility(i11);
            if (!z10) {
                i12 = 8;
            }
            this.f30459c.setVisibility(i12);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int dp;
        fz fzVar = this.f30460e;
        int measuredHeight = fzVar.f28585d0.getMeasuredHeight();
        if (!this.d) {
            dp = (int) (org.telegram.ui.b.x(8.0f, measuredHeight - fzVar.X0, 3) * 1.7f);
        } else {
            dp = measuredHeight - AndroidUtilities.dp(80.0f);
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(dp, 1073741824));
    }
}
