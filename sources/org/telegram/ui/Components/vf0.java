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
public final class vf0 extends FrameLayout {
    public final sf0 E;
    public final sf0 F;
    public uf0 f31767a;
    public final lg.p f31768b;
    public final lg.f f31769c;
    public final boolean d;
    public final ImageReceiver f31770e;
    public boolean f31771f;
    public boolean h;
    public float f31772n;
    public float f31773r;
    public AnimatorSet f31774s;
    public AnimatorSet v;
    public float f31775w;
    public final Paint f31776x;
    public final org.telegram.ui.ActionBar.e6 f31777y;

    public vf0(ContextThemeWrapper contextThemeWrapper, org.telegram.ui.ActionBar.e6 e6Var) {
        super(contextThemeWrapper);
        this.h = true;
        this.f31773r = 1.0f;
        this.f31775w = 0.0f;
        this.f31776x = new Paint(1);
        this.E = new sf0(this, 0);
        this.F = new sf0(this, 1);
        this.f31777y = e6Var;
        this.d = contextThemeWrapper instanceof BubbleActivity;
        lg.p pVar = new lg.p(contextThemeWrapper);
        this.f31768b = pVar;
        pVar.setListener(new l2.f(this, 13));
        pVar.setBottomPadding(AndroidUtilities.dp(64.0f));
        addView(pVar);
        this.f31770e = new ImageReceiver(this);
        lg.f fVar = new lg.f(contextThemeWrapper);
        this.f31769c = fVar;
        fVar.setListener(new k2.g0(this, 13));
        addView(fVar, w7.x5.a(-2.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 81));
    }

    public final void a() {
        lg.p pVar = this.f31768b;
        pVar.f15573b.setVisibility(4);
        CropAreaView cropAreaView = pVar.f15572a;
        cropAreaView.setDimVisibility(false);
        cropAreaView.f(false, false);
        cropAreaView.invalidate();
    }

