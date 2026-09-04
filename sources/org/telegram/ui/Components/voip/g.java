package org.telegram.ui.Components.voip;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SvgHelper;
public final class g extends Drawable {
    public float f31491a;
    public final SvgHelper.SvgDrawable f31492b;
    public final h f31493c;

    public g(h hVar, SvgHelper.SvgDrawable svgDrawable) {
        this.f31493c = hVar;
        this.f31492b = svgDrawable;
    }

    @Override
    public final void draw(Canvas canvas) {
        h hVar = this.f31493c;
        int i10 = hVar.f31502e;
        Matrix matrix = hVar.f31505i;
        hVar.f31503f = getBounds().width();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(getBounds());
        hVar.a(this.f31491a, canvas, rectF, null);
        SvgHelper.SvgDrawable svgDrawable = this.f31492b;
        if (svgDrawable != null) {
            svgDrawable.setPaint(hVar.f31499a);
            int i11 = hVar.f31503f;
            float f7 = (((i10 * 2) + i11) * hVar.f31504g) - i10;
            float scale = svgDrawable.getScale(getBounds().width(), getBounds().height());
            matrix.reset();
            matrix.setScale(1.0f / scale, 0.0f, i10 / 2.0f, 0.0f);
            matrix.setTranslate((f7 - svgDrawable.getBounds().left) - (i10 / scale), 0.0f);
            hVar.f31500b.setLocalMatrix(matrix);
            int i12 = ((int) (i11 * 0.5f)) / 2;
            svgDrawable.setBounds(getBounds().centerX() - i12, getBounds().centerY() - i12, getBounds().centerX() + i12, getBounds().centerY() + i12);
            svgDrawable.draw(canvas);
        }
        hVar.f31511o.invalidate();
    }

    @Override
    public final int getOpacity() {
        return -3;
    }

    @Override
    public final void setAlpha(int i10) {
        h hVar = this.f31493c;
        hVar.f31499a.setAlpha(i10);
        hVar.f31501c.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
