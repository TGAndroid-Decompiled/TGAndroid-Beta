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
public final class ef0 extends FrameLayout {
    public final bf0 E;
    public final bf0 F;
    public df0 f24053a;
    public final lg.p f24054b;
    public final lg.f f24055c;
    public final boolean d;
    public final ImageReceiver e;
    public boolean f24056f;
    public boolean h;
    public float f24057n;
    public float f24058r;
    public AnimatorSet f24059s;
    public AnimatorSet v;
    public float f24060w;
    public final Paint f24061x;
    public final org.telegram.ui.ActionBar.e6 f24062y;

    public ef0(ContextThemeWrapper contextThemeWrapper, org.telegram.ui.ActionBar.e6 e6Var) {
        super(contextThemeWrapper);
        this.h = true;
        this.f24058r = 1.0f;
        this.f24060w = 0.0f;
        this.f24061x = new Paint(1);
        this.E = new bf0(this, 0);
        this.F = new bf0(this, 1);
        this.f24062y = e6Var;
        this.d = contextThemeWrapper instanceof BubbleActivity;
        lg.p pVar = new lg.p(contextThemeWrapper);
        this.f24054b = pVar;
        pVar.setListener(new k2.u(this));
        pVar.setBottomPadding(AndroidUtilities.dp(64.0f));
        addView(pVar);
        this.e = new ImageReceiver(this);
        lg.f fVar = new lg.f(contextThemeWrapper);
        this.f24055c = fVar;
        fVar.setListener(new ci.h0(2, this));
        addView(fVar, w7.y5.d(-1, -2.0f, 81, 0.0f, 0.0f, 0.0f, 0.0f));
    }

    public final void a() {
        lg.p pVar = this.f24054b;
        pVar.f14326b.setVisibility(4);
        CropAreaView cropAreaView = pVar.f14325a;
        cropAreaView.setDimVisibility(false);
        cropAreaView.f(false, false);
        cropAreaView.invalidate();
    }

