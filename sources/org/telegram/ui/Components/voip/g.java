package org.telegram.ui.Components.voip;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SvgHelper;
public final class g extends Drawable {
    public float f29275a;
    public final SvgHelper.SvgDrawable f29276b;
    public final h f29277c;

    public g(h hVar, SvgHelper.SvgDrawable svgDrawable) {
        this.f29277c = hVar;
        this.f29276b = svgDrawable;
    }

    @Override
    public final void draw(Canvas canvas) {
        h hVar = this.f29277c;
        int i10 = hVar.e;
        Matrix matrix = hVar.f29290i;
        hVar.f29288f = getBounds().width();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(getBounds());
        hVar.a(this.f29275a, canvas, rectF, null);
        SvgHelper.SvgDrawable svgDrawable = this.f29276b;
        if (svgDrawable != null) {
            svgDrawable.setPaint(hVar.f29285a);
            int i11 = hVar.f29288f;
            float f7 = (((i10 * 2) + i11) * hVar.f29289g) - i10;
            float scale = svgDrawable.getScale(getBounds().width(), getBounds().height());
            matrix.reset();
            matrix.setScale(1.0f / scale, 0.0f, i10 / 2.0f, 0.0f);
            matrix.setTranslate((f7 - svgDrawable.getBounds().left) - (i10 / scale), 0.0f);
            hVar.f29286b.setLocalMatrix(matrix);
            int i12 = ((int) (i11 * 0.5f)) / 2;
            svgDrawable.setBounds(getBounds().centerX() - i12, getBounds().centerY() - i12, getBounds().centerX() + i12, getBounds().centerY() + i12);
            svgDrawable.draw(canvas);
        }
        hVar.f29296o.invalidate();
    }

    @Override
    public final int getOpacity() {
        return -3;
    }

    @Override
    public final void setAlpha(int i10) {
        h hVar = this.f29277c;
        hVar.f29285a.setAlpha(i10);
        hVar.f29287c.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
