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
public class kn0 {
    public static Paint D;
    public static int E;
    public static float[] F;
    public static Path G;
    public TextPaint A;
    public long C;
    public float f27831a;
    public int f27834f;
    public int f27835g;
    public jn0 h;
    public int f27836i;
    public int f27837j;
    public int f27838k;
    public int f27839l;
    public int f27840m;
    public boolean f27843p;
    public float f27844q;
    public float f27845r;
    public View f27846s;
    public ArrayList f27848u;
    public CharSequence v;
    public long f27849w;
    public StaticLayout[] f27852z;
    public int f27832b = 0;
    public int f27833c = 0;
    public int d = 0;
    public boolean e = false;
    public final RectF f27841n = new RectF();
    public final int f27842o = org.telegram.messenger.i0.L(2.0f);
    public float f27847t = 1.0f;
    public float f27850x = 0.0f;
    public int f27851y = -1;
    public float B = 1.0f;

    public kn0(View view) {
        if (D == null) {
            D = new Paint(1);
        }
        this.f27846s = view;
        E = org.telegram.messenger.i0.L(24.0f);
        this.f27845r = org.telegram.messenger.i0.L(6.0f);
    }

    public final void a() {
        this.f27848u = null;
        this.f27851y = -1;
        this.f27850x = 0.0f;
        StaticLayout[] staticLayoutArr = this.f27852z;
        if (staticLayoutArr != null) {
            staticLayoutArr[1] = null;
            staticLayoutArr[0] = null;
        }
        this.v = null;
        this.f27849w = -1L;
    }

