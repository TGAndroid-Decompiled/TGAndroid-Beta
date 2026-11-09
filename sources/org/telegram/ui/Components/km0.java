package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.SystemClock;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.Pair;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.Utilities;
public class km0 {
    public static Paint D;
    public static int E;
    public static float[] F;
    public static Path G;
    public TextPaint A;
    public long C;
    public float f35376a;
    public int f35380f;
    public int f35381g;
    public jm0 h;
    public int f35382i;
    public int f35383j;
    public int f35384k;
    public int f35385l;
    public int f35386m;
    public boolean f35389p;
    public float f35390q;
    public float f35391r;
    public View f35392s;
    public ArrayList f35394u;
    public CharSequence v;
    public long f35395w;
    public StaticLayout[] f35398z;
    public int f35377b = 0;
    public int f35378c = 0;
    public int d = 0;
    public boolean f35379e = false;
    public final RectF f35387n = new RectF();
    public final int f35388o = org.telegram.messenger.g0.L(2.0f);
    public float f35393t = 1.0f;
    public float f35396x = 0.0f;
    public int f35397y = -1;
    public float B = 1.0f;

    public km0(View view) {
        if (D == null) {
            D = new Paint(1);
        }
        this.f35392s = view;
        E = org.telegram.messenger.g0.L(24.0f);
        this.f35391r = org.telegram.messenger.g0.L(6.0f);
    }

    public final void a() {
        this.f35394u = null;
        this.f35397y = -1;
        this.f35396x = 0.0f;
        StaticLayout[] staticLayoutArr = this.f35398z;
        if (staticLayoutArr != null) {
            staticLayoutArr[1] = null;
            staticLayoutArr[0] = null;
        }
        this.v = null;
        this.f35395w = -1L;
    }

