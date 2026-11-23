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
import org.telegram.messenger.i10;
import org.telegram.messenger.mp;
import org.telegram.messenger.no;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.n80;
import org.telegram.ui.Components.wy0;
public final class m0 {
    public boolean A;
    public boolean B;
    public float C;
    public VelocityTracker D;
    public final ll0 E;
    public l0 F;
    public ha G;
    public final r1 f31103a;
    public int f31104b;
    public long f31105c;
    public fj d;
    public long f31106e;
    public StaticLayout f31108g;
    public float h;
    public float f31109i;
    public int f31110j;
    public float f31115o;
    public float f31116p;
    public n80 f31119s;
    public final org.telegram.ui.Components.c6 f31121u;
    public wy0 v;
    public final lc f31124y;
    public final TextPaint f31107f = new TextPaint(1);
    public final Paint f31111k = new Paint(1);
    public final Path f31112l = new Path();
    public final float f31113m = -1.0f;
    public int f31114n = org.telegram.messenger.g0.L(66.0f);
    public final ArrayList f31117q = new ArrayList();
    public final Path f31118r = new Path();
    public final RectF f31122w = new RectF();
    public final RectF f31123x = new RectF();
    public final Paint f31125z = new Paint(1);
    public boolean f31120t = true;

    public m0(r1 r1Var) {
        this.f31103a = r1Var;
        this.E = new ll0(r1Var.getContext(), null);
        this.f31124y = new lc(r1Var);
        this.f31121u = new org.telegram.ui.Components.c6(r1Var, 350L, kr.h);
    }

    public final boolean a(android.view.MotionEvent r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.m0.a(android.view.MotionEvent):boolean");
    }

    public final void b() {
        ll0 ll0Var = this.E;
        if (ll0Var.b()) {
            float f10 = ll0Var.f37169j;
            this.f31115o = f10;
            this.f31115o = Utilities.i(f10, this.f31116p - (this.f31122w.width() - org.telegram.messenger.g0.L(14.0f)), 0.0f);
            this.f31103a.q2();
        }
    }

    public final void c(android.graphics.Canvas r50) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.m0.c(android.graphics.Canvas):void");
    }

    public final boolean d() {
        if (this.d.f24066i1 && this.f31117q.size() > 0) {
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
        this.f31104b = fjVar.K1;
        this.d = fjVar;
        this.f31105c = fj.B0(fjVar.f24073k);
        mp.u1(this.f31104b).O0(Long.valueOf(-this.f31105c));
        this.f31106e = -this.f31105c;
        Typeface o4 = org.telegram.messenger.g0.o();
        TextPaint textPaint = this.f31107f;
        textPaint.setTypeface(o4);
        textPaint.setTextSize(org.telegram.messenger.g0.L(14.0f));
        int i12 = org.telegram.ui.ActionBar.n6.Zc;
        r1 r1Var = this.f31103a;
        textPaint.setColor(org.telegram.ui.ActionBar.n6.w0(i12, r1Var.Qb));
        this.f31108g = new StaticLayout(gd.N0(2131752379, null), textPaint, this.d.l1(), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        this.h = staticLayout.getWidth();
        this.f31109i = 0.0f;
        for (int i13 = 0; i13 < this.f31108g.getLineCount(); i13++) {
            this.h = Math.min(this.h, this.f31108g.getLineLeft(i13));
            this.f31109i = Math.max(this.f31109i, this.f31108g.getLineRight(i13));
        }
        this.f31110j = this.f31108g.getHeight();
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = this.f31125z;
        paint.setStyle(style);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.W5, r1Var.Qb));
        r1Var.f31684v0 = org.telegram.messenger.g0.L(14.66f) + this.f31110j;
        int i14 = 0;
        while (true) {
            arrayList = this.f31117q;
            if (i14 >= arrayList.size()) {
                break;
            }
            l0 l0Var = (l0) arrayList.get(i14);
            int i15 = 0;
            while (true) {
                ImageReceiver[] imageReceiverArr = l0Var.f31050c;
                if (i15 < imageReceiverArr.length) {
                    imageReceiverArr[i15].S();
                    i15++;
                }
            }
            i14++;
        }
        arrayList.clear();
        no N0 = mp.u1(this.f31104b).N0(this.f31105c);
        if (N0 != null && (arrayList3 = N0.f26049b) != null) {
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
        if (!arrayList2.isEmpty() && (i10.i(this.f31104b).q() || arrayList2.size() != 1)) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f31120t = z10;
        if (!z10) {
            int size = arrayList2.size();
            if (!i10.i(this.f31104b).q() && N0.f26050c > 0) {
                size = Math.min(size - 1, mp.u1(this.f31104b).f25918z4);
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
                arrayList.add(new l0(r1Var, new TLObject[]{tLObject, tLObject2, tLObject3}, (arrayList2.size() + N0.f26050c) - min));
            }
        }
        if (this.v == null) {
            if (this.f31105c > 0) {
                i7 = 2131745123;
            } else {
                i7 = 2131745121;
            }
            wy0 wy0Var = new wy0(gd.N0(i7, null), 14.0f, org.telegram.messenger.g0.o());
            wy0Var.f41773o = true;
            this.v = wy0Var;
        }
        if (d()) {
            r1Var.f31684v0 = org.telegram.messenger.g0.L(144.0f) + r1Var.f31684v0;
            this.f31111k.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29714ra, r1Var.Qb));
        }
        float size2 = ((arrayList.size() - 1) * org.telegram.messenger.g0.L(9.0f)) + (arrayList.size() * this.f31114n);
        this.f31116p = size2;
        this.f31115o = Utilities.i(this.f31115o, size2, 0.0f);
    }
}
