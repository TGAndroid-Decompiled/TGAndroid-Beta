package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.PhotoViewer;
public final class qd0 extends FrameLayout {
    public final org.telegram.ui.ActionBar.i6 E;
    public final nd0 F;
    public final nd0 G;
    public pd0 f38762a;
    public final og.o f38763b;
    public final og.f f38764c;
    public final boolean d;
    public final ImageReceiver f38765e;
    public boolean f38766f;
    public boolean h;
    public float f38767n;
    public float f38768r;
    public AnimatorSet f38769s;
    public AnimatorSet f38770w;
    public float f38771x;
    public final Paint f38772y;

    public qd0(ContextThemeWrapper contextThemeWrapper, org.telegram.ui.ActionBar.i6 i6Var) {
        super(contextThemeWrapper);
        this.h = true;
        this.f38768r = 1.0f;
        this.f38771x = 0.0f;
        this.f38772y = new Paint(1);
        this.F = new nd0(this, 0);
        this.G = new nd0(this, 1);
        this.E = i6Var;
        this.d = contextThemeWrapper instanceof BubbleActivity;
        og.o oVar = new og.o(contextThemeWrapper);
        this.f38763b = oVar;
        oVar.setListener(new hn(this, 3));
        oVar.setBottomPadding(org.telegram.messenger.g0.L(64.0f));
        addView(oVar);
        this.f38765e = new ImageReceiver(this);
        og.f fVar = new og.f(contextThemeWrapper);
        this.f38764c = fVar;
        fVar.setListener(new hi.i0(2, this));
        addView(fVar, c8.ma.d(-1, -2.0f, 81, 0.0f, 0.0f, 0.0f, 0.0f));
    }

    public final void a() {
        og.o oVar = this.f38763b;
        oVar.f21894b.setVisibility(4);
        CropAreaView cropAreaView = oVar.f21893a;
        cropAreaView.setDimVisibility(false);
        cropAreaView.f(false, false);
        cropAreaView.invalidate();
    }

