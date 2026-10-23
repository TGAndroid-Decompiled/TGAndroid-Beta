package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;
public final class az extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final ImageView f24877a;
    public final TextView f24878b;
    public final RadialProgressView f24879c;
    public boolean d;
    public final tz e;

    public az(tz tzVar, Context context) {
        super(context);
        this.e = tzVar;
        org.telegram.ui.ActionBar.q6 q6Var = org.telegram.ui.ActionBar.r6.f21816a;
        ImageView imageView = new ImageView(getContext());
        this.f24877a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.gif_empty);
        int i10 = org.telegram.ui.ActionBar.k6.Le;
        org.telegram.ui.ActionBar.g6 g6Var = tzVar.Z1;
        org.telegram.ui.ActionBar.r6.t(imageView, i10, g6Var, PorterDuff.Mode.MULTIPLY);
        addView(imageView, w7.z5.d(-2, -2.0f, 17, 0.0f, 8.0f, 0.0f, 0.0f));
        TextView textView = new TextView(getContext());
        this.f24878b = textView;
        org.telegram.messenger.sl.n(R.string.NoGIFsFound, textView, 1, 16.0f);
        org.telegram.ui.ActionBar.r6.W(textView, i10, g6Var);
        addView(textView, w7.z5.d(-2, -2.0f, 17, 0.0f, 42.0f, 0.0f, 0.0f));
        RadialProgressView radialProgressView = new RadialProgressView(context, g6Var);
        this.f24879c = radialProgressView;
        radialProgressView.setVisibility(8);
        radialProgressView.setProgressColor(tzVar.A(org.telegram.ui.ActionBar.k6.f21255h6));
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
            this.f24877a.setVisibility(i10);
            if (z10) {
                i11 = 8;
            } else {
                i11 = 0;
            }
            this.f24878b.setVisibility(i11);
            if (!z10) {
                i12 = 8;
            }
            this.f24879c.setVisibility(i12);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int dp;
        tz tzVar = this.e;
        int measuredHeight = tzVar.f30981h0.getMeasuredHeight();
        if (!this.d) {
            dp = (int) (org.telegram.messenger.sl.A(8.0f, measuredHeight - tzVar.f30962b1, 3) * 1.7f);
        } else {
            dp = measuredHeight - AndroidUtilities.dp(80.0f);
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(dp, 1073741824));
    }

    @Override
    public final void updateColors() {
        try {
            this.f24879c.setProgressColor(this.e.A(org.telegram.ui.ActionBar.k6.f21255h6));
            invalidate();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
