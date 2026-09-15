package org.telegram.ui.Components.voip;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SvgHelper;
public final class g extends Drawable {
    public float f28950a;
    public final SvgHelper.SvgDrawable f28951b;
    public final h f28952c;

    public g(h hVar, SvgHelper.SvgDrawable svgDrawable) {
        this.f28952c = hVar;
        this.f28951b = svgDrawable;
    }

    @Override
    public final void draw(Canvas canvas) {
        h hVar = this.f28952c;
        int i10 = hVar.e;
        Matrix matrix = hVar.f28967i;
        hVar.f28965f = getBounds().width();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(getBounds());
        hVar.a(this.f28950a, canvas, rectF, null);
        SvgHelper.SvgDrawable svgDrawable = this.f28951b;
        if (svgDrawable != null) {
            svgDrawable.setPaint(hVar.f28962a);
            int i11 = hVar.f28965f;
            float f7 = (((i10 * 2) + i11) * hVar.f28966g) - i10;
            float scale = svgDrawable.getScale(getBounds().width(), getBounds().height());
            matrix.reset();
            matrix.setScale(1.0f / scale, 0.0f, i10 / 2.0f, 0.0f);
            matrix.setTranslate((f7 - svgDrawable.getBounds().left) - (i10 / scale), 0.0f);
            hVar.f28963b.setLocalMatrix(matrix);
            int i12 = ((int) (i11 * 0.5f)) / 2;
            svgDrawable.setBounds(getBounds().centerX() - i12, getBounds().centerY() - i12, getBounds().centerX() + i12, getBounds().centerY() + i12);
            svgDrawable.draw(canvas);
        }
        hVar.f28973o.invalidate();
    }

    @Override
    public final int getOpacity() {
        return -3;
    }

    @Override
    public final void setAlpha(int i10) {
        h hVar = this.f28952c;
        hVar.f28962a.setAlpha(i10);
        hVar.f28964c.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
