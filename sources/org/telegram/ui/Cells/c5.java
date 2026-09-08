package org.telegram.ui.Cells;

import android.animation.ObjectAnimator;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.wl;
public abstract class c5 extends FrameLayout {
    public TextView f21706a;
    public TextView f21707b;
    public j0 f21708c;
    public long d;

    public final void a(ArrayList arrayList, boolean z10) {
        float f7;
        float f10;
        float f11;
        float f12;
        TextView textView = this.f21707b;
        j0 j0Var = this.f21708c;
        TextView textView2 = this.f21706a;
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
            arrayList.add(ObjectAnimator.ofFloat(j0Var, "alpha", f12));
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
        j0Var.setAlpha(f10);
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
        float dp;
        int i10;
        if (LocaleController.isRTL) {
            dp = 0.0f;
        } else {
            dp = AndroidUtilities.dp(20.0f);
        }
        float measuredHeight = getMeasuredHeight() - 1;
        int measuredWidth = getMeasuredWidth();
        if (LocaleController.isRTL) {
            i10 = AndroidUtilities.dp(20.0f);
        } else {
            i10 = 0;
        }
        canvas.drawLine(dp, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.j6.f20812k0);
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
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(80.0f), 1073741824));
        setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(80.0f));
        int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(42.0f);
        TextView textView = this.f21707b;
        textView.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), 1073741824));
        this.f21706a.measure(View.MeasureSpec.makeMeasureSpec(i2.g.f(8.0f, measuredWidth - textView.getMeasuredWidth(), AndroidUtilities.dp(10.0f)), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), 1073741824));
        this.f21708c.measure(wl.d(20.0f, getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), 1073741824));
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
        float f7;
        float f10;
        this.d = j3;
        this.f21707b.setText(LocaleController.formatString("AutodownloadSizeLimitUpTo", R.string.AutodownloadSizeLimitUpTo, AndroidUtilities.formatFileSize(j3)));
        long j10 = j3 - 512000;
        if (j10 < 536576) {
            f10 = Math.max(0.0f, ((float) j10) / 536576.0f) * 0.25f;
        } else {
            long j11 = j3 - 1048576;
            if (j11 < 9437184) {
                f10 = (Math.max(0.0f, ((float) j11) / 9437184.0f) * 0.25f) + 0.25f;
            } else {
                long j12 = j3 - 10485760;
                if (j12 < 94371840) {
                    max = Math.max(0.0f, ((float) j12) / 9.437184E7f) * 0.25f;
                    f7 = 0.5f;
                } else {
                    max = Math.max(0.0f, ((float) (j3 - 104857600)) / 1.9922944E9f) * 0.25f;
                    f7 = 0.75f;
                }
                f10 = max + f7;
            }
        }
        this.f21708c.setProgress(Math.min(1.0f, f10));
    }

    public void setText(String str) {
        this.f21706a.setText(str);
    }
}
