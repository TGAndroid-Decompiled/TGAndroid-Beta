package org.telegram.ui.Components.voip;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SvgHelper;
public final class g extends Drawable {
    public float f32046a;
    public final SvgHelper.SvgDrawable f32047b;
    public final h f32048c;

    public g(h hVar, SvgHelper.SvgDrawable svgDrawable) {
        this.f32048c = hVar;
        this.f32047b = svgDrawable;
    }

    @Override
    public final void draw(Canvas canvas) {
        h hVar = this.f32048c;
        int i10 = hVar.f32059e;
        Matrix matrix = hVar.f32062i;
        hVar.f32060f = getBounds().width();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(getBounds());
        hVar.a(this.f32046a, canvas, rectF, null);
        SvgHelper.SvgDrawable svgDrawable = this.f32047b;
        if (svgDrawable != null) {
            svgDrawable.setPaint(hVar.f32056a);
            int i11 = hVar.f32060f;
            float f10 = (((i10 * 2) + i11) * hVar.f32061g) - i10;
            float scale = svgDrawable.getScale(getBounds().width(), getBounds().height());
            matrix.reset();
            matrix.setScale(1.0f / scale, 0.0f, i10 / 2.0f, 0.0f);
            matrix.setTranslate((f10 - svgDrawable.getBounds().left) - (i10 / scale), 0.0f);
            hVar.f32057b.setLocalMatrix(matrix);
            int i12 = ((int) (i11 * 0.5f)) / 2;
            svgDrawable.setBounds(getBounds().centerX() - i12, getBounds().centerY() - i12, getBounds().centerX() + i12, getBounds().centerY() + i12);
            svgDrawable.draw(canvas);
        }
        hVar.f32068o.invalidate();
    }

    @Override
    public final int getOpacity() {
        return -3;
    }

    @Override
    public final void setAlpha(int i10) {
        h hVar = this.f32048c;
        hVar.f32056a.setAlpha(i10);
        hVar.f32058c.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
