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
public final class be0 extends FrameLayout {
    public final yd0 A;
    public final yd0 B;
    public ae0 f27182a;
    public final tf.n f27183b;
    public final tf.e f27184c;
    public final boolean d;
    public final ImageReceiver f27185e;
    public boolean f27186f;
    public boolean h;
    public float f27187n;
    public float f27188r;
    public AnimatorSet f27189s;
    public AnimatorSet v;
    public float f27190w;
    public final Paint f27191x;
    public final org.telegram.ui.ActionBar.b6 f27192y;

    public be0(ContextThemeWrapper contextThemeWrapper, org.telegram.ui.ActionBar.b6 b6Var) {
        super(contextThemeWrapper);
        this.h = true;
        this.f27188r = 1.0f;
        this.f27190w = 0.0f;
        this.f27191x = new Paint(1);
        this.A = new yd0(this, 0);
        this.B = new yd0(this, 1);
        this.f27192y = b6Var;
        this.d = contextThemeWrapper instanceof BubbleActivity;
        tf.n nVar = new tf.n(contextThemeWrapper);
        this.f27183b = nVar;
        nVar.setListener(new n5.a0(this, 8));
        nVar.setBottomPadding(AndroidUtilities.dp(64.0f));
        addView(nVar);
        this.f27185e = new ImageReceiver(this);
        tf.e eVar = new tf.e(contextThemeWrapper);
        this.f27184c = eVar;
        eVar.setListener(new kh.i0(2, this));
        addView(eVar, g7.e6.d(-1, -2.0f, 81, 0.0f, 0.0f, 0.0f, 0.0f));
    }

    public final void a() {
        tf.n nVar = this.f27183b;
        nVar.f47905b.setVisibility(4);
        CropAreaView cropAreaView = nVar.f47904a;
        cropAreaView.setDimVisibility(false);
        cropAreaView.f(false, false);
        cropAreaView.invalidate();
    }

