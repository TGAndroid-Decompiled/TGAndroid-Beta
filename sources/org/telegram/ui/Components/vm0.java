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
public class vm0 {
    public static Paint D;
    public static int E;
    public static float[] F;
    public static Path G;
    public TextPaint A;
    public long C;
    public float f40707a;
    public int f40711f;
    public int f40712g;
    public um0 h;
    public int f40713i;
    public int f40714j;
    public int f40715k;
    public int f40716l;
    public int f40717m;
    public boolean f40720p;
    public float f40721q;
    public float f40722r;
    public View f40723s;
    public ArrayList f40725u;
    public CharSequence v;
    public long f40726w;
    public StaticLayout[] f40729z;
    public int f40708b = 0;
    public int f40709c = 0;
    public int d = 0;
    public boolean f40710e = false;
    public final RectF f40718n = new RectF();
    public final int f40719o = org.telegram.messenger.g0.L(2.0f);
    public float f40724t = 1.0f;
    public float f40727x = 0.0f;
    public int f40728y = -1;
    public float B = 1.0f;

    public vm0(View view) {
        if (D == null) {
            D = new Paint(1);
        }
        this.f40723s = view;
        E = org.telegram.messenger.g0.L(24.0f);
        this.f40722r = org.telegram.messenger.g0.L(6.0f);
    }

