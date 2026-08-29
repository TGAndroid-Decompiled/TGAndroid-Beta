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
public final class pe0 extends FrameLayout {
    public final me0 A;
    public final me0 B;
    public oe0 f31656a;
    public final wf.n f31657b;
    public final wf.e f31658c;
    public final boolean d;
    public final ImageReceiver f31659e;
    public boolean f31660f;
    public boolean h;
    public float f31661n;
    public float f31662r;
    public AnimatorSet f31663s;
    public AnimatorSet v;
    public float f31664w;
    public final Paint f31665x;
    public final org.telegram.ui.ActionBar.c6 f31666y;

    public pe0(ContextThemeWrapper contextThemeWrapper, org.telegram.ui.ActionBar.c6 c6Var) {
        super(contextThemeWrapper);
        this.h = true;
        this.f31662r = 1.0f;
        this.f31664w = 0.0f;
        this.f31665x = new Paint(1);
        this.A = new me0(this, 0);
        this.B = new me0(this, 1);
        this.f31666y = c6Var;
        this.d = contextThemeWrapper instanceof BubbleActivity;
        wf.n nVar = new wf.n(contextThemeWrapper);
        this.f31657b = nVar;
        nVar.setListener(new nh.d6(this, 8));
        nVar.setBottomPadding(AndroidUtilities.dp(64.0f));
        addView(nVar);
        this.f31659e = new ImageReceiver(this);
        wf.e eVar = new wf.e(contextThemeWrapper);
        this.f31658c = eVar;
        eVar.setListener(new nh.h0(2, this));
        addView(eVar, i7.f6.d(-1, -2.0f, 81, 0.0f, 0.0f, 0.0f, 0.0f));
    }

    public final void a() {
        wf.n nVar = this.f31657b;
        nVar.f49954b.setVisibility(4);
        CropAreaView cropAreaView = nVar.f49953a;
        cropAreaView.setDimVisibility(false);
        cropAreaView.f(false, false);
        cropAreaView.invalidate();
    }

