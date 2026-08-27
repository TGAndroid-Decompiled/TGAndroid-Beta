package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.AndroidUtilities;

public final class f90 extends Drawable {
    public vu A;
    public org.telegram.ui.ActionBar.d5 B;
    public LinearGradient C;
    public Matrix D;
    public boolean E;

    public final TextPaint f28295a;

    public final Paint f28296b;

    public final Paint f28297c;
    public final Paint d;

    public final Paint f28298e;

    public final RectF f28299f;

    public PorterDuffColorFilter f28300g;
    public float h;

    public final DecelerateInterpolator f28301i;

    public boolean f28302j;

    public float f28303k;

    public int f28304l;

    public String f28305m;

    public int f28306n;

    public float f28307o;

    public int f28308p;

    public int f28309q;

    public float f28310r;

    public float f28311s;

    public long f28312t;

    public boolean f28313u;
    public float v;

    public float f28314w;

    public float f28315x;

    public float f28316y;

    public float f28317z;

    public f90() {
        TextPaint textPaint = new TextPaint(1);
        this.f28295a = textPaint;
        Paint paint = new Paint(1);
        this.f28296b = paint;
        this.f28297c = new Paint(1);
        Paint paint2 = new Paint(1);
        this.d = paint2;
        Paint paint3 = new Paint(1);
        this.f28298e = paint3;
        this.f28299f = new RectF();
        this.h = 1.0f;
        this.f28301i = new DecelerateInterpolator();
        this.f28303k = 400.0f;
        this.f28304l = -1;
        this.f28307o = 1.0f;
        this.f28310r = 1.0f;
        paint.setColor(-1);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(AndroidUtilities.dp(3.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint3.setColor(-1);
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(13.0f));
        textPaint.setColor(-1);
        paint2.setColor(-1);
    }

    public final void a(boolean z10) {
        org.telegram.ui.ActionBar.d5 d5Var = this.B;
        if (d5Var == null || !d5Var.l() || this.E) {
            return;
        }
        Rect bounds = getBounds();
        org.telegram.ui.ActionBar.d5 d5Var2 = this.B;
        Shader shader = d5Var2.f22843a;
        Matrix matrix = d5Var2.f22851k;
        matrix.reset();
        this.B.a();
        if (z10) {
            matrix.postTranslate(-bounds.centerX(), (-this.B.f22858r) + bounds.top);
        } else {
            matrix.postTranslate(0.0f, -this.B.f22858r);
        }
        shader.setLocalMatrix(matrix);
    }

    public final float b() {
        if (this.f28313u) {
            return this.f28310r;
        }
        return 1.0f;
    }

    public final void c(int i10) {
        int i11 = (-16777216) | i10;
        this.f28296b.setColor(i11);
        this.d.setColor(i11);
        this.f28298e.setColor(i11);
        this.f28295a.setColor(i11);
        this.f28300g = new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY);
    }

