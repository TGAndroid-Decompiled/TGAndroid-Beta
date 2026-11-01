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
public final class be0 extends FrameLayout {
    public final org.telegram.ui.ActionBar.p6 D;
    public final xd0 E;
    public final xd0 F;
    public ae0 f24714a;
    public final eg.q f24715b;
    public final eg.f f24716c;
    public final boolean d;
    public final ImageReceiver e;
    public boolean f24717f;
    public boolean h;
    public float f24718n;
    public float f24719r;
    public AnimatorSet f24720s;
    public AnimatorSet f24721w;
    public float f24722x;
    public final Paint f24723y;

    public be0(ContextThemeWrapper contextThemeWrapper, org.telegram.ui.ActionBar.p6 p6Var) {
        super(contextThemeWrapper);
        this.h = true;
        this.f24719r = 1.0f;
        this.f24722x = 0.0f;
        this.f24723y = new Paint(1);
        this.E = new xd0(this, 0);
        this.F = new xd0(this, 1);
        this.D = p6Var;
        this.d = contextThemeWrapper instanceof BubbleActivity;
        eg.q qVar = new eg.q(contextThemeWrapper);
        this.f24715b = qVar;
        qVar.setListener(new l2.f(this, 17));
        qVar.setBottomPadding(org.telegram.messenger.i0.L(64.0f));
        addView(qVar);
        this.e = new ImageReceiver(this);
        eg.f fVar = new eg.f(contextThemeWrapper);
        this.f24716c = fVar;
        fVar.setListener(new yd0(0, this));
        addView(fVar, w7.b6.d(-1, -2.0f, 81, 0.0f, 0.0f, 0.0f, 0.0f));
    }

    public final void a() {
        eg.q qVar = this.f24715b;
        qVar.f6584b.setVisibility(4);
        CropAreaView cropAreaView = qVar.f6583a;
        cropAreaView.setDimVisibility(false);
        cropAreaView.f(false, false);
        cropAreaView.invalidate();
    }

    public final void b(Bitmap bitmap, int i10, boolean z10, boolean z11, eg.g gVar, l61 l61Var, org.telegram.messenger.ze zeVar) {
        boolean z12;
        org.telegram.messenger.ze zeVar2;
        requestLayout();
        int i11 = 0;
        this.f24717f = false;
        Bitmap bitmap2 = null;
        this.e.w0(null);
        eg.q qVar = this.f24715b;
        ImageView imageView = qVar.f6584b;
        qVar.f6592y = z10;
        qVar.d = l61Var;
        qVar.e = gVar;
        qVar.K = i10;
        qVar.f6591x = bitmap;
        CropAreaView cropAreaView = qVar.f6583a;
        boolean z13 = true;
        if (l61Var != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        cropAreaView.setIsVideo(z12);
        if (bitmap == null && l61Var == null) {
            qVar.L = null;
            imageView.setImageDrawable(null);
            zeVar2 = zeVar;
        } else {
            int currentWidth = qVar.getCurrentWidth();
            int currentHeight = qVar.getCurrentHeight();
            eg.o oVar = qVar.L;
            if (oVar != null && z11) {
                float f7 = currentWidth;
                oVar.e *= oVar.f6574a / f7;
                oVar.f6574a = f7;
                oVar.f6575b = currentHeight;
                oVar.h();
                Matrix matrix = oVar.f6581k;
                eg.q qVar2 = oVar.f6582l;
                matrix.getValues(qVar2.H);
                matrix.reset();
                float f10 = oVar.e;
                matrix.postScale(f10, f10);
                float[] fArr = qVar2.H;
                matrix.postTranslate(fArr[2], fArr[5]);
                qVar2.r(false);
                zeVar2 = zeVar;
            } else {
                qVar.L = new eg.o(qVar, currentWidth, currentHeight);
                zeVar2 = zeVar;
                cropAreaView.getViewTreeObserver().addOnPreDrawListener(new eg.l(qVar, zeVar2, currentHeight, currentWidth, 1));
            }
            if (l61Var == null) {
                bitmap2 = qVar.f6591x;
            }
            imageView.setImageBitmap(bitmap2);
        }
        eg.f fVar = this.f24716c;
        fVar.setFreeform(z10);
        fVar.b(0.0f);
        fVar.setMirrored(false);
        fVar.setRotated(false);
        if (zeVar2 != null) {
            fVar.b(zeVar2.d);
            if (zeVar2.f19698k == 0) {
                z13 = false;
            }
            fVar.setRotated(z13);
            fVar.setMirrored(zeVar2.f19699l);
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
        eg.q qVar;
        boolean drawChild = super.drawChild(canvas, view, j10);
        if (this.f24717f && view == (qVar = this.f24715b)) {
            RectF actualRect = qVar.getActualRect();
            int L = org.telegram.messenger.i0.L(32.0f);
            org.telegram.ui.zp0 zp0Var = (org.telegram.ui.zp0) this.f24714a;
            zp0Var.getClass();
            PhotoViewer photoViewer = zp0Var.f44037a;
            float measuredWidth = (photoViewer.S7.getMeasuredWidth() - org.telegram.messenger.i0.L(32.0f)) * photoViewer.f33645w8;
            int i10 = L / 2;
            int L2 = org.telegram.messenger.i0.L(2.0f) + (((int) (measuredWidth + org.telegram.messenger.i0.L(16.0f))) - i10);
            int measuredHeight = getMeasuredHeight() - org.telegram.messenger.i0.L(156.0f);
            float f7 = actualRect.left;
            float f10 = this.f24719r;
            float f11 = ((L2 - f7) * f10) + f7;
            float f12 = actualRect.top;
            float z10 = c3.i0.z(measuredHeight, f12, f10, f12);
            float width = ((L - actualRect.width()) * this.f24719r) + actualRect.width();
            ImageReceiver imageReceiver = this.e;
            imageReceiver.J0((int) (width / 2.0f));
            imageReceiver.y0(f11, z10, width, width);
            imageReceiver.setAlpha(this.f24718n);
            imageReceiver.h(canvas, null);
            int i11 = (this.f24722x > 0.0f ? 1 : (this.f24722x == 0.0f ? 0 : -1));
            Paint paint = this.f24723y;
            if (i11 > 0) {
                paint.setColor(-1);
                paint.setAlpha((int) (this.f24722x * 255.0f));
                canvas.drawCircle(actualRect.centerX(), actualRect.centerY(), actualRect.width() / 2.0f, paint);
            }
            paint.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21126ng, this.D));
            paint.setAlpha(Math.min(255, (int) (this.f24719r * 255.0f * this.f24718n)));
            canvas.drawCircle(L2 + i10, org.telegram.messenger.i0.L(8.0f) + measuredHeight + L, org.telegram.messenger.i0.L(3.0f), paint);
        }
        return drawChild;
    }

