package org.telegram.ui.Components;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.View;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;

public abstract class sc extends View {
    public static final int[] S;
    public static final int[] T;
    public static long U;
    public static Long V;
    public static Long W;
    public RectF A;
    public final Path B;
    public final Paint C;
    public final Paint D;
    public final LinearGradient E;
    public final LinearGradient F;
    public final Matrix G;
    public final Matrix H;
    public final i6 I;
    public final i6 J;
    public final i6 K;
    public final i6 L;
    public ag.j3 M;
    public boolean N;
    public boolean O;
    public int P;
    public int[] Q;
    public float[] R;

    public final RectF f32387a;

    public final RectF f32388b;

    public final RectF f32389c;
    public final int d;

    public final boolean f32390e;

    public final int[] f32391f;
    public boolean h;

    public final y5 f32392n;

    public boolean f32393r;

    public final y5 f32394s;
    public final qc[] v;

    public final float[] f32395w;

    public final RectF f32396x;

    public final Paint f32397y;

    static {
        int i10 = org.telegram.ui.ActionBar.g6.lj;
        int i11 = org.telegram.ui.ActionBar.g6.hj;
        int i12 = org.telegram.ui.ActionBar.g6.ij;
        int i13 = org.telegram.ui.ActionBar.g6.pj;
        int i14 = org.telegram.ui.ActionBar.g6.mj;
        int i15 = org.telegram.ui.ActionBar.g6.jj;
        int i16 = org.telegram.ui.ActionBar.g6.nj;
        int i17 = org.telegram.ui.ActionBar.g6.qj;
        int i18 = org.telegram.ui.ActionBar.g6.kj;
        S = new int[]{i10, i11, i12, i13, i14, i15, i16, i17, i13, i18, i18};
        int i19 = R.raw.cache_photos;
        int i20 = R.raw.cache_videos;
        int i21 = R.raw.cache_documents;
        int i22 = R.raw.cache_music;
        int i23 = R.raw.cache_stickers;
        int i24 = R.raw.cache_profile_photos;
        int i25 = R.raw.cache_other;
        T = new int[]{i19, i20, i21, i22, i20, i22, i23, i24, i25, i25, i21};
        U = -1L;
    }

