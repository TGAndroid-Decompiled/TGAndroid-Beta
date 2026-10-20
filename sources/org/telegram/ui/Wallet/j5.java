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
import org.telegram.ui.Components.bs;
public final class j5 extends FrameLayout implements org.telegram.ui.ActionBar.y5 {
    public final org.telegram.ui.ActionBar.d6 f34381a;
    public final i5 f34382b;
    public final TextView[] f34383c;
    public int d;
    public boolean e;
    public final org.telegram.ui.Components.f6 f34384f;
    public final Paint h;

    public j5(Context context, CharSequence[] charSequenceArr, l lVar, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        int i10;
        this.d = 0;
        this.e = false;
        this.h = new Paint(1);
        this.f34381a = d6Var;
        i5 i5Var = new i5(this, context, d6Var);
        this.f34382b = i5Var;
        this.f34384f = new org.telegram.ui.Components.f6(new h5(this, 0), 420L, bs.h);
        i5Var.setOrientation(0);
        i5Var.setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
        this.f34383c = new TextView[charSequenceArr.length];
        for (int i11 = 0; i11 < charSequenceArr.length; i11++) {
            TextView textView = new TextView(context);
            textView.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f));
            textView.setTypeface(AndroidUtilities.bold());
            textView.setTextSize(1, 14.0f);
            textView.setText(charSequenceArr[i11]);
            textView.setOnClickListener(new ai.ha(this, lVar, i11, 18));
            w7.b6.a(textView);
            i5 i5Var2 = this.f34382b;
            if (i11 == 0) {
                i10 = 0;
            } else {
                i10 = 3;
            }
            i5Var2.addView(textView, w7.z5.p(-2, -2, 0.0f, 19, i10, 0, 0, 0));
            this.f34383c[i11] = textView;
        }
        addView(this.f34382b, w7.z5.e(-2, -2, 17));
        d();
    }

    public final void a() {
        int i10 = 0;
        float d = this.f34384f.d(this.d, false);
        while (true) {
            TextView[] textViewArr = this.f34383c;
            if (i10 < textViewArr.length) {
                float clamp01 = Utilities.clamp01(1.0f - Math.abs(d - i10));
                TextView textView = textViewArr[i10];
                int i11 = org.telegram.ui.ActionBar.h6.f21395z6;
                org.telegram.ui.ActionBar.d6 d6Var = this.f34381a;
                textView.setTextColor(i0.a.f(clamp01, org.telegram.ui.ActionBar.h6.w0(i11, d6Var), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Oh, d6Var)));
                i10++;
            } else {
                this.f34382b.invalidate();
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
            c02 = org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(18.0f), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20990d6, this.f34381a));
        }
        this.f34382b.setBackground(c02);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        i5 i5Var;
        if (this.e && view == (i5Var = this.f34382b)) {
            float dpf2 = AndroidUtilities.dpf2(1.67f);
            float dpf22 = AndroidUtilities.dpf2(0.67f);
            Paint paint = this.h;
            paint.setShadowLayer(dpf2, 0.0f, dpf22, 520093696);
            paint.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20990d6, this.f34381a));
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(i5Var.getX(), i5Var.getY(), i5Var.getX() + i5Var.getWidth(), i5Var.getY() + i5Var.getHeight());
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
