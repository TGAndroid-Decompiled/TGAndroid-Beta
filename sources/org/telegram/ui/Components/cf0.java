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
public final class cf0 extends FrameLayout {
    public final ze0 E;
    public final ze0 F;
    public bf0 f23277a;
    public final lg.p f23278b;
    public final lg.f f23279c;
    public final boolean d;
    public final ImageReceiver e;
    public boolean f23280f;
    public boolean h;
    public float f23281n;
    public float f23282r;
    public AnimatorSet f23283s;
    public AnimatorSet v;
    public float f23284w;
    public final Paint f23285x;
    public final org.telegram.ui.ActionBar.f6 f23286y;

    public cf0(ContextThemeWrapper contextThemeWrapper, org.telegram.ui.ActionBar.f6 f6Var) {
        super(contextThemeWrapper);
        this.h = true;
        this.f23282r = 1.0f;
        this.f23284w = 0.0f;
        this.f23285x = new Paint(1);
        this.E = new ze0(this, 0);
        this.F = new ze0(this, 1);
        this.f23286y = f6Var;
        this.d = contextThemeWrapper instanceof BubbleActivity;
        lg.p pVar = new lg.p(contextThemeWrapper);
        this.f23278b = pVar;
        pVar.setListener(new n2.e(this, 8));
        pVar.setBottomPadding(AndroidUtilities.dp(64.0f));
        addView(pVar);
        this.e = new ImageReceiver(this);
        lg.f fVar = new lg.f(contextThemeWrapper);
        this.f23279c = fVar;
        fVar.setListener(new ci.h0(2, this));
        addView(fVar, w7.y5.d(-1, -2.0f, 81, 0.0f, 0.0f, 0.0f, 0.0f));
    }

    public final void a() {
        lg.p pVar = this.f23278b;
        pVar.f14293b.setVisibility(4);
        CropAreaView cropAreaView = pVar.f14292a;
        cropAreaView.setDimVisibility(false);
        cropAreaView.f(false, false);
        cropAreaView.invalidate();
    }

    public final void b(Bitmap bitmap, int i10, boolean z10, boolean z11, lg.g gVar, i71 i71Var, MediaController.CropState cropState) {
        boolean z12;
        requestLayout();
        int i11 = 0;
        this.f23280f = false;
        Bitmap bitmap2 = null;
        this.e.setImageBitmap((Drawable) null);
        lg.p pVar = this.f23278b;
        ImageView imageView = pVar.f14293b;
        pVar.f14300x = z10;
        pVar.d = i71Var;
        pVar.e = gVar;
        pVar.K = i10;
        pVar.f14299w = bitmap;
        CropAreaView cropAreaView = pVar.f14292a;
        boolean z13 = true;
        if (i71Var != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        cropAreaView.setIsVideo(z12);
        if (bitmap == null && i71Var == null) {
            pVar.L = null;
            imageView.setImageDrawable(null);
        } else {
            int currentWidth = pVar.getCurrentWidth();
            int currentHeight = pVar.getCurrentHeight();
            lg.n nVar = pVar.L;
            if (nVar != null && z11) {
                float f7 = currentWidth;
                nVar.e *= nVar.f14283a / f7;
                nVar.f14283a = f7;
                nVar.f14284b = currentHeight;
                nVar.h();
                Matrix matrix = nVar.f14290k;
                lg.p pVar2 = nVar.f14291l;
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
            if (i71Var == null) {
                bitmap2 = pVar.f14299w;
            }
            imageView.setImageBitmap(bitmap2);
        }
        lg.f fVar = this.f23279c;
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
        if (this.f23280f && view == (pVar = this.f23278b)) {
            RectF actualRect = pVar.getActualRect();
            int dp = AndroidUtilities.dp(32.0f);
            org.telegram.ui.ts0 ts0Var = (org.telegram.ui.ts0) this.f23277a;
            ts0Var.getClass();
            PhotoViewer photoViewer = ts0Var.f37876a;
            float measuredWidth = (photoViewer.S7.getMeasuredWidth() - AndroidUtilities.dp(32.0f)) * photoViewer.f31388w8;
            int i10 = dp / 2;
            int dp2 = AndroidUtilities.dp(2.0f) + (((int) (measuredWidth + AndroidUtilities.dp(16.0f))) - i10);
            int measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(156.0f);
            float f7 = actualRect.left;
            float f10 = this.f23282r;
            float f11 = ((dp2 - f7) * f10) + f7;
            float f12 = actualRect.top;
            float z10 = com.google.android.gms.internal.vision.e2.z(measuredHeight, f12, f10, f12);
            float width = ((dp - actualRect.width()) * this.f23282r) + actualRect.width();
            ImageReceiver imageReceiver = this.e;
            imageReceiver.setRoundRadius((int) (width / 2.0f));
            imageReceiver.setImageCoords(f11, z10, width, width);
            imageReceiver.setAlpha(this.f23281n);
            imageReceiver.draw(canvas);
            float f13 = this.f23284w;
            Paint paint = this.f23285x;
            if (f13 > 0.0f) {
                paint.setColor(-1);
                paint.setAlpha((int) (this.f23284w * 255.0f));
                canvas.drawCircle(actualRect.centerX(), actualRect.centerY(), actualRect.width() / 2.0f, paint);
            }
            paint.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19505zf, this.f23286y));
            paint.setAlpha(Math.min(255, (int) (this.f23282r * 255.0f * this.f23281n)));
            canvas.drawCircle(dp2 + i10, AndroidUtilities.dp(8.0f) + measuredHeight + dp, AndroidUtilities.dp(3.0f), paint);
        }
        return drawChild;
    }

