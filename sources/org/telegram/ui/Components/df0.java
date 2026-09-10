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
public final class df0 extends FrameLayout {
    public final af0 E;
    public final af0 F;
    public cf0 f22404a;
    public final kg.p f22405b;
    public final kg.f f22406c;
    public final boolean d;
    public final ImageReceiver e;
    public boolean f22407f;
    public boolean h;
    public float f22408n;
    public float f22409r;
    public AnimatorSet f22410s;
    public AnimatorSet v;
    public float f22411w;
    public final Paint f22412x;
    public final org.telegram.ui.ActionBar.f6 f22413y;

    public df0(ContextThemeWrapper contextThemeWrapper, org.telegram.ui.ActionBar.f6 f6Var) {
        super(contextThemeWrapper);
        this.h = true;
        this.f22409r = 1.0f;
        this.f22411w = 0.0f;
        this.f22412x = new Paint(1);
        this.E = new af0(this, 0);
        this.F = new af0(this, 1);
        this.f22413y = f6Var;
        this.d = contextThemeWrapper instanceof BubbleActivity;
        kg.p pVar = new kg.p(contextThemeWrapper);
        this.f22405b = pVar;
        pVar.setListener(new m.g3(this, 8));
        pVar.setBottomPadding(AndroidUtilities.dp(64.0f));
        addView(pVar);
        this.e = new ImageReceiver(this);
        kg.f fVar = new kg.f(contextThemeWrapper);
        this.f22406c = fVar;
        fVar.setListener(new o0.b(this));
        addView(fVar, w7.a6.d(-1, -2.0f, 81, 0.0f, 0.0f, 0.0f, 0.0f));
    }

    public final void a() {
        kg.p pVar = this.f22405b;
        pVar.f12496b.setVisibility(4);
        CropAreaView cropAreaView = pVar.f12495a;
        cropAreaView.setDimVisibility(false);
        cropAreaView.f(false, false);
        cropAreaView.invalidate();
    }

