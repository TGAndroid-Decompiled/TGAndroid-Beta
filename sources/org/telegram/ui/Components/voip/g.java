package org.telegram.ui.Components.voip;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SvgHelper;
public final class g extends Drawable {
    public float f31463a;
    public final SvgHelper.SvgDrawable f31464b;
    public final h f31465c;

    public g(h hVar, SvgHelper.SvgDrawable svgDrawable) {
        this.f31465c = hVar;
        this.f31464b = svgDrawable;
    }

    @Override
    public final void draw(Canvas canvas) {
        h hVar = this.f31465c;
        int i10 = hVar.e;
        Matrix matrix = hVar.f31476i;
        hVar.f31474f = getBounds().width();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(getBounds());
        hVar.a(this.f31463a, canvas, rectF, null);
        SvgHelper.SvgDrawable svgDrawable = this.f31464b;
        if (svgDrawable != null) {
            svgDrawable.setPaint(hVar.f31471a);
            int i11 = hVar.f31474f;
            float f7 = (((i10 * 2) + i11) * hVar.f31475g) - i10;
            float scale = svgDrawable.getScale(getBounds().width(), getBounds().height());
            matrix.reset();
            matrix.setScale(1.0f / scale, 0.0f, i10 / 2.0f, 0.0f);
            matrix.setTranslate((f7 - svgDrawable.getBounds().left) - (i10 / scale), 0.0f);
            hVar.f31472b.setLocalMatrix(matrix);
            int i12 = ((int) (i11 * 0.5f)) / 2;
            svgDrawable.setBounds(getBounds().centerX() - i12, getBounds().centerY() - i12, getBounds().centerX() + i12, getBounds().centerY() + i12);
            svgDrawable.draw(canvas);
        }
        hVar.f31482o.invalidate();
    }

    @Override
    public final int getOpacity() {
        return -3;
    }

    @Override
    public final void setAlpha(int i10) {
        h hVar = this.f31465c;
        hVar.f31471a.setAlpha(i10);
        hVar.f31473c.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
