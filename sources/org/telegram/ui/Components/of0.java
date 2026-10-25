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
public final class of0 extends FrameLayout {
    public final lf0 E;
    public final lf0 F;
    public nf0 f31282a;
    public final ng.p f31283b;
    public final ng.f f31284c;
    public final boolean d;
    public final ImageReceiver e;
    public boolean f31285f;
    public boolean h;
    public float f31286n;
    public float f31287r;
    public AnimatorSet f31288s;
    public AnimatorSet v;
    public float f31289w;
    public final Paint f31290x;
    public final org.telegram.ui.ActionBar.u6 f31291y;

    public of0(ContextThemeWrapper contextThemeWrapper, org.telegram.ui.ActionBar.u6 u6Var) {
        super(contextThemeWrapper);
        this.h = true;
        this.f31287r = 1.0f;
        this.f31289w = 0.0f;
        this.f31290x = new Paint(1);
        this.E = new lf0(this, 0);
        this.F = new lf0(this, 1);
        this.f31291y = u6Var;
        this.d = contextThemeWrapper instanceof BubbleActivity;
        ng.p pVar = new ng.p(contextThemeWrapper);
        this.f31283b = pVar;
        pVar.setListener(new li.h5(this));
        pVar.setBottomPadding(AndroidUtilities.dp(64.0f));
        addView(pVar);
        this.e = new ImageReceiver(this);
        ng.f fVar = new ng.f(contextThemeWrapper);
        this.f31284c = fVar;
        fVar.setListener(new fi.h0(2, this));
        addView(fVar, gb1.h(-1, -2.0f, 81, 0.0f, 0.0f, 0.0f, 0.0f));
    }

    public final void a() {
        ng.p pVar = this.f31283b;
        pVar.f18844b.setVisibility(4);
        CropAreaView cropAreaView = pVar.f18843a;
        cropAreaView.setDimVisibility(false);
        cropAreaView.f(false, false);
        cropAreaView.invalidate();
    }

    public final void b(Bitmap bitmap, int i10, boolean z10, boolean z11, ng.g gVar, h81 h81Var, MediaController.CropState cropState) {
        boolean z12;
        requestLayout();
        int i11 = 0;
        this.f31285f = false;
        Bitmap bitmap2 = null;
        this.e.setImageBitmap((Drawable) null);
        ng.p pVar = this.f31283b;
        ImageView imageView = pVar.f18844b;
        pVar.f18851x = z10;
        pVar.d = h81Var;
        pVar.e = gVar;
        pVar.K = i10;
        pVar.f18850w = bitmap;
        CropAreaView cropAreaView = pVar.f18843a;
        boolean z13 = true;
        if (h81Var != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        cropAreaView.setIsVideo(z12);
        if (bitmap == null && h81Var == null) {
            pVar.L = null;
            imageView.setImageDrawable(null);
        } else {
            int currentWidth = pVar.getCurrentWidth();
            int currentHeight = pVar.getCurrentHeight();
            ng.n nVar = pVar.L;
            if (nVar != null && z11) {
                float f7 = currentWidth;
                nVar.e *= nVar.f18834a / f7;
                nVar.f18834a = f7;
                nVar.f18835b = currentHeight;
                nVar.h();
                Matrix matrix = nVar.f18841k;
                ng.p pVar2 = nVar.f18842l;
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
            if (h81Var == null) {
                bitmap2 = pVar.f18850w;
            }
            imageView.setImageBitmap(bitmap2);
        }
        ng.f fVar = this.f31284c;
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
        if (this.f31285f && view == (pVar = this.f31283b)) {
            RectF actualRect = pVar.getActualRect();
            int dp = AndroidUtilities.dp(32.0f);
            org.telegram.ui.gs0 gs0Var = (org.telegram.ui.gs0) this.f31282a;
            gs0Var.getClass();
            PhotoViewer photoViewer = gs0Var.f39774a;
            float measuredWidth = (photoViewer.S7.getMeasuredWidth() - AndroidUtilities.dp(32.0f)) * photoViewer.f35811w8;
            int i10 = dp / 2;
            int dp2 = AndroidUtilities.dp(2.0f) + (((int) (measuredWidth + AndroidUtilities.dp(16.0f))) - i10);
            int measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(156.0f);
            float f7 = actualRect.left;
            float f10 = this.f31287r;
            float f11 = ((dp2 - f7) * f10) + f7;
            float f12 = actualRect.top;
            float z10 = c3.h0.z(measuredHeight, f12, f10, f12);
            float width = ((dp - actualRect.width()) * this.f31287r) + actualRect.width();
            ImageReceiver imageReceiver = this.e;
            imageReceiver.setRoundRadius((int) (width / 2.0f));
            imageReceiver.setImageCoords(f11, z10, width, width);
            imageReceiver.setAlpha(this.f31286n);
            imageReceiver.draw(canvas);
            int i11 = (this.f31289w > 0.0f ? 1 : (this.f31289w == 0.0f ? 0 : -1));
            Paint paint = this.f31290x;
            if (i11 > 0) {
                paint.setColor(-1);
                paint.setAlpha((int) (this.f31289w * 255.0f));
                canvas.drawCircle(actualRect.centerX(), actualRect.centerY(), actualRect.width() / 2.0f, paint);
            }
            paint.setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.zf, this.f31291y));
            paint.setAlpha(Math.min(255, (int) (this.f31287r * 255.0f * this.f31286n)));
            canvas.drawCircle(dp2 + i10, AndroidUtilities.dp(8.0f) + measuredHeight + dp, AndroidUtilities.dp(3.0f), paint);
        }
        return drawChild;
    }

