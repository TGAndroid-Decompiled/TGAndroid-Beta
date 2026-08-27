package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotchInfoUtils;
import org.telegram.messenger.Utilities;

public final class dh0 implements fh0 {

    public Bitmap f27760a;

    public Canvas f27761b;

    public final Paint f27762c;
    public final Paint d;

    public int f27763e;

    public int f27764f;

    public int f27765g;
    public int h;

    public final gh0 f27766i;

    public dh0(gh0 gh0Var) {
        this.f27766i = gh0Var;
        Paint paint = new Paint();
        this.f27762c = paint;
        Paint paint2 = new Paint();
        this.d = paint2;
        paint.setFlags(7);
        paint.setFilterBitmap(true);
        paint2.setFlags(7);
        paint2.setFilterBitmap(true);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP));
        paint.setColorFilter(new ColorMatrixColorFilter(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 60.0f, -7500.0f}));
    }

    @Override
    public final void c(vu vuVar, Canvas canvas) {
        Canvas canvas2;
        int i10;
        int i11;
        gh0 gh0Var = (gh0) vuVar.f34056b;
        gh0 gh0Var2 = this.f27766i;
        Paint paint = gh0Var2.f28626a;
        Bitmap bitmap = this.f27760a;
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        int iA = (int) ((1.0f - ((h7.n.a(gh0Var2.f28630f, 0.2f, 0.3f) - 0.2f) / 0.10000001f)) * 255.0f);
        float width = (gh0Var2.getWidth() - this.f27764f) / 2.0f;
        canvas.save();
        canvas.translate(0.0f, -AndroidUtilities.dp(32.0f));
        if (iA != 255) {
            this.f27760a.eraseColor(0);
            this.f27761b.save();
            this.f27761b.scale(this.f27760a.getWidth() / this.f27765g, this.f27760a.getHeight() / this.h);
            float f10 = -width;
            this.f27761b.translate(f10, 0.0f);
            gh0.a(gh0Var, this.f27761b);
            this.f27761b.restore();
            this.f27761b.save();
            this.f27761b.scale(this.f27760a.getWidth() / this.f27765g, this.f27760a.getHeight() / this.h);
            if (gh0Var2.f28631n != null) {
                this.f27761b.save();
                this.f27761b.translate(f10, AndroidUtilities.dp(32.0f));
                NotchInfoUtils.NotchInfo notchInfo = gh0Var2.f28631n;
                if (notchInfo.isLikelyCircle) {
                    float fMin = Math.min(notchInfo.bounds.width(), gh0Var2.f28631n.bounds.height()) / 2.0f;
                    Canvas canvas3 = this.f27761b;
                    float fCenterX = gh0Var2.f28631n.bounds.centerX();
                    RectF rectF = gh0Var2.f28631n.bounds;
                    canvas3.drawCircle(fCenterX, rectF.bottom - (rectF.width() / 2.0f), fMin, paint);
                } else if (notchInfo.isAccurate) {
                    this.f27761b.drawPath(notchInfo.path, paint);
                } else {
                    float fMax = Math.max(notchInfo.bounds.width(), gh0Var2.f28631n.bounds.height()) / 2.0f;
                    this.f27761b.drawRoundRect(gh0Var2.f28631n.bounds, fMax, fMax, paint);
                }
                this.f27761b.restore();
            } else {
                this.f27761b.drawRect(0.0f, 0.0f, this.f27764f, AndroidUtilities.dp(32.0f), paint);
            }
            this.f27761b.restore();
            Utilities.stackBlurBitmap(this.f27760a, (int) ((gh0Var2.d * 2.0f) / 6.0f));
            canvas.save();
            canvas.translate(width, 0.0f);
            i10 = 255;
            canvas2 = canvas;
            canvas2.saveLayer(0.0f, 0.0f, this.f27765g, this.h, null);
            canvas2.scale(this.f27765g / this.f27760a.getWidth(), this.h / this.f27760a.getHeight());
            canvas2.drawBitmap(this.f27760a, 0.0f, 0.0f, this.f27762c);
            canvas2.drawBitmap(this.f27760a, 0.0f, 0.0f, this.d);
            canvas2.restore();
            canvas2.restore();
        } else {
            canvas2 = canvas;
            i10 = 255;
        }
        if (iA != 0) {
            if (iA != i10) {
                i11 = iA;
                canvas2.saveLayerAlpha(width, 0.0f, width + this.f27764f, this.f27763e, i11);
            } else {
                i11 = iA;
            }
            gh0.a(gh0Var, canvas2);
            if (i11 != i10) {
                canvas2.restore();
            }
        }
        canvas2.restore();
    }

    @Override
    public final void d(int i10, int i11) {
        Bitmap bitmap = this.f27760a;
        if (bitmap != null) {
            bitmap.recycle();
            this.f27760a = null;
        }
        this.f27764f = Math.min(AndroidUtilities.dp(120.0f), i10);
        int iMin = Math.min(AndroidUtilities.dp(220.0f), i11);
        this.f27763e = iMin;
        this.f27765g = this.f27764f;
        int iDp = AndroidUtilities.dp(32.0f) + iMin;
        this.h = iDp;
        this.f27760a = Bitmap.createBitmap((int) (this.f27765g / 6.0f), (int) (iDp / 6.0f), Bitmap.Config.ARGB_8888);
        this.f27761b = new Canvas(this.f27760a);
    }

    @Override
    public final void a(float f10) {
    }

    @Override
    public final void b(float f10) {
    }
}
