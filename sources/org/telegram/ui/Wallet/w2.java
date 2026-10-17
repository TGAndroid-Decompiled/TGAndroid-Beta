package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class w2 extends FrameLayout {
    public final x2 f35033a;

    public w2(x2 x2Var, Context context) {
        super(context);
        this.f35033a = x2Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        x2 x2Var = this.f35033a;
        Bitmap bitmap = x2Var.E;
        if (bitmap != null && !bitmap.isRecycled()) {
            x2Var.f35124w.set(0.0f, 0.0f, getWidth(), getHeight());
            x2Var.v.setAlpha(Math.round(x2Var.G * 255.0f));
            canvas.drawBitmap(x2Var.E, (Rect) null, x2Var.f35124w, x2Var.v);
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        x2 x2Var = this.f35033a;
        if (view == x2Var.h && x2Var.H > 0.0f) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
            boolean drawChild = super.drawChild(canvas, view, j10);
            x2Var.K.set(0.0f, 0.0f, getWidth(), x2Var.H);
            canvas.drawRect(x2Var.K, x2Var.J.c(1.0f, 1));
            x2Var.K.set(0.0f, x2Var.H, getWidth(), x2Var.H + AndroidUtilities.dp(28.0f));
            x2Var.J.b(canvas, x2Var.K, 1, 1.0f);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int[] iArr;
        int i14;
        int i15;
        x2 x2Var = this.f35033a;
        v5 v5Var = x2Var.h;
        TextView textView = x2Var.f35123s;
        ci.i4 i4Var = x2Var.f35122r;
        getLocationOnScreen(x2Var.Q);
        int i16 = x2Var.F.f12284a;
        int width = getWidth();
        i0.c cVar = x2Var.F;
        int C = i0.a.C(width - cVar.f12284a, cVar.f12286c, 2, i16);
        int height = (getHeight() - x2Var.F.d) - AndroidUtilities.dp(16.0f);
        if (x2Var.c()) {
            i14 = i4Var.getMeasuredHeight();
        } else {
            i14 = 0;
        }
        int i17 = height - i14;
        i4Var.layout(C - (i4Var.getMeasuredWidth() / 2), i17, ((i4Var.getMeasuredWidth() + 1) / 2) + C, i4Var.getMeasuredHeight() + i17);
        int dp = AndroidUtilities.dp(36.0f) + Math.max(x2Var.F.f12285b, AndroidUtilities.statusBarHeight);
        textView.layout(C - (textView.getMeasuredWidth() / 2), dp, ((textView.getMeasuredWidth() + 1) / 2) + C, textView.getMeasuredHeight() + dp);
        int dp2 = AndroidUtilities.dp(24.0f) + Math.max(x2Var.F.f12285b, AndroidUtilities.statusBarHeight);
        if (x2Var.d) {
            i15 = textView.getMeasuredHeight() + AndroidUtilities.dp(12.0f);
        } else {
            i15 = 0;
        }
        int i18 = i15 + dp2;
        int max = Math.max(i18, Math.min(Math.max(i18, (i17 - AndroidUtilities.dp(24.0f)) - v5Var.getMeasuredHeight()), Math.round((x2Var.e.centerY() - iArr[1]) - AndroidUtilities.dp(12.0f))));
        int measuredWidth = C - (v5Var.getMeasuredWidth() / 2);
        v5Var.layout(measuredWidth, max, v5Var.getMeasuredWidth() + measuredWidth, v5Var.getMeasuredHeight() + max);
        x2Var.f35121n.layout(0, 0, getWidth(), getHeight());
        hh.d.c(x2Var.f35125x, this);
        x2Var.d();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        setMeasuredDimension(size, size2);
        x2 x2Var = this.f35033a;
        v5 v5Var = x2Var.h;
        i0.c cVar = x2Var.F;
        int max = Math.max(1, (size - cVar.f12284a) - cVar.f12286c);
        x2Var.f35122r.measure(View.MeasureSpec.makeMeasureSpec(Math.max(1, max - AndroidUtilities.dp(24.0f)), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(60.0f), 1073741824));
        TextView textView = x2Var.f35123s;
        float f7 = 48.0f;
        textView.measure(View.MeasureSpec.makeMeasureSpec(Math.max(1, max - AndroidUtilities.dp(48.0f)), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
        int min = Math.min(AndroidUtilities.dp(420.0f), Math.max(1, max - AndroidUtilities.dp(24.0f)));
        int max2 = (size2 - Math.max(x2Var.F.f12285b, AndroidUtilities.statusBarHeight)) - x2Var.F.d;
        if (x2Var.c()) {
            f7 = 120.0f;
        }
        int dp = max2 - AndroidUtilities.dp(f7);
        if (x2Var.d) {
            i12 = textView.getMeasuredHeight() + AndroidUtilities.dp(12.0f);
        } else {
            i12 = 0;
        }
        int max3 = Math.max(1, dp - i12);
        v5Var.measure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        if (v5Var.getMeasuredHeight() > max3) {
            int paddingRight = v5Var.getPaddingRight() + v5Var.getPaddingLeft();
            int paddingBottom = v5Var.getPaddingBottom() + v5Var.getPaddingTop();
            v5Var.measure(View.MeasureSpec.makeMeasureSpec(Math.max(1, Math.round((Math.max(0, max3 - paddingBottom) * (min - paddingRight)) / Math.max(1, v5Var.getMeasuredHeight() - paddingBottom)) + paddingRight), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        }
        x2Var.f35121n.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }
}
