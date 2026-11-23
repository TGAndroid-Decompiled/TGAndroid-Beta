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
public class p5 extends Drawable {
    public static SparseArray f38485r;
    public static HashMap f38486s;
    public static boolean f38487t;
    public static boolean f38488u;
    public static boolean v;
    public static final org.telegram.messenger.j2 f38489w = new org.telegram.messenger.j2(25);
    public static HashMap f38490x;
    public boolean f38491a;
    public ArrayList f38492b;
    public ArrayList f38493c;
    public int d;
    public TLRPC.Document f38494e;
    public long f38495f;
    public int f38496g;
    public int h;
    public String f38497i;
    public boolean f38498j;
    public fi.s2 f38499k;
    public boolean f38501m;
    public ColorFilter f38504p;
    public ColorFilter f38505q;
    public float f38500l = 1.0f;
    public Boolean f38502n = null;
    public Boolean f38503o = null;

    public p5(int i7, int i10, long j3) {
        this.h = i10;
        this.f38496g = i7;
        x();
        this.f38495f = j3;
        g(i10).b(j3, new h5(this, 0));
    }

    public static TLRPC.Document e(int i7, long j3) {
        HashMap hashMap = g(i7).f37107a;
        if (hashMap == null) {
            return null;
        }
        return (TLRPC.Document) hashMap.get(Long.valueOf(j3));
    }

    public static int f() {
        if (org.telegram.messenger.cz.o() == 0) {
            return 0;
        }
        return 2;
    }

    public static l5 g(int i7) {
        if (f38486s == null) {
            f38486s = new HashMap();
        }
        l5 l5Var = (l5) f38486s.get(Integer.valueOf(i7));
        if (l5Var == null) {
            HashMap hashMap = f38486s;
            Integer valueOf = Integer.valueOf(i7);
            l5 l5Var2 = new l5(i7);
            hashMap.put(valueOf, l5Var2);
            return l5Var2;
        }
        return l5Var;
    }

    public static p5 l(int i7, int i10, TLRPC.Document document) {
        if (f38485r == null) {
            f38485r = new SparseArray();
        }
        int hash = Objects.hash(Integer.valueOf(i7), Integer.valueOf(i10));
        LongSparseArray longSparseArray = (LongSparseArray) f38485r.get(hash);
        if (longSparseArray == null) {
            SparseArray sparseArray = f38485r;
            LongSparseArray longSparseArray2 = new LongSparseArray();
            sparseArray.put(hash, longSparseArray2);
            longSparseArray = longSparseArray2;
        }
        p5 p5Var = (p5) longSparseArray.get(document.f28440id);
        if (p5Var == null) {
            long j3 = document.f28440id;
            p5 p5Var2 = new p5(i10, i7, document);
            longSparseArray.put(j3, p5Var2);
            return p5Var2;
        }
        return p5Var;
    }

    public static p5 m(int i7, long j3, String str, int i10) {
        if (f38485r == null) {
            f38485r = new SparseArray();
        }
        int hash = Objects.hash(Integer.valueOf(i7), Integer.valueOf(i10));
        LongSparseArray longSparseArray = (LongSparseArray) f38485r.get(hash);
        if (longSparseArray == null) {
            SparseArray sparseArray = f38485r;
            LongSparseArray longSparseArray2 = new LongSparseArray();
            sparseArray.put(hash, longSparseArray2);
            longSparseArray = longSparseArray2;
        }
        p5 p5Var = (p5) longSparseArray.get(j3);
        if (p5Var == null) {
            ?? drawable = new Drawable();
            drawable.f38500l = 1.0f;
            drawable.f38502n = null;
            drawable.f38503o = null;
            drawable.h = i7;
            drawable.f38496g = i10;
            drawable.x();
            drawable.f38495f = j3;
            drawable.f38497i = str;
            g(i7).b(j3, new h5(drawable, 1));
            longSparseArray.put(j3, drawable);
            return drawable;
        }
        return p5Var;
    }

