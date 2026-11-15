package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.HashSet;
public final class sx extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final ImageView f39443a;
    public final TextView f39444b;
    public final RadialProgressView f39445c;
    public boolean d;
    public final ly f39446e;

    public sx(ly lyVar, Context context) {
        super(context);
        this.f39446e = lyVar;
        org.telegram.ui.ActionBar.p6 p6Var = org.telegram.ui.ActionBar.q6.f29534a;
        ImageView imageView = new ImageView(getContext());
        this.f39443a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131231215);
        int i7 = org.telegram.ui.ActionBar.j6.Df;
        org.telegram.ui.ActionBar.e6 e6Var = lyVar.f36931a2;
        org.telegram.ui.ActionBar.q6.s(imageView, i7, e6Var, PorterDuff.Mode.MULTIPLY);
        addView(imageView, c8.ja.d(-2, -2.0f, 17, 0.0f, 8.0f, 0.0f, 0.0f));
        TextView textView = new TextView(getContext());
        this.f39444b = textView;
        textView.setText(org.telegram.messenger.hd.M0(2131748207, null));
        textView.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.q6.U(textView, i7, e6Var);
        addView(textView, c8.ja.d(-2, -2.0f, 17, 0.0f, 42.0f, 0.0f, 0.0f));
        RadialProgressView radialProgressView = new RadialProgressView(context, e6Var);
        this.f39445c = radialProgressView;
        radialProgressView.setVisibility(8);
        radialProgressView.setProgressColor(lyVar.z(org.telegram.ui.ActionBar.j6.f28923h6));
        addView(radialProgressView, c8.ja.e(-2, -2, 17));
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
            this.f39443a.setVisibility(i7);
            if (z10) {
                i10 = 8;
            } else {
                i10 = 0;
            }
            this.f39444b.setVisibility(i10);
            if (!z10) {
                i11 = 8;
            }
            this.f39445c.setVisibility(i11);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int L;
        ly lyVar = this.f39446e;
        int measuredHeight = lyVar.f36956i0.getMeasuredHeight();
        if (!this.d) {
            L = (int) (org.telegram.messenger.i20.y(8.0f, measuredHeight - lyVar.f36938c1, 3) * 1.7f);
        } else {
            L = measuredHeight - org.telegram.messenger.g0.L(80.0f);
        }
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(L, 1073741824));
    }

    @Override
    public final void updateColors() {
        try {
            this.f39445c.setProgressColor(this.f39446e.z(org.telegram.ui.ActionBar.j6.f28923h6));
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
