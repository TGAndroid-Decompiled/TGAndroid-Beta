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
public final class ue0 extends FrameLayout {
    public final re0 E;
    public final re0 F;
    public te0 f30868a;
    public final mg.q f30869b;
    public final mg.f f30870c;
    public final boolean d;
    public final ImageReceiver f30871e;
    public boolean f30872f;
    public boolean h;
    public float f30873n;
    public float f30874r;
    public AnimatorSet f30875s;
    public AnimatorSet v;
    public float f30876w;
    public final Paint f30877x;
    public final org.telegram.ui.ActionBar.f6 f30878y;

    public ue0(ContextThemeWrapper contextThemeWrapper, org.telegram.ui.ActionBar.f6 f6Var) {
        super(contextThemeWrapper);
        this.h = true;
        this.f30874r = 1.0f;
        this.f30876w = 0.0f;
        this.f30877x = new Paint(1);
        this.E = new re0(this, 0);
        this.F = new re0(this, 1);
        this.f30878y = f6Var;
        this.d = contextThemeWrapper instanceof BubbleActivity;
        mg.q qVar = new mg.q(contextThemeWrapper);
        this.f30869b = qVar;
        qVar.setListener(new ji.u4(this, 12));
        qVar.setBottomPadding(AndroidUtilities.dp(64.0f));
        addView(qVar);
        this.f30871e = new ImageReceiver(this);
        mg.f fVar = new mg.f(contextThemeWrapper);
        this.f30870c = fVar;
        fVar.setListener(new di.h0(2, this));
        addView(fVar, w7.x5.d(-1, -2.0f, 81, 0.0f, 0.0f, 0.0f, 0.0f));
    }

    public final void a() {
        mg.q qVar = this.f30869b;
        qVar.f16304b.setVisibility(4);
        CropAreaView cropAreaView = qVar.f16303a;
        cropAreaView.setDimVisibility(false);
        cropAreaView.f(false, false);
        cropAreaView.invalidate();
    }

