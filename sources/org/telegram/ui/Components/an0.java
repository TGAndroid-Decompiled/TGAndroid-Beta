package org.telegram.ui.Components;

import android.graphics.Path;
import android.graphics.Rect;
import android.os.Build;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.tl.TL_iv;
public final class an0 extends RichMessageLayout.RichBlock {
    public static final AtomicInteger K = new AtomicInteger();
    public String E;
    public dc1 F;
    public org.telegram.ui.Cells.da[] G;
    public boolean H;
    public long I;
    public boolean J;
    public final TL_iv.pageBlockEmbed f26576a;
    public jb1 f26577b;
    public final boolean f26578c;
    public int d;
    public final Path e;
    public final float[] f26579f;
    public final int h;
    public pb1 f26580n;
    public boolean f26581r;
    public long f26582s;
    public boolean v;
    public final wa0 f26583w;
    public int f26584x;
    public int f26585y;

    public an0(RichMessageLayout richMessageLayout, Rect rect, int i10, TL_iv.pageBlockEmbed pageblockembed, boolean z10) {
        super(richMessageLayout, rect, i10);
        an0 an0Var;
        this.e = new Path();
        this.f26579f = new float[8];
        this.h = K.incrementAndGet();
        this.f26583w = new wa0(this, 22);
        this.f26576a = pageblockembed;
        this.f26578c = z10;
        this.f26577b = fb1.e(pageblockembed.url);
        this.f26584x = h();
        String g7 = fb1.g(pageblockembed.url, this.f26577b, q());
        this.E = g7;
        if (g7.equals("placeholder") || this.E.startsWith("cache of width")) {
            AndroidUtilities.runOnUIThread(new bi.u8(pageblockembed.url, q(), richMessageLayout.isOut(), 5));
        }
        String str = pageblockembed.url;
        ConcurrentHashMap concurrentHashMap = fb1.f28143a;
        db1 db1Var = (db1) concurrentHashMap.get(str);
        if (db1Var == null) {
            an0Var = null;
        } else {
            an0Var = db1Var.f27491j;
        }
        if (an0Var != null && an0Var != this && an0Var.f26584x != this.f26584x) {
            k(an0Var.f26584x, "new layout, width " + Math.round(an0Var.q() / AndroidUtilities.density) + " -> " + Math.round(q() / AndroidUtilities.density), an0Var.E, false);
        }
        db1 db1Var2 = (db1) concurrentHashMap.get(pageblockembed.url);
        if (db1Var2 != null) {
            db1Var2.f27491j = this;
        }
    }

    public static int g() {
        int i10;
        int i11 = SharedConfig.bubbleRadius;
        if (i11 >= 15) {
            i10 = AndroidUtilities.dp(2.0f);
        } else if (i11 >= 11) {
            i10 = AndroidUtilities.dp(1.0f);
        } else {
            i10 = 0;
        }
        return (AndroidUtilities.dp(9.0f) + i10) - AndroidUtilities.dp(2.0f);
    }

