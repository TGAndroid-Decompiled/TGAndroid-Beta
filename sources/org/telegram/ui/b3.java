package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
public final class b3 extends FrameLayout {
    public final LinearLayout f44146a;
    public boolean f44147b;
    public final org.telegram.ui.Components.l9 f44148c;
    public final TextView d;
    public final TextView f44149e;
    public final TextView f44150f;
    public final fi.d h;
    public ValueAnimator f44151n;
    public boolean f44152r;

    public b3(Context context) {
        super(context);
        this.f44152r = true;
        setVisibility(8);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f44146a = linearLayout;
        linearLayout.setPadding(org.telegram.messenger.g0.L(32.0f), org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(32.0f), org.telegram.messenger.g0.L(24.0f));
        linearLayout.setOrientation(1);
        linearLayout.setGravity(3);
        addView(linearLayout, c8.ha.e(-2, -2, 17));
        org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(context);
        this.f44148c = l9Var;
        linearLayout.addView(l9Var, c8.ha.o(100, 100));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 19.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setTextColor(-1);
        TextView f10 = org.telegram.messenger.camera.q.f(linearLayout, textView, c8.ha.t(-2, -2, 3, 0, 4, 0, 2), context);
        this.f44149e = f10;
        f10.setTextSize(1, 15.0f);
        f10.setTextColor(-1);
        f10.setSingleLine(false);
        f10.setMaxLines(3);
        TextView f11 = org.telegram.messenger.camera.q.f(linearLayout, f10, c8.ha.t(-2, -2, 3, 0, 0, 0, 1), context);
        this.f44150f = f11;
        f11.setTextSize(1, 12.0f);
        f11.setTextColor(-1);
        f11.setAlpha(0.4f);
        linearLayout.addView(f11, c8.ha.r(-2, -2, 3));
        fi.d dVar = new fi.d(context, null, true);
        this.h = dVar;
        dVar.setMinWidth(org.telegram.messenger.g0.L(140.0f));
        dVar.i(org.telegram.messenger.hd.M0(2131746339, null), false, true);
        linearLayout.addView(dVar, c8.ha.t(-2, 40, 3, 0, 12, 0, 0));
    }

    public final void a(String str, String str2) {
        this.d.setText(org.telegram.messenger.hd.M0(2131742923, null));
        org.telegram.messenger.k5.r(null, null, 2131742925, new Object[]{str}, this.f44149e);
        this.f44150f.setText(str2);
    }

    public final void b(boolean z9, boolean z10) {
        int i7;
        int i10;
        float f10;
        if (this.f44152r == z9) {
            return;
        }
        this.f44152r = z9;
        ValueAnimator valueAnimator = this.f44151n;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (z10) {
            float f11 = 1.0f;
            if (z9) {
                f10 = 0.0f;
            } else {
                f10 = 1.0f;
            }
            if (!z9) {
                f11 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f11);
            this.f44151n = ofFloat;
            ofFloat.addUpdateListener(new a3(this, 0));
            this.f44151n.start();
            return;
        }
        int i11 = -1;
        if (!z9) {
            i7 = -16777216;
        } else {
            i7 = -1;
        }
        this.d.setTextColor(i7);
        if (!z9) {
            i10 = -16777216;
        } else {
            i10 = -1;
        }
        this.f44149e.setTextColor(i10);
        if (!z9) {
            i11 = -16777216;
        }
        this.f44150f.setTextColor(i11);
    }

    @Override
    public void setVisibility(int i7) {
        super.setVisibility(i7);
        if (i7 == 0 && !this.f44147b) {
            this.f44147b = true;
            org.telegram.messenger.ui.b0(org.telegram.messenger.p10.f24459s0).c2(this.f44148c, "tg_placeholders_android", "🧐", "100_100");
        }
    }
}
