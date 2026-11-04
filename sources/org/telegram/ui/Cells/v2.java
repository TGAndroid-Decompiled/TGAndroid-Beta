package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.TextView;
import b8.mf;
import org.telegram.messenger.bd;
import org.telegram.ui.Components.RadioButton;
public final class v2 extends FrameLayout {
    public int f30714a;
    public TextView f30715b;
    public TextView f30716c;
    public RadioButton d;
    public boolean f30717e;
    public int f30718f;

    public final void a(boolean z10, boolean z11) {
        float f10;
        float f11;
        float f12;
        float f13;
        RadioButton radioButton = this.d;
        TextView textView = this.f30716c;
        TextView textView2 = this.f30715b;
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
        int i3;
        float f10;
        FrameLayout.LayoutParams d;
        FrameLayout.LayoutParams d10;
        int i10;
        float f11;
        TextView textView = this.f30715b;
        TextView textView2 = this.f30716c;
        float f12 = 61.0f;
        int i11 = 3;
        if (textView2.getVisibility() == 0) {
            boolean z10 = bd.f21784a0;
            if (z10) {
                i10 = 5;
            } else {
                i10 = 3;
            }
            int i12 = i10 | 48;
            if (z10) {
                f11 = this.f30718f;
            } else {
                f11 = 61.0f;
            }
            if (!z10) {
                f12 = this.f30718f;
            }
            d = mf.d(-1, -1.0f, i12, f11, 0.0f, f12, 0.0f);
        } else {
            boolean z11 = bd.f21784a0;
            if (z11) {
                i3 = 5;
            } else {
                i3 = 3;
            }
            int i13 = i3 | 48;
            if (z11) {
                f10 = 61.0f;
            } else {
                f10 = this.f30718f;
            }
            if (z11) {
                f12 = this.f30718f;
            }
            d = mf.d(-1, -1.0f, i13, f10, 0.0f, f12, 0.0f);
        }
        textView.setLayoutParams(d);
        RadioButton radioButton = this.d;
        if (textView2.getVisibility() == 0) {
            if (bd.f21784a0) {
                i11 = 5;
            }
            d10 = mf.d(22, 22.0f, i11 | 48, 20.0f, 15.0f, 20.0f, 0.0f);
        } else {
            if (!bd.f21784a0) {
                i11 = 5;
            }
            d10 = mf.d(22, 22.0f, i11 | 48, 20.0f, 15.0f, 20.0f, 0.0f);
        }
        radioButton.setLayoutParams(d10);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        if (this.f30717e) {
            float f11 = 0.0f;
            if (bd.f21784a0) {
                f10 = 0.0f;
            } else {
                f10 = this.f30718f;
            }
            float L = org.telegram.messenger.g0.L(f10);
            float height = getHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (bd.f21784a0) {
                f11 = this.f30718f;
            }
            canvas.drawLine(L, height, measuredWidth - org.telegram.messenger.g0.L(f11), getHeight() - 1, org.telegram.ui.ActionBar.k6.f28002k0);
        }
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        int i11;
        setMeasuredDimension(View.MeasureSpec.getSize(i3), org.telegram.messenger.g0.L(50.0f) + (this.f30717e ? 1 : 0));
        int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        int i12 = this.f30718f + 61;
        TextView textView = this.f30716c;
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
        this.f30715b.measure(View.MeasureSpec.makeMeasureSpec(L, 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
    }

    public void setHorizontalPadding(int i3) {
        TextView textView = this.f30716c;
        if (this.f30718f != i3) {
            this.f30718f = i3;
            float f10 = i3;
            ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(f10);
            ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(f10);
            b();
        }
    }

    public void setTextColor(int i3) {
        this.f30715b.setTextColor(i3);
    }
}
