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
public class h5 extends Drawable {
    public static SparseArray f34162r;
    public static HashMap f34163s;
    public static boolean f34164t;
    public static boolean f34165u;
    public static boolean v;
    public static final org.telegram.messenger.rc f34166w = new org.telegram.messenger.rc(19);
    public static HashMap f34167x;
    public boolean f34168a;
    public ArrayList f34169b;
    public ArrayList f34170c;
    public int d;
    public TLRPC.Document f34171e;
    public long f34172f;
    public int f34173g;
    public int h;
    public String f34174i;
    public boolean f34175j;
    public di.z2 f34176k;
    public boolean f34178m;
    public ColorFilter f34181p;
    public ColorFilter f34182q;
    public float f34177l = 1.0f;
    public Boolean f34179n = null;
    public Boolean f34180o = null;

    public h5(int i7, int i10, long j3) {
        this.h = i10;
        this.f34173g = i7;
        x();
        this.f34172f = j3;
        g(i10).b(j3, new z4(this, 0));
    }

    public static TLRPC.Document e(int i7, long j3) {
        HashMap hashMap = g(i7).f32887a;
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

    public static d5 g(int i7) {
        if (f34163s == null) {
            f34163s = new HashMap();
        }
        d5 d5Var = (d5) f34163s.get(Integer.valueOf(i7));
        if (d5Var == null) {
            HashMap hashMap = f34163s;
            Integer valueOf = Integer.valueOf(i7);
            d5 d5Var2 = new d5(i7);
            hashMap.put(valueOf, d5Var2);
            return d5Var2;
        }
        return d5Var;
    }

    public static h5 l(int i7, int i10, TLRPC.Document document) {
        if (f34162r == null) {
            f34162r = new SparseArray();
        }
        int hash = Objects.hash(Integer.valueOf(i7), Integer.valueOf(i10));
        LongSparseArray longSparseArray = (LongSparseArray) f34162r.get(hash);
        if (longSparseArray == null) {
            SparseArray sparseArray = f34162r;
            LongSparseArray longSparseArray2 = new LongSparseArray();
            sparseArray.put(hash, longSparseArray2);
            longSparseArray = longSparseArray2;
        }
        h5 h5Var = (h5) longSparseArray.get(document.f26966id);
        if (h5Var == null) {
            long j3 = document.f26966id;
            h5 h5Var2 = new h5(i10, i7, document);
            longSparseArray.put(j3, h5Var2);
            return h5Var2;
        }
        return h5Var;
    }

    public static h5 m(int i7, long j3, String str, int i10) {
        if (f34162r == null) {
            f34162r = new SparseArray();
        }
        int hash = Objects.hash(Integer.valueOf(i7), Integer.valueOf(i10));
        LongSparseArray longSparseArray = (LongSparseArray) f34162r.get(hash);
        if (longSparseArray == null) {
            SparseArray sparseArray = f34162r;
            LongSparseArray longSparseArray2 = new LongSparseArray();
            sparseArray.put(hash, longSparseArray2);
            longSparseArray = longSparseArray2;
        }
        h5 h5Var = (h5) longSparseArray.get(j3);
        if (h5Var == null) {
            ?? drawable = new Drawable();
            drawable.f34177l = 1.0f;
            drawable.f34179n = null;
            drawable.f34180o = null;
            drawable.h = i7;
            drawable.f34173g = i10;
            drawable.x();
            drawable.f34172f = j3;
            drawable.f34174i = str;
            g(i7).b(j3, new z4(drawable, 1));
            longSparseArray.put(j3, drawable);
            return drawable;
        }
        return h5Var;
    }

    public static void r(int i7, boolean z9) {
        LongSparseArray longSparseArray;
        di.z2 z2Var;
        boolean z10 = !z9;
        if (v != z10) {
            v = z10;
            if (f34162r != null && (longSparseArray = (LongSparseArray) f34162r.get(Objects.hash(Integer.valueOf(i7), 25))) != null) {
                for (int i10 = 0; i10 < longSparseArray.size(); i10++) {
                    h5 h5Var = (h5) longSparseArray.valueAt(i10);
                    if (h5Var != null && (z2Var = h5Var.f34176k) != null) {
                        if (z9) {
                            z2Var.f21227u0 = true;
                            z2Var.f21225t0 = true;
                            z2Var.W(1);
                            u5 m10 = z2Var.m();
                            if (m10 != null) {
                                boolean z11 = z2Var.f21229v0;
                                if (!m10.f38531n0) {
                                    m10.f38541v0 = z11;
                                }
                                m10.start();
                            } else {
                                zg0 B = z2Var.B();
                                if (B != null) {
                                    B.start();
                                }
                            }
                        } else {
                            z2Var.f21225t0 = false;
                            z2Var.f21227u0 = false;
                            z2Var.W(0);
                            z2Var.Q0();
                        }
                    }
                }
            }
        }
    }

    public static void t() {
        if (f34162r != null) {
            w();
            for (int i7 = 0; i7 < f34162r.size(); i7++) {
                LongSparseArray longSparseArray = (LongSparseArray) f34162r.valueAt(i7);
                for (int i10 = 0; i10 < longSparseArray.size(); i10++) {
                    long keyAt = longSparseArray.keyAt(i10);
                    h5 h5Var = (h5) longSparseArray.get(keyAt);
                    if (h5Var != null && h5Var.f34168a) {
                        h5Var.i(true);
                    } else {
                        longSparseArray.remove(keyAt);
                    }
                }
            }
        }
    }

    public static void w() {
        f34164t = org.telegram.messenger.sc.e(16388);
        f34165u = org.telegram.messenger.sc.e(8200);
    }

    public final void a(View view) {
        if (!(view instanceof org.telegram.ui.w01)) {
            this.f34178m = false;
            if (this.f34169b == null) {
                this.f34169b = new ArrayList(10);
            }
            if (!this.f34169b.contains(view)) {
                this.f34169b.add(view);
            }
            u();
            return;
        }
        throw new RuntimeException();
    }

    public final void b(n5 n5Var) {
        if (this.f34170c == null) {
            this.f34170c = new ArrayList(10);
        }
        this.f34178m = false;
        if (!this.f34170c.contains(n5Var)) {
            this.f34170c.add(n5Var);
        }
        u();
    }

    public final boolean c() {
        boolean z9 = true;
        if (this.f34173g == 19) {
            return true;
        }
        Boolean bool = this.f34179n;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (this.f34171e == null) {
            return false;
        }
        if (!k() && !org.telegram.messenger.ij.C4(this.f34171e)) {
            z9 = false;
        }
        this.f34179n = Boolean.valueOf(z9);
        return z9;
    }

    public final void d() {
        ArrayList arrayList = this.f34170c;
        if (arrayList != null) {
            arrayList.clear();
        }
        ArrayList arrayList2 = this.f34169b;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        this.f34178m = false;
        u();
    }

    @Override
    public final void draw(Canvas canvas) {
        di.z2 z2Var = this.f34176k;
        if (z2Var == null) {
            return;
        }
        z2Var.z0(getBounds());
        this.f34176k.setAlpha(this.f34177l);
        this.f34176k.h(canvas, null);
    }

    @Override
    public final int getAlpha() {
        return (int) (this.f34177l * 255.0f);
    }

    @Override
    public final ColorFilter getColorFilter() {
        return this.f34182q;
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
        TLRPC.Document document = this.f34171e;
        if (document != null) {
            return document.f26966id;
        }
        return this.f34172f;
    }

    public final void i(boolean r36) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.h5.i(boolean):void");
    }

