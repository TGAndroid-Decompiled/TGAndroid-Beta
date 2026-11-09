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
import org.telegram.ui.Components.b80;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.ny0;
import org.telegram.ui.Components.xk0;
import org.telegram.ui.Components.xq;
public final class l0 {
    public boolean A;
    public boolean B;
    public float C;
    public VelocityTracker D;
    public final xk0 E;
    public k0 F;
    public ea G;
    public final q1 f29469a;
    public int f29470b;
    public long f29471c;
    public ij d;
    public long f29472e;
    public StaticLayout f29474g;
    public float h;
    public float f29475i;
    public int f29476j;
    public float f29481o;
    public float f29482p;
    public b80 f29485s;
    public final org.telegram.ui.Components.w5 f29487u;
    public ny0 v;
    public final ic f29490y;
    public final TextPaint f29473f = new TextPaint(1);
    public final Paint f29477k = new Paint(1);
    public final Path f29478l = new Path();
    public final float f29479m = -1.0f;
    public int f29480n = org.telegram.messenger.g0.L(66.0f);
    public final ArrayList f29483q = new ArrayList();
    public final Path f29484r = new Path();
    public final RectF f29488w = new RectF();
    public final RectF f29489x = new RectF();
    public final Paint f29491z = new Paint(1);
    public boolean f29486t = true;

    public l0(q1 q1Var) {
        this.f29469a = q1Var;
        this.E = new xk0(q1Var.getContext(), null);
        this.f29490y = new ic(q1Var);
        this.f29487u = new org.telegram.ui.Components.w5(q1Var, 350L, xq.h);
    }

    public final boolean a(android.view.MotionEvent r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.l0.a(android.view.MotionEvent):boolean");
    }

    public final void b() {
        xk0 xk0Var = this.E;
        if (xk0Var.b()) {
            float f10 = xk0Var.f40417j;
            this.f29481o = f10;
            this.f29481o = Utilities.i(f10, this.f29482p - (this.f29488w.width() - org.telegram.messenger.g0.L(14.0f)), 0.0f);
            this.f29469a.p2();
        }
    }

    public final void c(android.graphics.Canvas r50) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.l0.c(android.graphics.Canvas):void");
    }

    public final boolean d() {
        if (this.d.f23246g1 && this.f29483q.size() > 0) {
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
        this.f29470b = ijVar.I1;
        this.d = ijVar;
        this.f29471c = ij.B0(ijVar.f23262k);
        qp.s1(this.f29470b).M0(Long.valueOf(-this.f29471c));
        this.f29472e = -this.f29471c;
        Typeface o4 = org.telegram.messenger.g0.o();
        TextPaint textPaint = this.f29473f;
        textPaint.setTypeface(o4);
        textPaint.setTextSize(org.telegram.messenger.g0.L(14.0f));
        int i12 = org.telegram.ui.ActionBar.l6.Wc;
        q1 q1Var = this.f29469a;
        textPaint.setColor(org.telegram.ui.ActionBar.l6.w0(i12, q1Var.Pb));
        this.f29474g = new StaticLayout(id.M0(2131752391, null), textPaint, this.d.l1(), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        this.h = staticLayout.getWidth();
        this.f29475i = 0.0f;
        for (int i13 = 0; i13 < this.f29474g.getLineCount(); i13++) {
            this.h = Math.min(this.h, this.f29474g.getLineLeft(i13));
            this.f29475i = Math.max(this.f29475i, this.f29474g.getLineRight(i13));
        }
        this.f29476j = this.f29474g.getHeight();
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = this.f29491z;
        paint.setStyle(style);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setColor(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.W5, q1Var.Pb));
        q1Var.f30026u0 = org.telegram.messenger.g0.L(14.66f) + this.f29476j;
        int i14 = 0;
        while (true) {
            arrayList = this.f29483q;
            if (i14 >= arrayList.size()) {
                break;
            }
            k0 k0Var = (k0) arrayList.get(i14);
            int i15 = 0;
            while (true) {
                ImageReceiver[] imageReceiverArr = k0Var.f29398c;
                if (i15 < imageReceiverArr.length) {
                    imageReceiverArr[i15].R();
                    i15++;
                }
            }
            i14++;
        }
        arrayList.clear();
        ro L0 = qp.s1(this.f29470b).L0(this.f29471c);
        if (L0 != null && (arrayList3 = L0.f25313b) != null) {
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
        if (!arrayList2.isEmpty() && (p10.i(this.f29470b).q() || arrayList2.size() != 1)) {
            z9 = false;
        } else {
            z9 = true;
        }
        this.f29486t = z9;
        if (!z9) {
            int size = arrayList2.size();
            if (!p10.i(this.f29470b).q() && L0.f25314c > 0) {
                size = Math.min(size - 1, qp.s1(this.f29470b).f24929w4);
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
                arrayList.add(new k0(q1Var, new TLObject[]{tLObject, tLObject2, tLObject3}, (arrayList2.size() + L0.f25314c) - min));
            }
        }
        if (this.v == null) {
            if (this.f29471c > 0) {
                i7 = 2131745319;
            } else {
                i7 = 2131745317;
            }
            ny0 ny0Var = new ny0(id.M0(i7, null), 14.0f, org.telegram.messenger.g0.o());
            ny0Var.f36551o = true;
            this.v = ny0Var;
        }
        if (d()) {
            q1Var.f30026u0 = org.telegram.messenger.g0.L(144.0f) + q1Var.f30026u0;
            this.f29477k.setColor(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f28128ra, q1Var.Pb));
        }
        float size2 = ((arrayList.size() - 1) * org.telegram.messenger.g0.L(9.0f)) + (arrayList.size() * this.f29480n);
        this.f29482p = size2;
        this.f29481o = Utilities.i(this.f29481o, size2, 0.0f);
    }
}