    public final void b(Bitmap bitmap, int i10, boolean z10, boolean z11, wf.f fVar, l61 l61Var, MediaController.CropState cropState) {
        boolean z12;
        requestLayout();
        int i11 = 0;
        this.f31660f = false;
        Bitmap bitmap2 = null;
        this.f31659e.setImageBitmap((Drawable) null);
        wf.n nVar = this.f31657b;
        ImageView imageView = nVar.f49954b;
        nVar.f49962x = z10;
        nVar.d = l61Var;
        nVar.f49956e = fVar;
        nVar.G = i10;
        nVar.f49961w = bitmap;
        CropAreaView cropAreaView = nVar.f49953a;
        boolean z13 = true;
        if (l61Var != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        cropAreaView.setIsVideo(z12);
        if (bitmap == null && l61Var == null) {
            nVar.H = null;
            imageView.setImageDrawable(null);
        } else {
            int currentWidth = nVar.getCurrentWidth();
            int currentHeight = nVar.getCurrentHeight();
            wf.l lVar = nVar.H;
            if (lVar != null && z11) {
                float f9 = currentWidth;
                lVar.f49946e *= lVar.f49943a / f9;
                lVar.f49943a = f9;
                lVar.f49944b = currentHeight;
                lVar.h();
                Matrix matrix = lVar.f49951k;
                wf.n nVar2 = lVar.f49952l;
                matrix.getValues(nVar2.D);
                matrix.reset();
                float f10 = lVar.f49946e;
                matrix.postScale(f10, f10);
                float[] fArr = nVar2.D;
                matrix.postTranslate(fArr[2], fArr[5]);
                nVar2.r(false);
            } else {
                nVar.H = new wf.l(nVar, currentWidth, currentHeight);
                cropAreaView.getViewTreeObserver().addOnPreDrawListener(new wf.j(nVar, cropState, currentHeight, currentWidth));
            }
            if (l61Var == null) {
                bitmap2 = nVar.f49961w;
            }
            imageView.setImageBitmap(bitmap2);
        }
        wf.e eVar = this.f31658c;
        eVar.setFreeform(z10);
        eVar.b(0.0f);
        eVar.setMirrored(false);
        eVar.setRotated(false);
        if (cropState != null) {
            eVar.b(cropState.cropRotate);
            if (cropState.transformRotation == 0) {
                z13 = false;
            }
            eVar.setRotated(z13);
            eVar.setMirrored(cropState.mirrored);
        } else {
            eVar.setRotated(false);
            eVar.setMirrored(false);
        }
        if (!z10) {
            i11 = 4;
        }
        eVar.setVisibility(i11);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        wf.n nVar;
        boolean drawChild = super.drawChild(canvas, view, j10);
        if (this.f31660f && view == (nVar = this.f31657b)) {
            RectF actualRect = nVar.getActualRect();
            int dp = AndroidUtilities.dp(32.0f);
            org.telegram.ui.pr0 pr0Var = (org.telegram.ui.pr0) this.f31656a;
            pr0Var.getClass();
            PhotoViewer photoViewer = pr0Var.f41455a;
            float measuredWidth = (photoViewer.N7.getMeasuredWidth() - AndroidUtilities.dp(32.0f)) * photoViewer.f35807r8;
            int i10 = dp / 2;
            int dp2 = AndroidUtilities.dp(2.0f) + (((int) (measuredWidth + AndroidUtilities.dp(16.0f))) - i10);
            int measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(156.0f);
            float f9 = actualRect.left;
            float f10 = this.f31662r;
            float f11 = ((dp2 - f9) * f10) + f9;
            float f12 = actualRect.top;
            float z10 = com.google.android.recaptcha.internal.a.z(measuredHeight, f12, f10, f12);
            float width = ((dp - actualRect.width()) * this.f31662r) + actualRect.width();
            ImageReceiver imageReceiver = this.f31659e;
            imageReceiver.setRoundRadius((int) (width / 2.0f));
            imageReceiver.setImageCoords(f11, z10, width, width);
            imageReceiver.setAlpha(this.f31661n);
            imageReceiver.draw(canvas);
            float f13 = this.f31664w;
            Paint paint = this.f31665x;
            if (f13 > 0.0f) {
                paint.setColor(-1);
                paint.setAlpha((int) (this.f31664w * 255.0f));
                canvas.drawCircle(actualRect.centerX(), actualRect.centerY(), actualRect.width() / 2.0f, paint);
            }
            paint.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23459zf, this.f31666y));
            paint.setAlpha(Math.min(255, (int) (this.f31662r * 255.0f * this.f31661n)));
            canvas.drawCircle(dp2 + i10, AndroidUtilities.dp(8.0f) + measuredHeight + dp, AndroidUtilities.dp(3.0f), paint);
        }
        return drawChild;
    }

    public float getRectSizeX() {
        return this.f31657b.getCropWidth();
    }

    public float getRectSizeY() {
        return this.f31657b.getCropHeight();
    }

    public float getRectX() {
        return this.f31657b.getCropLeft() - AndroidUtilities.dp(14.0f);
    }

    public float getRectY() {
        int i10;
        float cropTop = this.f31657b.getCropTop() - AndroidUtilities.dp(14.0f);
        if (!this.d) {
            i10 = AndroidUtilities.statusBarHeight;
        } else {
            i10 = 0;
        }
        return cropTop - i10;
    }

    public Bitmap getVideoThumb() {
        if (this.f31660f && this.h) {
            return this.f31659e.getBitmap();
        }
        return null;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f31657b.invalidate();
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.h && this.f31660f) {
            if (this.f31659e.isInsideImage(motionEvent.getX(), motionEvent.getY())) {
                if (motionEvent.getAction() == 1) {
                    ((org.telegram.ui.pr0) this.f31656a).f();
                }
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        wf.l lVar;
        super.onLayout(z10, i10, i11, i12, i13);
        wf.n nVar = this.f31657b;
        CropAreaView cropAreaView = nVar.f49953a;
        float cropWidth = cropAreaView.getCropWidth();
        if (cropWidth != 0.0f && (lVar = nVar.H) != null) {
            cropAreaView.a(nVar.h, lVar.f49943a / lVar.f49944b);
            cropAreaView.setActualRect(cropAreaView.getAspectRatio());
            cropAreaView.d(nVar.f49957f);
            wf.l.g(nVar.H, cropAreaView.getCropWidth() / cropWidth, 0.0f, 0.0f);
            nVar.r(false);
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.h && this.f31660f) {
            if (this.f31659e.isInsideImage(motionEvent.getX(), motionEvent.getY())) {
                if (motionEvent.getAction() == 1) {
                    ((org.telegram.ui.pr0) this.f31656a).f();
                }
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setAspectRatio(float f9) {
        this.f31657b.setAspectRatio(f9);
    }

    public void setDelegate(oe0 oe0Var) {
        this.f31656a = oe0Var;
    }

    public void setFreeform(boolean z10) {
        this.f31657b.setFreeform(z10);
    }

    public void setSubtitle(String str) {
        this.f31657b.setSubtitle(str);
    }

    public void setVideoThumbFlashAlpha(float f9) {
        this.f31664w = f9;
        invalidate();
    }

    public void setVideoThumbVisible(boolean z10) {
        float f9;
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
            f9 = 1.0f;
        } else {
            f9 = 0.0f;
        }
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this, this.B, f9));
        this.v.setDuration(180L);
        this.v.addListener(new ne0(this, 1));
        this.v.start();
    }
}
