package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.ui.ih0;
public final class u3 extends FrameLayout {
    public final w3 f45121a;

    public u3(w3 w3Var, Context context) {
        super(context);
        this.f45121a = w3Var;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        x6 x6Var;
        w3 w3Var = this.f45121a;
        if (view == w3Var.f45206r && w3Var.K > 0.0f) {
            w3Var.O.set(0.0f, 0.0f, x6Var.getWidth(), w3Var.f45206r.getHeight());
            w3Var.f45206r.getMatrix().mapRect(w3Var.O);
            w3Var.O.offset(w3Var.f45206r.getLeft(), w3Var.f45206r.getTop());
            w3Var.O.inset(-org.telegram.messenger.g0.L(4.0f), -org.telegram.messenger.g0.L(4.0f));
            float L = org.telegram.messenger.g0.L(28.0f);
            RectF rectF = w3Var.O;
            if (rectF.top < w3Var.K + L && rectF.intersect(0.0f, 0.0f, getWidth(), getHeight())) {
                int saveLayer = canvas.saveLayer(w3Var.O, null);
                boolean drawChild = super.drawChild(canvas, view, j3);
                RectF rectF2 = w3Var.N;
                RectF rectF3 = w3Var.O;
                rectF2.set(rectF3.left, rectF3.top, rectF3.right, Math.min(rectF3.bottom, w3Var.K));
                if (w3Var.N.height() > 0.0f) {
                    canvas.drawRect(w3Var.N, w3Var.M.B(1.0f, 1));
                }
                RectF rectF4 = w3Var.N;
                RectF rectF5 = w3Var.O;
                float f10 = rectF5.left;
                float f11 = w3Var.K;
                rectF4.set(f10, f11, rectF5.right, L + f11);
                w3Var.M.n(canvas, w3Var.N, 1, 1.0f);
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
        w3 w3Var = this.f45121a;
        TextView textView = w3Var.f45209x;
        ih0 ih0Var = w3Var.f45208w;
        x6 x6Var = w3Var.f45206r;
        getLocationOnScreen(w3Var.W);
        int i15 = w3Var.I.f15889a;
        int width = getWidth();
        i0.b bVar = w3Var.I;
        int e10 = i5.c.e(width - bVar.f15889a, bVar.f15891c, 2, i15);
        int height = (getHeight() - w3Var.I.d) - org.telegram.messenger.g0.L(16.0f);
        if (w3Var.c()) {
            i13 = ih0Var.getMeasuredHeight();
        } else {
            i13 = 0;
        }
        int i16 = height - i13;
        ih0Var.layout(e10 - (ih0Var.getMeasuredWidth() / 2), i16, ((ih0Var.getMeasuredWidth() + 1) / 2) + e10, ih0Var.getMeasuredHeight() + i16);
        int L = org.telegram.messenger.g0.L(36.0f) + Math.max(w3Var.I.f15890b, org.telegram.messenger.g0.f24112m);
        textView.layout(e10 - (textView.getMeasuredWidth() / 2), L, ((textView.getMeasuredWidth() + 1) / 2) + e10, textView.getMeasuredHeight() + L);
        w3Var.d();
        int L2 = org.telegram.messenger.g0.L(24.0f) + Math.max(w3Var.I.f15890b, org.telegram.messenger.g0.f24112m);
        if (textView.getVisibility() == 0) {
            i14 = textView.getMeasuredHeight() + org.telegram.messenger.g0.L(12.0f);
        } else {
            i14 = 0;
        }
        int i17 = i14 + L2;
        int max = Math.max(i17, Math.min(Math.max(i17, (i16 - org.telegram.messenger.g0.L(24.0f)) - x6Var.getMeasuredHeight()), (getHeight() - x6Var.getMeasuredHeight()) / 2));
        int measuredWidth = e10 - (x6Var.getMeasuredWidth() / 2);
        x6Var.layout(measuredWidth, max, x6Var.getMeasuredWidth() + measuredWidth, x6Var.getMeasuredHeight() + max);
        w3Var.f45207s.layout(0, 0, getWidth(), getHeight());
        w3Var.f45205n.layout(0, 0, getWidth(), getHeight());
        ih.d.c(w3Var.F, this);
        w3Var.e();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        setMeasuredDimension(size, size2);
        w3 w3Var = this.f45121a;
        x6 x6Var = w3Var.f45206r;
        i0.b bVar = w3Var.I;
        int max = Math.max(1, (size - bVar.f15889a) - bVar.f15891c);
        w3Var.f45208w.measure(View.MeasureSpec.makeMeasureSpec(Math.max(1, max - org.telegram.messenger.g0.L(24.0f)), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(60.0f), 1073741824));
        TextView textView = w3Var.f45209x;
        float f10 = 48.0f;
        textView.measure(View.MeasureSpec.makeMeasureSpec(Math.max(1, max - org.telegram.messenger.g0.L(48.0f)), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
        int min = Math.min(org.telegram.messenger.g0.L(420.0f), Math.max(1, max - org.telegram.messenger.g0.L(24.0f)));
        int max2 = (size2 - Math.max(w3Var.I.f15890b, org.telegram.messenger.g0.f24112m)) - w3Var.I.d;
        if (w3Var.c()) {
            f10 = 120.0f;
        }
        int L = max2 - org.telegram.messenger.g0.L(f10);
        if (textView.getVisibility() == 0) {
            i11 = textView.getMeasuredHeight() + org.telegram.messenger.g0.L(12.0f);
        } else {
            i11 = 0;
        }
        int max3 = Math.max(1, L - i11);
        x6Var.measure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        if (x6Var.getMeasuredHeight() > max3) {
            int paddingRight = x6Var.getPaddingRight() + x6Var.getPaddingLeft();
            int paddingBottom = x6Var.getPaddingBottom() + x6Var.getPaddingTop();
            x6Var.measure(View.MeasureSpec.makeMeasureSpec(Math.max(1, Math.round((Math.max(0, max3 - paddingBottom) * (min - paddingRight)) / Math.max(1, x6Var.getMeasuredHeight() - paddingBottom)) + paddingRight), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        }
        w3Var.f45207s.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        w3Var.f45205n.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }
}
