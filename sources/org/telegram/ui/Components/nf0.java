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
    public mf0 f28753a;
    public final mg.p f28754b;
    public final mg.f f28755c;
    public final boolean d;
    public final ImageReceiver e;
    public boolean f28756f;
    public boolean h;
    public float f28757n;
    public float f28758r;
    public AnimatorSet f28759s;
    public AnimatorSet v;
    public float f28760w;
    public final Paint f28761x;
    public final org.telegram.ui.ActionBar.d6 f28762y;

    public nf0(ContextThemeWrapper contextThemeWrapper, org.telegram.ui.ActionBar.d6 d6Var) {
        super(contextThemeWrapper);
        this.h = true;
        this.f28758r = 1.0f;
        this.f28760w = 0.0f;
        this.f28761x = new Paint(1);
        this.E = new kf0(this, 0);
        this.F = new kf0(this, 1);
        this.f28762y = d6Var;
        this.d = contextThemeWrapper instanceof BubbleActivity;
        mg.p pVar = new mg.p(contextThemeWrapper);
        this.f28754b = pVar;
        pVar.setListener(new ki.t1(this, 16));
        pVar.setBottomPadding(AndroidUtilities.dp(64.0f));
        addView(pVar);
        this.e = new ImageReceiver(this);
        mg.f fVar = new mg.f(contextThemeWrapper);
        this.f28755c = fVar;
        fVar.setListener(new ei.h0(2, this));
        addView(fVar, w7.z5.a(-2.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 81));
    }

    public final void a() {
        mg.p pVar = this.f28754b;
        pVar.f16919b.setVisibility(4);
        CropAreaView cropAreaView = pVar.f16918a;
        cropAreaView.setDimVisibility(false);
        cropAreaView.f(false, false);
        cropAreaView.invalidate();
    }

    public final void b(Bitmap bitmap, int i10, boolean z10, boolean z11, mg.g gVar, p71 p71Var, MediaController.CropState cropState) {
        boolean z12;
        requestLayout();
        int i11 = 0;
        this.f28756f = false;
        Bitmap bitmap2 = null;
        this.e.setImageBitmap((Drawable) null);
        mg.p pVar = this.f28754b;
        ImageView imageView = pVar.f16919b;
        pVar.f16926x = z10;
        pVar.d = p71Var;
        pVar.e = gVar;
        pVar.K = i10;
        pVar.f16925w = bitmap;
        CropAreaView cropAreaView = pVar.f16918a;
        boolean z13 = true;
        if (p71Var != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        cropAreaView.setIsVideo(z12);
        if (bitmap == null && p71Var == null) {
            pVar.L = null;
            imageView.setImageDrawable(null);
        } else {
            int currentWidth = pVar.getCurrentWidth();
            int currentHeight = pVar.getCurrentHeight();
            mg.n nVar = pVar.L;
            if (nVar != null && z11) {
                float f7 = currentWidth;
                nVar.e *= nVar.f16909a / f7;
                nVar.f16909a = f7;
                nVar.f16910b = currentHeight;
                nVar.h();
                Matrix matrix = nVar.f16916k;
                mg.p pVar2 = nVar.f16917l;
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
            if (p71Var == null) {
                bitmap2 = pVar.f16925w;
            }
            imageView.setImageBitmap(bitmap2);
        }
        mg.f fVar = this.f28755c;
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
        if (this.f28756f && view == (pVar = this.f28754b)) {
            RectF actualRect = pVar.getActualRect();
            int dp = AndroidUtilities.dp(32.0f);
            org.telegram.ui.bs0 bs0Var = (org.telegram.ui.bs0) this.f28753a;
            bs0Var.getClass();
            PhotoViewer photoViewer = bs0Var.f35755a;
            float measuredWidth = (photoViewer.S7.getMeasuredWidth() - AndroidUtilities.dp(32.0f)) * photoViewer.f33441w8;
            int i10 = dp / 2;
            int dp2 = AndroidUtilities.dp(2.0f) + (((int) (measuredWidth + AndroidUtilities.dp(16.0f))) - i10);
            int measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(156.0f);
            float f7 = actualRect.left;
            float f10 = this.f28758r;
            float f11 = ((dp2 - f7) * f10) + f7;
            float f12 = actualRect.top;
            float y3 = com.google.android.gms.internal.play_billing.k3.y(measuredHeight, f12, f10, f12);
            float width = ((dp - actualRect.width()) * this.f28758r) + actualRect.width();
            ImageReceiver imageReceiver = this.e;
            imageReceiver.setRoundRadius((int) (width / 2.0f));
            imageReceiver.setImageCoords(f11, y3, width, width);
            imageReceiver.setAlpha(this.f28757n);
            imageReceiver.draw(canvas);
            int i11 = (this.f28760w > 0.0f ? 1 : (this.f28760w == 0.0f ? 0 : -1));
            Paint paint = this.f28761x;
            if (i11 > 0) {
                paint.setColor(-1);
                paint.setAlpha((int) (this.f28760w * 255.0f));
                canvas.drawCircle(actualRect.centerX(), actualRect.centerY(), actualRect.width() / 2.0f, paint);
            }
            paint.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21406zf, this.f28762y));
            paint.setAlpha(Math.min(255, (int) (this.f28758r * 255.0f * this.f28757n)));
            canvas.drawCircle(dp2 + i10, AndroidUtilities.dp(8.0f) + measuredHeight + dp, AndroidUtilities.dp(3.0f), paint);
        }
        return drawChild;
    }

    public float getRectSizeX() {
        return this.f28754b.getCropWidth();
    }

    public float getRectSizeY() {
        return this.f28754b.getCropHeight();
    }

    public float getRectX() {
        return this.f28754b.getCropLeft() - AndroidUtilities.dp(14.0f);
    }

    public float getRectY() {
        int i10;
        float cropTop = this.f28754b.getCropTop() - AndroidUtilities.dp(14.0f);
        if (!this.d) {
            i10 = AndroidUtilities.statusBarHeight;
        } else {
            i10 = 0;
        }
        return cropTop - i10;
    }

    public Bitmap getVideoThumb() {
        if (this.f28756f && this.h) {
            return this.e.getBitmap();
        }
        return null;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f28754b.invalidate();
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.h && this.f28756f) {
            if (this.e.isInsideImage(motionEvent.getX(), motionEvent.getY())) {
                if (motionEvent.getAction() == 1) {
                    ((org.telegram.ui.bs0) this.f28753a).d();
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
        mg.p pVar = this.f28754b;
        CropAreaView cropAreaView = pVar.f16918a;
        float cropWidth = cropAreaView.getCropWidth();
        if (cropWidth != 0.0f && (nVar = pVar.L) != null) {
            cropAreaView.a(pVar.h, nVar.f16909a / nVar.f16910b);
            cropAreaView.setActualRect(cropAreaView.getAspectRatio());
            cropAreaView.d(pVar.f16921f);
            mg.n.g(pVar.L, cropAreaView.getCropWidth() / cropWidth, 0.0f, 0.0f);
            pVar.r(false);
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.h && this.f28756f) {
            if (this.e.isInsideImage(motionEvent.getX(), motionEvent.getY())) {
                if (motionEvent.getAction() == 1) {
                    ((org.telegram.ui.bs0) this.f28753a).d();
                }
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setAspectRatio(float f7) {
        this.f28754b.setAspectRatio(f7);
    }

    public void setDelegate(mf0 mf0Var) {
        this.f28753a = mf0Var;
    }

    public void setFreeform(boolean z10) {
        this.f28754b.setFreeform(z10);
    }

    public void setSubtitle(String str) {
        this.f28754b.setSubtitle(str);
    }

    public void setVideoThumbFlashAlpha(float f7) {
        this.f28760w = f7;
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
