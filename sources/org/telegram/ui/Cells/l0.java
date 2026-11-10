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
import org.telegram.messenger.id;
import org.telegram.messenger.ij;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.ro;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.a80;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.my0;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.wq;
public final class l0 {
    public boolean A;
    public boolean B;
    public float C;
    public VelocityTracker D;
    public final wk0 E;
    public k0 F;
    public ea G;
    public final q1 f29480a;
    public int f29481b;
    public long f29482c;
    public ij d;
    public long f29483e;
    public StaticLayout f29485g;
    public float h;
    public float f29486i;
    public int f29487j;
    public float f29492o;
    public float f29493p;
    public a80 f29496s;
    public final org.telegram.ui.Components.v5 f29498u;
    public my0 v;
    public final hc f29501y;
    public final TextPaint f29484f = new TextPaint(1);
    public final Paint f29488k = new Paint(1);
    public final Path f29489l = new Path();
    public final float f29490m = -1.0f;
    public int f29491n = org.telegram.messenger.g0.L(66.0f);
    public final ArrayList f29494q = new ArrayList();
    public final Path f29495r = new Path();
    public final RectF f29499w = new RectF();
    public final RectF f29500x = new RectF();
    public final Paint f29502z = new Paint(1);
    public boolean f29497t = true;

    public l0(q1 q1Var) {
        this.f29480a = q1Var;
        this.E = new wk0(q1Var.getContext(), null);
        this.f29501y = new hc(q1Var);
        this.f29498u = new org.telegram.ui.Components.v5(q1Var, 350L, wq.h);
    }

    public final boolean a(android.view.MotionEvent r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.l0.a(android.view.MotionEvent):boolean");
    }

    public final void b() {
        wk0 wk0Var = this.E;
        if (wk0Var.b()) {
            float f10 = wk0Var.f40002j;
            this.f29492o = f10;
            this.f29492o = Utilities.i(f10, this.f29493p - (this.f29499w.width() - org.telegram.messenger.g0.L(14.0f)), 0.0f);
            this.f29480a.p2();
        }
    }

    public final void c(android.graphics.Canvas r50) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.l0.c(android.graphics.Canvas):void");
    }

    public final boolean d() {
        if (this.d.f23250g1 && this.f29494q.size() > 0) {
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
        this.f29481b = ijVar.I1;
        this.d = ijVar;
        this.f29482c = ij.B0(ijVar.f23266k);
        qp.s1(this.f29481b).M0(Long.valueOf(-this.f29482c));
        this.f29483e = -this.f29482c;
        Typeface o4 = org.telegram.messenger.g0.o();
        TextPaint textPaint = this.f29484f;
        textPaint.setTypeface(o4);
        textPaint.setTextSize(org.telegram.messenger.g0.L(14.0f));
        int i12 = org.telegram.ui.ActionBar.m6.Wc;
        q1 q1Var = this.f29480a;
        textPaint.setColor(org.telegram.ui.ActionBar.m6.w0(i12, q1Var.Pb));
        this.f29485g = new StaticLayout(id.M0(2131752391, null), textPaint, this.d.l1(), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        this.h = staticLayout.getWidth();
        this.f29486i = 0.0f;
        for (int i13 = 0; i13 < this.f29485g.getLineCount(); i13++) {
            this.h = Math.min(this.h, this.f29485g.getLineLeft(i13));
            this.f29486i = Math.max(this.f29486i, this.f29485g.getLineRight(i13));
        }
        this.f29487j = this.f29485g.getHeight();
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = this.f29502z;
        paint.setStyle(style);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.W5, q1Var.Pb));
        q1Var.f30037u0 = org.telegram.messenger.g0.L(14.66f) + this.f29487j;
        int i14 = 0;
        while (true) {
            arrayList = this.f29494q;
            if (i14 >= arrayList.size()) {
                break;
            }
            k0 k0Var = (k0) arrayList.get(i14);
            int i15 = 0;
            while (true) {
                ImageReceiver[] imageReceiverArr = k0Var.f29409c;
                if (i15 < imageReceiverArr.length) {
                    imageReceiverArr[i15].R();
                    i15++;
                }
            }
            i14++;
        }
        arrayList.clear();
        ro L0 = qp.s1(this.f29481b).L0(this.f29482c);
        if (L0 != null && (arrayList3 = L0.f25317b) != null) {
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
        if (!arrayList2.isEmpty() && (p10.i(this.f29481b).q() || arrayList2.size() != 1)) {
            z9 = false;
        } else {
            z9 = true;
        }
        this.f29497t = z9;
        if (!z9) {
            int size = arrayList2.size();
            if (!p10.i(this.f29481b).q() && L0.f25318c > 0) {
                size = Math.min(size - 1, qp.s1(this.f29481b).f24933w4);
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
                arrayList.add(new k0(q1Var, new TLObject[]{tLObject, tLObject2, tLObject3}, (arrayList2.size() + L0.f25318c) - min));
            }
        }
        if (this.v == null) {
            if (this.f29482c > 0) {
                i7 = 2131745319;
            } else {
                i7 = 2131745317;
            }
            my0 my0Var = new my0(id.M0(i7, null), 14.0f, org.telegram.messenger.g0.o());
            my0Var.f36143o = true;
            this.v = my0Var;
        }
        if (d()) {
            q1Var.f30037u0 = org.telegram.messenger.g0.L(144.0f) + q1Var.f30037u0;
            this.f29488k.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f28153ra, q1Var.Pb));
        }
        float size2 = ((arrayList.size() - 1) * org.telegram.messenger.g0.L(9.0f)) + (arrayList.size() * this.f29491n);
        this.f29493p = size2;
        this.f29492o = Utilities.i(this.f29492o, size2, 0.0f);
    }
}
