package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.HashSet;
public final class lx extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final ImageView f35898a;
    public final TextView f35899b;
    public final RadialProgressView f35900c;
    public boolean d;
    public final ey f35901e;

    public lx(ey eyVar, Context context) {
        super(context);
        this.f35901e = eyVar;
        org.telegram.ui.ActionBar.q6 q6Var = org.telegram.ui.ActionBar.r6.f28514a;
        ImageView imageView = new ImageView(getContext());
        this.f35898a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131231215);
        int i3 = org.telegram.ui.ActionBar.k6.Af;
        org.telegram.ui.ActionBar.e6 e6Var = eyVar.f33520a2;
        org.telegram.ui.ActionBar.r6.t(imageView, i3, e6Var, PorterDuff.Mode.MULTIPLY);
        addView(imageView, b8.mf.d(-2, -2.0f, 17, 0.0f, 8.0f, 0.0f, 0.0f));
        TextView textView = new TextView(getContext());
        this.f35899b = textView;
        textView.setText(org.telegram.messenger.bd.M0(2131748215, null));
        textView.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.r6.V(textView, i3, e6Var);
        addView(textView, b8.mf.d(-2, -2.0f, 17, 0.0f, 42.0f, 0.0f, 0.0f));
        RadialProgressView radialProgressView = new RadialProgressView(context, e6Var);
        this.f35900c = radialProgressView;
        radialProgressView.setVisibility(8);
        radialProgressView.setProgressColor(eyVar.z(org.telegram.ui.ActionBar.k6.f27955h6));
        addView(radialProgressView, b8.mf.e(-2, -2, 17));
    }

    public final void a(boolean z10) {
        int i3;
        int i10;
        if (this.d != z10) {
            this.d = z10;
            int i11 = 0;
            if (z10) {
                i3 = 8;
            } else {
                i3 = 0;
            }
            this.f35898a.setVisibility(i3);
            if (z10) {
                i10 = 8;
            } else {
                i10 = 0;
            }
            this.f35899b.setVisibility(i10);
            if (!z10) {
                i11 = 8;
            }
            this.f35900c.setVisibility(i11);
        }
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        int L;
        ey eyVar = this.f35901e;
        int measuredHeight = eyVar.f33545i0.getMeasuredHeight();
        if (!this.d) {
            L = (int) (org.telegram.messenger.camera.q.y(8.0f, measuredHeight - eyVar.f33527c1, 3) * 1.7f);
        } else {
            L = measuredHeight - org.telegram.messenger.g0.L(80.0f);
        }
        super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(L, 1073741824));
    }

    @Override
    public final void updateColors() {
        try {
            this.f35900c.setProgressColor(this.f35901e.z(org.telegram.ui.ActionBar.k6.f27955h6));
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
