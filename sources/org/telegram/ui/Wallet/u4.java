package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Cells.sa;
import org.telegram.ui.Components.es;
public final class u4 extends FrameLayout implements org.telegram.ui.ActionBar.x5 {
    public final org.telegram.ui.ActionBar.c6 f33730a;
    public final t4 f33731b;
    public final TextView[] f33732c;
    public int d;
    public boolean e;
    public final org.telegram.ui.Components.g6 f33733f;
    public final Paint h;

    public u4(Context context, CharSequence[] charSequenceArr, j jVar, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        int i10;
        this.d = 0;
        this.e = false;
        this.h = new Paint(1);
        this.f33730a = c6Var;
        t4 t4Var = new t4(this, context, c6Var);
        this.f33731b = t4Var;
        this.f33733f = new org.telegram.ui.Components.g6(new s4(this, 0), 420L, es.h);
        t4Var.setOrientation(0);
        t4Var.setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
        this.f33732c = new TextView[charSequenceArr.length];
        for (int i11 = 0; i11 < charSequenceArr.length; i11++) {
            TextView textView = new TextView(context);
            textView.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f));
            textView.setTypeface(AndroidUtilities.bold());
            textView.setTextSize(1, 14.0f);
            textView.setText(charSequenceArr[i11]);
            textView.setOnClickListener(new sa(this, jVar, i11, 17));
            w7.c6.a(textView);
            t4 t4Var2 = this.f33731b;
            if (i11 == 0) {
                i10 = 0;
            } else {
                i10 = 3;
            }
            t4Var2.addView(textView, w7.a6.p(-2, -2, 0.0f, 19, i10, 0, 0, 0));
            this.f33732c[i11] = textView;
        }
        addView(this.f33731b, w7.a6.e(-2, -2, 17));
        d();
    }

    public final void a() {
        int i10 = 0;
        float d = this.f33733f.d(this.d, false);
        while (true) {
            TextView[] textViewArr = this.f33732c;
            if (i10 < textViewArr.length) {
                float clamp01 = Utilities.clamp01(1.0f - Math.abs(d - i10));
                TextView textView = textViewArr[i10];
                int i11 = org.telegram.ui.ActionBar.g6.f20305z6;
                org.telegram.ui.ActionBar.c6 c6Var = this.f33730a;
                textView.setTextColor(i0.a.d(clamp01, org.telegram.ui.ActionBar.g6.w0(i11, c6Var), org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Oh, c6Var)));
                i10++;
            } else {
                this.f33731b.invalidate();
                return;
            }
        }
    }

    @Override
    public final void d() {
        ShapeDrawable c02;
        a();
        if (this.e) {
            c02 = null;
        } else {
            c02 = org.telegram.ui.ActionBar.g6.c0(AndroidUtilities.dp(18.0f), org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19901d6, this.f33730a));
        }
        this.f33731b.setBackground(c02);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        t4 t4Var;
        if (this.e && view == (t4Var = this.f33731b)) {
            float dpf2 = AndroidUtilities.dpf2(1.67f);
            float dpf22 = AndroidUtilities.dpf2(0.67f);
            Paint paint = this.h;
            paint.setShadowLayer(dpf2, 0.0f, dpf22, 520093696);
            paint.setColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19901d6, this.f33730a));
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(t4Var.getX(), t4Var.getY(), t4Var.getX() + t4Var.getWidth(), t4Var.getY() + t4Var.getHeight());
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), paint);
        }
        return super.drawChild(canvas, view, j10);
    }

    public int[] getColorKeys() {
        return null;
    }

    public void setSelected(int i10) {
        if (this.d == i10) {
            return;
        }
        this.d = i10;
        a();
    }
}
