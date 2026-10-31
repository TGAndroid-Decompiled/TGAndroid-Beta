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
import org.telegram.messenger.cd;
import org.telegram.messenger.z20;
public final class v8 extends FrameLayout {
    public static Paint d;
    public static final int[] e = {-1031100, -29183, -12769, -8792480, -12521994, -12140801, -2984711, -45162, -4473925};
    public static final int[] f23330f = {-65536, -29183, -256, -16711936, -16711681, -16776961, -2984711, -65281, -1};
    public final TextView f23331a;
    public boolean f23332b;
    public int f23333c;

    public v8(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        int i10;
        if (d == null) {
            d = new Paint(1);
        }
        TextView textView = new TextView(context);
        this.f23331a = textView;
        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.G6, p6Var);
        z20.o(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        if (cd.X) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        textView.setGravity(i10 | 16);
        addView(textView, w7.b6.d(-1, -1.0f, (cd.X ? 5 : 3) | 48, 21.0f, 0.0f, 21.0f, 0.0f));
    }

    public final void a(ArrayList arrayList, boolean z10) {
        float f7;
        float f10;
        setEnabled(z10);
        TextView textView = this.f23331a;
        float f11 = 0.5f;
        if (arrayList != null) {
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.5f;
            }
            float[] fArr = {f10};
            Property property = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(textView, property, fArr));
            if (z10) {
                f11 = 1.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(this, property, f11));
            return;
        }
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.5f;
        }
        textView.setAlpha(f7);
        if (z10) {
            f11 = 1.0f;
        }
        setAlpha(f11);
    }

    public final void b(int i10, String str, boolean z10) {
        boolean z11;
        this.f23331a.setText(str);
        this.f23332b = z10;
        this.f23333c = i10;
        if (!z10 && i10 == 0) {
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
        int i10;
        if (this.f23332b) {
            if (cd.X) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.i0.L(20.0f);
            }
            float f7 = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth2 = getMeasuredWidth();
            if (cd.X) {
                i10 = org.telegram.messenger.i0.L(20.0f);
            } else {
                i10 = 0;
            }
            canvas2 = canvas;
            canvas2.drawLine(f7, measuredHeight, measuredWidth2 - i10, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.t6.f21052k0);
        } else {
            canvas2 = canvas;
        }
        int i11 = this.f23333c;
        if (i11 != 0) {
            d.setColor(i11);
            if (cd.X) {
                measuredWidth = org.telegram.messenger.i0.L(33.0f);
            } else {
                measuredWidth = getMeasuredWidth() - org.telegram.messenger.i0.L(33.0f);
            }
            canvas2.drawCircle(measuredWidth, getMeasuredHeight() / 2, org.telegram.messenger.i0.L(10.0f), d);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(50.0f) + (this.f23332b ? 1 : 0), 1073741824));
    }
}
