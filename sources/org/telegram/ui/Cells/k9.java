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
import org.telegram.messenger.bz;
import org.telegram.messenger.cj;
import org.telegram.messenger.dj;
import org.telegram.messenger.ev;
import org.telegram.messenger.fj;
import org.telegram.messenger.mp;
public abstract class k9 extends w9 {
    public final SparseArray f30965p0 = new SparseArray();
    public boolean f30966q0;
    public boolean f30967r0;
    public boolean f30968s0;
    public boolean f30969t0;
    public boolean f30970u0;
    public boolean f30971v0;

    @Override
    public final boolean C() {
        r9 r9Var;
        ev evVar;
        CharSequence r10;
        String str;
        if (this.f30970u0 && (r9Var = this.W) != null && ((r1) r9Var).getMessageObject() != null && (evVar = ((r1) this.W).getMessageObject().f24050y2) != null && !evVar.f23806n.isEmpty() && (r10 = r()) != null && r10.length() != 0) {
            try {
                str = evVar.w(this.f32297u, this.v);
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
        r9 r9Var = this.W;
        if (r9Var != null && ((r1) r9Var).B2() && !z10) {
            r1 r1Var = (r1) this.W;
            int e12 = r1Var.getMessageObject().e1();
            SparseArray sparseArray = this.f30965p0;
            Animator animator = (Animator) sparseArray.get(e12);
            if (animator != null) {
                animator.removeAllListeners();
                animator.cancel();
            }
            r1Var.setSelectedBackgroundProgress(0.01f);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.01f, 1.0f);
            ofFloat.addUpdateListener(new org.telegram.ui.ActionBar.j2(r1Var, e12, 1));
            ofFloat.addListener(new l1(r1Var, 1));
            ofFloat.setDuration(300L);
            ofFloat.start();
            sparseArray.put(e12, ofFloat);
        }
    }

    @Override
    public final void L(r9 r9Var, r9 r9Var2) {
        boolean z10;
        r1 r1Var = (r1) r9Var;
        r1 r1Var2 = (r1) r9Var2;
        if (r1Var2 != null && (r1Var2.getMessageObject() == null || r1Var2.getMessageObject().e1() == r1Var.getMessageObject().e1())) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f32298w = r1Var.getMessageObject().e1();
        try {
            int i7 = r1Var.getMessageObject().f23993k.edit_date;
        } catch (Exception unused) {
        }
        this.U = 0.0f;
        this.f30966q0 = this.f30967r0;
        this.f30968s0 = this.f30969t0;
        this.f30970u0 = this.f30971v0;
        int i10 = this.f32298w;
        SparseArray sparseArray = this.f30965p0;
        Animator animator = (Animator) sparseArray.get(i10);
        if (animator != null) {
            animator.removeAllListeners();
            animator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new ch.v(4, this, z10));
        ofFloat.setDuration(250L);
        ofFloat.start();
        sparseArray.put(this.f32298w, ofFloat);
        if (!z10) {
            r1Var.setSelectedBackgroundProgress(0.0f);
        }
        int i11 = bz.f23173a;
        SharedPreferences.Editor edit = mp.g1().edit();
        edit.putInt("textSelectionHintShows", 3);
        edit.apply();
    }

    public final void W(fj fjVar) {
        try {
            int i7 = fjVar.f23993k.edit_date;
        } catch (Exception unused) {
        }
        if (this.f32298w == fjVar.e1()) {
            f(true);
        }
    }

    public final void X(fj fjVar, cj cjVar, Canvas canvas) {
        fj messageObject;
        r9 r9Var = this.W;
        if (r9Var != null && ((r1) r9Var).getMessageObject() != null && !this.f30966q0 && !this.f30968s0 && !this.f30970u0 && (messageObject = ((r1) this.W).getMessageObject()) != null && messageObject.B2 != null && fjVar.e1() == this.f32298w) {
            int i7 = this.f32297u;
            int i10 = cjVar.f23391n;
            int i11 = this.v - i10;
            int i12 = 0;
            int j3 = Utilities.j(i7 - i10, cjVar.f23389e.getText().length(), 0);
            int j10 = Utilities.j(i11, cjVar.f23389e.getText().length(), 0);
            if (j3 != j10) {
                boolean P3 = messageObject.P3();
                Paint paint = this.f32292p;
                Paint paint2 = this.f32290o;
                if (P3) {
                    int i13 = org.telegram.ui.ActionBar.m6.Mc;
                    paint2.setColor(t(i13));
                    paint.setColor(t(i13));
                } else {
                    int i14 = org.telegram.ui.ActionBar.m6.f29534lg;
                    paint2.setColor(t(i14));
                    paint.setColor(t(i14));
                }
                if (cjVar.J) {
                    i12 = org.telegram.messenger.g0.L(10.0f);
                } else if (cjVar.I) {
                    i12 = org.telegram.messenger.g0.L(0.0f);
                }
                h(canvas, cjVar.f23389e, j3, j10, true, true, i12);
            }
        }
    }

    public final void Y(boolean z10, StaticLayout staticLayout, Canvas canvas) {
        if (!this.f30966q0) {
            return;
        }
        Paint paint = this.f32292p;
        Paint paint2 = this.f32290o;
        if (z10) {
            int i7 = org.telegram.ui.ActionBar.m6.Mc;
            paint2.setColor(t(i7));
            paint.setColor(t(i7));
        } else {
            int i10 = org.telegram.ui.ActionBar.m6.f29534lg;
            paint2.setColor(t(i10));
            paint.setColor(t(i10));
        }
        h(canvas, staticLayout, this.f32297u, this.v, true, true, 0.0f);
    }

    public final void Z(fj fjVar, ev evVar, Canvas canvas) {
        u9 u9Var;
        Canvas canvas2;
        boolean z10;
        if (this.f30970u0 && evVar != null) {
            ArrayList arrayList = evVar.f23806n;
            r9 r9Var = this.W;
            if (r9Var != null && ((r1) r9Var).getMessageObject() != null && ((r1) this.W).getMessageObject().e1() == fjVar.e1()) {
                boolean P3 = fjVar.P3();
                Paint paint = this.f32292p;
                Paint paint2 = this.f32290o;
                if (P3) {
                    int i7 = org.telegram.ui.ActionBar.m6.Mc;
                    paint2.setColor(t(i7));
                    paint.setColor(t(i7));
                } else {
                    int i10 = org.telegram.ui.ActionBar.m6.f29534lg;
                    paint2.setColor(t(i10));
                    paint.setColor(t(i10));
                }
                int i11 = 0;
                while (i11 < arrayList.size()) {
                    Layout a10 = ((u9) arrayList.get(i11)).a();
                    if (a10 != null && a10.getText() != null) {
                        int intValue = ((Integer) evVar.f23807o.get(i11)).intValue();
                        int length = a10.getText().length();
                        int j3 = Utilities.j(this.f32297u - intValue, length, 0);
                        int j10 = Utilities.j(this.v - intValue, length, 0);
                        if (j3 != j10) {
                            boolean z11 = true;
                            if (this.f32297u >= intValue) {
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

    public final void a0(r1 r1Var, int i7, int i10) {
        boolean z10;
        if (r1Var == null) {
            return;
        }
        this.W = r1Var;
        this.f32298w = r1Var.getMessageObject().e1();
        if (((r1) this.W).getMessageObject().D == 36 && ((r1) this.W).getMessageObject().f24050y2 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f30970u0 = z10;
        if (z10) {
            this.f30966q0 = false;
            this.f30968s0 = false;
        }
        this.f32297u = i7;
        this.v = i10;
        w();
        c8.ha haVar = this.D;
        if (haVar != null) {
            haVar.a(true);
        }
        this.f32276g = 0.0f;
        this.f32274f = 0.0f;
        this.f32272e = false;
        v9 v9Var = this.C;
        if (v9Var != null) {
            v9Var.setVisibility(0);
        }
        U();
    }

    public final void b0(r1 r1Var) {
        ArrayList arrayList;
        ev evVar;
        this.X = r1Var;
        fj messageObject = r1Var.getMessageObject();
        y1 y1Var = r1Var.f31468ib;
        boolean z10 = this.f30967r0;
        Rect rect = this.B;
        if (z10 && r1Var.getDescriptionlayout() != null) {
            int i7 = this.f32269c;
            rect.set(i7, this.d, r1Var.getDescriptionlayout().getWidth() + i7, r1Var.getDescriptionlayout().getHeight() + this.d);
        } else if (this.f30969t0 && r1Var.getFactCheckLayout() != null) {
            int i10 = this.f32269c;
            rect.set(i10, this.d, r1Var.getFactCheckLayout().getWidth() + i10, r1Var.getFactCheckLayout().getHeight() + this.d);
        } else if (this.f30971v0 && messageObject != null && (evVar = messageObject.f24050y2) != null && !evVar.f23806n.isEmpty()) {
            ev evVar2 = messageObject.f24050y2;
            int i11 = this.f32269c;
            int i12 = this.d;
            rect.set(i11, i12, evVar2.C + i11, evVar2.t() + i12);
        } else if (r1Var.d2() && r1Var.getCaptionLayout().f23561e.size() > 0) {
            cj cjVar = (cj) i5.c.h(1, r1Var.getCaptionLayout().f23561e);
            int i13 = this.f32269c;
            rect.set(i13, this.d, cjVar.f23389e.getWidth() + i13, (int) (cjVar.p(r1Var.getCaptionLayout().f23561e, y1Var) + this.d + cjVar.f23390f + cjVar.f23389e.getHeight()));
        } else if (messageObject != null && (arrayList = messageObject.B2) != null && arrayList.size() > 0) {
            cj cjVar2 = (cj) i5.c.h(1, messageObject.B2);
            int i14 = this.f32269c;
            rect.set(i14, this.d, cjVar2.f23389e.getWidth() + i14, (int) (cjVar2.p(messageObject.B2, y1Var) + this.d + cjVar2.f23390f + cjVar2.f23389e.getHeight()));
        } else {
            this.X = null;
        }
    }

    public final void c0(int i7, int i10) {
        if (this.f32265a == i7 && this.f32267b == i10) {
            return;
        }
        this.f32265a = i7;
        this.f32267b = i10;
        w();
    }

    @Override
    public final void f(boolean z10) {
        super.f(z10);
        this.f30966q0 = false;
        this.f30968s0 = false;
        this.f30970u0 = false;
    }

    @Override
    public final void i(int i7, m9 m9Var, boolean z10) {
        r9 r9Var;
        int i10;
        int L;
        cj cjVar;
        int i11;
        int i12;
        int L2;
        int i13;
        int L3;
        cj cjVar2;
        int i14;
        int i15;
        int L4;
        ev evVar;
        u9 u9Var;
        if (z10) {
            r9Var = this.X;
        } else {
            r9Var = this.W;
        }
        r1 r1Var = (r1) r9Var;
        if (r1Var == null) {
            m9Var.d = null;
            return;
        }
        fj messageObject = r1Var.getMessageObject();
        int i16 = 0;
        if (this.f30966q0) {
            m9Var.d = r1Var.getDescriptionlayout();
            m9Var.f31109b = 0.0f;
            m9Var.f31110c = 0.0f;
            m9Var.f31108a = 0;
        } else if (this.f30968s0) {
            m9Var.d = r1Var.getFactCheckLayout();
            m9Var.f31109b = 0.0f;
            m9Var.f31110c = 0.0f;
            m9Var.f31108a = 0;
        } else if (this.f30970u0) {
            if (messageObject != null) {
                evVar = messageObject.f24050y2;
            } else {
                evVar = null;
            }
            if (evVar != null) {
                ArrayList arrayList = evVar.f23807o;
                ArrayList arrayList2 = evVar.f23806n;
                if (!arrayList2.isEmpty()) {
                    while (true) {
                        if (i16 < arrayList2.size()) {
                            int intValue = ((Integer) arrayList.get(i16)).intValue();
                            int length = ((u9) arrayList2.get(i16)).a().getText().length();
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
                    m9Var.d = ((u9) arrayList2.get(i16)).a();
                    m9Var.f31109b = u9Var.getY();
                    m9Var.f31110c = u9Var.getX();
                    m9Var.f31108a = ((Integer) arrayList.get(i16)).intValue();
                    return;
                }
            }
            m9Var.d = null;
        } else if (r1Var.d2()) {
            dj captionLayout = r1Var.getCaptionLayout();
            ArrayList arrayList3 = captionLayout.f23561e;
            float f10 = captionLayout.d;
            if (arrayList3.size() == 1) {
                m9Var.d = ((cj) arrayList3.get(0)).f23389e;
                m9Var.f31109b = cjVar2.f23390f;
                cj cjVar3 = (cj) arrayList3.get(0);
                if (cjVar3.J) {
                    i14 = org.telegram.messenger.g0.L(10.0f);
                } else {
                    i14 = 0;
                }
                if (cjVar3.l()) {
                    i15 = ((int) Math.ceil(f10)) - i14;
                } else {
                    i15 = 0;
                }
                float f11 = -i15;
                m9Var.f31110c = f11;
                if (cjVar3.I && !cjVar3.J) {
                    if (cjVar3.V) {
                        L4 = org.telegram.messenger.g0.L(14.0f);
                    } else {
                        L4 = org.telegram.messenger.g0.L(8.0f);
                    }
                    m9Var.f31110c = f11 + L4;
                }
                m9Var.f31108a = 0;
                return;
            }
            for (int i17 = 0; i17 < arrayList3.size(); i17++) {
                cj cjVar4 = (cj) arrayList3.get(i17);
                int i18 = i7 - cjVar4.f23391n;
                if (i18 >= 0 && i18 <= cjVar4.f23389e.getText().length()) {
                    m9Var.d = cjVar4.f23389e;
                    m9Var.f31109b = cjVar4.o(arrayList3) + cjVar4.f23390f;
                    if (cjVar4.J) {
                        i13 = org.telegram.messenger.g0.L(10.0f);
                    } else {
                        i13 = 0;
                    }
                    if (cjVar4.l()) {
                        i16 = ((int) Math.ceil(f10)) - i13;
                    }
                    float f12 = -i16;
                    m9Var.f31110c = f12;
                    if (cjVar4.I && !cjVar4.J) {
                        if (cjVar4.V) {
                            L3 = org.telegram.messenger.g0.L(14.0f);
                        } else {
                            L3 = org.telegram.messenger.g0.L(8.0f);
                        }
                        m9Var.f31110c = f12 + L3;
                    }
                    m9Var.f31108a = cjVar4.f23391n;
                    return;
                }
            }
            m9Var.d = null;
        } else {
            ArrayList arrayList4 = messageObject.B2;
            if (arrayList4 == null) {
                m9Var.d = null;
            } else if (arrayList4.size() == 1) {
                m9Var.d = ((cj) messageObject.B2.get(0)).f23389e;
                m9Var.f31109b = cjVar.f23390f;
                cj cjVar5 = (cj) messageObject.B2.get(0);
                if (cjVar5.J) {
                    i11 = org.telegram.messenger.g0.L(10.0f);
                } else {
                    i11 = 0;
                }
                if (cjVar5.l()) {
                    i12 = ((int) Math.ceil(messageObject.f24046x2)) - i11;
                } else {
                    i12 = 0;
                }
                float f13 = -i12;
                m9Var.f31110c = f13;
                if (cjVar5.I && !cjVar5.J) {
                    if (cjVar5.V) {
                        L2 = org.telegram.messenger.g0.L(14.0f);
                    } else {
                        L2 = org.telegram.messenger.g0.L(8.0f);
                    }
                    m9Var.f31110c = f13 + L2;
                }
                m9Var.f31108a = 0;
            } else {
                for (int i19 = 0; i19 < messageObject.B2.size(); i19++) {
                    cj cjVar6 = (cj) messageObject.B2.get(i19);
                    int i20 = i7 - cjVar6.f23391n;
                    if (i20 >= 0 && i20 <= cjVar6.f23389e.getText().length()) {
                        m9Var.d = cjVar6.f23389e;
                        m9Var.f31109b = cjVar6.o(messageObject.B2) + cjVar6.f23390f;
                        if (cjVar6.J) {
                            i10 = org.telegram.messenger.g0.L(10.0f);
                        } else {
                            i10 = 0;
                        }
                        if (cjVar6.l()) {
                            i16 = ((int) Math.ceil(messageObject.f24046x2)) - i10;
                        }
                        float f14 = -i16;
                        m9Var.f31110c = f14;
                        if (cjVar6.I && !cjVar6.J) {
                            if (cjVar6.V) {
                                L = org.telegram.messenger.g0.L(14.0f);
                            } else {
                                L = org.telegram.messenger.g0.L(8.0f);
                            }
                            m9Var.f31110c = f14 + L;
                        }
                        m9Var.f31108a = cjVar6.f23391n;
                        return;
                    }
                }
                m9Var.d = null;
            }
        }
    }

    @Override
    public final int k(int r19, int r20, int r21, int r22, org.telegram.ui.Cells.r9 r23, boolean r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.k9.k(int, int, int, int, org.telegram.ui.Cells.r9, boolean):int");
    }

    @Override
    public final int m() {
        Layout layout;
        ev evVar;
        r9 r9Var = this.W;
        if (r9Var != null && ((r1) r9Var).getMessageObject() != null) {
            fj messageObject = ((r1) this.W).getMessageObject();
            if (this.f30966q0) {
                layout = ((r1) this.W).getDescriptionlayout();
            } else if (this.f30968s0) {
                layout = ((r1) this.W).getFactCheckLayout();
            } else if (this.f30970u0) {
                if (messageObject != null) {
                    evVar = messageObject.f24050y2;
                } else {
                    evVar = null;
                }
                if (evVar != null) {
                    ArrayList arrayList = evVar.f23806n;
                    if (!arrayList.isEmpty()) {
                        layout = ((u9) arrayList.get(0)).a();
                    }
                }
                layout = null;
            } else if (((r1) this.W).d2()) {
                layout = ((cj) ((r1) this.W).getCaptionLayout().f23561e.get(0)).f23389e;
            } else {
                ArrayList arrayList2 = messageObject.B2;
                if (arrayList2 != null) {
                    layout = ((cj) arrayList2.get(0)).f23389e;
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
        r1 r1Var = (r1) r9Var;
        if (r1Var != null && r1Var.getMessageObject() != null) {
            if (!z10 ? this.f30966q0 : this.f30967r0) {
                return r1Var.getDescriptionlayout().getText();
            }
            if (!z10 ? this.f30968s0 : this.f30969t0) {
                return r1Var.getFactCheckLayout().getText();
            }
            if (!z10 ? this.f30970u0 : this.f30971v0) {
                ev evVar = r1Var.getMessageObject().f24050y2;
                if (evVar != null) {
                    return evVar.f23809q;
                }
                return "";
            } else if (r1Var.d2()) {
                return r1Var.getCaptionLayout().f23558a;
            } else {
                return r1Var.getMessageObject().v;
            }
        }
        return null;
    }

    @Override
    public void w() {
        super.w();
        r9 r9Var = this.W;
        if (r9Var != null && ((r1) r9Var).getCurrentMessagesGroup() != null) {
            this.F.invalidate();
        }
        r9 r9Var2 = this.W;
        if (r9Var2 != null) {
            if (this.f30968s0 || this.f30969t0) {
                ((r1) r9Var2).q2();
            }
        }
    }
}
