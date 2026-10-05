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
    public ff0 f26904a;
    public final lg.p f26905b;
    public final lg.f f26906c;
    public final boolean d;
    public final ImageReceiver f26907e;
    public boolean f26908f;
    public boolean h;
    public float f26909n;
    public float f26910r;
    public AnimatorSet f26911s;
    public AnimatorSet v;
    public float f26912w;
    public final Paint f26913x;
    public final org.telegram.ui.ActionBar.d6 f26914y;

    public gf0(ContextThemeWrapper contextThemeWrapper, org.telegram.ui.ActionBar.d6 d6Var) {
        super(contextThemeWrapper);
        this.h = true;
        this.f26910r = 1.0f;
        this.f26912w = 0.0f;
        this.f26913x = new Paint(1);
        this.E = new df0(this, 0);
        this.F = new df0(this, 1);
        this.f26914y = d6Var;
        this.d = contextThemeWrapper instanceof BubbleActivity;
        lg.p pVar = new lg.p(contextThemeWrapper);
        this.f26905b = pVar;
        pVar.setListener(new k2.e(this, 10));
        pVar.setBottomPadding(AndroidUtilities.dp(64.0f));
        addView(pVar);
        this.f26907e = new ImageReceiver(this);
        lg.f fVar = new lg.f(contextThemeWrapper);
        this.f26906c = fVar;
        fVar.setListener(new ci.h0(2, this));
        addView(fVar, w7.z5.d(-1, -2.0f, 81, 0.0f, 0.0f, 0.0f, 0.0f));
    }

    public final void a() {
        lg.p pVar = this.f26905b;
        pVar.f15577b.setVisibility(4);
        CropAreaView cropAreaView = pVar.f15576a;
        cropAreaView.setDimVisibility(false);
        cropAreaView.f(false, false);
        cropAreaView.invalidate();
    }

    public final void b(Bitmap bitmap, int i10, boolean z10, boolean z11, lg.g gVar, u71 u71Var, MediaController.CropState cropState) {
        boolean z12;
        requestLayout();
        int i11 = 0;
        this.f26908f = false;
        Bitmap bitmap2 = null;
        this.f26907e.setImageBitmap((Drawable) null);
        lg.p pVar = this.f26905b;
        ImageView imageView = pVar.f15577b;
        pVar.f15585x = z10;
        pVar.d = u71Var;
        pVar.f15579e = gVar;
        pVar.K = i10;
        pVar.f15584w = bitmap;
        CropAreaView cropAreaView = pVar.f15576a;
        boolean z13 = true;
        if (u71Var != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        cropAreaView.setIsVideo(z12);
        if (bitmap == null && u71Var == null) {
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
            if (u71Var == null) {
                bitmap2 = pVar.f15584w;
            }
            imageView.setImageBitmap(bitmap2);
        }
        lg.f fVar = this.f26906c;
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
        if (this.f26908f && view == (pVar = this.f26905b)) {
            RectF actualRect = pVar.getActualRect();
            int dp = AndroidUtilities.dp(32.0f);
            org.telegram.ui.os0 os0Var = (org.telegram.ui.os0) this.f26904a;
            os0Var.getClass();
            PhotoViewer photoViewer = os0Var.f39287a;
            float measuredWidth = (photoViewer.S7.getMeasuredWidth() - AndroidUtilities.dp(32.0f)) * photoViewer.f34081w8;
            int i10 = dp / 2;
            int dp2 = AndroidUtilities.dp(2.0f) + (((int) (measuredWidth + AndroidUtilities.dp(16.0f))) - i10);
            int measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(156.0f);
            float f7 = actualRect.left;
            float f10 = this.f26910r;
            float f11 = ((dp2 - f7) * f10) + f7;
            float f12 = actualRect.top;
            float z10 = com.google.android.gms.internal.vision.e2.z(measuredHeight, f12, f10, f12);
            float width = ((dp - actualRect.width()) * this.f26910r) + actualRect.width();
            ImageReceiver imageReceiver = this.f26907e;
            imageReceiver.setRoundRadius((int) (width / 2.0f));
            imageReceiver.setImageCoords(f11, z10, width, width);
            imageReceiver.setAlpha(this.f26909n);
            imageReceiver.draw(canvas);
            float f13 = this.f26912w;
            Paint paint = this.f26913x;
            if (f13 > 0.0f) {
                paint.setColor(-1);
                paint.setAlpha((int) (this.f26912w * 255.0f));
                canvas.drawCircle(actualRect.centerX(), actualRect.centerY(), actualRect.width() / 2.0f, paint);
            }
            paint.setColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f21242zf, this.f26914y));
            paint.setAlpha(Math.min(255, (int) (this.f26910r * 255.0f * this.f26909n)));
            canvas.drawCircle(dp2 + i10, AndroidUtilities.dp(8.0f) + measuredHeight + dp, AndroidUtilities.dp(3.0f), paint);
        }
        return drawChild;
    }

    public float getRectSizeX() {
        return this.f26905b.getCropWidth();
    }

    public float getRectSizeY() {
        return this.f26905b.getCropHeight();
    }

    public float getRectX() {
        return this.f26905b.getCropLeft() - AndroidUtilities.dp(14.0f);
    }

    public float getRectY() {
        int i10;
        float cropTop = this.f26905b.getCropTop() - AndroidUtilities.dp(14.0f);
        if (!this.d) {
            i10 = AndroidUtilities.statusBarHeight;
        } else {
            i10 = 0;
        }
        return cropTop - i10;
    }

    public Bitmap getVideoThumb() {
        if (this.f26908f && this.h) {
            return this.f26907e.getBitmap();
        }
        return null;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f26905b.invalidate();
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.h && this.f26908f) {
            if (this.f26907e.isInsideImage(motionEvent.getX(), motionEvent.getY())) {
                if (motionEvent.getAction() == 1) {
                    ((org.telegram.ui.os0) this.f26904a).f();
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
        lg.p pVar = this.f26905b;
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
        if (this.h && this.f26908f) {
            if (this.f26907e.isInsideImage(motionEvent.getX(), motionEvent.getY())) {
                if (motionEvent.getAction() == 1) {
                    ((org.telegram.ui.os0) this.f26904a).f();
                }
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setAspectRatio(float f7) {
        this.f26905b.setAspectRatio(f7);
    }

    public void setDelegate(ff0 ff0Var) {
        this.f26904a = ff0Var;
    }

    public void setFreeform(boolean z10) {
        this.f26905b.setFreeform(z10);
    }

    public void setSubtitle(String str) {
        this.f26905b.setSubtitle(str);
    }

    public void setVideoThumbFlashAlpha(float f7) {
        this.f26912w = f7;
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
