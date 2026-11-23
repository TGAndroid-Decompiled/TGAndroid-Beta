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
public class o5 extends Drawable {
    public static SparseArray f38014r;
    public static HashMap f38015s;
    public static boolean f38016t;
    public static boolean f38017u;
    public static boolean v;
    public static final org.telegram.messenger.j2 f38018w = new org.telegram.messenger.j2(25);
    public static HashMap f38019x;
    public boolean f38020a;
    public ArrayList f38021b;
    public ArrayList f38022c;
    public int d;
    public TLRPC.Document f38023e;
    public long f38024f;
    public int f38025g;
    public int h;
    public String f38026i;
    public boolean f38027j;
    public fi.s2 f38028k;
    public boolean f38030m;
    public ColorFilter f38033p;
    public ColorFilter f38034q;
    public float f38029l = 1.0f;
    public Boolean f38031n = null;
    public Boolean f38032o = null;

    public o5(int i7, int i10, long j3) {
        this.h = i10;
        this.f38025g = i7;
        x();
        this.f38024f = j3;
        g(i10).b(j3, new g5(this, 0));
    }

    public static TLRPC.Document e(int i7, long j3) {
        HashMap hashMap = g(i7).f36647a;
        if (hashMap == null) {
            return null;
        }
        return (TLRPC.Document) hashMap.get(Long.valueOf(j3));
    }

    public static int f() {
        if (org.telegram.messenger.bz.o() == 0) {
            return 0;
        }
        return 2;
    }

    public static k5 g(int i7) {
        if (f38015s == null) {
            f38015s = new HashMap();
        }
        k5 k5Var = (k5) f38015s.get(Integer.valueOf(i7));
        if (k5Var == null) {
            HashMap hashMap = f38015s;
            Integer valueOf = Integer.valueOf(i7);
            k5 k5Var2 = new k5(i7);
            hashMap.put(valueOf, k5Var2);
            return k5Var2;
        }
        return k5Var;
    }

    public static o5 l(int i7, int i10, TLRPC.Document document) {
        if (f38014r == null) {
            f38014r = new SparseArray();
        }
        int hash = Objects.hash(Integer.valueOf(i7), Integer.valueOf(i10));
        LongSparseArray longSparseArray = (LongSparseArray) f38014r.get(hash);
        if (longSparseArray == null) {
            SparseArray sparseArray = f38014r;
            LongSparseArray longSparseArray2 = new LongSparseArray();
            sparseArray.put(hash, longSparseArray2);
            longSparseArray = longSparseArray2;
        }
        o5 o5Var = (o5) longSparseArray.get(document.f28498id);
        if (o5Var == null) {
            long j3 = document.f28498id;
            o5 o5Var2 = new o5(i10, i7, document);
            longSparseArray.put(j3, o5Var2);
            return o5Var2;
        }
        return o5Var;
    }

    public static o5 m(int i7, long j3, String str, int i10) {
        if (f38014r == null) {
            f38014r = new SparseArray();
        }
        int hash = Objects.hash(Integer.valueOf(i7), Integer.valueOf(i10));
        LongSparseArray longSparseArray = (LongSparseArray) f38014r.get(hash);
        if (longSparseArray == null) {
            SparseArray sparseArray = f38014r;
            LongSparseArray longSparseArray2 = new LongSparseArray();
            sparseArray.put(hash, longSparseArray2);
            longSparseArray = longSparseArray2;
        }
        o5 o5Var = (o5) longSparseArray.get(j3);
        if (o5Var == null) {
            ?? drawable = new Drawable();
            drawable.f38029l = 1.0f;
            drawable.f38031n = null;
            drawable.f38032o = null;
            drawable.h = i7;
            drawable.f38025g = i10;
            drawable.x();
            drawable.f38024f = j3;
            drawable.f38026i = str;
            g(i7).b(j3, new g5(drawable, 1));
            longSparseArray.put(j3, drawable);
            return drawable;
        }
        return o5Var;
    }

