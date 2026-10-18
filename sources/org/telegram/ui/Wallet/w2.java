package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class w2 extends FrameLayout {
    public final y2 f35024a;

    public w2(y2 y2Var, Context context) {
        super(context);
        this.f35024a = y2Var;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        y2 y2Var = this.f35024a;
        if (view == y2Var.f35118r && y2Var.J > 0.0f) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
            boolean drawChild = super.drawChild(canvas, view, j10);
            y2Var.M.set(0.0f, 0.0f, getWidth(), y2Var.J);
            canvas.drawRect(y2Var.M, y2Var.L.c(1.0f, 1));
            y2Var.M.set(0.0f, y2Var.J, getWidth(), y2Var.J + AndroidUtilities.dp(28.0f));
            y2Var.L.b(canvas, y2Var.M, 1, 1.0f);
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
        y2 y2Var = this.f35024a;
        x5 x5Var = y2Var.f35118r;
        TextView textView = y2Var.f35120w;
        ci.i4 i4Var = y2Var.v;
        getLocationOnScreen(y2Var.S);
        int i16 = y2Var.H.f12286a;
        int width = getWidth();
        i0.b bVar = y2Var.H;
        int C = i2.d.C(width - bVar.f12286a, bVar.f12288c, 2, i16);
        int height = (getHeight() - y2Var.H.d) - AndroidUtilities.dp(16.0f);
        if (y2Var.c()) {
            i14 = i4Var.getMeasuredHeight();
        } else {
            i14 = 0;
        }
        int i17 = height - i14;
        i4Var.layout(C - (i4Var.getMeasuredWidth() / 2), i17, ((i4Var.getMeasuredWidth() + 1) / 2) + C, i4Var.getMeasuredHeight() + i17);
        int dp = AndroidUtilities.dp(36.0f) + Math.max(y2Var.H.f12287b, AndroidUtilities.statusBarHeight);
        textView.layout(C - (textView.getMeasuredWidth() / 2), dp, ((textView.getMeasuredWidth() + 1) / 2) + C, textView.getMeasuredHeight() + dp);
        int dp2 = AndroidUtilities.dp(24.0f) + Math.max(y2Var.H.f12287b, AndroidUtilities.statusBarHeight);
        if (textView.getVisibility() == 0) {
            i15 = textView.getMeasuredHeight() + AndroidUtilities.dp(12.0f);
        } else {
            i15 = 0;
        }
        int i18 = i15 + dp2;
        int max = Math.max(i18, Math.min(Math.max(i18, (i17 - AndroidUtilities.dp(24.0f)) - x5Var.getMeasuredHeight()), Math.round((y2Var.f35116f.centerY() - iArr[1]) - AndroidUtilities.dp(12.0f))));
        int measuredWidth = C - (x5Var.getMeasuredWidth() / 2);
        x5Var.layout(measuredWidth, max, x5Var.getMeasuredWidth() + measuredWidth, x5Var.getMeasuredHeight() + max);
        y2Var.f35119s.layout(0, 0, getWidth(), getHeight());
        y2Var.f35117n.layout(0, 0, getWidth(), getHeight());
        hh.d.c(y2Var.E, this);
        y2Var.d();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        setMeasuredDimension(size, size2);
        y2 y2Var = this.f35024a;
        x5 x5Var = y2Var.f35118r;
        i0.b bVar = y2Var.H;
        int max = Math.max(1, (size - bVar.f12286a) - bVar.f12288c);
        y2Var.v.measure(View.MeasureSpec.makeMeasureSpec(Math.max(1, max - AndroidUtilities.dp(24.0f)), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(60.0f), 1073741824));
        TextView textView = y2Var.f35120w;
        float f7 = 48.0f;
        textView.measure(View.MeasureSpec.makeMeasureSpec(Math.max(1, max - AndroidUtilities.dp(48.0f)), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
        int min = Math.min(AndroidUtilities.dp(420.0f), Math.max(1, max - AndroidUtilities.dp(24.0f)));
        int max2 = (size2 - Math.max(y2Var.H.f12287b, AndroidUtilities.statusBarHeight)) - y2Var.H.d;
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
        x5Var.measure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        if (x5Var.getMeasuredHeight() > max3) {
            int paddingRight = x5Var.getPaddingRight() + x5Var.getPaddingLeft();
            int paddingBottom = x5Var.getPaddingBottom() + x5Var.getPaddingTop();
            x5Var.measure(View.MeasureSpec.makeMeasureSpec(Math.max(1, Math.round((Math.max(0, max3 - paddingBottom) * (min - paddingRight)) / Math.max(1, x5Var.getMeasuredHeight() - paddingBottom)) + paddingRight), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        }
        y2Var.f35119s.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        y2Var.f35117n.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }
}
