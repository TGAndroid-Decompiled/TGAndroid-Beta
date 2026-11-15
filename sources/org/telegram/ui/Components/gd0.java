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
public final class gd0 extends FrameLayout {
    public final org.telegram.ui.ActionBar.e6 E;
    public final dd0 F;
    public final dd0 G;
    public fd0 f34906a;
    public final og.o f34907b;
    public final og.f f34908c;
    public final boolean d;
    public final ImageReceiver f34909e;
    public boolean f34910f;
    public boolean h;
    public float f34911n;
    public float f34912r;
    public AnimatorSet f34913s;
    public AnimatorSet f34914w;
    public float f34915x;
    public final Paint f34916y;

    public gd0(ContextThemeWrapper contextThemeWrapper, org.telegram.ui.ActionBar.e6 e6Var) {
        super(contextThemeWrapper);
        this.h = true;
        this.f34912r = 1.0f;
        this.f34915x = 0.0f;
        this.f34916y = new Paint(1);
        this.F = new dd0(this, 0);
        this.G = new dd0(this, 1);
        this.E = e6Var;
        this.d = contextThemeWrapper instanceof BubbleActivity;
        og.o oVar = new og.o(contextThemeWrapper);
        this.f34907b = oVar;
        oVar.setListener(new org.telegram.messenger.ou(this, 9));
        oVar.setBottomPadding(org.telegram.messenger.g0.L(64.0f));
        addView(oVar);
        this.f34909e = new ImageReceiver(this);
        og.f fVar = new og.f(contextThemeWrapper);
        this.f34908c = fVar;
        fVar.setListener(new hi.h0(2, this));
        addView(fVar, c8.ja.d(-1, -2.0f, 81, 0.0f, 0.0f, 0.0f, 0.0f));
    }

    public final void a() {
        og.o oVar = this.f34907b;
        oVar.f21531b.setVisibility(4);
        CropAreaView cropAreaView = oVar.f21530a;
        cropAreaView.setDimVisibility(false);
        cropAreaView.f(false, false);
        cropAreaView.invalidate();
    }

