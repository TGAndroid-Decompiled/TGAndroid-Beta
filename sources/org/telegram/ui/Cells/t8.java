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
public final class t8 extends FrameLayout {
    public static Paint d;
    public static final int[] f30534e = {-1031100, -29183, -12769, -8792480, -12521994, -12140801, -2984711, -45162, -4473925};
    public static final int[] f30535f = {-65536, -29183, -256, -16711936, -16711681, -16776961, -2984711, -65281, -1};
    public final TextView f30536a;
    public boolean f30537b;
    public int f30538c;

    public t8(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        int i7;
        if (d == null) {
            d = new Paint(1);
        }
        TextView textView = new TextView(context);
        this.f30536a = textView;
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.G6, f6Var);
        org.telegram.messenger.camera.q.n(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        if (hd.f22871a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        textView.setGravity(i7 | 16);
        addView(textView, c8.ha.d(-1, -1.0f, (hd.f22871a0 ? 5 : 3) | 48, 21.0f, 0.0f, 21.0f, 0.0f));
    }

    public final void a(ArrayList arrayList, boolean z9) {
        float f10;
        float f11;
        setEnabled(z9);
        TextView textView = this.f30536a;
        float f12 = 0.5f;
        if (arrayList != null) {
            if (z9) {
                f11 = 1.0f;
            } else {
                f11 = 0.5f;
            }
            float[] fArr = {f11};
            Property property = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(textView, property, fArr));
            if (z9) {
                f12 = 1.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(this, property, f12));
            return;
        }
        if (z9) {
            f10 = 1.0f;
        } else {
            f10 = 0.5f;
        }
        textView.setAlpha(f10);
        if (z9) {
            f12 = 1.0f;
        }
        setAlpha(f12);
    }

    public final void b(int i7, String str, boolean z9) {
        boolean z10;
        this.f30536a.setText(str);
        this.f30537b = z9;
        this.f30538c = i7;
        if (!z9 && i7 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        setWillNotDraw(z10);
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        int measuredWidth;
        float L;
        int i7;
        if (this.f30537b) {
            if (hd.f22871a0) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.g0.L(20.0f);
            }
            float f10 = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth2 = getMeasuredWidth();
            if (hd.f22871a0) {
                i7 = org.telegram.messenger.g0.L(20.0f);
            } else {
                i7 = 0;
            }
            canvas2 = canvas;
            canvas2.drawLine(f10, measuredHeight, measuredWidth2 - i7, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.f27971k0);
        } else {
            canvas2 = canvas;
        }
        int i10 = this.f30538c;
        if (i10 != 0) {
            d.setColor(i10);
            if (hd.f22871a0) {
                measuredWidth = org.telegram.messenger.g0.L(33.0f);
            } else {
                measuredWidth = getMeasuredWidth() - org.telegram.messenger.g0.L(33.0f);
            }
            canvas2.drawCircle(measuredWidth, getMeasuredHeight() / 2, org.telegram.messenger.g0.L(10.0f), d);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(50.0f) + (this.f30537b ? 1 : 0), 1073741824));
    }
}
