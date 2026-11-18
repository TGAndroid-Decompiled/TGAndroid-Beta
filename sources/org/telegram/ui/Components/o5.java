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
    public static SparseArray f37962r;
    public static HashMap f37963s;
    public static boolean f37964t;
    public static boolean f37965u;
    public static boolean v;
    public static final org.telegram.messenger.j2 f37966w = new org.telegram.messenger.j2(25);
    public static HashMap f37967x;
    public boolean f37968a;
    public ArrayList f37969b;
    public ArrayList f37970c;
    public int d;
    public TLRPC.Document f37971e;
    public long f37972f;
    public int f37973g;
    public int h;
    public String f37974i;
    public boolean f37975j;
    public fi.s2 f37976k;
    public boolean f37978m;
    public ColorFilter f37981p;
    public ColorFilter f37982q;
    public float f37977l = 1.0f;
    public Boolean f37979n = null;
    public Boolean f37980o = null;

    public o5(int i7, int i10, long j3) {
        this.h = i10;
        this.f37973g = i7;
        x();
        this.f37972f = j3;
        g(i10).b(j3, new g5(this, 0));
    }

    public static TLRPC.Document e(int i7, long j3) {
        HashMap hashMap = g(i7).f36678a;
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
        if (f37963s == null) {
            f37963s = new HashMap();
        }
        k5 k5Var = (k5) f37963s.get(Integer.valueOf(i7));
        if (k5Var == null) {
            HashMap hashMap = f37963s;
            Integer valueOf = Integer.valueOf(i7);
            k5 k5Var2 = new k5(i7);
            hashMap.put(valueOf, k5Var2);
            return k5Var2;
        }
        return k5Var;
    }

    public static o5 l(int i7, int i10, TLRPC.Document document) {
        if (f37962r == null) {
            f37962r = new SparseArray();
        }
        int hash = Objects.hash(Integer.valueOf(i7), Integer.valueOf(i10));
        LongSparseArray longSparseArray = (LongSparseArray) f37962r.get(hash);
        if (longSparseArray == null) {
            SparseArray sparseArray = f37962r;
            LongSparseArray longSparseArray2 = new LongSparseArray();
            sparseArray.put(hash, longSparseArray2);
            longSparseArray = longSparseArray2;
        }
        o5 o5Var = (o5) longSparseArray.get(document.f28411id);
        if (o5Var == null) {
            long j3 = document.f28411id;
            o5 o5Var2 = new o5(i10, i7, document);
            longSparseArray.put(j3, o5Var2);
            return o5Var2;
        }
        return o5Var;
    }

    public static o5 m(int i7, long j3, String str, int i10) {
        if (f37962r == null) {
            f37962r = new SparseArray();
        }
        int hash = Objects.hash(Integer.valueOf(i7), Integer.valueOf(i10));
        LongSparseArray longSparseArray = (LongSparseArray) f37962r.get(hash);
        if (longSparseArray == null) {
            SparseArray sparseArray = f37962r;
            LongSparseArray longSparseArray2 = new LongSparseArray();
            sparseArray.put(hash, longSparseArray2);
            longSparseArray = longSparseArray2;
        }
        o5 o5Var = (o5) longSparseArray.get(j3);
        if (o5Var == null) {
            ?? drawable = new Drawable();
            drawable.f37977l = 1.0f;
            drawable.f37979n = null;
            drawable.f37980o = null;
            drawable.h = i7;
            drawable.f37973g = i10;
            drawable.x();
            drawable.f37972f = j3;
            drawable.f37974i = str;
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
            if (f37962r != null && (longSparseArray = (LongSparseArray) f37962r.get(Objects.hash(Integer.valueOf(i7), 25))) != null) {
                for (int i10 = 0; i10 < longSparseArray.size(); i10++) {
                    o5 o5Var = (o5) longSparseArray.valueAt(i10);
                    if (o5Var != null && (s2Var = o5Var.f37976k) != null) {
                        if (z10) {
                            s2Var.f22669v0 = true;
                            s2Var.f22667u0 = true;
                            s2Var.W(1);
                            b6 m10 = s2Var.m();
                            if (m10 != null) {
                                boolean z12 = s2Var.f22672w0;
                                if (!m10.f33552o0) {
                                    m10.f33563w0 = z12;
                                }
                                m10.start();
                            } else {
                                mh0 B = s2Var.B();
                                if (B != null) {
                                    B.start();
                                }
                            }
                        } else {
                            s2Var.f22667u0 = false;
                            s2Var.f22669v0 = false;
                            s2Var.W(0);
                            s2Var.Q0();
                        }
                    }
                }
            }
        }
    }

    public static void t() {
        if (f37962r != null) {
            w();
            for (int i7 = 0; i7 < f37962r.size(); i7++) {
                LongSparseArray longSparseArray = (LongSparseArray) f37962r.valueAt(i7);
                for (int i10 = 0; i10 < longSparseArray.size(); i10++) {
                    long keyAt = longSparseArray.keyAt(i10);
                    o5 o5Var = (o5) longSparseArray.get(keyAt);
                    if (o5Var != null && o5Var.f37968a) {
                        o5Var.i(true);
                    } else {
                        longSparseArray.remove(keyAt);
                    }
                }
            }
        }
    }

    public static void w() {
        f37964t = org.telegram.messenger.pc.e(16388);
        f37965u = org.telegram.messenger.pc.e(8200);
    }

    public final void a(View view) {
        if (!(view instanceof org.telegram.ui.u01)) {
            this.f37978m = false;
            if (this.f37969b == null) {
                this.f37969b = new ArrayList(10);
            }
            if (!this.f37969b.contains(view)) {
                this.f37969b.add(view);
            }
            u();
            return;
        }
        throw new RuntimeException();
    }

    public final void b(u5 u5Var) {
        if (this.f37970c == null) {
            this.f37970c = new ArrayList(10);
        }
        this.f37978m = false;
        if (!this.f37970c.contains(u5Var)) {
            this.f37970c.add(u5Var);
        }
        u();
    }

    public final boolean c() {
        boolean z10 = true;
        if (this.f37973g == 19) {
            return true;
        }
        Boolean bool = this.f37979n;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (this.f37971e == null) {
            return false;
        }
        if (!k() && !org.telegram.messenger.fj.C4(this.f37971e)) {
            z10 = false;
        }
        this.f37979n = Boolean.valueOf(z10);
        return z10;
    }

    public final void d() {
        ArrayList arrayList = this.f37970c;
        if (arrayList != null) {
            arrayList.clear();
        }
        ArrayList arrayList2 = this.f37969b;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        this.f37978m = false;
        u();
    }

    @Override
    public final void draw(Canvas canvas) {
        fi.s2 s2Var = this.f37976k;
        if (s2Var == null) {
            return;
        }
        s2Var.z0(getBounds());
        this.f37976k.setAlpha(this.f37977l);
        this.f37976k.h(canvas, null);
    }

    @Override
    public final int getAlpha() {
        return (int) (this.f37977l * 255.0f);
    }

    @Override
    public final ColorFilter getColorFilter() {
        return this.f37982q;
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
        TLRPC.Document document = this.f37971e;
        if (document != null) {
            return document.f28411id;
        }
        return this.f37972f;
    }

    public final void i(boolean r36) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.o5.i(boolean):void");
    }

    public final void j() {
        if (this.f37969b != null) {
            for (int i7 = 0; i7 < this.f37969b.size(); i7++) {
                View view = (View) this.f37969b.get(i7);
                if (view != null) {
                    view.invalidate();
                }
            }
        }
        if (this.f37970c != null) {
            for (int i10 = 0; i10 < this.f37970c.size(); i10++) {
                u5 u5Var = (u5) this.f37970c.get(i10);
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
        ArrayList arrayList = this.f37969b;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        this.f37978m = false;
        u();
    }

    public final void o(u5 u5Var) {
        ArrayList arrayList = this.f37970c;
        if (arrayList != null) {
            arrayList.remove(u5Var);
        }
        this.f37978m = false;
        u();
    }

    public final void p(long j3) {
        fi.s2 s2Var = this.f37976k;
        if (s2Var != null) {
            if (this.f37973g == 8) {
                j3 = 0;
            }
            s2Var.f22662s = j3;
        }
    }

    public final void q(String str) {
        fi.s2 s2Var;
        int i7 = this.f37973g;
        if ((i7 != 20 && i7 != 21) || TextUtils.isEmpty(str) || (s2Var = this.f37976k) != null) {
            return;
        }
        if (s2Var == null) {
            fi.s2 s2Var2 = new fi.s2(this, 4);
            this.f37976k = s2Var2;
            s2Var2.d = this.h;
            s2Var2.A1 = true;
            if (i7 == 12) {
                s2Var2.f22677y = true;
            }
        }
        this.f37975j = true;
        this.f37976k.w0(org.telegram.messenger.j6.g(str));
        this.f37976k.B0 = true;
    }

    public final void s(long j3) {
        fi.s2 s2Var = this.f37976k;
        if (s2Var != null) {
            if (this.f37973g == 8) {
                j3 = 0;
            }
            if (s2Var.B() != null) {
                this.f37976k.B().V(j3);
            }
            if (this.f37976k.m() != null) {
                this.f37976k.m().D(j3);
            }
        }
    }

    @Override
    public final void setAlpha(int i7) {
        float f10 = i7 / 255.0f;
        this.f37977l = f10;
        fi.s2 s2Var = this.f37976k;
        if (s2Var != null) {
            s2Var.setAlpha(f10);
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f37982q = colorFilter;
        if (this.f37976k != null && this.f37971e != null) {
            if (c()) {
                this.f37976k.f22656p1 = colorFilter;
                return;
            }
            return;
        }
        this.f37981p = colorFilter;
    }

    public final String toString() {
        String V;
        StringBuilder sb2 = new StringBuilder("AnimatedEmojiDrawable{");
        TLRPC.Document document = this.f37971e;
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
        if (this.f37976k != null) {
            ArrayList arrayList2 = this.f37969b;
            if ((arrayList2 != null && arrayList2.size() > 0) || (((arrayList = this.f37970c) != null && arrayList.size() > 0) || this.f37978m)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 != this.f37968a) {
                this.f37968a = z10;
                if (z10) {
                    this.f37976k.P();
                } else {
                    this.f37976k.R();
                }
                if (!this.f37968a) {
                    org.telegram.messenger.j2 j2Var = f37966w;
                    org.telegram.messenger.g0.r(j2Var);
                    org.telegram.messenger.g0.h3(j2Var, 5000L);
                }
            }
        }
    }

    public final void v(ImageReceiver imageReceiver) {
        int i7 = this.f37973g;
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
        int i7 = this.f37973g;
        if (i7 != 0 && i7 != 26) {
            TextPaint[] textPaintArr = org.telegram.ui.ActionBar.n6.f29784y2;
            if (textPaintArr != null && (i7 == 1 || i7 == 4 || i7 == 19 || i7 == 20)) {
                this.d = (int) (((Math.abs(org.telegram.ui.ActionBar.n6.f29784y2[2].descent()) + Math.abs(textPaintArr[2].ascent())) * 1.15f) / org.telegram.messenger.g0.f24120p);
                return;
            } else if (textPaintArr != null && i7 == 8) {
                this.d = (int) (((Math.abs(org.telegram.ui.ActionBar.n6.f29784y2[0].descent()) + Math.abs(textPaintArr[0].ascent())) * 1.15f) / org.telegram.messenger.g0.f24120p);
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
        this.d = (int) (((Math.abs(org.telegram.ui.ActionBar.n6.f29593o2.descent()) + Math.abs(org.telegram.ui.ActionBar.n6.f29593o2.ascent())) * 1.15f) / org.telegram.messenger.g0.f24120p);
    }

    public o5(int i7, int i10, TLRPC.Document document) {
        this.f37973g = i7;
        this.h = i10;
        this.f37971e = document;
        x();
        w();
        i(false);
    }
}
