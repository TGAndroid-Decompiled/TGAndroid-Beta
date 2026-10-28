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
public final class pf0 extends FrameLayout {
    public final mf0 E;
    public final mf0 F;
    public of0 f31596a;
    public final ng.p f31597b;
    public final ng.f f31598c;
    public final boolean d;
    public final ImageReceiver e;
    public boolean f31599f;
    public boolean h;
    public float f31600n;
    public float f31601r;
    public AnimatorSet f31602s;
    public AnimatorSet v;
    public float f31603w;
    public final Paint f31604x;
    public final org.telegram.ui.ActionBar.u6 f31605y;

    public pf0(ContextThemeWrapper contextThemeWrapper, org.telegram.ui.ActionBar.u6 u6Var) {
        super(contextThemeWrapper);
        this.h = true;
        this.f31601r = 1.0f;
        this.f31603w = 0.0f;
        this.f31604x = new Paint(1);
        this.E = new mf0(this, 0);
        this.F = new mf0(this, 1);
        this.f31605y = u6Var;
        this.d = contextThemeWrapper instanceof BubbleActivity;
        ng.p pVar = new ng.p(contextThemeWrapper);
        this.f31597b = pVar;
        pVar.setListener(new li.h5(this));
        pVar.setBottomPadding(AndroidUtilities.dp(64.0f));
        addView(pVar);
        this.e = new ImageReceiver(this);
        ng.f fVar = new ng.f(contextThemeWrapper);
        this.f31598c = fVar;
        fVar.setListener(new fi.h0(2, this));
        addView(fVar, kb1.h(-1, -2.0f, 81, 0.0f, 0.0f, 0.0f, 0.0f));
    }

    public final void a() {
        ng.p pVar = this.f31597b;
        pVar.f18843b.setVisibility(4);
        CropAreaView cropAreaView = pVar.f18842a;
        cropAreaView.setDimVisibility(false);
        cropAreaView.f(false, false);
        cropAreaView.invalidate();
    }

