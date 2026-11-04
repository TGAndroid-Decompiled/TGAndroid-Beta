package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import b8.mf;
import b8.pf;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.xq;
public final class r5 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final org.telegram.ui.ActionBar.e6 f43123a;
    public final org.telegram.ui.Components.b0 f43124b;
    public final TextView[] f43125c;
    public int d;
    public boolean f43126e;
    public final org.telegram.ui.Components.u5 f43127f;
    public final Paint h;

    public r5(Context context, CharSequence[] charSequenceArr, k kVar, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        int i3;
        this.d = 0;
        this.f43126e = false;
        this.h = new Paint(1);
        this.f43123a = e6Var;
        org.telegram.ui.Components.b0 b0Var = new org.telegram.ui.Components.b0(this, context, e6Var);
        this.f43124b = b0Var;
        this.f43127f = new org.telegram.ui.Components.u5(new q5(this, 0), 420L, xq.h);
        b0Var.setOrientation(0);
        b0Var.setPadding(org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f));
        this.f43125c = new TextView[charSequenceArr.length];
        for (int i10 = 0; i10 < charSequenceArr.length; i10++) {
            TextView textView = new TextView(context);
            textView.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(6.0f));
            textView.setTypeface(org.telegram.messenger.g0.o());
            textView.setTextSize(1, 14.0f);
            textView.setText(charSequenceArr[i10]);
            textView.setOnClickListener(new ai.h3(this, kVar, i10, 21));
            pf.a(textView);
            org.telegram.ui.Components.b0 b0Var2 = this.f43124b;
            if (i10 == 0) {
                i3 = 0;
            } else {
                i3 = 3;
            }
            b0Var2.addView(textView, mf.q(-2, -2, 0.0f, 19, i3, 0, 0, 0));
            this.f43125c[i10] = textView;
        }
        addView(this.f43124b, mf.e(-2, -2, 17));
        updateColors();
    }

    public final void a() {
        int i3 = 0;
        float e10 = this.f43127f.e(false, this.d);
        while (true) {
            TextView[] textViewArr = this.f43125c;
            if (i3 < textViewArr.length) {
                float l10 = Utilities.l(1.0f - Math.abs(e10 - i3));
                TextView textView = textViewArr[i3];
                int i10 = org.telegram.ui.ActionBar.k6.f28290z6;
                org.telegram.ui.ActionBar.e6 e6Var = this.f43123a;
                textView.setTextColor(i0.a.f(l10, org.telegram.ui.ActionBar.k6.w0(i10, e6Var), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ci, e6Var)));
                i3++;
            } else {
                this.f43124b.invalidate();
                return;
            }
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28290z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ci));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27878d6));
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        org.telegram.ui.Components.b0 b0Var;
        if (this.f43126e && view == (b0Var = this.f43124b)) {
            float N = org.telegram.messenger.g0.N(1.67f);
            float N2 = org.telegram.messenger.g0.N(0.67f);
            Paint paint = this.h;
            paint.setShadowLayer(N, 0.0f, N2, 520093696);
            paint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27878d6, this.f43123a));
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(b0Var.getX(), b0Var.getY(), b0Var.getX() + b0Var.getWidth(), b0Var.getY() + b0Var.getHeight());
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(18.0f), paint);
        }
        return super.drawChild(canvas, view, j10);
    }

    public void setSelected(int i3) {
        if (this.d == i3) {
            return;
        }
        this.d = i3;
        a();
    }

    @Override
    public final void updateColors() {
        ShapeDrawable d02;
        a();
        if (this.f43126e) {
            d02 = null;
        } else {
            d02 = org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(18.0f), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27878d6, this.f43123a));
        }
        this.f43124b.setBackground(d02);
    }
}
