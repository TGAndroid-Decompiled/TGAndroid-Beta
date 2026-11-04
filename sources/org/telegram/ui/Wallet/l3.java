package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.ui.yg0;
public final class l3 extends FrameLayout {
    public final n3 f42779a;

    public l3(n3 n3Var, Context context) {
        super(context);
        this.f42779a = n3Var;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        f6 f6Var;
        n3 n3Var = this.f42779a;
        if (view == n3Var.f42919r && n3Var.K > 0.0f) {
            n3Var.O.set(0.0f, 0.0f, f6Var.getWidth(), n3Var.f42919r.getHeight());
            n3Var.f42919r.getMatrix().mapRect(n3Var.O);
            n3Var.O.offset(n3Var.f42919r.getLeft(), n3Var.f42919r.getTop());
            n3Var.O.inset(-org.telegram.messenger.g0.L(4.0f), -org.telegram.messenger.g0.L(4.0f));
            float L = org.telegram.messenger.g0.L(28.0f);
            RectF rectF = n3Var.O;
            if (rectF.top < n3Var.K + L && rectF.intersect(0.0f, 0.0f, getWidth(), getHeight())) {
                int saveLayer = canvas.saveLayer(n3Var.O, null);
                boolean drawChild = super.drawChild(canvas, view, j10);
                RectF rectF2 = n3Var.N;
                RectF rectF3 = n3Var.O;
                rectF2.set(rectF3.left, rectF3.top, rectF3.right, Math.min(rectF3.bottom, n3Var.K));
                if (n3Var.N.height() > 0.0f) {
                    canvas.drawRect(n3Var.N, n3Var.M.D(1.0f, 1));
                }
                RectF rectF4 = n3Var.N;
                RectF rectF5 = n3Var.O;
                float f10 = rectF5.left;
                float f11 = n3Var.K;
                rectF4.set(f10, f11, rectF5.right, L + f11);
                n3Var.M.w(canvas, n3Var.N, 1, 1.0f);
                canvas.restoreToCount(saveLayer);
                return drawChild;
            }
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        int i13;
        int i14;
        n3 n3Var = this.f42779a;
        TextView textView = n3Var.f42922x;
        yg0 yg0Var = n3Var.f42921w;
        f6 f6Var = n3Var.f42919r;
        getLocationOnScreen(n3Var.W);
        int i15 = n3Var.I.f14495a;
        int width = getWidth();
        i0.b bVar = n3Var.I;
        int e10 = k2.p1.e(width - bVar.f14495a, bVar.f14497c, 2, i15);
        int height = (getHeight() - n3Var.I.d) - org.telegram.messenger.g0.L(16.0f);
        if (n3Var.c()) {
            i13 = yg0Var.getMeasuredHeight();
        } else {
            i13 = 0;
        }
        int i16 = height - i13;
        yg0Var.layout(e10 - (yg0Var.getMeasuredWidth() / 2), i16, ((yg0Var.getMeasuredWidth() + 1) / 2) + e10, yg0Var.getMeasuredHeight() + i16);
        int L = org.telegram.messenger.g0.L(36.0f) + Math.max(n3Var.I.f14496b, org.telegram.messenger.g0.f22602m);
        textView.layout(e10 - (textView.getMeasuredWidth() / 2), L, ((textView.getMeasuredWidth() + 1) / 2) + e10, textView.getMeasuredHeight() + L);
        n3Var.d();
        int L2 = org.telegram.messenger.g0.L(24.0f) + Math.max(n3Var.I.f14496b, org.telegram.messenger.g0.f22602m);
        if (textView.getVisibility() == 0) {
            i14 = textView.getMeasuredHeight() + org.telegram.messenger.g0.L(12.0f);
        } else {
            i14 = 0;
        }
        int i17 = i14 + L2;
        int max = Math.max(i17, Math.min(Math.max(i17, (i16 - org.telegram.messenger.g0.L(24.0f)) - f6Var.getMeasuredHeight()), (getHeight() - f6Var.getMeasuredHeight()) / 2));
        int measuredWidth = e10 - (f6Var.getMeasuredWidth() / 2);
        f6Var.layout(measuredWidth, max, f6Var.getMeasuredWidth() + measuredWidth, f6Var.getMeasuredHeight() + max);
        n3Var.f42920s.layout(0, 0, getWidth(), getHeight());
        n3Var.f42918n.layout(0, 0, getWidth(), getHeight());
        jh.d.c(n3Var.F, this);
        n3Var.e();
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        int i11;
        int size = View.MeasureSpec.getSize(i3);
        int size2 = View.MeasureSpec.getSize(i10);
        setMeasuredDimension(size, size2);
        n3 n3Var = this.f42779a;
        f6 f6Var = n3Var.f42919r;
        i0.b bVar = n3Var.I;
        int max = Math.max(1, (size - bVar.f14495a) - bVar.f14497c);
        n3Var.f42921w.measure(View.MeasureSpec.makeMeasureSpec(Math.max(1, max - org.telegram.messenger.g0.L(24.0f)), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(60.0f), 1073741824));
        TextView textView = n3Var.f42922x;
        float f10 = 48.0f;
        textView.measure(View.MeasureSpec.makeMeasureSpec(Math.max(1, max - org.telegram.messenger.g0.L(48.0f)), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
        int min = Math.min(org.telegram.messenger.g0.L(420.0f), Math.max(1, max - org.telegram.messenger.g0.L(24.0f)));
        int max2 = (size2 - Math.max(n3Var.I.f14496b, org.telegram.messenger.g0.f22602m)) - n3Var.I.d;
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
        n3Var.f42920s.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        n3Var.f42918n.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }
}
