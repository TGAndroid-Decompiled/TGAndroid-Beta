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
public final class gf0 extends FrameLayout {
    public final df0 E;
    public final df0 F;
    public ff0 f26855a;
    public final lg.p f26856b;
    public final lg.f f26857c;
    public final boolean d;
    public final ImageReceiver f26858e;
    public boolean f26859f;
    public boolean h;
    public float f26860n;
    public float f26861r;
    public AnimatorSet f26862s;
    public AnimatorSet v;
    public float f26863w;
    public final Paint f26864x;
    public final org.telegram.ui.ActionBar.d6 f26865y;

    public gf0(ContextThemeWrapper contextThemeWrapper, org.telegram.ui.ActionBar.d6 d6Var) {
        super(contextThemeWrapper);
        this.h = true;
        this.f26861r = 1.0f;
        this.f26863w = 0.0f;
        this.f26864x = new Paint(1);
        this.E = new df0(this, 0);
        this.F = new df0(this, 1);
        this.f26865y = d6Var;
        this.d = contextThemeWrapper instanceof BubbleActivity;
        lg.p pVar = new lg.p(contextThemeWrapper);
        this.f26856b = pVar;
        pVar.setListener(new k2.e(this, 10));
        pVar.setBottomPadding(AndroidUtilities.dp(64.0f));
        addView(pVar);
        this.f26858e = new ImageReceiver(this);
        lg.f fVar = new lg.f(contextThemeWrapper);
        this.f26857c = fVar;
        fVar.setListener(new ci.h0(2, this));
        addView(fVar, w7.z5.d(-1, -2.0f, 81, 0.0f, 0.0f, 0.0f, 0.0f));
    }

    public final void a() {
        lg.p pVar = this.f26856b;
        pVar.f15577b.setVisibility(4);
        CropAreaView cropAreaView = pVar.f15576a;
        cropAreaView.setDimVisibility(false);
        cropAreaView.f(false, false);
        cropAreaView.invalidate();
    }

