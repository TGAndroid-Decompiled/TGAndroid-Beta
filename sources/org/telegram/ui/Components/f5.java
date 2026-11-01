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
public class f5 extends Drawable {
    public static SparseArray f26057r;
    public static HashMap f26058s;
    public static boolean f26059t;
    public static boolean f26060u;
    public static boolean v;
    public static final org.telegram.messenger.sz f26061w = new org.telegram.messenger.sz(8);
    public static HashMap f26062x;
    public boolean f26063a;
    public ArrayList f26064b;
    public ArrayList f26065c;
    public int d;
    public TLRPC.Document e;
    public long f26066f;
    public int f26067g;
    public int h;
    public String f26068i;
    public boolean f26069j;
    public ag.c2 f26070k;
    public boolean f26072m;
    public ColorFilter f26075p;
    public ColorFilter f26076q;
    public float f26071l = 1.0f;
    public Boolean f26073n = null;
    public Boolean f26074o = null;

    public f5(int i10, int i11, long j10) {
        this.h = i11;
        this.f26067g = i10;
        x();
        this.f26066f = j10;
        g(i11).b(j10, new x4(this, 0));
    }

    public static TLRPC.Document e(int i10, long j10) {
        HashMap hashMap = g(i10).f24631a;
        if (hashMap == null) {
            return null;
        }
        return (TLRPC.Document) hashMap.get(Long.valueOf(j10));
    }

    public static int f() {
        if (org.telegram.messenger.uz.o() == 0) {
            return 0;
        }
        return 2;
    }

    public static b5 g(int i10) {
        if (f26058s == null) {
            f26058s = new HashMap();
        }
        b5 b5Var = (b5) f26058s.get(Integer.valueOf(i10));
        if (b5Var == null) {
            HashMap hashMap = f26058s;
            Integer valueOf = Integer.valueOf(i10);
            b5 b5Var2 = new b5(i10);
            hashMap.put(valueOf, b5Var2);
            return b5Var2;
        }
        return b5Var;
    }

    public static f5 l(int i10, int i11, TLRPC.Document document) {
        if (f26057r == null) {
            f26057r = new SparseArray();
        }
        int hash = Objects.hash(Integer.valueOf(i10), Integer.valueOf(i11));
        LongSparseArray longSparseArray = (LongSparseArray) f26057r.get(hash);
        if (longSparseArray == null) {
            SparseArray sparseArray = f26057r;
            LongSparseArray longSparseArray2 = new LongSparseArray();
            sparseArray.put(hash, longSparseArray2);
            longSparseArray = longSparseArray2;
        }
        f5 f5Var = (f5) longSparseArray.get(document.f19800id);
        if (f5Var == null) {
            long j10 = document.f19800id;
            f5 f5Var2 = new f5(i11, i10, document);
            longSparseArray.put(j10, f5Var2);
            return f5Var2;
        }
        return f5Var;
    }

    public static f5 m(int i10, long j10, String str, int i11) {
        if (f26057r == null) {
            f26057r = new SparseArray();
        }
        int hash = Objects.hash(Integer.valueOf(i10), Integer.valueOf(i11));
        LongSparseArray longSparseArray = (LongSparseArray) f26057r.get(hash);
        if (longSparseArray == null) {
            SparseArray sparseArray = f26057r;
            LongSparseArray longSparseArray2 = new LongSparseArray();
            sparseArray.put(hash, longSparseArray2);
            longSparseArray = longSparseArray2;
        }
        f5 f5Var = (f5) longSparseArray.get(j10);
        if (f5Var == null) {
            ?? drawable = new Drawable();
            drawable.f26071l = 1.0f;
            drawable.f26073n = null;
            drawable.f26074o = null;
            drawable.h = i10;
            drawable.f26067g = i11;
            drawable.x();
            drawable.f26066f = j10;
            drawable.f26068i = str;
            g(i10).b(j10, new x4(drawable, 1));
            longSparseArray.put(j10, drawable);
            return drawable;
        }
        return f5Var;
    }

    public static void r(int i10, boolean z10) {
        LongSparseArray longSparseArray;
        ag.c2 c2Var;
        boolean z11 = !z10;
        if (v != z11) {
            v = z11;
            if (f26057r != null && (longSparseArray = (LongSparseArray) f26057r.get(Objects.hash(Integer.valueOf(i10), 25))) != null) {
                for (int i11 = 0; i11 < longSparseArray.size(); i11++) {
                    f5 f5Var = (f5) longSparseArray.valueAt(i11);
                    if (f5Var != null && (c2Var = f5Var.f26070k) != null) {
                        if (z10) {
                            c2Var.f14411u0 = true;
                            c2Var.f14409t0 = true;
                            c2Var.W(1);
                            s5 m10 = c2Var.m();
                            if (m10 != null) {
                                boolean z12 = c2Var.f14413v0;
                                if (!m10.f30195n0) {
                                    m10.f30205v0 = z12;
                                }
                                m10.start();
                            } else {
                                ci0 B = c2Var.B();
                                if (B != null) {
                                    B.start();
                                }
                            }
                        } else {
                            c2Var.f14409t0 = false;
                            c2Var.f14411u0 = false;
                            c2Var.W(0);
                            c2Var.Q0();
                        }
                    }
                }
            }
        }
    }

