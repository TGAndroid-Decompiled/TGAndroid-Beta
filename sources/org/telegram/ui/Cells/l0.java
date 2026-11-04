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
import org.telegram.messenger.bd;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.io;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.al0;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.ly0;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.xq;
public final class l0 {
    public boolean A;
    public boolean B;
    public float C;
    public VelocityTracker D;
    public final al0 E;
    public k0 F;
    public ea G;
    public final q1 f29522a;
    public int f29523b;
    public long f29524c;
    public zi d;
    public long f29525e;
    public StaticLayout f29527g;
    public float h;
    public float f29528i;
    public int f29529j;
    public float f29534o;
    public float f29535p;
    public w70 f29538s;
    public final org.telegram.ui.Components.u5 f29540u;
    public ly0 v;
    public final gc f29543y;
    public final TextPaint f29526f = new TextPaint(1);
    public final Paint f29530k = new Paint(1);
    public final Path f29531l = new Path();
    public final float f29532m = -1.0f;
    public int f29533n = org.telegram.messenger.g0.L(66.0f);
    public final ArrayList f29536q = new ArrayList();
    public final Path f29537r = new Path();
    public final RectF f29541w = new RectF();
    public final RectF f29542x = new RectF();
    public final Paint f29544z = new Paint(1);
    public boolean f29539t = true;

    public l0(q1 q1Var) {
        this.f29522a = q1Var;
        this.E = new al0(q1Var.getContext(), null);
        this.f29543y = new gc(q1Var);
        this.f29540u = new org.telegram.ui.Components.u5(q1Var, 350L, xq.h);
    }

    public final boolean a(android.view.MotionEvent r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.l0.a(android.view.MotionEvent):boolean");
    }

    public final void b() {
        al0 al0Var = this.E;
        if (al0Var.b()) {
            float f10 = al0Var.f31883j;
            this.f29534o = f10;
            this.f29534o = Utilities.i(f10, this.f29535p - (this.f29541w.width() - org.telegram.messenger.g0.L(14.0f)), 0.0f);
            this.f29522a.p2();
        }
    }

    public final void c(android.graphics.Canvas r50) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.l0.c(android.graphics.Canvas):void");
    }

    public final boolean d() {
        if (this.d.f26852g1 && this.f29536q.size() > 0) {
            return true;
        }
        return false;
    }

    public final void e(zi ziVar) {
        StaticLayout staticLayout;
        ArrayList arrayList;
        ArrayList arrayList2;
        boolean z10;
        int i3;
        TLObject tLObject;
        TLObject tLObject2;
        TLObject tLObject3;
        int i10;
        int i11;
        ArrayList arrayList3;
        this.f29523b = ziVar.I1;
        this.d = ziVar;
        this.f29524c = zi.B0(ziVar.f26868k);
        hp.s1(this.f29523b).M0(Long.valueOf(-this.f29524c));
        this.f29525e = -this.f29524c;
        Typeface o10 = org.telegram.messenger.g0.o();
        TextPaint textPaint = this.f29526f;
        textPaint.setTypeface(o10);
        textPaint.setTextSize(org.telegram.messenger.g0.L(14.0f));
        int i12 = org.telegram.ui.ActionBar.k6.Wc;
        q1 q1Var = this.f29522a;
        textPaint.setColor(org.telegram.ui.ActionBar.k6.w0(i12, q1Var.Pb));
        this.f29527g = new StaticLayout(bd.M0(2131752391, null), textPaint, this.d.m1(), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        this.h = staticLayout.getWidth();
        this.f29528i = 0.0f;
        for (int i13 = 0; i13 < this.f29527g.getLineCount(); i13++) {
            this.h = Math.min(this.h, this.f29527g.getLineLeft(i13));
            this.f29528i = Math.max(this.f29528i, this.f29527g.getLineRight(i13));
        }
        this.f29529j = this.f29527g.getHeight();
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = this.f29544z;
        paint.setStyle(style);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.W5, q1Var.Pb));
        q1Var.f30106v0 = org.telegram.messenger.g0.L(14.66f) + this.f29529j;
        int i14 = 0;
        while (true) {
            arrayList = this.f29536q;
            if (i14 >= arrayList.size()) {
                break;
            }
            k0 k0Var = (k0) arrayList.get(i14);
            int i15 = 0;
            while (true) {
                ImageReceiver[] imageReceiverArr = k0Var.f29468c;
                if (i15 < imageReceiverArr.length) {
                    imageReceiverArr[i15].R();
                    i15++;
                }
            }
            i14++;
        }
        arrayList.clear();
        io L0 = hp.s1(this.f29523b).L0(this.f29524c);
        if (L0 != null && (arrayList3 = L0.f23564b) != null) {
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
        if (!arrayList2.isEmpty() && (h10.i(this.f29523b).q() || arrayList2.size() != 1)) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f29539t = z10;
        if (!z10) {
            int size = arrayList2.size();
            if (!h10.i(this.f29523b).q() && L0.f23565c > 0) {
                size = Math.min(size - 1, hp.s1(this.f29523b).f23154w4);
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
                arrayList.add(new k0(q1Var, new TLObject[]{tLObject, tLObject2, tLObject3}, (arrayList2.size() + L0.f23565c) - min));
            }
        }
        if (this.v == null) {
            if (this.f29524c > 0) {
                i3 = 2131745329;
            } else {
                i3 = 2131745327;
            }
            ly0 ly0Var = new ly0(bd.M0(i3, null), 14.0f, org.telegram.messenger.g0.o());
            ly0Var.f35928o = true;
            this.v = ly0Var;
        }
        if (d()) {
            q1Var.f30106v0 = org.telegram.messenger.g0.L(144.0f) + q1Var.f30106v0;
            this.f29530k.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28143ra, q1Var.Pb));
        }
        float size2 = ((arrayList.size() - 1) * org.telegram.messenger.g0.L(9.0f)) + (arrayList.size() * this.f29533n);
        this.f29535p = size2;
        this.f29534o = Utilities.i(this.f29534o, size2, 0.0f);
    }
}
