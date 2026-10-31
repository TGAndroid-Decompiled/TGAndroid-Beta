package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
public final class b3 extends FrameLayout {
    public final LinearLayout f35965a;
    public boolean f35966b;
    public final org.telegram.ui.Components.g9 f35967c;
    public final TextView d;
    public final TextView e;
    public final TextView f35968f;
    public final vh.d h;
    public ValueAnimator f35969n;
    public boolean f35970r;

    public b3(Context context) {
        super(context);
        this.f35970r = true;
        setVisibility(8);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f35965a = linearLayout;
        linearLayout.setPadding(org.telegram.messenger.i0.L(32.0f), org.telegram.messenger.i0.L(24.0f), org.telegram.messenger.i0.L(32.0f), org.telegram.messenger.i0.L(24.0f));
        linearLayout.setOrientation(1);
        linearLayout.setGravity(3);
        addView(linearLayout, w7.b6.e(-2, -2, 17));
        org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(context);
        this.f35967c = g9Var;
        linearLayout.addView(g9Var, w7.b6.o(100, 100));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 19.0f);
        textView.setTypeface(org.telegram.messenger.i0.o());
        textView.setTextColor(-1);
        TextView f7 = org.telegram.messenger.z20.f(linearLayout, textView, w7.b6.t(-2, -2, 3, 0, 4, 0, 2), context);
        this.e = f7;
        f7.setTextSize(1, 15.0f);
        f7.setTextColor(-1);
        f7.setSingleLine(false);
        f7.setMaxLines(3);
        TextView f10 = org.telegram.messenger.z20.f(linearLayout, f7, w7.b6.t(-2, -2, 3, 0, 0, 0, 1), context);
        this.f35968f = f10;
        f10.setTextSize(1, 12.0f);
        f10.setTextColor(-1);
        f10.setAlpha(0.4f);
        linearLayout.addView(f10, w7.b6.r(-2, -2, 3));
        vh.d dVar = new vh.d(context, null, true);
        this.h = dVar;
        dVar.setMinWidth(org.telegram.messenger.i0.L(140.0f));
        dVar.i(org.telegram.messenger.cd.L0(2131746355, null), false, true);
        linearLayout.addView(dVar, w7.b6.t(-2, 40, 3, 0, 12, 0, 0));
    }

    public final void a(String str, String str2) {
        this.d.setText(org.telegram.messenger.cd.L0(2131742948, null));
        org.telegram.messenger.m5.q(null, null, 2131742950, new Object[]{str}, this.e);
        this.f35968f.setText(str2);
    }

    public final void b(boolean z10, boolean z11) {
        int i10;
        int i11;
        float f7;
        if (this.f35970r == z10) {
            return;
        }
        this.f35970r = z10;
        ValueAnimator valueAnimator = this.f35969n;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (z11) {
            float f10 = 1.0f;
            if (z10) {
                f7 = 0.0f;
            } else {
                f7 = 1.0f;
            }
            if (!z10) {
                f10 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, f10);
            this.f35969n = ofFloat;
            ofFloat.addUpdateListener(new a3(this, 0));
            this.f35969n.start();
            return;
        }
        int i12 = -1;
        if (!z10) {
            i10 = -16777216;
        } else {
            i10 = -1;
        }
        this.d.setTextColor(i10);
        if (!z10) {
            i11 = -16777216;
        } else {
            i11 = -1;
        }
        this.e.setTextColor(i11);
        if (!z10) {
            i12 = -16777216;
        }
        this.f35968f.setTextColor(i12);
    }

    @Override
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        if (i10 == 0 && !this.f35966b) {
            this.f35966b = true;
            org.telegram.messenger.ui.b0(org.telegram.messenger.d20.f15147s0).c2(this.f35967c, "tg_placeholders_android", "🧐", "100_100");
        }
    }
}
