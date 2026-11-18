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
import org.telegram.ui.Components.lr;
public final class i6 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public final org.telegram.ui.ActionBar.i6 f44358a;
    public final org.telegram.ui.Components.j0 f44359b;
    public final TextView[] f44360c;
    public int d;
    public boolean f44361e;
    public final org.telegram.ui.Components.c6 f44362f;
    public final Paint h;

    public i6(Context context, CharSequence[] charSequenceArr, k kVar, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        int i7;
        this.d = 0;
        this.f44361e = false;
        this.h = new Paint(1);
        this.f44358a = i6Var;
        org.telegram.ui.Components.j0 j0Var = new org.telegram.ui.Components.j0(this, context, i6Var);
        this.f44359b = j0Var;
        this.f44362f = new org.telegram.ui.Components.c6(new h6(this, 0), 420L, lr.h);
        j0Var.setOrientation(0);
        j0Var.setPadding(org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f));
        this.f44360c = new TextView[charSequenceArr.length];
        for (int i10 = 0; i10 < charSequenceArr.length; i10++) {
            TextView textView = new TextView(context);
            textView.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(6.0f));
            textView.setTypeface(org.telegram.messenger.g0.o());
            textView.setTextSize(1, 14.0f);
            textView.setText(charSequenceArr[i10]);
            textView.setOnClickListener(new bi.e5(this, kVar, i10, 22));
            c8.ra.a(textView);
            org.telegram.ui.Components.j0 j0Var2 = this.f44359b;
            if (i10 == 0) {
                i7 = 0;
            } else {
                i7 = 3;
            }
            j0Var2.addView(textView, c8.ma.q(-2, -2, 0.0f, 19, i7, 0, 0, 0));
            this.f44360c[i10] = textView;
        }
        addView(this.f44359b, c8.ma.e(-2, -2, 17));
        updateColors();
    }

    public final void a() {
        int i7 = 0;
        float e10 = this.f44362f.e(false, this.d);
        while (true) {
            TextView[] textViewArr = this.f44360c;
            if (i7 < textViewArr.length) {
                float l10 = Utilities.l(1.0f - Math.abs(e10 - i7));
                TextView textView = textViewArr[i7];
                int i10 = org.telegram.ui.ActionBar.n6.f29805z6;
                org.telegram.ui.ActionBar.i6 i6Var = this.f44358a;
                textView.setTextColor(i0.a.f(l10, org.telegram.ui.ActionBar.n6.w0(i10, i6Var), org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Fi, i6Var)));
                i7++;
            } else {
                this.f44359b.invalidate();
                return;
            }
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29805z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Fi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29394d6));
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        org.telegram.ui.Components.j0 j0Var;
        if (this.f44361e && view == (j0Var = this.f44359b)) {
            float N = org.telegram.messenger.g0.N(1.67f);
            float N2 = org.telegram.messenger.g0.N(0.67f);
            Paint paint = this.h;
            paint.setShadowLayer(N, 0.0f, N2, 520093696);
            paint.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29394d6, this.f44358a));
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(j0Var.getX(), j0Var.getY(), j0Var.getX() + j0Var.getWidth(), j0Var.getY() + j0Var.getHeight());
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
        if (this.f44361e) {
            d02 = null;
        } else {
            d02 = org.telegram.ui.ActionBar.n6.d0(org.telegram.messenger.g0.L(18.0f), org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29394d6, this.f44358a));
        }
        this.f44359b.setBackground(d02);
    }
}
