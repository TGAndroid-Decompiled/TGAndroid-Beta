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
public class iz0 extends org.telegram.ui.Components.o9 implements org.telegram.ui.Components.uu0 {
    public static final v0 f39324c0 = new v0("crossfadeProgress", 3);
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
    public org.telegram.ui.Components.ah0 V;
    public boolean W;
    public float f39325a0;
    public Runnable f39326b0;

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
        this.f39325a0 = 1.0f;
        this.f39326b0 = null;
        setLayerType(2, null);
        this.Q = new ImageReceiver(this);
        Paint paint = new Paint(1);
        this.L = paint;
        paint.setColor(-16777216);
    }

    @Override
    public final void g(Runnable runnable) {
        this.f39326b0 = runnable;
    }

    public float getForegroundAlpha() {
        return this.R;
    }

    public org.telegram.ui.Components.rg getPrevFragment() {
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
        org.telegram.ui.Components.ah0 ah0Var = this.V;
        if (ah0Var != null) {
            ah0Var.invalidate();
        }
        Runnable runnable = this.f39326b0;
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
        org.telegram.ui.Components.rg0 rg0Var;
        float f10;
        ImageReceiver imageReceiver;
        boolean z11;
        float f11;
        float f12;
        char c10;
        float f13;
        float f14;
        float f15;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        org.telegram.ui.Components.ah0 ah0Var = this.V;
        boolean z12 = true;
        if (ah0Var != null && ah0Var.getVisibility() == 0 && this.I && this.D > 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            org.telegram.ui.Components.rg0 blurDrawer = this.V.getBlurDrawer();
            if (blurDrawer == null) {
                z12 = false;
            }
            boolean z13 = z12;
            rg0Var = blurDrawer;
            z10 = z13;
        } else {
            rg0Var = null;
        }
        if (this.W) {
            f10 = (int) AndroidUtilities.dpf2(3.5f);
        } else {
            f10 = 0.0f;
        }
        float y10 = org.telegram.messenger.l0.y(1.0f, this.R, this.f39325a0, (1.0f - this.U) * f10);
        org.telegram.ui.Components.k5 k5Var = this.f31331e;
        if (k5Var != null) {
            imageReceiver = k5Var.f29951k;
        } else {
            imageReceiver = this.f31328a;
        }
        int i9 = this.G;
        if (i9 > 0) {
            Path path = this.J;
            path.rewind();
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(y10, y10, measuredWidth - y10, measuredHeight - y10);
            float f16 = i9;
            path.addRoundRect(rectF, f16, f16, Path.Direction.CW);
            canvas.clipPath(path);
        }
        canvas.save();
        float f17 = this.N;
        float f18 = measuredWidth;
        float f19 = measuredHeight;
        canvas.scale(f17, f17, f18 / 2.0f, f19 / 2.0f);
        if (z10) {
            if (this.C) {
                measuredHeight = Math.min(measuredHeight, measuredWidth);
            } else {
                measuredHeight = (int) (f19 - AndroidUtilities.lerp(0.0f, this.H / this.E, this.D));
            }
        }
        ImageReceiver imageReceiver2 = this.P;
        if (imageReceiver2 != null) {
            float f20 = this.O;
            float f21 = (1.0f - f20) * 1.0f;
            if (f20 > 0.0f) {
                float imageX = imageReceiver2.getImageX();
                float imageY = this.P.getImageY();
                float imageWidth = this.P.getImageWidth();
                f11 = 2.0f;
                float imageHeight = this.P.getImageHeight();
                f12 = 0.0f;
                float alpha = this.P.getAlpha();
                c10 = 0;
                float f22 = y10 * 2.0f;
                z11 = z10;
                f15 = f21;
                this.P.setImageCoords(y10, y10, f18 - f22, measuredHeight - f22);
                this.P.setAlpha(f20);
                this.P.draw(canvas);
                this.P.setImageCoords(imageX, imageY, imageWidth, imageHeight);
                this.P.setAlpha(alpha);
            } else {
                z11 = z10;
                f15 = f21;
                f11 = 2.0f;
                f12 = 0.0f;
                c10 = 0;
            }
            f13 = f15;
        } else {
            z11 = z10;
            f11 = 2.0f;
            f12 = 0.0f;
            c10 = 0;
            f13 = 1.0f;
        }
        if (imageReceiver != null && f13 > f12 && (this.R < 1.0f || !this.T)) {
            float f23 = y10 * f11;
            imageReceiver.setImageCoords(y10, y10, f18 - f23, measuredHeight - f23);
            float alpha2 = imageReceiver.getAlpha();
            imageReceiver.setAlpha(alpha2 * f13);
            if (this.M) {
                int i10 = imageReceiver.getRoundRadius()[c10];
                if (z11) {
                    imageReceiver.setRoundRadius(0);
                }
                imageReceiver.draw(canvas);
                if (z11) {
                    imageReceiver.setRoundRadius(i10);
                }
            }
            imageReceiver.setAlpha(alpha2);
        }
        if (this.R > f12 && this.T && f13 > f12) {
            ImageReceiver imageReceiver3 = this.Q;
            if (imageReceiver3.getDrawable() != null) {
                float f24 = y10 * f11;
                imageReceiver3.setImageCoords(y10, y10, f18 - f24, measuredHeight - f24);
                imageReceiver3.setAlpha(this.R * f13);
                imageReceiver3.draw(canvas);
            } else {
                RectF rectF2 = this.K;
                rectF2.set(0.0f, 0.0f, f18, measuredHeight);
                Paint paint = this.L;
                paint.setAlpha((int) (this.R * f13 * 255.0f));
                float f25 = imageReceiver3.getRoundRadius()[0];
                canvas.drawRoundRect(rectF2, f25, f25, paint);
            }
        }
        if (z11) {
            float f26 = measuredHeight;
            canvas.translate(y10, y10 + f26);
            if (!this.C && !rg0Var.f32161a && this.V.getRealPosition() != 0) {
                f14 = 1.0f;
            } else {
                f14 = 1.0f - this.D;
            }
            float f27 = y10 * f11;
            rg0Var.f(canvas, this, f18 - f27, f26 - f27, true, f14, f13);
        }
        canvas.restore();
    }

    public void setAnimateFromImageReceiver(ImageReceiver imageReceiver) {
        this.P = imageReceiver;
    }

    public void setAvatarsViewPager(org.telegram.ui.Components.ah0 ah0Var) {
        this.V = ah0Var;
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
        if (f10 == this.f39325a0) {
            return;
        }
        this.f39325a0 = f10;
        invalidate();
    }

    @Override
    public void setRoundRadius(int i9) {
        super.setRoundRadius(i9);
        this.Q.setRoundRadius(i9);
    }

    public void setRoundRadiusCollapse(int i9) {
        int i10 = this.F;
        this.F = i9;
        if (i10 != i9) {
            super.invalidate();
        }
    }

    public void setRoundRadiusForExpand(int i9) {
        if (!this.I) {
            setRoundRadius(i9);
            return;
        }
        this.G = i9;
        setRoundRadius(i9);
    }

    public final void t(int i9) {
        this.H = i9;
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
        Runnable runnable = this.f39326b0;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override
    public final void invalidate(int i9, int i10, int i11, int i12) {
        super.invalidate(i9, i10, i11, i12);
        Runnable runnable = this.f39326b0;
        if (runnable != null) {
            runnable.run();
        }
    }
}
