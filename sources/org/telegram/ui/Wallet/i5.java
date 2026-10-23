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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.bs;
public final class i5 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final org.telegram.ui.ActionBar.g6 f34601a;
    public final h5 f34602b;
    public final TextView[] f34603c;
    public int d;
    public boolean e;
    public final org.telegram.ui.Components.f6 f34604f;
    public final Paint h;

    public i5(Context context, CharSequence[] charSequenceArr, k kVar, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        int i10;
        this.d = 0;
        this.e = false;
        this.h = new Paint(1);
        this.f34601a = g6Var;
        h5 h5Var = new h5(this, context, g6Var);
        this.f34602b = h5Var;
        this.f34604f = new org.telegram.ui.Components.f6(new g5(this, 0), 420L, bs.h);
        h5Var.setOrientation(0);
        h5Var.setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
        this.f34603c = new TextView[charSequenceArr.length];
        for (int i11 = 0; i11 < charSequenceArr.length; i11++) {
            TextView textView = new TextView(context);
            textView.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f));
            textView.setTypeface(AndroidUtilities.bold());
            textView.setTextSize(1, 14.0f);
            textView.setText(charSequenceArr[i11]);
            textView.setOnClickListener(new ai.ia(this, kVar, i11, 18));
            w7.b6.a(textView);
            h5 h5Var2 = this.f34602b;
            if (i11 == 0) {
                i10 = 0;
            } else {
                i10 = 3;
            }
            h5Var2.addView(textView, w7.z5.p(-2, -2, 0.0f, 19, i10, 0, 0, 0));
            this.f34603c[i11] = textView;
        }
        addView(this.f34602b, w7.z5.e(-2, -2, 17));
        updateColors();
    }

    public final void a() {
        int i10 = 0;
        float d = this.f34604f.d(this.d, false);
        while (true) {
            TextView[] textViewArr = this.f34603c;
            if (i10 < textViewArr.length) {
                float clamp01 = Utilities.clamp01(1.0f - Math.abs(d - i10));
                TextView textView = textViewArr[i10];
                int i11 = org.telegram.ui.ActionBar.k6.f21588z6;
                org.telegram.ui.ActionBar.g6 g6Var = this.f34601a;
                textView.setTextColor(i0.a.f(clamp01, org.telegram.ui.ActionBar.k6.w0(i11, g6Var), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Oh, g6Var)));
                i10++;
            } else {
                this.f34602b.invalidate();
                return;
            }
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21588z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Oh));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21183d6));
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        h5 h5Var;
        if (this.e && view == (h5Var = this.f34602b)) {
            float dpf2 = AndroidUtilities.dpf2(1.67f);
            float dpf22 = AndroidUtilities.dpf2(0.67f);
            Paint paint = this.h;
            paint.setShadowLayer(dpf2, 0.0f, dpf22, 520093696);
            paint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21183d6, this.f34601a));
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(h5Var.getX(), h5Var.getY(), h5Var.getX() + h5Var.getWidth(), h5Var.getY() + h5Var.getHeight());
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
            c02 = org.telegram.ui.ActionBar.k6.c0(AndroidUtilities.dp(18.0f), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21183d6, this.f34601a));
        }
        this.f34602b.setBackground(c02);
    }
}
