package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.wl;
import org.telegram.ui.Components.RadioButton;
public final class t2 extends FrameLayout {
    public int f23255a;
    public TextView f23256b;
    public TextView f23257c;
    public RadioButton d;
    public boolean f23258e;

    public final void a(boolean z10, boolean z11) {
        float f7;
        float f10;
        float f11;
        float f12;
        RadioButton radioButton = this.d;
        TextView textView = this.f23257c;
        TextView textView2 = this.f23256b;
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
        FrameLayout.LayoutParams d;
        FrameLayout.LayoutParams d10;
        int i11;
        float f11;
        float f12;
        TextView textView = this.f23256b;
        TextView textView2 = this.f23257c;
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
            d = w7.x5.d(-1, -1.0f, i13, f11, 0.0f, f12, 0.0f);
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
            d = w7.x5.d(-1, -1.0f, i14, f7, 0.0f, f10, 0.0f);
        }
        textView.setLayoutParams(d);
        RadioButton radioButton = this.d;
        if (textView2.getVisibility() == 0) {
            if (LocaleController.isRTL) {
                i12 = 5;
            }
            d10 = w7.x5.d(22, 22.0f, i12 | 48, 20.0f, 15.0f, 20.0f, 0.0f);
        } else {
            if (!LocaleController.isRTL) {
                i12 = 5;
            }
            d10 = w7.x5.d(22, 22.0f, i12 | 48, 20.0f, 15.0f, 20.0f, 0.0f);
        }
        radioButton.setLayoutParams(d10);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f7;
        if (this.f23258e) {
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
            canvas.drawLine(dp, height, measuredWidth - AndroidUtilities.dp(f10), getHeight() - 1, org.telegram.ui.ActionBar.j6.f20812k0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(50.0f) + (this.f23258e ? 1 : 0));
        int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        TextView textView = this.f23257c;
        if (textView.getVisibility() == 0) {
            i12 = 12;
        } else {
            i12 = 0;
        }
        int dp = measuredWidth - AndroidUtilities.dp(i12 + 84);
        this.d.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(22.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(22.0f), 1073741824));
        if (textView.getVisibility() == 0) {
            textView.measure(View.MeasureSpec.makeMeasureSpec(dp, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
            dp = wl.v(12.0f, textView.getMeasuredWidth(), dp);
        }
        this.f23256b.measure(View.MeasureSpec.makeMeasureSpec(dp, 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
    }

    public void setTextColor(int i10) {
        this.f23256b.setTextColor(i10);
    }
}
