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
public class ym0 {
    public static Paint D;
    public static int E;
    public static float[] F;
    public static Path G;
    public TextPaint A;
    public long C;
    public float f42457a;
    public int f42461f;
    public int f42462g;
    public xm0 h;
    public int f42463i;
    public int f42464j;
    public int f42465k;
    public int f42466l;
    public int f42467m;
    public boolean f42470p;
    public float f42471q;
    public float f42472r;
    public View f42473s;
    public ArrayList f42475u;
    public CharSequence v;
    public long f42476w;
    public StaticLayout[] f42479z;
    public int f42458b = 0;
    public int f42459c = 0;
    public int d = 0;
    public boolean f42460e = false;
    public final RectF f42468n = new RectF();
    public final int f42469o = org.telegram.messenger.g0.L(2.0f);
    public float f42474t = 1.0f;
    public float f42477x = 0.0f;
    public int f42478y = -1;
    public float B = 1.0f;

    public ym0(View view) {
        if (D == null) {
            D = new Paint(1);
        }
        this.f42473s = view;
        E = org.telegram.messenger.g0.L(24.0f);
        this.f42472r = org.telegram.messenger.g0.L(6.0f);
    }

    public final void a() {
        this.f42475u = null;
        this.f42478y = -1;
        this.f42477x = 0.0f;
        StaticLayout[] staticLayoutArr = this.f42479z;
        if (staticLayoutArr != null) {
            staticLayoutArr[1] = null;
            staticLayoutArr[0] = null;
        }
        this.v = null;
        this.f42476w = -1L;
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
        float f12 = this.f42474t;
        if (f12 > 0.0f) {
            if (f12 < 1.0f) {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, this.f42461f, this.f42462g, (int) (f12 * 255.0f), 31);
            } else {
                canvas2 = canvas;
            }
            int i17 = E / 2;
            int i18 = this.f42462g / 2;
            int i19 = this.f42469o / 2;
            RectF rectF = this.f42468n;
            rectF.set(i17, i18 - i19, this.f42461f - i17, i18 + i19);
            Paint paint = D;
            if (this.f42470p) {
                i7 = this.f42467m;
            } else {
                i7 = this.f42463i;
            }
            paint.setColor(i7);
            c(canvas2, rectF, D);
            if (this.f42471q > 0.0f) {
                Paint paint2 = D;
                if (this.f42470p) {
                    i15 = this.f42467m;
                } else {
                    i15 = this.f42464j;
                }
                paint2.setColor(i15);
                float f13 = E / 2;
                int i20 = this.f42462g / 2;
                rectF.set(f13, i20 - i19, (this.f42471q * (this.f42461f - i16)) + f13, i20 + i19);
                c(canvas2, rectF, D);
            }
            float f14 = E / 2;
            float f15 = (this.f42462g / 2) - i19;
            if (this.f42460e) {
                i12 = this.f42459c;
            } else {
                i12 = this.f42458b;
            }
            rectF.set(f14, f15, i10 + i12, i19 + i11);
            D.setColor(this.f42466l);
            c(canvas2, rectF, D);
            D.setColor(this.f42465k);
            if (this.f42460e) {
                f10 = 8.0f;
            } else {
                f10 = 6.0f;
            }
            float L = org.telegram.messenger.g0.L(f10);
            if (this.f42472r != L) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (elapsedRealtime > 18) {
                    elapsedRealtime = 16;
                }
                float f16 = this.f42472r;
                if (f16 < L) {
                    float c10 = com.google.android.gms.internal.vision.e2.c((float) elapsedRealtime, 60.0f, org.telegram.messenger.g0.L(1.0f), f16);
                    this.f42472r = c10;
                    if (c10 > L) {
                        this.f42472r = L;
                    }
                } else {
                    float w10 = org.telegram.messenger.o10.w((float) elapsedRealtime, 60.0f, org.telegram.messenger.g0.L(1.0f), f16);
                    this.f42472r = w10;
                    if (w10 < L) {
                        this.f42472r = L;
                    }
                }
                View view = this.f42473s;
                if (view != null) {
                    view.invalidate();
                }
            }
            if (this.f42460e) {
                i13 = this.f42459c;
            } else {
                i13 = this.f42458b;
            }
            canvas2.drawCircle((E / 2) + i13, this.f42462g / 2, this.f42472r, D);
            if (this.f42474t < 1.0f) {
                canvas2.restore();
            }
            ArrayList arrayList = this.f42475u;
            if (arrayList != null && !arrayList.isEmpty()) {
                if (this.f42460e) {
                    i14 = this.f42459c;
                } else {
                    i14 = this.f42458b;
                }
                float f17 = i14 / (this.f42461f - E);
                int size = this.f42475u.size() - 1;
                while (true) {
                    if (size >= 0) {
                        if (((Float) ((Pair) this.f42475u.get(size)).first).floatValue() - 0.001f <= f17) {
                            break;
                        }
                        size--;
                    } else {
                        size = -1;
                        break;
                    }
                }
                if (this.f42479z == null) {
                    this.f42479z = new StaticLayout[2];
                }
                float f18 = E / 2.0f;
                Math.abs(f18 - (this.f42461f - f18));
                org.telegram.messenger.g0.L(66.0f);
                if (size != this.f42478y) {
                    if (this.f42460e) {
                        org.telegram.messenger.g0.a4(this.f42473s);
                    }
                    this.f42478y = size;
                    if (size >= 0 && size < this.f42475u.size()) {
                        d((s41) ((Pair) this.f42475u.get(this.f42478y)).second);
                    }
                }
                if (this.B < 1.0f) {
                    long min = Math.min(17L, Math.abs(SystemClock.elapsedRealtime() - this.C));
                    if (this.f42475u.size() > 8) {
                        f11 = 160.0f;
                    } else {
                        f11 = 220.0f;
                    }
                    this.B = Math.min((((float) min) / f11) + this.B, 1.0f);
                    View view2 = this.f42473s;
                    if (view2 != null) {
                        view2.invalidate();
                    }
                    this.C = SystemClock.elapsedRealtime();
                }
                if (this.f42477x < 1.0f) {
                    this.f42477x = Math.min((((float) Math.min(17L, Math.abs(SystemClock.elapsedRealtime() - this.C))) / 200.0f) + this.f42477x, 1.0f);
                    View view3 = this.f42473s;
                    if (view3 != null) {
                        view3.invalidate();
                    }
                    SystemClock.elapsedRealtime();
                }
            }
        }
    }

    public final void c(android.graphics.Canvas r26, android.graphics.RectF r27, android.graphics.Paint r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ym0.c(android.graphics.Canvas, android.graphics.RectF, android.graphics.Paint):void");
    }

    public final boolean e(float f10, float f11, int i7) {
        xm0 xm0Var;
        if (i7 == 0) {
            int i10 = this.f42462g;
            int i11 = E;
            int i12 = (i10 - i11) / 2;
            if (f10 >= (-i12)) {
                int i13 = this.f42461f;
                if (f10 <= i13 + i12 && f11 >= 0.0f && f11 <= i10) {
                    int i14 = this.f42458b;
                    if (i14 - i12 > f10 || f10 > i14 + i11 + i12) {
                        int i15 = ((int) f10) - (i11 / 2);
                        this.f42458b = i15;
                        if (i15 < 0) {
                            this.f42458b = 0;
                        } else {
                            int i16 = i13 - i11;
                            if (i15 > i16) {
                                this.f42458b = i16;
                            }
                        }
                    }
                    this.f42460e = true;
                    int i17 = this.f42458b;
                    this.f42459c = i17;
                    this.d = (int) (f10 - i17);
                    return true;
                }
            }
        } else if (i7 != 1 && i7 != 3) {
            if (i7 == 2 && this.f42460e) {
                int i18 = (int) (f10 - this.d);
                this.f42459c = i18;
                if (i18 < 0) {
                    this.f42459c = 0;
                } else {
                    int i19 = this.f42461f - E;
                    if (i18 > i19) {
                        this.f42459c = i19;
                    }
                }
                xm0 xm0Var2 = this.h;
                if (xm0Var2 != null) {
                    xm0Var2.g(this.f42459c / (this.f42461f - E));
                }
                return true;
            }
        } else if (this.f42460e) {
            int i20 = this.f42459c;
            this.f42458b = i20;
            if (i7 == 1 && (xm0Var = this.h) != null) {
                xm0Var.a(i20 / (this.f42461f - E));
            }
            this.f42460e = false;
            return true;
        }
        return false;
    }

    public final void f(float f10) {
        this.f42474t = f10;
    }

    public final void g(int i7, int i10, int i11, int i12, int i13) {
        this.f42463i = i7;
        this.f42464j = i10;
        this.f42465k = i12;
        this.f42466l = i11;
        this.f42467m = i13;
    }

    public final void h(float f10) {
        this.f42457a = f10;
        int ceil = (int) Math.ceil((this.f42461f - E) * f10);
        this.f42458b = ceil;
        if (ceil < 0) {
            this.f42458b = 0;
            return;
        }
        int i7 = this.f42461f;
        int i10 = E;
        if (ceil > i7 - i10) {
            this.f42458b = i7 - i10;
        }
    }

    public final void i(int i7, int i10) {
        if (this.f42461f == i7 && this.f42462g == i10) {
            return;
        }
        this.f42461f = i7;
        this.f42462g = i10;
        h(this.f42457a);
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
        CharSequence charSequence = gjVar.f24271z;
        if (gjVar.e5()) {
            if (gjVar.B == null && (str = gjVar.f24213k.media.webpage.description) != null) {
                gjVar.B = SpannableString.valueOf(str);
                org.telegram.messenger.gj.h(gjVar.N3(), gjVar.B, false, 3, (int) valueOf.longValue(), false);
            }
            charSequence = gjVar.B;
        }
        if (charSequence != this.v || this.f42476w != valueOf.longValue()) {
            this.v = charSequence;
            this.f42476w = valueOf.longValue();
            if (!(charSequence instanceof Spanned)) {
                this.f42475u = null;
                this.f42478y = -1;
                this.f42477x = 0.0f;
                StaticLayout[] staticLayoutArr = this.f42479z;
                if (staticLayoutArr != null) {
                    staticLayoutArr[1] = null;
                    staticLayoutArr[0] = null;
                    return;
                }
                return;
            }
            Spanned spanned = (Spanned) charSequence;
            try {
                s41[] s41VarArr = (s41[]) spanned.getSpans(0, spanned.length(), s41.class);
                this.f42475u = new ArrayList();
                this.f42477x = 0.0f;
                if (this.A == null) {
                    TextPaint textPaint = new TextPaint(1);
                    this.A = textPaint;
                    textPaint.setTextSize(org.telegram.messenger.g0.L(12.0f));
                    this.A.setColor(-1);
                }
                for (s41 s41Var : s41VarArr) {
                    try {
                        if (s41Var != null && s41Var.getURL() != null && s41Var.d != null && s41Var.getURL().startsWith("audio?")) {
                            if (Utilities.z(s41Var.getURL().substring(6)).intValue() >= 0) {
                                float intValue = ((float) (z10.intValue() * 1000)) / ((float) valueOf.longValue());
                                org.telegram.messenger.j6.l(new SpannableStringBuilder(s41Var.d), this.A.getFontMetricsInt(), false);
                                this.f42475u.add(new Pair(Float.valueOf(intValue), s41Var));
                            }
                        }
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                    }
                }
                Collections.sort(this.f42475u, new org.telegram.ui.pe(13));
            } catch (Exception e11) {
                org.telegram.messenger.a8.g(e11, true);
                this.f42475u = null;
                this.f42478y = -1;
                this.f42477x = 0.0f;
                StaticLayout[] staticLayoutArr2 = this.f42479z;
                if (staticLayoutArr2 != null) {
                    staticLayoutArr2[1] = null;
                    staticLayoutArr2[0] = null;
                }
            }
        }
    }

    public void d(s41 s41Var) {
    }
}
