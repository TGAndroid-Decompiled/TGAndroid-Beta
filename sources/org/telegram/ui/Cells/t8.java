package org.telegram.ui.Cells;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.gd;
import org.telegram.messenger.n10;
public final class t8 extends FrameLayout {
    public static Paint d;
    public static final int[] f31992e = {-1031100, -29183, -12769, -8792480, -12521994, -12140801, -2984711, -45162, -4473925};
    public static final int[] f31993f = {-65536, -29183, -256, -16711936, -16711681, -16776961, -2984711, -65281, -1};
    public final TextView f31994a;
    public boolean f31995b;
    public int f31996c;

    public t8(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        int i7;
        if (d == null) {
            d = new Paint(1);
        }
        TextView textView = new TextView(context);
        this.f31994a = textView;
        org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.G6, i6Var);
        n10.q(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        if (gd.f24216a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        textView.setGravity(i7 | 16);
        addView(textView, c8.ma.d(-1, -1.0f, (gd.f24216a0 ? 5 : 3) | 48, 21.0f, 0.0f, 21.0f, 0.0f));
    }

    public final void a(ArrayList arrayList, boolean z10) {
        float f10;
        float f11;
        setEnabled(z10);
        TextView textView = this.f31994a;
        float f12 = 0.5f;
        if (arrayList != null) {
            if (z10) {
                f11 = 1.0f;
            } else {
                f11 = 0.5f;
            }
            float[] fArr = {f11};
            Property property = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(textView, property, fArr));
            if (z10) {
                f12 = 1.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(this, property, f12));
            return;
        }
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.5f;
        }
        textView.setAlpha(f10);
        if (z10) {
            f12 = 1.0f;
        }
        setAlpha(f12);
    }

    public final void b(int i7, String str, boolean z10) {
        boolean z11;
        this.f31994a.setText(str);
        this.f31995b = z10;
        this.f31996c = i7;
        if (!z10 && i7 == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        setWillNotDraw(z11);
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        int measuredWidth;
        float L;
        int i7;
        if (this.f31995b) {
            if (gd.f24216a0) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.g0.L(20.0f);
            }
            float f10 = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth2 = getMeasuredWidth();
            if (gd.f24216a0) {
                i7 = org.telegram.messenger.g0.L(20.0f);
            } else {
                i7 = 0;
            }
            canvas2 = canvas;
            canvas2.drawLine(f10, measuredHeight, measuredWidth2 - i7, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.n6.f29519k0);
        } else {
            canvas2 = canvas;
        }
        int i10 = this.f31996c;
        if (i10 != 0) {
            d.setColor(i10);
            if (gd.f24216a0) {
                measuredWidth = org.telegram.messenger.g0.L(33.0f);
            } else {
                measuredWidth = getMeasuredWidth() - org.telegram.messenger.g0.L(33.0f);
            }
            canvas2.drawCircle(measuredWidth, getMeasuredHeight() / 2, org.telegram.messenger.g0.L(10.0f), d);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(50.0f) + (this.f31995b ? 1 : 0), 1073741824));
    }
}