    public final void b(Bitmap bitmap, int i10, boolean z10, boolean z11, mg.g gVar, u61 u61Var, MediaController.CropState cropState) {
        boolean z12;
        requestLayout();
        int i11 = 0;
        this.f30872f = false;
        Bitmap bitmap2 = null;
        this.f30871e.setImageBitmap((Drawable) null);
        mg.q qVar = this.f30869b;
        ImageView imageView = qVar.f16304b;
        qVar.f16312x = z10;
        qVar.d = u61Var;
        qVar.f16306e = gVar;
        qVar.K = i10;
        qVar.f16311w = bitmap;
        CropAreaView cropAreaView = qVar.f16303a;
        boolean z13 = true;
        if (u61Var != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        cropAreaView.setIsVideo(z12);
        if (bitmap == null && u61Var == null) {
            qVar.L = null;
            imageView.setImageDrawable(null);
        } else {
            int currentWidth = qVar.getCurrentWidth();
            int currentHeight = qVar.getCurrentHeight();
            mg.o oVar = qVar.L;
            if (oVar != null && z11) {
                float f7 = currentWidth;
                oVar.f16296e *= oVar.f16293a / f7;
                oVar.f16293a = f7;
                oVar.f16294b = currentHeight;
                oVar.h();
                Matrix matrix = oVar.f16301k;
                mg.q qVar2 = oVar.f16302l;
                matrix.getValues(qVar2.H);
                matrix.reset();
                float f10 = oVar.f16296e;
                matrix.postScale(f10, f10);
                float[] fArr = qVar2.H;
                matrix.postTranslate(fArr[2], fArr[5]);
                qVar2.r(false);
            } else {
                qVar.L = new mg.o(qVar, currentWidth, currentHeight);
                cropAreaView.getViewTreeObserver().addOnPreDrawListener(new mg.l(qVar, cropState, currentHeight, currentWidth));
            }
            if (u61Var == null) {
                bitmap2 = qVar.f16311w;
            }
            imageView.setImageBitmap(bitmap2);
        }
        mg.f fVar = this.f30870c;
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
        mg.q qVar;
        boolean drawChild = super.drawChild(canvas, view, j3);
        if (this.f30872f && view == (qVar = this.f30869b)) {
            RectF actualRect = qVar.getActualRect();
            int dp = AndroidUtilities.dp(32.0f);
            org.telegram.ui.ss0 ss0Var = (org.telegram.ui.ss0) this.f30868a;
            ss0Var.getClass();
            PhotoViewer photoViewer = ss0Var.f40521a;
            float measuredWidth = (photoViewer.R7.getMeasuredWidth() - AndroidUtilities.dp(32.0f)) * photoViewer.f33706v8;
            int i10 = dp / 2;
            int dp2 = AndroidUtilities.dp(2.0f) + (((int) (measuredWidth + AndroidUtilities.dp(16.0f))) - i10);
            int measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(156.0f);
            float f7 = actualRect.left;
            float f10 = this.f30874r;
            float f11 = ((dp2 - f7) * f10) + f7;
            float f12 = actualRect.top;
            float z10 = com.google.android.gms.internal.vision.e2.z(measuredHeight, f12, f10, f12);
            float width = ((dp - actualRect.width()) * this.f30874r) + actualRect.width();
            ImageReceiver imageReceiver = this.f30871e;
            imageReceiver.setRoundRadius((int) (width / 2.0f));
            imageReceiver.setImageCoords(f11, z10, width, width);
            imageReceiver.setAlpha(this.f30873n);
            imageReceiver.draw(canvas);
            float f13 = this.f30876w;
            Paint paint = this.f30877x;
            if (f13 > 0.0f) {
                paint.setColor(-1);
                paint.setAlpha((int) (this.f30876w * 255.0f));
                canvas.drawCircle(actualRect.centerX(), actualRect.centerY(), actualRect.width() / 2.0f, paint);
            }
            paint.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f21070zf, this.f30878y));
            paint.setAlpha(Math.min(255, (int) (this.f30874r * 255.0f * this.f30873n)));
            canvas.drawCircle(dp2 + i10, AndroidUtilities.dp(8.0f) + measuredHeight + dp, AndroidUtilities.dp(3.0f), paint);
        }
        return drawChild;
    }

    public float getRectSizeX() {
        return this.f30869b.getCropWidth();
    }

    public float getRectSizeY() {
        return this.f30869b.getCropHeight();
    }

    public float getRectX() {
        return this.f30869b.getCropLeft() - AndroidUtilities.dp(14.0f);
    }

    public float getRectY() {
        int i10;
        float cropTop = this.f30869b.getCropTop() - AndroidUtilities.dp(14.0f);
        if (!this.d) {
            i10 = AndroidUtilities.statusBarHeight;
        } else {
            i10 = 0;
        }
        return cropTop - i10;
    }

    public Bitmap getVideoThumb() {
        if (this.f30872f && this.h) {
            return this.f30871e.getBitmap();
        }
        return null;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f30869b.invalidate();
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.h && this.f30872f) {
            if (this.f30871e.isInsideImage(motionEvent.getX(), motionEvent.getY())) {
                if (motionEvent.getAction() == 1) {
                    ((org.telegram.ui.ss0) this.f30868a).f();
                }
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        mg.o oVar;
        super.onLayout(z10, i10, i11, i12, i13);
        mg.q qVar = this.f30869b;
        CropAreaView cropAreaView = qVar.f16303a;
        float cropWidth = cropAreaView.getCropWidth();
        if (cropWidth != 0.0f && (oVar = qVar.L) != null) {
            cropAreaView.a(qVar.h, oVar.f16293a / oVar.f16294b);
            cropAreaView.setActualRect(cropAreaView.getAspectRatio());
            cropAreaView.d(qVar.f16307f);
            mg.o.g(qVar.L, cropAreaView.getCropWidth() / cropWidth, 0.0f, 0.0f);
            qVar.r(false);
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.h && this.f30872f) {
            if (this.f30871e.isInsideImage(motionEvent.getX(), motionEvent.getY())) {
                if (motionEvent.getAction() == 1) {
                    ((org.telegram.ui.ss0) this.f30868a).f();
                }
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setAspectRatio(float f7) {
        this.f30869b.setAspectRatio(f7);
    }

    public void setDelegate(te0 te0Var) {
        this.f30868a = te0Var;
    }

    public void setFreeform(boolean z10) {
        this.f30869b.setFreeform(z10);
    }

    public void setSubtitle(String str) {
        this.f30869b.setSubtitle(str);
    }

    public void setVideoThumbFlashAlpha(float f7) {
        this.f30876w = f7;
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
        this.v.addListener(new se0(this, 1));
        this.v.start();
    }
}
