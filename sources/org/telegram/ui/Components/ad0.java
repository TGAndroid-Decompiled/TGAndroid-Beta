package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.PhotoViewer;
public final class ad0 extends FrameLayout {
    public final org.telegram.ui.ActionBar.e6 E;
    public final xc0 F;
    public final xc0 G;
    public zc0 f31807a;
    public final pg.m f31808b;
    public final pg.e f31809c;
    public final boolean d;
    public final ImageReceiver f31810e;
    public boolean f31811f;
    public boolean h;
    public float f31812n;
    public float f31813r;
    public AnimatorSet f31814s;
    public AnimatorSet f31815w;
    public float f31816x;
    public final Paint f31817y;

    public ad0(ContextThemeWrapper contextThemeWrapper, org.telegram.ui.ActionBar.e6 e6Var) {
        super(contextThemeWrapper);
        this.h = true;
        this.f31813r = 1.0f;
        this.f31816x = 0.0f;
        this.f31817y = new Paint(1);
        this.F = new xc0(this, 0);
        this.G = new xc0(this, 1);
        this.E = e6Var;
        this.d = contextThemeWrapper instanceof BubbleActivity;
        pg.m mVar = new pg.m(contextThemeWrapper);
        this.f31808b = mVar;
        mVar.setListener(new i9(this, 4));
        mVar.setBottomPadding(org.telegram.messenger.g0.L(64.0f));
        addView(mVar);
        this.f31810e = new ImageReceiver(this);
        pg.e eVar = new pg.e(contextThemeWrapper);
        this.f31809c = eVar;
        eVar.setListener(new gi.h0(2, this));
        addView(eVar, b8.mf.d(-1, -2.0f, 81, 0.0f, 0.0f, 0.0f, 0.0f));
    }

    public final void a() {
        pg.m mVar = this.f31808b;
        mVar.f53512b.setVisibility(4);
        CropAreaView cropAreaView = mVar.f53511a;
        cropAreaView.setDimVisibility(false);
        cropAreaView.f(false, false);
        cropAreaView.invalidate();
    }

    public final void b(Bitmap bitmap, int i3, boolean z10, boolean z11, pg.f fVar, b51 b51Var, org.telegram.messenger.re reVar) {
        boolean z12;
        org.telegram.messenger.re reVar2;
        requestLayout();
        int i10 = 0;
        this.f31811f = false;
        Bitmap bitmap2 = null;
        this.f31810e.w0(null);
        pg.m mVar = this.f31808b;
        ImageView imageView = mVar.f53512b;
        mVar.f53521y = z10;
        mVar.d = b51Var;
        mVar.f53514e = fVar;
        mVar.L = i3;
        mVar.f53520x = bitmap;
        CropAreaView cropAreaView = mVar.f53511a;
        boolean z13 = true;
        if (b51Var != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        cropAreaView.setIsVideo(z12);
        if (bitmap == null && b51Var == null) {
            mVar.M = null;
            imageView.setImageDrawable(null);
            reVar2 = reVar;
        } else {
            int currentWidth = mVar.getCurrentWidth();
            int currentHeight = mVar.getCurrentHeight();
            pg.k kVar = mVar.M;
            if (kVar != null && z11) {
                float f10 = currentWidth;
                kVar.f53504e *= kVar.f53501a / f10;
                kVar.f53501a = f10;
                kVar.f53502b = currentHeight;
                kVar.h();
                Matrix matrix = kVar.f53509k;
                pg.m mVar2 = kVar.f53510l;
                matrix.getValues(mVar2.I);
                matrix.reset();
                float f11 = kVar.f53504e;
                matrix.postScale(f11, f11);
                float[] fArr = mVar2.I;
                matrix.postTranslate(fArr[2], fArr[5]);
                mVar2.r(false);
                reVar2 = reVar;
            } else {
                mVar.M = new pg.k(mVar, currentWidth, currentHeight);
                reVar2 = reVar;
                cropAreaView.getViewTreeObserver().addOnPreDrawListener(new pg.i(mVar, reVar2, currentHeight, currentWidth, 1));
            }
            if (b51Var == null) {
                bitmap2 = mVar.f53520x;
            }
            imageView.setImageBitmap(bitmap2);
        }
        pg.e eVar = this.f31809c;
        eVar.setFreeform(z10);
        eVar.b(0.0f);
        eVar.setMirrored(false);
        eVar.setRotated(false);
        if (reVar2 != null) {
            eVar.b(reVar2.d);
            if (reVar2.f25117k == 0) {
                z13 = false;
            }
            eVar.setRotated(z13);
            eVar.setMirrored(reVar2.f25118l);
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
        pg.m mVar;
        boolean drawChild = super.drawChild(canvas, view, j10);
        if (this.f31811f && view == (mVar = this.f31808b)) {
            RectF actualRect = mVar.getActualRect();
            int L = org.telegram.messenger.g0.L(32.0f);
            org.telegram.ui.io0 io0Var = (org.telegram.ui.io0) this.f31807a;
            io0Var.getClass();
            PhotoViewer photoViewer = io0Var.f46322a;
            float measuredWidth = (photoViewer.T7.getMeasuredWidth() - org.telegram.messenger.g0.L(32.0f)) * photoViewer.f41586x8;
            int i3 = L / 2;
            int L2 = org.telegram.messenger.g0.L(2.0f) + (((int) (measuredWidth + org.telegram.messenger.g0.L(16.0f))) - i3);
            int measuredHeight = getMeasuredHeight() - org.telegram.messenger.g0.L(156.0f);
            float f10 = actualRect.left;
            float f11 = this.f31813r;
            float f12 = ((L2 - f10) * f11) + f10;
            float f13 = actualRect.top;
            float y9 = com.google.android.recaptcha.internal.a.y(measuredHeight, f13, f11, f13);
            float width = ((L - actualRect.width()) * this.f31813r) + actualRect.width();
            ImageReceiver imageReceiver = this.f31810e;
            imageReceiver.J0((int) (width / 2.0f));
            imageReceiver.y0(f12, y9, width, width);
            imageReceiver.setAlpha(this.f31812n);
            imageReceiver.h(canvas, null);
            int i10 = (this.f31816x > 0.0f ? 1 : (this.f31816x == 0.0f ? 0 : -1));
            Paint paint = this.f31817y;
            if (i10 > 0) {
                paint.setColor(-1);
                paint.setAlpha((int) (this.f31816x * 255.0f));
                canvas.drawCircle(actualRect.centerX(), actualRect.centerY(), actualRect.width() / 2.0f, paint);
            }
            paint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28071ng, this.E));
            paint.setAlpha(Math.min(255, (int) (this.f31813r * 255.0f * this.f31812n)));
            canvas.drawCircle(L2 + i3, org.telegram.messenger.g0.L(8.0f) + measuredHeight + L, org.telegram.messenger.g0.L(3.0f), paint);
        }
        return drawChild;
    }

