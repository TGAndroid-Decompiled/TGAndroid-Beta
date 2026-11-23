package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.HashSet;
public final class wx extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public final ImageView f41749a;
    public final TextView f41750b;
    public final RadialProgressView f41751c;
    public boolean d;
    public final qy f41752e;

    public wx(qy qyVar, Context context) {
        super(context);
        this.f41752e = qyVar;
        org.telegram.ui.ActionBar.t6 t6Var = org.telegram.ui.ActionBar.u6.f30163a;
        ImageView imageView = new ImageView(getContext());
        this.f41749a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131231218);
        int i7 = org.telegram.ui.ActionBar.n6.Df;
        org.telegram.ui.ActionBar.i6 i6Var = qyVar.f39037a2;
        org.telegram.ui.ActionBar.u6.s(imageView, i7, i6Var, PorterDuff.Mode.MULTIPLY);
        addView(imageView, c8.na.d(-2, -2.0f, 17, 0.0f, 8.0f, 0.0f, 0.0f));
        TextView textView = new TextView(getContext());
        this.f41750b = textView;
        org.telegram.messenger.m10.l(16.0f, 2131748014, 1, textView, null);
        org.telegram.ui.ActionBar.u6.U(textView, i7, i6Var);
        addView(textView, c8.na.d(-2, -2.0f, 17, 0.0f, 42.0f, 0.0f, 0.0f));
        RadialProgressView radialProgressView = new RadialProgressView(context, i6Var);
        this.f41751c = radialProgressView;
        radialProgressView.setVisibility(8);
        radialProgressView.setProgressColor(qyVar.z(org.telegram.ui.ActionBar.n6.f29525h6));
        addView(radialProgressView, c8.na.e(-2, -2, 17));
    }

    public final void a(boolean z10) {
        int i7;
        int i10;
        if (this.d != z10) {
            this.d = z10;
            int i11 = 0;
            if (z10) {
                i7 = 8;
            } else {
                i7 = 0;
            }
            this.f41749a.setVisibility(i7);
            if (z10) {
                i10 = 8;
            } else {
                i10 = 0;
            }
            this.f41750b.setVisibility(i10);
            if (!z10) {
                i11 = 8;
            }
            this.f41751c.setVisibility(i11);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int L;
        qy qyVar = this.f41752e;
        int measuredHeight = qyVar.f39062i0.getMeasuredHeight();
        if (!this.d) {
            L = (int) (org.telegram.messenger.m10.z(8.0f, measuredHeight - qyVar.f39044c1, 3) * 1.7f);
        } else {
            L = measuredHeight - org.telegram.messenger.g0.L(80.0f);
        }
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(L, 1073741824));
    }

    @Override
    public final void updateColors() {
        try {
            this.f41751c.setProgressColor(this.f41752e.z(org.telegram.ui.ActionBar.n6.f29525h6));
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
