package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
public final class b3 extends FrameLayout {
    public final LinearLayout f45562a;
    public boolean f45563b;
    public final org.telegram.ui.Components.i9 f45564c;
    public final TextView d;
    public final TextView f45565e;
    public final TextView f45566f;
    public final hi.d h;
    public ValueAnimator f45567n;
    public boolean f45568r;

    public b3(Context context) {
        super(context);
        this.f45568r = true;
        setVisibility(8);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f45562a = linearLayout;
        linearLayout.setPadding(org.telegram.messenger.g0.L(32.0f), org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(32.0f), org.telegram.messenger.g0.L(24.0f));
        linearLayout.setOrientation(1);
        linearLayout.setGravity(3);
        addView(linearLayout, c8.ja.e(-2, -2, 17));
        org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9(context);
        this.f45564c = i9Var;
        linearLayout.addView(i9Var, c8.ja.o(100, 100));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 19.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setTextColor(-1);
        TextView f10 = org.telegram.messenger.i20.f(linearLayout, textView, c8.ja.t(-2, -2, 3, 0, 4, 0, 2), context);
        this.f45565e = f10;
        f10.setTextSize(1, 15.0f);
        f10.setTextColor(-1);
        f10.setSingleLine(false);
        f10.setMaxLines(3);
        TextView f11 = org.telegram.messenger.i20.f(linearLayout, f10, c8.ja.t(-2, -2, 3, 0, 0, 0, 1), context);
        this.f45566f = f11;
        f11.setTextSize(1, 12.0f);
        f11.setTextColor(-1);
        f11.setAlpha(0.4f);
        linearLayout.addView(f11, c8.ja.r(-2, -2, 3));
        hi.d dVar = new hi.d(context, null, true);
        this.h = dVar;
        dVar.setMinWidth(org.telegram.messenger.g0.L(140.0f));
        dVar.i(org.telegram.messenger.hd.M0(2131746340, null), false, true);
        linearLayout.addView(dVar, c8.ja.t(-2, 40, 3, 0, 12, 0, 0));
    }

    public final void a(String str, String str2) {
        this.d.setText(org.telegram.messenger.hd.M0(2131742922, null));
        org.telegram.messenger.k5.q(null, null, 2131742924, new Object[]{str}, this.f45565e);
        this.f45566f.setText(str2);
    }

    public final void b(boolean z10, boolean z11) {
        int i7;
        int i10;
        float f10;
        if (this.f45568r == z10) {
            return;
        }
        this.f45568r = z10;
        ValueAnimator valueAnimator = this.f45567n;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (z11) {
            float f11 = 1.0f;
            if (z10) {
                f10 = 0.0f;
            } else {
                f10 = 1.0f;
            }
            if (!z10) {
                f11 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f11);
            this.f45567n = ofFloat;
            ofFloat.addUpdateListener(new a3(this, 0));
            this.f45567n.start();
            return;
        }
        int i11 = -1;
        if (!z10) {
            i7 = -16777216;
        } else {
            i7 = -1;
        }
        this.d.setTextColor(i7);
        if (!z10) {
            i10 = -16777216;
        } else {
            i10 = -1;
        }
        this.f45565e.setTextColor(i10);
        if (!z10) {
            i11 = -16777216;
        }
        this.f45566f.setTextColor(i11);
    }

    @Override
    public void setVisibility(int i7) {
        super.setVisibility(i7);
        if (i7 == 0 && !this.f45563b) {
            this.f45563b = true;
            org.telegram.messenger.si.b0(org.telegram.messenger.m10.f24940t0).c2(this.f45564c, "tg_placeholders_android", "🧐", "100_100");
        }
    }
}
