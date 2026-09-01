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
public final class af0 extends FrameLayout {
    public final we0 B;
    public final we0 C;
    public ze0 f25247a;
    public final zf.n f25248b;
    public final zf.e f25249c;
    public final boolean d;
    public final ImageReceiver f25250e;
    public boolean f25251f;
    public boolean h;
    public float f25252n;
    public float f25253r;
    public AnimatorSet f25254s;
    public AnimatorSet v;
    public float f25255w;
    public final Paint f25256x;
    public final org.telegram.ui.ActionBar.g6 f25257y;

    public af0(ContextThemeWrapper contextThemeWrapper, org.telegram.ui.ActionBar.g6 g6Var) {
        super(contextThemeWrapper);
        this.h = true;
        this.f25253r = 1.0f;
        this.f25255w = 0.0f;
        this.f25256x = new Paint(1);
        this.B = new we0(this, 0);
        this.C = new we0(this, 1);
        this.f25257y = g6Var;
        this.d = contextThemeWrapper instanceof BubbleActivity;
        zf.n nVar = new zf.n(contextThemeWrapper);
        this.f25248b = nVar;
        nVar.setListener(new androidx.biometric.f0(this, 27));
        nVar.setBottomPadding(AndroidUtilities.dp(64.0f));
        addView(nVar);
        this.f25250e = new ImageReceiver(this);
        zf.e eVar = new zf.e(contextThemeWrapper);
        this.f25249c = eVar;
        eVar.setListener(new xe0(0, this));
        addView(eVar, k7.c6.d(-1, -2.0f, 81, 0.0f, 0.0f, 0.0f, 0.0f));
    }

    public final void a() {
        zf.n nVar = this.f25248b;
        nVar.f51167b.setVisibility(4);
        CropAreaView cropAreaView = nVar.f51166a;
        cropAreaView.setDimVisibility(false);
        cropAreaView.f(false, false);
        cropAreaView.invalidate();
    }

