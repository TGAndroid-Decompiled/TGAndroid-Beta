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
public class i5 extends Drawable {
    public static SparseArray f34527r;
    public static HashMap f34528s;
    public static boolean f34529t;
    public static boolean f34530u;
    public static boolean v;
    public static final org.telegram.messenger.rc f34531w = new org.telegram.messenger.rc(19);
    public static HashMap f34532x;
    public boolean f34533a;
    public ArrayList f34534b;
    public ArrayList f34535c;
    public int d;
    public TLRPC.Document f34536e;
    public long f34537f;
    public int f34538g;
    public int h;
    public String f34539i;
    public boolean f34540j;
    public di.z2 f34541k;
    public boolean f34543m;
    public ColorFilter f34546p;
    public ColorFilter f34547q;
    public float f34542l = 1.0f;
    public Boolean f34544n = null;
    public Boolean f34545o = null;

    public i5(int i7, int i10, long j3) {
        this.h = i10;
        this.f34538g = i7;
        x();
        this.f34537f = j3;
        g(i10).b(j3, new a5(this, 0));
    }

    public static TLRPC.Document e(int i7, long j3) {
        HashMap hashMap = g(i7).f33198a;
        if (hashMap == null) {
            return null;
        }
        return (TLRPC.Document) hashMap.get(Long.valueOf(j3));
    }

    public static int f() {
        if (org.telegram.messenger.iz.o() == 0) {
            return 0;
        }
        return 2;
    }

    public static e5 g(int i7) {
        if (f34528s == null) {
            f34528s = new HashMap();
        }
        e5 e5Var = (e5) f34528s.get(Integer.valueOf(i7));
        if (e5Var == null) {
            HashMap hashMap = f34528s;
            Integer valueOf = Integer.valueOf(i7);
            e5 e5Var2 = new e5(i7);
            hashMap.put(valueOf, e5Var2);
            return e5Var2;
        }
        return e5Var;
    }

    public static i5 l(int i7, int i10, TLRPC.Document document) {
        if (f34527r == null) {
            f34527r = new SparseArray();
        }
        int hash = Objects.hash(Integer.valueOf(i7), Integer.valueOf(i10));
        LongSparseArray longSparseArray = (LongSparseArray) f34527r.get(hash);
        if (longSparseArray == null) {
            SparseArray sparseArray = f34527r;
            LongSparseArray longSparseArray2 = new LongSparseArray();
            sparseArray.put(hash, longSparseArray2);
            longSparseArray = longSparseArray2;
        }
        i5 i5Var = (i5) longSparseArray.get(document.f26962id);
        if (i5Var == null) {
            long j3 = document.f26962id;
            i5 i5Var2 = new i5(i10, i7, document);
            longSparseArray.put(j3, i5Var2);
            return i5Var2;
        }
        return i5Var;
    }

    public static i5 m(int i7, long j3, String str, int i10) {
        if (f34527r == null) {
            f34527r = new SparseArray();
        }
        int hash = Objects.hash(Integer.valueOf(i7), Integer.valueOf(i10));
        LongSparseArray longSparseArray = (LongSparseArray) f34527r.get(hash);
        if (longSparseArray == null) {
            SparseArray sparseArray = f34527r;
            LongSparseArray longSparseArray2 = new LongSparseArray();
            sparseArray.put(hash, longSparseArray2);
            longSparseArray = longSparseArray2;
        }
        i5 i5Var = (i5) longSparseArray.get(j3);
        if (i5Var == null) {
            ?? drawable = new Drawable();
            drawable.f34542l = 1.0f;
            drawable.f34544n = null;
            drawable.f34545o = null;
            drawable.h = i7;
            drawable.f34538g = i10;
            drawable.x();
            drawable.f34537f = j3;
            drawable.f34539i = str;
            g(i7).b(j3, new a5(drawable, 1));
            longSparseArray.put(j3, drawable);
            return drawable;
        }
        return i5Var;
    }

