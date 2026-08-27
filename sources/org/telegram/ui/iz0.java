package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;

public class iz0 extends org.telegram.ui.Components.n9 implements org.telegram.ui.Components.wu0 {

    public static final w0 f39189c0 = new w0("crossfadeProgress", 3);
    public boolean C;
    public float D;
    public float E;
    public int F;
    public int G;
    public int H;
    public boolean I;
    public final Path J;
    public final RectF K;
    public final Paint L;
    public boolean M;
    public float N;
    public float O;
    public ImageReceiver P;
    public final ImageReceiver Q;
    public float R;
    public ImageReceiver.BitmapHolder S;
    public boolean T;
    public float U;
    public org.telegram.ui.Components.ch0 V;
    public boolean W;

    public float f39190a0;

    public Runnable f39191b0;

    public iz0(Context context) {
        super(context);
        this.F = 0;
        this.G = 0;
        this.H = 0;
        this.J = new Path();
        this.K = new RectF();
        this.M = true;
        this.N = 1.0f;
        this.T = true;
        this.f39190a0 = 1.0f;
        this.f39191b0 = null;
        setLayerType(2, null);
        this.Q = new ImageReceiver(this);
        Paint paint = new Paint(1);
        this.L = paint;
        paint.setColor(-16777216);
    }

    @Override
    public final void g(Runnable runnable) {
        this.f39191b0 = runnable;
    }

    public float getForegroundAlpha() {
        return this.R;
    }

    public org.telegram.ui.Components.ng getPrevFragment() {
        return null;
    }

