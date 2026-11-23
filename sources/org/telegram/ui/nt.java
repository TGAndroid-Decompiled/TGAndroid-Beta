package org.telegram.ui;

import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import java.util.HashSet;
public final class nt extends View implements org.telegram.ui.ActionBar.b6 {
    public Path f50315a;
    public Paint f50316b;
    public boolean f50317c;

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        requestLayout();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(this.f50315a, this.f50316b);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(13.0f), 1073741824));
        setTop(this.f50317c);
    }

    public void setTop(boolean z10) {
        Path path = this.f50315a;
        path.rewind();
        this.f50317c = z10;
        if (z10) {
            float L = org.telegram.messenger.g0.L(14.0f);
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(0.0f, org.telegram.messenger.g0.L(4.0f), getMeasuredWidth(), (getMeasuredHeight() * 2) + org.telegram.messenger.g0.L(4.0f));
            path.addRoundRect(rectF, L, L, Path.Direction.CW);
            return;
        }
        float L2 = org.telegram.messenger.g0.L(8.0f);
        RectF rectF2 = org.telegram.messenger.g0.P;
        rectF2.set(0.0f, ((-getMeasuredHeight()) * 2) - org.telegram.messenger.g0.L(4.0f), getMeasuredWidth(), getMeasuredHeight() - org.telegram.messenger.g0.L(4.0f));
        path.addRoundRect(rectF2, L2, L2, Path.Direction.CW);
    }

    @Override
    public final void updateColors() {
        try {
            this.f50316b.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29381d6, false));
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