    public static void r(int i7, boolean z10) {
        LongSparseArray longSparseArray;
        fi.s2 s2Var;
        boolean z11 = !z10;
        if (v != z11) {
            v = z11;
            if (f38485r != null && (longSparseArray = (LongSparseArray) f38485r.get(Objects.hash(Integer.valueOf(i7), 25))) != null) {
                for (int i10 = 0; i10 < longSparseArray.size(); i10++) {
                    p5 p5Var = (p5) longSparseArray.valueAt(i10);
                    if (p5Var != null && (s2Var = p5Var.f38499k) != null) {
                        if (z10) {
                            s2Var.f22697v0 = true;
                            s2Var.f22695u0 = true;
                            s2Var.W(1);
                            c6 m10 = s2Var.m();
                            if (m10 != null) {
                                boolean z12 = s2Var.f22700w0;
                                if (!m10.f34086o0) {
                                    m10.f34097w0 = z12;
                                }
                                m10.start();
                            } else {
                                oh0 B = s2Var.B();
                                if (B != null) {
                                    B.start();
                                }
                            }
                        } else {
                            s2Var.f22695u0 = false;
                            s2Var.f22697v0 = false;
                            s2Var.W(0);
                            s2Var.Q0();
                        }
                    }
                }
            }
        }
    }

    public static void t() {
        if (f38485r != null) {
            w();
            for (int i7 = 0; i7 < f38485r.size(); i7++) {
                LongSparseArray longSparseArray = (LongSparseArray) f38485r.valueAt(i7);
                for (int i10 = 0; i10 < longSparseArray.size(); i10++) {
                    long keyAt = longSparseArray.keyAt(i10);
                    p5 p5Var = (p5) longSparseArray.get(keyAt);
                    if (p5Var != null && p5Var.f38491a) {
                        p5Var.i(true);
                    } else {
                        longSparseArray.remove(keyAt);
                    }
                }
            }
        }
    }

    public static void w() {
        f38487t = org.telegram.messenger.qc.e(16388);
        f38488u = org.telegram.messenger.qc.e(8200);
    }

    public final void a(View view) {
        if (!(view instanceof org.telegram.ui.v01)) {
            this.f38501m = false;
            if (this.f38492b == null) {
                this.f38492b = new ArrayList(10);
            }
            if (!this.f38492b.contains(view)) {
                this.f38492b.add(view);
            }
            u();
            return;
        }
        throw new RuntimeException();
    }

    public final void b(v5 v5Var) {
        if (this.f38493c == null) {
            this.f38493c = new ArrayList(10);
        }
        this.f38501m = false;
        if (!this.f38493c.contains(v5Var)) {
            this.f38493c.add(v5Var);
        }
        u();
    }

    public final boolean c() {
        boolean z10 = true;
        if (this.f38496g == 19) {
            return true;
        }
        Boolean bool = this.f38502n;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (this.f38494e == null) {
            return false;
        }
        if (!k() && !org.telegram.messenger.gj.C4(this.f38494e)) {
            z10 = false;
        }
        this.f38502n = Boolean.valueOf(z10);
        return z10;
    }

    public final void d() {
        ArrayList arrayList = this.f38493c;
        if (arrayList != null) {
            arrayList.clear();
        }
        ArrayList arrayList2 = this.f38492b;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        this.f38501m = false;
        u();
    }

    @Override
    public final void draw(Canvas canvas) {
        fi.s2 s2Var = this.f38499k;
        if (s2Var == null) {
            return;
        }
        s2Var.z0(getBounds());
        this.f38499k.setAlpha(this.f38500l);
        this.f38499k.h(canvas, null);
    }

    @Override
    public final int getAlpha() {
        return (int) (this.f38500l * 255.0f);
    }

    @Override
    public final ColorFilter getColorFilter() {
        return this.f38505q;
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
        TLRPC.Document document = this.f38494e;
        if (document != null) {
            return document.f28440id;
        }
        return this.f38495f;
    }

