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
    public float f35012a;
    public int f35016f;
    public int f35017g;
    public im0 h;
    public int f35018i;
    public int f35019j;
    public int f35020k;
    public int f35021l;
    public int f35022m;
    public boolean f35025p;
    public float f35026q;
    public float f35027r;
    public View f35028s;
    public ArrayList f35030u;
    public CharSequence v;
    public long f35031w;
    public StaticLayout[] f35034z;
    public int f35013b = 0;
    public int f35014c = 0;
    public int d = 0;
    public boolean f35015e = false;
    public final RectF f35023n = new RectF();
    public final int f35024o = org.telegram.messenger.g0.L(2.0f);
    public float f35029t = 1.0f;
    public float f35032x = 0.0f;
    public int f35033y = -1;
    public float B = 1.0f;

    public jm0(View view) {
        if (D == null) {
            D = new Paint(1);
        }
        this.f35028s = view;
        E = org.telegram.messenger.g0.L(24.0f);
        this.f35027r = org.telegram.messenger.g0.L(6.0f);
    }

    public final void a() {
        this.f35030u = null;
        this.f35033y = -1;
        this.f35032x = 0.0f;
        StaticLayout[] staticLayoutArr = this.f35034z;
        if (staticLayoutArr != null) {
            staticLayoutArr[1] = null;
            staticLayoutArr[0] = null;
        }
        this.v = null;
        this.f35031w = -1L;
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
        float f12 = this.f35029t;
        if (f12 > 0.0f) {
            if (f12 < 1.0f) {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, this.f35016f, this.f35017g, (int) (f12 * 255.0f), 31);
            } else {
                canvas2 = canvas;
            }
            int i17 = E / 2;
            int i18 = this.f35017g / 2;
            int i19 = this.f35024o / 2;
            RectF rectF = this.f35023n;
            rectF.set(i17, i18 - i19, this.f35016f - i17, i18 + i19);
            Paint paint = D;
            if (this.f35025p) {
                i7 = this.f35022m;
            } else {
                i7 = this.f35018i;
            }
            paint.setColor(i7);
            c(canvas2, rectF, D);
            if (this.f35026q > 0.0f) {
                Paint paint2 = D;
                if (this.f35025p) {
                    i15 = this.f35022m;
                } else {
                    i15 = this.f35019j;
                }
                paint2.setColor(i15);
                float f13 = E / 2;
                int i20 = this.f35017g / 2;
                rectF.set(f13, i20 - i19, (this.f35026q * (this.f35016f - i16)) + f13, i20 + i19);
                c(canvas2, rectF, D);
            }
            float f14 = E / 2;
            float f15 = (this.f35017g / 2) - i19;
            if (this.f35015e) {
                i12 = this.f35014c;
            } else {
                i12 = this.f35013b;
            }
            rectF.set(f14, f15, i10 + i12, i19 + i11);
            D.setColor(this.f35021l);
            c(canvas2, rectF, D);
            D.setColor(this.f35020k);
            if (this.f35015e) {
                f10 = 8.0f;
            } else {
                f10 = 6.0f;
            }
            float L = org.telegram.messenger.g0.L(f10);
            if (this.f35027r != L) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (elapsedRealtime > 18) {
                    elapsedRealtime = 16;
                }
                float f16 = this.f35027r;
                if (f16 < L) {
                    float c10 = com.google.android.recaptcha.internal.a.c((float) elapsedRealtime, 60.0f, org.telegram.messenger.g0.L(1.0f), f16);
                    this.f35027r = c10;
                    if (c10 > L) {
                        this.f35027r = L;
                    }
                } else {
                    float v = org.telegram.messenger.camera.q.v((float) elapsedRealtime, 60.0f, org.telegram.messenger.g0.L(1.0f), f16);
                    this.f35027r = v;
                    if (v < L) {
                        this.f35027r = L;
                    }
                }
                View view = this.f35028s;
                if (view != null) {
                    view.invalidate();
                }
            }
            if (this.f35015e) {
                i13 = this.f35014c;
            } else {
                i13 = this.f35013b;
            }
            canvas2.drawCircle((E / 2) + i13, this.f35017g / 2, this.f35027r, D);
            if (this.f35029t < 1.0f) {
                canvas2.restore();
            }
            ArrayList arrayList = this.f35030u;
            if (arrayList != null && !arrayList.isEmpty()) {
                if (this.f35015e) {
                    i14 = this.f35014c;
                } else {
                    i14 = this.f35013b;
                }
                float f17 = i14 / (this.f35016f - E);
                int size = this.f35030u.size() - 1;
                while (true) {
                    if (size >= 0) {
                        if (((Float) ((Pair) this.f35030u.get(size)).first).floatValue() - 0.001f <= f17) {
                            break;
                        }
                        size--;
                    } else {
                        size = -1;
                        break;
                    }
                }
                if (this.f35034z == null) {
                    this.f35034z = new StaticLayout[2];
                }
                float f18 = E / 2.0f;
                Math.abs(f18 - (this.f35016f - f18));
                org.telegram.messenger.g0.L(66.0f);
                if (size != this.f35033y) {
                    if (this.f35015e) {
                        org.telegram.messenger.g0.c4(this.f35028s);
                    }
                    this.f35033y = size;
                    if (size >= 0 && size < this.f35030u.size()) {
                        d((v31) ((Pair) this.f35030u.get(this.f35033y)).second);
                    }
                }
                if (this.B < 1.0f) {
                    long min = Math.min(17L, Math.abs(SystemClock.elapsedRealtime() - this.C));
                    if (this.f35030u.size() > 8) {
                        f11 = 160.0f;
                    } else {
                        f11 = 220.0f;
                    }
                    this.B = Math.min((((float) min) / f11) + this.B, 1.0f);
                    View view2 = this.f35028s;
                    if (view2 != null) {
                        view2.invalidate();
                    }
                    this.C = SystemClock.elapsedRealtime();
                }
                if (this.f35032x < 1.0f) {
                    this.f35032x = Math.min((((float) Math.min(17L, Math.abs(SystemClock.elapsedRealtime() - this.C))) / 200.0f) + this.f35032x, 1.0f);
                    View view3 = this.f35028s;
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
            int i10 = this.f35017g;
            int i11 = E;
            int i12 = (i10 - i11) / 2;
            if (f10 >= (-i12)) {
                int i13 = this.f35016f;
                if (f10 <= i13 + i12 && f11 >= 0.0f && f11 <= i10) {
                    int i14 = this.f35013b;
                    if (i14 - i12 > f10 || f10 > i14 + i11 + i12) {
                        int i15 = ((int) f10) - (i11 / 2);
                        this.f35013b = i15;
                        if (i15 < 0) {
                            this.f35013b = 0;
                        } else {
                            int i16 = i13 - i11;
                            if (i15 > i16) {
                                this.f35013b = i16;
                            }
                        }
                    }
                    this.f35015e = true;
                    int i17 = this.f35013b;
                    this.f35014c = i17;
                    this.d = (int) (f10 - i17);
                    return true;
                }
            }
        } else if (i7 != 1 && i7 != 3) {
            if (i7 == 2 && this.f35015e) {
                int i18 = (int) (f10 - this.d);
                this.f35014c = i18;
                if (i18 < 0) {
                    this.f35014c = 0;
                } else {
                    int i19 = this.f35016f - E;
                    if (i18 > i19) {
                        this.f35014c = i19;
                    }
                }
                im0 im0Var2 = this.h;
                if (im0Var2 != null) {
                    im0Var2.d(this.f35014c / (this.f35016f - E));
                }
                return true;
            }
        } else if (this.f35015e) {
            int i20 = this.f35014c;
            this.f35013b = i20;
            if (i7 == 1 && (im0Var = this.h) != null) {
                im0Var.a(i20 / (this.f35016f - E));
            }
            this.f35015e = false;
            return true;
        }
        return false;
    }

    public final void f(float f10) {
        this.f35029t = f10;
    }

    public final void g(int i7, int i10, int i11, int i12, int i13) {
        this.f35018i = i7;
        this.f35019j = i10;
        this.f35020k = i12;
        this.f35021l = i11;
        this.f35022m = i13;
    }

    public final void h(float f10) {
        this.f35012a = f10;
        int ceil = (int) Math.ceil((this.f35016f - E) * f10);
        this.f35013b = ceil;
        if (ceil < 0) {
            this.f35013b = 0;
            return;
        }
        int i7 = this.f35016f;
        int i10 = E;
        if (ceil > i7 - i10) {
            this.f35013b = i7 - i10;
        }
    }

    public final void i(int i7, int i10) {
        if (this.f35016f == i7 && this.f35017g == i10) {
            return;
        }
        this.f35016f = i7;
        this.f35017g = i10;
        h(this.f35012a);
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
        if (charSequence != this.v || this.f35031w != valueOf.longValue()) {
            this.v = charSequence;
            this.f35031w = valueOf.longValue();
            if (!(charSequence instanceof Spanned)) {
                this.f35030u = null;
                this.f35033y = -1;
                this.f35032x = 0.0f;
                StaticLayout[] staticLayoutArr = this.f35034z;
                if (staticLayoutArr != null) {
                    staticLayoutArr[1] = null;
                    staticLayoutArr[0] = null;
                    return;
                }
                return;
            }
            Spanned spanned = (Spanned) charSequence;
            try {
                v31[] v31VarArr = (v31[]) spanned.getSpans(0, spanned.length(), v31.class);
                this.f35030u = new ArrayList();
                this.f35032x = 0.0f;
                if (this.A == null) {
                    TextPaint textPaint = new TextPaint(1);
                    this.A = textPaint;
                    textPaint.setTextSize(org.telegram.messenger.g0.L(12.0f));
                    this.A.setColor(-1);
                }
                for (v31 v31Var : v31VarArr) {
                    try {
                        if (v31Var != null && v31Var.getURL() != null && v31Var.d != null && v31Var.getURL().startsWith("audio?")) {
                            if (Utilities.z(v31Var.getURL().substring(6)).intValue() >= 0) {
                                float intValue = ((float) (z9.intValue() * 1000)) / ((float) valueOf.longValue());
                                org.telegram.messenger.i6.l(new SpannableStringBuilder(v31Var.d), this.A.getFontMetricsInt(), false);
                                this.f35030u.add(new Pair(Float.valueOf(intValue), v31Var));
                            }
                        }
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                    }
                }
                Collections.sort(this.f35030u, new org.telegram.ui.oe(14));
            } catch (Exception e11) {
                org.telegram.messenger.a8.g(e11, true);
                this.f35030u = null;
                this.f35033y = -1;
                this.f35032x = 0.0f;
                StaticLayout[] staticLayoutArr2 = this.f35034z;
                if (staticLayoutArr2 != null) {
                    staticLayoutArr2[1] = null;
                    staticLayoutArr2[0] = null;
                }
            }
        }
    }

    public void d(v31 v31Var) {
    }
}