    public float getRectSizeX() {
        return this.f23278b.getCropWidth();
    }

    public float getRectSizeY() {
        return this.f23278b.getCropHeight();
    }

    public float getRectX() {
        return this.f23278b.getCropLeft() - AndroidUtilities.dp(14.0f);
    }

    public float getRectY() {
        int i10;
        float cropTop = this.f23278b.getCropTop() - AndroidUtilities.dp(14.0f);
        if (!this.d) {
            i10 = AndroidUtilities.statusBarHeight;
        } else {
            i10 = 0;
        }
        return cropTop - i10;
    }

    public Bitmap getVideoThumb() {
        if (this.f23280f && this.h) {
            return this.e.getBitmap();
        }
        return null;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f23278b.invalidate();
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.h && this.f23280f) {
            if (this.e.isInsideImage(motionEvent.getX(), motionEvent.getY())) {
                if (motionEvent.getAction() == 1) {
                    ((org.telegram.ui.ts0) this.f23277a).f();
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
        lg.p pVar = this.f23278b;
        CropAreaView cropAreaView = pVar.f14292a;
        float cropWidth = cropAreaView.getCropWidth();
        if (cropWidth != 0.0f && (nVar = pVar.L) != null) {
            cropAreaView.a(pVar.h, nVar.f14283a / nVar.f14284b);
            cropAreaView.setActualRect(cropAreaView.getAspectRatio());
            cropAreaView.d(pVar.f14295f);
            lg.n.g(pVar.L, cropAreaView.getCropWidth() / cropWidth, 0.0f, 0.0f);
            pVar.r(false);
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.h && this.f23280f) {
            if (this.e.isInsideImage(motionEvent.getX(), motionEvent.getY())) {
                if (motionEvent.getAction() == 1) {
                    ((org.telegram.ui.ts0) this.f23277a).f();
                }
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setAspectRatio(float f7) {
        this.f23278b.setAspectRatio(f7);
    }

    public void setDelegate(bf0 bf0Var) {
        this.f23277a = bf0Var;
    }

    public void setFreeform(boolean z10) {
        this.f23278b.setFreeform(z10);
    }

    public void setSubtitle(String str) {
        this.f23278b.setSubtitle(str);
    }

    public void setVideoThumbFlashAlpha(float f7) {
        this.f23284w = f7;
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
        this.v.addListener(new af0(this, 1));
        this.v.start();
    }
}