    public static void r(int i7, boolean z9) {
        LongSparseArray longSparseArray;
        di.z2 z2Var;
        boolean z10 = !z9;
        if (v != z10) {
            v = z10;
            if (f34527r != null && (longSparseArray = (LongSparseArray) f34527r.get(Objects.hash(Integer.valueOf(i7), 25))) != null) {
                for (int i10 = 0; i10 < longSparseArray.size(); i10++) {
                    i5 i5Var = (i5) longSparseArray.valueAt(i10);
                    if (i5Var != null && (z2Var = i5Var.f34541k) != null) {
                        if (z9) {
                            z2Var.f21222u0 = true;
                            z2Var.f21220t0 = true;
                            z2Var.W(1);
                            v5 m10 = z2Var.m();
                            if (m10 != null) {
                                boolean z11 = z2Var.f21224v0;
                                if (!m10.f38875n0) {
                                    m10.f38885v0 = z11;
                                }
                                m10.start();
                            } else {
                                zg0 B = z2Var.B();
                                if (B != null) {
                                    B.start();
                                }
                            }
                        } else {
                            z2Var.f21220t0 = false;
                            z2Var.f21222u0 = false;
                            z2Var.W(0);
                            z2Var.Q0();
                        }
                    }
                }
            }
        }
    }

    public static void t() {
        if (f34527r != null) {
            w();
            for (int i7 = 0; i7 < f34527r.size(); i7++) {
                LongSparseArray longSparseArray = (LongSparseArray) f34527r.valueAt(i7);
                for (int i10 = 0; i10 < longSparseArray.size(); i10++) {
                    long keyAt = longSparseArray.keyAt(i10);
                    i5 i5Var = (i5) longSparseArray.get(keyAt);
                    if (i5Var != null && i5Var.f34533a) {
                        i5Var.i(true);
                    } else {
                        longSparseArray.remove(keyAt);
                    }
                }
            }
        }
    }

    public static void w() {
        f34529t = org.telegram.messenger.sc.e(16388);
        f34530u = org.telegram.messenger.sc.e(8200);
    }

    public final void a(View view) {
        if (!(view instanceof org.telegram.ui.t01)) {
            this.f34543m = false;
            if (this.f34534b == null) {
                this.f34534b = new ArrayList(10);
            }
            if (!this.f34534b.contains(view)) {
                this.f34534b.add(view);
            }
            u();
            return;
        }
        throw new RuntimeException();
    }

    public final void b(o5 o5Var) {
        if (this.f34535c == null) {
            this.f34535c = new ArrayList(10);
        }
        this.f34543m = false;
        if (!this.f34535c.contains(o5Var)) {
            this.f34535c.add(o5Var);
        }
        u();
    }

    public final boolean c() {
        boolean z9 = true;
        if (this.f34538g == 19) {
            return true;
        }
        Boolean bool = this.f34544n;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (this.f34536e == null) {
            return false;
        }
        if (!k() && !org.telegram.messenger.ij.D4(this.f34536e)) {
            z9 = false;
        }
        this.f34544n = Boolean.valueOf(z9);
        return z9;
    }

    public final void d() {
        ArrayList arrayList = this.f34535c;
        if (arrayList != null) {
            arrayList.clear();
        }
        ArrayList arrayList2 = this.f34534b;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        this.f34543m = false;
        u();
    }

    @Override
    public final void draw(Canvas canvas) {
        di.z2 z2Var = this.f34541k;
        if (z2Var == null) {
            return;
        }
        z2Var.z0(getBounds());
        this.f34541k.setAlpha(this.f34542l);
        this.f34541k.h(canvas, null);
    }

    @Override
    public final int getAlpha() {
        return (int) (this.f34542l * 255.0f);
    }

    @Override
    public final ColorFilter getColorFilter() {
        return this.f34547q;
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
        TLRPC.Document document = this.f34536e;
        if (document != null) {
            return document.f26962id;
        }
        return this.f34537f;
    }