    public static void r(int i7, boolean z10) {
        LongSparseArray longSparseArray;
        fi.s2 s2Var;
        boolean z11 = !z10;
        if (v != z11) {
            v = z11;
            if (f38014r != null && (longSparseArray = (LongSparseArray) f38014r.get(Objects.hash(Integer.valueOf(i7), 25))) != null) {
                for (int i10 = 0; i10 < longSparseArray.size(); i10++) {
                    o5 o5Var = (o5) longSparseArray.valueAt(i10);
                    if (o5Var != null && (s2Var = o5Var.f38028k) != null) {
                        if (z10) {
                            s2Var.f22764v0 = true;
                            s2Var.f22762u0 = true;
                            s2Var.X(1);
                            b6 m10 = s2Var.m();
                            if (m10 != null) {
                                boolean z12 = s2Var.f22767w0;
                                if (!m10.f33655o0) {
                                    m10.f33666w0 = z12;
                                }
                                m10.start();
                            } else {
                                nh0 C = s2Var.C();
                                if (C != null) {
                                    C.start();
                                }
                            }
                        } else {
                            s2Var.f22762u0 = false;
                            s2Var.f22764v0 = false;
                            s2Var.X(0);
                            s2Var.R0();
                        }
                    }
                }
            }
        }
    }

    public static void t() {
        if (f38014r != null) {
            w();
            for (int i7 = 0; i7 < f38014r.size(); i7++) {
                LongSparseArray longSparseArray = (LongSparseArray) f38014r.valueAt(i7);
                for (int i10 = 0; i10 < longSparseArray.size(); i10++) {
                    long keyAt = longSparseArray.keyAt(i10);
                    o5 o5Var = (o5) longSparseArray.get(keyAt);
                    if (o5Var != null && o5Var.f38020a) {
                        o5Var.i(true);
                    } else {
                        longSparseArray.remove(keyAt);
                    }
                }
            }
        }
    }

    public static void w() {
        f38016t = org.telegram.messenger.pc.e(16388);
        f38017u = org.telegram.messenger.pc.e(8200);
    }

    public final void a(View view) {
        if (!(view instanceof org.telegram.ui.t01)) {
            this.f38030m = false;
            if (this.f38021b == null) {
                this.f38021b = new ArrayList(10);
            }
            if (!this.f38021b.contains(view)) {
                this.f38021b.add(view);
            }
            u();
            return;
        }
        throw new RuntimeException();
    }

    public final void b(u5 u5Var) {
        if (this.f38022c == null) {
            this.f38022c = new ArrayList(10);
        }
        this.f38030m = false;
        if (!this.f38022c.contains(u5Var)) {
            this.f38022c.add(u5Var);
        }
        u();
    }

    public final boolean c() {
        boolean z10 = true;
        if (this.f38025g == 19) {
            return true;
        }
        Boolean bool = this.f38031n;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (this.f38023e == null) {
            return false;
        }
        if (!k() && !org.telegram.messenger.fj.C4(this.f38023e)) {
            z10 = false;
        }
        this.f38031n = Boolean.valueOf(z10);
        return z10;
    }

    public final void d() {
        ArrayList arrayList = this.f38022c;
        if (arrayList != null) {
            arrayList.clear();
        }
        ArrayList arrayList2 = this.f38021b;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        this.f38030m = false;
        u();
    }

    @Override
    public final void draw(Canvas canvas) {
        fi.s2 s2Var = this.f38028k;
        if (s2Var == null) {
            return;
        }
        s2Var.A0(getBounds());
        this.f38028k.setAlpha(this.f38029l);
        this.f38028k.h(canvas, null);
    }

    @Override
    public final int getAlpha() {
        return (int) (this.f38029l * 255.0f);
    }

    @Override
    public final ColorFilter getColorFilter() {
        return this.f38034q;
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
        TLRPC.Document document = this.f38023e;
        if (document != null) {
            return document.f28498id;
        }
        return this.f38024f;
    }

