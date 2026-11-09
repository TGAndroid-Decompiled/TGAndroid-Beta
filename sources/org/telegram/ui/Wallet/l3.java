package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.ui.uq0;
public final class l3 extends FrameLayout {
    public final n3 f42718a;

    public l3(n3 n3Var, Context context) {
        super(context);
        this.f42718a = n3Var;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        f6 f6Var;
        n3 n3Var = this.f42718a;
        if (view == n3Var.f42866r && n3Var.J > 0.0f) {
            n3Var.N.set(0.0f, 0.0f, f6Var.getWidth(), n3Var.f42866r.getHeight());
            n3Var.f42866r.getMatrix().mapRect(n3Var.N);
            n3Var.N.offset(n3Var.f42866r.getLeft(), n3Var.f42866r.getTop());
            n3Var.N.inset(-org.telegram.messenger.g0.L(4.0f), -org.telegram.messenger.g0.L(4.0f));
            float L = org.telegram.messenger.g0.L(28.0f);
            RectF rectF = n3Var.N;
            if (rectF.top < n3Var.J + L && rectF.intersect(0.0f, 0.0f, getWidth(), getHeight())) {
                int saveLayer = canvas.saveLayer(n3Var.N, null);
                boolean drawChild = super.drawChild(canvas, view, j3);
                RectF rectF2 = n3Var.M;
                RectF rectF3 = n3Var.N;
                rectF2.set(rectF3.left, rectF3.top, rectF3.right, Math.min(rectF3.bottom, n3Var.J));
                if (n3Var.M.height() > 0.0f) {
                    canvas.drawRect(n3Var.M, n3Var.L.u(1.0f, 1));
                }
                RectF rectF4 = n3Var.M;
                RectF rectF5 = n3Var.N;
                float f10 = rectF5.left;
                float f11 = n3Var.J;
                rectF4.set(f10, f11, rectF5.right, L + f11);
                n3Var.L.m(canvas, n3Var.M, 1, 1.0f);
                canvas.restoreToCount(saveLayer);
                return drawChild;
            }
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        int i13;
        int i14;
        n3 n3Var = this.f42718a;
        TextView textView = n3Var.f42869x;
        uq0 uq0Var = n3Var.f42868w;
        f6 f6Var = n3Var.f42866r;
        getLocationOnScreen(n3Var.V);
        int i15 = n3Var.H.f15120a;
        int width = getWidth();
        i0.b bVar = n3Var.H;
        int D = jg.g.D(width - bVar.f15120a, bVar.f15122c, 2, i15);
        int height = (getHeight() - n3Var.H.d) - org.telegram.messenger.g0.L(16.0f);
        if (n3Var.c()) {
            i13 = uq0Var.getMeasuredHeight();
        } else {
            i13 = 0;
        }
        int i16 = height - i13;
        uq0Var.layout(D - (uq0Var.getMeasuredWidth() / 2), i16, ((uq0Var.getMeasuredWidth() + 1) / 2) + D, uq0Var.getMeasuredHeight() + i16);
        int L = org.telegram.messenger.g0.L(36.0f) + Math.max(n3Var.H.f15121b, org.telegram.messenger.g0.f22557m);
        textView.layout(D - (textView.getMeasuredWidth() / 2), L, ((textView.getMeasuredWidth() + 1) / 2) + D, textView.getMeasuredHeight() + L);
        n3Var.d();
        int L2 = org.telegram.messenger.g0.L(24.0f) + Math.max(n3Var.H.f15121b, org.telegram.messenger.g0.f22557m);
        if (textView.getVisibility() == 0) {
            i14 = textView.getMeasuredHeight() + org.telegram.messenger.g0.L(12.0f);
        } else {
            i14 = 0;
        }
        int i17 = i14 + L2;
        int max = Math.max(i17, Math.min(Math.max(i17, (i16 - org.telegram.messenger.g0.L(24.0f)) - f6Var.getMeasuredHeight()), (getHeight() - f6Var.getMeasuredHeight()) / 2));
        int measuredWidth = D - (f6Var.getMeasuredWidth() / 2);
        f6Var.layout(measuredWidth, max, f6Var.getMeasuredWidth() + measuredWidth, f6Var.getMeasuredHeight() + max);
        n3Var.f42867s.layout(0, 0, getWidth(), getHeight());
        n3Var.f42865n.layout(0, 0, getWidth(), getHeight());
        ih.d.c(n3Var.E, this);
        n3Var.e();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        setMeasuredDimension(size, size2);
        n3 n3Var = this.f42718a;
        f6 f6Var = n3Var.f42866r;
        i0.b bVar = n3Var.H;
        int max = Math.max(1, (size - bVar.f15120a) - bVar.f15122c);
        n3Var.f42868w.measure(View.MeasureSpec.makeMeasureSpec(Math.max(1, max - org.telegram.messenger.g0.L(24.0f)), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(60.0f), 1073741824));
        TextView textView = n3Var.f42869x;
        float f10 = 48.0f;
        textView.measure(View.MeasureSpec.makeMeasureSpec(Math.max(1, max - org.telegram.messenger.g0.L(48.0f)), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
        int min = Math.min(org.telegram.messenger.g0.L(420.0f), Math.max(1, max - org.telegram.messenger.g0.L(24.0f)));
        int max2 = (size2 - Math.max(n3Var.H.f15121b, org.telegram.messenger.g0.f22557m)) - n3Var.H.d;
        if (n3Var.c()) {
            f10 = 120.0f;
        }
        int L = max2 - org.telegram.messenger.g0.L(f10);
        if (textView.getVisibility() == 0) {
            i11 = textView.getMeasuredHeight() + org.telegram.messenger.g0.L(12.0f);
        } else {
            i11 = 0;
        }
        int max3 = Math.max(1, L - i11);
        f6Var.measure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        if (f6Var.getMeasuredHeight() > max3) {
            int paddingRight = f6Var.getPaddingRight() + f6Var.getPaddingLeft();
            int paddingBottom = f6Var.getPaddingBottom() + f6Var.getPaddingTop();
            f6Var.measure(View.MeasureSpec.makeMeasureSpec(Math.max(1, Math.round((Math.max(0, max3 - paddingBottom) * (min - paddingRight)) / Math.max(1, f6Var.getMeasuredHeight() - paddingBottom)) + paddingRight), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        }
        n3Var.f42867s.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        n3Var.f42865n.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }
}
