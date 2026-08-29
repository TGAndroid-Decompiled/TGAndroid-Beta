package org.telegram.ui.Components.voip;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SvgHelper;
public final class g extends Drawable {
    public float f33700a;
    public final SvgHelper.SvgDrawable f33701b;
    public final h f33702c;

    public g(h hVar, SvgHelper.SvgDrawable svgDrawable) {
        this.f33702c = hVar;
        this.f33701b = svgDrawable;
    }

    @Override
    public final void draw(Canvas canvas) {
        h hVar = this.f33702c;
        int i10 = hVar.f33719e;
        Matrix matrix = hVar.f33722i;
        hVar.f33720f = getBounds().width();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(getBounds());
        hVar.a(this.f33700a, canvas, rectF, null);
        SvgHelper.SvgDrawable svgDrawable = this.f33701b;
        if (svgDrawable != null) {
            svgDrawable.setPaint(hVar.f33716a);
            int i11 = hVar.f33720f;
            float f9 = (((i10 * 2) + i11) * hVar.f33721g) - i10;
            float scale = svgDrawable.getScale(getBounds().width(), getBounds().height());
            matrix.reset();
            matrix.setScale(1.0f / scale, 0.0f, i10 / 2.0f, 0.0f);
            matrix.setTranslate((f9 - svgDrawable.getBounds().left) - (i10 / scale), 0.0f);
            hVar.f33717b.setLocalMatrix(matrix);
            int i12 = ((int) (i11 * 0.5f)) / 2;
            svgDrawable.setBounds(getBounds().centerX() - i12, getBounds().centerY() - i12, getBounds().centerX() + i12, getBounds().centerY() + i12);
            svgDrawable.draw(canvas);
        }
        hVar.f33728o.invalidate();
    }

    @Override
    public final int getOpacity() {
        return -3;
    }

    @Override
    public final void setAlpha(int i10) {
        h hVar = this.f33702c;
        hVar.f33716a.setAlpha(i10);
        hVar.f33718c.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
