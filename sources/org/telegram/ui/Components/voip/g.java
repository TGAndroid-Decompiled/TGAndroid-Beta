package org.telegram.ui.Components.voip;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SvgHelper;
public final class g extends Drawable {
    public float f31674a;
    public final SvgHelper.SvgDrawable f31675b;
    public final h f31676c;

    public g(h hVar, SvgHelper.SvgDrawable svgDrawable) {
        this.f31676c = hVar;
        this.f31675b = svgDrawable;
    }

    @Override
    public final void draw(Canvas canvas) {
        h hVar = this.f31676c;
        int i10 = hVar.f31686e;
        Matrix matrix = hVar.f31689i;
        hVar.f31687f = getBounds().width();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(getBounds());
        hVar.a(this.f31674a, canvas, rectF, null);
        SvgHelper.SvgDrawable svgDrawable = this.f31675b;
        if (svgDrawable != null) {
            svgDrawable.setPaint(hVar.f31683a);
            int i11 = hVar.f31687f;
            float f7 = (((i10 * 2) + i11) * hVar.f31688g) - i10;
            float scale = svgDrawable.getScale(getBounds().width(), getBounds().height());
            matrix.reset();
            matrix.setScale(1.0f / scale, 0.0f, i10 / 2.0f, 0.0f);
            matrix.setTranslate((f7 - svgDrawable.getBounds().left) - (i10 / scale), 0.0f);
            hVar.f31684b.setLocalMatrix(matrix);
            int i12 = ((int) (i11 * 0.5f)) / 2;
            svgDrawable.setBounds(getBounds().centerX() - i12, getBounds().centerY() - i12, getBounds().centerX() + i12, getBounds().centerY() + i12);
            svgDrawable.draw(canvas);
        }
        hVar.f31695o.invalidate();
    }

    @Override
    public final int getOpacity() {
        return -3;
    }

    @Override
    public final void setAlpha(int i10) {
        h hVar = this.f31676c;
        hVar.f31683a.setAlpha(i10);
        hVar.f31685c.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
