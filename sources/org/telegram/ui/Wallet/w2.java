package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class w2 extends FrameLayout {
    public final y2 f37415a;

    public w2(y2 y2Var, Context context) {
        super(context);
        this.f37415a = y2Var;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        w5 w5Var;
        y2 y2Var = this.f37415a;
        if (view == y2Var.f37501r && y2Var.J > 0.0f) {
            y2Var.N.set(0.0f, 0.0f, w5Var.getWidth(), y2Var.f37501r.getHeight());
            y2Var.f37501r.getMatrix().mapRect(y2Var.N);
            y2Var.N.offset(y2Var.f37501r.getLeft(), y2Var.f37501r.getTop());
            y2Var.N.inset(-AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f));
            float dp = AndroidUtilities.dp(28.0f);
            RectF rectF = y2Var.N;
            if (rectF.top < y2Var.J + dp && rectF.intersect(0.0f, 0.0f, getWidth(), getHeight())) {
                int saveLayer = canvas.saveLayer(y2Var.N, null);
                boolean drawChild = super.drawChild(canvas, view, j10);
                RectF rectF2 = y2Var.M;
                RectF rectF3 = y2Var.N;
                rectF2.set(rectF3.left, rectF3.top, rectF3.right, Math.min(rectF3.bottom, y2Var.J));
                if (y2Var.M.height() > 0.0f) {
                    canvas.drawRect(y2Var.M, y2Var.L.c(1.0f, 1));
                }
                RectF rectF4 = y2Var.M;
                RectF rectF5 = y2Var.N;
                float f7 = rectF5.left;
                float f10 = y2Var.J;
                rectF4.set(f7, f10, rectF5.right, dp + f10);
                y2Var.L.b(canvas, y2Var.M, 1, 1.0f);
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
        y2 y2Var = this.f37415a;
        TextView textView = y2Var.f37503w;
        di.i4 i4Var = y2Var.v;
        w5 w5Var = y2Var.f37501r;
        getLocationOnScreen(y2Var.V);
        int i16 = y2Var.H.f13450a;
        int width = getWidth();
        i0.b bVar = y2Var.H;
        int A = ic.a.A(width - bVar.f13450a, bVar.f13452c, 2, i16);
        int height = (getHeight() - y2Var.H.d) - AndroidUtilities.dp(16.0f);
        if (y2Var.c()) {
            i14 = i4Var.getMeasuredHeight();
        } else {
            i14 = 0;
        }
        int i17 = height - i14;
        i4Var.layout(A - (i4Var.getMeasuredWidth() / 2), i17, ((i4Var.getMeasuredWidth() + 1) / 2) + A, i4Var.getMeasuredHeight() + i17);
        int dp = AndroidUtilities.dp(36.0f) + Math.max(y2Var.H.f13451b, AndroidUtilities.statusBarHeight);
        textView.layout(A - (textView.getMeasuredWidth() / 2), dp, ((textView.getMeasuredWidth() + 1) / 2) + A, textView.getMeasuredHeight() + dp);
        y2Var.d();
        int dp2 = AndroidUtilities.dp(24.0f) + Math.max(y2Var.H.f13451b, AndroidUtilities.statusBarHeight);
        if (textView.getVisibility() == 0) {
            i15 = textView.getMeasuredHeight() + AndroidUtilities.dp(12.0f);
        } else {
            i15 = 0;
        }
        int i18 = i15 + dp2;
        int max = Math.max(i18, Math.min(Math.max(i18, (i17 - AndroidUtilities.dp(24.0f)) - w5Var.getMeasuredHeight()), (getHeight() - w5Var.getMeasuredHeight()) / 2));
        int measuredWidth = A - (w5Var.getMeasuredWidth() / 2);
        w5Var.layout(measuredWidth, max, w5Var.getMeasuredWidth() + measuredWidth, w5Var.getMeasuredHeight() + max);
        y2Var.f37502s.layout(0, 0, getWidth(), getHeight());
        y2Var.f37500n.layout(0, 0, getWidth(), getHeight());
        ih.d.c(y2Var.E, this);
        y2Var.e();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        setMeasuredDimension(size, size2);
        y2 y2Var = this.f37415a;
        w5 w5Var = y2Var.f37501r;
        i0.b bVar = y2Var.H;
        int max = Math.max(1, (size - bVar.f13450a) - bVar.f13452c);
        y2Var.v.measure(View.MeasureSpec.makeMeasureSpec(Math.max(1, max - AndroidUtilities.dp(24.0f)), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(60.0f), 1073741824));
        TextView textView = y2Var.f37503w;
        float f7 = 48.0f;
        textView.measure(View.MeasureSpec.makeMeasureSpec(Math.max(1, max - AndroidUtilities.dp(48.0f)), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
        int min = Math.min(AndroidUtilities.dp(420.0f), Math.max(1, max - AndroidUtilities.dp(24.0f)));
        int max2 = (size2 - Math.max(y2Var.H.f13451b, AndroidUtilities.statusBarHeight)) - y2Var.H.d;
        if (y2Var.c()) {
            f7 = 120.0f;
        }
        int dp = max2 - AndroidUtilities.dp(f7);
        if (textView.getVisibility() == 0) {
            i12 = textView.getMeasuredHeight() + AndroidUtilities.dp(12.0f);
        } else {
            i12 = 0;
        }
        int max3 = Math.max(1, dp - i12);
        w5Var.measure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        if (w5Var.getMeasuredHeight() > max3) {
            int paddingRight = w5Var.getPaddingRight() + w5Var.getPaddingLeft();
            int paddingBottom = w5Var.getPaddingBottom() + w5Var.getPaddingTop();
            w5Var.measure(View.MeasureSpec.makeMeasureSpec(Math.max(1, Math.round((Math.max(0, max3 - paddingBottom) * (min - paddingRight)) / Math.max(1, w5Var.getMeasuredHeight() - paddingBottom)) + paddingRight), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        }
        y2Var.f37502s.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        y2Var.f37500n.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }
}