    public final void a() {
        this.f40725u = null;
        this.f40728y = -1;
        this.f40727x = 0.0f;
        StaticLayout[] staticLayoutArr = this.f40729z;
        if (staticLayoutArr != null) {
            staticLayoutArr[1] = null;
            staticLayoutArr[0] = null;
        }
        this.v = null;
        this.f40726w = -1L;
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
        float f12 = this.f40724t;
        if (f12 > 0.0f) {
            if (f12 < 1.0f) {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, this.f40711f, this.f40712g, (int) (f12 * 255.0f), 31);
            } else {
                canvas2 = canvas;
            }
            int i17 = E / 2;
            int i18 = this.f40712g / 2;
            int i19 = this.f40719o / 2;
            RectF rectF = this.f40718n;
            rectF.set(i17, i18 - i19, this.f40711f - i17, i18 + i19);
            Paint paint = D;
            if (this.f40720p) {
                i7 = this.f40717m;
            } else {
                i7 = this.f40713i;
            }
            paint.setColor(i7);
            c(canvas2, rectF, D);
            if (this.f40721q > 0.0f) {
                Paint paint2 = D;
                if (this.f40720p) {
                    i15 = this.f40717m;
                } else {
                    i15 = this.f40714j;
                }
                paint2.setColor(i15);
                float f13 = E / 2;
                int i20 = this.f40712g / 2;
                rectF.set(f13, i20 - i19, (this.f40721q * (this.f40711f - i16)) + f13, i20 + i19);
                c(canvas2, rectF, D);
            }
            float f14 = E / 2;
            float f15 = (this.f40712g / 2) - i19;
            if (this.f40710e) {
                i12 = this.f40709c;
            } else {
                i12 = this.f40708b;
            }
            rectF.set(f14, f15, i10 + i12, i19 + i11);
            D.setColor(this.f40716l);
            c(canvas2, rectF, D);
            D.setColor(this.f40715k);
            if (this.f40710e) {
                f10 = 8.0f;
            } else {
                f10 = 6.0f;
            }
            float L = org.telegram.messenger.g0.L(f10);
            if (this.f40722r != L) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (elapsedRealtime > 18) {
                    elapsedRealtime = 16;
                }
                float f16 = this.f40722r;
                if (f16 < L) {
                    float c10 = com.google.android.gms.internal.vision.e2.c((float) elapsedRealtime, 60.0f, org.telegram.messenger.g0.L(1.0f), f16);
                    this.f40722r = c10;
                    if (c10 > L) {
                        this.f40722r = L;
                    }
                } else {
                    float w10 = org.telegram.messenger.n10.w((float) elapsedRealtime, 60.0f, org.telegram.messenger.g0.L(1.0f), f16);
                    this.f40722r = w10;
                    if (w10 < L) {
                        this.f40722r = L;
                    }
                }
                View view = this.f40723s;
                if (view != null) {
                    view.invalidate();
                }
            }
            if (this.f40710e) {
                i13 = this.f40709c;
            } else {
                i13 = this.f40708b;
            }
            canvas2.drawCircle((E / 2) + i13, this.f40712g / 2, this.f40722r, D);
            if (this.f40724t < 1.0f) {
                canvas2.restore();
            }
            ArrayList arrayList = this.f40725u;
            if (arrayList != null && !arrayList.isEmpty()) {
                if (this.f40710e) {
                    i14 = this.f40709c;
                } else {
                    i14 = this.f40708b;
                }
                float f17 = i14 / (this.f40711f - E);
                int size = this.f40725u.size() - 1;
                while (true) {
                    if (size >= 0) {
                        if (((Float) ((Pair) this.f40725u.get(size)).first).floatValue() - 0.001f <= f17) {
                            break;
                        }
                        size--;
                    } else {
                        size = -1;
                        break;
                    }
                }
                if (this.f40729z == null) {
                    this.f40729z = new StaticLayout[2];
                }
                float f18 = E / 2.0f;
                Math.abs(f18 - (this.f40711f - f18));
                org.telegram.messenger.g0.L(66.0f);
                if (size != this.f40728y) {
                    if (this.f40710e) {
                        org.telegram.messenger.g0.a4(this.f40723s);
                    }
                    this.f40728y = size;
                    if (size >= 0 && size < this.f40725u.size()) {
                        d((p41) ((Pair) this.f40725u.get(this.f40728y)).second);
                    }
                }
                if (this.B < 1.0f) {
                    long min = Math.min(17L, Math.abs(SystemClock.elapsedRealtime() - this.C));
                    if (this.f40725u.size() > 8) {
                        f11 = 160.0f;
                    } else {
                        f11 = 220.0f;
                    }
                    this.B = Math.min((((float) min) / f11) + this.B, 1.0f);
                    View view2 = this.f40723s;
                    if (view2 != null) {
                        view2.invalidate();
                    }
                    this.C = SystemClock.elapsedRealtime();
                }
                if (this.f40727x < 1.0f) {
                    this.f40727x = Math.min((((float) Math.min(17L, Math.abs(SystemClock.elapsedRealtime() - this.C))) / 200.0f) + this.f40727x, 1.0f);
                    View view3 = this.f40723s;
                    if (view3 != null) {
                        view3.invalidate();
                    }
                    SystemClock.elapsedRealtime();
                }
            }
        }
    }

    public final void c(android.graphics.Canvas r26, android.graphics.RectF r27, android.graphics.Paint r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.vm0.c(android.graphics.Canvas, android.graphics.RectF, android.graphics.Paint):void");
    }

    public final boolean e(float f10, float f11, int i7) {
        um0 um0Var;
        if (i7 == 0) {
            int i10 = this.f40712g;
            int i11 = E;
            int i12 = (i10 - i11) / 2;
            if (f10 >= (-i12)) {
                int i13 = this.f40711f;
                if (f10 <= i13 + i12 && f11 >= 0.0f && f11 <= i10) {
                    int i14 = this.f40708b;
                    if (i14 - i12 > f10 || f10 > i14 + i11 + i12) {
                        int i15 = ((int) f10) - (i11 / 2);
                        this.f40708b = i15;
                        if (i15 < 0) {
                            this.f40708b = 0;
                        } else {
                            int i16 = i13 - i11;
                            if (i15 > i16) {
                                this.f40708b = i16;
                            }
                        }
                    }
                    this.f40710e = true;
                    int i17 = this.f40708b;
                    this.f40709c = i17;
                    this.d = (int) (f10 - i17);
                    return true;
                }
            }
        } else if (i7 != 1 && i7 != 3) {
            if (i7 == 2 && this.f40710e) {
                int i18 = (int) (f10 - this.d);
                this.f40709c = i18;
                if (i18 < 0) {
                    this.f40709c = 0;
                } else {
                    int i19 = this.f40711f - E;
                    if (i18 > i19) {
                        this.f40709c = i19;
                    }
                }
                um0 um0Var2 = this.h;
                if (um0Var2 != null) {
                    um0Var2.g(this.f40709c / (this.f40711f - E));
                }
                return true;
            }
        } else if (this.f40710e) {
            int i20 = this.f40709c;
            this.f40708b = i20;
            if (i7 == 1 && (um0Var = this.h) != null) {
                um0Var.a(i20 / (this.f40711f - E));
            }
            this.f40710e = false;
            return true;
        }
        return false;
    }

    public final void f(float f10) {
        this.f40724t = f10;
    }

    public final void g(int i7, int i10, int i11, int i12, int i13) {
        this.f40713i = i7;
        this.f40714j = i10;
        this.f40715k = i12;
        this.f40716l = i11;
        this.f40717m = i13;
    }

    public final void h(float f10) {
        this.f40707a = f10;
        int ceil = (int) Math.ceil((this.f40711f - E) * f10);
        this.f40708b = ceil;
        if (ceil < 0) {
            this.f40708b = 0;
            return;
        }
        int i7 = this.f40711f;
        int i10 = E;
        if (ceil > i7 - i10) {
            this.f40708b = i7 - i10;
        }
    }

    public final void i(int i7, int i10) {
        if (this.f40711f == i7 && this.f40712g == i10) {
            return;
        }
        this.f40711f = i7;
        this.f40712g = i10;
        h(this.f40707a);
    }

    public final void j(org.telegram.messenger.fj fjVar) {
        Integer z10;
        String str;
        if (fjVar == null) {
            a();
            return;
        }
        Long valueOf = Long.valueOf(((long) fjVar.L0()) * 1000);
        if (valueOf.longValue() < 0) {
            a();
            return;
        }
        CharSequence charSequence = fjVar.f24026z;
        if (fjVar.e5()) {
            if (fjVar.B == null && (str = fjVar.f23968k.media.webpage.description) != null) {
                fjVar.B = SpannableString.valueOf(str);
                org.telegram.messenger.fj.h(fjVar.N3(), fjVar.B, false, 3, (int) valueOf.longValue(), false);
            }
            charSequence = fjVar.B;
        }
        if (charSequence != this.v || this.f40726w != valueOf.longValue()) {
            this.v = charSequence;
            this.f40726w = valueOf.longValue();
            if (!(charSequence instanceof Spanned)) {
                this.f40725u = null;
                this.f40728y = -1;
                this.f40727x = 0.0f;
                StaticLayout[] staticLayoutArr = this.f40729z;
                if (staticLayoutArr != null) {
                    staticLayoutArr[1] = null;
                    staticLayoutArr[0] = null;
                    return;
                }
                return;
            }
            Spanned spanned = (Spanned) charSequence;
            try {
                p41[] p41VarArr = (p41[]) spanned.getSpans(0, spanned.length(), p41.class);
                this.f40725u = new ArrayList();
                this.f40727x = 0.0f;
                if (this.A == null) {
                    TextPaint textPaint = new TextPaint(1);
                    this.A = textPaint;
                    textPaint.setTextSize(org.telegram.messenger.g0.L(12.0f));
                    this.A.setColor(-1);
                }
                for (p41 p41Var : p41VarArr) {
                    try {
                        if (p41Var != null && p41Var.getURL() != null && p41Var.d != null && p41Var.getURL().startsWith("audio?")) {
                            if (Utilities.z(p41Var.getURL().substring(6)).intValue() >= 0) {
                                float intValue = ((float) (z10.intValue() * 1000)) / ((float) valueOf.longValue());
                                org.telegram.messenger.j6.l(new SpannableStringBuilder(p41Var.d), this.A.getFontMetricsInt(), false);
                                this.f40725u.add(new Pair(Float.valueOf(intValue), p41Var));
                            }
                        }
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                    }
                }
                Collections.sort(this.f40725u, new org.telegram.ui.pe(13));
            } catch (Exception e11) {
                org.telegram.messenger.a8.g(e11, true);
                this.f40725u = null;
                this.f40728y = -1;
                this.f40727x = 0.0f;
                StaticLayout[] staticLayoutArr2 = this.f40729z;
                if (staticLayoutArr2 != null) {
                    staticLayoutArr2[1] = null;
                    staticLayoutArr2[0] = null;
                }
            }
        }
    }

    public void d(p41 p41Var) {
    }
}
