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
public final class fd0 extends FrameLayout {
    public final org.telegram.ui.ActionBar.f6 D;
    public final cd0 E;
    public final cd0 F;
    public ed0 f33524a;
    public final og.o f33525b;
    public final og.f f33526c;
    public final boolean d;
    public final ImageReceiver f33527e;
    public boolean f33528f;
    public boolean h;
    public float f33529n;
    public float f33530r;
    public AnimatorSet f33531s;
    public AnimatorSet f33532w;
    public float f33533x;
    public final Paint f33534y;

    public fd0(ContextThemeWrapper contextThemeWrapper, org.telegram.ui.ActionBar.f6 f6Var) {
        super(contextThemeWrapper);
        this.h = true;
        this.f33530r = 1.0f;
        this.f33533x = 0.0f;
        this.f33534y = new Paint(1);
        this.E = new cd0(this, 0);
        this.F = new cd0(this, 1);
        this.D = f6Var;
        this.d = contextThemeWrapper instanceof BubbleActivity;
        og.o oVar = new og.o(contextThemeWrapper);
        this.f33525b = oVar;
        oVar.setListener(new vy(this, 2));
        oVar.setBottomPadding(org.telegram.messenger.g0.L(64.0f));
        addView(oVar);
        this.f33527e = new ImageReceiver(this);
        og.f fVar = new og.f(contextThemeWrapper);
        this.f33526c = fVar;
        fVar.setListener(new fi.h0(2, this));
        addView(fVar, c8.ha.d(-1, -2.0f, 81, 0.0f, 0.0f, 0.0f, 0.0f));
    }

    public final void a() {
        og.o oVar = this.f33525b;
        oVar.f21008b.setVisibility(4);
        CropAreaView cropAreaView = oVar.f21007a;
        cropAreaView.setDimVisibility(false);
        cropAreaView.f(false, false);
        cropAreaView.invalidate();
    }

