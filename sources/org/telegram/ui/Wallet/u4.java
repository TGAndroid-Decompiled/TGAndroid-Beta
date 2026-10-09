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
import org.telegram.ui.Components.hs;
public final class u4 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final org.telegram.ui.ActionBar.e6 f35535a;
    public final t4 f35536b;
    public final TextView[] f35537c;
    public int d;
    public boolean f35538e;
    public final org.telegram.ui.Components.g6 f35539f;
    public final Paint h;

    public u4(Context context, CharSequence[] charSequenceArr, j jVar, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        int i10;
        this.d = 0;
        this.f35538e = false;
        this.h = new Paint(1);
        this.f35535a = e6Var;
        t4 t4Var = new t4(this, context, e6Var);
        this.f35536b = t4Var;
        this.f35539f = new org.telegram.ui.Components.g6(new s4(this, 0), 420L, hs.h);
        t4Var.setOrientation(0);
        t4Var.setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
        this.f35537c = new TextView[charSequenceArr.length];
        for (int i11 = 0; i11 < charSequenceArr.length; i11++) {
            TextView textView = new TextView(context);
            textView.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f));
            textView.setTypeface(AndroidUtilities.bold());
            textView.setTextSize(1, 14.0f);
            textView.setText(charSequenceArr[i11]);
            textView.setOnClickListener(new sa(this, jVar, i11, 17));
            w7.z5.a(textView);
            t4 t4Var2 = this.f35536b;
            if (i11 == 0) {
                i10 = 0;
            } else {
                i10 = 3;
            }
            t4Var2.addView(textView, w7.x5.p(-2, -2, 0.0f, 19, i10, 0, 0, 0));
            this.f35537c[i11] = textView;
        }
        addView(this.f35536b, w7.x5.e(-2, -2, 17));
        e();
    }

    public final void a() {
        int i10 = 0;
        float d = this.f35539f.d(this.d, false);
        while (true) {
            TextView[] textViewArr = this.f35537c;
            if (i10 < textViewArr.length) {
                float clamp01 = Utilities.clamp01(1.0f - Math.abs(d - i10));
                TextView textView = textViewArr[i10];
                int i11 = org.telegram.ui.ActionBar.i6.f21199z6;
                org.telegram.ui.ActionBar.e6 e6Var = this.f35535a;
                textView.setTextColor(i0.a.d(clamp01, org.telegram.ui.ActionBar.i6.w0(i11, e6Var), org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Oh, e6Var)));
                i10++;
            } else {
                this.f35536b.invalidate();
                return;
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        t4 t4Var;
        if (this.f35538e && view == (t4Var = this.f35536b)) {
            float dpf2 = AndroidUtilities.dpf2(1.67f);
            float dpf22 = AndroidUtilities.dpf2(0.67f);
            Paint paint = this.h;
            paint.setShadowLayer(dpf2, 0.0f, dpf22, 520093696);
            paint.setColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20797d6, this.f35535a));
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(t4Var.getX(), t4Var.getY(), t4Var.getX() + t4Var.getWidth(), t4Var.getY() + t4Var.getHeight());
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), paint);
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void e() {
        ShapeDrawable c02;
        a();
        if (this.f35538e) {
            c02 = null;
        } else {
            c02 = org.telegram.ui.ActionBar.i6.c0(AndroidUtilities.dp(18.0f), org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20797d6, this.f35535a));
        }
        this.f35536b.setBackground(c02);
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
