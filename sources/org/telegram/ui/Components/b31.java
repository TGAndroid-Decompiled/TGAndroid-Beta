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
public final class b31 extends ImageView {
    public static final org.telegram.ui.Cells.b1 f26740w = new org.telegram.ui.Cells.b1(Float.class, "radius", 3);
    public final Paint f26741a;
    public final Matrix f26742b;
    public RadialGradient f26743c;
    public boolean d;
    public float e;
    public float f26744f;
    public float h;
    public ak0 f26745n;
    public ColorFilter f26746r;
    public final int[] f26747s;
    public final int[] v;

    public b31(Context context) {
        super(context);
        this.f26741a = new Paint(1);
        this.f26742b = new Matrix();
        this.f26747s = new int[2];
        this.v = new int[2];
    }

    public static void a(Bitmap bitmap, org.telegram.ui.ActionBar.d4 d4Var, ak0 ak0Var) {
        Drawable drawable = ak0Var.getDrawable();
        if (drawable != null && ak0Var.isAttachedToWindow() && bitmap.isMutable()) {
            int[] iArr = new int[2];
            RectF rectF = new RectF(drawable.getBounds());
            ak0Var.getImageMatrix().mapRect(rectF);
            ak0Var.getLocationInWindow(iArr);
            rectF.offset(ak0Var.getPaddingLeft() + iArr[0], ak0Var.getPaddingTop() + iArr[1]);
            if (d4Var != null) {
                d4Var.getLocationInWindow(iArr);
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
        this.f26744f = f10;
        this.d = z10;
        RadialGradient radialGradient = this.f26743c;
        Paint paint = this.f26741a;
        if (radialGradient == null) {
            RadialGradient radialGradient2 = new RadialGradient(0.0f, 0.0f, 100.0f, new int[]{-16777216, -16777216, 0}, new float[]{0.0f, 0.6f, 1.0f}, Shader.TileMode.CLAMP);
            this.f26743c = radialGradient2;
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
        if (this.f26743c == null) {
            super.onDraw(canvas);
        } else if (this.h < 1.0f && !this.d) {
        } else {
            int saveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null);
            super.onDraw(canvas);
            ak0 ak0Var = this.f26745n;
            if (ak0Var != null) {
                drawable = ak0Var.getDrawable();
            } else {
                drawable = null;
            }
            if (drawable != null && this.f26745n.isAttachedToWindow()) {
                ak0 ak0Var2 = this.f26745n;
                int[] iArr = this.f26747s;
                ak0Var2.getLocationInWindow(iArr);
                int[] iArr2 = this.v;
                getLocationInWindow(iArr2);
                ColorFilter colorFilter = drawable.getColorFilter();
                canvas.save();
                canvas.translate(this.f26745n.getPaddingLeft() + (iArr[0] - iArr2[0]), this.f26745n.getPaddingTop() + (iArr[1] - iArr2[1]));
                canvas.concat(this.f26745n.getImageMatrix());
                drawable.setColorFilter(this.f26746r);
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
                Matrix matrix = this.f26742b;
                matrix.setScale(f10, f10);
                matrix.postTranslate(this.e, this.f26744f);
                this.f26743c.setLocalMatrix(matrix);
                canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.f26741a);
            }
            canvas.restoreToCount(saveLayer);
        }
    }

    public void setRadius(float f7) {
        this.h = f7;
        invalidate();
    }
}
