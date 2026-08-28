package org.telegram.ui.Components.voip;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SvgHelper;
public final class g extends Drawable {
    public float f33513a;
    public final SvgHelper.SvgDrawable f33514b;
    public final h f33515c;

    public g(h hVar, SvgHelper.SvgDrawable svgDrawable) {
        this.f33515c = hVar;
        this.f33514b = svgDrawable;
    }

    @Override
    public final void draw(Canvas canvas) {
        h hVar = this.f33515c;
        int i9 = hVar.f33540e;
        Matrix matrix = hVar.f33543i;
        hVar.f33541f = getBounds().width();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(getBounds());
        hVar.a(this.f33513a, canvas, rectF, null);
        SvgHelper.SvgDrawable svgDrawable = this.f33514b;
        if (svgDrawable != null) {
            svgDrawable.setPaint(hVar.f33537a);
            int i10 = hVar.f33541f;
            float f10 = (((i9 * 2) + i10) * hVar.f33542g) - i9;
            float scale = svgDrawable.getScale(getBounds().width(), getBounds().height());
            matrix.reset();
            matrix.setScale(1.0f / scale, 0.0f, i9 / 2.0f, 0.0f);
            matrix.setTranslate((f10 - svgDrawable.getBounds().left) - (i9 / scale), 0.0f);
            hVar.f33538b.setLocalMatrix(matrix);
            int i11 = ((int) (i10 * 0.5f)) / 2;
            svgDrawable.setBounds(getBounds().centerX() - i11, getBounds().centerY() - i11, getBounds().centerX() + i11, getBounds().centerY() + i11);
            svgDrawable.draw(canvas);
        }
        hVar.f33549o.invalidate();
    }

    @Override
    public final int getOpacity() {
        return -3;
    }

    @Override
    public final void setAlpha(int i9) {
        h hVar = this.f33515c;
        hVar.f33537a.setAlpha(i9);
        hVar.f33539c.setAlpha(i9);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
