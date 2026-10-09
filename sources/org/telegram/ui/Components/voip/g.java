package org.telegram.ui.Components.voip;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SvgHelper;
public final class g extends Drawable {
    public float f31938a;
    public final SvgHelper.SvgDrawable f31939b;
    public final h f31940c;

    public g(h hVar, SvgHelper.SvgDrawable svgDrawable) {
        this.f31940c = hVar;
        this.f31939b = svgDrawable;
    }

    @Override
    public final void draw(Canvas canvas) {
        h hVar = this.f31940c;
        int i10 = hVar.f31954e;
        Matrix matrix = hVar.f31957i;
        hVar.f31955f = getBounds().width();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(getBounds());
        hVar.a(this.f31938a, canvas, rectF, null);
        SvgHelper.SvgDrawable svgDrawable = this.f31939b;
        if (svgDrawable != null) {
            svgDrawable.setPaint(hVar.f31951a);
            int i11 = hVar.f31955f;
            float f7 = (((i10 * 2) + i11) * hVar.f31956g) - i10;
            float scale = svgDrawable.getScale(getBounds().width(), getBounds().height());
            matrix.reset();
            matrix.setScale(1.0f / scale, 0.0f, i10 / 2.0f, 0.0f);
            matrix.setTranslate((f7 - svgDrawable.getBounds().left) - (i10 / scale), 0.0f);
            hVar.f31952b.setLocalMatrix(matrix);
            int i12 = ((int) (i11 * 0.5f)) / 2;
            svgDrawable.setBounds(getBounds().centerX() - i12, getBounds().centerY() - i12, getBounds().centerX() + i12, getBounds().centerY() + i12);
            svgDrawable.draw(canvas);
        }
        hVar.f31963o.invalidate();
    }

    @Override
    public final int getOpacity() {
        return -3;
    }

    @Override
    public final void setAlpha(int i10) {
        h hVar = this.f31940c;
        hVar.f31951a.setAlpha(i10);
        hVar.f31953c.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
