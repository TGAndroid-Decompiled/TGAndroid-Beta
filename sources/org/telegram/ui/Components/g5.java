package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.View;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public class g5 extends Drawable {
    public static SparseArray f34795r;
    public static HashMap f34796s;
    public static boolean f34797t;
    public static boolean f34798u;
    public static boolean v;
    public static final org.telegram.messenger.c6 f34799w = new org.telegram.messenger.c6(23);
    public static HashMap f34800x;
    public boolean f34801a;
    public ArrayList f34802b;
    public ArrayList f34803c;
    public int d;
    public TLRPC.Document f34804e;
    public long f34805f;
    public int f34806g;
    public int h;
    public String f34807i;
    public boolean f34808j;
    public fi.u2 f34809k;
    public boolean f34811m;
    public ColorFilter f34814p;
    public ColorFilter f34815q;
    public float f34810l = 1.0f;
    public Boolean f34812n = null;
    public Boolean f34813o = null;

    public g5(int i7, int i10, long j3) {
        this.h = i10;
        this.f34806g = i7;
        x();
        this.f34805f = j3;
        g(i10).b(j3, new y4(this, 0));
    }

    public static TLRPC.Document e(int i7, long j3) {
        HashMap hashMap = g(i7).f33502a;
        if (hashMap == null) {
            return null;
        }
        return (TLRPC.Document) hashMap.get(Long.valueOf(j3));
    }

    public static int f() {
        if (org.telegram.messenger.gz.o() == 0) {
            return 0;
        }
        return 2;
    }

    public static c5 g(int i7) {
        if (f34796s == null) {
            f34796s = new HashMap();
        }
        c5 c5Var = (c5) f34796s.get(Integer.valueOf(i7));
        if (c5Var == null) {
            HashMap hashMap = f34796s;
            Integer valueOf = Integer.valueOf(i7);
            c5 c5Var2 = new c5(i7);
            hashMap.put(valueOf, c5Var2);
            return c5Var2;
        }
        return c5Var;
    }

    public static g5 l(int i7, int i10, TLRPC.Document document) {
        if (f34795r == null) {
            f34795r = new SparseArray();
        }
        int hash = Objects.hash(Integer.valueOf(i7), Integer.valueOf(i10));
        LongSparseArray longSparseArray = (LongSparseArray) f34795r.get(hash);
        if (longSparseArray == null) {
            SparseArray sparseArray = f34795r;
            LongSparseArray longSparseArray2 = new LongSparseArray();
            sparseArray.put(hash, longSparseArray2);
            longSparseArray = longSparseArray2;
        }
        g5 g5Var = (g5) longSparseArray.get(document.f28057id);
        if (g5Var == null) {
            long j3 = document.f28057id;
            g5 g5Var2 = new g5(i10, i7, document);
            longSparseArray.put(j3, g5Var2);
            return g5Var2;
        }
        return g5Var;
    }

    public static g5 m(int i7, long j3, String str, int i10) {
        if (f34795r == null) {
            f34795r = new SparseArray();
        }
        int hash = Objects.hash(Integer.valueOf(i7), Integer.valueOf(i10));
        LongSparseArray longSparseArray = (LongSparseArray) f34795r.get(hash);
        if (longSparseArray == null) {
            SparseArray sparseArray = f34795r;
            LongSparseArray longSparseArray2 = new LongSparseArray();
            sparseArray.put(hash, longSparseArray2);
            longSparseArray = longSparseArray2;
        }
        g5 g5Var = (g5) longSparseArray.get(j3);
        if (g5Var == null) {
            ?? drawable = new Drawable();
            drawable.f34810l = 1.0f;
            drawable.f34812n = null;
            drawable.f34813o = null;
            drawable.h = i7;
            drawable.f34806g = i10;
            drawable.x();
            drawable.f34805f = j3;
            drawable.f34807i = str;
            g(i7).b(j3, new y4(drawable, 1));
            longSparseArray.put(j3, drawable);
            return drawable;
        }
        return g5Var;
    }

    public static void r(int i7, boolean z10) {
        LongSparseArray longSparseArray;
        fi.u2 u2Var;
        boolean z11 = !z10;
        if (v != z11) {
            v = z11;
            if (f34795r != null && (longSparseArray = (LongSparseArray) f34795r.get(Objects.hash(Integer.valueOf(i7), 25))) != null) {
                for (int i10 = 0; i10 < longSparseArray.size(); i10++) {
                    g5 g5Var = (g5) longSparseArray.valueAt(i10);
                    if (g5Var != null && (u2Var = g5Var.f34809k) != null) {
                        if (z10) {
                            u2Var.f22303v0 = true;
                            u2Var.f22301u0 = true;
                            u2Var.W(1);
                            t5 m10 = u2Var.m();
                            if (m10 != null) {
                                boolean z12 = u2Var.f22306w0;
                                if (!m10.f39527o0) {
                                    m10.f39538w0 = z12;
                                }
                                m10.start();
                            } else {
                                ch0 B = u2Var.B();
                                if (B != null) {
                                    B.start();
                                }
                            }
                        } else {
                            u2Var.f22301u0 = false;
                            u2Var.f22303v0 = false;
                            u2Var.W(0);
                            u2Var.Q0();
                        }
                    }
                }
            }
        }
    }

    public static void t() {
        if (f34795r != null) {
            w();
            for (int i7 = 0; i7 < f34795r.size(); i7++) {
                LongSparseArray longSparseArray = (LongSparseArray) f34795r.valueAt(i7);
                for (int i10 = 0; i10 < longSparseArray.size(); i10++) {
                    long keyAt = longSparseArray.keyAt(i10);
                    g5 g5Var = (g5) longSparseArray.get(keyAt);
                    if (g5Var != null && g5Var.f34801a) {
                        g5Var.i(true);
                    } else {
                        longSparseArray.remove(keyAt);
                    }
                }
            }
        }
    }

    public static void w() {
        f34797t = org.telegram.messenger.qc.e(16388);
        f34798u = org.telegram.messenger.qc.e(8200);
    }

    public final void a(View view) {
        if (!(view instanceof org.telegram.ui.q01)) {
            this.f34811m = false;
            if (this.f34802b == null) {
                this.f34802b = new ArrayList(10);
            }
            if (!this.f34802b.contains(view)) {
                this.f34802b.add(view);
            }
            u();
            return;
        }
        throw new RuntimeException();
    }

    public final void b(m5 m5Var) {
        if (this.f34803c == null) {
            this.f34803c = new ArrayList(10);
        }
        this.f34811m = false;
        if (!this.f34803c.contains(m5Var)) {
            this.f34803c.add(m5Var);
        }
        u();
    }

    public final boolean c() {
        boolean z10 = true;
        if (this.f34806g == 19) {
            return true;
        }
        Boolean bool = this.f34812n;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (this.f34804e == null) {
            return false;
        }
        if (!k() && !org.telegram.messenger.gj.C4(this.f34804e)) {
            z10 = false;
        }
        this.f34812n = Boolean.valueOf(z10);
        return z10;
    }

    public final void d() {
        ArrayList arrayList = this.f34803c;
        if (arrayList != null) {
            arrayList.clear();
        }
        ArrayList arrayList2 = this.f34802b;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        this.f34811m = false;
        u();
    }

    @Override
    public final void draw(Canvas canvas) {
        fi.u2 u2Var = this.f34809k;
        if (u2Var == null) {
            return;
        }
        u2Var.z0(getBounds());
        this.f34809k.setAlpha(this.f34810l);
        this.f34809k.h(canvas, null);
    }

    @Override
    public final int getAlpha() {
        return (int) (this.f34810l * 255.0f);
    }

    @Override
    public final ColorFilter getColorFilter() {
        return this.f34815q;
    }

    @Override
    public int getIntrinsicHeight() {
        return org.telegram.messenger.g0.L(this.d);
    }

    @Override
    public int getIntrinsicWidth() {
        return org.telegram.messenger.g0.L(this.d);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    public final long h() {
        TLRPC.Document document = this.f34804e;
        if (document != null) {
            return document.f28057id;
        }
        return this.f34805f;
    }

    public final void i(boolean r36) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.g5.i(boolean):void");
    }

    public final void j() {
        if (this.f34802b != null) {
            for (int i7 = 0; i7 < this.f34802b.size(); i7++) {
                View view = (View) this.f34802b.get(i7);
                if (view != null) {
                    view.invalidate();
                }
            }
        }
        if (this.f34803c != null) {
            for (int i10 = 0; i10 < this.f34803c.size(); i10++) {
                m5 m5Var = (m5) this.f34803c.get(i10);
                if (m5Var != null) {
                    m5Var.invalidate();
                }
            }
        }
    }

    public final boolean k() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.g5.k():boolean");
    }

    public final void n(View view) {
        ArrayList arrayList = this.f34802b;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        this.f34811m = false;
        u();
    }

    public final void o(m5 m5Var) {
        ArrayList arrayList = this.f34803c;
        if (arrayList != null) {
            arrayList.remove(m5Var);
        }
        this.f34811m = false;
        u();
    }

    public final void p(long j3) {
        fi.u2 u2Var = this.f34809k;
        if (u2Var != null) {
            if (this.f34806g == 8) {
                j3 = 0;
            }
            u2Var.f22296s = j3;
        }
    }

    public final void q(String str) {
        fi.u2 u2Var;
        int i7 = this.f34806g;
        if ((i7 != 20 && i7 != 21) || TextUtils.isEmpty(str) || (u2Var = this.f34809k) != null) {
            return;
        }
        if (u2Var == null) {
            fi.u2 u2Var2 = new fi.u2(this, 4);
            this.f34809k = u2Var2;
            u2Var2.d = this.h;
            u2Var2.A1 = true;
            if (i7 == 12) {
                u2Var2.f22311y = true;
            }
        }
        this.f34808j = true;
        this.f34809k.w0(org.telegram.messenger.j6.g(str));
        this.f34809k.B0 = true;
    }

    public final void s(long j3) {
        fi.u2 u2Var = this.f34809k;
        if (u2Var != null) {
            if (this.f34806g == 8) {
                j3 = 0;
            }
            if (u2Var.B() != null) {
                this.f34809k.B().V(j3);
            }
            if (this.f34809k.m() != null) {
                this.f34809k.m().D(j3);
            }
        }
    }

    @Override
    public final void setAlpha(int i7) {
        float f10 = i7 / 255.0f;
        this.f34810l = f10;
        fi.u2 u2Var = this.f34809k;
        if (u2Var != null) {
            u2Var.setAlpha(f10);
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f34815q = colorFilter;
        if (this.f34809k != null && this.f34804e != null) {
            if (c()) {
                this.f34809k.f22290p1 = colorFilter;
                return;
            }
            return;
        }
        this.f34814p = colorFilter;
    }

    public final String toString() {
        String V;
        StringBuilder sb2 = new StringBuilder("AnimatedEmojiDrawable{");
        TLRPC.Document document = this.f34804e;
        if (document == null) {
            V = "null";
        } else {
            V = org.telegram.messenger.gj.V(document, null, null);
        }
        return a8.p0.s(sb2, V, "}");
    }

    public final void u() {
        ArrayList arrayList;
        boolean z10;
        if (this.f34809k != null) {
            ArrayList arrayList2 = this.f34802b;
            if ((arrayList2 != null && arrayList2.size() > 0) || (((arrayList = this.f34803c) != null && arrayList.size() > 0) || this.f34811m)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 != this.f34801a) {
                this.f34801a = z10;
                if (z10) {
                    this.f34809k.P();
                } else {
                    this.f34809k.R();
                }
                if (!this.f34801a) {
                    org.telegram.messenger.c6 c6Var = f34799w;
                    org.telegram.messenger.g0.r(c6Var);
                    org.telegram.messenger.g0.i3(c6Var, 5000L);
                }
            }
        }
    }

    public final void v(ImageReceiver imageReceiver) {
        int i7 = this.f34806g;
        if (i7 != 7 && i7 != 9 && i7 != 10) {
            if (i7 != 11 && i7 != 18 && i7 != 14 && i7 != 6 && i7 != 5 && i7 != 22) {
                if (i7 == 17) {
                    imageReceiver.X(0);
                    return;
                }
                return;
            }
            imageReceiver.X(1);
            return;
        }
        imageReceiver.X(2);
    }

    public final void x() {
        int i7 = this.f34806g;
        if (i7 != 0 && i7 != 26) {
            TextPaint[] textPaintArr = org.telegram.ui.ActionBar.j6.f29237y2;
            if (textPaintArr != null && (i7 == 1 || i7 == 4 || i7 == 19 || i7 == 20)) {
                this.d = (int) (((Math.abs(org.telegram.ui.ActionBar.j6.f29237y2[2].descent()) + Math.abs(textPaintArr[2].ascent())) * 1.15f) / org.telegram.messenger.g0.f23608p);
                return;
            } else if (textPaintArr != null && i7 == 8) {
                this.d = (int) (((Math.abs(org.telegram.ui.ActionBar.j6.f29237y2[0].descent()) + Math.abs(textPaintArr[0].ascent())) * 1.15f) / org.telegram.messenger.g0.f23608p);
                return;
            } else if (i7 != 14 && i7 != 15 && i7 != 17) {
                if (i7 != 11 && i7 != 22) {
                    if (i7 == 27) {
                        this.d = 50;
                        return;
                    } else if (i7 == 24) {
                        this.d = 140;
                        return;
                    } else if (i7 == 23) {
                        this.d = 14;
                        return;
                    } else if (i7 == 21) {
                        this.d = 90;
                        return;
                    } else {
                        this.d = 34;
                        return;
                    }
                }
                this.d = 56;
                return;
            } else {
                this.d = 100;
                return;
            }
        }
        this.d = (int) (((Math.abs(org.telegram.ui.ActionBar.j6.f29046o2.descent()) + Math.abs(org.telegram.ui.ActionBar.j6.f29046o2.ascent())) * 1.15f) / org.telegram.messenger.g0.f23608p);
    }

    public g5(int i7, int i10, TLRPC.Document document) {
        this.f34806g = i7;
        this.h = i10;
        this.f34804e = document;
        x();
        w();
        i(false);
    }
}
