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
public class nm0 {
    public static Paint D;
    public static int E;
    public static float[] F;
    public static Path G;
    public TextPaint A;
    public long C;
    public float f37637a;
    public int f37641f;
    public int f37642g;
    public mm0 h;
    public int f37643i;
    public int f37644j;
    public int f37645k;
    public int f37646l;
    public int f37647m;
    public boolean f37650p;
    public float f37651q;
    public float f37652r;
    public View f37653s;
    public ArrayList f37655u;
    public CharSequence v;
    public long f37656w;
    public StaticLayout[] f37659z;
    public int f37638b = 0;
    public int f37639c = 0;
    public int d = 0;
    public boolean f37640e = false;
    public final RectF f37648n = new RectF();
    public final int f37649o = org.telegram.messenger.g0.L(2.0f);
    public float f37654t = 1.0f;
    public float f37657x = 0.0f;
    public int f37658y = -1;
    public float B = 1.0f;

    public nm0(View view) {
        if (D == null) {
            D = new Paint(1);
        }
        this.f37653s = view;
        E = org.telegram.messenger.g0.L(24.0f);
        this.f37652r = org.telegram.messenger.g0.L(6.0f);
    }

    public final void a() {
        this.f37655u = null;
        this.f37658y = -1;
        this.f37657x = 0.0f;
        StaticLayout[] staticLayoutArr = this.f37659z;
        if (staticLayoutArr != null) {
            staticLayoutArr[1] = null;
            staticLayoutArr[0] = null;
        }
        this.v = null;
        this.f37656w = -1L;
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
        float f12 = this.f37654t;
        if (f12 > 0.0f) {
            if (f12 < 1.0f) {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, this.f37641f, this.f37642g, (int) (f12 * 255.0f), 31);
            } else {
                canvas2 = canvas;
            }
            int i17 = E / 2;
            int i18 = this.f37642g / 2;
            int i19 = this.f37649o / 2;
            RectF rectF = this.f37648n;
            rectF.set(i17, i18 - i19, this.f37641f - i17, i18 + i19);
            Paint paint = D;
            if (this.f37650p) {
                i7 = this.f37647m;
            } else {
                i7 = this.f37643i;
            }
            paint.setColor(i7);
            c(canvas2, rectF, D);
            if (this.f37651q > 0.0f) {
                Paint paint2 = D;
                if (this.f37650p) {
                    i15 = this.f37647m;
                } else {
                    i15 = this.f37644j;
                }
                paint2.setColor(i15);
                float f13 = E / 2;
                int i20 = this.f37642g / 2;
                rectF.set(f13, i20 - i19, (this.f37651q * (this.f37641f - i16)) + f13, i20 + i19);
                c(canvas2, rectF, D);
            }
            float f14 = E / 2;
            float f15 = (this.f37642g / 2) - i19;
            if (this.f37640e) {
                i12 = this.f37639c;
            } else {
                i12 = this.f37638b;
            }
            rectF.set(f14, f15, i10 + i12, i19 + i11);
            D.setColor(this.f37646l);
            c(canvas2, rectF, D);
            D.setColor(this.f37645k);
            if (this.f37640e) {
                f10 = 8.0f;
            } else {
                f10 = 6.0f;
            }
            float L = org.telegram.messenger.g0.L(f10);
            if (this.f37652r != L) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (elapsedRealtime > 18) {
                    elapsedRealtime = 16;
                }
                float f16 = this.f37652r;
                if (f16 < L) {
                    float c10 = com.google.android.gms.internal.vision.e2.c((float) elapsedRealtime, 60.0f, org.telegram.messenger.g0.L(1.0f), f16);
                    this.f37652r = c10;
                    if (c10 > L) {
                        this.f37652r = L;
                    }
                } else {
                    float v = org.telegram.messenger.i20.v((float) elapsedRealtime, 60.0f, org.telegram.messenger.g0.L(1.0f), f16);
                    this.f37652r = v;
                    if (v < L) {
                        this.f37652r = L;
                    }
                }
                View view = this.f37653s;
                if (view != null) {
                    view.invalidate();
                }
            }
            if (this.f37640e) {
                i13 = this.f37639c;
            } else {
                i13 = this.f37638b;
            }
            canvas2.drawCircle((E / 2) + i13, this.f37642g / 2, this.f37652r, D);
            if (this.f37654t < 1.0f) {
                canvas2.restore();
            }
            ArrayList arrayList = this.f37655u;
            if (arrayList != null && !arrayList.isEmpty()) {
                if (this.f37640e) {
                    i14 = this.f37639c;
                } else {
                    i14 = this.f37638b;
                }
                float f17 = i14 / (this.f37641f - E);
                int size = this.f37655u.size() - 1;
                while (true) {
                    if (size >= 0) {
                        if (((Float) ((Pair) this.f37655u.get(size)).first).floatValue() - 0.001f <= f17) {
                            break;
                        }
                        size--;
                    } else {
                        size = -1;
                        break;
                    }
                }
                if (this.f37659z == null) {
                    this.f37659z = new StaticLayout[2];
                }
                float f18 = E / 2.0f;
                Math.abs(f18 - (this.f37641f - f18));
                org.telegram.messenger.g0.L(66.0f);
                if (size != this.f37658y) {
                    if (this.f37640e) {
                        org.telegram.messenger.g0.b4(this.f37653s);
                    }
                    this.f37658y = size;
                    if (size >= 0 && size < this.f37655u.size()) {
                        d((f41) ((Pair) this.f37655u.get(this.f37658y)).second);
                    }
                }
                if (this.B < 1.0f) {
                    long min = Math.min(17L, Math.abs(SystemClock.elapsedRealtime() - this.C));
                    if (this.f37655u.size() > 8) {
                        f11 = 160.0f;
                    } else {
                        f11 = 220.0f;
                    }
                    this.B = Math.min((((float) min) / f11) + this.B, 1.0f);
                    View view2 = this.f37653s;
                    if (view2 != null) {
                        view2.invalidate();
                    }
                    this.C = SystemClock.elapsedRealtime();
                }
                if (this.f37657x < 1.0f) {
                    this.f37657x = Math.min((((float) Math.min(17L, Math.abs(SystemClock.elapsedRealtime() - this.C))) / 200.0f) + this.f37657x, 1.0f);
                    View view3 = this.f37653s;
                    if (view3 != null) {
                        view3.invalidate();
                    }
                    SystemClock.elapsedRealtime();
                }
            }
        }
    }

    public final void c(android.graphics.Canvas r26, android.graphics.RectF r27, android.graphics.Paint r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.nm0.c(android.graphics.Canvas, android.graphics.RectF, android.graphics.Paint):void");
    }

    public final boolean e(float f10, float f11, int i7) {
        mm0 mm0Var;
        if (i7 == 0) {
            int i10 = this.f37642g;
            int i11 = E;
            int i12 = (i10 - i11) / 2;
            if (f10 >= (-i12)) {
                int i13 = this.f37641f;
                if (f10 <= i13 + i12 && f11 >= 0.0f && f11 <= i10) {
                    int i14 = this.f37638b;
                    if (i14 - i12 > f10 || f10 > i14 + i11 + i12) {
                        int i15 = ((int) f10) - (i11 / 2);
                        this.f37638b = i15;
                        if (i15 < 0) {
                            this.f37638b = 0;
                        } else {
                            int i16 = i13 - i11;
                            if (i15 > i16) {
                                this.f37638b = i16;
                            }
                        }
                    }
                    this.f37640e = true;
                    int i17 = this.f37638b;
                    this.f37639c = i17;
                    this.d = (int) (f10 - i17);
                    return true;
                }
            }
        } else if (i7 != 1 && i7 != 3) {
            if (i7 == 2 && this.f37640e) {
                int i18 = (int) (f10 - this.d);
                this.f37639c = i18;
                if (i18 < 0) {
                    this.f37639c = 0;
                } else {
                    int i19 = this.f37641f - E;
                    if (i18 > i19) {
                        this.f37639c = i19;
                    }
                }
                mm0 mm0Var2 = this.h;
                if (mm0Var2 != null) {
                    mm0Var2.g(this.f37639c / (this.f37641f - E));
                }
                return true;
            }
        } else if (this.f37640e) {
            int i20 = this.f37639c;
            this.f37638b = i20;
            if (i7 == 1 && (mm0Var = this.h) != null) {
                mm0Var.e(i20 / (this.f37641f - E));
            }
            this.f37640e = false;
            return true;
        }
        return false;
    }

    public final void f(float f10) {
        this.f37654t = f10;
    }

    public final void g(int i7, int i10, int i11, int i12, int i13) {
        this.f37643i = i7;
        this.f37644j = i10;
        this.f37645k = i12;
        this.f37646l = i11;
        this.f37647m = i13;
    }

    public final void h(float f10) {
        this.f37637a = f10;
        int ceil = (int) Math.ceil((this.f37641f - E) * f10);
        this.f37638b = ceil;
        if (ceil < 0) {
            this.f37638b = 0;
            return;
        }
        int i7 = this.f37641f;
        int i10 = E;
        if (ceil > i7 - i10) {
            this.f37638b = i7 - i10;
        }
    }

    public final void i(int i7, int i10) {
        if (this.f37641f == i7 && this.f37642g == i10) {
            return;
        }
        this.f37641f = i7;
        this.f37642g = i10;
        h(this.f37637a);
    }

    public final void j(org.telegram.messenger.gj gjVar) {
        Integer z10;
        String str;
        if (gjVar == null) {
            a();
            return;
        }
        Long valueOf = Long.valueOf(((long) gjVar.L0()) * 1000);
        if (valueOf.longValue() < 0) {
            a();
            return;
        }
        CharSequence charSequence = gjVar.f23875z;
        if (gjVar.e5()) {
            if (gjVar.B == null && (str = gjVar.f23817k.media.webpage.description) != null) {
                gjVar.B = SpannableString.valueOf(str);
                org.telegram.messenger.gj.h(gjVar.N3(), gjVar.B, false, 3, (int) valueOf.longValue(), false);
            }
            charSequence = gjVar.B;
        }
        if (charSequence != this.v || this.f37656w != valueOf.longValue()) {
            this.v = charSequence;
            this.f37656w = valueOf.longValue();
            if (!(charSequence instanceof Spanned)) {
                this.f37655u = null;
                this.f37658y = -1;
                this.f37657x = 0.0f;
                StaticLayout[] staticLayoutArr = this.f37659z;
                if (staticLayoutArr != null) {
                    staticLayoutArr[1] = null;
                    staticLayoutArr[0] = null;
                    return;
                }
                return;
            }
            Spanned spanned = (Spanned) charSequence;
            try {
                f41[] f41VarArr = (f41[]) spanned.getSpans(0, spanned.length(), f41.class);
                this.f37655u = new ArrayList();
                this.f37657x = 0.0f;
                if (this.A == null) {
                    TextPaint textPaint = new TextPaint(1);
                    this.A = textPaint;
                    textPaint.setTextSize(org.telegram.messenger.g0.L(12.0f));
                    this.A.setColor(-1);
                }
                for (f41 f41Var : f41VarArr) {
                    try {
                        if (f41Var != null && f41Var.getURL() != null && f41Var.d != null && f41Var.getURL().startsWith("audio?")) {
                            if (Utilities.z(f41Var.getURL().substring(6)).intValue() >= 0) {
                                float intValue = ((float) (z10.intValue() * 1000)) / ((float) valueOf.longValue());
                                org.telegram.messenger.j6.l(new SpannableStringBuilder(f41Var.d), this.A.getFontMetricsInt(), false);
                                this.f37655u.add(new Pair(Float.valueOf(intValue), f41Var));
                            }
                        }
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                    }
                }
                Collections.sort(this.f37655u, new org.telegram.ui.me(13));
            } catch (Exception e11) {
                org.telegram.messenger.a8.g(e11, true);
                this.f37655u = null;
                this.f37658y = -1;
                this.f37657x = 0.0f;
                StaticLayout[] staticLayoutArr2 = this.f37659z;
                if (staticLayoutArr2 != null) {
                    staticLayoutArr2[1] = null;
                    staticLayoutArr2[0] = null;
                }
            }
        }
    }

    public void d(f41 f41Var) {
    }
}
