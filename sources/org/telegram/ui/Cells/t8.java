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
public final class t8 extends FrameLayout {
    public static Paint d;
    public static final int[] e = {-1031100, -29183, -12769, -8792480, -12521994, -12140801, -2984711, -45162, -4473925};
    public static final int[] f22347f = {-65536, -29183, -256, -16711936, -16711681, -16776961, -2984711, -65281, -1};
    public final TextView f22348a;
    public boolean f22349b;
    public int f22350c;

    public t8(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        int i10;
        if (d == null) {
            d = new Paint(1);
        }
        TextView textView = new TextView(context);
        this.f22348a = textView;
        org.telegram.ui.b.l(org.telegram.ui.ActionBar.j6.G6, f6Var, textView, 1, 16.0f);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        textView.setGravity(i10 | 16);
        addView(textView, k7.b6.d(-1, -1.0f, (LocaleController.isRTL ? 5 : 3) | 48, 21.0f, 0.0f, 21.0f, 0.0f));
    }

    public final void a(ArrayList arrayList, boolean z4) {
        float f10;
        float f11;
        setEnabled(z4);
        TextView textView = this.f22348a;
        float f12 = 0.5f;
        if (arrayList != null) {
            if (z4) {
                f11 = 1.0f;
            } else {
                f11 = 0.5f;
            }
            float[] fArr = {f11};
            Property property = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(textView, property, fArr));
            if (z4) {
                f12 = 1.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(this, property, f12));
            return;
        }
        if (z4) {
            f10 = 1.0f;
        } else {
            f10 = 0.5f;
        }
        textView.setAlpha(f10);
        if (z4) {
            f12 = 1.0f;
        }
        setAlpha(f12);
    }

    public final void b(int i10, String str, boolean z4) {
        boolean z10;
        this.f22348a.setText(str);
        this.f22349b = z4;
        this.f22350c = i10;
        if (!z4 && i10 == 0) {
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
        float dp;
        int i10;
        if (this.f22349b) {
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
            canvas2.drawLine(dp, measuredHeight, measuredWidth2 - i10, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.j6.f20000k0);
        } else {
            canvas2 = canvas;
        }
        int i11 = this.f22350c;
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
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f) + (this.f22349b ? 1 : 0), 1073741824));
    }
}
