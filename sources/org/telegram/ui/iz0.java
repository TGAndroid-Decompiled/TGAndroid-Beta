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
public class iz0 extends org.telegram.ui.Components.t9 implements org.telegram.ui.Components.ev0 {
    public static final w0 f39371c0 = new w0("crossfadeProgress", 3);
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
    public org.telegram.ui.Components.kh0 V;
    public boolean W;
    public float f39372a0;
    public Runnable f39373b0;

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
        this.f39372a0 = 1.0f;
        this.f39373b0 = null;
        setLayerType(2, null);
        this.Q = new ImageReceiver(this);
        Paint paint = new Paint(1);
        this.L = paint;
        paint.setColor(-16777216);
    }

    @Override
    public final void g(Runnable runnable) {
        this.f39373b0 = runnable;
    }

    public float getForegroundAlpha() {
        return this.R;
    }

    public org.telegram.ui.Components.ug getPrevFragment() {
        return null;
    }

    public int getRoundRadiusForExpand() {
        if (!this.I) {
            return getRoundRadius()[0];
        }
        return this.G;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        org.telegram.ui.Components.kh0 kh0Var = this.V;
        if (kh0Var != null) {
            kh0Var.invalidate();
        }
        Runnable runnable = this.f39373b0;
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
        boolean z10;
        org.telegram.ui.Components.bh0 bh0Var;
        float f9;
        ImageReceiver imageReceiver;
        boolean z11;
        float f10;
        float f11;
        char c3;
        float f12;
        float f13;
        float f14;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        org.telegram.ui.Components.kh0 kh0Var = this.V;
        boolean z12 = true;
        if (kh0Var != null && kh0Var.getVisibility() == 0 && this.I && this.D > 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            org.telegram.ui.Components.bh0 blurDrawer = this.V.getBlurDrawer();
            if (blurDrawer == null) {
                z12 = false;
            }
            boolean z13 = z12;
            bh0Var = blurDrawer;
            z10 = z13;
        } else {
            bh0Var = null;
        }
        if (this.W) {
            f9 = (int) AndroidUtilities.dpf2(3.5f);
        } else {
            f9 = 0.0f;
        }
        float y8 = org.telegram.messenger.x3.y(1.0f, this.R, this.f39372a0, (1.0f - this.U) * f9);
        org.telegram.ui.Components.p5 p5Var = this.f32906e;
        if (p5Var != null) {
            imageReceiver = p5Var.f31593k;
        } else {
            imageReceiver = this.f32903a;
        }
        int i10 = this.G;
        if (i10 > 0) {
            Path path = this.J;
            path.rewind();
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(y8, y8, measuredWidth - y8, measuredHeight - y8);
            float f15 = i10;
            path.addRoundRect(rectF, f15, f15, Path.Direction.CW);
            canvas.clipPath(path);
        }
        canvas.save();
        float f16 = this.N;
        float f17 = measuredWidth;
        float f18 = measuredHeight;
        canvas.scale(f16, f16, f17 / 2.0f, f18 / 2.0f);
        if (z10) {
            if (this.C) {
                measuredHeight = Math.min(measuredHeight, measuredWidth);
            } else {
                measuredHeight = (int) (f18 - AndroidUtilities.lerp(0.0f, this.H / this.E, this.D));
            }
        }
        ImageReceiver imageReceiver2 = this.P;
        if (imageReceiver2 != null) {
            float f19 = this.O;
            float f20 = (1.0f - f19) * 1.0f;
            if (f19 > 0.0f) {
                float imageX = imageReceiver2.getImageX();
                float imageY = this.P.getImageY();
                float imageWidth = this.P.getImageWidth();
                f10 = 2.0f;
                float imageHeight = this.P.getImageHeight();
                f11 = 0.0f;
                float alpha = this.P.getAlpha();
                c3 = 0;
                float f21 = y8 * 2.0f;
                z11 = z10;
                f14 = f20;
                this.P.setImageCoords(y8, y8, f17 - f21, measuredHeight - f21);
                this.P.setAlpha(f19);
                this.P.draw(canvas);
                this.P.setImageCoords(imageX, imageY, imageWidth, imageHeight);
                this.P.setAlpha(alpha);
            } else {
                z11 = z10;
                f14 = f20;
                f10 = 2.0f;
                f11 = 0.0f;
                c3 = 0;
            }
            f12 = f14;
        } else {
            z11 = z10;
            f10 = 2.0f;
            f11 = 0.0f;
            c3 = 0;
            f12 = 1.0f;
        }
        if (imageReceiver != null && f12 > f11 && (this.R < 1.0f || !this.T)) {
            float f22 = y8 * f10;
            imageReceiver.setImageCoords(y8, y8, f17 - f22, measuredHeight - f22);
            float alpha2 = imageReceiver.getAlpha();
            imageReceiver.setAlpha(alpha2 * f12);
            if (this.M) {
                int i11 = imageReceiver.getRoundRadius()[c3];
                if (z11) {
                    imageReceiver.setRoundRadius(0);
                }
                imageReceiver.draw(canvas);
                if (z11) {
                    imageReceiver.setRoundRadius(i11);
                }
            }
            imageReceiver.setAlpha(alpha2);
        }
        if (this.R > f11 && this.T && f12 > f11) {
            ImageReceiver imageReceiver3 = this.Q;
            if (imageReceiver3.getDrawable() != null) {
                float f23 = y8 * f10;
                imageReceiver3.setImageCoords(y8, y8, f17 - f23, measuredHeight - f23);
                imageReceiver3.setAlpha(this.R * f12);
                imageReceiver3.draw(canvas);
            } else {
                RectF rectF2 = this.K;
                rectF2.set(0.0f, 0.0f, f17, measuredHeight);
                Paint paint = this.L;
                paint.setAlpha((int) (this.R * f12 * 255.0f));
                float f24 = imageReceiver3.getRoundRadius()[0];
                canvas.drawRoundRect(rectF2, f24, f24, paint);
            }
        }
        if (z11) {
            float f25 = measuredHeight;
            canvas.translate(y8, y8 + f25);
            if (!this.C && !bh0Var.f27100a && this.V.getRealPosition() != 0) {
                f13 = 1.0f;
            } else {
                f13 = 1.0f - this.D;
            }
            float f26 = y8 * f10;
            bh0Var.f(canvas, this, f17 - f26, f25 - f26, true, f13, f12);
        }
        canvas.restore();
    }

    public void setAnimateFromImageReceiver(ImageReceiver imageReceiver) {
        this.P = imageReceiver;
    }

    public void setAvatarsViewPager(org.telegram.ui.Components.kh0 kh0Var) {
        this.V = kh0Var;
    }

    public void setCrossfadeProgress(float f9) {
        this.O = f9;
        invalidate();
    }

    public void setForegroundAlpha(float f9) {
        this.R = f9;
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

    public void setProgressToExpand(float f9) {
        if (this.U == f9) {
            return;
        }
        this.U = f9;
        invalidate();
    }

    public void setProgressToStoriesInsets(float f9) {
        if (f9 == this.f39372a0) {
            return;
        }
        this.f39372a0 = f9;
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
            return;
        }
        this.G = i10;
        setRoundRadius(i10);
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
        Runnable runnable = this.f39373b0;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override
    public final void invalidate(int i10, int i11, int i12, int i13) {
        super.invalidate(i10, i11, i12, i13);
        Runnable runnable = this.f39373b0;
        if (runnable != null) {
            runnable.run();
        }
    }
}
