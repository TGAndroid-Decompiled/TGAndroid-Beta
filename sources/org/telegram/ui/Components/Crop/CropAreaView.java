package org.telegram.ui.Components.Crop;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.SystemClock;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import i0.b;
import m1.j;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.zb1;
import uf.a;
import uf.l;
import uf.m;
import uf.n;

public class CropAreaView extends ViewGroup {
    public int A;
    public int B;
    public float C;
    public float D;
    public boolean E;
    public boolean F;
    public float G;
    public float H;
    public float I;
    public long J;
    public Paint K;
    public Paint L;
    public Paint M;
    public Paint N;
    public Paint O;
    public Paint P;
    public AccelerateDecelerateInterpolator Q;
    public float R;
    public float S;
    public boolean T;
    public float U;
    public ObjectAnimator V;
    public a W;

    public int f26343a;

    public boolean f26344a0;

    public float f26345b;

    public boolean f26346b0;

    public float f26347c;

    public Bitmap f26348c0;
    public RectF d;

    public Paint f26349d0;

    public RectF f26350e;

    public String f26351e0;

    public RectF f26352f;

    public StaticLayout f26353f0;

    public AnimatorSet f26354g0;
    public RectF h;

    public RectF f26355h0;

    public TextPaint f26356i0;

    public float f26357j0;

    public float f26358k0;

    public float f26359l0;
    public float m0;

    public RectF f26360n;

    public int f26361n0;

    public int f26362o0;

    public int f26363p0;

    public RectF f26364r;

    public RectF f26365s;
    public RectF v;

    public float f26366w;

    public RectF f26367x;

    public RectF f26368y;

    public static void b(RectF rectF, float f10) {
        float fHeight = rectF.height();
        rectF.right = rectF.left + (f10 * fHeight);
        rectF.bottom = rectF.top + fHeight;
    }

    public static void c(RectF rectF, float f10) {
        float fWidth = rectF.width();
        rectF.right = rectF.left + fWidth;
        rectF.bottom = rectF.top + (fWidth / f10);
    }

    private float getGridProgress() {
        return this.U;
    }

    private void setCropBottom(float f10) {
        this.f26367x.bottom = f10;
        invalidate();
    }

    private void setCropLeft(float f10) {
        this.f26367x.left = f10;
        invalidate();
    }

    private void setCropRight(float f10) {
        this.f26367x.right = f10;
        invalidate();
    }

    private void setCropTop(float f10) {
        this.f26367x.top = f10;
        invalidate();
    }

    private void setGridProgress(float f10) {
        this.U = f10;
        invalidate();
    }

    public final void a(RectF rectF, float f10) {
        float f11;
        float f12;
        float f13;
        float f14;
        float f15 = this.R;
        float f16 = !this.T ? AndroidUtilities.statusBarHeight : 0;
        float measuredHeight = ((getMeasuredHeight() - this.C) - this.D) - f16;
        float measuredWidth = getMeasuredWidth() / measuredHeight;
        float f17 = f15 * 2.0f;
        float fMin = Math.min(getMeasuredWidth(), measuredHeight) - f17;
        float measuredWidth2 = getMeasuredWidth() - f17;
        float f18 = measuredHeight - f17;
        float measuredWidth3 = getMeasuredWidth() / 2.0f;
        float f19 = (measuredHeight / 2.0f) + f16 + this.D;
        if (Math.abs(1.0f - f10) < 1.0E-4d) {
            float f20 = fMin / 2.0f;
            f14 = measuredWidth3 - f20;
            f13 = f19 - f20;
            f11 = measuredWidth3 + f20;
            f12 = f19 + f20;
        } else if (f10 - measuredWidth <= 1.0E-4d) {
            float f21 = f18 * f10;
            if (f21 > measuredWidth2) {
                float f22 = measuredWidth2 / 2.0f;
                float f23 = measuredWidth3 - f22;
                float f24 = (measuredWidth2 / f10) / 2.0f;
                float f25 = f19 - f24;
                f11 = measuredWidth3 + f22;
                f12 = f19 + f24;
                f13 = f25;
                f14 = f23;
            } else {
                float f26 = f21 / 2.0f;
                f14 = measuredWidth3 - f26;
                float f27 = f18 / 2.0f;
                float f28 = f19 - f27;
                f11 = measuredWidth3 + f26;
                f12 = f19 + f27;
                f13 = f28;
            }
        } else {
            float f29 = measuredWidth2 / 2.0f;
            float f210 = measuredWidth3 - f29;
            float f211 = (measuredWidth2 / f10) / 2.0f;
            float f212 = f19 - f211;
            f11 = measuredWidth3 + f29;
            f12 = f19 + f211;
            f13 = f212;
            f14 = f210;
        }
        rectF.set(f14, f13, f11, f12);
    }

