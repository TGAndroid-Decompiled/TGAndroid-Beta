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
import org.telegram.messenger.gj;
import org.telegram.messenger.hj;
import org.telegram.messenger.jj;
import org.telegram.messenger.tz;
import org.telegram.messenger.vp;
import org.telegram.messenger.vv;
public abstract class l9 extends w9 {
    public final SparseArray f22259p0 = new SparseArray();
    public boolean f22260q0;
    public boolean f22261r0;
    public boolean f22262s0;
    public boolean f22263t0;
    public boolean f22264u0;
    public boolean f22265v0;

    @Override
    public final boolean C() {
        r9 r9Var;
        vv vvVar;
        CharSequence r10;
        String str;
        if (this.f22264u0 && (r9Var = this.W) != null && ((q1) r9Var).getMessageObject() != null && (vvVar = ((q1) this.W).getMessageObject().f16385w2) != null && !vvVar.f18996n.isEmpty() && (r10 = r()) != null && r10.length() != 0) {
            try {
                str = vvVar.w(this.f23443u, this.v);
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
                str = null;
            }
            if (str != null && str.length() != 0) {
                org.telegram.messenger.i0.f(r10, str);
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void E(boolean z10) {
        r9 r9Var = this.W;
        if (r9Var != null && ((q1) r9Var).w2() && !z10) {
            q1 q1Var = (q1) this.W;
            int f12 = q1Var.getMessageObject().f1();
            SparseArray sparseArray = this.f22259p0;
            Animator animator = (Animator) sparseArray.get(f12);
            if (animator != null) {
                animator.removeAllListeners();
                animator.cancel();
            }
            q1Var.setSelectedBackgroundProgress(0.01f);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.01f, 1.0f);
            ofFloat.addUpdateListener(new nh.b(q1Var, f12, 2));
            ofFloat.addListener(new k1(q1Var, 1));
            ofFloat.setDuration(300L);
            ofFloat.start();
            sparseArray.put(f12, ofFloat);
        }
    }

    @Override
    public final void L(r9 r9Var, r9 r9Var2) {
        boolean z10;
        q1 q1Var = (q1) r9Var;
        q1 q1Var2 = (q1) r9Var2;
        if (q1Var2 != null && (q1Var2.getMessageObject() == null || q1Var2.getMessageObject().f1() == q1Var.getMessageObject().f1())) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f23444w = q1Var.getMessageObject().f1();
        try {
            int i10 = q1Var.getMessageObject().f16337k.edit_date;
        } catch (Exception unused) {
        }
        this.U = 0.0f;
        this.f22260q0 = this.f22261r0;
        this.f22262s0 = this.f22263t0;
        this.f22264u0 = this.f22265v0;
        int i11 = this.f23444w;
        SparseArray sparseArray = this.f22259p0;
        Animator animator = (Animator) sparseArray.get(i11);
        if (animator != null) {
            animator.removeAllListeners();
            animator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new jg.o0(2, this, z10));
        ofFloat.setDuration(250L);
        ofFloat.start();
        sparseArray.put(this.f23444w, ofFloat);
        if (!z10) {
            q1Var.setSelectedBackgroundProgress(0.0f);
        }
        int i12 = tz.f18131a;
        SharedPreferences.Editor edit = vp.d1().edit();
        edit.putInt("textSelectionHintShows", 3);
        edit.apply();
    }

    public final void W(jj jjVar) {
        try {
            int i10 = jjVar.f16337k.edit_date;
        } catch (Exception unused) {
        }
        if (this.f23444w == jjVar.f1()) {
            f(true);
        }
    }

    public final void X(jj jjVar, gj gjVar, Canvas canvas) {
        jj messageObject;
        r9 r9Var = this.W;
        if (r9Var != null && ((q1) r9Var).getMessageObject() != null && !this.f22260q0 && !this.f22262s0 && !this.f22264u0 && (messageObject = ((q1) this.W).getMessageObject()) != null && messageObject.f16397z2 != null && jjVar.f1() == this.f23444w) {
            int i10 = this.f23443u;
            int i11 = gjVar.f15718n;
            int i12 = this.v - i11;
            int i13 = 0;
            int j10 = Utilities.j(i10 - i11, gjVar.e.getText().length(), 0);
            int j11 = Utilities.j(i12, gjVar.e.getText().length(), 0);
            if (j10 != j11) {
                boolean P3 = messageObject.P3();
                Paint paint = this.f23438p;
                Paint paint2 = this.f23436o;
                if (P3) {
                    int i14 = org.telegram.ui.ActionBar.t6.Jc;
                    paint2.setColor(t(i14));
                    paint.setColor(t(i14));
                } else {
                    int i15 = org.telegram.ui.ActionBar.t6.f21028ig;
                    paint2.setColor(t(i15));
                    paint.setColor(t(i15));
                }
                if (gjVar.I) {
                    i13 = org.telegram.messenger.i0.L(10.0f);
                } else if (gjVar.H) {
                    i13 = org.telegram.messenger.i0.L(0.0f);
                }
                h(canvas, gjVar.e, j10, j11, true, true, i13);
            }
        }
    }

    public final void Y(boolean z10, StaticLayout staticLayout, Canvas canvas) {
        if (!this.f22260q0) {
            return;
        }
        Paint paint = this.f23438p;
        Paint paint2 = this.f23436o;
        if (z10) {
            int i10 = org.telegram.ui.ActionBar.t6.Jc;
            paint2.setColor(t(i10));
            paint.setColor(t(i10));
        } else {
            int i11 = org.telegram.ui.ActionBar.t6.f21028ig;
            paint2.setColor(t(i11));
            paint.setColor(t(i11));
        }
        h(canvas, staticLayout, this.f23443u, this.v, true, true, 0.0f);
    }

    public final void Z(jj jjVar, vv vvVar, Canvas canvas) {
        u9 u9Var;
        Canvas canvas2;
        boolean z10;
        if (this.f22264u0 && vvVar != null) {
            ArrayList arrayList = vvVar.f18996n;
            r9 r9Var = this.W;
            if (r9Var != null && ((q1) r9Var).getMessageObject() != null && ((q1) this.W).getMessageObject().f1() == jjVar.f1()) {
                boolean P3 = jjVar.P3();
                Paint paint = this.f23438p;
                Paint paint2 = this.f23436o;
                if (P3) {
                    int i10 = org.telegram.ui.ActionBar.t6.Jc;
                    paint2.setColor(t(i10));
                    paint.setColor(t(i10));
                } else {
                    int i11 = org.telegram.ui.ActionBar.t6.f21028ig;
                    paint2.setColor(t(i11));
                    paint.setColor(t(i11));
                }
                int i12 = 0;
                while (i12 < arrayList.size()) {
                    Layout a2 = ((u9) arrayList.get(i12)).a();
                    if (a2 != null && a2.getText() != null) {
                        int intValue = ((Integer) vvVar.f18997o.get(i12)).intValue();
                        int length = a2.getText().length();
                        int j10 = Utilities.j(this.f23443u - intValue, length, 0);
                        int j11 = Utilities.j(this.v - intValue, length, 0);
                        if (j10 != j11) {
                            boolean z11 = true;
                            if (this.f23443u >= intValue) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (this.v > intValue + length) {
                                z11 = false;
                            }
                            canvas.save();
                            canvas.translate(u9Var.getX(), u9Var.getY());
                            canvas2 = canvas;
                            h(canvas2, a2, j10, j11, z10, z11, 0.0f);
                            canvas2.restore();
                            i12++;
                            canvas = canvas2;
                        }
                    }
                    canvas2 = canvas;
                    i12++;
                    canvas = canvas2;
                }
            }
        }
    }

    public final void a0(q1 q1Var, int i10, int i11) {
        boolean z10;
        if (q1Var == null) {
            return;
        }
        this.W = q1Var;
        this.f23444w = q1Var.getMessageObject().f1();
        if (((q1) this.W).getMessageObject().D == 36 && ((q1) this.W).getMessageObject().f16385w2 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f22264u0 = z10;
        if (z10) {
            this.f22260q0 = false;
            this.f22262s0 = false;
        }
        this.f23443u = i10;
        this.v = i11;
        w();
        w7.x5 x5Var = this.D;
        if (x5Var != null) {
            x5Var.a(true);
        }
        this.f23422g = 0.0f;
        this.f23420f = 0.0f;
        this.e = false;
        v9 v9Var = this.C;
        if (v9Var != null) {
            v9Var.setVisibility(0);
        }
        U();
    }

    public final void b0(q1 q1Var) {
        ArrayList arrayList;
        vv vvVar;
        this.X = q1Var;
        jj messageObject = q1Var.getMessageObject();
        x1 x1Var = q1Var.gb;
        boolean z10 = this.f22261r0;
        Rect rect = this.B;
        if (z10 && q1Var.getDescriptionlayout() != null) {
            int i10 = this.f23416c;
            rect.set(i10, this.d, q1Var.getDescriptionlayout().getWidth() + i10, q1Var.getDescriptionlayout().getHeight() + this.d);
        } else if (this.f22263t0 && q1Var.getFactCheckLayout() != null) {
            int i11 = this.f23416c;
            rect.set(i11, this.d, q1Var.getFactCheckLayout().getWidth() + i11, q1Var.getFactCheckLayout().getHeight() + this.d);
        } else if (this.f22265v0 && messageObject != null && (vvVar = messageObject.f16385w2) != null && !vvVar.f18996n.isEmpty()) {
            vv vvVar2 = messageObject.f16385w2;
            int i12 = this.f23416c;
            int i13 = this.d;
            rect.set(i12, i13, vvVar2.C + i12, vvVar2.t() + i13);
        } else if (q1Var.a2() && q1Var.getCaptionLayout().e.size() > 0) {
            gj gjVar = (gj) i0.a.g(1, q1Var.getCaptionLayout().e);
            int i14 = this.f23416c;
            rect.set(i14, this.d, gjVar.e.getWidth() + i14, (int) (gjVar.p(q1Var.getCaptionLayout().e, x1Var) + this.d + gjVar.f15717f + gjVar.e.getHeight()));
        } else if (messageObject != null && (arrayList = messageObject.f16397z2) != null && arrayList.size() > 0) {
            gj gjVar2 = (gj) i0.a.g(1, messageObject.f16397z2);
            int i15 = this.f23416c;
            rect.set(i15, this.d, gjVar2.e.getWidth() + i15, (int) (gjVar2.p(messageObject.f16397z2, x1Var) + this.d + gjVar2.f15717f + gjVar2.e.getHeight()));
        } else {
            this.X = null;
        }
    }

    public final void c0(int i10, int i11) {
        if (this.f23412a == i10 && this.f23414b == i11) {
            return;
        }
        this.f23412a = i10;
        this.f23414b = i11;
        w();
    }

    @Override
    public final void f(boolean z10) {
        super.f(z10);
        this.f22260q0 = false;
        this.f22262s0 = false;
        this.f22264u0 = false;
    }

    @Override
    public final void i(int i10, ge.b bVar, boolean z10) {
        r9 r9Var;
        int i11;
        int L;
        gj gjVar;
        int i12;
        int i13;
        int L2;
        int i14;
        int L3;
        gj gjVar2;
        int i15;
        int i16;
        int L4;
        vv vvVar;
        u9 u9Var;
        if (z10) {
            r9Var = this.X;
        } else {
            r9Var = this.W;
        }
        q1 q1Var = (q1) r9Var;
        if (q1Var == null) {
            bVar.d = null;
            return;
        }
        jj messageObject = q1Var.getMessageObject();
        int i17 = 0;
        if (this.f22260q0) {
            bVar.d = q1Var.getDescriptionlayout();
            bVar.f7471b = 0.0f;
            bVar.f7472c = 0.0f;
            bVar.f7470a = 0;
        } else if (this.f22262s0) {
            bVar.d = q1Var.getFactCheckLayout();
            bVar.f7471b = 0.0f;
            bVar.f7472c = 0.0f;
            bVar.f7470a = 0;
        } else if (this.f22264u0) {
            if (messageObject != null) {
                vvVar = messageObject.f16385w2;
            } else {
                vvVar = null;
            }
            if (vvVar != null) {
                ArrayList arrayList = vvVar.f18997o;
                ArrayList arrayList2 = vvVar.f18996n;
                if (!arrayList2.isEmpty()) {
                    while (true) {
                        if (i17 < arrayList2.size()) {
                            int intValue = ((Integer) arrayList.get(i17)).intValue();
                            int length = ((u9) arrayList2.get(i17)).a().getText().length();
                            if (i10 >= intValue && i10 <= intValue + length) {
                                break;
                            }
                            i17++;
                        } else {
                            i17 = -1;
                            break;
                        }
                    }
                    if (i17 < 0) {
                        i17 = arrayList2.size() - 1;
                    }
                    bVar.d = ((u9) arrayList2.get(i17)).a();
                    bVar.f7471b = u9Var.getY();
                    bVar.f7472c = u9Var.getX();
                    bVar.f7470a = ((Integer) arrayList.get(i17)).intValue();
                    return;
                }
            }
            bVar.d = null;
        } else if (q1Var.a2()) {
            hj captionLayout = q1Var.getCaptionLayout();
            ArrayList arrayList3 = captionLayout.e;
            float f7 = captionLayout.d;
            if (arrayList3.size() == 1) {
                bVar.d = ((gj) arrayList3.get(0)).e;
                bVar.f7471b = gjVar2.f15717f;
                gj gjVar3 = (gj) arrayList3.get(0);
                if (gjVar3.I) {
                    i15 = org.telegram.messenger.i0.L(10.0f);
                } else {
                    i15 = 0;
                }
                if (gjVar3.l()) {
                    i16 = ((int) Math.ceil(f7)) - i15;
                } else {
                    i16 = 0;
                }
                float f10 = -i16;
                bVar.f7472c = f10;
                if (gjVar3.H && !gjVar3.I) {
                    if (gjVar3.U) {
                        L4 = org.telegram.messenger.i0.L(14.0f);
                    } else {
                        L4 = org.telegram.messenger.i0.L(8.0f);
                    }
                    bVar.f7472c = f10 + L4;
                }
                bVar.f7470a = 0;
                return;
            }
            for (int i18 = 0; i18 < arrayList3.size(); i18++) {
                gj gjVar4 = (gj) arrayList3.get(i18);
                int i19 = i10 - gjVar4.f15718n;
                if (i19 >= 0 && i19 <= gjVar4.e.getText().length()) {
                    bVar.d = gjVar4.e;
                    bVar.f7471b = gjVar4.o(arrayList3) + gjVar4.f15717f;
                    if (gjVar4.I) {
                        i14 = org.telegram.messenger.i0.L(10.0f);
                    } else {
                        i14 = 0;
                    }
                    if (gjVar4.l()) {
                        i17 = ((int) Math.ceil(f7)) - i14;
                    }
                    float f11 = -i17;
                    bVar.f7472c = f11;
                    if (gjVar4.H && !gjVar4.I) {
                        if (gjVar4.U) {
                            L3 = org.telegram.messenger.i0.L(14.0f);
                        } else {
                            L3 = org.telegram.messenger.i0.L(8.0f);
                        }
                        bVar.f7472c = f11 + L3;
                    }
                    bVar.f7470a = gjVar4.f15718n;
                    return;
                }
            }
            bVar.d = null;
        } else {
            ArrayList arrayList4 = messageObject.f16397z2;
            if (arrayList4 == null) {
                bVar.d = null;
            } else if (arrayList4.size() == 1) {
                bVar.d = ((gj) messageObject.f16397z2.get(0)).e;
                bVar.f7471b = gjVar.f15717f;
                gj gjVar5 = (gj) messageObject.f16397z2.get(0);
                if (gjVar5.I) {
                    i12 = org.telegram.messenger.i0.L(10.0f);
                } else {
                    i12 = 0;
                }
                if (gjVar5.l()) {
                    i13 = ((int) Math.ceil(messageObject.f16381v2)) - i12;
                } else {
                    i13 = 0;
                }
                float f12 = -i13;
                bVar.f7472c = f12;
                if (gjVar5.H && !gjVar5.I) {
                    if (gjVar5.U) {
                        L2 = org.telegram.messenger.i0.L(14.0f);
                    } else {
                        L2 = org.telegram.messenger.i0.L(8.0f);
                    }
                    bVar.f7472c = f12 + L2;
                }
                bVar.f7470a = 0;
            } else {
                for (int i20 = 0; i20 < messageObject.f16397z2.size(); i20++) {
                    gj gjVar6 = (gj) messageObject.f16397z2.get(i20);
                    int i21 = i10 - gjVar6.f15718n;
                    if (i21 >= 0 && i21 <= gjVar6.e.getText().length()) {
                        bVar.d = gjVar6.e;
                        bVar.f7471b = gjVar6.o(messageObject.f16397z2) + gjVar6.f15717f;
                        if (gjVar6.I) {
                            i11 = org.telegram.messenger.i0.L(10.0f);
                        } else {
                            i11 = 0;
                        }
                        if (gjVar6.l()) {
                            i17 = ((int) Math.ceil(messageObject.f16381v2)) - i11;
                        }
                        float f13 = -i17;
                        bVar.f7472c = f13;
                        if (gjVar6.H && !gjVar6.I) {
                            if (gjVar6.U) {
                                L = org.telegram.messenger.i0.L(14.0f);
                            } else {
                                L = org.telegram.messenger.i0.L(8.0f);
                            }
                            bVar.f7472c = f13 + L;
                        }
                        bVar.f7470a = gjVar6.f15718n;
                        return;
                    }
                }
                bVar.d = null;
            }
        }
    }

    @Override
    public final int k(int r19, int r20, int r21, int r22, org.telegram.ui.Cells.r9 r23, boolean r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.l9.k(int, int, int, int, org.telegram.ui.Cells.r9, boolean):int");
    }

    @Override
    public final int m() {
        Layout layout;
        vv vvVar;
        r9 r9Var = this.W;
        if (r9Var != null && ((q1) r9Var).getMessageObject() != null) {
            jj messageObject = ((q1) this.W).getMessageObject();
            if (this.f22260q0) {
                layout = ((q1) this.W).getDescriptionlayout();
            } else if (this.f22262s0) {
                layout = ((q1) this.W).getFactCheckLayout();
            } else if (this.f22264u0) {
                if (messageObject != null) {
                    vvVar = messageObject.f16385w2;
                } else {
                    vvVar = null;
                }
                if (vvVar != null) {
                    ArrayList arrayList = vvVar.f18996n;
                    if (!arrayList.isEmpty()) {
                        layout = ((u9) arrayList.get(0)).a();
                    }
                }
                layout = null;
            } else if (((q1) this.W).a2()) {
                layout = ((gj) ((q1) this.W).getCaptionLayout().e.get(0)).e;
            } else {
                ArrayList arrayList2 = messageObject.f16397z2;
                if (arrayList2 != null) {
                    layout = ((gj) arrayList2.get(0)).e;
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
    public final CharSequence s(r9 r9Var, boolean z10) {
        q1 q1Var = (q1) r9Var;
        if (q1Var != null && q1Var.getMessageObject() != null) {
            if (!z10 ? this.f22260q0 : this.f22261r0) {
                return q1Var.getDescriptionlayout().getText();
            }
            if (!z10 ? this.f22262s0 : this.f22263t0) {
                return q1Var.getFactCheckLayout().getText();
            }
            if (!z10 ? this.f22264u0 : this.f22265v0) {
                vv vvVar = q1Var.getMessageObject().f16385w2;
                if (vvVar != null) {
                    return vvVar.f18999q;
                }
                return "";
            } else if (q1Var.a2()) {
                return q1Var.getCaptionLayout().f15901a;
            } else {
                return q1Var.getMessageObject().v;
            }
        }
        return null;
    }

    @Override
    public void w() {
        super.w();
        r9 r9Var = this.W;
        if (r9Var != null && ((q1) r9Var).getCurrentMessagesGroup() != null) {
            this.F.invalidate();
        }
        r9 r9Var2 = this.W;
        if (r9Var2 != null) {
            if (this.f22262s0 || this.f22263t0) {
                ((q1) r9Var2).n2();
            }
        }
    }
}
