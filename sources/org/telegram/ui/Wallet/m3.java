package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.ui.eh0;
public final class m3 extends FrameLayout {
    public final o3 f44151a;

    public m3(o3 o3Var, Context context) {
        super(context);
        this.f44151a = o3Var;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        h6 h6Var;
        o3 o3Var = this.f44151a;
        if (view == o3Var.f44229r && o3Var.K > 0.0f) {
            o3Var.O.set(0.0f, 0.0f, h6Var.getWidth(), o3Var.f44229r.getHeight());
            o3Var.f44229r.getMatrix().mapRect(o3Var.O);
            o3Var.O.offset(o3Var.f44229r.getLeft(), o3Var.f44229r.getTop());
            o3Var.O.inset(-org.telegram.messenger.g0.L(4.0f), -org.telegram.messenger.g0.L(4.0f));
            float L = org.telegram.messenger.g0.L(28.0f);
            RectF rectF = o3Var.O;
            if (rectF.top < o3Var.K + L && rectF.intersect(0.0f, 0.0f, getWidth(), getHeight())) {
                int saveLayer = canvas.saveLayer(o3Var.O, null);
                boolean drawChild = super.drawChild(canvas, view, j3);
                RectF rectF2 = o3Var.N;
                RectF rectF3 = o3Var.O;
                rectF2.set(rectF3.left, rectF3.top, rectF3.right, Math.min(rectF3.bottom, o3Var.K));
                if (o3Var.N.height() > 0.0f) {
                    canvas.drawRect(o3Var.N, o3Var.M.w(1.0f, 1));
                }
                RectF rectF4 = o3Var.N;
                RectF rectF5 = o3Var.O;
                float f10 = rectF5.left;
                float f11 = o3Var.K;
                rectF4.set(f10, f11, rectF5.right, L + f11);
                o3Var.M.m(canvas, o3Var.N, 1, 1.0f);
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
        o3 o3Var = this.f44151a;
        TextView textView = o3Var.f44232x;
        eh0 eh0Var = o3Var.f44231w;
        h6 h6Var = o3Var.f44229r;
        getLocationOnScreen(o3Var.W);
        int i15 = o3Var.I.f15574a;
        int width = getWidth();
        i0.c cVar = o3Var.I;
        int e10 = i5.c.e(width - cVar.f15574a, cVar.f15576c, 2, i15);
        int height = (getHeight() - o3Var.I.d) - org.telegram.messenger.g0.L(16.0f);
        if (o3Var.c()) {
            i13 = eh0Var.getMeasuredHeight();
        } else {
            i13 = 0;
        }
        int i16 = height - i13;
        eh0Var.layout(e10 - (eh0Var.getMeasuredWidth() / 2), i16, ((eh0Var.getMeasuredWidth() + 1) / 2) + e10, eh0Var.getMeasuredHeight() + i16);
        int L = org.telegram.messenger.g0.L(36.0f) + Math.max(o3Var.I.f15575b, org.telegram.messenger.g0.f23603m);
        textView.layout(e10 - (textView.getMeasuredWidth() / 2), L, ((textView.getMeasuredWidth() + 1) / 2) + e10, textView.getMeasuredHeight() + L);
        o3Var.d();
        int L2 = org.telegram.messenger.g0.L(24.0f) + Math.max(o3Var.I.f15575b, org.telegram.messenger.g0.f23603m);
        if (textView.getVisibility() == 0) {
            i14 = textView.getMeasuredHeight() + org.telegram.messenger.g0.L(12.0f);
        } else {
            i14 = 0;
        }
        int i17 = i14 + L2;
        int max = Math.max(i17, Math.min(Math.max(i17, (i16 - org.telegram.messenger.g0.L(24.0f)) - h6Var.getMeasuredHeight()), (getHeight() - h6Var.getMeasuredHeight()) / 2));
        int measuredWidth = e10 - (h6Var.getMeasuredWidth() / 2);
        h6Var.layout(measuredWidth, max, h6Var.getMeasuredWidth() + measuredWidth, h6Var.getMeasuredHeight() + max);
        o3Var.f44230s.layout(0, 0, getWidth(), getHeight());
        o3Var.f44228n.layout(0, 0, getWidth(), getHeight());
        ih.d.c(o3Var.F, this);
        o3Var.e();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        setMeasuredDimension(size, size2);
        o3 o3Var = this.f44151a;
        h6 h6Var = o3Var.f44229r;
        i0.c cVar = o3Var.I;
        int max = Math.max(1, (size - cVar.f15574a) - cVar.f15576c);
        o3Var.f44231w.measure(View.MeasureSpec.makeMeasureSpec(Math.max(1, max - org.telegram.messenger.g0.L(24.0f)), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(60.0f), 1073741824));
        TextView textView = o3Var.f44232x;
        float f10 = 48.0f;
        textView.measure(View.MeasureSpec.makeMeasureSpec(Math.max(1, max - org.telegram.messenger.g0.L(48.0f)), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
        int min = Math.min(org.telegram.messenger.g0.L(420.0f), Math.max(1, max - org.telegram.messenger.g0.L(24.0f)));
        int max2 = (size2 - Math.max(o3Var.I.f15575b, org.telegram.messenger.g0.f23603m)) - o3Var.I.d;
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
        h6Var.measure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        if (h6Var.getMeasuredHeight() > max3) {
            int paddingRight = h6Var.getPaddingRight() + h6Var.getPaddingLeft();
            int paddingBottom = h6Var.getPaddingBottom() + h6Var.getPaddingTop();
            h6Var.measure(View.MeasureSpec.makeMeasureSpec(Math.max(1, Math.round((Math.max(0, max3 - paddingBottom) * (min - paddingRight)) / Math.max(1, h6Var.getMeasuredHeight() - paddingBottom)) + paddingRight), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        }
        o3Var.f44230s.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        o3Var.f44228n.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }
}