    public float getRectSizeX() {
        return this.f24715b.getCropWidth();
    }

    public float getRectSizeY() {
        return this.f24715b.getCropHeight();
    }

    public float getRectX() {
        return this.f24715b.getCropLeft() - org.telegram.messenger.i0.L(14.0f);
    }

    public float getRectY() {
        int i10;
        float cropTop = this.f24715b.getCropTop() - org.telegram.messenger.i0.L(14.0f);
        if (!this.d) {
            i10 = org.telegram.messenger.i0.f16166m;
        } else {
            i10 = 0;
        }
        return cropTop - i10;
    }

    public Bitmap getVideoThumb() {
        if (this.f24717f && this.h) {
            return this.e.n();
        }
        return null;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f24715b.invalidate();
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.h && this.f24717f) {
            if (this.e.O(motionEvent.getX(), motionEvent.getY())) {
                if (motionEvent.getAction() == 1) {
                    ((org.telegram.ui.zp0) this.f24714a).f();
                }
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        eg.o oVar;
        super.onLayout(z10, i10, i11, i12, i13);
        eg.q qVar = this.f24715b;
        CropAreaView cropAreaView = qVar.f6583a;
        float cropWidth = cropAreaView.getCropWidth();
        if (cropWidth != 0.0f && (oVar = qVar.L) != null) {
            cropAreaView.a(qVar.h, oVar.f6574a / oVar.f6575b);
            cropAreaView.setActualRect(cropAreaView.getAspectRatio());
            cropAreaView.d(qVar.f6586f);
            eg.o.g(qVar.L, cropAreaView.getCropWidth() / cropWidth, 0.0f, 0.0f);
            qVar.r(false);
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.h && this.f24717f) {
            if (this.e.O(motionEvent.getX(), motionEvent.getY())) {
                if (motionEvent.getAction() == 1) {
                    ((org.telegram.ui.zp0) this.f24714a).f();
                }
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setAspectRatio(float f7) {
        this.f24715b.setAspectRatio(f7);
    }

    public void setDelegate(ae0 ae0Var) {
        this.f24714a = ae0Var;
    }

    public void setFreeform(boolean z10) {
        this.f24715b.setFreeform(z10);
    }

    public void setSubtitle(String str) {
        this.f24715b.setSubtitle(str);
    }

    public void setVideoThumbFlashAlpha(float f7) {
        this.f24722x = f7;
        invalidate();
    }

    public void setVideoThumbVisible(boolean z10) {
        float f7;
        if (this.h == z10) {
            return;
        }
        this.h = z10;
        AnimatorSet animatorSet = this.f24721w;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f24721w = animatorSet2;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this, this.F, f7));
        this.f24721w.setDuration(180L);
        this.f24721w.addListener(new zd0(this, 1));
        this.f24721w.start();
    }
}