    public final void b(Bitmap bitmap, int i7, boolean z10, boolean z11, og.g gVar, k51 k51Var, org.telegram.messenger.xe xeVar) {
        boolean z12;
        org.telegram.messenger.xe xeVar2;
        requestLayout();
        int i10 = 0;
        this.f34910f = false;
        Bitmap bitmap2 = null;
        this.f34909e.w0(null);
        og.o oVar = this.f34907b;
        ImageView imageView = oVar.f21531b;
        oVar.f21540y = z10;
        oVar.d = k51Var;
        oVar.f21533e = gVar;
        oVar.L = i7;
        oVar.f21539x = bitmap;
        CropAreaView cropAreaView = oVar.f21530a;
        boolean z13 = true;
        if (k51Var != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        cropAreaView.setIsVideo(z12);
        if (bitmap == null && k51Var == null) {
            oVar.M = null;
            imageView.setImageDrawable(null);
            xeVar2 = xeVar;
        } else {
            int currentWidth = oVar.getCurrentWidth();
            int currentHeight = oVar.getCurrentHeight();
            og.m mVar = oVar.M;
            if (mVar != null && z11) {
                float f10 = currentWidth;
                mVar.f21523e *= mVar.f21520a / f10;
                mVar.f21520a = f10;
                mVar.f21521b = currentHeight;
                mVar.h();
                Matrix matrix = mVar.f21528k;
                og.o oVar2 = mVar.f21529l;
                matrix.getValues(oVar2.I);
                matrix.reset();
                float f11 = mVar.f21523e;
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
            if (k51Var == null) {
                bitmap2 = oVar.f21539x;
            }
            imageView.setImageBitmap(bitmap2);
        }
        og.f fVar = this.f34908c;
        fVar.setFreeform(z10);
        fVar.b(0.0f);
        fVar.setMirrored(false);
        fVar.setRotated(false);
        if (xeVar2 != null) {
            fVar.b(xeVar2.d);
            if (xeVar2.f27495k == 0) {
                z13 = false;
            }
            fVar.setRotated(z13);
            fVar.setMirrored(xeVar2.f27496l);
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
        if (this.f34910f && view == (oVar = this.f34907b)) {
            RectF actualRect = oVar.getActualRect();
            int L = org.telegram.messenger.g0.L(32.0f);
            org.telegram.ui.po0 po0Var = (org.telegram.ui.po0) this.f34906a;
            po0Var.getClass();
            PhotoViewer photoViewer = po0Var.f50330a;
            float measuredWidth = (photoViewer.S7.getMeasuredWidth() - org.telegram.messenger.g0.L(32.0f)) * photoViewer.f42919w8;
            int i7 = L / 2;
            int L2 = org.telegram.messenger.g0.L(2.0f) + (((int) (measuredWidth + org.telegram.messenger.g0.L(16.0f))) - i7);
            int measuredHeight = getMeasuredHeight() - org.telegram.messenger.g0.L(156.0f);
            float f10 = actualRect.left;
            float f11 = this.f34912r;
            float f12 = ((L2 - f10) * f11) + f10;
            float f13 = actualRect.top;
            float z10 = com.google.android.gms.internal.vision.e2.z(measuredHeight, f13, f11, f13);
            float width = ((L - actualRect.width()) * this.f34912r) + actualRect.width();
            ImageReceiver imageReceiver = this.f34909e;
            imageReceiver.J0((int) (width / 2.0f));
            imageReceiver.y0(f12, z10, width, width);
            imageReceiver.setAlpha(this.f34911n);
            imageReceiver.h(canvas, null);
            int i10 = (this.f34915x > 0.0f ? 1 : (this.f34915x == 0.0f ? 0 : -1));
            Paint paint = this.f34916y;
            if (i10 > 0) {
                paint.setColor(-1);
                paint.setAlpha((int) (this.f34915x * 255.0f));
                canvas.drawCircle(actualRect.centerX(), actualRect.centerY(), actualRect.width() / 2.0f, paint);
            }
            paint.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29098qg, this.E));
            paint.setAlpha(Math.min(255, (int) (this.f34912r * 255.0f * this.f34911n)));
            canvas.drawCircle(L2 + i7, org.telegram.messenger.g0.L(8.0f) + measuredHeight + L, org.telegram.messenger.g0.L(3.0f), paint);
        }
        return drawChild;
    }

    public float getRectSizeX() {
        return this.f34907b.getCropWidth();
    }

    public float getRectSizeY() {
        return this.f34907b.getCropHeight();
    }

    public float getRectX() {
        return this.f34907b.getCropLeft() - org.telegram.messenger.g0.L(14.0f);
    }

    public float getRectY() {
        int i7;
        float cropTop = this.f34907b.getCropTop() - org.telegram.messenger.g0.L(14.0f);
        if (!this.d) {
            i7 = org.telegram.messenger.g0.f23603m;
        } else {
            i7 = 0;
        }
        return cropTop - i7;
    }

    public Bitmap getVideoThumb() {
        if (this.f34910f && this.h) {
            return this.f34909e.n();
        }
        return null;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f34907b.invalidate();
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.h && this.f34910f) {
            if (this.f34909e.O(motionEvent.getX(), motionEvent.getY())) {
                if (motionEvent.getAction() == 1) {
                    ((org.telegram.ui.po0) this.f34906a).o();
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
        og.o oVar = this.f34907b;
        CropAreaView cropAreaView = oVar.f21530a;
        float cropWidth = cropAreaView.getCropWidth();
        if (cropWidth != 0.0f && (mVar = oVar.M) != null) {
            cropAreaView.a(oVar.h, mVar.f21520a / mVar.f21521b);
            cropAreaView.setActualRect(cropAreaView.getAspectRatio());
            cropAreaView.d(oVar.f21534f);
            og.m.g(oVar.M, cropAreaView.getCropWidth() / cropWidth, 0.0f, 0.0f);
            oVar.r(false);
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.h && this.f34910f) {
            if (this.f34909e.O(motionEvent.getX(), motionEvent.getY())) {
                if (motionEvent.getAction() == 1) {
                    ((org.telegram.ui.po0) this.f34906a).o();
                }
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setAspectRatio(float f10) {
        this.f34907b.setAspectRatio(f10);
    }

    public void setDelegate(fd0 fd0Var) {
        this.f34906a = fd0Var;
    }

    public void setFreeform(boolean z10) {
        this.f34907b.setFreeform(z10);
    }

    public void setSubtitle(String str) {
        this.f34907b.setSubtitle(str);
    }

    public void setVideoThumbFlashAlpha(float f10) {
        this.f34915x = f10;
        invalidate();
    }

    public void setVideoThumbVisible(boolean z10) {
        float f10;
        if (this.h == z10) {
            return;
        }
        this.h = z10;
        AnimatorSet animatorSet = this.f34914w;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f34914w = animatorSet2;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this, this.G, f10));
        this.f34914w.setDuration(180L);
        this.f34914w.addListener(new ed0(this, 1));
        this.f34914w.start();
    }
}
