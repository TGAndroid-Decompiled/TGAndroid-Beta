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
    public final org.telegram.ui.ActionBar.h6 D;
    public final cd0 E;
    public final cd0 F;
    public ed0 f33526a;
    public final og.o f33527b;
    public final og.f f33528c;
    public final boolean d;
    public final ImageReceiver f33529e;
    public boolean f33530f;
    public boolean h;
    public float f33531n;
    public float f33532r;
    public AnimatorSet f33533s;
    public AnimatorSet f33534w;
    public float f33535x;
    public final Paint f33536y;

    public fd0(ContextThemeWrapper contextThemeWrapper, org.telegram.ui.ActionBar.h6 h6Var) {
        super(contextThemeWrapper);
        this.h = true;
        this.f33532r = 1.0f;
        this.f33535x = 0.0f;
        this.f33536y = new Paint(1);
        this.E = new cd0(this, 0);
        this.F = new cd0(this, 1);
        this.D = h6Var;
        this.d = contextThemeWrapper instanceof BubbleActivity;
        og.o oVar = new og.o(contextThemeWrapper);
        this.f33527b = oVar;
        oVar.setListener(new uy(this, 2));
        oVar.setBottomPadding(org.telegram.messenger.g0.L(64.0f));
        addView(oVar);
        this.f33529e = new ImageReceiver(this);
        og.f fVar = new og.f(contextThemeWrapper);
        this.f33528c = fVar;
        fVar.setListener(new fi.h0(2, this));
        addView(fVar, c8.ha.d(-1, -2.0f, 81, 0.0f, 0.0f, 0.0f, 0.0f));
    }

    public final void a() {
        og.o oVar = this.f33527b;
        oVar.f21013b.setVisibility(4);
        CropAreaView cropAreaView = oVar.f21012a;
        cropAreaView.setDimVisibility(false);
        cropAreaView.f(false, false);
        cropAreaView.invalidate();
    }

    public final void b(Bitmap bitmap, int i7, boolean z9, boolean z10, og.g gVar, i51 i51Var, org.telegram.messenger.ye yeVar) {
        boolean z11;
        org.telegram.messenger.ye yeVar2;
        requestLayout();
        int i10 = 0;
        this.f33530f = false;
        Bitmap bitmap2 = null;
        this.f33529e.w0(null);
        og.o oVar = this.f33527b;
        ImageView imageView = oVar.f21013b;
        oVar.f21022y = z9;
        oVar.d = i51Var;
        oVar.f21015e = gVar;
        oVar.K = i7;
        oVar.f21021x = bitmap;
        CropAreaView cropAreaView = oVar.f21012a;
        boolean z12 = true;
        if (i51Var != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        cropAreaView.setIsVideo(z11);
        if (bitmap == null && i51Var == null) {
            oVar.L = null;
            imageView.setImageDrawable(null);
            yeVar2 = yeVar;
        } else {
            int currentWidth = oVar.getCurrentWidth();
            int currentHeight = oVar.getCurrentHeight();
            og.m mVar = oVar.L;
            if (mVar != null && z10) {
                float f10 = currentWidth;
                mVar.f21005e *= mVar.f21002a / f10;
                mVar.f21002a = f10;
                mVar.f21003b = currentHeight;
                mVar.h();
                Matrix matrix = mVar.f21010k;
                og.o oVar2 = mVar.f21011l;
                matrix.getValues(oVar2.H);
                matrix.reset();
                float f11 = mVar.f21005e;
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
            if (i51Var == null) {
                bitmap2 = oVar.f21021x;
            }
            imageView.setImageBitmap(bitmap2);
        }
        og.f fVar = this.f33528c;
        fVar.setFreeform(z9);
        fVar.b(0.0f);
        fVar.setMirrored(false);
        fVar.setRotated(false);
        if (yeVar2 != null) {
            fVar.b(yeVar2.d);
            if (yeVar2.f26646k == 0) {
                z12 = false;
            }
            fVar.setRotated(z12);
            fVar.setMirrored(yeVar2.f26647l);
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
        if (this.f33530f && view == (oVar = this.f33527b)) {
            RectF actualRect = oVar.getActualRect();
            int L = org.telegram.messenger.g0.L(32.0f);
            org.telegram.ui.uo0 uo0Var = (org.telegram.ui.uo0) this.f33526a;
            uo0Var.getClass();
            PhotoViewer photoViewer = uo0Var.f50538a;
            float measuredWidth = (photoViewer.R7.getMeasuredWidth() - org.telegram.messenger.g0.L(32.0f)) * photoViewer.f41538v8;
            int i7 = L / 2;
            int L2 = org.telegram.messenger.g0.L(2.0f) + (((int) (measuredWidth + org.telegram.messenger.g0.L(16.0f))) - i7);
            int measuredHeight = getMeasuredHeight() - org.telegram.messenger.g0.L(156.0f);
            float f10 = actualRect.left;
            float f11 = this.f33532r;
            float f12 = ((L2 - f10) * f11) + f10;
            float f13 = actualRect.top;
            float z9 = com.google.android.recaptcha.internal.a.z(measuredHeight, f13, f11, f13);
            float width = ((L - actualRect.width()) * this.f33532r) + actualRect.width();
            ImageReceiver imageReceiver = this.f33529e;
            imageReceiver.J0((int) (width / 2.0f));
            imageReceiver.y0(f12, z9, width, width);
            imageReceiver.setAlpha(this.f33531n);
            imageReceiver.h(canvas, null);
            int i10 = (this.f33535x > 0.0f ? 1 : (this.f33535x == 0.0f ? 0 : -1));
            Paint paint = this.f33536y;
            if (i10 > 0) {
                paint.setColor(-1);
                paint.setAlpha((int) (this.f33535x * 255.0f));
                canvas.drawCircle(actualRect.centerX(), actualRect.centerY(), actualRect.width() / 2.0f, paint);
            }
            paint.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f28081ng, this.D));
            paint.setAlpha(Math.min(255, (int) (this.f33532r * 255.0f * this.f33531n)));
            canvas.drawCircle(L2 + i7, org.telegram.messenger.g0.L(8.0f) + measuredHeight + L, org.telegram.messenger.g0.L(3.0f), paint);
        }
        return drawChild;
    }

    public float getRectSizeX() {
        return this.f33527b.getCropWidth();
    }

    public float getRectSizeY() {
        return this.f33527b.getCropHeight();
    }

    public float getRectX() {
        return this.f33527b.getCropLeft() - org.telegram.messenger.g0.L(14.0f);
    }

    public float getRectY() {
        int i7;
        float cropTop = this.f33527b.getCropTop() - org.telegram.messenger.g0.L(14.0f);
        if (!this.d) {
            i7 = org.telegram.messenger.g0.f22561m;
        } else {
            i7 = 0;
        }
        return cropTop - i7;
    }

    public Bitmap getVideoThumb() {
        if (this.f33530f && this.h) {
            return this.f33529e.n();
        }
        return null;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f33527b.invalidate();
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.h && this.f33530f) {
            if (this.f33529e.O(motionEvent.getX(), motionEvent.getY())) {
                if (motionEvent.getAction() == 1) {
                    ((org.telegram.ui.uo0) this.f33526a).o();
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
        og.o oVar = this.f33527b;
        CropAreaView cropAreaView = oVar.f21012a;
        float cropWidth = cropAreaView.getCropWidth();
        if (cropWidth != 0.0f && (mVar = oVar.L) != null) {
            cropAreaView.a(oVar.h, mVar.f21002a / mVar.f21003b);
            cropAreaView.setActualRect(cropAreaView.getAspectRatio());
            cropAreaView.d(oVar.f21016f);
            og.m.g(oVar.L, cropAreaView.getCropWidth() / cropWidth, 0.0f, 0.0f);
            oVar.r(false);
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.h && this.f33530f) {
            if (this.f33529e.O(motionEvent.getX(), motionEvent.getY())) {
                if (motionEvent.getAction() == 1) {
                    ((org.telegram.ui.uo0) this.f33526a).o();
                }
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setAspectRatio(float f10) {
        this.f33527b.setAspectRatio(f10);
    }

    public void setDelegate(ed0 ed0Var) {
        this.f33526a = ed0Var;
    }

    public void setFreeform(boolean z9) {
        this.f33527b.setFreeform(z9);
    }

    public void setSubtitle(String str) {
        this.f33527b.setSubtitle(str);
    }

    public void setVideoThumbFlashAlpha(float f10) {
        this.f33535x = f10;
        invalidate();
    }

    public void setVideoThumbVisible(boolean z9) {
        float f10;
        if (this.h == z9) {
            return;
        }
        this.h = z9;
        AnimatorSet animatorSet = this.f33534w;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f33534w = animatorSet2;
        if (z9) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this, this.F, f10));
        this.f33534w.setDuration(180L);
        this.f33534w.addListener(new dd0(this, 1));
        this.f33534w.start();
    }
}
