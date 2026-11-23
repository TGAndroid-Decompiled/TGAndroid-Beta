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
public final class rd0 extends FrameLayout {
    public final org.telegram.ui.ActionBar.h6 E;
    public final od0 F;
    public final od0 G;
    public qd0 f39162a;
    public final og.o f39163b;
    public final og.f f39164c;
    public final boolean d;
    public final ImageReceiver f39165e;
    public boolean f39166f;
    public boolean h;
    public float f39167n;
    public float f39168r;
    public AnimatorSet f39169s;
    public AnimatorSet f39170w;
    public float f39171x;
    public final Paint f39172y;

    public rd0(ContextThemeWrapper contextThemeWrapper, org.telegram.ui.ActionBar.h6 h6Var) {
        super(contextThemeWrapper);
        this.h = true;
        this.f39168r = 1.0f;
        this.f39171x = 0.0f;
        this.f39172y = new Paint(1);
        this.F = new od0(this, 0);
        this.G = new od0(this, 1);
        this.E = h6Var;
        this.d = contextThemeWrapper instanceof BubbleActivity;
        og.o oVar = new og.o(contextThemeWrapper);
        this.f39163b = oVar;
        oVar.setListener(new jn(this, 3));
        oVar.setBottomPadding(org.telegram.messenger.g0.L(64.0f));
        addView(oVar);
        this.f39165e = new ImageReceiver(this);
        og.f fVar = new og.f(contextThemeWrapper);
        this.f39164c = fVar;
        fVar.setListener(new hi.j0(2, this));
        addView(fVar, c8.ma.d(-1, -2.0f, 81, 0.0f, 0.0f, 0.0f, 0.0f));
    }

    public final void a() {
        og.o oVar = this.f39163b;
        oVar.f21922b.setVisibility(4);
        CropAreaView cropAreaView = oVar.f21921a;
        cropAreaView.setDimVisibility(false);
        cropAreaView.f(false, false);
        cropAreaView.invalidate();
    }

    public final void b(Bitmap bitmap, int i7, boolean z10, boolean z11, og.g gVar, y51 y51Var, org.telegram.messenger.xe xeVar) {
        boolean z12;
        org.telegram.messenger.xe xeVar2;
        requestLayout();
        int i10 = 0;
        this.f39166f = false;
        Bitmap bitmap2 = null;
        this.f39165e.w0(null);
        og.o oVar = this.f39163b;
        ImageView imageView = oVar.f21922b;
        oVar.f21931y = z10;
        oVar.d = y51Var;
        oVar.f21924e = gVar;
        oVar.L = i7;
        oVar.f21930x = bitmap;
        CropAreaView cropAreaView = oVar.f21921a;
        boolean z13 = true;
        if (y51Var != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        cropAreaView.setIsVideo(z12);
        if (bitmap == null && y51Var == null) {
            oVar.M = null;
            imageView.setImageDrawable(null);
            xeVar2 = xeVar;
        } else {
            int currentWidth = oVar.getCurrentWidth();
            int currentHeight = oVar.getCurrentHeight();
            og.m mVar = oVar.M;
            if (mVar != null && z11) {
                float f10 = currentWidth;
                mVar.f21914e *= mVar.f21911a / f10;
                mVar.f21911a = f10;
                mVar.f21912b = currentHeight;
                mVar.h();
                Matrix matrix = mVar.f21919k;
                og.o oVar2 = mVar.f21920l;
                matrix.getValues(oVar2.I);
                matrix.reset();
                float f11 = mVar.f21914e;
                matrix.postScale(f11, f11);
                float[] fArr = oVar2.I;
                matrix.postTranslate(fArr[2], fArr[5]);
                oVar2.r(false);
                xeVar2 = xeVar;
            } else {
                oVar.M = new og.m(oVar, currentWidth, currentHeight);
                xeVar2 = xeVar;
                cropAreaView.getViewTreeObserver().addOnPreDrawListener(new og.k(oVar, xeVar2, currentHeight, currentWidth, 1));
            }
            if (y51Var == null) {
                bitmap2 = oVar.f21930x;
            }
            imageView.setImageBitmap(bitmap2);
        }
        og.f fVar = this.f39164c;
        fVar.setFreeform(z10);
        fVar.b(0.0f);
        fVar.setMirrored(false);
        fVar.setRotated(false);
        if (xeVar2 != null) {
            fVar.b(xeVar2.d);
            if (xeVar2.f27881k == 0) {
                z13 = false;
            }
            fVar.setRotated(z13);
            fVar.setMirrored(xeVar2.f27882l);
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
        if (this.f39166f && view == (oVar = this.f39163b)) {
            RectF actualRect = oVar.getActualRect();
            int L = org.telegram.messenger.g0.L(32.0f);
            org.telegram.ui.so0 so0Var = (org.telegram.ui.so0) this.f39162a;
            so0Var.getClass();
            PhotoViewer photoViewer = so0Var.f52091a;
            float measuredWidth = (photoViewer.S7.getMeasuredWidth() - org.telegram.messenger.g0.L(32.0f)) * photoViewer.f43409w8;
            int i7 = L / 2;
            int L2 = org.telegram.messenger.g0.L(2.0f) + (((int) (measuredWidth + org.telegram.messenger.g0.L(16.0f))) - i7);
            int measuredHeight = getMeasuredHeight() - org.telegram.messenger.g0.L(156.0f);
            float f10 = actualRect.left;
            float f11 = this.f39168r;
            float f12 = ((L2 - f10) * f11) + f10;
            float f13 = actualRect.top;
            float z10 = com.google.android.gms.internal.vision.e2.z(measuredHeight, f13, f11, f13);
            float width = ((L - actualRect.width()) * this.f39168r) + actualRect.width();
            ImageReceiver imageReceiver = this.f39165e;
            imageReceiver.J0((int) (width / 2.0f));
            imageReceiver.y0(f12, z10, width, width);
            imageReceiver.setAlpha(this.f39167n);
            imageReceiver.h(canvas, null);
            int i10 = (this.f39171x > 0.0f ? 1 : (this.f39171x == 0.0f ? 0 : -1));
            Paint paint = this.f39172y;
            if (i10 > 0) {
                paint.setColor(-1);
                paint.setAlpha((int) (this.f39171x * 255.0f));
                canvas.drawCircle(actualRect.centerX(), actualRect.centerY(), actualRect.width() / 2.0f, paint);
            }
            paint.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29630qg, this.E));
            paint.setAlpha(Math.min(255, (int) (this.f39168r * 255.0f * this.f39167n)));
            canvas.drawCircle(L2 + i7, org.telegram.messenger.g0.L(8.0f) + measuredHeight + L, org.telegram.messenger.g0.L(3.0f), paint);
        }
        return drawChild;
    }

