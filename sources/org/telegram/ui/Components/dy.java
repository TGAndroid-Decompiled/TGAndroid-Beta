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
public final class dy extends FrameLayout {
    public final ImageView f27839a;
    public final TextView f27840b;
    public final RadialProgressView f27841c;
    public boolean d;
    public final wy f27842e;

    public dy(wy wyVar, Context context) {
        super(context);
        this.f27842e = wyVar;
        ImageView imageView = new ImageView(getContext());
        this.f27839a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.gif_empty);
        int i9 = org.telegram.ui.ActionBar.f6.Le;
        imageView.setColorFilter(new PorterDuffColorFilter(wyVar.z(i9), PorterDuff.Mode.MULTIPLY));
        addView(imageView, g7.e6.d(-2, -2.0f, 17, 0.0f, 8.0f, 0.0f, 0.0f));
        TextView textView = new TextView(getContext());
        this.f27840b = textView;
        textView.setText(LocaleController.getString(R.string.NoGIFsFound));
        textView.setTextSize(1, 16.0f);
        textView.setTextColor(wyVar.z(i9));
        addView(textView, g7.e6.d(-2, -2.0f, 17, 0.0f, 42.0f, 0.0f, 0.0f));
        RadialProgressView radialProgressView = new RadialProgressView(context, wyVar.V1);
        this.f27841c = radialProgressView;
        radialProgressView.setVisibility(8);
        radialProgressView.setProgressColor(wyVar.z(org.telegram.ui.ActionBar.f6.f23073h6));
        addView(radialProgressView, g7.e6.e(-2, -2, 17));
    }

    public final void a(boolean z10) {
        int i9;
        int i10;
        if (this.d != z10) {
            this.d = z10;
            int i11 = 0;
            if (z10) {
                i9 = 8;
            } else {
                i9 = 0;
            }
            this.f27839a.setVisibility(i9);
            if (z10) {
                i10 = 8;
            } else {
                i10 = 0;
            }
            this.f27840b.setVisibility(i10);
            if (!z10) {
                i11 = 8;
            }
            this.f27841c.setVisibility(i11);
        }
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        int dp;
        wy wyVar = this.f27842e;
        int measuredHeight = wyVar.f34394d0.getMeasuredHeight();
        if (!this.d) {
            dp = (int) (org.telegram.messenger.ll.y(8.0f, measuredHeight - wyVar.X0, 3) * 1.7f);
        } else {
            dp = measuredHeight - AndroidUtilities.dp(80.0f);
        }
        super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(dp, 1073741824));
    }
}