    public final void j() {
        if (this.f34169b != null) {
            for (int i7 = 0; i7 < this.f34169b.size(); i7++) {
                View view = (View) this.f34169b.get(i7);
                if (view != null) {
                    view.invalidate();
                }
            }
        }
        if (this.f34170c != null) {
            for (int i10 = 0; i10 < this.f34170c.size(); i10++) {
                n5 n5Var = (n5) this.f34170c.get(i10);
                if (n5Var != null) {
                    n5Var.invalidate();
                }
            }
        }
    }

    public final boolean k() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.h5.k():boolean");
    }

    public final void n(View view) {
        ArrayList arrayList = this.f34169b;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        this.f34178m = false;
        u();
    }

    public final void o(n5 n5Var) {
        ArrayList arrayList = this.f34170c;
        if (arrayList != null) {
            arrayList.remove(n5Var);
        }
        this.f34178m = false;
        u();
    }

    public final void p(long j3) {
        di.z2 z2Var = this.f34176k;
        if (z2Var != null) {
            if (this.f34173g == 8) {
                j3 = 0;
            }
            z2Var.f21222s = j3;
        }
    }

    public final void q(String str) {
        di.z2 z2Var;
        int i7 = this.f34173g;
        if ((i7 != 20 && i7 != 21) || TextUtils.isEmpty(str) || (z2Var = this.f34176k) != null) {
            return;
        }
        if (z2Var == null) {
            di.z2 z2Var2 = new di.z2(this, 4);
            this.f34176k = z2Var2;
            z2Var2.d = this.h;
            z2Var2.f21241z1 = true;
            if (i7 == 12) {
                z2Var2.f21237y = true;
            }
        }
        this.f34175j = true;
        this.f34176k.w0(org.telegram.messenger.i6.g(str));
        this.f34176k.A0 = true;
    }

    public final void s(long j3) {
        di.z2 z2Var = this.f34176k;
        if (z2Var != null) {
            if (this.f34173g == 8) {
                j3 = 0;
            }
            if (z2Var.B() != null) {
                this.f34176k.B().V(j3);
            }
            if (this.f34176k.m() != null) {
                this.f34176k.m().D(j3);
            }
        }
    }

    @Override
    public final void setAlpha(int i7) {
        float f10 = i7 / 255.0f;
        this.f34177l = f10;
        di.z2 z2Var = this.f34176k;
        if (z2Var != null) {
            z2Var.setAlpha(f10);
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f34182q = colorFilter;
        if (this.f34176k != null && this.f34171e != null) {
            if (c()) {
                this.f34176k.f21214o1 = colorFilter;
                return;
            }
            return;
        }
        this.f34181p = colorFilter;
    }

    public final String toString() {
        String V;
        StringBuilder sb2 = new StringBuilder("AnimatedEmojiDrawable{");
        TLRPC.Document document = this.f34171e;
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
        if (this.f34176k != null) {
            ArrayList arrayList2 = this.f34169b;
            if ((arrayList2 != null && arrayList2.size() > 0) || (((arrayList = this.f34170c) != null && arrayList.size() > 0) || this.f34178m)) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z9 != this.f34168a) {
                this.f34168a = z9;
                if (z9) {
                    this.f34176k.P();
                } else {
                    this.f34176k.R();
                }
                if (!this.f34168a) {
                    org.telegram.messenger.rc rcVar = f34166w;
                    org.telegram.messenger.g0.r(rcVar);
                    org.telegram.messenger.g0.i3(rcVar, 5000L);
                }
            }
        }
    }

    public final void v(ImageReceiver imageReceiver) {
        int i7 = this.f34173g;
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
        int i7 = this.f34173g;
        if (i7 != 0 && i7 != 26) {
            TextPaint[] textPaintArr = org.telegram.ui.ActionBar.m6.f28278y2;
            if (textPaintArr != null && (i7 == 1 || i7 == 4 || i7 == 19 || i7 == 20)) {
                this.d = (int) (((Math.abs(org.telegram.ui.ActionBar.m6.f28278y2[2].descent()) + Math.abs(textPaintArr[2].ascent())) * 1.15f) / org.telegram.messenger.g0.f22566p);
                return;
            } else if (textPaintArr != null && i7 == 8) {
                this.d = (int) (((Math.abs(org.telegram.ui.ActionBar.m6.f28278y2[0].descent()) + Math.abs(textPaintArr[0].ascent())) * 1.15f) / org.telegram.messenger.g0.f22566p);
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
        this.d = (int) (((Math.abs(org.telegram.ui.ActionBar.m6.f28087o2.descent()) + Math.abs(org.telegram.ui.ActionBar.m6.f28087o2.ascent())) * 1.15f) / org.telegram.messenger.g0.f22566p);
    }

    public h5(int i7, int i10, TLRPC.Document document) {
        this.f34173g = i7;
        this.h = i10;
        this.f34171e = document;
        x();
        w();
        i(false);
    }
}