    public final void b(Bitmap bitmap, int i10, boolean z10, boolean z11, lg.g gVar, t71 t71Var, MediaController.CropState cropState) {
        boolean z12;
        requestLayout();
        int i11 = 0;
        this.f26859f = false;
        Bitmap bitmap2 = null;
        this.f26858e.setImageBitmap((Drawable) null);
        lg.p pVar = this.f26856b;
        ImageView imageView = pVar.f15577b;
        pVar.f15585x = z10;
        pVar.d = t71Var;
        pVar.f15579e = gVar;
        pVar.K = i10;
        pVar.f15584w = bitmap;
        CropAreaView cropAreaView = pVar.f15576a;
        boolean z13 = true;
        if (t71Var != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        cropAreaView.setIsVideo(z12);
        if (bitmap == null && t71Var == null) {
            pVar.L = null;
            imageView.setImageDrawable(null);
        } else {
            int currentWidth = pVar.getCurrentWidth();
            int currentHeight = pVar.getCurrentHeight();
            lg.n nVar = pVar.L;
            if (nVar != null && z11) {
                float f7 = currentWidth;
                nVar.f15569e *= nVar.f15566a / f7;
                nVar.f15566a = f7;
                nVar.f15567b = currentHeight;
                nVar.h();
                Matrix matrix = nVar.f15574k;
                lg.p pVar2 = nVar.f15575l;
                matrix.getValues(pVar2.H);
                matrix.reset();
                float f10 = nVar.f15569e;
                matrix.postScale(f10, f10);
                float[] fArr = pVar2.H;
                matrix.postTranslate(fArr[2], fArr[5]);
                pVar2.r(false);
            } else {
                pVar.L = new lg.n(pVar, currentWidth, currentHeight);
                cropAreaView.getViewTreeObserver().addOnPreDrawListener(new lg.l(pVar, cropState, currentHeight, currentWidth));
            }
            if (t71Var == null) {
                bitmap2 = pVar.f15584w;
            }
            imageView.setImageBitmap(bitmap2);
        }
        lg.f fVar = this.f26857c;
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
        if (this.f26859f && view == (pVar = this.f26856b)) {
            RectF actualRect = pVar.getActualRect();
            int dp = AndroidUtilities.dp(32.0f);
            org.telegram.ui.os0 os0Var = (org.telegram.ui.os0) this.f26855a;
            os0Var.getClass();
            PhotoViewer photoViewer = os0Var.f39277a;
            float measuredWidth = (photoViewer.S7.getMeasuredWidth() - AndroidUtilities.dp(32.0f)) * photoViewer.f34068w8;
            int i10 = dp / 2;
            int dp2 = AndroidUtilities.dp(2.0f) + (((int) (measuredWidth + AndroidUtilities.dp(16.0f))) - i10);
            int measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(156.0f);
            float f7 = actualRect.left;
            float f10 = this.f26861r;
            float f11 = ((dp2 - f7) * f10) + f7;
            float f12 = actualRect.top;
            float z10 = com.google.android.gms.internal.vision.e2.z(measuredHeight, f12, f10, f12);
            float width = ((dp - actualRect.width()) * this.f26861r) + actualRect.width();
            ImageReceiver imageReceiver = this.f26858e;
            imageReceiver.setRoundRadius((int) (width / 2.0f));
            imageReceiver.setImageCoords(f11, z10, width, width);
            imageReceiver.setAlpha(this.f26860n);
            imageReceiver.draw(canvas);
            float f13 = this.f26863w;
            Paint paint = this.f26864x;
            if (f13 > 0.0f) {
                paint.setColor(-1);
                paint.setAlpha((int) (this.f26863w * 255.0f));
                canvas.drawCircle(actualRect.centerX(), actualRect.centerY(), actualRect.width() / 2.0f, paint);
            }
            paint.setColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f21237zf, this.f26865y));
            paint.setAlpha(Math.min(255, (int) (this.f26861r * 255.0f * this.f26860n)));
            canvas.drawCircle(dp2 + i10, AndroidUtilities.dp(8.0f) + measuredHeight + dp, AndroidUtilities.dp(3.0f), paint);
        }
        return drawChild;
    }

    public float getRectSizeX() {
        return this.f26856b.getCropWidth();
    }

    public float getRectSizeY() {
        return this.f26856b.getCropHeight();
    }

    public float getRectX() {
        return this.f26856b.getCropLeft() - AndroidUtilities.dp(14.0f);
    }

    public float getRectY() {
        int i10;
        float cropTop = this.f26856b.getCropTop() - AndroidUtilities.dp(14.0f);
        if (!this.d) {
            i10 = AndroidUtilities.statusBarHeight;
        } else {
            i10 = 0;
        }
        return cropTop - i10;
    }

    public Bitmap getVideoThumb() {
        if (this.f26859f && this.h) {
            return this.f26858e.getBitmap();
        }
        return null;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f26856b.invalidate();
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.h && this.f26859f) {
            if (this.f26858e.isInsideImage(motionEvent.getX(), motionEvent.getY())) {
                if (motionEvent.getAction() == 1) {
                    ((org.telegram.ui.os0) this.f26855a).f();
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
        lg.p pVar = this.f26856b;
        CropAreaView cropAreaView = pVar.f15576a;
        float cropWidth = cropAreaView.getCropWidth();
        if (cropWidth != 0.0f && (nVar = pVar.L) != null) {
            cropAreaView.a(pVar.h, nVar.f15566a / nVar.f15567b);
            cropAreaView.setActualRect(cropAreaView.getAspectRatio());
            cropAreaView.d(pVar.f15580f);
            lg.n.g(pVar.L, cropAreaView.getCropWidth() / cropWidth, 0.0f, 0.0f);
            pVar.r(false);
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.h && this.f26859f) {
            if (this.f26858e.isInsideImage(motionEvent.getX(), motionEvent.getY())) {
                if (motionEvent.getAction() == 1) {
                    ((org.telegram.ui.os0) this.f26855a).f();
                }
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setAspectRatio(float f7) {
        this.f26856b.setAspectRatio(f7);
    }

    public void setDelegate(ff0 ff0Var) {
        this.f26855a = ff0Var;
    }

    public void setFreeform(boolean z10) {
        this.f26856b.setFreeform(z10);
    }

    public void setSubtitle(String str) {
        this.f26856b.setSubtitle(str);
    }

    public void setVideoThumbFlashAlpha(float f7) {
        this.f26863w = f7;
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
        this.v.addListener(new ef0(this, 1));
        this.v.start();
    }
}
