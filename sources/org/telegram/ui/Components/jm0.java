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
public class jm0 {
    public static Paint D;
    public static int E;
    public static float[] F;
    public static Path G;
    public TextPaint A;
    public long C;
    public float f34973a;
    public int f34977f;
    public int f34978g;
    public im0 h;
    public int f34979i;
    public int f34980j;
    public int f34981k;
    public int f34982l;
    public int f34983m;
    public boolean f34986p;
    public float f34987q;
    public float f34988r;
    public View f34989s;
    public ArrayList f34991u;
    public CharSequence v;
    public long f34992w;
    public StaticLayout[] f34995z;
    public int f34974b = 0;
    public int f34975c = 0;
    public int d = 0;
    public boolean f34976e = false;
    public final RectF f34984n = new RectF();
    public final int f34985o = org.telegram.messenger.g0.L(2.0f);
    public float f34990t = 1.0f;
    public float f34993x = 0.0f;
    public int f34994y = -1;
    public float B = 1.0f;

    public jm0(View view) {
        if (D == null) {
            D = new Paint(1);
        }
        this.f34989s = view;
        E = org.telegram.messenger.g0.L(24.0f);
        this.f34988r = org.telegram.messenger.g0.L(6.0f);
    }

    public final void a() {
        this.f34991u = null;
        this.f34994y = -1;
        this.f34993x = 0.0f;
        StaticLayout[] staticLayoutArr = this.f34995z;
        if (staticLayoutArr != null) {
            staticLayoutArr[1] = null;
            staticLayoutArr[0] = null;
        }
        this.v = null;
        this.f34992w = -1L;
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
        float f12 = this.f34990t;
        if (f12 > 0.0f) {
            if (f12 < 1.0f) {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, this.f34977f, this.f34978g, (int) (f12 * 255.0f), 31);
            } else {
                canvas2 = canvas;
            }
            int i17 = E / 2;
            int i18 = this.f34978g / 2;
            int i19 = this.f34985o / 2;
            RectF rectF = this.f34984n;
            rectF.set(i17, i18 - i19, this.f34977f - i17, i18 + i19);
            Paint paint = D;
            if (this.f34986p) {
                i7 = this.f34983m;
            } else {
                i7 = this.f34979i;
            }
            paint.setColor(i7);
            c(canvas2, rectF, D);
            if (this.f34987q > 0.0f) {
                Paint paint2 = D;
                if (this.f34986p) {
                    i15 = this.f34983m;
                } else {
                    i15 = this.f34980j;
                }
                paint2.setColor(i15);
                float f13 = E / 2;
                int i20 = this.f34978g / 2;
                rectF.set(f13, i20 - i19, (this.f34987q * (this.f34977f - i16)) + f13, i20 + i19);
                c(canvas2, rectF, D);
            }
            float f14 = E / 2;
            float f15 = (this.f34978g / 2) - i19;
            if (this.f34976e) {
                i12 = this.f34975c;
            } else {
                i12 = this.f34974b;
            }
            rectF.set(f14, f15, i10 + i12, i19 + i11);
            D.setColor(this.f34982l);
            c(canvas2, rectF, D);
            D.setColor(this.f34981k);
            if (this.f34976e) {
                f10 = 8.0f;
            } else {
                f10 = 6.0f;
            }
            float L = org.telegram.messenger.g0.L(f10);
            if (this.f34988r != L) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (elapsedRealtime > 18) {
                    elapsedRealtime = 16;
                }
                float f16 = this.f34988r;
                if (f16 < L) {
                    float c10 = com.google.android.recaptcha.internal.a.c((float) elapsedRealtime, 60.0f, org.telegram.messenger.g0.L(1.0f), f16);
                    this.f34988r = c10;
                    if (c10 > L) {
                        this.f34988r = L;
                    }
                } else {
                    float v = org.telegram.messenger.camera.q.v((float) elapsedRealtime, 60.0f, org.telegram.messenger.g0.L(1.0f), f16);
                    this.f34988r = v;
                    if (v < L) {
                        this.f34988r = L;
                    }
                }
                View view = this.f34989s;
                if (view != null) {
                    view.invalidate();
                }
            }
            if (this.f34976e) {
                i13 = this.f34975c;
            } else {
                i13 = this.f34974b;
            }
            canvas2.drawCircle((E / 2) + i13, this.f34978g / 2, this.f34988r, D);
            if (this.f34990t < 1.0f) {
                canvas2.restore();
            }
            ArrayList arrayList = this.f34991u;
            if (arrayList != null && !arrayList.isEmpty()) {
                if (this.f34976e) {
                    i14 = this.f34975c;
                } else {
                    i14 = this.f34974b;
                }
                float f17 = i14 / (this.f34977f - E);
                int size = this.f34991u.size() - 1;
                while (true) {
                    if (size >= 0) {
                        if (((Float) ((Pair) this.f34991u.get(size)).first).floatValue() - 0.001f <= f17) {
                            break;
                        }
                        size--;
                    } else {
                        size = -1;
                        break;
                    }
                }
                if (this.f34995z == null) {
                    this.f34995z = new StaticLayout[2];
                }
                float f18 = E / 2.0f;
                Math.abs(f18 - (this.f34977f - f18));
                org.telegram.messenger.g0.L(66.0f);
                if (size != this.f34994y) {
                    if (this.f34976e) {
                        org.telegram.messenger.g0.c4(this.f34989s);
                    }
                    this.f34994y = size;
                    if (size >= 0 && size < this.f34991u.size()) {
                        d((a41) ((Pair) this.f34991u.get(this.f34994y)).second);
                    }
                }
                if (this.B < 1.0f) {
                    long min = Math.min(17L, Math.abs(SystemClock.elapsedRealtime() - this.C));
                    if (this.f34991u.size() > 8) {
                        f11 = 160.0f;
                    } else {
                        f11 = 220.0f;
                    }
                    this.B = Math.min((((float) min) / f11) + this.B, 1.0f);
                    View view2 = this.f34989s;
                    if (view2 != null) {
                        view2.invalidate();
                    }
                    this.C = SystemClock.elapsedRealtime();
                }
                if (this.f34993x < 1.0f) {
                    this.f34993x = Math.min((((float) Math.min(17L, Math.abs(SystemClock.elapsedRealtime() - this.C))) / 200.0f) + this.f34993x, 1.0f);
                    View view3 = this.f34989s;
                    if (view3 != null) {
                        view3.invalidate();
                    }
                    SystemClock.elapsedRealtime();
                }
            }
        }
    }

    public final void c(android.graphics.Canvas r26, android.graphics.RectF r27, android.graphics.Paint r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.jm0.c(android.graphics.Canvas, android.graphics.RectF, android.graphics.Paint):void");
    }

    public final boolean e(float f10, float f11, int i7) {
        im0 im0Var;
        if (i7 == 0) {
            int i10 = this.f34978g;
            int i11 = E;
            int i12 = (i10 - i11) / 2;
            if (f10 >= (-i12)) {
                int i13 = this.f34977f;
                if (f10 <= i13 + i12 && f11 >= 0.0f && f11 <= i10) {
                    int i14 = this.f34974b;
                    if (i14 - i12 > f10 || f10 > i14 + i11 + i12) {
                        int i15 = ((int) f10) - (i11 / 2);
                        this.f34974b = i15;
                        if (i15 < 0) {
                            this.f34974b = 0;
                        } else {
                            int i16 = i13 - i11;
                            if (i15 > i16) {
                                this.f34974b = i16;
                            }
                        }
                    }
                    this.f34976e = true;
                    int i17 = this.f34974b;
                    this.f34975c = i17;
                    this.d = (int) (f10 - i17);
                    return true;
                }
            }
        } else if (i7 != 1 && i7 != 3) {
            if (i7 == 2 && this.f34976e) {
                int i18 = (int) (f10 - this.d);
                this.f34975c = i18;
                if (i18 < 0) {
                    this.f34975c = 0;
                } else {
                    int i19 = this.f34977f - E;
                    if (i18 > i19) {
                        this.f34975c = i19;
                    }
                }
                im0 im0Var2 = this.h;
                if (im0Var2 != null) {
                    im0Var2.d(this.f34975c / (this.f34977f - E));
                }
                return true;
            }
        } else if (this.f34976e) {
            int i20 = this.f34975c;
            this.f34974b = i20;
            if (i7 == 1 && (im0Var = this.h) != null) {
                im0Var.a(i20 / (this.f34977f - E));
            }
            this.f34976e = false;
            return true;
        }
        return false;
    }

    public final void f(float f10) {
        this.f34990t = f10;
    }

    public final void g(int i7, int i10, int i11, int i12, int i13) {
        this.f34979i = i7;
        this.f34980j = i10;
        this.f34981k = i12;
        this.f34982l = i11;
        this.f34983m = i13;
    }

    public final void h(float f10) {
        this.f34973a = f10;
        int ceil = (int) Math.ceil((this.f34977f - E) * f10);
        this.f34974b = ceil;
        if (ceil < 0) {
            this.f34974b = 0;
            return;
        }
        int i7 = this.f34977f;
        int i10 = E;
        if (ceil > i7 - i10) {
            this.f34974b = i7 - i10;
        }
    }

    public final void i(int i7, int i10) {
        if (this.f34977f == i7 && this.f34978g == i10) {
            return;
        }
        this.f34977f = i7;
        this.f34978g = i10;
        h(this.f34973a);
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
        CharSequence charSequence = ijVar.f23293z;
        if (ijVar.f5()) {
            if (ijVar.B == null && (str = ijVar.f23237k.media.webpage.description) != null) {
                ijVar.B = SpannableString.valueOf(str);
                org.telegram.messenger.ij.h(ijVar.O3(), ijVar.B, false, 3, (int) valueOf.longValue(), false);
            }
            charSequence = ijVar.B;
        }
        if (charSequence != this.v || this.f34992w != valueOf.longValue()) {
            this.v = charSequence;
            this.f34992w = valueOf.longValue();
            if (!(charSequence instanceof Spanned)) {
                this.f34991u = null;
                this.f34994y = -1;
                this.f34993x = 0.0f;
                StaticLayout[] staticLayoutArr = this.f34995z;
                if (staticLayoutArr != null) {
                    staticLayoutArr[1] = null;
                    staticLayoutArr[0] = null;
                    return;
                }
                return;
            }
            Spanned spanned = (Spanned) charSequence;
            try {
                a41[] a41VarArr = (a41[]) spanned.getSpans(0, spanned.length(), a41.class);
                this.f34991u = new ArrayList();
                this.f34993x = 0.0f;
                if (this.A == null) {
                    TextPaint textPaint = new TextPaint(1);
                    this.A = textPaint;
                    textPaint.setTextSize(org.telegram.messenger.g0.L(12.0f));
                    this.A.setColor(-1);
                }
                for (a41 a41Var : a41VarArr) {
                    try {
                        if (a41Var != null && a41Var.getURL() != null && a41Var.d != null && a41Var.getURL().startsWith("audio?")) {
                            if (Utilities.z(a41Var.getURL().substring(6)).intValue() >= 0) {
                                float intValue = ((float) (z9.intValue() * 1000)) / ((float) valueOf.longValue());
                                org.telegram.messenger.i6.l(new SpannableStringBuilder(a41Var.d), this.A.getFontMetricsInt(), false);
                                this.f34991u.add(new Pair(Float.valueOf(intValue), a41Var));
                            }
                        }
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                    }
                }
                Collections.sort(this.f34991u, new org.telegram.ui.oe(14));
            } catch (Exception e11) {
                org.telegram.messenger.a8.g(e11, true);
                this.f34991u = null;
                this.f34994y = -1;
                this.f34993x = 0.0f;
                StaticLayout[] staticLayoutArr2 = this.f34995z;
                if (staticLayoutArr2 != null) {
                    staticLayoutArr2[1] = null;
                    staticLayoutArr2[0] = null;
                }
            }
        }
    }

    public void d(a41 a41Var) {
    }
}
