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
public class mm0 {
    public static Paint D;
    public static int E;
    public static float[] F;
    public static Path G;
    public TextPaint A;
    public long C;
    public float f36188a;
    public int f36192f;
    public int f36193g;
    public lm0 h;
    public int f36194i;
    public int f36195j;
    public int f36196k;
    public int f36197l;
    public int f36198m;
    public boolean f36201p;
    public float f36202q;
    public float f36203r;
    public View f36204s;
    public ArrayList f36206u;
    public CharSequence v;
    public long f36207w;
    public StaticLayout[] f36210z;
    public int f36189b = 0;
    public int f36190c = 0;
    public int d = 0;
    public boolean f36191e = false;
    public final RectF f36199n = new RectF();
    public final int f36200o = org.telegram.messenger.g0.L(2.0f);
    public float f36205t = 1.0f;
    public float f36208x = 0.0f;
    public int f36209y = -1;
    public float B = 1.0f;

    public mm0(View view) {
        if (D == null) {
            D = new Paint(1);
        }
        this.f36204s = view;
        E = org.telegram.messenger.g0.L(24.0f);
        this.f36203r = org.telegram.messenger.g0.L(6.0f);
    }

    public final void a() {
        this.f36206u = null;
        this.f36209y = -1;
        this.f36208x = 0.0f;
        StaticLayout[] staticLayoutArr = this.f36210z;
        if (staticLayoutArr != null) {
            staticLayoutArr[1] = null;
            staticLayoutArr[0] = null;
        }
        this.v = null;
        this.f36207w = -1L;
    }