    public static void t() {
        if (f26057r != null) {
            w();
            for (int i10 = 0; i10 < f26057r.size(); i10++) {
                LongSparseArray longSparseArray = (LongSparseArray) f26057r.valueAt(i10);
                for (int i11 = 0; i11 < longSparseArray.size(); i11++) {
                    long keyAt = longSparseArray.keyAt(i11);
                    f5 f5Var = (f5) longSparseArray.get(keyAt);
                    if (f5Var != null && f5Var.f26063a) {
                        f5Var.i(true);
                    } else {
                        longSparseArray.remove(keyAt);
                    }
                }
            }
        }
    }

    public static void w() {
        f26059t = org.telegram.messenger.tc.e(16388);
        f26060u = org.telegram.messenger.tc.e(8200);
    }

    public final void a(View view) {
        if (!(view instanceof org.telegram.ui.j21)) {
            this.f26072m = false;
            if (this.f26064b == null) {
                this.f26064b = new ArrayList(10);
            }
            if (!this.f26064b.contains(view)) {
                this.f26064b.add(view);
            }
            u();
            return;
        }
        throw new RuntimeException();
    }

    public final void b(l5 l5Var) {
        if (this.f26065c == null) {
            this.f26065c = new ArrayList(10);
        }
        this.f26072m = false;
        if (!this.f26065c.contains(l5Var)) {
            this.f26065c.add(l5Var);
        }
        u();
    }

    public final boolean c() {
        boolean z10 = true;
        if (this.f26067g == 19) {
            return true;
        }
        Boolean bool = this.f26073n;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (this.e == null) {
            return false;
        }
        if (!k() && !org.telegram.messenger.kj.C4(this.e)) {
            z10 = false;
        }
        this.f26073n = Boolean.valueOf(z10);
        return z10;
    }

    public final void d() {
        ArrayList arrayList = this.f26065c;
        if (arrayList != null) {
            arrayList.clear();
        }
        ArrayList arrayList2 = this.f26064b;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        this.f26072m = false;
        u();
    }

    @Override
    public final void draw(Canvas canvas) {
        ag.c2 c2Var = this.f26070k;
        if (c2Var == null) {
            return;
        }
        c2Var.z0(getBounds());
        this.f26070k.setAlpha(this.f26071l);
        this.f26070k.h(canvas, null);
    }

    @Override
    public final int getAlpha() {
        return (int) (this.f26071l * 255.0f);
    }

    @Override
    public final ColorFilter getColorFilter() {
        return this.f26076q;
    }

    @Override
    public int getIntrinsicHeight() {
        return org.telegram.messenger.i0.L(this.d);
    }

    @Override
    public int getIntrinsicWidth() {
        return org.telegram.messenger.i0.L(this.d);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    public final long h() {
        TLRPC.Document document = this.e;
        if (document != null) {
            return document.f19800id;
        }
        return this.f26066f;
    }

    public final void i(boolean r36) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.f5.i(boolean):void");
    }

    public final void j() {
        if (this.f26064b != null) {
            for (int i10 = 0; i10 < this.f26064b.size(); i10++) {
                View view = (View) this.f26064b.get(i10);
                if (view != null) {
                    view.invalidate();
                }
            }
        }
        if (this.f26065c != null) {
            for (int i11 = 0; i11 < this.f26065c.size(); i11++) {
                l5 l5Var = (l5) this.f26065c.get(i11);
                if (l5Var != null) {
                    l5Var.invalidate();
                }
            }
        }
    }

