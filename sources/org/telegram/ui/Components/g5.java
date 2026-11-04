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
    public static SparseArray f33957r;
    public static HashMap f33958s;
    public static boolean f33959t;
    public static boolean f33960u;
    public static boolean v;
    public static final org.telegram.messenger.hc f33961w = new org.telegram.messenger.hc(21);
    public static HashMap f33962x;
    public boolean f33963a;
    public ArrayList f33964b;
    public ArrayList f33965c;
    public int d;
    public TLRPC.Document f33966e;
    public long f33967f;
    public int f33968g;
    public int h;
    public String f33969i;
    public boolean f33970j;
    public ei.c3 f33971k;
    public boolean f33973m;
    public ColorFilter f33976p;
    public ColorFilter f33977q;
    public float f33972l = 1.0f;
    public Boolean f33974n = null;
    public Boolean f33975o = null;

    public g5(int i3, int i10, long j10) {
        this.h = i10;
        this.f33968g = i3;
        x();
        this.f33967f = j10;
        g(i10).b(j10, new y4(this, 0));
    }

    public static TLRPC.Document e(int i3, long j10) {
        HashMap hashMap = g(i3).f32561a;
        if (hashMap == null) {
            return null;
        }
        return (TLRPC.Document) hashMap.get(Long.valueOf(j10));
    }

    public static int f() {
        if (org.telegram.messenger.az.o() == 0) {
            return 0;
        }
        return 2;
    }

    public static c5 g(int i3) {
        if (f33958s == null) {
            f33958s = new HashMap();
        }
        c5 c5Var = (c5) f33958s.get(Integer.valueOf(i3));
        if (c5Var == null) {
            HashMap hashMap = f33958s;
            Integer valueOf = Integer.valueOf(i3);
            c5 c5Var2 = new c5(i3);
            hashMap.put(valueOf, c5Var2);
            return c5Var2;
        }
        return c5Var;
    }

    public static g5 l(int i3, int i10, TLRPC.Document document) {
        if (f33957r == null) {
            f33957r = new SparseArray();
        }
        int hash = Objects.hash(Integer.valueOf(i3), Integer.valueOf(i10));
        LongSparseArray longSparseArray = (LongSparseArray) f33957r.get(hash);
        if (longSparseArray == null) {
            SparseArray sparseArray = f33957r;
            LongSparseArray longSparseArray2 = new LongSparseArray();
            sparseArray.put(hash, longSparseArray2);
            longSparseArray = longSparseArray2;
        }
        g5 g5Var = (g5) longSparseArray.get(document.f27007id);
        if (g5Var == null) {
            long j10 = document.f27007id;
            g5 g5Var2 = new g5(i10, i3, document);
            longSparseArray.put(j10, g5Var2);
            return g5Var2;
        }
        return g5Var;
    }

    public static g5 m(int i3, long j10, String str, int i10) {
        if (f33957r == null) {
            f33957r = new SparseArray();
        }
        int hash = Objects.hash(Integer.valueOf(i3), Integer.valueOf(i10));
        LongSparseArray longSparseArray = (LongSparseArray) f33957r.get(hash);
        if (longSparseArray == null) {
            SparseArray sparseArray = f33957r;
            LongSparseArray longSparseArray2 = new LongSparseArray();
            sparseArray.put(hash, longSparseArray2);
            longSparseArray = longSparseArray2;
        }
        g5 g5Var = (g5) longSparseArray.get(j10);
        if (g5Var == null) {
            ?? drawable = new Drawable();
            drawable.f33972l = 1.0f;
            drawable.f33974n = null;
            drawable.f33975o = null;
            drawable.h = i3;
            drawable.f33968g = i10;
            drawable.x();
            drawable.f33967f = j10;
            drawable.f33969i = str;
            g(i3).b(j10, new y4(drawable, 1));
            longSparseArray.put(j10, drawable);
            return drawable;
        }
        return g5Var;
    }

    public static void r(int i3, boolean z10) {
        LongSparseArray longSparseArray;
        ei.c3 c3Var;
        boolean z11 = !z10;
        if (v != z11) {
            v = z11;
            if (f33957r != null && (longSparseArray = (LongSparseArray) f33957r.get(Objects.hash(Integer.valueOf(i3), 25))) != null) {
                for (int i10 = 0; i10 < longSparseArray.size(); i10++) {
                    g5 g5Var = (g5) longSparseArray.valueAt(i10);
                    if (g5Var != null && (c3Var = g5Var.f33971k) != null) {
                        if (z10) {
                            c3Var.f21274v0 = true;
                            c3Var.f21272u0 = true;
                            c3Var.W(1);
                            t5 m10 = c3Var.m();
                            if (m10 != null) {
                                boolean z12 = c3Var.f21277w0;
                                if (!m10.f38271o0) {
                                    m10.f38282w0 = z12;
                                }
                                m10.start();
                            } else {
                                ch0 B = c3Var.B();
                                if (B != null) {
                                    B.start();
                                }
                            }
                        } else {
                            c3Var.f21272u0 = false;
                            c3Var.f21274v0 = false;
                            c3Var.W(0);
                            c3Var.Q0();
                        }
                    }
                }
            }
        }
    }

    public static void t() {
        if (f33957r != null) {
            w();
            for (int i3 = 0; i3 < f33957r.size(); i3++) {
                LongSparseArray longSparseArray = (LongSparseArray) f33957r.valueAt(i3);
                for (int i10 = 0; i10 < longSparseArray.size(); i10++) {
                    long keyAt = longSparseArray.keyAt(i10);
                    g5 g5Var = (g5) longSparseArray.get(keyAt);
                    if (g5Var != null && g5Var.f33963a) {
                        g5Var.i(true);
                    } else {
                        longSparseArray.remove(keyAt);
                    }
                }
            }
        }
    }

    public static void w() {
        f33959t = org.telegram.messenger.lc.e(16388);
        f33960u = org.telegram.messenger.lc.e(8200);
    }

    public final void a(View view) {
        if (!(view instanceof org.telegram.ui.j01)) {
            this.f33973m = false;
            if (this.f33964b == null) {
                this.f33964b = new ArrayList(10);
            }
            if (!this.f33964b.contains(view)) {
                this.f33964b.add(view);
            }
            u();
            return;
        }
        throw new RuntimeException();
    }

    public final void b(m5 m5Var) {
        if (this.f33965c == null) {
            this.f33965c = new ArrayList(10);
        }
        this.f33973m = false;
        if (!this.f33965c.contains(m5Var)) {
            this.f33965c.add(m5Var);
        }
        u();
    }

    public final boolean c() {
        boolean z10 = true;
        if (this.f33968g == 19) {
            return true;
        }
        Boolean bool = this.f33974n;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (this.f33966e == null) {
            return false;
        }
        if (!k() && !org.telegram.messenger.zi.D4(this.f33966e)) {
            z10 = false;
        }
        this.f33974n = Boolean.valueOf(z10);
        return z10;
    }

    public final void d() {
        ArrayList arrayList = this.f33965c;
        if (arrayList != null) {
            arrayList.clear();
        }
        ArrayList arrayList2 = this.f33964b;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        this.f33973m = false;
        u();
    }

    @Override
    public final void draw(Canvas canvas) {
        ei.c3 c3Var = this.f33971k;
        if (c3Var == null) {
            return;
        }
        c3Var.z0(getBounds());
        this.f33971k.setAlpha(this.f33972l);
        this.f33971k.h(canvas, null);
    }

    @Override
    public final int getAlpha() {
        return (int) (this.f33972l * 255.0f);
    }

    @Override
    public final ColorFilter getColorFilter() {
        return this.f33977q;
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
        TLRPC.Document document = this.f33966e;
        if (document != null) {
            return document.f27007id;
        }
        return this.f33967f;
    }

    public final void i(boolean r36) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.g5.i(boolean):void");
    }

    public final void j() {
        if (this.f33964b != null) {
            for (int i3 = 0; i3 < this.f33964b.size(); i3++) {
                View view = (View) this.f33964b.get(i3);
                if (view != null) {
                    view.invalidate();
                }
            }
        }
        if (this.f33965c != null) {
            for (int i10 = 0; i10 < this.f33965c.size(); i10++) {
                m5 m5Var = (m5) this.f33965c.get(i10);
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
        ArrayList arrayList = this.f33964b;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        this.f33973m = false;
        u();
    }

    public final void o(m5 m5Var) {
        ArrayList arrayList = this.f33965c;
        if (arrayList != null) {
            arrayList.remove(m5Var);
        }
        this.f33973m = false;
        u();
    }

    public final void p(long j10) {
        ei.c3 c3Var = this.f33971k;
        if (c3Var != null) {
            if (this.f33968g == 8) {
                j10 = 0;
            }
            c3Var.f21267s = j10;
        }
    }

    public final void q(String str) {
        ei.c3 c3Var;
        int i3 = this.f33968g;
        if ((i3 != 20 && i3 != 21) || TextUtils.isEmpty(str) || (c3Var = this.f33971k) != null) {
            return;
        }
        if (c3Var == null) {
            ei.c3 c3Var2 = new ei.c3(this, 4);
            this.f33971k = c3Var2;
            c3Var2.d = this.h;
            c3Var2.A1 = true;
            if (i3 == 12) {
                c3Var2.f21282y = true;
            }
        }
        this.f33970j = true;
        this.f33971k.w0(org.telegram.messenger.i6.g(str));
        this.f33971k.B0 = true;
    }

    public final void s(long j10) {
        ei.c3 c3Var = this.f33971k;
        if (c3Var != null) {
            if (this.f33968g == 8) {
                j10 = 0;
            }
            if (c3Var.B() != null) {
                this.f33971k.B().V(j10);
            }
            if (this.f33971k.m() != null) {
                this.f33971k.m().D(j10);
            }
        }
    }

    @Override
    public final void setAlpha(int i3) {
        float f10 = i3 / 255.0f;
        this.f33972l = f10;
        ei.c3 c3Var = this.f33971k;
        if (c3Var != null) {
            c3Var.setAlpha(f10);
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f33977q = colorFilter;
        if (this.f33971k != null && this.f33966e != null) {
            if (c()) {
                this.f33971k.f21261p1 = colorFilter;
                return;
            }
            return;
        }
        this.f33976p = colorFilter;
    }

    public final String toString() {
        String V;
        StringBuilder sb2 = new StringBuilder("AnimatedEmojiDrawable{");
        TLRPC.Document document = this.f33966e;
        if (document == null) {
            V = "null";
        } else {
            V = org.telegram.messenger.zi.V(document, null, null);
        }
        return a1.g.s(sb2, V, "}");
    }

    public final void u() {
        ArrayList arrayList;
        boolean z10;
        if (this.f33971k != null) {
            ArrayList arrayList2 = this.f33964b;
            if ((arrayList2 != null && arrayList2.size() > 0) || (((arrayList = this.f33965c) != null && arrayList.size() > 0) || this.f33973m)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 != this.f33963a) {
                this.f33963a = z10;
                if (z10) {
                    this.f33971k.P();
                } else {
                    this.f33971k.R();
                }
                if (!this.f33963a) {
                    org.telegram.messenger.hc hcVar = f33961w;
                    org.telegram.messenger.g0.r(hcVar);
                    org.telegram.messenger.g0.i3(hcVar, 5000L);
                }
            }
        }
    }

    public final void v(ImageReceiver imageReceiver) {
        int i3 = this.f33968g;
        if (i3 != 7 && i3 != 9 && i3 != 10) {
            if (i3 != 11 && i3 != 18 && i3 != 14 && i3 != 6 && i3 != 5 && i3 != 22) {
                if (i3 == 17) {
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
        int i3 = this.f33968g;
        if (i3 != 0 && i3 != 26) {
            TextPaint[] textPaintArr = org.telegram.ui.ActionBar.k6.f28269y2;
            if (textPaintArr != null && (i3 == 1 || i3 == 4 || i3 == 19 || i3 == 20)) {
                this.d = (int) (((Math.abs(org.telegram.ui.ActionBar.k6.f28269y2[2].descent()) + Math.abs(textPaintArr[2].ascent())) * 1.15f) / org.telegram.messenger.g0.f22607p);
                return;
            } else if (textPaintArr != null && i3 == 8) {
                this.d = (int) (((Math.abs(org.telegram.ui.ActionBar.k6.f28269y2[0].descent()) + Math.abs(textPaintArr[0].ascent())) * 1.15f) / org.telegram.messenger.g0.f22607p);
                return;
            } else if (i3 != 14 && i3 != 15 && i3 != 17) {
                if (i3 != 11 && i3 != 22) {
                    if (i3 == 27) {
                        this.d = 50;
                        return;
                    } else if (i3 == 24) {
                        this.d = 140;
                        return;
                    } else if (i3 == 23) {
                        this.d = 14;
                        return;
                    } else if (i3 == 21) {
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
        this.d = (int) (((Math.abs(org.telegram.ui.ActionBar.k6.f28077o2.descent()) + Math.abs(org.telegram.ui.ActionBar.k6.f28077o2.ascent())) * 1.15f) / org.telegram.messenger.g0.f22607p);
    }

    public g5(int i3, int i10, TLRPC.Document document) {
        this.f33968g = i3;
        this.h = i10;
        this.f33966e = document;
        x();
        w();
        i(false);
    }
}
