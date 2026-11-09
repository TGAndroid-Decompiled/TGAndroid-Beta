package org.telegram.ui.Cells;

import android.animation.ObjectAnimator;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.id;
public abstract class b5 extends FrameLayout {
    public TextView f28937a;
    public TextView f28938b;
    public h0 f28939c;
    public long d;

    public final void a(ArrayList arrayList, boolean z9) {
        float f10;
        float f11;
        float f12;
        float f13;
        TextView textView = this.f28938b;
        h0 h0Var = this.f28939c;
        TextView textView2 = this.f28937a;
        super.setEnabled(z9);
        float f14 = 0.5f;
        if (arrayList != null) {
            if (z9) {
                f12 = 1.0f;
            } else {
                f12 = 0.5f;
            }
            arrayList.add(ObjectAnimator.ofFloat(textView2, "alpha", f12));
            if (z9) {
                f13 = 1.0f;
            } else {
                f13 = 0.5f;
            }
            arrayList.add(ObjectAnimator.ofFloat(h0Var, "alpha", f13));
            if (z9) {
                f14 = 1.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(textView, "alpha", f14));
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
        h0Var.setAlpha(f11);
        if (z9) {
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
        int i7;
        if (id.f23157a0) {
            L = 0.0f;
        } else {
            L = org.telegram.messenger.g0.L(20.0f);
        }
        float f10 = L;
        float measuredHeight = getMeasuredHeight() - 1;
        int measuredWidth = getMeasuredWidth();
        if (id.f23157a0) {
            i7 = org.telegram.messenger.g0.L(20.0f);
        } else {
            i7 = 0;
        }
        canvas.drawLine(f10, measuredHeight, measuredWidth - i7, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.l6.f27988k0);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(80.0f), 1073741824));
        setMeasuredDimension(View.MeasureSpec.getSize(i7), org.telegram.messenger.g0.L(80.0f));
        int measuredWidth = getMeasuredWidth() - org.telegram.messenger.g0.L(42.0f);
        TextView textView = this.f28938b;
        textView.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(30.0f), 1073741824));
        this.f28937a.measure(View.MeasureSpec.makeMeasureSpec(jg.g.e(8.0f, measuredWidth - textView.getMeasuredWidth(), org.telegram.messenger.g0.L(10.0f)), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(30.0f), 1073741824));
        this.f28939c.measure(org.telegram.messenger.camera.q.c(20.0f, getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(30.0f), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setSize(long j3) {
        float max;
        float f10;
        float f11;
        this.d = j3;
        this.f28938b.setText(id.a0("AutodownloadSizeLimitUpTo", null, 2131753772, org.telegram.messenger.g0.i0(j3, false, false)));
        long j10 = j3 - 512000;
        if (j10 < 536576) {
            f11 = Math.max(0.0f, ((float) j10) / 536576.0f) * 0.25f;
        } else {
            long j11 = j3 - 1048576;
            if (j11 < 9437184) {
                f11 = (Math.max(0.0f, ((float) j11) / 9437184.0f) * 0.25f) + 0.25f;
            } else {
                long j12 = j3 - 10485760;
                if (j12 < 94371840) {
                    max = Math.max(0.0f, ((float) j12) / 9.437184E7f) * 0.25f;
                    f10 = 0.5f;
                } else {
                    max = Math.max(0.0f, ((float) (j3 - 104857600)) / 1.9922944E9f) * 0.25f;
                    f10 = 0.75f;
                }
                f11 = max + f10;
            }
        }
        this.f28939c.setProgress(Math.min(1.0f, f11));
    }

    public void setText(String str) {
        this.f28937a.setText(str);
    }
}