    public final void b(Bitmap bitmap, int i9, boolean z10, boolean z11, tf.f fVar, y51 y51Var, MediaController.CropState cropState) {
        boolean z12;
        requestLayout();
        int i10 = 0;
        this.f27186f = false;
        Bitmap bitmap2 = null;
        this.f27185e.setImageBitmap((Drawable) null);
        tf.n nVar = this.f27183b;
        ImageView imageView = nVar.f47905b;
        nVar.f47913x = z10;
        nVar.d = y51Var;
        nVar.f47907e = fVar;
        nVar.G = i9;
        nVar.f47912w = bitmap;
        CropAreaView cropAreaView = nVar.f47904a;
        boolean z13 = true;
        if (y51Var != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        cropAreaView.setIsVideo(z12);
        if (bitmap == null && y51Var == null) {
            nVar.H = null;
            imageView.setImageDrawable(null);
        } else {
            int currentWidth = nVar.getCurrentWidth();
            int currentHeight = nVar.getCurrentHeight();
            tf.l lVar = nVar.H;
            if (lVar != null && z11) {
                float f10 = currentWidth;
                lVar.f47897e *= lVar.f47894a / f10;
                lVar.f47894a = f10;
                lVar.f47895b = currentHeight;
                lVar.h();
                Matrix matrix = lVar.f47902k;
                tf.n nVar2 = lVar.f47903l;
                matrix.getValues(nVar2.D);
                matrix.reset();
                float f11 = lVar.f47897e;
                matrix.postScale(f11, f11);
                float[] fArr = nVar2.D;
                matrix.postTranslate(fArr[2], fArr[5]);
                nVar2.r(false);
            } else {
                nVar.H = new tf.l(nVar, currentWidth, currentHeight);
                cropAreaView.getViewTreeObserver().addOnPreDrawListener(new tf.j(nVar, cropState, currentHeight, currentWidth));
            }
            if (y51Var == null) {
                bitmap2 = nVar.f47912w;
            }
            imageView.setImageBitmap(bitmap2);
        }
        tf.e eVar = this.f27184c;
        eVar.setFreeform(z10);
        eVar.b(0.0f);
        eVar.setMirrored(false);
        eVar.setRotated(false);
        if (cropState != null) {
            eVar.b(cropState.cropRotate);
            if (cropState.transformRotation == 0) {
                z13 = false;
            }
            eVar.setRotated(z13);
            eVar.setMirrored(cropState.mirrored);
        } else {
            eVar.setRotated(false);
            eVar.setMirrored(false);
        }
        if (!z10) {
            i10 = 4;
        }
        eVar.setVisibility(i10);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        tf.n nVar;
        boolean drawChild = super.drawChild(canvas, view, j10);
        if (this.f27186f && view == (nVar = this.f27183b)) {
            RectF actualRect = nVar.getActualRect();
            int dp = AndroidUtilities.dp(32.0f);
            org.telegram.ui.qr0 qr0Var = (org.telegram.ui.qr0) this.f27182a;
            qr0Var.getClass();
            PhotoViewer photoViewer = qr0Var.f42183a;
            float measuredWidth = (photoViewer.N7.getMeasuredWidth() - AndroidUtilities.dp(32.0f)) * photoViewer.f35741r8;
            int i9 = dp / 2;
            int dp2 = AndroidUtilities.dp(2.0f) + (((int) (measuredWidth + AndroidUtilities.dp(16.0f))) - i9);
            int measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(156.0f);
            float f10 = actualRect.left;
            float f11 = this.f27188r;
            float f12 = ((dp2 - f10) * f11) + f10;
            float f13 = actualRect.top;
            float z10 = e2.c.z(measuredHeight, f13, f11, f13);
            float width = ((dp - actualRect.width()) * this.f27188r) + actualRect.width();
            ImageReceiver imageReceiver = this.f27185e;
            imageReceiver.setRoundRadius((int) (width / 2.0f));
            imageReceiver.setImageCoords(f12, z10, width, width);
            imageReceiver.setAlpha(this.f27187n);
            imageReceiver.draw(canvas);
            float f14 = this.f27190w;
            Paint paint = this.f27191x;
            if (f14 > 0.0f) {
                paint.setColor(-1);
                paint.setAlpha((int) (this.f27190w * 255.0f));
                canvas.drawCircle(actualRect.centerX(), actualRect.centerY(), actualRect.width() / 2.0f, paint);
            }
            paint.setColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23395zf, this.f27192y));
            paint.setAlpha(Math.min(255, (int) (this.f27188r * 255.0f * this.f27187n)));
            canvas.drawCircle(dp2 + i9, AndroidUtilities.dp(8.0f) + measuredHeight + dp, AndroidUtilities.dp(3.0f), paint);
        }
        return drawChild;
    }

    public float getRectSizeX() {
        return this.f27183b.getCropWidth();
    }

    public float getRectSizeY() {
        return this.f27183b.getCropHeight();
    }

    public float getRectX() {
        return this.f27183b.getCropLeft() - AndroidUtilities.dp(14.0f);
    }

    public float getRectY() {
        int i9;
        float cropTop = this.f27183b.getCropTop() - AndroidUtilities.dp(14.0f);
        if (!this.d) {
            i9 = AndroidUtilities.statusBarHeight;
        } else {
            i9 = 0;
        }
        return cropTop - i9;
    }

    public Bitmap getVideoThumb() {
        if (this.f27186f && this.h) {
            return this.f27185e.getBitmap();
        }
        return null;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f27183b.invalidate();
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.h && this.f27186f) {
            if (this.f27185e.isInsideImage(motionEvent.getX(), motionEvent.getY())) {
                if (motionEvent.getAction() == 1) {
                    ((org.telegram.ui.qr0) this.f27182a).f();
                }
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        tf.l lVar;
        super.onLayout(z10, i9, i10, i11, i12);
        tf.n nVar = this.f27183b;
        CropAreaView cropAreaView = nVar.f47904a;
        float cropWidth = cropAreaView.getCropWidth();
        if (cropWidth != 0.0f && (lVar = nVar.H) != null) {
            cropAreaView.a(nVar.h, lVar.f47894a / lVar.f47895b);
            cropAreaView.setActualRect(cropAreaView.getAspectRatio());
            cropAreaView.d(nVar.f47908f);
            tf.l.g(nVar.H, cropAreaView.getCropWidth() / cropWidth, 0.0f, 0.0f);
            nVar.r(false);
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.h && this.f27186f) {
            if (this.f27185e.isInsideImage(motionEvent.getX(), motionEvent.getY())) {
                if (motionEvent.getAction() == 1) {
                    ((org.telegram.ui.qr0) this.f27182a).f();
                }
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setAspectRatio(float f10) {
        this.f27183b.setAspectRatio(f10);
    }

    public void setDelegate(ae0 ae0Var) {
        this.f27182a = ae0Var;
    }

    public void setFreeform(boolean z10) {
        this.f27183b.setFreeform(z10);
    }

    public void setSubtitle(String str) {
        this.f27183b.setSubtitle(str);
    }

    public void setVideoThumbFlashAlpha(float f10) {
        this.f27190w = f10;
        invalidate();
    }

    public void setVideoThumbVisible(boolean z10) {
        float f10;
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
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this, this.B, f10));
        this.v.setDuration(180L);
        this.v.addListener(new zd0(this, 1));
        this.v.start();
    }
}
