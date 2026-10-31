package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.cd;
import org.telegram.messenger.z20;
import org.telegram.ui.Components.RadioButton;
public final class x2 extends FrameLayout {
    public int f23565a;
    public TextView f23566b;
    public TextView f23567c;
    public RadioButton d;
    public boolean e;
    public int f23568f;

    public final void a(boolean z10, boolean z11) {
        float f7;
        float f10;
        float f11;
        float f12;
        RadioButton radioButton = this.d;
        TextView textView = this.f23567c;
        TextView textView2 = this.f23566b;
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
        FrameLayout.LayoutParams d;
        FrameLayout.LayoutParams d10;
        int i11;
        float f10;
        TextView textView = this.f23566b;
        TextView textView2 = this.f23567c;
        float f11 = 61.0f;
        int i12 = 3;
        if (textView2.getVisibility() == 0) {
            boolean z10 = cd.X;
            if (z10) {
                i11 = 5;
            } else {
                i11 = 3;
            }
            int i13 = i11 | 48;
            if (z10) {
                f10 = this.f23568f;
            } else {
                f10 = 61.0f;
            }
            if (!z10) {
                f11 = this.f23568f;
            }
            d = w7.b6.d(-1, -1.0f, i13, f10, 0.0f, f11, 0.0f);
        } else {
            boolean z11 = cd.X;
            if (z11) {
                i10 = 5;
            } else {
                i10 = 3;
            }
            int i14 = i10 | 48;
            if (z11) {
                f7 = 61.0f;
            } else {
                f7 = this.f23568f;
            }
            if (z11) {
                f11 = this.f23568f;
            }
            d = w7.b6.d(-1, -1.0f, i14, f7, 0.0f, f11, 0.0f);
        }
        textView.setLayoutParams(d);
        RadioButton radioButton = this.d;
        if (textView2.getVisibility() == 0) {
            if (cd.X) {
                i12 = 5;
            }
            d10 = w7.b6.d(22, 22.0f, i12 | 48, 20.0f, 15.0f, 20.0f, 0.0f);
        } else {
            if (!cd.X) {
                i12 = 5;
            }
            d10 = w7.b6.d(22, 22.0f, i12 | 48, 20.0f, 15.0f, 20.0f, 0.0f);
        }
        radioButton.setLayoutParams(d10);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f7;
        if (this.e) {
            float f10 = 0.0f;
            if (cd.X) {
                f7 = 0.0f;
            } else {
                f7 = this.f23568f;
            }
            float L = org.telegram.messenger.i0.L(f7);
            float height = getHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (cd.X) {
                f10 = this.f23568f;
            }
            canvas.drawLine(L, height, measuredWidth - org.telegram.messenger.i0.L(f10), getHeight() - 1, org.telegram.ui.ActionBar.t6.f21052k0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        setMeasuredDimension(View.MeasureSpec.getSize(i10), org.telegram.messenger.i0.L(50.0f) + (this.e ? 1 : 0));
        int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        int i13 = this.f23568f + 61;
        TextView textView = this.f23567c;
        if (textView.getVisibility() == 0) {
            i12 = 12;
        } else {
            i12 = 0;
        }
        int L = measuredWidth - org.telegram.messenger.i0.L(i13 + i12);
        this.d.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(22.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(22.0f), 1073741824));
        if (textView.getVisibility() == 0) {
            textView.measure(View.MeasureSpec.makeMeasureSpec(L, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
            L = z20.w(12.0f, textView.getMeasuredWidth(), L);
        }
        this.f23566b.measure(View.MeasureSpec.makeMeasureSpec(L, 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
    }

    public void setHorizontalPadding(int i10) {
        TextView textView = this.f23567c;
        if (this.f23568f != i10) {
            this.f23568f = i10;
            float f7 = i10;
            ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).leftMargin = org.telegram.messenger.i0.L(f7);
            ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).rightMargin = org.telegram.messenger.i0.L(f7);
            b();
        }
    }

    public void setTextColor(int i10) {
        this.f23566b.setTextColor(i10);
    }
}
