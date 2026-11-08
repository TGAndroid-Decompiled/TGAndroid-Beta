package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.ui.sq0;
public final class m3 extends FrameLayout {
    public final o3 f42800a;

    public m3(o3 o3Var, Context context) {
        super(context);
        this.f42800a = o3Var;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        g6 g6Var;
        o3 o3Var = this.f42800a;
        if (view == o3Var.f42948r && o3Var.J > 0.0f) {
            o3Var.N.set(0.0f, 0.0f, g6Var.getWidth(), o3Var.f42948r.getHeight());
            o3Var.f42948r.getMatrix().mapRect(o3Var.N);
            o3Var.N.offset(o3Var.f42948r.getLeft(), o3Var.f42948r.getTop());
            o3Var.N.inset(-org.telegram.messenger.g0.L(4.0f), -org.telegram.messenger.g0.L(4.0f));
            float L = org.telegram.messenger.g0.L(28.0f);
            RectF rectF = o3Var.N;
            if (rectF.top < o3Var.J + L && rectF.intersect(0.0f, 0.0f, getWidth(), getHeight())) {
                int saveLayer = canvas.saveLayer(o3Var.N, null);
                boolean drawChild = super.drawChild(canvas, view, j3);
                RectF rectF2 = o3Var.M;
                RectF rectF3 = o3Var.N;
                rectF2.set(rectF3.left, rectF3.top, rectF3.right, Math.min(rectF3.bottom, o3Var.J));
                if (o3Var.M.height() > 0.0f) {
                    canvas.drawRect(o3Var.M, o3Var.L.u(1.0f, 1));
                }
                RectF rectF4 = o3Var.M;
                RectF rectF5 = o3Var.N;
                float f10 = rectF5.left;
                float f11 = o3Var.J;
                rectF4.set(f10, f11, rectF5.right, L + f11);
                o3Var.L.m(canvas, o3Var.M, 1, 1.0f);
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
        o3 o3Var = this.f42800a;
        TextView textView = o3Var.f42951x;
        sq0 sq0Var = o3Var.f42950w;
        g6 g6Var = o3Var.f42948r;
        getLocationOnScreen(o3Var.V);
        int i15 = o3Var.H.f15120a;
        int width = getWidth();
        i0.b bVar = o3Var.H;
        int D = jg.g.D(width - bVar.f15120a, bVar.f15122c, 2, i15);
        int height = (getHeight() - o3Var.H.d) - org.telegram.messenger.g0.L(16.0f);
        if (o3Var.c()) {
            i13 = sq0Var.getMeasuredHeight();
        } else {
            i13 = 0;
        }
        int i16 = height - i13;
        sq0Var.layout(D - (sq0Var.getMeasuredWidth() / 2), i16, ((sq0Var.getMeasuredWidth() + 1) / 2) + D, sq0Var.getMeasuredHeight() + i16);
        int L = org.telegram.messenger.g0.L(36.0f) + Math.max(o3Var.H.f15121b, org.telegram.messenger.g0.f22557m);
        textView.layout(D - (textView.getMeasuredWidth() / 2), L, ((textView.getMeasuredWidth() + 1) / 2) + D, textView.getMeasuredHeight() + L);
        o3Var.d();
        int L2 = org.telegram.messenger.g0.L(24.0f) + Math.max(o3Var.H.f15121b, org.telegram.messenger.g0.f22557m);
        if (textView.getVisibility() == 0) {
            i14 = textView.getMeasuredHeight() + org.telegram.messenger.g0.L(12.0f);
        } else {
            i14 = 0;
        }
        int i17 = i14 + L2;
        int max = Math.max(i17, Math.min(Math.max(i17, (i16 - org.telegram.messenger.g0.L(24.0f)) - g6Var.getMeasuredHeight()), (getHeight() - g6Var.getMeasuredHeight()) / 2));
        int measuredWidth = D - (g6Var.getMeasuredWidth() / 2);
        g6Var.layout(measuredWidth, max, g6Var.getMeasuredWidth() + measuredWidth, g6Var.getMeasuredHeight() + max);
        o3Var.f42949s.layout(0, 0, getWidth(), getHeight());
        o3Var.f42947n.layout(0, 0, getWidth(), getHeight());
        ih.d.c(o3Var.E, this);
        o3Var.e();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        setMeasuredDimension(size, size2);
        o3 o3Var = this.f42800a;
        g6 g6Var = o3Var.f42948r;
        i0.b bVar = o3Var.H;
        int max = Math.max(1, (size - bVar.f15120a) - bVar.f15122c);
        o3Var.f42950w.measure(View.MeasureSpec.makeMeasureSpec(Math.max(1, max - org.telegram.messenger.g0.L(24.0f)), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(60.0f), 1073741824));
        TextView textView = o3Var.f42951x;
        float f10 = 48.0f;
        textView.measure(View.MeasureSpec.makeMeasureSpec(Math.max(1, max - org.telegram.messenger.g0.L(48.0f)), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
        int min = Math.min(org.telegram.messenger.g0.L(420.0f), Math.max(1, max - org.telegram.messenger.g0.L(24.0f)));
        int max2 = (size2 - Math.max(o3Var.H.f15121b, org.telegram.messenger.g0.f22557m)) - o3Var.H.d;
        if (o3Var.c()) {
            f10 = 120.0f;
        }
        int L = max2 - org.telegram.messenger.g0.L(f10);
        if (textView.getVisibility() == 0) {
            i11 = textView.getMeasuredHeight() + org.telegram.messenger.g0.L(12.0f);
        } else {
            i11 = 0;
        }
        int max3 = Math.max(1, L - i11);
        g6Var.measure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        if (g6Var.getMeasuredHeight() > max3) {
            int paddingRight = g6Var.getPaddingRight() + g6Var.getPaddingLeft();
            int paddingBottom = g6Var.getPaddingBottom() + g6Var.getPaddingTop();
            g6Var.measure(View.MeasureSpec.makeMeasureSpec(Math.max(1, Math.round((Math.max(0, max3 - paddingBottom) * (min - paddingRight)) / Math.max(1, g6Var.getMeasuredHeight() - paddingBottom)) + paddingRight), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        }
        o3Var.f42949s.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        o3Var.f42947n.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }
}
