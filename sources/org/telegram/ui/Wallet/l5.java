package org.telegram.ui.Wallet;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
public final class l5 extends Drawable {
    public final Paint f36870a = new Paint(1);
    public final Path f36871b = new Path();
    public final RectF f36872c = new RectF();
    public final float[] d = {AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), 0.0f, 0.0f, 0.0f, 0.0f};

    @Override
    public final void draw(Canvas canvas) {
        canvas.drawPath(this.f36871b, this.f36870a);
    }

    @Override
    public final int getOpacity() {
        return -3;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        RectF rectF = this.f36872c;
        rectF.set(rect);
        Path path = this.f36871b;
        path.reset();
        path.addRoundRect(rectF, this.d, Path.Direction.CW);
        this.f36870a.setShader(new LinearGradient(0.0f, rect.top, 0.0f, rect.bottom, new int[]{-16216082, -12207881}, new float[]{0.15f, 0.53f}, Shader.TileMode.CLAMP));
    }

    @Override
    public final void setAlpha(int i10) {
        this.f36870a.setAlpha(i10);
        invalidateSelf();
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f36870a.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
