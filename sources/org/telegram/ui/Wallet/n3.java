package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.ui.bg0;
public final class n3 extends FrameLayout {
    public final p3 f34933a;

    public n3(p3 p3Var, Context context) {
        super(context);
        this.f34933a = p3Var;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        l6 l6Var;
        p3 p3Var = this.f34933a;
        if (view == p3Var.f35021r && p3Var.J > 0.0f) {
            p3Var.N.set(0.0f, 0.0f, l6Var.getWidth(), p3Var.f35021r.getHeight());
            p3Var.f35021r.getMatrix().mapRect(p3Var.N);
            p3Var.N.offset(p3Var.f35021r.getLeft(), p3Var.f35021r.getTop());
            p3Var.N.inset(-org.telegram.messenger.i0.L(4.0f), -org.telegram.messenger.i0.L(4.0f));
            float L = org.telegram.messenger.i0.L(28.0f);
            RectF rectF = p3Var.N;
            if (rectF.top < p3Var.J + L && rectF.intersect(0.0f, 0.0f, getWidth(), getHeight())) {
                int saveLayer = canvas.saveLayer(p3Var.N, null);
                boolean drawChild = super.drawChild(canvas, view, j10);
                RectF rectF2 = p3Var.M;
                RectF rectF3 = p3Var.N;
                rectF2.set(rectF3.left, rectF3.top, rectF3.right, Math.min(rectF3.bottom, p3Var.J));
                if (p3Var.M.height() > 0.0f) {
                    canvas.drawRect(p3Var.M, p3Var.L.D(1.0f, 1));
                }
                RectF rectF4 = p3Var.M;
                RectF rectF5 = p3Var.N;
                float f7 = rectF5.left;
                float f10 = p3Var.J;
                rectF4.set(f7, f10, rectF5.right, L + f10);
                p3Var.L.o(canvas, p3Var.M, 1, 1.0f);
                canvas.restoreToCount(saveLayer);
                return drawChild;
            }
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        p3 p3Var = this.f34933a;
        TextView textView = p3Var.f35024x;
        bg0 bg0Var = p3Var.f35023w;
        l6 l6Var = p3Var.f35021r;
        getLocationOnScreen(p3Var.V);
        int i16 = p3Var.H.f7766a;
        int width = getWidth();
        i0.c cVar = p3Var.H;
        int u10 = i0.a.u(width - cVar.f7766a, cVar.f7768c, 2, i16);
        int height = (getHeight() - p3Var.H.d) - org.telegram.messenger.i0.L(16.0f);
        if (p3Var.c()) {
            i14 = bg0Var.getMeasuredHeight();
        } else {
            i14 = 0;
        }
        int i17 = height - i14;
        bg0Var.layout(u10 - (bg0Var.getMeasuredWidth() / 2), i17, ((bg0Var.getMeasuredWidth() + 1) / 2) + u10, bg0Var.getMeasuredHeight() + i17);
        int L = org.telegram.messenger.i0.L(36.0f) + Math.max(p3Var.H.f7767b, org.telegram.messenger.i0.f16166m);
        textView.layout(u10 - (textView.getMeasuredWidth() / 2), L, ((textView.getMeasuredWidth() + 1) / 2) + u10, textView.getMeasuredHeight() + L);
        p3Var.d();
        int L2 = org.telegram.messenger.i0.L(24.0f) + Math.max(p3Var.H.f7767b, org.telegram.messenger.i0.f16166m);
        if (textView.getVisibility() == 0) {
            i15 = textView.getMeasuredHeight() + org.telegram.messenger.i0.L(12.0f);
        } else {
            i15 = 0;
        }
        int i18 = i15 + L2;
        int max = Math.max(i18, Math.min(Math.max(i18, (i17 - org.telegram.messenger.i0.L(24.0f)) - l6Var.getMeasuredHeight()), (getHeight() - l6Var.getMeasuredHeight()) / 2));
        int measuredWidth = u10 - (l6Var.getMeasuredWidth() / 2);
        l6Var.layout(measuredWidth, max, l6Var.getMeasuredWidth() + measuredWidth, l6Var.getMeasuredHeight() + max);
        p3Var.f35022s.layout(0, 0, getWidth(), getHeight());
        p3Var.f35020n.layout(0, 0, getWidth(), getHeight());
        yg.d.c(p3Var.E, this);
        p3Var.e();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        setMeasuredDimension(size, size2);
        p3 p3Var = this.f34933a;
        l6 l6Var = p3Var.f35021r;
        i0.c cVar = p3Var.H;
        int max = Math.max(1, (size - cVar.f7766a) - cVar.f7768c);
        p3Var.f35023w.measure(View.MeasureSpec.makeMeasureSpec(Math.max(1, max - org.telegram.messenger.i0.L(24.0f)), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(60.0f), 1073741824));
        TextView textView = p3Var.f35024x;
        float f7 = 48.0f;
        textView.measure(View.MeasureSpec.makeMeasureSpec(Math.max(1, max - org.telegram.messenger.i0.L(48.0f)), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
        int min = Math.min(org.telegram.messenger.i0.L(420.0f), Math.max(1, max - org.telegram.messenger.i0.L(24.0f)));
        int max2 = (size2 - Math.max(p3Var.H.f7767b, org.telegram.messenger.i0.f16166m)) - p3Var.H.d;
        if (p3Var.c()) {
            f7 = 120.0f;
        }
        int L = max2 - org.telegram.messenger.i0.L(f7);
        if (textView.getVisibility() == 0) {
            i12 = textView.getMeasuredHeight() + org.telegram.messenger.i0.L(12.0f);
        } else {
            i12 = 0;
        }
        int max3 = Math.max(1, L - i12);
        l6Var.measure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        if (l6Var.getMeasuredHeight() > max3) {
            int paddingRight = l6Var.getPaddingRight() + l6Var.getPaddingLeft();
            int paddingBottom = l6Var.getPaddingBottom() + l6Var.getPaddingTop();
            l6Var.measure(View.MeasureSpec.makeMeasureSpec(Math.max(1, Math.round((Math.max(0, max3 - paddingBottom) * (min - paddingRight)) / Math.max(1, l6Var.getMeasuredHeight() - paddingBottom)) + paddingRight), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        }
        p3Var.f35022s.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        p3Var.f35020n.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }
}