    public final void i(boolean r36) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.p5.i(boolean):void");
    }

    public final void j() {
        if (this.f38492b != null) {
            for (int i7 = 0; i7 < this.f38492b.size(); i7++) {
                View view = (View) this.f38492b.get(i7);
                if (view != null) {
                    view.invalidate();
                }
            }
        }
        if (this.f38493c != null) {
            for (int i10 = 0; i10 < this.f38493c.size(); i10++) {
                v5 v5Var = (v5) this.f38493c.get(i10);
                if (v5Var != null) {
                    v5Var.invalidate();
                }
            }
        }
    }

    public final boolean k() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.p5.k():boolean");
    }

    public final void n(View view) {
        ArrayList arrayList = this.f38492b;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        this.f38501m = false;
        u();
    }

    public final void o(v5 v5Var) {
        ArrayList arrayList = this.f38493c;
        if (arrayList != null) {
            arrayList.remove(v5Var);
        }
        this.f38501m = false;
        u();
    }

    public final void p(long j3) {
        fi.s2 s2Var = this.f38499k;
        if (s2Var != null) {
            if (this.f38496g == 8) {
                j3 = 0;
            }
            s2Var.f22690s = j3;
        }
    }

    public final void q(String str) {
        fi.s2 s2Var;
        int i7 = this.f38496g;
        if ((i7 != 20 && i7 != 21) || TextUtils.isEmpty(str) || (s2Var = this.f38499k) != null) {
            return;
        }
        if (s2Var == null) {
            fi.s2 s2Var2 = new fi.s2(this, 4);
            this.f38499k = s2Var2;
            s2Var2.d = this.h;
            s2Var2.A1 = true;
            if (i7 == 12) {
                s2Var2.f22705y = true;
            }
        }
        this.f38498j = true;
        this.f38499k.w0(org.telegram.messenger.j6.g(str));
        this.f38499k.B0 = true;
    }

    public final void s(long j3) {
        fi.s2 s2Var = this.f38499k;
        if (s2Var != null) {
            if (this.f38496g == 8) {
                j3 = 0;
            }
            if (s2Var.B() != null) {
                this.f38499k.B().V(j3);
            }
            if (this.f38499k.m() != null) {
                this.f38499k.m().D(j3);
            }
        }
    }

    @Override
    public final void setAlpha(int i7) {
        float f10 = i7 / 255.0f;
        this.f38500l = f10;
        fi.s2 s2Var = this.f38499k;
        if (s2Var != null) {
            s2Var.setAlpha(f10);
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f38505q = colorFilter;
        if (this.f38499k != null && this.f38494e != null) {
            if (c()) {
                this.f38499k.f22684p1 = colorFilter;
                return;
            }
            return;
        }
        this.f38504p = colorFilter;
    }

    public final String toString() {
        String V;
        StringBuilder sb2 = new StringBuilder("AnimatedEmojiDrawable{");
        TLRPC.Document document = this.f38494e;
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
        if (this.f38499k != null) {
            ArrayList arrayList2 = this.f38492b;
            if ((arrayList2 != null && arrayList2.size() > 0) || (((arrayList = this.f38493c) != null && arrayList.size() > 0) || this.f38501m)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 != this.f38491a) {
                this.f38491a = z10;
                if (z10) {
                    this.f38499k.P();
                } else {
                    this.f38499k.R();
                }
                if (!this.f38491a) {
                    org.telegram.messenger.j2 j2Var = f38489w;
                    org.telegram.messenger.g0.r(j2Var);
                    org.telegram.messenger.g0.h3(j2Var, 5000L);
                }
            }
        }
    }

    public final void v(ImageReceiver imageReceiver) {
        int i7 = this.f38496g;
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
        int i7 = this.f38496g;
        if (i7 != 0 && i7 != 26) {
            TextPaint[] textPaintArr = org.telegram.ui.ActionBar.m6.f29769y2;
            if (textPaintArr != null && (i7 == 1 || i7 == 4 || i7 == 19 || i7 == 20)) {
                this.d = (int) (((Math.abs(org.telegram.ui.ActionBar.m6.f29769y2[2].descent()) + Math.abs(textPaintArr[2].ascent())) * 1.15f) / org.telegram.messenger.g0.f24045p);
                return;
            } else if (textPaintArr != null && i7 == 8) {
                this.d = (int) (((Math.abs(org.telegram.ui.ActionBar.m6.f29769y2[0].descent()) + Math.abs(textPaintArr[0].ascent())) * 1.15f) / org.telegram.messenger.g0.f24045p);
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
        this.d = (int) (((Math.abs(org.telegram.ui.ActionBar.m6.f29578o2.descent()) + Math.abs(org.telegram.ui.ActionBar.m6.f29578o2.ascent())) * 1.15f) / org.telegram.messenger.g0.f24045p);
    }

    public p5(int i7, int i10, TLRPC.Document document) {
        this.f38496g = i7;
        this.h = i10;
        this.f38494e = document;
        x();
        w();
        i(false);
    }
}
