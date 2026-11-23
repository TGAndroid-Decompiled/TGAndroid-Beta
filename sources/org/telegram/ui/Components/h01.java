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
public final class h01 extends ImageView {
    public static final org.telegram.ui.Cells.h1 f35597x = new org.telegram.ui.Cells.h1(Float.class, "radius", 3);
    public final Paint f35598a;
    public final Matrix f35599b;
    public RadialGradient f35600c;
    public boolean d;
    public float f35601e;
    public float f35602f;
    public float h;
    public qh0 f35603n;
    public ColorFilter f35604r;
    public final int[] f35605s;
    public final int[] f35606w;

    public h01(Context context) {
        super(context);
        this.f35598a = new Paint(1);
        this.f35599b = new Matrix();
        this.f35605s = new int[2];
        this.f35606w = new int[2];
    }

    public static void a(Bitmap bitmap, org.telegram.ui.ActionBar.o3 o3Var, qh0 qh0Var) {
        Drawable drawable = qh0Var.getDrawable();
        if (drawable != null && qh0Var.isAttachedToWindow() && bitmap.isMutable()) {
            int[] iArr = new int[2];
            RectF rectF = new RectF(drawable.getBounds());
            qh0Var.getImageMatrix().mapRect(rectF);
            qh0Var.getLocationInWindow(iArr);
            rectF.offset(qh0Var.getPaddingLeft() + iArr[0], qh0Var.getPaddingTop() + iArr[1]);
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

    public final void b(float f10, float f11, boolean z10) {
        PorterDuff.Mode mode;
        this.f35601e = f10;
        this.f35602f = f11;
        this.d = z10;
        RadialGradient radialGradient = this.f35600c;
        Paint paint = this.f35598a;
        if (radialGradient == null) {
            RadialGradient radialGradient2 = new RadialGradient(0.0f, 0.0f, 100.0f, new int[]{-16777216, -16777216, 0}, new float[]{0.0f, 0.6f, 1.0f}, Shader.TileMode.CLAMP);
            this.f35600c = radialGradient2;
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
        if (this.f35600c == null) {
            super.onDraw(canvas);
        } else if (this.h < 1.0f && !this.d) {
        } else {
            int saveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null);
            super.onDraw(canvas);
            qh0 qh0Var = this.f35603n;
            if (qh0Var != null) {
                drawable = qh0Var.getDrawable();
            } else {
                drawable = null;
            }
            if (drawable != null && this.f35603n.isAttachedToWindow()) {
                qh0 qh0Var2 = this.f35603n;
                int[] iArr = this.f35605s;
                qh0Var2.getLocationInWindow(iArr);
                int[] iArr2 = this.f35606w;
                getLocationInWindow(iArr2);
                ColorFilter colorFilter = drawable.getColorFilter();
                canvas.save();
                canvas.translate(this.f35603n.getPaddingLeft() + (iArr[0] - iArr2[0]), this.f35603n.getPaddingTop() + (iArr[1] - iArr2[1]));
                canvas.concat(this.f35603n.getImageMatrix());
                drawable.setColorFilter(this.f35604r);
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
                Matrix matrix = this.f35599b;
                matrix.setScale(f11, f11);
                matrix.postTranslate(this.f35601e, this.f35602f);
                this.f35600c.setLocalMatrix(matrix);
                canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.f35598a);
            }
            canvas.restoreToCount(saveLayer);
        }
    }

    public void setRadius(float f10) {
        this.h = f10;
        invalidate();
    }
}
