package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.HashSet;
public final class nx extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public final ImageView f36412a;
    public final TextView f36413b;
    public final RadialProgressView f36414c;
    public boolean d;
    public final gy f36415e;

    public nx(gy gyVar, Context context) {
        super(context);
        this.f36415e = gyVar;
        org.telegram.ui.ActionBar.s6 s6Var = org.telegram.ui.ActionBar.t6.f28530a;
        ImageView imageView = new ImageView(getContext());
        this.f36412a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131231215);
        int i7 = org.telegram.ui.ActionBar.m6.Af;
        org.telegram.ui.ActionBar.h6 h6Var = gyVar.Z1;
        org.telegram.ui.ActionBar.t6.s(imageView, i7, h6Var, PorterDuff.Mode.MULTIPLY);
        addView(imageView, c8.ha.d(-2, -2.0f, 17, 0.0f, 8.0f, 0.0f, 0.0f));
        TextView textView = new TextView(getContext());
        this.f36413b = textView;
        textView.setText(org.telegram.messenger.id.M0(2131748207, null));
        textView.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.t6.U(textView, i7, h6Var);
        addView(textView, c8.ha.d(-2, -2.0f, 17, 0.0f, 42.0f, 0.0f, 0.0f));
        RadialProgressView radialProgressView = new RadialProgressView(context, h6Var);
        this.f36414c = radialProgressView;
        radialProgressView.setVisibility(8);
        radialProgressView.setProgressColor(gyVar.z(org.telegram.ui.ActionBar.m6.f27964h6));
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
            this.f36412a.setVisibility(i7);
            if (z9) {
                i10 = 8;
            } else {
                i10 = 0;
            }
            this.f36413b.setVisibility(i10);
            if (!z9) {
                i11 = 8;
            }
            this.f36414c.setVisibility(i11);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int L;
        gy gyVar = this.f36415e;
        int measuredHeight = gyVar.f34031h0.getMeasuredHeight();
        if (!this.d) {
            L = (int) (org.telegram.messenger.camera.q.y(8.0f, measuredHeight - gyVar.f34012b1, 3) * 1.7f);
        } else {
            L = measuredHeight - org.telegram.messenger.g0.L(80.0f);
        }
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(L, 1073741824));
    }

    @Override
    public final void updateColors() {
        try {
            this.f36414c.setProgressColor(this.f36415e.z(org.telegram.ui.ActionBar.m6.f27964h6));
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
