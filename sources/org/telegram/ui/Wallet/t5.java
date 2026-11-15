package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.er;
public final class t5 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final org.telegram.ui.ActionBar.e6 f44516a;
    public final org.telegram.ui.Components.a0 f44517b;
    public final TextView[] f44518c;
    public int d;
    public boolean f44519e;
    public final org.telegram.ui.Components.u5 f44520f;
    public final Paint h;

    public t5(Context context, CharSequence[] charSequenceArr, k kVar, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        int i7;
        this.d = 0;
        this.f44519e = false;
        this.h = new Paint(1);
        this.f44516a = e6Var;
        org.telegram.ui.Components.a0 a0Var = new org.telegram.ui.Components.a0(this, context, e6Var);
        this.f44517b = a0Var;
        this.f44520f = new org.telegram.ui.Components.u5(new s5(this, 0), 420L, er.h);
        a0Var.setOrientation(0);
        a0Var.setPadding(org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f));
        this.f44518c = new TextView[charSequenceArr.length];
        for (int i10 = 0; i10 < charSequenceArr.length; i10++) {
            TextView textView = new TextView(context);
            textView.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(6.0f));
            textView.setTypeface(org.telegram.messenger.g0.o());
            textView.setTextSize(1, 14.0f);
            textView.setText(charSequenceArr[i10]);
            textView.setOnClickListener(new bi.x2(this, kVar, i10, 22));
            c8.na.a(textView);
            org.telegram.ui.Components.a0 a0Var2 = this.f44517b;
            if (i10 == 0) {
                i7 = 0;
            } else {
                i7 = 3;
            }
            a0Var2.addView(textView, c8.ja.q(-2, -2, 0.0f, 19, i7, 0, 0, 0));
            this.f44518c[i10] = textView;
        }
        addView(this.f44517b, c8.ja.e(-2, -2, 17));
        updateColors();
    }

    public final void a() {
        int i7 = 0;
        float e10 = this.f44520f.e(false, this.d);
        while (true) {
            TextView[] textViewArr = this.f44518c;
            if (i7 < textViewArr.length) {
                float l10 = Utilities.l(1.0f - Math.abs(e10 - i7));
                TextView textView = textViewArr[i7];
                int i10 = org.telegram.ui.ActionBar.j6.f29260z6;
                org.telegram.ui.ActionBar.e6 e6Var = this.f44516a;
                textView.setTextColor(i0.a.f(l10, org.telegram.ui.ActionBar.j6.w0(i10, e6Var), org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Fi, e6Var)));
                i7++;
            } else {
                this.f44517b.invalidate();
                return;
            }
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29260z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Fi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28849d6));
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        org.telegram.ui.Components.a0 a0Var;
        if (this.f44519e && view == (a0Var = this.f44517b)) {
            float N = org.telegram.messenger.g0.N(1.67f);
            float N2 = org.telegram.messenger.g0.N(0.67f);
            Paint paint = this.h;
            paint.setShadowLayer(N, 0.0f, N2, 520093696);
            paint.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28849d6, this.f44516a));
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(a0Var.getX(), a0Var.getY(), a0Var.getX() + a0Var.getWidth(), a0Var.getY() + a0Var.getHeight());
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(18.0f), paint);
        }
        return super.drawChild(canvas, view, j3);
    }

    public void setSelected(int i7) {
        if (this.d == i7) {
            return;
        }
        this.d = i7;
        a();
    }

    @Override
    public final void updateColors() {
        ShapeDrawable d02;
        a();
        if (this.f44519e) {
            d02 = null;
        } else {
            d02 = org.telegram.ui.ActionBar.j6.d0(org.telegram.messenger.g0.L(18.0f), org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28849d6, this.f44516a));
        }
        this.f44517b.setBackground(d02);
    }
}
