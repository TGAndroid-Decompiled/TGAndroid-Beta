package org.telegram.ui.Components.voip;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SvgHelper;
public final class g extends Drawable {
    public float f32041a;
    public final SvgHelper.SvgDrawable f32042b;
    public final h f32043c;

    public g(h hVar, SvgHelper.SvgDrawable svgDrawable) {
        this.f32043c = hVar;
        this.f32042b = svgDrawable;
    }

    @Override
    public final void draw(Canvas canvas) {
        h hVar = this.f32043c;
        int i10 = hVar.f32054e;
        Matrix matrix = hVar.f32057i;
        hVar.f32055f = getBounds().width();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(getBounds());
        hVar.a(this.f32041a, canvas, rectF, null);
        SvgHelper.SvgDrawable svgDrawable = this.f32042b;
        if (svgDrawable != null) {
            svgDrawable.setPaint(hVar.f32051a);
            int i11 = hVar.f32055f;
            float f10 = (((i10 * 2) + i11) * hVar.f32056g) - i10;
            float scale = svgDrawable.getScale(getBounds().width(), getBounds().height());
            matrix.reset();
            matrix.setScale(1.0f / scale, 0.0f, i10 / 2.0f, 0.0f);
            matrix.setTranslate((f10 - svgDrawable.getBounds().left) - (i10 / scale), 0.0f);
            hVar.f32052b.setLocalMatrix(matrix);
            int i12 = ((int) (i11 * 0.5f)) / 2;
            svgDrawable.setBounds(getBounds().centerX() - i12, getBounds().centerY() - i12, getBounds().centerX() + i12, getBounds().centerY() + i12);
            svgDrawable.draw(canvas);
        }
        hVar.f32063o.invalidate();
    }

    @Override
    public final int getOpacity() {
        return -3;
    }

    @Override
    public final void setAlpha(int i10) {
        h hVar = this.f32043c;
        hVar.f32051a.setAlpha(i10);
        hVar.f32053c.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
