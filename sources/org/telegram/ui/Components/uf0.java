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
public final class uf0 extends FrameLayout {
    public final rf0 E;
    public final rf0 F;
    public tf0 f29366a;
    public final mg.p f29367b;
    public final mg.f f29368c;
    public final boolean d;
    public final ImageReceiver e;
    public boolean f29369f;
    public boolean h;
    public float f29370n;
    public float f29371r;
    public AnimatorSet f29372s;
    public AnimatorSet v;
    public float f29373w;
    public final Paint f29374x;
    public final org.telegram.ui.ActionBar.c6 f29375y;

    public uf0(ContextThemeWrapper contextThemeWrapper, org.telegram.ui.ActionBar.c6 c6Var) {
        super(contextThemeWrapper);
        this.h = true;
        this.f29371r = 1.0f;
        this.f29373w = 0.0f;
        this.f29374x = new Paint(1);
        this.E = new rf0(this, 0);
        this.F = new rf0(this, 1);
        this.f29375y = c6Var;
        this.d = contextThemeWrapper instanceof BubbleActivity;
        mg.p pVar = new mg.p(contextThemeWrapper);
        this.f29367b = pVar;
        pVar.setListener(new m.l(this));
        pVar.setBottomPadding(AndroidUtilities.dp(64.0f));
        addView(pVar);
        this.e = new ImageReceiver(this);
        mg.f fVar = new mg.f(contextThemeWrapper);
        this.f29368c = fVar;
        fVar.setListener(new ji.w4(this, 14));
        addView(fVar, w7.z5.a(-2.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 81));
    }

    public final void a() {
        mg.p pVar = this.f29367b;
        pVar.f15560b.setVisibility(4);
        CropAreaView cropAreaView = pVar.f15559a;
        cropAreaView.setDimVisibility(false);
        cropAreaView.f(false, false);
        cropAreaView.invalidate();
    }

