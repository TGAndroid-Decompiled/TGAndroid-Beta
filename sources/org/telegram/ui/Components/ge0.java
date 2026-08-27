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

public final class ge0 extends FrameLayout {
    public final de0 A;
    public final de0 B;

    public fe0 f28601a;

    public final uf.n f28602b;

    public final uf.e f28603c;
    public final boolean d;

    public final ImageReceiver f28604e;

    public boolean f28605f;
    public boolean h;

    public float f28606n;

    public float f28607r;

    public AnimatorSet f28608s;
    public AnimatorSet v;

    public float f28609w;

    public final Paint f28610x;

    public final org.telegram.ui.ActionBar.c6 f28611y;

    public ge0(ContextThemeWrapper contextThemeWrapper, org.telegram.ui.ActionBar.c6 c6Var) {
        super(contextThemeWrapper);
        this.h = true;
        this.f28607r = 1.0f;
        this.f28609w = 0.0f;
        this.f28610x = new Paint(1);
        this.A = new de0(this, 0);
        this.B = new de0(this, 1);
        this.f28611y = c6Var;
        this.d = contextThemeWrapper instanceof BubbleActivity;
        uf.n nVar = new uf.n(contextThemeWrapper);
        this.f28602b = nVar;
        nVar.setListener(new n2.b0(this, 10));
        nVar.setBottomPadding(AndroidUtilities.dp(64.0f));
        addView(nVar);
        this.f28604e = new ImageReceiver(this);
        uf.e eVar = new uf.e(contextThemeWrapper);
        this.f28603c = eVar;
        eVar.setListener(new lh.h0(2, this));
        addView(eVar, h7.z5.d(-1, -2.0f, 81, 0.0f, 0.0f, 0.0f, 0.0f));
    }

    public final void a() {
        uf.n nVar = this.f28602b;
        nVar.f48627b.setVisibility(4);
        CropAreaView cropAreaView = nVar.f48626a;
        cropAreaView.setDimVisibility(false);
        cropAreaView.f(false, false);
        cropAreaView.invalidate();
    }

