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
import org.telegram.ui.Components.gr;
public final class v5 extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public final org.telegram.ui.ActionBar.p6 f35309a;
    public final org.telegram.ui.Components.d0 f35310b;
    public final TextView[] f35311c;
    public int d;
    public boolean e;
    public final org.telegram.ui.Components.t5 f35312f;
    public final Paint h;

    public v5(Context context, CharSequence[] charSequenceArr, k kVar, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        int i10;
        this.d = 0;
        this.e = false;
        this.h = new Paint(1);
        this.f35309a = p6Var;
        org.telegram.ui.Components.d0 d0Var = new org.telegram.ui.Components.d0(this, context, p6Var);
        this.f35310b = d0Var;
        this.f35312f = new org.telegram.ui.Components.t5(new u5(this, 0), 420L, gr.h);
        d0Var.setOrientation(0);
        d0Var.setPadding(org.telegram.messenger.i0.L(3.0f), org.telegram.messenger.i0.L(3.0f), org.telegram.messenger.i0.L(3.0f), org.telegram.messenger.i0.L(3.0f));
        this.f35311c = new TextView[charSequenceArr.length];
        for (int i11 = 0; i11 < charSequenceArr.length; i11++) {
            TextView textView = new TextView(context);
            textView.setPadding(org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(6.0f));
            textView.setTypeface(org.telegram.messenger.i0.o());
            textView.setTextSize(1, 14.0f);
            textView.setText(charSequenceArr[i11]);
            textView.setOnClickListener(new jg.w1(this, kVar, i11, 19));
            w7.e6.a(textView);
            org.telegram.ui.Components.d0 d0Var2 = this.f35310b;
            if (i11 == 0) {
                i10 = 0;
            } else {
                i10 = 3;
            }
            d0Var2.addView(textView, w7.b6.q(-2, -2, 0.0f, 19, i10, 0, 0, 0));
            this.f35311c[i11] = textView;
        }
        addView(this.f35310b, w7.b6.e(-2, -2, 17));
        updateColors();
    }

    public final void a() {
        int i10 = 0;
        float e = this.f35312f.e(false, this.d);
        while (true) {
            TextView[] textViewArr = this.f35311c;
            if (i10 < textViewArr.length) {
                float l4 = Utilities.l(1.0f - Math.abs(e - i10));
                TextView textView = textViewArr[i10];
                int i11 = org.telegram.ui.ActionBar.t6.f21330z6;
                org.telegram.ui.ActionBar.p6 p6Var = this.f35309a;
                textView.setTextColor(i0.b.f(l4, org.telegram.ui.ActionBar.t6.w0(i11, p6Var), org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Ci, p6Var)));
                i10++;
            } else {
                this.f35310b.invalidate();
                return;
            }
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21330z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Ci));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20929d6));
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        org.telegram.ui.Components.d0 d0Var;
        if (this.e && view == (d0Var = this.f35310b)) {
            float N = org.telegram.messenger.i0.N(1.67f);
            float N2 = org.telegram.messenger.i0.N(0.67f);
            Paint paint = this.h;
            paint.setShadowLayer(N, 0.0f, N2, 520093696);
            paint.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f20929d6, this.f35309a));
            RectF rectF = org.telegram.messenger.i0.P;
            rectF.set(d0Var.getX(), d0Var.getY(), d0Var.getX() + d0Var.getWidth(), d0Var.getY() + d0Var.getHeight());
            canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(18.0f), org.telegram.messenger.i0.L(18.0f), paint);
        }
        return super.drawChild(canvas, view, j10);
    }

    public void setSelected(int i10) {
        if (this.d == i10) {
            return;
        }
        this.d = i10;
        a();
    }

    @Override
    public final void updateColors() {
        ShapeDrawable d02;
        a();
        if (this.e) {
            d02 = null;
        } else {
            d02 = org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(18.0f), org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f20929d6, this.f35309a));
        }
        this.f35310b.setBackground(d02);
    }
}
