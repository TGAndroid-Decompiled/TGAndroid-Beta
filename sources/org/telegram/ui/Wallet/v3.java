package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.ui.gh0;
public final class v3 extends FrameLayout {
    public final x3 f45293a;

    public v3(x3 x3Var, Context context) {
        super(context);
        this.f45293a = x3Var;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        y6 y6Var;
        x3 x3Var = this.f45293a;
        if (view == x3Var.f45378r && x3Var.K > 0.0f) {
            x3Var.O.set(0.0f, 0.0f, y6Var.getWidth(), x3Var.f45378r.getHeight());
            x3Var.f45378r.getMatrix().mapRect(x3Var.O);
            x3Var.O.offset(x3Var.f45378r.getLeft(), x3Var.f45378r.getTop());
            x3Var.O.inset(-org.telegram.messenger.g0.L(4.0f), -org.telegram.messenger.g0.L(4.0f));
            float L = org.telegram.messenger.g0.L(28.0f);
            RectF rectF = x3Var.O;
            if (rectF.top < x3Var.K + L && rectF.intersect(0.0f, 0.0f, getWidth(), getHeight())) {
                int saveLayer = canvas.saveLayer(x3Var.O, null);
                boolean drawChild = super.drawChild(canvas, view, j3);
                RectF rectF2 = x3Var.N;
                RectF rectF3 = x3Var.O;
                rectF2.set(rectF3.left, rectF3.top, rectF3.right, Math.min(rectF3.bottom, x3Var.K));
                if (x3Var.N.height() > 0.0f) {
                    canvas.drawRect(x3Var.N, x3Var.M.D(1.0f, 1));
                }
                RectF rectF4 = x3Var.N;
                RectF rectF5 = x3Var.O;
                float f10 = rectF5.left;
                float f11 = x3Var.K;
                rectF4.set(f10, f11, rectF5.right, L + f11);
                x3Var.M.u(canvas, x3Var.N, 1, 1.0f);
                canvas.restoreToCount(saveLayer);
                return drawChild;
            }
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int i13;
        int i14;
        x3 x3Var = this.f45293a;
        TextView textView = x3Var.f45381x;
        gh0 gh0Var = x3Var.f45380w;
        y6 y6Var = x3Var.f45378r;
        getLocationOnScreen(x3Var.W);
        int i15 = x3Var.I.f15978a;
        int width = getWidth();
        i0.b bVar = x3Var.I;
        int e10 = i5.c.e(width - bVar.f15978a, bVar.f15980c, 2, i15);
        int height = (getHeight() - x3Var.I.d) - org.telegram.messenger.g0.L(16.0f);
        if (x3Var.c()) {
            i13 = gh0Var.getMeasuredHeight();
        } else {
            i13 = 0;
        }
        int i16 = height - i13;
        gh0Var.layout(e10 - (gh0Var.getMeasuredWidth() / 2), i16, ((gh0Var.getMeasuredWidth() + 1) / 2) + e10, gh0Var.getMeasuredHeight() + i16);
        int L = org.telegram.messenger.g0.L(36.0f) + Math.max(x3Var.I.f15979b, org.telegram.messenger.g0.f24220m);
        textView.layout(e10 - (textView.getMeasuredWidth() / 2), L, ((textView.getMeasuredWidth() + 1) / 2) + e10, textView.getMeasuredHeight() + L);
        x3Var.d();
        int L2 = org.telegram.messenger.g0.L(24.0f) + Math.max(x3Var.I.f15979b, org.telegram.messenger.g0.f24220m);
        if (textView.getVisibility() == 0) {
            i14 = textView.getMeasuredHeight() + org.telegram.messenger.g0.L(12.0f);
        } else {
            i14 = 0;
        }
        int i17 = i14 + L2;
        int max = Math.max(i17, Math.min(Math.max(i17, (i16 - org.telegram.messenger.g0.L(24.0f)) - y6Var.getMeasuredHeight()), (getHeight() - y6Var.getMeasuredHeight()) / 2));
        int measuredWidth = e10 - (y6Var.getMeasuredWidth() / 2);
        y6Var.layout(measuredWidth, max, y6Var.getMeasuredWidth() + measuredWidth, y6Var.getMeasuredHeight() + max);
        x3Var.f45379s.layout(0, 0, getWidth(), getHeight());
        x3Var.f45377n.layout(0, 0, getWidth(), getHeight());
        ih.d.c(x3Var.F, this);
        x3Var.e();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        setMeasuredDimension(size, size2);
        x3 x3Var = this.f45293a;
        y6 y6Var = x3Var.f45378r;
        i0.b bVar = x3Var.I;
        int max = Math.max(1, (size - bVar.f15978a) - bVar.f15980c);
        x3Var.f45380w.measure(View.MeasureSpec.makeMeasureSpec(Math.max(1, max - org.telegram.messenger.g0.L(24.0f)), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(60.0f), 1073741824));
        TextView textView = x3Var.f45381x;
        float f10 = 48.0f;
        textView.measure(View.MeasureSpec.makeMeasureSpec(Math.max(1, max - org.telegram.messenger.g0.L(48.0f)), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
        int min = Math.min(org.telegram.messenger.g0.L(420.0f), Math.max(1, max - org.telegram.messenger.g0.L(24.0f)));
        int max2 = (size2 - Math.max(x3Var.I.f15979b, org.telegram.messenger.g0.f24220m)) - x3Var.I.d;
        if (x3Var.c()) {
            f10 = 120.0f;
        }
        int L = max2 - org.telegram.messenger.g0.L(f10);
        if (textView.getVisibility() == 0) {
            i11 = textView.getMeasuredHeight() + org.telegram.messenger.g0.L(12.0f);
        } else {
            i11 = 0;
        }
        int max3 = Math.max(1, L - i11);
        y6Var.measure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        if (y6Var.getMeasuredHeight() > max3) {
            int paddingRight = y6Var.getPaddingRight() + y6Var.getPaddingLeft();
            int paddingBottom = y6Var.getPaddingBottom() + y6Var.getPaddingTop();
            y6Var.measure(View.MeasureSpec.makeMeasureSpec(Math.max(1, Math.round((Math.max(0, max3 - paddingBottom) * (min - paddingRight)) / Math.max(1, y6Var.getMeasuredHeight() - paddingBottom)) + paddingRight), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        }
        x3Var.f45379s.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        x3Var.f45377n.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }
}
