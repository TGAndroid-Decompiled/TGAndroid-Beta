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
public final class zf0 extends FrameLayout {
    public final wf0 E;
    public final wf0 F;
    public yf0 f33341a;
    public final lg.p f33342b;
    public final lg.f f33343c;
    public final boolean d;
    public final ImageReceiver f33344e;
    public boolean f33345f;
    public boolean h;
    public float f33346n;
    public float f33347r;
    public AnimatorSet f33348s;
    public AnimatorSet v;
    public float f33349w;
    public final Paint f33350x;
    public final org.telegram.ui.ActionBar.c6 f33351y;

    public zf0(ContextThemeWrapper contextThemeWrapper, org.telegram.ui.ActionBar.c6 c6Var) {
        super(contextThemeWrapper);
        this.h = true;
        this.f33347r = 1.0f;
        this.f33349w = 0.0f;
        this.f33350x = new Paint(1);
        this.E = new wf0(this, 0);
        this.F = new wf0(this, 1);
        this.f33351y = c6Var;
        this.d = contextThemeWrapper instanceof BubbleActivity;
        lg.p pVar = new lg.p(contextThemeWrapper);
        this.f33342b = pVar;
        pVar.setListener(new m.y0(this, 10));
        pVar.setBottomPadding(AndroidUtilities.dp(64.0f));
        addView(pVar);
        this.f33344e = new ImageReceiver(this);
        lg.f fVar = new lg.f(contextThemeWrapper);
        this.f33343c = fVar;
        fVar.setListener(new l2.g(this, 11));
        addView(fVar, w7.w5.a(-2.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 81));
    }

    public final void a() {
        lg.p pVar = this.f33342b;
        pVar.f15319b.setVisibility(4);
        CropAreaView cropAreaView = pVar.f15318a;
        cropAreaView.setDimVisibility(false);
        cropAreaView.f(false, false);
        cropAreaView.invalidate();
    }

