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
public class xm0 {
    public static Paint D;
    public static int E;
    public static float[] F;
    public static Path G;
    public TextPaint A;
    public long C;
    public float f42102a;
    public int f42106f;
    public int f42107g;
    public wm0 h;
    public int f42108i;
    public int f42109j;
    public int f42110k;
    public int f42111l;
    public int f42112m;
    public boolean f42115p;
    public float f42116q;
    public float f42117r;
    public View f42118s;
    public ArrayList f42120u;
    public CharSequence v;
    public long f42121w;
    public StaticLayout[] f42124z;
    public int f42103b = 0;
    public int f42104c = 0;
    public int d = 0;
    public boolean f42105e = false;
    public final RectF f42113n = new RectF();
    public final int f42114o = org.telegram.messenger.g0.L(2.0f);
    public float f42119t = 1.0f;
    public float f42122x = 0.0f;
    public int f42123y = -1;
    public float B = 1.0f;

    public xm0(View view) {
        if (D == null) {
            D = new Paint(1);
        }
        this.f42118s = view;
        E = org.telegram.messenger.g0.L(24.0f);
        this.f42117r = org.telegram.messenger.g0.L(6.0f);
    }

    public final void a() {
        this.f42120u = null;
        this.f42123y = -1;
        this.f42122x = 0.0f;
        StaticLayout[] staticLayoutArr = this.f42124z;
        if (staticLayoutArr != null) {
            staticLayoutArr[1] = null;
            staticLayoutArr[0] = null;
        }
        this.v = null;
        this.f42121w = -1L;
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
        float f12 = this.f42119t;
        if (f12 > 0.0f) {
            if (f12 < 1.0f) {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, this.f42106f, this.f42107g, (int) (f12 * 255.0f), 31);
            } else {
                canvas2 = canvas;
            }
            int i17 = E / 2;
            int i18 = this.f42107g / 2;
            int i19 = this.f42114o / 2;
            RectF rectF = this.f42113n;
            rectF.set(i17, i18 - i19, this.f42106f - i17, i18 + i19);
            Paint paint = D;
            if (this.f42115p) {
                i7 = this.f42112m;
            } else {
                i7 = this.f42108i;
            }
            paint.setColor(i7);
            c(canvas2, rectF, D);
            if (this.f42116q > 0.0f) {
                Paint paint2 = D;
                if (this.f42115p) {
                    i15 = this.f42112m;
                } else {
                    i15 = this.f42109j;
                }
                paint2.setColor(i15);
                float f13 = E / 2;
                int i20 = this.f42107g / 2;
                rectF.set(f13, i20 - i19, (this.f42116q * (this.f42106f - i16)) + f13, i20 + i19);
                c(canvas2, rectF, D);
            }
            float f14 = E / 2;
            float f15 = (this.f42107g / 2) - i19;
            if (this.f42105e) {
                i12 = this.f42104c;
            } else {
                i12 = this.f42103b;
            }
            rectF.set(f14, f15, i10 + i12, i19 + i11);
            D.setColor(this.f42111l);
            c(canvas2, rectF, D);
            D.setColor(this.f42110k);
            if (this.f42105e) {
                f10 = 8.0f;
            } else {
                f10 = 6.0f;
            }
            float L = org.telegram.messenger.g0.L(f10);
            if (this.f42117r != L) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (elapsedRealtime > 18) {
                    elapsedRealtime = 16;
                }
                float f16 = this.f42117r;
                if (f16 < L) {
                    float c10 = com.google.android.gms.internal.vision.e2.c((float) elapsedRealtime, 60.0f, org.telegram.messenger.g0.L(1.0f), f16);
                    this.f42117r = c10;
                    if (c10 > L) {
                        this.f42117r = L;
                    }
                } else {
                    float w10 = org.telegram.messenger.m10.w((float) elapsedRealtime, 60.0f, org.telegram.messenger.g0.L(1.0f), f16);
                    this.f42117r = w10;
                    if (w10 < L) {
                        this.f42117r = L;
                    }
                }
                View view = this.f42118s;
                if (view != null) {
                    view.invalidate();
                }
            }
            if (this.f42105e) {
                i13 = this.f42104c;
            } else {
                i13 = this.f42103b;
            }
            canvas2.drawCircle((E / 2) + i13, this.f42107g / 2, this.f42117r, D);
            if (this.f42119t < 1.0f) {
                canvas2.restore();
            }
            ArrayList arrayList = this.f42120u;
            if (arrayList != null && !arrayList.isEmpty()) {
                if (this.f42105e) {
                    i14 = this.f42104c;
                } else {
                    i14 = this.f42103b;
                }
                float f17 = i14 / (this.f42106f - E);
                int size = this.f42120u.size() - 1;
                while (true) {
                    if (size >= 0) {
                        if (((Float) ((Pair) this.f42120u.get(size)).first).floatValue() - 0.001f <= f17) {
                            break;
                        }
                        size--;
                    } else {
                        size = -1;
                        break;
                    }
                }
                if (this.f42124z == null) {
                    this.f42124z = new StaticLayout[2];
                }
                float f18 = E / 2.0f;
                Math.abs(f18 - (this.f42106f - f18));
                org.telegram.messenger.g0.L(66.0f);
                if (size != this.f42123y) {
                    if (this.f42105e) {
                        org.telegram.messenger.g0.a4(this.f42118s);
                    }
                    this.f42123y = size;
                    if (size >= 0 && size < this.f42120u.size()) {
                        d((r41) ((Pair) this.f42120u.get(this.f42123y)).second);
                    }
                }
                if (this.B < 1.0f) {
                    long min = Math.min(17L, Math.abs(SystemClock.elapsedRealtime() - this.C));
                    if (this.f42120u.size() > 8) {
                        f11 = 160.0f;
                    } else {
                        f11 = 220.0f;
                    }
                    this.B = Math.min((((float) min) / f11) + this.B, 1.0f);
                    View view2 = this.f42118s;
                    if (view2 != null) {
                        view2.invalidate();
                    }
                    this.C = SystemClock.elapsedRealtime();
                }
                if (this.f42122x < 1.0f) {
                    this.f42122x = Math.min((((float) Math.min(17L, Math.abs(SystemClock.elapsedRealtime() - this.C))) / 200.0f) + this.f42122x, 1.0f);
                    View view3 = this.f42118s;
                    if (view3 != null) {
                        view3.invalidate();
                    }
                    SystemClock.elapsedRealtime();
                }
            }
        }
    }

    public final void c(android.graphics.Canvas r26, android.graphics.RectF r27, android.graphics.Paint r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.xm0.c(android.graphics.Canvas, android.graphics.RectF, android.graphics.Paint):void");
    }

    public final boolean e(float f10, float f11, int i7) {
        wm0 wm0Var;
        if (i7 == 0) {
            int i10 = this.f42107g;
            int i11 = E;
            int i12 = (i10 - i11) / 2;
            if (f10 >= (-i12)) {
                int i13 = this.f42106f;
                if (f10 <= i13 + i12 && f11 >= 0.0f && f11 <= i10) {
                    int i14 = this.f42103b;
                    if (i14 - i12 > f10 || f10 > i14 + i11 + i12) {
                        int i15 = ((int) f10) - (i11 / 2);
                        this.f42103b = i15;
                        if (i15 < 0) {
                            this.f42103b = 0;
                        } else {
                            int i16 = i13 - i11;
                            if (i15 > i16) {
                                this.f42103b = i16;
                            }
                        }
                    }
                    this.f42105e = true;
                    int i17 = this.f42103b;
                    this.f42104c = i17;
                    this.d = (int) (f10 - i17);
                    return true;
                }
            }
        } else if (i7 != 1 && i7 != 3) {
            if (i7 == 2 && this.f42105e) {
                int i18 = (int) (f10 - this.d);
                this.f42104c = i18;
                if (i18 < 0) {
                    this.f42104c = 0;
                } else {
                    int i19 = this.f42106f - E;
                    if (i18 > i19) {
                        this.f42104c = i19;
                    }
                }
                wm0 wm0Var2 = this.h;
                if (wm0Var2 != null) {
                    wm0Var2.h(this.f42104c / (this.f42106f - E));
                }
                return true;
            }
        } else if (this.f42105e) {
            int i20 = this.f42104c;
            this.f42103b = i20;
            if (i7 == 1 && (wm0Var = this.h) != null) {
                wm0Var.e(i20 / (this.f42106f - E));
            }
            this.f42105e = false;
            return true;
        }
        return false;
    }

    public final void f(float f10) {
        this.f42119t = f10;
    }

    public final void g(int i7, int i10, int i11, int i12, int i13) {
        this.f42108i = i7;
        this.f42109j = i10;
        this.f42110k = i12;
        this.f42111l = i11;
        this.f42112m = i13;
    }

    public final void h(float f10) {
        this.f42102a = f10;
        int ceil = (int) Math.ceil((this.f42106f - E) * f10);
        this.f42103b = ceil;
        if (ceil < 0) {
            this.f42103b = 0;
            return;
        }
        int i7 = this.f42106f;
        int i10 = E;
        if (ceil > i7 - i10) {
            this.f42103b = i7 - i10;
        }
    }

    public final void i(int i7, int i10) {
        if (this.f42106f == i7 && this.f42107g == i10) {
            return;
        }
        this.f42106f = i7;
        this.f42107g = i10;
        h(this.f42102a);
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
        CharSequence charSequence = fjVar.f24131z;
        if (fjVar.e5()) {
            if (fjVar.B == null && (str = fjVar.f24073k.media.webpage.description) != null) {
                fjVar.B = SpannableString.valueOf(str);
                org.telegram.messenger.fj.h(fjVar.N3(), fjVar.B, false, 3, (int) valueOf.longValue(), false);
            }
            charSequence = fjVar.B;
        }
        if (charSequence != this.v || this.f42121w != valueOf.longValue()) {
            this.v = charSequence;
            this.f42121w = valueOf.longValue();
            if (!(charSequence instanceof Spanned)) {
                this.f42120u = null;
                this.f42123y = -1;
                this.f42122x = 0.0f;
                StaticLayout[] staticLayoutArr = this.f42124z;
                if (staticLayoutArr != null) {
                    staticLayoutArr[1] = null;
                    staticLayoutArr[0] = null;
                    return;
                }
                return;
            }
            Spanned spanned = (Spanned) charSequence;
            try {
                r41[] r41VarArr = (r41[]) spanned.getSpans(0, spanned.length(), r41.class);
                this.f42120u = new ArrayList();
                this.f42122x = 0.0f;
                if (this.A == null) {
                    TextPaint textPaint = new TextPaint(1);
                    this.A = textPaint;
                    textPaint.setTextSize(org.telegram.messenger.g0.L(12.0f));
                    this.A.setColor(-1);
                }
                for (r41 r41Var : r41VarArr) {
                    try {
                        if (r41Var != null && r41Var.getURL() != null && r41Var.d != null && r41Var.getURL().startsWith("audio?")) {
                            if (Utilities.z(r41Var.getURL().substring(6)).intValue() >= 0) {
                                float intValue = ((float) (z10.intValue() * 1000)) / ((float) valueOf.longValue());
                                org.telegram.messenger.j6.l(new SpannableStringBuilder(r41Var.d), this.A.getFontMetricsInt(), false);
                                this.f42120u.add(new Pair(Float.valueOf(intValue), r41Var));
                            }
                        }
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                    }
                }
                Collections.sort(this.f42120u, new org.telegram.ui.pe(13));
            } catch (Exception e11) {
                org.telegram.messenger.a8.g(e11, true);
                this.f42120u = null;
                this.f42123y = -1;
                this.f42122x = 0.0f;
                StaticLayout[] staticLayoutArr2 = this.f42124z;
                if (staticLayoutArr2 != null) {
                    staticLayoutArr2[1] = null;
                    staticLayoutArr2[0] = null;
                }
            }
        }
    }

    public void d(r41 r41Var) {
    }
}