    public sc(Context context, int i10, int[] iArr, int i11, int[] iArr2) {
        super(context);
        this.f32387a = new RectF();
        this.f32388b = new RectF();
        this.f32389c = new RectF();
        this.h = true;
        er erVar = er.h;
        this.f32392n = new y5(this, 750L, erVar);
        this.f32393r = false;
        this.f32394s = new y5(this, 650L, erVar);
        this.f32395w = new float[2];
        this.f32396x = new RectF();
        Paint paint = new Paint(1);
        this.f32397y = paint;
        this.B = new Path();
        Paint paint2 = new Paint(1);
        this.C = paint2;
        Paint paint3 = new Paint(1);
        this.D = paint3;
        i6 i6Var = new i6(false, true, true, false);
        this.I = i6Var;
        i6 i6Var2 = new i6(false, true, true, false);
        this.J = i6Var2;
        i6 i6Var3 = new i6(false, true, true, false);
        this.K = i6Var3;
        i6 i6Var4 = new i6(false, true, true, false);
        this.L = i6Var4;
        this.N = true;
        this.P = -1;
        setLayerType(2, null);
        this.f32391f = iArr2;
        this.d = i11;
        this.f32390e = i11 == 0;
        this.v = new qc[i10];
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23144i6, false));
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(200.0f), new int[]{7263574, -9513642, -12469647, 4307569}, new float[]{0.0f, 0.07f, 0.93f, 1.0f}, tileMode);
        this.E = linearGradient;
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(200.0f), new int[]{7263574, -9513642, -12469647, 4307569}, new float[]{0.0f, 0.07f, 0.93f, 1.0f}, tileMode);
        this.F = linearGradient2;
        this.G = new Matrix();
        this.H = new Matrix();
        paint2.setShader(linearGradient);
        paint3.setShader(linearGradient);
        paint2.setStyle(style);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStrokeJoin(Paint.Join.ROUND);
        i6Var.k(0.2f, 450L, erVar);
        i6Var.v = 0.6f;
        i6Var.r(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G6, false));
        i6Var.u(AndroidUtilities.bold());
        i6Var.t(AndroidUtilities.dp(32.0f));
        i6Var.f29239b = 17;
        i6Var2.k(0.6f, 450L, erVar);
        i6Var2.v = 0.6f;
        i6Var2.r(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23423y6, false));
        i6Var2.t(AndroidUtilities.dp(12.0f));
        i6Var2.f29239b = 17;
        i6Var3.k(0.2f, 450L, erVar);
        i6Var3.v = 0.6f;
        i6Var3.f29238a.setShader(linearGradient2);
        i6Var3.u(AndroidUtilities.bold());
        i6Var3.t(AndroidUtilities.dp(32.0f));
        i6Var3.f29239b = 17;
        i6Var4.k(0.6f, 450L, erVar);
        i6Var4.v = 0.6f;
        i6Var4.f29238a.setShader(linearGradient2);
        i6Var4.u(AndroidUtilities.bold());
        i6Var4.t(AndroidUtilities.dp(12.0f));
        i6Var4.f29239b = 17;
        int i12 = 0;
        while (true) {
            qc[] qcVarArr = this.v;
            if (i12 >= qcVarArr.length) {
                return;
            }
            qc qcVar = new qc(this);
            qcVarArr[i12] = qcVar;
            int iV = org.telegram.ui.ActionBar.g6.v(org.telegram.ui.ActionBar.g6.w0(null, iArr[i12], false), 50331648);
            int iV2 = org.telegram.ui.ActionBar.g6.v(org.telegram.ui.ActionBar.g6.w0(null, iArr[i12], false), 822083583);
            AndroidUtilities.dp(50.0f);
            RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, AndroidUtilities.dp(86.0f), new int[]{iV2, iV}, new float[]{0.3f, 1.0f}, Shader.TileMode.CLAMP);
            qcVar.v = radialGradient;
            Matrix matrix = new Matrix();
            qcVar.f31889w = matrix;
            radialGradient.setLocalMatrix(matrix);
            qcVar.f31884q.setShader(qcVar.v);
            i12++;
        }
    }

    public static float a(float f10) {
        return (float) (((double) (f10 / 180.0f)) * 3.141592653589793d);
    }

    public static boolean b(Canvas canvas, i6 i6Var, float f10, float f11, float f12, float f13) {
        if (f13 <= 0.0f) {
            return false;
        }
        i6Var.f29257w = (int) (f13 * 255.0f);
        i6Var.setBounds(0, 0, 0, 0);
        canvas.save();
        canvas.translate(f10, f11);
        canvas.scale(f12, f12);
        i6Var.draw(canvas);
        canvas.restore();
        return i6Var.f();
    }

    public int c() {
        return 200;
    }

    public abstract void d(int i10, boolean z10);

    @Override
    public final void dispatchDraw(Canvas canvas) {
        char c10;
        float f10;
        float f11;
        char c11;
        boolean z10;
        RectF rectF;
        Paint paint;
        RectF rectF2;
        Path path;
        float f12;
        RectF rectF3;
        float f13;
        RectF rectF4;
        RectF rectF5;
        float f14;
        float f15;
        RectF rectF6;
        float f16;
        float f17;
        float f18;
        float f19;
        RectF rectF7;
        qc qcVar;
        Canvas canvas2 = canvas;
        float fD = this.f32392n.d(this.h ? 1.0f : 0.0f, false);
        float fD2 = this.f32394s.d(this.f32393r ? 1.0f : 0.0f, false);
        RectF rectF8 = this.f32388b;
        RectF rectF9 = this.f32387a;
        rectF8.set(rectF9);
        float fLerp = AndroidUtilities.lerp(0.0f, AndroidUtilities.dpf2(e()), fD2);
        rectF8.inset(fLerp, fLerp);
        RectF rectF10 = this.f32389c;
        rectF10.set(rectF8);
        float fLerp2 = AndroidUtilities.lerp(AndroidUtilities.dpf2(38.0f), AndroidUtilities.dpf2(10.0f), Math.max(fD, fD2));
        rectF10.inset(fLerp2, fLerp2);
        float fLerp3 = AndroidUtilities.lerp(0, AndroidUtilities.dp(60.0f), fD);
        if (V == null) {
            V = Long.valueOf(System.currentTimeMillis());
        }
        boolean z11 = this.h;
        if (!z11 && W == null) {
            W = Long.valueOf(System.currentTimeMillis());
        } else if (z11 && W != null) {
            W = null;
        }
        Long l10 = W;
        float fCurrentTimeMillis = ((l10 == null ? System.currentTimeMillis() : l10.longValue()) - V.longValue()) * 0.6f;
        float[] fArr = this.f32395w;
        hp.a(fArr, fCurrentTimeMillis % 5400.0f);
        float f20 = fArr[0];
        float f21 = fArr[1];
        if (fD > 0.0f) {
            c10 = 1;
            Paint paint2 = this.f32397y;
            paint2.setStrokeWidth(fLerp2);
            f10 = 1.0f;
            int alpha = paint2.getAlpha();
            f11 = 0.0f;
            paint2.setAlpha((int) (alpha * fD));
            c11 = 0;
            canvas2.drawCircle(rectF8.centerX(), rectF8.centerY(), (rectF8.width() - fLerp2) / 2.0f, paint2);
            paint2.setAlpha(alpha);
        } else {
            c10 = 1;
            f10 = 1.0f;
            f11 = 0.0f;
            c11 = 0;
        }
        boolean z12 = fD > 0.0f || fD2 > f11;
        int i10 = 0;
        while (true) {
            qc[] qcVarArr = this.v;
            if (i10 >= qcVarArr.length) {
                break;
            }
            qc qcVar2 = qcVarArr[i10];
            hp.a(fArr, (fCurrentTimeMillis + (i10 * 80)) % 5400.0f);
            float fMin = Math.min(Math.max(fArr[c11], f20), f21);
            float fMin2 = Math.min(Math.max(fArr[c10], f20), f21);
            if (fD < f10 || fMin < fMin2) {
                RectF rectF11 = rectF9;
                float fLerp4 = (fMin + fMin2) / 2.0f;
                float fAbs = Math.abs(fMin2 - fMin) / 2.0f;
                if (fD <= f11) {
                    f12 = 360.0f;
                    float fD3 = qcVar2.f31873e.d(qcVar2.f31872c, false);
                    fAbs = qcVar2.f31874f.d(qcVar2.d, false);
                    rectF3 = rectF10;
                    fLerp4 = fD3;
                } else {
                    f12 = 360.0f;
                    rectF3 = rectF10;
                    if (fD < f10) {
                        fLerp4 = AndroidUtilities.lerp((((float) Math.floor(f21 / 360.0f)) * 360.0f) + qcVar2.f31873e.d(qcVar2.f31872c, false), fLerp4, fD);
                        fAbs = AndroidUtilities.lerp(qcVar2.f31874f.d(qcVar2.d, false), fAbs, fD);
                    }
                }
                boolean z13 = qcVar2.f31873e.f34816i || qcVar2.f31874f.f34816i || z12;
                float f22 = f10 - fD2;
                float f23 = f10 - fD;
                i6 i6Var = qcVar2.f31878k;
                Path path2 = qcVar2.f31883p;
                Paint paint3 = qcVar2.f31886s;
                Paint paint4 = qcVar2.f31884q;
                f13 = fLerp3;
                RectF rectF12 = qcVar2.E.f32396x;
                RectF rectF13 = qcVar2.f31888u;
                float fD4 = qcVar2.f31882o.d(qcVar2.f31881n ? 1.0f : 0.0f, false);
                rectF13.set(rectF8);
                rectF13.inset((-AndroidUtilities.dp(9.0f)) * fD4, fD4 * (-AndroidUtilities.dp(9.0f)));
                float fWidth = (float) (((((double) (rectF3.width() + rectF13.width())) * Math.cos(a(fLerp4))) / 4.0d) + ((double) rectF13.centerX()));
                rectF4 = rectF8;
                float fWidth2 = (float) (((((double) (rectF3.width() + rectF13.width())) * Math.sin(a(fLerp4))) / 4.0d) + ((double) rectF13.centerY()));
                float fD5 = qcVar2.h.d(qcVar2.f31875g, false) * f22 * f23;
                float fD6 = qcVar2.f31880m.d(qcVar2.f31879l, false);
                paint4.setAlpha((int) (f22 * 255.0f));
                if (fAbs * 2.0f >= 359.0f) {
                    canvas2.saveLayerAlpha(rectF13, 255, 31);
                    canvas2.drawCircle(rectF13.centerX(), rectF13.centerY(), rectF13.width() / 2.0f, paint3);
                    canvas2.drawRect(rectF13, paint4);
                    f16 = fD5;
                    f14 = f21;
                    qcVar2.a(canvas, rectF13.centerX(), rectF13.centerY(), fWidth, fWidth2, 0.0f, 359.0f, rectF3.width() / 2.0f, rectF13.width() / 2.0f, f16, Math.max(0.0f, (f23 / 0.75f) - 0.75f) * fD6);
                    qcVar = qcVar2;
                    canvas2 = canvas;
                    canvas2.drawCircle(rectF3.centerX(), rectF3.centerY(), rectF3.width() / 2.0f, qcVar.f31887t);
                    canvas2.restore();
                    i10 = i10;
                    rectF5 = rectF11;
                    rectF7 = rectF12;
                    f17 = fWidth;
                    f18 = fWidth2;
                    f19 = 0.0f;
                } else {
                    rectF5 = rectF11;
                    f14 = f21;
                    float fMin3 = Math.min(Math.min(f13, (rectF13.width() - rectF3.width()) / 4.0f), (float) (((double) (rectF3.width() / 2.0f)) * ((double) (fAbs / 180.0f)) * 3.141592653589793d));
                    float fWidth3 = (rectF13.width() - rectF3.width()) / 2.0f;
                    if (qcVar2.f31890x == fLerp4 && qcVar2.f31891y == fAbs && qcVar2.f31892z == fMin3 && qcVar2.A == fWidth3 && qcVar2.B == rectF13.width() && qcVar2.C == rectF13.centerX() && qcVar2.D == rectF13.centerY()) {
                        f15 = fLerp4;
                    } else {
                        qcVar2.f31890x = fLerp4;
                        qcVar2.f31891y = fAbs;
                        qcVar2.f31892z = fMin3;
                        qcVar2.A = fWidth3;
                        qcVar2.B = rectF13.width();
                        qcVar2.C = rectF13.centerX();
                        qcVar2.D = rectF13.centerY();
                        float f24 = fLerp4 - fAbs;
                        float f25 = fLerp4 + fAbs;
                        boolean z14 = fMin3 > 0.0f;
                        float f26 = fMin3 * 2.0f;
                        f15 = fLerp4;
                        float fWidth4 = (fMin3 / ((float) (((double) (rectF13.width() - f26)) * 3.141592653589793d))) * f12;
                        float fWidth5 = ((fAbs > 175.0f ? 0 : 1) * 0.5f) + ((fMin3 / ((float) (((double) (rectF3.width() + f26)) * 3.141592653589793d))) * f12);
                        float fWidth6 = (rectF13.width() / 2.0f) - fMin3;
                        float fWidth7 = (rectF3.width() / 2.0f) + fMin3;
                        path2.rewind();
                        float f27 = f25 - f24;
                        if (f27 >= 0.5f) {
                            if (z14) {
                                double d = fWidth6;
                                float f28 = f24 + fWidth4;
                                double dB = i0.a.b(a(f28), d, rectF13.centerX());
                                double dSin = (Math.sin(a(f28)) * d) + ((double) rectF13.centerY());
                                float f29 = (float) dB;
                                float f30 = (float) dSin;
                                rectF12.set(f29 - fMin3, f30 - fMin3, f29 + fMin3, f30 + fMin3);
                                path2.arcTo(rectF12, f28 - 90.0f, 90.0f);
                            }
                            path2.arcTo(rectF13, f24 + fWidth4, f27 - (fWidth4 * 2.0f));
                            if (z14 != 0) {
                                double d10 = fWidth6;
                                float f31 = f25 - fWidth4;
                                float fB = (float) i0.a.b(a(f31), d10, rectF13.centerX());
                                float fSin = (float) ((Math.sin(a(f31)) * d10) + ((double) rectF13.centerY()));
                                rectF12.set(fB - fMin3, fSin - fMin3, fB + fMin3, fSin + fMin3);
                                path2.arcTo(rectF12, f31, 90.0f);
                                double d11 = fWidth7;
                                float f32 = f25 - fWidth5;
                                float fB2 = (float) i0.a.b(a(f32), d11, rectF3.centerX());
                                float fSin2 = (float) ((Math.sin(a(f32)) * d11) + ((double) rectF3.centerY()));
                                rectF12.set(fB2 - fMin3, fSin2 - fMin3, fB2 + fMin3, fSin2 + fMin3);
                                path2.arcTo(rectF12, f32 + 90.0f, 90.0f);
                            }
                            rectF6 = rectF3;
                            path2.arcTo(rectF6, f25 - fWidth5, -(f27 - (fWidth5 * 2.0f)));
                            if (z14) {
                                double d12 = fWidth7;
                                float f33 = f24 + fWidth5;
                                double dB2 = i0.a.b(a(f33), d12, rectF6.centerX());
                                double dSin2 = (Math.sin(a(f33)) * d12) + ((double) rectF6.centerY());
                                float f34 = (float) dB2;
                                float f35 = (float) dSin2;
                                rectF12.set(f34 - fMin3, f35 - fMin3, f34 + fMin3, f35 + fMin3);
                                path2.arcTo(rectF12, f33 + 180.0f, 90.0f);
                            }
                            path2.close();
                            path2.computeBounds(qcVar2.f31885r, false);
                        }
                        float fCenterX = rectF13.centerX();
                        float fCenterY = rectF4.centerY();
                        rectF13.width();
                        qcVar2.f31889w.reset();
                        qcVar2.f31889w.setTranslate(fCenterX, fCenterY);
                        qcVar2.v.setLocalMatrix(qcVar2.f31889w);
                        canvas2.saveLayerAlpha(rectF13, 255, 31);
                        canvas2.drawPath(path2, paint3);
                        canvas2.drawRect(rectF13, paint4);
                        rectF3 = rectF6;
                        f16 = fD5;
                        f17 = fWidth;
                        f18 = fWidth2;
                        f19 = 0.0f;
                        rectF7 = rectF12;
                        qcVar2.a(canvas, rectF13.centerX(), rectF13.centerY(), f17, f18, f15 - fAbs, f15 + fAbs, rectF6.width() / 2.0f, rectF13.width() / 2.0f, f16, Math.max(0.0f, (f23 / 0.75f) - 0.75f) * fD6);
                        qcVar = qcVar2;
                        canvas2 = canvas;
                        canvas2.restore();
                    }
                    i10 = i10;
                    fAbs = fAbs;
                    rectF6 = rectF3;
                    float fCenterX2 = rectF13.centerX();
                    float fCenterY2 = rectF4.centerY();
                    rectF13.width();
                    qcVar2.f31889w.reset();
                    qcVar2.f31889w.setTranslate(fCenterX2, fCenterY2);
                    qcVar2.v.setLocalMatrix(qcVar2.f31889w);
                    canvas2.saveLayerAlpha(rectF13, 255, 31);
                    canvas2.drawPath(path2, paint3);
                    canvas2.drawRect(rectF13, paint4);
                    rectF3 = rectF6;
                    f16 = fD5;
                    f17 = fWidth;
                    f18 = fWidth2;
                    f19 = 0.0f;
                    rectF7 = rectF12;
                    qcVar2.a(canvas, rectF13.centerX(), rectF13.centerY(), f17, f18, f15 - fAbs, f15 + fAbs, rectF6.width() / 2.0f, rectF13.width() / 2.0f, f16, Math.max(0.0f, (f23 / 0.75f) - 0.75f) * fD6);
                    qcVar = qcVar2;
                    canvas2 = canvas;
                    canvas2.restore();
                }
                float fD7 = qcVar.f31877j.d(qcVar.f31876i, false);
                rectF7.set(f17 - f19, f18 - f19, f17 + f19, f18 + f19);
                if (fD7 != f10) {
                    canvas2.save();
                    canvas2.scale(fD7, fD7, rectF7.centerX(), rectF7.centerY());
                }
                r38.f29257w = (int) (f16 * 255.0f);
                r38.setBounds((int) rectF7.left, (int) rectF7.top, (int) rectF7.right, (int) rectF7.bottom);
                i6Var.draw(canvas2);
                if (fD7 != f10) {
                    canvas2.restore();
                }
                z12 = z13;
            } else {
                rectF4 = rectF8;
                rectF5 = rectF9;
                rectF3 = rectF10;
                fLerp2 = fLerp2;
                f13 = fLerp3;
                f14 = f21;
                i10 = i10;
                fD2 = fD2;
            }
            i10++;
            fD2 = fD2;
            f21 = f14;
            rectF10 = rectF3;
            fLerp2 = fLerp2;
            fD = fD;
            fLerp3 = f13;
            f20 = f20;
            fArr = fArr;
            rectF8 = rectF4;
            rectF9 = rectF5;
            c10 = 1;
            f11 = 0.0f;
            c11 = 0;
        }
        float f36 = fD;
        RectF rectF14 = rectF8;
        RectF rectF15 = rectF9;
        float f37 = fLerp2;
        float f38 = fD2;
        i6 i6Var2 = this.J;
        i6 i6Var3 = this.I;
        int i11 = this.d;
        if (i11 == 0) {
            float f39 = (f10 - f38) * (f10 - f36);
            if (b(canvas2, i6Var3, rectF14.centerX(), rectF14.centerY() - AndroidUtilities.dpf2(5.0f), 1.0f, f39) || z12) {
            }
            b(canvas, i6Var2, rectF14.centerX(), AndroidUtilities.dpf2(22.0f) + rectF14.centerY(), 1.0f, f39);
            z10 = true;
        } else {
            z10 = true;
            if (i11 == 1) {
                float f40 = f10 - f36;
                float fCenterX3 = rectF14.centerX() - AndroidUtilities.lerp(0.0f, AndroidUtilities.dpf2(4.0f), f38);
                float fCenterY3 = rectF14.centerY() - AndroidUtilities.lerp(AndroidUtilities.dpf2(5.0f), 0.0f, f38);
                float fLerp5 = AndroidUtilities.lerp(1.0f, 2.25f, f38);
                float f41 = f40 * f38;
                boolean z15 = b(canvas, this.K, fCenterX3, fCenterY3, fLerp5, f41) || z12;
                float f42 = (1.0f - f38) * f40;
                boolean z16 = b(canvas, i6Var3, fCenterX3, fCenterY3, fLerp5, f42) || z15;
                float fLerp6 = AndroidUtilities.lerp(0.0f, AndroidUtilities.dpf2(26.0f), f38) + rectF14.centerX();
                float fLerp7 = AndroidUtilities.lerp(AndroidUtilities.dpf2(22.0f), -AndroidUtilities.dpf2(18.0f), f38) + rectF14.centerY();
                float fLerp8 = AndroidUtilities.lerp(1.0f, 1.4f, f38);
                if (b(canvas, this.L, fLerp6, fLerp7, fLerp8, f41) || z16) {
                }
                b(canvas, i6Var2, fLerp6, fLerp7, fLerp8, f42);
            }
        }
        if (f38 > 0.0f) {
            if (this.M == null) {
                ag.j3 j3Var = new ag.j3(25);
                this.M = j3Var;
                j3Var.N = 100;
                j3Var.M = z10;
                j3Var.G = z10;
                j3Var.K = false;
                j3Var.H = z10;
                j3Var.f514r = 18;
                j3Var.B = false;
                j3Var.f506j = AndroidUtilities.dp(80.0f);
                ag.j3 j3Var2 = this.M;
                j3Var2.f518w = 0.85f;
                j3Var2.v = 0.85f;
                j3Var2.f517u = 0.85f;
                j3Var2.c();
                rectF = rectF15;
            } else {
                RectF rectF16 = this.A;
                rectF = rectF15;
                if (rectF16 == null || !rectF16.equals(rectF)) {
                }
                canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
                this.M.e(canvas, f38);
                int i12 = (int) (f38 * 255.0f);
                Paint paint5 = this.D;
                paint5.setAlpha(i12);
                canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint5);
                canvas.restore();
                paint = this.C;
                paint.setStrokeWidth(f37);
                paint.setAlpha(i12);
                canvas.drawCircle(rectF14.centerX(), rectF14.centerY(), (rectF14.width() - f37) / 2.0f, paint);
                rectF2 = this.A;
                path = this.B;
                if (rectF2 != null || !rectF2.equals(rectF)) {
                    if (this.A == null) {
                        this.A = new RectF();
                    }
                    this.A.set(rectF);
                    path.rewind();
                    if (i11 == 0) {
                        path.moveTo(rectF14.width() * 0.348f, rectF14.height() * 0.538f);
                        path.lineTo(rectF14.width() * 0.447f, rectF14.height() * 0.636f);
                        path.lineTo(rectF14.width() * 0.678f, rectF14.height() * 0.402f);
                    } else if (i11 == z10) {
                        path.moveTo(rectF14.width() * 0.2929f, rectF14.height() * 0.4369f);
                        path.lineTo(rectF14.width() * 0.381f, rectF14.height() * 0.35f);
                        path.lineTo(rectF14.width() * 0.4691f, rectF14.height() * 0.4369f);
                        path.moveTo(rectF14.width() * 0.381f, rectF14.height() * 0.35f);
                        path.lineTo(rectF14.width() * 0.381f, rectF14.height() * 0.6548f);
                        path.moveTo(rectF14.width() * 0.5214f, rectF14.height() * 0.5821f);
                        path.lineTo(rectF14.width() * 0.6095f, rectF14.height() * 0.669f);
                        path.lineTo(rectF14.width() * 0.6976f, rectF14.height() * 0.5821f);
                        path.moveTo(rectF14.width() * 0.6095f, rectF14.height() * 0.669f);
                        path.lineTo(rectF14.width() * 0.6095f, rectF14.height() * 0.3643f);
                    }
                    path.offset(rectF14.left, rectF14.top);
                }
                if (i11 == 0) {
                    paint.setStrokeWidth(AndroidUtilities.dpf2(10.0f));
                    canvas.drawPath(path, paint);
                }
            }
            float fMin4 = Math.min(getMeasuredHeight(), Math.min(getMeasuredWidth(), AndroidUtilities.dp(150.0f)));
            this.M.f499a.set(0.0f, 0.0f, fMin4, fMin4);
            this.M.f499a.offset((getMeasuredWidth() - this.M.f499a.width()) / 2.0f, (getMeasuredHeight() - this.M.f499a.height()) / 2.0f);
            this.M.f500b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            this.M.f();
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
            this.M.e(canvas, f38);
            int i13 = (int) (f38 * 255.0f);
            Paint paint6 = this.D;
            paint6.setAlpha(i13);
            canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint6);
            canvas.restore();
            paint = this.C;
            paint.setStrokeWidth(f37);
            paint.setAlpha(i13);
            canvas.drawCircle(rectF14.centerX(), rectF14.centerY(), (rectF14.width() - f37) / 2.0f, paint);
            rectF2 = this.A;
            path = this.B;
            if (rectF2 != null) {
                if (this.A == null) {
                    this.A = new RectF();
                }
                this.A.set(rectF);
                path.rewind();
                if (i11 == 0) {
                    path.moveTo(rectF14.width() * 0.348f, rectF14.height() * 0.538f);
                    path.lineTo(rectF14.width() * 0.447f, rectF14.height() * 0.636f);
                    path.lineTo(rectF14.width() * 0.678f, rectF14.height() * 0.402f);
                } else if (i11 == z10) {
                    path.moveTo(rectF14.width() * 0.2929f, rectF14.height() * 0.4369f);
                    path.lineTo(rectF14.width() * 0.381f, rectF14.height() * 0.35f);
                    path.lineTo(rectF14.width() * 0.4691f, rectF14.height() * 0.4369f);
                    path.moveTo(rectF14.width() * 0.381f, rectF14.height() * 0.35f);
                    path.lineTo(rectF14.width() * 0.381f, rectF14.height() * 0.6548f);
                    path.moveTo(rectF14.width() * 0.5214f, rectF14.height() * 0.5821f);
                    path.lineTo(rectF14.width() * 0.6095f, rectF14.height() * 0.669f);
                    path.lineTo(rectF14.width() * 0.6976f, rectF14.height() * 0.5821f);
                    path.moveTo(rectF14.width() * 0.6095f, rectF14.height() * 0.669f);
                    path.lineTo(rectF14.width() * 0.6095f, rectF14.height() * 0.3643f);
                }
                path.offset(rectF14.left, rectF14.top);
            } else {
                if (this.A == null) {
                    this.A = new RectF();
                }
                this.A.set(rectF);
                path.rewind();
                if (i11 == 0) {
                    path.moveTo(rectF14.width() * 0.348f, rectF14.height() * 0.538f);
                    path.lineTo(rectF14.width() * 0.447f, rectF14.height() * 0.636f);
                    path.lineTo(rectF14.width() * 0.678f, rectF14.height() * 0.402f);
                } else if (i11 == z10) {
                    path.moveTo(rectF14.width() * 0.2929f, rectF14.height() * 0.4369f);
                    path.lineTo(rectF14.width() * 0.381f, rectF14.height() * 0.35f);
                    path.lineTo(rectF14.width() * 0.4691f, rectF14.height() * 0.4369f);
                    path.moveTo(rectF14.width() * 0.381f, rectF14.height() * 0.35f);
                    path.lineTo(rectF14.width() * 0.381f, rectF14.height() * 0.6548f);
                    path.moveTo(rectF14.width() * 0.5214f, rectF14.height() * 0.5821f);
                    path.lineTo(rectF14.width() * 0.6095f, rectF14.height() * 0.669f);
                    path.lineTo(rectF14.width() * 0.6976f, rectF14.height() * 0.5821f);
                    path.moveTo(rectF14.width() * 0.6095f, rectF14.height() * 0.669f);
                    path.lineTo(rectF14.width() * 0.6095f, rectF14.height() * 0.3643f);
                }
                path.offset(rectF14.left, rectF14.top);
            }
            if (i11 == 0) {
                paint.setStrokeWidth(AndroidUtilities.dpf2(10.0f));
                canvas.drawPath(path, paint);
            }
        }
        if (this.O) {
            invalidate();
        }
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.sc.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public int e() {
        return 0;
    }

    public final void f(long j10, boolean z10, rc... rcVarArr) {
        boolean z11;
        float f10;
        float f11;
        boolean z12;
        qc qcVar;
        float f12;
        float f13;
        float f14;
        qc qcVar2;
        qc[] qcVarArr;
        float f15;
        long j11;
        float f16;
        float f17;
        boolean z13;
        rc[] rcVarArr2 = rcVarArr;
        y5 y5Var = this.f32392n;
        y5 y5Var2 = this.f32394s;
        i6 i6Var = this.L;
        i6 i6Var2 = this.K;
        i6 i6Var3 = this.J;
        i6 i6Var4 = this.I;
        qc[] qcVarArr2 = this.v;
        float f18 = 1.0f;
        if (rcVarArr2 == null || rcVarArr2.length == 0) {
            this.h = false;
            this.f32393r = j10 == 0;
            if (z10) {
                z11 = true;
            } else {
                z11 = true;
                y5Var.d(0.0f, true);
                y5Var2.d(this.f32393r ? 1.0f : 0.0f, true);
            }
            i6Var2.q(i6Var4.f29243g, false, z11);
            i6Var4.q("0", z10, z11);
            i6Var2.q("0", z10, z11);
            i6Var.q(i6Var3.f29243g, false, z11);
            i6Var3.q("KB", z10, z11);
            i6Var.q("KB", z10, z11);
            for (qc qcVar3 : qcVarArr2) {
                qcVar3.f31875g = 0.0f;
                if (!z10) {
                    qcVar3.h.d(0.0f, z11);
                }
            }
            invalidate();
            return;
        }
        this.h = false;
        if (!z10) {
            y5Var.d(0.0f, true);
        }
        SpannableString spannableString = new SpannableString("%");
        int length = rcVarArr2.length;
        SpannableString spannableString2 = spannableString;
        long j12 = 0;
        int i10 = 0;
        while (i10 < rcVarArr2.length) {
            if (rcVarArr2[i10] == null) {
                rc rcVar = new rc();
                rcVarArr2[i10] = rcVar;
                rcVar.f32127c = 0L;
            }
            rc rcVar2 = rcVarArr2[i10];
            rcVar2.f32125a = i10;
            boolean z14 = rcVar2.f32126b;
            if (z14) {
                j12 += rcVar2.f32127c;
            }
            if (rcVar2.f32127c <= 0 || !z14) {
                length--;
            }
            i10++;
            j12 = j12;
        }
        long j13 = j12;
        if (j13 <= 0) {
            this.h = false;
            this.f32393r = j10 <= 0;
            if (z10) {
                z13 = true;
            } else {
                z13 = true;
                y5Var.d(0.0f, true);
                y5Var2.d(this.f32393r ? 1.0f : 0.0f, true);
            }
            i6Var2.q(i6Var4.f29243g, false, z13);
            i6Var4.q("0", z10, z13);
            i6Var2.q("0", z10, z13);
            i6Var.q(i6Var3.f29243g, false, z13);
            i6Var3.q("KB", z10, z13);
            i6Var.q("KB", z10, z13);
            int i11 = 0;
            while (i11 < qcVarArr2.length) {
                qc qcVar4 = qcVarArr2[i11];
                qcVar4.f31875g = 0.0f;
                if (!z10) {
                    qcVar4.h.d(0.0f, z13);
                }
                i11++;
                z13 = true;
            }
            invalidate();
            return;
        }
        qc[] qcVarArr3 = qcVarArr2;
        int i12 = 0;
        int i13 = 0;
        float f19 = 0.0f;
        while (i12 < rcVarArr2.length) {
            rc rcVar3 = rcVarArr2[i12];
            if (rcVar3 == null || !rcVar3.f32126b) {
                j11 = j13;
                f16 = 0.02f;
                f17 = 0.0f;
            } else {
                f16 = 0.02f;
                j11 = j13;
                f17 = rcVar3.f32127c / j11;
            }
            if (f17 > 0.0f && f17 < f16) {
                i13++;
                f19 += f17;
            }
            i12++;
            j13 = j11;
        }
        long j14 = j13;
        Math.min(rcVarArr2.length, qcVarArr3.length);
        int[] iArr = this.Q;
        if (iArr == null || iArr.length != rcVarArr2.length) {
            this.Q = new int[rcVarArr2.length];
        }
        float[] fArr = this.R;
        if (fArr == null || fArr.length != rcVarArr2.length) {
            this.R = new float[rcVarArr2.length];
        }
        int i14 = 0;
        while (i14 < rcVarArr2.length) {
            float[] fArr2 = this.R;
            int i15 = i14;
            rc rcVar4 = rcVarArr2[i15];
            float f20 = f19;
            if (rcVar4 != null) {
                qcVarArr = qcVarArr3;
                if (rcVar4.f32126b) {
                    f15 = rcVar4.f32127c / j14;
                }
                fArr2[i15] = f15;
                i14 = i15 + 1;
                f19 = f20;
                qcVarArr3 = qcVarArr;
            } else {
                qcVarArr = qcVarArr3;
            }
            f15 = 0.0f;
            fArr2[i15] = f15;
            i14 = i15 + 1;
            f19 = f20;
            qcVarArr3 = qcVarArr;
        }
        float f21 = f19;
        qc[] qcVarArr4 = qcVarArr3;
        AndroidUtilities.roundPercents(this.R, this.Q);
        if (this.d == 0) {
            Arrays.sort(rcVarArr2, new k9.a(22));
            for (int i16 = 0; i16 <= rcVarArr2.length; i16++) {
                rc rcVar5 = rcVarArr2[i16];
                if (rcVar5.f32125a == rcVarArr2.length - 1) {
                    rc rcVar6 = rcVarArr2[0];
                    rcVarArr2[0] = rcVar5;
                    rcVarArr2[i16] = rcVar6;
                    break;
                }
            }
        }
        if (length < 2) {
            length = 0;
        }
        float f22 = 360.0f - (length * 2.0f);
        int i17 = 0;
        int i18 = 0;
        float f23 = 0.0f;
        while (i17 < rcVarArr2.length) {
            rc rcVar7 = rcVarArr2[i17];
            int i19 = rcVar7.f32125a;
            int i20 = i17;
            float f24 = !rcVar7.f32126b ? 0.0f : rcVar7.f32127c / j14;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            float f25 = f22;
            spannableStringBuilder.append((CharSequence) String.format("%d", Integer.valueOf(this.Q[i19])));
            SpannableString spannableString3 = spannableString2;
            spannableStringBuilder.append((CharSequence) spannableString3);
            qc qcVar5 = qcVarArr4[i19];
            i6 i6Var5 = i6Var;
            i6 i6Var6 = i6Var2;
            float f26 = (((double) f24) <= 0.05d || f24 >= f18) ? 0.0f : 1.0f;
            qcVar5.f31875g = f26;
            if (f24 >= 0.08f) {
                f10 = f24;
                if (this.Q[i19] < 100) {
                    f11 = 1.0f;
                }
                qcVar5.f31876i = f11;
                qcVar5.f31879l = 1.0f;
                if (z10) {
                    z12 = true;
                } else {
                    y5 y5Var3 = qcVar5.h;
                    z12 = true;
                    y5Var3.d(f26, true);
                    qc qcVar6 = qcVarArr4[i19];
                    qcVar6.f31877j.d(qcVar6.f31876i, true);
                    qc qcVar7 = qcVarArr4[i19];
                    qcVar7.f31880m.d(qcVar7.f31879l, true);
                }
                qcVar = qcVarArr4[i19];
                if (qcVar.f31875g > 0.0f) {
                    qcVar.f31878k.q(spannableStringBuilder, z10, z12);
                }
                if (f10 < 0.02f || f10 <= 0.0f) {
                    f18 = 1.0f;
                    f12 = (1.0f - ((i13 * 0.02f) - f21)) * f10;
                } else {
                    f12 = 0.02f;
                    f18 = 1.0f;
                }
                f13 = (i18 * 2.0f) + (f23 * f25);
                f14 = (f12 * f25) + f13;
                if (f12 <= 0.0f) {
                    qc qcVar8 = qcVarArr4[i19];
                    qcVar8.f31872c = (f13 + f14) / 2.0f;
                    qcVar8.d = Math.abs(f14 - f13) / 2.0f;
                    qcVar2 = qcVarArr4[i19];
                    qcVar2.f31875g = 0.0f;
                    if (!z10) {
                        qcVar2.f31873e.d(qcVar2.f31872c, true);
                        qc qcVar9 = qcVarArr4[i19];
                        qcVar9.f31874f.d(qcVar9.d, true);
                        qc qcVar10 = qcVarArr4[i19];
                        qcVar10.h.d(qcVar10.f31875g, true);
                    }
                } else {
                    qc qcVar11 = qcVarArr4[i19];
                    qcVar11.f31872c = (f13 + f14) / 2.0f;
                    qcVar11.d = Math.abs(f14 - f13) / 2.0f;
                    if (!z10) {
                        qc qcVar12 = qcVarArr4[i19];
                        qcVar12.f31873e.d(qcVar12.f31872c, true);
                        qc qcVar13 = qcVarArr4[i19];
                        qcVar13.f31874f.d(qcVar13.d, true);
                    }
                    f23 += f12;
                    i18++;
                }
                i17 = i20 + 1;
                rcVarArr2 = rcVarArr;
                i6Var2 = i6Var6;
                i6Var = i6Var5;
                f22 = f25;
                spannableString2 = spannableString3;
            } else {
                f10 = f24;
            }
            f11 = 0.85f;
            qcVar5.f31876i = f11;
            qcVar5.f31879l = 1.0f;
            if (z10) {
                y5 y5Var4 = qcVar5.h;
                z12 = true;
                y5Var4.d(f26, true);
                qc qcVar14 = qcVarArr4[i19];
                qcVar14.f31877j.d(qcVar14.f31876i, true);
                qc qcVar15 = qcVarArr4[i19];
                qcVar15.f31880m.d(qcVar15.f31879l, true);
            } else {
                z12 = true;
            }
            qcVar = qcVarArr4[i19];
            if (qcVar.f31875g > 0.0f) {
                qcVar.f31878k.q(spannableStringBuilder, z10, z12);
            }
            if (f10 < 0.02f) {
                f18 = 1.0f;
                f12 = (1.0f - ((i13 * 0.02f) - f21)) * f10;
            } else {
                f18 = 1.0f;
                f12 = (1.0f - ((i13 * 0.02f) - f21)) * f10;
            }
            f13 = (i18 * 2.0f) + (f23 * f25);
            f14 = (f12 * f25) + f13;
            if (f12 <= 0.0f) {
                qc qcVar16 = qcVarArr4[i19];
                qcVar16.f31872c = (f13 + f14) / 2.0f;
                qcVar16.d = Math.abs(f14 - f13) / 2.0f;
                qcVar2 = qcVarArr4[i19];
                qcVar2.f31875g = 0.0f;
                if (!z10) {
                    qcVar2.f31873e.d(qcVar2.f31872c, true);
                    qc qcVar17 = qcVarArr4[i19];
                    qcVar17.f31874f.d(qcVar17.d, true);
                    qc qcVar18 = qcVarArr4[i19];
                    qcVar18.h.d(qcVar18.f31875g, true);
                }
            } else {
                qc qcVar19 = qcVarArr4[i19];
                qcVar19.f31872c = (f13 + f14) / 2.0f;
                qcVar19.d = Math.abs(f14 - f13) / 2.0f;
                if (!z10) {
                    qc qcVar110 = qcVarArr4[i19];
                    qcVar110.f31873e.d(qcVar110.f31872c, true);
                    qc qcVar111 = qcVarArr4[i19];
                    qcVar111.f31874f.d(qcVar111.d, true);
                }
                f23 += f12;
                i18++;
            }
            i17 = i20 + 1;
            rcVarArr2 = rcVarArr;
            i6Var2 = i6Var6;
            i6Var = i6Var5;
            f22 = f25;
            spannableString2 = spannableString3;
        }
        i6 i6Var7 = i6Var;
        i6 i6Var8 = i6Var2;
        String[] strArrSplit = AndroidUtilities.formatFileSize(j14, true, true).split(" ");
        String str = strArrSplit.length > 0 ? strArrSplit[0] : "";
        if (str.length() >= 4 && j14 < 1073741824) {
            str = str.split("\\.")[0];
        }
        i6Var4.q(str, z10, true);
        i6Var3.q(strArrSplit.length > 1 ? strArrSplit[1] : "", z10, true);
        if (y5Var2.f34812c > 0.0f) {
            i6Var8.q(i6Var4.f29243g, z10, true);
            i6Var7.q(i6Var3.f29243g, z10, true);
        }
        this.f32393r = false;
        if (!z10) {
            y5Var2.d(0.0f, true);
        }
        invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.O = true;
        int i10 = 0;
        while (true) {
            qc[] qcVarArr = this.v;
            if (i10 >= qcVarArr.length) {
                return;
            }
            qc qcVar = qcVarArr[i10];
            if (qcVar.f31871b == null) {
                boolean z10 = this.f32390e;
                int[] iArr = this.f32391f;
                if (z10) {
                    qcVar.f31871b = SvgHelper.getBitmap(iArr[i10], AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), -1);
                } else {
                    qcVar.f31871b = BitmapFactory.decodeResource(getContext().getResources(), iArr[i10]);
                }
            }
            i10++;
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        requestLayout();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = 0;
        this.O = false;
        while (true) {
            qc[] qcVarArr = this.v;
            if (i10 >= qcVarArr.length) {
                return;
            }
            Bitmap bitmap = qcVarArr[i10].f31871b;
            if (bitmap != null) {
                bitmap.recycle();
                qcVarArr[i10].f31871b = null;
            }
            i10++;
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int iDp = AndroidUtilities.dp(c());
        int iDp2 = AndroidUtilities.dp(172.0f);
        RectF rectF = this.f32387a;
        rectF.set((size - iDp2) / 2.0f, (iDp - iDp2) / 2.0f, (size + iDp2) / 2.0f, (iDp2 + iDp) / 2.0f);
        Matrix matrix = this.G;
        matrix.reset();
        matrix.setTranslate(rectF.left, 0.0f);
        this.E.setLocalMatrix(matrix);
        Matrix matrix2 = this.H;
        matrix2.reset();
        matrix2.setTranslate(rectF.left, -rectF.centerY());
        this.F.setLocalMatrix(matrix2);
        ag.j3 j3Var = this.M;
        if (j3Var != null) {
            j3Var.f499a.set(0.0f, 0.0f, AndroidUtilities.dp(140.0f), AndroidUtilities.dp(140.0f));
            this.M.f499a.offset((getMeasuredWidth() - this.M.f499a.width()) / 2.0f, (getMeasuredHeight() - this.M.f499a.height()) / 2.0f);
            this.M.f500b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            this.M.f();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(iDp, 1073741824));
    }

    public void setInterceptTouch(boolean z10) {
        this.N = z10;
    }

    public void setSelected(int i10) {
        if (i10 == this.P) {
            return;
        }
        int i11 = 0;
        while (true) {
            qc[] qcVarArr = this.v;
            if (i11 >= qcVarArr.length) {
                this.P = i10;
                invalidate();
                return;
            }
            if (i10 == i11 && qcVarArr[i11].d <= 0.0f) {
                i10 = -1;
            }
            qcVarArr[i11].f31881n = i10 == i11;
            i11++;
        }
    }
}
