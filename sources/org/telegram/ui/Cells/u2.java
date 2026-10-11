package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.ai;
import org.telegram.ui.Components.RadioButton;
public final class u2 extends FrameLayout {
    public int f23472a;
    public TextView f23473b;
    public TextView f23474c;
    public RadioButton d;
    public boolean f23475e;

    public final void a(boolean z10, boolean z11) {
        float f7;
        float f10;
        float f11;
        float f12;
        RadioButton radioButton = this.d;
        TextView textView = this.f23474c;
        TextView textView2 = this.f23473b;
        setEnabled(z10);
        float f13 = 0.5f;
        if (z11) {
            ViewPropertyAnimator animate = textView2.animate();
            if (z10) {
                f11 = 1.0f;
            } else {
                f11 = 0.5f;
            }
            animate.alpha(f11).start();
            ViewPropertyAnimator animate2 = textView.animate();
            if (z10) {
                f12 = 1.0f;
            } else {
                f12 = 0.5f;
            }
            animate2.alpha(f12).start();
            ViewPropertyAnimator animate3 = radioButton.animate();
            if (z10) {
                f13 = 1.0f;
            }
            animate3.alpha(f13).start();
            return;
        }
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.5f;
        }
        textView2.setAlpha(f7);
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.5f;
        }
        textView.setAlpha(f10);
        if (z10) {
            f13 = 1.0f;
        }
        radioButton.setAlpha(f13);
    }

    public final void b() {
        int i10;
        float f7;
        float f10;
        FrameLayout.LayoutParams a2;
        FrameLayout.LayoutParams a10;
        int i11;
        float f11;
        float f12;
        TextView textView = this.f23473b;
        TextView textView2 = this.f23474c;
        int i12 = 3;
        if (textView2.getVisibility() == 0) {
            boolean z10 = LocaleController.isRTL;
            if (z10) {
                i11 = 5;
            } else {
                i11 = 3;
            }
            int i13 = i11 | 48;
            if (z10) {
                f11 = 23.0f;
            } else {
                f11 = 61.0f;
            }
            if (z10) {
                f12 = 61.0f;
            } else {
                f12 = 23.0f;
            }
            a2 = w7.x5.a(-1.0f, f11, 0.0f, f12, 0.0f, -1, i13);
        } else {
            boolean z11 = LocaleController.isRTL;
            if (z11) {
                i10 = 5;
            } else {
                i10 = 3;
            }
            int i14 = i10 | 48;
            if (z11) {
                f7 = 61.0f;
            } else {
                f7 = 23.0f;
            }
            if (z11) {
                f10 = 23.0f;
            } else {
                f10 = 61.0f;
            }
            a2 = w7.x5.a(-1.0f, f7, 0.0f, f10, 0.0f, -1, i14);
        }
        textView.setLayoutParams(a2);
        RadioButton radioButton = this.d;
        if (textView2.getVisibility() == 0) {
            if (LocaleController.isRTL) {
                i12 = 5;
            }
            a10 = w7.x5.a(22.0f, 20.0f, 15.0f, 20.0f, 0.0f, 22, i12 | 48);
        } else {
            if (!LocaleController.isRTL) {
                i12 = 5;
            }
            a10 = w7.x5.a(22.0f, 20.0f, 15.0f, 20.0f, 0.0f, 22, i12 | 48);
        }
        radioButton.setLayoutParams(a10);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f7;
        if (this.f23475e) {
            float f10 = 23.0f;
            if (LocaleController.isRTL) {
                f7 = 0.0f;
            } else {
                f7 = 23.0f;
            }
            float dp = AndroidUtilities.dp(f7);
            float height = getHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (!LocaleController.isRTL) {
                f10 = 0.0f;
            }
            canvas.drawLine(dp, height, measuredWidth - AndroidUtilities.dp(f10), getHeight() - 1, org.telegram.ui.ActionBar.h6.f20908k0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(50.0f) + (this.f23475e ? 1 : 0));
        int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        TextView textView = this.f23474c;
        if (textView.getVisibility() == 0) {
            i12 = 12;
        } else {
            i12 = 0;
        }
        int dp = measuredWidth - AndroidUtilities.dp(i12 + 84);
        this.d.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(22.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(22.0f), 1073741824));
        if (textView.getVisibility() == 0) {
            textView.measure(View.MeasureSpec.makeMeasureSpec(dp, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
            dp = ai.z(12.0f, textView.getMeasuredWidth(), dp);
        }
        this.f23473b.measure(View.MeasureSpec.makeMeasureSpec(dp, 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
    }

    public void setTextColor(int i10) {
        this.f23473b.setTextColor(i10);
    }
}
