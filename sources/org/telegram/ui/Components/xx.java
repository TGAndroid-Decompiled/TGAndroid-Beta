package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.HashSet;
public final class xx extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public final ImageView f42205a;
    public final TextView f42206b;
    public final RadialProgressView f42207c;
    public boolean d;
    public final ry f42208e;

    public xx(ry ryVar, Context context) {
        super(context);
        this.f42208e = ryVar;
        org.telegram.ui.ActionBar.t6 t6Var = org.telegram.ui.ActionBar.u6.f30084a;
        ImageView imageView = new ImageView(getContext());
        this.f42205a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131231215);
        int i7 = org.telegram.ui.ActionBar.n6.Df;
        org.telegram.ui.ActionBar.i6 i6Var = ryVar.f39335a2;
        org.telegram.ui.ActionBar.u6.s(imageView, i7, i6Var, PorterDuff.Mode.MULTIPLY);
        addView(imageView, c8.ma.d(-2, -2.0f, 17, 0.0f, 8.0f, 0.0f, 0.0f));
        TextView textView = new TextView(getContext());
        this.f42206b = textView;
        org.telegram.messenger.n10.l(16.0f, 2131748015, 1, textView, null);
        org.telegram.ui.ActionBar.u6.U(textView, i7, i6Var);
        addView(textView, c8.ma.d(-2, -2.0f, 17, 0.0f, 42.0f, 0.0f, 0.0f));
        RadialProgressView radialProgressView = new RadialProgressView(context, i6Var);
        this.f42207c = radialProgressView;
        radialProgressView.setVisibility(8);
        radialProgressView.setProgressColor(ryVar.z(org.telegram.ui.ActionBar.n6.f29470h6));
        addView(radialProgressView, c8.ma.e(-2, -2, 17));
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
            this.f42205a.setVisibility(i7);
            if (z10) {
                i10 = 8;
            } else {
                i10 = 0;
            }
            this.f42206b.setVisibility(i10);
            if (!z10) {
                i11 = 8;
            }
            this.f42207c.setVisibility(i11);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int L;
        ry ryVar = this.f42208e;
        int measuredHeight = ryVar.f39360i0.getMeasuredHeight();
        if (!this.d) {
            L = (int) (org.telegram.messenger.n10.z(8.0f, measuredHeight - ryVar.f39342c1, 3) * 1.7f);
        } else {
            L = measuredHeight - org.telegram.messenger.g0.L(80.0f);
        }
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(L, 1073741824));
    }

    @Override
    public final void updateColors() {
        try {
            this.f42207c.setProgressColor(this.f42208e.z(org.telegram.ui.ActionBar.n6.f29470h6));
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
