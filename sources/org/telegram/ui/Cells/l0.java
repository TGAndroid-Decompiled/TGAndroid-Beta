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
import org.telegram.messenger.dd;
import org.telegram.messenger.e20;
import org.telegram.messenger.kj;
import org.telegram.messenger.wp;
import org.telegram.messenger.xo;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.am0;
import org.telegram.ui.Components.dc;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.rz0;
import org.telegram.ui.Components.t80;
public final class l0 {
    public boolean A;
    public boolean B;
    public float C;
    public VelocityTracker D;
    public final am0 E;
    public k0 F;
    public ea G;
    public final q1 f22205a;
    public int f22206b;
    public long f22207c;
    public kj d;
    public long e;
    public StaticLayout f22209g;
    public float h;
    public float f22210i;
    public int f22211j;
    public float f22216o;
    public float f22217p;
    public t80 f22220s;
    public final org.telegram.ui.Components.t5 f22222u;
    public rz0 v;
    public final dc f22225y;
    public final TextPaint f22208f = new TextPaint(1);
    public final Paint f22212k = new Paint(1);
    public final Path f22213l = new Path();
    public final float f22214m = -1.0f;
    public int f22215n = org.telegram.messenger.i0.L(66.0f);
    public final ArrayList f22218q = new ArrayList();
    public final Path f22219r = new Path();
    public final RectF f22223w = new RectF();
    public final RectF f22224x = new RectF();
    public final Paint f22226z = new Paint(1);
    public boolean f22221t = true;

    public l0(q1 q1Var) {
        this.f22205a = q1Var;
        this.E = new am0(q1Var.getContext(), null);
        this.f22225y = new dc(q1Var);
        this.f22222u = new org.telegram.ui.Components.t5(q1Var, 350L, gr.h);
    }

    public final boolean a(android.view.MotionEvent r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.l0.a(android.view.MotionEvent):boolean");
    }

    public final void b() {
        am0 am0Var = this.E;
        if (am0Var.b()) {
            float f7 = am0Var.f24450j;
            this.f22216o = f7;
            this.f22216o = Utilities.i(f7, this.f22217p - (this.f22223w.width() - org.telegram.messenger.i0.L(14.0f)), 0.0f);
            this.f22205a.n2();
        }
    }

    public final void c(android.graphics.Canvas r50) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.l0.c(android.graphics.Canvas):void");
    }

    public final boolean d() {
        if (this.d.f16676g1 && this.f22218q.size() > 0) {
            return true;
        }
        return false;
    }

    public final void e(kj kjVar) {
        StaticLayout staticLayout;
        ArrayList arrayList;
        ArrayList arrayList2;
        boolean z10;
        int i10;
        TLObject tLObject;
        TLObject tLObject2;
        TLObject tLObject3;
        int i11;
        int i12;
        ArrayList arrayList3;
        this.f22206b = kjVar.I1;
        this.d = kjVar;
        this.f22207c = kj.B0(kjVar.f16690k);
        wp.r1(this.f22206b).L0(Long.valueOf(-this.f22207c));
        this.e = -this.f22207c;
        Typeface o10 = org.telegram.messenger.i0.o();
        TextPaint textPaint = this.f22208f;
        textPaint.setTypeface(o10);
        textPaint.setTextSize(org.telegram.messenger.i0.L(14.0f));
        int i13 = org.telegram.ui.ActionBar.t6.Wc;
        q1 q1Var = this.f22205a;
        textPaint.setColor(org.telegram.ui.ActionBar.t6.w0(i13, q1Var.Ob));
        this.f22209g = new StaticLayout(dd.L0(2131752391, null), textPaint, this.d.m1(), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        this.h = staticLayout.getWidth();
        this.f22210i = 0.0f;
        for (int i14 = 0; i14 < this.f22209g.getLineCount(); i14++) {
            this.h = Math.min(this.h, this.f22209g.getLineLeft(i14));
            this.f22210i = Math.max(this.f22210i, this.f22209g.getLineRight(i14));
        }
        this.f22211j = this.f22209g.getHeight();
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = this.f22226z;
        paint.setStyle(style);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.W5, q1Var.Ob));
        q1Var.f22738u0 = org.telegram.messenger.i0.L(14.66f) + this.f22211j;
        int i15 = 0;
        while (true) {
            arrayList = this.f22218q;
            if (i15 >= arrayList.size()) {
                break;
            }
            k0 k0Var = (k0) arrayList.get(i15);
            int i16 = 0;
            while (true) {
                ImageReceiver[] imageReceiverArr = k0Var.f22106c;
                if (i16 < imageReceiverArr.length) {
                    imageReceiverArr[i16].R();
                    i16++;
                }
            }
            i15++;
        }
        arrayList.clear();
        xo K0 = wp.r1(this.f22206b).K0(this.f22207c);
        if (K0 != null && (arrayList3 = K0.f19460b) != null) {
            arrayList2 = new ArrayList(arrayList3);
        } else {
            arrayList2 = new ArrayList();
        }
        int i17 = 0;
        while (i17 < arrayList2.size()) {
            TLObject tLObject4 = (TLObject) arrayList2.get(i17);
            if ((tLObject4 instanceof TLRPC.Chat) && !org.telegram.messenger.w3.r0((TLRPC.Chat) tLObject4)) {
                arrayList2.remove(i17);
                i17--;
            }
            i17++;
        }
        if (!arrayList2.isEmpty() && (e20.i(this.f22206b).q() || arrayList2.size() != 1)) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f22221t = z10;
        if (!z10) {
            int size = arrayList2.size();
            if (!e20.i(this.f22206b).q() && K0.f19461c > 0) {
                size = Math.min(size - 1, wp.r1(this.f22206b).f19288x4);
            }
            int min = Math.min(size, 10);
            for (int i18 = 0; i18 < min; i18++) {
                arrayList.add(new k0(q1Var, (TLObject) arrayList2.get(i18)));
            }
            if (min < arrayList2.size()) {
                if (min >= 0 && min < arrayList2.size()) {
                    tLObject = (TLObject) arrayList2.get(min);
                } else {
                    tLObject = null;
                }
                if (min >= 0 && (i12 = min + 1) < arrayList2.size()) {
                    tLObject2 = (TLObject) arrayList2.get(i12);
                } else {
                    tLObject2 = null;
                }
                if (min >= 0 && (i11 = min + 2) < arrayList2.size()) {
                    tLObject3 = (TLObject) arrayList2.get(i11);
                } else {
                    tLObject3 = null;
                }
                arrayList.add(new k0(q1Var, new TLObject[]{tLObject, tLObject2, tLObject3}, (arrayList2.size() + K0.f19461c) - min));
            }
        }
        if (this.v == null) {
            if (this.f22207c > 0) {
                i10 = 2131745337;
            } else {
                i10 = 2131745335;
            }
            rz0 rz0Var = new rz0(dd.L0(i10, null), 14.0f, org.telegram.messenger.i0.o());
            rz0Var.f30135o = true;
            this.v = rz0Var;
        }
        if (d()) {
            q1Var.f22738u0 = org.telegram.messenger.i0.L(144.0f) + q1Var.f22738u0;
            this.f22212k.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21191ra, q1Var.Ob));
        }
        float size2 = ((arrayList.size() - 1) * org.telegram.messenger.i0.L(9.0f)) + (arrayList.size() * this.f22215n);
        this.f22217p = size2;
        this.f22216o = Utilities.i(this.f22216o, size2, 0.0f);
    }
}
