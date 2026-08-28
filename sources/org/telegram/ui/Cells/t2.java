package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.ll;
import org.telegram.ui.Components.RadioButton;
public final class t2 extends FrameLayout {
    public int f25673a;
    public TextView f25674b;
    public TextView f25675c;
    public RadioButton d;
    public boolean f25676e;

    public final void a(boolean z10, boolean z11) {
        float f10;
        float f11;
        float f12;
        float f13;
        RadioButton radioButton = this.d;
        TextView textView = this.f25675c;
        TextView textView2 = this.f25674b;
        setEnabled(z10);
        float f14 = 0.5f;
        if (z11) {
            ViewPropertyAnimator animate = textView2.animate();
            if (z10) {
                f12 = 1.0f;
            } else {
                f12 = 0.5f;
            }
            animate.alpha(f12).start();
            ViewPropertyAnimator animate2 = textView.animate();
            if (z10) {
                f13 = 1.0f;
            } else {
                f13 = 0.5f;
            }
            animate2.alpha(f13).start();
            ViewPropertyAnimator animate3 = radioButton.animate();
            if (z10) {
                f14 = 1.0f;
            }
            animate3.alpha(f14).start();
            return;
        }
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.5f;
        }
        textView2.setAlpha(f10);
        if (z10) {
            f11 = 1.0f;
        } else {
            f11 = 0.5f;
        }
        textView.setAlpha(f11);
        if (z10) {
            f14 = 1.0f;
        }
        radioButton.setAlpha(f14);
    }

    public final void b() {
        int i9;
        float f10;
        float f11;
        FrameLayout.LayoutParams d;
        FrameLayout.LayoutParams d9;
        int i10;
        float f12;
        float f13;
        TextView textView = this.f25674b;
        TextView textView2 = this.f25675c;
        int i11 = 3;
        if (textView2.getVisibility() == 0) {
            boolean z10 = LocaleController.isRTL;
            if (z10) {
                i10 = 5;
            } else {
                i10 = 3;
            }
            int i12 = i10 | 48;
            if (z10) {
                f12 = 23.0f;
            } else {
                f12 = 61.0f;
            }
            if (z10) {
                f13 = 61.0f;
            } else {
                f13 = 23.0f;
            }
            d = g7.e6.d(-1, -1.0f, i12, f12, 0.0f, f13, 0.0f);
        } else {
            boolean z11 = LocaleController.isRTL;
            if (z11) {
                i9 = 5;
            } else {
                i9 = 3;
            }
            int i13 = i9 | 48;
            if (z11) {
                f10 = 61.0f;
            } else {
                f10 = 23.0f;
            }
            if (z11) {
                f11 = 23.0f;
            } else {
                f11 = 61.0f;
            }
            d = g7.e6.d(-1, -1.0f, i13, f10, 0.0f, f11, 0.0f);
        }
        textView.setLayoutParams(d);
        RadioButton radioButton = this.d;
        if (textView2.getVisibility() == 0) {
            if (LocaleController.isRTL) {
                i11 = 5;
            }
            d9 = g7.e6.d(22, 22.0f, i11 | 48, 20.0f, 15.0f, 20.0f, 0.0f);
        } else {
            if (!LocaleController.isRTL) {
                i11 = 5;
            }
            d9 = g7.e6.d(22, 22.0f, i11 | 48, 20.0f, 15.0f, 20.0f, 0.0f);
        }
        radioButton.setLayoutParams(d9);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        if (this.f25676e) {
            float f11 = 23.0f;
            if (LocaleController.isRTL) {
                f10 = 0.0f;
            } else {
                f10 = 23.0f;
            }
            float dp = AndroidUtilities.dp(f10);
            float height = getHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (!LocaleController.isRTL) {
                f11 = 0.0f;
            }
            canvas.drawLine(dp, height, measuredWidth - AndroidUtilities.dp(f11), getHeight() - 1, org.telegram.ui.ActionBar.f6.f23121k0);
        }
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        int i11;
        setMeasuredDimension(View.MeasureSpec.getSize(i9), AndroidUtilities.dp(50.0f) + (this.f25676e ? 1 : 0));
        int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        TextView textView = this.f25675c;
        if (textView.getVisibility() == 0) {
            i11 = 12;
        } else {
            i11 = 0;
        }
        int dp = measuredWidth - AndroidUtilities.dp(i11 + 84);
        this.d.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(22.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(22.0f), 1073741824));
        if (textView.getVisibility() == 0) {
            textView.measure(View.MeasureSpec.makeMeasureSpec(dp, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
            dp = ll.w(12.0f, textView.getMeasuredWidth(), dp);
        }
        this.f25674b.measure(View.MeasureSpec.makeMeasureSpec(dp, 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
    }

    public void setTextColor(int i9) {
        this.f25674b.setTextColor(i9);
    }
}