    public final void b(Bitmap bitmap, int i10, boolean z10, boolean z11, kg.g gVar, h71 h71Var, MediaController.CropState cropState) {
        boolean z12;
        requestLayout();
        int i11 = 0;
        this.f22407f = false;
        Bitmap bitmap2 = null;
        this.e.setImageBitmap((Drawable) null);
        kg.p pVar = this.f22405b;
        ImageView imageView = pVar.f12496b;
        pVar.f12503x = z10;
        pVar.d = h71Var;
        pVar.e = gVar;
        pVar.K = i10;
        pVar.f12502w = bitmap;
        CropAreaView cropAreaView = pVar.f12495a;
        boolean z13 = true;
        if (h71Var != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        cropAreaView.setIsVideo(z12);
        if (bitmap == null && h71Var == null) {
            pVar.L = null;
            imageView.setImageDrawable(null);
        } else {
            int currentWidth = pVar.getCurrentWidth();
            int currentHeight = pVar.getCurrentHeight();
            kg.n nVar = pVar.L;
            if (nVar != null && z11) {
                float f7 = currentWidth;
                nVar.e *= nVar.f12486a / f7;
                nVar.f12486a = f7;
                nVar.f12487b = currentHeight;
                nVar.h();
                Matrix matrix = nVar.f12493k;
                kg.p pVar2 = nVar.f12494l;
                matrix.getValues(pVar2.H);
                matrix.reset();
                float f10 = nVar.e;
                matrix.postScale(f10, f10);
                float[] fArr = pVar2.H;
                matrix.postTranslate(fArr[2], fArr[5]);
                pVar2.r(false);
            } else {
                pVar.L = new kg.n(pVar, currentWidth, currentHeight);
                cropAreaView.getViewTreeObserver().addOnPreDrawListener(new kg.l(pVar, cropState, currentHeight, currentWidth));
            }
            if (h71Var == null) {
                bitmap2 = pVar.f12502w;
            }
            imageView.setImageBitmap(bitmap2);
        }
        kg.f fVar = this.f22406c;
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
        kg.p pVar;
        boolean drawChild = super.drawChild(canvas, view, j3);
        if (this.f22407f && view == (pVar = this.f22405b)) {
            RectF actualRect = pVar.getActualRect();
            int dp = AndroidUtilities.dp(32.0f);
            org.telegram.ui.ss0 ss0Var = (org.telegram.ui.ss0) this.f22404a;
            ss0Var.getClass();
            PhotoViewer photoViewer = ss0Var.f36749a;
            float measuredWidth = (photoViewer.R7.getMeasuredWidth() - AndroidUtilities.dp(32.0f)) * photoViewer.f30206v8;
            int i10 = dp / 2;
            int dp2 = AndroidUtilities.dp(2.0f) + (((int) (measuredWidth + AndroidUtilities.dp(16.0f))) - i10);
            int measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(156.0f);
            float f7 = actualRect.left;
            float f10 = this.f22409r;
            float f11 = ((dp2 - f7) * f10) + f7;
            float f12 = actualRect.top;
            float z10 = com.google.android.gms.internal.vision.e2.z(measuredHeight, f12, f10, f12);
            float width = ((dp - actualRect.width()) * this.f22409r) + actualRect.width();
            ImageReceiver imageReceiver = this.e;
            imageReceiver.setRoundRadius((int) (width / 2.0f));
            imageReceiver.setImageCoords(f11, z10, width, width);
            imageReceiver.setAlpha(this.f22408n);
            imageReceiver.draw(canvas);
            float f13 = this.f22411w;
            Paint paint = this.f22412x;
            if (f13 > 0.0f) {
                paint.setColor(-1);
                paint.setAlpha((int) (this.f22411w * 255.0f));
                canvas.drawCircle(actualRect.centerX(), actualRect.centerY(), actualRect.width() / 2.0f, paint);
            }
            paint.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18334zf, this.f22413y));
            paint.setAlpha(Math.min(255, (int) (this.f22409r * 255.0f * this.f22408n)));
            canvas.drawCircle(dp2 + i10, AndroidUtilities.dp(8.0f) + measuredHeight + dp, AndroidUtilities.dp(3.0f), paint);
        }
        return drawChild;
    }

    public float getRectSizeX() {
        return this.f22405b.getCropWidth();
    }

    public float getRectSizeY() {
        return this.f22405b.getCropHeight();
    }

    public float getRectX() {
        return this.f22405b.getCropLeft() - AndroidUtilities.dp(14.0f);
    }

    public float getRectY() {
        int i10;
        float cropTop = this.f22405b.getCropTop() - AndroidUtilities.dp(14.0f);
        if (!this.d) {
            i10 = AndroidUtilities.statusBarHeight;
        } else {
            i10 = 0;
        }
        return cropTop - i10;
    }

    public Bitmap getVideoThumb() {
        if (this.f22407f && this.h) {
            return this.e.getBitmap();
        }
        return null;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f22405b.invalidate();
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.h && this.f22407f) {
            if (this.e.isInsideImage(motionEvent.getX(), motionEvent.getY())) {
                if (motionEvent.getAction() == 1) {
                    ((org.telegram.ui.ss0) this.f22404a).f();
                }
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        kg.n nVar;
        super.onLayout(z10, i10, i11, i12, i13);
        kg.p pVar = this.f22405b;
        CropAreaView cropAreaView = pVar.f12495a;
        float cropWidth = cropAreaView.getCropWidth();
        if (cropWidth != 0.0f && (nVar = pVar.L) != null) {
            cropAreaView.a(pVar.h, nVar.f12486a / nVar.f12487b);
            cropAreaView.setActualRect(cropAreaView.getAspectRatio());
            cropAreaView.d(pVar.f12498f);
            kg.n.g(pVar.L, cropAreaView.getCropWidth() / cropWidth, 0.0f, 0.0f);
            pVar.r(false);
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.h && this.f22407f) {
            if (this.e.isInsideImage(motionEvent.getX(), motionEvent.getY())) {
                if (motionEvent.getAction() == 1) {
                    ((org.telegram.ui.ss0) this.f22404a).f();
                }
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setAspectRatio(float f7) {
        this.f22405b.setAspectRatio(f7);
    }

    public void setDelegate(cf0 cf0Var) {
        this.f22404a = cf0Var;
    }

    public void setFreeform(boolean z10) {
        this.f22405b.setFreeform(z10);
    }

    public void setSubtitle(String str) {
        this.f22405b.setSubtitle(str);
    }

    public void setVideoThumbFlashAlpha(float f7) {
        this.f22411w = f7;
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
        this.v.addListener(new bf0(this, 1));
        this.v.start();
    }
}