    public float getRectSizeX() {
        return this.f31283b.getCropWidth();
    }

    public float getRectSizeY() {
        return this.f31283b.getCropHeight();
    }

    public float getRectX() {
        return this.f31283b.getCropLeft() - AndroidUtilities.dp(14.0f);
    }

    public float getRectY() {
        int i10;
        float cropTop = this.f31283b.getCropTop() - AndroidUtilities.dp(14.0f);
        if (!this.d) {
            i10 = AndroidUtilities.statusBarHeight;
        } else {
            i10 = 0;
        }
        return cropTop - i10;
    }

    public Bitmap getVideoThumb() {
        if (this.f31285f && this.h) {
            return this.e.getBitmap();
        }
        return null;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f31283b.invalidate();
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.h && this.f31285f) {
            if (this.e.isInsideImage(motionEvent.getX(), motionEvent.getY())) {
                if (motionEvent.getAction() == 1) {
                    ((org.telegram.ui.gs0) this.f31282a).e();
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
        ng.p pVar = this.f31283b;
        CropAreaView cropAreaView = pVar.f18843a;
        float cropWidth = cropAreaView.getCropWidth();
        if (cropWidth != 0.0f && (nVar = pVar.L) != null) {
            cropAreaView.a(pVar.h, nVar.f18834a / nVar.f18835b);
            cropAreaView.setActualRect(cropAreaView.getAspectRatio());
            cropAreaView.d(pVar.f18846f);
            ng.n.g(pVar.L, cropAreaView.getCropWidth() / cropWidth, 0.0f, 0.0f);
            pVar.r(false);
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.h && this.f31285f) {
            if (this.e.isInsideImage(motionEvent.getX(), motionEvent.getY())) {
                if (motionEvent.getAction() == 1) {
                    ((org.telegram.ui.gs0) this.f31282a).e();
                }
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setAspectRatio(float f7) {
        this.f31283b.setAspectRatio(f7);
    }

    public void setDelegate(nf0 nf0Var) {
        this.f31282a = nf0Var;
    }

    public void setFreeform(boolean z10) {
        this.f31283b.setFreeform(z10);
    }

    public void setSubtitle(String str) {
        this.f31283b.setSubtitle(str);
    }

    public void setVideoThumbFlashAlpha(float f7) {
        this.f31289w = f7;
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
        this.v.addListener(new mf0(this, 1));
        this.v.start();
    }
}
