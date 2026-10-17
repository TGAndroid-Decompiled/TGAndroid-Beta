package org.telegram.ui.Components.voip;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SvgHelper;
public final class g extends Drawable {
    public float f31456a;
    public final SvgHelper.SvgDrawable f31457b;
    public final h f31458c;

    public g(h hVar, SvgHelper.SvgDrawable svgDrawable) {
        this.f31458c = hVar;
        this.f31457b = svgDrawable;
    }

    @Override
    public final void draw(Canvas canvas) {
        h hVar = this.f31458c;
        int i10 = hVar.e;
        Matrix matrix = hVar.f31469i;
        hVar.f31467f = getBounds().width();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(getBounds());
        hVar.a(this.f31456a, canvas, rectF, null);
        SvgHelper.SvgDrawable svgDrawable = this.f31457b;
        if (svgDrawable != null) {
            svgDrawable.setPaint(hVar.f31464a);
            int i11 = hVar.f31467f;
            float f7 = (((i10 * 2) + i11) * hVar.f31468g) - i10;
            float scale = svgDrawable.getScale(getBounds().width(), getBounds().height());
            matrix.reset();
            matrix.setScale(1.0f / scale, 0.0f, i10 / 2.0f, 0.0f);
            matrix.setTranslate((f7 - svgDrawable.getBounds().left) - (i10 / scale), 0.0f);
            hVar.f31465b.setLocalMatrix(matrix);
            int i12 = ((int) (i11 * 0.5f)) / 2;
            svgDrawable.setBounds(getBounds().centerX() - i12, getBounds().centerY() - i12, getBounds().centerX() + i12, getBounds().centerY() + i12);
            svgDrawable.draw(canvas);
        }
        hVar.f31475o.invalidate();
    }

    @Override
    public final int getOpacity() {
        return -3;
    }

    @Override
    public final void setAlpha(int i10) {
        h hVar = this.f31458c;
        hVar.f31464a.setAlpha(i10);
        hVar.f31466c.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
