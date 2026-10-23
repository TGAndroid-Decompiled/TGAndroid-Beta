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
public final class n5 extends Drawable {
    public final Paint f34607a = new Paint(1);
    public final Path f34608b = new Path();
    public final RectF f34609c = new RectF();
    public final float[] d = {AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), 0.0f, 0.0f, 0.0f, 0.0f};

    @Override
    public final void draw(Canvas canvas) {
        canvas.drawPath(this.f34608b, this.f34607a);
    }

    @Override
    public final int getOpacity() {
        return -3;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        RectF rectF = this.f34609c;
        rectF.set(rect);
        Path path = this.f34608b;
        path.reset();
        path.addRoundRect(rectF, this.d, Path.Direction.CW);
        this.f34607a.setShader(new LinearGradient(0.0f, rect.top, 0.0f, rect.bottom, new int[]{-16216082, -12207881}, new float[]{0.15f, 0.53f}, Shader.TileMode.CLAMP));
    }

    @Override
    public final void setAlpha(int i10) {
        this.f34607a.setAlpha(i10);
        invalidateSelf();
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f34607a.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
