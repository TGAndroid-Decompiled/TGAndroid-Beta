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
import org.telegram.ui.Components.xq;
public final class r5 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final org.telegram.ui.ActionBar.g6 f43049a;
    public final org.telegram.ui.Components.d0 f43050b;
    public final TextView[] f43051c;
    public int d;
    public boolean f43052e;
    public final org.telegram.ui.Components.w5 f43053f;
    public final Paint h;

    public r5(Context context, CharSequence[] charSequenceArr, k kVar, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        int i7;
        this.d = 0;
        this.f43052e = false;
        this.h = new Paint(1);
        this.f43049a = g6Var;
        org.telegram.ui.Components.d0 d0Var = new org.telegram.ui.Components.d0(this, context, g6Var);
        this.f43050b = d0Var;
        this.f43053f = new org.telegram.ui.Components.w5(new q5(this, 0), 420L, xq.h);
        d0Var.setOrientation(0);
        d0Var.setPadding(org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f));
        this.f43051c = new TextView[charSequenceArr.length];
        for (int i10 = 0; i10 < charSequenceArr.length; i10++) {
            TextView textView = new TextView(context);
            textView.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(6.0f));
            textView.setTypeface(org.telegram.messenger.g0.o());
            textView.setTextSize(1, 14.0f);
            textView.setText(charSequenceArr[i10]);
            textView.setOnClickListener(new bi.la(this, kVar, i10, 19));
            c8.ka.a(textView);
            org.telegram.ui.Components.d0 d0Var2 = this.f43050b;
            if (i10 == 0) {
                i7 = 0;
            } else {
                i7 = 3;
            }
            d0Var2.addView(textView, c8.ha.q(-2, -2, 0.0f, 19, i7, 0, 0, 0));
            this.f43051c[i10] = textView;
        }
        addView(this.f43050b, c8.ha.e(-2, -2, 17));
        updateColors();
    }

    public final void a() {
        int i7 = 0;
        float e10 = this.f43053f.e(false, this.d);
        while (true) {
            TextView[] textViewArr = this.f43051c;
            if (i7 < textViewArr.length) {
                float l10 = Utilities.l(1.0f - Math.abs(e10 - i7));
                TextView textView = textViewArr[i7];
                int i10 = org.telegram.ui.ActionBar.l6.f28275z6;
                org.telegram.ui.ActionBar.g6 g6Var = this.f43049a;
                textView.setTextColor(i0.a.f(l10, org.telegram.ui.ActionBar.l6.w0(i10, g6Var), org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.Ci, g6Var)));
                i7++;
            } else {
                this.f43050b.invalidate();
                return;
            }
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28275z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.Ci));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f27865d6));
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        org.telegram.ui.Components.d0 d0Var;
        if (this.f43052e && view == (d0Var = this.f43050b)) {
            float N = org.telegram.messenger.g0.N(1.67f);
            float N2 = org.telegram.messenger.g0.N(0.67f);
            Paint paint = this.h;
            paint.setShadowLayer(N, 0.0f, N2, 520093696);
            paint.setColor(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f27865d6, this.f43049a));
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(d0Var.getX(), d0Var.getY(), d0Var.getX() + d0Var.getWidth(), d0Var.getY() + d0Var.getHeight());
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
        if (this.f43052e) {
            d02 = null;
        } else {
            d02 = org.telegram.ui.ActionBar.l6.d0(org.telegram.messenger.g0.L(18.0f), org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f27865d6, this.f43049a));
        }
        this.f43050b.setBackground(d02);
    }
}
