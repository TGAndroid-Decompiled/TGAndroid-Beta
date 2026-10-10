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
import org.telegram.ui.Components.is;
public final class v4 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final org.telegram.ui.ActionBar.e6 f35631a;
    public final u4 f35632b;
    public final TextView[] f35633c;
    public int d;
    public boolean f35634e;
    public final org.telegram.ui.Components.g6 f35635f;
    public final Paint h;

    public v4(Context context, CharSequence[] charSequenceArr, k kVar, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        int i10;
        this.d = 0;
        this.f35634e = false;
        this.h = new Paint(1);
        this.f35631a = e6Var;
        u4 u4Var = new u4(this, context, e6Var);
        this.f35632b = u4Var;
        this.f35635f = new org.telegram.ui.Components.g6(new t4(this, 0), 420L, is.h);
        u4Var.setOrientation(0);
        u4Var.setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
        this.f35633c = new TextView[charSequenceArr.length];
        for (int i11 = 0; i11 < charSequenceArr.length; i11++) {
            TextView textView = new TextView(context);
            textView.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f));
            textView.setTypeface(AndroidUtilities.bold());
            textView.setTextSize(1, 14.0f);
            textView.setText(charSequenceArr[i11]);
            textView.setOnClickListener(new sa(this, kVar, i11, 17));
            w7.z5.a(textView);
            u4 u4Var2 = this.f35632b;
            if (i11 == 0) {
                i10 = 0;
            } else {
                i10 = 3;
            }
            u4Var2.addView(textView, w7.x5.p(-2, -2, 0.0f, 19, i10, 0, 0, 0));
            this.f35633c[i11] = textView;
        }
        addView(this.f35632b, w7.x5.e(-2, -2, 17));
        e();
    }

    public final void a() {
        int i10 = 0;
        float d = this.f35635f.d(this.d, false);
        while (true) {
            TextView[] textViewArr = this.f35633c;
            if (i10 < textViewArr.length) {
                float clamp01 = Utilities.clamp01(1.0f - Math.abs(d - i10));
                TextView textView = textViewArr[i10];
                int i11 = org.telegram.ui.ActionBar.i6.f21203z6;
                org.telegram.ui.ActionBar.e6 e6Var = this.f35631a;
                textView.setTextColor(i0.a.d(clamp01, org.telegram.ui.ActionBar.i6.w0(i11, e6Var), org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Oh, e6Var)));
                i10++;
            } else {
                this.f35632b.invalidate();
                return;
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        u4 u4Var;
        if (this.f35634e && view == (u4Var = this.f35632b)) {
            float dpf2 = AndroidUtilities.dpf2(1.67f);
            float dpf22 = AndroidUtilities.dpf2(0.67f);
            Paint paint = this.h;
            paint.setShadowLayer(dpf2, 0.0f, dpf22, 520093696);
            paint.setColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20801d6, this.f35631a));
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(u4Var.getX(), u4Var.getY(), u4Var.getX() + u4Var.getWidth(), u4Var.getY() + u4Var.getHeight());
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), paint);
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void e() {
        ShapeDrawable c02;
        a();
        if (this.f35634e) {
            c02 = null;
        } else {
            c02 = org.telegram.ui.ActionBar.i6.c0(AndroidUtilities.dp(18.0f), org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20801d6, this.f35631a));
        }
        this.f35632b.setBackground(c02);
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
