package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.rl;
import org.telegram.ui.Components.RadioButton;

public final class r2 extends FrameLayout {

    public int f25201a;

    public TextView f25202b;

    public TextView f25203c;
    public RadioButton d;

    public boolean f25204e;

    public final void a(boolean z10, boolean z11) {
        RadioButton radioButton = this.d;
        TextView textView = this.f25203c;
        TextView textView2 = this.f25202b;
        setEnabled(z10);
        if (z11) {
            textView2.animate().alpha(z10 ? 1.0f : 0.5f).start();
            textView.animate().alpha(z10 ? 1.0f : 0.5f).start();
            radioButton.animate().alpha(z10 ? 1.0f : 0.5f).start();
        } else {
            textView2.setAlpha(z10 ? 1.0f : 0.5f);
            textView.setAlpha(z10 ? 1.0f : 0.5f);
            radioButton.setAlpha(z10 ? 1.0f : 0.5f);
        }
    }

    public final void b() {
        FrameLayout.LayoutParams layoutParamsD;
        FrameLayout.LayoutParams layoutParamsD2;
        TextView textView = this.f25202b;
        TextView textView2 = this.f25203c;
        if (textView2.getVisibility() == 0) {
            boolean z10 = LocaleController.isRTL;
            layoutParamsD = h7.z5.d(-1, -1.0f, (z10 ? 5 : 3) | 48, z10 ? 23.0f : 61.0f, 0.0f, z10 ? 61.0f : 23.0f, 0.0f);
        } else {
            boolean z11 = LocaleController.isRTL;
            layoutParamsD = h7.z5.d(-1, -1.0f, (z11 ? 5 : 3) | 48, z11 ? 61.0f : 23.0f, 0.0f, z11 ? 23.0f : 61.0f, 0.0f);
        }
        textView.setLayoutParams(layoutParamsD);
        RadioButton radioButton = this.d;
        if (textView2.getVisibility() == 0) {
            layoutParamsD2 = h7.z5.d(22, 22.0f, (LocaleController.isRTL ? 5 : 3) | 48, 20.0f, 15.0f, 20.0f, 0.0f);
        } else {
            layoutParamsD2 = h7.z5.d(22, 22.0f, (LocaleController.isRTL ? 3 : 5) | 48, 20.0f, 15.0f, 20.0f, 0.0f);
        }
        radioButton.setLayoutParams(layoutParamsD2);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f25204e) {
            canvas.drawLine(AndroidUtilities.dp(LocaleController.isRTL ? 0.0f : 23.0f), getHeight() - 1, getMeasuredWidth() - AndroidUtilities.dp(LocaleController.isRTL ? 23.0f : 0.0f), getHeight() - 1, org.telegram.ui.ActionBar.g6.f23175k0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(50.0f) + (this.f25204e ? 1 : 0));
        int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        TextView textView = this.f25203c;
        int iDp = measuredWidth - AndroidUtilities.dp((textView.getVisibility() == 0 ? 12 : 0) + 84);
        this.d.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(22.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(22.0f), 1073741824));
        if (textView.getVisibility() == 0) {
            textView.measure(View.MeasureSpec.makeMeasureSpec(iDp, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
            iDp = rl.u(12.0f, textView.getMeasuredWidth(), iDp);
        }
        this.f25202b.measure(View.MeasureSpec.makeMeasureSpec(iDp, 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
    }

    public void setTextColor(int i10) {
        this.f25202b.setTextColor(i10);
    }
}
