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
import org.telegram.messenger.hj;
import org.telegram.messenger.ij;
import org.telegram.messenger.kj;
import org.telegram.messenger.uz;
import org.telegram.messenger.wp;
import org.telegram.messenger.wv;
public abstract class l9 extends w9 {
    public final SparseArray f22260p0 = new SparseArray();
    public boolean f22261q0;
    public boolean f22262r0;
    public boolean f22263s0;
    public boolean f22264t0;
    public boolean f22265u0;
    public boolean f22266v0;

    @Override
    public final boolean C() {
        r9 r9Var;
        wv wvVar;
        CharSequence r10;
        String str;
        if (this.f22265u0 && (r9Var = this.W) != null && ((q1) r9Var).getMessageObject() != null && (wvVar = ((q1) this.W).getMessageObject().f16738w2) != null && !wvVar.f19339n.isEmpty() && (r10 = r()) != null && r10.length() != 0) {
            try {
                str = wvVar.w(this.f23444u, this.v);
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
            SparseArray sparseArray = this.f22260p0;
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
        this.f23445w = q1Var.getMessageObject().f1();
        try {
            int i10 = q1Var.getMessageObject().f16690k.edit_date;
        } catch (Exception unused) {
        }
        this.U = 0.0f;
        this.f22261q0 = this.f22262r0;
        this.f22263s0 = this.f22264t0;
        this.f22265u0 = this.f22266v0;
        int i11 = this.f23445w;
        SparseArray sparseArray = this.f22260p0;
        Animator animator = (Animator) sparseArray.get(i11);
        if (animator != null) {
            animator.removeAllListeners();
            animator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new jg.o0(2, this, z10));
        ofFloat.setDuration(250L);
        ofFloat.start();
        sparseArray.put(this.f23445w, ofFloat);
        if (!z10) {
            q1Var.setSelectedBackgroundProgress(0.0f);
        }
        int i12 = uz.f18500a;
        SharedPreferences.Editor edit = wp.d1().edit();
        edit.putInt("textSelectionHintShows", 3);
        edit.apply();
    }

    public final void W(kj kjVar) {
        try {
            int i10 = kjVar.f16690k.edit_date;
        } catch (Exception unused) {
        }
        if (this.f23445w == kjVar.f1()) {
            f(true);
        }
    }

    public final void X(kj kjVar, hj hjVar, Canvas canvas) {
        kj messageObject;
        r9 r9Var = this.W;
        if (r9Var != null && ((q1) r9Var).getMessageObject() != null && !this.f22261q0 && !this.f22263s0 && !this.f22265u0 && (messageObject = ((q1) this.W).getMessageObject()) != null && messageObject.f16750z2 != null && kjVar.f1() == this.f23445w) {
            int i10 = this.f23444u;
            int i11 = hjVar.f16067n;
            int i12 = this.v - i11;
            int i13 = 0;
            int j10 = Utilities.j(i10 - i11, hjVar.e.getText().length(), 0);
            int j11 = Utilities.j(i12, hjVar.e.getText().length(), 0);
            if (j10 != j11) {
                boolean P3 = messageObject.P3();
                Paint paint = this.f23439p;
                Paint paint2 = this.f23437o;
                if (P3) {
                    int i14 = org.telegram.ui.ActionBar.t6.Jc;
                    paint2.setColor(t(i14));
                    paint.setColor(t(i14));
                } else {
                    int i15 = org.telegram.ui.ActionBar.t6.f21029ig;
                    paint2.setColor(t(i15));
                    paint.setColor(t(i15));
                }
                if (hjVar.I) {
                    i13 = org.telegram.messenger.i0.L(10.0f);
                } else if (hjVar.H) {
                    i13 = org.telegram.messenger.i0.L(0.0f);
                }
                h(canvas, hjVar.e, j10, j11, true, true, i13);
            }
        }
    }

    public final void Y(boolean z10, StaticLayout staticLayout, Canvas canvas) {
        if (!this.f22261q0) {
            return;
        }
        Paint paint = this.f23439p;
        Paint paint2 = this.f23437o;
        if (z10) {
            int i10 = org.telegram.ui.ActionBar.t6.Jc;
            paint2.setColor(t(i10));
            paint.setColor(t(i10));
        } else {
            int i11 = org.telegram.ui.ActionBar.t6.f21029ig;
            paint2.setColor(t(i11));
            paint.setColor(t(i11));
        }
        h(canvas, staticLayout, this.f23444u, this.v, true, true, 0.0f);
    }

    public final void Z(kj kjVar, wv wvVar, Canvas canvas) {
        u9 u9Var;
        Canvas canvas2;
        boolean z10;
        if (this.f22265u0 && wvVar != null) {
            ArrayList arrayList = wvVar.f19339n;
            r9 r9Var = this.W;
            if (r9Var != null && ((q1) r9Var).getMessageObject() != null && ((q1) this.W).getMessageObject().f1() == kjVar.f1()) {
                boolean P3 = kjVar.P3();
                Paint paint = this.f23439p;
                Paint paint2 = this.f23437o;
                if (P3) {
                    int i10 = org.telegram.ui.ActionBar.t6.Jc;
                    paint2.setColor(t(i10));
                    paint.setColor(t(i10));
                } else {
                    int i11 = org.telegram.ui.ActionBar.t6.f21029ig;
                    paint2.setColor(t(i11));
                    paint.setColor(t(i11));
                }
                int i12 = 0;
                while (i12 < arrayList.size()) {
                    Layout a2 = ((u9) arrayList.get(i12)).a();
                    if (a2 != null && a2.getText() != null) {
                        int intValue = ((Integer) wvVar.f19340o.get(i12)).intValue();
                        int length = a2.getText().length();
                        int j10 = Utilities.j(this.f23444u - intValue, length, 0);
                        int j11 = Utilities.j(this.v - intValue, length, 0);
                        if (j10 != j11) {
                            boolean z11 = true;
                            if (this.f23444u >= intValue) {
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
        this.f23445w = q1Var.getMessageObject().f1();
        if (((q1) this.W).getMessageObject().D == 36 && ((q1) this.W).getMessageObject().f16738w2 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f22265u0 = z10;
        if (z10) {
            this.f22261q0 = false;
            this.f22263s0 = false;
        }
        this.f23444u = i10;
        this.v = i11;
        w();
        w7.x5 x5Var = this.D;
        if (x5Var != null) {
            x5Var.a(true);
        }
        this.f23423g = 0.0f;
        this.f23421f = 0.0f;
        this.e = false;
        v9 v9Var = this.C;
        if (v9Var != null) {
            v9Var.setVisibility(0);
        }
        U();
    }

    public final void b0(q1 q1Var) {
        ArrayList arrayList;
        wv wvVar;
        this.X = q1Var;
        kj messageObject = q1Var.getMessageObject();
        x1 x1Var = q1Var.gb;
        boolean z10 = this.f22262r0;
        Rect rect = this.B;
        if (z10 && q1Var.getDescriptionlayout() != null) {
            int i10 = this.f23417c;
            rect.set(i10, this.d, q1Var.getDescriptionlayout().getWidth() + i10, q1Var.getDescriptionlayout().getHeight() + this.d);
        } else if (this.f22264t0 && q1Var.getFactCheckLayout() != null) {
            int i11 = this.f23417c;
            rect.set(i11, this.d, q1Var.getFactCheckLayout().getWidth() + i11, q1Var.getFactCheckLayout().getHeight() + this.d);
        } else if (this.f22266v0 && messageObject != null && (wvVar = messageObject.f16738w2) != null && !wvVar.f19339n.isEmpty()) {
            wv wvVar2 = messageObject.f16738w2;
            int i12 = this.f23417c;
            int i13 = this.d;
            rect.set(i12, i13, wvVar2.C + i12, wvVar2.t() + i13);
        } else if (q1Var.a2() && q1Var.getCaptionLayout().e.size() > 0) {
            hj hjVar = (hj) i0.a.g(1, q1Var.getCaptionLayout().e);
            int i14 = this.f23417c;
            rect.set(i14, this.d, hjVar.e.getWidth() + i14, (int) (hjVar.p(q1Var.getCaptionLayout().e, x1Var) + this.d + hjVar.f16066f + hjVar.e.getHeight()));
        } else if (messageObject != null && (arrayList = messageObject.f16750z2) != null && arrayList.size() > 0) {
            hj hjVar2 = (hj) i0.a.g(1, messageObject.f16750z2);
            int i15 = this.f23417c;
            rect.set(i15, this.d, hjVar2.e.getWidth() + i15, (int) (hjVar2.p(messageObject.f16750z2, x1Var) + this.d + hjVar2.f16066f + hjVar2.e.getHeight()));
        } else {
            this.X = null;
        }
    }

    public final void c0(int i10, int i11) {
        if (this.f23413a == i10 && this.f23415b == i11) {
            return;
        }
        this.f23413a = i10;
        this.f23415b = i11;
        w();
    }

    @Override
    public final void f(boolean z10) {
        super.f(z10);
        this.f22261q0 = false;
        this.f22263s0 = false;
        this.f22265u0 = false;
    }

    @Override
    public final void i(int i10, ge.b bVar, boolean z10) {
        r9 r9Var;
        int i11;
        int L;
        hj hjVar;
        int i12;
        int i13;
        int L2;
        int i14;
        int L3;
        hj hjVar2;
        int i15;
        int i16;
        int L4;
        wv wvVar;
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
        kj messageObject = q1Var.getMessageObject();
        int i17 = 0;
        if (this.f22261q0) {
            bVar.d = q1Var.getDescriptionlayout();
            bVar.f7472b = 0.0f;
            bVar.f7473c = 0.0f;
            bVar.f7471a = 0;
        } else if (this.f22263s0) {
            bVar.d = q1Var.getFactCheckLayout();
            bVar.f7472b = 0.0f;
            bVar.f7473c = 0.0f;
            bVar.f7471a = 0;
        } else if (this.f22265u0) {
            if (messageObject != null) {
                wvVar = messageObject.f16738w2;
            } else {
                wvVar = null;
            }
            if (wvVar != null) {
                ArrayList arrayList = wvVar.f19340o;
                ArrayList arrayList2 = wvVar.f19339n;
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
                    bVar.f7472b = u9Var.getY();
                    bVar.f7473c = u9Var.getX();
                    bVar.f7471a = ((Integer) arrayList.get(i17)).intValue();
                    return;
                }
            }
            bVar.d = null;
        } else if (q1Var.a2()) {
            ij captionLayout = q1Var.getCaptionLayout();
            ArrayList arrayList3 = captionLayout.e;
            float f7 = captionLayout.d;
            if (arrayList3.size() == 1) {
                bVar.d = ((hj) arrayList3.get(0)).e;
                bVar.f7472b = hjVar2.f16066f;
                hj hjVar3 = (hj) arrayList3.get(0);
                if (hjVar3.I) {
                    i15 = org.telegram.messenger.i0.L(10.0f);
                } else {
                    i15 = 0;
                }
                if (hjVar3.l()) {
                    i16 = ((int) Math.ceil(f7)) - i15;
                } else {
                    i16 = 0;
                }
                float f10 = -i16;
                bVar.f7473c = f10;
                if (hjVar3.H && !hjVar3.I) {
                    if (hjVar3.U) {
                        L4 = org.telegram.messenger.i0.L(14.0f);
                    } else {
                        L4 = org.telegram.messenger.i0.L(8.0f);
                    }
                    bVar.f7473c = f10 + L4;
                }
                bVar.f7471a = 0;
                return;
            }
            for (int i18 = 0; i18 < arrayList3.size(); i18++) {
                hj hjVar4 = (hj) arrayList3.get(i18);
                int i19 = i10 - hjVar4.f16067n;
                if (i19 >= 0 && i19 <= hjVar4.e.getText().length()) {
                    bVar.d = hjVar4.e;
                    bVar.f7472b = hjVar4.o(arrayList3) + hjVar4.f16066f;
                    if (hjVar4.I) {
                        i14 = org.telegram.messenger.i0.L(10.0f);
                    } else {
                        i14 = 0;
                    }
                    if (hjVar4.l()) {
                        i17 = ((int) Math.ceil(f7)) - i14;
                    }
                    float f11 = -i17;
                    bVar.f7473c = f11;
                    if (hjVar4.H && !hjVar4.I) {
                        if (hjVar4.U) {
                            L3 = org.telegram.messenger.i0.L(14.0f);
                        } else {
                            L3 = org.telegram.messenger.i0.L(8.0f);
                        }
                        bVar.f7473c = f11 + L3;
                    }
                    bVar.f7471a = hjVar4.f16067n;
                    return;
                }
            }
            bVar.d = null;
        } else {
            ArrayList arrayList4 = messageObject.f16750z2;
            if (arrayList4 == null) {
                bVar.d = null;
            } else if (arrayList4.size() == 1) {
                bVar.d = ((hj) messageObject.f16750z2.get(0)).e;
                bVar.f7472b = hjVar.f16066f;
                hj hjVar5 = (hj) messageObject.f16750z2.get(0);
                if (hjVar5.I) {
                    i12 = org.telegram.messenger.i0.L(10.0f);
                } else {
                    i12 = 0;
                }
                if (hjVar5.l()) {
                    i13 = ((int) Math.ceil(messageObject.f16734v2)) - i12;
                } else {
                    i13 = 0;
                }
                float f12 = -i13;
                bVar.f7473c = f12;
                if (hjVar5.H && !hjVar5.I) {
                    if (hjVar5.U) {
                        L2 = org.telegram.messenger.i0.L(14.0f);
                    } else {
                        L2 = org.telegram.messenger.i0.L(8.0f);
                    }
                    bVar.f7473c = f12 + L2;
                }
                bVar.f7471a = 0;
            } else {
                for (int i20 = 0; i20 < messageObject.f16750z2.size(); i20++) {
                    hj hjVar6 = (hj) messageObject.f16750z2.get(i20);
                    int i21 = i10 - hjVar6.f16067n;
                    if (i21 >= 0 && i21 <= hjVar6.e.getText().length()) {
                        bVar.d = hjVar6.e;
                        bVar.f7472b = hjVar6.o(messageObject.f16750z2) + hjVar6.f16066f;
                        if (hjVar6.I) {
                            i11 = org.telegram.messenger.i0.L(10.0f);
                        } else {
                            i11 = 0;
                        }
                        if (hjVar6.l()) {
                            i17 = ((int) Math.ceil(messageObject.f16734v2)) - i11;
                        }
                        float f13 = -i17;
                        bVar.f7473c = f13;
                        if (hjVar6.H && !hjVar6.I) {
                            if (hjVar6.U) {
                                L = org.telegram.messenger.i0.L(14.0f);
                            } else {
                                L = org.telegram.messenger.i0.L(8.0f);
                            }
                            bVar.f7473c = f13 + L;
                        }
                        bVar.f7471a = hjVar6.f16067n;
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
        wv wvVar;
        r9 r9Var = this.W;
        if (r9Var != null && ((q1) r9Var).getMessageObject() != null) {
            kj messageObject = ((q1) this.W).getMessageObject();
            if (this.f22261q0) {
                layout = ((q1) this.W).getDescriptionlayout();
            } else if (this.f22263s0) {
                layout = ((q1) this.W).getFactCheckLayout();
            } else if (this.f22265u0) {
                if (messageObject != null) {
                    wvVar = messageObject.f16738w2;
                } else {
                    wvVar = null;
                }
                if (wvVar != null) {
                    ArrayList arrayList = wvVar.f19339n;
                    if (!arrayList.isEmpty()) {
                        layout = ((u9) arrayList.get(0)).a();
                    }
                }
                layout = null;
            } else if (((q1) this.W).a2()) {
                layout = ((hj) ((q1) this.W).getCaptionLayout().e.get(0)).e;
            } else {
                ArrayList arrayList2 = messageObject.f16750z2;
                if (arrayList2 != null) {
                    layout = ((hj) arrayList2.get(0)).e;
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
            if (!z10 ? this.f22261q0 : this.f22262r0) {
                return q1Var.getDescriptionlayout().getText();
            }
            if (!z10 ? this.f22263s0 : this.f22264t0) {
                return q1Var.getFactCheckLayout().getText();
            }
            if (!z10 ? this.f22265u0 : this.f22266v0) {
                wv wvVar = q1Var.getMessageObject().f16738w2;
                if (wvVar != null) {
                    return wvVar.f19342q;
                }
                return "";
            } else if (q1Var.a2()) {
                return q1Var.getCaptionLayout().f16294a;
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
            if (this.f22263s0 || this.f22264t0) {
                ((q1) r9Var2).n2();
            }
        }
    }
}