    public final void b(Bitmap bitmap, int i7, boolean z9, boolean z10, og.g gVar, h51 h51Var, org.telegram.messenger.ye yeVar) {
        boolean z11;
        org.telegram.messenger.ye yeVar2;
        requestLayout();
        int i10 = 0;
        this.f33528f = false;
        Bitmap bitmap2 = null;
        this.f33527e.w0(null);
        og.o oVar = this.f33525b;
        ImageView imageView = oVar.f21008b;
        oVar.f21017y = z9;
        oVar.d = h51Var;
        oVar.f21010e = gVar;
        oVar.K = i7;
        oVar.f21016x = bitmap;
        CropAreaView cropAreaView = oVar.f21007a;
        boolean z12 = true;
        if (h51Var != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        cropAreaView.setIsVideo(z11);
        if (bitmap == null && h51Var == null) {
            oVar.L = null;
            imageView.setImageDrawable(null);
            yeVar2 = yeVar;
        } else {
            int currentWidth = oVar.getCurrentWidth();
            int currentHeight = oVar.getCurrentHeight();
            og.m mVar = oVar.L;
            if (mVar != null && z10) {
                float f10 = currentWidth;
                mVar.f21000e *= mVar.f20997a / f10;
                mVar.f20997a = f10;
                mVar.f20998b = currentHeight;
                mVar.h();
                Matrix matrix = mVar.f21005k;
                og.o oVar2 = mVar.f21006l;
                matrix.getValues(oVar2.H);
                matrix.reset();
                float f11 = mVar.f21000e;
                matrix.postScale(f11, f11);
                float[] fArr = oVar2.H;
                matrix.postTranslate(fArr[2], fArr[5]);
                oVar2.r(false);
                yeVar2 = yeVar;
            } else {
                oVar.L = new og.m(oVar, currentWidth, currentHeight);
                yeVar2 = yeVar;
                cropAreaView.getViewTreeObserver().addOnPreDrawListener(new og.k(oVar, yeVar2, currentHeight, currentWidth, 1));
            }
            if (h51Var == null) {
                bitmap2 = oVar.f21016x;
            }
            imageView.setImageBitmap(bitmap2);
        }
        og.f fVar = this.f33526c;
        fVar.setFreeform(z9);
        fVar.b(0.0f);
        fVar.setMirrored(false);
        fVar.setRotated(false);
        if (yeVar2 != null) {
            fVar.b(yeVar2.d);
            if (yeVar2.f26642k == 0) {
                z12 = false;
            }
            fVar.setRotated(z12);
            fVar.setMirrored(yeVar2.f26643l);
        } else {
            fVar.setRotated(false);
            fVar.setMirrored(false);
        }
        if (!z9) {
            i10 = 4;
        }
        fVar.setVisibility(i10);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        og.o oVar;
        boolean drawChild = super.drawChild(canvas, view, j3);
        if (this.f33528f && view == (oVar = this.f33525b)) {
            RectF actualRect = oVar.getActualRect();
            int L = org.telegram.messenger.g0.L(32.0f);
            org.telegram.ui.ro0 ro0Var = (org.telegram.ui.ro0) this.f33524a;
            ro0Var.getClass();
            PhotoViewer photoViewer = ro0Var.f49521a;
            float measuredWidth = (photoViewer.R7.getMeasuredWidth() - org.telegram.messenger.g0.L(32.0f)) * photoViewer.f41540v8;
            int i7 = L / 2;
            int L2 = org.telegram.messenger.g0.L(2.0f) + (((int) (measuredWidth + org.telegram.messenger.g0.L(16.0f))) - i7);
            int measuredHeight = getMeasuredHeight() - org.telegram.messenger.g0.L(156.0f);
            float f10 = actualRect.left;
            float f11 = this.f33530r;
            float f12 = ((L2 - f10) * f11) + f10;
            float f13 = actualRect.top;
            float z9 = com.google.android.recaptcha.internal.a.z(measuredHeight, f13, f11, f13);
            float width = ((L - actualRect.width()) * this.f33530r) + actualRect.width();
            ImageReceiver imageReceiver = this.f33527e;
            imageReceiver.J0((int) (width / 2.0f));
            imageReceiver.y0(f12, z9, width, width);
            imageReceiver.setAlpha(this.f33529n);
            imageReceiver.h(canvas, null);
            int i10 = (this.f33533x > 0.0f ? 1 : (this.f33533x == 0.0f ? 0 : -1));
            Paint paint = this.f33534y;
            if (i10 > 0) {
                paint.setColor(-1);
                paint.setAlpha((int) (this.f33533x * 255.0f));
                canvas.drawCircle(actualRect.centerX(), actualRect.centerY(), actualRect.width() / 2.0f, paint);
            }
            paint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28043ng, this.D));
            paint.setAlpha(Math.min(255, (int) (this.f33530r * 255.0f * this.f33529n)));
            canvas.drawCircle(L2 + i7, org.telegram.messenger.g0.L(8.0f) + measuredHeight + L, org.telegram.messenger.g0.L(3.0f), paint);
        }
        return drawChild;
    }

    public float getRectSizeX() {
        return this.f33525b.getCropWidth();
    }

    public float getRectSizeY() {
        return this.f33525b.getCropHeight();
    }

    public float getRectX() {
        return this.f33525b.getCropLeft() - org.telegram.messenger.g0.L(14.0f);
    }

    public float getRectY() {
        int i7;
        float cropTop = this.f33525b.getCropTop() - org.telegram.messenger.g0.L(14.0f);
        if (!this.d) {
            i7 = org.telegram.messenger.g0.f22557m;
        } else {
            i7 = 0;
        }
        return cropTop - i7;
    }

    public Bitmap getVideoThumb() {
        if (this.f33528f && this.h) {
            return this.f33527e.n();
        }
        return null;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f33525b.invalidate();
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.h && this.f33528f) {
            if (this.f33527e.O(motionEvent.getX(), motionEvent.getY())) {
                if (motionEvent.getAction() == 1) {
                    ((org.telegram.ui.ro0) this.f33524a).o();
                }
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        og.m mVar;
        super.onLayout(z9, i7, i10, i11, i12);
        og.o oVar = this.f33525b;
        CropAreaView cropAreaView = oVar.f21007a;
        float cropWidth = cropAreaView.getCropWidth();
        if (cropWidth != 0.0f && (mVar = oVar.L) != null) {
            cropAreaView.a(oVar.h, mVar.f20997a / mVar.f20998b);
            cropAreaView.setActualRect(cropAreaView.getAspectRatio());
            cropAreaView.d(oVar.f21011f);
            og.m.g(oVar.L, cropAreaView.getCropWidth() / cropWidth, 0.0f, 0.0f);
            oVar.r(false);
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.h && this.f33528f) {
            if (this.f33527e.O(motionEvent.getX(), motionEvent.getY())) {
                if (motionEvent.getAction() == 1) {
                    ((org.telegram.ui.ro0) this.f33524a).o();
                }
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setAspectRatio(float f10) {
        this.f33525b.setAspectRatio(f10);
    }

    public void setDelegate(ed0 ed0Var) {
        this.f33524a = ed0Var;
    }

    public void setFreeform(boolean z9) {
        this.f33525b.setFreeform(z9);
    }

    public void setSubtitle(String str) {
        this.f33525b.setSubtitle(str);
    }

    public void setVideoThumbFlashAlpha(float f10) {
        this.f33533x = f10;
        invalidate();
    }

    public void setVideoThumbVisible(boolean z9) {
        float f10;
        if (this.h == z9) {
            return;
        }
        this.h = z9;
        AnimatorSet animatorSet = this.f33532w;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f33532w = animatorSet2;
        if (z9) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this, this.F, f10));
        this.f33532w.setDuration(180L);
        this.f33532w.addListener(new dd0(this, 1));
        this.f33532w.start();
    }
}
