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
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.mp;
import org.telegram.messenger.no;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.o80;
import org.telegram.ui.Components.vy0;
public final class m0 {
    public boolean A;
    public boolean B;
    public float C;
    public VelocityTracker D;
    public final jl0 E;
    public l0 F;
    public fa G;
    public final q1 f31020a;
    public int f31021b;
    public long f31022c;
    public fj d;
    public long f31023e;
    public StaticLayout f31025g;
    public float h;
    public float f31026i;
    public int f31027j;
    public float f31032o;
    public float f31033p;
    public o80 f31036s;
    public final org.telegram.ui.Components.c6 f31038u;
    public vy0 v;
    public final mc f31041y;
    public final TextPaint f31024f = new TextPaint(1);
    public final Paint f31028k = new Paint(1);
    public final Path f31029l = new Path();
    public final float f31030m = -1.0f;
    public int f31031n = org.telegram.messenger.g0.L(66.0f);
    public final ArrayList f31034q = new ArrayList();
    public final Path f31035r = new Path();
    public final RectF f31039w = new RectF();
    public final RectF f31040x = new RectF();
    public final Paint f31042z = new Paint(1);
    public boolean f31037t = true;

    public m0(q1 q1Var) {
        this.f31020a = q1Var;
        this.E = new jl0(q1Var.getContext(), null);
        this.f31041y = new mc(q1Var);
        this.f31038u = new org.telegram.ui.Components.c6(q1Var, 350L, lr.h);
    }

    public final boolean a(android.view.MotionEvent r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.m0.a(android.view.MotionEvent):boolean");
    }

    public final void b() {
        jl0 jl0Var = this.E;
        if (jl0Var.b()) {
            float f10 = jl0Var.f36474j;
            this.f31032o = f10;
            this.f31032o = Utilities.i(f10, this.f31033p - (this.f31039w.width() - org.telegram.messenger.g0.L(14.0f)), 0.0f);
            this.f31020a.q2();
        }
    }

    public final void c(android.graphics.Canvas r50) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.m0.c(android.graphics.Canvas):void");
    }

    public final boolean d() {
        if (this.d.f23961i1 && this.f31034q.size() > 0) {
            return true;
        }
        return false;
    }

    public final void e(fj fjVar) {
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
        this.f31021b = fjVar.K1;
        this.d = fjVar;
        this.f31022c = fj.B0(fjVar.f23968k);
        mp.u1(this.f31021b).O0(Long.valueOf(-this.f31022c));
        this.f31023e = -this.f31022c;
        Typeface o4 = org.telegram.messenger.g0.o();
        TextPaint textPaint = this.f31024f;
        textPaint.setTypeface(o4);
        textPaint.setTextSize(org.telegram.messenger.g0.L(14.0f));
        int i12 = org.telegram.ui.ActionBar.n6.Zc;
        q1 q1Var = this.f31020a;
        textPaint.setColor(org.telegram.ui.ActionBar.n6.w0(i12, q1Var.Qb));
        this.f31025g = new StaticLayout(gd.M0(2131752380, null), textPaint, this.d.l1(), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        this.h = staticLayout.getWidth();
        this.f31026i = 0.0f;
        for (int i13 = 0; i13 < this.f31025g.getLineCount(); i13++) {
            this.h = Math.min(this.h, this.f31025g.getLineLeft(i13));
            this.f31026i = Math.max(this.f31026i, this.f31025g.getLineRight(i13));
        }
        this.f31027j = this.f31025g.getHeight();
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = this.f31042z;
        paint.setStyle(style);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.W5, q1Var.Qb));
        q1Var.f31553v0 = org.telegram.messenger.g0.L(14.66f) + this.f31027j;
        int i14 = 0;
        while (true) {
            arrayList = this.f31034q;
            if (i14 >= arrayList.size()) {
                break;
            }
            l0 l0Var = (l0) arrayList.get(i14);
            int i15 = 0;
            while (true) {
                ImageReceiver[] imageReceiverArr = l0Var.f30966c;
                if (i15 < imageReceiverArr.length) {
                    imageReceiverArr[i15].R();
                    i15++;
                }
            }
            i14++;
        }
        arrayList.clear();
        no N0 = mp.u1(this.f31021b).N0(this.f31022c);
        if (N0 != null && (arrayList3 = N0.f25955b) != null) {
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
        if (!arrayList2.isEmpty() && (j10.i(this.f31021b).q() || arrayList2.size() != 1)) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f31037t = z10;
        if (!z10) {
            int size = arrayList2.size();
            if (!j10.i(this.f31021b).q() && N0.f25956c > 0) {
                size = Math.min(size - 1, mp.u1(this.f31021b).f25825z4);
            }
            int min = Math.min(size, 10);
            for (int i17 = 0; i17 < min; i17++) {
                arrayList.add(new l0(q1Var, (TLObject) arrayList2.get(i17)));
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
                arrayList.add(new l0(q1Var, new TLObject[]{tLObject, tLObject2, tLObject3}, (arrayList2.size() + N0.f25956c) - min));
            }
        }
        if (this.v == null) {
            if (this.f31022c > 0) {
                i7 = 2131745124;
            } else {
                i7 = 2131745122;
            }
            vy0 vy0Var = new vy0(gd.M0(i7, null), 14.0f, org.telegram.messenger.g0.o());
            vy0Var.f41492o = true;
            this.v = vy0Var;
        }
        if (d()) {
            q1Var.f31553v0 = org.telegram.messenger.g0.L(144.0f) + q1Var.f31553v0;
            this.f31028k.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29659ra, q1Var.Qb));
        }
        float size2 = ((arrayList.size() - 1) * org.telegram.messenger.g0.L(9.0f)) + (arrayList.size() * this.f31031n);
        this.f31033p = size2;
        this.f31032o = Utilities.i(this.f31032o, size2, 0.0f);
    }
}
