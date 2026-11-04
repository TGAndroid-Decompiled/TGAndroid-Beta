package org.telegram.ui.Cells;

import android.animation.ObjectAnimator;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.bd;
public abstract class b5 extends FrameLayout {
    public TextView f28989a;
    public TextView f28990b;
    public h0 f28991c;
    public long d;

    public final void a(ArrayList arrayList, boolean z10) {
        float f10;
        float f11;
        float f12;
        float f13;
        TextView textView = this.f28990b;
        h0 h0Var = this.f28991c;
        TextView textView2 = this.f28989a;
        super.setEnabled(z10);
        float f14 = 0.5f;
        if (arrayList != null) {
            if (z10) {
                f12 = 1.0f;
            } else {
                f12 = 0.5f;
            }
            arrayList.add(ObjectAnimator.ofFloat(textView2, "alpha", f12));
            if (z10) {
                f13 = 1.0f;
            } else {
                f13 = 0.5f;
            }
            arrayList.add(ObjectAnimator.ofFloat(h0Var, "alpha", f13));
            if (z10) {
                f14 = 1.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(textView, "alpha", f14));
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
        h0Var.setAlpha(f11);
        if (z10) {
            f14 = 1.0f;
        }
        textView.setAlpha(f14);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public long getSize() {
        return this.d;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float L;
        int i3;
        if (bd.f21784a0) {
            L = 0.0f;
        } else {
            L = org.telegram.messenger.g0.L(20.0f);
        }
        float f10 = L;
        float measuredHeight = getMeasuredHeight() - 1;
        int measuredWidth = getMeasuredWidth();
        if (bd.f21784a0) {
            i3 = org.telegram.messenger.g0.L(20.0f);
        } else {
            i3 = 0;
        }
        canvas.drawLine(f10, measuredHeight, measuredWidth - i3, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.f28002k0);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(80.0f), 1073741824));
        setMeasuredDimension(View.MeasureSpec.getSize(i3), org.telegram.messenger.g0.L(80.0f));
        int measuredWidth = getMeasuredWidth() - org.telegram.messenger.g0.L(42.0f);
        TextView textView = this.f28990b;
        textView.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(30.0f), 1073741824));
        this.f28989a.measure(View.MeasureSpec.makeMeasureSpec(k2.p1.d(8.0f, measuredWidth - textView.getMeasuredWidth(), org.telegram.messenger.g0.L(10.0f)), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(30.0f), 1073741824));
        this.f28991c.measure(org.telegram.messenger.camera.q.c(20.0f, getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(30.0f), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setSize(long j10) {
        float max;
        float f10;
        float f11;
        this.d = j10;
        this.f28990b.setText(bd.a0("AutodownloadSizeLimitUpTo", null, 2131753772, org.telegram.messenger.g0.i0(j10, false, false)));
        long j11 = j10 - 512000;
        if (j11 < 536576) {
            f11 = Math.max(0.0f, ((float) j11) / 536576.0f) * 0.25f;
        } else {
            long j12 = j10 - 1048576;
            if (j12 < 9437184) {
                f11 = (Math.max(0.0f, ((float) j12) / 9437184.0f) * 0.25f) + 0.25f;
            } else {
                long j13 = j10 - 10485760;
                if (j13 < 94371840) {
                    max = Math.max(0.0f, ((float) j13) / 9.437184E7f) * 0.25f;
                    f10 = 0.5f;
                } else {
                    max = Math.max(0.0f, ((float) (j10 - 104857600)) / 1.9922944E9f) * 0.25f;
                    f10 = 0.75f;
                }
                f11 = max + f10;
            }
        }
        this.f28991c.setProgress(Math.min(1.0f, f11));
    }

    public void setText(String str) {
        this.f28989a.setText(str);
    }
}
