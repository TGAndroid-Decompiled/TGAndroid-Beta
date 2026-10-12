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
import org.telegram.ui.Components.js;
public final class w4 extends FrameLayout implements org.telegram.ui.ActionBar.x5 {
    public final org.telegram.ui.ActionBar.c6 f35471a;
    public final v4 f35472b;
    public final TextView[] f35473c;
    public int d;
    public boolean f35474e;
    public final org.telegram.ui.Components.g6 f35475f;
    public final Paint h;

    public w4(Context context, CharSequence[] charSequenceArr, k kVar, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        int i10;
        this.d = 0;
        this.f35474e = false;
        this.h = new Paint(1);
        this.f35471a = c6Var;
        v4 v4Var = new v4(this, context, c6Var);
        this.f35472b = v4Var;
        this.f35475f = new org.telegram.ui.Components.g6(new u4(this, 0), 420L, js.h);
        v4Var.setOrientation(0);
        v4Var.setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
        this.f35473c = new TextView[charSequenceArr.length];
        for (int i11 = 0; i11 < charSequenceArr.length; i11++) {
            TextView textView = new TextView(context);
            textView.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f));
            textView.setTypeface(AndroidUtilities.bold());
            textView.setTextSize(1, 14.0f);
            textView.setText(charSequenceArr[i11]);
            textView.setOnClickListener(new sa(this, kVar, i11, 17));
            w7.y5.a(textView);
            v4 v4Var2 = this.f35472b;
            if (i11 == 0) {
                i10 = 0;
            } else {
                i10 = 3;
            }
            v4Var2.addView(textView, w7.w5.p(-2, -2, 0.0f, 19, i10, 0, 0, 0));
            this.f35473c[i11] = textView;
        }
        addView(this.f35472b, w7.w5.e(-2, -2, 17));
        e();
    }

    public final void a() {
        int i10 = 0;
        float d = this.f35475f.d(this.d, false);
        while (true) {
            TextView[] textViewArr = this.f35473c;
            if (i10 < textViewArr.length) {
                float clamp01 = Utilities.clamp01(1.0f - Math.abs(d - i10));
                TextView textView = textViewArr[i10];
                int i11 = org.telegram.ui.ActionBar.h6.f20963z6;
                org.telegram.ui.ActionBar.c6 c6Var = this.f35471a;
                textView.setTextColor(i0.a.d(clamp01, org.telegram.ui.ActionBar.h6.w0(i11, c6Var), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Oh, c6Var)));
                i10++;
            } else {
                this.f35472b.invalidate();
                return;
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        v4 v4Var;
        if (this.f35474e && view == (v4Var = this.f35472b)) {
            float dpf2 = AndroidUtilities.dpf2(1.67f);
            float dpf22 = AndroidUtilities.dpf2(0.67f);
            Paint paint = this.h;
            paint.setShadowLayer(dpf2, 0.0f, dpf22, 520093696);
            paint.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20559d6, this.f35471a));
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(v4Var.getX(), v4Var.getY(), v4Var.getX() + v4Var.getWidth(), v4Var.getY() + v4Var.getHeight());
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), paint);
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void e() {
        ShapeDrawable c02;
        a();
        if (this.f35474e) {
            c02 = null;
        } else {
            c02 = org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(18.0f), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20559d6, this.f35471a));
        }
        this.f35472b.setBackground(c02);
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