    public final void b(Canvas canvas) {
        Canvas canvas2;
        int i3;
        int i10;
        int i11;
        int i12;
        float f10;
        int i13;
        int i14;
        float f11;
        int i15;
        int i16;
        float f12 = this.f36205t;
        if (f12 > 0.0f) {
            if (f12 < 1.0f) {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, this.f36192f, this.f36193g, (int) (f12 * 255.0f), 31);
            } else {
                canvas2 = canvas;
            }
            int i17 = E / 2;
            int i18 = this.f36193g / 2;
            int i19 = this.f36200o / 2;
            RectF rectF = this.f36199n;
            rectF.set(i17, i18 - i19, this.f36192f - i17, i18 + i19);
            Paint paint = D;
            if (this.f36201p) {
                i3 = this.f36198m;
            } else {
                i3 = this.f36194i;
            }
            paint.setColor(i3);
            c(canvas2, rectF, D);
            if (this.f36202q > 0.0f) {
                Paint paint2 = D;
                if (this.f36201p) {
                    i15 = this.f36198m;
                } else {
                    i15 = this.f36195j;
                }
                paint2.setColor(i15);
                float f13 = E / 2;
                int i20 = this.f36193g / 2;
                rectF.set(f13, i20 - i19, (this.f36202q * (this.f36192f - i16)) + f13, i20 + i19);
                c(canvas2, rectF, D);
            }
            float f14 = E / 2;
            float f15 = (this.f36193g / 2) - i19;
            if (this.f36191e) {
                i12 = this.f36190c;
            } else {
                i12 = this.f36189b;
            }
            rectF.set(f14, f15, i10 + i12, i19 + i11);
            D.setColor(this.f36197l);
            c(canvas2, rectF, D);
            D.setColor(this.f36196k);
            if (this.f36191e) {
                f10 = 8.0f;
            } else {
                f10 = 6.0f;
            }
            float L = org.telegram.messenger.g0.L(f10);
            if (this.f36203r != L) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (elapsedRealtime > 18) {
                    elapsedRealtime = 16;
                }
                float f16 = this.f36203r;
                if (f16 < L) {
                    float A = a1.g.A((float) elapsedRealtime, 60.0f, org.telegram.messenger.g0.L(1.0f), f16);
                    this.f36203r = A;
                    if (A > L) {
                        this.f36203r = L;
                    }
                } else {
                    float v = org.telegram.messenger.camera.q.v((float) elapsedRealtime, 60.0f, org.telegram.messenger.g0.L(1.0f), f16);
                    this.f36203r = v;
                    if (v < L) {
                        this.f36203r = L;
                    }
                }
                View view = this.f36204s;
                if (view != null) {
                    view.invalidate();
                }
            }
            if (this.f36191e) {
                i13 = this.f36190c;
            } else {
                i13 = this.f36189b;
            }
            canvas2.drawCircle((E / 2) + i13, this.f36193g / 2, this.f36203r, D);
            if (this.f36205t < 1.0f) {
                canvas2.restore();
            }
            ArrayList arrayList = this.f36206u;
            if (arrayList != null && !arrayList.isEmpty()) {
                if (this.f36191e) {
                    i14 = this.f36190c;
                } else {
                    i14 = this.f36189b;
                }
                float f17 = i14 / (this.f36192f - E);
                int size = this.f36206u.size() - 1;
                while (true) {
                    if (size >= 0) {
                        if (((Float) ((Pair) this.f36206u.get(size)).first).floatValue() - 0.001f <= f17) {
                            break;
                        }
                        size--;
                    } else {
                        size = -1;
                        break;
                    }
                }
                if (this.f36210z == null) {
                    this.f36210z = new StaticLayout[2];
                }
                float f18 = E / 2.0f;
                Math.abs(f18 - (this.f36192f - f18));
                org.telegram.messenger.g0.L(66.0f);
                if (size != this.f36209y) {
                    if (this.f36191e) {
                        org.telegram.messenger.g0.c4(this.f36204s);
                    }
                    this.f36209y = size;
                    if (size >= 0 && size < this.f36206u.size()) {
                        d((v31) ((Pair) this.f36206u.get(this.f36209y)).second);
                    }
                }
                if (this.B < 1.0f) {
                    long min = Math.min(17L, Math.abs(SystemClock.elapsedRealtime() - this.C));
                    if (this.f36206u.size() > 8) {
                        f11 = 160.0f;
                    } else {
                        f11 = 220.0f;
                    }
                    this.B = Math.min((((float) min) / f11) + this.B, 1.0f);
                    View view2 = this.f36204s;
                    if (view2 != null) {
                        view2.invalidate();
                    }
                    this.C = SystemClock.elapsedRealtime();
                }
                if (this.f36208x < 1.0f) {
                    this.f36208x = Math.min((((float) Math.min(17L, Math.abs(SystemClock.elapsedRealtime() - this.C))) / 200.0f) + this.f36208x, 1.0f);
                    View view3 = this.f36204s;
                    if (view3 != null) {
                        view3.invalidate();
                    }
                    SystemClock.elapsedRealtime();
                }
            }
        }
    }

    public final void c(android.graphics.Canvas r26, android.graphics.RectF r27, android.graphics.Paint r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.mm0.c(android.graphics.Canvas, android.graphics.RectF, android.graphics.Paint):void");
    }

    public final boolean e(float f10, float f11, int i3) {
        lm0 lm0Var;
        if (i3 == 0) {
            int i10 = this.f36193g;
            int i11 = E;
            int i12 = (i10 - i11) / 2;
            if (f10 >= (-i12)) {
                int i13 = this.f36192f;
                if (f10 <= i13 + i12 && f11 >= 0.0f && f11 <= i10) {
                    int i14 = this.f36189b;
                    if (i14 - i12 > f10 || f10 > i14 + i11 + i12) {
                        int i15 = ((int) f10) - (i11 / 2);
                        this.f36189b = i15;
                        if (i15 < 0) {
                            this.f36189b = 0;
                        } else {
                            int i16 = i13 - i11;
                            if (i15 > i16) {
                                this.f36189b = i16;
                            }
                        }
                    }
                    this.f36191e = true;
                    int i17 = this.f36189b;
                    this.f36190c = i17;
                    this.d = (int) (f10 - i17);
                    return true;
                }
            }
        } else if (i3 != 1 && i3 != 3) {
            if (i3 == 2 && this.f36191e) {
                int i18 = (int) (f10 - this.d);
                this.f36190c = i18;
                if (i18 < 0) {
                    this.f36190c = 0;
                } else {
                    int i19 = this.f36192f - E;
                    if (i18 > i19) {
                        this.f36190c = i19;
                    }
                }
                lm0 lm0Var2 = this.h;
                if (lm0Var2 != null) {
                    lm0Var2.d(this.f36190c / (this.f36192f - E));
                }
                return true;
            }
        } else if (this.f36191e) {
            int i20 = this.f36190c;
            this.f36189b = i20;
            if (i3 == 1 && (lm0Var = this.h) != null) {
                lm0Var.c(i20 / (this.f36192f - E));
            }
            this.f36191e = false;
            return true;
        }
        return false;
    }

    public final void f(float f10) {
        this.f36205t = f10;
    }

    public final void g(int i3, int i10, int i11, int i12, int i13) {
        this.f36194i = i3;
        this.f36195j = i10;
        this.f36196k = i12;
        this.f36197l = i11;
        this.f36198m = i13;
    }

    public final void h(float f10) {
        this.f36188a = f10;
        int ceil = (int) Math.ceil((this.f36192f - E) * f10);
        this.f36189b = ceil;
        if (ceil < 0) {
            this.f36189b = 0;
            return;
        }
        int i3 = this.f36192f;
        int i10 = E;
        if (ceil > i3 - i10) {
            this.f36189b = i3 - i10;
        }
    }

    public final void i(int i3, int i10) {
        if (this.f36192f == i3 && this.f36193g == i10) {
            return;
        }
        this.f36192f = i3;
        this.f36193g = i10;
        h(this.f36188a);
    }

    public final void j(org.telegram.messenger.zi ziVar) {
        Integer z10;
        String str;
        if (ziVar == null) {
            a();
            return;
        }
        Long valueOf = Long.valueOf(((long) ziVar.L0()) * 1000);
        if (valueOf.longValue() < 0) {
            a();
            return;
        }
        CharSequence charSequence = ziVar.f26924z;
        if (ziVar.f5()) {
            if (ziVar.B == null && (str = ziVar.f26868k.media.webpage.description) != null) {
                ziVar.B = SpannableString.valueOf(str);
                org.telegram.messenger.zi.h(ziVar.O3(), ziVar.B, false, 3, (int) valueOf.longValue(), false);
            }
            charSequence = ziVar.B;
        }
        if (charSequence != this.v || this.f36207w != valueOf.longValue()) {
            this.v = charSequence;
            this.f36207w = valueOf.longValue();
            if (!(charSequence instanceof Spanned)) {
                this.f36206u = null;
                this.f36209y = -1;
                this.f36208x = 0.0f;
                StaticLayout[] staticLayoutArr = this.f36210z;
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
                this.f36206u = new ArrayList();
                this.f36208x = 0.0f;
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
                                float intValue = ((float) (z10.intValue() * 1000)) / ((float) valueOf.longValue());
                                org.telegram.messenger.i6.l(new SpannableStringBuilder(v31Var.d), this.A.getFontMetricsInt(), false);
                                this.f36206u.add(new Pair(Float.valueOf(intValue), v31Var));
                            }
                        }
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                    }
                }
                Collections.sort(this.f36206u, new d80(4));
            } catch (Exception e11) {
                org.telegram.messenger.a8.g(e11, true);
                this.f36206u = null;
                this.f36209y = -1;
                this.f36208x = 0.0f;
                StaticLayout[] staticLayoutArr2 = this.f36210z;
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
