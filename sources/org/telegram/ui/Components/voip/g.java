package org.telegram.ui.Components.voip;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SvgHelper;

public final class g extends Drawable {

    public float f33563a;

    public final SvgHelper.SvgDrawable f33564b;

    public final h f33565c;

    public g(h hVar, SvgHelper.SvgDrawable svgDrawable) {
        this.f33565c = hVar;
        this.f33564b = svgDrawable;
    }

    @Override
    public final void draw(Canvas canvas) {
        h hVar = this.f33565c;
        int i10 = hVar.f33590e;
        Matrix matrix = hVar.f33593i;
        hVar.f33591f = getBounds().width();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(getBounds());
        hVar.a(this.f33563a, canvas, rectF, null);
        SvgHelper.SvgDrawable svgDrawable = this.f33564b;
        if (svgDrawable != null) {
            svgDrawable.setPaint(hVar.f33587a);
            int i11 = hVar.f33591f;
            float f10 = (((i10 * 2) + i11) * hVar.f33592g) - i10;
            float scale = svgDrawable.getScale(getBounds().width(), getBounds().height());
            matrix.reset();
            matrix.setScale(1.0f / scale, 0.0f, i10 / 2.0f, 0.0f);
            matrix.setTranslate((f10 - svgDrawable.getBounds().left) - (i10 / scale), 0.0f);
            hVar.f33588b.setLocalMatrix(matrix);
            int i12 = ((int) (i11 * 0.5f)) / 2;
            svgDrawable.setBounds(getBounds().centerX() - i12, getBounds().centerY() - i12, getBounds().centerX() + i12, getBounds().centerY() + i12);
            svgDrawable.draw(canvas);
        }
        hVar.f33599o.invalidate();
    }

    @Override
    public final int getOpacity() {
        return -3;
    }

    @Override
    public final void setAlpha(int i10) {
        h hVar = this.f33565c;
        hVar.f33587a.setAlpha(i10);
        hVar.f33589c.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