    public final void b(Bitmap bitmap, int i10, boolean z10, boolean z11, mg.g gVar, y71 y71Var, MediaController.CropState cropState) {
        boolean z12;
        requestLayout();
        int i11 = 0;
        this.f29369f = false;
        Bitmap bitmap2 = null;
        this.e.setImageBitmap((Drawable) null);
        mg.p pVar = this.f29367b;
        ImageView imageView = pVar.f15560b;
        pVar.f15567x = z10;
        pVar.d = y71Var;
        pVar.e = gVar;
        pVar.K = i10;
        pVar.f15566w = bitmap;
        CropAreaView cropAreaView = pVar.f15559a;
        boolean z13 = true;
        if (y71Var != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        cropAreaView.setIsVideo(z12);
        if (bitmap == null && y71Var == null) {
            pVar.L = null;
            imageView.setImageDrawable(null);
        } else {
            int currentWidth = pVar.getCurrentWidth();
            int currentHeight = pVar.getCurrentHeight();
            mg.n nVar = pVar.L;
            if (nVar != null && z11) {
                float f7 = currentWidth;
                nVar.e *= nVar.f15550a / f7;
                nVar.f15550a = f7;
                nVar.f15551b = currentHeight;
                nVar.h();
                Matrix matrix = nVar.f15557k;
                mg.p pVar2 = nVar.f15558l;
                matrix.getValues(pVar2.H);
                matrix.reset();
                float f10 = nVar.e;
                matrix.postScale(f10, f10);
                float[] fArr = pVar2.H;
                matrix.postTranslate(fArr[2], fArr[5]);
                pVar2.r(false);
            } else {
                pVar.L = new mg.n(pVar, currentWidth, currentHeight);
                cropAreaView.getViewTreeObserver().addOnPreDrawListener(new mg.l(pVar, cropState, currentHeight, currentWidth));
            }
            if (y71Var == null) {
                bitmap2 = pVar.f15566w;
            }
            imageView.setImageBitmap(bitmap2);
        }
        mg.f fVar = this.f29368c;
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
        mg.p pVar;
        boolean drawChild = super.drawChild(canvas, view, j10);
        if (this.f29369f && view == (pVar = this.f29367b)) {
            RectF actualRect = pVar.getActualRect();
            int dp = AndroidUtilities.dp(32.0f);
            org.telegram.ui.zs0 zs0Var = (org.telegram.ui.zs0) this.f29366a;
            zs0Var.getClass();
            PhotoViewer photoViewer = zs0Var.f42417a;
            float measuredWidth = (photoViewer.S7.getMeasuredWidth() - AndroidUtilities.dp(32.0f)) * photoViewer.f32096w8;
            int i10 = dp / 2;
            int dp2 = AndroidUtilities.dp(2.0f) + (((int) (measuredWidth + AndroidUtilities.dp(16.0f))) - i10);
            int measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(156.0f);
            float f7 = actualRect.left;
            float f10 = this.f29371r;
            float f11 = ((dp2 - f7) * f10) + f7;
            float f12 = actualRect.top;
            float y3 = com.google.android.gms.internal.play_billing.k3.y(measuredHeight, f12, f10, f12);
            float width = ((dp - actualRect.width()) * this.f29371r) + actualRect.width();
            ImageReceiver imageReceiver = this.e;
            imageReceiver.setRoundRadius((int) (width / 2.0f));
            imageReceiver.setImageCoords(f11, y3, width, width);
            imageReceiver.setAlpha(this.f29370n);
            imageReceiver.draw(canvas);
            int i11 = (this.f29373w > 0.0f ? 1 : (this.f29373w == 0.0f ? 0 : -1));
            Paint paint = this.f29374x;
            if (i11 > 0) {
                paint.setColor(-1);
                paint.setAlpha((int) (this.f29373w * 255.0f));
                canvas.drawCircle(actualRect.centerX(), actualRect.centerY(), actualRect.width() / 2.0f, paint);
            }
            paint.setColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20013zf, this.f29375y));
            paint.setAlpha(Math.min(255, (int) (this.f29371r * 255.0f * this.f29370n)));
            canvas.drawCircle(dp2 + i10, AndroidUtilities.dp(8.0f) + measuredHeight + dp, AndroidUtilities.dp(3.0f), paint);
        }
        return drawChild;
    }

    public float getRectSizeX() {
        return this.f29367b.getCropWidth();
    }

    public float getRectSizeY() {
        return this.f29367b.getCropHeight();
    }

    public float getRectX() {
        return this.f29367b.getCropLeft() - AndroidUtilities.dp(14.0f);
    }

    public float getRectY() {
        int i10;
        float cropTop = this.f29367b.getCropTop() - AndroidUtilities.dp(14.0f);
        if (!this.d) {
            i10 = AndroidUtilities.statusBarHeight;
        } else {
            i10 = 0;
        }
        return cropTop - i10;
    }

    public Bitmap getVideoThumb() {
        if (this.f29369f && this.h) {
            return this.e.getBitmap();
        }
        return null;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f29367b.invalidate();
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.h && this.f29369f) {
            if (this.e.isInsideImage(motionEvent.getX(), motionEvent.getY())) {
                if (motionEvent.getAction() == 1) {
                    ((org.telegram.ui.zs0) this.f29366a).f();
                }
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        mg.n nVar;
        super.onLayout(z10, i10, i11, i12, i13);
        mg.p pVar = this.f29367b;
        CropAreaView cropAreaView = pVar.f15559a;
        float cropWidth = cropAreaView.getCropWidth();
        if (cropWidth != 0.0f && (nVar = pVar.L) != null) {
            cropAreaView.a(pVar.h, nVar.f15550a / nVar.f15551b);
            cropAreaView.setActualRect(cropAreaView.getAspectRatio());
            cropAreaView.d(pVar.f15562f);
            mg.n.g(pVar.L, cropAreaView.getCropWidth() / cropWidth, 0.0f, 0.0f);
            pVar.r(false);
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.h && this.f29369f) {
            if (this.e.isInsideImage(motionEvent.getX(), motionEvent.getY())) {
                if (motionEvent.getAction() == 1) {
                    ((org.telegram.ui.zs0) this.f29366a).f();
                }
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setAspectRatio(float f7) {
        this.f29367b.setAspectRatio(f7);
    }

    public void setDelegate(tf0 tf0Var) {
        this.f29366a = tf0Var;
    }

    public void setFreeform(boolean z10) {
        this.f29367b.setFreeform(z10);
    }

    public void setSubtitle(String str) {
        this.f29367b.setSubtitle(str);
    }

    public void setVideoThumbFlashAlpha(float f7) {
        this.f29373w = f7;
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
        this.v.addListener(new sf0(this, 1));
        this.v.start();
    }
}
