package org.telegram.ui;

import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import java.util.HashSet;
public final class kt extends View implements org.telegram.ui.ActionBar.b6 {
    public Path f47364a;
    public Paint f47365b;
    public boolean f47366c;

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        requestLayout();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(this.f47364a, this.f47365b);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(13.0f), 1073741824));
        setTop(this.f47366c);
    }

    public void setTop(boolean z9) {
        Path path = this.f47364a;
        path.rewind();
        this.f47366c = z9;
        if (z9) {
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
            this.f47365b.setColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f27865d6, false));
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
