package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import bi.pa;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.kb1;
public final class g5 extends FrameLayout implements org.telegram.ui.ActionBar.p6 {
    public final org.telegram.ui.ActionBar.u6 f36621a;
    public final f5 f36622b;
    public final TextView[] f36623c;
    public int d;
    public boolean e;
    public final org.telegram.ui.Components.h6 f36624f;
    public final Paint h;

    public g5(Context context, CharSequence[] charSequenceArr, k kVar, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        int i10;
        this.d = 0;
        this.e = false;
        this.h = new Paint(1);
        this.f36621a = u6Var;
        f5 f5Var = new f5(this, context, u6Var);
        this.f36622b = f5Var;
        this.f36624f = new org.telegram.ui.Components.h6(new e5(this, 0), 420L, ds.h);
        f5Var.setOrientation(0);
        f5Var.setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
        this.f36623c = new TextView[charSequenceArr.length];
        for (int i11 = 0; i11 < charSequenceArr.length; i11++) {
            TextView textView = new TextView(context);
            textView.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f));
            textView.setTypeface(AndroidUtilities.bold());
            textView.setTextSize(1, 14.0f);
            textView.setText(charSequenceArr[i11]);
            textView.setOnClickListener(new pa(this, kVar, i11, 19));
            kb1.b(textView);
            f5 f5Var2 = this.f36622b;
            if (i11 == 0) {
                i10 = 0;
            } else {
                i10 = 3;
            }
            f5Var2.addView(textView, kb1.t(-2, -2, 0.0f, 19, i10, 0, 0, 0));
            this.f36623c[i11] = textView;
        }
        addView(this.f36622b, kb1.i(-2, -2, 17));
        updateColors();
    }

    public final void a() {
        int i10 = 0;
        float d = this.f36624f.d(this.d, false);
        while (true) {
            TextView[] textViewArr = this.f36623c;
            if (i10 < textViewArr.length) {
                float clamp01 = Utilities.clamp01(1.0f - Math.abs(d - i10));
                TextView textView = textViewArr[i10];
                int i11 = org.telegram.ui.ActionBar.y6.f23768z6;
                org.telegram.ui.ActionBar.u6 u6Var = this.f36621a;
                textView.setTextColor(i0.a.f(clamp01, org.telegram.ui.ActionBar.y6.w0(i11, u6Var), org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Oh, u6Var)));
                i10++;
            } else {
                this.f36622b.invalidate();
                return;
            }
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23768z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Oh));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23357d6));
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        f5 f5Var;
        if (this.e && view == (f5Var = this.f36622b)) {
            float dpf2 = AndroidUtilities.dpf2(1.67f);
            float dpf22 = AndroidUtilities.dpf2(0.67f);
            Paint paint = this.h;
            paint.setShadowLayer(dpf2, 0.0f, dpf22, 520093696);
            paint.setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23357d6, this.f36621a));
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(f5Var.getX(), f5Var.getY(), f5Var.getX() + f5Var.getWidth(), f5Var.getY() + f5Var.getHeight());
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), paint);
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
        ShapeDrawable c02;
        a();
        if (this.e) {
            c02 = null;
        } else {
            c02 = org.telegram.ui.ActionBar.y6.c0(AndroidUtilities.dp(18.0f), org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23357d6, this.f36621a));
        }
        this.f36622b.setBackground(c02);
    }
}