    public final void b(Bitmap bitmap, int i10, boolean z10, boolean z11, lg.g gVar, f81 f81Var, MediaController.CropState cropState) {
        boolean z12;
        requestLayout();
        int i11 = 0;
        this.f33345f = false;
        Bitmap bitmap2 = null;
        this.f33344e.setImageBitmap((Drawable) null);
        lg.p pVar = this.f33342b;
        ImageView imageView = pVar.f15319b;
        pVar.f15327x = z10;
        pVar.d = f81Var;
        pVar.f15321e = gVar;
        pVar.K = i10;
        pVar.f15326w = bitmap;
        CropAreaView cropAreaView = pVar.f15318a;
        boolean z13 = true;
        if (f81Var != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        cropAreaView.setIsVideo(z12);
        if (bitmap == null && f81Var == null) {
            pVar.L = null;
            imageView.setImageDrawable(null);
        } else {
            int currentWidth = pVar.getCurrentWidth();
            int currentHeight = pVar.getCurrentHeight();
            lg.n nVar = pVar.L;
            if (nVar != null && z11) {
                float f7 = currentWidth;
                nVar.f15311e *= nVar.f15308a / f7;
                nVar.f15308a = f7;
                nVar.f15309b = currentHeight;
                nVar.h();
                Matrix matrix = nVar.f15316k;
                lg.p pVar2 = nVar.f15317l;
                matrix.getValues(pVar2.H);
                matrix.reset();
                float f10 = nVar.f15311e;
                matrix.postScale(f10, f10);
                float[] fArr = pVar2.H;
                matrix.postTranslate(fArr[2], fArr[5]);
                pVar2.r(false);
            } else {
                pVar.L = new lg.n(pVar, currentWidth, currentHeight);
                cropAreaView.getViewTreeObserver().addOnPreDrawListener(new lg.l(pVar, cropState, currentHeight, currentWidth));
            }
            if (f81Var == null) {
                bitmap2 = pVar.f15326w;
            }
            imageView.setImageBitmap(bitmap2);
        }
        lg.f fVar = this.f33343c;
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
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        lg.p pVar;
        boolean drawChild = super.drawChild(canvas, view, j3);
        if (this.f33345f && view == (pVar = this.f33342b)) {
            RectF actualRect = pVar.getActualRect();
            int dp = AndroidUtilities.dp(32.0f);
            org.telegram.ui.vs0 vs0Var = (org.telegram.ui.vs0) this.f33341a;
            vs0Var.getClass();
            PhotoViewer photoViewer = vs0Var.f42845a;
            float measuredWidth = (photoViewer.S7.getMeasuredWidth() - AndroidUtilities.dp(32.0f)) * photoViewer.f33908w8;
            int i10 = dp / 2;
            int dp2 = AndroidUtilities.dp(2.0f) + (((int) (measuredWidth + AndroidUtilities.dp(16.0f))) - i10);
            int measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(156.0f);
            float f7 = actualRect.left;
            float f10 = this.f33347r;
            float f11 = ((dp2 - f7) * f10) + f7;
            float f12 = actualRect.top;
            float y3 = com.google.android.gms.internal.vision.e2.y(measuredHeight, f12, f10, f12);
            float width = ((dp - actualRect.width()) * this.f33347r) + actualRect.width();
            ImageReceiver imageReceiver = this.f33344e;
            imageReceiver.setRoundRadius((int) (width / 2.0f));
            imageReceiver.setImageCoords(f11, y3, width, width);
            imageReceiver.setAlpha(this.f33346n);
            imageReceiver.draw(canvas);
            int i11 = (this.f33349w > 0.0f ? 1 : (this.f33349w == 0.0f ? 0 : -1));
            Paint paint = this.f33350x;
            if (i11 > 0) {
                paint.setColor(-1);
                paint.setAlpha((int) (this.f33349w * 255.0f));
                canvas.drawCircle(actualRect.centerX(), actualRect.centerY(), actualRect.width() / 2.0f, paint);
            }
            paint.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20972zf, this.f33351y));
            paint.setAlpha(Math.min(255, (int) (this.f33347r * 255.0f * this.f33346n)));
            canvas.drawCircle(dp2 + i10, AndroidUtilities.dp(8.0f) + measuredHeight + dp, AndroidUtilities.dp(3.0f), paint);
        }
        return drawChild;
    }

    public float getRectSizeX() {
        return this.f33342b.getCropWidth();
    }

    public float getRectSizeY() {
        return this.f33342b.getCropHeight();
    }

    public float getRectX() {
        return this.f33342b.getCropLeft() - AndroidUtilities.dp(14.0f);
    }

    public float getRectY() {
        int i10;
        float cropTop = this.f33342b.getCropTop() - AndroidUtilities.dp(14.0f);
        if (!this.d) {
            i10 = AndroidUtilities.statusBarHeight;
        } else {
            i10 = 0;
        }
        return cropTop - i10;
    }

    public Bitmap getVideoThumb() {
        if (this.f33345f && this.h) {
            return this.f33344e.getBitmap();
        }
        return null;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f33342b.invalidate();
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.h && this.f33345f) {
            if (this.f33344e.isInsideImage(motionEvent.getX(), motionEvent.getY())) {
                if (motionEvent.getAction() == 1) {
                    ((org.telegram.ui.vs0) this.f33341a).f();
                }
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        lg.n nVar;
        super.onLayout(z10, i10, i11, i12, i13);
        lg.p pVar = this.f33342b;
        CropAreaView cropAreaView = pVar.f15318a;
        float cropWidth = cropAreaView.getCropWidth();
        if (cropWidth != 0.0f && (nVar = pVar.L) != null) {
            cropAreaView.a(pVar.h, nVar.f15308a / nVar.f15309b);
            cropAreaView.setActualRect(cropAreaView.getAspectRatio());
            cropAreaView.d(pVar.f15322f);
            lg.n.g(pVar.L, cropAreaView.getCropWidth() / cropWidth, 0.0f, 0.0f);
            pVar.r(false);
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.h && this.f33345f) {
            if (this.f33344e.isInsideImage(motionEvent.getX(), motionEvent.getY())) {
                if (motionEvent.getAction() == 1) {
                    ((org.telegram.ui.vs0) this.f33341a).f();
                }
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setAspectRatio(float f7) {
        this.f33342b.setAspectRatio(f7);
    }

    public void setDelegate(yf0 yf0Var) {
        this.f33341a = yf0Var;
    }

    public void setFreeform(boolean z10) {
        this.f33342b.setFreeform(z10);
    }

    public void setSubtitle(String str) {
        this.f33342b.setSubtitle(str);
    }

    public void setVideoThumbFlashAlpha(float f7) {
        this.f33349w = f7;
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
        this.v.addListener(new xf0(this, 1));
        this.v.start();
    }
}
