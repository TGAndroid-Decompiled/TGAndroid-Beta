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
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.oo;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.bl0;
import org.telegram.ui.Components.d80;
import org.telegram.ui.Components.dc;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.oy0;
public final class l0 {
    public boolean A;
    public boolean B;
    public float C;
    public VelocityTracker D;
    public final bl0 E;
    public k0 F;
    public ea G;
    public final q1 f30583a;
    public int f30584b;
    public long f30585c;
    public gj d;
    public long f30586e;
    public StaticLayout f30588g;
    public float h;
    public float f30589i;
    public int f30590j;
    public float f30595o;
    public float f30596p;
    public d80 f30599s;
    public final org.telegram.ui.Components.u5 f30601u;
    public oy0 v;
    public final dc f30604y;
    public final TextPaint f30587f = new TextPaint(1);
    public final Paint f30591k = new Paint(1);
    public final Path f30592l = new Path();
    public final float f30593m = -1.0f;
    public int f30594n = org.telegram.messenger.g0.L(66.0f);
    public final ArrayList f30597q = new ArrayList();
    public final Path f30598r = new Path();
    public final RectF f30602w = new RectF();
    public final RectF f30603x = new RectF();
    public final Paint f30605z = new Paint(1);
    public boolean f30600t = true;

    public l0(q1 q1Var) {
        this.f30583a = q1Var;
        this.E = new bl0(q1Var.getContext(), null);
        this.f30604y = new dc(q1Var);
        this.f30601u = new org.telegram.ui.Components.u5(q1Var, 350L, er.h);
    }

    public final boolean a(android.view.MotionEvent r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.l0.a(android.view.MotionEvent):boolean");
    }

    public final void b() {
        bl0 bl0Var = this.E;
        if (bl0Var.b()) {
            float f10 = bl0Var.f33314j;
            this.f30595o = f10;
            this.f30595o = Utilities.i(f10, this.f30596p - (this.f30602w.width() - org.telegram.messenger.g0.L(14.0f)), 0.0f);
            this.f30583a.q2();
        }
    }

    public final void c(android.graphics.Canvas r50) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.l0.c(android.graphics.Canvas):void");
    }

    public final boolean d() {
        if (this.d.f23812i1 && this.f30597q.size() > 0) {
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
        this.f30584b = gjVar.K1;
        this.d = gjVar;
        this.f30585c = gj.B0(gjVar.f23819k);
        np.s1(this.f30584b).M0(Long.valueOf(-this.f30585c));
        this.f30586e = -this.f30585c;
        Typeface o4 = org.telegram.messenger.g0.o();
        TextPaint textPaint = this.f30587f;
        textPaint.setTypeface(o4);
        textPaint.setTextSize(org.telegram.messenger.g0.L(14.0f));
        int i12 = org.telegram.ui.ActionBar.j6.Zc;
        q1 q1Var = this.f30583a;
        textPaint.setColor(org.telegram.ui.ActionBar.j6.w0(i12, q1Var.Qb));
        this.f30588g = new StaticLayout(hd.M0(2131752391, null), textPaint, this.d.l1(), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        this.h = staticLayout.getWidth();
        this.f30589i = 0.0f;
        for (int i13 = 0; i13 < this.f30588g.getLineCount(); i13++) {
            this.h = Math.min(this.h, this.f30588g.getLineLeft(i13));
            this.f30589i = Math.max(this.f30589i, this.f30588g.getLineRight(i13));
        }
        this.f30590j = this.f30588g.getHeight();
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = this.f30605z;
        paint.setStyle(style);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.W5, q1Var.Qb));
        q1Var.f31181v0 = org.telegram.messenger.g0.L(14.66f) + this.f30590j;
        int i14 = 0;
        while (true) {
            arrayList = this.f30597q;
            if (i14 >= arrayList.size()) {
                break;
            }
            k0 k0Var = (k0) arrayList.get(i14);
            int i15 = 0;
            while (true) {
                ImageReceiver[] imageReceiverArr = k0Var.f30529c;
                if (i15 < imageReceiverArr.length) {
                    imageReceiverArr[i15].R();
                    i15++;
                }
            }
            i14++;
        }
        arrayList.clear();
        oo L0 = np.s1(this.f30584b).L0(this.f30585c);
        if (L0 != null && (arrayList3 = L0.f25787b) != null) {
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
        if (!arrayList2.isEmpty() && (m10.i(this.f30584b).q() || arrayList2.size() != 1)) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f30600t = z10;
        if (!z10) {
            int size = arrayList2.size();
            if (!m10.i(this.f30584b).q() && L0.f25788c > 0) {
                size = Math.min(size - 1, np.s1(this.f30584b).f25438x4);
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
                arrayList.add(new k0(q1Var, new TLObject[]{tLObject, tLObject2, tLObject3}, (arrayList2.size() + L0.f25788c) - min));
            }
        }
        if (this.v == null) {
            if (this.f30585c > 0) {
                i7 = 2131745319;
            } else {
                i7 = 2131745317;
            }
            oy0 oy0Var = new oy0(hd.M0(i7, null), 14.0f, org.telegram.messenger.g0.o());
            oy0Var.f38113o = true;
            this.v = oy0Var;
        }
        if (d()) {
            q1Var.f31181v0 = org.telegram.messenger.g0.L(144.0f) + q1Var.f31181v0;
            this.f30591k.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29112ra, q1Var.Qb));
        }
        float size2 = ((arrayList.size() - 1) * org.telegram.messenger.g0.L(9.0f)) + (arrayList.size() * this.f30594n);
        this.f30596p = size2;
        this.f30595o = Utilities.i(this.f30595o, size2, 0.0f);
    }
}