    public final boolean k() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.f5.k():boolean");
    }

    public final void n(View view) {
        ArrayList arrayList = this.f26064b;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        this.f26072m = false;
        u();
    }

    public final void o(l5 l5Var) {
        ArrayList arrayList = this.f26065c;
        if (arrayList != null) {
            arrayList.remove(l5Var);
        }
        this.f26072m = false;
        u();
    }

    public final void p(long j10) {
        ag.c2 c2Var = this.f26070k;
        if (c2Var != null) {
            if (this.f26067g == 8) {
                j10 = 0;
            }
            c2Var.f14406s = j10;
        }
    }

    public final void q(String str) {
        ag.c2 c2Var;
        int i10 = this.f26067g;
        if ((i10 != 20 && i10 != 21) || TextUtils.isEmpty(str) || (c2Var = this.f26070k) != null) {
            return;
        }
        if (c2Var == null) {
            ag.c2 c2Var2 = new ag.c2(this, 3);
            this.f26070k = c2Var2;
            c2Var2.d = this.h;
            c2Var2.f14425z1 = true;
            if (i10 == 12) {
                c2Var2.f14421y = true;
            }
        }
        this.f26069j = true;
        this.f26070k.w0(org.telegram.messenger.k6.g(str));
        this.f26070k.A0 = true;
    }

    public final void s(long j10) {
        ag.c2 c2Var = this.f26070k;
        if (c2Var != null) {
            if (this.f26067g == 8) {
                j10 = 0;
            }
            if (c2Var.B() != null) {
                this.f26070k.B().V(j10);
            }
            if (this.f26070k.m() != null) {
                this.f26070k.m().D(j10);
            }
        }
    }

    @Override
    public final void setAlpha(int i10) {
        float f7 = i10 / 255.0f;
        this.f26071l = f7;
        ag.c2 c2Var = this.f26070k;
        if (c2Var != null) {
            c2Var.setAlpha(f7);
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f26076q = colorFilter;
        if (this.f26070k != null && this.e != null) {
            if (c()) {
                this.f26070k.f14398o1 = colorFilter;
                return;
            }
            return;
        }
        this.f26075p = colorFilter;
    }

    public final String toString() {
        String V;
        StringBuilder sb2 = new StringBuilder("AnimatedEmojiDrawable{");
        TLRPC.Document document = this.e;
        if (document == null) {
            V = "null";
        } else {
            V = org.telegram.messenger.kj.V(document, null, null);
        }
        return a1.g.r(sb2, V, "}");
    }

    public final void u() {
        ArrayList arrayList;
        boolean z10;
        if (this.f26070k != null) {
            ArrayList arrayList2 = this.f26064b;
            if ((arrayList2 != null && arrayList2.size() > 0) || (((arrayList = this.f26065c) != null && arrayList.size() > 0) || this.f26072m)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 != this.f26063a) {
                this.f26063a = z10;
                if (z10) {
                    this.f26070k.P();
                } else {
                    this.f26070k.R();
                }
                if (!this.f26063a) {
                    org.telegram.messenger.sz szVar = f26061w;
                    org.telegram.messenger.i0.r(szVar);
                    org.telegram.messenger.i0.h3(szVar, 5000L);
                }
            }
        }
    }

    public final void v(ImageReceiver imageReceiver) {
        int i10 = this.f26067g;
        if (i10 != 7 && i10 != 9 && i10 != 10) {
            if (i10 != 11 && i10 != 18 && i10 != 14 && i10 != 6 && i10 != 5 && i10 != 22) {
                if (i10 == 17) {
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
        int i10 = this.f26067g;
        if (i10 != 0 && i10 != 26) {
            TextPaint[] textPaintArr = org.telegram.ui.ActionBar.t6.f21309y2;
            if (textPaintArr != null && (i10 == 1 || i10 == 4 || i10 == 19 || i10 == 20)) {
                this.d = (int) (((Math.abs(org.telegram.ui.ActionBar.t6.f21309y2[2].descent()) + Math.abs(textPaintArr[2].ascent())) * 1.15f) / org.telegram.messenger.i0.f16171p);
                return;
            } else if (textPaintArr != null && i10 == 8) {
                this.d = (int) (((Math.abs(org.telegram.ui.ActionBar.t6.f21309y2[0].descent()) + Math.abs(textPaintArr[0].ascent())) * 1.15f) / org.telegram.messenger.i0.f16171p);
                return;
            } else if (i10 != 14 && i10 != 15 && i10 != 17) {
                if (i10 != 11 && i10 != 22) {
                    if (i10 == 27) {
                        this.d = 50;
                        return;
                    } else if (i10 == 24) {
                        this.d = 140;
                        return;
                    } else if (i10 == 23) {
                        this.d = 14;
                        return;
                    } else if (i10 == 21) {
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
        this.d = (int) (((Math.abs(org.telegram.ui.ActionBar.t6.f21131o2.descent()) + Math.abs(org.telegram.ui.ActionBar.t6.f21131o2.ascent())) * 1.15f) / org.telegram.messenger.i0.f16171p);
    }

    public f5(int i10, int i11, TLRPC.Document document) {
        this.f26067g = i10;
        this.h = i11;
        this.e = document;
        x();
        w();
        i(false);
    }
}
