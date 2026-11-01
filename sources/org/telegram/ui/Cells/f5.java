package org.telegram.ui.Cells;

import android.animation.ObjectAnimator;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.a30;
import org.telegram.messenger.dd;
public abstract class f5 extends FrameLayout {
    public TextView f21895a;
    public TextView f21896b;
    public h0 f21897c;
    public long d;

    public final void a(ArrayList arrayList, boolean z10) {
        float f7;
        float f10;
        float f11;
        float f12;
        TextView textView = this.f21896b;
        h0 h0Var = this.f21897c;
        TextView textView2 = this.f21895a;
        super.setEnabled(z10);
        float f13 = 0.5f;
        if (arrayList != null) {
            if (z10) {
                f11 = 1.0f;
            } else {
                f11 = 0.5f;
            }
            arrayList.add(ObjectAnimator.ofFloat(textView2, "alpha", f11));
            if (z10) {
                f12 = 1.0f;
            } else {
                f12 = 0.5f;
            }
            arrayList.add(ObjectAnimator.ofFloat(h0Var, "alpha", f12));
            if (z10) {
                f13 = 1.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(textView, "alpha", f13));
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
        h0Var.setAlpha(f10);
        if (z10) {
            f13 = 1.0f;
        }
        textView.setAlpha(f13);
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
        int i10;
        if (dd.X) {
            L = 0.0f;
        } else {
            L = org.telegram.messenger.i0.L(20.0f);
        }
        float f7 = L;
        float measuredHeight = getMeasuredHeight() - 1;
        int measuredWidth = getMeasuredWidth();
        if (dd.X) {
            i10 = org.telegram.messenger.i0.L(20.0f);
        } else {
            i10 = 0;
        }
        canvas.drawLine(f7, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.t6.f21053k0);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(80.0f), 1073741824));
        setMeasuredDimension(View.MeasureSpec.getSize(i10), org.telegram.messenger.i0.L(80.0f));
        int measuredWidth = getMeasuredWidth() - org.telegram.messenger.i0.L(42.0f);
        TextView textView = this.f21896b;
        textView.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(30.0f), 1073741824));
        this.f21895a.measure(View.MeasureSpec.makeMeasureSpec(i0.a.d(8.0f, measuredWidth - textView.getMeasuredWidth(), org.telegram.messenger.i0.L(10.0f)), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(30.0f), 1073741824));
        this.f21897c.measure(a30.c(20.0f, getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(30.0f), 1073741824));
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
        float f7;
        float f10;
        this.d = j10;
        this.f21896b.setText(dd.a0("AutodownloadSizeLimitUpTo", null, 2131753772, org.telegram.messenger.i0.i0(j10, false, false)));
        long j11 = j10 - 512000;
        if (j11 < 536576) {
            f10 = Math.max(0.0f, ((float) j11) / 536576.0f) * 0.25f;
        } else {
            long j12 = j10 - 1048576;
            if (j12 < 9437184) {
                f10 = (Math.max(0.0f, ((float) j12) / 9437184.0f) * 0.25f) + 0.25f;
            } else {
                long j13 = j10 - 10485760;
                if (j13 < 94371840) {
                    max = Math.max(0.0f, ((float) j13) / 9.437184E7f) * 0.25f;
                    f7 = 0.5f;
                } else {
                    max = Math.max(0.0f, ((float) (j10 - 104857600)) / 1.9922944E9f) * 0.25f;
                    f7 = 0.75f;
                }
                f10 = max + f7;
            }
        }
        this.f21897c.setProgress(Math.min(1.0f, f10));
    }

    public void setText(String str) {
        this.f21895a.setText(str);
    }
}
