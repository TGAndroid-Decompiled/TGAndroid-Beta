package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.PhotoViewer;
public final class nf0 extends FrameLayout {
    public final kf0 E;
    public final kf0 F;
    public mf0 f28764a;
    public final mg.p f28765b;
    public final mg.f f28766c;
    public final boolean d;
    public final ImageReceiver e;
    public boolean f28767f;
    public boolean h;
    public float f28768n;
    public float f28769r;
    public AnimatorSet f28770s;
    public AnimatorSet v;
    public float f28771w;
    public final Paint f28772x;
    public final org.telegram.ui.ActionBar.d6 f28773y;

    public nf0(ContextThemeWrapper contextThemeWrapper, org.telegram.ui.ActionBar.d6 d6Var) {
        super(contextThemeWrapper);
        this.h = true;
        this.f28769r = 1.0f;
        this.f28771w = 0.0f;
        this.f28772x = new Paint(1);
        this.E = new kf0(this, 0);
        this.F = new kf0(this, 1);
        this.f28773y = d6Var;
        this.d = contextThemeWrapper instanceof BubbleActivity;
        mg.p pVar = new mg.p(contextThemeWrapper);
        this.f28765b = pVar;
        pVar.setListener(new ki.t1(this, 16));
        pVar.setBottomPadding(AndroidUtilities.dp(64.0f));
        addView(pVar);
        this.e = new ImageReceiver(this);
        mg.f fVar = new mg.f(contextThemeWrapper);
        this.f28766c = fVar;
        fVar.setListener(new ei.h0(2, this));
        addView(fVar, w7.z5.d(-1, -2.0f, 81, 0.0f, 0.0f, 0.0f, 0.0f));
    }

    public final void a() {
        mg.p pVar = this.f28765b;
        pVar.f16920b.setVisibility(4);
        CropAreaView cropAreaView = pVar.f16919a;
        cropAreaView.setDimVisibility(false);
        cropAreaView.f(false, false);
        cropAreaView.invalidate();
    }

