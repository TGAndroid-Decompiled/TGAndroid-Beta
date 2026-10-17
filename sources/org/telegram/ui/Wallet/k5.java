package org.telegram.ui.Wallet;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
public final class k5 extends Drawable {
    public static Path f34435f;
    public final int f34436a;
    public final Paint f34437b;
    public final Path f34438c;
    public final Object d;
    public final Object e;

    public k5(int i10) {
        this.f34436a = i10;
        switch (i10) {
            case 1:
                Paint paint = new Paint(1);
                this.f34437b = paint;
                this.f34438c = new Path();
                this.d = new Matrix();
                this.e = new Rect();
                paint.setColor(-1);
                return;
            default:
                this.f34437b = new Paint(1);
                this.f34438c = new Path();
                this.d = new RectF();
                this.e = new float[]{AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), 0.0f, 0.0f, 0.0f, 0.0f};
                return;
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        switch (this.f34436a) {
            case 0:
                canvas.drawPath(this.f34438c, this.f34437b);
                return;
            default:
                Rect rect = (Rect) this.e;
                Matrix matrix = (Matrix) this.d;
                Rect bounds = getBounds();
                if (!bounds.isEmpty()) {
                    boolean equals = bounds.equals(rect);
                    Path path = this.f34438c;
                    if (!equals) {
                        rect.set(bounds);
                        matrix.setScale(bounds.width() / 52.0f, bounds.height() / 52.0f);
                        matrix.postTranslate(bounds.left, bounds.top);
                        if (f34435f == null) {
                            f34435f = v7.x7.d("M25.0339 38.8535L16.4947 44.2223C15.6075 44.7802 14.4361 44.5131 13.8782 43.6258C13.6038 43.1893 13.5188 42.6601 13.6426 42.1598L15.0264 36.5704C15.4811 34.7334 16.7041 33.1809 18.3835 32.3088L26.359 28.1671C26.7894 27.9436 26.9572 27.4137 26.7337 26.9833C26.5595 26.6481 26.1903 26.4617 25.8172 26.5208L16.9312 27.9261C14.8088 28.2617 12.6463 27.6475 11.0173 26.2465L7.5978 23.3054C6.8032 22.622 6.71306 21.4239 7.39646 20.6293C7.7225 20.2503 8.18486 20.0153 8.68322 19.9753L18.8056 19.1622C19.5221 19.1046 20.1443 18.6473 20.4134 17.9809L24.2843 8.39097C24.6766 7.41912 25.7823 6.94929 26.7542 7.34157C27.232 7.53443 27.6108 7.91321 27.8037 8.39097L31.6745 17.9809C31.9435 18.6473 32.5659 19.1046 33.2822 19.1622L43.4582 19.9795C44.5029 20.0634 45.2817 20.9784 45.1978 22.023C45.1582 22.5159 44.9279 22.9737 44.5559 23.2992L36.7229 30.1527C36.1947 30.6149 35.9647 31.3308 36.125 32.0141L38.5201 42.2261C38.7594 43.2465 38.1263 44.2677 37.106 44.507C36.6119 44.6228 36.0921 44.536 35.6626 44.2659L27.054 38.8535C26.4366 38.4654 25.6513 38.4654 25.0339 38.8535Z");
                        }
                        f34435f.transform(matrix, path);
                    }
                    canvas.drawPath(path, this.f34437b);
                    return;
                }
                return;
        }
    }

    @Override
    public int getIntrinsicHeight() {
        switch (this.f34436a) {
            case 1:
                return AndroidUtilities.dp(18.0f);
            default:
                return super.getIntrinsicHeight();
        }
    }

    @Override
    public int getIntrinsicWidth() {
        switch (this.f34436a) {
            case 1:
                return AndroidUtilities.dp(18.0f);
            default:
                return super.getIntrinsicWidth();
        }
    }

    @Override
    public final int getOpacity() {
        switch (this.f34436a) {
            case 0:
                return -3;
            default:
                return -3;
        }
    }

    @Override
    public void onBoundsChange(Rect rect) {
        switch (this.f34436a) {
            case 0:
                super.onBoundsChange(rect);
                RectF rectF = (RectF) this.d;
                rectF.set(rect);
                Path path = this.f34438c;
                path.reset();
                path.addRoundRect(rectF, (float[]) this.e, Path.Direction.CW);
                this.f34437b.setShader(new LinearGradient(0.0f, rect.top, 0.0f, rect.bottom, new int[]{-16216082, -12207881}, new float[]{0.15f, 0.53f}, Shader.TileMode.CLAMP));
                return;
            default:
                super.onBoundsChange(rect);
                return;
        }
    }

    @Override
    public final void setAlpha(int i10) {
        switch (this.f34436a) {
            case 0:
                this.f34437b.setAlpha(i10);
                invalidateSelf();
                return;
            default:
                this.f34437b.setAlpha(i10);
                return;
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        switch (this.f34436a) {
            case 0:
                this.f34437b.setColorFilter(colorFilter);
                invalidateSelf();
                return;
            default:
                this.f34437b.setColorFilter(colorFilter);
                return;
        }
    }
}
