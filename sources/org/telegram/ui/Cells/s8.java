package org.telegram.ui.Cells;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import b8.mf;
import java.util.ArrayList;
import org.telegram.messenger.bd;
public final class s8 extends FrameLayout {
    public static Paint d;
    public static final int[] f30353e = {-1031100, -29183, -12769, -8792480, -12521994, -12140801, -2984711, -45162, -4473925};
    public static final int[] f30354f = {-65536, -29183, -256, -16711936, -16711681, -16776961, -2984711, -65281, -1};
    public final TextView f30355a;
    public boolean f30356b;
    public int f30357c;

    public s8(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        int i3;
        if (d == null) {
            d = new Paint(1);
        }
        TextView textView = new TextView(context);
        this.f30355a = textView;
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.G6, e6Var);
        org.telegram.messenger.camera.q.n(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        if (bd.f21784a0) {
            i3 = 5;
        } else {
            i3 = 3;
        }
        textView.setGravity(i3 | 16);
        addView(textView, mf.d(-1, -1.0f, (bd.f21784a0 ? 5 : 3) | 48, 21.0f, 0.0f, 21.0f, 0.0f));
    }

    public final void a(ArrayList arrayList, boolean z10) {
        float f10;
        float f11;
        setEnabled(z10);
        TextView textView = this.f30355a;
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

    public final void b(int i3, String str, boolean z10) {
        boolean z11;
        this.f30355a.setText(str);
        this.f30356b = z10;
        this.f30357c = i3;
        if (!z10 && i3 == 0) {
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
        int i3;
        if (this.f30356b) {
            if (bd.f21784a0) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.g0.L(20.0f);
            }
            float f10 = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth2 = getMeasuredWidth();
            if (bd.f21784a0) {
                i3 = org.telegram.messenger.g0.L(20.0f);
            } else {
                i3 = 0;
            }
            canvas2 = canvas;
            canvas2.drawLine(f10, measuredHeight, measuredWidth2 - i3, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.f28002k0);
        } else {
            canvas2 = canvas;
        }
        int i10 = this.f30357c;
        if (i10 != 0) {
            d.setColor(i10);
            if (bd.f21784a0) {
                measuredWidth = org.telegram.messenger.g0.L(33.0f);
            } else {
                measuredWidth = getMeasuredWidth() - org.telegram.messenger.g0.L(33.0f);
            }
            canvas2.drawCircle(measuredWidth, getMeasuredHeight() / 2, org.telegram.messenger.g0.L(10.0f), d);
        }
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(50.0f) + (this.f30356b ? 1 : 0), 1073741824));
    }
}
