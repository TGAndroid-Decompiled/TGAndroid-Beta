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
    public float f34999a;
    public int f35003f;
    public int f35004g;
    public im0 h;
    public int f35005i;
    public int f35006j;
    public int f35007k;
    public int f35008l;
    public int f35009m;
    public boolean f35012p;
    public float f35013q;
    public float f35014r;
    public View f35015s;
    public ArrayList f35017u;
    public CharSequence v;
    public long f35018w;
    public StaticLayout[] f35021z;
    public int f35000b = 0;
    public int f35001c = 0;
    public int d = 0;
    public boolean f35002e = false;
    public final RectF f35010n = new RectF();
    public final int f35011o = org.telegram.messenger.g0.L(2.0f);
    public float f35016t = 1.0f;
    public float f35019x = 0.0f;
    public int f35020y = -1;
    public float B = 1.0f;

    public jm0(View view) {
        if (D == null) {
            D = new Paint(1);
        }
        this.f35015s = view;
        E = org.telegram.messenger.g0.L(24.0f);
        this.f35014r = org.telegram.messenger.g0.L(6.0f);
    }

    public final void a() {
        this.f35017u = null;
        this.f35020y = -1;
        this.f35019x = 0.0f;
        StaticLayout[] staticLayoutArr = this.f35021z;
        if (staticLayoutArr != null) {
            staticLayoutArr[1] = null;
            staticLayoutArr[0] = null;
        }
        this.v = null;
        this.f35018w = -1L;
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
        float f12 = this.f35016t;
        if (f12 > 0.0f) {
            if (f12 < 1.0f) {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, this.f35003f, this.f35004g, (int) (f12 * 255.0f), 31);
            } else {
                canvas2 = canvas;
            }
            int i17 = E / 2;
            int i18 = this.f35004g / 2;
            int i19 = this.f35011o / 2;
            RectF rectF = this.f35010n;
            rectF.set(i17, i18 - i19, this.f35003f - i17, i18 + i19);
            Paint paint = D;
            if (this.f35012p) {
                i7 = this.f35009m;
            } else {
                i7 = this.f35005i;
            }
            paint.setColor(i7);
            c(canvas2, rectF, D);
            if (this.f35013q > 0.0f) {
                Paint paint2 = D;
                if (this.f35012p) {
                    i15 = this.f35009m;
                } else {
                    i15 = this.f35006j;
                }
                paint2.setColor(i15);
                float f13 = E / 2;
                int i20 = this.f35004g / 2;
                rectF.set(f13, i20 - i19, (this.f35013q * (this.f35003f - i16)) + f13, i20 + i19);
                c(canvas2, rectF, D);
            }
            float f14 = E / 2;
            float f15 = (this.f35004g / 2) - i19;
            if (this.f35002e) {
                i12 = this.f35001c;
            } else {
                i12 = this.f35000b;
            }
            rectF.set(f14, f15, i10 + i12, i19 + i11);
            D.setColor(this.f35008l);
            c(canvas2, rectF, D);
            D.setColor(this.f35007k);
            if (this.f35002e) {
                f10 = 8.0f;
            } else {
                f10 = 6.0f;
            }
            float L = org.telegram.messenger.g0.L(f10);
            if (this.f35014r != L) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (elapsedRealtime > 18) {
                    elapsedRealtime = 16;
                }
                float f16 = this.f35014r;
                if (f16 < L) {
                    float c10 = com.google.android.recaptcha.internal.a.c((float) elapsedRealtime, 60.0f, org.telegram.messenger.g0.L(1.0f), f16);
                    this.f35014r = c10;
                    if (c10 > L) {
                        this.f35014r = L;
                    }
                } else {
                    float v = org.telegram.messenger.camera.q.v((float) elapsedRealtime, 60.0f, org.telegram.messenger.g0.L(1.0f), f16);
                    this.f35014r = v;
                    if (v < L) {
                        this.f35014r = L;
                    }
                }
                View view = this.f35015s;
                if (view != null) {
                    view.invalidate();
                }
            }
            if (this.f35002e) {
                i13 = this.f35001c;
            } else {
                i13 = this.f35000b;
            }
            canvas2.drawCircle((E / 2) + i13, this.f35004g / 2, this.f35014r, D);
            if (this.f35016t < 1.0f) {
                canvas2.restore();
            }
            ArrayList arrayList = this.f35017u;
            if (arrayList != null && !arrayList.isEmpty()) {
                if (this.f35002e) {
                    i14 = this.f35001c;
                } else {
                    i14 = this.f35000b;
                }
                float f17 = i14 / (this.f35003f - E);
                int size = this.f35017u.size() - 1;
                while (true) {
                    if (size >= 0) {
                        if (((Float) ((Pair) this.f35017u.get(size)).first).floatValue() - 0.001f <= f17) {
                            break;
                        }
                        size--;
                    } else {
                        size = -1;
                        break;
                    }
                }
                if (this.f35021z == null) {
                    this.f35021z = new StaticLayout[2];
                }
                float f18 = E / 2.0f;
                Math.abs(f18 - (this.f35003f - f18));
                org.telegram.messenger.g0.L(66.0f);
                if (size != this.f35020y) {
                    if (this.f35002e) {
                        org.telegram.messenger.g0.c4(this.f35015s);
                    }
                    this.f35020y = size;
                    if (size >= 0 && size < this.f35017u.size()) {
                        d((b41) ((Pair) this.f35017u.get(this.f35020y)).second);
                    }
                }
                if (this.B < 1.0f) {
                    long min = Math.min(17L, Math.abs(SystemClock.elapsedRealtime() - this.C));
                    if (this.f35017u.size() > 8) {
                        f11 = 160.0f;
                    } else {
                        f11 = 220.0f;
                    }
                    this.B = Math.min((((float) min) / f11) + this.B, 1.0f);
                    View view2 = this.f35015s;
                    if (view2 != null) {
                        view2.invalidate();
                    }
                    this.C = SystemClock.elapsedRealtime();
                }
                if (this.f35019x < 1.0f) {
                    this.f35019x = Math.min((((float) Math.min(17L, Math.abs(SystemClock.elapsedRealtime() - this.C))) / 200.0f) + this.f35019x, 1.0f);
                    View view3 = this.f35015s;
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
            int i10 = this.f35004g;
            int i11 = E;
            int i12 = (i10 - i11) / 2;
            if (f10 >= (-i12)) {
                int i13 = this.f35003f;
                if (f10 <= i13 + i12 && f11 >= 0.0f && f11 <= i10) {
                    int i14 = this.f35000b;
                    if (i14 - i12 > f10 || f10 > i14 + i11 + i12) {
                        int i15 = ((int) f10) - (i11 / 2);
                        this.f35000b = i15;
                        if (i15 < 0) {
                            this.f35000b = 0;
                        } else {
                            int i16 = i13 - i11;
                            if (i15 > i16) {
                                this.f35000b = i16;
                            }
                        }
                    }
                    this.f35002e = true;
                    int i17 = this.f35000b;
                    this.f35001c = i17;
                    this.d = (int) (f10 - i17);
                    return true;
                }
            }
        } else if (i7 != 1 && i7 != 3) {
            if (i7 == 2 && this.f35002e) {
                int i18 = (int) (f10 - this.d);
                this.f35001c = i18;
                if (i18 < 0) {
                    this.f35001c = 0;
                } else {
                    int i19 = this.f35003f - E;
                    if (i18 > i19) {
                        this.f35001c = i19;
                    }
                }
                im0 im0Var2 = this.h;
                if (im0Var2 != null) {
                    im0Var2.d(this.f35001c / (this.f35003f - E));
                }
                return true;
            }
        } else if (this.f35002e) {
            int i20 = this.f35001c;
            this.f35000b = i20;
            if (i7 == 1 && (im0Var = this.h) != null) {
                im0Var.a(i20 / (this.f35003f - E));
            }
            this.f35002e = false;
            return true;
        }
        return false;
    }

    public final void f(float f10) {
        this.f35016t = f10;
    }

    public final void g(int i7, int i10, int i11, int i12, int i13) {
        this.f35005i = i7;
        this.f35006j = i10;
        this.f35007k = i12;
        this.f35008l = i11;
        this.f35009m = i13;
    }

    public final void h(float f10) {
        this.f34999a = f10;
        int ceil = (int) Math.ceil((this.f35003f - E) * f10);
        this.f35000b = ceil;
        if (ceil < 0) {
            this.f35000b = 0;
            return;
        }
        int i7 = this.f35003f;
        int i10 = E;
        if (ceil > i7 - i10) {
            this.f35000b = i7 - i10;
        }
    }

    public final void i(int i7, int i10) {
        if (this.f35003f == i7 && this.f35004g == i10) {
            return;
        }
        this.f35003f = i7;
        this.f35004g = i10;
        h(this.f34999a);
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
        CharSequence charSequence = ijVar.f23300z;
        if (ijVar.f5()) {
            if (ijVar.B == null && (str = ijVar.f23244k.media.webpage.description) != null) {
                ijVar.B = SpannableString.valueOf(str);
                org.telegram.messenger.ij.h(ijVar.O3(), ijVar.B, false, 3, (int) valueOf.longValue(), false);
            }
            charSequence = ijVar.B;
        }
        if (charSequence != this.v || this.f35018w != valueOf.longValue()) {
            this.v = charSequence;
            this.f35018w = valueOf.longValue();
            if (!(charSequence instanceof Spanned)) {
                this.f35017u = null;
                this.f35020y = -1;
                this.f35019x = 0.0f;
                StaticLayout[] staticLayoutArr = this.f35021z;
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
                this.f35017u = new ArrayList();
                this.f35019x = 0.0f;
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
                                this.f35017u.add(new Pair(Float.valueOf(intValue), b41Var));
                            }
                        }
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                    }
                }
                Collections.sort(this.f35017u, new org.telegram.ui.oe(14));
            } catch (Exception e11) {
                org.telegram.messenger.a8.g(e11, true);
                this.f35017u = null;
                this.f35020y = -1;
                this.f35019x = 0.0f;
                StaticLayout[] staticLayoutArr2 = this.f35021z;
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
