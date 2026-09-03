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
public final class ze0 extends FrameLayout {
    public final ve0 B;
    public final ve0 C;
    public ye0 f31371a;
    public final yf.n f31372b;
    public final yf.e f31373c;
    public final boolean d;
    public final ImageReceiver e;
    public boolean f31374f;
    public boolean h;
    public float f31375n;
    public float f31376r;
    public AnimatorSet f31377s;
    public AnimatorSet v;
    public float f31378w;
    public final Paint f31379x;
    public final org.telegram.ui.ActionBar.f6 f31380y;

    public ze0(ContextThemeWrapper contextThemeWrapper, org.telegram.ui.ActionBar.f6 f6Var) {
        super(contextThemeWrapper);
        this.h = true;
        this.f31376r = 1.0f;
        this.f31378w = 0.0f;
        this.f31379x = new Paint(1);
        this.B = new ve0(this, 0);
        this.C = new ve0(this, 1);
        this.f31380y = f6Var;
        this.d = contextThemeWrapper instanceof BubbleActivity;
        yf.n nVar = new yf.n(contextThemeWrapper);
        this.f31372b = nVar;
        nVar.setListener(new o3.c(this, 5));
        nVar.setBottomPadding(AndroidUtilities.dp(64.0f));
        addView(nVar);
        this.e = new ImageReceiver(this);
        yf.e eVar = new yf.e(contextThemeWrapper);
        this.f31373c = eVar;
        eVar.setListener(new we0(0, this));
        addView(eVar, k7.b6.d(-1, -2.0f, 81, 0.0f, 0.0f, 0.0f, 0.0f));
    }

    public final void a() {
        yf.n nVar = this.f31372b;
        nVar.f47311b.setVisibility(4);
        CropAreaView cropAreaView = nVar.f47310a;
        cropAreaView.setDimVisibility(false);
        cropAreaView.f(false, false);
        cropAreaView.invalidate();
    }

