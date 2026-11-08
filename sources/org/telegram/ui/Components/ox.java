package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.HashSet;
public final class ox extends FrameLayout implements org.telegram.ui.ActionBar.a6 {
    public final ImageView f36722a;
    public final TextView f36723b;
    public final RadialProgressView f36724c;
    public boolean d;
    public final hy f36725e;

    public ox(hy hyVar, Context context) {
        super(context);
        this.f36725e = hyVar;
        org.telegram.ui.ActionBar.q6 q6Var = org.telegram.ui.ActionBar.r6.f28478a;
        ImageView imageView = new ImageView(getContext());
        this.f36722a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131231215);
        int i7 = org.telegram.ui.ActionBar.k6.Af;
        org.telegram.ui.ActionBar.f6 f6Var = hyVar.Z1;
        org.telegram.ui.ActionBar.r6.t(imageView, i7, f6Var, PorterDuff.Mode.MULTIPLY);
        addView(imageView, c8.ha.d(-2, -2.0f, 17, 0.0f, 8.0f, 0.0f, 0.0f));
        TextView textView = new TextView(getContext());
        this.f36723b = textView;
        textView.setText(org.telegram.messenger.id.M0(2131748208, null));
        textView.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.r6.V(textView, i7, f6Var);
        addView(textView, c8.ha.d(-2, -2.0f, 17, 0.0f, 42.0f, 0.0f, 0.0f));
        RadialProgressView radialProgressView = new RadialProgressView(context, f6Var);
        this.f36724c = radialProgressView;
        radialProgressView.setVisibility(8);
        radialProgressView.setProgressColor(hyVar.z(org.telegram.ui.ActionBar.k6.f27926h6));
        addView(radialProgressView, c8.ha.e(-2, -2, 17));
    }

    public final void a(boolean z9) {
        int i7;
        int i10;
        if (this.d != z9) {
            this.d = z9;
            int i11 = 0;
            if (z9) {
                i7 = 8;
            } else {
                i7 = 0;
            }
            this.f36722a.setVisibility(i7);
            if (z9) {
                i10 = 8;
            } else {
                i10 = 0;
            }
            this.f36723b.setVisibility(i10);
            if (!z9) {
                i11 = 8;
            }
            this.f36724c.setVisibility(i11);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int L;
        hy hyVar = this.f36725e;
        int measuredHeight = hyVar.f34415h0.getMeasuredHeight();
        if (!this.d) {
            L = (int) (org.telegram.messenger.camera.q.y(8.0f, measuredHeight - hyVar.f34396b1, 3) * 1.7f);
        } else {
            L = measuredHeight - org.telegram.messenger.g0.L(80.0f);
        }
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(L, 1073741824));
    }

    @Override
    public final void updateColors() {
        try {
            this.f36724c.setProgressColor(this.f36725e.z(org.telegram.ui.ActionBar.k6.f27926h6));
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
