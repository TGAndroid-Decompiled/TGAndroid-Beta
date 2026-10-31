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
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.jj;
import org.telegram.messenger.vp;
import org.telegram.messenger.wo;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.dc;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.qz0;
import org.telegram.ui.Components.t80;
import org.telegram.ui.Components.zl0;
public final class l0 {
    public boolean A;
    public boolean B;
    public float C;
    public VelocityTracker D;
    public final zl0 E;
    public k0 F;
    public ea G;
    public final q1 f22204a;
    public int f22205b;
    public long f22206c;
    public jj d;
    public long e;
    public StaticLayout f22208g;
    public float h;
    public float f22209i;
    public int f22210j;
    public float f22215o;
    public float f22216p;
    public t80 f22219s;
    public final org.telegram.ui.Components.t5 f22221u;
    public qz0 v;
    public final dc f22224y;
    public final TextPaint f22207f = new TextPaint(1);
    public final Paint f22211k = new Paint(1);
    public final Path f22212l = new Path();
    public final float f22213m = -1.0f;
    public int f22214n = org.telegram.messenger.i0.L(66.0f);
    public final ArrayList f22217q = new ArrayList();
    public final Path f22218r = new Path();
    public final RectF f22222w = new RectF();
    public final RectF f22223x = new RectF();
    public final Paint f22225z = new Paint(1);
    public boolean f22220t = true;

    public l0(q1 q1Var) {
        this.f22204a = q1Var;
        this.E = new zl0(q1Var.getContext(), null);
        this.f22224y = new dc(q1Var);
        this.f22221u = new org.telegram.ui.Components.t5(q1Var, 350L, gr.h);
    }

    public final boolean a(android.view.MotionEvent r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.l0.a(android.view.MotionEvent):boolean");
    }

    public final void b() {
        zl0 zl0Var = this.E;
        if (zl0Var.b()) {
            float f7 = zl0Var.f33117j;
            this.f22215o = f7;
            this.f22215o = Utilities.i(f7, this.f22216p - (this.f22222w.width() - org.telegram.messenger.i0.L(14.0f)), 0.0f);
            this.f22204a.n2();
        }
    }

    public final void c(android.graphics.Canvas r50) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.l0.c(android.graphics.Canvas):void");
    }

    public final boolean d() {
        if (this.d.f16323g1 && this.f22217q.size() > 0) {
            return true;
        }
        return false;
    }

    public final void e(jj jjVar) {
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
        this.f22205b = jjVar.I1;
        this.d = jjVar;
        this.f22206c = jj.B0(jjVar.f16337k);
        vp.r1(this.f22205b).L0(Long.valueOf(-this.f22206c));
        this.e = -this.f22206c;
        Typeface o10 = org.telegram.messenger.i0.o();
        TextPaint textPaint = this.f22207f;
        textPaint.setTypeface(o10);
        textPaint.setTextSize(org.telegram.messenger.i0.L(14.0f));
        int i13 = org.telegram.ui.ActionBar.t6.Wc;
        q1 q1Var = this.f22204a;
        textPaint.setColor(org.telegram.ui.ActionBar.t6.w0(i13, q1Var.Ob));
        this.f22208g = new StaticLayout(cd.L0(2131752391, null), textPaint, this.d.m1(), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        this.h = staticLayout.getWidth();
        this.f22209i = 0.0f;
        for (int i14 = 0; i14 < this.f22208g.getLineCount(); i14++) {
            this.h = Math.min(this.h, this.f22208g.getLineLeft(i14));
            this.f22209i = Math.max(this.f22209i, this.f22208g.getLineRight(i14));
        }
        this.f22210j = this.f22208g.getHeight();
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = this.f22225z;
        paint.setStyle(style);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.W5, q1Var.Ob));
        q1Var.f22737u0 = org.telegram.messenger.i0.L(14.66f) + this.f22210j;
        int i15 = 0;
        while (true) {
            arrayList = this.f22217q;
            if (i15 >= arrayList.size()) {
                break;
            }
            k0 k0Var = (k0) arrayList.get(i15);
            int i16 = 0;
            while (true) {
                ImageReceiver[] imageReceiverArr = k0Var.f22105c;
                if (i16 < imageReceiverArr.length) {
                    imageReceiverArr[i16].R();
                    i16++;
                }
            }
            i15++;
        }
        arrayList.clear();
        wo K0 = vp.r1(this.f22205b).K0(this.f22206c);
        if (K0 != null && (arrayList3 = K0.f19117b) != null) {
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
        if (!arrayList2.isEmpty() && (d20.i(this.f22205b).q() || arrayList2.size() != 1)) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f22220t = z10;
        if (!z10) {
            int size = arrayList2.size();
            if (!d20.i(this.f22205b).q() && K0.f19118c > 0) {
                size = Math.min(size - 1, vp.r1(this.f22205b).f18945x4);
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
                arrayList.add(new k0(q1Var, new TLObject[]{tLObject, tLObject2, tLObject3}, (arrayList2.size() + K0.f19118c) - min));
            }
        }
        if (this.v == null) {
            if (this.f22206c > 0) {
                i10 = 2131745337;
            } else {
                i10 = 2131745335;
            }
            qz0 qz0Var = new qz0(cd.L0(i10, null), 14.0f, org.telegram.messenger.i0.o());
            qz0Var.f29783o = true;
            this.v = qz0Var;
        }
        if (d()) {
            q1Var.f22737u0 = org.telegram.messenger.i0.L(144.0f) + q1Var.f22737u0;
            this.f22211k.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21190ra, q1Var.Ob));
        }
        float size2 = ((arrayList.size() - 1) * org.telegram.messenger.i0.L(9.0f)) + (arrayList.size() * this.f22214n);
        this.f22216p = size2;
        this.f22215o = Utilities.i(this.f22215o, size2, 0.0f);
    }
}
