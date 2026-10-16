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
public final class v4 extends FrameLayout implements org.telegram.ui.ActionBar.x5 {
    public final org.telegram.ui.ActionBar.c6 f33502a;
    public final u4 f33503b;
    public final TextView[] f33504c;
    public int d;
    public boolean e;
    public final org.telegram.ui.Components.g6 f33505f;
    public final Paint h;

    public v4(Context context, CharSequence[] charSequenceArr, k kVar, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        int i10;
        this.d = 0;
        this.e = false;
        this.h = new Paint(1);
        this.f33502a = c6Var;
        u4 u4Var = new u4(this, context, c6Var);
        this.f33503b = u4Var;
        this.f33505f = new org.telegram.ui.Components.g6(new t4(this, 0), 420L, es.h);
        u4Var.setOrientation(0);
        u4Var.setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
        this.f33504c = new TextView[charSequenceArr.length];
        for (int i11 = 0; i11 < charSequenceArr.length; i11++) {
            TextView textView = new TextView(context);
            textView.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f));
            textView.setTypeface(AndroidUtilities.bold());
            textView.setTextSize(1, 14.0f);
            textView.setText(charSequenceArr[i11]);
            textView.setOnClickListener(new sa(this, kVar, i11, 17));
            w7.b6.a(textView);
            u4 u4Var2 = this.f33503b;
            if (i11 == 0) {
                i10 = 0;
            } else {
                i10 = 3;
            }
            u4Var2.addView(textView, w7.z5.p(-2, -2, 0.0f, 19, i10, 0, 0, 0));
            this.f33504c[i11] = textView;
        }
        addView(this.f33503b, w7.z5.e(-2, -2, 17));
        d();
    }

    public final void a() {
        int i10 = 0;
        float d = this.f33505f.d(this.d, false);
        while (true) {
            TextView[] textViewArr = this.f33504c;
            if (i10 < textViewArr.length) {
                float clamp01 = Utilities.clamp01(1.0f - Math.abs(d - i10));
                TextView textView = textViewArr[i10];
                int i11 = org.telegram.ui.ActionBar.g6.f20005z6;
                org.telegram.ui.ActionBar.c6 c6Var = this.f33502a;
                textView.setTextColor(i0.a.d(clamp01, org.telegram.ui.ActionBar.g6.w0(i11, c6Var), org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Oh, c6Var)));
                i10++;
            } else {
                this.f33503b.invalidate();
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
            c02 = org.telegram.ui.ActionBar.g6.c0(AndroidUtilities.dp(18.0f), org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19601d6, this.f33502a));
        }
        this.f33503b.setBackground(c02);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        u4 u4Var;
        if (this.e && view == (u4Var = this.f33503b)) {
            float dpf2 = AndroidUtilities.dpf2(1.67f);
            float dpf22 = AndroidUtilities.dpf2(0.67f);
            Paint paint = this.h;
            paint.setShadowLayer(dpf2, 0.0f, dpf22, 520093696);
            paint.setColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19601d6, this.f33502a));
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(u4Var.getX(), u4Var.getY(), u4Var.getX() + u4Var.getWidth(), u4Var.getY() + u4Var.getHeight());
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
