package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.text.TextPaint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GenericProvider;
import org.telegram.messenger.LocaleController;

public class CheckBoxBase {
    public static Paint I;
    public static Paint J;
    public int A;
    public float B;
    public String C;
    public cp D;
    public org.telegram.ui.ActionBar.d5 E;
    public org.telegram.ui.ActionBar.c6 F;
    public GenericProvider G;
    public long H;

    public View f26295a;
    public final Paint d;

    public final Paint f26299f;

    public TextPaint f26300g;

    public boolean f26301i;

    public boolean f26304l;

    public boolean f26306n;

    public float f26307o;

    public ObjectAnimator f26308p;

    public boolean f26309q;

    public int f26311s;

    public int f26312t;

    public int f26313u;
    public float v;

    public float f26314w;

    public int f26315x;

    public boolean f26316y;

    public boolean f26317z;

    public final Rect f26296b = new Rect();

    public final RectF f26297c = new RectF();

    public float f26298e = 1.0f;
    public float h = 1.0f;

    public final Path f26302j = new Path();

    public boolean f26303k = true;

    public float f26305m = 1.0f;

    public int f26310r = org.telegram.ui.ActionBar.g6.f23182k7;

    public CheckBoxBase(int i10, View view, org.telegram.ui.ActionBar.c6 c6Var) {
        int i11 = org.telegram.ui.ActionBar.g6.f23203lc;
        this.f26311s = i11;
        this.f26312t = i11;
        this.f26313u = org.telegram.ui.ActionBar.g6.f23124h5;
        this.v = 0.0f;
        this.f26314w = 1.0f;
        this.f26317z = true;
        this.G = new c2(18);
        this.H = 200L;
        this.F = c6Var;
        this.f26295a = view;
        this.B = i10;
        if (I == null) {
            I = new Paint(1);
        }
        Paint paint = new Paint(1);
        this.d = paint;
        paint.setStrokeCap(Paint.Cap.ROUND);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeWidth(AndroidUtilities.dp(1.9f));
        Paint paint2 = new Paint(1);
        this.f26299f = paint2;
        paint2.setStyle(style);
        paint2.setStrokeWidth(AndroidUtilities.dp(1.2f));
    }