    public final void b(Bitmap bitmap, int i10, boolean z10, boolean z11, mg.g gVar, q71 q71Var, MediaController.CropState cropState) {
        boolean z12;
        requestLayout();
        int i11 = 0;
        this.f28767f = false;
        Bitmap bitmap2 = null;
        this.e.setImageBitmap((Drawable) null);
        mg.p pVar = this.f28765b;
        ImageView imageView = pVar.f16920b;
        pVar.f16927x = z10;
        pVar.d = q71Var;
        pVar.e = gVar;
        pVar.K = i10;
        pVar.f16926w = bitmap;
        CropAreaView cropAreaView = pVar.f16919a;
        boolean z13 = true;
        if (q71Var != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        cropAreaView.setIsVideo(z12);
        if (bitmap == null && q71Var == null) {
            pVar.L = null;
            imageView.setImageDrawable(null);
        } else {
            int currentWidth = pVar.getCurrentWidth();
            int currentHeight = pVar.getCurrentHeight();
            mg.n nVar = pVar.L;
            if (nVar != null && z11) {
                float f7 = currentWidth;
                nVar.e *= nVar.f16910a / f7;
                nVar.f16910a = f7;
                nVar.f16911b = currentHeight;
                nVar.h();
                Matrix matrix = nVar.f16917k;
                mg.p pVar2 = nVar.f16918l;
                matrix.getValues(pVar2.H);
                matrix.reset();
                float f10 = nVar.e;
                matrix.postScale(f10, f10);
                float[] fArr = pVar2.H;
                matrix.postTranslate(fArr[2], fArr[5]);
                pVar2.r(false);
            } else {
                pVar.L = new mg.n(pVar, currentWidth, currentHeight);
                cropAreaView.getViewTreeObserver().addOnPreDrawListener(new mg.l(pVar, cropState, currentHeight, currentWidth));
            }
            if (q71Var == null) {
                bitmap2 = pVar.f16926w;
            }
            imageView.setImageBitmap(bitmap2);
        }
        mg.f fVar = this.f28766c;
        fVar.setFreeform(z10);
        fVar.b(0.0f);
        fVar.setMirrored(false);
        fVar.setRotated(false);
        if (cropState != null) {
            fVar.b(cropState.cropRotate);
            if (cropState.transformRotation == 0) {
                z13 = false;
            }
            fVar.setRotated(z13);
            fVar.setMirrored(cropState.mirrored);
        } else {
            fVar.setRotated(false);
            fVar.setMirrored(false);
        }
        if (!z10) {
            i11 = 4;
        }
        fVar.setVisibility(i11);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        mg.p pVar;
        boolean drawChild = super.drawChild(canvas, view, j10);
        if (this.f28767f && view == (pVar = this.f28765b)) {
            RectF actualRect = pVar.getActualRect();
            int dp = AndroidUtilities.dp(32.0f);
            org.telegram.ui.zr0 zr0Var = (org.telegram.ui.zr0) this.f28764a;
            zr0Var.getClass();
            PhotoViewer photoViewer = zr0Var.f43790a;
            float measuredWidth = (photoViewer.S7.getMeasuredWidth() - AndroidUtilities.dp(32.0f)) * photoViewer.f33440w8;
            int i10 = dp / 2;
            int dp2 = AndroidUtilities.dp(2.0f) + (((int) (measuredWidth + AndroidUtilities.dp(16.0f))) - i10);
            int measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(156.0f);
            float f7 = actualRect.left;
            float f10 = this.f28769r;
            float f11 = ((dp2 - f7) * f10) + f7;
            float f12 = actualRect.top;
            float y3 = com.google.android.gms.internal.play_billing.k3.y(measuredHeight, f12, f10, f12);
            float width = ((dp - actualRect.width()) * this.f28769r) + actualRect.width();
            ImageReceiver imageReceiver = this.e;
            imageReceiver.setRoundRadius((int) (width / 2.0f));
            imageReceiver.setImageCoords(f11, y3, width, width);
            imageReceiver.setAlpha(this.f28768n);
            imageReceiver.draw(canvas);
            int i11 = (this.f28771w > 0.0f ? 1 : (this.f28771w == 0.0f ? 0 : -1));
            Paint paint = this.f28772x;
            if (i11 > 0) {
                paint.setColor(-1);
                paint.setAlpha((int) (this.f28771w * 255.0f));
                canvas.drawCircle(actualRect.centerX(), actualRect.centerY(), actualRect.width() / 2.0f, paint);
            }
            paint.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21402zf, this.f28773y));
            paint.setAlpha(Math.min(255, (int) (this.f28769r * 255.0f * this.f28768n)));
            canvas.drawCircle(dp2 + i10, AndroidUtilities.dp(8.0f) + measuredHeight + dp, AndroidUtilities.dp(3.0f), paint);
        }
        return drawChild;
    }

    public float getRectSizeX() {
        return this.f28765b.getCropWidth();
    }

    public float getRectSizeY() {
        return this.f28765b.getCropHeight();
    }

    public float getRectX() {
        return this.f28765b.getCropLeft() - AndroidUtilities.dp(14.0f);
    }

    public float getRectY() {
        int i10;
        float cropTop = this.f28765b.getCropTop() - AndroidUtilities.dp(14.0f);
        if (!this.d) {
            i10 = AndroidUtilities.statusBarHeight;
        } else {
            i10 = 0;
        }
        return cropTop - i10;
    }

    public Bitmap getVideoThumb() {
        if (this.f28767f && this.h) {
            return this.e.getBitmap();
        }
        return null;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f28765b.invalidate();
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.h && this.f28767f) {
            if (this.e.isInsideImage(motionEvent.getX(), motionEvent.getY())) {
                if (motionEvent.getAction() == 1) {
                    ((org.telegram.ui.zr0) this.f28764a).d();
                }
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        mg.n nVar;
        super.onLayout(z10, i10, i11, i12, i13);
        mg.p pVar = this.f28765b;
        CropAreaView cropAreaView = pVar.f16919a;
        float cropWidth = cropAreaView.getCropWidth();
        if (cropWidth != 0.0f && (nVar = pVar.L) != null) {
            cropAreaView.a(pVar.h, nVar.f16910a / nVar.f16911b);
            cropAreaView.setActualRect(cropAreaView.getAspectRatio());
            cropAreaView.d(pVar.f16922f);
            mg.n.g(pVar.L, cropAreaView.getCropWidth() / cropWidth, 0.0f, 0.0f);
            pVar.r(false);
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.h && this.f28767f) {
            if (this.e.isInsideImage(motionEvent.getX(), motionEvent.getY())) {
                if (motionEvent.getAction() == 1) {
                    ((org.telegram.ui.zr0) this.f28764a).d();
                }
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setAspectRatio(float f7) {
        this.f28765b.setAspectRatio(f7);
    }

    public void setDelegate(mf0 mf0Var) {
        this.f28764a = mf0Var;
    }

    public void setFreeform(boolean z10) {
        this.f28765b.setFreeform(z10);
    }

    public void setSubtitle(String str) {
        this.f28765b.setSubtitle(str);
    }

    public void setVideoThumbFlashAlpha(float f7) {
        this.f28771w = f7;
        invalidate();
    }

    public void setVideoThumbVisible(boolean z10) {
        float f7;
        if (this.h == z10) {
            return;
        }
        this.h = z10;
        AnimatorSet animatorSet = this.v;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.v = animatorSet2;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this, this.F, f7));
        this.v.setDuration(180L);
        this.v.addListener(new lf0(this, 1));
        this.v.start();
    }
}
