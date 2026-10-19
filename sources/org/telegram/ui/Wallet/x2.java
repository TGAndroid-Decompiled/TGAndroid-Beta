package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class x2 extends FrameLayout {
    public final z2 f35085a;

    public x2(z2 z2Var, Context context) {
        super(context);
        this.f35085a = z2Var;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        x5 x5Var;
        z2 z2Var = this.f35085a;
        if (view == z2Var.f35167r && z2Var.J > 0.0f) {
            z2Var.N.set(0.0f, 0.0f, x5Var.getWidth(), z2Var.f35167r.getHeight());
            z2Var.f35167r.getMatrix().mapRect(z2Var.N);
            z2Var.N.offset(z2Var.f35167r.getLeft(), z2Var.f35167r.getTop());
            z2Var.N.inset(-AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f));
            float dp = AndroidUtilities.dp(28.0f);
            RectF rectF = z2Var.N;
            if (rectF.top < z2Var.J + dp && rectF.intersect(0.0f, 0.0f, getWidth(), getHeight())) {
                int saveLayer = canvas.saveLayer(z2Var.N, null);
                boolean drawChild = super.drawChild(canvas, view, j10);
                RectF rectF2 = z2Var.M;
                RectF rectF3 = z2Var.N;
                rectF2.set(rectF3.left, rectF3.top, rectF3.right, Math.min(rectF3.bottom, z2Var.J));
                if (z2Var.M.height() > 0.0f) {
                    canvas.drawRect(z2Var.M, z2Var.L.c(1.0f, 1));
                }
                RectF rectF4 = z2Var.M;
                RectF rectF5 = z2Var.N;
                float f7 = rectF5.left;
                float f10 = z2Var.J;
                rectF4.set(f7, f10, rectF5.right, dp + f10);
                z2Var.L.b(canvas, z2Var.M, 1, 1.0f);
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
        z2 z2Var = this.f35085a;
        TextView textView = z2Var.f35169w;
        ci.i4 i4Var = z2Var.v;
        x5 x5Var = z2Var.f35167r;
        getLocationOnScreen(z2Var.V);
        int i16 = z2Var.H.f12283a;
        int width = getWidth();
        i0.b bVar = z2Var.H;
        int C = i2.e.C(width - bVar.f12283a, bVar.f12285c, 2, i16);
        int height = (getHeight() - z2Var.H.d) - AndroidUtilities.dp(16.0f);
        if (z2Var.c()) {
            i14 = i4Var.getMeasuredHeight();
        } else {
            i14 = 0;
        }
        int i17 = height - i14;
        i4Var.layout(C - (i4Var.getMeasuredWidth() / 2), i17, ((i4Var.getMeasuredWidth() + 1) / 2) + C, i4Var.getMeasuredHeight() + i17);
        int dp = AndroidUtilities.dp(36.0f) + Math.max(z2Var.H.f12284b, AndroidUtilities.statusBarHeight);
        textView.layout(C - (textView.getMeasuredWidth() / 2), dp, ((textView.getMeasuredWidth() + 1) / 2) + C, textView.getMeasuredHeight() + dp);
        z2Var.d();
        int dp2 = AndroidUtilities.dp(24.0f) + Math.max(z2Var.H.f12284b, AndroidUtilities.statusBarHeight);
        if (textView.getVisibility() == 0) {
            i15 = textView.getMeasuredHeight() + AndroidUtilities.dp(12.0f);
        } else {
            i15 = 0;
        }
        int i18 = i15 + dp2;
        int max = Math.max(i18, Math.min(Math.max(i18, (i17 - AndroidUtilities.dp(24.0f)) - x5Var.getMeasuredHeight()), (getHeight() - x5Var.getMeasuredHeight()) / 2));
        int measuredWidth = C - (x5Var.getMeasuredWidth() / 2);
        x5Var.layout(measuredWidth, max, x5Var.getMeasuredWidth() + measuredWidth, x5Var.getMeasuredHeight() + max);
        z2Var.f35168s.layout(0, 0, getWidth(), getHeight());
        z2Var.f35166n.layout(0, 0, getWidth(), getHeight());
        hh.d.c(z2Var.E, this);
        z2Var.e();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        setMeasuredDimension(size, size2);
        z2 z2Var = this.f35085a;
        x5 x5Var = z2Var.f35167r;
        i0.b bVar = z2Var.H;
        int max = Math.max(1, (size - bVar.f12283a) - bVar.f12285c);
        z2Var.v.measure(View.MeasureSpec.makeMeasureSpec(Math.max(1, max - AndroidUtilities.dp(24.0f)), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(60.0f), 1073741824));
        TextView textView = z2Var.f35169w;
        float f7 = 48.0f;
        textView.measure(View.MeasureSpec.makeMeasureSpec(Math.max(1, max - AndroidUtilities.dp(48.0f)), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
        int min = Math.min(AndroidUtilities.dp(420.0f), Math.max(1, max - AndroidUtilities.dp(24.0f)));
        int max2 = (size2 - Math.max(z2Var.H.f12284b, AndroidUtilities.statusBarHeight)) - z2Var.H.d;
        if (z2Var.c()) {
            f7 = 120.0f;
        }
        int dp = max2 - AndroidUtilities.dp(f7);
        if (textView.getVisibility() == 0) {
            i12 = textView.getMeasuredHeight() + AndroidUtilities.dp(12.0f);
        } else {
            i12 = 0;
        }
        int max3 = Math.max(1, dp - i12);
        x5Var.measure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        if (x5Var.getMeasuredHeight() > max3) {
            int paddingRight = x5Var.getPaddingRight() + x5Var.getPaddingLeft();
            int paddingBottom = x5Var.getPaddingBottom() + x5Var.getPaddingTop();
            x5Var.measure(View.MeasureSpec.makeMeasureSpec(Math.max(1, Math.round((Math.max(0, max3 - paddingBottom) * (min - paddingRight)) / Math.max(1, x5Var.getMeasuredHeight() - paddingBottom)) + paddingRight), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        }
        z2Var.f35168s.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        z2Var.f35166n.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }
}
