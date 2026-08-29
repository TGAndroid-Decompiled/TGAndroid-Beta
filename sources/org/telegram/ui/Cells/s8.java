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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class s8 extends FrameLayout {
    public static Paint d;
    public static final int[] f25669e = {-1031100, -29183, -12769, -8792480, -12521994, -12140801, -2984711, -45162, -4473925};
    public static final int[] f25670f = {-65536, -29183, -256, -16711936, -16711681, -16776961, -2984711, -65281, -1};
    public final TextView f25671a;
    public boolean f25672b;
    public int f25673c;

    public s8(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        int i10;
        if (d == null) {
            d = new Paint(1);
        }
        TextView textView = new TextView(context);
        this.f25671a = textView;
        org.telegram.ui.b.m(org.telegram.ui.ActionBar.g6.G6, c6Var, textView, 1, 16.0f);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        textView.setGravity(i10 | 16);
        addView(textView, i7.f6.d(-1, -1.0f, (LocaleController.isRTL ? 5 : 3) | 48, 21.0f, 0.0f, 21.0f, 0.0f));
    }

    public final void a(ArrayList arrayList, boolean z10) {
        float f9;
        float f10;
        setEnabled(z10);
        TextView textView = this.f25671a;
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
            f9 = 1.0f;
        } else {
            f9 = 0.5f;
        }
        textView.setAlpha(f9);
        if (z10) {
            f11 = 1.0f;
        }
        setAlpha(f11);
    }

    public final void b(int i10, String str, boolean z10) {
        boolean z11;
        this.f25671a.setText(str);
        this.f25672b = z10;
        this.f25673c = i10;
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
        float dp;
        int i10;
        if (this.f25672b) {
            if (LocaleController.isRTL) {
                dp = 0.0f;
            } else {
                dp = AndroidUtilities.dp(20.0f);
            }
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth2 = getMeasuredWidth();
            if (LocaleController.isRTL) {
                i10 = AndroidUtilities.dp(20.0f);
            } else {
                i10 = 0;
            }
            canvas2 = canvas;
            canvas2.drawLine(dp, measuredHeight, measuredWidth2 - i10, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.g6.f23183k0);
        } else {
            canvas2 = canvas;
        }
        int i11 = this.f25673c;
        if (i11 != 0) {
            d.setColor(i11);
            if (LocaleController.isRTL) {
                measuredWidth = AndroidUtilities.dp(33.0f);
            } else {
                measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(33.0f);
            }
            canvas2.drawCircle(measuredWidth, getMeasuredHeight() / 2, AndroidUtilities.dp(10.0f), d);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f) + (this.f25672b ? 1 : 0), 1073741824));
    }
}