    public final void i(boolean r36) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.i5.i(boolean):void");
    }

    public final void j() {
        if (this.f34534b != null) {
            for (int i7 = 0; i7 < this.f34534b.size(); i7++) {
                View view = (View) this.f34534b.get(i7);
                if (view != null) {
                    view.invalidate();
                }
            }
        }
        if (this.f34535c != null) {
            for (int i10 = 0; i10 < this.f34535c.size(); i10++) {
                o5 o5Var = (o5) this.f34535c.get(i10);
                if (o5Var != null) {
                    o5Var.invalidate();
                }
            }
        }
    }

    public final boolean k() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.i5.k():boolean");
    }

    public final void n(View view) {
        ArrayList arrayList = this.f34534b;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        this.f34543m = false;
        u();
    }

    public final void o(o5 o5Var) {
        ArrayList arrayList = this.f34535c;
        if (arrayList != null) {
            arrayList.remove(o5Var);
        }
        this.f34543m = false;
        u();
    }

    public final void p(long j3) {
        di.z2 z2Var = this.f34541k;
        if (z2Var != null) {
            if (this.f34538g == 8) {
                j3 = 0;
            }
            z2Var.f21217s = j3;
        }
    }

    public final void q(String str) {
        di.z2 z2Var;
        int i7 = this.f34538g;
        if ((i7 != 20 && i7 != 21) || TextUtils.isEmpty(str) || (z2Var = this.f34541k) != null) {
            return;
        }
        if (z2Var == null) {
            di.z2 z2Var2 = new di.z2(this, 4);
            this.f34541k = z2Var2;
            z2Var2.d = this.h;
            z2Var2.f21236z1 = true;
            if (i7 == 12) {
                z2Var2.f21232y = true;
            }
        }
        this.f34540j = true;
        this.f34541k.w0(org.telegram.messenger.i6.g(str));
        this.f34541k.A0 = true;
    }

    public final void s(long j3) {
        di.z2 z2Var = this.f34541k;
        if (z2Var != null) {
            if (this.f34538g == 8) {
                j3 = 0;
            }
            if (z2Var.B() != null) {
                this.f34541k.B().V(j3);
            }
            if (this.f34541k.m() != null) {
                this.f34541k.m().D(j3);
            }
        }
    }

    @Override
    public final void setAlpha(int i7) {
        float f10 = i7 / 255.0f;
        this.f34542l = f10;
        di.z2 z2Var = this.f34541k;
        if (z2Var != null) {
            z2Var.setAlpha(f10);
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f34547q = colorFilter;
        if (this.f34541k != null && this.f34536e != null) {
            if (c()) {
                this.f34541k.f21209o1 = colorFilter;
                return;
            }
            return;
        }
        this.f34546p = colorFilter;
    }

    public final String toString() {
        String V;
        StringBuilder sb2 = new StringBuilder("AnimatedEmojiDrawable{");
        TLRPC.Document document = this.f34536e;
        if (document == null) {
            V = "null";
        } else {
            V = org.telegram.messenger.ij.V(document, null, null);
        }
        return a8.p0.s(sb2, V, "}");
    }

    public final void u() {
        ArrayList arrayList;
        boolean z9;
        if (this.f34541k != null) {
            ArrayList arrayList2 = this.f34534b;
            if ((arrayList2 != null && arrayList2.size() > 0) || (((arrayList = this.f34535c) != null && arrayList.size() > 0) || this.f34543m)) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z9 != this.f34533a) {
                this.f34533a = z9;
                if (z9) {
                    this.f34541k.P();
                } else {
                    this.f34541k.R();
                }
                if (!this.f34533a) {
                    org.telegram.messenger.rc rcVar = f34531w;
                    org.telegram.messenger.g0.r(rcVar);
                    org.telegram.messenger.g0.i3(rcVar, 5000L);
                }
            }
        }
    }

    public final void v(ImageReceiver imageReceiver) {
        int i7 = this.f34538g;
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
        int i7 = this.f34538g;
        if (i7 != 0 && i7 != 26) {
            TextPaint[] textPaintArr = org.telegram.ui.ActionBar.k6.f28240y2;
            if (textPaintArr != null && (i7 == 1 || i7 == 4 || i7 == 19 || i7 == 20)) {
                this.d = (int) (((Math.abs(org.telegram.ui.ActionBar.k6.f28240y2[2].descent()) + Math.abs(textPaintArr[2].ascent())) * 1.15f) / org.telegram.messenger.g0.f22562p);
                return;
            } else if (textPaintArr != null && i7 == 8) {
                this.d = (int) (((Math.abs(org.telegram.ui.ActionBar.k6.f28240y2[0].descent()) + Math.abs(textPaintArr[0].ascent())) * 1.15f) / org.telegram.messenger.g0.f22562p);
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
        this.d = (int) (((Math.abs(org.telegram.ui.ActionBar.k6.f28049o2.descent()) + Math.abs(org.telegram.ui.ActionBar.k6.f28049o2.ascent())) * 1.15f) / org.telegram.messenger.g0.f22562p);
    }

    public i5(int i7, int i10, TLRPC.Document document) {
        this.f34538g = i7;
        this.h = i10;
        this.f34536e = document;
        x();
        w();
        i(false);
    }
}
