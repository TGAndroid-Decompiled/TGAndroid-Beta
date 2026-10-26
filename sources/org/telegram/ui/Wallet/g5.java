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
import org.telegram.ui.Components.gb1;
public final class g5 extends FrameLayout implements org.telegram.ui.ActionBar.p6 {
    public final org.telegram.ui.ActionBar.u6 f36596a;
    public final f5 f36597b;
    public final TextView[] f36598c;
    public int d;
    public boolean e;
    public final org.telegram.ui.Components.h6 f36599f;
    public final Paint h;

    public g5(Context context, CharSequence[] charSequenceArr, k kVar, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        int i10;
        this.d = 0;
        this.e = false;
        this.h = new Paint(1);
        this.f36596a = u6Var;
        f5 f5Var = new f5(this, context, u6Var);
        this.f36597b = f5Var;
        this.f36599f = new org.telegram.ui.Components.h6(new e5(this, 0), 420L, ds.h);
        f5Var.setOrientation(0);
        f5Var.setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
        this.f36598c = new TextView[charSequenceArr.length];
        for (int i11 = 0; i11 < charSequenceArr.length; i11++) {
            TextView textView = new TextView(context);
            textView.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f));
            textView.setTypeface(AndroidUtilities.bold());
            textView.setTextSize(1, 14.0f);
            textView.setText(charSequenceArr[i11]);
            textView.setOnClickListener(new pa(this, kVar, i11, 19));
            gb1.b(textView);
            f5 f5Var2 = this.f36597b;
            if (i11 == 0) {
                i10 = 0;
            } else {
                i10 = 3;
            }
            f5Var2.addView(textView, gb1.t(-2, -2, 0.0f, 19, i10, 0, 0, 0));
            this.f36598c[i11] = textView;
        }
        addView(this.f36597b, gb1.i(-2, -2, 17));
        updateColors();
    }

    public final void a() {
        int i10 = 0;
        float d = this.f36599f.d(this.d, false);
        while (true) {
            TextView[] textViewArr = this.f36598c;
            if (i10 < textViewArr.length) {
                float clamp01 = Utilities.clamp01(1.0f - Math.abs(d - i10));
                TextView textView = textViewArr[i10];
                int i11 = org.telegram.ui.ActionBar.y6.f23767z6;
                org.telegram.ui.ActionBar.u6 u6Var = this.f36596a;
                textView.setTextColor(i0.a.f(clamp01, org.telegram.ui.ActionBar.y6.w0(i11, u6Var), org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Oh, u6Var)));
                i10++;
            } else {
                this.f36597b.invalidate();
                return;
            }
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23767z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Oh));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23356d6));
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        f5 f5Var;
        if (this.e && view == (f5Var = this.f36597b)) {
            float dpf2 = AndroidUtilities.dpf2(1.67f);
            float dpf22 = AndroidUtilities.dpf2(0.67f);
            Paint paint = this.h;
            paint.setShadowLayer(dpf2, 0.0f, dpf22, 520093696);
            paint.setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23356d6, this.f36596a));
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
            c02 = org.telegram.ui.ActionBar.y6.c0(AndroidUtilities.dp(18.0f), org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23356d6, this.f36596a));
        }
        this.f36597b.setBackground(c02);
    }
}