    public final void b(Bitmap bitmap, int i7, boolean z10, boolean z11, og.g gVar, v51 v51Var, org.telegram.messenger.we weVar) {
        boolean z12;
        org.telegram.messenger.we weVar2;
        requestLayout();
        int i10 = 0;
        this.f38766f = false;
        Bitmap bitmap2 = null;
        this.f38765e.w0(null);
        og.o oVar = this.f38763b;
        ImageView imageView = oVar.f21894b;
        oVar.f21903y = z10;
        oVar.d = v51Var;
        oVar.f21896e = gVar;
        oVar.L = i7;
        oVar.f21902x = bitmap;
        CropAreaView cropAreaView = oVar.f21893a;
        boolean z13 = true;
        if (v51Var != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        cropAreaView.setIsVideo(z12);
        if (bitmap == null && v51Var == null) {
            oVar.M = null;
            imageView.setImageDrawable(null);
            weVar2 = weVar;
        } else {
            int currentWidth = oVar.getCurrentWidth();
            int currentHeight = oVar.getCurrentHeight();
            og.m mVar = oVar.M;
            if (mVar != null && z11) {
                float f10 = currentWidth;
                mVar.f21886e *= mVar.f21883a / f10;
                mVar.f21883a = f10;
                mVar.f21884b = currentHeight;
                mVar.h();
                Matrix matrix = mVar.f21891k;
                og.o oVar2 = mVar.f21892l;
                matrix.getValues(oVar2.I);
                matrix.reset();
                float f11 = mVar.f21886e;
                matrix.postScale(f11, f11);
                float[] fArr = oVar2.I;
                matrix.postTranslate(fArr[2], fArr[5]);
                oVar2.r(false);
                weVar2 = weVar;
            } else {
                oVar.M = new og.m(oVar, currentWidth, currentHeight);
                weVar2 = weVar;
                cropAreaView.getViewTreeObserver().addOnPreDrawListener(new og.k(oVar, weVar2, currentHeight, currentWidth, 1));
            }
            if (v51Var == null) {
                bitmap2 = oVar.f21902x;
            }
            imageView.setImageBitmap(bitmap2);
        }
        og.f fVar = this.f38764c;
        fVar.setFreeform(z10);
        fVar.b(0.0f);
        fVar.setMirrored(false);
        fVar.setRotated(false);
        if (weVar2 != null) {
            fVar.b(weVar2.d);
            if (weVar2.f27681k == 0) {
                z13 = false;
            }
            fVar.setRotated(z13);
            fVar.setMirrored(weVar2.f27682l);
        } else {
            fVar.setRotated(false);
            fVar.setMirrored(false);
        }
        if (!z10) {
            i10 = 4;
        }
        fVar.setVisibility(i10);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        og.o oVar;
        boolean drawChild = super.drawChild(canvas, view, j3);
        if (this.f38766f && view == (oVar = this.f38763b)) {
            RectF actualRect = oVar.getActualRect();
            int L = org.telegram.messenger.g0.L(32.0f);
            org.telegram.ui.so0 so0Var = (org.telegram.ui.so0) this.f38762a;
            so0Var.getClass();
            PhotoViewer photoViewer = so0Var.f52042a;
            float measuredWidth = (photoViewer.S7.getMeasuredWidth() - org.telegram.messenger.g0.L(32.0f)) * photoViewer.f43364w8;
            int i7 = L / 2;
            int L2 = org.telegram.messenger.g0.L(2.0f) + (((int) (measuredWidth + org.telegram.messenger.g0.L(16.0f))) - i7);
            int measuredHeight = getMeasuredHeight() - org.telegram.messenger.g0.L(156.0f);
            float f10 = actualRect.left;
            float f11 = this.f38768r;
            float f12 = ((L2 - f10) * f11) + f10;
            float f13 = actualRect.top;
            float z10 = com.google.android.gms.internal.vision.e2.z(measuredHeight, f13, f11, f13);
            float width = ((L - actualRect.width()) * this.f38768r) + actualRect.width();
            ImageReceiver imageReceiver = this.f38765e;
            imageReceiver.J0((int) (width / 2.0f));
            imageReceiver.y0(f12, z10, width, width);
            imageReceiver.setAlpha(this.f38767n);
            imageReceiver.h(canvas, null);
            int i10 = (this.f38771x > 0.0f ? 1 : (this.f38771x == 0.0f ? 0 : -1));
            Paint paint = this.f38772y;
            if (i10 > 0) {
                paint.setColor(-1);
                paint.setAlpha((int) (this.f38771x * 255.0f));
                canvas.drawCircle(actualRect.centerX(), actualRect.centerY(), actualRect.width() / 2.0f, paint);
            }
            paint.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29643qg, this.E));
            paint.setAlpha(Math.min(255, (int) (this.f38768r * 255.0f * this.f38767n)));
            canvas.drawCircle(L2 + i7, org.telegram.messenger.g0.L(8.0f) + measuredHeight + L, org.telegram.messenger.g0.L(3.0f), paint);
        }
        return drawChild;
    }

    public float getRectSizeX() {
        return this.f38763b.getCropWidth();
    }

    public float getRectSizeY() {
        return this.f38763b.getCropHeight();
    }

    public float getRectX() {
        return this.f38763b.getCropLeft() - org.telegram.messenger.g0.L(14.0f);
    }

    public float getRectY() {
        int i7;
        float cropTop = this.f38763b.getCropTop() - org.telegram.messenger.g0.L(14.0f);
        if (!this.d) {
            i7 = org.telegram.messenger.g0.f24112m;
        } else {
            i7 = 0;
        }
        return cropTop - i7;
    }

    public Bitmap getVideoThumb() {
        if (this.f38766f && this.h) {
            return this.f38765e.n();
        }
        return null;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f38763b.invalidate();
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.h && this.f38766f) {
            if (this.f38765e.O(motionEvent.getX(), motionEvent.getY())) {
                if (motionEvent.getAction() == 1) {
                    ((org.telegram.ui.so0) this.f38762a).o();
                }
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        og.m mVar;
        super.onLayout(z10, i7, i10, i11, i12);
        og.o oVar = this.f38763b;
        CropAreaView cropAreaView = oVar.f21893a;
        float cropWidth = cropAreaView.getCropWidth();
        if (cropWidth != 0.0f && (mVar = oVar.M) != null) {
            cropAreaView.a(oVar.h, mVar.f21883a / mVar.f21884b);
            cropAreaView.setActualRect(cropAreaView.getAspectRatio());
            cropAreaView.d(oVar.f21897f);
            og.m.g(oVar.M, cropAreaView.getCropWidth() / cropWidth, 0.0f, 0.0f);
            oVar.r(false);
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.h && this.f38766f) {
            if (this.f38765e.O(motionEvent.getX(), motionEvent.getY())) {
                if (motionEvent.getAction() == 1) {
                    ((org.telegram.ui.so0) this.f38762a).o();
                }
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setAspectRatio(float f10) {
        this.f38763b.setAspectRatio(f10);
    }

    public void setDelegate(pd0 pd0Var) {
        this.f38762a = pd0Var;
    }

    public void setFreeform(boolean z10) {
        this.f38763b.setFreeform(z10);
    }

    public void setSubtitle(String str) {
        this.f38763b.setSubtitle(str);
    }

    public void setVideoThumbFlashAlpha(float f10) {
        this.f38771x = f10;
        invalidate();
    }

    public void setVideoThumbVisible(boolean z10) {
        float f10;
        if (this.h == z10) {
            return;
        }
        this.h = z10;
        AnimatorSet animatorSet = this.f38770w;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f38770w = animatorSet2;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this, this.G, f10));
        this.f38770w.setDuration(180L);
        this.f38770w.addListener(new od0(this, 1));
        this.f38770w.start();
    }
}
