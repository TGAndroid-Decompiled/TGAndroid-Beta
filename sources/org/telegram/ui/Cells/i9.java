package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.StaticLayout;
import android.util.SparseArray;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.dj;
import org.telegram.messenger.ej;
import org.telegram.messenger.gj;
import org.telegram.messenger.gz;
import org.telegram.messenger.iv;
import org.telegram.messenger.np;
public abstract class i9 extends u9 {
    public final SparseArray f30449p0 = new SparseArray();
    public boolean f30450q0;
    public boolean f30451r0;
    public boolean f30452s0;
    public boolean f30453t0;
    public boolean f30454u0;
    public boolean f30455v0;

    @Override
    public final boolean C() {
        p9 p9Var;
        iv ivVar;
        CharSequence r10;
        String str;
        if (this.f30454u0 && (p9Var = this.W) != null && ((q1) p9Var).getMessageObject() != null && (ivVar = ((q1) this.W).getMessageObject().f23874y2) != null && !ivVar.f24451n.isEmpty() && (r10 = r()) != null && r10.length() != 0) {
            try {
                str = ivVar.w(this.f31767u, this.v);
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                str = null;
            }
            if (str != null && str.length() != 0) {
                org.telegram.messenger.g0.f(r10, str);
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void E(boolean z10) {
        p9 p9Var = this.W;
        if (p9Var != null && ((q1) p9Var).z2() && !z10) {
            q1 q1Var = (q1) this.W;
            int e12 = q1Var.getMessageObject().e1();
            SparseArray sparseArray = this.f30449p0;
            Animator animator = (Animator) sparseArray.get(e12);
            if (animator != null) {
                animator.removeAllListeners();
                animator.cancel();
            }
            q1Var.setSelectedBackgroundProgress(0.01f);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.01f, 1.0f);
            ofFloat.addUpdateListener(new org.telegram.ui.ActionBar.h2(q1Var, e12, 1));
            ofFloat.addListener(new k1(q1Var, 1));
            ofFloat.setDuration(300L);
            ofFloat.start();
            sparseArray.put(e12, ofFloat);
        }
    }

    @Override
    public final void L(p9 p9Var, p9 p9Var2) {
        boolean z10;
        q1 q1Var = (q1) p9Var;
        q1 q1Var2 = (q1) p9Var2;
        if (q1Var2 != null && (q1Var2.getMessageObject() == null || q1Var2.getMessageObject().e1() == q1Var.getMessageObject().e1())) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f31768w = q1Var.getMessageObject().e1();
        try {
            int i7 = q1Var.getMessageObject().f23817k.edit_date;
        } catch (Exception unused) {
        }
        this.U = 0.0f;
        this.f30450q0 = this.f30451r0;
        this.f30452s0 = this.f30453t0;
        this.f30454u0 = this.f30455v0;
        int i10 = this.f31768w;
        SparseArray sparseArray = this.f30449p0;
        Animator animator = (Animator) sparseArray.get(i10);
        if (animator != null) {
            animator.removeAllListeners();
            animator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new ch.u(4, this, z10));
        ofFloat.setDuration(250L);
        ofFloat.start();
        sparseArray.put(this.f31768w, ofFloat);
        if (!z10) {
            q1Var.setSelectedBackgroundProgress(0.0f);
        }
        int i11 = gz.f23929a;
        SharedPreferences.Editor edit = np.e1().edit();
        edit.putInt("textSelectionHintShows", 3);
        edit.apply();
    }

    public final void W(gj gjVar) {
        try {
            int i7 = gjVar.f23817k.edit_date;
        } catch (Exception unused) {
        }
        if (this.f31768w == gjVar.e1()) {
            f(true);
        }
    }

    public final void X(gj gjVar, dj djVar, Canvas canvas) {
        gj messageObject;
        p9 p9Var = this.W;
        if (p9Var != null && ((q1) p9Var).getMessageObject() != null && !this.f30450q0 && !this.f30452s0 && !this.f30454u0 && (messageObject = ((q1) this.W).getMessageObject()) != null && messageObject.B2 != null && gjVar.e1() == this.f31768w) {
            int i7 = this.f31767u;
            int i10 = djVar.f23095n;
            int i11 = this.v - i10;
            int i12 = 0;
            int j3 = Utilities.j(i7 - i10, djVar.f23093e.getText().length(), 0);
            int j10 = Utilities.j(i11, djVar.f23093e.getText().length(), 0);
            if (j3 != j10) {
                boolean P3 = messageObject.P3();
                Paint paint = this.f31762p;
                Paint paint2 = this.f31760o;
                if (P3) {
                    int i13 = org.telegram.ui.ActionBar.j6.Mc;
                    paint2.setColor(t(i13));
                    paint.setColor(t(i13));
                } else {
                    int i14 = org.telegram.ui.ActionBar.j6.f29005lg;
                    paint2.setColor(t(i14));
                    paint.setColor(t(i14));
                }
                if (djVar.J) {
                    i12 = org.telegram.messenger.g0.L(10.0f);
                } else if (djVar.I) {
                    i12 = org.telegram.messenger.g0.L(0.0f);
                }
                h(canvas, djVar.f23093e, j3, j10, true, true, i12);
            }
        }
    }

    public final void Y(boolean z10, StaticLayout staticLayout, Canvas canvas) {
        if (!this.f30450q0) {
            return;
        }
        Paint paint = this.f31762p;
        Paint paint2 = this.f31760o;
        if (z10) {
            int i7 = org.telegram.ui.ActionBar.j6.Mc;
            paint2.setColor(t(i7));
            paint.setColor(t(i7));
        } else {
            int i10 = org.telegram.ui.ActionBar.j6.f29005lg;
            paint2.setColor(t(i10));
            paint.setColor(t(i10));
        }
        h(canvas, staticLayout, this.f31767u, this.v, true, true, 0.0f);
    }

    public final void Z(gj gjVar, iv ivVar, Canvas canvas) {
        s9 s9Var;
        Canvas canvas2;
        boolean z10;
        if (this.f30454u0 && ivVar != null) {
            ArrayList arrayList = ivVar.f24451n;
            p9 p9Var = this.W;
            if (p9Var != null && ((q1) p9Var).getMessageObject() != null && ((q1) this.W).getMessageObject().e1() == gjVar.e1()) {
                boolean P3 = gjVar.P3();
                Paint paint = this.f31762p;
                Paint paint2 = this.f31760o;
                if (P3) {
                    int i7 = org.telegram.ui.ActionBar.j6.Mc;
                    paint2.setColor(t(i7));
                    paint.setColor(t(i7));
                } else {
                    int i10 = org.telegram.ui.ActionBar.j6.f29005lg;
                    paint2.setColor(t(i10));
                    paint.setColor(t(i10));
                }
                int i11 = 0;
                while (i11 < arrayList.size()) {
                    Layout a10 = ((s9) arrayList.get(i11)).a();
                    if (a10 != null && a10.getText() != null) {
                        int intValue = ((Integer) ivVar.f24452o.get(i11)).intValue();
                        int length = a10.getText().length();
                        int j3 = Utilities.j(this.f31767u - intValue, length, 0);
                        int j10 = Utilities.j(this.v - intValue, length, 0);
                        if (j3 != j10) {
                            boolean z11 = true;
                            if (this.f31767u >= intValue) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (this.v > intValue + length) {
                                z11 = false;
                            }
                            canvas.save();
                            canvas.translate(s9Var.getX(), s9Var.getY());
                            canvas2 = canvas;
                            h(canvas2, a10, j3, j10, z10, z11, 0.0f);
                            canvas2.restore();
                            i11++;
                            canvas = canvas2;
                        }
                    }
                    canvas2 = canvas;
                    i11++;
                    canvas = canvas2;
                }
            }
        }
    }

    public final void a0(q1 q1Var, int i7, int i10) {
        boolean z10;
        if (q1Var == null) {
            return;
        }
        this.W = q1Var;
        this.f31768w = q1Var.getMessageObject().e1();
        if (((q1) this.W).getMessageObject().D == 36 && ((q1) this.W).getMessageObject().f23874y2 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f30454u0 = z10;
        if (z10) {
            this.f30450q0 = false;
            this.f30452s0 = false;
        }
        this.f31767u = i7;
        this.v = i10;
        w();
        c8.fa faVar = this.D;
        if (faVar != null) {
            faVar.a(true);
        }
        this.f31746g = 0.0f;
        this.f31744f = 0.0f;
        this.f31742e = false;
        t9 t9Var = this.C;
        if (t9Var != null) {
            t9Var.setVisibility(0);
        }
        U();
    }

    public final void b0(q1 q1Var) {
        ArrayList arrayList;
        iv ivVar;
        this.X = q1Var;
        gj messageObject = q1Var.getMessageObject();
        x1 x1Var = q1Var.f31018ib;
        boolean z10 = this.f30451r0;
        Rect rect = this.B;
        if (z10 && q1Var.getDescriptionlayout() != null) {
            int i7 = this.f31739c;
            rect.set(i7, this.d, q1Var.getDescriptionlayout().getWidth() + i7, q1Var.getDescriptionlayout().getHeight() + this.d);
        } else if (this.f30453t0 && q1Var.getFactCheckLayout() != null) {
            int i10 = this.f31739c;
            rect.set(i10, this.d, q1Var.getFactCheckLayout().getWidth() + i10, q1Var.getFactCheckLayout().getHeight() + this.d);
        } else if (this.f30455v0 && messageObject != null && (ivVar = messageObject.f23874y2) != null && !ivVar.f24451n.isEmpty()) {
            iv ivVar2 = messageObject.f23874y2;
            int i11 = this.f31739c;
            int i12 = this.d;
            rect.set(i11, i12, ivVar2.C + i11, ivVar2.t() + i12);
        } else if (q1Var.d2() && q1Var.getCaptionLayout().f23310e.size() > 0) {
            dj djVar = (dj) i5.c.h(1, q1Var.getCaptionLayout().f23310e);
            int i13 = this.f31739c;
            rect.set(i13, this.d, djVar.f23093e.getWidth() + i13, (int) (djVar.p(q1Var.getCaptionLayout().f23310e, x1Var) + this.d + djVar.f23094f + djVar.f23093e.getHeight()));
        } else if (messageObject != null && (arrayList = messageObject.B2) != null && arrayList.size() > 0) {
            dj djVar2 = (dj) i5.c.h(1, messageObject.B2);
            int i14 = this.f31739c;
            rect.set(i14, this.d, djVar2.f23093e.getWidth() + i14, (int) (djVar2.p(messageObject.B2, x1Var) + this.d + djVar2.f23094f + djVar2.f23093e.getHeight()));
        } else {
            this.X = null;
        }
    }

    public final void c0(int i7, int i10) {
        if (this.f31735a == i7 && this.f31737b == i10) {
            return;
        }
        this.f31735a = i7;
        this.f31737b = i10;
        w();
    }

    @Override
    public final void f(boolean z10) {
        super.f(z10);
        this.f30450q0 = false;
        this.f30452s0 = false;
        this.f30454u0 = false;
    }

    @Override
    public final void i(int i7, k9 k9Var, boolean z10) {
        p9 p9Var;
        int i10;
        int L;
        dj djVar;
        int i11;
        int i12;
        int L2;
        int i13;
        int L3;
        dj djVar2;
        int i14;
        int i15;
        int L4;
        iv ivVar;
        s9 s9Var;
        if (z10) {
            p9Var = this.X;
        } else {
            p9Var = this.W;
        }
        q1 q1Var = (q1) p9Var;
        if (q1Var == null) {
            k9Var.d = null;
            return;
        }
        gj messageObject = q1Var.getMessageObject();
        int i16 = 0;
        if (this.f30450q0) {
            k9Var.d = q1Var.getDescriptionlayout();
            k9Var.f30571b = 0.0f;
            k9Var.f30572c = 0.0f;
            k9Var.f30570a = 0;
        } else if (this.f30452s0) {
            k9Var.d = q1Var.getFactCheckLayout();
            k9Var.f30571b = 0.0f;
            k9Var.f30572c = 0.0f;
            k9Var.f30570a = 0;
        } else if (this.f30454u0) {
            if (messageObject != null) {
                ivVar = messageObject.f23874y2;
            } else {
                ivVar = null;
            }
            if (ivVar != null) {
                ArrayList arrayList = ivVar.f24452o;
                ArrayList arrayList2 = ivVar.f24451n;
                if (!arrayList2.isEmpty()) {
                    while (true) {
                        if (i16 < arrayList2.size()) {
                            int intValue = ((Integer) arrayList.get(i16)).intValue();
                            int length = ((s9) arrayList2.get(i16)).a().getText().length();
                            if (i7 >= intValue && i7 <= intValue + length) {
                                break;
                            }
                            i16++;
                        } else {
                            i16 = -1;
                            break;
                        }
                    }
                    if (i16 < 0) {
                        i16 = arrayList2.size() - 1;
                    }
                    k9Var.d = ((s9) arrayList2.get(i16)).a();
                    k9Var.f30571b = s9Var.getY();
                    k9Var.f30572c = s9Var.getX();
                    k9Var.f30570a = ((Integer) arrayList.get(i16)).intValue();
                    return;
                }
            }
            k9Var.d = null;
        } else if (q1Var.d2()) {
            ej captionLayout = q1Var.getCaptionLayout();
            ArrayList arrayList3 = captionLayout.f23310e;
            float f10 = captionLayout.d;
            if (arrayList3.size() == 1) {
                k9Var.d = ((dj) arrayList3.get(0)).f23093e;
                k9Var.f30571b = djVar2.f23094f;
                dj djVar3 = (dj) arrayList3.get(0);
                if (djVar3.J) {
                    i14 = org.telegram.messenger.g0.L(10.0f);
                } else {
                    i14 = 0;
                }
                if (djVar3.l()) {
                    i15 = ((int) Math.ceil(f10)) - i14;
                } else {
                    i15 = 0;
                }
                float f11 = -i15;
                k9Var.f30572c = f11;
                if (djVar3.I && !djVar3.J) {
                    if (djVar3.V) {
                        L4 = org.telegram.messenger.g0.L(14.0f);
                    } else {
                        L4 = org.telegram.messenger.g0.L(8.0f);
                    }
                    k9Var.f30572c = f11 + L4;
                }
                k9Var.f30570a = 0;
                return;
            }
            for (int i17 = 0; i17 < arrayList3.size(); i17++) {
                dj djVar4 = (dj) arrayList3.get(i17);
                int i18 = i7 - djVar4.f23095n;
                if (i18 >= 0 && i18 <= djVar4.f23093e.getText().length()) {
                    k9Var.d = djVar4.f23093e;
                    k9Var.f30571b = djVar4.o(arrayList3) + djVar4.f23094f;
                    if (djVar4.J) {
                        i13 = org.telegram.messenger.g0.L(10.0f);
                    } else {
                        i13 = 0;
                    }
                    if (djVar4.l()) {
                        i16 = ((int) Math.ceil(f10)) - i13;
                    }
                    float f12 = -i16;
                    k9Var.f30572c = f12;
                    if (djVar4.I && !djVar4.J) {
                        if (djVar4.V) {
                            L3 = org.telegram.messenger.g0.L(14.0f);
                        } else {
                            L3 = org.telegram.messenger.g0.L(8.0f);
                        }
                        k9Var.f30572c = f12 + L3;
                    }
                    k9Var.f30570a = djVar4.f23095n;
                    return;
                }
            }
            k9Var.d = null;
        } else {
            ArrayList arrayList4 = messageObject.B2;
            if (arrayList4 == null) {
                k9Var.d = null;
            } else if (arrayList4.size() == 1) {
                k9Var.d = ((dj) messageObject.B2.get(0)).f23093e;
                k9Var.f30571b = djVar.f23094f;
                dj djVar5 = (dj) messageObject.B2.get(0);
                if (djVar5.J) {
                    i11 = org.telegram.messenger.g0.L(10.0f);
                } else {
                    i11 = 0;
                }
                if (djVar5.l()) {
                    i12 = ((int) Math.ceil(messageObject.f23870x2)) - i11;
                } else {
                    i12 = 0;
                }
                float f13 = -i12;
                k9Var.f30572c = f13;
                if (djVar5.I && !djVar5.J) {
                    if (djVar5.V) {
                        L2 = org.telegram.messenger.g0.L(14.0f);
                    } else {
                        L2 = org.telegram.messenger.g0.L(8.0f);
                    }
                    k9Var.f30572c = f13 + L2;
                }
                k9Var.f30570a = 0;
            } else {
                for (int i19 = 0; i19 < messageObject.B2.size(); i19++) {
                    dj djVar6 = (dj) messageObject.B2.get(i19);
                    int i20 = i7 - djVar6.f23095n;
                    if (i20 >= 0 && i20 <= djVar6.f23093e.getText().length()) {
                        k9Var.d = djVar6.f23093e;
                        k9Var.f30571b = djVar6.o(messageObject.B2) + djVar6.f23094f;
                        if (djVar6.J) {
                            i10 = org.telegram.messenger.g0.L(10.0f);
                        } else {
                            i10 = 0;
                        }
                        if (djVar6.l()) {
                            i16 = ((int) Math.ceil(messageObject.f23870x2)) - i10;
                        }
                        float f14 = -i16;
                        k9Var.f30572c = f14;
                        if (djVar6.I && !djVar6.J) {
                            if (djVar6.V) {
                                L = org.telegram.messenger.g0.L(14.0f);
                            } else {
                                L = org.telegram.messenger.g0.L(8.0f);
                            }
                            k9Var.f30572c = f14 + L;
                        }
                        k9Var.f30570a = djVar6.f23095n;
                        return;
                    }
                }
                k9Var.d = null;
            }
        }
    }

    @Override
    public final int k(int r19, int r20, int r21, int r22, org.telegram.ui.Cells.p9 r23, boolean r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.i9.k(int, int, int, int, org.telegram.ui.Cells.p9, boolean):int");
    }

    @Override
    public final int m() {
        Layout layout;
        iv ivVar;
        p9 p9Var = this.W;
        if (p9Var != null && ((q1) p9Var).getMessageObject() != null) {
            gj messageObject = ((q1) this.W).getMessageObject();
            if (this.f30450q0) {
                layout = ((q1) this.W).getDescriptionlayout();
            } else if (this.f30452s0) {
                layout = ((q1) this.W).getFactCheckLayout();
            } else if (this.f30454u0) {
                if (messageObject != null) {
                    ivVar = messageObject.f23874y2;
                } else {
                    ivVar = null;
                }
                if (ivVar != null) {
                    ArrayList arrayList = ivVar.f24451n;
                    if (!arrayList.isEmpty()) {
                        layout = ((s9) arrayList.get(0)).a();
                    }
                }
                layout = null;
            } else if (((q1) this.W).d2()) {
                layout = ((dj) ((q1) this.W).getCaptionLayout().f23310e.get(0)).f23093e;
            } else {
                ArrayList arrayList2 = messageObject.B2;
                if (arrayList2 != null) {
                    layout = ((dj) arrayList2.get(0)).f23093e;
                }
                layout = null;
            }
            if (layout != null) {
                return layout.getLineBottom(0) - layout.getLineTop(0);
            }
        }
        return 0;
    }

    @Override
    public final CharSequence s(p9 p9Var, boolean z10) {
        q1 q1Var = (q1) p9Var;
        if (q1Var != null && q1Var.getMessageObject() != null) {
            if (!z10 ? this.f30450q0 : this.f30451r0) {
                return q1Var.getDescriptionlayout().getText();
            }
            if (!z10 ? this.f30452s0 : this.f30453t0) {
                return q1Var.getFactCheckLayout().getText();
            }
            if (!z10 ? this.f30454u0 : this.f30455v0) {
                iv ivVar = q1Var.getMessageObject().f23874y2;
                if (ivVar != null) {
                    return ivVar.f24454q;
                }
                return "";
            } else if (q1Var.d2()) {
                return q1Var.getCaptionLayout().f23307a;
            } else {
                return q1Var.getMessageObject().v;
            }
        }
        return null;
    }

    @Override
    public void w() {
        super.w();
        p9 p9Var = this.W;
        if (p9Var != null && ((q1) p9Var).getCurrentMessagesGroup() != null) {
            this.F.invalidate();
        }
        p9 p9Var2 = this.W;
        if (p9Var2 != null) {
            if (this.f30452s0 || this.f30453t0) {
                ((q1) p9Var2).q2();
            }
        }
    }
}