    public final void d(RectF rectF) {
        rectF.set(this.f26367x);
    }

    public final void e(int i10, int i11, boolean z10, boolean z11) {
        this.f26346b0 = z11;
        float f10 = z10 ? i11 / i10 : i10 / i11;
        if (!z11) {
            f10 = 1.0f;
            this.f26366w = 1.0f;
        }
        setActualRect(f10);
    }

    public final void f(boolean z10, boolean z11) {
        this.F = z10;
        if (!z10) {
            this.H = 1.0f;
            return;
        }
        this.H = z11 ? 0.0f : 1.0f;
        this.J = SystemClock.elapsedRealtime();
        invalidate();
    }

    public final void g(int i10, boolean z10) {
        ObjectAnimator objectAnimator = this.V;
        if (objectAnimator != null && (!z10 || this.f26363p0 != i10)) {
            objectAnimator.cancel();
            this.V = null;
        }
        int i11 = this.f26363p0;
        if (i11 == i10) {
            return;
        }
        this.f26362o0 = i11;
        this.f26363p0 = i10;
        float f10 = i10 == 1 ? 0.0f : 1.0f;
        if (!z10) {
            this.U = f10;
            invalidate();
            return;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "gridProgress", this.U, f10);
        this.V = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(200L);
        this.V.addListener(new zb1(this, 10));
        if (i10 == 1) {
            this.V.setStartDelay(200L);
        }
        this.V.start();
    }

    public float getAspectRatio() {
        RectF rectF = this.f26367x;
        return (rectF.right - rectF.left) / (rectF.bottom - rectF.top);
    }

    public float getCropBottom() {
        return this.f26367x.bottom;
    }

    public float getCropCenterX() {
        RectF rectF = this.f26367x;
        return (rectF.left + rectF.right) / 2.0f;
    }

    public float getCropCenterY() {
        RectF rectF = this.f26367x;
        return (rectF.top + rectF.bottom) / 2.0f;
    }

    public float getCropHeight() {
        RectF rectF = this.f26367x;
        return rectF.bottom - rectF.top;
    }

    public float getCropLeft() {
        return this.f26367x.left;
    }

    public float getCropRight() {
        return this.f26367x.right;
    }

    public float getCropTop() {
        return this.f26367x.top;
    }

    public float getCropWidth() {
        RectF rectF = this.f26367x;
        return rectF.right - rectF.left;
    }

    public Interpolator getInterpolator() {
        return this.Q;
    }

    public float getLockAspectRatio() {
        return this.f26366w;
    }

    public RectF getTargetRectToFill() {
        float aspectRatio = getAspectRatio();
        RectF rectF = this.f26355h0;
        a(rectF, aspectRatio);
        return rectF;
    }

