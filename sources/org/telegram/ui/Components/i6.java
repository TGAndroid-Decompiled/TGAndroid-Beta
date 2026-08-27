package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;

public class i6 extends Drawable {
    public boolean A;
    public boolean B;
    public bg C;
    public boolean D;
    public boolean E;
    public boolean F;
    public int G;
    public float H;
    public boolean I;
    public LinearGradient J;
    public Matrix K;
    public Paint L;
    public boolean M;
    public boolean N;
    public boolean O;
    public float P;
    public float Q;
    public int R;
    public ValueAnimator S;
    public int T;
    public ColorFilter U;
    public Runnable V;

    public final TextPaint f29238a;

    public int f29239b;

    public boolean f29240c;
    public float d;

    public float f29241e;

    public f6[] f29242f;

    public CharSequence f29243g;
    public float h;

    public float f29244i;

    public f6[] f29245j;

    public CharSequence f29246k;

    public int f29247l;

    public float f29248m;

    public boolean f29249n;

    public ValueAnimator f29250o;

    public CharSequence f29251p;

    public boolean f29252q;

    public long f29253r;

    public TimeInterpolator f29254s;

    public float f29255t;

    public float f29256u;
    public float v;

    public int f29257w;

    public final Rect f29258x;

    public boolean f29259y;

    public boolean f29260z;

    public i6(int i10) {
        this(false, true, true, false);
    }

    public static boolean j(int i10, int i11, CharSequence charSequence, CharSequence charSequence2) {
        CharSequence charSequence3;
        if (!(charSequence instanceof h6) || !(charSequence2 instanceof h6)) {
            return charSequence.charAt(i10) == charSequence2.charAt(i11);
        }
        h6 h6Var = (h6) charSequence;
        CharSequence charSequence4 = null;
        if (i10 >= 0) {
            CharSequence[] charSequenceArr = h6Var.f28932a;
            if (i10 >= charSequenceArr.length) {
                charSequence3 = null;
            } else {
                charSequence3 = charSequenceArr[i10];
            }
        } else {
            charSequence3 = null;
        }
        h6 h6Var2 = (h6) charSequence2;
        if (i11 >= 0) {
            CharSequence[] charSequenceArr2 = h6Var2.f28932a;
            if (i11 < charSequenceArr2.length) {
                charSequence4 = charSequenceArr2[i11];
            }
        }
        if (charSequence3 == null && charSequence4 == null) {
            return true;
        }
        return charSequence3 != null && charSequence3.equals(charSequence4);
    }

    public final void a(float f10) {
        int i10 = (int) (this.f29257w * f10);
        TextPaint textPaint = this.f29238a;
        textPaint.setAlpha(i10);
        if (this.O) {
            textPaint.setShadowLayer(this.P, 0.0f, this.Q, org.telegram.ui.ActionBar.g6.l1(f10, this.R));
        }
    }

