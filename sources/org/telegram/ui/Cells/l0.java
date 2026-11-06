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
import org.telegram.messenger.hd;
import org.telegram.messenger.ij;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.ro;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.a80;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.my0;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.xq;
public final class l0 {
    public boolean A;
    public boolean B;
    public float C;
    public VelocityTracker D;
    public final wk0 E;
    public k0 F;
    public ea G;
    public final q1 f29462a;
    public int f29463b;
    public long f29464c;
    public ij d;
    public long f29465e;
    public StaticLayout f29467g;
    public float h;
    public float f29468i;
    public int f29469j;
    public float f29474o;
    public float f29475p;
    public a80 f29478s;
    public final org.telegram.ui.Components.w5 f29480u;
    public my0 v;
    public final ic f29483y;
    public final TextPaint f29466f = new TextPaint(1);
    public final Paint f29470k = new Paint(1);
    public final Path f29471l = new Path();
    public final float f29472m = -1.0f;
    public int f29473n = org.telegram.messenger.g0.L(66.0f);
    public final ArrayList f29476q = new ArrayList();
    public final Path f29477r = new Path();
    public final RectF f29481w = new RectF();
    public final RectF f29482x = new RectF();
    public final Paint f29484z = new Paint(1);
    public boolean f29479t = true;

    public l0(q1 q1Var) {
        this.f29462a = q1Var;
        this.E = new wk0(q1Var.getContext(), null);
        this.f29483y = new ic(q1Var);
        this.f29480u = new org.telegram.ui.Components.w5(q1Var, 350L, xq.h);
    }

    public final boolean a(android.view.MotionEvent r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.l0.a(android.view.MotionEvent):boolean");
    }

    public final void b() {
        wk0 wk0Var = this.E;
        if (wk0Var.b()) {
            float f10 = wk0Var.f40037j;
            this.f29474o = f10;
            this.f29474o = Utilities.i(f10, this.f29475p - (this.f29481w.width() - org.telegram.messenger.g0.L(14.0f)), 0.0f);
            this.f29462a.p2();
        }
    }

    public final void c(android.graphics.Canvas r50) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.l0.c(android.graphics.Canvas):void");
    }

    public final boolean d() {
        if (this.d.f23228g1 && this.f29476q.size() > 0) {
            return true;
        }
        return false;
    }

    public final void e(ij ijVar) {
        StaticLayout staticLayout;
        ArrayList arrayList;
        ArrayList arrayList2;
        boolean z9;
        int i7;
        TLObject tLObject;
        TLObject tLObject2;
        TLObject tLObject3;
        int i10;
        int i11;
        ArrayList arrayList3;
        this.f29463b = ijVar.I1;
        this.d = ijVar;
        this.f29464c = ij.B0(ijVar.f23244k);
        qp.s1(this.f29463b).M0(Long.valueOf(-this.f29464c));
        this.f29465e = -this.f29464c;
        Typeface o4 = org.telegram.messenger.g0.o();
        TextPaint textPaint = this.f29466f;
        textPaint.setTypeface(o4);
        textPaint.setTextSize(org.telegram.messenger.g0.L(14.0f));
        int i12 = org.telegram.ui.ActionBar.k6.Wc;
        q1 q1Var = this.f29462a;
        textPaint.setColor(org.telegram.ui.ActionBar.k6.w0(i12, q1Var.Pb));
        this.f29467g = new StaticLayout(hd.M0(2131752391, null), textPaint, this.d.m1(), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        this.h = staticLayout.getWidth();
        this.f29468i = 0.0f;
        for (int i13 = 0; i13 < this.f29467g.getLineCount(); i13++) {
            this.h = Math.min(this.h, this.f29467g.getLineLeft(i13));
            this.f29468i = Math.max(this.f29468i, this.f29467g.getLineRight(i13));
        }
        this.f29469j = this.f29467g.getHeight();
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = this.f29484z;
        paint.setStyle(style);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.W5, q1Var.Pb));
        q1Var.f30018u0 = org.telegram.messenger.g0.L(14.66f) + this.f29469j;
        int i14 = 0;
        while (true) {
            arrayList = this.f29476q;
            if (i14 >= arrayList.size()) {
                break;
            }
            k0 k0Var = (k0) arrayList.get(i14);
            int i15 = 0;
            while (true) {
                ImageReceiver[] imageReceiverArr = k0Var.f29391c;
                if (i15 < imageReceiverArr.length) {
                    imageReceiverArr[i15].R();
                    i15++;
                }
            }
            i14++;
        }
        arrayList.clear();
        ro L0 = qp.s1(this.f29463b).L0(this.f29464c);
        if (L0 != null && (arrayList3 = L0.f25314b) != null) {
            arrayList2 = new ArrayList(arrayList3);
        } else {
            arrayList2 = new ArrayList();
        }
        int i16 = 0;
        while (i16 < arrayList2.size()) {
            TLObject tLObject4 = (TLObject) arrayList2.get(i16);
            if ((tLObject4 instanceof TLRPC.Chat) && !org.telegram.messenger.t3.r0((TLRPC.Chat) tLObject4)) {
                arrayList2.remove(i16);
                i16--;
            }
            i16++;
        }
        if (!arrayList2.isEmpty() && (p10.i(this.f29463b).q() || arrayList2.size() != 1)) {
            z9 = false;
        } else {
            z9 = true;
        }
        this.f29479t = z9;
        if (!z9) {
            int size = arrayList2.size();
            if (!p10.i(this.f29463b).q() && L0.f25315c > 0) {
                size = Math.min(size - 1, qp.s1(this.f29463b).f24922w4);
            }
            int min = Math.min(size, 10);
            for (int i17 = 0; i17 < min; i17++) {
                arrayList.add(new k0(q1Var, (TLObject) arrayList2.get(i17)));
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
                arrayList.add(new k0(q1Var, new TLObject[]{tLObject, tLObject2, tLObject3}, (arrayList2.size() + L0.f25315c) - min));
            }
        }
        if (this.v == null) {
            if (this.f29464c > 0) {
                i7 = 2131745320;
            } else {
                i7 = 2131745318;
            }
            my0 my0Var = new my0(hd.M0(i7, null), 14.0f, org.telegram.messenger.g0.o());
            my0Var.f36135o = true;
            this.v = my0Var;
        }
        if (d()) {
            q1Var.f30018u0 = org.telegram.messenger.g0.L(144.0f) + q1Var.f30018u0;
            this.f29470k.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28112ra, q1Var.Pb));
        }
        float size2 = ((arrayList.size() - 1) * org.telegram.messenger.g0.L(9.0f)) + (arrayList.size() * this.f29473n);
        this.f29475p = size2;
        this.f29474o = Utilities.i(this.f29474o, size2, 0.0f);
    }
}