    public final void b(Canvas canvas) {
        Canvas canvas2;
        int i7;
        int i10;
        int i11;
        int i12;
        float f10;
        int i13;
        int i14;
        float f11;
        int i15;
        int i16;
        float f12 = this.f35393t;
        if (f12 > 0.0f) {
            if (f12 < 1.0f) {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, this.f35380f, this.f35381g, (int) (f12 * 255.0f), 31);
            } else {
                canvas2 = canvas;
            }
            int i17 = E / 2;
            int i18 = this.f35381g / 2;
            int i19 = this.f35388o / 2;
            RectF rectF = this.f35387n;
            rectF.set(i17, i18 - i19, this.f35380f - i17, i18 + i19);
            Paint paint = D;
            if (this.f35389p) {
                i7 = this.f35386m;
            } else {
                i7 = this.f35382i;
            }
            paint.setColor(i7);
            c(canvas2, rectF, D);
            if (this.f35390q > 0.0f) {
                Paint paint2 = D;
                if (this.f35389p) {
                    i15 = this.f35386m;
                } else {
                    i15 = this.f35383j;
                }
                paint2.setColor(i15);
                float f13 = E / 2;
                int i20 = this.f35381g / 2;
                rectF.set(f13, i20 - i19, (this.f35390q * (this.f35380f - i16)) + f13, i20 + i19);
                c(canvas2, rectF, D);
            }
            float f14 = E / 2;
            float f15 = (this.f35381g / 2) - i19;
            if (this.f35379e) {
                i12 = this.f35378c;
            } else {
                i12 = this.f35377b;
            }
            rectF.set(f14, f15, i10 + i12, i19 + i11);
            D.setColor(this.f35385l);
            c(canvas2, rectF, D);
            D.setColor(this.f35384k);
            if (this.f35379e) {
                f10 = 8.0f;
            } else {
                f10 = 6.0f;
            }
            float L = org.telegram.messenger.g0.L(f10);
            if (this.f35391r != L) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (elapsedRealtime > 18) {
                    elapsedRealtime = 16;
                }
                float f16 = this.f35391r;
                if (f16 < L) {
                    float c10 = com.google.android.recaptcha.internal.a.c((float) elapsedRealtime, 60.0f, org.telegram.messenger.g0.L(1.0f), f16);
                    this.f35391r = c10;
                    if (c10 > L) {
                        this.f35391r = L;
                    }
                } else {
                    float v = org.telegram.messenger.camera.q.v((float) elapsedRealtime, 60.0f, org.telegram.messenger.g0.L(1.0f), f16);
                    this.f35391r = v;
                    if (v < L) {
                        this.f35391r = L;
                    }
                }
                View view = this.f35392s;
                if (view != null) {
                    view.invalidate();
                }
            }
            if (this.f35379e) {
                i13 = this.f35378c;
            } else {
                i13 = this.f35377b;
            }
            canvas2.drawCircle((E / 2) + i13, this.f35381g / 2, this.f35391r, D);
            if (this.f35393t < 1.0f) {
                canvas2.restore();
            }
            ArrayList arrayList = this.f35394u;
            if (arrayList != null && !arrayList.isEmpty()) {
                if (this.f35379e) {
                    i14 = this.f35378c;
                } else {
                    i14 = this.f35377b;
                }
                float f17 = i14 / (this.f35380f - E);
                int size = this.f35394u.size() - 1;
                while (true) {
                    if (size >= 0) {
                        if (((Float) ((Pair) this.f35394u.get(size)).first).floatValue() - 0.001f <= f17) {
                            break;
                        }
                        size--;
                    } else {
                        size = -1;
                        break;
                    }
                }
                if (this.f35398z == null) {
                    this.f35398z = new StaticLayout[2];
                }
                float f18 = E / 2.0f;
                Math.abs(f18 - (this.f35380f - f18));
                org.telegram.messenger.g0.L(66.0f);
                if (size != this.f35397y) {
                    if (this.f35379e) {
                        org.telegram.messenger.g0.c4(this.f35392s);
                    }
                    this.f35397y = size;
                    if (size >= 0 && size < this.f35394u.size()) {
                        d((c41) ((Pair) this.f35394u.get(this.f35397y)).second);
                    }
                }
                if (this.B < 1.0f) {
                    long min = Math.min(17L, Math.abs(SystemClock.elapsedRealtime() - this.C));
                    if (this.f35394u.size() > 8) {
                        f11 = 160.0f;
                    } else {
                        f11 = 220.0f;
                    }
                    this.B = Math.min((((float) min) / f11) + this.B, 1.0f);
                    View view2 = this.f35392s;
                    if (view2 != null) {
                        view2.invalidate();
                    }
                    this.C = SystemClock.elapsedRealtime();
                }
                if (this.f35396x < 1.0f) {
                    this.f35396x = Math.min((((float) Math.min(17L, Math.abs(SystemClock.elapsedRealtime() - this.C))) / 200.0f) + this.f35396x, 1.0f);
                    View view3 = this.f35392s;
                    if (view3 != null) {
                        view3.invalidate();
                    }
                    SystemClock.elapsedRealtime();
                }
            }
        }
    }

    public final void c(android.graphics.Canvas r26, android.graphics.RectF r27, android.graphics.Paint r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.km0.c(android.graphics.Canvas, android.graphics.RectF, android.graphics.Paint):void");
    }

    public final boolean e(float f10, float f11, int i7) {
        jm0 jm0Var;
        if (i7 == 0) {
            int i10 = this.f35381g;
            int i11 = E;
            int i12 = (i10 - i11) / 2;
            if (f10 >= (-i12)) {
                int i13 = this.f35380f;
                if (f10 <= i13 + i12 && f11 >= 0.0f && f11 <= i10) {
                    int i14 = this.f35377b;
                    if (i14 - i12 > f10 || f10 > i14 + i11 + i12) {
                        int i15 = ((int) f10) - (i11 / 2);
                        this.f35377b = i15;
                        if (i15 < 0) {
                            this.f35377b = 0;
                        } else {
                            int i16 = i13 - i11;
                            if (i15 > i16) {
                                this.f35377b = i16;
                            }
                        }
                    }
                    this.f35379e = true;
                    int i17 = this.f35377b;
                    this.f35378c = i17;
                    this.d = (int) (f10 - i17);
                    return true;
                }
            }
        } else if (i7 != 1 && i7 != 3) {
            if (i7 == 2 && this.f35379e) {
                int i18 = (int) (f10 - this.d);
                this.f35378c = i18;
                if (i18 < 0) {
                    this.f35378c = 0;
                } else {
                    int i19 = this.f35380f - E;
                    if (i18 > i19) {
                        this.f35378c = i19;
                    }
                }
                jm0 jm0Var2 = this.h;
                if (jm0Var2 != null) {
                    jm0Var2.d(this.f35378c / (this.f35380f - E));
                }
                return true;
            }
        } else if (this.f35379e) {
            int i20 = this.f35378c;
            this.f35377b = i20;
            if (i7 == 1 && (jm0Var = this.h) != null) {
                jm0Var.a(i20 / (this.f35380f - E));
            }
            this.f35379e = false;
            return true;
        }
        return false;
    }

    public final void f(float f10) {
        this.f35393t = f10;
    }

    public final void g(int i7, int i10, int i11, int i12, int i13) {
        this.f35382i = i7;
        this.f35383j = i10;
        this.f35384k = i12;
        this.f35385l = i11;
        this.f35386m = i13;
    }

    public final void h(float f10) {
        this.f35376a = f10;
        int ceil = (int) Math.ceil((this.f35380f - E) * f10);
        this.f35377b = ceil;
        if (ceil < 0) {
            this.f35377b = 0;
            return;
        }
        int i7 = this.f35380f;
        int i10 = E;
        if (ceil > i7 - i10) {
            this.f35377b = i7 - i10;
        }
    }

    public final void i(int i7, int i10) {
        if (this.f35380f == i7 && this.f35381g == i10) {
            return;
        }
        this.f35380f = i7;
        this.f35381g = i10;
        h(this.f35376a);
    }

    public final void j(org.telegram.messenger.ij ijVar) {
        Integer z9;
        String str;
        if (ijVar == null) {
            a();
            return;
        }
        Long valueOf = Long.valueOf(((long) ijVar.L0()) * 1000);
        if (valueOf.longValue() < 0) {
            a();
            return;
        }
        CharSequence charSequence = ijVar.f23318z;
        if (ijVar.e5()) {
            if (ijVar.B == null && (str = ijVar.f23262k.media.webpage.description) != null) {
                ijVar.B = SpannableString.valueOf(str);
                org.telegram.messenger.ij.h(ijVar.N3(), ijVar.B, false, 3, (int) valueOf.longValue(), false);
            }
            charSequence = ijVar.B;
        }
        if (charSequence != this.v || this.f35395w != valueOf.longValue()) {
            this.v = charSequence;
            this.f35395w = valueOf.longValue();
            if (!(charSequence instanceof Spanned)) {
                this.f35394u = null;
                this.f35397y = -1;
                this.f35396x = 0.0f;
                StaticLayout[] staticLayoutArr = this.f35398z;
                if (staticLayoutArr != null) {
                    staticLayoutArr[1] = null;
                    staticLayoutArr[0] = null;
                    return;
                }
                return;
            }
            Spanned spanned = (Spanned) charSequence;
            try {
                c41[] c41VarArr = (c41[]) spanned.getSpans(0, spanned.length(), c41.class);
                this.f35394u = new ArrayList();
                this.f35396x = 0.0f;
                if (this.A == null) {
                    TextPaint textPaint = new TextPaint(1);
                    this.A = textPaint;
                    textPaint.setTextSize(org.telegram.messenger.g0.L(12.0f));
                    this.A.setColor(-1);
                }
                for (c41 c41Var : c41VarArr) {
                    try {
                        if (c41Var != null && c41Var.getURL() != null && c41Var.d != null && c41Var.getURL().startsWith("audio?")) {
                            if (Utilities.z(c41Var.getURL().substring(6)).intValue() >= 0) {
                                float intValue = ((float) (z9.intValue() * 1000)) / ((float) valueOf.longValue());
                                org.telegram.messenger.i6.l(new SpannableStringBuilder(c41Var.d), this.A.getFontMetricsInt(), false);
                                this.f35394u.add(new Pair(Float.valueOf(intValue), c41Var));
                            }
                        }
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                    }
                }
                Collections.sort(this.f35394u, new org.telegram.ui.oe(14));
            } catch (Exception e11) {
                org.telegram.messenger.a8.g(e11, true);
                this.f35394u = null;
                this.f35397y = -1;
                this.f35396x = 0.0f;
                StaticLayout[] staticLayoutArr2 = this.f35398z;
                if (staticLayoutArr2 != null) {
                    staticLayoutArr2[1] = null;
                    staticLayoutArr2[0] = null;
                }
            }
        }
    }

    public void d(c41 c41Var) {
    }
}
