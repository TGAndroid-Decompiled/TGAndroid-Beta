package org.telegram.ui;

import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import java.util.HashSet;
public final class ju extends View implements org.telegram.ui.ActionBar.k6 {
    public Path f38557a;
    public Paint f38558b;
    public boolean f38559c;

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        requestLayout();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(this.f38557a, this.f38558b);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(13.0f), 1073741824));
        setTop(this.f38559c);
    }

    public void setTop(boolean z10) {
        Path path = this.f38557a;
        path.rewind();
        this.f38559c = z10;
        if (z10) {
            float L = org.telegram.messenger.i0.L(14.0f);
            RectF rectF = org.telegram.messenger.i0.P;
            rectF.set(0.0f, org.telegram.messenger.i0.L(4.0f), getMeasuredWidth(), (getMeasuredHeight() * 2) + org.telegram.messenger.i0.L(4.0f));
            path.addRoundRect(rectF, L, L, Path.Direction.CW);
            return;
        }
        float L2 = org.telegram.messenger.i0.L(8.0f);
        RectF rectF2 = org.telegram.messenger.i0.P;
        rectF2.set(0.0f, ((-getMeasuredHeight()) * 2) - org.telegram.messenger.i0.L(4.0f), getMeasuredWidth(), getMeasuredHeight() - org.telegram.messenger.i0.L(4.0f));
        path.addRoundRect(rectF2, L2, L2, Path.Direction.CW);
    }

    @Override
    public final void updateColors() {
        try {
            this.f38558b.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f20930d6, false));
            invalidate();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
