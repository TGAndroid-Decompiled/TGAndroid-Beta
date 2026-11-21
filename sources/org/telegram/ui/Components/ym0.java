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
    public float f42464a;
    public int f42468f;
    public int f42469g;
    public xm0 h;
    public int f42470i;
    public int f42471j;
    public int f42472k;
    public int f42473l;
    public int f42474m;
    public boolean f42477p;
    public float f42478q;
    public float f42479r;
    public View f42480s;
    public ArrayList f42482u;
    public CharSequence v;
    public long f42483w;
    public StaticLayout[] f42486z;
    public int f42465b = 0;
    public int f42466c = 0;
    public int d = 0;
    public boolean f42467e = false;
    public final RectF f42475n = new RectF();
    public final int f42476o = org.telegram.messenger.g0.L(2.0f);
    public float f42481t = 1.0f;
    public float f42484x = 0.0f;
    public int f42485y = -1;
    public float B = 1.0f;

    public ym0(View view) {
        if (D == null) {
            D = new Paint(1);
        }
        this.f42480s = view;
        E = org.telegram.messenger.g0.L(24.0f);
        this.f42479r = org.telegram.messenger.g0.L(6.0f);
    }

    public final void a() {
        this.f42482u = null;
        this.f42485y = -1;
        this.f42484x = 0.0f;
        StaticLayout[] staticLayoutArr = this.f42486z;
        if (staticLayoutArr != null) {
            staticLayoutArr[1] = null;
            staticLayoutArr[0] = null;
        }
        this.v = null;
        this.f42483w = -1L;
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
        float f12 = this.f42481t;
        if (f12 > 0.0f) {
            if (f12 < 1.0f) {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, this.f42468f, this.f42469g, (int) (f12 * 255.0f), 31);
            } else {
                canvas2 = canvas;
            }
            int i17 = E / 2;
            int i18 = this.f42469g / 2;
            int i19 = this.f42476o / 2;
            RectF rectF = this.f42475n;
            rectF.set(i17, i18 - i19, this.f42468f - i17, i18 + i19);
            Paint paint = D;
            if (this.f42477p) {
                i7 = this.f42474m;
            } else {
                i7 = this.f42470i;
            }
            paint.setColor(i7);
            c(canvas2, rectF, D);
            if (this.f42478q > 0.0f) {
                Paint paint2 = D;
                if (this.f42477p) {
                    i15 = this.f42474m;
                } else {
                    i15 = this.f42471j;
                }
                paint2.setColor(i15);
                float f13 = E / 2;
                int i20 = this.f42469g / 2;
                rectF.set(f13, i20 - i19, (this.f42478q * (this.f42468f - i16)) + f13, i20 + i19);
                c(canvas2, rectF, D);
            }
            float f14 = E / 2;
            float f15 = (this.f42469g / 2) - i19;
            if (this.f42467e) {
                i12 = this.f42466c;
            } else {
                i12 = this.f42465b;
            }
            rectF.set(f14, f15, i10 + i12, i19 + i11);
            D.setColor(this.f42473l);
            c(canvas2, rectF, D);
            D.setColor(this.f42472k);
            if (this.f42467e) {
                f10 = 8.0f;
            } else {
                f10 = 6.0f;
            }
            float L = org.telegram.messenger.g0.L(f10);
            if (this.f42479r != L) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (elapsedRealtime > 18) {
                    elapsedRealtime = 16;
                }
                float f16 = this.f42479r;
                if (f16 < L) {
                    float c10 = com.google.android.gms.internal.vision.e2.c((float) elapsedRealtime, 60.0f, org.telegram.messenger.g0.L(1.0f), f16);
                    this.f42479r = c10;
                    if (c10 > L) {
                        this.f42479r = L;
                    }
                } else {
                    float w10 = org.telegram.messenger.n10.w((float) elapsedRealtime, 60.0f, org.telegram.messenger.g0.L(1.0f), f16);
                    this.f42479r = w10;
                    if (w10 < L) {
                        this.f42479r = L;
                    }
                }
                View view = this.f42480s;
                if (view != null) {
                    view.invalidate();
                }
            }
            if (this.f42467e) {
                i13 = this.f42466c;
            } else {
                i13 = this.f42465b;
            }
            canvas2.drawCircle((E / 2) + i13, this.f42469g / 2, this.f42479r, D);
            if (this.f42481t < 1.0f) {
                canvas2.restore();
            }
            ArrayList arrayList = this.f42482u;
            if (arrayList != null && !arrayList.isEmpty()) {
                if (this.f42467e) {
                    i14 = this.f42466c;
                } else {
                    i14 = this.f42465b;
                }
                float f17 = i14 / (this.f42468f - E);
                int size = this.f42482u.size() - 1;
                while (true) {
                    if (size >= 0) {
                        if (((Float) ((Pair) this.f42482u.get(size)).first).floatValue() - 0.001f <= f17) {
                            break;
                        }
                        size--;
                    } else {
                        size = -1;
                        break;
                    }
                }
                if (this.f42486z == null) {
                    this.f42486z = new StaticLayout[2];
                }
                float f18 = E / 2.0f;
                Math.abs(f18 - (this.f42468f - f18));
                org.telegram.messenger.g0.L(66.0f);
                if (size != this.f42485y) {
                    if (this.f42467e) {
                        org.telegram.messenger.g0.a4(this.f42480s);
                    }
                    this.f42485y = size;
                    if (size >= 0 && size < this.f42482u.size()) {
                        d((s41) ((Pair) this.f42482u.get(this.f42485y)).second);
                    }
                }
                if (this.B < 1.0f) {
                    long min = Math.min(17L, Math.abs(SystemClock.elapsedRealtime() - this.C));
                    if (this.f42482u.size() > 8) {
                        f11 = 160.0f;
                    } else {
                        f11 = 220.0f;
                    }
                    this.B = Math.min((((float) min) / f11) + this.B, 1.0f);
                    View view2 = this.f42480s;
                    if (view2 != null) {
                        view2.invalidate();
                    }
                    this.C = SystemClock.elapsedRealtime();
                }
                if (this.f42484x < 1.0f) {
                    this.f42484x = Math.min((((float) Math.min(17L, Math.abs(SystemClock.elapsedRealtime() - this.C))) / 200.0f) + this.f42484x, 1.0f);
                    View view3 = this.f42480s;
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
            int i10 = this.f42469g;
            int i11 = E;
            int i12 = (i10 - i11) / 2;
            if (f10 >= (-i12)) {
                int i13 = this.f42468f;
                if (f10 <= i13 + i12 && f11 >= 0.0f && f11 <= i10) {
                    int i14 = this.f42465b;
                    if (i14 - i12 > f10 || f10 > i14 + i11 + i12) {
                        int i15 = ((int) f10) - (i11 / 2);
                        this.f42465b = i15;
                        if (i15 < 0) {
                            this.f42465b = 0;
                        } else {
                            int i16 = i13 - i11;
                            if (i15 > i16) {
                                this.f42465b = i16;
                            }
                        }
                    }
                    this.f42467e = true;
                    int i17 = this.f42465b;
                    this.f42466c = i17;
                    this.d = (int) (f10 - i17);
                    return true;
                }
            }
        } else if (i7 != 1 && i7 != 3) {
            if (i7 == 2 && this.f42467e) {
                int i18 = (int) (f10 - this.d);
                this.f42466c = i18;
                if (i18 < 0) {
                    this.f42466c = 0;
                } else {
                    int i19 = this.f42468f - E;
                    if (i18 > i19) {
                        this.f42466c = i19;
                    }
                }
                xm0 xm0Var2 = this.h;
                if (xm0Var2 != null) {
                    xm0Var2.g(this.f42466c / (this.f42468f - E));
                }
                return true;
            }
        } else if (this.f42467e) {
            int i20 = this.f42466c;
            this.f42465b = i20;
            if (i7 == 1 && (xm0Var = this.h) != null) {
                xm0Var.a(i20 / (this.f42468f - E));
            }
            this.f42467e = false;
            return true;
        }
        return false;
    }

    public final void f(float f10) {
        this.f42481t = f10;
    }

    public final void g(int i7, int i10, int i11, int i12, int i13) {
        this.f42470i = i7;
        this.f42471j = i10;
        this.f42472k = i12;
        this.f42473l = i11;
        this.f42474m = i13;
    }

    public final void h(float f10) {
        this.f42464a = f10;
        int ceil = (int) Math.ceil((this.f42468f - E) * f10);
        this.f42465b = ceil;
        if (ceil < 0) {
            this.f42465b = 0;
            return;
        }
        int i7 = this.f42468f;
        int i10 = E;
        if (ceil > i7 - i10) {
            this.f42465b = i7 - i10;
        }
    }

    public final void i(int i7, int i10) {
        if (this.f42468f == i7 && this.f42469g == i10) {
            return;
        }
        this.f42468f = i7;
        this.f42469g = i10;
        h(this.f42464a);
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
        CharSequence charSequence = fjVar.f24051z;
        if (fjVar.e5()) {
            if (fjVar.B == null && (str = fjVar.f23993k.media.webpage.description) != null) {
                fjVar.B = SpannableString.valueOf(str);
                org.telegram.messenger.fj.h(fjVar.N3(), fjVar.B, false, 3, (int) valueOf.longValue(), false);
            }
            charSequence = fjVar.B;
        }
        if (charSequence != this.v || this.f42483w != valueOf.longValue()) {
            this.v = charSequence;
            this.f42483w = valueOf.longValue();
            if (!(charSequence instanceof Spanned)) {
                this.f42482u = null;
                this.f42485y = -1;
                this.f42484x = 0.0f;
                StaticLayout[] staticLayoutArr = this.f42486z;
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
                this.f42482u = new ArrayList();
                this.f42484x = 0.0f;
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
                                this.f42482u.add(new Pair(Float.valueOf(intValue), s41Var));
                            }
                        }
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                    }
                }
                Collections.sort(this.f42482u, new org.telegram.ui.pe(13));
            } catch (Exception e11) {
                org.telegram.messenger.a8.g(e11, true);
                this.f42482u = null;
                this.f42485y = -1;
                this.f42484x = 0.0f;
                StaticLayout[] staticLayoutArr2 = this.f42486z;
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