    public final void b(Bitmap bitmap, int i10, boolean z4, boolean z10, zf.f fVar, y61 y61Var, MediaController.CropState cropState) {
        boolean z11;
        requestLayout();
        int i11 = 0;
        this.f25251f = false;
        Bitmap bitmap2 = null;
        this.f25250e.setImageBitmap((Drawable) null);
        zf.n nVar = this.f25248b;
        ImageView imageView = nVar.f51167b;
        nVar.f51175x = z4;
        nVar.d = y61Var;
        nVar.f51169e = fVar;
        nVar.H = i10;
        nVar.f51174w = bitmap;
        CropAreaView cropAreaView = nVar.f51166a;
        boolean z12 = true;
        if (y61Var != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        cropAreaView.setIsVideo(z11);
        if (bitmap == null && y61Var == null) {
            nVar.I = null;
            imageView.setImageDrawable(null);
        } else {
            int currentWidth = nVar.getCurrentWidth();
            int currentHeight = nVar.getCurrentHeight();
            zf.l lVar = nVar.I;
            if (lVar != null && z10) {
                float f10 = currentWidth;
                lVar.f51159e *= lVar.f51156a / f10;
                lVar.f51156a = f10;
                lVar.f51157b = currentHeight;
                lVar.h();
                Matrix matrix = lVar.f51164k;
                zf.n nVar2 = lVar.f51165l;
                matrix.getValues(nVar2.E);
                matrix.reset();
                float f11 = lVar.f51159e;
                matrix.postScale(f11, f11);
                float[] fArr = nVar2.E;
                matrix.postTranslate(fArr[2], fArr[5]);
                nVar2.r(false);
            } else {
                nVar.I = new zf.l(nVar, currentWidth, currentHeight);
                cropAreaView.getViewTreeObserver().addOnPreDrawListener(new zf.j(nVar, cropState, currentHeight, currentWidth));
            }
            if (y61Var == null) {
                bitmap2 = nVar.f51174w;
            }
            imageView.setImageBitmap(bitmap2);
        }
        zf.e eVar = this.f25249c;
        eVar.setFreeform(z4);
        eVar.b(0.0f);
        eVar.setMirrored(false);
        eVar.setRotated(false);
        if (cropState != null) {
            eVar.b(cropState.cropRotate);
            if (cropState.transformRotation == 0) {
                z12 = false;
            }
            eVar.setRotated(z12);
            eVar.setMirrored(cropState.mirrored);
        } else {
            eVar.setRotated(false);
            eVar.setMirrored(false);
        }
        if (!z4) {
            i11 = 4;
        }
        eVar.setVisibility(i11);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        zf.n nVar;
        boolean drawChild = super.drawChild(canvas, view, j10);
        if (this.f25251f && view == (nVar = this.f25248b)) {
            RectF actualRect = nVar.getActualRect();
            int dp = AndroidUtilities.dp(32.0f);
            org.telegram.ui.zr0 zr0Var = (org.telegram.ui.zr0) this.f25247a;
            zr0Var.getClass();
            PhotoViewer photoViewer = zr0Var.f43983a;
            float measuredWidth = (photoViewer.O7.getMeasuredWidth() - AndroidUtilities.dp(32.0f)) * photoViewer.f34392s8;
            int i10 = dp / 2;
            int dp2 = AndroidUtilities.dp(2.0f) + (((int) (measuredWidth + AndroidUtilities.dp(16.0f))) - i10);
            int measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(156.0f);
            float f10 = actualRect.left;
            float f11 = this.f25253r;
            float f12 = ((dp2 - f10) * f11) + f10;
            float f13 = actualRect.top;
            float w10 = e2.c.w(measuredHeight, f13, f11, f13);
            float width = ((dp - actualRect.width()) * this.f25253r) + actualRect.width();
            ImageReceiver imageReceiver = this.f25250e;
            imageReceiver.setRoundRadius((int) (width / 2.0f));
            imageReceiver.setImageCoords(f12, w10, width, width);
            imageReceiver.setAlpha(this.f25252n);
            imageReceiver.draw(canvas);
            float f14 = this.f25255w;
            Paint paint = this.f25256x;
            if (f14 > 0.0f) {
                paint.setColor(-1);
                paint.setAlpha((int) (this.f25255w * 255.0f));
                canvas.drawCircle(actualRect.centerX(), actualRect.centerY(), actualRect.width() / 2.0f, paint);
            }
            paint.setColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f22059zf, this.f25257y));
            paint.setAlpha(Math.min(255, (int) (this.f25253r * 255.0f * this.f25252n)));
            canvas.drawCircle(dp2 + i10, AndroidUtilities.dp(8.0f) + measuredHeight + dp, AndroidUtilities.dp(3.0f), paint);
        }
        return drawChild;
    }

    public float getRectSizeX() {
        return this.f25248b.getCropWidth();
    }

    public float getRectSizeY() {
        return this.f25248b.getCropHeight();
    }

    public float getRectX() {
        return this.f25248b.getCropLeft() - AndroidUtilities.dp(14.0f);
    }

    public float getRectY() {
        int i10;
        float cropTop = this.f25248b.getCropTop() - AndroidUtilities.dp(14.0f);
        if (!this.d) {
            i10 = AndroidUtilities.statusBarHeight;
        } else {
            i10 = 0;
        }
        return cropTop - i10;
    }

    public Bitmap getVideoThumb() {
        if (this.f25251f && this.h) {
            return this.f25250e.getBitmap();
        }
        return null;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f25248b.invalidate();
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.h && this.f25251f) {
            if (this.f25250e.isInsideImage(motionEvent.getX(), motionEvent.getY())) {
                if (motionEvent.getAction() == 1) {
                    ((org.telegram.ui.zr0) this.f25247a).f();
                }
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        zf.l lVar;
        super.onLayout(z4, i10, i11, i12, i13);
        zf.n nVar = this.f25248b;
        CropAreaView cropAreaView = nVar.f51166a;
        float cropWidth = cropAreaView.getCropWidth();
        if (cropWidth != 0.0f && (lVar = nVar.I) != null) {
            cropAreaView.a(nVar.h, lVar.f51156a / lVar.f51157b);
            cropAreaView.setActualRect(cropAreaView.getAspectRatio());
            cropAreaView.d(nVar.f51170f);
            zf.l.g(nVar.I, cropAreaView.getCropWidth() / cropWidth, 0.0f, 0.0f);
            nVar.r(false);
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.h && this.f25251f) {
            if (this.f25250e.isInsideImage(motionEvent.getX(), motionEvent.getY())) {
                if (motionEvent.getAction() == 1) {
                    ((org.telegram.ui.zr0) this.f25247a).f();
                }
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setAspectRatio(float f10) {
        this.f25248b.setAspectRatio(f10);
    }

    public void setDelegate(ze0 ze0Var) {
        this.f25247a = ze0Var;
    }

    public void setFreeform(boolean z4) {
        this.f25248b.setFreeform(z4);
    }

    public void setSubtitle(String str) {
        this.f25248b.setSubtitle(str);
    }

    public void setVideoThumbFlashAlpha(float f10) {
        this.f25255w = f10;
        invalidate();
    }

    public void setVideoThumbVisible(boolean z4) {
        float f10;
        if (this.h == z4) {
            return;
        }
        this.h = z4;
        AnimatorSet animatorSet = this.v;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.v = animatorSet2;
        if (z4) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this, this.C, f10));
        this.v.setDuration(180L);
        this.v.addListener(new ye0(this, 1));
        this.v.start();
    }
}