    public final void b(Bitmap bitmap, int i10, boolean z10, boolean z11, lg.g gVar, k71 k71Var, MediaController.CropState cropState) {
        boolean z12;
        requestLayout();
        int i11 = 0;
        this.f24056f = false;
        Bitmap bitmap2 = null;
        this.e.setImageBitmap((Drawable) null);
        lg.p pVar = this.f24054b;
        ImageView imageView = pVar.f14326b;
        pVar.f14333x = z10;
        pVar.d = k71Var;
        pVar.e = gVar;
        pVar.K = i10;
        pVar.f14332w = bitmap;
        CropAreaView cropAreaView = pVar.f14325a;
        boolean z13 = true;
        if (k71Var != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        cropAreaView.setIsVideo(z12);
        if (bitmap == null && k71Var == null) {
            pVar.L = null;
            imageView.setImageDrawable(null);
        } else {
            int currentWidth = pVar.getCurrentWidth();
            int currentHeight = pVar.getCurrentHeight();
            lg.n nVar = pVar.L;
            if (nVar != null && z11) {
                float f7 = currentWidth;
                nVar.e *= nVar.f14316a / f7;
                nVar.f14316a = f7;
                nVar.f14317b = currentHeight;
                nVar.h();
                Matrix matrix = nVar.f14323k;
                lg.p pVar2 = nVar.f14324l;
                matrix.getValues(pVar2.H);
                matrix.reset();
                float f10 = nVar.e;
                matrix.postScale(f10, f10);
                float[] fArr = pVar2.H;
                matrix.postTranslate(fArr[2], fArr[5]);
                pVar2.r(false);
            } else {
                pVar.L = new lg.n(pVar, currentWidth, currentHeight);
                cropAreaView.getViewTreeObserver().addOnPreDrawListener(new lg.l(pVar, cropState, currentHeight, currentWidth));
            }
            if (k71Var == null) {
                bitmap2 = pVar.f14332w;
            }
            imageView.setImageBitmap(bitmap2);
        }
        lg.f fVar = this.f24055c;
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
        if (this.f24056f && view == (pVar = this.f24054b)) {
            RectF actualRect = pVar.getActualRect();
            int dp = AndroidUtilities.dp(32.0f);
            org.telegram.ui.os0 os0Var = (org.telegram.ui.os0) this.f24053a;
            os0Var.getClass();
            PhotoViewer photoViewer = os0Var.f36249a;
            float measuredWidth = (photoViewer.S7.getMeasuredWidth() - AndroidUtilities.dp(32.0f)) * photoViewer.f31392w8;
            int i10 = dp / 2;
            int dp2 = AndroidUtilities.dp(2.0f) + (((int) (measuredWidth + AndroidUtilities.dp(16.0f))) - i10);
            int measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(156.0f);
            float f7 = actualRect.left;
            float f10 = this.f24058r;
            float f11 = ((dp2 - f7) * f10) + f7;
            float f12 = actualRect.top;
            float z10 = com.google.android.gms.internal.vision.e2.z(measuredHeight, f12, f10, f12);
            float width = ((dp - actualRect.width()) * this.f24058r) + actualRect.width();
            ImageReceiver imageReceiver = this.e;
            imageReceiver.setRoundRadius((int) (width / 2.0f));
            imageReceiver.setImageCoords(f11, z10, width, width);
            imageReceiver.setAlpha(this.f24057n);
            imageReceiver.draw(canvas);
            float f13 = this.f24060w;
            Paint paint = this.f24061x;
            if (f13 > 0.0f) {
                paint.setColor(-1);
                paint.setAlpha((int) (this.f24060w * 255.0f));
                canvas.drawCircle(actualRect.centerX(), actualRect.centerY(), actualRect.width() / 2.0f, paint);
            }
            paint.setColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19470zf, this.f24062y));
            paint.setAlpha(Math.min(255, (int) (this.f24058r * 255.0f * this.f24057n)));
            canvas.drawCircle(dp2 + i10, AndroidUtilities.dp(8.0f) + measuredHeight + dp, AndroidUtilities.dp(3.0f), paint);
        }
        return drawChild;
    }

    public float getRectSizeX() {
        return this.f24054b.getCropWidth();
    }

    public float getRectSizeY() {
        return this.f24054b.getCropHeight();
    }

    public float getRectX() {
        return this.f24054b.getCropLeft() - AndroidUtilities.dp(14.0f);
    }

    public float getRectY() {
        int i10;
        float cropTop = this.f24054b.getCropTop() - AndroidUtilities.dp(14.0f);
        if (!this.d) {
            i10 = AndroidUtilities.statusBarHeight;
        } else {
            i10 = 0;
        }
        return cropTop - i10;
    }

    public Bitmap getVideoThumb() {
        if (this.f24056f && this.h) {
            return this.e.getBitmap();
        }
        return null;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f24054b.invalidate();
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.h && this.f24056f) {
            if (this.e.isInsideImage(motionEvent.getX(), motionEvent.getY())) {
                if (motionEvent.getAction() == 1) {
                    ((org.telegram.ui.os0) this.f24053a).f();
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
        lg.p pVar = this.f24054b;
        CropAreaView cropAreaView = pVar.f14325a;
        float cropWidth = cropAreaView.getCropWidth();
        if (cropWidth != 0.0f && (nVar = pVar.L) != null) {
            cropAreaView.a(pVar.h, nVar.f14316a / nVar.f14317b);
            cropAreaView.setActualRect(cropAreaView.getAspectRatio());
            cropAreaView.d(pVar.f14328f);
            lg.n.g(pVar.L, cropAreaView.getCropWidth() / cropWidth, 0.0f, 0.0f);
            pVar.r(false);
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.h && this.f24056f) {
            if (this.e.isInsideImage(motionEvent.getX(), motionEvent.getY())) {
                if (motionEvent.getAction() == 1) {
                    ((org.telegram.ui.os0) this.f24053a).f();
                }
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setAspectRatio(float f7) {
        this.f24054b.setAspectRatio(f7);
    }

    public void setDelegate(df0 df0Var) {
        this.f24053a = df0Var;
    }

    public void setFreeform(boolean z10) {
        this.f24054b.setFreeform(z10);
    }

    public void setSubtitle(String str) {
        this.f24054b.setSubtitle(str);
    }

    public void setVideoThumbFlashAlpha(float f7) {
        this.f24060w = f7;
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
        this.v.addListener(new cf0(this, 1));
        this.v.start();
    }
}
