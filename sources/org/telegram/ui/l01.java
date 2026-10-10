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
public class l01 extends org.telegram.ui.Components.y9 implements org.telegram.ui.Components.qw0 {
    public static final t0 f39432g0 = new t0("crossfadeProgress", 3);
    public boolean G;
    public float H;
    public float I;
    public int J;
    public int K;
    public int L;
    public boolean M;
    public final Path N;
    public final RectF O;
    public final Paint P;
    public boolean Q;
    public float R;
    public float S;
    public ImageReceiver T;
    public final ImageReceiver U;
    public float V;
    public ImageReceiver.BitmapHolder W;
    public boolean f39433a0;
    public float f39434b0;
    public org.telegram.ui.Components.ui0 f39435c0;
    public boolean f39436d0;
    public float f39437e0;
    public Runnable f39438f0;

    public l01(Context context) {
        super(context);
        this.J = 0;
        this.K = 0;
        this.L = 0;
        this.N = new Path();
        this.O = new RectF();
        this.Q = true;
        this.R = 1.0f;
        this.f39433a0 = true;
        this.f39437e0 = 1.0f;
        this.f39438f0 = null;
        setLayerType(2, null);
        this.U = new ImageReceiver(this);
        Paint paint = new Paint(1);
        this.P = paint;
        paint.setColor(-16777216);
    }

    @Override
    public final void g(Runnable runnable) {
        this.f39438f0 = runnable;
    }

    public float getForegroundAlpha() {
        return this.V;
    }

    public org.telegram.ui.Components.eh getPrevFragment() {
        return null;
    }

