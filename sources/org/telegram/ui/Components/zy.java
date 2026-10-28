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
public final class zy extends FrameLayout implements org.telegram.ui.ActionBar.p6 {
    public final ImageView f35464a;
    public final TextView f35465b;
    public final RadialProgressView f35466c;
    public boolean d;
    public final sz e;

    public zy(sz szVar, Context context) {
        super(context);
        this.e = szVar;
        org.telegram.ui.ActionBar.e7 e7Var = org.telegram.ui.ActionBar.f7.f22628a;
        ImageView imageView = new ImageView(getContext());
        this.f35464a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.gif_empty);
        int i10 = org.telegram.ui.ActionBar.y6.Le;
        org.telegram.ui.ActionBar.u6 u6Var = szVar.Z1;
        org.telegram.ui.ActionBar.f7.t(imageView, i10, u6Var, PorterDuff.Mode.MULTIPLY);
        addView(imageView, kb1.h(-2, -2.0f, 17, 0.0f, 8.0f, 0.0f, 0.0f));
        TextView textView = new TextView(getContext());
        this.f35465b = textView;
        org.telegram.ui.d3.o(R.string.NoGIFsFound, textView, 1, 16.0f);
        org.telegram.ui.ActionBar.f7.V(textView, i10, u6Var);
        addView(textView, kb1.h(-2, -2.0f, 17, 0.0f, 42.0f, 0.0f, 0.0f));
        RadialProgressView radialProgressView = new RadialProgressView(context, u6Var);
        this.f35466c = radialProgressView;
        radialProgressView.setVisibility(8);
        radialProgressView.setProgressColor(szVar.A(org.telegram.ui.ActionBar.y6.f23429h6));
        addView(radialProgressView, kb1.i(-2, -2, 17));
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
            this.f35464a.setVisibility(i10);
            if (z10) {
                i11 = 8;
            } else {
                i11 = 0;
            }
            this.f35465b.setVisibility(i11);
            if (!z10) {
                i12 = 8;
            }
            this.f35466c.setVisibility(i12);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int dp;
        sz szVar = this.e;
        int measuredHeight = szVar.f32728h0.getMeasuredHeight();
        if (!this.d) {
            dp = (int) (org.telegram.messenger.wh.B(8.0f, measuredHeight - szVar.f32709b1, 3) * 1.7f);
        } else {
            dp = measuredHeight - AndroidUtilities.dp(80.0f);
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(dp, 1073741824));
    }

    @Override
    public final void updateColors() {
        try {
            this.f35466c.setProgressColor(this.e.A(org.telegram.ui.ActionBar.y6.f23429h6));
            invalidate();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