    public final void b(Bitmap bitmap, int i10, boolean z4, boolean z10, yf.f fVar, w61 w61Var, MediaController.CropState cropState) {
        boolean z11;
        requestLayout();
        int i11 = 0;
        this.f31374f = false;
        Bitmap bitmap2 = null;
        this.e.setImageBitmap((Drawable) null);
        yf.n nVar = this.f31372b;
        ImageView imageView = nVar.f47311b;
        nVar.f47318x = z4;
        nVar.d = w61Var;
        nVar.e = fVar;
        nVar.H = i10;
        nVar.f47317w = bitmap;
        CropAreaView cropAreaView = nVar.f47310a;
        boolean z12 = true;
        if (w61Var != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        cropAreaView.setIsVideo(z11);
        if (bitmap == null && w61Var == null) {
            nVar.I = null;
            imageView.setImageDrawable(null);
        } else {
            int currentWidth = nVar.getCurrentWidth();
            int currentHeight = nVar.getCurrentHeight();
            yf.l lVar = nVar.I;
            if (lVar != null && z10) {
                float f10 = currentWidth;
                lVar.e *= lVar.f47301a / f10;
                lVar.f47301a = f10;
                lVar.f47302b = currentHeight;
                lVar.h();
                Matrix matrix = lVar.f47308k;
                yf.n nVar2 = lVar.f47309l;
                matrix.getValues(nVar2.E);
                matrix.reset();
                float f11 = lVar.e;
                matrix.postScale(f11, f11);
                float[] fArr = nVar2.E;
                matrix.postTranslate(fArr[2], fArr[5]);
                nVar2.r(false);
            } else {
                nVar.I = new yf.l(nVar, currentWidth, currentHeight);
                cropAreaView.getViewTreeObserver().addOnPreDrawListener(new yf.j(nVar, cropState, currentHeight, currentWidth));
            }
            if (w61Var == null) {
                bitmap2 = nVar.f47317w;
            }
            imageView.setImageBitmap(bitmap2);
        }
        yf.e eVar = this.f31373c;
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
        yf.n nVar;
        boolean drawChild = super.drawChild(canvas, view, j10);
        if (this.f31374f && view == (nVar = this.f31372b)) {
            RectF actualRect = nVar.getActualRect();
            int dp = AndroidUtilities.dp(32.0f);
            org.telegram.ui.es0 es0Var = (org.telegram.ui.es0) this.f31371a;
            es0Var.getClass();
            PhotoViewer photoViewer = es0Var.f33848a;
            float measuredWidth = (photoViewer.O7.getMeasuredWidth() - AndroidUtilities.dp(32.0f)) * photoViewer.f31840s8;
            int i10 = dp / 2;
            int dp2 = AndroidUtilities.dp(2.0f) + (((int) (measuredWidth + AndroidUtilities.dp(16.0f))) - i10);
            int measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(156.0f);
            float f10 = actualRect.left;
            float f11 = this.f31376r;
            float f12 = ((dp2 - f10) * f11) + f10;
            float f13 = actualRect.top;
            float w10 = e2.c.w(measuredHeight, f13, f11, f13);
            float width = ((dp - actualRect.width()) * this.f31376r) + actualRect.width();
            ImageReceiver imageReceiver = this.e;
            imageReceiver.setRoundRadius((int) (width / 2.0f));
            imageReceiver.setImageCoords(f12, w10, width, width);
            imageReceiver.setAlpha(this.f31375n);
            imageReceiver.draw(canvas);
            float f14 = this.f31378w;
            Paint paint = this.f31379x;
            if (f14 > 0.0f) {
                paint.setColor(-1);
                paint.setAlpha((int) (this.f31378w * 255.0f));
                canvas.drawCircle(actualRect.centerX(), actualRect.centerY(), actualRect.width() / 2.0f, paint);
            }
            paint.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20279zf, this.f31380y));
            paint.setAlpha(Math.min(255, (int) (this.f31376r * 255.0f * this.f31375n)));
            canvas.drawCircle(dp2 + i10, AndroidUtilities.dp(8.0f) + measuredHeight + dp, AndroidUtilities.dp(3.0f), paint);
        }
        return drawChild;
    }

    public float getRectSizeX() {
        return this.f31372b.getCropWidth();
    }

    public float getRectSizeY() {
        return this.f31372b.getCropHeight();
    }

    public float getRectX() {
        return this.f31372b.getCropLeft() - AndroidUtilities.dp(14.0f);
    }

    public float getRectY() {
        int i10;
        float cropTop = this.f31372b.getCropTop() - AndroidUtilities.dp(14.0f);
        if (!this.d) {
            i10 = AndroidUtilities.statusBarHeight;
        } else {
            i10 = 0;
        }
        return cropTop - i10;
    }

    public Bitmap getVideoThumb() {
        if (this.f31374f && this.h) {
            return this.e.getBitmap();
        }
        return null;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f31372b.invalidate();
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.h && this.f31374f) {
            if (this.e.isInsideImage(motionEvent.getX(), motionEvent.getY())) {
                if (motionEvent.getAction() == 1) {
                    ((org.telegram.ui.es0) this.f31371a).f();
                }
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        yf.l lVar;
        super.onLayout(z4, i10, i11, i12, i13);
        yf.n nVar = this.f31372b;
        CropAreaView cropAreaView = nVar.f47310a;
        float cropWidth = cropAreaView.getCropWidth();
        if (cropWidth != 0.0f && (lVar = nVar.I) != null) {
            cropAreaView.a(nVar.h, lVar.f47301a / lVar.f47302b);
            cropAreaView.setActualRect(cropAreaView.getAspectRatio());
            cropAreaView.d(nVar.f47313f);
            yf.l.g(nVar.I, cropAreaView.getCropWidth() / cropWidth, 0.0f, 0.0f);
            nVar.r(false);
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.h && this.f31374f) {
            if (this.e.isInsideImage(motionEvent.getX(), motionEvent.getY())) {
                if (motionEvent.getAction() == 1) {
                    ((org.telegram.ui.es0) this.f31371a).f();
                }
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setAspectRatio(float f10) {
        this.f31372b.setAspectRatio(f10);
    }

    public void setDelegate(ye0 ye0Var) {
        this.f31371a = ye0Var;
    }

    public void setFreeform(boolean z4) {
        this.f31372b.setFreeform(z4);
    }

    public void setSubtitle(String str) {
        this.f31372b.setSubtitle(str);
    }

    public void setVideoThumbFlashAlpha(float f10) {
        this.f31378w = f10;
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
        this.v.addListener(new xe0(this, 1));
        this.v.start();
    }
}