    public int getRoundRadiusForExpand() {
        if (!this.M) {
            return getRoundRadius()[0];
        }
        return this.K;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        org.telegram.ui.Components.ui0 ui0Var = this.f39435c0;
        if (ui0Var != null) {
            ui0Var.invalidate();
        }
        Runnable runnable = this.f39438f0;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.U.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.U.onDetachedFromWindow();
        ImageReceiver.BitmapHolder bitmapHolder = this.W;
        if (bitmapHolder != null) {
            bitmapHolder.release();
            this.W = null;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        boolean z10;
        org.telegram.ui.Components.li0 li0Var;
        float f7;
        ImageReceiver imageReceiver;
        boolean z11;
        float f10;
        float f11;
        int i10;
        float f12;
        float f13;
        float f14;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        org.telegram.ui.Components.ui0 ui0Var = this.f39435c0;
        boolean z12 = true;
        if (ui0Var != null && ui0Var.getVisibility() == 0 && this.M && this.H > 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            org.telegram.ui.Components.li0 blurDrawer = this.f39435c0.getBlurDrawer();
            if (blurDrawer == null) {
                z12 = false;
            }
            boolean z13 = z12;
            li0Var = blurDrawer;
            z10 = z13;
        } else {
            li0Var = null;
        }
        if (this.f39436d0) {
            f7 = (int) AndroidUtilities.dpf2(3.5f);
        } else {
            f7 = 0.0f;
        }
        float z14 = org.telegram.messenger.q.z(1.0f, this.V, this.f39437e0, (1.0f - this.f39434b0) * f7);
        org.telegram.ui.Components.s5 s5Var = this.f33138e;
        if (s5Var != null) {
            imageReceiver = s5Var.f30680k;
        } else {
            imageReceiver = this.f33135a;
        }
        int i11 = this.K;
        if (i11 > 0) {
            Path path = this.N;
            path.rewind();
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(z14, z14, measuredWidth - z14, measuredHeight - z14);
            float f15 = i11;
            path.addRoundRect(rectF, f15, f15, Path.Direction.CW);
            canvas.clipPath(path);
        }
        canvas.save();
        float f16 = this.R;
        float f17 = measuredWidth;
        float f18 = measuredHeight;
        canvas.scale(f16, f16, f17 / 2.0f, f18 / 2.0f);
        if (z10) {
            if (this.G) {
                measuredHeight = Math.min(measuredHeight, measuredWidth);
            } else {
                measuredHeight = (int) (f18 - AndroidUtilities.lerp(0.0f, this.L / this.I, this.H));
            }
        }
        ImageReceiver imageReceiver2 = this.T;
        if (imageReceiver2 != null) {
            float f19 = this.S;
            float f20 = (1.0f - f19) * 1.0f;
            if (f19 > 0.0f) {
                float imageX = imageReceiver2.getImageX();
                float imageY = this.T.getImageY();
                float imageWidth = this.T.getImageWidth();
                f11 = 2.0f;
                float imageHeight = this.T.getImageHeight();
                f10 = 0.0f;
                float alpha = this.T.getAlpha();
                i10 = 0;
                float f21 = z14 * 2.0f;
                z11 = z10;
                f14 = f20;
                this.T.setImageCoords(z14, z14, f17 - f21, measuredHeight - f21);
                this.T.setAlpha(f19);
                this.T.draw(canvas);
                this.T.setImageCoords(imageX, imageY, imageWidth, imageHeight);
                this.T.setAlpha(alpha);
            } else {
                z11 = z10;
                f10 = 0.0f;
                f14 = f20;
                f11 = 2.0f;
                i10 = 0;
            }
            f12 = f14;
        } else {
            z11 = z10;
            f10 = 0.0f;
            f11 = 2.0f;
            i10 = 0;
            f12 = 1.0f;
        }
        if (imageReceiver != null && f12 > f10 && (this.V < 1.0f || !this.f39433a0)) {
            float f22 = z14 * f11;
            imageReceiver.setImageCoords(z14, z14, f17 - f22, measuredHeight - f22);
            float alpha2 = imageReceiver.getAlpha();
            imageReceiver.setAlpha(alpha2 * f12);
            if (this.Q) {
                int i12 = imageReceiver.getRoundRadius()[i10];
                if (z11) {
                    imageReceiver.setRoundRadius(i10);
                }
                imageReceiver.draw(canvas);
                if (z11) {
                    imageReceiver.setRoundRadius(i12);
                }
            }
            imageReceiver.setAlpha(alpha2);
        }
        if (this.V > f10 && this.f39433a0 && f12 > f10) {
            ImageReceiver imageReceiver3 = this.U;
            if (imageReceiver3.getDrawable() != null) {
                float f23 = z14 * f11;
                imageReceiver3.setImageCoords(z14, z14, f17 - f23, measuredHeight - f23);
                imageReceiver3.setAlpha(this.V * f12);
                imageReceiver3.draw(canvas);
            } else {
                RectF rectF2 = this.O;
                float f24 = f10;
                rectF2.set(f24, f24, f17, measuredHeight);
                Paint paint = this.P;
                paint.setAlpha((int) (this.V * f12 * 255.0f));
                float f25 = imageReceiver3.getRoundRadius()[0];
                canvas.drawRoundRect(rectF2, f25, f25, paint);
            }
        }
        if (z11) {
            float f26 = measuredHeight;
            canvas.translate(z14, z14 + f26);
            if (!this.G && !li0Var.f28346a && this.f39435c0.getRealPosition() != 0) {
                f13 = 1.0f;
            } else {
                f13 = 1.0f - this.H;
            }
            float f27 = z14 * f11;
            li0Var.f(canvas, this, f17 - f27, f26 - f27, true, f13, f12);
        }
        canvas.restore();
    }

    public void setAnimateFromImageReceiver(ImageReceiver imageReceiver) {
        this.T = imageReceiver;
    }

    public void setAvatarsViewPager(org.telegram.ui.Components.ui0 ui0Var) {
        this.f39435c0 = ui0Var;
    }

    public void setCrossfadeProgress(float f7) {
        this.S = f7;
        invalidate();
    }

    public void setForegroundAlpha(float f7) {
        this.V = f7;
        invalidate();
    }

    public void setForegroundImageDrawable(ImageReceiver.BitmapHolder bitmapHolder) {
        if (bitmapHolder != null) {
            this.U.setImageBitmap(bitmapHolder.drawable);
        }
        ImageReceiver.BitmapHolder bitmapHolder2 = this.W;
        if (bitmapHolder2 != null) {
            bitmapHolder2.release();
            this.W = null;
        }
        this.W = bitmapHolder;
    }

    public void setHasStories(boolean z10) {
        if (this.f39436d0 == z10) {
            return;
        }
        this.f39436d0 = z10;
        invalidate();
    }

    public void setProgressToExpand(float f7) {
        if (this.f39434b0 == f7) {
            return;
        }
        this.f39434b0 = f7;
        invalidate();
    }

    public void setProgressToStoriesInsets(float f7) {
        if (f7 == this.f39437e0) {
            return;
        }
        this.f39437e0 = f7;
        invalidate();
    }

    @Override
    public void setRoundRadius(int i10) {
        super.setRoundRadius(i10);
        this.U.setRoundRadius(i10);
    }

    public void setRoundRadiusCollapse(int i10) {
        int i11 = this.J;
        this.J = i10;
        if (i11 != i10) {
            super.invalidate();
        }
    }

    public void setRoundRadiusForExpand(int i10) {
        if (!this.M) {
            setRoundRadius(i10);
            return;
        }
        this.K = i10;
        setRoundRadius(i10);
    }

    public final void t(int i10) {
        this.L = i10;
        this.M = true;
    }

    public final void u(ImageLocation imageLocation, String str, Drawable drawable) {
        this.U.setImage(imageLocation, str, drawable, 0L, (String) null, (Object) null, 0);
        ImageReceiver.BitmapHolder bitmapHolder = this.W;
        if (bitmapHolder != null) {
            bitmapHolder.release();
            this.W = null;
        }
    }

    @Override
    public final void invalidate(Rect rect) {
        super.invalidate(rect);
        Runnable runnable = this.f39438f0;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override
    public final void invalidate(int i10, int i11, int i12, int i13) {
        super.invalidate(i10, i11, i12, i13);
        Runnable runnable = this.f39438f0;
        if (runnable != null) {
            runnable.run();
        }
    }
}
