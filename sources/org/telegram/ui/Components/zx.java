package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.HashSet;
public final class zx extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final ImageView f43000a;
    public final TextView f43001b;
    public final RadialProgressView f43002c;
    public boolean d;
    public final ty f43003e;

    public zx(ty tyVar, Context context) {
        super(context);
        this.f43003e = tyVar;
        org.telegram.ui.ActionBar.s6 s6Var = org.telegram.ui.ActionBar.t6.f30065a;
        ImageView imageView = new ImageView(getContext());
        this.f43000a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131231215);
        int i7 = org.telegram.ui.ActionBar.m6.Df;
        org.telegram.ui.ActionBar.h6 h6Var = tyVar.f40089a2;
        org.telegram.ui.ActionBar.t6.s(imageView, i7, h6Var, PorterDuff.Mode.MULTIPLY);
        addView(imageView, c8.ma.d(-2, -2.0f, 17, 0.0f, 8.0f, 0.0f, 0.0f));
        TextView textView = new TextView(getContext());
        this.f43001b = textView;
        org.telegram.messenger.n10.l(16.0f, 2131748014, 1, textView, null);
        org.telegram.ui.ActionBar.t6.U(textView, i7, h6Var);
        addView(textView, c8.ma.d(-2, -2.0f, 17, 0.0f, 42.0f, 0.0f, 0.0f));
        RadialProgressView radialProgressView = new RadialProgressView(context, h6Var);
        this.f43002c = radialProgressView;
        radialProgressView.setVisibility(8);
        radialProgressView.setProgressColor(tyVar.z(org.telegram.ui.ActionBar.m6.f29452h6));
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
            this.f43000a.setVisibility(i7);
            if (z10) {
                i10 = 8;
            } else {
                i10 = 0;
            }
            this.f43001b.setVisibility(i10);
            if (!z10) {
                i11 = 8;
            }
            this.f43002c.setVisibility(i11);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int L;
        ty tyVar = this.f43003e;
        int measuredHeight = tyVar.f40114i0.getMeasuredHeight();
        if (!this.d) {
            L = (int) (org.telegram.messenger.n10.z(8.0f, measuredHeight - tyVar.f40096c1, 3) * 1.7f);
        } else {
            L = measuredHeight - org.telegram.messenger.g0.L(80.0f);
        }
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(L, 1073741824));
    }

    @Override
    public final void updateColors() {
        try {
            this.f43002c.setProgressColor(this.f43003e.z(org.telegram.ui.ActionBar.m6.f29452h6));
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
