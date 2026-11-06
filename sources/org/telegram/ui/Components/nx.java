package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.HashSet;
public final class nx extends FrameLayout implements org.telegram.ui.ActionBar.a6 {
    public final ImageView f36442a;
    public final TextView f36443b;
    public final RadialProgressView f36444c;
    public boolean d;
    public final gy f36445e;

    public nx(gy gyVar, Context context) {
        super(context);
        this.f36445e = gyVar;
        org.telegram.ui.ActionBar.q6 q6Var = org.telegram.ui.ActionBar.r6.f28475a;
        ImageView imageView = new ImageView(getContext());
        this.f36442a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131231215);
        int i7 = org.telegram.ui.ActionBar.k6.Af;
        org.telegram.ui.ActionBar.f6 f6Var = gyVar.Z1;
        org.telegram.ui.ActionBar.r6.t(imageView, i7, f6Var, PorterDuff.Mode.MULTIPLY);
        addView(imageView, c8.ha.d(-2, -2.0f, 17, 0.0f, 8.0f, 0.0f, 0.0f));
        TextView textView = new TextView(getContext());
        this.f36443b = textView;
        textView.setText(org.telegram.messenger.hd.M0(2131748206, null));
        textView.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.r6.V(textView, i7, f6Var);
        addView(textView, c8.ha.d(-2, -2.0f, 17, 0.0f, 42.0f, 0.0f, 0.0f));
        RadialProgressView radialProgressView = new RadialProgressView(context, f6Var);
        this.f36444c = radialProgressView;
        radialProgressView.setVisibility(8);
        radialProgressView.setProgressColor(gyVar.z(org.telegram.ui.ActionBar.k6.f27923h6));
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
            this.f36442a.setVisibility(i7);
            if (z9) {
                i10 = 8;
            } else {
                i10 = 0;
            }
            this.f36443b.setVisibility(i10);
            if (!z9) {
                i11 = 8;
            }
            this.f36444c.setVisibility(i11);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int L;
        gy gyVar = this.f36445e;
        int measuredHeight = gyVar.f34047h0.getMeasuredHeight();
        if (!this.d) {
            L = (int) (org.telegram.messenger.camera.q.y(8.0f, measuredHeight - gyVar.f34028b1, 3) * 1.7f);
        } else {
            L = measuredHeight - org.telegram.messenger.g0.L(80.0f);
        }
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(L, 1073741824));
    }

    @Override
    public final void updateColors() {
        try {
            this.f36444c.setProgressColor(this.f36445e.z(org.telegram.ui.ActionBar.k6.f27923h6));
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