    public final void b(Canvas canvas) {
        Canvas canvas2;
        int i10;
        int i11;
        int i12;
        int i13;
        float f7;
        int i14;
        int i15;
        float f10;
        int i16;
        int i17;
        float f11 = this.f27847t;
        if (f11 > 0.0f) {
            if (f11 < 1.0f) {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, this.f27834f, this.f27835g, (int) (f11 * 255.0f), 31);
            } else {
                canvas2 = canvas;
            }
            int i18 = E / 2;
            int i19 = this.f27835g / 2;
            int i20 = this.f27842o / 2;
            RectF rectF = this.f27841n;
            rectF.set(i18, i19 - i20, this.f27834f - i18, i19 + i20);
            Paint paint = D;
            if (this.f27843p) {
                i10 = this.f27840m;
            } else {
                i10 = this.f27836i;
            }
            paint.setColor(i10);
            c(canvas2, rectF, D);
            if (this.f27844q > 0.0f) {
                Paint paint2 = D;
                if (this.f27843p) {
                    i16 = this.f27840m;
                } else {
                    i16 = this.f27837j;
                }
                paint2.setColor(i16);
                float f12 = E / 2;
                int i21 = this.f27835g / 2;
                rectF.set(f12, i21 - i20, (this.f27844q * (this.f27834f - i17)) + f12, i21 + i20);
                c(canvas2, rectF, D);
            }
            float f13 = E / 2;
            float f14 = (this.f27835g / 2) - i20;
            if (this.e) {
                i13 = this.f27833c;
            } else {
                i13 = this.f27832b;
            }
            rectF.set(f13, f14, i11 + i13, i20 + i12);
            D.setColor(this.f27839l);
            c(canvas2, rectF, D);
            D.setColor(this.f27838k);
            if (this.e) {
                f7 = 8.0f;
            } else {
                f7 = 6.0f;
            }
            float L = org.telegram.messenger.i0.L(f7);
            if (this.f27845r != L) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (elapsedRealtime > 18) {
                    elapsedRealtime = 16;
                }
                float f15 = this.f27845r;
                if (f15 < L) {
                    float c10 = a1.g.c((float) elapsedRealtime, 60.0f, org.telegram.messenger.i0.L(1.0f), f15);
                    this.f27845r = c10;
                    if (c10 > L) {
                        this.f27845r = L;
                    }
                } else {
                    float v = org.telegram.messenger.z20.v((float) elapsedRealtime, 60.0f, org.telegram.messenger.i0.L(1.0f), f15);
                    this.f27845r = v;
                    if (v < L) {
                        this.f27845r = L;
                    }
                }
                View view = this.f27846s;
                if (view != null) {
                    view.invalidate();
                }
            }
            if (this.e) {
                i14 = this.f27833c;
            } else {
                i14 = this.f27832b;
            }
            canvas2.drawCircle((E / 2) + i14, this.f27835g / 2, this.f27845r, D);
            if (this.f27847t < 1.0f) {
                canvas2.restore();
            }
            ArrayList arrayList = this.f27848u;
            if (arrayList != null && !arrayList.isEmpty()) {
                if (this.e) {
                    i15 = this.f27833c;
                } else {
                    i15 = this.f27832b;
                }
                float f16 = i15 / (this.f27834f - E);
                int size = this.f27848u.size() - 1;
                while (true) {
                    if (size >= 0) {
                        if (((Float) ((Pair) this.f27848u.get(size)).first).floatValue() - 0.001f <= f16) {
                            break;
                        }
                        size--;
                    } else {
                        size = -1;
                        break;
                    }
                }
                if (this.f27852z == null) {
                    this.f27852z = new StaticLayout[2];
                }
                float f17 = E / 2.0f;
                Math.abs(f17 - (this.f27834f - f17));
                org.telegram.messenger.i0.L(66.0f);
                if (size != this.f27851y) {
                    if (this.e) {
                        org.telegram.messenger.i0.b4(this.f27846s);
                    }
                    this.f27851y = size;
                    if (size >= 0 && size < this.f27848u.size()) {
                        d((e51) ((Pair) this.f27848u.get(this.f27851y)).second);
                    }
                }
                if (this.B < 1.0f) {
                    long min = Math.min(17L, Math.abs(SystemClock.elapsedRealtime() - this.C));
                    if (this.f27848u.size() > 8) {
                        f10 = 160.0f;
                    } else {
                        f10 = 220.0f;
                    }
                    this.B = Math.min((((float) min) / f10) + this.B, 1.0f);
                    View view2 = this.f27846s;
                    if (view2 != null) {
                        view2.invalidate();
                    }
                    this.C = SystemClock.elapsedRealtime();
                }
                if (this.f27850x < 1.0f) {
                    this.f27850x = Math.min((((float) Math.min(17L, Math.abs(SystemClock.elapsedRealtime() - this.C))) / 200.0f) + this.f27850x, 1.0f);
                    View view3 = this.f27846s;
                    if (view3 != null) {
                        view3.invalidate();
                    }
                    SystemClock.elapsedRealtime();
                }
            }
        }
    }

    public final void c(android.graphics.Canvas r26, android.graphics.RectF r27, android.graphics.Paint r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.kn0.c(android.graphics.Canvas, android.graphics.RectF, android.graphics.Paint):void");
    }

    public final boolean e(float f7, float f10, int i10) {
        jn0 jn0Var;
        if (i10 == 0) {
            int i11 = this.f27835g;
            int i12 = E;
            int i13 = (i11 - i12) / 2;
            if (f7 >= (-i13)) {
                int i14 = this.f27834f;
                if (f7 <= i14 + i13 && f10 >= 0.0f && f10 <= i11) {
                    int i15 = this.f27832b;
                    if (i15 - i13 > f7 || f7 > i15 + i12 + i13) {
                        int i16 = ((int) f7) - (i12 / 2);
                        this.f27832b = i16;
                        if (i16 < 0) {
                            this.f27832b = 0;
                        } else {
                            int i17 = i14 - i12;
                            if (i16 > i17) {
                                this.f27832b = i17;
                            }
                        }
                    }
                    this.e = true;
                    int i18 = this.f27832b;
                    this.f27833c = i18;
                    this.d = (int) (f7 - i18);
                    return true;
                }
            }
        } else if (i10 != 1 && i10 != 3) {
            if (i10 == 2 && this.e) {
                int i19 = (int) (f7 - this.d);
                this.f27833c = i19;
                if (i19 < 0) {
                    this.f27833c = 0;
                } else {
                    int i20 = this.f27834f - E;
                    if (i19 > i20) {
                        this.f27833c = i20;
                    }
                }
                jn0 jn0Var2 = this.h;
                if (jn0Var2 != null) {
                    jn0Var2.d(this.f27833c / (this.f27834f - E));
                }
                return true;
            }
        } else if (this.e) {
            int i21 = this.f27833c;
            this.f27832b = i21;
            if (i10 == 1 && (jn0Var = this.h) != null) {
                jn0Var.c(i21 / (this.f27834f - E));
            }
            this.e = false;
            return true;
        }
        return false;
    }

    public final void f(float f7) {
        this.f27847t = f7;
    }

    public final void g(int i10, int i11, int i12, int i13, int i14) {
        this.f27836i = i10;
        this.f27837j = i11;
        this.f27838k = i13;
        this.f27839l = i12;
        this.f27840m = i14;
    }

    public final void h(float f7) {
        this.f27831a = f7;
        int ceil = (int) Math.ceil((this.f27834f - E) * f7);
        this.f27832b = ceil;
        if (ceil < 0) {
            this.f27832b = 0;
            return;
        }
        int i10 = this.f27834f;
        int i11 = E;
        if (ceil > i10 - i11) {
            this.f27832b = i10 - i11;
        }
    }

    public final void i(int i10, int i11) {
        if (this.f27834f == i10 && this.f27835g == i11) {
            return;
        }
        this.f27834f = i10;
        this.f27835g = i11;
        h(this.f27831a);
    }

    public final void j(org.telegram.messenger.jj jjVar) {
        Integer z10;
        String str;
        if (jjVar == null) {
            a();
            return;
        }
        Long valueOf = Long.valueOf(((long) jjVar.L0()) * 1000);
        if (valueOf.longValue() < 0) {
            a();
            return;
        }
        CharSequence charSequence = jjVar.f16394z;
        if (jjVar.e5()) {
            if (jjVar.B == null && (str = jjVar.f16337k.media.webpage.description) != null) {
                jjVar.B = SpannableString.valueOf(str);
                org.telegram.messenger.jj.h(jjVar.N3(), jjVar.B, false, 3, (int) valueOf.longValue(), false);
            }
            charSequence = jjVar.B;
        }
        if (charSequence != this.v || this.f27849w != valueOf.longValue()) {
            this.v = charSequence;
            this.f27849w = valueOf.longValue();
            if (!(charSequence instanceof Spanned)) {
                this.f27848u = null;
                this.f27851y = -1;
                this.f27850x = 0.0f;
                StaticLayout[] staticLayoutArr = this.f27852z;
                if (staticLayoutArr != null) {
                    staticLayoutArr[1] = null;
                    staticLayoutArr[0] = null;
                    return;
                }
                return;
            }
            Spanned spanned = (Spanned) charSequence;
            try {
                e51[] e51VarArr = (e51[]) spanned.getSpans(0, spanned.length(), e51.class);
                this.f27848u = new ArrayList();
                this.f27850x = 0.0f;
                if (this.A == null) {
                    TextPaint textPaint = new TextPaint(1);
                    this.A = textPaint;
                    textPaint.setTextSize(org.telegram.messenger.i0.L(12.0f));
                    this.A.setColor(-1);
                }
                for (e51 e51Var : e51VarArr) {
                    try {
                        if (e51Var != null && e51Var.getURL() != null && e51Var.d != null && e51Var.getURL().startsWith("audio?")) {
                            if (Utilities.z(e51Var.getURL().substring(6)).intValue() >= 0) {
                                float intValue = ((float) (z10.intValue() * 1000)) / ((float) valueOf.longValue());
                                org.telegram.messenger.k6.l(new SpannableStringBuilder(e51Var.d), this.A.getFontMetricsInt(), false);
                                this.f27848u.add(new Pair(Float.valueOf(intValue), e51Var));
                            }
                        }
                    } catch (Exception e) {
                        org.telegram.messenger.f8.g(e, true);
                    }
                }
                Collections.sort(this.f27848u, new org.telegram.ui.f6(16));
            } catch (Exception e7) {
                org.telegram.messenger.f8.g(e7, true);
                this.f27848u = null;
                this.f27851y = -1;
                this.f27850x = 0.0f;
                StaticLayout[] staticLayoutArr2 = this.f27852z;
                if (staticLayoutArr2 != null) {
                    staticLayoutArr2[1] = null;
                    staticLayoutArr2[0] = null;
                }
            }
        }
    }

    public void d(e51 e51Var) {
    }
}
