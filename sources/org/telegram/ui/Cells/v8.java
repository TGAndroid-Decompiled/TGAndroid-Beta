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
import org.telegram.messenger.ll;
public final class v8 extends FrameLayout {
    public static Paint d;
    public static final int[] f25799e = {-1031100, -29183, -12769, -8792480, -12521994, -12140801, -2984711, -45162, -4473925};
    public static final int[] f25800f = {-65536, -29183, -256, -16711936, -16711681, -16776961, -2984711, -65281, -1};
    public final TextView f25801a;
    public boolean f25802b;
    public int f25803c;

    public v8(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        int i9;
        if (d == null) {
            d = new Paint(1);
        }
        TextView textView = new TextView(context);
        this.f25801a = textView;
        ll.n(org.telegram.ui.ActionBar.f6.G6, b6Var, textView, 1, 16.0f);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        if (LocaleController.isRTL) {
            i9 = 5;
        } else {
            i9 = 3;
        }
        textView.setGravity(i9 | 16);
        addView(textView, g7.e6.d(-1, -1.0f, (LocaleController.isRTL ? 5 : 3) | 48, 21.0f, 0.0f, 21.0f, 0.0f));
    }

    public final void a(ArrayList arrayList, boolean z10) {
        float f10;
        float f11;
        setEnabled(z10);
        TextView textView = this.f25801a;
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

    public final void b(int i9, String str, boolean z10) {
        boolean z11;
        this.f25801a.setText(str);
        this.f25802b = z10;
        this.f25803c = i9;
        if (!z10 && i9 == 0) {
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
        int i9;
        if (this.f25802b) {
            if (LocaleController.isRTL) {
                dp = 0.0f;
            } else {
                dp = AndroidUtilities.dp(20.0f);
            }
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth2 = getMeasuredWidth();
            if (LocaleController.isRTL) {
                i9 = AndroidUtilities.dp(20.0f);
            } else {
                i9 = 0;
            }
            canvas2 = canvas;
            canvas2.drawLine(dp, measuredHeight, measuredWidth2 - i9, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.f6.f23121k0);
        } else {
            canvas2 = canvas;
        }
        int i10 = this.f25803c;
        if (i10 != 0) {
            d.setColor(i10);
            if (LocaleController.isRTL) {
                measuredWidth = AndroidUtilities.dp(33.0f);
            } else {
                measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(33.0f);
            }
            canvas2.drawCircle(measuredWidth, getMeasuredHeight() / 2, AndroidUtilities.dp(10.0f), d);
        }
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f) + (this.f25802b ? 1 : 0), 1073741824));
    }
}