    public final void b(Bitmap bitmap, int i10, boolean z10, boolean z11, ng.g gVar, i81 i81Var, MediaController.CropState cropState) {
        boolean z12;
        requestLayout();
        int i11 = 0;
        this.f31599f = false;
        Bitmap bitmap2 = null;
        this.e.setImageBitmap((Drawable) null);
        ng.p pVar = this.f31597b;
        ImageView imageView = pVar.f18843b;
        pVar.f18850x = z10;
        pVar.d = i81Var;
        pVar.e = gVar;
        pVar.K = i10;
        pVar.f18849w = bitmap;
        CropAreaView cropAreaView = pVar.f18842a;
        boolean z13 = true;
        if (i81Var != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        cropAreaView.setIsVideo(z12);
        if (bitmap == null && i81Var == null) {
            pVar.L = null;
            imageView.setImageDrawable(null);
        } else {
            int currentWidth = pVar.getCurrentWidth();
            int currentHeight = pVar.getCurrentHeight();
            ng.n nVar = pVar.L;
            if (nVar != null && z11) {
                float f7 = currentWidth;
                nVar.e *= nVar.f18833a / f7;
                nVar.f18833a = f7;
                nVar.f18834b = currentHeight;
                nVar.h();
                Matrix matrix = nVar.f18840k;
                ng.p pVar2 = nVar.f18841l;
                matrix.getValues(pVar2.H);
                matrix.reset();
                float f10 = nVar.e;
                matrix.postScale(f10, f10);
                float[] fArr = pVar2.H;
                matrix.postTranslate(fArr[2], fArr[5]);
                pVar2.r(false);
            } else {
                pVar.L = new ng.n(pVar, currentWidth, currentHeight);
                cropAreaView.getViewTreeObserver().addOnPreDrawListener(new ng.l(pVar, cropState, currentHeight, currentWidth));
            }
            if (i81Var == null) {
                bitmap2 = pVar.f18849w;
            }
            imageView.setImageBitmap(bitmap2);
        }
        ng.f fVar = this.f31598c;
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
        ng.p pVar;
        boolean drawChild = super.drawChild(canvas, view, j10);
        if (this.f31599f && view == (pVar = this.f31597b)) {
            RectF actualRect = pVar.getActualRect();
            int dp = AndroidUtilities.dp(32.0f);
            org.telegram.ui.is0 is0Var = (org.telegram.ui.is0) this.f31596a;
            is0Var.getClass();
            PhotoViewer photoViewer = is0Var.f40267a;
            float measuredWidth = (photoViewer.S7.getMeasuredWidth() - AndroidUtilities.dp(32.0f)) * photoViewer.f35838w8;
            int i10 = dp / 2;
            int dp2 = AndroidUtilities.dp(2.0f) + (((int) (measuredWidth + AndroidUtilities.dp(16.0f))) - i10);
            int measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(156.0f);
            float f7 = actualRect.left;
            float f10 = this.f31601r;
            float f11 = ((dp2 - f7) * f10) + f7;
            float f12 = actualRect.top;
            float z10 = c3.h0.z(measuredHeight, f12, f10, f12);
            float width = ((dp - actualRect.width()) * this.f31601r) + actualRect.width();
            ImageReceiver imageReceiver = this.e;
            imageReceiver.setRoundRadius((int) (width / 2.0f));
            imageReceiver.setImageCoords(f11, z10, width, width);
            imageReceiver.setAlpha(this.f31600n);
            imageReceiver.draw(canvas);
            int i11 = (this.f31603w > 0.0f ? 1 : (this.f31603w == 0.0f ? 0 : -1));
            Paint paint = this.f31604x;
            if (i11 > 0) {
                paint.setColor(-1);
                paint.setAlpha((int) (this.f31603w * 255.0f));
                canvas.drawCircle(actualRect.centerX(), actualRect.centerY(), actualRect.width() / 2.0f, paint);
            }
            paint.setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.zf, this.f31605y));
            paint.setAlpha(Math.min(255, (int) (this.f31601r * 255.0f * this.f31600n)));
            canvas.drawCircle(dp2 + i10, AndroidUtilities.dp(8.0f) + measuredHeight + dp, AndroidUtilities.dp(3.0f), paint);
        }
        return drawChild;
    }

    public float getRectSizeX() {
        return this.f31597b.getCropWidth();
    }

    public float getRectSizeY() {
        return this.f31597b.getCropHeight();
    }

    public float getRectX() {
        return this.f31597b.getCropLeft() - AndroidUtilities.dp(14.0f);
    }

    public float getRectY() {
        int i10;
        float cropTop = this.f31597b.getCropTop() - AndroidUtilities.dp(14.0f);
        if (!this.d) {
            i10 = AndroidUtilities.statusBarHeight;
        } else {
            i10 = 0;
        }
        return cropTop - i10;
    }

    public Bitmap getVideoThumb() {
        if (this.f31599f && this.h) {
            return this.e.getBitmap();
        }
        return null;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f31597b.invalidate();
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.h && this.f31599f) {
            if (this.e.isInsideImage(motionEvent.getX(), motionEvent.getY())) {
                if (motionEvent.getAction() == 1) {
                    ((org.telegram.ui.is0) this.f31596a).e();
                }
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        ng.n nVar;
        super.onLayout(z10, i10, i11, i12, i13);
        ng.p pVar = this.f31597b;
        CropAreaView cropAreaView = pVar.f18842a;
        float cropWidth = cropAreaView.getCropWidth();
        if (cropWidth != 0.0f && (nVar = pVar.L) != null) {
            cropAreaView.a(pVar.h, nVar.f18833a / nVar.f18834b);
            cropAreaView.setActualRect(cropAreaView.getAspectRatio());
            cropAreaView.d(pVar.f18845f);
            ng.n.g(pVar.L, cropAreaView.getCropWidth() / cropWidth, 0.0f, 0.0f);
            pVar.r(false);
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.h && this.f31599f) {
            if (this.e.isInsideImage(motionEvent.getX(), motionEvent.getY())) {
                if (motionEvent.getAction() == 1) {
                    ((org.telegram.ui.is0) this.f31596a).e();
                }
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setAspectRatio(float f7) {
        this.f31597b.setAspectRatio(f7);
    }

    public void setDelegate(of0 of0Var) {
        this.f31596a = of0Var;
    }

    public void setFreeform(boolean z10) {
        this.f31597b.setFreeform(z10);
    }

    public void setSubtitle(String str) {
        this.f31597b.setSubtitle(str);
    }

    public void setVideoThumbFlashAlpha(float f7) {
        this.f31603w = f7;
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
        this.v.addListener(new nf0(this, 1));
        this.v.start();
    }
}