    public final void h(boolean z10) {
        try {
            View decorView = ((Activity) getContext()).getWindow().getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z10 ? systemUiVisibility | 4 : systemUiVisibility & (-5));
        } catch (Exception unused) {
        }
    }

    public final void i() {
        if (this.f26351e0 == null) {
            this.f26353f0 = null;
            return;
        }
        if (this.f26356i0 == null) {
            TextPaint textPaint = new TextPaint();
            this.f26356i0 = textPaint;
            textPaint.setColor(b.k(-1, 120));
            this.f26356i0.setTextSize(AndroidUtilities.dp(13.0f));
            this.f26356i0.setTextAlign(Paint.Align.CENTER);
        }
        this.f26353f0 = new StaticLayout(this.f26351e0, this.f26356i0, getMeasuredWidth() - AndroidUtilities.dp(120.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
    }

    public final void j() {
        int iDp = AndroidUtilities.dp(16.0f);
        RectF rectF = this.d;
        RectF rectF2 = this.f26367x;
        float f10 = rectF2.left;
        float f11 = iDp;
        float f12 = rectF2.top;
        rectF.set(f10 - f11, f12 - f11, f10 + f11, f12 + f11);
        RectF rectF3 = this.f26350e;
        float f13 = rectF2.right;
        float f14 = rectF2.top;
        rectF3.set(f13 - f11, f14 - f11, f13 + f11, f14 + f11);
        RectF rectF4 = this.f26352f;
        float f15 = rectF2.left;
        float f16 = rectF2.bottom;
        rectF4.set(f15 - f11, f16 - f11, f15 + f11, f16 + f11);
        RectF rectF5 = this.h;
        float f17 = rectF2.right;
        float f18 = rectF2.bottom;
        rectF5.set(f17 - f11, f18 - f11, f17 + f11, f18 + f11);
        RectF rectF6 = this.f26360n;
        float f19 = rectF2.left + f11;
        float f20 = rectF2.top;
        rectF6.set(f19, f20 - f11, rectF2.right - f11, f20 + f11);
        RectF rectF7 = this.f26364r;
        float f21 = rectF2.left;
        rectF7.set(f21 - f11, rectF2.top + f11, f21 + f11, rectF2.bottom - f11);
        RectF rectF8 = this.v;
        float f22 = rectF2.right;
        rectF8.set(f22 - f11, rectF2.top + f11, f22 + f11, rectF2.bottom - f11);
        RectF rectF9 = this.f26365s;
        float f23 = rectF2.left + f11;
        float f24 = rectF2.bottom;
        rectF9.set(f23, f24 - f11, rectF2.right - f11, f24 + f11);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        int i10;
        int i11;
        Paint paint;
        Paint paint2;
        int i12;
        Paint paint3;
        Paint paint4 = this.P;
        boolean z10 = this.T;
        float f11 = this.R;
        Paint paint5 = this.O;
        Paint paint6 = this.M;
        Paint paint7 = this.L;
        Paint paint8 = this.N;
        Paint paint9 = this.K;
        if (this.f26346b0) {
            int iDp = AndroidUtilities.dp(2.0f / this.f26358k0);
            int iDp2 = AndroidUtilities.dp(16.0f / this.f26358k0);
            int iDp3 = AndroidUtilities.dp(3.0f / this.f26358k0);
            RectF rectF = this.f26367x;
            float f12 = rectF.left;
            int i13 = ((int) f12) - iDp;
            float f13 = rectF.top;
            int i14 = ((int) f13) - iDp;
            int i15 = iDp * 2;
            int i16 = ((int) (rectF.right - f12)) + i15;
            int i17 = i15 + ((int) (rectF.bottom - f13));
            canvas.save();
            canvas.translate(this.f26359l0, this.m0);
            float f14 = this.f26358k0;
            float f15 = (i16 / 2) + i13;
            float f16 = (i17 / 2) + i14;
            canvas.scale(f14, f14, f15, f16);
            canvas.rotate(this.f26357j0, f15, f16);
            if (this.E) {
                int i18 = (-getWidth()) * 4;
                int i19 = (-getHeight()) * 4;
                int width = getWidth() * 4;
                int height = getHeight() * 4;
                float f17 = this.G;
                if (f17 >= 0.0f) {
                    paint9.setAlpha((int) (f17 * 255.0f));
                } else {
                    paint9.setAlpha((int) (255.0f - (this.H * 127.0f)));
                }
                float f18 = i18;
                float f19 = width;
                i10 = iDp;
                i11 = i13;
                canvas.drawRect(f18, i19, f19, 0.0f, paint9);
                canvas.drawRect(f18, 0.0f, 0.0f, getHeight(), paint9);
                canvas.drawRect(getWidth(), 0.0f, f19, getHeight(), paint9);
                canvas.drawRect(f18, getHeight(), f19, height, paint9);
                float f20 = i14 + i10;
                canvas.drawRect(0.0f, 0.0f, getWidth(), f20, paint9);
                float f21 = (i14 + i17) - i10;
                canvas.drawRect(0.0f, f20, i11 + i10, f21, paint9);
                canvas.drawRect((i11 + i16) - i10, f20, getWidth(), f21, paint9);
                canvas.drawRect(0.0f, f21, getWidth(), getHeight(), paint9);
            } else {
                i10 = iDp;
                i11 = i13;
            }
            if (!this.F) {
                return;
            }
            int i20 = iDp3 - i10;
            int i21 = iDp3 * 2;
            int i22 = i16 - i21;
            int i23 = i17 - i21;
            int i24 = this.f26363p0;
            if (i24 == 1 && this.U > 0.0f) {
                i24 = this.f26362o0;
            }
            float f22 = this.I;
            if (f22 >= 0.0f) {
                paint7.setAlpha((int) (this.U * 26.0f * f22));
                paint6.setAlpha((int) (this.U * 178.0f * this.I));
                paint5.setAlpha((int) (this.I * 178.0f));
                paint8.setAlpha((int) (this.I * 255.0f));
            } else {
                paint7.setAlpha((int) (this.U * 26.0f * this.H));
                paint6.setAlpha((int) (this.U * 178.0f * this.H));
                paint5.setAlpha((int) (this.H * 178.0f));
                paint8.setAlpha((int) (this.H * 255.0f));
            }
            int i25 = i11 + i20;
            float f23 = i25;
            int i26 = i14 + i20;
            float f24 = i26;
            int i27 = i11 + i16;
            int i28 = i27 - i20;
            float f25 = i28;
            int i29 = i24;
            Paint paint10 = paint6;
            canvas.drawRect(f23, f24, f25, i26 + i10, paint5);
            int i30 = i17 + i14;
            int i31 = i30 - i20;
            float f26 = i31;
            canvas.drawRect(f23, f24, i25 + i10, f26, paint5);
            canvas.drawRect(f23, i31 - i10, f25, f26, paint5);
            canvas.drawRect(i28 - i10, f24, f25, f26, paint5);
            int i32 = 0;
            while (true) {
                int i33 = 3;
                if (i32 >= 3) {
                    break;
                }
                int i34 = 2;
                if (i29 == 2) {
                    int i35 = 1;
                    while (i35 < 4) {
                        if (i32 == i34 && i35 == i33) {
                            paint3 = paint7;
                            i12 = i35;
                        } else {
                            int i36 = i11 + iDp3;
                            int i37 = i22 / 3;
                            float f27 = (i37 * i32) + ((i37 / 3) * i35) + i36;
                            int i38 = i14 + iDp3;
                            float f28 = i38;
                            float f29 = i38 + i23;
                            Paint paint11 = paint7;
                            i12 = i35;
                            canvas.drawLine(f27, f28, f27, f29, paint11);
                            paint3 = paint11;
                            canvas.drawLine(f27, f28, f27, f29, paint10);
                            int i39 = i23 / 3;
                            float f30 = i36;
                            float f31 = (i39 * i32) + ((i39 / 3) * i12) + i38;
                            float f32 = i36 + i22;
                            canvas.drawLine(f30, f31, f32, f31, paint3);
                            canvas.drawLine(f30, f31, f32, f31, paint10);
                        }
                        i35 = i12 + 1;
                        paint7 = paint3;
                        i34 = 2;
                        i33 = 3;
                    }
                    paint = paint7;
                } else {
                    paint = paint7;
                    if (i29 == 3 && i32 > 0) {
                        int i40 = i11 + iDp3;
                        float f33 = ((i22 / 3) * i32) + i40;
                        int i41 = i14 + iDp3;
                        float f34 = i41;
                        float f35 = i41 + i23;
                        canvas.drawLine(f33, f34, f33, f35, paint);
                        canvas.drawLine(f33, f34, f33, f35, paint10);
                        float f36 = i40;
                        float f37 = ((i23 / 3) * i32) + i41;
                        float f38 = i40 + i22;
                        canvas.drawLine(f36, f37, f38, f37, paint);
                        paint2 = paint10;
                        canvas.drawLine(f36, f37, f38, f37, paint2);
                    }
                    i32++;
                    paint10 = paint2;
                    paint7 = paint;
                }
                paint2 = paint10;
                i32++;
                paint10 = paint2;
                paint7 = paint;
            }
            float f39 = i11;
            float f40 = i14;
            float f41 = i11 + iDp2;
            float f42 = i14 + iDp3;
            canvas.drawRect(f39, f40, f41, f42, paint8);
            float f43 = i11 + iDp3;
            float f44 = i14 + iDp2;
            canvas.drawRect(f39, f40, f43, f44, paint8);
            float f45 = i27 - iDp2;
            float f46 = i27;
            canvas.drawRect(f45, f40, f46, f42, paint8);
            float f47 = i27 - iDp3;
            canvas.drawRect(f47, f40, f46, f44, paint8);
            float f48 = i30 - iDp3;
            float f49 = i30;
            canvas.drawRect(f39, f48, f41, f49, paint8);
            float f50 = i30 - iDp2;
            canvas.drawRect(f39, f50, f43, f49, paint8);
            canvas.drawRect(f45, f48, f46, f49, paint8);
            canvas.drawRect(f47, f50, f46, f49, paint8);
            canvas.restore();
        } else {
            float f51 = f11 * 2.0f;
            float measuredWidth = getMeasuredWidth() - f51;
            float measuredHeight = (((getMeasuredHeight() - this.C) - (!z10 ? AndroidUtilities.statusBarHeight : 0)) - this.D) - f51;
            this.f26343a = (int) Math.min(measuredWidth, measuredHeight);
            Bitmap bitmap = this.f26348c0;
            if (bitmap == null || bitmap.getWidth() != this.f26343a) {
                Bitmap bitmap2 = this.f26348c0;
                boolean z11 = bitmap2 != null;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                    this.f26348c0 = null;
                }
                try {
                    int i42 = this.f26343a;
                    this.f26348c0 = Bitmap.createBitmap(i42, i42, Bitmap.Config.ARGB_8888);
                    Canvas canvas2 = new Canvas(this.f26348c0);
                    float f52 = this.f26343a;
                    f10 = 2.0f;
                    try {
                        canvas2.drawRect(0.0f, 0.0f, f52, f52, paint9);
                        try {
                            int i43 = this.f26343a;
                            canvas2.drawCircle(i43 / 2, i43 / 2, i43 / 2, this.f26349d0);
                            canvas2.setBitmap(null);
                            if (!z11) {
                                this.H = 0.0f;
                                this.J = SystemClock.elapsedRealtime();
                            }
                        } catch (Throwable unused) {
                        }
                    } catch (Throwable unused2) {
                        paint9 = paint9;
                    }
                } catch (Throwable unused3) {
                    f10 = 2.0f;
                }
            } else {
                f10 = 2.0f;
            }
            if (this.f26348c0 != null) {
                paint4.setAlpha((int) (this.H * 255.0f));
                paint9.setAlpha((int) (this.H * 127.0f));
                float f53 = this.f26343a;
                float fA = com.google.android.recaptcha.internal.a.A(measuredWidth, f53, f10, f11);
                this.f26345b = fA;
                float fA2 = com.google.android.recaptcha.internal.a.A(measuredHeight, f53, f10, f11) + (!z10 ? AndroidUtilities.statusBarHeight : 0);
                this.f26347c = fA2;
                float f54 = fA2 + f53;
                canvas.drawRect(0.0f, 0.0f, getWidth(), (int) this.f26347c, paint9);
                float f55 = (int) f54;
                canvas.drawRect(0.0f, (int) this.f26347c, (int) this.f26345b, f55, paint9);
                canvas.drawRect((int) (fA + f53), (int) this.f26347c, getWidth(), f55, paint9);
                canvas.drawRect(0.0f, f55, getWidth(), getHeight(), paint9);
                canvas.drawBitmap(this.f26348c0, (int) this.f26345b, (int) this.f26347c, paint4);
                if (getMeasuredHeight() > getMeasuredWidth() && this.f26353f0 != null) {
                    canvas.save();
                    canvas.translate(getMeasuredWidth() / f10, f54 + AndroidUtilities.dp(16.0f));
                    this.f26353f0.draw(canvas);
                    canvas.restore();
                }
            }
        }
        if (this.H < 1.0f) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j10 = jElapsedRealtime - this.J;
            if (j10 > 17) {
                j10 = 17;
            }
            this.J = jElapsedRealtime;
            float f56 = (j10 / 180.0f) + this.H;
            this.H = f56;
            if (f56 > 1.0f) {
                this.H = 1.0f;
            }
            invalidate();
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f26344a0) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        i();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float f10 = this.R;
        RectF rectF = this.f26368y;
        int x8 = (int) (motionEvent.getX() - ((ViewGroup) getParent()).getX());
        int y10 = (int) (motionEvent.getY() - ((ViewGroup) getParent()).getY());
        float f11 = !this.T ? AndroidUtilities.statusBarHeight : 0;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                this.f26344a0 = false;
                h(false);
                if (this.f26361n0 != 1) {
                    this.f26361n0 = 1;
                    a aVar = this.W;
                    if (aVar != null) {
                        n nVar = (n) aVar;
                        CropAreaView cropAreaView = nVar.f48626a;
                        cropAreaView.g(1, true);
                        nVar.d(cropAreaView.getTargetRectToFill());
                    }
                }
                return false;
            }
            if (actionMasked == 2 && this.f26361n0 != 1) {
                rectF.set(this.f26367x);
                float f12 = x8 - this.A;
                float f13 = y10 - this.B;
                this.A = x8;
                this.B = y10;
                boolean z10 = Math.abs(f12) > Math.abs(f13);
                switch (j.b(this.f26361n0)) {
                    case 1:
                        rectF.left += f12;
                        rectF.top += f13;
                        if (this.f26366w > 0.0f) {
                            float fWidth = rectF.width();
                            float fHeight = rectF.height();
                            if (z10) {
                                c(rectF, this.f26366w);
                            } else {
                                b(rectF, this.f26366w);
                            }
                            rectF.left -= rectF.width() - fWidth;
                            rectF.top -= rectF.width() - fHeight;
                        }
                        break;
                    case 2:
                        rectF.right += f12;
                        rectF.top += f13;
                        if (this.f26366w > 0.0f) {
                            float fHeight2 = rectF.height();
                            if (z10) {
                                c(rectF, this.f26366w);
                            } else {
                                b(rectF, this.f26366w);
                            }
                            rectF.top -= rectF.width() - fHeight2;
                        }
                        break;
                    case 3:
                        rectF.left += f12;
                        rectF.bottom += f13;
                        if (this.f26366w > 0.0f) {
                            float fWidth2 = rectF.width();
                            if (z10) {
                                c(rectF, this.f26366w);
                            } else {
                                b(rectF, this.f26366w);
                            }
                            rectF.left -= rectF.width() - fWidth2;
                        }
                        break;
                    case 4:
                        rectF.right += f12;
                        rectF.bottom += f13;
                        float f14 = this.f26366w;
                        if (f14 > 0.0f) {
                            if (!z10) {
                                b(rectF, f14);
                            } else {
                                c(rectF, f14);
                            }
                        }
                        break;
                    case 5:
                        rectF.top += f13;
                        float f15 = this.f26366w;
                        if (f15 > 0.0f) {
                            b(rectF, f15);
                        }
                        break;
                    case 6:
                        rectF.left += f12;
                        float f16 = this.f26366w;
                        if (f16 > 0.0f) {
                            c(rectF, f16);
                        }
                        break;
                    case 7:
                        rectF.bottom += f13;
                        float f17 = this.f26366w;
                        if (f17 > 0.0f) {
                            b(rectF, f17);
                        }
                        break;
                    case 8:
                        rectF.right += f12;
                        float f18 = this.f26366w;
                        if (f18 > 0.0f) {
                            c(rectF, f18);
                        }
                        break;
                }
                if (rectF.left < f10) {
                    float f19 = this.f26366w;
                    if (f19 > 0.0f) {
                        rectF.bottom = com.google.android.recaptcha.internal.a.A(rectF.right, f10, f19, rectF.top);
                    }
                    rectF.left = f10;
                } else if (rectF.right > getWidth() - f10) {
                    rectF.right = getWidth() - f10;
                    if (this.f26366w > 0.0f) {
                        rectF.bottom = (rectF.width() / this.f26366w) + rectF.top;
                    }
                }
                float f20 = f11 + this.D + f10;
                float f21 = this.C + f10;
                if (rectF.top < f20) {
                    float f22 = this.f26366w;
                    if (f22 > 0.0f) {
                        rectF.right = com.google.android.recaptcha.internal.a.z(rectF.bottom, f20, f22, rectF.left);
                    }
                    rectF.top = f20;
                } else if (rectF.bottom > getHeight() - f21) {
                    rectF.bottom = getHeight() - f21;
                    if (this.f26366w > 0.0f) {
                        rectF.right = (rectF.height() * this.f26366w) + rectF.left;
                    }
                }
                float fWidth3 = rectF.width();
                float f23 = this.S;
                if (fWidth3 < f23) {
                    rectF.right = rectF.left + f23;
                }
                float fHeight3 = rectF.height();
                float f24 = this.S;
                if (fHeight3 < f24) {
                    rectF.bottom = rectF.top + f24;
                }
                float f25 = this.f26366w;
                if (f25 > 0.0f) {
                    if (f25 < 1.0f) {
                        float fWidth4 = rectF.width();
                        float f26 = this.S;
                        if (fWidth4 <= f26) {
                            rectF.right = rectF.left + f26;
                            rectF.bottom = (rectF.width() / this.f26366w) + rectF.top;
                        }
                    } else {
                        float fHeight4 = rectF.height();
                        float f27 = this.S;
                        if (fHeight4 <= f27) {
                            rectF.bottom = rectF.top + f27;
                            rectF.right = (rectF.height() * this.f26366w) + rectF.left;
                        }
                    }
                }
                setActualRect(rectF);
                a aVar2 = this.W;
                if (aVar2 != null) {
                    n nVar2 = (n) aVar2;
                    CropAreaView cropAreaView2 = nVar2.f48626a;
                    cropAreaView2.g(3, false);
                    RectF rectF2 = nVar2.f48630f;
                    float fCenterX = rectF2.centerX() - cropAreaView2.getCropCenterX();
                    float fCenterY = rectF2.centerY() - cropAreaView2.getCropCenterY();
                    l lVar = nVar2.H;
                    if (lVar != null) {
                        l.f(lVar, fCenterX, fCenterY);
                    }
                    nVar2.r(false);
                    rectF2.set(cropAreaView2.f26367x);
                    nVar2.e(true, false, false, false);
                    return true;
                }
            }
            return false;
        }
        if (!this.f26346b0) {
            this.f26361n0 = 1;
            return false;
        }
        float f28 = x8;
        float f29 = y10;
        if (this.d.contains(f28, f29)) {
            this.f26361n0 = 2;
        } else if (this.f26350e.contains(f28, f29)) {
            this.f26361n0 = 3;
        } else if (this.f26352f.contains(f28, f29)) {
            this.f26361n0 = 4;
        } else if (this.h.contains(f28, f29)) {
            this.f26361n0 = 5;
        } else if (this.f26364r.contains(f28, f29)) {
            this.f26361n0 = 7;
        } else if (this.f26360n.contains(f28, f29)) {
            this.f26361n0 = 6;
        } else if (this.v.contains(f28, f29)) {
            this.f26361n0 = 9;
        } else {
            if (!this.f26365s.contains(f28, f29)) {
                this.f26361n0 = 1;
                return false;
            }
            this.f26361n0 = 8;
        }
        this.A = x8;
        this.B = y10;
        g(3, false);
        this.f26344a0 = true;
        h(true);
        a aVar3 = this.W;
        if (aVar3 != null) {
            n nVar3 = (n) aVar3;
            nVar3.f48626a.d(nVar3.f48630f);
            nVar3.f48631n = 0.0f;
            m mVar = nVar3.I;
            if (mVar != null) {
                mVar.D(false);
                return true;
            }
        }
        return true;
    }

    public void setActualRect(float f10) {
        a(this.f26367x, f10);
        j();
        invalidate();
    }

    public void setBottomPadding(float f10) {
        this.C = f10;
    }

    public void setDimAlpha(float f10) {
        this.G = f10;
    }

    public void setDimVisibility(boolean z10) {
        this.E = z10;
    }

    public void setFrameAlpha(float f10) {
        this.I = f10;
    }

    public void setFreeform(boolean z10) {
        this.f26346b0 = z10;
    }

    public void setIsVideo(boolean z10) {
        this.S = AndroidUtilities.dp(z10 ? 64.0f : 32.0f);
    }

    public void setListener(a aVar) {
        this.W = aVar;
    }

    public void setLockedAspectRatio(float f10) {
        this.f26366w = f10;
    }

    public void setSubtitle(String str) {
        this.f26351e0 = str;
        if (getMeasuredWidth() > 0) {
            i();
        }
    }

    public void setTopPadding(float f10) {
        this.D = f10;
    }

    public void setActualRect(RectF rectF) {
        this.f26367x.set(rectF);
        j();
        invalidate();
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }
}