    public final void a(Canvas canvas) {
        float f10;
        float fDp;
        float f11;
        float f12;
        Rect rect;
        int iCenterX;
        int iCenterY;
        boolean z10;
        Rect rect2;
        int i10;
        int i11;
        float f13;
        Canvas canvas2;
        int i12;
        Paint paint;
        int i13;
        int i14;
        int i15;
        int i16;
        float f14;
        float f15;
        int i17;
        int i18;
        float f16;
        int i19;
        boolean z11;
        Paint paint2;
        int i20;
        float f17;
        boolean z12;
        int i21;
        int length;
        float f18;
        float f19;
        float fDp2;
        boolean z13;
        Paint paint3;
        int i22;
        int alpha;
        int i23;
        int i24;
        int i25;
        int i26;
        RectF rectF;
        int i27;
        int i28;
        int i29;
        int i30;
        float fDp3 = AndroidUtilities.dp(this.B / 2.0f);
        int i31 = this.A;
        if (i31 != 12 && i31 != 13) {
            if (i31 != 0 && i31 != 11) {
                f10 = fDp3;
                fDp = fDp3 - AndroidUtilities.dp(0.2f);
            }
            if (this.f26306n) {
                f11 = 1.0f;
            } else {
                f11 = this.f26307o;
            }
            if (f11 >= 0.5f) {
                f12 = 1.0f;
            } else {
                f12 = f11 / 0.5f;
            }
            rect = this.f26296b;
            iCenterX = rect.centerX();
            iCenterY = rect.centerY();
            if (this.f26301i || f12 <= 0.0f || f11 < 0.5f || this.f26306n || this.C != null) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                float f20 = iCenterX;
                float f21 = iCenterY;
                rect2 = rect;
                i10 = iCenterX;
                i11 = iCenterY;
                f13 = 0.0f;
                canvas2 = canvas;
                canvas2.saveLayerAlpha(f20 - f10, f21 - f10, f20 + f10, f21 + f10, 255, 31);
            } else {
                rect2 = rect;
                i10 = iCenterX;
                i11 = iCenterY;
                f13 = 0.0f;
                canvas2 = canvas;
            }
            i12 = this.f26311s;
            paint = this.f26299f;
            if (i12 >= 0) {
                if (this.f26317z) {
                    I.setColor(Color.argb((int) (this.f26305m * 25.0f), 0, 0, 0));
                    if (this.A == 8) {
                        paint.setColor(org.telegram.ui.ActionBar.g6.v0(this.f26312t, this.F));
                    } else {
                        paint.setColor(AndroidUtilities.getOffsetColor(-1, org.telegram.ui.ActionBar.g6.v0(this.f26310r, this.F), f11, this.f26305m));
                    }
                } else if (this.f26315x != 0) {
                    paint.setColor(0);
                } else {
                    i13 = this.f26312t;
                    if (i13 < 0) {
                        i13 = this.f26310r;
                    }
                    paint.setColor(AndroidUtilities.getOffsetColor(16777215, org.telegram.ui.ActionBar.g6.v0(i13, this.F), f11, this.f26305m));
                }
                if (!this.f26317z && (i28 = this.A) >= 0 && i28 != 12 && i28 != 13) {
                    if (i28 == 8 || i28 == 10 || i28 == 14) {
                        i14 = i11;
                        f14 = 1.5f;
                        if (this.v > f13) {
                            float fDp4 = f10 - AndroidUtilities.dp(1.5f);
                            float fLerp = AndroidUtilities.lerp(fDp4, this.v, this.f26314w);
                            float f22 = i10;
                            float f23 = i14;
                            i15 = 7;
                            i16 = -1;
                            f15 = 1.0f;
                            canvas2.drawRoundRect(f22 - fDp4, f23 - fDp4, f22 + fDp4, f23 + fDp4, fLerp, fLerp, paint);
                            paint = paint;
                        } else {
                            paint = paint;
                            i15 = 7;
                            i16 = -1;
                            f15 = 1.0f;
                            canvas2.drawCircle(i10, i14, f10 - AndroidUtilities.dp(1.5f), paint);
                        }
                    } else {
                        if (i28 == 6 || i28 == 7) {
                            i14 = i11;
                            f14 = 1.5f;
                            float f24 = i10;
                            float f25 = i14;
                            canvas2.drawCircle(f24, f25, f10 - AndroidUtilities.dp(1.0f), I);
                            canvas2.drawCircle(f24, f25, f10 - AndroidUtilities.dp(1.5f), paint);
                        } else {
                            i14 = i11;
                            f14 = 1.5f;
                            canvas2.drawCircle(i10, i14, f10, I);
                        }
                        i15 = 7;
                        i16 = -1;
                    }
                    I.setColor(org.telegram.ui.ActionBar.g6.v0(this.f26310r, this.F));
                    i17 = this.A;
                    if (i17 == i16 && i17 != i15 && i17 != 8 && i17 != 9 && i17 != 10 && i17 != 14) {
                        if (i17 == 12 || i17 == 13) {
                            i18 = 6;
                            paint.setStyle(Paint.Style.FILL);
                            org.telegram.ui.ActionBar.d5 d5Var = this.E;
                            if (d5Var == null || !d5Var.l()) {
                                paint.setShader(null);
                            } else {
                                org.telegram.ui.ActionBar.d5 d5Var2 = this.E;
                                Shader shader = d5Var2.f22843a;
                                Matrix matrix = d5Var2.f22851k;
                                matrix.reset();
                                this.E.a();
                                matrix.postTranslate(0.0f, (-this.E.f22858r) + rect2.top);
                                shader.setLocalMatrix(matrix);
                                paint.setShader(shader);
                            }
                            canvas2.drawCircle(i10, i14, (f10 - AndroidUtilities.dp(f15)) * this.f26305m, paint);
                            paint.setStyle(Paint.Style.STROKE);
                        } else if (i17 == 0 || i17 == 11) {
                            i18 = 6;
                            canvas2.drawCircle(i10, i14, f10, paint);
                        } else {
                            float f26 = i10;
                            float f27 = f26 - fDp;
                            float f28 = i14;
                            float f29 = f28 - fDp;
                            float f30 = f26 + fDp;
                            float f31 = f28 + fDp;
                            RectF rectF2 = this.f26297c;
                            rectF2.set(f27, f29, f30, f31);
                            int i32 = this.A;
                            if (i32 == 6) {
                                i24 = (int) ((-360.0f) * f11);
                                i25 = 0;
                            } else if (i32 == 1) {
                                i24 = (int) ((-270.0f) * f11);
                                i25 = -90;
                            } else {
                                i24 = (int) (270.0f * f11);
                                if (LocaleController.isRTL) {
                                    i24 = -i24;
                                }
                                i25 = 90;
                            }
                            if (i32 == 6) {
                                int iV0 = org.telegram.ui.ActionBar.g6.v0(this.f26313u, this.F);
                                int iAlpha = Color.alpha(iV0);
                                paint.setColor(iV0);
                                paint.setAlpha((int) (iAlpha * f11));
                                int i33 = i24;
                                float f32 = i33;
                                i26 = i33;
                                rectF = rectF2;
                                i27 = i25;
                                i18 = 6;
                                canvas2.drawArc(rectF, i25, f32, false, paint);
                                int iV1 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.X9, this.F);
                                int iAlpha2 = Color.alpha(iV1);
                                paint.setColor(iV1);
                                paint.setAlpha((int) (iAlpha2 * f11));
                            } else {
                                i26 = i24;
                                rectF = rectF2;
                                i18 = 6;
                                i27 = i25;
                            }
                            canvas2 = canvas;
                            canvas2.drawArc(rectF, i27, i26, false, paint);
                        }
                        if (f12 > f13) {
                            if (f11 < 0.5f) {
                                f16 = 0.0f;
                            } else {
                                f16 = (f11 - 0.5f) / 0.5f;
                            }
                            i19 = this.A;
                            if (i19 == 9) {
                                I.setColor(org.telegram.ui.ActionBar.g6.v0(this.f26312t, this.F));
                            } else if (i19 != 11 || i19 == i18 || i19 == 7 || i19 == 10 || ((!this.f26317z && this.f26311s >= 0) || i19 == 14)) {
                                I.setColor(org.telegram.ui.ActionBar.g6.v0(this.f26311s, this.F));
                            } else {
                                int i34 = this.f26315x;
                                if (i34 != 0) {
                                    I.setColor(i34);
                                } else {
                                    I.setColor(org.telegram.ui.ActionBar.g6.v0(this.f26303k ? org.telegram.ui.ActionBar.g6.f23145i7 : org.telegram.ui.ActionBar.g6.f23163j7, this.F));
                                }
                            }
                            if (this.f26306n) {
                                I.setColor(paint.getColor());
                            } else if (this.h < f15) {
                                I.setColor(i0.b.d(this.h, paint.getColor(), I.getColor()));
                            }
                            z11 = this.f26316y;
                            paint2 = this.d;
                            if (!z11 || (i23 = this.f26310r) < 0) {
                                paint2.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23182k7, this.F));
                            } else {
                                paint2.setColor(org.telegram.ui.ActionBar.g6.v0(i23, this.F));
                            }
                            if (this.h < f15 && org.telegram.ui.ActionBar.g6.I.q()) {
                                paint2.setColor(i0.b.d(this.h, I.getColor(), paint2.getColor()));
                            }
                            if (this.A != -1) {
                                fDp2 = AndroidUtilities.dp(this.B) / 2.0f;
                                int iSave = canvas2.save();
                                canvas2.translate(i10 - fDp2, i14 - fDp2);
                                if (f12 < f15) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                if (z13) {
                                    canvas2.saveLayerAlpha(0.0f, 0.0f, AndroidUtilities.dp(this.B), AndroidUtilities.dp(this.B), 255, 31);
                                }
                                paint3 = (Paint) this.G.provide(null);
                                i22 = this.A;
                                if (i22 != 12 || i22 == 13) {
                                    canvas2 = canvas;
                                    alpha = paint3.getAlpha();
                                    paint3.setAlpha((int) (f12 * 255.0f));
                                    canvas2.drawCircle(fDp2, fDp2, f10 * f12, paint3);
                                    if (paint3 != I) {
                                        paint3.setAlpha(alpha);
                                    }
                                } else if (this.v > 0.0f) {
                                    float fDp5 = f10 - AndroidUtilities.dp(0.5f);
                                    float fLerp2 = AndroidUtilities.lerp(fDp5, this.v, this.f26314w);
                                    float f33 = fDp2 - fDp5;
                                    float f34 = fDp2 + fDp5;
                                    canvas.drawRoundRect(f33, f33, f34, f34, fLerp2, fLerp2, paint3);
                                    float f35 = (f15 - f12) * fDp5;
                                    float fLerp3 = AndroidUtilities.lerp(f35, this.v, this.f26314w);
                                    if (!z13 || f35 <= 0.0f) {
                                        canvas2 = canvas;
                                    } else {
                                        float f36 = fDp2 - f35;
                                        float f37 = fDp2 + f35;
                                        canvas2 = canvas;
                                        canvas2.drawRoundRect(f36, f36, f37, f37, fLerp3, fLerp3, org.telegram.ui.ActionBar.g6.Il);
                                    }
                                } else {
                                    canvas2 = canvas;
                                    float fDp6 = f10 - AndroidUtilities.dp(0.5f);
                                    canvas2.drawCircle(fDp2, fDp2, fDp6, paint3);
                                    float f38 = (f15 - f12) * fDp6;
                                    if (z13 && f38 > 0.0f) {
                                        canvas2.drawCircle(fDp2, fDp2, f38, org.telegram.ui.ActionBar.g6.Il);
                                    }
                                }
                                canvas2.restoreToCount(iSave);
                            }
                            if (this.f26306n) {
                                if (J == null) {
                                    Paint paint4 = new Paint(1);
                                    J = paint4;
                                    paint4.setStyle(Paint.Style.STROKE);
                                    J.setStrokeCap(Paint.Cap.ROUND);
                                    J.setStrokeJoin(Paint.Join.ROUND);
                                    J.setPathEffect(new DashPathEffect(new float[]{AndroidUtilities.dp(0.66f), AndroidUtilities.dp(4.0f)}, 0.0f));
                                }
                                J.setStrokeWidth(AndroidUtilities.dp(1.66f));
                                J.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.M6, this.F));
                                canvas2.drawCircle(i10, i14, AndroidUtilities.dp(9.0f), J);
                            } else if (f16 != 0.0f) {
                                if (this.C != null) {
                                    if (this.f26300g == null) {
                                        i21 = 1;
                                        TextPaint textPaint = new TextPaint(1);
                                        this.f26300g = textPaint;
                                        textPaint.setTypeface(AndroidUtilities.bold());
                                    } else {
                                        i21 = 1;
                                    }
                                    length = this.C.length();
                                    if (length != 0 || length == i21 || length == 2) {
                                        f18 = 14.0f;
                                        f19 = 18.0f;
                                    } else if (length != 3) {
                                        f18 = 8.0f;
                                        f19 = 15.75f;
                                    } else {
                                        f19 = 16.5f;
                                        f18 = 10.0f;
                                    }
                                    this.f26300g.setTextSize(AndroidUtilities.dp(f18));
                                    this.f26300g.setColor(org.telegram.ui.ActionBar.g6.v0(this.f26310r, this.F));
                                    canvas2.save();
                                    float f39 = i10;
                                    canvas2.scale(f16, 1.0f, f39, i14);
                                    String str = this.C;
                                    canvas2.drawText(str, f39 - (this.f26300g.measureText(str) / 2.0f), AndroidUtilities.dp(f19), this.f26300g);
                                    canvas2.restore();
                                } else {
                                    Path path = this.f26302j;
                                    path.reset();
                                    i20 = this.A;
                                    if (i20 == -1) {
                                        f17 = 1.4f;
                                    } else if (i20 == 5) {
                                        f17 = 0.8f;
                                    } else {
                                        f17 = 1.0f;
                                    }
                                    float fDp7 = AndroidUtilities.dp(9.0f * f17) * f16;
                                    float fDp8 = AndroidUtilities.dp(f17 * 4.0f) * f16;
                                    int iDp = i10 - AndroidUtilities.dp(f14);
                                    int iDp2 = AndroidUtilities.dp(4.0f) + i14;
                                    float fSqrt = (float) Math.sqrt((fDp8 * fDp8) / 2.0f);
                                    float f40 = iDp;
                                    float f41 = iDp2;
                                    path.moveTo(f40 - fSqrt, f41 - fSqrt);
                                    path.lineTo(f40, f41);
                                    float fSqrt2 = (float) Math.sqrt((fDp7 * fDp7) / 2.0f);
                                    path.lineTo(f40 + fSqrt2, f41 - fSqrt2);
                                    if (z10 && this.f26298e == 1.0f) {
                                        z12 = false;
                                    } else {
                                        canvas2.save();
                                        float f42 = this.f26298e;
                                        canvas2.scale(f42, f42, i10, i14);
                                        z12 = true;
                                    }
                                    canvas2.drawPath(path, paint2);
                                    if (z12) {
                                        canvas2.restore();
                                    }
                                }
                            }
                        }
                        if (z10) {
                            canvas2.restore();
                        }
                    }
                    i18 = 6;
                    f13 = 0.0f;
                    if (f12 > f13) {
                        if (f11 < 0.5f) {
                            f16 = 0.0f;
                        } else {
                            f16 = (f11 - 0.5f) / 0.5f;
                        }
                        i19 = this.A;
                        if (i19 == 9) {
                            I.setColor(org.telegram.ui.ActionBar.g6.v0(this.f26312t, this.F));
                        } else if (i19 != 11) {
                            I.setColor(org.telegram.ui.ActionBar.g6.v0(this.f26311s, this.F));
                        } else {
                            I.setColor(org.telegram.ui.ActionBar.g6.v0(this.f26311s, this.F));
                        }
                        if (this.f26306n) {
                            I.setColor(paint.getColor());
                        } else if (this.h < f15) {
                            I.setColor(i0.b.d(this.h, paint.getColor(), I.getColor()));
                        }
                        z11 = this.f26316y;
                        paint2 = this.d;
                        if (z11) {
                            paint2.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23182k7, this.F));
                        } else {
                            paint2.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23182k7, this.F));
                        }
                        if (this.h < f15) {
                            paint2.setColor(i0.b.d(this.h, I.getColor(), paint2.getColor()));
                        }
                        if (this.A != -1) {
                            fDp2 = AndroidUtilities.dp(this.B) / 2.0f;
                            int iSave2 = canvas2.save();
                            canvas2.translate(i10 - fDp2, i14 - fDp2);
                            if (f12 < f15) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            if (z13) {
                                canvas2.saveLayerAlpha(0.0f, 0.0f, AndroidUtilities.dp(this.B), AndroidUtilities.dp(this.B), 255, 31);
                            }
                            paint3 = (Paint) this.G.provide(null);
                            i22 = this.A;
                            if (i22 != 12) {
                                canvas2 = canvas;
                                alpha = paint3.getAlpha();
                                paint3.setAlpha((int) (f12 * 255.0f));
                                canvas2.drawCircle(fDp2, fDp2, f10 * f12, paint3);
                                if (paint3 != I) {
                                    paint3.setAlpha(alpha);
                                }
                            } else {
                                canvas2 = canvas;
                                alpha = paint3.getAlpha();
                                paint3.setAlpha((int) (f12 * 255.0f));
                                canvas2.drawCircle(fDp2, fDp2, f10 * f12, paint3);
                                if (paint3 != I) {
                                    paint3.setAlpha(alpha);
                                }
                            }
                            canvas2.restoreToCount(iSave2);
                        }
                        if (this.f26306n) {
                            if (J == null) {
                                Paint paint5 = new Paint(1);
                                J = paint5;
                                paint5.setStyle(Paint.Style.STROKE);
                                J.setStrokeCap(Paint.Cap.ROUND);
                                J.setStrokeJoin(Paint.Join.ROUND);
                                J.setPathEffect(new DashPathEffect(new float[]{AndroidUtilities.dp(0.66f), AndroidUtilities.dp(4.0f)}, 0.0f));
                            }
                            J.setStrokeWidth(AndroidUtilities.dp(1.66f));
                            J.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.M6, this.F));
                            canvas2.drawCircle(i10, i14, AndroidUtilities.dp(9.0f), J);
                        } else if (f16 != 0.0f) {
                            if (this.C != null) {
                                if (this.f26300g == null) {
                                    i21 = 1;
                                    TextPaint textPaint2 = new TextPaint(1);
                                    this.f26300g = textPaint2;
                                    textPaint2.setTypeface(AndroidUtilities.bold());
                                } else {
                                    i21 = 1;
                                }
                                length = this.C.length();
                                if (length != 0) {
                                    f18 = 14.0f;
                                    f19 = 18.0f;
                                } else {
                                    f18 = 14.0f;
                                    f19 = 18.0f;
                                }
                                this.f26300g.setTextSize(AndroidUtilities.dp(f18));
                                this.f26300g.setColor(org.telegram.ui.ActionBar.g6.v0(this.f26310r, this.F));
                                canvas2.save();
                                float f310 = i10;
                                canvas2.scale(f16, 1.0f, f310, i14);
                                String str2 = this.C;
                                canvas2.drawText(str2, f310 - (this.f26300g.measureText(str2) / 2.0f), AndroidUtilities.dp(f19), this.f26300g);
                                canvas2.restore();
                            } else {
                                Path path2 = this.f26302j;
                                path2.reset();
                                i20 = this.A;
                                if (i20 == -1) {
                                    f17 = 1.4f;
                                } else if (i20 == 5) {
                                    f17 = 0.8f;
                                } else {
                                    f17 = 1.0f;
                                }
                                float fDp9 = AndroidUtilities.dp(9.0f * f17) * f16;
                                float fDp10 = AndroidUtilities.dp(f17 * 4.0f) * f16;
                                int iDp3 = i10 - AndroidUtilities.dp(f14);
                                int iDp4 = AndroidUtilities.dp(4.0f) + i14;
                                float fSqrt3 = (float) Math.sqrt((fDp10 * fDp10) / 2.0f);
                                float f43 = iDp3;
                                float f44 = iDp4;
                                path2.moveTo(f43 - fSqrt3, f44 - fSqrt3);
                                path2.lineTo(f43, f44);
                                float fSqrt4 = (float) Math.sqrt((fDp9 * fDp9) / 2.0f);
                                path2.lineTo(f43 + fSqrt4, f44 - fSqrt4);
                                if (z10) {
                                    canvas2.save();
                                    float f45 = this.f26298e;
                                    canvas2.scale(f45, f45, i10, i14);
                                    z12 = true;
                                } else {
                                    canvas2.save();
                                    float f46 = this.f26298e;
                                    canvas2.scale(f46, f46, i10, i14);
                                    z12 = true;
                                }
                                canvas2.drawPath(path2, paint2);
                                if (z12) {
                                    canvas2.restore();
                                }
                            }
                        }
                    }
                    if (z10) {
                        canvas2.restore();
                    }
                }
                i14 = i11;
                i15 = 7;
                i16 = -1;
                f14 = 1.5f;
                f15 = 1.0f;
                I.setColor(org.telegram.ui.ActionBar.g6.v0(this.f26310r, this.F));
                i17 = this.A;
                if (i17 == i16) {
                    i18 = 6;
                    f13 = 0.0f;
                } else {
                    i18 = 6;
                    f13 = 0.0f;
                }
                if (f12 > f13) {
                    if (f11 < 0.5f) {
                        f16 = 0.0f;
                    } else {
                        f16 = (f11 - 0.5f) / 0.5f;
                    }
                    i19 = this.A;
                    if (i19 == 9) {
                        I.setColor(org.telegram.ui.ActionBar.g6.v0(this.f26312t, this.F));
                    } else if (i19 != 11) {
                        I.setColor(org.telegram.ui.ActionBar.g6.v0(this.f26311s, this.F));
                    } else {
                        I.setColor(org.telegram.ui.ActionBar.g6.v0(this.f26311s, this.F));
                    }
                    if (this.f26306n) {
                        I.setColor(paint.getColor());
                    } else if (this.h < f15) {
                        I.setColor(i0.b.d(this.h, paint.getColor(), I.getColor()));
                    }
                    z11 = this.f26316y;
                    paint2 = this.d;
                    if (z11) {
                        paint2.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23182k7, this.F));
                    } else {
                        paint2.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23182k7, this.F));
                    }
                    if (this.h < f15) {
                        paint2.setColor(i0.b.d(this.h, I.getColor(), paint2.getColor()));
                    }
                    if (this.A != -1) {
                        fDp2 = AndroidUtilities.dp(this.B) / 2.0f;
                        int iSave3 = canvas2.save();
                        canvas2.translate(i10 - fDp2, i14 - fDp2);
                        if (f12 < f15) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (z13) {
                            canvas2.saveLayerAlpha(0.0f, 0.0f, AndroidUtilities.dp(this.B), AndroidUtilities.dp(this.B), 255, 31);
                        }
                        paint3 = (Paint) this.G.provide(null);
                        i22 = this.A;
                        if (i22 != 12) {
                            canvas2 = canvas;
                            alpha = paint3.getAlpha();
                            paint3.setAlpha((int) (f12 * 255.0f));
                            canvas2.drawCircle(fDp2, fDp2, f10 * f12, paint3);
                            if (paint3 != I) {
                                paint3.setAlpha(alpha);
                            }
                        } else {
                            canvas2 = canvas;
                            alpha = paint3.getAlpha();
                            paint3.setAlpha((int) (f12 * 255.0f));
                            canvas2.drawCircle(fDp2, fDp2, f10 * f12, paint3);
                            if (paint3 != I) {
                                paint3.setAlpha(alpha);
                            }
                        }
                        canvas2.restoreToCount(iSave3);
                    }
                    if (this.f26306n) {
                        if (J == null) {
                            Paint paint6 = new Paint(1);
                            J = paint6;
                            paint6.setStyle(Paint.Style.STROKE);
                            J.setStrokeCap(Paint.Cap.ROUND);
                            J.setStrokeJoin(Paint.Join.ROUND);
                            J.setPathEffect(new DashPathEffect(new float[]{AndroidUtilities.dp(0.66f), AndroidUtilities.dp(4.0f)}, 0.0f));
                        }
                        J.setStrokeWidth(AndroidUtilities.dp(1.66f));
                        J.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.M6, this.F));
                        canvas2.drawCircle(i10, i14, AndroidUtilities.dp(9.0f), J);
                    } else if (f16 != 0.0f) {
                        if (this.C != null) {
                            if (this.f26300g == null) {
                                i21 = 1;
                                TextPaint textPaint3 = new TextPaint(1);
                                this.f26300g = textPaint3;
                                textPaint3.setTypeface(AndroidUtilities.bold());
                            } else {
                                i21 = 1;
                            }
                            length = this.C.length();
                            if (length != 0) {
                                f18 = 14.0f;
                                f19 = 18.0f;
                            } else {
                                f18 = 14.0f;
                                f19 = 18.0f;
                            }
                            this.f26300g.setTextSize(AndroidUtilities.dp(f18));
                            this.f26300g.setColor(org.telegram.ui.ActionBar.g6.v0(this.f26310r, this.F));
                            canvas2.save();
                            float f311 = i10;
                            canvas2.scale(f16, 1.0f, f311, i14);
                            String str3 = this.C;
                            canvas2.drawText(str3, f311 - (this.f26300g.measureText(str3) / 2.0f), AndroidUtilities.dp(f19), this.f26300g);
                            canvas2.restore();
                        } else {
                            Path path3 = this.f26302j;
                            path3.reset();
                            i20 = this.A;
                            if (i20 == -1) {
                                f17 = 1.4f;
                            } else if (i20 == 5) {
                                f17 = 0.8f;
                            } else {
                                f17 = 1.0f;
                            }
                            float fDp11 = AndroidUtilities.dp(9.0f * f17) * f16;
                            float fDp12 = AndroidUtilities.dp(f17 * 4.0f) * f16;
                            int iDp5 = i10 - AndroidUtilities.dp(f14);
                            int iDp6 = AndroidUtilities.dp(4.0f) + i14;
                            float fSqrt5 = (float) Math.sqrt((fDp12 * fDp12) / 2.0f);
                            float f47 = iDp5;
                            float f48 = iDp6;
                            path3.moveTo(f47 - fSqrt5, f48 - fSqrt5);
                            path3.lineTo(f47, f48);
                            float fSqrt6 = (float) Math.sqrt((fDp11 * fDp11) / 2.0f);
                            path3.lineTo(f47 + fSqrt6, f48 - fSqrt6);
                            if (z10) {
                                canvas2.save();
                                float f49 = this.f26298e;
                                canvas2.scale(f49, f49, i10, i14);
                                z12 = true;
                            } else {
                                canvas2.save();
                                float f410 = this.f26298e;
                                canvas2.scale(f410, f410, i10, i14);
                                z12 = true;
                            }
                            canvas2.drawPath(path3, paint2);
                            if (z12) {
                                canvas2.restore();
                            }
                        }
                    }
                }
                if (z10) {
                    canvas2.restore();
                }
            }
            if (this.f26317z) {
                i30 = this.A;
                if (i30 != 12 || i30 == 13) {
                    I.setColor(org.telegram.ui.ActionBar.g6.v0(i12, this.F));
                    I.setAlpha((int) (this.f26305m * 255.0f));
                    paint.setColor(org.telegram.ui.ActionBar.g6.v0(this.f26310r, this.F));
                } else if (i30 == 6 || i30 == 7) {
                    I.setColor(org.telegram.ui.ActionBar.g6.v0(this.f26312t, this.F));
                    paint.setColor(org.telegram.ui.ActionBar.g6.v0(this.f26310r, this.F));
                } else if (i30 == 10 || i30 == 14) {
                    paint.setColor(org.telegram.ui.ActionBar.g6.v0(this.f26312t, this.F));
                } else {
                    Paint paint7 = I;
                    int iIndexOfKey = org.telegram.ui.ActionBar.g6.rl.indexOfKey(org.telegram.ui.ActionBar.g6.f23203lc);
                    paint7.setColor((16777215 & (iIndexOfKey >= 0 ? org.telegram.ui.ActionBar.g6.rl.valueAt(iIndexOfKey) : org.telegram.ui.ActionBar.g6.X)) | 671088640);
                    paint.setColor(org.telegram.ui.ActionBar.g6.v0(this.f26310r, this.F));
                }
            } else {
                i29 = this.f26312t;
                if (i29 < 0) {
                    i29 = this.f26310r;
                }
                paint.setColor(AndroidUtilities.getOffsetColor(16777215, org.telegram.ui.ActionBar.g6.v0(i29, this.F), f11, this.f26305m));
            }
            if (!this.f26317z) {
                i14 = i11;
                i15 = 7;
                i16 = -1;
                f14 = 1.5f;
                f15 = 1.0f;
            } else {
                i14 = i11;
                i15 = 7;
                i16 = -1;
                f14 = 1.5f;
                f15 = 1.0f;
            }
            I.setColor(org.telegram.ui.ActionBar.g6.v0(this.f26310r, this.F));
            i17 = this.A;
            if (i17 == i16) {
                i18 = 6;
                f13 = 0.0f;
            } else {
                i18 = 6;
                f13 = 0.0f;
            }
            if (f12 > f13) {
                if (f11 < 0.5f) {
                    f16 = 0.0f;
                } else {
                    f16 = (f11 - 0.5f) / 0.5f;
                }
                i19 = this.A;
                if (i19 == 9) {
                    I.setColor(org.telegram.ui.ActionBar.g6.v0(this.f26312t, this.F));
                } else if (i19 != 11) {
                    I.setColor(org.telegram.ui.ActionBar.g6.v0(this.f26311s, this.F));
                } else {
                    I.setColor(org.telegram.ui.ActionBar.g6.v0(this.f26311s, this.F));
                }
                if (this.f26306n) {
                    I.setColor(paint.getColor());
                } else if (this.h < f15) {
                    I.setColor(i0.b.d(this.h, paint.getColor(), I.getColor()));
                }
                z11 = this.f26316y;
                paint2 = this.d;
                if (z11) {
                    paint2.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23182k7, this.F));
                } else {
                    paint2.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23182k7, this.F));
                }
                if (this.h < f15) {
                    paint2.setColor(i0.b.d(this.h, I.getColor(), paint2.getColor()));
                }
                if (this.A != -1) {
                    fDp2 = AndroidUtilities.dp(this.B) / 2.0f;
                    int iSave4 = canvas2.save();
                    canvas2.translate(i10 - fDp2, i14 - fDp2);
                    if (f12 < f15) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (z13) {
                        canvas2.saveLayerAlpha(0.0f, 0.0f, AndroidUtilities.dp(this.B), AndroidUtilities.dp(this.B), 255, 31);
                    }
                    paint3 = (Paint) this.G.provide(null);
                    i22 = this.A;
                    if (i22 != 12) {
                        canvas2 = canvas;
                        alpha = paint3.getAlpha();
                        paint3.setAlpha((int) (f12 * 255.0f));
                        canvas2.drawCircle(fDp2, fDp2, f10 * f12, paint3);
                        if (paint3 != I) {
                            paint3.setAlpha(alpha);
                        }
                    } else {
                        canvas2 = canvas;
                        alpha = paint3.getAlpha();
                        paint3.setAlpha((int) (f12 * 255.0f));
                        canvas2.drawCircle(fDp2, fDp2, f10 * f12, paint3);
                        if (paint3 != I) {
                            paint3.setAlpha(alpha);
                        }
                    }
                    canvas2.restoreToCount(iSave4);
                }
                if (this.f26306n) {
                    if (J == null) {
                        Paint paint8 = new Paint(1);
                        J = paint8;
                        paint8.setStyle(Paint.Style.STROKE);
                        J.setStrokeCap(Paint.Cap.ROUND);
                        J.setStrokeJoin(Paint.Join.ROUND);
                        J.setPathEffect(new DashPathEffect(new float[]{AndroidUtilities.dp(0.66f), AndroidUtilities.dp(4.0f)}, 0.0f));
                    }
                    J.setStrokeWidth(AndroidUtilities.dp(1.66f));
                    J.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.M6, this.F));
                    canvas2.drawCircle(i10, i14, AndroidUtilities.dp(9.0f), J);
                } else if (f16 != 0.0f) {
                    if (this.C != null) {
                        if (this.f26300g == null) {
                            i21 = 1;
                            TextPaint textPaint4 = new TextPaint(1);
                            this.f26300g = textPaint4;
                            textPaint4.setTypeface(AndroidUtilities.bold());
                        } else {
                            i21 = 1;
                        }
                        length = this.C.length();
                        if (length != 0) {
                            f18 = 14.0f;
                            f19 = 18.0f;
                        } else {
                            f18 = 14.0f;
                            f19 = 18.0f;
                        }
                        this.f26300g.setTextSize(AndroidUtilities.dp(f18));
                        this.f26300g.setColor(org.telegram.ui.ActionBar.g6.v0(this.f26310r, this.F));
                        canvas2.save();
                        float f312 = i10;
                        canvas2.scale(f16, 1.0f, f312, i14);
                        String str4 = this.C;
                        canvas2.drawText(str4, f312 - (this.f26300g.measureText(str4) / 2.0f), AndroidUtilities.dp(f19), this.f26300g);
                        canvas2.restore();
                    } else {
                        Path path4 = this.f26302j;
                        path4.reset();
                        i20 = this.A;
                        if (i20 == -1) {
                            f17 = 1.4f;
                        } else if (i20 == 5) {
                            f17 = 0.8f;
                        } else {
                            f17 = 1.0f;
                        }
                        float fDp13 = AndroidUtilities.dp(9.0f * f17) * f16;
                        float fDp14 = AndroidUtilities.dp(f17 * 4.0f) * f16;
                        int iDp7 = i10 - AndroidUtilities.dp(f14);
                        int iDp8 = AndroidUtilities.dp(4.0f) + i14;
                        float fSqrt7 = (float) Math.sqrt((fDp14 * fDp14) / 2.0f);
                        float f411 = iDp7;
                        float f412 = iDp8;
                        path4.moveTo(f411 - fSqrt7, f412 - fSqrt7);
                        path4.lineTo(f411, f412);
                        float fSqrt8 = (float) Math.sqrt((fDp13 * fDp13) / 2.0f);
                        path4.lineTo(f411 + fSqrt8, f412 - fSqrt8);
                        if (z10) {
                            canvas2.save();
                            float f413 = this.f26298e;
                            canvas2.scale(f413, f413, i10, i14);
                            z12 = true;
                        } else {
                            canvas2.save();
                            float f414 = this.f26298e;
                            canvas2.scale(f414, f414, i10, i14);
                            z12 = true;
                        }
                        canvas2.drawPath(path4, paint2);
                        if (z12) {
                            canvas2.restore();
                        }
                    }
                }
            }
            if (z10) {
                canvas2.restore();
            }
        }
        fDp3 = AndroidUtilities.dp(10.0f);
        f10 = fDp3;
        fDp = f10;
        if (this.f26306n) {
            f11 = 1.0f;
        } else {
            f11 = this.f26307o;
        }
        if (f11 >= 0.5f) {
            f12 = 1.0f;
        } else {
            f12 = f11 / 0.5f;
        }
        rect = this.f26296b;
        iCenterX = rect.centerX();
        iCenterY = rect.centerY();
        if (this.f26301i) {
            z10 = false;
        } else {
            z10 = false;
        }
        if (z10) {
            float f210 = iCenterX;
            float f211 = iCenterY;
            rect2 = rect;
            i10 = iCenterX;
            i11 = iCenterY;
            f13 = 0.0f;
            canvas2 = canvas;
            canvas2.saveLayerAlpha(f210 - f10, f211 - f10, f210 + f10, f211 + f10, 255, 31);
        } else {
            rect2 = rect;
            i10 = iCenterX;
            i11 = iCenterY;
            f13 = 0.0f;
            canvas2 = canvas;
        }
        i12 = this.f26311s;
        paint = this.f26299f;
        if (i12 >= 0) {
            if (this.f26317z) {
                I.setColor(Color.argb((int) (this.f26305m * 25.0f), 0, 0, 0));
                if (this.A == 8) {
                    paint.setColor(org.telegram.ui.ActionBar.g6.v0(this.f26312t, this.F));
                } else {
                    paint.setColor(AndroidUtilities.getOffsetColor(-1, org.telegram.ui.ActionBar.g6.v0(this.f26310r, this.F), f11, this.f26305m));
                }
            } else if (this.f26315x != 0) {
                paint.setColor(0);
            } else {
                i13 = this.f26312t;
                if (i13 < 0) {
                    i13 = this.f26310r;
                }
                paint.setColor(AndroidUtilities.getOffsetColor(16777215, org.telegram.ui.ActionBar.g6.v0(i13, this.F), f11, this.f26305m));
            }
            if (!this.f26317z) {
                i14 = i11;
                i15 = 7;
                i16 = -1;
                f14 = 1.5f;
                f15 = 1.0f;
            } else {
                i14 = i11;
                i15 = 7;
                i16 = -1;
                f14 = 1.5f;
                f15 = 1.0f;
            }
            I.setColor(org.telegram.ui.ActionBar.g6.v0(this.f26310r, this.F));
            i17 = this.A;
            if (i17 == i16) {
                i18 = 6;
                f13 = 0.0f;
            } else {
                i18 = 6;
                f13 = 0.0f;
            }
            if (f12 > f13) {
                if (f11 < 0.5f) {
                    f16 = 0.0f;
                } else {
                    f16 = (f11 - 0.5f) / 0.5f;
                }
                i19 = this.A;
                if (i19 == 9) {
                    I.setColor(org.telegram.ui.ActionBar.g6.v0(this.f26312t, this.F));
                } else if (i19 != 11) {
                    I.setColor(org.telegram.ui.ActionBar.g6.v0(this.f26311s, this.F));
                } else {
                    I.setColor(org.telegram.ui.ActionBar.g6.v0(this.f26311s, this.F));
                }
                if (this.f26306n) {
                    I.setColor(paint.getColor());
                } else if (this.h < f15) {
                    I.setColor(i0.b.d(this.h, paint.getColor(), I.getColor()));
                }
                z11 = this.f26316y;
                paint2 = this.d;
                if (z11) {
                    paint2.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23182k7, this.F));
                } else {
                    paint2.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23182k7, this.F));
                }
                if (this.h < f15) {
                    paint2.setColor(i0.b.d(this.h, I.getColor(), paint2.getColor()));
                }
                if (this.A != -1) {
                    fDp2 = AndroidUtilities.dp(this.B) / 2.0f;
                    int iSave5 = canvas2.save();
                    canvas2.translate(i10 - fDp2, i14 - fDp2);
                    if (f12 < f15) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (z13) {
                        canvas2.saveLayerAlpha(0.0f, 0.0f, AndroidUtilities.dp(this.B), AndroidUtilities.dp(this.B), 255, 31);
                    }
                    paint3 = (Paint) this.G.provide(null);
                    i22 = this.A;
                    if (i22 != 12) {
                        canvas2 = canvas;
                        alpha = paint3.getAlpha();
                        paint3.setAlpha((int) (f12 * 255.0f));
                        canvas2.drawCircle(fDp2, fDp2, f10 * f12, paint3);
                        if (paint3 != I) {
                            paint3.setAlpha(alpha);
                        }
                    } else {
                        canvas2 = canvas;
                        alpha = paint3.getAlpha();
                        paint3.setAlpha((int) (f12 * 255.0f));
                        canvas2.drawCircle(fDp2, fDp2, f10 * f12, paint3);
                        if (paint3 != I) {
                            paint3.setAlpha(alpha);
                        }
                    }
                    canvas2.restoreToCount(iSave5);
                }
                if (this.f26306n) {
                    if (J == null) {
                        Paint paint9 = new Paint(1);
                        J = paint9;
                        paint9.setStyle(Paint.Style.STROKE);
                        J.setStrokeCap(Paint.Cap.ROUND);
                        J.setStrokeJoin(Paint.Join.ROUND);
                        J.setPathEffect(new DashPathEffect(new float[]{AndroidUtilities.dp(0.66f), AndroidUtilities.dp(4.0f)}, 0.0f));
                    }
                    J.setStrokeWidth(AndroidUtilities.dp(1.66f));
                    J.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.M6, this.F));
                    canvas2.drawCircle(i10, i14, AndroidUtilities.dp(9.0f), J);
                } else if (f16 != 0.0f) {
                    if (this.C != null) {
                        if (this.f26300g == null) {
                            i21 = 1;
                            TextPaint textPaint5 = new TextPaint(1);
                            this.f26300g = textPaint5;
                            textPaint5.setTypeface(AndroidUtilities.bold());
                        } else {
                            i21 = 1;
                        }
                        length = this.C.length();
                        if (length != 0) {
                            f18 = 14.0f;
                            f19 = 18.0f;
                        } else {
                            f18 = 14.0f;
                            f19 = 18.0f;
                        }
                        this.f26300g.setTextSize(AndroidUtilities.dp(f18));
                        this.f26300g.setColor(org.telegram.ui.ActionBar.g6.v0(this.f26310r, this.F));
                        canvas2.save();
                        float f313 = i10;
                        canvas2.scale(f16, 1.0f, f313, i14);
                        String str5 = this.C;
                        canvas2.drawText(str5, f313 - (this.f26300g.measureText(str5) / 2.0f), AndroidUtilities.dp(f19), this.f26300g);
                        canvas2.restore();
                    } else {
                        Path path5 = this.f26302j;
                        path5.reset();
                        i20 = this.A;
                        if (i20 == -1) {
                            f17 = 1.4f;
                        } else if (i20 == 5) {
                            f17 = 0.8f;
                        } else {
                            f17 = 1.0f;
                        }
                        float fDp15 = AndroidUtilities.dp(9.0f * f17) * f16;
                        float fDp16 = AndroidUtilities.dp(f17 * 4.0f) * f16;
                        int iDp9 = i10 - AndroidUtilities.dp(f14);
                        int iDp10 = AndroidUtilities.dp(4.0f) + i14;
                        float fSqrt9 = (float) Math.sqrt((fDp16 * fDp16) / 2.0f);
                        float f415 = iDp9;
                        float f416 = iDp10;
                        path5.moveTo(f415 - fSqrt9, f416 - fSqrt9);
                        path5.lineTo(f415, f416);
                        float fSqrt10 = (float) Math.sqrt((fDp15 * fDp15) / 2.0f);
                        path5.lineTo(f415 + fSqrt10, f416 - fSqrt10);
                        if (z10) {
                            canvas2.save();
                            float f417 = this.f26298e;
                            canvas2.scale(f417, f417, i10, i14);
                            z12 = true;
                        } else {
                            canvas2.save();
                            float f418 = this.f26298e;
                            canvas2.scale(f418, f418, i10, i14);
                            z12 = true;
                        }
                        canvas2.drawPath(path5, paint2);
                        if (z12) {
                            canvas2.restore();
                        }
                    }
                }
            }
            if (z10) {
                canvas2.restore();
            }
        }
        if (this.f26317z) {
            i30 = this.A;
            if (i30 != 12) {
                I.setColor(org.telegram.ui.ActionBar.g6.v0(i12, this.F));
                I.setAlpha((int) (this.f26305m * 255.0f));
                paint.setColor(org.telegram.ui.ActionBar.g6.v0(this.f26310r, this.F));
            } else {
                I.setColor(org.telegram.ui.ActionBar.g6.v0(i12, this.F));
                I.setAlpha((int) (this.f26305m * 255.0f));
                paint.setColor(org.telegram.ui.ActionBar.g6.v0(this.f26310r, this.F));
            }
        } else {
            i29 = this.f26312t;
            if (i29 < 0) {
                i29 = this.f26310r;
            }
            paint.setColor(AndroidUtilities.getOffsetColor(16777215, org.telegram.ui.ActionBar.g6.v0(i29, this.F), f11, this.f26305m));
        }
        if (!this.f26317z) {
            i14 = i11;
            i15 = 7;
            i16 = -1;
            f14 = 1.5f;
            f15 = 1.0f;
        } else {
            i14 = i11;
            i15 = 7;
            i16 = -1;
            f14 = 1.5f;
            f15 = 1.0f;
        }
        I.setColor(org.telegram.ui.ActionBar.g6.v0(this.f26310r, this.F));
        i17 = this.A;
        if (i17 == i16) {
            i18 = 6;
            f13 = 0.0f;
        } else {
            i18 = 6;
            f13 = 0.0f;
        }
        if (f12 > f13) {
            if (f11 < 0.5f) {
                f16 = 0.0f;
            } else {
                f16 = (f11 - 0.5f) / 0.5f;
            }
            i19 = this.A;
            if (i19 == 9) {
                I.setColor(org.telegram.ui.ActionBar.g6.v0(this.f26312t, this.F));
            } else if (i19 != 11) {
                I.setColor(org.telegram.ui.ActionBar.g6.v0(this.f26311s, this.F));
            } else {
                I.setColor(org.telegram.ui.ActionBar.g6.v0(this.f26311s, this.F));
            }
            if (this.f26306n) {
                I.setColor(paint.getColor());
            } else if (this.h < f15) {
                I.setColor(i0.b.d(this.h, paint.getColor(), I.getColor()));
            }
            z11 = this.f26316y;
            paint2 = this.d;
            if (z11) {
                paint2.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23182k7, this.F));
            } else {
                paint2.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23182k7, this.F));
            }
            if (this.h < f15) {
                paint2.setColor(i0.b.d(this.h, I.getColor(), paint2.getColor()));
            }
            if (this.A != -1) {
                fDp2 = AndroidUtilities.dp(this.B) / 2.0f;
                int iSave6 = canvas2.save();
                canvas2.translate(i10 - fDp2, i14 - fDp2);
                if (f12 < f15) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (z13) {
                    canvas2.saveLayerAlpha(0.0f, 0.0f, AndroidUtilities.dp(this.B), AndroidUtilities.dp(this.B), 255, 31);
                }
                paint3 = (Paint) this.G.provide(null);
                i22 = this.A;
                if (i22 != 12) {
                    canvas2 = canvas;
                    alpha = paint3.getAlpha();
                    paint3.setAlpha((int) (f12 * 255.0f));
                    canvas2.drawCircle(fDp2, fDp2, f10 * f12, paint3);
                    if (paint3 != I) {
                        paint3.setAlpha(alpha);
                    }
                } else {
                    canvas2 = canvas;
                    alpha = paint3.getAlpha();
                    paint3.setAlpha((int) (f12 * 255.0f));
                    canvas2.drawCircle(fDp2, fDp2, f10 * f12, paint3);
                    if (paint3 != I) {
                        paint3.setAlpha(alpha);
                    }
                }
                canvas2.restoreToCount(iSave6);
            }
            if (this.f26306n) {
                if (J == null) {
                    Paint paint10 = new Paint(1);
                    J = paint10;
                    paint10.setStyle(Paint.Style.STROKE);
                    J.setStrokeCap(Paint.Cap.ROUND);
                    J.setStrokeJoin(Paint.Join.ROUND);
                    J.setPathEffect(new DashPathEffect(new float[]{AndroidUtilities.dp(0.66f), AndroidUtilities.dp(4.0f)}, 0.0f));
                }
                J.setStrokeWidth(AndroidUtilities.dp(1.66f));
                J.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.M6, this.F));
                canvas2.drawCircle(i10, i14, AndroidUtilities.dp(9.0f), J);
            } else if (f16 != 0.0f) {
                if (this.C != null) {
                    if (this.f26300g == null) {
                        i21 = 1;
                        TextPaint textPaint6 = new TextPaint(1);
                        this.f26300g = textPaint6;
                        textPaint6.setTypeface(AndroidUtilities.bold());
                    } else {
                        i21 = 1;
                    }
                    length = this.C.length();
                    if (length != 0) {
                        f18 = 14.0f;
                        f19 = 18.0f;
                    } else {
                        f18 = 14.0f;
                        f19 = 18.0f;
                    }
                    this.f26300g.setTextSize(AndroidUtilities.dp(f18));
                    this.f26300g.setColor(org.telegram.ui.ActionBar.g6.v0(this.f26310r, this.F));
                    canvas2.save();
                    float f314 = i10;
                    canvas2.scale(f16, 1.0f, f314, i14);
                    String str6 = this.C;
                    canvas2.drawText(str6, f314 - (this.f26300g.measureText(str6) / 2.0f), AndroidUtilities.dp(f19), this.f26300g);
                    canvas2.restore();
                } else {
                    Path path6 = this.f26302j;
                    path6.reset();
                    i20 = this.A;
                    if (i20 == -1) {
                        f17 = 1.4f;
                    } else if (i20 == 5) {
                        f17 = 0.8f;
                    } else {
                        f17 = 1.0f;
                    }
                    float fDp17 = AndroidUtilities.dp(9.0f * f17) * f16;
                    float fDp18 = AndroidUtilities.dp(f17 * 4.0f) * f16;
                    int iDp11 = i10 - AndroidUtilities.dp(f14);
                    int iDp12 = AndroidUtilities.dp(4.0f) + i14;
                    float fSqrt11 = (float) Math.sqrt((fDp18 * fDp18) / 2.0f);
                    float f419 = iDp11;
                    float f4110 = iDp12;
                    path6.moveTo(f419 - fSqrt11, f4110 - fSqrt11);
                    path6.lineTo(f419, f4110);
                    float fSqrt12 = (float) Math.sqrt((fDp17 * fDp17) / 2.0f);
                    path6.lineTo(f419 + fSqrt12, f4110 - fSqrt12);
                    if (z10) {
                        canvas2.save();
                        float f4111 = this.f26298e;
                        canvas2.scale(f4111, f4111, i10, i14);
                        z12 = true;
                    } else {
                        canvas2.save();
                        float f4112 = this.f26298e;
                        canvas2.scale(f4112, f4112, i10, i14);
                        z12 = true;
                    }
                    canvas2.drawPath(path6, paint2);
                    if (z12) {
                        canvas2.restore();
                    }
                }
            }
        }
        if (z10) {
            canvas2.restore();
        }
    }

    public final void b() {
        View view = this.f26295a;
        if (view == null) {
            return;
        }
        if (view.getParent() != null) {
            ((View) this.f26295a.getParent()).invalidate();
        }
        this.f26295a.invalidate();
    }

    public final void c(float f10) {
        if (this.f26305m == f10) {
            return;
        }
        this.f26305m = f10;
        b();
    }

    public final void d(int i10) {
        if (this.A == i10) {
            return;
        }
        this.A = i10;
        Paint paint = this.f26299f;
        if (i10 == 12 || i10 == 13) {
            paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
        } else if (i10 == 4 || i10 == 5) {
            paint.setStrokeWidth(AndroidUtilities.dp(1.9f));
            if (i10 == 5) {
                this.d.setStrokeWidth(AndroidUtilities.dp(1.5f));
            }
        } else if (i10 == 3) {
            paint.setStrokeWidth(AndroidUtilities.dp(3.0f));
        } else if (i10 != 0) {
            paint.setStrokeWidth(AndroidUtilities.dp(1.5f));
        }
        b();
    }

    public final void e(int i10, int i11, int i12, int i13) {
        int i14 = i12 + i10;
        int i15 = i13 + i11;
        Rect rect = this.f26296b;
        if (rect.left == i10 && rect.top == i11 && rect.right == i14 && rect.bottom == i15) {
            return;
        }
        rect.left = i10;
        rect.top = i11;
        rect.right = i14;
        rect.bottom = i15;
        b();
    }

    public final void f(int i10, boolean z10, boolean z11) {
        if (i10 >= 0) {
            String str = "" + (i10 + 1);
            String str2 = this.C;
            if (str2 == null || !str2.equals(str)) {
                this.C = str;
                b();
            }
        }
        if (z10 == this.f26309q) {
            return;
        }
        this.f26309q = z10;
        if (!this.f26304l || !z11) {
            ObjectAnimator objectAnimator = this.f26308p;
            if (objectAnimator != null) {
                objectAnimator.cancel();
                this.f26308p = null;
            }
            setProgress(z10 ? 1.0f : 0.0f);
            return;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "progress", z10 ? 1.0f : 0.0f);
        this.f26308p = objectAnimatorOfFloat;
        objectAnimatorOfFloat.addListener(new org.telegram.ui.am(this, 21));
        this.f26308p.setInterpolator(er.f28123g);
        this.f26308p.setDuration(this.H);
        this.f26308p.start();
    }

    public final void g(boolean z10, boolean z11) {
        f(-1, z10, z11);
    }

    public float getProgress() {
        return this.f26307o;
    }

    public final void h(int i10, int i11, int i12) {
        if (this.f26311s == i10 && this.f26312t == i11 && this.f26310r == i12) {
            return;
        }
        this.f26311s = i10;
        this.f26312t = i11;
        this.f26310r = i12;
        b();
    }

    public final void i(float f10) {
        if (this.v == f10) {
            return;
        }
        this.v = f10;
        b();
    }

    public final void j(boolean z10) {
        if (this.f26301i == z10) {
            return;
        }
        this.f26301i = z10;
        this.d.setXfermode(z10 ? new PorterDuffXfermode(PorterDuff.Mode.CLEAR) : null);
        b();
    }

    public final void k(boolean z10) {
        if (this.f26317z == z10) {
            return;
        }
        this.f26317z = z10;
        b();
    }

    public final void l(float f10) {
        if (this.B == f10) {
            return;
        }
        this.B = f10;
        b();
    }

    public void setProgress(float f10) {
        if (this.f26307o == f10) {
            return;
        }
        this.f26307o = f10;
        b();
        cp cpVar = this.D;
        if (cpVar != null) {
            cpVar.b();
        }
    }
}