    public final void b() {
        ValueAnimator valueAnimator = this.f29250o;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    public final void c() {
        if (this.f29245j != null) {
            int i10 = 0;
            while (true) {
                f6[] f6VarArr = this.f29245j;
                if (i10 >= f6VarArr.length) {
                    break;
                }
                f6 f6Var = f6VarArr[i10];
                i6 i6Var = f6Var.f28269g;
                if (i6Var.getCallback() instanceof View) {
                    t5.release((View) i6Var.getCallback(), f6Var.f28264a);
                }
                i10++;
            }
        }
        this.f29245j = null;
    }

    public final float d() {
        return (this.f29242f == null || this.f29245j == null) ? this.d : AndroidUtilities.lerp(this.h, this.d, this.f29248m);
    }

    @Override
    public final void draw(Canvas canvas) {
        int i10;
        f6 f6Var;
        float f10;
        boolean z10;
        float fA;
        int i11;
        float f11;
        float f12;
        TextPaint textPaint;
        float f13;
        float f14;
        float f15;
        float fA2;
        float f16;
        boolean z11 = this.I;
        Rect rect = this.f29258x;
        if (z11) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(rect);
            rectF.right -= this.H;
            canvas.saveLayerAlpha(rectF, 255, 31);
        }
        canvas.save();
        canvas.translate(rect.left, rect.top);
        int iWidth = rect.width();
        int iHeight = rect.height();
        if (this.f29242f == null || this.f29245j == null) {
            if (this.N) {
                canvas.translate(0.0f, (iHeight - this.f29241e) / 2.0f);
            }
            if (this.f29242f != null) {
                a(1.0f);
                for (i10 = 0; i10 < this.f29242f.length; i10++) {
                    canvas.save();
                    f6Var = this.f29242f[i10];
                    f10 = f6Var.f28266c;
                    z10 = this.f29240c;
                    if (z10 && !this.E) {
                        f10 = this.d - (f10 + f6Var.f28268f);
                    }
                    fA = f10 - f6Var.f28267e;
                    i11 = this.f29239b;
                    if ((i11 | (-4)) == -1) {
                        if ((i11 | (-6)) == -1) {
                            fA += iWidth - this.d;
                            f11 = 0.0f;
                        } else if ((i11 | (-2)) == -1) {
                            fA = com.google.android.recaptcha.internal.a.A(iWidth, this.d, 2.0f, fA);
                        } else if (z10 && !this.E) {
                            fA += iWidth - this.d;
                        }
                        canvas.translate(fA, f11);
                        f6Var.a(canvas, 1.0f);
                        canvas.restore();
                    }
                    f11 = 0.0f;
                    canvas.translate(fA, f11);
                    f6Var.a(canvas, 1.0f);
                    canvas.restore();
                }
            }
        } else {
            float f17 = this.f29248m;
            if (f17 != 1.0f) {
                float fLerp = AndroidUtilities.lerp(this.h, this.d, f17);
                float fLerp2 = AndroidUtilities.lerp(this.f29244i, this.f29241e, this.f29248m);
                if (this.N) {
                    canvas.translate(0.0f, (iHeight - fLerp2) / 2.0f);
                }
                int i12 = 0;
                while (true) {
                    f6[] f6VarArr = this.f29242f;
                    int length = f6VarArr.length;
                    textPaint = this.f29238a;
                    if (i12 >= length) {
                        break;
                    }
                    f6 f6Var2 = f6VarArr[i12];
                    int i13 = f6Var2.d;
                    float f18 = f6Var2.f28266c;
                    if (!this.f29240c || this.E) {
                        f15 = 0.0f;
                    } else {
                        f15 = 0.0f;
                        f18 = this.d - (f18 + f6Var2.f28268f);
                    }
                    float fCascade = this.f29248m;
                    float f19 = this.f29255t;
                    if (f19 > f15) {
                        fCascade = AndroidUtilities.cascade(fCascade, i12, f6VarArr.length, f19);
                    }
                    if (i13 >= 0) {
                        f6 f6Var3 = this.f29245j[i13];
                        float f20 = f6Var3.f28266c;
                        if (this.f29240c && !this.E) {
                            f20 = this.h - (f20 + f6Var3.f28268f);
                        }
                        fA2 = AndroidUtilities.lerp(f20 - f6Var3.f28267e, f18 - f6Var2.f28267e, this.f29248m);
                        a(1.0f);
                        f16 = 0.0f;
                    } else {
                        fA2 = f18 - f6Var2.f28267e;
                        f16 = (1.0f - fCascade) * (-textPaint.getTextSize()) * this.f29256u * (this.f29249n ? 1.0f : -1.0f);
                        a(fCascade);
                    }
                    canvas.save();
                    float f21 = i13 >= 0 ? fLerp : this.d;
                    int i14 = this.f29239b;
                    if ((i14 | (-4)) != -1) {
                        if ((i14 | (-6)) == -1) {
                            fA2 += iWidth - f21;
                        } else if ((i14 | (-2)) == -1) {
                            fA2 = com.google.android.recaptcha.internal.a.A(iWidth, f21, 2.0f, fA2);
                        } else if (this.f29240c && !this.E) {
                            fA2 += iWidth - f21;
                        }
                    }
                    canvas.translate(fA2, f16);
                    if (i13 < 0) {
                        float f22 = this.v;
                        if (f22 > f15) {
                            float fLerp3 = AndroidUtilities.lerp(1.0f - f22, 1.0f, this.f29248m);
                            canvas.scale(fLerp3, fLerp3, f6Var2.f28268f / 2.0f, f6Var2.f28265b.getHeight() / 2.0f);
                        }
                    }
                    f6Var2.a(canvas, i13 >= 0 ? 1.0f : this.f29248m);
                    canvas.restore();
                    i12++;
                }
                int i15 = 0;
                while (true) {
                    f6[] f6VarArr2 = this.f29245j;
                    if (i15 >= f6VarArr2.length) {
                        break;
                    }
                    f6 f6Var4 = f6VarArr2[i15];
                    if (f6Var4.d < 0) {
                        float fCascade2 = this.f29248m;
                        float f23 = this.f29255t;
                        if (f23 > 0.0f) {
                            fCascade2 = AndroidUtilities.cascade(fCascade2, i15, f6VarArr2.length, f23);
                        }
                        float f24 = f6Var4.f28266c;
                        float textSize = textPaint.getTextSize() * this.f29256u * fCascade2 * (this.f29249n ? 1.0f : -1.0f);
                        float f25 = 1.0f - fCascade2;
                        a(f25);
                        canvas.save();
                        boolean z12 = this.f29240c;
                        if (z12 && !this.E) {
                            f24 = this.h - (f24 + f6Var4.f28268f);
                        }
                        float fA3 = f24 - f6Var4.f28267e;
                        int i16 = this.f29239b;
                        if ((i16 | (-4)) != -1) {
                            if ((i16 | (-6)) == -1) {
                                f13 = iWidth;
                                f14 = this.h;
                            } else if ((i16 | (-2)) == -1) {
                                fA3 = com.google.android.recaptcha.internal.a.A(iWidth, this.h, 2.0f, fA3);
                            } else if (z12 && !this.E) {
                                f13 = iWidth;
                                f14 = this.h;
                            }
                            fA3 += f13 - f14;
                        }
                        canvas.translate(fA3, textSize);
                        float f26 = this.v;
                        if (f26 > 0.0f) {
                            float fLerp4 = AndroidUtilities.lerp(1.0f, 1.0f - f26, this.f29248m);
                            canvas.scale(fLerp4, fLerp4, f6Var4.f28268f / 2.0f, f6Var4.f28265b.getHeight() / 2.0f);
                        }
                        f6Var4.a(canvas, f25);
                        canvas.restore();
                    }
                    i15++;
                }
            } else {
                if (this.N) {
                    canvas.translate(0.0f, (iHeight - this.f29241e) / 2.0f);
                }
                if (this.f29242f != null) {
                    a(1.0f);
                    while (i10 < this.f29242f.length) {
                        canvas.save();
                        f6Var = this.f29242f[i10];
                        f10 = f6Var.f28266c;
                        z10 = this.f29240c;
                        if (z10) {
                            f10 = this.d - (f10 + f6Var.f28268f);
                        }
                        fA = f10 - f6Var.f28267e;
                        i11 = this.f29239b;
                        if ((i11 | (-4)) == -1) {
                            if ((i11 | (-6)) == -1) {
                                fA += iWidth - this.d;
                                f11 = 0.0f;
                            } else if ((i11 | (-2)) == -1) {
                                fA = com.google.android.recaptcha.internal.a.A(iWidth, this.d, 2.0f, fA);
                            } else if (z10) {
                                fA += iWidth - this.d;
                            }
                            canvas.translate(fA, f11);
                            f6Var.a(canvas, 1.0f);
                            canvas.restore();
                        }
                        f11 = 0.0f;
                        canvas.translate(fA, f11);
                        f6Var.a(canvas, 1.0f);
                        canvas.restore();
                    }
                }
            }
        }
        canvas.restore();
        if (this.I) {
            float fDp = AndroidUtilities.dp(16.0f);
            if (this.J == null) {
                f12 = fDp;
                this.J = new LinearGradient(0.0f, 0.0f, f12, 0.0f, new int[]{16711680, -65536}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                this.K = new Matrix();
                Paint paint = new Paint(1);
                this.L = paint;
                paint.setShader(this.J);
                this.L.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
            } else {
                f12 = fDp;
            }
            this.K.reset();
            this.K.postTranslate((rect.right - this.H) - f12, 0.0f);
            this.J.setLocalMatrix(this.K);
            float f27 = rect.right - this.H;
            canvas.drawRect(f27 - f12, rect.top, f27 + AndroidUtilities.dp(1.0f), rect.bottom, this.L);
            canvas.restore();
        }
    }

    public final float e() {
        return Math.max(this.d, this.h);
    }

    public final boolean f() {
        ValueAnimator valueAnimator = this.f29250o;
        return valueAnimator != null && valueAnimator.isRunning();
    }

    public final float g() {
        CharSequence charSequence = this.f29246k;
        float f10 = 0.0f;
        float f11 = (charSequence == null || charSequence.length() <= 0) ? 0.0f : 1.0f;
        CharSequence charSequence2 = this.f29243g;
        if (charSequence2 != null && charSequence2.length() > 0) {
            f10 = 1.0f;
        }
        return AndroidUtilities.lerp(f11, f10, this.f29246k != null ? this.f29248m : 1.0f);
    }

    @Override
    public final Rect getDirtyBounds() {
        return this.f29258x;
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    public final StaticLayout h(int i10, CharSequence charSequence) {
        if (i10 <= 0) {
            Point point = AndroidUtilities.displaySize;
            i10 = Math.min(point.x, point.y);
        }
        int i11 = i10;
        int i12 = Build.VERSION.SDK_INT;
        TextPaint textPaint = this.f29238a;
        return i12 >= 23 ? StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i11).setMaxLines(1).setLineSpacing(0.0f, 1.0f).setAlignment(Layout.Alignment.ALIGN_NORMAL).setEllipsize(TextUtils.TruncateAt.END).setEllipsizedWidth(i11).setIncludePad(this.M).build() : new StaticLayout(charSequence, 0, charSequence.length(), textPaint, i11, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, this.M, TextUtils.TruncateAt.END, i11);
    }

    public final void i(g6 g6Var, CharSequence charSequence, int i10, int i11) {
        if (!this.B || charSequence.length() <= 1) {
            g6Var.b(charSequence);
            return;
        }
        int i12 = 0;
        while (i12 < charSequence.length()) {
            int i13 = i12 + 1;
            g6Var.b(charSequence.subSequence(i12, i13));
            i12 = i13;
        }
    }

    public final void k(float f10, long j10, TimeInterpolator timeInterpolator) {
        this.f29256u = f10;
        this.f29253r = j10;
        this.f29255t = 1.0f;
        this.f29254s = timeInterpolator;
    }

    public final void l(float f10, float f11, float f12, float f13) {
        int i10 = (int) f10;
        int i11 = (int) f11;
        int i12 = (int) f12;
        int i13 = (int) f13;
        super.setBounds(i10, i11, i12, i13);
        this.f29258x.set(i10, i11, i12, i13);
    }

    public final void m(RectF rectF) {
        setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
    }

    public final void n(boolean z10) {
        this.I = z10;
        invalidateSelf();
    }

    public final void o(boolean z10, boolean z11, boolean z12) {
        this.f29259y = z10;
        this.f29260z = true;
        this.A = z11;
        this.B = z12;
    }

    public final void p(float f10, float f11, int i10) {
        this.O = true;
        this.P = f10;
        this.Q = f11;
        this.R = i10;
        this.f29238a.setShadowLayer(f10, 0.0f, f11, i10);
    }

    public final void q(CharSequence charSequence, boolean z10, boolean z11) {
        int i10;
        final int i11 = 0;
        boolean z12 = (this.f29243g == null || charSequence == null) ? false : z10;
        CharSequence charSequence2 = charSequence == null ? "" : charSequence;
        final int iWidth = this.G;
        if (iWidth <= 0) {
            iWidth = this.f29258x.width();
        }
        final int i12 = 1;
        if (!z12) {
            ValueAnimator valueAnimator = this.f29250o;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f29250o = null;
            this.f29251p = null;
            this.f29252q = false;
            this.f29248m = 0.0f;
            if (!charSequence2.equals(this.f29243g)) {
                if (this.f29245j != null) {
                    int i13 = 0;
                    while (true) {
                        f6[] f6VarArr = this.f29245j;
                        if (i13 >= f6VarArr.length) {
                            break;
                        }
                        f6 f6Var = f6VarArr[i13];
                        i6 i6Var = f6Var.f28269g;
                        if (i6Var.getCallback() instanceof View) {
                            t5.release((View) i6Var.getCallback(), f6Var.f28264a);
                        }
                        i13++;
                    }
                }
                this.f29245j = null;
                this.f29242f = new f6[]{new f6(this, h(iWidth, charSequence2), 0.0f, -1)};
                this.f29243g = charSequence2;
                f6 f6Var2 = this.f29242f[0];
                this.d = f6Var2.f28268f;
                this.f29241e = f6Var2.f28265b.getHeight();
                this.f29240c = AndroidUtilities.isRTL(this.f29243g);
            }
            c();
            this.f29246k = null;
            this.h = 0.0f;
            this.f29244i = 0.0f;
            invalidateSelf();
            Runnable runnable = this.V;
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        if (TextUtils.equals(charSequence2, this.f29243g)) {
            return;
        }
        if (this.D) {
            ValueAnimator valueAnimator2 = this.f29250o;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
                this.f29250o = null;
            }
        } else if (f()) {
            this.f29251p = charSequence2;
            this.f29252q = z11;
            return;
        }
        this.f29246k = this.f29243g;
        this.f29243g = charSequence2;
        final ArrayList arrayList = new ArrayList();
        final ArrayList arrayList2 = new ArrayList();
        this.f29241e = 0.0f;
        this.d = 0.0f;
        this.f29244i = 0.0f;
        this.h = 0.0f;
        this.f29240c = AndroidUtilities.isRTL(this.f29243g);
        cg.a0 a0Var = new cg.a0(this, iWidth, arrayList2, arrayList);
        g6 g6Var = new g6(this) {

            public final i6 f27656b;

            {
                this.f27656b = this;
            }

            @Override
            public final void b(CharSequence charSequence3) {
                switch (i11) {
                    case 0:
                        i6 i6Var2 = this.f27656b;
                        StaticLayout staticLayoutH = i6Var2.h(iWidth - ((int) Math.ceil(i6Var2.d)), charSequence3);
                        f6 f6Var3 = new f6(i6Var2, staticLayoutH, i6Var2.d, -1);
                        arrayList.add(f6Var3);
                        i6Var2.d += f6Var3.f28268f;
                        i6Var2.f29241e = Math.max(i6Var2.f29241e, staticLayoutH.getHeight());
                        break;
                    default:
                        i6 i6Var3 = this.f27656b;
                        StaticLayout staticLayoutH2 = i6Var3.h(iWidth - ((int) Math.ceil(i6Var3.h)), charSequence3);
                        f6 f6Var4 = new f6(i6Var3, staticLayoutH2, i6Var3.h, -1);
                        arrayList.add(f6Var4);
                        i6Var3.h += f6Var4.f28268f;
                        i6Var3.f29244i = Math.max(i6Var3.f29244i, staticLayoutH2.getHeight());
                        break;
                }
            }
        };
        g6 g6Var2 = new g6(this) {

            public final i6 f27656b;

            {
                this.f27656b = this;
            }

            @Override
            public final void b(CharSequence charSequence3) {
                switch (i12) {
                    case 0:
                        i6 i6Var2 = this.f27656b;
                        StaticLayout staticLayoutH = i6Var2.h(iWidth - ((int) Math.ceil(i6Var2.d)), charSequence3);
                        f6 f6Var3 = new f6(i6Var2, staticLayoutH, i6Var2.d, -1);
                        arrayList2.add(f6Var3);
                        i6Var2.d += f6Var3.f28268f;
                        i6Var2.f29241e = Math.max(i6Var2.f29241e, staticLayoutH.getHeight());
                        break;
                    default:
                        i6 i6Var3 = this.f27656b;
                        StaticLayout staticLayoutH2 = i6Var3.h(iWidth - ((int) Math.ceil(i6Var3.h)), charSequence3);
                        f6 f6Var4 = new f6(i6Var3, staticLayoutH2, i6Var3.h, -1);
                        arrayList2.add(f6Var4);
                        i6Var3.h += f6Var4.f28268f;
                        i6Var3.f29244i = Math.max(i6Var3.f29244i, staticLayoutH2.getHeight());
                        break;
                }
            }
        };
        CharSequence h6Var = this.f29259y ? new h6(this.f29246k) : this.f29246k;
        CharSequence h6Var2 = this.f29259y ? new h6(this.f29243g) : this.f29243g;
        if (this.F) {
            i(g6Var2, h6Var, 0, h6Var.length());
            i(g6Var, h6Var2, 0, h6Var2.length());
        } else if (this.f29260z) {
            int iMin = Math.min(h6Var2.length(), h6Var.length());
            if (this.A) {
                ArrayList arrayList3 = new ArrayList();
                int i14 = 1;
                int i15 = 0;
                for (int i16 = 0; i16 <= iMin; i16++) {
                    int length = (h6Var2.length() - i16) - 1;
                    int length2 = (h6Var.length() - i16) - 1;
                    int i17 = (length < 0 || length2 < 0 || !j(length, length2, h6Var2, h6Var)) ? 0 : 1;
                    if (i12 != i17 || i16 == iMin) {
                        int i18 = i16 - i15;
                        if (i18 > 0) {
                            if (arrayList3.size() != 0) {
                                i12 = i14;
                            }
                            arrayList3.add(Integer.valueOf(i18));
                            i14 = i12;
                        }
                        i12 = i17;
                        i15 = i16;
                    }
                }
                int length3 = h6Var2.length() - iMin;
                int length4 = h6Var.length() - iMin;
                if (length3 > 0) {
                    i(g6Var, h6Var2.subSequence(0, length3), 0, length3);
                }
                if (length4 > 0) {
                    i(g6Var2, h6Var.subSequence(0, length4), 0, length4);
                }
                int size = arrayList3.size() - 1;
                while (size >= 0) {
                    int iIntValue = ((Integer) arrayList3.get(size)).intValue();
                    if ((size % 2 == 0 ? 1 : 0) == i14) {
                        i10 = size;
                        if (h6Var2.length() > h6Var.length()) {
                            a0Var.b(h6Var2.subSequence(length3, length3 + iIntValue));
                        } else {
                            a0Var.b(h6Var.subSequence(length4, length4 + iIntValue));
                        }
                    } else {
                        i10 = size;
                        int i19 = length3 + iIntValue;
                        i(g6Var, h6Var2.subSequence(length3, i19), length3, i19);
                        int i20 = length4 + iIntValue;
                        i(g6Var2, h6Var.subSequence(length4, i20), length4, i20);
                    }
                    length3 += iIntValue;
                    length4 += iIntValue;
                    size = i10 - 1;
                }
            } else {
                int i21 = 0;
                int i22 = 0;
                boolean z13 = true;
                while (i21 <= iMin) {
                    boolean z14 = i21 < iMin && j(i21, i21, h6Var2, h6Var);
                    if (z13 != z14 || i21 == iMin) {
                        if (i21 - i22 > 0) {
                            if (z13) {
                                i(a0Var, h6Var2.subSequence(i22, i21), i22, i21);
                            } else {
                                i(g6Var, h6Var2.subSequence(i22, i21), i22, i21);
                                i(g6Var2, h6Var.subSequence(i22, i21), i22, i21);
                            }
                        }
                        i22 = i21;
                        z13 = z14;
                    }
                    i21++;
                }
                if (h6Var2.length() - iMin > 0) {
                    i(g6Var, h6Var2.subSequence(iMin, h6Var2.length()), iMin, h6Var2.length());
                }
                if (h6Var.length() - iMin > 0) {
                    i(g6Var2, h6Var.subSequence(iMin, h6Var.length()), iMin, h6Var.length());
                }
            }
        } else {
            int iMin2 = Math.min(h6Var2.length(), h6Var.length());
            int length5 = 0;
            int length6 = 0;
            int i23 = 0;
            int i24 = 0;
            boolean z15 = true;
            while (length5 <= iMin2) {
                boolean z16 = length5 < iMin2 && j(length5, length6, h6Var2, h6Var);
                if (z15 != z16 || length5 == iMin2) {
                    if (length5 == iMin2) {
                        length5 = h6Var2.length();
                        length6 = h6Var.length();
                    }
                    int i25 = length5 - i23;
                    boolean z17 = z15;
                    int i26 = length6 - i24;
                    if (i25 > 0 || i26 > 0) {
                        if (i25 == i26 && z17) {
                            a0Var.b(h6Var2.subSequence(i23, length5));
                        } else {
                            if (i25 > 0) {
                                i(g6Var, h6Var2.subSequence(i23, length5), i23, length5);
                            }
                            if (i26 > 0) {
                                i(g6Var2, h6Var.subSequence(i24, length6), i24, length6);
                            }
                        }
                    }
                    i23 = length5;
                    i24 = length6;
                    z15 = z16;
                }
                if (z16) {
                    length6++;
                }
                length5++;
                iMin2 = iMin2;
            }
        }
        if (this.f29245j != null) {
            int i27 = 0;
            while (true) {
                f6[] f6VarArr2 = this.f29245j;
                if (i27 >= f6VarArr2.length) {
                    break;
                }
                f6 f6Var3 = f6VarArr2[i27];
                i6 i6Var2 = f6Var3.f28269g;
                if (i6Var2.getCallback() instanceof View) {
                    t5.release((View) i6Var2.getCallback(), f6Var3.f28264a);
                }
                i27++;
            }
        }
        this.f29245j = null;
        f6[] f6VarArr3 = this.f29242f;
        if (f6VarArr3 == null || f6VarArr3.length != arrayList.size()) {
            this.f29242f = new f6[arrayList.size()];
        }
        arrayList.toArray(this.f29242f);
        c();
        f6[] f6VarArr4 = this.f29245j;
        if (f6VarArr4 == null || f6VarArr4.length != arrayList2.size()) {
            this.f29245j = new f6[arrayList2.size()];
        }
        arrayList2.toArray(this.f29245j);
        ValueAnimator valueAnimator3 = this.f29250o;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
        }
        this.f29249n = z11;
        this.f29248m = 0.0f;
        this.f29250o = ValueAnimator.ofFloat(0.0f, 1.0f);
        Runnable runnable2 = this.V;
        if (runnable2 != null) {
            runnable2.run();
        }
        this.f29250o.addUpdateListener(new e6(this, 0));
        this.f29250o.addListener(new org.telegram.ui.am(this, 6));
        this.f29250o.setStartDelay(0L);
        this.f29250o.setDuration(this.f29253r);
        this.f29250o.setInterpolator(this.f29254s);
        this.f29250o.start();
    }