    public final void d(int i10, boolean z10) {
        int i11;
        int i12;
        if (this.f28308p == i10 && (i12 = this.f28309q) != i10) {
            this.f28308p = i12;
            this.f28310r = 1.0f;
        }
        if (z10) {
            int i13 = this.f28308p;
            if (i13 == i10 || (i11 = this.f28309q) == i10) {
                return;
            }
            if ((i13 == 0 && i10 == 1) || (i13 == 1 && i10 == 0)) {
                this.f28303k = 300.0f;
            } else if (i13 == 2 && (i10 == 3 || i10 == 14)) {
                this.f28303k = 400.0f;
            } else if (i13 != 4 && i10 == 6) {
                this.f28303k = 360.0f;
            } else if ((i13 == 4 && i10 == 14) || (i13 == 14 && i10 == 4)) {
                this.f28303k = 160.0f;
            } else {
                this.f28303k = 220.0f;
            }
            if (this.f28313u) {
                this.f28308p = i11;
            }
            this.f28313u = true;
            this.f28309q = i10;
            this.f28311s = this.f28310r;
            this.f28310r = 0.0f;
        } else {
            if (this.f28308p == i10) {
                return;
            }
            this.f28313u = false;
            this.f28309q = i10;
            this.f28308p = i10;
            this.f28311s = this.f28310r;
            this.f28310r = 1.0f;
        }
        if (i10 == 3 || i10 == 14) {
            this.v = 112.0f;
            this.f28315x = 0.0f;
            this.f28316y = 0.0f;
            this.f28317z = 0.0f;
        }
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        int iSave;
        int i10;
        float f10;
        float fDp;
        int i11;
        RectF rectF;
        float fDp2;
        float fDp3;
        float f11;
        float f12;
        float f13;
        float f14;
        int i12;
        int i13;
        boolean z10;
        int i14;
        int i15;
        float f15;
        float fMax;
        int i16;
        Path[] pathArr;
        Path[] pathArr2;
        Path[] pathArr3;
        Path[] pathArr4;
        Drawable drawable;
        int i17;
        Drawable drawable2;
        int i18;
        Drawable drawable3;
        Drawable drawable4;
        int i19;
        int i20;
        float f16;
        int i21;
        int i22;
        int i23;
        float f17;
        TextPaint textPaint;
        float f18;
        Rect rect;
        float f19;
        int i24;
        int i25;
        int i26;
        float f20;
        float f21;
        int i27;
        Paint paint;
        int i28;
        float f22;
        float interpolation;
        int i29;
        float fMin;
        float f23;
        int iDp;
        int iDp2;
        float f24;
        float f25;
        float f26;
        Paint paint2;
        int i30;
        long j10;
        int i31;
        float f27;
        float f28;
        float f29;
        float f30;
        float f31;
        int i32;
        float f32;
        float f33;
        int i33;
        Path path;
        Path path2;
        Path path3;
        int i34;
        int i35;
        int i36;
        float f34;
        float fMin2;
        float fCenterX;
        float fCenterY;
        float fDp4;
        int iMin;
        float f35;
        float f36;
        float f37;
        float f38;
        float fCenterX2;
        int iCenterY;
        int iCenterY2;
        float f39;
        RectF rectF2;
        int i37;
        int i38;
        RectF rectF3;
        int i39;
        float f40;
        int i40;
        int i41;
        Rect bounds = getBounds();
        org.telegram.ui.ActionBar.d5 d5Var = this.B;
        Paint paint3 = this.f28298e;
        Paint paint4 = this.d;
        Paint paint5 = this.f28296b;
        if (d5Var != null && d5Var.l() && !this.E) {
            Shader shader = this.B.f22843a;
            paint5.setShader(shader);
            paint4.setShader(shader);
            paint3.setShader(shader);
        } else if (this.C == null || this.E) {
            paint5.setShader(null);
            paint4.setShader(null);
            paint3.setShader(null);
        } else {
            this.D.reset();
            this.D.setTranslate(0.0f, bounds.top);
            this.C.setLocalMatrix(this.D);
            paint5.setShader(this.C);
            paint4.setShader(this.C);
            paint3.setShader(this.C);
        }
        int iCenterX = bounds.centerX();
        int iCenterY3 = bounds.centerY();
        int i42 = this.f28309q;
        if (i42 == 4) {
            int i43 = this.f28308p;
            if (i43 == 3 || i43 == 14) {
                i10 = 0;
            } else {
                iSave = canvas.save();
                float f41 = 1.0f - this.f28310r;
                canvas.scale(f41, f41, iCenterX, iCenterY3);
                i10 = iSave;
            }
        } else if ((i42 == 6 || i42 == 10) && this.f28308p == 4) {
            iSave = canvas.save();
            float f42 = this.f28310r;
            canvas.scale(f42, f42, iCenterX, iCenterY3);
            i10 = iSave;
        } else {
            i10 = 0;
        }
        AndroidUtilities.dp(3.0f);
        int i44 = this.f28308p;
        RectF rectF4 = this.f28299f;
        if (i44 == 2 || this.f28309q == 2) {
            a(false);
            float f43 = iCenterY3;
            float fDp5 = f43 - (AndroidUtilities.dp(9.0f) * this.h);
            float fDp6 = (AndroidUtilities.dp(9.0f) * this.h) + f43;
            float fDp7 = (AndroidUtilities.dp(12.0f) * this.h) + f43;
            int i45 = this.f28308p;
            if ((i45 == 3 || i45 == 14) && this.f28309q == 2) {
                paint5.setAlpha((int) (Math.min(1.0f, this.f28310r / 0.5f) * 255.0f));
                f10 = this.f28310r;
                fDp = (AndroidUtilities.dp(12.0f) * this.h) + f43;
            } else {
                int i46 = this.f28309q;
                if (i46 == 3 || i46 == 14 || i46 == 2) {
                    paint5.setAlpha(255);
                    f14 = this.f28310r;
                } else {
                    paint5.setAlpha((int) ((1.0f - this.f28310r) * Math.min(1.0f, this.f28311s / 0.5f) * 255.0f));
                    f14 = this.f28311s;
                }
                f10 = f14;
                fDp = (AndroidUtilities.dp(1.0f) * this.h) + f43;
            }
            if (this.f28313u) {
                int i47 = this.f28309q;
                int i48 = 2;
                if (i47 == 2) {
                    i11 = iCenterY3;
                    rectF = rectF4;
                    if (i47 == i48) {
                        f11 = 1.0f - f10;
                    } else {
                        f11 = f10 / 0.5f;
                        f10 = 1.0f - f11;
                    }
                    float fZ = com.google.android.recaptcha.internal.a.z(fDp, fDp5, f11, fDp5);
                    float fZ2 = com.google.android.recaptcha.internal.a.z(fDp7, fDp6, f11, fDp6);
                    float f44 = iCenterX;
                    float fDp8 = f44 - ((AndroidUtilities.dp(8.0f) * f10) * this.h);
                    fDp3 = f44 + (AndroidUtilities.dp(8.0f) * f10 * this.h);
                    fDp7 = fZ2 - ((AndroidUtilities.dp(8.0f) * f10) * this.h);
                    fDp5 = fZ;
                    fDp2 = fDp8;
                    fDp6 = fZ2;
                } else if (f10 <= 0.5f) {
                    i48 = 2;
                    i11 = iCenterY3;
                    rectF = rectF4;
                    if (i47 == i48) {
                        f11 = 1.0f - f10;
                    } else {
                        f11 = f10 / 0.5f;
                        f10 = 1.0f - f11;
                    }
                    float fZ3 = com.google.android.recaptcha.internal.a.z(fDp, fDp5, f11, fDp5);
                    float fZ4 = com.google.android.recaptcha.internal.a.z(fDp7, fDp6, f11, fDp6);
                    float f45 = iCenterX;
                    float fDp9 = f45 - ((AndroidUtilities.dp(8.0f) * f10) * this.h);
                    fDp3 = f45 + (AndroidUtilities.dp(8.0f) * f10 * this.h);
                    fDp7 = fZ4 - ((AndroidUtilities.dp(8.0f) * f10) * this.h);
                    fDp5 = fZ3;
                    fDp2 = fDp9;
                    fDp6 = fZ4;
                } else {
                    float fDp10 = AndroidUtilities.dp(13.0f);
                    float f46 = this.h;
                    float fDp11 = (fDp10 * f46 * f46) + (this.f28302j ? AndroidUtilities.dp(2.0f) : 0);
                    float f47 = f10 - 0.5f;
                    float f48 = f47 / 0.5f;
                    if (f47 > 0.2f) {
                        f13 = (f47 - 0.2f) / 0.3f;
                        f12 = 1.0f;
                    } else {
                        f12 = f47 / 0.2f;
                        f13 = 0.0f;
                    }
                    float f49 = iCenterX;
                    float f50 = fDp11 / 2.0f;
                    rectF4.set(f49 - fDp11, fDp7 - f50, f49, fDp7 + f50);
                    rectF = rectF4;
                    float f51 = f13 * 100.0f;
                    float f52 = f13;
                    fDp2 = f49;
                    i11 = iCenterY3;
                    canvas.drawArc(rectF, f51, (104.0f * f48) - f51, false, paint5);
                    float fZ5 = com.google.android.recaptcha.internal.a.z(fDp7, fDp, f12, fDp);
                    if (f52 > 0.0f) {
                        float f53 = this.f28309q == 14 ? 0.0f : (-45.0f) * (1.0f - f52);
                        float fDp12 = AndroidUtilities.dp(7.0f) * f52 * this.h;
                        int iMin2 = (int) (f52 * 255.0f);
                        int i49 = this.f28309q;
                        if (i49 != 3 && i49 != 14 && i49 != 2) {
                            iMin2 = (int) (iMin2 * (1.0f - Math.min(1.0f, this.f28310r / 0.5f)));
                        }
                        int i50 = iMin2;
                        if (f53 != 0.0f) {
                            canvas.save();
                            canvas.rotate(f53, fDp2, f43);
                        }
                        if (i50 != 0) {
                            paint5.setAlpha(i50);
                            if (this.f28309q == 14) {
                                paint3.setAlpha(i50);
                                rectF.set(iCenterX - AndroidUtilities.dp(3.5f), i11 - AndroidUtilities.dp(3.5f), AndroidUtilities.dp(3.5f) + iCenterX, AndroidUtilities.dp(3.5f) + i11);
                                canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), paint3);
                                paint5.setAlpha((int) (i50 * 0.15f));
                                int iDp3 = AndroidUtilities.dp(this.f28302j ? 2.0f : 4.0f);
                                rectF.set(bounds.left + iDp3, bounds.top + iDp3, bounds.right - iDp3, bounds.bottom - iDp3);
                                canvas.drawArc(rectF, 0.0f, 360.0f, false, paint5);
                                paint5.setAlpha(i50);
                            } else {
                                float f54 = fDp2 - fDp12;
                                float f55 = f43 - fDp12;
                                float f56 = fDp2 + fDp12;
                                float f57 = fDp12 + f43;
                                canvas.drawLine(f54, f55, f56, f57, paint5);
                                canvas.drawLine(f56, f55, f54, f57, paint5);
                            }
                        }
                        if (f53 != 0.0f) {
                            canvas.restore();
                        }
                    } else {
                        rectF = rectF;
                    }
                    fDp5 = fZ5;
                    fDp3 = fDp2;
                    fDp6 = fDp7;
                }
            } else {
                i11 = iCenterY3;
                rectF = rectF4;
                float f58 = iCenterX;
                fDp2 = f58 - (AndroidUtilities.dp(8.0f) * this.h);
                fDp3 = (AndroidUtilities.dp(8.0f) * this.h) + f58;
                fDp7 = fDp6 - (AndroidUtilities.dp(8.0f) * this.h);
            }
            float f59 = fDp3;
            float f60 = fDp5;
            if (f60 != fDp6) {
                float f61 = iCenterX;
                canvas.drawLine(f61, f60, f61, fDp6, paint5);
            }
            float f62 = iCenterX;
            if (fDp2 != f62) {
                float f63 = fDp7;
                canvas.drawLine(fDp2, f63, f62, fDp6, paint5);
                canvas.drawLine(f59, f63, f62, fDp6, paint5);
            }
        } else {
            i10 = i10;
            paint4 = paint4;
            i11 = iCenterY3;
            rectF = rectF4;
        }
        int i51 = this.f28308p;
        if (i51 != 3 && i51 != 14) {
            i13 = 4;
            if (i51 == 4 && ((i41 = this.f28309q) == 14 || i41 == 3)) {
                i12 = 1;
                z10 = false;
            } else {
                if (i51 == 10 || this.f28309q == 10 || i51 == 13) {
                    int i52 = this.f28309q;
                    int i53 = (i52 == 4 || i52 == 6) ? (int) ((1.0f - this.f28310r) * 255.0f) : 255;
                    if (i53 != 0) {
                        a(false);
                        paint5.setAlpha((int) (i53 * this.f28307o));
                        float fMax2 = Math.max(4.0f, this.f28315x * 360.0f);
                        int iDp4 = AndroidUtilities.dp(this.f28302j ? 2.0f : 4.0f);
                        rectF.set(bounds.left + iDp4, bounds.top + iDp4, bounds.right - iDp4, bounds.bottom - iDp4);
                        canvas = canvas;
                        canvas.drawArc(rectF, this.v, fMax2, false, paint5);
                    } else {
                        canvas = canvas;
                    }
                } else {
                    canvas = canvas;
                }
                i14 = i11;
            }
            i15 = this.f28308p;
            if (i15 == this.f28309q) {
                f15 = 1.0f;
                fMax = 1.0f;
            } else if (i15 != i13 || i15 == 3 || i15 == 14) {
                float f64 = this.f28310r;
                f15 = f64;
                fMax = 1.0f - f64;
            } else {
                float fMin3 = Math.min(1.0f, this.f28310r / 0.5f);
                fMax = Math.max(0.0f, 1.0f - (this.f28310r / 0.5f));
                f15 = fMin3;
            }
            i16 = this.f28309q;
            if (i16 == 15) {
                if (this.f28308p == 15) {
                    pathArr2 = org.telegram.ui.ActionBar.g6.f22997a5;
                    pathArr = null;
                } else {
                    pathArr = null;
                }
                if (i16 == 5) {
                    pathArr = org.telegram.ui.ActionBar.g6.Z4;
                } else if (this.f28308p == 5) {
                    pathArr2 = org.telegram.ui.ActionBar.g6.Z4;
                }
                pathArr3 = pathArr;
                pathArr4 = pathArr2;
                if (i16 == 7) {
                    drawable2 = org.telegram.ui.ActionBar.g6.f23016b5;
                    drawable = null;
                    i17 = 8;
                } else {
                    if (this.f28308p == 7) {
                        drawable = org.telegram.ui.ActionBar.g6.f23016b5;
                    } else {
                        drawable = null;
                    }
                    i17 = 8;
                    drawable2 = null;
                }
                if (i16 == i17) {
                    drawable2 = org.telegram.ui.ActionBar.g6.f23035c5;
                } else if (this.f28308p == i17) {
                    drawable = org.telegram.ui.ActionBar.g6.f23035c5;
                }
                if (this.f28308p != 9 || i16 == 9) {
                    a(false);
                    if (this.f28308p == this.f28309q) {
                        i18 = 255;
                    } else {
                        i18 = (int) (this.f28310r * 255.0f);
                    }
                    paint5.setAlpha(i18);
                    int iDp5 = AndroidUtilities.dp(7.0f) + i14;
                    int iDp6 = iCenterX - AndroidUtilities.dp(3.0f);
                    if (this.f28308p != this.f28309q) {
                        canvas.save();
                        float f65 = this.f28310r;
                        canvas.scale(f65, f65, iCenterX, i14);
                    }
                    float f66 = iDp6;
                    float f67 = iDp5;
                    drawable3 = drawable;
                    drawable4 = drawable2;
                    canvas.drawLine(iDp6 - AndroidUtilities.dp(6.0f), iDp5 - AndroidUtilities.dp(6.0f), f66, f67, paint5);
                    canvas = canvas;
                    canvas.drawLine(f66, f67, AndroidUtilities.dp(12.0f) + iDp6, iDp5 - AndroidUtilities.dp(12.0f), paint5);
                    if (this.f28308p != this.f28309q) {
                        canvas.restore();
                    }
                } else {
                    drawable3 = drawable;
                    drawable4 = drawable2;
                }
                if (this.f28308p != 12 || this.f28309q == 12) {
                    a(false);
                    i19 = this.f28308p;
                    i20 = this.f28309q;
                    if (i19 == i20) {
                        f16 = 1.0f;
                    } else if (i20 == 13) {
                        f16 = this.f28310r;
                    } else {
                        f16 = 1.0f - this.f28310r;
                    }
                    if (i19 == i20) {
                        i21 = 255;
                    } else {
                        i21 = (int) (f16 * 255.0f);
                    }
                    paint5.setAlpha(i21);
                    AndroidUtilities.dp(7.0f);
                    AndroidUtilities.dp(3.0f);
                    if (this.f28308p != this.f28309q) {
                        canvas.save();
                        canvas.scale(f16, f16, iCenterX, i14);
                    }
                    float fDp13 = AndroidUtilities.dp(7.0f) * this.h;
                    float f68 = iCenterX;
                    float f69 = f68 - fDp13;
                    float f70 = i14;
                    float f71 = f70 - fDp13;
                    float f72 = f68 + fDp13;
                    float f73 = f70 + fDp13;
                    canvas.drawLine(f69, f71, f72, f73, paint5);
                    canvas.drawLine(f72, f71, f69, f73, paint5);
                    if (this.f28308p != this.f28309q) {
                        canvas.restore();
                    }
                }
                if (this.f28308p != 13 || this.f28309q == 13) {
                    a(false);
                    i22 = this.f28308p;
                    i23 = this.f28309q;
                    if (i22 == i23) {
                        f17 = 1.0f;
                    } else if (i23 == 13) {
                        f17 = this.f28310r;
                    } else {
                        f17 = 1.0f - this.f28310r;
                    }
                    textPaint = this.f28295a;
                    textPaint.setAlpha((int) (f17 * 255.0f));
                    int iDp7 = AndroidUtilities.dp(5.0f) + i14;
                    f18 = 5.0f;
                    int i54 = iCenterX - (this.f28306n / 2);
                    rect = bounds;
                    f19 = fMax;
                    if (this.f28308p != this.f28309q) {
                        canvas.save();
                        canvas.scale(f17, f17, iCenterX, i14);
                    }
                    i24 = (int) (this.f28315x * 100.0f);
                    if (this.f28305m != null || i24 != this.f28304l) {
                        this.f28304l = i24;
                        String str = String.format("%d%%", Integer.valueOf(i24));
                        this.f28305m = str;
                        this.f28306n = (int) Math.ceil(textPaint.measureText(str));
                    }
                    canvas.drawText(this.f28305m, i54, iDp7, textPaint);
                    if (this.f28308p != this.f28309q) {
                        canvas.restore();
                    }
                } else {
                    rect = bounds;
                    f19 = fMax;
                    iCenterX = iCenterX;
                    f18 = 5.0f;
                }
                i25 = this.f28308p;
                if (i25 != 0 || i25 == 1 || (i36 = this.f28309q) == 0 || i36 == 1) {
                    if ((i25 == 0 || this.f28309q != 1) && !(i25 == 1 && this.f28309q == 0)) {
                        i26 = 1;
                        if (i25 == 1) {
                            f20 = 1.0f;
                        } else {
                            f20 = 0.0f;
                        }
                        f21 = f20;
                    } else if (this.f28313u) {
                        f21 = this.f28309q == 0 ? 1.0f - this.f28310r : this.f28310r;
                        i26 = 1;
                    } else {
                        i26 = 1;
                        if (this.f28309q == 1) {
                            f20 = 1.0f;
                        } else {
                            f20 = 0.0f;
                        }
                        f21 = f20;
                    }
                    i27 = this.f28309q;
                    if ((i27 != 0 || i27 == i26) && (i25 == 0 || i25 == i26)) {
                        paint = paint4;
                        paint.setAlpha(255);
                    } else if (i27 == 4) {
                        paint = paint4;
                        paint.setAlpha((int) ((1.0f - this.f28310r) * 255.0f));
                    } else {
                        paint = paint4;
                        paint.setAlpha(i25 == i27 ? 255 : (int) (this.f28310r * 255.0f));
                    }
                    a(true);
                    canvas.save();
                    canvas.translate(com.google.android.recaptcha.internal.a.z(1.0f, f21, AndroidUtilities.dp(1.0f), rect.centerX()), rect.centerY());
                    float f74 = f21 * 500.0f;
                    i28 = this.f28308p;
                    if (i28 == 1) {
                        f22 = 90.0f;
                    } else {
                        f22 = 0.0f;
                    }
                    if (i28 != 0 && this.f28309q == 1) {
                        if (f74 < 384.0f) {
                            interpolation = er.f28125j.getInterpolation(f74 / 384.0f) * 95.0f;
                        } else {
                            interpolation = f74 < 484.0f ? 95.0f - (er.f28125j.getInterpolation((f74 - 384.0f) / 100.0f) * f18) : 90.0f;
                        }
                        f74 += 100.0f;
                    } else if (i28 == 1 || this.f28309q != 0) {
                        interpolation = f22;
                    } else if (f74 < 100.0f) {
                        interpolation = er.f28125j.getInterpolation(f74 / 100.0f) * (-5.0f);
                    } else {
                        interpolation = f74 < 484.0f ? (er.f28125j.getInterpolation((f74 - 100.0f) / 384.0f) * 95.0f) - 5.0f : 90.0f;
                    }
                    canvas.rotate(interpolation);
                    i29 = this.f28308p;
                    if ((i29 == 0 && i29 != 1) || i29 == 4) {
                        canvas.scale(f15, f15);
                    }
                    org.telegram.ui.ActionBar.g6.f23403x3.b(canvas, paint, f74);
                    canvas.scale(1.0f, -1.0f);
                    org.telegram.ui.ActionBar.g6.f23403x3.b(canvas, paint, f74);
                    canvas.restore();
                } else {
                    paint = paint4;
                }
                if (this.f28308p != 6 || this.f28309q == 6) {
                    a(false);
                    if (this.f28308p != 6) {
                        f24 = this.f28310r;
                        if (f24 > 0.5f) {
                            f26 = (f24 - 0.5f) / 0.5f;
                            fMin = 1.0f - Math.min(1.0f, f26 / 0.5f);
                            if (f26 > 0.5f) {
                                f25 = (f26 - 0.5f) / 0.5f;
                            } else {
                                f25 = 0.0f;
                            }
                        } else {
                            f25 = 0.0f;
                            fMin = 1.0f;
                        }
                        paint5.setAlpha(255);
                        f23 = f25;
                    } else {
                        if (this.f28309q != 6) {
                            paint5.setAlpha((int) ((1.0f - this.f28310r) * 255.0f));
                        } else {
                            paint5.setAlpha(255);
                        }
                        fMin = 0.0f;
                        f23 = 1.0f;
                    }
                    iDp = AndroidUtilities.dp(7.0f) + i14;
                    iDp2 = iCenterX - AndroidUtilities.dp(3.0f);
                    if (fMin < 1.0f) {
                        canvas.drawLine(iDp2 - AndroidUtilities.dp(6.0f), iDp - AndroidUtilities.dp(6.0f), iDp2 - (AndroidUtilities.dp(6.0f) * fMin), iDp - (AndroidUtilities.dp(6.0f) * fMin), paint5);
                    }
                    if (f23 > 0.0f) {
                        float f75 = iDp2;
                        float f76 = iDp;
                        canvas = canvas;
                        canvas.drawLine(f75, f76, (AndroidUtilities.dp(12.0f) * f23) + f75, f76 - (AndroidUtilities.dp(12.0f) * f23), paint5);
                    } else {
                        canvas = canvas;
                    }
                } else {
                    iCenterX = iCenterX;
                }
                if (drawable3 != null && drawable3 != drawable4) {
                    int intrinsicWidth = (int) (drawable3.getIntrinsicWidth() * f19);
                    int intrinsicHeight = (int) (drawable3.getIntrinsicHeight() * f19);
                    drawable3.setColorFilter(this.f28300g);
                    if (this.f28308p == this.f28309q) {
                        i35 = 255;
                    } else {
                        i35 = (int) ((1.0f - this.f28310r) * 255.0f);
                    }
                    drawable3.setAlpha(i35);
                    int i55 = intrinsicWidth / 2;
                    int i56 = intrinsicHeight / 2;
                    drawable3.setBounds(iCenterX - i55, i14 - i56, iCenterX + i55, i56 + i14);
                    drawable3.draw(canvas);
                }
                if (drawable4 != null) {
                    int intrinsicWidth2 = (int) (drawable4.getIntrinsicWidth() * f15);
                    int intrinsicHeight2 = (int) (drawable4.getIntrinsicHeight() * f15);
                    drawable4.setColorFilter(this.f28300g);
                    if (this.f28308p == this.f28309q) {
                        i34 = 255;
                    } else {
                        i34 = (int) (this.f28310r * 255.0f);
                    }
                    drawable4.setAlpha(i34);
                    int i57 = intrinsicWidth2 / 2;
                    int i58 = intrinsicHeight2 / 2;
                    drawable4.setBounds(iCenterX - i57, i14 - i58, iCenterX + i57, i58 + i14);
                    drawable4.draw(canvas);
                }
                paint2 = this.f28297c;
                if (pathArr4 != null || pathArr4 == pathArr3) {
                    i30 = iCenterX;
                } else {
                    int iDp8 = AndroidUtilities.dp(24.0f);
                    paint.setStyle(Paint.Style.FILL_AND_STROKE);
                    paint.setAlpha(this.f28308p == this.f28309q ? 255 : (int) ((1.0f - this.f28310r) * 255.0f));
                    a(true);
                    canvas.save();
                    i30 = iCenterX;
                    canvas.translate(i30, i14);
                    float f77 = f19;
                    canvas.scale(f77, f77);
                    float f78 = (-iDp8) / 2;
                    canvas.translate(f78, f78);
                    Path path4 = pathArr4[0];
                    if (path4 != null) {
                        canvas.drawPath(path4, paint);
                    }
                    Path path5 = pathArr4[1];
                    if (path5 != null) {
                        canvas.drawPath(path5, paint2);
                    }
                    canvas.restore();
                }
                if (pathArr3 != null) {
                    int iDp9 = AndroidUtilities.dp(24.0f);
                    if (this.f28308p == this.f28309q) {
                        i33 = 255;
                    } else {
                        i33 = (int) (this.f28310r * 255.0f);
                    }
                    paint.setStyle(Paint.Style.FILL_AND_STROKE);
                    paint.setAlpha(i33);
                    a(true);
                    canvas.save();
                    canvas.translate(i30, i14);
                    canvas.scale(f15, f15);
                    float f79 = (-iDp9) / 2;
                    canvas.translate(f79, f79);
                    path = pathArr3[0];
                    if (path != null) {
                        canvas.drawPath(path, paint);
                    }
                    if (pathArr3.length >= 3 && (path3 = pathArr3[2]) != null) {
                        canvas.drawPath(path3, paint5);
                    }
                    path2 = pathArr3[1];
                    if (path2 != null) {
                        if (i33 != 255) {
                            int alpha = paint2.getAlpha();
                            paint2.setAlpha((int) ((i33 / 255.0f) * alpha));
                            canvas.drawPath(pathArr3[1], paint2);
                            paint2.setAlpha(alpha);
                        } else {
                            canvas.drawPath(path2, paint2);
                        }
                    }
                    canvas.restore();
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                j10 = jCurrentTimeMillis - this.f28312t;
                if (j10 > 17) {
                    j10 = 17;
                }
                this.f28312t = jCurrentTimeMillis;
                i31 = this.f28308p;
                if (i31 != 3 || i31 == 14 || ((i31 == 4 && this.f28309q == 14) || i31 == 10 || i31 == 13)) {
                    f27 = ((360 * j10) / 2500.0f) + this.v;
                    this.v = f27;
                    while (f27 > 360.0f) {
                        f27 -= 360.0f;
                    }
                    this.v = f27;
                    if (this.f28309q != 2) {
                        f28 = this.f28314w;
                        f29 = this.f28316y;
                        f30 = f28 - f29;
                        if (f30 > 0.0f) {
                            f31 = this.f28317z + j10;
                            this.f28317z = f31;
                            if (f31 >= 200.0f) {
                                this.f28315x = f28;
                                this.f28316y = f28;
                                this.f28317z = 0.0f;
                            } else {
                                this.f28315x = (this.f28301i.getInterpolation(f31 / 200.0f) * f30) + f29;
                            }
                        }
                    }
                    invalidateSelf();
                }
                if (this.f28313u) {
                    f32 = this.f28310r;
                    if (f32 < 1.0f) {
                        f33 = (j10 / this.f28303k) + f32;
                        this.f28310r = f33;
                        if (f33 >= 1.0f) {
                            this.f28308p = this.f28309q;
                            this.f28310r = 1.0f;
                            this.f28313u = false;
                        }
                        invalidateSelf();
                    }
                }
                i32 = i10;
                if (i32 >= 1) {
                    canvas.restoreToCount(i32);
                }
            }
            pathArr = org.telegram.ui.ActionBar.g6.f22997a5;
            pathArr2 = null;
            if (i16 == 5) {
                pathArr = org.telegram.ui.ActionBar.g6.Z4;
            } else if (this.f28308p == 5) {
                pathArr2 = org.telegram.ui.ActionBar.g6.Z4;
            }
            pathArr3 = pathArr;
            pathArr4 = pathArr2;
            if (i16 == 7) {
                drawable2 = org.telegram.ui.ActionBar.g6.f23016b5;
                drawable = null;
                i17 = 8;
            } else {
                if (this.f28308p == 7) {
                    drawable = org.telegram.ui.ActionBar.g6.f23016b5;
                } else {
                    drawable = null;
                }
                i17 = 8;
                drawable2 = null;
            }
            if (i16 == i17) {
                drawable2 = org.telegram.ui.ActionBar.g6.f23035c5;
            } else if (this.f28308p == i17) {
                drawable = org.telegram.ui.ActionBar.g6.f23035c5;
            }
            if (this.f28308p != 9) {
                a(false);
                if (this.f28308p == this.f28309q) {
                    i18 = 255;
                } else {
                    i18 = (int) (this.f28310r * 255.0f);
                }
                paint5.setAlpha(i18);
                int iDp10 = AndroidUtilities.dp(7.0f) + i14;
                int iDp11 = iCenterX - AndroidUtilities.dp(3.0f);
                if (this.f28308p != this.f28309q) {
                    canvas.save();
                    float f610 = this.f28310r;
                    canvas.scale(f610, f610, iCenterX, i14);
                }
                float f611 = iDp11;
                float f612 = iDp10;
                drawable3 = drawable;
                drawable4 = drawable2;
                canvas.drawLine(iDp11 - AndroidUtilities.dp(6.0f), iDp10 - AndroidUtilities.dp(6.0f), f611, f612, paint5);
                canvas = canvas;
                canvas.drawLine(f611, f612, AndroidUtilities.dp(12.0f) + iDp11, iDp10 - AndroidUtilities.dp(12.0f), paint5);
                if (this.f28308p != this.f28309q) {
                    canvas.restore();
                }
            } else {
                a(false);
                if (this.f28308p == this.f28309q) {
                    i18 = 255;
                } else {
                    i18 = (int) (this.f28310r * 255.0f);
                }
                paint5.setAlpha(i18);
                int iDp12 = AndroidUtilities.dp(7.0f) + i14;
                int iDp13 = iCenterX - AndroidUtilities.dp(3.0f);
                if (this.f28308p != this.f28309q) {
                    canvas.save();
                    float f613 = this.f28310r;
                    canvas.scale(f613, f613, iCenterX, i14);
                }
                float f614 = iDp13;
                float f615 = iDp12;
                drawable3 = drawable;
                drawable4 = drawable2;
                canvas.drawLine(iDp13 - AndroidUtilities.dp(6.0f), iDp12 - AndroidUtilities.dp(6.0f), f614, f615, paint5);
                canvas = canvas;
                canvas.drawLine(f614, f615, AndroidUtilities.dp(12.0f) + iDp13, iDp12 - AndroidUtilities.dp(12.0f), paint5);
                if (this.f28308p != this.f28309q) {
                    canvas.restore();
                }
            }
            if (this.f28308p != 12) {
                a(false);
                i19 = this.f28308p;
                i20 = this.f28309q;
                if (i19 == i20) {
                    f16 = 1.0f;
                } else if (i20 == 13) {
                    f16 = this.f28310r;
                } else {
                    f16 = 1.0f - this.f28310r;
                }
                if (i19 == i20) {
                    i21 = 255;
                } else {
                    i21 = (int) (f16 * 255.0f);
                }
                paint5.setAlpha(i21);
                AndroidUtilities.dp(7.0f);
                AndroidUtilities.dp(3.0f);
                if (this.f28308p != this.f28309q) {
                    canvas.save();
                    canvas.scale(f16, f16, iCenterX, i14);
                }
                float fDp14 = AndroidUtilities.dp(7.0f) * this.h;
                float f616 = iCenterX;
                float f617 = f616 - fDp14;
                float f710 = i14;
                float f711 = f710 - fDp14;
                float f712 = f616 + fDp14;
                float f713 = f710 + fDp14;
                canvas.drawLine(f617, f711, f712, f713, paint5);
                canvas.drawLine(f712, f711, f617, f713, paint5);
                if (this.f28308p != this.f28309q) {
                    canvas.restore();
                }
            } else {
                a(false);
                i19 = this.f28308p;
                i20 = this.f28309q;
                if (i19 == i20) {
                    f16 = 1.0f;
                } else if (i20 == 13) {
                    f16 = this.f28310r;
                } else {
                    f16 = 1.0f - this.f28310r;
                }
                if (i19 == i20) {
                    i21 = 255;
                } else {
                    i21 = (int) (f16 * 255.0f);
                }
                paint5.setAlpha(i21);
                AndroidUtilities.dp(7.0f);
                AndroidUtilities.dp(3.0f);
                if (this.f28308p != this.f28309q) {
                    canvas.save();
                    canvas.scale(f16, f16, iCenterX, i14);
                }
                float fDp15 = AndroidUtilities.dp(7.0f) * this.h;
                float f618 = iCenterX;
                float f619 = f618 - fDp15;
                float f714 = i14;
                float f715 = f714 - fDp15;
                float f716 = f618 + fDp15;
                float f717 = f714 + fDp15;
                canvas.drawLine(f619, f715, f716, f717, paint5);
                canvas.drawLine(f716, f715, f619, f717, paint5);
                if (this.f28308p != this.f28309q) {
                    canvas.restore();
                }
            }
            if (this.f28308p != 13) {
                a(false);
                i22 = this.f28308p;
                i23 = this.f28309q;
                if (i22 == i23) {
                    f17 = 1.0f;
                } else if (i23 == 13) {
                    f17 = this.f28310r;
                } else {
                    f17 = 1.0f - this.f28310r;
                }
                textPaint = this.f28295a;
                textPaint.setAlpha((int) (f17 * 255.0f));
                int iDp14 = AndroidUtilities.dp(5.0f) + i14;
                f18 = 5.0f;
                int i59 = iCenterX - (this.f28306n / 2);
                rect = bounds;
                f19 = fMax;
                if (this.f28308p != this.f28309q) {
                    canvas.save();
                    canvas.scale(f17, f17, iCenterX, i14);
                }
                i24 = (int) (this.f28315x * 100.0f);
                if (this.f28305m != null) {
                    this.f28304l = i24;
                    String str2 = String.format("%d%%", Integer.valueOf(i24));
                    this.f28305m = str2;
                    this.f28306n = (int) Math.ceil(textPaint.measureText(str2));
                } else {
                    this.f28304l = i24;
                    String str3 = String.format("%d%%", Integer.valueOf(i24));
                    this.f28305m = str3;
                    this.f28306n = (int) Math.ceil(textPaint.measureText(str3));
                }
                canvas.drawText(this.f28305m, i59, iDp14, textPaint);
                if (this.f28308p != this.f28309q) {
                    canvas.restore();
                }
            } else {
                a(false);
                i22 = this.f28308p;
                i23 = this.f28309q;
                if (i22 == i23) {
                    f17 = 1.0f;
                } else if (i23 == 13) {
                    f17 = this.f28310r;
                } else {
                    f17 = 1.0f - this.f28310r;
                }
                textPaint = this.f28295a;
                textPaint.setAlpha((int) (f17 * 255.0f));
                int iDp15 = AndroidUtilities.dp(5.0f) + i14;
                f18 = 5.0f;
                int i510 = iCenterX - (this.f28306n / 2);
                rect = bounds;
                f19 = fMax;
                if (this.f28308p != this.f28309q) {
                    canvas.save();
                    canvas.scale(f17, f17, iCenterX, i14);
                }
                i24 = (int) (this.f28315x * 100.0f);
                if (this.f28305m != null) {
                    this.f28304l = i24;
                    String str4 = String.format("%d%%", Integer.valueOf(i24));
                    this.f28305m = str4;
                    this.f28306n = (int) Math.ceil(textPaint.measureText(str4));
                } else {
                    this.f28304l = i24;
                    String str5 = String.format("%d%%", Integer.valueOf(i24));
                    this.f28305m = str5;
                    this.f28306n = (int) Math.ceil(textPaint.measureText(str5));
                }
                canvas.drawText(this.f28305m, i510, iDp15, textPaint);
                if (this.f28308p != this.f28309q) {
                    canvas.restore();
                }
            }
            i25 = this.f28308p;
            if (i25 != 0) {
                if (i25 == 0) {
                    i26 = 1;
                    if (i25 == 1) {
                        f20 = 1.0f;
                    } else {
                        f20 = 0.0f;
                    }
                    f21 = f20;
                    i27 = this.f28309q;
                    if (i27 != 0) {
                        paint = paint4;
                        paint.setAlpha(255);
                    } else {
                        paint = paint4;
                        paint.setAlpha(255);
                    }
                    a(true);
                    canvas.save();
                    canvas.translate(com.google.android.recaptcha.internal.a.z(1.0f, f21, AndroidUtilities.dp(1.0f), rect.centerX()), rect.centerY());
                    float f718 = f21 * 500.0f;
                    i28 = this.f28308p;
                    if (i28 == 1) {
                        f22 = 90.0f;
                    } else {
                        f22 = 0.0f;
                    }
                    if (i28 != 0) {
                        if (i28 == 1) {
                            interpolation = f22;
                        } else {
                            interpolation = f22;
                        }
                    } else if (i28 == 1) {
                        interpolation = f22;
                    } else {
                        interpolation = f22;
                    }
                    canvas.rotate(interpolation);
                    i29 = this.f28308p;
                    if (i29 == 0) {
                        canvas.scale(f15, f15);
                    } else {
                        canvas.scale(f15, f15);
                    }
                    org.telegram.ui.ActionBar.g6.f23403x3.b(canvas, paint, f718);
                    canvas.scale(1.0f, -1.0f);
                    org.telegram.ui.ActionBar.g6.f23403x3.b(canvas, paint, f718);
                    canvas.restore();
                } else {
                    i26 = 1;
                    if (i25 == 1) {
                        f20 = 1.0f;
                    } else {
                        f20 = 0.0f;
                    }
                    f21 = f20;
                    i27 = this.f28309q;
                    if (i27 != 0) {
                        paint = paint4;
                        paint.setAlpha(255);
                    } else {
                        paint = paint4;
                        paint.setAlpha(255);
                    }
                    a(true);
                    canvas.save();
                    canvas.translate(com.google.android.recaptcha.internal.a.z(1.0f, f21, AndroidUtilities.dp(1.0f), rect.centerX()), rect.centerY());
                    float f719 = f21 * 500.0f;
                    i28 = this.f28308p;
                    if (i28 == 1) {
                        f22 = 90.0f;
                    } else {
                        f22 = 0.0f;
                    }
                    if (i28 != 0) {
                        if (i28 == 1) {
                            interpolation = f22;
                        } else {
                            interpolation = f22;
                        }
                    } else if (i28 == 1) {
                        interpolation = f22;
                    } else {
                        interpolation = f22;
                    }
                    canvas.rotate(interpolation);
                    i29 = this.f28308p;
                    if (i29 == 0) {
                        canvas.scale(f15, f15);
                    } else {
                        canvas.scale(f15, f15);
                    }
                    org.telegram.ui.ActionBar.g6.f23403x3.b(canvas, paint, f719);
                    canvas.scale(1.0f, -1.0f);
                    org.telegram.ui.ActionBar.g6.f23403x3.b(canvas, paint, f719);
                    canvas.restore();
                }
            } else if (i25 == 0) {
                i26 = 1;
                if (i25 == 1) {
                    f20 = 1.0f;
                } else {
                    f20 = 0.0f;
                }
                f21 = f20;
                i27 = this.f28309q;
                if (i27 != 0) {
                    paint = paint4;
                    paint.setAlpha(255);
                } else {
                    paint = paint4;
                    paint.setAlpha(255);
                }
                a(true);
                canvas.save();
                canvas.translate(com.google.android.recaptcha.internal.a.z(1.0f, f21, AndroidUtilities.dp(1.0f), rect.centerX()), rect.centerY());
                float f7110 = f21 * 500.0f;
                i28 = this.f28308p;
                if (i28 == 1) {
                    f22 = 90.0f;
                } else {
                    f22 = 0.0f;
                }
                if (i28 != 0) {
                    if (i28 == 1) {
                        interpolation = f22;
                    } else {
                        interpolation = f22;
                    }
                } else if (i28 == 1) {
                    interpolation = f22;
                } else {
                    interpolation = f22;
                }
                canvas.rotate(interpolation);
                i29 = this.f28308p;
                if (i29 == 0) {
                    canvas.scale(f15, f15);
                } else {
                    canvas.scale(f15, f15);
                }
                org.telegram.ui.ActionBar.g6.f23403x3.b(canvas, paint, f7110);
                canvas.scale(1.0f, -1.0f);
                org.telegram.ui.ActionBar.g6.f23403x3.b(canvas, paint, f7110);
                canvas.restore();
            } else {
                i26 = 1;
                if (i25 == 1) {
                    f20 = 1.0f;
                } else {
                    f20 = 0.0f;
                }
                f21 = f20;
                i27 = this.f28309q;
                if (i27 != 0) {
                    paint = paint4;
                    paint.setAlpha(255);
                } else {
                    paint = paint4;
                    paint.setAlpha(255);
                }
                a(true);
                canvas.save();
                canvas.translate(com.google.android.recaptcha.internal.a.z(1.0f, f21, AndroidUtilities.dp(1.0f), rect.centerX()), rect.centerY());
                float f7111 = f21 * 500.0f;
                i28 = this.f28308p;
                if (i28 == 1) {
                    f22 = 90.0f;
                } else {
                    f22 = 0.0f;
                }
                if (i28 != 0) {
                    if (i28 == 1) {
                        interpolation = f22;
                    } else {
                        interpolation = f22;
                    }
                } else if (i28 == 1) {
                    interpolation = f22;
                } else {
                    interpolation = f22;
                }
                canvas.rotate(interpolation);
                i29 = this.f28308p;
                if (i29 == 0) {
                    canvas.scale(f15, f15);
                } else {
                    canvas.scale(f15, f15);
                }
                org.telegram.ui.ActionBar.g6.f23403x3.b(canvas, paint, f7111);
                canvas.scale(1.0f, -1.0f);
                org.telegram.ui.ActionBar.g6.f23403x3.b(canvas, paint, f7111);
                canvas.restore();
            }
            if (this.f28308p != 6) {
                a(false);
                if (this.f28308p != 6) {
                    f24 = this.f28310r;
                    if (f24 > 0.5f) {
                        f26 = (f24 - 0.5f) / 0.5f;
                        fMin = 1.0f - Math.min(1.0f, f26 / 0.5f);
                        if (f26 > 0.5f) {
                            f25 = (f26 - 0.5f) / 0.5f;
                        } else {
                            f25 = 0.0f;
                        }
                    } else {
                        f25 = 0.0f;
                        fMin = 1.0f;
                    }
                    paint5.setAlpha(255);
                    f23 = f25;
                } else {
                    if (this.f28309q != 6) {
                        paint5.setAlpha((int) ((1.0f - this.f28310r) * 255.0f));
                    } else {
                        paint5.setAlpha(255);
                    }
                    fMin = 0.0f;
                    f23 = 1.0f;
                }
                iDp = AndroidUtilities.dp(7.0f) + i14;
                iDp2 = iCenterX - AndroidUtilities.dp(3.0f);
                if (fMin < 1.0f) {
                    canvas.drawLine(iDp2 - AndroidUtilities.dp(6.0f), iDp - AndroidUtilities.dp(6.0f), iDp2 - (AndroidUtilities.dp(6.0f) * fMin), iDp - (AndroidUtilities.dp(6.0f) * fMin), paint5);
                }
                if (f23 > 0.0f) {
                    float f720 = iDp2;
                    float f721 = iDp;
                    canvas = canvas;
                    canvas.drawLine(f720, f721, (AndroidUtilities.dp(12.0f) * f23) + f720, f721 - (AndroidUtilities.dp(12.0f) * f23), paint5);
                } else {
                    canvas = canvas;
                }
            } else {
                a(false);
                if (this.f28308p != 6) {
                    f24 = this.f28310r;
                    if (f24 > 0.5f) {
                        f26 = (f24 - 0.5f) / 0.5f;
                        fMin = 1.0f - Math.min(1.0f, f26 / 0.5f);
                        if (f26 > 0.5f) {
                            f25 = (f26 - 0.5f) / 0.5f;
                        } else {
                            f25 = 0.0f;
                        }
                    } else {
                        f25 = 0.0f;
                        fMin = 1.0f;
                    }
                    paint5.setAlpha(255);
                    f23 = f25;
                } else {
                    if (this.f28309q != 6) {
                        paint5.setAlpha((int) ((1.0f - this.f28310r) * 255.0f));
                    } else {
                        paint5.setAlpha(255);
                    }
                    fMin = 0.0f;
                    f23 = 1.0f;
                }
                iDp = AndroidUtilities.dp(7.0f) + i14;
                iDp2 = iCenterX - AndroidUtilities.dp(3.0f);
                if (fMin < 1.0f) {
                    canvas.drawLine(iDp2 - AndroidUtilities.dp(6.0f), iDp - AndroidUtilities.dp(6.0f), iDp2 - (AndroidUtilities.dp(6.0f) * fMin), iDp - (AndroidUtilities.dp(6.0f) * fMin), paint5);
                }
                if (f23 > 0.0f) {
                    float f722 = iDp2;
                    float f723 = iDp;
                    canvas = canvas;
                    canvas.drawLine(f722, f723, (AndroidUtilities.dp(12.0f) * f23) + f722, f723 - (AndroidUtilities.dp(12.0f) * f23), paint5);
                } else {
                    canvas = canvas;
                }
            }
            if (drawable3 != null) {
                int intrinsicWidth3 = (int) (drawable3.getIntrinsicWidth() * f19);
                int intrinsicHeight3 = (int) (drawable3.getIntrinsicHeight() * f19);
                drawable3.setColorFilter(this.f28300g);
                if (this.f28308p == this.f28309q) {
                    i35 = 255;
                } else {
                    i35 = (int) ((1.0f - this.f28310r) * 255.0f);
                }
                drawable3.setAlpha(i35);
                int i511 = intrinsicWidth3 / 2;
                int i512 = intrinsicHeight3 / 2;
                drawable3.setBounds(iCenterX - i511, i14 - i512, iCenterX + i511, i512 + i14);
                drawable3.draw(canvas);
            }
            if (drawable4 != null) {
                int intrinsicWidth4 = (int) (drawable4.getIntrinsicWidth() * f15);
                int intrinsicHeight4 = (int) (drawable4.getIntrinsicHeight() * f15);
                drawable4.setColorFilter(this.f28300g);
                if (this.f28308p == this.f28309q) {
                    i34 = 255;
                } else {
                    i34 = (int) (this.f28310r * 255.0f);
                }
                drawable4.setAlpha(i34);
                int i513 = intrinsicWidth4 / 2;
                int i514 = intrinsicHeight4 / 2;
                drawable4.setBounds(iCenterX - i513, i14 - i514, iCenterX + i513, i514 + i14);
                drawable4.draw(canvas);
            }
            paint2 = this.f28297c;
            if (pathArr4 != null) {
                i30 = iCenterX;
            } else {
                i30 = iCenterX;
            }
            if (pathArr3 != null) {
                int iDp16 = AndroidUtilities.dp(24.0f);
                if (this.f28308p == this.f28309q) {
                    i33 = 255;
                } else {
                    i33 = (int) (this.f28310r * 255.0f);
                }
                paint.setStyle(Paint.Style.FILL_AND_STROKE);
                paint.setAlpha(i33);
                a(true);
                canvas.save();
                canvas.translate(i30, i14);
                canvas.scale(f15, f15);
                float f724 = (-iDp16) / 2;
                canvas.translate(f724, f724);
                path = pathArr3[0];
                if (path != null) {
                    canvas.drawPath(path, paint);
                }
                if (pathArr3.length >= 3) {
                    canvas.drawPath(path3, paint5);
                }
                path2 = pathArr3[1];
                if (path2 != null) {
                    if (i33 != 255) {
                        int alpha2 = paint2.getAlpha();
                        paint2.setAlpha((int) ((i33 / 255.0f) * alpha2));
                        canvas.drawPath(pathArr3[1], paint2);
                        paint2.setAlpha(alpha2);
                    } else {
                        canvas.drawPath(path2, paint2);
                    }
                }
                canvas.restore();
            }
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            j10 = jCurrentTimeMillis2 - this.f28312t;
            if (j10 > 17) {
                j10 = 17;
            }
            this.f28312t = jCurrentTimeMillis2;
            i31 = this.f28308p;
            if (i31 != 3) {
                f27 = ((360 * j10) / 2500.0f) + this.v;
                this.v = f27;
                while (f27 > 360.0f) {
                    f27 -= 360.0f;
                }
                this.v = f27;
                if (this.f28309q != 2) {
                    f28 = this.f28314w;
                    f29 = this.f28316y;
                    f30 = f28 - f29;
                    if (f30 > 0.0f) {
                        f31 = this.f28317z + j10;
                        this.f28317z = f31;
                        if (f31 >= 200.0f) {
                            this.f28315x = f28;
                            this.f28316y = f28;
                            this.f28317z = 0.0f;
                        } else {
                            this.f28315x = (this.f28301i.getInterpolation(f31 / 200.0f) * f30) + f29;
                        }
                    }
                }
                invalidateSelf();
            } else {
                f27 = ((360 * j10) / 2500.0f) + this.v;
                this.v = f27;
                while (f27 > 360.0f) {
                    f27 -= 360.0f;
                }
                this.v = f27;
                if (this.f28309q != 2) {
                    f28 = this.f28314w;
                    f29 = this.f28316y;
                    f30 = f28 - f29;
                    if (f30 > 0.0f) {
                        f31 = this.f28317z + j10;
                        this.f28317z = f31;
                        if (f31 >= 200.0f) {
                            this.f28315x = f28;
                            this.f28316y = f28;
                            this.f28317z = 0.0f;
                        } else {
                            this.f28315x = (this.f28301i.getInterpolation(f31 / 200.0f) * f30) + f29;
                        }
                    }
                }
                invalidateSelf();
            }
            if (this.f28313u) {
                f32 = this.f28310r;
                if (f32 < 1.0f) {
                    f33 = (j10 / this.f28303k) + f32;
                    this.f28310r = f33;
                    if (f33 >= 1.0f) {
                        this.f28308p = this.f28309q;
                        this.f28310r = 1.0f;
                        this.f28313u = false;
                    }
                    invalidateSelf();
                }
            }
            i32 = i10;
            if (i32 >= 1) {
                canvas.restoreToCount(i32);
            }
        }
        i12 = 1;
        i13 = 4;
        z10 = false;
        a(z10);
        int i60 = this.f28309q;
        if (i60 != 2) {
            if (i60 != 15 && i60 != 0 && i60 != i12 && i60 != 5 && i60 != 8 && i60 != 9 && i60 != 7 && i60 != 6) {
                if (i60 == i13) {
                    float f80 = 1.0f - this.f28310r;
                    float fDp16 = AndroidUtilities.dp(7.0f) * this.h;
                    int i61 = (int) (f80 * 255.0f);
                    if (this.f28308p == 14) {
                        fCenterX = bounds.left;
                        iCenterY2 = bounds.top;
                    } else {
                        fCenterX = bounds.centerX();
                        iCenterY2 = bounds.centerY();
                    }
                    fCenterY = iCenterY2;
                    f39 = 1.0f;
                    iMin = i61;
                    f35 = f80;
                    fDp4 = fDp16;
                    f36 = 0.0f;
                } else if (i60 == 14 || i60 == 3) {
                    float f81 = this.f28310r;
                    float f82 = 1.0f - f81;
                    if (this.f28308p == i13) {
                        f38 = f81;
                        f37 = 0.0f;
                    } else {
                        f37 = 45.0f * f82;
                        f38 = 1.0f;
                    }
                    float fDp17 = AndroidUtilities.dp(7.0f) * this.h;
                    int i62 = (int) (f81 * 255.0f);
                    if (this.f28309q == 14) {
                        fCenterX2 = bounds.left;
                        iCenterY = bounds.top;
                    } else {
                        fCenterX2 = bounds.centerX();
                        iCenterY = bounds.centerY();
                    }
                    fCenterY = iCenterY;
                    float f83 = fCenterX2;
                    iMin = i62;
                    fCenterX = f83;
                    float f84 = f38;
                    f36 = f37;
                    fDp4 = fDp17;
                    f35 = f84;
                } else {
                    fDp4 = this.h * AndroidUtilities.dp(7.0f);
                    fCenterX = 0.0f;
                    f36 = 0.0f;
                    f35 = 1.0f;
                    iMin = 255;
                }
                if (f35 != f39) {
                    canvas.save();
                    canvas.scale(f35, f35, fCenterX, fCenterY);
                }
                if (f36 != 0.0f) {
                    canvas.save();
                    i14 = i11;
                    canvas.rotate(f36, iCenterX, i14);
                } else {
                    i14 = i11;
                }
                if (iMin != 0) {
                    f40 = iMin;
                    paint5.setAlpha((int) (this.f28307o * f40));
                    if (this.f28308p != 14 || this.f28309q == 14) {
                        rectF2 = rectF;
                        paint3.setAlpha((int) (f40 * this.f28307o));
                        rectF2.set(iCenterX - AndroidUtilities.dp(3.5f), i14 - AndroidUtilities.dp(3.5f), AndroidUtilities.dp(3.5f) + iCenterX, AndroidUtilities.dp(3.5f) + i14);
                        canvas.drawRoundRect(rectF2, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), paint3);
                    } else {
                        float f85 = iCenterX;
                        float f86 = f85 - fDp4;
                        float f87 = i14;
                        float f88 = f87 - fDp4;
                        float f89 = f85 + fDp4;
                        float f90 = f87 + fDp4;
                        rectF2 = rectF;
                        canvas.drawLine(f86, f88, f89, f90, paint5);
                        canvas.drawLine(f89, f88, f86, f90, paint5);
                    }
                } else {
                    rectF2 = rectF;
                }
                if (f36 != 0.0f) {
                    canvas.restore();
                }
                if (f35 != f39) {
                    canvas.restore();
                }
                i37 = this.f28308p;
                if ((i37 != 3 || i37 == 14 || (i37 == i13 && ((i39 = this.f28309q) == 14 || i39 == 3))) && iMin != 0) {
                    float fMax3 = Math.max(4.0f, this.f28315x * 360.0f);
                    int iDp17 = AndroidUtilities.dp(this.f28302j ? 2.0f : 4.0f);
                    rectF2.set(bounds.left + iDp17, bounds.top + iDp17, bounds.right - iDp17, bounds.bottom - iDp17);
                    i38 = this.f28308p;
                    if (i38 != 14 || (i38 == i13 && this.f28309q == 14)) {
                        paint5.setAlpha((int) (iMin * 0.15f * this.f28307o));
                        rectF3 = rectF2;
                        canvas.drawArc(rectF3, 0.0f, 360.0f, false, paint5);
                        paint5.setAlpha(iMin);
                    } else {
                        rectF3 = rectF2;
                    }
                    canvas = canvas;
                    canvas.drawArc(rectF3, this.v, fMax3, false, paint5);
                }
                i15 = this.f28308p;
                if (i15 == this.f28309q) {
                    f15 = 1.0f;
                    fMax = 1.0f;
                } else if (i15 != i13) {
                    float f620 = this.f28310r;
                    f15 = f620;
                    fMax = 1.0f - f620;
                } else {
                    float f621 = this.f28310r;
                    f15 = f621;
                    fMax = 1.0f - f621;
                }
                i16 = this.f28309q;
                if (i16 == 15) {
                    if (this.f28308p == 15) {
                        pathArr2 = org.telegram.ui.ActionBar.g6.f22997a5;
                        pathArr = null;
                    } else {
                        pathArr = null;
                    }
                    if (i16 == 5) {
                        pathArr = org.telegram.ui.ActionBar.g6.Z4;
                    } else if (this.f28308p == 5) {
                        pathArr2 = org.telegram.ui.ActionBar.g6.Z4;
                    }
                    pathArr3 = pathArr;
                    pathArr4 = pathArr2;
                    if (i16 == 7) {
                        drawable2 = org.telegram.ui.ActionBar.g6.f23016b5;
                        drawable = null;
                        i17 = 8;
                    } else {
                        if (this.f28308p == 7) {
                            drawable = org.telegram.ui.ActionBar.g6.f23016b5;
                        } else {
                            drawable = null;
                        }
                        i17 = 8;
                        drawable2 = null;
                    }
                    if (i16 == i17) {
                        drawable2 = org.telegram.ui.ActionBar.g6.f23035c5;
                    } else if (this.f28308p == i17) {
                        drawable = org.telegram.ui.ActionBar.g6.f23035c5;
                    }
                    if (this.f28308p != 9) {
                        a(false);
                        if (this.f28308p == this.f28309q) {
                            i18 = 255;
                        } else {
                            i18 = (int) (this.f28310r * 255.0f);
                        }
                        paint5.setAlpha(i18);
                        int iDp18 = AndroidUtilities.dp(7.0f) + i14;
                        int iDp19 = iCenterX - AndroidUtilities.dp(3.0f);
                        if (this.f28308p != this.f28309q) {
                            canvas.save();
                            float f6110 = this.f28310r;
                            canvas.scale(f6110, f6110, iCenterX, i14);
                        }
                        float f6111 = iDp19;
                        float f6112 = iDp18;
                        drawable3 = drawable;
                        drawable4 = drawable2;
                        canvas.drawLine(iDp19 - AndroidUtilities.dp(6.0f), iDp18 - AndroidUtilities.dp(6.0f), f6111, f6112, paint5);
                        canvas = canvas;
                        canvas.drawLine(f6111, f6112, AndroidUtilities.dp(12.0f) + iDp19, iDp18 - AndroidUtilities.dp(12.0f), paint5);
                        if (this.f28308p != this.f28309q) {
                            canvas.restore();
                        }
                    } else {
                        a(false);
                        if (this.f28308p == this.f28309q) {
                            i18 = 255;
                        } else {
                            i18 = (int) (this.f28310r * 255.0f);
                        }
                        paint5.setAlpha(i18);
                        int iDp110 = AndroidUtilities.dp(7.0f) + i14;
                        int iDp111 = iCenterX - AndroidUtilities.dp(3.0f);
                        if (this.f28308p != this.f28309q) {
                            canvas.save();
                            float f6113 = this.f28310r;
                            canvas.scale(f6113, f6113, iCenterX, i14);
                        }
                        float f6114 = iDp111;
                        float f6115 = iDp110;
                        drawable3 = drawable;
                        drawable4 = drawable2;
                        canvas.drawLine(iDp111 - AndroidUtilities.dp(6.0f), iDp110 - AndroidUtilities.dp(6.0f), f6114, f6115, paint5);
                        canvas = canvas;
                        canvas.drawLine(f6114, f6115, AndroidUtilities.dp(12.0f) + iDp111, iDp110 - AndroidUtilities.dp(12.0f), paint5);
                        if (this.f28308p != this.f28309q) {
                            canvas.restore();
                        }
                    }
                    if (this.f28308p != 12) {
                        a(false);
                        i19 = this.f28308p;
                        i20 = this.f28309q;
                        if (i19 == i20) {
                            f16 = 1.0f;
                        } else if (i20 == 13) {
                            f16 = this.f28310r;
                        } else {
                            f16 = 1.0f - this.f28310r;
                        }
                        if (i19 == i20) {
                            i21 = 255;
                        } else {
                            i21 = (int) (f16 * 255.0f);
                        }
                        paint5.setAlpha(i21);
                        AndroidUtilities.dp(7.0f);
                        AndroidUtilities.dp(3.0f);
                        if (this.f28308p != this.f28309q) {
                            canvas.save();
                            canvas.scale(f16, f16, iCenterX, i14);
                        }
                        float fDp18 = AndroidUtilities.dp(7.0f) * this.h;
                        float f6116 = iCenterX;
                        float f6117 = f6116 - fDp18;
                        float f7112 = i14;
                        float f7113 = f7112 - fDp18;
                        float f7114 = f6116 + fDp18;
                        float f7115 = f7112 + fDp18;
                        canvas.drawLine(f6117, f7113, f7114, f7115, paint5);
                        canvas.drawLine(f7114, f7113, f6117, f7115, paint5);
                        if (this.f28308p != this.f28309q) {
                            canvas.restore();
                        }
                    } else {
                        a(false);
                        i19 = this.f28308p;
                        i20 = this.f28309q;
                        if (i19 == i20) {
                            f16 = 1.0f;
                        } else if (i20 == 13) {
                            f16 = this.f28310r;
                        } else {
                            f16 = 1.0f - this.f28310r;
                        }
                        if (i19 == i20) {
                            i21 = 255;
                        } else {
                            i21 = (int) (f16 * 255.0f);
                        }
                        paint5.setAlpha(i21);
                        AndroidUtilities.dp(7.0f);
                        AndroidUtilities.dp(3.0f);
                        if (this.f28308p != this.f28309q) {
                            canvas.save();
                            canvas.scale(f16, f16, iCenterX, i14);
                        }
                        float fDp19 = AndroidUtilities.dp(7.0f) * this.h;
                        float f6118 = iCenterX;
                        float f6119 = f6118 - fDp19;
                        float f7116 = i14;
                        float f7117 = f7116 - fDp19;
                        float f7118 = f6118 + fDp19;
                        float f7119 = f7116 + fDp19;
                        canvas.drawLine(f6119, f7117, f7118, f7119, paint5);
                        canvas.drawLine(f7118, f7117, f6119, f7119, paint5);
                        if (this.f28308p != this.f28309q) {
                            canvas.restore();
                        }
                    }
                    if (this.f28308p != 13) {
                        a(false);
                        i22 = this.f28308p;
                        i23 = this.f28309q;
                        if (i22 == i23) {
                            f17 = 1.0f;
                        } else if (i23 == 13) {
                            f17 = this.f28310r;
                        } else {
                            f17 = 1.0f - this.f28310r;
                        }
                        textPaint = this.f28295a;
                        textPaint.setAlpha((int) (f17 * 255.0f));
                        int iDp112 = AndroidUtilities.dp(5.0f) + i14;
                        f18 = 5.0f;
                        int i515 = iCenterX - (this.f28306n / 2);
                        rect = bounds;
                        f19 = fMax;
                        if (this.f28308p != this.f28309q) {
                            canvas.save();
                            canvas.scale(f17, f17, iCenterX, i14);
                        }
                        i24 = (int) (this.f28315x * 100.0f);
                        if (this.f28305m != null) {
                            this.f28304l = i24;
                            String str6 = String.format("%d%%", Integer.valueOf(i24));
                            this.f28305m = str6;
                            this.f28306n = (int) Math.ceil(textPaint.measureText(str6));
                        } else {
                            this.f28304l = i24;
                            String str7 = String.format("%d%%", Integer.valueOf(i24));
                            this.f28305m = str7;
                            this.f28306n = (int) Math.ceil(textPaint.measureText(str7));
                        }
                        canvas.drawText(this.f28305m, i515, iDp112, textPaint);
                        if (this.f28308p != this.f28309q) {
                            canvas.restore();
                        }
                    } else {
                        a(false);
                        i22 = this.f28308p;
                        i23 = this.f28309q;
                        if (i22 == i23) {
                            f17 = 1.0f;
                        } else if (i23 == 13) {
                            f17 = this.f28310r;
                        } else {
                            f17 = 1.0f - this.f28310r;
                        }
                        textPaint = this.f28295a;
                        textPaint.setAlpha((int) (f17 * 255.0f));
                        int iDp113 = AndroidUtilities.dp(5.0f) + i14;
                        f18 = 5.0f;
                        int i516 = iCenterX - (this.f28306n / 2);
                        rect = bounds;
                        f19 = fMax;
                        if (this.f28308p != this.f28309q) {
                            canvas.save();
                            canvas.scale(f17, f17, iCenterX, i14);
                        }
                        i24 = (int) (this.f28315x * 100.0f);
                        if (this.f28305m != null) {
                            this.f28304l = i24;
                            String str8 = String.format("%d%%", Integer.valueOf(i24));
                            this.f28305m = str8;
                            this.f28306n = (int) Math.ceil(textPaint.measureText(str8));
                        } else {
                            this.f28304l = i24;
                            String str9 = String.format("%d%%", Integer.valueOf(i24));
                            this.f28305m = str9;
                            this.f28306n = (int) Math.ceil(textPaint.measureText(str9));
                        }
                        canvas.drawText(this.f28305m, i516, iDp113, textPaint);
                        if (this.f28308p != this.f28309q) {
                            canvas.restore();
                        }
                    }
                    i25 = this.f28308p;
                    if (i25 != 0) {
                        if (i25 == 0) {
                            i26 = 1;
                            if (i25 == 1) {
                                f20 = 1.0f;
                            } else {
                                f20 = 0.0f;
                            }
                            f21 = f20;
                            i27 = this.f28309q;
                            if (i27 != 0) {
                                paint = paint4;
                                paint.setAlpha(255);
                            } else {
                                paint = paint4;
                                paint.setAlpha(255);
                            }
                            a(true);
                            canvas.save();
                            canvas.translate(com.google.android.recaptcha.internal.a.z(1.0f, f21, AndroidUtilities.dp(1.0f), rect.centerX()), rect.centerY());
                            float f71110 = f21 * 500.0f;
                            i28 = this.f28308p;
                            if (i28 == 1) {
                                f22 = 90.0f;
                            } else {
                                f22 = 0.0f;
                            }
                            if (i28 != 0) {
                                if (i28 == 1) {
                                    interpolation = f22;
                                } else {
                                    interpolation = f22;
                                }
                            } else if (i28 == 1) {
                                interpolation = f22;
                            } else {
                                interpolation = f22;
                            }
                            canvas.rotate(interpolation);
                            i29 = this.f28308p;
                            if (i29 == 0) {
                                canvas.scale(f15, f15);
                            } else {
                                canvas.scale(f15, f15);
                            }
                            org.telegram.ui.ActionBar.g6.f23403x3.b(canvas, paint, f71110);
                            canvas.scale(1.0f, -1.0f);
                            org.telegram.ui.ActionBar.g6.f23403x3.b(canvas, paint, f71110);
                            canvas.restore();
                        } else {
                            i26 = 1;
                            if (i25 == 1) {
                                f20 = 1.0f;
                            } else {
                                f20 = 0.0f;
                            }
                            f21 = f20;
                            i27 = this.f28309q;
                            if (i27 != 0) {
                                paint = paint4;
                                paint.setAlpha(255);
                            } else {
                                paint = paint4;
                                paint.setAlpha(255);
                            }
                            a(true);
                            canvas.save();
                            canvas.translate(com.google.android.recaptcha.internal.a.z(1.0f, f21, AndroidUtilities.dp(1.0f), rect.centerX()), rect.centerY());
                            float f71111 = f21 * 500.0f;
                            i28 = this.f28308p;
                            if (i28 == 1) {
                                f22 = 90.0f;
                            } else {
                                f22 = 0.0f;
                            }
                            if (i28 != 0) {
                                if (i28 == 1) {
                                    interpolation = f22;
                                } else {
                                    interpolation = f22;
                                }
                            } else if (i28 == 1) {
                                interpolation = f22;
                            } else {
                                interpolation = f22;
                            }
                            canvas.rotate(interpolation);
                            i29 = this.f28308p;
                            if (i29 == 0) {
                                canvas.scale(f15, f15);
                            } else {
                                canvas.scale(f15, f15);
                            }
                            org.telegram.ui.ActionBar.g6.f23403x3.b(canvas, paint, f71111);
                            canvas.scale(1.0f, -1.0f);
                            org.telegram.ui.ActionBar.g6.f23403x3.b(canvas, paint, f71111);
                            canvas.restore();
                        }
                    } else if (i25 == 0) {
                        i26 = 1;
                        if (i25 == 1) {
                            f20 = 1.0f;
                        } else {
                            f20 = 0.0f;
                        }
                        f21 = f20;
                        i27 = this.f28309q;
                        if (i27 != 0) {
                            paint = paint4;
                            paint.setAlpha(255);
                        } else {
                            paint = paint4;
                            paint.setAlpha(255);
                        }
                        a(true);
                        canvas.save();
                        canvas.translate(com.google.android.recaptcha.internal.a.z(1.0f, f21, AndroidUtilities.dp(1.0f), rect.centerX()), rect.centerY());
                        float f71112 = f21 * 500.0f;
                        i28 = this.f28308p;
                        if (i28 == 1) {
                            f22 = 90.0f;
                        } else {
                            f22 = 0.0f;
                        }
                        if (i28 != 0) {
                            if (i28 == 1) {
                                interpolation = f22;
                            } else {
                                interpolation = f22;
                            }
                        } else if (i28 == 1) {
                            interpolation = f22;
                        } else {
                            interpolation = f22;
                        }
                        canvas.rotate(interpolation);
                        i29 = this.f28308p;
                        if (i29 == 0) {
                            canvas.scale(f15, f15);
                        } else {
                            canvas.scale(f15, f15);
                        }
                        org.telegram.ui.ActionBar.g6.f23403x3.b(canvas, paint, f71112);
                        canvas.scale(1.0f, -1.0f);
                        org.telegram.ui.ActionBar.g6.f23403x3.b(canvas, paint, f71112);
                        canvas.restore();
                    } else {
                        i26 = 1;
                        if (i25 == 1) {
                            f20 = 1.0f;
                        } else {
                            f20 = 0.0f;
                        }
                        f21 = f20;
                        i27 = this.f28309q;
                        if (i27 != 0) {
                            paint = paint4;
                            paint.setAlpha(255);
                        } else {
                            paint = paint4;
                            paint.setAlpha(255);
                        }
                        a(true);
                        canvas.save();
                        canvas.translate(com.google.android.recaptcha.internal.a.z(1.0f, f21, AndroidUtilities.dp(1.0f), rect.centerX()), rect.centerY());
                        float f71113 = f21 * 500.0f;
                        i28 = this.f28308p;
                        if (i28 == 1) {
                            f22 = 90.0f;
                        } else {
                            f22 = 0.0f;
                        }
                        if (i28 != 0) {
                            if (i28 == 1) {
                                interpolation = f22;
                            } else {
                                interpolation = f22;
                            }
                        } else if (i28 == 1) {
                            interpolation = f22;
                        } else {
                            interpolation = f22;
                        }
                        canvas.rotate(interpolation);
                        i29 = this.f28308p;
                        if (i29 == 0) {
                            canvas.scale(f15, f15);
                        } else {
                            canvas.scale(f15, f15);
                        }
                        org.telegram.ui.ActionBar.g6.f23403x3.b(canvas, paint, f71113);
                        canvas.scale(1.0f, -1.0f);
                        org.telegram.ui.ActionBar.g6.f23403x3.b(canvas, paint, f71113);
                        canvas.restore();
                    }
                    if (this.f28308p != 6) {
                        a(false);
                        if (this.f28308p != 6) {
                            f24 = this.f28310r;
                            if (f24 > 0.5f) {
                                f26 = (f24 - 0.5f) / 0.5f;
                                fMin = 1.0f - Math.min(1.0f, f26 / 0.5f);
                                if (f26 > 0.5f) {
                                    f25 = (f26 - 0.5f) / 0.5f;
                                } else {
                                    f25 = 0.0f;
                                }
                            } else {
                                f25 = 0.0f;
                                fMin = 1.0f;
                            }
                            paint5.setAlpha(255);
                            f23 = f25;
                        } else {
                            if (this.f28309q != 6) {
                                paint5.setAlpha((int) ((1.0f - this.f28310r) * 255.0f));
                            } else {
                                paint5.setAlpha(255);
                            }
                            fMin = 0.0f;
                            f23 = 1.0f;
                        }
                        iDp = AndroidUtilities.dp(7.0f) + i14;
                        iDp2 = iCenterX - AndroidUtilities.dp(3.0f);
                        if (fMin < 1.0f) {
                            canvas.drawLine(iDp2 - AndroidUtilities.dp(6.0f), iDp - AndroidUtilities.dp(6.0f), iDp2 - (AndroidUtilities.dp(6.0f) * fMin), iDp - (AndroidUtilities.dp(6.0f) * fMin), paint5);
                        }
                        if (f23 > 0.0f) {
                            float f725 = iDp2;
                            float f726 = iDp;
                            canvas = canvas;
                            canvas.drawLine(f725, f726, (AndroidUtilities.dp(12.0f) * f23) + f725, f726 - (AndroidUtilities.dp(12.0f) * f23), paint5);
                        } else {
                            canvas = canvas;
                        }
                    } else {
                        a(false);
                        if (this.f28308p != 6) {
                            f24 = this.f28310r;
                            if (f24 > 0.5f) {
                                f26 = (f24 - 0.5f) / 0.5f;
                                fMin = 1.0f - Math.min(1.0f, f26 / 0.5f);
                                if (f26 > 0.5f) {
                                    f25 = (f26 - 0.5f) / 0.5f;
                                } else {
                                    f25 = 0.0f;
                                }
                            } else {
                                f25 = 0.0f;
                                fMin = 1.0f;
                            }
                            paint5.setAlpha(255);
                            f23 = f25;
                        } else {
                            if (this.f28309q != 6) {
                                paint5.setAlpha((int) ((1.0f - this.f28310r) * 255.0f));
                            } else {
                                paint5.setAlpha(255);
                            }
                            fMin = 0.0f;
                            f23 = 1.0f;
                        }
                        iDp = AndroidUtilities.dp(7.0f) + i14;
                        iDp2 = iCenterX - AndroidUtilities.dp(3.0f);
                        if (fMin < 1.0f) {
                            canvas.drawLine(iDp2 - AndroidUtilities.dp(6.0f), iDp - AndroidUtilities.dp(6.0f), iDp2 - (AndroidUtilities.dp(6.0f) * fMin), iDp - (AndroidUtilities.dp(6.0f) * fMin), paint5);
                        }
                        if (f23 > 0.0f) {
                            float f727 = iDp2;
                            float f728 = iDp;
                            canvas = canvas;
                            canvas.drawLine(f727, f728, (AndroidUtilities.dp(12.0f) * f23) + f727, f728 - (AndroidUtilities.dp(12.0f) * f23), paint5);
                        } else {
                            canvas = canvas;
                        }
                    }
                    if (drawable3 != null) {
                        int intrinsicWidth5 = (int) (drawable3.getIntrinsicWidth() * f19);
                        int intrinsicHeight5 = (int) (drawable3.getIntrinsicHeight() * f19);
                        drawable3.setColorFilter(this.f28300g);
                        if (this.f28308p == this.f28309q) {
                            i35 = 255;
                        } else {
                            i35 = (int) ((1.0f - this.f28310r) * 255.0f);
                        }
                        drawable3.setAlpha(i35);
                        int i517 = intrinsicWidth5 / 2;
                        int i518 = intrinsicHeight5 / 2;
                        drawable3.setBounds(iCenterX - i517, i14 - i518, iCenterX + i517, i518 + i14);
                        drawable3.draw(canvas);
                    }
                    if (drawable4 != null) {
                        int intrinsicWidth6 = (int) (drawable4.getIntrinsicWidth() * f15);
                        int intrinsicHeight6 = (int) (drawable4.getIntrinsicHeight() * f15);
                        drawable4.setColorFilter(this.f28300g);
                        if (this.f28308p == this.f28309q) {
                            i34 = 255;
                        } else {
                            i34 = (int) (this.f28310r * 255.0f);
                        }
                        drawable4.setAlpha(i34);
                        int i519 = intrinsicWidth6 / 2;
                        int i5110 = intrinsicHeight6 / 2;
                        drawable4.setBounds(iCenterX - i519, i14 - i5110, iCenterX + i519, i5110 + i14);
                        drawable4.draw(canvas);
                    }
                    paint2 = this.f28297c;
                    if (pathArr4 != null) {
                        i30 = iCenterX;
                    } else {
                        i30 = iCenterX;
                    }
                    if (pathArr3 != null) {
                        int iDp114 = AndroidUtilities.dp(24.0f);
                        if (this.f28308p == this.f28309q) {
                            i33 = 255;
                        } else {
                            i33 = (int) (this.f28310r * 255.0f);
                        }
                        paint.setStyle(Paint.Style.FILL_AND_STROKE);
                        paint.setAlpha(i33);
                        a(true);
                        canvas.save();
                        canvas.translate(i30, i14);
                        canvas.scale(f15, f15);
                        float f729 = (-iDp114) / 2;
                        canvas.translate(f729, f729);
                        path = pathArr3[0];
                        if (path != null) {
                            canvas.drawPath(path, paint);
                        }
                        if (pathArr3.length >= 3) {
                            canvas.drawPath(path3, paint5);
                        }
                        path2 = pathArr3[1];
                        if (path2 != null) {
                            if (i33 != 255) {
                                int alpha3 = paint2.getAlpha();
                                paint2.setAlpha((int) ((i33 / 255.0f) * alpha3));
                                canvas.drawPath(pathArr3[1], paint2);
                                paint2.setAlpha(alpha3);
                            } else {
                                canvas.drawPath(path2, paint2);
                            }
                        }
                        canvas.restore();
                    }
                    long jCurrentTimeMillis3 = System.currentTimeMillis();
                    j10 = jCurrentTimeMillis3 - this.f28312t;
                    if (j10 > 17) {
                        j10 = 17;
                    }
                    this.f28312t = jCurrentTimeMillis3;
                    i31 = this.f28308p;
                    if (i31 != 3) {
                        f27 = ((360 * j10) / 2500.0f) + this.v;
                        this.v = f27;
                        while (f27 > 360.0f) {
                            f27 -= 360.0f;
                        }
                        this.v = f27;
                        if (this.f28309q != 2) {
                            f28 = this.f28314w;
                            f29 = this.f28316y;
                            f30 = f28 - f29;
                            if (f30 > 0.0f) {
                                f31 = this.f28317z + j10;
                                this.f28317z = f31;
                                if (f31 >= 200.0f) {
                                    this.f28315x = f28;
                                    this.f28316y = f28;
                                    this.f28317z = 0.0f;
                                } else {
                                    this.f28315x = (this.f28301i.getInterpolation(f31 / 200.0f) * f30) + f29;
                                }
                            }
                        }
                        invalidateSelf();
                    } else {
                        f27 = ((360 * j10) / 2500.0f) + this.v;
                        this.v = f27;
                        while (f27 > 360.0f) {
                            f27 -= 360.0f;
                        }
                        this.v = f27;
                        if (this.f28309q != 2) {
                            f28 = this.f28314w;
                            f29 = this.f28316y;
                            f30 = f28 - f29;
                            if (f30 > 0.0f) {
                                f31 = this.f28317z + j10;
                                this.f28317z = f31;
                                if (f31 >= 200.0f) {
                                    this.f28315x = f28;
                                    this.f28316y = f28;
                                    this.f28317z = 0.0f;
                                } else {
                                    this.f28315x = (this.f28301i.getInterpolation(f31 / 200.0f) * f30) + f29;
                                }
                            }
                        }
                        invalidateSelf();
                    }
                    if (this.f28313u) {
                        f32 = this.f28310r;
                        if (f32 < 1.0f) {
                            f33 = (j10 / this.f28303k) + f32;
                            this.f28310r = f33;
                            if (f33 >= 1.0f) {
                                this.f28308p = this.f28309q;
                                this.f28310r = 1.0f;
                                this.f28313u = false;
                            }
                            invalidateSelf();
                        }
                    }
                    i32 = i10;
                    if (i32 >= 1) {
                        canvas.restoreToCount(i32);
                    }
                }
                pathArr = org.telegram.ui.ActionBar.g6.f22997a5;
                pathArr2 = null;
                if (i16 == 5) {
                    pathArr = org.telegram.ui.ActionBar.g6.Z4;
                } else if (this.f28308p == 5) {
                    pathArr2 = org.telegram.ui.ActionBar.g6.Z4;
                }
                pathArr3 = pathArr;
                pathArr4 = pathArr2;
                if (i16 == 7) {
                    drawable2 = org.telegram.ui.ActionBar.g6.f23016b5;
                    drawable = null;
                    i17 = 8;
                } else {
                    if (this.f28308p == 7) {
                        drawable = org.telegram.ui.ActionBar.g6.f23016b5;
                    } else {
                        drawable = null;
                    }
                    i17 = 8;
                    drawable2 = null;
                }
                if (i16 == i17) {
                    drawable2 = org.telegram.ui.ActionBar.g6.f23035c5;
                } else if (this.f28308p == i17) {
                    drawable = org.telegram.ui.ActionBar.g6.f23035c5;
                }
                if (this.f28308p != 9) {
                    a(false);
                    if (this.f28308p == this.f28309q) {
                        i18 = 255;
                    } else {
                        i18 = (int) (this.f28310r * 255.0f);
                    }
                    paint5.setAlpha(i18);
                    int iDp115 = AndroidUtilities.dp(7.0f) + i14;
                    int iDp116 = iCenterX - AndroidUtilities.dp(3.0f);
                    if (this.f28308p != this.f28309q) {
                        canvas.save();
                        float f61110 = this.f28310r;
                        canvas.scale(f61110, f61110, iCenterX, i14);
                    }
                    float f61111 = iDp116;
                    float f61112 = iDp115;
                    drawable3 = drawable;
                    drawable4 = drawable2;
                    canvas.drawLine(iDp116 - AndroidUtilities.dp(6.0f), iDp115 - AndroidUtilities.dp(6.0f), f61111, f61112, paint5);
                    canvas = canvas;
                    canvas.drawLine(f61111, f61112, AndroidUtilities.dp(12.0f) + iDp116, iDp115 - AndroidUtilities.dp(12.0f), paint5);
                    if (this.f28308p != this.f28309q) {
                        canvas.restore();
                    }
                } else {
                    a(false);
                    if (this.f28308p == this.f28309q) {
                        i18 = 255;
                    } else {
                        i18 = (int) (this.f28310r * 255.0f);
                    }
                    paint5.setAlpha(i18);
                    int iDp117 = AndroidUtilities.dp(7.0f) + i14;
                    int iDp118 = iCenterX - AndroidUtilities.dp(3.0f);
                    if (this.f28308p != this.f28309q) {
                        canvas.save();
                        float f61113 = this.f28310r;
                        canvas.scale(f61113, f61113, iCenterX, i14);
                    }
                    float f61114 = iDp118;
                    float f61115 = iDp117;
                    drawable3 = drawable;
                    drawable4 = drawable2;
                    canvas.drawLine(iDp118 - AndroidUtilities.dp(6.0f), iDp117 - AndroidUtilities.dp(6.0f), f61114, f61115, paint5);
                    canvas = canvas;
                    canvas.drawLine(f61114, f61115, AndroidUtilities.dp(12.0f) + iDp118, iDp117 - AndroidUtilities.dp(12.0f), paint5);
                    if (this.f28308p != this.f28309q) {
                        canvas.restore();
                    }
                }
                if (this.f28308p != 12) {
                    a(false);
                    i19 = this.f28308p;
                    i20 = this.f28309q;
                    if (i19 == i20) {
                        f16 = 1.0f;
                    } else if (i20 == 13) {
                        f16 = this.f28310r;
                    } else {
                        f16 = 1.0f - this.f28310r;
                    }
                    if (i19 == i20) {
                        i21 = 255;
                    } else {
                        i21 = (int) (f16 * 255.0f);
                    }
                    paint5.setAlpha(i21);
                    AndroidUtilities.dp(7.0f);
                    AndroidUtilities.dp(3.0f);
                    if (this.f28308p != this.f28309q) {
                        canvas.save();
                        canvas.scale(f16, f16, iCenterX, i14);
                    }
                    float fDp110 = AndroidUtilities.dp(7.0f) * this.h;
                    float f61116 = iCenterX;
                    float f61117 = f61116 - fDp110;
                    float f71114 = i14;
                    float f71115 = f71114 - fDp110;
                    float f71116 = f61116 + fDp110;
                    float f71117 = f71114 + fDp110;
                    canvas.drawLine(f61117, f71115, f71116, f71117, paint5);
                    canvas.drawLine(f71116, f71115, f61117, f71117, paint5);
                    if (this.f28308p != this.f28309q) {
                        canvas.restore();
                    }
                } else {
                    a(false);
                    i19 = this.f28308p;
                    i20 = this.f28309q;
                    if (i19 == i20) {
                        f16 = 1.0f;
                    } else if (i20 == 13) {
                        f16 = this.f28310r;
                    } else {
                        f16 = 1.0f - this.f28310r;
                    }
                    if (i19 == i20) {
                        i21 = 255;
                    } else {
                        i21 = (int) (f16 * 255.0f);
                    }
                    paint5.setAlpha(i21);
                    AndroidUtilities.dp(7.0f);
                    AndroidUtilities.dp(3.0f);
                    if (this.f28308p != this.f28309q) {
                        canvas.save();
                        canvas.scale(f16, f16, iCenterX, i14);
                    }
                    float fDp111 = AndroidUtilities.dp(7.0f) * this.h;
                    float f61118 = iCenterX;
                    float f61119 = f61118 - fDp111;
                    float f71118 = i14;
                    float f71119 = f71118 - fDp111;
                    float f711110 = f61118 + fDp111;
                    float f711111 = f71118 + fDp111;
                    canvas.drawLine(f61119, f71119, f711110, f711111, paint5);
                    canvas.drawLine(f711110, f71119, f61119, f711111, paint5);
                    if (this.f28308p != this.f28309q) {
                        canvas.restore();
                    }
                }
                if (this.f28308p != 13) {
                    a(false);
                    i22 = this.f28308p;
                    i23 = this.f28309q;
                    if (i22 == i23) {
                        f17 = 1.0f;
                    } else if (i23 == 13) {
                        f17 = this.f28310r;
                    } else {
                        f17 = 1.0f - this.f28310r;
                    }
                    textPaint = this.f28295a;
                    textPaint.setAlpha((int) (f17 * 255.0f));
                    int iDp119 = AndroidUtilities.dp(5.0f) + i14;
                    f18 = 5.0f;
                    int i5111 = iCenterX - (this.f28306n / 2);
                    rect = bounds;
                    f19 = fMax;
                    if (this.f28308p != this.f28309q) {
                        canvas.save();
                        canvas.scale(f17, f17, iCenterX, i14);
                    }
                    i24 = (int) (this.f28315x * 100.0f);
                    if (this.f28305m != null) {
                        this.f28304l = i24;
                        String str10 = String.format("%d%%", Integer.valueOf(i24));
                        this.f28305m = str10;
                        this.f28306n = (int) Math.ceil(textPaint.measureText(str10));
                    } else {
                        this.f28304l = i24;
                        String str11 = String.format("%d%%", Integer.valueOf(i24));
                        this.f28305m = str11;
                        this.f28306n = (int) Math.ceil(textPaint.measureText(str11));
                    }
                    canvas.drawText(this.f28305m, i5111, iDp119, textPaint);
                    if (this.f28308p != this.f28309q) {
                        canvas.restore();
                    }
                } else {
                    a(false);
                    i22 = this.f28308p;
                    i23 = this.f28309q;
                    if (i22 == i23) {
                        f17 = 1.0f;
                    } else if (i23 == 13) {
                        f17 = this.f28310r;
                    } else {
                        f17 = 1.0f - this.f28310r;
                    }
                    textPaint = this.f28295a;
                    textPaint.setAlpha((int) (f17 * 255.0f));
                    int iDp1110 = AndroidUtilities.dp(5.0f) + i14;
                    f18 = 5.0f;
                    int i5112 = iCenterX - (this.f28306n / 2);
                    rect = bounds;
                    f19 = fMax;
                    if (this.f28308p != this.f28309q) {
                        canvas.save();
                        canvas.scale(f17, f17, iCenterX, i14);
                    }
                    i24 = (int) (this.f28315x * 100.0f);
                    if (this.f28305m != null) {
                        this.f28304l = i24;
                        String str12 = String.format("%d%%", Integer.valueOf(i24));
                        this.f28305m = str12;
                        this.f28306n = (int) Math.ceil(textPaint.measureText(str12));
                    } else {
                        this.f28304l = i24;
                        String str13 = String.format("%d%%", Integer.valueOf(i24));
                        this.f28305m = str13;
                        this.f28306n = (int) Math.ceil(textPaint.measureText(str13));
                    }
                    canvas.drawText(this.f28305m, i5112, iDp1110, textPaint);
                    if (this.f28308p != this.f28309q) {
                        canvas.restore();
                    }
                }
                i25 = this.f28308p;
                if (i25 != 0) {
                    if (i25 == 0) {
                        i26 = 1;
                        if (i25 == 1) {
                            f20 = 1.0f;
                        } else {
                            f20 = 0.0f;
                        }
                        f21 = f20;
                        i27 = this.f28309q;
                        if (i27 != 0) {
                            paint = paint4;
                            paint.setAlpha(255);
                        } else {
                            paint = paint4;
                            paint.setAlpha(255);
                        }
                        a(true);
                        canvas.save();
                        canvas.translate(com.google.android.recaptcha.internal.a.z(1.0f, f21, AndroidUtilities.dp(1.0f), rect.centerX()), rect.centerY());
                        float f711112 = f21 * 500.0f;
                        i28 = this.f28308p;
                        if (i28 == 1) {
                            f22 = 90.0f;
                        } else {
                            f22 = 0.0f;
                        }
                        if (i28 != 0) {
                            if (i28 == 1) {
                                interpolation = f22;
                            } else {
                                interpolation = f22;
                            }
                        } else if (i28 == 1) {
                            interpolation = f22;
                        } else {
                            interpolation = f22;
                        }
                        canvas.rotate(interpolation);
                        i29 = this.f28308p;
                        if (i29 == 0) {
                            canvas.scale(f15, f15);
                        } else {
                            canvas.scale(f15, f15);
                        }
                        org.telegram.ui.ActionBar.g6.f23403x3.b(canvas, paint, f711112);
                        canvas.scale(1.0f, -1.0f);
                        org.telegram.ui.ActionBar.g6.f23403x3.b(canvas, paint, f711112);
                        canvas.restore();
                    } else {
                        i26 = 1;
                        if (i25 == 1) {
                            f20 = 1.0f;
                        } else {
                            f20 = 0.0f;
                        }
                        f21 = f20;
                        i27 = this.f28309q;
                        if (i27 != 0) {
                            paint = paint4;
                            paint.setAlpha(255);
                        } else {
                            paint = paint4;
                            paint.setAlpha(255);
                        }
                        a(true);
                        canvas.save();
                        canvas.translate(com.google.android.recaptcha.internal.a.z(1.0f, f21, AndroidUtilities.dp(1.0f), rect.centerX()), rect.centerY());
                        float f711113 = f21 * 500.0f;
                        i28 = this.f28308p;
                        if (i28 == 1) {
                            f22 = 90.0f;
                        } else {
                            f22 = 0.0f;
                        }
                        if (i28 != 0) {
                            if (i28 == 1) {
                                interpolation = f22;
                            } else {
                                interpolation = f22;
                            }
                        } else if (i28 == 1) {
                            interpolation = f22;
                        } else {
                            interpolation = f22;
                        }
                        canvas.rotate(interpolation);
                        i29 = this.f28308p;
                        if (i29 == 0) {
                            canvas.scale(f15, f15);
                        } else {
                            canvas.scale(f15, f15);
                        }
                        org.telegram.ui.ActionBar.g6.f23403x3.b(canvas, paint, f711113);
                        canvas.scale(1.0f, -1.0f);
                        org.telegram.ui.ActionBar.g6.f23403x3.b(canvas, paint, f711113);
                        canvas.restore();
                    }
                } else if (i25 == 0) {
                    i26 = 1;
                    if (i25 == 1) {
                        f20 = 1.0f;
                    } else {
                        f20 = 0.0f;
                    }
                    f21 = f20;
                    i27 = this.f28309q;
                    if (i27 != 0) {
                        paint = paint4;
                        paint.setAlpha(255);
                    } else {
                        paint = paint4;
                        paint.setAlpha(255);
                    }
                    a(true);
                    canvas.save();
                    canvas.translate(com.google.android.recaptcha.internal.a.z(1.0f, f21, AndroidUtilities.dp(1.0f), rect.centerX()), rect.centerY());
                    float f711114 = f21 * 500.0f;
                    i28 = this.f28308p;
                    if (i28 == 1) {
                        f22 = 90.0f;
                    } else {
                        f22 = 0.0f;
                    }
                    if (i28 != 0) {
                        if (i28 == 1) {
                            interpolation = f22;
                        } else {
                            interpolation = f22;
                        }
                    } else if (i28 == 1) {
                        interpolation = f22;
                    } else {
                        interpolation = f22;
                    }
                    canvas.rotate(interpolation);
                    i29 = this.f28308p;
                    if (i29 == 0) {
                        canvas.scale(f15, f15);
                    } else {
                        canvas.scale(f15, f15);
                    }
                    org.telegram.ui.ActionBar.g6.f23403x3.b(canvas, paint, f711114);
                    canvas.scale(1.0f, -1.0f);
                    org.telegram.ui.ActionBar.g6.f23403x3.b(canvas, paint, f711114);
                    canvas.restore();
                } else {
                    i26 = 1;
                    if (i25 == 1) {
                        f20 = 1.0f;
                    } else {
                        f20 = 0.0f;
                    }
                    f21 = f20;
                    i27 = this.f28309q;
                    if (i27 != 0) {
                        paint = paint4;
                        paint.setAlpha(255);
                    } else {
                        paint = paint4;
                        paint.setAlpha(255);
                    }
                    a(true);
                    canvas.save();
                    canvas.translate(com.google.android.recaptcha.internal.a.z(1.0f, f21, AndroidUtilities.dp(1.0f), rect.centerX()), rect.centerY());
                    float f711115 = f21 * 500.0f;
                    i28 = this.f28308p;
                    if (i28 == 1) {
                        f22 = 90.0f;
                    } else {
                        f22 = 0.0f;
                    }
                    if (i28 != 0) {
                        if (i28 == 1) {
                            interpolation = f22;
                        } else {
                            interpolation = f22;
                        }
                    } else if (i28 == 1) {
                        interpolation = f22;
                    } else {
                        interpolation = f22;
                    }
                    canvas.rotate(interpolation);
                    i29 = this.f28308p;
                    if (i29 == 0) {
                        canvas.scale(f15, f15);
                    } else {
                        canvas.scale(f15, f15);
                    }
                    org.telegram.ui.ActionBar.g6.f23403x3.b(canvas, paint, f711115);
                    canvas.scale(1.0f, -1.0f);
                    org.telegram.ui.ActionBar.g6.f23403x3.b(canvas, paint, f711115);
                    canvas.restore();
                }
                if (this.f28308p != 6) {
                    a(false);
                    if (this.f28308p != 6) {
                        f24 = this.f28310r;
                        if (f24 > 0.5f) {
                            f26 = (f24 - 0.5f) / 0.5f;
                            fMin = 1.0f - Math.min(1.0f, f26 / 0.5f);
                            if (f26 > 0.5f) {
                                f25 = (f26 - 0.5f) / 0.5f;
                            } else {
                                f25 = 0.0f;
                            }
                        } else {
                            f25 = 0.0f;
                            fMin = 1.0f;
                        }
                        paint5.setAlpha(255);
                        f23 = f25;
                    } else {
                        if (this.f28309q != 6) {
                            paint5.setAlpha((int) ((1.0f - this.f28310r) * 255.0f));
                        } else {
                            paint5.setAlpha(255);
                        }
                        fMin = 0.0f;
                        f23 = 1.0f;
                    }
                    iDp = AndroidUtilities.dp(7.0f) + i14;
                    iDp2 = iCenterX - AndroidUtilities.dp(3.0f);
                    if (fMin < 1.0f) {
                        canvas.drawLine(iDp2 - AndroidUtilities.dp(6.0f), iDp - AndroidUtilities.dp(6.0f), iDp2 - (AndroidUtilities.dp(6.0f) * fMin), iDp - (AndroidUtilities.dp(6.0f) * fMin), paint5);
                    }
                    if (f23 > 0.0f) {
                        float f7210 = iDp2;
                        float f7211 = iDp;
                        canvas = canvas;
                        canvas.drawLine(f7210, f7211, (AndroidUtilities.dp(12.0f) * f23) + f7210, f7211 - (AndroidUtilities.dp(12.0f) * f23), paint5);
                    } else {
                        canvas = canvas;
                    }
                } else {
                    a(false);
                    if (this.f28308p != 6) {
                        f24 = this.f28310r;
                        if (f24 > 0.5f) {
                            f26 = (f24 - 0.5f) / 0.5f;
                            fMin = 1.0f - Math.min(1.0f, f26 / 0.5f);
                            if (f26 > 0.5f) {
                                f25 = (f26 - 0.5f) / 0.5f;
                            } else {
                                f25 = 0.0f;
                            }
                        } else {
                            f25 = 0.0f;
                            fMin = 1.0f;
                        }
                        paint5.setAlpha(255);
                        f23 = f25;
                    } else {
                        if (this.f28309q != 6) {
                            paint5.setAlpha((int) ((1.0f - this.f28310r) * 255.0f));
                        } else {
                            paint5.setAlpha(255);
                        }
                        fMin = 0.0f;
                        f23 = 1.0f;
                    }
                    iDp = AndroidUtilities.dp(7.0f) + i14;
                    iDp2 = iCenterX - AndroidUtilities.dp(3.0f);
                    if (fMin < 1.0f) {
                        canvas.drawLine(iDp2 - AndroidUtilities.dp(6.0f), iDp - AndroidUtilities.dp(6.0f), iDp2 - (AndroidUtilities.dp(6.0f) * fMin), iDp - (AndroidUtilities.dp(6.0f) * fMin), paint5);
                    }
                    if (f23 > 0.0f) {
                        float f7212 = iDp2;
                        float f7213 = iDp;
                        canvas = canvas;
                        canvas.drawLine(f7212, f7213, (AndroidUtilities.dp(12.0f) * f23) + f7212, f7213 - (AndroidUtilities.dp(12.0f) * f23), paint5);
                    } else {
                        canvas = canvas;
                    }
                }
                if (drawable3 != null) {
                    int intrinsicWidth7 = (int) (drawable3.getIntrinsicWidth() * f19);
                    int intrinsicHeight7 = (int) (drawable3.getIntrinsicHeight() * f19);
                    drawable3.setColorFilter(this.f28300g);
                    if (this.f28308p == this.f28309q) {
                        i35 = 255;
                    } else {
                        i35 = (int) ((1.0f - this.f28310r) * 255.0f);
                    }
                    drawable3.setAlpha(i35);
                    int i5113 = intrinsicWidth7 / 2;
                    int i5114 = intrinsicHeight7 / 2;
                    drawable3.setBounds(iCenterX - i5113, i14 - i5114, iCenterX + i5113, i5114 + i14);
                    drawable3.draw(canvas);
                }
                if (drawable4 != null) {
                    int intrinsicWidth8 = (int) (drawable4.getIntrinsicWidth() * f15);
                    int intrinsicHeight8 = (int) (drawable4.getIntrinsicHeight() * f15);
                    drawable4.setColorFilter(this.f28300g);
                    if (this.f28308p == this.f28309q) {
                        i34 = 255;
                    } else {
                        i34 = (int) (this.f28310r * 255.0f);
                    }
                    drawable4.setAlpha(i34);
                    int i5115 = intrinsicWidth8 / 2;
                    int i5116 = intrinsicHeight8 / 2;
                    drawable4.setBounds(iCenterX - i5115, i14 - i5116, iCenterX + i5115, i5116 + i14);
                    drawable4.draw(canvas);
                }
                paint2 = this.f28297c;
                if (pathArr4 != null) {
                    i30 = iCenterX;
                } else {
                    i30 = iCenterX;
                }
                if (pathArr3 != null) {
                    int iDp1111 = AndroidUtilities.dp(24.0f);
                    if (this.f28308p == this.f28309q) {
                        i33 = 255;
                    } else {
                        i33 = (int) (this.f28310r * 255.0f);
                    }
                    paint.setStyle(Paint.Style.FILL_AND_STROKE);
                    paint.setAlpha(i33);
                    a(true);
                    canvas.save();
                    canvas.translate(i30, i14);
                    canvas.scale(f15, f15);
                    float f7214 = (-iDp1111) / 2;
                    canvas.translate(f7214, f7214);
                    path = pathArr3[0];
                    if (path != null) {
                        canvas.drawPath(path, paint);
                    }
                    if (pathArr3.length >= 3) {
                        canvas.drawPath(path3, paint5);
                    }
                    path2 = pathArr3[1];
                    if (path2 != null) {
                        if (i33 != 255) {
                            int alpha4 = paint2.getAlpha();
                            paint2.setAlpha((int) ((i33 / 255.0f) * alpha4));
                            canvas.drawPath(pathArr3[1], paint2);
                            paint2.setAlpha(alpha4);
                        } else {
                            canvas.drawPath(path2, paint2);
                        }
                    }
                    canvas.restore();
                }
                long jCurrentTimeMillis4 = System.currentTimeMillis();
                j10 = jCurrentTimeMillis4 - this.f28312t;
                if (j10 > 17) {
                    j10 = 17;
                }
                this.f28312t = jCurrentTimeMillis4;
                i31 = this.f28308p;
                if (i31 != 3) {
                    f27 = ((360 * j10) / 2500.0f) + this.v;
                    this.v = f27;
                    while (f27 > 360.0f) {
                        f27 -= 360.0f;
                    }
                    this.v = f27;
                    if (this.f28309q != 2) {
                        f28 = this.f28314w;
                        f29 = this.f28316y;
                        f30 = f28 - f29;
                        if (f30 > 0.0f) {
                            f31 = this.f28317z + j10;
                            this.f28317z = f31;
                            if (f31 >= 200.0f) {
                                this.f28315x = f28;
                                this.f28316y = f28;
                                this.f28317z = 0.0f;
                            } else {
                                this.f28315x = (this.f28301i.getInterpolation(f31 / 200.0f) * f30) + f29;
                            }
                        }
                    }
                    invalidateSelf();
                } else {
                    f27 = ((360 * j10) / 2500.0f) + this.v;
                    this.v = f27;
                    while (f27 > 360.0f) {
                        f27 -= 360.0f;
                    }
                    this.v = f27;
                    if (this.f28309q != 2) {
                        f28 = this.f28314w;
                        f29 = this.f28316y;
                        f30 = f28 - f29;
                        if (f30 > 0.0f) {
                            f31 = this.f28317z + j10;
                            this.f28317z = f31;
                            if (f31 >= 200.0f) {
                                this.f28315x = f28;
                                this.f28316y = f28;
                                this.f28317z = 0.0f;
                            } else {
                                this.f28315x = (this.f28301i.getInterpolation(f31 / 200.0f) * f30) + f29;
                            }
                        }
                    }
                    invalidateSelf();
                }
                if (this.f28313u) {
                    f32 = this.f28310r;
                    if (f32 < 1.0f) {
                        f33 = (j10 / this.f28303k) + f32;
                        this.f28310r = f33;
                        if (f33 >= 1.0f) {
                            this.f28308p = this.f28309q;
                            this.f28310r = 1.0f;
                            this.f28313u = false;
                        }
                        invalidateSelf();
                    }
                }
                i32 = i10;
                if (i32 >= 1) {
                    canvas.restoreToCount(i32);
                }
            }
            if (i60 == 6) {
                f34 = 1.0f;
                fMin2 = Math.min(1.0f, this.f28310r / 0.5f);
            } else {
                f34 = 1.0f;
                fMin2 = this.f28310r;
            }
            float f91 = f34 - fMin2;
            fCenterX = bounds.centerX();
            fCenterY = bounds.centerY();
            fDp4 = AndroidUtilities.dp(7.0f) * f91 * this.h;
            iMin = (int) (Math.min(f34, f91 * 2.0f) * 255.0f);
            f35 = f91;
            f36 = 0.0f;
            f39 = 1.0f;
            if (f35 != f39) {
                canvas.save();
                canvas.scale(f35, f35, fCenterX, fCenterY);
            }
            if (f36 != 0.0f) {
                canvas.save();
                i14 = i11;
                canvas.rotate(f36, iCenterX, i14);
            } else {
                i14 = i11;
            }
            if (iMin != 0) {
                f40 = iMin;
                paint5.setAlpha((int) (this.f28307o * f40));
                if (this.f28308p != 14) {
                    rectF2 = rectF;
                    paint3.setAlpha((int) (f40 * this.f28307o));
                    rectF2.set(iCenterX - AndroidUtilities.dp(3.5f), i14 - AndroidUtilities.dp(3.5f), AndroidUtilities.dp(3.5f) + iCenterX, AndroidUtilities.dp(3.5f) + i14);
                    canvas.drawRoundRect(rectF2, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), paint3);
                } else {
                    rectF2 = rectF;
                    paint3.setAlpha((int) (f40 * this.f28307o));
                    rectF2.set(iCenterX - AndroidUtilities.dp(3.5f), i14 - AndroidUtilities.dp(3.5f), AndroidUtilities.dp(3.5f) + iCenterX, AndroidUtilities.dp(3.5f) + i14);
                    canvas.drawRoundRect(rectF2, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), paint3);
                }
            } else {
                rectF2 = rectF;
            }
            if (f36 != 0.0f) {
                canvas.restore();
            }
            if (f35 != f39) {
                canvas.restore();
            }
            i37 = this.f28308p;
            if (i37 != 3) {
                float fMax4 = Math.max(4.0f, this.f28315x * 360.0f);
                int iDp120 = AndroidUtilities.dp(this.f28302j ? 2.0f : 4.0f);
                rectF2.set(bounds.left + iDp120, bounds.top + iDp120, bounds.right - iDp120, bounds.bottom - iDp120);
                i38 = this.f28308p;
                if (i38 != 14) {
                    paint5.setAlpha((int) (iMin * 0.15f * this.f28307o));
                    rectF3 = rectF2;
                    canvas.drawArc(rectF3, 0.0f, 360.0f, false, paint5);
                    paint5.setAlpha(iMin);
                } else {
                    paint5.setAlpha((int) (iMin * 0.15f * this.f28307o));
                    rectF3 = rectF2;
                    canvas.drawArc(rectF3, 0.0f, 360.0f, false, paint5);
                    paint5.setAlpha(iMin);
                }
                canvas = canvas;
                canvas.drawArc(rectF3, this.v, fMax4, false, paint5);
            } else {
                float fMax5 = Math.max(4.0f, this.f28315x * 360.0f);
                int iDp121 = AndroidUtilities.dp(this.f28302j ? 2.0f : 4.0f);
                rectF2.set(bounds.left + iDp121, bounds.top + iDp121, bounds.right - iDp121, bounds.bottom - iDp121);
                i38 = this.f28308p;
                if (i38 != 14) {
                    paint5.setAlpha((int) (iMin * 0.15f * this.f28307o));
                    rectF3 = rectF2;
                    canvas.drawArc(rectF3, 0.0f, 360.0f, false, paint5);
                    paint5.setAlpha(iMin);
                } else {
                    paint5.setAlpha((int) (iMin * 0.15f * this.f28307o));
                    rectF3 = rectF2;
                    canvas.drawArc(rectF3, 0.0f, 360.0f, false, paint5);
                    paint5.setAlpha(iMin);
                }
                canvas = canvas;
                canvas.drawArc(rectF3, this.v, fMax5, false, paint5);
            }
            i15 = this.f28308p;
            if (i15 == this.f28309q) {
                f15 = 1.0f;
                fMax = 1.0f;
            } else if (i15 != i13) {
                float f622 = this.f28310r;
                f15 = f622;
                fMax = 1.0f - f622;
            } else {
                float f623 = this.f28310r;
                f15 = f623;
                fMax = 1.0f - f623;
            }
            i16 = this.f28309q;
            if (i16 == 15) {
                if (this.f28308p == 15) {
                    pathArr2 = org.telegram.ui.ActionBar.g6.f22997a5;
                    pathArr = null;
                } else {
                    pathArr = null;
                }
                if (i16 == 5) {
                    pathArr = org.telegram.ui.ActionBar.g6.Z4;
                } else if (this.f28308p == 5) {
                    pathArr2 = org.telegram.ui.ActionBar.g6.Z4;
                }
                pathArr3 = pathArr;
                pathArr4 = pathArr2;
                if (i16 == 7) {
                    drawable2 = org.telegram.ui.ActionBar.g6.f23016b5;
                    drawable = null;
                    i17 = 8;
                } else {
                    if (this.f28308p == 7) {
                        drawable = org.telegram.ui.ActionBar.g6.f23016b5;
                    } else {
                        drawable = null;
                    }
                    i17 = 8;
                    drawable2 = null;
                }
                if (i16 == i17) {
                    drawable2 = org.telegram.ui.ActionBar.g6.f23035c5;
                } else if (this.f28308p == i17) {
                    drawable = org.telegram.ui.ActionBar.g6.f23035c5;
                }
                if (this.f28308p != 9) {
                    a(false);
                    if (this.f28308p == this.f28309q) {
                        i18 = 255;
                    } else {
                        i18 = (int) (this.f28310r * 255.0f);
                    }
                    paint5.setAlpha(i18);
                    int iDp1112 = AndroidUtilities.dp(7.0f) + i14;
                    int iDp1113 = iCenterX - AndroidUtilities.dp(3.0f);
                    if (this.f28308p != this.f28309q) {
                        canvas.save();
                        float f611110 = this.f28310r;
                        canvas.scale(f611110, f611110, iCenterX, i14);
                    }
                    float f611111 = iDp1113;
                    float f611112 = iDp1112;
                    drawable3 = drawable;
                    drawable4 = drawable2;
                    canvas.drawLine(iDp1113 - AndroidUtilities.dp(6.0f), iDp1112 - AndroidUtilities.dp(6.0f), f611111, f611112, paint5);
                    canvas = canvas;
                    canvas.drawLine(f611111, f611112, AndroidUtilities.dp(12.0f) + iDp1113, iDp1112 - AndroidUtilities.dp(12.0f), paint5);
                    if (this.f28308p != this.f28309q) {
                        canvas.restore();
                    }
                } else {
                    a(false);
                    if (this.f28308p == this.f28309q) {
                        i18 = 255;
                    } else {
                        i18 = (int) (this.f28310r * 255.0f);
                    }
                    paint5.setAlpha(i18);
                    int iDp1114 = AndroidUtilities.dp(7.0f) + i14;
                    int iDp1115 = iCenterX - AndroidUtilities.dp(3.0f);
                    if (this.f28308p != this.f28309q) {
                        canvas.save();
                        float f611113 = this.f28310r;
                        canvas.scale(f611113, f611113, iCenterX, i14);
                    }
                    float f611114 = iDp1115;
                    float f611115 = iDp1114;
                    drawable3 = drawable;
                    drawable4 = drawable2;
                    canvas.drawLine(iDp1115 - AndroidUtilities.dp(6.0f), iDp1114 - AndroidUtilities.dp(6.0f), f611114, f611115, paint5);
                    canvas = canvas;
                    canvas.drawLine(f611114, f611115, AndroidUtilities.dp(12.0f) + iDp1115, iDp1114 - AndroidUtilities.dp(12.0f), paint5);
                    if (this.f28308p != this.f28309q) {
                        canvas.restore();
                    }
                }
                if (this.f28308p != 12) {
                    a(false);
                    i19 = this.f28308p;
                    i20 = this.f28309q;
                    if (i19 == i20) {
                        f16 = 1.0f;
                    } else if (i20 == 13) {
                        f16 = this.f28310r;
                    } else {
                        f16 = 1.0f - this.f28310r;
                    }
                    if (i19 == i20) {
                        i21 = 255;
                    } else {
                        i21 = (int) (f16 * 255.0f);
                    }
                    paint5.setAlpha(i21);
                    AndroidUtilities.dp(7.0f);
                    AndroidUtilities.dp(3.0f);
                    if (this.f28308p != this.f28309q) {
                        canvas.save();
                        canvas.scale(f16, f16, iCenterX, i14);
                    }
                    float fDp112 = AndroidUtilities.dp(7.0f) * this.h;
                    float f611116 = iCenterX;
                    float f611117 = f611116 - fDp112;
                    float f711116 = i14;
                    float f711117 = f711116 - fDp112;
                    float f711118 = f611116 + fDp112;
                    float f711119 = f711116 + fDp112;
                    canvas.drawLine(f611117, f711117, f711118, f711119, paint5);
                    canvas.drawLine(f711118, f711117, f611117, f711119, paint5);
                    if (this.f28308p != this.f28309q) {
                        canvas.restore();
                    }
                } else {
                    a(false);
                    i19 = this.f28308p;
                    i20 = this.f28309q;
                    if (i19 == i20) {
                        f16 = 1.0f;
                    } else if (i20 == 13) {
                        f16 = this.f28310r;
                    } else {
                        f16 = 1.0f - this.f28310r;
                    }
                    if (i19 == i20) {
                        i21 = 255;
                    } else {
                        i21 = (int) (f16 * 255.0f);
                    }
                    paint5.setAlpha(i21);
                    AndroidUtilities.dp(7.0f);
                    AndroidUtilities.dp(3.0f);
                    if (this.f28308p != this.f28309q) {
                        canvas.save();
                        canvas.scale(f16, f16, iCenterX, i14);
                    }
                    float fDp113 = AndroidUtilities.dp(7.0f) * this.h;
                    float f611118 = iCenterX;
                    float f611119 = f611118 - fDp113;
                    float f7111110 = i14;
                    float f7111111 = f7111110 - fDp113;
                    float f7111112 = f611118 + fDp113;
                    float f7111113 = f7111110 + fDp113;
                    canvas.drawLine(f611119, f7111111, f7111112, f7111113, paint5);
                    canvas.drawLine(f7111112, f7111111, f611119, f7111113, paint5);
                    if (this.f28308p != this.f28309q) {
                        canvas.restore();
                    }
                }
                if (this.f28308p != 13) {
                    a(false);
                    i22 = this.f28308p;
                    i23 = this.f28309q;
                    if (i22 == i23) {
                        f17 = 1.0f;
                    } else if (i23 == 13) {
                        f17 = this.f28310r;
                    } else {
                        f17 = 1.0f - this.f28310r;
                    }
                    textPaint = this.f28295a;
                    textPaint.setAlpha((int) (f17 * 255.0f));
                    int iDp1116 = AndroidUtilities.dp(5.0f) + i14;
                    f18 = 5.0f;
                    int i5117 = iCenterX - (this.f28306n / 2);
                    rect = bounds;
                    f19 = fMax;
                    if (this.f28308p != this.f28309q) {
                        canvas.save();
                        canvas.scale(f17, f17, iCenterX, i14);
                    }
                    i24 = (int) (this.f28315x * 100.0f);
                    if (this.f28305m != null) {
                        this.f28304l = i24;
                        String str14 = String.format("%d%%", Integer.valueOf(i24));
                        this.f28305m = str14;
                        this.f28306n = (int) Math.ceil(textPaint.measureText(str14));
                    } else {
                        this.f28304l = i24;
                        String str15 = String.format("%d%%", Integer.valueOf(i24));
                        this.f28305m = str15;
                        this.f28306n = (int) Math.ceil(textPaint.measureText(str15));
                    }
                    canvas.drawText(this.f28305m, i5117, iDp1116, textPaint);
                    if (this.f28308p != this.f28309q) {
                        canvas.restore();
                    }
                } else {
                    a(false);
                    i22 = this.f28308p;
                    i23 = this.f28309q;
                    if (i22 == i23) {
                        f17 = 1.0f;
                    } else if (i23 == 13) {
                        f17 = this.f28310r;
                    } else {
                        f17 = 1.0f - this.f28310r;
                    }
                    textPaint = this.f28295a;
                    textPaint.setAlpha((int) (f17 * 255.0f));
                    int iDp1117 = AndroidUtilities.dp(5.0f) + i14;
                    f18 = 5.0f;
                    int i5118 = iCenterX - (this.f28306n / 2);
                    rect = bounds;
                    f19 = fMax;
                    if (this.f28308p != this.f28309q) {
                        canvas.save();
                        canvas.scale(f17, f17, iCenterX, i14);
                    }
                    i24 = (int) (this.f28315x * 100.0f);
                    if (this.f28305m != null) {
                        this.f28304l = i24;
                        String str16 = String.format("%d%%", Integer.valueOf(i24));
                        this.f28305m = str16;
                        this.f28306n = (int) Math.ceil(textPaint.measureText(str16));
                    } else {
                        this.f28304l = i24;
                        String str17 = String.format("%d%%", Integer.valueOf(i24));
                        this.f28305m = str17;
                        this.f28306n = (int) Math.ceil(textPaint.measureText(str17));
                    }
                    canvas.drawText(this.f28305m, i5118, iDp1117, textPaint);
                    if (this.f28308p != this.f28309q) {
                        canvas.restore();
                    }
                }
                i25 = this.f28308p;
                if (i25 != 0) {
                    if (i25 == 0) {
                        i26 = 1;
                        if (i25 == 1) {
                            f20 = 1.0f;
                        } else {
                            f20 = 0.0f;
                        }
                        f21 = f20;
                        i27 = this.f28309q;
                        if (i27 != 0) {
                            paint = paint4;
                            paint.setAlpha(255);
                        } else {
                            paint = paint4;
                            paint.setAlpha(255);
                        }
                        a(true);
                        canvas.save();
                        canvas.translate(com.google.android.recaptcha.internal.a.z(1.0f, f21, AndroidUtilities.dp(1.0f), rect.centerX()), rect.centerY());
                        float f7111114 = f21 * 500.0f;
                        i28 = this.f28308p;
                        if (i28 == 1) {
                            f22 = 90.0f;
                        } else {
                            f22 = 0.0f;
                        }
                        if (i28 != 0) {
                            if (i28 == 1) {
                                interpolation = f22;
                            } else {
                                interpolation = f22;
                            }
                        } else if (i28 == 1) {
                            interpolation = f22;
                        } else {
                            interpolation = f22;
                        }
                        canvas.rotate(interpolation);
                        i29 = this.f28308p;
                        if (i29 == 0) {
                            canvas.scale(f15, f15);
                        } else {
                            canvas.scale(f15, f15);
                        }
                        org.telegram.ui.ActionBar.g6.f23403x3.b(canvas, paint, f7111114);
                        canvas.scale(1.0f, -1.0f);
                        org.telegram.ui.ActionBar.g6.f23403x3.b(canvas, paint, f7111114);
                        canvas.restore();
                    } else {
                        i26 = 1;
                        if (i25 == 1) {
                            f20 = 1.0f;
                        } else {
                            f20 = 0.0f;
                        }
                        f21 = f20;
                        i27 = this.f28309q;
                        if (i27 != 0) {
                            paint = paint4;
                            paint.setAlpha(255);
                        } else {
                            paint = paint4;
                            paint.setAlpha(255);
                        }
                        a(true);
                        canvas.save();
                        canvas.translate(com.google.android.recaptcha.internal.a.z(1.0f, f21, AndroidUtilities.dp(1.0f), rect.centerX()), rect.centerY());
                        float f7111115 = f21 * 500.0f;
                        i28 = this.f28308p;
                        if (i28 == 1) {
                            f22 = 90.0f;
                        } else {
                            f22 = 0.0f;
                        }
                        if (i28 != 0) {
                            if (i28 == 1) {
                                interpolation = f22;
                            } else {
                                interpolation = f22;
                            }
                        } else if (i28 == 1) {
                            interpolation = f22;
                        } else {
                            interpolation = f22;
                        }
                        canvas.rotate(interpolation);
                        i29 = this.f28308p;
                        if (i29 == 0) {
                            canvas.scale(f15, f15);
                        } else {
                            canvas.scale(f15, f15);
                        }
                        org.telegram.ui.ActionBar.g6.f23403x3.b(canvas, paint, f7111115);
                        canvas.scale(1.0f, -1.0f);
                        org.telegram.ui.ActionBar.g6.f23403x3.b(canvas, paint, f7111115);
                        canvas.restore();
                    }
                } else if (i25 == 0) {
                    i26 = 1;
                    if (i25 == 1) {
                        f20 = 1.0f;
                    } else {
                        f20 = 0.0f;
                    }
                    f21 = f20;
                    i27 = this.f28309q;
                    if (i27 != 0) {
                        paint = paint4;
                        paint.setAlpha(255);
                    } else {
                        paint = paint4;
                        paint.setAlpha(255);
                    }
                    a(true);
                    canvas.save();
                    canvas.translate(com.google.android.recaptcha.internal.a.z(1.0f, f21, AndroidUtilities.dp(1.0f), rect.centerX()), rect.centerY());
                    float f7111116 = f21 * 500.0f;
                    i28 = this.f28308p;
                    if (i28 == 1) {
                        f22 = 90.0f;
                    } else {
                        f22 = 0.0f;
                    }
                    if (i28 != 0) {
                        if (i28 == 1) {
                            interpolation = f22;
                        } else {
                            interpolation = f22;
                        }
                    } else if (i28 == 1) {
                        interpolation = f22;
                    } else {
                        interpolation = f22;
                    }
                    canvas.rotate(interpolation);
                    i29 = this.f28308p;
                    if (i29 == 0) {
                        canvas.scale(f15, f15);
                    } else {
                        canvas.scale(f15, f15);
                    }
                    org.telegram.ui.ActionBar.g6.f23403x3.b(canvas, paint, f7111116);
                    canvas.scale(1.0f, -1.0f);
                    org.telegram.ui.ActionBar.g6.f23403x3.b(canvas, paint, f7111116);
                    canvas.restore();
                } else {
                    i26 = 1;
                    if (i25 == 1) {
                        f20 = 1.0f;
                    } else {
                        f20 = 0.0f;
                    }
                    f21 = f20;
                    i27 = this.f28309q;
                    if (i27 != 0) {
                        paint = paint4;
                        paint.setAlpha(255);
                    } else {
                        paint = paint4;
                        paint.setAlpha(255);
                    }
                    a(true);
                    canvas.save();
                    canvas.translate(com.google.android.recaptcha.internal.a.z(1.0f, f21, AndroidUtilities.dp(1.0f), rect.centerX()), rect.centerY());
                    float f7111117 = f21 * 500.0f;
                    i28 = this.f28308p;
                    if (i28 == 1) {
                        f22 = 90.0f;
                    } else {
                        f22 = 0.0f;
                    }
                    if (i28 != 0) {
                        if (i28 == 1) {
                            interpolation = f22;
                        } else {
                            interpolation = f22;
                        }
                    } else if (i28 == 1) {
                        interpolation = f22;
                    } else {
                        interpolation = f22;
                    }
                    canvas.rotate(interpolation);
                    i29 = this.f28308p;
                    if (i29 == 0) {
                        canvas.scale(f15, f15);
                    } else {
                        canvas.scale(f15, f15);
                    }
                    org.telegram.ui.ActionBar.g6.f23403x3.b(canvas, paint, f7111117);
                    canvas.scale(1.0f, -1.0f);
                    org.telegram.ui.ActionBar.g6.f23403x3.b(canvas, paint, f7111117);
                    canvas.restore();
                }
                if (this.f28308p != 6) {
                    a(false);
                    if (this.f28308p != 6) {
                        f24 = this.f28310r;
                        if (f24 > 0.5f) {
                            f26 = (f24 - 0.5f) / 0.5f;
                            fMin = 1.0f - Math.min(1.0f, f26 / 0.5f);
                            if (f26 > 0.5f) {
                                f25 = (f26 - 0.5f) / 0.5f;
                            } else {
                                f25 = 0.0f;
                            }
                        } else {
                            f25 = 0.0f;
                            fMin = 1.0f;
                        }
                        paint5.setAlpha(255);
                        f23 = f25;
                    } else {
                        if (this.f28309q != 6) {
                            paint5.setAlpha((int) ((1.0f - this.f28310r) * 255.0f));
                        } else {
                            paint5.setAlpha(255);
                        }
                        fMin = 0.0f;
                        f23 = 1.0f;
                    }
                    iDp = AndroidUtilities.dp(7.0f) + i14;
                    iDp2 = iCenterX - AndroidUtilities.dp(3.0f);
                    if (fMin < 1.0f) {
                        canvas.drawLine(iDp2 - AndroidUtilities.dp(6.0f), iDp - AndroidUtilities.dp(6.0f), iDp2 - (AndroidUtilities.dp(6.0f) * fMin), iDp - (AndroidUtilities.dp(6.0f) * fMin), paint5);
                    }
                    if (f23 > 0.0f) {
                        float f7215 = iDp2;
                        float f7216 = iDp;
                        canvas = canvas;
                        canvas.drawLine(f7215, f7216, (AndroidUtilities.dp(12.0f) * f23) + f7215, f7216 - (AndroidUtilities.dp(12.0f) * f23), paint5);
                    } else {
                        canvas = canvas;
                    }
                } else {
                    a(false);
                    if (this.f28308p != 6) {
                        f24 = this.f28310r;
                        if (f24 > 0.5f) {
                            f26 = (f24 - 0.5f) / 0.5f;
                            fMin = 1.0f - Math.min(1.0f, f26 / 0.5f);
                            if (f26 > 0.5f) {
                                f25 = (f26 - 0.5f) / 0.5f;
                            } else {
                                f25 = 0.0f;
                            }
                        } else {
                            f25 = 0.0f;
                            fMin = 1.0f;
                        }
                        paint5.setAlpha(255);
                        f23 = f25;
                    } else {
                        if (this.f28309q != 6) {
                            paint5.setAlpha((int) ((1.0f - this.f28310r) * 255.0f));
                        } else {
                            paint5.setAlpha(255);
                        }
                        fMin = 0.0f;
                        f23 = 1.0f;
                    }
                    iDp = AndroidUtilities.dp(7.0f) + i14;
                    iDp2 = iCenterX - AndroidUtilities.dp(3.0f);
                    if (fMin < 1.0f) {
                        canvas.drawLine(iDp2 - AndroidUtilities.dp(6.0f), iDp - AndroidUtilities.dp(6.0f), iDp2 - (AndroidUtilities.dp(6.0f) * fMin), iDp - (AndroidUtilities.dp(6.0f) * fMin), paint5);
                    }
                    if (f23 > 0.0f) {
                        float f7217 = iDp2;
                        float f7218 = iDp;
                        canvas = canvas;
                        canvas.drawLine(f7217, f7218, (AndroidUtilities.dp(12.0f) * f23) + f7217, f7218 - (AndroidUtilities.dp(12.0f) * f23), paint5);
                    } else {
                        canvas = canvas;
                    }
                }
                if (drawable3 != null) {
                    int intrinsicWidth9 = (int) (drawable3.getIntrinsicWidth() * f19);
                    int intrinsicHeight9 = (int) (drawable3.getIntrinsicHeight() * f19);
                    drawable3.setColorFilter(this.f28300g);
                    if (this.f28308p == this.f28309q) {
                        i35 = 255;
                    } else {
                        i35 = (int) ((1.0f - this.f28310r) * 255.0f);
                    }
                    drawable3.setAlpha(i35);
                    int i5119 = intrinsicWidth9 / 2;
                    int i51110 = intrinsicHeight9 / 2;
                    drawable3.setBounds(iCenterX - i5119, i14 - i51110, iCenterX + i5119, i51110 + i14);
                    drawable3.draw(canvas);
                }
                if (drawable4 != null) {
                    int intrinsicWidth10 = (int) (drawable4.getIntrinsicWidth() * f15);
                    int intrinsicHeight10 = (int) (drawable4.getIntrinsicHeight() * f15);
                    drawable4.setColorFilter(this.f28300g);
                    if (this.f28308p == this.f28309q) {
                        i34 = 255;
                    } else {
                        i34 = (int) (this.f28310r * 255.0f);
                    }
                    drawable4.setAlpha(i34);
                    int i51111 = intrinsicWidth10 / 2;
                    int i51112 = intrinsicHeight10 / 2;
                    drawable4.setBounds(iCenterX - i51111, i14 - i51112, iCenterX + i51111, i51112 + i14);
                    drawable4.draw(canvas);
                }
                paint2 = this.f28297c;
                if (pathArr4 != null) {
                    i30 = iCenterX;
                } else {
                    i30 = iCenterX;
                }
                if (pathArr3 != null) {
                    int iDp1118 = AndroidUtilities.dp(24.0f);
                    if (this.f28308p == this.f28309q) {
                        i33 = 255;
                    } else {
                        i33 = (int) (this.f28310r * 255.0f);
                    }
                    paint.setStyle(Paint.Style.FILL_AND_STROKE);
                    paint.setAlpha(i33);
                    a(true);
                    canvas.save();
                    canvas.translate(i30, i14);
                    canvas.scale(f15, f15);
                    float f7219 = (-iDp1118) / 2;
                    canvas.translate(f7219, f7219);
                    path = pathArr3[0];
                    if (path != null) {
                        canvas.drawPath(path, paint);
                    }
                    if (pathArr3.length >= 3) {
                        canvas.drawPath(path3, paint5);
                    }
                    path2 = pathArr3[1];
                    if (path2 != null) {
                        if (i33 != 255) {
                            int alpha5 = paint2.getAlpha();
                            paint2.setAlpha((int) ((i33 / 255.0f) * alpha5));
                            canvas.drawPath(pathArr3[1], paint2);
                            paint2.setAlpha(alpha5);
                        } else {
                            canvas.drawPath(path2, paint2);
                        }
                    }
                    canvas.restore();
                }
                long jCurrentTimeMillis5 = System.currentTimeMillis();
                j10 = jCurrentTimeMillis5 - this.f28312t;
                if (j10 > 17) {
                    j10 = 17;
                }
                this.f28312t = jCurrentTimeMillis5;
                i31 = this.f28308p;
                if (i31 != 3) {
                    f27 = ((360 * j10) / 2500.0f) + this.v;
                    this.v = f27;
                    while (f27 > 360.0f) {
                        f27 -= 360.0f;
                    }
                    this.v = f27;
                    if (this.f28309q != 2) {
                        f28 = this.f28314w;
                        f29 = this.f28316y;
                        f30 = f28 - f29;
                        if (f30 > 0.0f) {
                            f31 = this.f28317z + j10;
                            this.f28317z = f31;
                            if (f31 >= 200.0f) {
                                this.f28315x = f28;
                                this.f28316y = f28;
                                this.f28317z = 0.0f;
                            } else {
                                this.f28315x = (this.f28301i.getInterpolation(f31 / 200.0f) * f30) + f29;
                            }
                        }
                    }
                    invalidateSelf();
                } else {
                    f27 = ((360 * j10) / 2500.0f) + this.v;
                    this.v = f27;
                    while (f27 > 360.0f) {
                        f27 -= 360.0f;
                    }
                    this.v = f27;
                    if (this.f28309q != 2) {
                        f28 = this.f28314w;
                        f29 = this.f28316y;
                        f30 = f28 - f29;
                        if (f30 > 0.0f) {
                            f31 = this.f28317z + j10;
                            this.f28317z = f31;
                            if (f31 >= 200.0f) {
                                this.f28315x = f28;
                                this.f28316y = f28;
                                this.f28317z = 0.0f;
                            } else {
                                this.f28315x = (this.f28301i.getInterpolation(f31 / 200.0f) * f30) + f29;
                            }
                        }
                    }
                    invalidateSelf();
                }
                if (this.f28313u) {
                    f32 = this.f28310r;
                    if (f32 < 1.0f) {
                        f33 = (j10 / this.f28303k) + f32;
                        this.f28310r = f33;
                        if (f33 >= 1.0f) {
                            this.f28308p = this.f28309q;
                            this.f28310r = 1.0f;
                            this.f28313u = false;
                        }
                        invalidateSelf();
                    }
                }
                i32 = i10;
                if (i32 >= 1) {
                    canvas.restoreToCount(i32);
                }
            }
            pathArr = org.telegram.ui.ActionBar.g6.f22997a5;
            pathArr2 = null;
            if (i16 == 5) {
                pathArr = org.telegram.ui.ActionBar.g6.Z4;
            } else if (this.f28308p == 5) {
                pathArr2 = org.telegram.ui.ActionBar.g6.Z4;
            }
            pathArr3 = pathArr;
            pathArr4 = pathArr2;
            if (i16 == 7) {
                drawable2 = org.telegram.ui.ActionBar.g6.f23016b5;
                drawable = null;
                i17 = 8;
            } else {
                if (this.f28308p == 7) {
                    drawable = org.telegram.ui.ActionBar.g6.f23016b5;
                } else {
                    drawable = null;
                }
                i17 = 8;
                drawable2 = null;
            }
            if (i16 == i17) {
                drawable2 = org.telegram.ui.ActionBar.g6.f23035c5;
            } else if (this.f28308p == i17) {
                drawable = org.telegram.ui.ActionBar.g6.f23035c5;
            }
            if (this.f28308p != 9) {
                a(false);
                if (this.f28308p == this.f28309q) {
                    i18 = 255;
                } else {
                    i18 = (int) (this.f28310r * 255.0f);
                }
                paint5.setAlpha(i18);
                int iDp1119 = AndroidUtilities.dp(7.0f) + i14;
                int iDp11110 = iCenterX - AndroidUtilities.dp(3.0f);
                if (this.f28308p != this.f28309q) {
                    canvas.save();
                    float f6111110 = this.f28310r;
                    canvas.scale(f6111110, f6111110, iCenterX, i14);
                }
                float f6111111 = iDp11110;
                float f6111112 = iDp1119;
                drawable3 = drawable;
                drawable4 = drawable2;
                canvas.drawLine(iDp11110 - AndroidUtilities.dp(6.0f), iDp1119 - AndroidUtilities.dp(6.0f), f6111111, f6111112, paint5);
                canvas = canvas;
                canvas.drawLine(f6111111, f6111112, AndroidUtilities.dp(12.0f) + iDp11110, iDp1119 - AndroidUtilities.dp(12.0f), paint5);
                if (this.f28308p != this.f28309q) {
                    canvas.restore();
                }
            } else {
                a(false);
                if (this.f28308p == this.f28309q) {
                    i18 = 255;
                } else {
                    i18 = (int) (this.f28310r * 255.0f);
                }
                paint5.setAlpha(i18);
                int iDp11111 = AndroidUtilities.dp(7.0f) + i14;
                int iDp11112 = iCenterX - AndroidUtilities.dp(3.0f);
                if (this.f28308p != this.f28309q) {
                    canvas.save();
                    float f6111113 = this.f28310r;
                    canvas.scale(f6111113, f6111113, iCenterX, i14);
                }
                float f6111114 = iDp11112;
                float f6111115 = iDp11111;
                drawable3 = drawable;
                drawable4 = drawable2;
                canvas.drawLine(iDp11112 - AndroidUtilities.dp(6.0f), iDp11111 - AndroidUtilities.dp(6.0f), f6111114, f6111115, paint5);
                canvas = canvas;
                canvas.drawLine(f6111114, f6111115, AndroidUtilities.dp(12.0f) + iDp11112, iDp11111 - AndroidUtilities.dp(12.0f), paint5);
                if (this.f28308p != this.f28309q) {
                    canvas.restore();
                }
            }
            if (this.f28308p != 12) {
                a(false);
                i19 = this.f28308p;
                i20 = this.f28309q;
                if (i19 == i20) {
                    f16 = 1.0f;
                } else if (i20 == 13) {
                    f16 = this.f28310r;
                } else {
                    f16 = 1.0f - this.f28310r;
                }
                if (i19 == i20) {
                    i21 = 255;
                } else {
                    i21 = (int) (f16 * 255.0f);
                }
                paint5.setAlpha(i21);
                AndroidUtilities.dp(7.0f);
                AndroidUtilities.dp(3.0f);
                if (this.f28308p != this.f28309q) {
                    canvas.save();
                    canvas.scale(f16, f16, iCenterX, i14);
                }
                float fDp114 = AndroidUtilities.dp(7.0f) * this.h;
                float f6111116 = iCenterX;
                float f6111117 = f6111116 - fDp114;
                float f7111118 = i14;
                float f7111119 = f7111118 - fDp114;
                float f71111110 = f6111116 + fDp114;
                float f71111111 = f7111118 + fDp114;
                canvas.drawLine(f6111117, f7111119, f71111110, f71111111, paint5);
                canvas.drawLine(f71111110, f7111119, f6111117, f71111111, paint5);
                if (this.f28308p != this.f28309q) {
                    canvas.restore();
                }
            } else {
                a(false);
                i19 = this.f28308p;
                i20 = this.f28309q;
                if (i19 == i20) {
                    f16 = 1.0f;
                } else if (i20 == 13) {
                    f16 = this.f28310r;
                } else {
                    f16 = 1.0f - this.f28310r;
                }
                if (i19 == i20) {
                    i21 = 255;
                } else {
                    i21 = (int) (f16 * 255.0f);
                }
                paint5.setAlpha(i21);
                AndroidUtilities.dp(7.0f);
                AndroidUtilities.dp(3.0f);
                if (this.f28308p != this.f28309q) {
                    canvas.save();
                    canvas.scale(f16, f16, iCenterX, i14);
                }
                float fDp115 = AndroidUtilities.dp(7.0f) * this.h;
                float f6111118 = iCenterX;
                float f6111119 = f6111118 - fDp115;
                float f71111112 = i14;
                float f71111113 = f71111112 - fDp115;
                float f71111114 = f6111118 + fDp115;
                float f71111115 = f71111112 + fDp115;
                canvas.drawLine(f6111119, f71111113, f71111114, f71111115, paint5);
                canvas.drawLine(f71111114, f71111113, f6111119, f71111115, paint5);
                if (this.f28308p != this.f28309q) {
                    canvas.restore();
                }
            }
            if (this.f28308p != 13) {
                a(false);
                i22 = this.f28308p;
                i23 = this.f28309q;
                if (i22 == i23) {
                    f17 = 1.0f;
                } else if (i23 == 13) {
                    f17 = this.f28310r;
                } else {
                    f17 = 1.0f - this.f28310r;
                }
                textPaint = this.f28295a;
                textPaint.setAlpha((int) (f17 * 255.0f));
                int iDp11113 = AndroidUtilities.dp(5.0f) + i14;
                f18 = 5.0f;
                int i51113 = iCenterX - (this.f28306n / 2);
                rect = bounds;
                f19 = fMax;
                if (this.f28308p != this.f28309q) {
                    canvas.save();
                    canvas.scale(f17, f17, iCenterX, i14);
                }
                i24 = (int) (this.f28315x * 100.0f);
                if (this.f28305m != null) {
                    this.f28304l = i24;
                    String str18 = String.format("%d%%", Integer.valueOf(i24));
                    this.f28305m = str18;
                    this.f28306n = (int) Math.ceil(textPaint.measureText(str18));
                } else {
                    this.f28304l = i24;
                    String str19 = String.format("%d%%", Integer.valueOf(i24));
                    this.f28305m = str19;
                    this.f28306n = (int) Math.ceil(textPaint.measureText(str19));
                }
                canvas.drawText(this.f28305m, i51113, iDp11113, textPaint);
                if (this.f28308p != this.f28309q) {
                    canvas.restore();
                }
            } else {
                a(false);
                i22 = this.f28308p;
                i23 = this.f28309q;
                if (i22 == i23) {
                    f17 = 1.0f;
                } else if (i23 == 13) {
                    f17 = this.f28310r;
                } else {
                    f17 = 1.0f - this.f28310r;
                }
                textPaint = this.f28295a;
                textPaint.setAlpha((int) (f17 * 255.0f));
                int iDp11114 = AndroidUtilities.dp(5.0f) + i14;
                f18 = 5.0f;
                int i51114 = iCenterX - (this.f28306n / 2);
                rect = bounds;
                f19 = fMax;
                if (this.f28308p != this.f28309q) {
                    canvas.save();
                    canvas.scale(f17, f17, iCenterX, i14);
                }
                i24 = (int) (this.f28315x * 100.0f);
                if (this.f28305m != null) {
                    this.f28304l = i24;
                    String str110 = String.format("%d%%", Integer.valueOf(i24));
                    this.f28305m = str110;
                    this.f28306n = (int) Math.ceil(textPaint.measureText(str110));
                } else {
                    this.f28304l = i24;
                    String str111 = String.format("%d%%", Integer.valueOf(i24));
                    this.f28305m = str111;
                    this.f28306n = (int) Math.ceil(textPaint.measureText(str111));
                }
                canvas.drawText(this.f28305m, i51114, iDp11114, textPaint);
                if (this.f28308p != this.f28309q) {
                    canvas.restore();
                }
            }
            i25 = this.f28308p;
            if (i25 != 0) {
                if (i25 == 0) {
                    i26 = 1;
                    if (i25 == 1) {
                        f20 = 1.0f;
                    } else {
                        f20 = 0.0f;
                    }
                    f21 = f20;
                    i27 = this.f28309q;
                    if (i27 != 0) {
                        paint = paint4;
                        paint.setAlpha(255);
                    } else {
                        paint = paint4;
                        paint.setAlpha(255);
                    }
                    a(true);
                    canvas.save();
                    canvas.translate(com.google.android.recaptcha.internal.a.z(1.0f, f21, AndroidUtilities.dp(1.0f), rect.centerX()), rect.centerY());
                    float f71111116 = f21 * 500.0f;
                    i28 = this.f28308p;
                    if (i28 == 1) {
                        f22 = 90.0f;
                    } else {
                        f22 = 0.0f;
                    }
                    if (i28 != 0) {
                        if (i28 == 1) {
                            interpolation = f22;
                        } else {
                            interpolation = f22;
                        }
                    } else if (i28 == 1) {
                        interpolation = f22;
                    } else {
                        interpolation = f22;
                    }
                    canvas.rotate(interpolation);
                    i29 = this.f28308p;
                    if (i29 == 0) {
                        canvas.scale(f15, f15);
                    } else {
                        canvas.scale(f15, f15);
                    }
                    org.telegram.ui.ActionBar.g6.f23403x3.b(canvas, paint, f71111116);
                    canvas.scale(1.0f, -1.0f);
                    org.telegram.ui.ActionBar.g6.f23403x3.b(canvas, paint, f71111116);
                    canvas.restore();
                } else {
                    i26 = 1;
                    if (i25 == 1) {
                        f20 = 1.0f;
                    } else {
                        f20 = 0.0f;
                    }
                    f21 = f20;
                    i27 = this.f28309q;
                    if (i27 != 0) {
                        paint = paint4;
                        paint.setAlpha(255);
                    } else {
                        paint = paint4;
                        paint.setAlpha(255);
                    }
                    a(true);
                    canvas.save();
                    canvas.translate(com.google.android.recaptcha.internal.a.z(1.0f, f21, AndroidUtilities.dp(1.0f), rect.centerX()), rect.centerY());
                    float f71111117 = f21 * 500.0f;
                    i28 = this.f28308p;
                    if (i28 == 1) {
                        f22 = 90.0f;
                    } else {
                        f22 = 0.0f;
                    }
                    if (i28 != 0) {
                        if (i28 == 1) {
                            interpolation = f22;
                        } else {
                            interpolation = f22;
                        }
                    } else if (i28 == 1) {
                        interpolation = f22;
                    } else {
                        interpolation = f22;
                    }
                    canvas.rotate(interpolation);
                    i29 = this.f28308p;
                    if (i29 == 0) {
                        canvas.scale(f15, f15);
                    } else {
                        canvas.scale(f15, f15);
                    }
                    org.telegram.ui.ActionBar.g6.f23403x3.b(canvas, paint, f71111117);
                    canvas.scale(1.0f, -1.0f);
                    org.telegram.ui.ActionBar.g6.f23403x3.b(canvas, paint, f71111117);
                    canvas.restore();
                }
            } else if (i25 == 0) {
                i26 = 1;
                if (i25 == 1) {
                    f20 = 1.0f;
                } else {
                    f20 = 0.0f;
                }
                f21 = f20;
                i27 = this.f28309q;
                if (i27 != 0) {
                    paint = paint4;
                    paint.setAlpha(255);
                } else {
                    paint = paint4;
                    paint.setAlpha(255);
                }
                a(true);
                canvas.save();
                canvas.translate(com.google.android.recaptcha.internal.a.z(1.0f, f21, AndroidUtilities.dp(1.0f), rect.centerX()), rect.centerY());
                float f71111118 = f21 * 500.0f;
                i28 = this.f28308p;
                if (i28 == 1) {
                    f22 = 90.0f;
                } else {
                    f22 = 0.0f;
                }
                if (i28 != 0) {
                    if (i28 == 1) {
                        interpolation = f22;
                    } else {
                        interpolation = f22;
                    }
                } else if (i28 == 1) {
                    interpolation = f22;
                } else {
                    interpolation = f22;
                }
                canvas.rotate(interpolation);
                i29 = this.f28308p;
                if (i29 == 0) {
                    canvas.scale(f15, f15);
                } else {
                    canvas.scale(f15, f15);
                }
                org.telegram.ui.ActionBar.g6.f23403x3.b(canvas, paint, f71111118);
                canvas.scale(1.0f, -1.0f);
                org.telegram.ui.ActionBar.g6.f23403x3.b(canvas, paint, f71111118);
                canvas.restore();
            } else {
                i26 = 1;
                if (i25 == 1) {
                    f20 = 1.0f;
                } else {
                    f20 = 0.0f;
                }
                f21 = f20;
                i27 = this.f28309q;
                if (i27 != 0) {
                    paint = paint4;
                    paint.setAlpha(255);
                } else {
                    paint = paint4;
                    paint.setAlpha(255);
                }
                a(true);
                canvas.save();
                canvas.translate(com.google.android.recaptcha.internal.a.z(1.0f, f21, AndroidUtilities.dp(1.0f), rect.centerX()), rect.centerY());
                float f71111119 = f21 * 500.0f;
                i28 = this.f28308p;
                if (i28 == 1) {
                    f22 = 90.0f;
                } else {
                    f22 = 0.0f;
                }
                if (i28 != 0) {
                    if (i28 == 1) {
                        interpolation = f22;
                    } else {
                        interpolation = f22;
                    }
                } else if (i28 == 1) {
                    interpolation = f22;
                } else {
                    interpolation = f22;
                }
                canvas.rotate(interpolation);
                i29 = this.f28308p;
                if (i29 == 0) {
                    canvas.scale(f15, f15);
                } else {
                    canvas.scale(f15, f15);
                }
                org.telegram.ui.ActionBar.g6.f23403x3.b(canvas, paint, f71111119);
                canvas.scale(1.0f, -1.0f);
                org.telegram.ui.ActionBar.g6.f23403x3.b(canvas, paint, f71111119);
                canvas.restore();
            }
            if (this.f28308p != 6) {
                a(false);
                if (this.f28308p != 6) {
                    f24 = this.f28310r;
                    if (f24 > 0.5f) {
                        f26 = (f24 - 0.5f) / 0.5f;
                        fMin = 1.0f - Math.min(1.0f, f26 / 0.5f);
                        if (f26 > 0.5f) {
                            f25 = (f26 - 0.5f) / 0.5f;
                        } else {
                            f25 = 0.0f;
                        }
                    } else {
                        f25 = 0.0f;
                        fMin = 1.0f;
                    }
                    paint5.setAlpha(255);
                    f23 = f25;
                } else {
                    if (this.f28309q != 6) {
                        paint5.setAlpha((int) ((1.0f - this.f28310r) * 255.0f));
                    } else {
                        paint5.setAlpha(255);
                    }
                    fMin = 0.0f;
                    f23 = 1.0f;
                }
                iDp = AndroidUtilities.dp(7.0f) + i14;
                iDp2 = iCenterX - AndroidUtilities.dp(3.0f);
                if (fMin < 1.0f) {
                    canvas.drawLine(iDp2 - AndroidUtilities.dp(6.0f), iDp - AndroidUtilities.dp(6.0f), iDp2 - (AndroidUtilities.dp(6.0f) * fMin), iDp - (AndroidUtilities.dp(6.0f) * fMin), paint5);
                }
                if (f23 > 0.0f) {
                    float f72110 = iDp2;
                    float f72111 = iDp;
                    canvas = canvas;
                    canvas.drawLine(f72110, f72111, (AndroidUtilities.dp(12.0f) * f23) + f72110, f72111 - (AndroidUtilities.dp(12.0f) * f23), paint5);
                } else {
                    canvas = canvas;
                }
            } else {
                a(false);
                if (this.f28308p != 6) {
                    f24 = this.f28310r;
                    if (f24 > 0.5f) {
                        f26 = (f24 - 0.5f) / 0.5f;
                        fMin = 1.0f - Math.min(1.0f, f26 / 0.5f);
                        if (f26 > 0.5f) {
                            f25 = (f26 - 0.5f) / 0.5f;
                        } else {
                            f25 = 0.0f;
                        }
                    } else {
                        f25 = 0.0f;
                        fMin = 1.0f;
                    }
                    paint5.setAlpha(255);
                    f23 = f25;
                } else {
                    if (this.f28309q != 6) {
                        paint5.setAlpha((int) ((1.0f - this.f28310r) * 255.0f));
                    } else {
                        paint5.setAlpha(255);
                    }
                    fMin = 0.0f;
                    f23 = 1.0f;
                }
                iDp = AndroidUtilities.dp(7.0f) + i14;
                iDp2 = iCenterX - AndroidUtilities.dp(3.0f);
                if (fMin < 1.0f) {
                    canvas.drawLine(iDp2 - AndroidUtilities.dp(6.0f), iDp - AndroidUtilities.dp(6.0f), iDp2 - (AndroidUtilities.dp(6.0f) * fMin), iDp - (AndroidUtilities.dp(6.0f) * fMin), paint5);
                }
                if (f23 > 0.0f) {
                    float f72112 = iDp2;
                    float f72113 = iDp;
                    canvas = canvas;
                    canvas.drawLine(f72112, f72113, (AndroidUtilities.dp(12.0f) * f23) + f72112, f72113 - (AndroidUtilities.dp(12.0f) * f23), paint5);
                } else {
                    canvas = canvas;
                }
            }
            if (drawable3 != null) {
                int intrinsicWidth11 = (int) (drawable3.getIntrinsicWidth() * f19);
                int intrinsicHeight11 = (int) (drawable3.getIntrinsicHeight() * f19);
                drawable3.setColorFilter(this.f28300g);
                if (this.f28308p == this.f28309q) {
                    i35 = 255;
                } else {
                    i35 = (int) ((1.0f - this.f28310r) * 255.0f);
                }
                drawable3.setAlpha(i35);
                int i51115 = intrinsicWidth11 / 2;
                int i51116 = intrinsicHeight11 / 2;
                drawable3.setBounds(iCenterX - i51115, i14 - i51116, iCenterX + i51115, i51116 + i14);
                drawable3.draw(canvas);
            }
            if (drawable4 != null) {
                int intrinsicWidth12 = (int) (drawable4.getIntrinsicWidth() * f15);
                int intrinsicHeight12 = (int) (drawable4.getIntrinsicHeight() * f15);
                drawable4.setColorFilter(this.f28300g);
                if (this.f28308p == this.f28309q) {
                    i34 = 255;
                } else {
                    i34 = (int) (this.f28310r * 255.0f);
                }
                drawable4.setAlpha(i34);
                int i51117 = intrinsicWidth12 / 2;
                int i51118 = intrinsicHeight12 / 2;
                drawable4.setBounds(iCenterX - i51117, i14 - i51118, iCenterX + i51117, i51118 + i14);
                drawable4.draw(canvas);
            }
            paint2 = this.f28297c;
            if (pathArr4 != null) {
                i30 = iCenterX;
            } else {
                i30 = iCenterX;
            }
            if (pathArr3 != null) {
                int iDp11115 = AndroidUtilities.dp(24.0f);
                if (this.f28308p == this.f28309q) {
                    i33 = 255;
                } else {
                    i33 = (int) (this.f28310r * 255.0f);
                }
                paint.setStyle(Paint.Style.FILL_AND_STROKE);
                paint.setAlpha(i33);
                a(true);
                canvas.save();
                canvas.translate(i30, i14);
                canvas.scale(f15, f15);
                float f72114 = (-iDp11115) / 2;
                canvas.translate(f72114, f72114);
                path = pathArr3[0];
                if (path != null) {
                    canvas.drawPath(path, paint);
                }
                if (pathArr3.length >= 3) {
                    canvas.drawPath(path3, paint5);
                }
                path2 = pathArr3[1];
                if (path2 != null) {
                    if (i33 != 255) {
                        int alpha6 = paint2.getAlpha();
                        paint2.setAlpha((int) ((i33 / 255.0f) * alpha6));
                        canvas.drawPath(pathArr3[1], paint2);
                        paint2.setAlpha(alpha6);
                    } else {
                        canvas.drawPath(path2, paint2);
                    }
                }
                canvas.restore();
            }
            long jCurrentTimeMillis6 = System.currentTimeMillis();
            j10 = jCurrentTimeMillis6 - this.f28312t;
            if (j10 > 17) {
                j10 = 17;
            }
            this.f28312t = jCurrentTimeMillis6;
            i31 = this.f28308p;
            if (i31 != 3) {
                f27 = ((360 * j10) / 2500.0f) + this.v;
                this.v = f27;
                while (f27 > 360.0f) {
                    f27 -= 360.0f;
                }
                this.v = f27;
                if (this.f28309q != 2) {
                    f28 = this.f28314w;
                    f29 = this.f28316y;
                    f30 = f28 - f29;
                    if (f30 > 0.0f) {
                        f31 = this.f28317z + j10;
                        this.f28317z = f31;
                        if (f31 >= 200.0f) {
                            this.f28315x = f28;
                            this.f28316y = f28;
                            this.f28317z = 0.0f;
                        } else {
                            this.f28315x = (this.f28301i.getInterpolation(f31 / 200.0f) * f30) + f29;
                        }
                    }
                }
                invalidateSelf();
            } else {
                f27 = ((360 * j10) / 2500.0f) + this.v;
                this.v = f27;
                while (f27 > 360.0f) {
                    f27 -= 360.0f;
                }
                this.v = f27;
                if (this.f28309q != 2) {
                    f28 = this.f28314w;
                    f29 = this.f28316y;
                    f30 = f28 - f29;
                    if (f30 > 0.0f) {
                        f31 = this.f28317z + j10;
                        this.f28317z = f31;
                        if (f31 >= 200.0f) {
                            this.f28315x = f28;
                            this.f28316y = f28;
                            this.f28317z = 0.0f;
                        } else {
                            this.f28315x = (this.f28301i.getInterpolation(f31 / 200.0f) * f30) + f29;
                        }
                    }
                }
                invalidateSelf();
            }
            if (this.f28313u) {
                f32 = this.f28310r;
                if (f32 < 1.0f) {
                    f33 = (j10 / this.f28303k) + f32;
                    this.f28310r = f33;
                    if (f33 >= 1.0f) {
                        this.f28308p = this.f28309q;
                        this.f28310r = 1.0f;
                        this.f28313u = false;
                    }
                    invalidateSelf();
                }
            }
            i32 = i10;
            if (i32 >= 1) {
                canvas.restoreToCount(i32);
            }
        }
        float f92 = this.f28310r;
        if (f92 <= 0.5f) {
            float f93 = 1.0f - (f92 / 0.5f);
            i40 = (int) (f93 * 255.0f);
            fDp4 = AndroidUtilities.dp(7.0f) * f93 * this.h;
        } else {
            fDp4 = 0.0f;
            i40 = 0;
        }
        iMin = i40;
        fCenterX = 0.0f;
        f36 = 0.0f;
        f35 = 1.0f;
        fCenterY = 0.0f;
        f39 = 1.0f;
        if (f35 != f39) {
            canvas.save();
            canvas.scale(f35, f35, fCenterX, fCenterY);
        }
        if (f36 != 0.0f) {
            canvas.save();
            i14 = i11;
            canvas.rotate(f36, iCenterX, i14);
        } else {
            i14 = i11;
        }
        if (iMin != 0) {
            f40 = iMin;
            paint5.setAlpha((int) (this.f28307o * f40));
            if (this.f28308p != 14) {
                rectF2 = rectF;
                paint3.setAlpha((int) (f40 * this.f28307o));
                rectF2.set(iCenterX - AndroidUtilities.dp(3.5f), i14 - AndroidUtilities.dp(3.5f), AndroidUtilities.dp(3.5f) + iCenterX, AndroidUtilities.dp(3.5f) + i14);
                canvas.drawRoundRect(rectF2, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), paint3);
            } else {
                rectF2 = rectF;
                paint3.setAlpha((int) (f40 * this.f28307o));
                rectF2.set(iCenterX - AndroidUtilities.dp(3.5f), i14 - AndroidUtilities.dp(3.5f), AndroidUtilities.dp(3.5f) + iCenterX, AndroidUtilities.dp(3.5f) + i14);
                canvas.drawRoundRect(rectF2, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), paint3);
            }
        } else {
            rectF2 = rectF;
        }
        if (f36 != 0.0f) {
            canvas.restore();
        }
        if (f35 != f39) {
            canvas.restore();
        }
        i37 = this.f28308p;
        if (i37 != 3) {
            float fMax6 = Math.max(4.0f, this.f28315x * 360.0f);
            int iDp122 = AndroidUtilities.dp(this.f28302j ? 2.0f : 4.0f);
            rectF2.set(bounds.left + iDp122, bounds.top + iDp122, bounds.right - iDp122, bounds.bottom - iDp122);
            i38 = this.f28308p;
            if (i38 != 14) {
                paint5.setAlpha((int) (iMin * 0.15f * this.f28307o));
                rectF3 = rectF2;
                canvas.drawArc(rectF3, 0.0f, 360.0f, false, paint5);
                paint5.setAlpha(iMin);
            } else {
                paint5.setAlpha((int) (iMin * 0.15f * this.f28307o));
                rectF3 = rectF2;
                canvas.drawArc(rectF3, 0.0f, 360.0f, false, paint5);
                paint5.setAlpha(iMin);
            }
            canvas = canvas;
            canvas.drawArc(rectF3, this.v, fMax6, false, paint5);
        } else {
            float fMax7 = Math.max(4.0f, this.f28315x * 360.0f);
            int iDp123 = AndroidUtilities.dp(this.f28302j ? 2.0f : 4.0f);
            rectF2.set(bounds.left + iDp123, bounds.top + iDp123, bounds.right - iDp123, bounds.bottom - iDp123);
            i38 = this.f28308p;
            if (i38 != 14) {
                paint5.setAlpha((int) (iMin * 0.15f * this.f28307o));
                rectF3 = rectF2;
                canvas.drawArc(rectF3, 0.0f, 360.0f, false, paint5);
                paint5.setAlpha(iMin);
            } else {
                paint5.setAlpha((int) (iMin * 0.15f * this.f28307o));
                rectF3 = rectF2;
                canvas.drawArc(rectF3, 0.0f, 360.0f, false, paint5);
                paint5.setAlpha(iMin);
            }
            canvas = canvas;
            canvas.drawArc(rectF3, this.v, fMax7, false, paint5);
        }
        i15 = this.f28308p;
        if (i15 == this.f28309q) {
            f15 = 1.0f;
            fMax = 1.0f;
        } else if (i15 != i13) {
            float f624 = this.f28310r;
            f15 = f624;
            fMax = 1.0f - f624;
        } else {
            float f625 = this.f28310r;
            f15 = f625;
            fMax = 1.0f - f625;
        }
        i16 = this.f28309q;
        if (i16 == 15) {
            if (this.f28308p == 15) {
                pathArr2 = org.telegram.ui.ActionBar.g6.f22997a5;
                pathArr = null;
            } else {
                pathArr = null;
            }
            if (i16 == 5) {
                pathArr = org.telegram.ui.ActionBar.g6.Z4;
            } else if (this.f28308p == 5) {
                pathArr2 = org.telegram.ui.ActionBar.g6.Z4;
            }
            pathArr3 = pathArr;
            pathArr4 = pathArr2;
            if (i16 == 7) {
                drawable2 = org.telegram.ui.ActionBar.g6.f23016b5;
                drawable = null;
                i17 = 8;
            } else {
                if (this.f28308p == 7) {
                    drawable = org.telegram.ui.ActionBar.g6.f23016b5;
                } else {
                    drawable = null;
                }
                i17 = 8;
                drawable2 = null;
            }
            if (i16 == i17) {
                drawable2 = org.telegram.ui.ActionBar.g6.f23035c5;
            } else if (this.f28308p == i17) {
                drawable = org.telegram.ui.ActionBar.g6.f23035c5;
            }
            if (this.f28308p != 9) {
                a(false);
                if (this.f28308p == this.f28309q) {
                    i18 = 255;
                } else {
                    i18 = (int) (this.f28310r * 255.0f);
                }
                paint5.setAlpha(i18);
                int iDp11116 = AndroidUtilities.dp(7.0f) + i14;
                int iDp11117 = iCenterX - AndroidUtilities.dp(3.0f);
                if (this.f28308p != this.f28309q) {
                    canvas.save();
                    float f61111110 = this.f28310r;
                    canvas.scale(f61111110, f61111110, iCenterX, i14);
                }
                float f61111111 = iDp11117;
                float f61111112 = iDp11116;
                drawable3 = drawable;
                drawable4 = drawable2;
                canvas.drawLine(iDp11117 - AndroidUtilities.dp(6.0f), iDp11116 - AndroidUtilities.dp(6.0f), f61111111, f61111112, paint5);
                canvas = canvas;
                canvas.drawLine(f61111111, f61111112, AndroidUtilities.dp(12.0f) + iDp11117, iDp11116 - AndroidUtilities.dp(12.0f), paint5);
                if (this.f28308p != this.f28309q) {
                    canvas.restore();
                }
            } else {
                a(false);
                if (this.f28308p == this.f28309q) {
                    i18 = 255;
                } else {
                    i18 = (int) (this.f28310r * 255.0f);
                }
                paint5.setAlpha(i18);
                int iDp11118 = AndroidUtilities.dp(7.0f) + i14;
                int iDp11119 = iCenterX - AndroidUtilities.dp(3.0f);
                if (this.f28308p != this.f28309q) {
                    canvas.save();
                    float f61111113 = this.f28310r;
                    canvas.scale(f61111113, f61111113, iCenterX, i14);
                }
                float f61111114 = iDp11119;
                float f61111115 = iDp11118;
                drawable3 = drawable;
                drawable4 = drawable2;
                canvas.drawLine(iDp11119 - AndroidUtilities.dp(6.0f), iDp11118 - AndroidUtilities.dp(6.0f), f61111114, f61111115, paint5);
                canvas = canvas;
                canvas.drawLine(f61111114, f61111115, AndroidUtilities.dp(12.0f) + iDp11119, iDp11118 - AndroidUtilities.dp(12.0f), paint5);
                if (this.f28308p != this.f28309q) {
                    canvas.restore();
                }
            }
            if (this.f28308p != 12) {
                a(false);
                i19 = this.f28308p;
                i20 = this.f28309q;
                if (i19 == i20) {
                    f16 = 1.0f;
                } else if (i20 == 13) {
                    f16 = this.f28310r;
                } else {
                    f16 = 1.0f - this.f28310r;
                }
                if (i19 == i20) {
                    i21 = 255;
                } else {
                    i21 = (int) (f16 * 255.0f);
                }
                paint5.setAlpha(i21);
                AndroidUtilities.dp(7.0f);
                AndroidUtilities.dp(3.0f);
                if (this.f28308p != this.f28309q) {
                    canvas.save();
                    canvas.scale(f16, f16, iCenterX, i14);
                }
                float fDp116 = AndroidUtilities.dp(7.0f) * this.h;
                float f61111116 = iCenterX;
                float f61111117 = f61111116 - fDp116;
                float f711111110 = i14;
                float f711111111 = f711111110 - fDp116;
                float f711111112 = f61111116 + fDp116;
                float f711111113 = f711111110 + fDp116;
                canvas.drawLine(f61111117, f711111111, f711111112, f711111113, paint5);
                canvas.drawLine(f711111112, f711111111, f61111117, f711111113, paint5);
                if (this.f28308p != this.f28309q) {
                    canvas.restore();
                }
            } else {
                a(false);
                i19 = this.f28308p;
                i20 = this.f28309q;
                if (i19 == i20) {
                    f16 = 1.0f;
                } else if (i20 == 13) {
                    f16 = this.f28310r;
                } else {
                    f16 = 1.0f - this.f28310r;
                }
                if (i19 == i20) {
                    i21 = 255;
                } else {
                    i21 = (int) (f16 * 255.0f);
                }
                paint5.setAlpha(i21);
                AndroidUtilities.dp(7.0f);
                AndroidUtilities.dp(3.0f);
                if (this.f28308p != this.f28309q) {
                    canvas.save();
                    canvas.scale(f16, f16, iCenterX, i14);
                }
                float fDp117 = AndroidUtilities.dp(7.0f) * this.h;
                float f61111118 = iCenterX;
                float f61111119 = f61111118 - fDp117;
                float f711111114 = i14;
                float f711111115 = f711111114 - fDp117;
                float f711111116 = f61111118 + fDp117;
                float f711111117 = f711111114 + fDp117;
                canvas.drawLine(f61111119, f711111115, f711111116, f711111117, paint5);
                canvas.drawLine(f711111116, f711111115, f61111119, f711111117, paint5);
                if (this.f28308p != this.f28309q) {
                    canvas.restore();
                }
            }
            if (this.f28308p != 13) {
                a(false);
                i22 = this.f28308p;
                i23 = this.f28309q;
                if (i22 == i23) {
                    f17 = 1.0f;
                } else if (i23 == 13) {
                    f17 = this.f28310r;
                } else {
                    f17 = 1.0f - this.f28310r;
                }
                textPaint = this.f28295a;
                textPaint.setAlpha((int) (f17 * 255.0f));
                int iDp111110 = AndroidUtilities.dp(5.0f) + i14;
                f18 = 5.0f;
                int i51119 = iCenterX - (this.f28306n / 2);
                rect = bounds;
                f19 = fMax;
                if (this.f28308p != this.f28309q) {
                    canvas.save();
                    canvas.scale(f17, f17, iCenterX, i14);
                }
                i24 = (int) (this.f28315x * 100.0f);
                if (this.f28305m != null) {
                    this.f28304l = i24;
                    String str112 = String.format("%d%%", Integer.valueOf(i24));
                    this.f28305m = str112;
                    this.f28306n = (int) Math.ceil(textPaint.measureText(str112));
                } else {
                    this.f28304l = i24;
                    String str113 = String.format("%d%%", Integer.valueOf(i24));
                    this.f28305m = str113;
                    this.f28306n = (int) Math.ceil(textPaint.measureText(str113));
                }
                canvas.drawText(this.f28305m, i51119, iDp111110, textPaint);
                if (this.f28308p != this.f28309q) {
                    canvas.restore();
                }
            } else {
                a(false);
                i22 = this.f28308p;
                i23 = this.f28309q;
                if (i22 == i23) {
                    f17 = 1.0f;
                } else if (i23 == 13) {
                    f17 = this.f28310r;
                } else {
                    f17 = 1.0f - this.f28310r;
                }
                textPaint = this.f28295a;
                textPaint.setAlpha((int) (f17 * 255.0f));
                int iDp111111 = AndroidUtilities.dp(5.0f) + i14;
                f18 = 5.0f;
                int i511110 = iCenterX - (this.f28306n / 2);
                rect = bounds;
                f19 = fMax;
                if (this.f28308p != this.f28309q) {
                    canvas.save();
                    canvas.scale(f17, f17, iCenterX, i14);
                }
                i24 = (int) (this.f28315x * 100.0f);
                if (this.f28305m != null) {
                    this.f28304l = i24;
                    String str114 = String.format("%d%%", Integer.valueOf(i24));
                    this.f28305m = str114;
                    this.f28306n = (int) Math.ceil(textPaint.measureText(str114));
                } else {
                    this.f28304l = i24;
                    String str115 = String.format("%d%%", Integer.valueOf(i24));
                    this.f28305m = str115;
                    this.f28306n = (int) Math.ceil(textPaint.measureText(str115));
                }
                canvas.drawText(this.f28305m, i511110, iDp111111, textPaint);
                if (this.f28308p != this.f28309q) {
                    canvas.restore();
                }
            }
            i25 = this.f28308p;
            if (i25 != 0) {
                if (i25 == 0) {
                    i26 = 1;
                    if (i25 == 1) {
                        f20 = 1.0f;
                    } else {
                        f20 = 0.0f;
                    }
                    f21 = f20;
                    i27 = this.f28309q;
                    if (i27 != 0) {
                        paint = paint4;
                        paint.setAlpha(255);
                    } else {
                        paint = paint4;
                        paint.setAlpha(255);
                    }
                    a(true);
                    canvas.save();
                    canvas.translate(com.google.android.recaptcha.internal.a.z(1.0f, f21, AndroidUtilities.dp(1.0f), rect.centerX()), rect.centerY());
                    float f711111118 = f21 * 500.0f;
                    i28 = this.f28308p;
                    if (i28 == 1) {
                        f22 = 90.0f;
                    } else {
                        f22 = 0.0f;
                    }
                    if (i28 != 0) {
                        if (i28 == 1) {
                            interpolation = f22;
                        } else {
                            interpolation = f22;
                        }
                    } else if (i28 == 1) {
                        interpolation = f22;
                    } else {
                        interpolation = f22;
                    }
                    canvas.rotate(interpolation);
                    i29 = this.f28308p;
                    if (i29 == 0) {
                        canvas.scale(f15, f15);
                    } else {
                        canvas.scale(f15, f15);
                    }
                    org.telegram.ui.ActionBar.g6.f23403x3.b(canvas, paint, f711111118);
                    canvas.scale(1.0f, -1.0f);
                    org.telegram.ui.ActionBar.g6.f23403x3.b(canvas, paint, f711111118);
                    canvas.restore();
                } else {
                    i26 = 1;
                    if (i25 == 1) {
                        f20 = 1.0f;
                    } else {
                        f20 = 0.0f;
                    }
                    f21 = f20;
                    i27 = this.f28309q;
                    if (i27 != 0) {
                        paint = paint4;
                        paint.setAlpha(255);
                    } else {
                        paint = paint4;
                        paint.setAlpha(255);
                    }
                    a(true);
                    canvas.save();
                    canvas.translate(com.google.android.recaptcha.internal.a.z(1.0f, f21, AndroidUtilities.dp(1.0f), rect.centerX()), rect.centerY());
                    float f711111119 = f21 * 500.0f;
                    i28 = this.f28308p;
                    if (i28 == 1) {
                        f22 = 90.0f;
                    } else {
                        f22 = 0.0f;
                    }
                    if (i28 != 0) {
                        if (i28 == 1) {
                            interpolation = f22;
                        } else {
                            interpolation = f22;
                        }
                    } else if (i28 == 1) {
                        interpolation = f22;
                    } else {
                        interpolation = f22;
                    }
                    canvas.rotate(interpolation);
                    i29 = this.f28308p;
                    if (i29 == 0) {
                        canvas.scale(f15, f15);
                    } else {
                        canvas.scale(f15, f15);
                    }
                    org.telegram.ui.ActionBar.g6.f23403x3.b(canvas, paint, f711111119);
                    canvas.scale(1.0f, -1.0f);
                    org.telegram.ui.ActionBar.g6.f23403x3.b(canvas, paint, f711111119);
                    canvas.restore();
                }
            } else if (i25 == 0) {
                i26 = 1;
                if (i25 == 1) {
                    f20 = 1.0f;
                } else {
                    f20 = 0.0f;
                }
                f21 = f20;
                i27 = this.f28309q;
                if (i27 != 0) {
                    paint = paint4;
                    paint.setAlpha(255);
                } else {
                    paint = paint4;
                    paint.setAlpha(255);
                }
                a(true);
                canvas.save();
                canvas.translate(com.google.android.recaptcha.internal.a.z(1.0f, f21, AndroidUtilities.dp(1.0f), rect.centerX()), rect.centerY());
                float f7111111110 = f21 * 500.0f;
                i28 = this.f28308p;
                if (i28 == 1) {
                    f22 = 90.0f;
                } else {
                    f22 = 0.0f;
                }
                if (i28 != 0) {
                    if (i28 == 1) {
                        interpolation = f22;
                    } else {
                        interpolation = f22;
                    }
                } else if (i28 == 1) {
                    interpolation = f22;
                } else {
                    interpolation = f22;
                }
                canvas.rotate(interpolation);
                i29 = this.f28308p;
                if (i29 == 0) {
                    canvas.scale(f15, f15);
                } else {
                    canvas.scale(f15, f15);
                }
                org.telegram.ui.ActionBar.g6.f23403x3.b(canvas, paint, f7111111110);
                canvas.scale(1.0f, -1.0f);
                org.telegram.ui.ActionBar.g6.f23403x3.b(canvas, paint, f7111111110);
                canvas.restore();
            } else {
                i26 = 1;
                if (i25 == 1) {
                    f20 = 1.0f;
                } else {
                    f20 = 0.0f;
                }
                f21 = f20;
                i27 = this.f28309q;
                if (i27 != 0) {
                    paint = paint4;
                    paint.setAlpha(255);
                } else {
                    paint = paint4;
                    paint.setAlpha(255);
                }
                a(true);
                canvas.save();
                canvas.translate(com.google.android.recaptcha.internal.a.z(1.0f, f21, AndroidUtilities.dp(1.0f), rect.centerX()), rect.centerY());
                float f7111111111 = f21 * 500.0f;
                i28 = this.f28308p;
                if (i28 == 1) {
                    f22 = 90.0f;
                } else {
                    f22 = 0.0f;
                }
                if (i28 != 0) {
                    if (i28 == 1) {
                        interpolation = f22;
                    } else {
                        interpolation = f22;
                    }
                } else if (i28 == 1) {
                    interpolation = f22;
                } else {
                    interpolation = f22;
                }
                canvas.rotate(interpolation);
                i29 = this.f28308p;
                if (i29 == 0) {
                    canvas.scale(f15, f15);
                } else {
                    canvas.scale(f15, f15);
                }
                org.telegram.ui.ActionBar.g6.f23403x3.b(canvas, paint, f7111111111);
                canvas.scale(1.0f, -1.0f);
                org.telegram.ui.ActionBar.g6.f23403x3.b(canvas, paint, f7111111111);
                canvas.restore();
            }
            if (this.f28308p != 6) {
                a(false);
                if (this.f28308p != 6) {
                    f24 = this.f28310r;
                    if (f24 > 0.5f) {
                        f26 = (f24 - 0.5f) / 0.5f;
                        fMin = 1.0f - Math.min(1.0f, f26 / 0.5f);
                        if (f26 > 0.5f) {
                            f25 = (f26 - 0.5f) / 0.5f;
                        } else {
                            f25 = 0.0f;
                        }
                    } else {
                        f25 = 0.0f;
                        fMin = 1.0f;
                    }
                    paint5.setAlpha(255);
                    f23 = f25;
                } else {
                    if (this.f28309q != 6) {
                        paint5.setAlpha((int) ((1.0f - this.f28310r) * 255.0f));
                    } else {
                        paint5.setAlpha(255);
                    }
                    fMin = 0.0f;
                    f23 = 1.0f;
                }
                iDp = AndroidUtilities.dp(7.0f) + i14;
                iDp2 = iCenterX - AndroidUtilities.dp(3.0f);
                if (fMin < 1.0f) {
                    canvas.drawLine(iDp2 - AndroidUtilities.dp(6.0f), iDp - AndroidUtilities.dp(6.0f), iDp2 - (AndroidUtilities.dp(6.0f) * fMin), iDp - (AndroidUtilities.dp(6.0f) * fMin), paint5);
                }
                if (f23 > 0.0f) {
                    float f72115 = iDp2;
                    float f72116 = iDp;
                    canvas = canvas;
                    canvas.drawLine(f72115, f72116, (AndroidUtilities.dp(12.0f) * f23) + f72115, f72116 - (AndroidUtilities.dp(12.0f) * f23), paint5);
                } else {
                    canvas = canvas;
                }
            } else {
                a(false);
                if (this.f28308p != 6) {
                    f24 = this.f28310r;
                    if (f24 > 0.5f) {
                        f26 = (f24 - 0.5f) / 0.5f;
                        fMin = 1.0f - Math.min(1.0f, f26 / 0.5f);
                        if (f26 > 0.5f) {
                            f25 = (f26 - 0.5f) / 0.5f;
                        } else {
                            f25 = 0.0f;
                        }
                    } else {
                        f25 = 0.0f;
                        fMin = 1.0f;
                    }
                    paint5.setAlpha(255);
                    f23 = f25;
                } else {
                    if (this.f28309q != 6) {
                        paint5.setAlpha((int) ((1.0f - this.f28310r) * 255.0f));
                    } else {
                        paint5.setAlpha(255);
                    }
                    fMin = 0.0f;
                    f23 = 1.0f;
                }
                iDp = AndroidUtilities.dp(7.0f) + i14;
                iDp2 = iCenterX - AndroidUtilities.dp(3.0f);
                if (fMin < 1.0f) {
                    canvas.drawLine(iDp2 - AndroidUtilities.dp(6.0f), iDp - AndroidUtilities.dp(6.0f), iDp2 - (AndroidUtilities.dp(6.0f) * fMin), iDp - (AndroidUtilities.dp(6.0f) * fMin), paint5);
                }
                if (f23 > 0.0f) {
                    float f72117 = iDp2;
                    float f72118 = iDp;
                    canvas = canvas;
                    canvas.drawLine(f72117, f72118, (AndroidUtilities.dp(12.0f) * f23) + f72117, f72118 - (AndroidUtilities.dp(12.0f) * f23), paint5);
                } else {
                    canvas = canvas;
                }
            }
            if (drawable3 != null) {
                int intrinsicWidth13 = (int) (drawable3.getIntrinsicWidth() * f19);
                int intrinsicHeight13 = (int) (drawable3.getIntrinsicHeight() * f19);
                drawable3.setColorFilter(this.f28300g);
                if (this.f28308p == this.f28309q) {
                    i35 = 255;
                } else {
                    i35 = (int) ((1.0f - this.f28310r) * 255.0f);
                }
                drawable3.setAlpha(i35);
                int i511111 = intrinsicWidth13 / 2;
                int i511112 = intrinsicHeight13 / 2;
                drawable3.setBounds(iCenterX - i511111, i14 - i511112, iCenterX + i511111, i511112 + i14);
                drawable3.draw(canvas);
            }
            if (drawable4 != null) {
                int intrinsicWidth14 = (int) (drawable4.getIntrinsicWidth() * f15);
                int intrinsicHeight14 = (int) (drawable4.getIntrinsicHeight() * f15);
                drawable4.setColorFilter(this.f28300g);
                if (this.f28308p == this.f28309q) {
                    i34 = 255;
                } else {
                    i34 = (int) (this.f28310r * 255.0f);
                }
                drawable4.setAlpha(i34);
                int i511113 = intrinsicWidth14 / 2;
                int i511114 = intrinsicHeight14 / 2;
                drawable4.setBounds(iCenterX - i511113, i14 - i511114, iCenterX + i511113, i511114 + i14);
                drawable4.draw(canvas);
            }
            paint2 = this.f28297c;
            if (pathArr4 != null) {
                i30 = iCenterX;
            } else {
                i30 = iCenterX;
            }
            if (pathArr3 != null) {
                int iDp111112 = AndroidUtilities.dp(24.0f);
                if (this.f28308p == this.f28309q) {
                    i33 = 255;
                } else {
                    i33 = (int) (this.f28310r * 255.0f);
                }
                paint.setStyle(Paint.Style.FILL_AND_STROKE);
                paint.setAlpha(i33);
                a(true);
                canvas.save();
                canvas.translate(i30, i14);
                canvas.scale(f15, f15);
                float f72119 = (-iDp111112) / 2;
                canvas.translate(f72119, f72119);
                path = pathArr3[0];
                if (path != null) {
                    canvas.drawPath(path, paint);
                }
                if (pathArr3.length >= 3) {
                    canvas.drawPath(path3, paint5);
                }
                path2 = pathArr3[1];
                if (path2 != null) {
                    if (i33 != 255) {
                        int alpha7 = paint2.getAlpha();
                        paint2.setAlpha((int) ((i33 / 255.0f) * alpha7));
                        canvas.drawPath(pathArr3[1], paint2);
                        paint2.setAlpha(alpha7);
                    } else {
                        canvas.drawPath(path2, paint2);
                    }
                }
                canvas.restore();
            }
            long jCurrentTimeMillis7 = System.currentTimeMillis();
            j10 = jCurrentTimeMillis7 - this.f28312t;
            if (j10 > 17) {
                j10 = 17;
            }
            this.f28312t = jCurrentTimeMillis7;
            i31 = this.f28308p;
            if (i31 != 3) {
                f27 = ((360 * j10) / 2500.0f) + this.v;
                this.v = f27;
                while (f27 > 360.0f) {
                    f27 -= 360.0f;
                }
                this.v = f27;
                if (this.f28309q != 2) {
                    f28 = this.f28314w;
                    f29 = this.f28316y;
                    f30 = f28 - f29;
                    if (f30 > 0.0f) {
                        f31 = this.f28317z + j10;
                        this.f28317z = f31;
                        if (f31 >= 200.0f) {
                            this.f28315x = f28;
                            this.f28316y = f28;
                            this.f28317z = 0.0f;
                        } else {
                            this.f28315x = (this.f28301i.getInterpolation(f31 / 200.0f) * f30) + f29;
                        }
                    }
                }
                invalidateSelf();
            } else {
                f27 = ((360 * j10) / 2500.0f) + this.v;
                this.v = f27;
                while (f27 > 360.0f) {
                    f27 -= 360.0f;
                }
                this.v = f27;
                if (this.f28309q != 2) {
                    f28 = this.f28314w;
                    f29 = this.f28316y;
                    f30 = f28 - f29;
                    if (f30 > 0.0f) {
                        f31 = this.f28317z + j10;
                        this.f28317z = f31;
                        if (f31 >= 200.0f) {
                            this.f28315x = f28;
                            this.f28316y = f28;
                            this.f28317z = 0.0f;
                        } else {
                            this.f28315x = (this.f28301i.getInterpolation(f31 / 200.0f) * f30) + f29;
                        }
                    }
                }
                invalidateSelf();
            }
            if (this.f28313u) {
                f32 = this.f28310r;
                if (f32 < 1.0f) {
                    f33 = (j10 / this.f28303k) + f32;
                    this.f28310r = f33;
                    if (f33 >= 1.0f) {
                        this.f28308p = this.f28309q;
                        this.f28310r = 1.0f;
                        this.f28313u = false;
                    }
                    invalidateSelf();
                }
            }
            i32 = i10;
            if (i32 >= 1) {
                canvas.restoreToCount(i32);
            }
        }
        pathArr = org.telegram.ui.ActionBar.g6.f22997a5;
        pathArr2 = null;
        if (i16 == 5) {
            pathArr = org.telegram.ui.ActionBar.g6.Z4;
        } else if (this.f28308p == 5) {
            pathArr2 = org.telegram.ui.ActionBar.g6.Z4;
        }
        pathArr3 = pathArr;
        pathArr4 = pathArr2;
        if (i16 == 7) {
            drawable2 = org.telegram.ui.ActionBar.g6.f23016b5;
            drawable = null;
            i17 = 8;
        } else {
            if (this.f28308p == 7) {
                drawable = org.telegram.ui.ActionBar.g6.f23016b5;
            } else {
                drawable = null;
            }
            i17 = 8;
            drawable2 = null;
        }
        if (i16 == i17) {
            drawable2 = org.telegram.ui.ActionBar.g6.f23035c5;
        } else if (this.f28308p == i17) {
            drawable = org.telegram.ui.ActionBar.g6.f23035c5;
        }
        if (this.f28308p != 9) {
            a(false);
            if (this.f28308p == this.f28309q) {
                i18 = 255;
            } else {
                i18 = (int) (this.f28310r * 255.0f);
            }
            paint5.setAlpha(i18);
            int iDp111113 = AndroidUtilities.dp(7.0f) + i14;
            int iDp111114 = iCenterX - AndroidUtilities.dp(3.0f);
            if (this.f28308p != this.f28309q) {
                canvas.save();
                float f611111110 = this.f28310r;
                canvas.scale(f611111110, f611111110, iCenterX, i14);
            }
            float f611111111 = iDp111114;
            float f611111112 = iDp111113;
            drawable3 = drawable;
            drawable4 = drawable2;
            canvas.drawLine(iDp111114 - AndroidUtilities.dp(6.0f), iDp111113 - AndroidUtilities.dp(6.0f), f611111111, f611111112, paint5);
            canvas = canvas;
            canvas.drawLine(f611111111, f611111112, AndroidUtilities.dp(12.0f) + iDp111114, iDp111113 - AndroidUtilities.dp(12.0f), paint5);
            if (this.f28308p != this.f28309q) {
                canvas.restore();
            }
        } else {
            a(false);
            if (this.f28308p == this.f28309q) {
                i18 = 255;
            } else {
                i18 = (int) (this.f28310r * 255.0f);
            }
            paint5.setAlpha(i18);
            int iDp111115 = AndroidUtilities.dp(7.0f) + i14;
            int iDp111116 = iCenterX - AndroidUtilities.dp(3.0f);
            if (this.f28308p != this.f28309q) {
                canvas.save();
                float f611111113 = this.f28310r;
                canvas.scale(f611111113, f611111113, iCenterX, i14);
            }
            float f611111114 = iDp111116;
            float f611111115 = iDp111115;
            drawable3 = drawable;
            drawable4 = drawable2;
            canvas.drawLine(iDp111116 - AndroidUtilities.dp(6.0f), iDp111115 - AndroidUtilities.dp(6.0f), f611111114, f611111115, paint5);
            canvas = canvas;
            canvas.drawLine(f611111114, f611111115, AndroidUtilities.dp(12.0f) + iDp111116, iDp111115 - AndroidUtilities.dp(12.0f), paint5);
            if (this.f28308p != this.f28309q) {
                canvas.restore();
            }
        }
        if (this.f28308p != 12) {
            a(false);
            i19 = this.f28308p;
            i20 = this.f28309q;
            if (i19 == i20) {
                f16 = 1.0f;
            } else if (i20 == 13) {
                f16 = this.f28310r;
            } else {
                f16 = 1.0f - this.f28310r;
            }
            if (i19 == i20) {
                i21 = 255;
            } else {
                i21 = (int) (f16 * 255.0f);
            }
            paint5.setAlpha(i21);
            AndroidUtilities.dp(7.0f);
            AndroidUtilities.dp(3.0f);
            if (this.f28308p != this.f28309q) {
                canvas.save();
                canvas.scale(f16, f16, iCenterX, i14);
            }
            float fDp118 = AndroidUtilities.dp(7.0f) * this.h;
            float f611111116 = iCenterX;
            float f611111117 = f611111116 - fDp118;
            float f7111111112 = i14;
            float f7111111113 = f7111111112 - fDp118;
            float f7111111114 = f611111116 + fDp118;
            float f7111111115 = f7111111112 + fDp118;
            canvas.drawLine(f611111117, f7111111113, f7111111114, f7111111115, paint5);
            canvas.drawLine(f7111111114, f7111111113, f611111117, f7111111115, paint5);
            if (this.f28308p != this.f28309q) {
                canvas.restore();
            }
        } else {
            a(false);
            i19 = this.f28308p;
            i20 = this.f28309q;
            if (i19 == i20) {
                f16 = 1.0f;
            } else if (i20 == 13) {
                f16 = this.f28310r;
            } else {
                f16 = 1.0f - this.f28310r;
            }
            if (i19 == i20) {
                i21 = 255;
            } else {
                i21 = (int) (f16 * 255.0f);
            }
            paint5.setAlpha(i21);
            AndroidUtilities.dp(7.0f);
            AndroidUtilities.dp(3.0f);
            if (this.f28308p != this.f28309q) {
                canvas.save();
                canvas.scale(f16, f16, iCenterX, i14);
            }
            float fDp119 = AndroidUtilities.dp(7.0f) * this.h;
            float f611111118 = iCenterX;
            float f611111119 = f611111118 - fDp119;
            float f7111111116 = i14;
            float f7111111117 = f7111111116 - fDp119;
            float f7111111118 = f611111118 + fDp119;
            float f7111111119 = f7111111116 + fDp119;
            canvas.drawLine(f611111119, f7111111117, f7111111118, f7111111119, paint5);
            canvas.drawLine(f7111111118, f7111111117, f611111119, f7111111119, paint5);
            if (this.f28308p != this.f28309q) {
                canvas.restore();
            }
        }
        if (this.f28308p != 13) {
            a(false);
            i22 = this.f28308p;
            i23 = this.f28309q;
            if (i22 == i23) {
                f17 = 1.0f;
            } else if (i23 == 13) {
                f17 = this.f28310r;
            } else {
                f17 = 1.0f - this.f28310r;
            }
            textPaint = this.f28295a;
            textPaint.setAlpha((int) (f17 * 255.0f));
            int iDp111117 = AndroidUtilities.dp(5.0f) + i14;
            f18 = 5.0f;
            int i511115 = iCenterX - (this.f28306n / 2);
            rect = bounds;
            f19 = fMax;
            if (this.f28308p != this.f28309q) {
                canvas.save();
                canvas.scale(f17, f17, iCenterX, i14);
            }
            i24 = (int) (this.f28315x * 100.0f);
            if (this.f28305m != null) {
                this.f28304l = i24;
                String str116 = String.format("%d%%", Integer.valueOf(i24));
                this.f28305m = str116;
                this.f28306n = (int) Math.ceil(textPaint.measureText(str116));
            } else {
                this.f28304l = i24;
                String str117 = String.format("%d%%", Integer.valueOf(i24));
                this.f28305m = str117;
                this.f28306n = (int) Math.ceil(textPaint.measureText(str117));
            }
            canvas.drawText(this.f28305m, i511115, iDp111117, textPaint);
            if (this.f28308p != this.f28309q) {
                canvas.restore();
            }
        } else {
            a(false);
            i22 = this.f28308p;
            i23 = this.f28309q;
            if (i22 == i23) {
                f17 = 1.0f;
            } else if (i23 == 13) {
                f17 = this.f28310r;
            } else {
                f17 = 1.0f - this.f28310r;
            }
            textPaint = this.f28295a;
            textPaint.setAlpha((int) (f17 * 255.0f));
            int iDp111118 = AndroidUtilities.dp(5.0f) + i14;
            f18 = 5.0f;
            int i511116 = iCenterX - (this.f28306n / 2);
            rect = bounds;
            f19 = fMax;
            if (this.f28308p != this.f28309q) {
                canvas.save();
                canvas.scale(f17, f17, iCenterX, i14);
            }
            i24 = (int) (this.f28315x * 100.0f);
            if (this.f28305m != null) {
                this.f28304l = i24;
                String str118 = String.format("%d%%", Integer.valueOf(i24));
                this.f28305m = str118;
                this.f28306n = (int) Math.ceil(textPaint.measureText(str118));
            } else {
                this.f28304l = i24;
                String str119 = String.format("%d%%", Integer.valueOf(i24));
                this.f28305m = str119;
                this.f28306n = (int) Math.ceil(textPaint.measureText(str119));
            }
            canvas.drawText(this.f28305m, i511116, iDp111118, textPaint);
            if (this.f28308p != this.f28309q) {
                canvas.restore();
            }
        }
        i25 = this.f28308p;
        if (i25 != 0) {
            if (i25 == 0) {
                i26 = 1;
                if (i25 == 1) {
                    f20 = 1.0f;
                } else {
                    f20 = 0.0f;
                }
                f21 = f20;
                i27 = this.f28309q;
                if (i27 != 0) {
                    paint = paint4;
                    paint.setAlpha(255);
                } else {
                    paint = paint4;
                    paint.setAlpha(255);
                }
                a(true);
                canvas.save();
                canvas.translate(com.google.android.recaptcha.internal.a.z(1.0f, f21, AndroidUtilities.dp(1.0f), rect.centerX()), rect.centerY());
                float f71111111110 = f21 * 500.0f;
                i28 = this.f28308p;
                if (i28 == 1) {
                    f22 = 90.0f;
                } else {
                    f22 = 0.0f;
                }
                if (i28 != 0) {
                    if (i28 == 1) {
                        interpolation = f22;
                    } else {
                        interpolation = f22;
                    }
                } else if (i28 == 1) {
                    interpolation = f22;
                } else {
                    interpolation = f22;
                }
                canvas.rotate(interpolation);
                i29 = this.f28308p;
                if (i29 == 0) {
                    canvas.scale(f15, f15);
                } else {
                    canvas.scale(f15, f15);
                }
                org.telegram.ui.ActionBar.g6.f23403x3.b(canvas, paint, f71111111110);
                canvas.scale(1.0f, -1.0f);
                org.telegram.ui.ActionBar.g6.f23403x3.b(canvas, paint, f71111111110);
                canvas.restore();
            } else {
                i26 = 1;
                if (i25 == 1) {
                    f20 = 1.0f;
                } else {
                    f20 = 0.0f;
                }
                f21 = f20;
                i27 = this.f28309q;
                if (i27 != 0) {
                    paint = paint4;
                    paint.setAlpha(255);
                } else {
                    paint = paint4;
                    paint.setAlpha(255);
                }
                a(true);
                canvas.save();
                canvas.translate(com.google.android.recaptcha.internal.a.z(1.0f, f21, AndroidUtilities.dp(1.0f), rect.centerX()), rect.centerY());
                float f71111111111 = f21 * 500.0f;
                i28 = this.f28308p;
                if (i28 == 1) {
                    f22 = 90.0f;
                } else {
                    f22 = 0.0f;
                }
                if (i28 != 0) {
                    if (i28 == 1) {
                        interpolation = f22;
                    } else {
                        interpolation = f22;
                    }
                } else if (i28 == 1) {
                    interpolation = f22;
                } else {
                    interpolation = f22;
                }
                canvas.rotate(interpolation);
                i29 = this.f28308p;
                if (i29 == 0) {
                    canvas.scale(f15, f15);
                } else {
                    canvas.scale(f15, f15);
                }
                org.telegram.ui.ActionBar.g6.f23403x3.b(canvas, paint, f71111111111);
                canvas.scale(1.0f, -1.0f);
                org.telegram.ui.ActionBar.g6.f23403x3.b(canvas, paint, f71111111111);
                canvas.restore();
            }
        } else if (i25 == 0) {
            i26 = 1;
            if (i25 == 1) {
                f20 = 1.0f;
            } else {
                f20 = 0.0f;
            }
            f21 = f20;
            i27 = this.f28309q;
            if (i27 != 0) {
                paint = paint4;
                paint.setAlpha(255);
            } else {
                paint = paint4;
                paint.setAlpha(255);
            }
            a(true);
            canvas.save();
            canvas.translate(com.google.android.recaptcha.internal.a.z(1.0f, f21, AndroidUtilities.dp(1.0f), rect.centerX()), rect.centerY());
            float f71111111112 = f21 * 500.0f;
            i28 = this.f28308p;
            if (i28 == 1) {
                f22 = 90.0f;
            } else {
                f22 = 0.0f;
            }
            if (i28 != 0) {
                if (i28 == 1) {
                    interpolation = f22;
                } else {
                    interpolation = f22;
                }
            } else if (i28 == 1) {
                interpolation = f22;
            } else {
                interpolation = f22;
            }
            canvas.rotate(interpolation);
            i29 = this.f28308p;
            if (i29 == 0) {
                canvas.scale(f15, f15);
            } else {
                canvas.scale(f15, f15);
            }
            org.telegram.ui.ActionBar.g6.f23403x3.b(canvas, paint, f71111111112);
            canvas.scale(1.0f, -1.0f);
            org.telegram.ui.ActionBar.g6.f23403x3.b(canvas, paint, f71111111112);
            canvas.restore();
        } else {
            i26 = 1;
            if (i25 == 1) {
                f20 = 1.0f;
            } else {
                f20 = 0.0f;
            }
            f21 = f20;
            i27 = this.f28309q;
            if (i27 != 0) {
                paint = paint4;
                paint.setAlpha(255);
            } else {
                paint = paint4;
                paint.setAlpha(255);
            }
            a(true);
            canvas.save();
            canvas.translate(com.google.android.recaptcha.internal.a.z(1.0f, f21, AndroidUtilities.dp(1.0f), rect.centerX()), rect.centerY());
            float f71111111113 = f21 * 500.0f;
            i28 = this.f28308p;
            if (i28 == 1) {
                f22 = 90.0f;
            } else {
                f22 = 0.0f;
            }
            if (i28 != 0) {
                if (i28 == 1) {
                    interpolation = f22;
                } else {
                    interpolation = f22;
                }
            } else if (i28 == 1) {
                interpolation = f22;
            } else {
                interpolation = f22;
            }
            canvas.rotate(interpolation);
            i29 = this.f28308p;
            if (i29 == 0) {
                canvas.scale(f15, f15);
            } else {
                canvas.scale(f15, f15);
            }
            org.telegram.ui.ActionBar.g6.f23403x3.b(canvas, paint, f71111111113);
            canvas.scale(1.0f, -1.0f);
            org.telegram.ui.ActionBar.g6.f23403x3.b(canvas, paint, f71111111113);
            canvas.restore();
        }
        if (this.f28308p != 6) {
            a(false);
            if (this.f28308p != 6) {
                f24 = this.f28310r;
                if (f24 > 0.5f) {
                    f26 = (f24 - 0.5f) / 0.5f;
                    fMin = 1.0f - Math.min(1.0f, f26 / 0.5f);
                    if (f26 > 0.5f) {
                        f25 = (f26 - 0.5f) / 0.5f;
                    } else {
                        f25 = 0.0f;
                    }
                } else {
                    f25 = 0.0f;
                    fMin = 1.0f;
                }
                paint5.setAlpha(255);
                f23 = f25;
            } else {
                if (this.f28309q != 6) {
                    paint5.setAlpha((int) ((1.0f - this.f28310r) * 255.0f));
                } else {
                    paint5.setAlpha(255);
                }
                fMin = 0.0f;
                f23 = 1.0f;
            }
            iDp = AndroidUtilities.dp(7.0f) + i14;
            iDp2 = iCenterX - AndroidUtilities.dp(3.0f);
            if (fMin < 1.0f) {
                canvas.drawLine(iDp2 - AndroidUtilities.dp(6.0f), iDp - AndroidUtilities.dp(6.0f), iDp2 - (AndroidUtilities.dp(6.0f) * fMin), iDp - (AndroidUtilities.dp(6.0f) * fMin), paint5);
            }
            if (f23 > 0.0f) {
                float f721110 = iDp2;
                float f721111 = iDp;
                canvas = canvas;
                canvas.drawLine(f721110, f721111, (AndroidUtilities.dp(12.0f) * f23) + f721110, f721111 - (AndroidUtilities.dp(12.0f) * f23), paint5);
            } else {
                canvas = canvas;
            }
        } else {
            a(false);
            if (this.f28308p != 6) {
                f24 = this.f28310r;
                if (f24 > 0.5f) {
                    f26 = (f24 - 0.5f) / 0.5f;
                    fMin = 1.0f - Math.min(1.0f, f26 / 0.5f);
                    if (f26 > 0.5f) {
                        f25 = (f26 - 0.5f) / 0.5f;
                    } else {
                        f25 = 0.0f;
                    }
                } else {
                    f25 = 0.0f;
                    fMin = 1.0f;
                }
                paint5.setAlpha(255);
                f23 = f25;
            } else {
                if (this.f28309q != 6) {
                    paint5.setAlpha((int) ((1.0f - this.f28310r) * 255.0f));
                } else {
                    paint5.setAlpha(255);
                }
                fMin = 0.0f;
                f23 = 1.0f;
            }
            iDp = AndroidUtilities.dp(7.0f) + i14;
            iDp2 = iCenterX - AndroidUtilities.dp(3.0f);
            if (fMin < 1.0f) {
                canvas.drawLine(iDp2 - AndroidUtilities.dp(6.0f), iDp - AndroidUtilities.dp(6.0f), iDp2 - (AndroidUtilities.dp(6.0f) * fMin), iDp - (AndroidUtilities.dp(6.0f) * fMin), paint5);
            }
            if (f23 > 0.0f) {
                float f721112 = iDp2;
                float f721113 = iDp;
                canvas = canvas;
                canvas.drawLine(f721112, f721113, (AndroidUtilities.dp(12.0f) * f23) + f721112, f721113 - (AndroidUtilities.dp(12.0f) * f23), paint5);
            } else {
                canvas = canvas;
            }
        }
        if (drawable3 != null) {
            int intrinsicWidth15 = (int) (drawable3.getIntrinsicWidth() * f19);
            int intrinsicHeight15 = (int) (drawable3.getIntrinsicHeight() * f19);
            drawable3.setColorFilter(this.f28300g);
            if (this.f28308p == this.f28309q) {
                i35 = 255;
            } else {
                i35 = (int) ((1.0f - this.f28310r) * 255.0f);
            }
            drawable3.setAlpha(i35);
            int i511117 = intrinsicWidth15 / 2;
            int i511118 = intrinsicHeight15 / 2;
            drawable3.setBounds(iCenterX - i511117, i14 - i511118, iCenterX + i511117, i511118 + i14);
            drawable3.draw(canvas);
        }
        if (drawable4 != null) {
            int intrinsicWidth16 = (int) (drawable4.getIntrinsicWidth() * f15);
            int intrinsicHeight16 = (int) (drawable4.getIntrinsicHeight() * f15);
            drawable4.setColorFilter(this.f28300g);
            if (this.f28308p == this.f28309q) {
                i34 = 255;
            } else {
                i34 = (int) (this.f28310r * 255.0f);
            }
            drawable4.setAlpha(i34);
            int i511119 = intrinsicWidth16 / 2;
            int i5111110 = intrinsicHeight16 / 2;
            drawable4.setBounds(iCenterX - i511119, i14 - i5111110, iCenterX + i511119, i5111110 + i14);
            drawable4.draw(canvas);
        }
        paint2 = this.f28297c;
        if (pathArr4 != null) {
            i30 = iCenterX;
        } else {
            i30 = iCenterX;
        }
        if (pathArr3 != null) {
            int iDp111119 = AndroidUtilities.dp(24.0f);
            if (this.f28308p == this.f28309q) {
                i33 = 255;
            } else {
                i33 = (int) (this.f28310r * 255.0f);
            }
            paint.setStyle(Paint.Style.FILL_AND_STROKE);
            paint.setAlpha(i33);
            a(true);
            canvas.save();
            canvas.translate(i30, i14);
            canvas.scale(f15, f15);
            float f721114 = (-iDp111119) / 2;
            canvas.translate(f721114, f721114);
            path = pathArr3[0];
            if (path != null) {
                canvas.drawPath(path, paint);
            }
            if (pathArr3.length >= 3) {
                canvas.drawPath(path3, paint5);
            }
            path2 = pathArr3[1];
            if (path2 != null) {
                if (i33 != 255) {
                    int alpha8 = paint2.getAlpha();
                    paint2.setAlpha((int) ((i33 / 255.0f) * alpha8));
                    canvas.drawPath(pathArr3[1], paint2);
                    paint2.setAlpha(alpha8);
                } else {
                    canvas.drawPath(path2, paint2);
                }
            }
            canvas.restore();
        }
        long jCurrentTimeMillis8 = System.currentTimeMillis();
        j10 = jCurrentTimeMillis8 - this.f28312t;
        if (j10 > 17) {
            j10 = 17;
        }
        this.f28312t = jCurrentTimeMillis8;
        i31 = this.f28308p;
        if (i31 != 3) {
            f27 = ((360 * j10) / 2500.0f) + this.v;
            this.v = f27;
            while (f27 > 360.0f) {
                f27 -= 360.0f;
            }
            this.v = f27;
            if (this.f28309q != 2) {
                f28 = this.f28314w;
                f29 = this.f28316y;
                f30 = f28 - f29;
                if (f30 > 0.0f) {
                    f31 = this.f28317z + j10;
                    this.f28317z = f31;
                    if (f31 >= 200.0f) {
                        this.f28315x = f28;
                        this.f28316y = f28;
                        this.f28317z = 0.0f;
                    } else {
                        this.f28315x = (this.f28301i.getInterpolation(f31 / 200.0f) * f30) + f29;
                    }
                }
            }
            invalidateSelf();
        } else {
            f27 = ((360 * j10) / 2500.0f) + this.v;
            this.v = f27;
            while (f27 > 360.0f) {
                f27 -= 360.0f;
            }
            this.v = f27;
            if (this.f28309q != 2) {
                f28 = this.f28314w;
                f29 = this.f28316y;
                f30 = f28 - f29;
                if (f30 > 0.0f) {
                    f31 = this.f28317z + j10;
                    this.f28317z = f31;
                    if (f31 >= 200.0f) {
                        this.f28315x = f28;
                        this.f28316y = f28;
                        this.f28317z = 0.0f;
                    } else {
                        this.f28315x = (this.f28301i.getInterpolation(f31 / 200.0f) * f30) + f29;
                    }
                }
            }
            invalidateSelf();
        }
        if (this.f28313u) {
            f32 = this.f28310r;
            if (f32 < 1.0f) {
                f33 = (j10 / this.f28303k) + f32;
                this.f28310r = f33;
                if (f33 >= 1.0f) {
                    this.f28308p = this.f28309q;
                    this.f28310r = 1.0f;
                    this.f28313u = false;
                }
                invalidateSelf();
            }
        }
        i32 = i10;
        if (i32 >= 1) {
            canvas.restoreToCount(i32);
        }
    }

    public final void e(float f10, boolean z10) {
        if (this.f28314w == f10) {
            return;
        }
        if (z10) {
            if (this.f28315x > f10) {
                this.f28315x = f10;
            }
            this.f28316y = this.f28315x;
        } else {
            this.f28315x = f10;
            this.f28316y = f10;
        }
        this.f28314w = f10;
        this.f28317z = 0.0f;
        invalidateSelf();
    }

    @Override
    public final int getIntrinsicHeight() {
        return AndroidUtilities.dp(48.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return AndroidUtilities.dp(48.0f);
    }

    @Override
    public final int getMinimumHeight() {
        return AndroidUtilities.dp(48.0f);
    }

    @Override
    public final int getMinimumWidth() {
        return AndroidUtilities.dp(48.0f);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void invalidateSelf() {
        super.invalidateSelf();
        vu vuVar = this.A;
        if (vuVar != null) {
            ((View) vuVar.f34056b).invalidate();
        }
    }

    @Override
    public final void setBounds(int i10, int i11, int i12, int i13) {
        super.setBounds(i10, i11, i12, i13);
        float fDp = (i12 - i10) / AndroidUtilities.dp(48.0f);
        this.h = fDp;
        if (fDp < 0.7f) {
            this.f28296b.setStrokeWidth(AndroidUtilities.dp(2.0f));
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f28296b.setColorFilter(colorFilter);
        this.d.setColorFilter(colorFilter);
        this.f28298e.setColorFilter(colorFilter);
        this.f28295a.setColorFilter(colorFilter);
    }

    @Override
    public final void setAlpha(int i10) {
    }
}