    public final boolean f() {
        db1 db1Var;
        boolean z10;
        String str = this.f26576a.url;
        jb1 jb1Var = this.f26577b;
        if (jb1Var != null) {
            ConcurrentHashMap concurrentHashMap = fb1.f28143a;
            if (jb1Var.f29587i > 0) {
                return jb1Var.f29590l;
            }
        }
        eb1 eb1Var = null;
        if (fb1.i(str)) {
            db1Var = (db1) fb1.f28143a.get(str);
        } else {
            db1Var = null;
        }
        if (db1Var != null) {
            eb1Var = (eb1) fb1.f28144b.get(db1Var.a());
        }
        if (eb1Var != null) {
            synchronized (eb1Var) {
                if (!eb1Var.f27798a.isEmpty() && ((int[]) eb1Var.f27798a.get(0)).length > 2) {
                    if (((int[]) eb1Var.f27798a.get(0))[2] != 0) {
                        z10 = true;
                    }
                }
                z10 = false;
            }
            if (z10) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final int getHeight() {
        Rect rect = this.padding;
        return rect.top + this.f26584x + rect.bottom;
    }

    @Override
    public final org.telegram.ui.Cells.da[] getText() {
        return this.G;
    }

    public final int h() {
        db1 db1Var;
        int i10;
        int i11;
        int i12;
        String str = this.f26576a.url;
        jb1 jb1Var = this.f26577b;
        int q5 = q();
        if (fb1.i(str)) {
            db1Var = (db1) fb1.f28143a.get(str);
        } else {
            db1Var = null;
        }
        int i13 = 0;
        if (db1Var == null) {
            return 0;
        }
        if (db1Var.f27488f > 0) {
            return AndroidUtilities.dp(Math.max(50, Math.min(600, i10)));
        }
        if (jb1Var != null && Math.abs(jb1Var.f29589k - q5) <= 1) {
            i11 = jb1Var.f29587i;
        } else {
            i11 = 0;
        }
        if (i11 > 0) {
            return Math.min(AndroidUtilities.dp(600.0f), Math.max(AndroidUtilities.dp(50.0f), i11));
        }
        eb1 eb1Var = (eb1) fb1.f28144b.get(db1Var.a());
        if (eb1Var != null) {
            int c10 = fb1.c(q5);
            synchronized (eb1Var) {
                ArrayList arrayList = eb1Var.f27798a;
                int size = arrayList.size();
                int i14 = Integer.MAX_VALUE;
                i12 = 0;
                int i15 = 0;
                while (i15 < size) {
                    Object obj = arrayList.get(i15);
                    i15++;
                    int[] iArr = (int[]) obj;
                    int abs = Math.abs(iArr[0] - c10);
                    if (abs < i14) {
                        i12 = iArr[1];
                        i14 = abs;
                    }
                }
            }
            i13 = i12;
        }
        if (i13 <= 0) {
            i13 = 160;
        }
        return AndroidUtilities.dp(Math.max(50, Math.min(600, i13)));
    }

    public final View i() {
        return this.view;
    }

    @Override
    public final boolean isHorizontallyDragging() {
        pb1 pb1Var = this.f26580n;
        if (pb1Var != null && this.f26581r && pb1Var.f31537w && (pb1Var.K & 3) != 2) {
            if (pb1Var.f31540z || pb1Var.n()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void j() {
        vb1 i10;
        dc1 dc1Var;
        jb1 jb1Var = this.f26577b;
        if (jb1Var == null) {
            i10 = null;
        } else {
            i10 = jb1Var.i();
        }
        if (i10 == null) {
            dc1Var = null;
        } else {
            dc1Var = i10.f33623f;
        }
        if (dc1Var != this.F) {
            this.F = dc1Var;
            if (dc1Var == null) {
                this.G = null;
            } else {
                ArrayList arrayList = dc1Var.f27507a;
                this.G = new org.telegram.ui.Cells.da[arrayList.size()];
                int i11 = 0;
                while (true) {
                    org.telegram.ui.Cells.da[] daVarArr = this.G;
                    if (i11 >= daVarArr.length) {
                        break;
                    }
                    daVarArr[i11] = new li.a0(this, (bc1) arrayList.get(i11));
                    i11++;
                }
            }
            this.root.reposition();
        }
        View view = this.view;
        if (view != null) {
            view.invalidate();
        }
    }

    public final void k(int i10, String str, String str2, boolean z10) {
        long j10;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        if (!BuildVars.LOGS_ENABLED) {
            return;
        }
        long j11 = -1;
        if (this.f26581r) {
            j10 = SystemClock.uptimeMillis() - this.f26582s;
        } else {
            j10 = -1;
        }
        pb1 pb1Var = this.f26580n;
        if (pb1Var != null && pb1Var.f31534s != 0) {
            j11 = SystemClock.uptimeMillis() - pb1Var.f31534s;
        }
        StringBuilder sb2 = new StringBuilder("widget height ");
        sb2.append(this.f26576a.url.substring(10));
        sb2.append(": ");
        sb2.append(str);
        sb2.append(", ");
        sb2.append(Math.round(i10 / AndroidUtilities.density));
        sb2.append(" (");
        sb2.append(str2);
        sb2.append(") -> ");
        sb2.append(Math.round(this.f26584x / AndroidUtilities.density));
        sb2.append(" (");
        sb2.append(this.E);
        sb2.append("), width ");
        sb2.append(Math.round(q() / AndroidUtilities.density));
        String str9 = "";
        if (!z10) {
            str3 = "";
        } else {
            str3 = ", animated";
        }
        sb2.append(str3);
        if (this.view != null) {
            str4 = ", on screen";
        } else {
            str4 = ", off screen";
        }
        sb2.append(str4);
        if (j10 >= 0) {
            str5 = b10.i(j10, ", running ", " ms");
        } else {
            str5 = ", not running";
        }
        sb2.append(str5);
        if (this.f26577b != null) {
            StringBuilder sb3 = new StringBuilder(", session ");
            sb3.append(this.f26577b.f29595q);
            if (this.f26577b.f29586g == null) {
                str7 = "";
            } else {
                str7 = " (snapshot)";
            }
            sb3.append(str7);
            yb1 yb1Var = this.f26577b.f29585f;
            if (yb1Var != null && yb1Var.f35020y) {
                str8 = "";
            } else {
                str8 = ", scripts held";
            }
            sb3.append(str8);
            str6 = sb3.toString();
        } else {
            str6 = ", no widget yet";
        }
        sb2.append(str6);
        if (j11 >= 0 && j11 < 5000) {
            str9 = b10.i(j11, ", touched ", " ms ago");
        }
        ic.a.w(str9, sb2);
    }

    public final void l(String str) {
        if (this.view != null) {
            jb1 jb1Var = this.f26577b;
            if ((jb1Var == null || jb1Var.f29587i <= 0) && h() != this.f26584x) {
                m("on screen: ".concat(str), false);
                return;
            }
            return;
        }
        int h = h();
        int i10 = this.f26584x;
        if (h == i10) {
            return;
        }
        String str2 = this.E;
        this.f26584x = h;
        this.E = fb1.g(this.f26576a.url, this.f26577b, q());
        k(i10, "away: ".concat(str), str2, false);
        this.root.reposition();
        MessageObject messageObject = this.root.messageObject;
        if (messageObject != null) {
            messageObject.forceUpdate = true;
        }
        this.H = true;
    }

    public final void m(String str, boolean z10) {
        boolean z11;
        int h = h();
        int i10 = this.f26584x;
        boolean z12 = false;
        if (h != i10) {
            z11 = true;
        } else {
            z11 = false;
        }
        String str2 = this.E;
        this.f26584x = h;
        this.E = fb1.g(this.f26576a.url, this.f26577b, q());
        if (z11) {
            k(i10, str, str2, z10);
        }
        if (z11) {
            this.root.reposition();
        }
        if (z11 && z10) {
            this.I = SystemClock.uptimeMillis();
            this.J = false;
        }
        RichMessageLayout richMessageLayout = this.root;
        MessageObject messageObject = richMessageLayout.messageObject;
        if (messageObject != null) {
            messageObject.forceUpdate = true;
        }
        org.telegram.ui.Cells.s1 cell = richMessageLayout.getCell();
        org.telegram.ui.Cells.j1 delegate = this.root.getDelegate();
        View view = this.view;
        if (view != null && cell != null && delegate != null) {
            if (z11 && !f() && (cell.getParent() instanceof RecyclerView)) {
                View view2 = (View) cell.getParent();
                if (cell.getBottom() > view2.getPaddingTop() && cell.getTop() < view2.getHeight() - view2.getPaddingBottom()) {
                    z12 = true;
                }
            }
            if (z10) {
                delegate.l1(cell, z12, z12);
            } else {
                delegate.y0(cell, z12, z12);
            }
        } else if (view != null) {
            view.requestLayout();
        }
    }

    public final void n() {
        boolean z10;
        org.telegram.ui.ActionBar.u6 u6Var;
        MessageObject messageObject;
        boolean z11;
        vb1 vb1Var;
        boolean z12 = true;
        this.f26581r = true;
        this.f26582s = SystemClock.uptimeMillis();
        yb1 yb1Var = this.f26577b.f29585f;
        if (yb1Var != null && (vb1Var = yb1Var.D) != null && (vb1Var.f33624g || yb1Var.v)) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.v = z10;
        this.f26577b.l(q());
        org.telegram.ui.Cells.s1 cell = this.root.getCell();
        if (cell != null) {
            u6Var = cell.getResourcesProvider();
        } else {
            u6Var = null;
        }
        this.d = zb1.e(u6Var, this.root.isOut());
        jb1 jb1Var = this.f26577b;
        String a2 = zb1.a(u6Var, this.root.isOut());
        if (a2 != null) {
            if (!a2.equals(jb1Var.f29597s)) {
                jb1Var.f29597s = a2;
                jb1Var.f29591m = a2.contains("\"dark\"");
                yb1 yb1Var2 = jb1Var.f29585f;
                if (yb1Var2 != null) {
                    yb1Var2.d(a2);
                }
            }
        } else {
            jb1Var.getClass();
        }
        pb1 pb1Var = this.f26580n;
        jb1 jb1Var2 = this.f26577b;
        if (pb1Var.f31531p != jb1Var2) {
            pb1Var.p();
            pb1Var.f31531p = jb1Var2;
            if (jb1Var2 != null) {
                jb1Var2.h = pb1Var;
                jb1Var2.k(pb1Var.f31532q);
            }
        }
        pb1 pb1Var2 = this.f26580n;
        if (!pb1Var2.f31532q) {
            pb1Var2.f31532q = true;
            jb1 jb1Var3 = pb1Var2.f31531p;
            if (jb1Var3 != null && !pb1Var2.f31533r) {
                jb1Var3.k(true);
            }
        }
        db1 db1Var = (db1) fb1.f28143a.get(this.f26576a.url);
        if (db1Var != null) {
            db1Var.f27491j = this;
        }
        jb1 jb1Var4 = this.f26577b;
        db1 d = fb1.d(jb1Var4);
        if (d != null) {
            d.f27494m++;
            d.f27495n = System.currentTimeMillis();
            boolean z13 = fb1.f28149j;
            if (jb1Var4.f29594p != z13) {
                jb1Var4.f29594p = z13;
                yb1 yb1Var3 = jb1Var4.f29585f;
                if (yb1Var3 != null) {
                    if (jb1Var4.f29592n && !z13) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    yb1Var3.e(z11);
                }
            }
            if (d.f27496o) {
                fb1.p(d);
            } else {
                d.f27497p = true;
            }
            fb1.q();
        }
        if (!this.H || (messageObject = this.root.messageObject) == null || !messageObject.forceUpdate) {
            z12 = false;
        }
        this.H = false;
        if (!z12 && h() == this.f26584x) {
            return;
        }
        AndroidUtilities.runOnUIThread(new d60(1, this, z12));
    }

    public final void o(String str) {
        View view = this.view;
        if (view != null && Build.VERSION.SDK_INT >= 24) {
            zm0.a(view, str);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        jb1 jb1Var = this.f26577b;
        TL_iv.pageBlockEmbed pageblockembed = this.f26576a;
        if (jb1Var == null) {
            this.f26577b = fb1.e(pageblockembed.url);
        }
        if (this.f26577b == null) {
            return;
        }
        if (this.f26580n == null) {
            this.f26580n = new pb1(this, AndroidUtilities.density);
        }
        db1 db1Var = (db1) fb1.f28143a.get(pageblockembed.url);
        if (db1Var != null) {
            ArrayList arrayList = db1Var.f27492k;
            if (!arrayList.contains(this)) {
                arrayList.add(this);
            }
            boolean z10 = false;
            if (fb1.k(arrayList) != this) {
                pb1 pb1Var = this.f26580n;
                jb1 jb1Var2 = this.f26577b;
                pb1Var.p();
                pb1Var.f31531p = jb1Var2;
                if (jb1Var2 != null) {
                    z10 = true;
                }
                pb1Var.f31533r = z10;
                return;
            }
            an0 an0Var = db1Var.f27493l;
            db1Var.f27493l = this;
            if (an0Var != null && an0Var != this && an0Var.f26581r && an0Var.f26580n != null) {
                an0Var.p();
                pb1 pb1Var2 = an0Var.f26580n;
                jb1 jb1Var3 = an0Var.f26577b;
                pb1Var2.p();
                pb1Var2.f31531p = jb1Var3;
                if (jb1Var3 != null) {
                    z10 = true;
                }
                pb1Var2.f31533r = z10;
                View view = an0Var.view;
                if (view != null) {
                    view.invalidate();
                }
            }
        }
        n();
    }

    @Override
    public final void onDetachedFromWindow() {
        pb1 pb1Var;
        if (this.f26580n != null) {
            p();
            this.f26580n.p();
            db1 db1Var = (db1) fb1.f28143a.get(this.f26576a.url);
            if (db1Var != null) {
                ArrayList arrayList = db1Var.f27492k;
                arrayList.remove(this);
                if (db1Var.f27493l == this) {
                    an0 k10 = fb1.k(arrayList);
                    db1Var.f27493l = k10;
                    if (k10 != null && !k10.f26581r && k10.view != null && (pb1Var = k10.f26580n) != null && k10.f26577b != null) {
                        pb1Var.p();
                        k10.n();
                        k10.view.invalidate();
                    }
                }
            }
        }
    }

    @Override
    public final void onDraw(android.graphics.Canvas r38) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.an0.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f26580n != null && this.f26581r) {
            motionEvent.offsetLocation(this.f26585y, 0.0f);
            try {
                return this.f26580n.m(motionEvent);
            } finally {
                motionEvent.offsetLocation(-this.f26585y, 0.0f);
            }
        }
        return false;
    }

    public final void p() {
        db1 d;
        if (this.f26581r) {
            this.f26581r = false;
            AndroidUtilities.cancelRunOnUIThread(this.f26583w);
            pb1 pb1Var = this.f26580n;
            if (pb1Var.f31532q) {
                pb1Var.f31532q = false;
                jb1 jb1Var = pb1Var.f31531p;
                if (jb1Var != null && !pb1Var.f31533r) {
                    jb1Var.k(false);
                }
            }
            this.f26580n.p();
            jb1 jb1Var2 = this.f26577b;
            if (jb1Var2 != null && (d = fb1.d(jb1Var2)) != null) {
                d.f27494m = Math.max(0, d.f27494m - 1);
                d.f27495n = System.currentTimeMillis();
                fb1.q();
                fb1.f();
            }
        }
    }

    public final int q() {
        return (g() * 2) + this.maxWidth;
    }
}
