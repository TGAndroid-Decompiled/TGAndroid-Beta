package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.ui.sq0;
public final class n3 extends FrameLayout {
    public final p3 f42831a;

    public n3(p3 p3Var, Context context) {
        super(context);
        this.f42831a = p3Var;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        h6 h6Var;
        p3 p3Var = this.f42831a;
        if (view == p3Var.f42987r && p3Var.J > 0.0f) {
            p3Var.N.set(0.0f, 0.0f, h6Var.getWidth(), p3Var.f42987r.getHeight());
            p3Var.f42987r.getMatrix().mapRect(p3Var.N);
            p3Var.N.offset(p3Var.f42987r.getLeft(), p3Var.f42987r.getTop());
            p3Var.N.inset(-org.telegram.messenger.g0.L(4.0f), -org.telegram.messenger.g0.L(4.0f));
            float L = org.telegram.messenger.g0.L(28.0f);
            RectF rectF = p3Var.N;
            if (rectF.top < p3Var.J + L && rectF.intersect(0.0f, 0.0f, getWidth(), getHeight())) {
                int saveLayer = canvas.saveLayer(p3Var.N, null);
                boolean drawChild = super.drawChild(canvas, view, j3);
                RectF rectF2 = p3Var.M;
                RectF rectF3 = p3Var.N;
                rectF2.set(rectF3.left, rectF3.top, rectF3.right, Math.min(rectF3.bottom, p3Var.J));
                if (p3Var.M.height() > 0.0f) {
                    canvas.drawRect(p3Var.M, p3Var.L.u(1.0f, 1));
                }
                RectF rectF4 = p3Var.M;
                RectF rectF5 = p3Var.N;
                float f10 = rectF5.left;
                float f11 = p3Var.J;
                rectF4.set(f10, f11, rectF5.right, L + f11);
                p3Var.L.m(canvas, p3Var.M, 1, 1.0f);
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
        p3 p3Var = this.f42831a;
        TextView textView = p3Var.f42990x;
        sq0 sq0Var = p3Var.f42989w;
        h6 h6Var = p3Var.f42987r;
        getLocationOnScreen(p3Var.V);
        int i15 = p3Var.H.f15117a;
        int width = getWidth();
        i0.b bVar = p3Var.H;
        int D = jg.g.D(width - bVar.f15117a, bVar.f15119c, 2, i15);
        int height = (getHeight() - p3Var.H.d) - org.telegram.messenger.g0.L(16.0f);
        if (p3Var.c()) {
            i13 = sq0Var.getMeasuredHeight();
        } else {
            i13 = 0;
        }
        int i16 = height - i13;
        sq0Var.layout(D - (sq0Var.getMeasuredWidth() / 2), i16, ((sq0Var.getMeasuredWidth() + 1) / 2) + D, sq0Var.getMeasuredHeight() + i16);
        int L = org.telegram.messenger.g0.L(36.0f) + Math.max(p3Var.H.f15118b, org.telegram.messenger.g0.f22531m);
        textView.layout(D - (textView.getMeasuredWidth() / 2), L, ((textView.getMeasuredWidth() + 1) / 2) + D, textView.getMeasuredHeight() + L);
        p3Var.d();
        int L2 = org.telegram.messenger.g0.L(24.0f) + Math.max(p3Var.H.f15118b, org.telegram.messenger.g0.f22531m);
        if (textView.getVisibility() == 0) {
            i14 = textView.getMeasuredHeight() + org.telegram.messenger.g0.L(12.0f);
        } else {
            i14 = 0;
        }
        int i17 = i14 + L2;
        int max = Math.max(i17, Math.min(Math.max(i17, (i16 - org.telegram.messenger.g0.L(24.0f)) - h6Var.getMeasuredHeight()), (getHeight() - h6Var.getMeasuredHeight()) / 2));
        int measuredWidth = D - (h6Var.getMeasuredWidth() / 2);
        h6Var.layout(measuredWidth, max, h6Var.getMeasuredWidth() + measuredWidth, h6Var.getMeasuredHeight() + max);
        p3Var.f42988s.layout(0, 0, getWidth(), getHeight());
        p3Var.f42986n.layout(0, 0, getWidth(), getHeight());
        ih.d.c(p3Var.E, this);
        p3Var.e();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        setMeasuredDimension(size, size2);
        p3 p3Var = this.f42831a;
        h6 h6Var = p3Var.f42987r;
        i0.b bVar = p3Var.H;
        int max = Math.max(1, (size - bVar.f15117a) - bVar.f15119c);
        p3Var.f42989w.measure(View.MeasureSpec.makeMeasureSpec(Math.max(1, max - org.telegram.messenger.g0.L(24.0f)), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(60.0f), 1073741824));
        TextView textView = p3Var.f42990x;
        float f10 = 48.0f;
        textView.measure(View.MeasureSpec.makeMeasureSpec(Math.max(1, max - org.telegram.messenger.g0.L(48.0f)), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
        int min = Math.min(org.telegram.messenger.g0.L(420.0f), Math.max(1, max - org.telegram.messenger.g0.L(24.0f)));
        int max2 = (size2 - Math.max(p3Var.H.f15118b, org.telegram.messenger.g0.f22531m)) - p3Var.H.d;
        if (p3Var.c()) {
            f10 = 120.0f;
        }
        int L = max2 - org.telegram.messenger.g0.L(f10);
        if (textView.getVisibility() == 0) {
            i11 = textView.getMeasuredHeight() + org.telegram.messenger.g0.L(12.0f);
        } else {
            i11 = 0;
        }
        int max3 = Math.max(1, L - i11);
        h6Var.measure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        if (h6Var.getMeasuredHeight() > max3) {
            int paddingRight = h6Var.getPaddingRight() + h6Var.getPaddingLeft();
            int paddingBottom = h6Var.getPaddingBottom() + h6Var.getPaddingTop();
            h6Var.measure(View.MeasureSpec.makeMeasureSpec(Math.max(1, Math.round((Math.max(0, max3 - paddingBottom) * (min - paddingRight)) / Math.max(1, h6Var.getMeasuredHeight() - paddingBottom)) + paddingRight), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        }
        p3Var.f42988s.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        p3Var.f42986n.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }
}
