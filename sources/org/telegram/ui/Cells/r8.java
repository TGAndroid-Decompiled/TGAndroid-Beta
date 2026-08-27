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
import org.telegram.messenger.rl;

public final class r8 extends FrameLayout {
    public static Paint d;

    public static final int[] f25232e = {-1031100, -29183, -12769, -8792480, -12521994, -12140801, -2984711, -45162, -4473925};

    public static final int[] f25233f = {-65536, -29183, -256, -16711936, -16711681, -16776961, -2984711, -65281, -1};

    public final TextView f25234a;

    public boolean f25235b;

    public int f25236c;

    public r8(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        if (d == null) {
            d = new Paint(1);
        }
        TextView textView = new TextView(context);
        this.f25234a = textView;
        rl.l(org.telegram.ui.ActionBar.g6.G6, c6Var, textView, 1, 16.0f);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        addView(textView, h7.z5.d(-1, -1.0f, (LocaleController.isRTL ? 5 : 3) | 48, 21.0f, 0.0f, 21.0f, 0.0f));
    }

    public final void a(ArrayList arrayList, boolean z10) {
        setEnabled(z10);
        TextView textView = this.f25234a;
        if (arrayList == null) {
            textView.setAlpha(z10 ? 1.0f : 0.5f);
            setAlpha(z10 ? 1.0f : 0.5f);
        } else {
            float[] fArr = {z10 ? 1.0f : 0.5f};
            Property property = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, fArr));
            arrayList.add(ObjectAnimator.ofFloat(this, (Property<r8, Float>) property, z10 ? 1.0f : 0.5f));
        }
    }

    public final void b(int i10, String str, boolean z10) {
        this.f25234a.setText(str);
        this.f25235b = z10;
        this.f25236c = i10;
        setWillNotDraw(!z10 && i10 == 0);
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        if (this.f25235b) {
            canvas2 = canvas;
            canvas2.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(20.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(20.0f) : 0), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.g6.f23175k0);
        } else {
            canvas2 = canvas;
        }
        int i10 = this.f25236c;
        if (i10 != 0) {
            d.setColor(i10);
            canvas2.drawCircle(LocaleController.isRTL ? AndroidUtilities.dp(33.0f) : getMeasuredWidth() - AndroidUtilities.dp(33.0f), getMeasuredHeight() / 2, AndroidUtilities.dp(10.0f), d);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f) + (this.f25235b ? 1 : 0), 1073741824));
    }
}
