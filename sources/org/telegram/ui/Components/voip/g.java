package org.telegram.ui.Components.voip;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SvgHelper;
public final class g extends Drawable {
    public float f29246a;
    public final SvgHelper.SvgDrawable f29247b;
    public final h f29248c;

    public g(h hVar, SvgHelper.SvgDrawable svgDrawable) {
        this.f29248c = hVar;
        this.f29247b = svgDrawable;
    }

    @Override
    public final void draw(Canvas canvas) {
        h hVar = this.f29248c;
        int i10 = hVar.e;
        Matrix matrix = hVar.f29263i;
        hVar.f29261f = getBounds().width();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(getBounds());
        hVar.a(this.f29246a, canvas, rectF, null);
        SvgHelper.SvgDrawable svgDrawable = this.f29247b;
        if (svgDrawable != null) {
            svgDrawable.setPaint(hVar.f29258a);
            int i11 = hVar.f29261f;
            float f7 = (((i10 * 2) + i11) * hVar.f29262g) - i10;
            float scale = svgDrawable.getScale(getBounds().width(), getBounds().height());
            matrix.reset();
            matrix.setScale(1.0f / scale, 0.0f, i10 / 2.0f, 0.0f);
            matrix.setTranslate((f7 - svgDrawable.getBounds().left) - (i10 / scale), 0.0f);
            hVar.f29259b.setLocalMatrix(matrix);
            int i12 = ((int) (i11 * 0.5f)) / 2;
            svgDrawable.setBounds(getBounds().centerX() - i12, getBounds().centerY() - i12, getBounds().centerX() + i12, getBounds().centerY() + i12);
            svgDrawable.draw(canvas);
        }
        hVar.f29269o.invalidate();
    }

    @Override
    public final int getOpacity() {
        return -3;
    }

    @Override
    public final void setAlpha(int i10) {
        h hVar = this.f29248c;
        hVar.f29258a.setAlpha(i10);
        hVar.f29260c.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