    public final void i(boolean r36) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.o5.i(boolean):void");
    }

    public final void j() {
        if (this.f38021b != null) {
            for (int i7 = 0; i7 < this.f38021b.size(); i7++) {
                View view = (View) this.f38021b.get(i7);
                if (view != null) {
                    view.invalidate();
                }
            }
        }
        if (this.f38022c != null) {
            for (int i10 = 0; i10 < this.f38022c.size(); i10++) {
                u5 u5Var = (u5) this.f38022c.get(i10);
                if (u5Var != null) {
                    u5Var.invalidate();
                }
            }
        }
    }

    public final boolean k() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.o5.k():boolean");
    }

    public final void n(View view) {
        ArrayList arrayList = this.f38021b;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        this.f38030m = false;
        u();
    }

    public final void o(u5 u5Var) {
        ArrayList arrayList = this.f38022c;
        if (arrayList != null) {
            arrayList.remove(u5Var);
        }
        this.f38030m = false;
        u();
    }

    public final void p(long j3) {
        fi.s2 s2Var = this.f38028k;
        if (s2Var != null) {
            if (this.f38025g == 8) {
                j3 = 0;
            }
            s2Var.f22757s = j3;
        }
    }

    public final void q(String str) {
        fi.s2 s2Var;
        int i7 = this.f38025g;
        if ((i7 != 20 && i7 != 21) || TextUtils.isEmpty(str) || (s2Var = this.f38028k) != null) {
            return;
        }
        if (s2Var == null) {
            fi.s2 s2Var2 = new fi.s2(this, 4);
            this.f38028k = s2Var2;
            s2Var2.d = this.h;
            s2Var2.A1 = true;
            if (i7 == 12) {
                s2Var2.f22772y = true;
            }
        }
        this.f38027j = true;
        this.f38028k.x0(org.telegram.messenger.j6.g(str));
        this.f38028k.B0 = true;
    }

    public final void s(long j3) {
        fi.s2 s2Var = this.f38028k;
        if (s2Var != null) {
            if (this.f38025g == 8) {
                j3 = 0;
            }
            if (s2Var.C() != null) {
                this.f38028k.C().V(j3);
            }
            if (this.f38028k.m() != null) {
                this.f38028k.m().D(j3);
            }
        }
    }

    @Override
    public final void setAlpha(int i7) {
        float f10 = i7 / 255.0f;
        this.f38029l = f10;
        fi.s2 s2Var = this.f38028k;
        if (s2Var != null) {
            s2Var.setAlpha(f10);
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f38034q = colorFilter;
        if (this.f38028k != null && this.f38023e != null) {
            if (c()) {
                this.f38028k.f22751p1 = colorFilter;
                return;
            }
            return;
        }
        this.f38033p = colorFilter;
    }

    public final String toString() {
        String V;
        StringBuilder sb2 = new StringBuilder("AnimatedEmojiDrawable{");
        TLRPC.Document document = this.f38023e;
        if (document == null) {
            V = "null";
        } else {
            V = org.telegram.messenger.fj.V(document, null, null);
        }
        return a8.p0.s(sb2, V, "}");
    }

    public final void u() {
        ArrayList arrayList;
        boolean z10;
        if (this.f38028k != null) {
            ArrayList arrayList2 = this.f38021b;
            if ((arrayList2 != null && arrayList2.size() > 0) || (((arrayList = this.f38022c) != null && arrayList.size() > 0) || this.f38030m)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 != this.f38020a) {
                this.f38020a = z10;
                if (z10) {
                    this.f38028k.Q();
                } else {
                    this.f38028k.S();
                }
                if (!this.f38020a) {
                    org.telegram.messenger.j2 j2Var = f38018w;
                    org.telegram.messenger.g0.r(j2Var);
                    org.telegram.messenger.g0.h3(j2Var, 5000L);
                }
            }
        }
    }

    public final void v(ImageReceiver imageReceiver) {
        int i7 = this.f38025g;
        if (i7 != 7 && i7 != 9 && i7 != 10) {
            if (i7 != 11 && i7 != 18 && i7 != 14 && i7 != 6 && i7 != 5 && i7 != 22) {
                if (i7 == 17) {
                    imageReceiver.Y(0);
                    return;
                }
                return;
            }
            imageReceiver.Y(1);
            return;
        }
        imageReceiver.Y(2);
    }

    public final void x() {
        int i7 = this.f38025g;
        if (i7 != 0 && i7 != 26) {
            TextPaint[] textPaintArr = org.telegram.ui.ActionBar.n6.f29839y2;
            if (textPaintArr != null && (i7 == 1 || i7 == 4 || i7 == 19 || i7 == 20)) {
                this.d = (int) (((Math.abs(org.telegram.ui.ActionBar.n6.f29839y2[2].descent()) + Math.abs(textPaintArr[2].ascent())) * 1.15f) / org.telegram.messenger.g0.f24225p);
                return;
            } else if (textPaintArr != null && i7 == 8) {
                this.d = (int) (((Math.abs(org.telegram.ui.ActionBar.n6.f29839y2[0].descent()) + Math.abs(textPaintArr[0].ascent())) * 1.15f) / org.telegram.messenger.g0.f24225p);
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
        this.d = (int) (((Math.abs(org.telegram.ui.ActionBar.n6.f29648o2.descent()) + Math.abs(org.telegram.ui.ActionBar.n6.f29648o2.ascent())) * 1.15f) / org.telegram.messenger.g0.f24225p);
    }

    public o5(int i7, int i10, TLRPC.Document document) {
        this.f38025g = i7;
        this.h = i10;
        this.f38023e = document;
        x();
        w();
        i(false);
    }
}