    public float getRectSizeX() {
        return this.f39163b.getCropWidth();
    }

    public float getRectSizeY() {
        return this.f39163b.getCropHeight();
    }

    public float getRectX() {
        return this.f39163b.getCropLeft() - org.telegram.messenger.g0.L(14.0f);
    }

    public float getRectY() {
        int i7;
        float cropTop = this.f39163b.getCropTop() - org.telegram.messenger.g0.L(14.0f);
        if (!this.d) {
            i7 = org.telegram.messenger.g0.f24040m;
        } else {
            i7 = 0;
        }
        return cropTop - i7;
    }

    public Bitmap getVideoThumb() {
        if (this.f39166f && this.h) {
            return this.f39165e.n();
        }
        return null;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f39163b.invalidate();
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.h && this.f39166f) {
            if (this.f39165e.O(motionEvent.getX(), motionEvent.getY())) {
                if (motionEvent.getAction() == 1) {
                    ((org.telegram.ui.so0) this.f39162a).o();
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
        og.o oVar = this.f39163b;
        CropAreaView cropAreaView = oVar.f21921a;
        float cropWidth = cropAreaView.getCropWidth();
        if (cropWidth != 0.0f && (mVar = oVar.M) != null) {
            cropAreaView.a(oVar.h, mVar.f21911a / mVar.f21912b);
            cropAreaView.setActualRect(cropAreaView.getAspectRatio());
            cropAreaView.d(oVar.f21925f);
            og.m.g(oVar.M, cropAreaView.getCropWidth() / cropWidth, 0.0f, 0.0f);
            oVar.r(false);
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.h && this.f39166f) {
            if (this.f39165e.O(motionEvent.getX(), motionEvent.getY())) {
                if (motionEvent.getAction() == 1) {
                    ((org.telegram.ui.so0) this.f39162a).o();
                }
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setAspectRatio(float f10) {
        this.f39163b.setAspectRatio(f10);
    }

    public void setDelegate(qd0 qd0Var) {
        this.f39162a = qd0Var;
    }

    public void setFreeform(boolean z10) {
        this.f39163b.setFreeform(z10);
    }

    public void setSubtitle(String str) {
        this.f39163b.setSubtitle(str);
    }

    public void setVideoThumbFlashAlpha(float f10) {
        this.f39171x = f10;
        invalidate();
    }

    public void setVideoThumbVisible(boolean z10) {
        float f10;
        if (this.h == z10) {
            return;
        }
        this.h = z10;
        AnimatorSet animatorSet = this.f39170w;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f39170w = animatorSet2;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this, this.G, f10));
        this.f39170w.setDuration(180L);
        this.f39170w.addListener(new pd0(this, 1));
        this.f39170w.start();
    }
}
