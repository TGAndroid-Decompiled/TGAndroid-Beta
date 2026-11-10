package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import java.util.Arrays;
public final class xz0 extends ImageView {
    public static final org.telegram.ui.Cells.g1 f40439x = new org.telegram.ui.Cells.g1(Float.class, "radius", 3);
    public final Paint f40440a;
    public final Matrix f40441b;
    public RadialGradient f40442c;
    public boolean d;
    public float f40443e;
    public float f40444f;
    public float h;
    public ch0 f40445n;
    public ColorFilter f40446r;
    public final int[] f40447s;
    public final int[] f40448w;

    public xz0(Context context) {
        super(context);
        this.f40440a = new Paint(1);
        this.f40441b = new Matrix();
        this.f40447s = new int[2];
        this.f40448w = new int[2];
    }

    public static void a(Bitmap bitmap, org.telegram.ui.ActionBar.o3 o3Var, ch0 ch0Var) {
        Drawable drawable = ch0Var.getDrawable();
        if (drawable != null && ch0Var.isAttachedToWindow() && bitmap.isMutable()) {
            int[] iArr = new int[2];
            RectF rectF = new RectF(drawable.getBounds());
            ch0Var.getImageMatrix().mapRect(rectF);
            ch0Var.getLocationInWindow(iArr);
            rectF.offset(ch0Var.getPaddingLeft() + iArr[0], ch0Var.getPaddingTop() + iArr[1]);
            if (o3Var != null) {
                o3Var.getLocationInWindow(iArr);
                rectF.offset(-iArr[0], -iArr[1]);
            }
            int max = Math.max(1, ((int) Math.floor(rectF.left)) - 1);
            int min = Math.min(bitmap.getWidth(), ((int) Math.ceil(rectF.right)) + 1);
            int max2 = Math.max(0, ((int) Math.floor(rectF.top)) - 1);
            int min2 = Math.min(bitmap.getHeight(), ((int) Math.ceil(rectF.bottom)) + 1);
            if (max < min && max2 < min2) {
                int i7 = min - max;
                int[] iArr2 = new int[i7];
                for (int i10 = max2; i10 < min2; i10++) {
                    Arrays.fill(iArr2, bitmap.getPixel(max - 1, i10));
                    bitmap.setPixels(iArr2, 0, i7, max, i10, i7, 1);
                }
            }
        }
    }

    public final void b(float f10, float f11, boolean z9) {
        PorterDuff.Mode mode;
        this.f40443e = f10;
        this.f40444f = f11;
        this.d = z9;
        RadialGradient radialGradient = this.f40442c;
        Paint paint = this.f40440a;
        if (radialGradient == null) {
            RadialGradient radialGradient2 = new RadialGradient(0.0f, 0.0f, 100.0f, new int[]{-16777216, -16777216, 0}, new float[]{0.0f, 0.6f, 1.0f}, Shader.TileMode.CLAMP);
            this.f40442c = radialGradient2;
            paint.setShader(radialGradient2);
        }
        if (z9) {
            mode = PorterDuff.Mode.DST_OUT;
        } else {
            mode = PorterDuff.Mode.DST_IN;
        }
        paint.setXfermode(new PorterDuffXfermode(mode));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Drawable drawable;
        if (this.f40442c == null) {
            super.onDraw(canvas);
        } else if (this.h < 1.0f && !this.d) {
        } else {
            int saveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null);
            super.onDraw(canvas);
            ch0 ch0Var = this.f40445n;
            if (ch0Var != null) {
                drawable = ch0Var.getDrawable();
            } else {
                drawable = null;
            }
            if (drawable != null && this.f40445n.isAttachedToWindow()) {
                ch0 ch0Var2 = this.f40445n;
                int[] iArr = this.f40447s;
                ch0Var2.getLocationInWindow(iArr);
                int[] iArr2 = this.f40448w;
                getLocationInWindow(iArr2);
                ColorFilter colorFilter = drawable.getColorFilter();
                canvas.save();
                canvas.translate(this.f40445n.getPaddingLeft() + (iArr[0] - iArr2[0]), this.f40445n.getPaddingTop() + (iArr[1] - iArr2[1]));
                canvas.concat(this.f40445n.getImageMatrix());
                drawable.setColorFilter(this.f40446r);
                drawable.draw(canvas);
                drawable.setColorFilter(colorFilter);
                canvas.restore();
                if ((drawable instanceof Animatable) && ((Animatable) drawable).isRunning()) {
                    invalidate();
                }
            }
            float f10 = this.h;
            if (f10 >= 1.0f) {
                float f11 = f10 / 100.0f;
                Matrix matrix = this.f40441b;
                matrix.setScale(f11, f11);
                matrix.postTranslate(this.f40443e, this.f40444f);
                this.f40442c.setLocalMatrix(matrix);
                canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.f40440a);
            }
            canvas.restoreToCount(saveLayer);
        }
    }

    public void setRadius(float f10) {
        this.h = f10;
        invalidate();
    }
}
