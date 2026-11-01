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
public class ln0 {
    public static Paint D;
    public static int E;
    public static float[] F;
    public static Path G;
    public TextPaint A;
    public long C;
    public float f28210a;
    public int f28213f;
    public int f28214g;
    public kn0 h;
    public int f28215i;
    public int f28216j;
    public int f28217k;
    public int f28218l;
    public int f28219m;
    public boolean f28222p;
    public float f28223q;
    public float f28224r;
    public View f28225s;
    public ArrayList f28227u;
    public CharSequence v;
    public long f28228w;
    public StaticLayout[] f28231z;
    public int f28211b = 0;
    public int f28212c = 0;
    public int d = 0;
    public boolean e = false;
    public final RectF f28220n = new RectF();
    public final int f28221o = org.telegram.messenger.i0.L(2.0f);
    public float f28226t = 1.0f;
    public float f28229x = 0.0f;
    public int f28230y = -1;
    public float B = 1.0f;

    public ln0(View view) {
        if (D == null) {
            D = new Paint(1);
        }
        this.f28225s = view;
        E = org.telegram.messenger.i0.L(24.0f);
        this.f28224r = org.telegram.messenger.i0.L(6.0f);
    }

    public final void a() {
        this.f28227u = null;
        this.f28230y = -1;
        this.f28229x = 0.0f;
        StaticLayout[] staticLayoutArr = this.f28231z;
        if (staticLayoutArr != null) {
            staticLayoutArr[1] = null;
            staticLayoutArr[0] = null;
        }
        this.v = null;
        this.f28228w = -1L;
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
        float f11 = this.f28226t;
        if (f11 > 0.0f) {
            if (f11 < 1.0f) {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, this.f28213f, this.f28214g, (int) (f11 * 255.0f), 31);
            } else {
                canvas2 = canvas;
            }
            int i18 = E / 2;
            int i19 = this.f28214g / 2;
            int i20 = this.f28221o / 2;
            RectF rectF = this.f28220n;
            rectF.set(i18, i19 - i20, this.f28213f - i18, i19 + i20);
            Paint paint = D;
            if (this.f28222p) {
                i10 = this.f28219m;
            } else {
                i10 = this.f28215i;
            }
            paint.setColor(i10);
            c(canvas2, rectF, D);
            if (this.f28223q > 0.0f) {
                Paint paint2 = D;
                if (this.f28222p) {
                    i16 = this.f28219m;
                } else {
                    i16 = this.f28216j;
                }
                paint2.setColor(i16);
                float f12 = E / 2;
                int i21 = this.f28214g / 2;
                rectF.set(f12, i21 - i20, (this.f28223q * (this.f28213f - i17)) + f12, i21 + i20);
                c(canvas2, rectF, D);
            }
            float f13 = E / 2;
            float f14 = (this.f28214g / 2) - i20;
            if (this.e) {
                i13 = this.f28212c;
            } else {
                i13 = this.f28211b;
            }
            rectF.set(f13, f14, i11 + i13, i20 + i12);
            D.setColor(this.f28218l);
            c(canvas2, rectF, D);
            D.setColor(this.f28217k);
            if (this.e) {
                f7 = 8.0f;
            } else {
                f7 = 6.0f;
            }
            float L = org.telegram.messenger.i0.L(f7);
            if (this.f28224r != L) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (elapsedRealtime > 18) {
                    elapsedRealtime = 16;
                }
                float f15 = this.f28224r;
                if (f15 < L) {
                    float c10 = a1.g.c((float) elapsedRealtime, 60.0f, org.telegram.messenger.i0.L(1.0f), f15);
                    this.f28224r = c10;
                    if (c10 > L) {
                        this.f28224r = L;
                    }
                } else {
                    float v = org.telegram.messenger.a30.v((float) elapsedRealtime, 60.0f, org.telegram.messenger.i0.L(1.0f), f15);
                    this.f28224r = v;
                    if (v < L) {
                        this.f28224r = L;
                    }
                }
                View view = this.f28225s;
                if (view != null) {
                    view.invalidate();
                }
            }
            if (this.e) {
                i14 = this.f28212c;
            } else {
                i14 = this.f28211b;
            }
            canvas2.drawCircle((E / 2) + i14, this.f28214g / 2, this.f28224r, D);
            if (this.f28226t < 1.0f) {
                canvas2.restore();
            }
            ArrayList arrayList = this.f28227u;
            if (arrayList != null && !arrayList.isEmpty()) {
                if (this.e) {
                    i15 = this.f28212c;
                } else {
                    i15 = this.f28211b;
                }
                float f16 = i15 / (this.f28213f - E);
                int size = this.f28227u.size() - 1;
                while (true) {
                    if (size >= 0) {
                        if (((Float) ((Pair) this.f28227u.get(size)).first).floatValue() - 0.001f <= f16) {
                            break;
                        }
                        size--;
                    } else {
                        size = -1;
                        break;
                    }
                }
                if (this.f28231z == null) {
                    this.f28231z = new StaticLayout[2];
                }
                float f17 = E / 2.0f;
                Math.abs(f17 - (this.f28213f - f17));
                org.telegram.messenger.i0.L(66.0f);
                if (size != this.f28230y) {
                    if (this.e) {
                        org.telegram.messenger.i0.b4(this.f28225s);
                    }
                    this.f28230y = size;
                    if (size >= 0 && size < this.f28227u.size()) {
                        d((f51) ((Pair) this.f28227u.get(this.f28230y)).second);
                    }
                }
                if (this.B < 1.0f) {
                    long min = Math.min(17L, Math.abs(SystemClock.elapsedRealtime() - this.C));
                    if (this.f28227u.size() > 8) {
                        f10 = 160.0f;
                    } else {
                        f10 = 220.0f;
                    }
                    this.B = Math.min((((float) min) / f10) + this.B, 1.0f);
                    View view2 = this.f28225s;
                    if (view2 != null) {
                        view2.invalidate();
                    }
                    this.C = SystemClock.elapsedRealtime();
                }
                if (this.f28229x < 1.0f) {
                    this.f28229x = Math.min((((float) Math.min(17L, Math.abs(SystemClock.elapsedRealtime() - this.C))) / 200.0f) + this.f28229x, 1.0f);
                    View view3 = this.f28225s;
                    if (view3 != null) {
                        view3.invalidate();
                    }
                    SystemClock.elapsedRealtime();
                }
            }
        }
    }

    public final void c(android.graphics.Canvas r26, android.graphics.RectF r27, android.graphics.Paint r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ln0.c(android.graphics.Canvas, android.graphics.RectF, android.graphics.Paint):void");
    }

    public final boolean e(float f7, float f10, int i10) {
        kn0 kn0Var;
        if (i10 == 0) {
            int i11 = this.f28214g;
            int i12 = E;
            int i13 = (i11 - i12) / 2;
            if (f7 >= (-i13)) {
                int i14 = this.f28213f;
                if (f7 <= i14 + i13 && f10 >= 0.0f && f10 <= i11) {
                    int i15 = this.f28211b;
                    if (i15 - i13 > f7 || f7 > i15 + i12 + i13) {
                        int i16 = ((int) f7) - (i12 / 2);
                        this.f28211b = i16;
                        if (i16 < 0) {
                            this.f28211b = 0;
                        } else {
                            int i17 = i14 - i12;
                            if (i16 > i17) {
                                this.f28211b = i17;
                            }
                        }
                    }
                    this.e = true;
                    int i18 = this.f28211b;
                    this.f28212c = i18;
                    this.d = (int) (f7 - i18);
                    return true;
                }
            }
        } else if (i10 != 1 && i10 != 3) {
            if (i10 == 2 && this.e) {
                int i19 = (int) (f7 - this.d);
                this.f28212c = i19;
                if (i19 < 0) {
                    this.f28212c = 0;
                } else {
                    int i20 = this.f28213f - E;
                    if (i19 > i20) {
                        this.f28212c = i20;
                    }
                }
                kn0 kn0Var2 = this.h;
                if (kn0Var2 != null) {
                    kn0Var2.d(this.f28212c / (this.f28213f - E));
                }
                return true;
            }
        } else if (this.e) {
            int i21 = this.f28212c;
            this.f28211b = i21;
            if (i10 == 1 && (kn0Var = this.h) != null) {
                kn0Var.c(i21 / (this.f28213f - E));
            }
            this.e = false;
            return true;
        }
        return false;
    }

    public final void f(float f7) {
        this.f28226t = f7;
    }

    public final void g(int i10, int i11, int i12, int i13, int i14) {
        this.f28215i = i10;
        this.f28216j = i11;
        this.f28217k = i13;
        this.f28218l = i12;
        this.f28219m = i14;
    }

    public final void h(float f7) {
        this.f28210a = f7;
        int ceil = (int) Math.ceil((this.f28213f - E) * f7);
        this.f28211b = ceil;
        if (ceil < 0) {
            this.f28211b = 0;
            return;
        }
        int i10 = this.f28213f;
        int i11 = E;
        if (ceil > i10 - i11) {
            this.f28211b = i10 - i11;
        }
    }

    public final void i(int i10, int i11) {
        if (this.f28213f == i10 && this.f28214g == i11) {
            return;
        }
        this.f28213f = i10;
        this.f28214g = i11;
        h(this.f28210a);
    }

    public final void j(org.telegram.messenger.kj kjVar) {
        Integer z10;
        String str;
        if (kjVar == null) {
            a();
            return;
        }
        Long valueOf = Long.valueOf(((long) kjVar.L0()) * 1000);
        if (valueOf.longValue() < 0) {
            a();
            return;
        }
        CharSequence charSequence = kjVar.f16747z;
        if (kjVar.e5()) {
            if (kjVar.B == null && (str = kjVar.f16690k.media.webpage.description) != null) {
                kjVar.B = SpannableString.valueOf(str);
                org.telegram.messenger.kj.h(kjVar.N3(), kjVar.B, false, 3, (int) valueOf.longValue(), false);
            }
            charSequence = kjVar.B;
        }
        if (charSequence != this.v || this.f28228w != valueOf.longValue()) {
            this.v = charSequence;
            this.f28228w = valueOf.longValue();
            if (!(charSequence instanceof Spanned)) {
                this.f28227u = null;
                this.f28230y = -1;
                this.f28229x = 0.0f;
                StaticLayout[] staticLayoutArr = this.f28231z;
                if (staticLayoutArr != null) {
                    staticLayoutArr[1] = null;
                    staticLayoutArr[0] = null;
                    return;
                }
                return;
            }
            Spanned spanned = (Spanned) charSequence;
            try {
                f51[] f51VarArr = (f51[]) spanned.getSpans(0, spanned.length(), f51.class);
                this.f28227u = new ArrayList();
                this.f28229x = 0.0f;
                if (this.A == null) {
                    TextPaint textPaint = new TextPaint(1);
                    this.A = textPaint;
                    textPaint.setTextSize(org.telegram.messenger.i0.L(12.0f));
                    this.A.setColor(-1);
                }
                for (f51 f51Var : f51VarArr) {
                    try {
                        if (f51Var != null && f51Var.getURL() != null && f51Var.d != null && f51Var.getURL().startsWith("audio?")) {
                            if (Utilities.z(f51Var.getURL().substring(6)).intValue() >= 0) {
                                float intValue = ((float) (z10.intValue() * 1000)) / ((float) valueOf.longValue());
                                org.telegram.messenger.k6.l(new SpannableStringBuilder(f51Var.d), this.A.getFontMetricsInt(), false);
                                this.f28227u.add(new Pair(Float.valueOf(intValue), f51Var));
                            }
                        }
                    } catch (Exception e) {
                        org.telegram.messenger.f8.g(e, true);
                    }
                }
                Collections.sort(this.f28227u, new org.telegram.ui.f6(16));
            } catch (Exception e7) {
                org.telegram.messenger.f8.g(e7, true);
                this.f28227u = null;
                this.f28230y = -1;
                this.f28229x = 0.0f;
                StaticLayout[] staticLayoutArr2 = this.f28231z;
                if (staticLayoutArr2 != null) {
                    staticLayoutArr2[1] = null;
                    staticLayoutArr2[0] = null;
                }
            }
        }
    }

    public void d(f51 f51Var) {
    }
}