    public final void b(Bitmap bitmap, int i10, boolean z10, boolean z11, lg.g gVar, z71 z71Var, MediaController.CropState cropState) {
        boolean z12;
        requestLayout();
        int i11 = 0;
        this.f31771f = false;
        Bitmap bitmap2 = null;
        this.f31770e.setImageBitmap((Drawable) null);
        lg.p pVar = this.f31768b;
        ImageView imageView = pVar.f15573b;
        pVar.f15581x = z10;
        pVar.d = z71Var;
        pVar.f15575e = gVar;
        pVar.K = i10;
        pVar.f15580w = bitmap;
        CropAreaView cropAreaView = pVar.f15572a;
        boolean z13 = true;
        if (z71Var != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        cropAreaView.setIsVideo(z12);
        if (bitmap == null && z71Var == null) {
            pVar.L = null;
            imageView.setImageDrawable(null);
        } else {
            int currentWidth = pVar.getCurrentWidth();
            int currentHeight = pVar.getCurrentHeight();
            lg.n nVar = pVar.L;
            if (nVar != null && z11) {
                float f7 = currentWidth;
                nVar.f15565e *= nVar.f15562a / f7;
                nVar.f15562a = f7;
                nVar.f15563b = currentHeight;
                nVar.h();
                Matrix matrix = nVar.f15570k;
                lg.p pVar2 = nVar.f15571l;
                matrix.getValues(pVar2.H);
                matrix.reset();
                float f10 = nVar.f15565e;
                matrix.postScale(f10, f10);
                float[] fArr = pVar2.H;
                matrix.postTranslate(fArr[2], fArr[5]);
                pVar2.r(false);
            } else {
                pVar.L = new lg.n(pVar, currentWidth, currentHeight);
                cropAreaView.getViewTreeObserver().addOnPreDrawListener(new lg.l(pVar, cropState, currentHeight, currentWidth));
            }
            if (z71Var == null) {
                bitmap2 = pVar.f15580w;
            }
            imageView.setImageBitmap(bitmap2);
        }
        lg.f fVar = this.f31769c;
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
        if (this.f31771f && view == (pVar = this.f31768b)) {
            RectF actualRect = pVar.getActualRect();
            int dp = AndroidUtilities.dp(32.0f);
            org.telegram.ui.ts0 ts0Var = (org.telegram.ui.ts0) this.f31767a;
            ts0Var.getClass();
            PhotoViewer photoViewer = ts0Var.f42117a;
            float measuredWidth = (photoViewer.S7.getMeasuredWidth() - AndroidUtilities.dp(32.0f)) * photoViewer.f34071w8;
            int i10 = dp / 2;
            int dp2 = AndroidUtilities.dp(2.0f) + (((int) (measuredWidth + AndroidUtilities.dp(16.0f))) - i10);
            int measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(156.0f);
            float f7 = actualRect.left;
            float f10 = this.f31773r;
            float f11 = ((dp2 - f7) * f10) + f7;
            float f12 = actualRect.top;
            float y3 = com.google.android.gms.internal.vision.e2.y(measuredHeight, f12, f10, f12);
            float width = ((dp - actualRect.width()) * this.f31773r) + actualRect.width();
            ImageReceiver imageReceiver = this.f31770e;
            imageReceiver.setRoundRadius((int) (width / 2.0f));
            imageReceiver.setImageCoords(f11, y3, width, width);
            imageReceiver.setAlpha(this.f31772n);
            imageReceiver.draw(canvas);
            int i11 = (this.f31775w > 0.0f ? 1 : (this.f31775w == 0.0f ? 0 : -1));
            Paint paint = this.f31776x;
            if (i11 > 0) {
                paint.setColor(-1);
                paint.setAlpha((int) (this.f31775w * 255.0f));
                canvas.drawCircle(actualRect.centerX(), actualRect.centerY(), actualRect.width() / 2.0f, paint);
            }
            paint.setColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21208zf, this.f31777y));
            paint.setAlpha(Math.min(255, (int) (this.f31773r * 255.0f * this.f31772n)));
            canvas.drawCircle(dp2 + i10, AndroidUtilities.dp(8.0f) + measuredHeight + dp, AndroidUtilities.dp(3.0f), paint);
        }
        return drawChild;
    }

    public float getRectSizeX() {
        return this.f31768b.getCropWidth();
    }

    public float getRectSizeY() {
        return this.f31768b.getCropHeight();
    }

    public float getRectX() {
        return this.f31768b.getCropLeft() - AndroidUtilities.dp(14.0f);
    }

    public float getRectY() {
        int i10;
        float cropTop = this.f31768b.getCropTop() - AndroidUtilities.dp(14.0f);
        if (!this.d) {
            i10 = AndroidUtilities.statusBarHeight;
        } else {
            i10 = 0;
        }
        return cropTop - i10;
    }

    public Bitmap getVideoThumb() {
        if (this.f31771f && this.h) {
            return this.f31770e.getBitmap();
        }
        return null;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f31768b.invalidate();
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.h && this.f31771f) {
            if (this.f31770e.isInsideImage(motionEvent.getX(), motionEvent.getY())) {
                if (motionEvent.getAction() == 1) {
                    ((org.telegram.ui.ts0) this.f31767a).f();
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
        lg.p pVar = this.f31768b;
        CropAreaView cropAreaView = pVar.f15572a;
        float cropWidth = cropAreaView.getCropWidth();
        if (cropWidth != 0.0f && (nVar = pVar.L) != null) {
            cropAreaView.a(pVar.h, nVar.f15562a / nVar.f15563b);
            cropAreaView.setActualRect(cropAreaView.getAspectRatio());
            cropAreaView.d(pVar.f15576f);
            lg.n.g(pVar.L, cropAreaView.getCropWidth() / cropWidth, 0.0f, 0.0f);
            pVar.r(false);
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.h && this.f31771f) {
            if (this.f31770e.isInsideImage(motionEvent.getX(), motionEvent.getY())) {
                if (motionEvent.getAction() == 1) {
                    ((org.telegram.ui.ts0) this.f31767a).f();
                }
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setAspectRatio(float f7) {
        this.f31768b.setAspectRatio(f7);
    }

    public void setDelegate(uf0 uf0Var) {
        this.f31767a = uf0Var;
    }

    public void setFreeform(boolean z10) {
        this.f31768b.setFreeform(z10);
    }

    public void setSubtitle(String str) {
        this.f31768b.setSubtitle(str);
    }

    public void setVideoThumbFlashAlpha(float f7) {
        this.f31775w = f7;
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
        this.v.addListener(new tf0(this, 1));
        this.v.start();
    }
}