    public float getRectSizeX() {
        return this.f31808b.getCropWidth();
    }

    public float getRectSizeY() {
        return this.f31808b.getCropHeight();
    }

    public float getRectX() {
        return this.f31808b.getCropLeft() - org.telegram.messenger.g0.L(14.0f);
    }

    public float getRectY() {
        int i3;
        float cropTop = this.f31808b.getCropTop() - org.telegram.messenger.g0.L(14.0f);
        if (!this.d) {
            i3 = org.telegram.messenger.g0.f22602m;
        } else {
            i3 = 0;
        }
        return cropTop - i3;
    }

    public Bitmap getVideoThumb() {
        if (this.f31811f && this.h) {
            return this.f31810e.n();
        }
        return null;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f31808b.invalidate();
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.h && this.f31811f) {
            if (this.f31810e.O(motionEvent.getX(), motionEvent.getY())) {
                if (motionEvent.getAction() == 1) {
                    ((org.telegram.ui.io0) this.f31807a).b();
                }
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        pg.k kVar;
        super.onLayout(z10, i3, i10, i11, i12);
        pg.m mVar = this.f31808b;
        CropAreaView cropAreaView = mVar.f53511a;
        float cropWidth = cropAreaView.getCropWidth();
        if (cropWidth != 0.0f && (kVar = mVar.M) != null) {
            cropAreaView.a(mVar.h, kVar.f53501a / kVar.f53502b);
            cropAreaView.setActualRect(cropAreaView.getAspectRatio());
            cropAreaView.d(mVar.f53515f);
            pg.k.g(mVar.M, cropAreaView.getCropWidth() / cropWidth, 0.0f, 0.0f);
            mVar.r(false);
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.h && this.f31811f) {
            if (this.f31810e.O(motionEvent.getX(), motionEvent.getY())) {
                if (motionEvent.getAction() == 1) {
                    ((org.telegram.ui.io0) this.f31807a).b();
                }
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setAspectRatio(float f10) {
        this.f31808b.setAspectRatio(f10);
    }

    public void setDelegate(zc0 zc0Var) {
        this.f31807a = zc0Var;
    }

    public void setFreeform(boolean z10) {
        this.f31808b.setFreeform(z10);
    }

    public void setSubtitle(String str) {
        this.f31808b.setSubtitle(str);
    }

    public void setVideoThumbFlashAlpha(float f10) {
        this.f31816x = f10;
        invalidate();
    }

    public void setVideoThumbVisible(boolean z10) {
        float f10;
        if (this.h == z10) {
            return;
        }
        this.h = z10;
        AnimatorSet animatorSet = this.f31815w;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f31815w = animatorSet2;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this, this.G, f10));
        this.f31815w.setDuration(180L);
        this.f31815w.addListener(new yc0(this, 1));
        this.f31815w.start();
    }
}