    public final void b(Bitmap bitmap, int i10, boolean z10, boolean z11, uf.f fVar, a61 a61Var, MediaController.CropState cropState) {
        requestLayout();
        this.f28605f = false;
        this.f28604e.setImageBitmap((Drawable) null);
        uf.n nVar = this.f28602b;
        ImageView imageView = nVar.f48627b;
        nVar.f48635x = z10;
        nVar.d = a61Var;
        nVar.f48629e = fVar;
        nVar.G = i10;
        nVar.f48634w = bitmap;
        CropAreaView cropAreaView = nVar.f48626a;
        cropAreaView.setIsVideo(a61Var != null);
        if (bitmap == null && a61Var == null) {
            nVar.H = null;
            imageView.setImageDrawable(null);
        } else {
            int currentWidth = nVar.getCurrentWidth();
            int currentHeight = nVar.getCurrentHeight();
            uf.l lVar = nVar.H;
            if (lVar == null || !z11) {
                nVar.H = new uf.l(nVar, currentWidth, currentHeight);
                cropAreaView.getViewTreeObserver().addOnPreDrawListener(new uf.j(nVar, cropState, currentHeight, currentWidth));
            } else {
                float f10 = currentWidth;
                lVar.f48619e *= lVar.f48616a / f10;
                lVar.f48616a = f10;
                lVar.f48617b = currentHeight;
                lVar.h();
                Matrix matrix = lVar.f48624k;
                uf.n nVar2 = lVar.f48625l;
                matrix.getValues(nVar2.D);
                matrix.reset();
                float f11 = lVar.f48619e;
                matrix.postScale(f11, f11);
                float[] fArr = nVar2.D;
                matrix.postTranslate(fArr[2], fArr[5]);
                nVar2.r(false);
            }
            imageView.setImageBitmap(a61Var == null ? nVar.f48634w : null);
        }
        uf.e eVar = this.f28603c;
        eVar.setFreeform(z10);
        eVar.b(0.0f);
        eVar.setMirrored(false);
        eVar.setRotated(false);
        if (cropState != null) {
            eVar.b(cropState.cropRotate);
            eVar.setRotated(cropState.transformRotation != 0);
            eVar.setMirrored(cropState.mirrored);
        } else {
            eVar.setRotated(false);
            eVar.setMirrored(false);
        }
        eVar.setVisibility(z10 ? 0 : 4);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        uf.n nVar;
        boolean zDrawChild = super.drawChild(canvas, view, j10);
        if (this.f28605f && view == (nVar = this.f28602b)) {
            RectF actualRect = nVar.getActualRect();
            int iDp = AndroidUtilities.dp(32.0f);
            org.telegram.ui.rr0 rr0Var = (org.telegram.ui.rr0) this.f28601a;
            rr0Var.getClass();
            float fDp = AndroidUtilities.dp(16.0f);
            PhotoViewer photoViewer = rr0Var.f42322a;
            int measuredWidth = (int) (((photoViewer.N7.getMeasuredWidth() - AndroidUtilities.dp(32.0f)) * photoViewer.f35744r8) + fDp);
            int i10 = iDp / 2;
            int iDp2 = AndroidUtilities.dp(2.0f) + (measuredWidth - i10);
            int measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(156.0f);
            float f10 = actualRect.left;
            float f11 = this.f28607r;
            float f12 = ((iDp2 - f10) * f11) + f10;
            float f13 = actualRect.top;
            float fZ = com.google.android.recaptcha.internal.a.z(measuredHeight, f13, f11, f13);
            float fWidth = ((iDp - actualRect.width()) * this.f28607r) + actualRect.width();
            ImageReceiver imageReceiver = this.f28604e;
            imageReceiver.setRoundRadius((int) (fWidth / 2.0f));
            imageReceiver.setImageCoords(f12, fZ, fWidth, fWidth);
            imageReceiver.setAlpha(this.f28606n);
            imageReceiver.draw(canvas);
            float f14 = this.f28609w;
            Paint paint = this.f28610x;
            if (f14 > 0.0f) {
                paint.setColor(-1);
                paint.setAlpha((int) (this.f28609w * 255.0f));
                canvas.drawCircle(actualRect.centerX(), actualRect.centerY(), actualRect.width() / 2.0f, paint);
            }
            paint.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23449zf, this.f28611y));
            paint.setAlpha(Math.min(255, (int) (this.f28607r * 255.0f * this.f28606n)));
            canvas.drawCircle(iDp2 + i10, AndroidUtilities.dp(8.0f) + measuredHeight + iDp, AndroidUtilities.dp(3.0f), paint);
        }
        return zDrawChild;
    }

    public float getRectSizeX() {
        return this.f28602b.getCropWidth();
    }

    public float getRectSizeY() {
        return this.f28602b.getCropHeight();
    }

    public float getRectX() {
        return this.f28602b.getCropLeft() - AndroidUtilities.dp(14.0f);
    }

    public float getRectY() {
        return (this.f28602b.getCropTop() - AndroidUtilities.dp(14.0f)) - (!this.d ? AndroidUtilities.statusBarHeight : 0);
    }

    public Bitmap getVideoThumb() {
        if (this.f28605f && this.h) {
            return this.f28604e.getBitmap();
        }
        return null;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f28602b.invalidate();
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.h && this.f28605f) {
            if (this.f28604e.isInsideImage(motionEvent.getX(), motionEvent.getY())) {
                if (motionEvent.getAction() == 1) {
                    ((org.telegram.ui.rr0) this.f28601a).f();
                }
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        uf.l lVar;
        super.onLayout(z10, i10, i11, i12, i13);
        uf.n nVar = this.f28602b;
        CropAreaView cropAreaView = nVar.f48626a;
        float cropWidth = cropAreaView.getCropWidth();
        if (cropWidth == 0.0f || (lVar = nVar.H) == null) {
            return;
        }
        cropAreaView.a(nVar.h, lVar.f48616a / lVar.f48617b);
        cropAreaView.setActualRect(cropAreaView.getAspectRatio());
        cropAreaView.d(nVar.f48630f);
        uf.l.g(nVar.H, cropAreaView.getCropWidth() / cropWidth, 0.0f, 0.0f);
        nVar.r(false);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.h && this.f28605f) {
            if (this.f28604e.isInsideImage(motionEvent.getX(), motionEvent.getY())) {
                if (motionEvent.getAction() == 1) {
                    ((org.telegram.ui.rr0) this.f28601a).f();
                }
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setAspectRatio(float f10) {
        this.f28602b.setAspectRatio(f10);
    }

    public void setDelegate(fe0 fe0Var) {
        this.f28601a = fe0Var;
    }

    public void setFreeform(boolean z10) {
        this.f28602b.setFreeform(z10);
    }

    public void setSubtitle(String str) {
        this.f28602b.setSubtitle(str);
    }

    public void setVideoThumbFlashAlpha(float f10) {
        this.f28609w = f10;
        invalidate();
    }

    public void setVideoThumbVisible(boolean z10) {
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
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this, this.B, z10 ? 1.0f : 0.0f));
        this.v.setDuration(180L);
        this.v.addListener(new ee0(this, 1));
        this.v.start();
    }
}
