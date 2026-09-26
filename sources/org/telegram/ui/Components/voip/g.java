package org.telegram.ui.Components.voip;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SvgHelper;
public final class g extends Drawable {
    public float f29271a;
    public final SvgHelper.SvgDrawable f29272b;
    public final h f29273c;

    public g(h hVar, SvgHelper.SvgDrawable svgDrawable) {
        this.f29273c = hVar;
        this.f29272b = svgDrawable;
    }

    @Override
    public final void draw(Canvas canvas) {
        h hVar = this.f29273c;
        int i10 = hVar.e;
        Matrix matrix = hVar.f29286i;
        hVar.f29284f = getBounds().width();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(getBounds());
        hVar.a(this.f29271a, canvas, rectF, null);
        SvgHelper.SvgDrawable svgDrawable = this.f29272b;
        if (svgDrawable != null) {
            svgDrawable.setPaint(hVar.f29281a);
            int i11 = hVar.f29284f;
            float f7 = (((i10 * 2) + i11) * hVar.f29285g) - i10;
            float scale = svgDrawable.getScale(getBounds().width(), getBounds().height());
            matrix.reset();
            matrix.setScale(1.0f / scale, 0.0f, i10 / 2.0f, 0.0f);
            matrix.setTranslate((f7 - svgDrawable.getBounds().left) - (i10 / scale), 0.0f);
            hVar.f29282b.setLocalMatrix(matrix);
            int i12 = ((int) (i11 * 0.5f)) / 2;
            svgDrawable.setBounds(getBounds().centerX() - i12, getBounds().centerY() - i12, getBounds().centerX() + i12, getBounds().centerY() + i12);
            svgDrawable.draw(canvas);
        }
        hVar.f29292o.invalidate();
    }

    @Override
    public final int getOpacity() {
        return -3;
    }

    @Override
    public final void setAlpha(int i10) {
        h hVar = this.f29273c;
        hVar.f29281a.setAlpha(i10);
        hVar.f29283c.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
