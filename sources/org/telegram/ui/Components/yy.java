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
public final class yy extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final ImageView f33083a;
    public final TextView f33084b;
    public final RadialProgressView f33085c;
    public boolean d;
    public final rz e;

    public yy(rz rzVar, Context context) {
        super(context);
        this.e = rzVar;
        org.telegram.ui.ActionBar.q6 q6Var = org.telegram.ui.ActionBar.r6.f21817a;
        ImageView imageView = new ImageView(getContext());
        this.f33083a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.gif_empty);
        int i10 = org.telegram.ui.ActionBar.k6.Le;
        org.telegram.ui.ActionBar.g6 g6Var = rzVar.Z1;
        org.telegram.ui.ActionBar.r6.t(imageView, i10, g6Var, PorterDuff.Mode.MULTIPLY);
        addView(imageView, w7.z5.d(-2, -2.0f, 17, 0.0f, 8.0f, 0.0f, 0.0f));
        TextView textView = new TextView(getContext());
        this.f33084b = textView;
        org.telegram.messenger.tl.n(R.string.NoGIFsFound, textView, 1, 16.0f);
        org.telegram.ui.ActionBar.r6.W(textView, i10, g6Var);
        addView(textView, w7.z5.d(-2, -2.0f, 17, 0.0f, 42.0f, 0.0f, 0.0f));
        RadialProgressView radialProgressView = new RadialProgressView(context, g6Var);
        this.f33085c = radialProgressView;
        radialProgressView.setVisibility(8);
        radialProgressView.setProgressColor(rzVar.A(org.telegram.ui.ActionBar.k6.f21256h6));
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
            this.f33083a.setVisibility(i10);
            if (z10) {
                i11 = 8;
            } else {
                i11 = 0;
            }
            this.f33084b.setVisibility(i11);
            if (!z10) {
                i12 = 8;
            }
            this.f33085c.setVisibility(i12);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int dp;
        rz rzVar = this.e;
        int measuredHeight = rzVar.f30325h0.getMeasuredHeight();
        if (!this.d) {
            dp = (int) (org.telegram.messenger.tl.A(8.0f, measuredHeight - rzVar.f30306b1, 3) * 1.7f);
        } else {
            dp = measuredHeight - AndroidUtilities.dp(80.0f);
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(dp, 1073741824));
    }

    @Override
    public final void updateColors() {
        try {
            this.f33085c.setProgressColor(this.e.A(org.telegram.ui.ActionBar.k6.f21256h6));
            invalidate();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
