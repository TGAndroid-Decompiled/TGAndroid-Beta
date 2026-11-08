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
    public float f35020a;
    public int f35024f;
    public int f35025g;
    public im0 h;
    public int f35026i;
    public int f35027j;
    public int f35028k;
    public int f35029l;
    public int f35030m;
    public boolean f35033p;
    public float f35034q;
    public float f35035r;
    public View f35036s;
    public ArrayList f35038u;
    public CharSequence v;
    public long f35039w;
    public StaticLayout[] f35042z;
    public int f35021b = 0;
    public int f35022c = 0;
    public int d = 0;
    public boolean f35023e = false;
    public final RectF f35031n = new RectF();
    public final int f35032o = org.telegram.messenger.g0.L(2.0f);
    public float f35037t = 1.0f;
    public float f35040x = 0.0f;
    public int f35041y = -1;
    public float B = 1.0f;

    public jm0(View view) {
        if (D == null) {
            D = new Paint(1);
        }
        this.f35036s = view;
        E = org.telegram.messenger.g0.L(24.0f);
        this.f35035r = org.telegram.messenger.g0.L(6.0f);
    }

    public final void a() {
        this.f35038u = null;
        this.f35041y = -1;
        this.f35040x = 0.0f;
        StaticLayout[] staticLayoutArr = this.f35042z;
        if (staticLayoutArr != null) {
            staticLayoutArr[1] = null;
            staticLayoutArr[0] = null;
        }
        this.v = null;
        this.f35039w = -1L;
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
        float f12 = this.f35037t;
        if (f12 > 0.0f) {
            if (f12 < 1.0f) {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, this.f35024f, this.f35025g, (int) (f12 * 255.0f), 31);
            } else {
                canvas2 = canvas;
            }
            int i17 = E / 2;
            int i18 = this.f35025g / 2;
            int i19 = this.f35032o / 2;
            RectF rectF = this.f35031n;
            rectF.set(i17, i18 - i19, this.f35024f - i17, i18 + i19);
            Paint paint = D;
            if (this.f35033p) {
                i7 = this.f35030m;
            } else {
                i7 = this.f35026i;
            }
            paint.setColor(i7);
            c(canvas2, rectF, D);
            if (this.f35034q > 0.0f) {
                Paint paint2 = D;
                if (this.f35033p) {
                    i15 = this.f35030m;
                } else {
                    i15 = this.f35027j;
                }
                paint2.setColor(i15);
                float f13 = E / 2;
                int i20 = this.f35025g / 2;
                rectF.set(f13, i20 - i19, (this.f35034q * (this.f35024f - i16)) + f13, i20 + i19);
                c(canvas2, rectF, D);
            }
            float f14 = E / 2;
            float f15 = (this.f35025g / 2) - i19;
            if (this.f35023e) {
                i12 = this.f35022c;
            } else {
                i12 = this.f35021b;
            }
            rectF.set(f14, f15, i10 + i12, i19 + i11);
            D.setColor(this.f35029l);
            c(canvas2, rectF, D);
            D.setColor(this.f35028k);
            if (this.f35023e) {
                f10 = 8.0f;
            } else {
                f10 = 6.0f;
            }
            float L = org.telegram.messenger.g0.L(f10);
            if (this.f35035r != L) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (elapsedRealtime > 18) {
                    elapsedRealtime = 16;
                }
                float f16 = this.f35035r;
                if (f16 < L) {
                    float c10 = com.google.android.recaptcha.internal.a.c((float) elapsedRealtime, 60.0f, org.telegram.messenger.g0.L(1.0f), f16);
                    this.f35035r = c10;
                    if (c10 > L) {
                        this.f35035r = L;
                    }
                } else {
                    float v = org.telegram.messenger.camera.q.v((float) elapsedRealtime, 60.0f, org.telegram.messenger.g0.L(1.0f), f16);
                    this.f35035r = v;
                    if (v < L) {
                        this.f35035r = L;
                    }
                }
                View view = this.f35036s;
                if (view != null) {
                    view.invalidate();
                }
            }
            if (this.f35023e) {
                i13 = this.f35022c;
            } else {
                i13 = this.f35021b;
            }
            canvas2.drawCircle((E / 2) + i13, this.f35025g / 2, this.f35035r, D);
            if (this.f35037t < 1.0f) {
                canvas2.restore();
            }
            ArrayList arrayList = this.f35038u;
            if (arrayList != null && !arrayList.isEmpty()) {
                if (this.f35023e) {
                    i14 = this.f35022c;
                } else {
                    i14 = this.f35021b;
                }
                float f17 = i14 / (this.f35024f - E);
                int size = this.f35038u.size() - 1;
                while (true) {
                    if (size >= 0) {
                        if (((Float) ((Pair) this.f35038u.get(size)).first).floatValue() - 0.001f <= f17) {
                            break;
                        }
                        size--;
                    } else {
                        size = -1;
                        break;
                    }
                }
                if (this.f35042z == null) {
                    this.f35042z = new StaticLayout[2];
                }
                float f18 = E / 2.0f;
                Math.abs(f18 - (this.f35024f - f18));
                org.telegram.messenger.g0.L(66.0f);
                if (size != this.f35041y) {
                    if (this.f35023e) {
                        org.telegram.messenger.g0.c4(this.f35036s);
                    }
                    this.f35041y = size;
                    if (size >= 0 && size < this.f35038u.size()) {
                        d((b41) ((Pair) this.f35038u.get(this.f35041y)).second);
                    }
                }
                if (this.B < 1.0f) {
                    long min = Math.min(17L, Math.abs(SystemClock.elapsedRealtime() - this.C));
                    if (this.f35038u.size() > 8) {
                        f11 = 160.0f;
                    } else {
                        f11 = 220.0f;
                    }
                    this.B = Math.min((((float) min) / f11) + this.B, 1.0f);
                    View view2 = this.f35036s;
                    if (view2 != null) {
                        view2.invalidate();
                    }
                    this.C = SystemClock.elapsedRealtime();
                }
                if (this.f35040x < 1.0f) {
                    this.f35040x = Math.min((((float) Math.min(17L, Math.abs(SystemClock.elapsedRealtime() - this.C))) / 200.0f) + this.f35040x, 1.0f);
                    View view3 = this.f35036s;
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
            int i10 = this.f35025g;
            int i11 = E;
            int i12 = (i10 - i11) / 2;
            if (f10 >= (-i12)) {
                int i13 = this.f35024f;
                if (f10 <= i13 + i12 && f11 >= 0.0f && f11 <= i10) {
                    int i14 = this.f35021b;
                    if (i14 - i12 > f10 || f10 > i14 + i11 + i12) {
                        int i15 = ((int) f10) - (i11 / 2);
                        this.f35021b = i15;
                        if (i15 < 0) {
                            this.f35021b = 0;
                        } else {
                            int i16 = i13 - i11;
                            if (i15 > i16) {
                                this.f35021b = i16;
                            }
                        }
                    }
                    this.f35023e = true;
                    int i17 = this.f35021b;
                    this.f35022c = i17;
                    this.d = (int) (f10 - i17);
                    return true;
                }
            }
        } else if (i7 != 1 && i7 != 3) {
            if (i7 == 2 && this.f35023e) {
                int i18 = (int) (f10 - this.d);
                this.f35022c = i18;
                if (i18 < 0) {
                    this.f35022c = 0;
                } else {
                    int i19 = this.f35024f - E;
                    if (i18 > i19) {
                        this.f35022c = i19;
                    }
                }
                im0 im0Var2 = this.h;
                if (im0Var2 != null) {
                    im0Var2.d(this.f35022c / (this.f35024f - E));
                }
                return true;
            }
        } else if (this.f35023e) {
            int i20 = this.f35022c;
            this.f35021b = i20;
            if (i7 == 1 && (im0Var = this.h) != null) {
                im0Var.a(i20 / (this.f35024f - E));
            }
            this.f35023e = false;
            return true;
        }
        return false;
    }

    public final void f(float f10) {
        this.f35037t = f10;
    }

    public final void g(int i7, int i10, int i11, int i12, int i13) {
        this.f35026i = i7;
        this.f35027j = i10;
        this.f35028k = i12;
        this.f35029l = i11;
        this.f35030m = i13;
    }

    public final void h(float f10) {
        this.f35020a = f10;
        int ceil = (int) Math.ceil((this.f35024f - E) * f10);
        this.f35021b = ceil;
        if (ceil < 0) {
            this.f35021b = 0;
            return;
        }
        int i7 = this.f35024f;
        int i10 = E;
        if (ceil > i7 - i10) {
            this.f35021b = i7 - i10;
        }
    }

    public final void i(int i7, int i10) {
        if (this.f35024f == i7 && this.f35025g == i10) {
            return;
        }
        this.f35024f = i7;
        this.f35025g = i10;
        h(this.f35020a);
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
        if (ijVar.f5()) {
            if (ijVar.B == null && (str = ijVar.f23262k.media.webpage.description) != null) {
                ijVar.B = SpannableString.valueOf(str);
                org.telegram.messenger.ij.h(ijVar.O3(), ijVar.B, false, 3, (int) valueOf.longValue(), false);
            }
            charSequence = ijVar.B;
        }
        if (charSequence != this.v || this.f35039w != valueOf.longValue()) {
            this.v = charSequence;
            this.f35039w = valueOf.longValue();
            if (!(charSequence instanceof Spanned)) {
                this.f35038u = null;
                this.f35041y = -1;
                this.f35040x = 0.0f;
                StaticLayout[] staticLayoutArr = this.f35042z;
                if (staticLayoutArr != null) {
                    staticLayoutArr[1] = null;
                    staticLayoutArr[0] = null;
                    return;
                }
                return;
            }
            Spanned spanned = (Spanned) charSequence;
            try {
                b41[] b41VarArr = (b41[]) spanned.getSpans(0, spanned.length(), b41.class);
                this.f35038u = new ArrayList();
                this.f35040x = 0.0f;
                if (this.A == null) {
                    TextPaint textPaint = new TextPaint(1);
                    this.A = textPaint;
                    textPaint.setTextSize(org.telegram.messenger.g0.L(12.0f));
                    this.A.setColor(-1);
                }
                for (b41 b41Var : b41VarArr) {
                    try {
                        if (b41Var != null && b41Var.getURL() != null && b41Var.d != null && b41Var.getURL().startsWith("audio?")) {
                            if (Utilities.z(b41Var.getURL().substring(6)).intValue() >= 0) {
                                float intValue = ((float) (z9.intValue() * 1000)) / ((float) valueOf.longValue());
                                org.telegram.messenger.i6.l(new SpannableStringBuilder(b41Var.d), this.A.getFontMetricsInt(), false);
                                this.f35038u.add(new Pair(Float.valueOf(intValue), b41Var));
                            }
                        }
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                    }
                }
                Collections.sort(this.f35038u, new org.telegram.ui.oe(14));
            } catch (Exception e11) {
                org.telegram.messenger.a8.g(e11, true);
                this.f35038u = null;
                this.f35041y = -1;
                this.f35040x = 0.0f;
                StaticLayout[] staticLayoutArr2 = this.f35042z;
                if (staticLayoutArr2 != null) {
                    staticLayoutArr2[1] = null;
                    staticLayoutArr2[0] = null;
                }
            }
        }
    }

    public void d(b41 b41Var) {
    }
}
