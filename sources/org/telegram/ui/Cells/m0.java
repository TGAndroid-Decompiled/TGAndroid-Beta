package org.telegram.ui.Cells;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.VelocityTracker;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.k10;
import org.telegram.messenger.np;
import org.telegram.messenger.oo;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.q80;
import org.telegram.ui.Components.xy0;
public final class m0 {
    public boolean A;
    public boolean B;
    public float C;
    public VelocityTracker D;
    public final ll0 E;
    public l0 F;
    public ga G;
    public final r1 f31024a;
    public int f31025b;
    public long f31026c;
    public gj d;
    public long f31027e;
    public StaticLayout f31029g;
    public float h;
    public float f31030i;
    public int f31031j;
    public float f31036o;
    public float f31037p;
    public q80 f31040s;
    public final org.telegram.ui.Components.d6 f31042u;
    public xy0 v;
    public final mc f31045y;
    public final TextPaint f31028f = new TextPaint(1);
    public final Paint f31032k = new Paint(1);
    public final Path f31033l = new Path();
    public final float f31034m = -1.0f;
    public int f31035n = org.telegram.messenger.g0.L(66.0f);
    public final ArrayList f31038q = new ArrayList();
    public final Path f31039r = new Path();
    public final RectF f31043w = new RectF();
    public final RectF f31044x = new RectF();
    public final Paint f31046z = new Paint(1);
    public boolean f31041t = true;

    public m0(r1 r1Var) {
        this.f31024a = r1Var;
        this.E = new ll0(r1Var.getContext(), null);
        this.f31045y = new mc(r1Var);
        this.f31042u = new org.telegram.ui.Components.d6(r1Var, 350L, nr.h);
    }

    public final boolean a(android.view.MotionEvent r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.m0.a(android.view.MotionEvent):boolean");
    }

    public final void b() {
        ll0 ll0Var = this.E;
        if (ll0Var.b()) {
            float f10 = ll0Var.f37181j;
            this.f31036o = f10;
            this.f31036o = Utilities.i(f10, this.f31037p - (this.f31043w.width() - org.telegram.messenger.g0.L(14.0f)), 0.0f);
            this.f31024a.q2();
        }
    }

    public final void c(android.graphics.Canvas r50) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.m0.c(android.graphics.Canvas):void");
    }

    public final boolean d() {
        if (this.d.f24170i1 && this.f31038q.size() > 0) {
            return true;
        }
        return false;
    }

    public final void e(gj gjVar) {
        StaticLayout staticLayout;
        ArrayList arrayList;
        ArrayList arrayList2;
        boolean z10;
        int i7;
        TLObject tLObject;
        TLObject tLObject2;
        TLObject tLObject3;
        int i10;
        int i11;
        ArrayList arrayList3;
        this.f31025b = gjVar.K1;
        this.d = gjVar;
        this.f31026c = gj.B0(gjVar.f24177k);
        np.u1(this.f31025b).O0(Long.valueOf(-this.f31026c));
        this.f31027e = -this.f31026c;
        Typeface o4 = org.telegram.messenger.g0.o();
        TextPaint textPaint = this.f31028f;
        textPaint.setTypeface(o4);
        textPaint.setTextSize(org.telegram.messenger.g0.L(14.0f));
        int i12 = org.telegram.ui.ActionBar.m6.Zc;
        r1 r1Var = this.f31024a;
        textPaint.setColor(org.telegram.ui.ActionBar.m6.w0(i12, r1Var.Qb));
        this.f31029g = new StaticLayout(hd.N0(2131752379, null), textPaint, this.d.l1(), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        this.h = staticLayout.getWidth();
        this.f31030i = 0.0f;
        for (int i13 = 0; i13 < this.f31029g.getLineCount(); i13++) {
            this.h = Math.min(this.h, this.f31029g.getLineLeft(i13));
            this.f31030i = Math.max(this.f31030i, this.f31029g.getLineRight(i13));
        }
        this.f31031j = this.f31029g.getHeight();
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = this.f31046z;
        paint.setStyle(style);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.W5, r1Var.Qb));
        r1Var.f31600v0 = org.telegram.messenger.g0.L(14.66f) + this.f31031j;
        int i14 = 0;
        while (true) {
            arrayList = this.f31038q;
            if (i14 >= arrayList.size()) {
                break;
            }
            l0 l0Var = (l0) arrayList.get(i14);
            int i15 = 0;
            while (true) {
                ImageReceiver[] imageReceiverArr = l0Var.f30951c;
                if (i15 < imageReceiverArr.length) {
                    imageReceiverArr[i15].R();
                    i15++;
                }
            }
            i14++;
        }
        arrayList.clear();
        oo N0 = np.u1(this.f31025b).N0(this.f31026c);
        if (N0 != null && (arrayList3 = N0.f26116b) != null) {
            arrayList2 = new ArrayList(arrayList3);
        } else {
            arrayList2 = new ArrayList();
        }
        int i16 = 0;
        while (i16 < arrayList2.size()) {
            TLObject tLObject4 = (TLObject) arrayList2.get(i16);
            if ((tLObject4 instanceof TLRPC.Chat) && !org.telegram.messenger.v3.r0((TLRPC.Chat) tLObject4)) {
                arrayList2.remove(i16);
                i16--;
            }
            i16++;
        }
        if (!arrayList2.isEmpty() && (k10.i(this.f31025b).q() || arrayList2.size() != 1)) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f31041t = z10;
        if (!z10) {
            int size = arrayList2.size();
            if (!k10.i(this.f31025b).q() && N0.f26117c > 0) {
                size = Math.min(size - 1, np.u1(this.f31025b).f25986z4);
            }
            int min = Math.min(size, 10);
            for (int i17 = 0; i17 < min; i17++) {
                arrayList.add(new l0(r1Var, (TLObject) arrayList2.get(i17)));
            }
            if (min < arrayList2.size()) {
                if (min >= 0 && min < arrayList2.size()) {
                    tLObject = (TLObject) arrayList2.get(min);
                } else {
                    tLObject = null;
                }
                if (min >= 0 && (i11 = min + 1) < arrayList2.size()) {
                    tLObject2 = (TLObject) arrayList2.get(i11);
                } else {
                    tLObject2 = null;
                }
                if (min >= 0 && (i10 = min + 2) < arrayList2.size()) {
                    tLObject3 = (TLObject) arrayList2.get(i10);
                } else {
                    tLObject3 = null;
                }
                arrayList.add(new l0(r1Var, new TLObject[]{tLObject, tLObject2, tLObject3}, (arrayList2.size() + N0.f26117c) - min));
            }
        }
        if (this.v == null) {
            if (this.f31026c > 0) {
                i7 = 2131745123;
            } else {
                i7 = 2131745121;
            }
            xy0 xy0Var = new xy0(hd.N0(i7, null), 14.0f, org.telegram.messenger.g0.o());
            xy0Var.f42234o = true;
            this.v = xy0Var;
        }
        if (d()) {
            r1Var.f31600v0 = org.telegram.messenger.g0.L(144.0f) + r1Var.f31600v0;
            this.f31032k.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29610ra, r1Var.Qb));
        }
        float size2 = ((arrayList.size() - 1) * org.telegram.messenger.g0.L(9.0f)) + (arrayList.size() * this.f31035n);
        this.f31037p = size2;
        this.f31036o = Utilities.i(this.f31036o, size2, 0.0f);
    }
}