    public final void r(int i10) {
        this.f29238a.setColor(i10);
        this.f29257w = Color.alpha(i10);
    }

    public final void s(int i10, boolean z10) {
        ValueAnimator valueAnimator = this.S;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.S = null;
        }
        if (!z10) {
            r(i10);
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.S = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new lh.t4(this, this.f29238a.getColor(), i10, 2));
        this.S.addListener(new nh.n2(this, i10, 3));
        this.S.setDuration(240L);
        this.S.setInterpolator(er.h);
        this.S.start();
    }

    @Override
    public final void setAlpha(int i10) {
        this.f29257w = i10;
    }

    @Override
    public final void setBounds(Rect rect) {
        super.setBounds(rect);
        this.f29258x.set(rect);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f29238a.setColorFilter(colorFilter);
    }

    public final void t(float f10) {
        TextPaint textPaint = this.f29238a;
        float textSize = textPaint.getTextSize();
        textPaint.setTextSize(f10);
        if (Math.abs(textSize - f10) > 0.5f) {
            int iWidth = this.G;
            if (iWidth <= 0) {
                iWidth = this.f29258x.width();
            }
            int i10 = 0;
            if (this.f29242f != null) {
                this.d = 0.0f;
                this.f29241e = 0.0f;
                int i11 = 0;
                while (true) {
                    f6[] f6VarArr = this.f29242f;
                    if (i11 >= f6VarArr.length) {
                        break;
                    }
                    StaticLayout staticLayoutH = h(iWidth - ((int) Math.ceil(Math.min(this.d, this.h))), f6VarArr[i11].f28265b.getText());
                    f6[] f6VarArr2 = this.f29242f;
                    f6 f6Var = f6VarArr2[i11];
                    f6VarArr2[i11] = new f6(this, staticLayoutH, f6Var.f28266c, f6Var.d);
                    float f11 = this.d;
                    f6 f6Var2 = this.f29242f[i11];
                    this.d = f11 + f6Var2.f28268f;
                    this.f29241e = Math.max(this.f29241e, f6Var2.f28265b.getHeight());
                    i11++;
                }
            }
            if (this.f29245j != null) {
                this.h = 0.0f;
                this.f29244i = 0.0f;
                while (true) {
                    f6[] f6VarArr3 = this.f29245j;
                    if (i10 >= f6VarArr3.length) {
                        break;
                    }
                    StaticLayout staticLayoutH2 = h(iWidth - ((int) Math.ceil(Math.min(this.d, this.h))), f6VarArr3[i10].f28265b.getText());
                    f6[] f6VarArr4 = this.f29245j;
                    f6 f6Var3 = f6VarArr4[i10];
                    f6VarArr4[i10] = new f6(this, staticLayoutH2, f6Var3.f28266c, f6Var3.d);
                    float f12 = this.h;
                    f6 f6Var4 = this.f29245j[i10];
                    this.h = f12 + f6Var4.f28268f;
                    this.f29244i = Math.max(this.f29244i, f6Var4.f28265b.getHeight());
                    i10++;
                }
            }
            invalidateSelf();
        }
    }

    public final void u(Typeface typeface) {
        this.f29238a.setTypeface(typeface);
    }

    public i6(boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f29238a = new TextPaint(1);
        this.f29239b = 0;
        this.f29240c = false;
        this.f29247l = 0;
        this.f29248m = 0.0f;
        this.f29249n = true;
        this.f29253r = 320L;
        this.f29254s = er.h;
        this.f29255t = -1.0f;
        this.f29256u = 0.3f;
        this.v = 0.0f;
        this.f29257w = 255;
        this.f29258x = new Rect();
        this.M = true;
        this.N = true;
        this.O = false;
        this.f29259y = z10;
        this.f29260z = z11;
        this.A = z12;
        this.B = z13;
    }

    @Override
    public final void setBounds(int i10, int i11, int i12, int i13) {
        super.setBounds(i10, i11, i12, i13);
        this.f29258x.set(i10, i11, i12, i13);
    }
}
