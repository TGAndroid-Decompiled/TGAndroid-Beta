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
    public float f42456a;
    public int f42460f;
    public int f42461g;
    public xm0 h;
    public int f42462i;
    public int f42463j;
    public int f42464k;
    public int f42465l;
    public int f42466m;
    public boolean f42469p;
    public float f42470q;
    public float f42471r;
    public View f42472s;
    public ArrayList f42474u;
    public CharSequence v;
    public long f42475w;
    public StaticLayout[] f42478z;
    public int f42457b = 0;
    public int f42458c = 0;
    public int d = 0;
    public boolean f42459e = false;
    public final RectF f42467n = new RectF();
    public final int f42468o = org.telegram.messenger.g0.L(2.0f);
    public float f42473t = 1.0f;
    public float f42476x = 0.0f;
    public int f42477y = -1;
    public float B = 1.0f;

    public ym0(View view) {
        if (D == null) {
            D = new Paint(1);
        }
        this.f42472s = view;
        E = org.telegram.messenger.g0.L(24.0f);
        this.f42471r = org.telegram.messenger.g0.L(6.0f);
    }

    public final void a() {
        this.f42474u = null;
        this.f42477y = -1;
        this.f42476x = 0.0f;
        StaticLayout[] staticLayoutArr = this.f42478z;
        if (staticLayoutArr != null) {
            staticLayoutArr[1] = null;
            staticLayoutArr[0] = null;
        }
        this.v = null;
        this.f42475w = -1L;
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
        float f12 = this.f42473t;
        if (f12 > 0.0f) {
            if (f12 < 1.0f) {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, this.f42460f, this.f42461g, (int) (f12 * 255.0f), 31);
            } else {
                canvas2 = canvas;
            }
            int i17 = E / 2;
            int i18 = this.f42461g / 2;
            int i19 = this.f42468o / 2;
            RectF rectF = this.f42467n;
            rectF.set(i17, i18 - i19, this.f42460f - i17, i18 + i19);
            Paint paint = D;
            if (this.f42469p) {
                i7 = this.f42466m;
            } else {
                i7 = this.f42462i;
            }
            paint.setColor(i7);
            c(canvas2, rectF, D);
            if (this.f42470q > 0.0f) {
                Paint paint2 = D;
                if (this.f42469p) {
                    i15 = this.f42466m;
                } else {
                    i15 = this.f42463j;
                }
                paint2.setColor(i15);
                float f13 = E / 2;
                int i20 = this.f42461g / 2;
                rectF.set(f13, i20 - i19, (this.f42470q * (this.f42460f - i16)) + f13, i20 + i19);
                c(canvas2, rectF, D);
            }
            float f14 = E / 2;
            float f15 = (this.f42461g / 2) - i19;
            if (this.f42459e) {
                i12 = this.f42458c;
            } else {
                i12 = this.f42457b;
            }
            rectF.set(f14, f15, i10 + i12, i19 + i11);
            D.setColor(this.f42465l);
            c(canvas2, rectF, D);
            D.setColor(this.f42464k);
            if (this.f42459e) {
                f10 = 8.0f;
            } else {
                f10 = 6.0f;
            }
            float L = org.telegram.messenger.g0.L(f10);
            if (this.f42471r != L) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (elapsedRealtime > 18) {
                    elapsedRealtime = 16;
                }
                float f16 = this.f42471r;
                if (f16 < L) {
                    float c10 = com.google.android.gms.internal.vision.e2.c((float) elapsedRealtime, 60.0f, org.telegram.messenger.g0.L(1.0f), f16);
                    this.f42471r = c10;
                    if (c10 > L) {
                        this.f42471r = L;
                    }
                } else {
                    float w10 = org.telegram.messenger.o10.w((float) elapsedRealtime, 60.0f, org.telegram.messenger.g0.L(1.0f), f16);
                    this.f42471r = w10;
                    if (w10 < L) {
                        this.f42471r = L;
                    }
                }
                View view = this.f42472s;
                if (view != null) {
                    view.invalidate();
                }
            }
            if (this.f42459e) {
                i13 = this.f42458c;
            } else {
                i13 = this.f42457b;
            }
            canvas2.drawCircle((E / 2) + i13, this.f42461g / 2, this.f42471r, D);
            if (this.f42473t < 1.0f) {
                canvas2.restore();
            }
            ArrayList arrayList = this.f42474u;
            if (arrayList != null && !arrayList.isEmpty()) {
                if (this.f42459e) {
                    i14 = this.f42458c;
                } else {
                    i14 = this.f42457b;
                }
                float f17 = i14 / (this.f42460f - E);
                int size = this.f42474u.size() - 1;
                while (true) {
                    if (size >= 0) {
                        if (((Float) ((Pair) this.f42474u.get(size)).first).floatValue() - 0.001f <= f17) {
                            break;
                        }
                        size--;
                    } else {
                        size = -1;
                        break;
                    }
                }
                if (this.f42478z == null) {
                    this.f42478z = new StaticLayout[2];
                }
                float f18 = E / 2.0f;
                Math.abs(f18 - (this.f42460f - f18));
                org.telegram.messenger.g0.L(66.0f);
                if (size != this.f42477y) {
                    if (this.f42459e) {
                        org.telegram.messenger.g0.a4(this.f42472s);
                    }
                    this.f42477y = size;
                    if (size >= 0 && size < this.f42474u.size()) {
                        d((s41) ((Pair) this.f42474u.get(this.f42477y)).second);
                    }
                }
                if (this.B < 1.0f) {
                    long min = Math.min(17L, Math.abs(SystemClock.elapsedRealtime() - this.C));
                    if (this.f42474u.size() > 8) {
                        f11 = 160.0f;
                    } else {
                        f11 = 220.0f;
                    }
                    this.B = Math.min((((float) min) / f11) + this.B, 1.0f);
                    View view2 = this.f42472s;
                    if (view2 != null) {
                        view2.invalidate();
                    }
                    this.C = SystemClock.elapsedRealtime();
                }
                if (this.f42476x < 1.0f) {
                    this.f42476x = Math.min((((float) Math.min(17L, Math.abs(SystemClock.elapsedRealtime() - this.C))) / 200.0f) + this.f42476x, 1.0f);
                    View view3 = this.f42472s;
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
            int i10 = this.f42461g;
            int i11 = E;
            int i12 = (i10 - i11) / 2;
            if (f10 >= (-i12)) {
                int i13 = this.f42460f;
                if (f10 <= i13 + i12 && f11 >= 0.0f && f11 <= i10) {
                    int i14 = this.f42457b;
                    if (i14 - i12 > f10 || f10 > i14 + i11 + i12) {
                        int i15 = ((int) f10) - (i11 / 2);
                        this.f42457b = i15;
                        if (i15 < 0) {
                            this.f42457b = 0;
                        } else {
                            int i16 = i13 - i11;
                            if (i15 > i16) {
                                this.f42457b = i16;
                            }
                        }
                    }
                    this.f42459e = true;
                    int i17 = this.f42457b;
                    this.f42458c = i17;
                    this.d = (int) (f10 - i17);
                    return true;
                }
            }
        } else if (i7 != 1 && i7 != 3) {
            if (i7 == 2 && this.f42459e) {
                int i18 = (int) (f10 - this.d);
                this.f42458c = i18;
                if (i18 < 0) {
                    this.f42458c = 0;
                } else {
                    int i19 = this.f42460f - E;
                    if (i18 > i19) {
                        this.f42458c = i19;
                    }
                }
                xm0 xm0Var2 = this.h;
                if (xm0Var2 != null) {
                    xm0Var2.g(this.f42458c / (this.f42460f - E));
                }
                return true;
            }
        } else if (this.f42459e) {
            int i20 = this.f42458c;
            this.f42457b = i20;
            if (i7 == 1 && (xm0Var = this.h) != null) {
                xm0Var.a(i20 / (this.f42460f - E));
            }
            this.f42459e = false;
            return true;
        }
        return false;
    }

    public final void f(float f10) {
        this.f42473t = f10;
    }

    public final void g(int i7, int i10, int i11, int i12, int i13) {
        this.f42462i = i7;
        this.f42463j = i10;
        this.f42464k = i12;
        this.f42465l = i11;
        this.f42466m = i13;
    }

    public final void h(float f10) {
        this.f42456a = f10;
        int ceil = (int) Math.ceil((this.f42460f - E) * f10);
        this.f42457b = ceil;
        if (ceil < 0) {
            this.f42457b = 0;
            return;
        }
        int i7 = this.f42460f;
        int i10 = E;
        if (ceil > i7 - i10) {
            this.f42457b = i7 - i10;
        }
    }

    public final void i(int i7, int i10) {
        if (this.f42460f == i7 && this.f42461g == i10) {
            return;
        }
        this.f42460f = i7;
        this.f42461g = i10;
        h(this.f42456a);
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
        if (charSequence != this.v || this.f42475w != valueOf.longValue()) {
            this.v = charSequence;
            this.f42475w = valueOf.longValue();
            if (!(charSequence instanceof Spanned)) {
                this.f42474u = null;
                this.f42477y = -1;
                this.f42476x = 0.0f;
                StaticLayout[] staticLayoutArr = this.f42478z;
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
                this.f42474u = new ArrayList();
                this.f42476x = 0.0f;
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
                                this.f42474u.add(new Pair(Float.valueOf(intValue), s41Var));
                            }
                        }
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                    }
                }
                Collections.sort(this.f42474u, new org.telegram.ui.pe(13));
            } catch (Exception e11) {
                org.telegram.messenger.a8.g(e11, true);
                this.f42474u = null;
                this.f42477y = -1;
                this.f42476x = 0.0f;
                StaticLayout[] staticLayoutArr2 = this.f42478z;
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
