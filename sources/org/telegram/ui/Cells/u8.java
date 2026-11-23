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
import org.telegram.messenger.hd;
import org.telegram.messenger.o10;
public final class u8 extends FrameLayout {
    public static Paint d;
    public static final int[] f32071e = {-1031100, -29183, -12769, -8792480, -12521994, -12140801, -2984711, -45162, -4473925};
    public static final int[] f32072f = {-65536, -29183, -256, -16711936, -16711681, -16776961, -2984711, -65281, -1};
    public final TextView f32073a;
    public boolean f32074b;
    public int f32075c;

    public u8(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        int i7;
        if (d == null) {
            d = new Paint(1);
        }
        TextView textView = new TextView(context);
        this.f32073a = textView;
        org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.G6, h6Var);
        o10.q(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        if (hd.f24444a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        textView.setGravity(i7 | 16);
        addView(textView, c8.ma.d(-1, -1.0f, (hd.f24444a0 ? 5 : 3) | 48, 21.0f, 0.0f, 21.0f, 0.0f));
    }

    public final void a(ArrayList arrayList, boolean z10) {
        float f10;
        float f11;
        setEnabled(z10);
        TextView textView = this.f32073a;
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
        this.f32073a.setText(str);
        this.f32074b = z10;
        this.f32075c = i7;
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
        if (this.f32074b) {
            if (hd.f24444a0) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.g0.L(20.0f);
            }
            float f10 = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth2 = getMeasuredWidth();
            if (hd.f24444a0) {
                i7 = org.telegram.messenger.g0.L(20.0f);
            } else {
                i7 = 0;
            }
            canvas2 = canvas;
            canvas2.drawLine(f10, measuredHeight, measuredWidth2 - i7, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.m6.f29504k0);
        } else {
            canvas2 = canvas;
        }
        int i10 = this.f32075c;
        if (i10 != 0) {
            d.setColor(i10);
            if (hd.f24444a0) {
                measuredWidth = org.telegram.messenger.g0.L(33.0f);
            } else {
                measuredWidth = getMeasuredWidth() - org.telegram.messenger.g0.L(33.0f);
            }
            canvas2.drawCircle(measuredWidth, getMeasuredHeight() / 2, org.telegram.messenger.g0.L(10.0f), d);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(50.0f) + (this.f32074b ? 1 : 0), 1073741824));
    }
}
