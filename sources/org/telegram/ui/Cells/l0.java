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
import org.telegram.ui.Components.ly0;
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
    public final q1 f29461a;
    public int f29462b;
    public long f29463c;
    public ij d;
    public long f29464e;
    public StaticLayout f29466g;
    public float h;
    public float f29467i;
    public int f29468j;
    public float f29473o;
    public float f29474p;
    public a80 f29477s;
    public final org.telegram.ui.Components.w5 f29479u;
    public ly0 v;
    public final ic f29482y;
    public final TextPaint f29465f = new TextPaint(1);
    public final Paint f29469k = new Paint(1);
    public final Path f29470l = new Path();
    public final float f29471m = -1.0f;
    public int f29472n = org.telegram.messenger.g0.L(66.0f);
    public final ArrayList f29475q = new ArrayList();
    public final Path f29476r = new Path();
    public final RectF f29480w = new RectF();
    public final RectF f29481x = new RectF();
    public final Paint f29483z = new Paint(1);
    public boolean f29478t = true;

    public l0(q1 q1Var) {
        this.f29461a = q1Var;
        this.E = new wk0(q1Var.getContext(), null);
        this.f29482y = new ic(q1Var);
        this.f29479u = new org.telegram.ui.Components.w5(q1Var, 350L, xq.h);
    }

    public final boolean a(android.view.MotionEvent r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.l0.a(android.view.MotionEvent):boolean");
    }

    public final void b() {
        wk0 wk0Var = this.E;
        if (wk0Var.b()) {
            float f10 = wk0Var.f40029j;
            this.f29473o = f10;
            this.f29473o = Utilities.i(f10, this.f29474p - (this.f29480w.width() - org.telegram.messenger.g0.L(14.0f)), 0.0f);
            this.f29461a.p2();
        }
    }

    public final void c(android.graphics.Canvas r50) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.l0.c(android.graphics.Canvas):void");
    }

    public final boolean d() {
        if (this.d.f23221g1 && this.f29475q.size() > 0) {
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
        this.f29462b = ijVar.I1;
        this.d = ijVar;
        this.f29463c = ij.B0(ijVar.f23237k);
        qp.s1(this.f29462b).M0(Long.valueOf(-this.f29463c));
        this.f29464e = -this.f29463c;
        Typeface o4 = org.telegram.messenger.g0.o();
        TextPaint textPaint = this.f29465f;
        textPaint.setTypeface(o4);
        textPaint.setTextSize(org.telegram.messenger.g0.L(14.0f));
        int i12 = org.telegram.ui.ActionBar.k6.Wc;
        q1 q1Var = this.f29461a;
        textPaint.setColor(org.telegram.ui.ActionBar.k6.w0(i12, q1Var.Pb));
        this.f29466g = new StaticLayout(hd.M0(2131752391, null), textPaint, this.d.m1(), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        this.h = staticLayout.getWidth();
        this.f29467i = 0.0f;
        for (int i13 = 0; i13 < this.f29466g.getLineCount(); i13++) {
            this.h = Math.min(this.h, this.f29466g.getLineLeft(i13));
            this.f29467i = Math.max(this.f29467i, this.f29466g.getLineRight(i13));
        }
        this.f29468j = this.f29466g.getHeight();
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = this.f29483z;
        paint.setStyle(style);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.W5, q1Var.Pb));
        q1Var.f30017u0 = org.telegram.messenger.g0.L(14.66f) + this.f29468j;
        int i14 = 0;
        while (true) {
            arrayList = this.f29475q;
            if (i14 >= arrayList.size()) {
                break;
            }
            k0 k0Var = (k0) arrayList.get(i14);
            int i15 = 0;
            while (true) {
                ImageReceiver[] imageReceiverArr = k0Var.f29390c;
                if (i15 < imageReceiverArr.length) {
                    imageReceiverArr[i15].R();
                    i15++;
                }
            }
            i14++;
        }
        arrayList.clear();
        ro L0 = qp.s1(this.f29462b).L0(this.f29463c);
        if (L0 != null && (arrayList3 = L0.f25306b) != null) {
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
        if (!arrayList2.isEmpty() && (p10.i(this.f29462b).q() || arrayList2.size() != 1)) {
            z9 = false;
        } else {
            z9 = true;
        }
        this.f29478t = z9;
        if (!z9) {
            int size = arrayList2.size();
            if (!p10.i(this.f29462b).q() && L0.f25307c > 0) {
                size = Math.min(size - 1, qp.s1(this.f29462b).f24914w4);
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
                arrayList.add(new k0(q1Var, new TLObject[]{tLObject, tLObject2, tLObject3}, (arrayList2.size() + L0.f25307c) - min));
            }
        }
        if (this.v == null) {
            if (this.f29463c > 0) {
                i7 = 2131745320;
            } else {
                i7 = 2131745318;
            }
            ly0 ly0Var = new ly0(hd.M0(i7, null), 14.0f, org.telegram.messenger.g0.o());
            ly0Var.f35792o = true;
            this.v = ly0Var;
        }
        if (d()) {
            q1Var.f30017u0 = org.telegram.messenger.g0.L(144.0f) + q1Var.f30017u0;
            this.f29469k.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28111ra, q1Var.Pb));
        }
        float size2 = ((arrayList.size() - 1) * org.telegram.messenger.g0.L(9.0f)) + (arrayList.size() * this.f29472n);
        this.f29474p = size2;
        this.f29473o = Utilities.i(this.f29473o, size2, 0.0f);
    }
}
