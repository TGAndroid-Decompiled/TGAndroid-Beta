package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.id;
import org.telegram.ui.Components.RadioButton;
public final class v2 extends FrameLayout {
    public int f30624a;
    public TextView f30625b;
    public TextView f30626c;
    public RadioButton d;
    public boolean f30627e;
    public int f30628f;

    public final void a(boolean z9, boolean z10) {
        float f10;
        float f11;
        float f12;
        float f13;
        RadioButton radioButton = this.d;
        TextView textView = this.f30626c;
        TextView textView2 = this.f30625b;
        setEnabled(z9);
        float f14 = 0.5f;
        if (z10) {
            ViewPropertyAnimator animate = textView2.animate();
            if (z9) {
                f12 = 1.0f;
            } else {
                f12 = 0.5f;
            }
            animate.alpha(f12).start();
            ViewPropertyAnimator animate2 = textView.animate();
            if (z9) {
                f13 = 1.0f;
            } else {
                f13 = 0.5f;
            }
            animate2.alpha(f13).start();
            ViewPropertyAnimator animate3 = radioButton.animate();
            if (z9) {
                f14 = 1.0f;
            }
            animate3.alpha(f14).start();
            return;
        }
        if (z9) {
            f10 = 1.0f;
        } else {
            f10 = 0.5f;
        }
        textView2.setAlpha(f10);
        if (z9) {
            f11 = 1.0f;
        } else {
            f11 = 0.5f;
        }
        textView.setAlpha(f11);
        if (z9) {
            f14 = 1.0f;
        }
        radioButton.setAlpha(f14);
    }

    public final void b() {
        int i7;
        float f10;
        FrameLayout.LayoutParams d;
        FrameLayout.LayoutParams d2;
        int i10;
        float f11;
        TextView textView = this.f30625b;
        TextView textView2 = this.f30626c;
        float f12 = 61.0f;
        int i11 = 3;
        if (textView2.getVisibility() == 0) {
            boolean z9 = id.f23157a0;
            if (z9) {
                i10 = 5;
            } else {
                i10 = 3;
            }
            int i12 = i10 | 48;
            if (z9) {
                f11 = this.f30628f;
            } else {
                f11 = 61.0f;
            }
            if (!z9) {
                f12 = this.f30628f;
            }
            d = c8.ha.d(-1, -1.0f, i12, f11, 0.0f, f12, 0.0f);
        } else {
            boolean z10 = id.f23157a0;
            if (z10) {
                i7 = 5;
            } else {
                i7 = 3;
            }
            int i13 = i7 | 48;
            if (z10) {
                f10 = 61.0f;
            } else {
                f10 = this.f30628f;
            }
            if (z10) {
                f12 = this.f30628f;
            }
            d = c8.ha.d(-1, -1.0f, i13, f10, 0.0f, f12, 0.0f);
        }
        textView.setLayoutParams(d);
        RadioButton radioButton = this.d;
        if (textView2.getVisibility() == 0) {
            if (id.f23157a0) {
                i11 = 5;
            }
            d2 = c8.ha.d(22, 22.0f, i11 | 48, 20.0f, 15.0f, 20.0f, 0.0f);
        } else {
            if (!id.f23157a0) {
                i11 = 5;
            }
            d2 = c8.ha.d(22, 22.0f, i11 | 48, 20.0f, 15.0f, 20.0f, 0.0f);
        }
        radioButton.setLayoutParams(d2);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        if (this.f30627e) {
            float f11 = 0.0f;
            if (id.f23157a0) {
                f10 = 0.0f;
            } else {
                f10 = this.f30628f;
            }
            float L = org.telegram.messenger.g0.L(f10);
            float height = getHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (id.f23157a0) {
                f11 = this.f30628f;
            }
            canvas.drawLine(L, height, measuredWidth - org.telegram.messenger.g0.L(f11), getHeight() - 1, org.telegram.ui.ActionBar.l6.f27988k0);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        setMeasuredDimension(View.MeasureSpec.getSize(i7), org.telegram.messenger.g0.L(50.0f) + (this.f30627e ? 1 : 0));
        int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        int i12 = this.f30628f + 61;
        TextView textView = this.f30626c;
        if (textView.getVisibility() == 0) {
            i11 = 12;
        } else {
            i11 = 0;
        }
        int L = measuredWidth - org.telegram.messenger.g0.L(i12 + i11);
        this.d.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(22.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(22.0f), 1073741824));
        if (textView.getVisibility() == 0) {
            textView.measure(View.MeasureSpec.makeMeasureSpec(L, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
            L = org.telegram.messenger.camera.q.w(12.0f, textView.getMeasuredWidth(), L);
        }
        this.f30625b.measure(View.MeasureSpec.makeMeasureSpec(L, 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
    }

    public void setHorizontalPadding(int i7) {
        TextView textView = this.f30626c;
        if (this.f30628f != i7) {
            this.f30628f = i7;
            float f10 = i7;
            ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(f10);
            ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(f10);
            b();
        }
    }

    public void setTextColor(int i7) {
        this.f30625b.setTextColor(i7);
    }
}
