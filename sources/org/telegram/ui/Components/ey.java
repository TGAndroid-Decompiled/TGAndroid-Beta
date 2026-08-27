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

public final class ey extends FrameLayout {

    public final ImageView f28195a;

    public final TextView f28196b;

    public final RadialProgressView f28197c;
    public boolean d;

    public final yy f28198e;

    public ey(yy yyVar, Context context) {
        super(context);
        this.f28198e = yyVar;
        ImageView imageView = new ImageView(getContext());
        this.f28195a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.gif_empty);
        int i10 = org.telegram.ui.ActionBar.g6.Le;
        imageView.setColorFilter(new PorterDuffColorFilter(yyVar.B(i10), PorterDuff.Mode.MULTIPLY));
        addView(imageView, h7.z5.d(-2, -2.0f, 17, 0.0f, 8.0f, 0.0f, 0.0f));
        TextView textView = new TextView(getContext());
        this.f28196b = textView;
        textView.setText(LocaleController.getString(R.string.NoGIFsFound));
        textView.setTextSize(1, 16.0f);
        textView.setTextColor(yyVar.B(i10));
        addView(textView, h7.z5.d(-2, -2.0f, 17, 0.0f, 42.0f, 0.0f, 0.0f));
        RadialProgressView radialProgressView = new RadialProgressView(context, yyVar.V1);
        this.f28197c = radialProgressView;
        radialProgressView.setVisibility(8);
        radialProgressView.setProgressColor(yyVar.B(org.telegram.ui.ActionBar.g6.f23125h6));
        addView(radialProgressView, h7.z5.e(-2, -2, 17));
    }

    public final void a(boolean z10) {
        if (this.d != z10) {
            this.d = z10;
            this.f28195a.setVisibility(z10 ? 8 : 0);
            this.f28196b.setVisibility(z10 ? 8 : 0);
            this.f28197c.setVisibility(z10 ? 0 : 8);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        yy yyVar = this.f28198e;
        int measuredHeight = yyVar.f34987d0.getMeasuredHeight();
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(!this.d ? (int) (org.telegram.messenger.rl.x(8.0f, measuredHeight - yyVar.X0, 3) * 1.7f) : measuredHeight - AndroidUtilities.dp(80.0f), 1073741824));
    }
}
