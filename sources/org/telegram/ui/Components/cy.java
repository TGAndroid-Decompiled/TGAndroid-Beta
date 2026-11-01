package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.HashSet;
public final class cy extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public final ImageView f25293a;
    public final TextView f25294b;
    public final RadialProgressView f25295c;
    public boolean d;
    public final vy e;

    public cy(vy vyVar, Context context) {
        super(context);
        this.e = vyVar;
        org.telegram.ui.ActionBar.z6 z6Var = org.telegram.ui.ActionBar.a7.f20158a;
        ImageView imageView = new ImageView(getContext());
        this.f25293a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131231216);
        int i10 = org.telegram.ui.ActionBar.t6.Af;
        org.telegram.ui.ActionBar.p6 p6Var = vyVar.Z1;
        org.telegram.ui.ActionBar.a7.t(imageView, i10, p6Var, PorterDuff.Mode.MULTIPLY);
        addView(imageView, w7.b6.d(-2, -2.0f, 17, 0.0f, 8.0f, 0.0f, 0.0f));
        TextView textView = new TextView(getContext());
        this.f25294b = textView;
        textView.setText(org.telegram.messenger.dd.L0(2131748224, null));
        textView.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.a7.V(textView, i10, p6Var);
        addView(textView, w7.b6.d(-2, -2.0f, 17, 0.0f, 42.0f, 0.0f, 0.0f));
        RadialProgressView radialProgressView = new RadialProgressView(context, p6Var);
        this.f25295c = radialProgressView;
        radialProgressView.setVisibility(8);
        radialProgressView.setProgressColor(vyVar.A(org.telegram.ui.ActionBar.t6.f21003h6));
        addView(radialProgressView, w7.b6.e(-2, -2, 17));
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
            this.f25293a.setVisibility(i10);
            if (z10) {
                i11 = 8;
            } else {
                i11 = 0;
            }
            this.f25294b.setVisibility(i11);
            if (!z10) {
                i12 = 8;
            }
            this.f25295c.setVisibility(i12);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int L;
        vy vyVar = this.e;
        int measuredHeight = vyVar.f31958h0.getMeasuredHeight();
        if (!this.d) {
            L = (int) (org.telegram.messenger.a30.y(8.0f, measuredHeight - vyVar.f31939b1, 3) * 1.7f);
        } else {
            L = measuredHeight - org.telegram.messenger.i0.L(80.0f);
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(L, 1073741824));
    }

    @Override
    public final void updateColors() {
        try {
            this.f25295c.setProgressColor(this.e.A(org.telegram.ui.ActionBar.t6.f21003h6));
            invalidate();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