    public int getRoundRadiusForExpand() {
        return !this.I ? getRoundRadius()[0] : this.G;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        org.telegram.ui.Components.ch0 ch0Var = this.V;
        if (ch0Var != null) {
            ch0Var.invalidate();
        }
        Runnable runnable = this.f39191b0;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.Q.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.Q.onDetachedFromWindow();
        ImageReceiver.BitmapHolder bitmapHolder = this.S;
        if (bitmapHolder != null) {
            bitmapHolder.release();
            this.S = null;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        org.telegram.ui.Components.tg0 tg0Var;
        float f10;
        float f11;
        char c10;
        float f12;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        org.telegram.ui.Components.ch0 ch0Var = this.V;
        boolean z10 = ch0Var != null && ch0Var.getVisibility() == 0 && this.I && this.D > 0.0f;
        if (z10) {
            org.telegram.ui.Components.tg0 blurDrawer = this.V.getBlurDrawer();
            tg0Var = blurDrawer;
            z10 = blurDrawer != null;
        } else {
            tg0Var = null;
        }
        float fZ = org.telegram.messenger.y1.z(1.0f, this.R, this.f39190a0, (1.0f - this.U) * (this.W ? (int) AndroidUtilities.dpf2(3.5f) : 0.0f));
        org.telegram.ui.Components.k5 k5Var = this.f30901e;
        ImageReceiver imageReceiver = k5Var != null ? k5Var.f29961k : this.f30898a;
        int i10 = this.G;
        if (i10 > 0) {
            Path path = this.J;
            path.rewind();
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(fZ, fZ, measuredWidth - fZ, measuredHeight - fZ);
            float f13 = i10;
            path.addRoundRect(rectF, f13, f13, Path.Direction.CW);
            canvas.clipPath(path);
        }
        canvas.save();
        float f14 = this.N;
        float f15 = measuredWidth;
        float f16 = measuredHeight;
        canvas.scale(f14, f14, f15 / 2.0f, f16 / 2.0f);
        if (z10) {
            measuredHeight = this.C ? Math.min(measuredHeight, measuredWidth) : (int) (f16 - AndroidUtilities.lerp(0.0f, this.H / this.E, this.D));
        }
        ImageReceiver imageReceiver2 = this.P;
        if (imageReceiver2 != null) {
            float f17 = this.O;
            float f18 = (1.0f - f17) * 1.0f;
            if (f17 > 0.0f) {
                float imageX = imageReceiver2.getImageX();
                float imageY = this.P.getImageY();
                float imageWidth = this.P.getImageWidth();
                f10 = 2.0f;
                float imageHeight = this.P.getImageHeight();
                f11 = 0.0f;
                float alpha = this.P.getAlpha();
                c10 = 0;
                float f19 = fZ * 2.0f;
                this.P.setImageCoords(fZ, fZ, f15 - f19, measuredHeight - f19);
                this.P.setAlpha(f17);
                this.P.draw(canvas);
                this.P.setImageCoords(imageX, imageY, imageWidth, imageHeight);
                this.P.setAlpha(alpha);
            } else {
                f10 = 2.0f;
                f11 = 0.0f;
                c10 = 0;
            }
            f12 = f18;
        } else {
            z10 = z10;
            f10 = 2.0f;
            f11 = 0.0f;
            c10 = 0;
            f12 = 1.0f;
        }
        if (imageReceiver != null && f12 > f11 && (this.R < 1.0f || !this.T)) {
            float f20 = fZ * f10;
            imageReceiver.setImageCoords(fZ, fZ, f15 - f20, measuredHeight - f20);
            float alpha2 = imageReceiver.getAlpha();
            imageReceiver.setAlpha(alpha2 * f12);
            if (this.M) {
                int i11 = imageReceiver.getRoundRadius()[c10];
                if (z10) {
                    imageReceiver.setRoundRadius(0);
                }
                imageReceiver.draw(canvas);
                if (z10) {
                    imageReceiver.setRoundRadius(i11);
                }
            }
            imageReceiver.setAlpha(alpha2);
        }
        if (this.R > f11 && this.T && f12 > f11) {
            ImageReceiver imageReceiver3 = this.Q;
            if (imageReceiver3.getDrawable() != null) {
                float f21 = fZ * f10;
                imageReceiver3.setImageCoords(fZ, fZ, f15 - f21, measuredHeight - f21);
                imageReceiver3.setAlpha(this.R * f12);
                imageReceiver3.draw(canvas);
            } else {
                RectF rectF2 = this.K;
                rectF2.set(0.0f, 0.0f, f15, measuredHeight);
                int i12 = (int) (this.R * f12 * 255.0f);
                Paint paint = this.L;
                paint.setAlpha(i12);
                float f22 = imageReceiver3.getRoundRadius()[0];
                canvas.drawRoundRect(rectF2, f22, f22, paint);
            }
        }
        if (z10) {
            float f23 = measuredHeight;
            canvas.translate(fZ, fZ + f23);
            float f24 = fZ * f10;
            tg0Var.f(canvas, this, f15 - f24, f23 - f24, true, (this.C || tg0Var.f32770a || this.V.getRealPosition() == 0) ? 1.0f - this.D : 1.0f, f12);
        }
        canvas.restore();
    }

    public void setAnimateFromImageReceiver(ImageReceiver imageReceiver) {
        this.P = imageReceiver;
    }

    public void setAvatarsViewPager(org.telegram.ui.Components.ch0 ch0Var) {
        this.V = ch0Var;
    }

    public void setCrossfadeProgress(float f10) {
        this.O = f10;
        invalidate();
    }

    public void setForegroundAlpha(float f10) {
        this.R = f10;
        invalidate();
    }

    public void setForegroundImageDrawable(ImageReceiver.BitmapHolder bitmapHolder) {
        if (bitmapHolder != null) {
            this.Q.setImageBitmap(bitmapHolder.drawable);
        }
        ImageReceiver.BitmapHolder bitmapHolder2 = this.S;
        if (bitmapHolder2 != null) {
            bitmapHolder2.release();
            this.S = null;
        }
        this.S = bitmapHolder;
    }

    public void setHasStories(boolean z10) {
        if (this.W == z10) {
            return;
        }
        this.W = z10;
        invalidate();
    }

    public void setProgressToExpand(float f10) {
        if (this.U == f10) {
            return;
        }
        this.U = f10;
        invalidate();
    }

    public void setProgressToStoriesInsets(float f10) {
        if (f10 == this.f39190a0) {
            return;
        }
        this.f39190a0 = f10;
        invalidate();
    }

    @Override
    public void setRoundRadius(int i10) {
        super.setRoundRadius(i10);
        this.Q.setRoundRadius(i10);
    }

    public void setRoundRadiusCollapse(int i10) {
        int i11 = this.F;
        this.F = i10;
        if (i11 != i10) {
            super.invalidate();
        }
    }

    public void setRoundRadiusForExpand(int i10) {
        if (!this.I) {
            setRoundRadius(i10);
        } else {
            this.G = i10;
            setRoundRadius(i10);
        }
    }

    public final void t(int i10) {
        this.H = i10;
        this.I = true;
    }

    public final void u(ImageLocation imageLocation, String str, Drawable drawable) {
        this.Q.setImage(imageLocation, str, drawable, 0L, (String) null, (Object) null, 0);
        ImageReceiver.BitmapHolder bitmapHolder = this.S;
        if (bitmapHolder != null) {
            bitmapHolder.release();
            this.S = null;
        }
    }

    @Override
    public final void invalidate(Rect rect) {
        super.invalidate(rect);
        Runnable runnable = this.f39191b0;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override
    public final void invalidate(int i10, int i11, int i12, int i13) {
        super.invalidate(i10, i11, i12, i13);
        Runnable runnable = this.f39191b0;
        if (runnable != null) {
            runnable.run();
        }
    }
}
