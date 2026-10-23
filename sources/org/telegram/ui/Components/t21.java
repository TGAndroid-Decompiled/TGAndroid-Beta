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
public final class t21 extends ImageView {
    public static final org.telegram.ui.Cells.c1 f30619w = new org.telegram.ui.Cells.c1(Float.class, "radius", 3);
    public final Paint f30620a;
    public final Matrix f30621b;
    public RadialGradient f30622c;
    public boolean d;
    public float e;
    public float f30623f;
    public float h;
    public bk0 f30624n;
    public ColorFilter f30625r;
    public final int[] f30626s;
    public final int[] v;

    public t21(Context context) {
        super(context);
        this.f30620a = new Paint(1);
        this.f30621b = new Matrix();
        this.f30626s = new int[2];
        this.v = new int[2];
    }

    public static void a(Bitmap bitmap, org.telegram.ui.ActionBar.b4 b4Var, bk0 bk0Var) {
        Drawable drawable = bk0Var.getDrawable();
        if (drawable != null && bk0Var.isAttachedToWindow() && bitmap.isMutable()) {
            int[] iArr = new int[2];
            RectF rectF = new RectF(drawable.getBounds());
            bk0Var.getImageMatrix().mapRect(rectF);
            bk0Var.getLocationInWindow(iArr);
            rectF.offset(bk0Var.getPaddingLeft() + iArr[0], bk0Var.getPaddingTop() + iArr[1]);
            if (b4Var != null) {
                b4Var.getLocationInWindow(iArr);
                rectF.offset(-iArr[0], -iArr[1]);
            }
            int max = Math.max(1, ((int) Math.floor(rectF.left)) - 1);
            int min = Math.min(bitmap.getWidth(), ((int) Math.ceil(rectF.right)) + 1);
            int max2 = Math.max(0, ((int) Math.floor(rectF.top)) - 1);
            int min2 = Math.min(bitmap.getHeight(), ((int) Math.ceil(rectF.bottom)) + 1);
            if (max < min && max2 < min2) {
                int i10 = min - max;
                int[] iArr2 = new int[i10];
                for (int i11 = max2; i11 < min2; i11++) {
                    Arrays.fill(iArr2, bitmap.getPixel(max - 1, i11));
                    bitmap.setPixels(iArr2, 0, i10, max, i11, i10, 1);
                }
            }
        }
    }

    public final void b(float f7, float f10, boolean z10) {
        PorterDuff.Mode mode;
        this.e = f7;
        this.f30623f = f10;
        this.d = z10;
        RadialGradient radialGradient = this.f30622c;
        Paint paint = this.f30620a;
        if (radialGradient == null) {
            RadialGradient radialGradient2 = new RadialGradient(0.0f, 0.0f, 100.0f, new int[]{-16777216, -16777216, 0}, new float[]{0.0f, 0.6f, 1.0f}, Shader.TileMode.CLAMP);
            this.f30622c = radialGradient2;
            paint.setShader(radialGradient2);
        }
        if (z10) {
            mode = PorterDuff.Mode.DST_OUT;
        } else {
            mode = PorterDuff.Mode.DST_IN;
        }
        paint.setXfermode(new PorterDuffXfermode(mode));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Drawable drawable;
        if (this.f30622c == null) {
            super.onDraw(canvas);
        } else if (this.h < 1.0f && !this.d) {
        } else {
            int saveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null);
            super.onDraw(canvas);
            bk0 bk0Var = this.f30624n;
            if (bk0Var != null) {
                drawable = bk0Var.getDrawable();
            } else {
                drawable = null;
            }
            if (drawable != null && this.f30624n.isAttachedToWindow()) {
                bk0 bk0Var2 = this.f30624n;
                int[] iArr = this.f30626s;
                bk0Var2.getLocationInWindow(iArr);
                int[] iArr2 = this.v;
                getLocationInWindow(iArr2);
                ColorFilter colorFilter = drawable.getColorFilter();
                canvas.save();
                canvas.translate(this.f30624n.getPaddingLeft() + (iArr[0] - iArr2[0]), this.f30624n.getPaddingTop() + (iArr[1] - iArr2[1]));
                canvas.concat(this.f30624n.getImageMatrix());
                drawable.setColorFilter(this.f30625r);
                drawable.draw(canvas);
                drawable.setColorFilter(colorFilter);
                canvas.restore();
                if ((drawable instanceof Animatable) && ((Animatable) drawable).isRunning()) {
                    invalidate();
                }
            }
            float f7 = this.h;
            if (f7 >= 1.0f) {
                float f10 = f7 / 100.0f;
                Matrix matrix = this.f30621b;
                matrix.setScale(f10, f10);
                matrix.postTranslate(this.e, this.f30623f);
                this.f30622c.setLocalMatrix(matrix);
                canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.f30620a);
            }
            canvas.restoreToCount(saveLayer);
        }
    }

    public void setRadius(float f7) {
        this.h = f7;
        invalidate();
    }
}
